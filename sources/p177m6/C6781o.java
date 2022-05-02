package p177m6;

import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p163l5.C6378r;

public final class C6781o {
    @RecentlyNonNull
    public static <TResult> TResult m19055a(@RecentlyNonNull AbstractC6775l<TResult> lVar) {
        C6378r.m20509i();
        C6378r.m20506l(lVar, "Task must not be null");
        if (lVar.mo19067o()) {
            return (TResult) m19049g(lVar);
        }
        C6783q qVar = new C6783q(null);
        m19048h(lVar, qVar);
        qVar.m19047d();
        return (TResult) m19049g(lVar);
    }

    @RecentlyNonNull
    public static <TResult> TResult m19054b(@RecentlyNonNull AbstractC6775l<TResult> lVar, long j, @RecentlyNonNull TimeUnit timeUnit) {
        C6378r.m20509i();
        C6378r.m20506l(lVar, "Task must not be null");
        C6378r.m20506l(timeUnit, "TimeUnit must not be null");
        if (lVar.mo19067o()) {
            return (TResult) m19049g(lVar);
        }
        C6783q qVar = new C6783q(null);
        m19048h(lVar, qVar);
        if (qVar.m19046e(j, timeUnit)) {
            return (TResult) m19049g(lVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    public static <TResult> AbstractC6775l<TResult> m19053c(@RecentlyNonNull Executor executor, @RecentlyNonNull Callable<TResult> callable) {
        C6378r.m20506l(executor, "Executor must not be null");
        C6378r.m20506l(callable, "Callback must not be null");
        C6778m0 m0Var = new C6778m0();
        executor.execute(new RunnableC6780n0(m0Var, callable));
        return m0Var;
    }

    public static <TResult> AbstractC6775l<TResult> m19052d() {
        C6778m0 m0Var = new C6778m0();
        m0Var.m19060v();
        return m0Var;
    }

    public static <TResult> AbstractC6775l<TResult> m19051e(@RecentlyNonNull Exception exc) {
        C6778m0 m0Var = new C6778m0();
        m0Var.m19062t(exc);
        return m0Var;
    }

    public static <TResult> AbstractC6775l<TResult> m19050f(@RecentlyNonNull TResult tresult) {
        C6778m0 m0Var = new C6778m0();
        m0Var.m19064r(tresult);
        return m0Var;
    }

    public static <TResult> TResult m19049g(AbstractC6775l<TResult> lVar) {
        if (lVar.mo19066p()) {
            return lVar.mo19070l();
        }
        if (lVar.mo19068n()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(lVar.mo19071k());
    }

    public static <T> void m19048h(AbstractC6775l<T> lVar, AbstractC6784r<? super T> rVar) {
        Executor executor = C6779n.f21257b;
        lVar.mo19076f(executor, rVar);
        lVar.mo19078d(executor, rVar);
        lVar.mo19081a(executor, rVar);
    }
}
