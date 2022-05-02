package p130j2;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import p071f2.AbstractC4234j;
import p071f2.C4223b;
import p071f2.C4225c;
import p071f2.EnumC4222a;
import p071f2.EnumC4236k;
import p198o2.C7554p;
import p337y0.C10326a;

public class C5839a {
    public static final String f18701b = AbstractC4234j.m28360f("SystemJobInfoConverter");
    public final ComponentName f18702a;

    public static class C5840a {
        public static final int[] f18703a;

        static {
            int[] iArr = new int[EnumC4236k.values().length];
            f18703a = iArr;
            try {
                iArr[EnumC4236k.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18703a[EnumC4236k.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18703a[EnumC4236k.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18703a[EnumC4236k.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18703a[EnumC4236k.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C5839a(Context context) {
        this.f18702a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    public static JobInfo.TriggerContentUri m21958b(C4225c.C4226a aVar) {
        return new JobInfo.TriggerContentUri(aVar.m28373a(), aVar.m28372b() ? 1 : 0);
    }

    public static int m21957c(EnumC4236k kVar) {
        int i = C5840a.f18703a[kVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            if (i == 5 && Build.VERSION.SDK_INT >= 26) {
                return 4;
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            return 3;
        }
        AbstractC4234j.m28362c().mo28359a(f18701b, String.format("API version too low. Cannot convert network type value %s", kVar), new Throwable[0]);
        return 1;
    }

    public static void m21956d(JobInfo.Builder builder, EnumC4236k kVar) {
        if (Build.VERSION.SDK_INT < 30 || kVar != EnumC4236k.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(m21957c(kVar));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    public JobInfo m21959a(C7554p pVar, int i) {
        C4223b bVar = pVar.f24149j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", pVar.f24140a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.m15699d());
        JobInfo.Builder extras = new JobInfo.Builder(i, this.f18702a).setRequiresCharging(bVar.m28389g()).setRequiresDeviceIdle(bVar.m28388h()).setExtras(persistableBundle);
        m21956d(extras, bVar.m28394b());
        boolean z = false;
        if (!bVar.m28388h()) {
            extras.setBackoffCriteria(pVar.f24152m, pVar.f24151l == EnumC4222a.LINEAR ? 0 : 1);
        }
        long max = Math.max(pVar.m15702a() - System.currentTimeMillis(), 0L);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!pVar.f24156q) {
            extras.setImportantWhileForeground(true);
        }
        if (i2 >= 24 && bVar.m28391e()) {
            for (C4225c.C4226a aVar : bVar.m28395a().m28375b()) {
                extras.addTriggerContentUri(m21958b(aVar));
            }
            extras.setTriggerContentUpdateDelay(bVar.m28393c());
            extras.setTriggerContentMaxDelay(bVar.m28392d());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(bVar.m28390f());
            extras.setRequiresStorageNotLow(bVar.m28387i());
        }
        boolean z2 = pVar.f24150k > 0;
        if (max > 0) {
            z = true;
        }
        if (C10326a.m5418c() && pVar.f24156q && !z2 && !z) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
