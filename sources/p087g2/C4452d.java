package p087g2;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.C1066a;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C1097a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import p022b7.AbstractFutureC1291a;
import p071f2.AbstractC4234j;
import p071f2.C4228e;
import p087g2.RunnableC4459j;
import p185n2.AbstractC7098a;
import p215p2.C8007k;
import p227q0.C8117a;
import p243r2.AbstractC8354a;

public class C4452d implements AbstractC4450b, AbstractC7098a {
    public static final String f14718U = AbstractC4234j.m28362f("Processor");
    public AbstractC8354a f14719M;
    public WorkDatabase f14720N;
    public List<AbstractC4454e> f14723Q;
    public Context f14728b;
    public C1066a f14729c;
    public Map<String, RunnableC4459j> f14722P = new HashMap();
    public Map<String, RunnableC4459j> f14721O = new HashMap();
    public Set<String> f14724R = new HashSet();
    public final List<AbstractC4450b> f14725S = new ArrayList();
    public PowerManager.WakeLock f14727a = null;
    public final Object f14726T = new Object();

    public static class RunnableC4453a implements Runnable {
        public AbstractC4450b f14730a;
        public String f14731b;
        public AbstractFutureC1291a<Boolean> f14732c;

        public RunnableC4453a(AbstractC4450b bVar, String str, AbstractFutureC1291a<Boolean> aVar) {
            this.f14730a = bVar;
            this.f14731b = str;
            this.f14732c = aVar;
        }

        @Override
        public void run() {
            boolean z;
            try {
                z = this.f14732c.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.f14730a.mo24443d(this.f14731b, z);
        }
    }

    public C4452d(Context context, C1066a aVar, AbstractC8354a aVar2, WorkDatabase workDatabase, List<AbstractC4454e> list) {
        this.f14728b = context;
        this.f14729c = aVar;
        this.f14719M = aVar2;
        this.f14720N = workDatabase;
        this.f14723Q = list;
    }

    public static boolean m27638e(String str, RunnableC4459j jVar) {
        if (jVar != null) {
            jVar.m27578d();
            AbstractC4234j.m28364c().mo28361a(f14718U, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
            return true;
        }
        AbstractC4234j.m28364c().mo28361a(f14718U, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
        return false;
    }

    @Override
    public void mo17738a(String str, C4228e eVar) {
        synchronized (this.f14726T) {
            AbstractC4234j.m28364c().mo28359d(f14718U, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
            RunnableC4459j remove = this.f14722P.remove(str);
            if (remove != null) {
                if (this.f14727a == null) {
                    PowerManager.WakeLock b = C8007k.m13794b(this.f14728b, "ProcessorForegroundLck");
                    this.f14727a = b;
                    b.acquire();
                }
                this.f14721O.put(str, remove);
                C8117a.m13430m(this.f14728b, C1097a.m38404c(this.f14728b, str, eVar));
            }
        }
    }

    @Override
    public void mo17737b(String str) {
        synchronized (this.f14726T) {
            this.f14721O.remove(str);
            m27630m();
        }
    }

    public void m27639c(AbstractC4450b bVar) {
        synchronized (this.f14726T) {
            this.f14725S.add(bVar);
        }
    }

    @Override
    public void mo24443d(String str, boolean z) {
        synchronized (this.f14726T) {
            this.f14722P.remove(str);
            AbstractC4234j.m28364c().mo28361a(f14718U, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z)), new Throwable[0]);
            for (AbstractC4450b bVar : this.f14725S) {
                bVar.mo24443d(str, z);
            }
        }
    }

    public boolean m27637f(String str) {
        boolean contains;
        synchronized (this.f14726T) {
            contains = this.f14724R.contains(str);
        }
        return contains;
    }

    public boolean m27636g(String str) {
        boolean z;
        synchronized (this.f14726T) {
            if (!this.f14722P.containsKey(str) && !this.f14721O.containsKey(str)) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    public boolean m27635h(String str) {
        boolean containsKey;
        synchronized (this.f14726T) {
            containsKey = this.f14721O.containsKey(str);
        }
        return containsKey;
    }

    public void m27634i(AbstractC4450b bVar) {
        synchronized (this.f14726T) {
            this.f14725S.remove(bVar);
        }
    }

    public boolean m27633j(String str) {
        return m27632k(str, null);
    }

    public boolean m27632k(String str, WorkerParameters.C1065a aVar) {
        synchronized (this.f14726T) {
            if (m27636g(str)) {
                AbstractC4234j.m28364c().mo28361a(f14718U, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            RunnableC4459j a = new RunnableC4459j.C4462c(this.f14728b, this.f14729c, this.f14719M, this, this.f14720N, str).m27564c(this.f14723Q).m27565b(aVar).m27566a();
            AbstractFutureC1291a<Boolean> b = a.m27580b();
            b.mo13371a(new RunnableC4453a(this, str, b), this.f14719M.mo12682a());
            this.f14722P.put(str, a);
            this.f14719M.mo12680c().execute(a);
            AbstractC4234j.m28364c().mo28361a(f14718U, String.format("%s: processing %s", getClass().getSimpleName(), str), new Throwable[0]);
            return true;
        }
    }

    public boolean m27631l(String str) {
        boolean e;
        synchronized (this.f14726T) {
            boolean z = true;
            AbstractC4234j.m28364c().mo28361a(f14718U, String.format("Processor cancelling %s", str), new Throwable[0]);
            this.f14724R.add(str);
            RunnableC4459j remove = this.f14721O.remove(str);
            if (remove == null) {
                z = false;
            }
            if (remove == null) {
                remove = this.f14722P.remove(str);
            }
            e = m27638e(str, remove);
            if (z) {
                m27630m();
            }
        }
        return e;
    }

    public final void m27630m() {
        synchronized (this.f14726T) {
            if (!(!this.f14721O.isEmpty())) {
                this.f14728b.startService(C1097a.m38403e(this.f14728b));
                PowerManager.WakeLock wakeLock = this.f14727a;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f14727a = null;
                }
            }
        }
    }

    public boolean m27629n(String str) {
        boolean e;
        synchronized (this.f14726T) {
            AbstractC4234j.m28364c().mo28361a(f14718U, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            e = m27638e(str, this.f14721O.remove(str));
        }
        return e;
    }

    public boolean m27628o(String str) {
        boolean e;
        synchronized (this.f14726T) {
            AbstractC4234j.m28364c().mo28361a(f14718U, String.format("Processor stopping background work %s", str), new Throwable[0]);
            e = m27638e(str, this.f14722P.remove(str));
        }
        return e;
    }
}
