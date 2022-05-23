package g2;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import f2.e;
import f2.j;
import g2.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import p2.k;

public class d implements b, n2.a {
    public static final String U = j.f("Processor");
    public r2.a M;
    public WorkDatabase N;
    public List<e> Q;
    public Context f12026b;
    public androidx.work.a f12027c;
    public Map<String, j> P = new HashMap();
    public Map<String, j> O = new HashMap();
    public Set<String> R = new HashSet();
    public final List<b> S = new ArrayList();
    public PowerManager.WakeLock f12025a = null;
    public final Object T = new Object();

    public static class a implements Runnable {
        public b f12028a;
        public String f12029b;
        public c7.a<Boolean> f12030c;

        public a(b bVar, String str, c7.a<Boolean> aVar) {
            this.f12028a = bVar;
            this.f12029b = str;
            this.f12030c = aVar;
        }

        @Override
        public void run() {
            boolean z10;
            try {
                z10 = this.f12030c.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z10 = true;
            }
            this.f12028a.d(this.f12029b, z10);
        }
    }

    public d(Context context, androidx.work.a aVar, r2.a aVar2, WorkDatabase workDatabase, List<e> list) {
        this.f12026b = context;
        this.f12027c = aVar;
        this.M = aVar2;
        this.N = workDatabase;
        this.Q = list;
    }

    public static boolean e(String str, j jVar) {
        if (jVar != null) {
            jVar.d();
            j.c().a(U, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
            return true;
        }
        j.c().a(U, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
        return false;
    }

    @Override
    public void a(String str, e eVar) {
        synchronized (this.T) {
            j.c().d(U, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
            j remove = this.P.remove(str);
            if (remove != null) {
                if (this.f12025a == null) {
                    PowerManager.WakeLock b10 = k.b(this.f12026b, "ProcessorForegroundLck");
                    this.f12025a = b10;
                    b10.acquire();
                }
                this.O.put(str, remove);
                q0.a.k(this.f12026b, androidx.work.impl.foreground.a.c(this.f12026b, str, eVar));
            }
        }
    }

    @Override
    public void b(String str) {
        synchronized (this.T) {
            this.O.remove(str);
            m();
        }
    }

    public void c(b bVar) {
        synchronized (this.T) {
            this.S.add(bVar);
        }
    }

    @Override
    public void d(String str, boolean z10) {
        synchronized (this.T) {
            this.P.remove(str);
            j.c().a(U, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z10)), new Throwable[0]);
            for (b bVar : this.S) {
                bVar.d(str, z10);
            }
        }
    }

    public boolean f(String str) {
        boolean contains;
        synchronized (this.T) {
            contains = this.R.contains(str);
        }
        return contains;
    }

    public boolean g(String str) {
        boolean z10;
        synchronized (this.T) {
            if (!this.P.containsKey(str) && !this.O.containsKey(str)) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    public boolean h(String str) {
        boolean containsKey;
        synchronized (this.T) {
            containsKey = this.O.containsKey(str);
        }
        return containsKey;
    }

    public void i(b bVar) {
        synchronized (this.T) {
            this.S.remove(bVar);
        }
    }

    public boolean j(String str) {
        return k(str, null);
    }

    public boolean k(String str, WorkerParameters.a aVar) {
        synchronized (this.T) {
            if (g(str)) {
                j.c().a(U, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            j a10 = new j.c(this.f12026b, this.f12027c, this.M, this, this.N, str).c(this.Q).b(aVar).a();
            c7.a<Boolean> b10 = a10.b();
            b10.a(new a(this, str, b10), this.M.a());
            this.P.put(str, a10);
            this.M.c().execute(a10);
            f2.j.c().a(U, String.format("%s: processing %s", getClass().getSimpleName(), str), new Throwable[0]);
            return true;
        }
    }

    public boolean l(String str) {
        boolean e10;
        synchronized (this.T) {
            boolean z10 = true;
            f2.j.c().a(U, String.format("Processor cancelling %s", str), new Throwable[0]);
            this.R.add(str);
            j remove = this.O.remove(str);
            if (remove == null) {
                z10 = false;
            }
            if (remove == null) {
                remove = this.P.remove(str);
            }
            e10 = e(str, remove);
            if (z10) {
                m();
            }
        }
        return e10;
    }

    public final void m() {
        synchronized (this.T) {
            if (!(!this.O.isEmpty())) {
                this.f12026b.startService(androidx.work.impl.foreground.a.e(this.f12026b));
                PowerManager.WakeLock wakeLock = this.f12025a;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f12025a = null;
                }
            }
        }
    }

    public boolean n(String str) {
        boolean e10;
        synchronized (this.T) {
            f2.j.c().a(U, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            e10 = e(str, this.O.remove(str));
        }
        return e10;
    }

    public boolean o(String str) {
        boolean e10;
        synchronized (this.T) {
            f2.j.c().a(U, String.format("Processor stopping background work %s", str), new Throwable[0]);
            e10 = e(str, this.P.remove(str));
        }
        return e10;
    }
}
