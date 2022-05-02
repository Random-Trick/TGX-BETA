package p130j2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p071f2.AbstractC4234j;
import p071f2.C4250s;
import p071f2.EnumC4245n;
import p087g2.AbstractC4454e;
import p087g2.C4458i;
import p198o2.AbstractC7558q;
import p198o2.C7539g;
import p198o2.C7554p;
import p215p2.C7996c;

public class C5841b implements AbstractC4454e {
    public static final String f18704N = AbstractC4234j.m28362f("SystemJobScheduler");
    public final C5839a f18705M;
    public final Context f18706a;
    public final JobScheduler f18707b;
    public final C4458i f18708c;

    public C5841b(Context context, C4458i iVar) {
        this(context, iVar, (JobScheduler) context.getSystemService("jobscheduler"), new C5839a(context));
    }

    public static void m21955b(Context context) {
        List<JobInfo> g;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (!(jobScheduler == null || (g = m21950g(context, jobScheduler)) == null || g.isEmpty())) {
            for (JobInfo jobInfo : g) {
                m21953d(jobScheduler, jobInfo.getId());
            }
        }
    }

    public static void m21953d(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            AbstractC4234j.m28364c().mo28360b(f18704N, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static List<Integer> m21951f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> g = m21950g(context, jobScheduler);
        if (g == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : g) {
            if (str.equals(m21949h(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static List<JobInfo> m21950g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            AbstractC4234j.m28364c().mo28360b(f18704N, "getAllPendingJobs() is not reliable on this device.", th);
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

    public static String m21949h(JobInfo jobInfo) {
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

    public static boolean m21948i(Context context, C4458i iVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g = m21950g(context, jobScheduler);
        List<String> a = iVar.m27589s().mo38460A().mo15713a();
        boolean z = false;
        HashSet hashSet = new HashSet(g != null ? g.size() : 0);
        if (g != null && !g.isEmpty()) {
            for (JobInfo jobInfo : g) {
                String h = m21949h(jobInfo);
                if (!TextUtils.isEmpty(h)) {
                    hashSet.add(h);
                } else {
                    m21953d(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator<String> it = a.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains(it.next())) {
                    AbstractC4234j.m28364c().mo28361a(f18704N, "Reconciling jobs", new Throwable[0]);
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            WorkDatabase s = iVar.m27589s();
            s.m8731c();
            try {
                AbstractC7558q D = s.mo38457D();
                for (String str : a) {
                    D.mo15693b(str, -1L);
                }
                s.m8714t();
            } finally {
                s.m8727g();
            }
        }
        return z;
    }

    @Override
    public void mo21956a(C7554p... pVarArr) {
        int i;
        List<Integer> f;
        int i2;
        WorkDatabase s = this.f18708c.m27589s();
        C7996c cVar = new C7996c(s);
        for (C7554p pVar : pVarArr) {
            s.m8731c();
            try {
                C7554p o = s.mo38457D().mo15680o(pVar.f24143a);
                if (o == null) {
                    AbstractC4234j.m28364c().mo28357h(f18704N, "Skipping scheduling " + pVar.f24143a + " because it's no longer in the DB", new Throwable[0]);
                    s.m8714t();
                } else if (o.f24144b != C4250s.EnumC4251a.ENQUEUED) {
                    AbstractC4234j.m28364c().mo28357h(f18704N, "Skipping scheduling " + pVar.f24143a + " because it is no longer enqueued", new Throwable[0]);
                    s.m8714t();
                } else {
                    C7539g c = s.mo38460A().mo15711c(pVar.f24143a);
                    if (c != null) {
                        i = c.f24121b;
                    } else {
                        i = cVar.m13806d(this.f18708c.m27595m().m38490i(), this.f18708c.m27595m().m38492g());
                    }
                    if (c == null) {
                        this.f18708c.m27589s().mo38460A().mo15712b(new C7539g(pVar.f24143a, i));
                    }
                    m21947j(pVar, i);
                    if (Build.VERSION.SDK_INT == 23 && (f = m21951f(this.f18706a, this.f18707b, pVar.f24143a)) != null) {
                        int indexOf = f.indexOf(Integer.valueOf(i));
                        if (indexOf >= 0) {
                            f.remove(indexOf);
                        }
                        if (!f.isEmpty()) {
                            i2 = f.get(0).intValue();
                        } else {
                            i2 = cVar.m13806d(this.f18708c.m27595m().m38490i(), this.f18708c.m27595m().m38492g());
                        }
                        m21947j(pVar, i2);
                    }
                    s.m8714t();
                }
                s.m8727g();
            } catch (Throwable th) {
                s.m8727g();
                throw th;
            }
        }
    }

    @Override
    public boolean mo21954c() {
        return true;
    }

    @Override
    public void mo21952e(String str) {
        List<Integer> f = m21951f(this.f18706a, this.f18707b, str);
        if (!(f == null || f.isEmpty())) {
            for (Integer num : f) {
                m21953d(this.f18707b, num.intValue());
            }
            this.f18708c.m27589s().mo38460A().mo15710d(str);
        }
    }

    public void m21947j(C7554p pVar, int i) {
        JobInfo a = this.f18705M.m21960a(pVar, i);
        AbstractC4234j c = AbstractC4234j.m28364c();
        String str = f18704N;
        c.mo28361a(str, String.format("Scheduling work ID %s Job ID %s", pVar.f24143a, Integer.valueOf(i)), new Throwable[0]);
        try {
            if (this.f18707b.schedule(a) == 0) {
                AbstractC4234j.m28364c().mo28357h(str, String.format("Unable to schedule work ID %s", pVar.f24143a), new Throwable[0]);
                if (pVar.f24159q && pVar.f24160r == EnumC4245n.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    pVar.f24159q = false;
                    AbstractC4234j.m28364c().mo28361a(str, String.format("Scheduling a non-expedited job (work ID %s)", pVar.f24143a), new Throwable[0]);
                    m21947j(pVar, i);
                }
            }
        } catch (IllegalStateException e) {
            List<JobInfo> g = m21950g(this.f18706a, this.f18707b);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(g != null ? g.size() : 0), Integer.valueOf(this.f18708c.m27589s().mo38457D().mo15689f().size()), Integer.valueOf(this.f18708c.m27595m().m38491h()));
            AbstractC4234j.m28364c().mo28360b(f18704N, format, new Throwable[0]);
            throw new IllegalStateException(format, e);
        } catch (Throwable th) {
            AbstractC4234j.m28364c().mo28360b(f18704N, String.format("Unable to schedule %s", pVar), th);
        }
    }

    public C5841b(Context context, C4458i iVar, JobScheduler jobScheduler, C5839a aVar) {
        this.f18706a = context;
        this.f18708c = iVar;
        this.f18707b = jobScheduler;
        this.f18705M = aVar;
    }
}
