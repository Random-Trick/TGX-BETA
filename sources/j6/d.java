package j6;

import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import b6.i;
import com.google.android.gms.maps.model.LatLng;
import m5.r;

public final class d {
    public final i f15100a;

    public d(i iVar) {
        this.f15100a = (i) r.k(iVar);
    }

    @RecentlyNullable
    public Object a() {
        try {
            return u5.d.t(this.f15100a.W());
        } catch (RemoteException e10) {
            throw new f(e10);
        }
    }

    public void b() {
        try {
            this.f15100a.p();
        } catch (RemoteException e10) {
            throw new f(e10);
        }
    }

    public void c(float f10) {
        try {
            this.f15100a.w(f10);
        } catch (RemoteException e10) {
            throw new f(e10);
        }
    }

    public void d(a aVar) {
        try {
            if (aVar == null) {
                this.f15100a.q1(null);
                return;
            }
            this.f15100a.q1(aVar.a());
        } catch (RemoteException e10) {
            throw new f(e10);
        }
    }

    public void e(@RecentlyNonNull LatLng latLng) {
        if (latLng != null) {
            try {
                this.f15100a.S(latLng);
            } catch (RemoteException e10) {
                throw new f(e10);
            }
        } else {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        try {
            return this.f15100a.g1(((d) obj).f15100a);
        } catch (RemoteException e10) {
            throw new f(e10);
        }
    }

    public void f(Object obj) {
        try {
            this.f15100a.I(u5.d.x0(obj));
        } catch (RemoteException e10) {
            throw new f(e10);
        }
    }

    public void g(float f10) {
        try {
            this.f15100a.Y(f10);
        } catch (RemoteException e10) {
            throw new f(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f15100a.C1();
        } catch (RemoteException e10) {
            throw new f(e10);
        }
    }
}
