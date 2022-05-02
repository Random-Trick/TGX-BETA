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
    public static final String f26068P = AbstractC4234j.m28360f("WorkForegroundRunnable");
    public final ListenableWorker f26069M;
    public final AbstractC4229f f26070N;
    public final AbstractC8354a f26071O;
    public final C8154c<Void> f26072a = C8154c.m13346t();
    public final Context f26073b;
    public final C7554p f26074c;

    public class RunnableC8009a implements Runnable {
        public final C8154c f26075a;

        public RunnableC8009a(C8154c cVar) {
            this.f26075a = cVar;
        }

        @Override
        public void run() {
            this.f26075a.mo13347r(RunnableC8008l.this.f26069M.m38516d());
        }
    }

    public class RunnableC8010b implements Runnable {
        public final C8154c f26077a;

        public RunnableC8010b(C8154c cVar) {
            this.f26077a = cVar;
        }

        @Override
        public void run() {
            try {
                C4228e eVar = (C4228e) this.f26077a.get();
                if (eVar != null) {
                    AbstractC4234j.m28362c().mo28359a(RunnableC8008l.f26068P, String.format("Updating notification for %s", RunnableC8008l.this.f26074c.f24142c), new Throwable[0]);
                    RunnableC8008l.this.f26069M.m38510m(true);
                    RunnableC8008l lVar = RunnableC8008l.this;
                    lVar.f26072a.mo13347r(lVar.f26070N.mo13793a(lVar.f26073b, lVar.f26069M.m38515e(), eVar));
                    return;
                }
                throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", RunnableC8008l.this.f26074c.f24142c));
            } catch (Throwable th) {
                RunnableC8008l.this.f26072a.mo13348q(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public RunnableC8008l(Context context, C7554p pVar, ListenableWorker listenableWorker, AbstractC4229f fVar, AbstractC8354a aVar) {
        this.f26073b = context;
        this.f26074c = pVar;
        this.f26069M = listenableWorker;
        this.f26070N = fVar;
        this.f26071O = aVar;
    }

    public AbstractFutureC1291a<Void> m13794a() {
        return this.f26072a;
    }

    @Override
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (!this.f26074c.f24156q || C10326a.m5418c()) {
            this.f26072a.mo13349p(null);
            return;
        }
        C8154c t = C8154c.m13346t();
        this.f26071O.mo12683a().execute(new RunnableC8009a(t));
        t.mo13372a(new RunnableC8010b(t), this.f26071O.mo12683a());
    }
}
