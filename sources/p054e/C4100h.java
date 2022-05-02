package p054e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;
import p227q0.C8127c;

public class C4100h {
    public static C4100h f13862d;
    public final Context f13863a;
    public final LocationManager f13864b;
    public final C4101a f13865c = new C4101a();

    public static class C4101a {
        public boolean f13866a;
        public long f13867b;
        public long f13868c;
        public long f13869d;
        public long f13870e;
        public long f13871f;
    }

    public C4100h(Context context, LocationManager locationManager) {
        this.f13863a = context;
        this.f13864b = locationManager;
    }

    public static C4100h m28915a(Context context) {
        if (f13862d == null) {
            Context applicationContext = context.getApplicationContext();
            f13862d = new C4100h(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f13862d;
    }

    @SuppressLint({"MissingPermission"})
    public final Location m28914b() {
        Location location = null;
        Location c = C8127c.m13409b(this.f13863a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m28913c("network") : null;
        if (C8127c.m13409b(this.f13863a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = m28913c("gps");
        }
        return (location == null || c == null) ? location != null ? location : c : location.getTime() > c.getTime() ? location : c;
    }

    public final Location m28913c(String str) {
        try {
            if (this.f13864b.isProviderEnabled(str)) {
                return this.f13864b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    public boolean m28912d() {
        C4101a aVar = this.f13865c;
        if (m28911e()) {
            return aVar.f13866a;
        }
        Location b = m28914b();
        if (b != null) {
            m28910f(b);
            return aVar.f13866a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }

    public final boolean m28911e() {
        return this.f13865c.f13871f > System.currentTimeMillis();
    }

    public final void m28910f(Location location) {
        long j;
        C4101a aVar = this.f13865c;
        long currentTimeMillis = System.currentTimeMillis();
        C4099g b = C4099g.m28916b();
        b.m28917a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = b.f13859a;
        b.m28917a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = b.f13861c == 1;
        long j3 = b.f13860b;
        long j4 = b.f13859a;
        boolean z2 = z;
        b.m28917a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j5 = b.f13860b;
        if (j3 == -1 || j4 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j4 ? 0 + j5 : currentTimeMillis > j3 ? 0 + j4 : 0 + j3) + 60000;
        }
        aVar.f13866a = z2;
        aVar.f13867b = j2;
        aVar.f13868c = j3;
        aVar.f13869d = j4;
        aVar.f13870e = j5;
        aVar.f13871f = j;
    }
}
