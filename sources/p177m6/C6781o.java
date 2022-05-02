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
    public static <TResult> TResult m19054a(@RecentlyNonNull AbstractC6775l<TResult> lVar) {
        C6378r.m20508i();
        C6378r.m20505l(lVar, "Task must not be null");
        if (lVar.mo19066o()) {
            return (TResult) m19048g(lVar);
        }
        C6783q qVar = new C6783q(null);
        m19047h(lVar, qVar);
        qVar.m19046d();
        return (TResult) m19048g(lVar);
    }

    @RecentlyNonNull
    public static <TResult> TResult m19053b(@RecentlyNonNull AbstractC6775l<TResult> lVar, long j, @RecentlyNonNull TimeUnit timeUnit) {
        C6378r.m20508i();
        C6378r.m20505l(lVar, "Task must not be null");
        C6378r.m20505l(timeUnit, "TimeUnit must not be null");
        if (lVar.mo19066o()) {
            return (TResult) m19048g(lVar);
        }
        C6783q qVar = new C6783q(null);
        m19047h(lVar, qVar);
        if (qVar.m19045e(j, timeUnit)) {
            return (TResult) m19048g(lVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    public static <TResult> AbstractC6775l<TResult> m19052c(@RecentlyNonNull Executor executor, @RecentlyNonNull Callable<TResult> callable) {
        C6378r.m20505l(executor, "Executor must not be null");
        C6378r.m20505l(callable, "Callback must not be null");
        C6778m0 m0Var = new C6778m0();
        executor.execute(new RunnableC6780n0(m0Var, callable));
        return m0Var;
    }

    public static <TResult> AbstractC6775l<TResult> m19051d() {
        C6778m0 m0Var = new C6778m0();
        m0Var.m19059v();
        return m0Var;
    }

    public static <TResult> AbstractC6775l<TResult> m19050e(@RecentlyNonNull Exception exc) {
        C6778m0 m0Var = new C6778m0();
        m0Var.m19061t(exc);
        return m0Var;
    }

    public static <TResult> AbstractC6775l<TResult> m19049f(@RecentlyNonNull TResult tresult) {
        C6778m0 m0Var = new C6778m0();
        m0Var.m19063r(tresult);
        return m0Var;
    }

    public static <TResult> TResult m19048g(AbstractC6775l<TResult> lVar) {
        if (lVar.mo19065p()) {
            return lVar.mo19069l();
        }
        if (lVar.mo19067n()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(lVar.mo19070k());
    }

    public static <T> void m19047h(AbstractC6775l<T> lVar, AbstractC6784r<? super T> rVar) {
        Executor executor = C6779n.f21257b;
        lVar.mo19075f(executor, rVar);
        lVar.mo19077d(executor, rVar);
        lVar.mo19080a(executor, rVar);
    }
}
