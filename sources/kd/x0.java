package kd;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import ce.j0;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import g6.g;
import he.i;
import k5.f;
import n6.l;
import oc.v0;
import org.thunderdog.challegram.Log;

public class x0 implements ud.a {
    public final boolean M;
    public h N;
    public String O;
    public long P;
    public boolean[] Q;
    public k5.f R;
    public final Context f15931a;
    public final g f15932b;
    public final boolean f15933c;

    public class a implements g {
        public final f f15934a;

        public a(f fVar) {
            this.f15934a = fVar;
        }

        @Override
        public void S4(x0 x0Var, String str, Location location) {
            x0Var.k();
            this.f15934a.a(0, location);
        }

        @Override
        public void l4(x0 x0Var, int i10, String str, Location location) {
            x0Var.k();
            this.f15934a.a(i10, location);
        }
    }

    public class b extends g6.d {
        public final kb.b[] f15935a;
        public final boolean[] f15936b;
        public final g6.b f15937c;

        public b(kb.b[] bVarArr, boolean[] zArr, g6.b bVar) {
            this.f15935a = bVarArr;
            this.f15936b = zArr;
            this.f15937c = bVar;
        }

        @Override
        public void a(LocationAvailability locationAvailability) {
            if (!locationAvailability.b()) {
                this.f15935a[0].c();
                boolean[] zArr = this.f15936b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    x0.this.q(-1);
                }
                try {
                    this.f15937c.u(this);
                } catch (Throwable unused) {
                }
            }
        }

        @Override
        public void b(LocationResult locationResult) {
            this.f15935a[0].c();
            boolean[] zArr = this.f15936b;
            if (!zArr[0]) {
                zArr[0] = true;
                x0.this.p(locationResult.b());
            }
            try {
                this.f15937c.u(this);
            } catch (Throwable unused) {
            }
        }
    }

    public class c extends kb.b {
        public final boolean[] M;
        public final g6.b N;
        public final g6.d O;

        public c(boolean[] zArr, g6.b bVar, g6.d dVar) {
            this.M = zArr;
            this.N = bVar;
            this.O = dVar;
        }

        @Override
        public void b() {
            boolean[] zArr = this.M;
            if (!zArr[0]) {
                zArr[0] = true;
                try {
                    this.N.u(this.O);
                } catch (Throwable unused) {
                }
                Location location = null;
                try {
                    location = this.N.t().l();
                } catch (SecurityException unused2) {
                } catch (Throwable th) {
                    Log.w("getLastLocation error", th, new Object[0]);
                }
                if (location == null && x0.this.f15933c) {
                    location = v0.C0(x0.this.f15931a, false);
                }
                if (location != null) {
                    x0.this.p(location);
                } else {
                    x0.this.q(-3);
                }
            }
        }
    }

    public class d implements LocationListener {
        public final kb.b[] f15939a;
        public final LocationManager f15940b;
        public final boolean[] f15941c;

        public d(kb.b[] bVarArr, LocationManager locationManager, boolean[] zArr) {
            this.f15939a = bVarArr;
            this.f15940b = locationManager;
            this.f15941c = zArr;
        }

        @Override
        public void onLocationChanged(Location location) {
            this.f15939a[0].c();
            try {
                this.f15940b.removeUpdates(this);
            } catch (SecurityException unused) {
            } catch (Throwable th) {
                Log.e("LocationManager.removeUpdates filed. Probable resource leak", th, new Object[0]);
            }
            boolean[] zArr = this.f15941c;
            if (!zArr[0]) {
                zArr[0] = true;
                x0.this.p(location);
            }
        }

        @Override
        public void onProviderDisabled(String str) {
        }

        @Override
        public void onProviderEnabled(String str) {
        }

        @Override
        public void onStatusChanged(String str, int i10, Bundle bundle) {
        }
    }

    public class e extends kb.b {
        public final boolean[] M;

        public e(boolean[] zArr) {
            this.M = zArr;
        }

        @Override
        public void b() {
            boolean[] zArr = this.M;
            if (!zArr[0]) {
                zArr[0] = true;
                Location C0 = x0.this.f15933c ? v0.C0(x0.this.f15931a, true) : null;
                if (C0 != null) {
                    x0.this.p(C0);
                } else {
                    x0.this.q(-3);
                }
            }
        }
    }

    public interface f {
        void a(int i10, Location location);
    }

    public interface g {
        void S4(x0 x0Var, String str, Location location);

        void l4(x0 x0Var, int i10, String str, Location location);
    }

    public interface h {
        void a(boolean z10, Runnable runnable, ie.a aVar);
    }

    public x0(Context context, g gVar, boolean z10, boolean z11) {
        this.f15931a = context;
        this.f15932b = gVar;
        this.f15933c = z10;
        this.M = z11;
    }

    public static int j(Context context, boolean z10) {
        String[] strArr;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            if (i10 < 29 || !fd.a.f11897s || !z10) {
                strArr = new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
            } else {
                strArr = new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
            }
            for (String str : strArr) {
                int checkSelfPermission = context.checkSelfPermission(str);
                if (checkSelfPermission != 0) {
                    return checkSelfPermission;
                }
            }
        }
        return 0;
    }

    public static Location l(Context context, boolean z10) {
        i.j b12 = i.c2().b1();
        if (b12 == null) {
            return null;
        }
        Location location = new Location("network");
        location.setLatitude(b12.f13860a);
        location.setLongitude(b12.f13861b);
        location.setAccuracy(b12.f13862c);
        return location;
    }

    public void m() {
        q(-5);
    }

    public void n(boolean[] zArr, org.thunderdog.challegram.a aVar, boolean z10, boolean z11, int i10, boolean z12) {
        if (!zArr[0]) {
            if (z12) {
                v(aVar, true, z10, z11);
            } else {
                q(-1);
            }
        }
    }

    public void o(boolean[] zArr, boolean z10, boolean z11, Context context, l lVar) {
        if (!zArr[0]) {
            boolean z12 = true;
            try {
                g6.h hVar = (g6.h) lVar.m(k5.b.class);
                if (z10) {
                    p(null);
                } else {
                    r(zArr, true);
                }
            } catch (k5.b e10) {
                if (e10.b() == 6) {
                    if (!z11) {
                        q(-1);
                        return;
                    }
                    try {
                        org.thunderdog.challegram.a r10 = j0.r(context);
                        r10.q2(106, this);
                        ((k5.i) e10).c(r10, 106);
                        z12 = false;
                    } catch (Throwable unused) {
                    }
                }
                if (!z12) {
                    return;
                }
                if (z10) {
                    q(-1);
                } else {
                    r(zArr, false);
                }
            }
        }
    }

    public static x0 y(org.thunderdog.challegram.a aVar, long j10, boolean z10, boolean z11, f fVar) {
        x0 x0Var = new x0(aVar, new a(fVar), true, z11);
        x0Var.s("", null, j10, z10);
        return x0Var;
    }

    public void h() {
        this.O = null;
        this.P = 0L;
        boolean[] zArr = this.Q;
        if (zArr != null) {
            zArr[0] = true;
        }
    }

    public void i(String str, org.thunderdog.challegram.a aVar) {
        this.O = str;
        this.P = -1L;
        boolean[] zArr = this.Q;
        if (zArr != null) {
            zArr[0] = true;
        }
        if (aVar == null) {
            aVar = j0.r(this.f15931a);
        }
        v(aVar, true, true, false);
    }

    public void k() {
        k5.f fVar = this.R;
        if (fVar != null) {
            try {
                fVar.e();
            } catch (Throwable unused) {
            }
            this.R = null;
        }
    }

    public final void p(Location location) {
        Log.v("Location successfully received", new Object[0]);
        String str = this.O;
        if (str == null) {
            return;
        }
        if (location != null) {
            i.c2().Z3(location.getLatitude(), location.getLongitude(), location.getAccuracy());
            this.f15932b.S4(this, this.O, location);
            return;
        }
        this.f15932b.S4(this, str, null);
    }

    public final void q(int i10) {
        Log.v("Location receive failure, code: %d", Integer.valueOf(i10));
        if (this.O != null) {
            this.f15932b.l4(this, i10, this.O, this.f15933c ? l(this.f15931a, false) : null);
        }
    }

    public final void r(boolean[] zArr, boolean z10) {
        if (z10) {
            w(zArr);
        } else {
            x(zArr);
        }
    }

    public void s(String str, org.thunderdog.challegram.a aVar, long j10, boolean z10) {
        t(str, aVar, j10, z10, false);
    }

    public void t(String str, org.thunderdog.challegram.a aVar, long j10, boolean z10, boolean z11) {
        this.O = str;
        this.P = j10;
        boolean[] zArr = this.Q;
        if (zArr != null) {
            zArr[0] = true;
        }
        if (aVar == null) {
            aVar = j0.r(this.f15931a);
        }
        v(aVar, z10, false, z11);
    }

    @Override
    public void u(int i10, int i11, Intent intent) {
        boolean[] zArr;
        if (i10 == 106 && (zArr = this.Q) != null && !zArr[0]) {
            if (i11 == -1) {
                r(zArr, true);
            } else {
                q(-2);
            }
        }
    }

    public final void v(final org.thunderdog.challegram.a aVar, final boolean z10, final boolean z11, final boolean z12) {
        final boolean[] zArr = new boolean[1];
        this.Q = zArr;
        final org.thunderdog.challegram.a aVar2 = aVar != null ? aVar : this.f15931a;
        if (Build.VERSION.SDK_INT < 23 || j(aVar2, this.M) == 0) {
            try {
                if (this.R == null) {
                    f.a aVar3 = new f.a(aVar2);
                    aVar3.a(g6.f.f12106a);
                    k5.f c10 = aVar3.c();
                    this.R = c10;
                    c10.d();
                }
                g6.f.b(aVar2).t(new g.a().a(LocationRequest.b()).c(true).b()).c(new n6.f() {
                    @Override
                    public final void a(l lVar) {
                        x0.this.o(zArr, z11, z10, aVar2, lVar);
                    }
                });
            } catch (Throwable unused) {
                if (z11) {
                    q(-4);
                } else {
                    r(zArr, false);
                }
            }
        } else if (!z10) {
            q(-1);
        } else if (aVar != null) {
            Runnable v0Var = new Runnable() {
                @Override
                public final void run() {
                    x0.this.m();
                }
            };
            ie.a u0Var = new ie.a() {
                @Override
                public final void l1(int i10, boolean z13) {
                    x0.this.n(zArr, aVar, z11, z12, i10, z13);
                }
            };
            h hVar = this.N;
            if (hVar != null) {
                hVar.a(z12, v0Var, u0Var);
            } else {
                aVar.M2(this.M, z12, v0Var, u0Var);
            }
        }
    }

    public final void w(boolean[] zArr) {
        if (!zArr[0]) {
            if (j(this.f15931a, this.M) != 0) {
                q(-1);
                return;
            }
            g6.b a10 = g6.f.a(this.f15931a);
            b bVar = new b(r3, zArr, a10);
            kb.b[] bVarArr = {new c(zArr, a10, bVar)};
            bVarArr[0].e(j0.o());
            long j10 = this.P;
            if (j10 != -1) {
                j0.e0(bVarArr[0], j10);
            }
            try {
                LocationRequest e10 = LocationRequest.b().g(j0.R() ? 100 : 102).f(1).e(5000L);
                long j11 = this.P;
                if (j11 != -1) {
                    e10.d(j11);
                }
                a10.v(e10, bVar, Looper.getMainLooper());
            } catch (Throwable unused) {
                zArr[0] = true;
                boolean[] zArr2 = new boolean[1];
                this.Q = zArr2;
                x(zArr2);
            }
        }
    }

    public final void x(boolean[] zArr) {
        if (!zArr[0]) {
            if (j(this.f15931a, this.M) != 0) {
                q(-1);
                return;
            }
            try {
                LocationManager locationManager = (LocationManager) this.f15931a.getSystemService("location");
                if (locationManager == null) {
                    q(-4);
                    return;
                }
                d dVar = new d(r5, locationManager, zArr);
                kb.b[] bVarArr = {new e(zArr)};
                j0.e0(bVarArr[0], this.P);
                locationManager.requestLocationUpdates("gps", 1L, 0.0f, dVar);
                locationManager.requestLocationUpdates("network", 1L, 0.0f, dVar);
            } catch (SecurityException unused) {
                zArr[0] = true;
                q(-1);
            } catch (Throwable th) {
                zArr[0] = true;
                Log.w("Error occurred", th, new Object[0]);
                q(-4);
            }
        }
    }

    public void z(h hVar) {
        this.N = hVar;
    }
}
