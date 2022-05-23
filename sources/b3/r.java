package b3;

import android.content.Context;
import g3.e;
import h3.l;
import h3.p;
import java.util.Collections;
import java.util.Set;
import k3.a;
import y2.b;
import y2.g;
import y2.h;

public class r implements q {
    public static volatile s f3744e;
    public final a f3745a;
    public final a f3746b;
    public final e f3747c;
    public final l f3748d;

    public r(a aVar, a aVar2, e eVar, l lVar, p pVar) {
        this.f3745a = aVar;
        this.f3746b = aVar2;
        this.f3747c = eVar;
        this.f3748d = lVar;
        pVar.c();
    }

    public static r c() {
        s sVar = f3744e;
        if (sVar != null) {
            return sVar.s();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static Set<b> d(e eVar) {
        if (eVar instanceof f) {
            return Collections.unmodifiableSet(((f) eVar).a());
        }
        return Collections.singleton(b.b("proto"));
    }

    public static void f(Context context) {
        if (f3744e == null) {
            synchronized (r.class) {
                if (f3744e == null) {
                    f3744e = d.y0().b(context).a();
                }
            }
        }
    }

    @Override
    public void a(l lVar, h hVar) {
        this.f3747c.a(lVar.f().e(lVar.c().c()), b(lVar), hVar);
    }

    public final h b(l lVar) {
        return h.a().i(this.f3745a.a()).k(this.f3746b.a()).j(lVar.g()).h(new g(lVar.b(), lVar.d())).g(lVar.c().a()).d();
    }

    public l e() {
        return this.f3748d;
    }

    public g g(e eVar) {
        return new n(d(eVar), m.a().b(eVar.b()).c(eVar.c()).a(), this);
    }
}
