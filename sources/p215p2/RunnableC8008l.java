package p215p2;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import p022b7.AbstractFutureC1291a;
import p071f2.AbstractC4229f;
import p071f2.AbstractC4234j;
import p071f2.C4228e;
import p198o2.C7554p;
import p229q2.C8154c;
import p243r2.AbstractC8354a;
import p337y0.C10326a;

public class RunnableC8008l implements Runnable {
    public static final String f26071P = AbstractC4234j.m28362f("WorkForegroundRunnable");
    public final ListenableWorker f26072M;
    public final AbstractC4229f f26073N;
    public final AbstractC8354a f26074O;
    public final C8154c<Void> f26075a = C8154c.m13345t();
    public final Context f26076b;
    public final C7554p f26077c;

    public class RunnableC8009a implements Runnable {
        public final C8154c f26078a;

        public RunnableC8009a(C8154c cVar) {
            this.f26078a = cVar;
        }

        @Override
        public void run() {
            this.f26078a.mo13346r(RunnableC8008l.this.f26072M.m38519d());
        }
    }

    public class RunnableC8010b implements Runnable {
        public final C8154c f26080a;

        public RunnableC8010b(C8154c cVar) {
            this.f26080a = cVar;
        }

        @Override
        public void run() {
            try {
                C4228e eVar = (C4228e) this.f26080a.get();
                if (eVar != null) {
                    AbstractC4234j.m28364c().mo28361a(RunnableC8008l.f26071P, String.format("Updating notification for %s", RunnableC8008l.this.f26077c.f24145c), new Throwable[0]);
                    RunnableC8008l.this.f26072M.m38513m(true);
                    RunnableC8008l lVar = RunnableC8008l.this;
                    lVar.f26075a.mo13346r(lVar.f26073N.mo13792a(lVar.f26076b, lVar.f26072M.m38518e(), eVar));
                    return;
                }
                throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", RunnableC8008l.this.f26077c.f24145c));
            } catch (Throwable th) {
                RunnableC8008l.this.f26075a.mo13347q(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public RunnableC8008l(Context context, C7554p pVar, ListenableWorker listenableWorker, AbstractC4229f fVar, AbstractC8354a aVar) {
        this.f26076b = context;
        this.f26077c = pVar;
        this.f26072M = listenableWorker;
        this.f26073N = fVar;
        this.f26074O = aVar;
    }

    public AbstractFutureC1291a<Void> m13793a() {
        return this.f26075a;
    }

    @Override
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (!this.f26077c.f24159q || C10326a.m5418c()) {
            this.f26075a.mo13348p(null);
            return;
        }
        C8154c t = C8154c.m13345t();
        this.f26074O.mo12682a().execute(new RunnableC8009a(t));
        t.mo13371a(new RunnableC8010b(t), this.f26074O.mo12682a());
    }
}
