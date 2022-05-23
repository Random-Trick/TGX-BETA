package h6;

import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import i6.a;
import j6.f;
import m5.r;

public final class b {
    public static a f12532a;

    @RecentlyNonNull
    public static a a(@RecentlyNonNull CameraPosition cameraPosition) {
        r.l(cameraPosition, "cameraPosition must not be null");
        try {
            return new a(f().L0(cameraPosition));
        } catch (RemoteException e10) {
            throw new f(e10);
        }
    }

    @RecentlyNonNull
    public static a b(@RecentlyNonNull LatLng latLng) {
        r.l(latLng, "latLng must not be null");
        try {
            return new a(f().b0(latLng));
        } catch (RemoteException e10) {
            throw new f(e10);
        }
    }

    @RecentlyNonNull
    public static a c(@RecentlyNonNull LatLngBounds latLngBounds, int i10, int i11, int i12) {
        r.l(latLngBounds, "bounds must not be null");
        try {
            return new a(f().G0(latLngBounds, i10, i11, i12));
        } catch (RemoteException e10) {
            throw new f(e10);
        }
    }

    @RecentlyNonNull
    public static a d(@RecentlyNonNull LatLng latLng, float f10) {
        r.l(latLng, "latLng must not be null");
        try {
            return new a(f().m1(latLng, f10));
        } catch (RemoteException e10) {
            throw new f(e10);
        }
    }

    public static void e(@RecentlyNonNull a aVar) {
        f12532a = (a) r.k(aVar);
    }

    public static a f() {
        return (a) r.l(f12532a, "CameraUpdateFactory is not initialized");
    }
}
