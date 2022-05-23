package p2;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import f2.e;
import f2.f;
import f2.j;
import o2.p;
import q2.c;

public class l implements Runnable {
    public static final String P = j.f("WorkForegroundRunnable");
    public final ListenableWorker M;
    public final f N;
    public final r2.a O;
    public final c<Void> f20434a = c.t();
    public final Context f20435b;
    public final p f20436c;

    public class a implements Runnable {
        public final c f20437a;

        public a(c cVar) {
            this.f20437a = cVar;
        }

        @Override
        public void run() {
            this.f20437a.r(l.this.M.d());
        }
    }

    public class b implements Runnable {
        public final c f20439a;

        public b(c cVar) {
            this.f20439a = cVar;
        }

        @Override
        public void run() {
            try {
                e eVar = (e) this.f20439a.get();
                if (eVar != null) {
                    j.c().a(l.P, String.format("Updating notification for %s", l.this.f20436c.f18592c), new Throwable[0]);
                    l.this.M.m(true);
                    l lVar = l.this;
                    lVar.f20434a.r(lVar.N.a(lVar.f20435b, lVar.M.e(), eVar));
                    return;
                }
                throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", l.this.f20436c.f18592c));
            } catch (Throwable th) {
                l.this.f20434a.q(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public l(Context context, p pVar, ListenableWorker listenableWorker, f fVar, r2.a aVar) {
        this.f20435b = context;
        this.f20436c = pVar;
        this.M = listenableWorker;
        this.N = fVar;
        this.O = aVar;
    }

    public c7.a<Void> a() {
        return this.f20434a;
    }

    @Override
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (!this.f20436c.f18606q || y0.a.c()) {
            this.f20434a.p(null);
            return;
        }
        c t10 = c.t();
        this.O.a().execute(new a(t10));
        t10.a(new b(t10), this.O.a());
    }
}
