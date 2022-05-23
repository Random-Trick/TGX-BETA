package h6;

import android.location.Location;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import b6.i;
import com.google.android.gms.maps.model.CameraPosition;
import m5.r;

public class c {
    public final i6.b f12533a;
    public i f12534b;

    public interface a {
        void p1();
    }

    public interface b {
        void m1();
    }

    public interface AbstractC0116c {
        void N();
    }

    public interface d {
        void K3(int i10);
    }

    public interface e {
        boolean t0(@RecentlyNonNull j6.d dVar);
    }

    @Deprecated
    public interface f {
        void Z4(@RecentlyNonNull Location location);
    }

    public c(@RecentlyNonNull i6.b bVar) {
        this.f12533a = (i6.b) r.k(bVar);
    }

    @RecentlyNullable
    public final j6.d a(@RecentlyNonNull j6.e eVar) {
        try {
            r.l(eVar, "MarkerOptions must not be null.");
            i s02 = this.f12533a.s0(eVar);
            if (s02 != null) {
                return new j6.d(s02);
            }
            return null;
        } catch (RemoteException e10) {
            throw new j6.f(e10);
        }
    }

    public final void b(@RecentlyNonNull h6.a aVar) {
        try {
            r.l(aVar, "CameraUpdate must not be null.");
            this.f12533a.t1(aVar.a());
        } catch (RemoteException e10) {
            throw new j6.f(e10);
        }
    }

    @RecentlyNonNull
    public final CameraPosition c() {
        try {
            return this.f12533a.h0();
        } catch (RemoteException e10) {
            throw new j6.f(e10);
        }
    }

    public final float d() {
        try {
            return this.f12533a.i1();
        } catch (RemoteException e10) {
            throw new j6.f(e10);
        }
    }

    public final float e() {
        try {
            return this.f12533a.A();
        } catch (RemoteException e10) {
            throw new j6.f(e10);
        }
    }

    @RecentlyNonNull
    public final i f() {
        try {
            if (this.f12534b == null) {
                this.f12534b = new i(this.f12533a.I0());
            }
            return this.f12534b;
        } catch (RemoteException e10) {
            throw new j6.f(e10);
        }
    }

    public final void g(@RecentlyNonNull h6.a aVar) {
        try {
            r.l(aVar, "CameraUpdate must not be null.");
            this.f12533a.u0(aVar.a());
        } catch (RemoteException e10) {
            throw new j6.f(e10);
        }
    }

    public boolean h(j6.c cVar) {
        try {
            return this.f12533a.H0(cVar);
        } catch (RemoteException e10) {
            throw new j6.f(e10);
        }
    }

    public final void i(int i10) {
        try {
            this.f12533a.D0(i10);
        } catch (RemoteException e10) {
            throw new j6.f(e10);
        }
    }

    public final void j(boolean z10) {
        try {
            this.f12533a.l1(z10);
        } catch (RemoteException e10) {
            throw new j6.f(e10);
        }
    }

    public final void k(a aVar) {
        try {
            if (aVar == null) {
                this.f12533a.l0(null);
            } else {
                this.f12533a.l0(new w(this, aVar));
            }
        } catch (RemoteException e10) {
            throw new j6.f(e10);
        }
    }

    public final void l(b bVar) {
        try {
            if (bVar == null) {
                this.f12533a.Z(null);
            } else {
                this.f12533a.Z(new v(this, bVar));
            }
        } catch (RemoteException e10) {
            throw new j6.f(e10);
        }
    }

    public final void m(AbstractC0116c cVar) {
        try {
            if (cVar == null) {
                this.f12533a.M0(null);
            } else {
                this.f12533a.M0(new u(this, cVar));
            }
        } catch (RemoteException e10) {
            throw new j6.f(e10);
        }
    }

    public final void n(d dVar) {
        try {
            if (dVar == null) {
                this.f12533a.f0(null);
            } else {
                this.f12533a.f0(new t(this, dVar));
            }
        } catch (RemoteException e10) {
            throw new j6.f(e10);
        }
    }

    public final void o(e eVar) {
        try {
            if (eVar == null) {
                this.f12533a.a1(null);
            } else {
                this.f12533a.a1(new j(this, eVar));
            }
        } catch (RemoteException e10) {
            throw new j6.f(e10);
        }
    }

    @Deprecated
    public final void p(f fVar) {
        try {
            if (fVar == null) {
                this.f12533a.b1(null);
            } else {
                this.f12533a.b1(new s(this, fVar));
            }
        } catch (RemoteException e10) {
            throw new j6.f(e10);
        }
    }
}
