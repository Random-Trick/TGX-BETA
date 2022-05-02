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
    public static C4479a m27541a(@RecentlyNonNull CameraPosition cameraPosition) {
        C6378r.m20505l(cameraPosition, "cameraPosition must not be null");
        try {
            return new C4479a(m27536f().mo24332O0(cameraPosition));
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    @RecentlyNonNull
    public static C4479a m27540b(@RecentlyNonNull LatLng latLng) {
        C6378r.m20505l(latLng, "latLng must not be null");
        try {
            return new C4479a(m27536f().mo24331a0(latLng));
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    @RecentlyNonNull
    public static C4479a m27539c(@RecentlyNonNull LatLngBounds latLngBounds, int i, int i2, int i3) {
        C6378r.m20505l(latLngBounds, "bounds must not be null");
        try {
            return new C4479a(m27536f().mo24333I0(latLngBounds, i, i2, i3));
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    @RecentlyNonNull
    public static C4479a m27538d(@RecentlyNonNull LatLng latLng, float f) {
        C6378r.m20505l(latLng, "latLng must not be null");
        try {
            return new C4479a(m27536f().mo24330m1(latLng, f));
        } catch (RemoteException e) {
            throw new C5245f(e);
        }
    }

    public static void m27537e(@RecentlyNonNull AbstractC4987a aVar) {
        f14824a = (AbstractC4987a) C6378r.m20506k(aVar);
    }

    public static AbstractC4987a m27536f() {
        return (AbstractC4987a) C6378r.m20505l(f14824a, "CameraUpdateFactory is not initialized");
    }
}
