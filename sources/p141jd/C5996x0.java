package p141jd;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import be.C1379j0;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import ge.C4868i;
import nc.C7389v0;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import p067ed.C4183a;
import p075f6.AbstractC4278d;
import p075f6.C4274b;
import p075f6.C4282f;
import p075f6.C4284g;
import p075f6.C4287h;
import p111he.AbstractC5096a;
import p133j5.AbstractC5867f;
import p133j5.C5861b;
import p133j5.C5874i;
import p139jb.AbstractRunnableC5910b;
import p177m6.AbstractC6763f;
import p177m6.AbstractC6775l;
import td.AbstractC9142a;

public class C5996x0 implements AbstractC9142a {
    public final boolean f19093M;
    public AbstractC6004h f19094N;
    public String f19095O;
    public long f19096P;
    public boolean[] f19097Q;
    public AbstractC5867f f19098R;
    public final Context f19099a;
    public final AbstractC6003g f19100b;
    public final boolean f19101c;

    public class C5997a implements AbstractC6003g {
        public final AbstractC6002f f19102a;

        public C5997a(AbstractC6002f fVar) {
            this.f19102a = fVar;
        }

        @Override
        public void mo4376V3(C5996x0 x0Var, String str, Location location) {
            x0Var.m21593k();
            this.f19102a.mo11689a(0, location);
        }

        @Override
        public void mo4362n5(C5996x0 x0Var, int i, String str, Location location) {
            x0Var.m21593k();
            this.f19102a.mo11689a(i, location);
        }
    }

    public class C5998b extends AbstractC4278d {
        public final AbstractRunnableC5910b[] f19103a;
        public final boolean[] f19104b;
        public final C4274b f19105c;

        public C5998b(AbstractRunnableC5910b[] bVarArr, boolean[] zArr, C4274b bVar) {
            this.f19103a = bVarArr;
            this.f19104b = zArr;
            this.f19105c = bVar;
        }

        @Override
        public void mo21578a(LocationAvailability locationAvailability) {
            if (!locationAvailability.m30354b()) {
                this.f19103a[0].m21857c();
                boolean[] zArr = this.f19104b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    C5996x0.this.m21587q(-1);
                }
                try {
                    this.f19105c.m28307u(this);
                } catch (Throwable unused) {
                }
            }
        }

        @Override
        public void mo21577b(LocationResult locationResult) {
            this.f19103a[0].m21857c();
            boolean[] zArr = this.f19104b;
            if (!zArr[0]) {
                zArr[0] = true;
                C5996x0.this.m21588p(locationResult.m30345b());
            }
            try {
                this.f19105c.m28307u(this);
            } catch (Throwable unused) {
            }
        }
    }

    public class C5999c extends AbstractRunnableC5910b {
        public final boolean[] f19107M;
        public final C4274b f19108N;
        public final AbstractC4278d f19109O;

        public C5999c(boolean[] zArr, C4274b bVar, AbstractC4278d dVar) {
            this.f19107M = zArr;
            this.f19108N = bVar;
            this.f19109O = dVar;
        }

        @Override
        public void mo1364b() {
            boolean[] zArr = this.f19107M;
            if (!zArr[0]) {
                zArr[0] = true;
                try {
                    this.f19108N.m28307u(this.f19109O);
                } catch (Throwable unused) {
                }
                Location location = null;
                try {
                    location = this.f19108N.m28308t().mo19069l();
                } catch (SecurityException unused2) {
                } catch (Throwable th) {
                    Log.m14710w("getLastLocation error", th, new Object[0]);
                }
                if (location == null && C5996x0.this.f19101c) {
                    location = C7389v0.m16749C0(C5996x0.this.f19099a, false);
                }
                if (location != null) {
                    C5996x0.this.m21588p(location);
                } else {
                    C5996x0.this.m21587q(-3);
                }
            }
        }
    }

    public class C6000d implements LocationListener {
        public final AbstractRunnableC5910b[] f19111a;
        public final LocationManager f19112b;
        public final boolean[] f19113c;

        public C6000d(AbstractRunnableC5910b[] bVarArr, LocationManager locationManager, boolean[] zArr) {
            this.f19111a = bVarArr;
            this.f19112b = locationManager;
            this.f19113c = zArr;
        }

        @Override
        public void onLocationChanged(Location location) {
            this.f19111a[0].m21857c();
            try {
                this.f19112b.removeUpdates(this);
            } catch (SecurityException unused) {
            } catch (Throwable th) {
                Log.m14725e("LocationManager.removeUpdates filed. Probable resource leak", th, new Object[0]);
            }
            boolean[] zArr = this.f19113c;
            if (!zArr[0]) {
                zArr[0] = true;
                C5996x0.this.m21588p(location);
            }
        }

        @Override
        public void onProviderDisabled(String str) {
        }

        @Override
        public void onProviderEnabled(String str) {
        }

        @Override
        public void onStatusChanged(String str, int i, Bundle bundle) {
        }
    }

    public class C6001e extends AbstractRunnableC5910b {
        public final boolean[] f19115M;

        public C6001e(boolean[] zArr) {
            this.f19115M = zArr;
        }

        @Override
        public void mo1364b() {
            boolean[] zArr = this.f19115M;
            if (!zArr[0]) {
                zArr[0] = true;
                Location C0 = C5996x0.this.f19101c ? C7389v0.m16749C0(C5996x0.this.f19099a, true) : null;
                if (C0 != null) {
                    C5996x0.this.m21588p(C0);
                } else {
                    C5996x0.this.m21587q(-3);
                }
            }
        }
    }

    public interface AbstractC6002f {
        void mo11689a(int i, Location location);
    }

    public interface AbstractC6003g {
        void mo4376V3(C5996x0 x0Var, String str, Location location);

        void mo4362n5(C5996x0 x0Var, int i, String str, Location location);
    }

    public interface AbstractC6004h {
        void mo21576a(boolean z, Runnable runnable, AbstractC5096a aVar);
    }

    public C5996x0(Context context, AbstractC6003g gVar, boolean z, boolean z2) {
        this.f19099a = context;
        this.f19100b = gVar;
        this.f19101c = z;
        this.f19093M = z2;
    }

    public static int m21594j(Context context, boolean z) {
        String[] strArr;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            if (i < 29 || !C4183a.f14101s || !z) {
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

    public static Location m21592l(Context context, boolean z) {
        C4868i.C4878j b1 = C4868i.m24726c2().m24735b1();
        if (b1 == null) {
            return null;
        }
        Location location = new Location("network");
        location.setLatitude(b1.f16678a);
        location.setLongitude(b1.f16679b);
        location.setAccuracy(b1.f16680c);
        return location;
    }

    public void m21591m() {
        m21587q(-5);
    }

    public void m21590n(boolean[] zArr, AbstractView$OnTouchListenerC7889a aVar, boolean z, boolean z2, int i, boolean z3) {
        if (!zArr[0]) {
            if (z3) {
                m21583v(aVar, true, z, z2);
            } else {
                m21587q(-1);
            }
        }
    }

    public void m21589o(boolean[] zArr, boolean z, boolean z2, Context context, AbstractC6775l lVar) {
        if (!zArr[0]) {
            boolean z3 = true;
            try {
                C4287h hVar = (C4287h) lVar.mo19068m(C5861b.class);
                if (z) {
                    m21588p(null);
                } else {
                    m21586r(zArr, true);
                }
            } catch (C5861b e) {
                if (e.m21928b() == 6) {
                    if (!z2) {
                        m21587q(-1);
                        return;
                    }
                    try {
                        AbstractView$OnTouchListenerC7889a r = C1379j0.m37307r(context);
                        r.m14453p2(106, this);
                        ((C5874i) e).m21898c(r, 106);
                        z3 = false;
                    } catch (Throwable unused) {
                    }
                }
                if (!z3) {
                    return;
                }
                if (z) {
                    m21587q(-1);
                } else {
                    m21586r(zArr, false);
                }
            }
        }
    }

    public static C5996x0 m21580y(AbstractView$OnTouchListenerC7889a aVar, long j, boolean z, boolean z2, AbstractC6002f fVar) {
        C5996x0 x0Var = new C5996x0(aVar, new C5997a(fVar), true, z2);
        x0Var.m21585s("", null, j, z);
        return x0Var;
    }

    public void m21596h() {
        this.f19095O = null;
        this.f19096P = 0L;
        boolean[] zArr = this.f19097Q;
        if (zArr != null) {
            zArr[0] = true;
        }
    }

    public void m21595i(String str, AbstractView$OnTouchListenerC7889a aVar) {
        this.f19095O = str;
        this.f19096P = -1L;
        boolean[] zArr = this.f19097Q;
        if (zArr != null) {
            zArr[0] = true;
        }
        if (aVar == null) {
            aVar = C1379j0.m37307r(this.f19099a);
        }
        m21583v(aVar, true, true, false);
    }

    public void m21593k() {
        AbstractC5867f fVar = this.f19098R;
        if (fVar != null) {
            try {
                fVar.mo21088e();
            } catch (Throwable unused) {
            }
            this.f19098R = null;
        }
    }

    public final void m21588p(Location location) {
        Log.m14714v("Location successfully received", new Object[0]);
        String str = this.f19095O;
        if (str == null) {
            return;
        }
        if (location != null) {
            C4868i.m24726c2().m24748Z3(location.getLatitude(), location.getLongitude(), location.getAccuracy());
            this.f19100b.mo4376V3(this, this.f19095O, location);
            return;
        }
        this.f19100b.mo4376V3(this, str, null);
    }

    public final void m21587q(int i) {
        Log.m14714v("Location receive failure, code: %d", Integer.valueOf(i));
        if (this.f19095O != null) {
            this.f19100b.mo4362n5(this, i, this.f19095O, this.f19101c ? m21592l(this.f19099a, false) : null);
        }
    }

    public final void m21586r(boolean[] zArr, boolean z) {
        if (z) {
            m21582w(zArr);
        } else {
            m21581x(zArr);
        }
    }

    public void m21585s(String str, AbstractView$OnTouchListenerC7889a aVar, long j, boolean z) {
        m21584u(str, aVar, j, z, false);
    }

    @Override
    public void mo10182t(int i, int i2, Intent intent) {
        boolean[] zArr;
        if (i == 106 && (zArr = this.f19097Q) != null && !zArr[0]) {
            if (i2 == -1) {
                m21586r(zArr, true);
            } else {
                m21587q(-2);
            }
        }
    }

    public void m21584u(String str, AbstractView$OnTouchListenerC7889a aVar, long j, boolean z, boolean z2) {
        this.f19095O = str;
        this.f19096P = j;
        boolean[] zArr = this.f19097Q;
        if (zArr != null) {
            zArr[0] = true;
        }
        if (aVar == null) {
            aVar = C1379j0.m37307r(this.f19099a);
        }
        m21583v(aVar, z, false, z2);
    }

    public final void m21583v(final AbstractView$OnTouchListenerC7889a aVar, final boolean z, final boolean z2, final boolean z3) {
        final boolean[] zArr = new boolean[1];
        this.f19097Q = zArr;
        final AbstractView$OnTouchListenerC7889a aVar2 = aVar != null ? aVar : this.f19099a;
        if (Build.VERSION.SDK_INT < 23 || m21594j(aVar2, this.f19093M) == 0) {
            try {
                if (this.f19098R == null) {
                    AbstractC5867f.C5868a aVar3 = new AbstractC5867f.C5868a(aVar2);
                    aVar3.m21905a(C4282f.f14330a);
                    AbstractC5867f c = aVar3.m21903c();
                    this.f19098R = c;
                    c.mo21089d();
                }
                C4282f.m28301b(aVar2).m28288t(new C4284g.C4285a().m28299a(LocationRequest.m30353b()).m28297c(true).m28298b()).mo19078c(new AbstractC6763f() {
                    @Override
                    public final void mo10608a(AbstractC6775l lVar) {
                        C5996x0.this.m21589o(zArr, z2, z, aVar2, lVar);
                    }
                });
            } catch (Throwable unused) {
                if (z2) {
                    m21587q(-4);
                } else {
                    m21586r(zArr, false);
                }
            }
        } else if (!z) {
            m21587q(-1);
        } else if (aVar != null) {
            Runnable v0Var = new Runnable() {
                @Override
                public final void run() {
                    C5996x0.this.m21591m();
                }
            };
            AbstractC5096a u0Var = new AbstractC5096a() {
                @Override
                public final void mo4252o1(int i, boolean z4) {
                    C5996x0.this.m21590n(zArr, aVar, z2, z3, i, z4);
                }
            };
            AbstractC6004h hVar = this.f19094N;
            if (hVar != null) {
                hVar.mo21576a(z3, v0Var, u0Var);
            } else {
                aVar.m14565L2(this.f19093M, z3, v0Var, u0Var);
            }
        }
    }

    public final void m21582w(boolean[] zArr) {
        if (!zArr[0]) {
            if (m21594j(this.f19099a, this.f19093M) != 0) {
                m21587q(-1);
                return;
            }
            C4274b a = C4282f.m28302a(this.f19099a);
            C5998b bVar = new C5998b(r3, zArr, a);
            AbstractRunnableC5910b[] bVarArr = {new C5999c(zArr, a, bVar)};
            bVarArr[0].m21855e(C1379j0.m37313o());
            long j = this.f19096P;
            if (j != -1) {
                C1379j0.m37332e0(bVarArr[0], j);
            }
            try {
                LocationRequest e = LocationRequest.m30353b().m30348g(C1379j0.m37350R() ? 100 : 102).m30349f(1).m30350e(5000L);
                long j2 = this.f19096P;
                if (j2 != -1) {
                    e.m30351d(j2);
                }
                a.m28306v(e, bVar, Looper.getMainLooper());
            } catch (Throwable unused) {
                zArr[0] = true;
                boolean[] zArr2 = new boolean[1];
                this.f19097Q = zArr2;
                m21581x(zArr2);
            }
        }
    }

    public final void m21581x(boolean[] zArr) {
        if (!zArr[0]) {
            if (m21594j(this.f19099a, this.f19093M) != 0) {
                m21587q(-1);
                return;
            }
            try {
                LocationManager locationManager = (LocationManager) this.f19099a.getSystemService("location");
                if (locationManager == null) {
                    m21587q(-4);
                    return;
                }
                C6000d dVar = new C6000d(r5, locationManager, zArr);
                AbstractRunnableC5910b[] bVarArr = {new C6001e(zArr)};
                C1379j0.m37332e0(bVarArr[0], this.f19096P);
                locationManager.requestLocationUpdates("gps", 1L, 0.0f, dVar);
                locationManager.requestLocationUpdates("network", 1L, 0.0f, dVar);
            } catch (SecurityException unused) {
                zArr[0] = true;
                m21587q(-1);
            } catch (Throwable th) {
                zArr[0] = true;
                Log.m14710w("Error occurred", th, new Object[0]);
                m21587q(-4);
            }
        }
    }

    public void m21579z(AbstractC6004h hVar) {
        this.f19094N = hVar;
    }
}
