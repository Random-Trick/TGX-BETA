package p119i6;

import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.maps.model.LatLng;
import p007a6.AbstractC0196i;
import p163l5.C6378r;
import p272t5.BinderC8986d;

public final class C5243d {
    public final AbstractC0196i f17397a;

    public C5243d(AbstractC0196i iVar) {
        this.f17397a = (AbstractC0196i) C6378r.m20507k(iVar);
    }

    @RecentlyNullable
    public Object m23553a() {
        try {
            return BinderC8986d.m10762t(this.f17397a.mo42115W());
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    public void m23552b() {
        try {
            this.f17397a.mo42113p();
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    public void m23551c(float f) {
        try {
            this.f17397a.mo42111v(f);
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    public void m23550d(C5240a aVar) {
        try {
            if (aVar == null) {
                this.f17397a.mo42119A(null);
                return;
            }
            this.f17397a.mo42119A(aVar.m23558a());
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    public void m23549e(@RecentlyNonNull LatLng latLng) {
        if (latLng != null) {
            try {
                this.f17397a.mo42116V(latLng);
            } catch (RemoteException e) {
                throw new C5245f(e);
            }
        } else {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5243d)) {
            return false;
        }
        try {
            return this.f17397a.mo42112q0(((C5243d) obj).f17397a);
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    public void m23548f(Object obj) {
        try {
            this.f17397a.mo42118D0(BinderC8986d.m10763E0(obj));
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    public void m23547g(float f) {
        try {
            this.f17397a.mo42114X(f);
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    public int hashCode() {
        try {
            return this.f17397a.mo42117E1();
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }
}
