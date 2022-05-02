package p091g6;

import android.location.Location;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.maps.model.CameraPosition;
import p007a6.AbstractC0196i;
import p103h6.AbstractC4989b;
import p119i6.C5242c;
import p119i6.C5243d;
import p119i6.C5244e;
import p119i6.C5245f;
import p163l5.C6378r;

public class C4481c {
    public final AbstractC4989b f14825a;
    public C4493i f14826b;

    public interface AbstractC4482a {
        void mo11355r1();
    }

    public interface AbstractC4483b {
        void mo11357p1();
    }

    public interface AbstractC4484c {
        void mo11395M();
    }

    public interface AbstractC4485d {
        void mo11382S3(int i);
    }

    public interface AbstractC4486e {
        boolean mo27521T2(@RecentlyNonNull C5243d dVar);
    }

    @Deprecated
    public interface AbstractC4487f {
        void mo11365e5(@RecentlyNonNull Location location);
    }

    public C4481c(@RecentlyNonNull AbstractC4989b bVar) {
        this.f14825a = (AbstractC4989b) C6378r.m20507k(bVar);
    }

    @RecentlyNullable
    public final C5243d m27537a(@RecentlyNonNull C5244e eVar) {
        try {
            C6378r.m20506l(eVar, "MarkerOptions must not be null.");
            AbstractC0196i H = this.f14825a.mo24302H(eVar);
            if (H != null) {
                return new C5243d(H);
            }
            return null;
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    public final void m27536b(@RecentlyNonNull C4479a aVar) {
        try {
            C6378r.m20506l(aVar, "CameraUpdate must not be null.");
            this.f14825a.mo24304E(aVar.m27544a());
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    @RecentlyNonNull
    public final CameraPosition m27535c() {
        try {
            return this.f14825a.mo24299e0();
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    public final float m27534d() {
        try {
            return this.f14825a.mo24298i1();
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    public final float m27533e() {
        try {
            return this.f14825a.mo24306D();
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    @RecentlyNonNull
    public final C4493i m27532f() {
        try {
            if (this.f14826b == null) {
                this.f14826b = new C4493i(this.f14825a.mo24300L0());
            }
            return this.f14826b;
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    public final void m27531g(@RecentlyNonNull C4479a aVar) {
        try {
            C6378r.m20506l(aVar, "CameraUpdate must not be null.");
            this.f14825a.mo24303F0(aVar.m27544a());
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    public boolean m27530h(C5242c cVar) {
        try {
            return this.f14825a.mo24293w(cVar);
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    public final void m27529i(int i) {
        try {
            this.f14825a.mo24308A0(i);
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    public final void m27528j(boolean z) {
        try {
            this.f14825a.mo24296l1(z);
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    public final void m27527k(AbstractC4482a aVar) {
        try {
            if (aVar == null) {
                this.f14825a.mo24307C0(null);
            } else {
                this.f14825a.mo24307C0(new BinderC4507w(this, aVar));
            }
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    public final void m27526l(AbstractC4483b bVar) {
        try {
            if (bVar == null) {
                this.f14825a.mo24297l0(null);
            } else {
                this.f14825a.mo24297l0(new BinderC4506v(this, bVar));
            }
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    public final void m27525m(AbstractC4484c cVar) {
        try {
            if (cVar == null) {
                this.f14825a.mo24305D1(null);
            } else {
                this.f14825a.mo24305D1(new BinderC4505u(this, cVar));
            }
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    public final void m27524n(AbstractC4485d dVar) {
        try {
            if (dVar == null) {
                this.f14825a.mo24295n1(null);
            } else {
                this.f14825a.mo24295n1(new BinderC4504t(this, dVar));
            }
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    public final void m27523o(AbstractC4486e eVar) {
        try {
            if (eVar == null) {
                this.f14825a.mo24301K0(null);
            } else {
                this.f14825a.mo24301K0(new BinderC4494j(this, eVar));
            }
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    @Deprecated
    public final void m27522p(AbstractC4487f fVar) {
        try {
            if (fVar == null) {
                this.f14825a.mo24294r1(null);
            } else {
                this.f14825a.mo24294r1(new BinderC4503s(this, fVar));
            }
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }
}
