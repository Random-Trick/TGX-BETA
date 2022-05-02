package p300v6;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p262s6.C8682s;

public final class C9856g {
    public static <ResultT> ResultT m6749a(AbstractC9854e<ResultT> eVar) {
        C8682s.m11744a(eVar, "Task must not be null");
        if (eVar.mo6722h()) {
            return (ResultT) m6746d(eVar);
        }
        C9871v vVar = new C9871v(null);
        m6745e(eVar, vVar);
        vVar.m6712b();
        return (ResultT) m6746d(eVar);
    }

    public static AbstractC9854e m6748b(Exception exc) {
        C9869t tVar = new C9869t();
        tVar.m6720j(exc);
        return tVar;
    }

    public static AbstractC9854e m6747c(Object obj) {
        C9869t tVar = new C9869t();
        tVar.m6719k(obj);
        return tVar;
    }

    public static Object m6746d(AbstractC9854e eVar) {
        if (eVar.mo6721i()) {
            return eVar.mo6723g();
        }
        throw new ExecutionException(eVar.mo6724f());
    }

    public static void m6745e(AbstractC9854e eVar, AbstractC9872w wVar) {
        Executor executor = C9855f.f32128b;
        eVar.mo6726d(executor, wVar);
        eVar.mo6728b(executor, wVar);
    }
}
