package p357z5;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.location.LocationRequest;
import java.util.HashMap;
import java.util.Map;
import p075f6.AbstractC4278d;
import p075f6.AbstractC4280e;
import p148k5.C6120i;
import p163l5.C6378r;

public final class C11315r {
    public final AbstractC11323z<AbstractC11299i> f36224a;
    public final Context f36225b;
    public boolean f36226c = false;
    public final Map<C6120i.C6121a<AbstractC4280e>, BinderC11314q> f36227d = new HashMap();
    public final Map<C6120i.C6121a, BinderC11311o> f36228e = new HashMap();
    public final Map<C6120i.C6121a<AbstractC4278d>, BinderC11309n> f36229f = new HashMap();

    public C11315r(Context context, AbstractC11323z<AbstractC11299i> zVar) {
        this.f36225b = context;
        this.f36224a = zVar;
    }

    public final Location m916a(String str) {
        ((C11292e0) this.f36224a).f36203a.m20624v();
        return ((C11292e0) this.f36224a).m944a().mo932m0(str);
    }

    @Deprecated
    public final Location m915b() {
        ((C11292e0) this.f36224a).f36203a.m20624v();
        return ((C11292e0) this.f36224a).m944a().mo934T0();
    }

    public final void m914c(LocationRequest locationRequest, C6120i<AbstractC4280e> iVar, AbstractC11295g gVar) {
        BinderC11314q qVar;
        BinderC11314q qVar2;
        ((C11292e0) this.f36224a).f36203a.m20624v();
        C6120i.C6121a<AbstractC4280e> b = iVar.m21260b();
        if (b == null) {
            qVar = null;
        } else {
            synchronized (this.f36227d) {
                qVar2 = this.f36227d.get(b);
                if (qVar2 == null) {
                    qVar2 = new BinderC11314q(iVar);
                }
                this.f36227d.put(b, qVar2);
            }
            qVar = qVar2;
        }
        if (qVar != null) {
            ((C11292e0) this.f36224a).m944a().mo931s0(new C11321x(1, C11319v.m897b(null, locationRequest), qVar, null, null, gVar));
        }
    }

    public final void m913d(C11319v vVar, C6120i<AbstractC4278d> iVar, AbstractC11295g gVar) {
        BinderC11309n nVar;
        ((C11292e0) this.f36224a).f36203a.m20624v();
        C6120i.C6121a<AbstractC4278d> b = iVar.m21260b();
        if (b == null) {
            nVar = null;
        } else {
            synchronized (this.f36229f) {
                BinderC11309n nVar2 = this.f36229f.get(b);
                if (nVar2 == null) {
                    nVar2 = new BinderC11309n(iVar);
                }
                nVar = nVar2;
                this.f36229f.put(b, nVar);
            }
        }
        BinderC11309n nVar3 = nVar;
        if (nVar3 != null) {
            ((C11292e0) this.f36224a).m944a().mo931s0(new C11321x(1, vVar, null, null, nVar3, gVar));
        }
    }

    public final void m912e(C6120i.C6121a<AbstractC4280e> aVar, AbstractC11295g gVar) {
        ((C11292e0) this.f36224a).f36203a.m20624v();
        C6378r.m20505l(aVar, "Invalid null listener key");
        synchronized (this.f36227d) {
            BinderC11314q remove = this.f36227d.remove(aVar);
            if (remove != null) {
                remove.m917h();
                ((C11292e0) this.f36224a).m944a().mo931s0(C11321x.m895b(remove, gVar));
            }
        }
    }

    public final void m911f(C6120i.C6121a<AbstractC4278d> aVar, AbstractC11295g gVar) {
        ((C11292e0) this.f36224a).f36203a.m20624v();
        C6378r.m20505l(aVar, "Invalid null listener key");
        synchronized (this.f36229f) {
            BinderC11309n remove = this.f36229f.remove(aVar);
            if (remove != null) {
                remove.m926h();
                ((C11292e0) this.f36224a).m944a().mo931s0(C11321x.m894c(remove, gVar));
            }
        }
    }

    public final void m910g(boolean z) {
        ((C11292e0) this.f36224a).f36203a.m20624v();
        ((C11292e0) this.f36224a).m944a().mo935C1(z);
        this.f36226c = z;
    }

    public final void m909h() {
        synchronized (this.f36227d) {
            for (BinderC11314q qVar : this.f36227d.values()) {
                if (qVar != null) {
                    ((C11292e0) this.f36224a).m944a().mo931s0(C11321x.m895b(qVar, null));
                }
            }
            this.f36227d.clear();
        }
        synchronized (this.f36229f) {
            for (BinderC11309n nVar : this.f36229f.values()) {
                if (nVar != null) {
                    ((C11292e0) this.f36224a).m944a().mo931s0(C11321x.m894c(nVar, null));
                }
            }
            this.f36229f.clear();
        }
        synchronized (this.f36228e) {
            for (BinderC11311o oVar : this.f36228e.values()) {
                if (oVar != null) {
                    ((C11292e0) this.f36224a).m944a().mo936A1(new C11300i0(2, null, oVar, null));
                }
            }
            this.f36228e.clear();
        }
    }

    public final void m908i() {
        if (this.f36226c) {
            m910g(false);
        }
    }
}
