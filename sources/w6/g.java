package w6;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import t6.s;

public final class g {
    public static <ResultT> ResultT a(e<ResultT> eVar) {
        s.a(eVar, "Task must not be null");
        if (eVar.h()) {
            return (ResultT) d(eVar);
        }
        v vVar = new v(null);
        e(eVar, vVar);
        vVar.b();
        return (ResultT) d(eVar);
    }

    public static e b(Exception exc) {
        t tVar = new t();
        tVar.j(exc);
        return tVar;
    }

    public static e c(Object obj) {
        t tVar = new t();
        tVar.k(obj);
        return tVar;
    }

    public static Object d(e eVar) {
        if (eVar.i()) {
            return eVar.g();
        }
        throw new ExecutionException(eVar.f());
    }

    public static void e(e eVar, w wVar) {
        Executor executor = f.f25776b;
        eVar.d(executor, wVar);
        eVar.b(executor, wVar);
    }
}
