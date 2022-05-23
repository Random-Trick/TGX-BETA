package n6;

import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m5.r;

public final class o {
    @RecentlyNonNull
    public static <TResult> TResult a(@RecentlyNonNull l<TResult> lVar) {
        r.i();
        r.l(lVar, "Task must not be null");
        if (lVar.o()) {
            return (TResult) g(lVar);
        }
        q qVar = new q(null);
        h(lVar, qVar);
        qVar.d();
        return (TResult) g(lVar);
    }

    @RecentlyNonNull
    public static <TResult> TResult b(@RecentlyNonNull l<TResult> lVar, long j10, @RecentlyNonNull TimeUnit timeUnit) {
        r.i();
        r.l(lVar, "Task must not be null");
        r.l(timeUnit, "TimeUnit must not be null");
        if (lVar.o()) {
            return (TResult) g(lVar);
        }
        q qVar = new q(null);
        h(lVar, qVar);
        if (qVar.e(j10, timeUnit)) {
            return (TResult) g(lVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    public static <TResult> l<TResult> c(@RecentlyNonNull Executor executor, @RecentlyNonNull Callable<TResult> callable) {
        r.l(executor, "Executor must not be null");
        r.l(callable, "Callback must not be null");
        m0 m0Var = new m0();
        executor.execute(new n0(m0Var, callable));
        return m0Var;
    }

    public static <TResult> l<TResult> d() {
        m0 m0Var = new m0();
        m0Var.v();
        return m0Var;
    }

    public static <TResult> l<TResult> e(@RecentlyNonNull Exception exc) {
        m0 m0Var = new m0();
        m0Var.t(exc);
        return m0Var;
    }

    public static <TResult> l<TResult> f(@RecentlyNonNull TResult tresult) {
        m0 m0Var = new m0();
        m0Var.r(tresult);
        return m0Var;
    }

    public static <TResult> TResult g(l<TResult> lVar) {
        if (lVar.p()) {
            return lVar.l();
        }
        if (lVar.n()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(lVar.k());
    }

    public static <T> void h(l<T> lVar, r<? super T> rVar) {
        Executor executor = n.f17732b;
        lVar.f(executor, rVar);
        lVar.d(executor, rVar);
        lVar.a(executor, rVar);
    }
}
