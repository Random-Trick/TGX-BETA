package e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;
import q0.c;

public class h {
    public static h f10426d;
    public final Context f10427a;
    public final LocationManager f10428b;
    public final a f10429c = new a();

    public static class a {
        public boolean f10430a;
        public long f10431b;
        public long f10432c;
        public long f10433d;
        public long f10434e;
        public long f10435f;
    }

    public h(Context context, LocationManager locationManager) {
        this.f10427a = context;
        this.f10428b = locationManager;
    }

    public static h a(Context context) {
        if (f10426d == null) {
            Context applicationContext = context.getApplicationContext();
            f10426d = new h(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f10426d;
    }

    @SuppressLint({"MissingPermission"})
    public final Location b() {
        Location location = null;
        Location c10 = c.b(this.f10427a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        if (c.b(this.f10427a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = c("gps");
        }
        return (location == null || c10 == null) ? location != null ? location : c10 : location.getTime() > c10.getTime() ? location : c10;
    }

    public final Location c(String str) {
        try {
            if (this.f10428b.isProviderEnabled(str)) {
                return this.f10428b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    public boolean d() {
        a aVar = this.f10429c;
        if (e()) {
            return aVar.f10430a;
        }
        Location b10 = b();
        if (b10 != null) {
            f(b10);
            return aVar.f10430a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }

    public final boolean e() {
        return this.f10429c.f10435f > System.currentTimeMillis();
    }

    public final void f(Location location) {
        long j10;
        a aVar = this.f10429c;
        long currentTimeMillis = System.currentTimeMillis();
        g b10 = g.b();
        b10.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j11 = b10.f10423a;
        b10.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = b10.f10425c == 1;
        long j12 = b10.f10424b;
        long j13 = b10.f10423a;
        boolean z11 = z10;
        b10.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j14 = b10.f10424b;
        if (j12 == -1 || j13 == -1) {
            j10 = 43200000 + currentTimeMillis;
        } else {
            j10 = (currentTimeMillis > j13 ? 0 + j14 : currentTimeMillis > j12 ? 0 + j13 : 0 + j12) + 60000;
        }
        aVar.f10430a = z11;
        aVar.f10431b = j11;
        aVar.f10432c = j12;
        aVar.f10433d = j13;
        aVar.f10434e = j14;
        aVar.f10435f = j10;
    }
}
