package a6;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.location.LocationRequest;
import g6.d;
import g6.e;
import java.util.HashMap;
import java.util.Map;
import l5.i;

public final class r {
    public final z<i> f576a;
    public final Context f577b;
    public boolean f578c = false;
    public final Map<i.a<e>, q> f579d = new HashMap();
    public final Map<i.a, o> f580e = new HashMap();
    public final Map<i.a<d>, n> f581f = new HashMap();

    public r(Context context, z<i> zVar) {
        this.f577b = context;
        this.f576a = zVar;
    }

    public final Location a(String str) {
        ((e0) this.f576a).f558a.v();
        return ((e0) this.f576a).a().p0(str);
    }

    @Deprecated
    public final Location b() {
        ((e0) this.f576a).f558a.v();
        return ((e0) this.f576a).a().Q0();
    }

    public final void c(LocationRequest locationRequest, i<e> iVar, g gVar) {
        q qVar;
        q qVar2;
        ((e0) this.f576a).f558a.v();
        i.a<e> b10 = iVar.b();
        if (b10 == null) {
            qVar = null;
        } else {
            synchronized (this.f579d) {
                qVar2 = this.f579d.get(b10);
                if (qVar2 == null) {
                    qVar2 = new q(iVar);
                }
                this.f579d.put(b10, qVar2);
            }
            qVar = qVar2;
        }
        if (qVar != null) {
            ((e0) this.f576a).a().H(new x(1, v.b(null, locationRequest), qVar, null, null, gVar));
        }
    }

    public final void d(v vVar, i<d> iVar, g gVar) {
        n nVar;
        ((e0) this.f576a).f558a.v();
        i.a<d> b10 = iVar.b();
        if (b10 == null) {
            nVar = null;
        } else {
            synchronized (this.f581f) {
                n nVar2 = this.f581f.get(b10);
                if (nVar2 == null) {
                    nVar2 = new n(iVar);
                }
                nVar = nVar2;
                this.f581f.put(b10, nVar);
            }
        }
        n nVar3 = nVar;
        if (nVar3 != null) {
            ((e0) this.f576a).a().H(new x(1, vVar, null, null, nVar3, gVar));
        }
    }

    public final void e(i.a<e> aVar, g gVar) {
        ((e0) this.f576a).f558a.v();
        m5.r.l(aVar, "Invalid null listener key");
        synchronized (this.f579d) {
            q remove = this.f579d.remove(aVar);
            if (remove != null) {
                remove.h();
                ((e0) this.f576a).a().H(x.b(remove, gVar));
            }
        }
    }

    public final void f(i.a<d> aVar, g gVar) {
        ((e0) this.f576a).f558a.v();
        m5.r.l(aVar, "Invalid null listener key");
        synchronized (this.f581f) {
            n remove = this.f581f.remove(aVar);
            if (remove != null) {
                remove.h();
                ((e0) this.f576a).a().H(x.c(remove, gVar));
            }
        }
    }

    public final void g(boolean z10) {
        ((e0) this.f576a).f558a.v();
        ((e0) this.f576a).a().B1(z10);
        this.f578c = z10;
    }

    public final void h() {
        synchronized (this.f579d) {
            for (q qVar : this.f579d.values()) {
                if (qVar != null) {
                    ((e0) this.f576a).a().H(x.b(qVar, null));
                }
            }
            this.f579d.clear();
        }
        synchronized (this.f581f) {
            for (n nVar : this.f581f.values()) {
                if (nVar != null) {
                    ((e0) this.f576a).a().H(x.c(nVar, null));
                }
            }
            this.f581f.clear();
        }
        synchronized (this.f580e) {
            for (o oVar : this.f580e.values()) {
                if (oVar != null) {
                    ((e0) this.f576a).a().X0(new i0(2, null, oVar, null));
                }
            }
            this.f580e.clear();
        }
    }

    public final void i() {
        if (this.f578c) {
            g(false);
        }
    }
}
