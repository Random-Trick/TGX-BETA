package j2;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import f2.b;
import f2.c;
import f2.j;
import f2.k;
import o2.p;

public class a {
    public static final String f15046b = j.f("SystemJobInfoConverter");
    public final ComponentName f15047a;

    public static class C0126a {
        public static final int[] f15048a;

        static {
            int[] iArr = new int[k.values().length];
            f15048a = iArr;
            try {
                iArr[k.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15048a[k.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15048a[k.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15048a[k.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15048a[k.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public a(Context context) {
        this.f15047a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    public static JobInfo.TriggerContentUri b(c.a aVar) {
        return new JobInfo.TriggerContentUri(aVar.a(), aVar.b() ? 1 : 0);
    }

    public static int c(k kVar) {
        int i10 = C0126a.f15048a[kVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 != 4) {
            if (i10 == 5 && Build.VERSION.SDK_INT >= 26) {
                return 4;
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            return 3;
        }
        j.c().a(f15046b, String.format("API version too low. Cannot convert network type value %s", kVar), new Throwable[0]);
        return 1;
    }

    public static void d(JobInfo.Builder builder, k kVar) {
        if (Build.VERSION.SDK_INT < 30 || kVar != k.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(c(kVar));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    public JobInfo a(p pVar, int i10) {
        b bVar = pVar.f18599j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", pVar.f18590a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.d());
        JobInfo.Builder extras = new JobInfo.Builder(i10, this.f15047a).setRequiresCharging(bVar.g()).setRequiresDeviceIdle(bVar.h()).setExtras(persistableBundle);
        d(extras, bVar.b());
        boolean z10 = false;
        if (!bVar.h()) {
            extras.setBackoffCriteria(pVar.f18602m, pVar.f18601l == f2.a.LINEAR ? 0 : 1);
        }
        long max = Math.max(pVar.a() - System.currentTimeMillis(), 0L);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!pVar.f18606q) {
            extras.setImportantWhileForeground(true);
        }
        if (i11 >= 24 && bVar.e()) {
            for (c.a aVar : bVar.a().b()) {
                extras.addTriggerContentUri(b(aVar));
            }
            extras.setTriggerContentUpdateDelay(bVar.c());
            extras.setTriggerContentMaxDelay(bVar.d());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(bVar.f());
            extras.setRequiresStorageNotLow(bVar.i());
        }
        boolean z11 = pVar.f18600k > 0;
        if (max > 0) {
            z10 = true;
        }
        if (y0.a.c() && pVar.f18606q && !z11 && !z10) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
