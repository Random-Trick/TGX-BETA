package j2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import f2.j;
import f2.n;
import f2.s;
import g2.e;
import g2.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o2.g;
import o2.p;
import o2.q;
import p2.c;

public class b implements e {
    public static final String N = j.f("SystemJobScheduler");
    public final a M;
    public final Context f15049a;
    public final JobScheduler f15050b;
    public final i f15051c;

    public b(Context context, i iVar) {
        this(context, iVar, (JobScheduler) context.getSystemService("jobscheduler"), new a(context));
    }

    public static void b(Context context) {
        List<JobInfo> g10;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (!(jobScheduler == null || (g10 = g(context, jobScheduler)) == null || g10.isEmpty())) {
            for (JobInfo jobInfo : g10) {
                d(jobScheduler, jobInfo.getId());
            }
        }
    }

    public static void d(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th) {
            j.c().b(N, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th);
        }
    }

    public static List<Integer> f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> g10 = g(context, jobScheduler);
        if (g10 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : g10) {
            if (str.equals(h(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static List<JobInfo> g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            j.c().b(N, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static String h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(Context context, i iVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g10 = g(context, jobScheduler);
        List<String> a10 = iVar.s().A().a();
        boolean z10 = false;
        HashSet hashSet = new HashSet(g10 != null ? g10.size() : 0);
        if (g10 != null && !g10.isEmpty()) {
            for (JobInfo jobInfo : g10) {
                String h10 = h(jobInfo);
                if (!TextUtils.isEmpty(h10)) {
                    hashSet.add(h10);
                } else {
                    d(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator<String> it = a10.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains(it.next())) {
                    j.c().a(N, "Reconciling jobs", new Throwable[0]);
                    z10 = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z10) {
            WorkDatabase s10 = iVar.s();
            s10.c();
            try {
                q D = s10.D();
                for (String str : a10) {
                    D.b(str, -1L);
                }
                s10.t();
            } finally {
                s10.g();
            }
        }
        return z10;
    }

    @Override
    public void a(p... pVarArr) {
        int i10;
        List<Integer> f10;
        int i11;
        WorkDatabase s10 = this.f15051c.s();
        c cVar = new c(s10);
        for (p pVar : pVarArr) {
            s10.c();
            try {
                p o10 = s10.D().o(pVar.f18590a);
                if (o10 == null) {
                    j.c().h(N, "Skipping scheduling " + pVar.f18590a + " because it's no longer in the DB", new Throwable[0]);
                    s10.t();
                } else if (o10.f18591b != s.a.ENQUEUED) {
                    j.c().h(N, "Skipping scheduling " + pVar.f18590a + " because it is no longer enqueued", new Throwable[0]);
                    s10.t();
                } else {
                    g c10 = s10.A().c(pVar.f18590a);
                    if (c10 != null) {
                        i10 = c10.f18568b;
                    } else {
                        i10 = cVar.d(this.f15051c.m().i(), this.f15051c.m().g());
                    }
                    if (c10 == null) {
                        this.f15051c.s().A().b(new g(pVar.f18590a, i10));
                    }
                    j(pVar, i10);
                    if (Build.VERSION.SDK_INT == 23 && (f10 = f(this.f15049a, this.f15050b, pVar.f18590a)) != null) {
                        int indexOf = f10.indexOf(Integer.valueOf(i10));
                        if (indexOf >= 0) {
                            f10.remove(indexOf);
                        }
                        if (!f10.isEmpty()) {
                            i11 = f10.get(0).intValue();
                        } else {
                            i11 = cVar.d(this.f15051c.m().i(), this.f15051c.m().g());
                        }
                        j(pVar, i11);
                    }
                    s10.t();
                }
                s10.g();
            } catch (Throwable th) {
                s10.g();
                throw th;
            }
        }
    }

    @Override
    public boolean c() {
        return true;
    }

    @Override
    public void e(String str) {
        List<Integer> f10 = f(this.f15049a, this.f15050b, str);
        if (!(f10 == null || f10.isEmpty())) {
            for (Integer num : f10) {
                d(this.f15050b, num.intValue());
            }
            this.f15051c.s().A().d(str);
        }
    }

    public void j(p pVar, int i10) {
        JobInfo a10 = this.M.a(pVar, i10);
        j c10 = j.c();
        String str = N;
        c10.a(str, String.format("Scheduling work ID %s Job ID %s", pVar.f18590a, Integer.valueOf(i10)), new Throwable[0]);
        try {
            if (this.f15050b.schedule(a10) == 0) {
                j.c().h(str, String.format("Unable to schedule work ID %s", pVar.f18590a), new Throwable[0]);
                if (pVar.f18606q && pVar.f18607r == n.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    pVar.f18606q = false;
                    j.c().a(str, String.format("Scheduling a non-expedited job (work ID %s)", pVar.f18590a), new Throwable[0]);
                    j(pVar, i10);
                }
            }
        } catch (IllegalStateException e10) {
            List<JobInfo> g10 = g(this.f15049a, this.f15050b);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(g10 != null ? g10.size() : 0), Integer.valueOf(this.f15051c.s().D().f().size()), Integer.valueOf(this.f15051c.m().h()));
            j.c().b(N, format, new Throwable[0]);
            throw new IllegalStateException(format, e10);
        } catch (Throwable th) {
            j.c().b(N, String.format("Unable to schedule %s", pVar), th);
        }
    }

    public b(Context context, i iVar, JobScheduler jobScheduler, a aVar) {
        this.f15049a = context;
        this.f15051c = iVar;
        this.f15050b = jobScheduler;
        this.M = aVar;
    }
}
