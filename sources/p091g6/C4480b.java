package p091g6;

import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import p103h6.AbstractC4987a;
import p119i6.C5245f;
import p163l5.C6378r;

public final class C4480b {
    public static AbstractC4987a f14824a;

    @RecentlyNonNull
    public static C4479a m27543a(@RecentlyNonNull CameraPosition cameraPosition) {
        C6378r.m20506l(cameraPosition, "cameraPosition must not be null");
        try {
            return new C4479a(m27538f().mo24333O0(cameraPosition));
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    @RecentlyNonNull
    public static C4479a m27542b(@RecentlyNonNull LatLng latLng) {
        C6378r.m20506l(latLng, "latLng must not be null");
        try {
            return new C4479a(m27538f().mo24332a0(latLng));
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    @RecentlyNonNull
    public static C4479a m27541c(@RecentlyNonNull LatLngBounds latLngBounds, int i, int i2, int i3) {
        C6378r.m20506l(latLngBounds, "bounds must not be null");
        try {
            return new C4479a(m27538f().mo24334I0(latLngBounds, i, i2, i3));
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    @RecentlyNonNull
    public static C4479a m27540d(@RecentlyNonNull LatLng latLng, float f) {
        C6378r.m20506l(latLng, "latLng must not be null");
        try {
            return new C4479a(m27538f().mo24331m1(latLng, f));
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    public static void m27539e(@RecentlyNonNull AbstractC4987a aVar) {
        f14824a = (AbstractC4987a) C6378r.m20507k(aVar);
    }

    public static AbstractC4987a m27538f() {
        return (AbstractC4987a) C6378r.m20506l(f14824a, "CameraUpdateFactory is not initialized");
    }
}
