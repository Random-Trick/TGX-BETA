package tc;

import ae.j;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ce.a0;
import ce.j0;
import ce.v;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.LatLng;
import g6.g;
import g6.i;
import h6.c;
import he.i;
import j5.a;
import k5.f;
import k5.k;
import k5.l;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.c0;
import ne.f3;
import oc.v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.d1;
import ud.v4;

public class j2 extends FrameLayoutFix implements h6.e, c.f, c.AbstractC0116c, c.d, c.a, c.b, View.OnClickListener, ie.a {
    public f M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public Location R;
    public Location S;
    public MapView T;
    public ImageView U;
    public ImageView V;
    public c0 W;
    public h6.c f23208a0;
    public l2 f23209b0;
    public boolean f23210c0;
    public double f23211d0;
    public double f23212e0;
    public boolean f23213f0;
    public float f23214g0;
    public boolean f23215h0;
    public ValueAnimator f23216i0;
    public boolean f23217j0;
    public boolean f23218k0;
    public ValueAnimator f23219l0;
    public float f23220m0;
    public k5.f f23221n0;
    public boolean f23222o0;
    public boolean f23223p0;
    public kb.b f23224q0;
    public boolean f23225r0;

    public class a extends MapView {
        public a(Context context) {
            super(context);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                j2.this.C2();
            } else if (action == 1) {
                j2.this.E2();
            } else if (action == 2) {
                j2.this.D2();
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public class b extends c0 {
        public b(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return (motionEvent.getAction() != 0 || (getAlpha() != 0.0f && !j2.this.f23218k0)) && super.onTouchEvent(motionEvent);
        }
    }

    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            j2.this.f23215h0 = false;
            j2.this.f23216i0 = null;
        }
    }

    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            j2.this.f23218k0 = false;
            j2.this.f23219l0 = null;
        }
    }

    public class e extends kb.b {
        public e() {
        }

        @Override
        public void b() {
            boolean z10;
            if (j2.this.Q) {
                j2.this.setShowMyLocationButton(true);
                if (j2.this.M != null) {
                    f fVar = j2.this.M;
                    Location location = j2.this.S;
                    boolean z11 = j2.this.R != null;
                    boolean z12 = j2.this.O || j2.this.f23210c0;
                    if (j2.this.f23208a0 != null) {
                        j2 j2Var = j2.this;
                        if (!j2Var.r2(j2Var.f23208a0.c().f5692b)) {
                            z10 = false;
                            fVar.q1(location, true, z11, z12, z10);
                        }
                    }
                    z10 = true;
                    fVar.q1(location, true, z11, z12, z10);
                }
            }
        }
    }

    public interface f {
        void P5();

        void q1(Location location, boolean z10, boolean z11, boolean z12, boolean z13);
    }

    public j2(Context context) {
        super(context);
    }

    public static int m2(boolean z10) {
        int i10 = a0.i(150.0f);
        return z10 ? Math.max((a0.B() - d1.a3(false)) - a0.i(60.0f), i10) : i10;
    }

    public void s2(float f10, float f11, ValueAnimator valueAnimator) {
        setMyLocationButtonFactor(f10 + (f11 * db.b.a(valueAnimator)));
    }

    private void setCameraMoving(boolean z10) {
        if (this.f23213f0 != z10) {
            this.f23213f0 = z10;
            if (z10) {
                return;
            }
            if (this.O) {
                setUserMovingLocation(false);
            } else {
                T2();
            }
        }
    }

    private void setIgnoreMyLocation(boolean z10) {
        V2(z10, false);
    }

    private void setMyLocationButtonFactor(float f10) {
        if (this.f23220m0 != f10 && this.f23218k0) {
            this.f23220m0 = f10;
            this.W.setAlpha(f10);
        }
    }

    private void setPinFactor(float f10) {
        if (this.f23214g0 != f10 && this.f23215h0) {
            this.f23214g0 = f10;
            Y2();
        }
    }

    public void setShowMyLocationButton(boolean z10) {
        boolean z11 = z10 || this.f23223p0;
        if (this.f23217j0 != z11) {
            this.f23217j0 = z11;
            d2(z11 ? 1.0f : 0.0f);
        }
    }

    private void setUserMovingLocation(boolean z10) {
        if (this.O != z10) {
            this.O = z10;
            f2(z10 ? 1.0f : 0.0f);
            if (!this.O) {
                R2();
                T2();
                return;
            }
            j2();
            g2();
        }
    }

    public void t2(float f10, float f11, ValueAnimator valueAnimator) {
        setPinFactor(f10 + (f11 * db.b.a(valueAnimator)));
    }

    public void u2(j5.a aVar) {
        if (!this.f23222o0) {
            this.f23222o0 = true;
            i2(false, false);
        }
    }

    public void v2(boolean z10, boolean z11, i iVar) {
        Status a10 = iVar.a();
        int c10 = a10.c();
        if (c10 != 0) {
            if (c10 != 6) {
                this.f23209b0.setShowProgress(false);
                if (z10) {
                    l2();
                }
            } else if (!z10 || z11) {
                setShowMyLocationButton(true);
                this.f23223p0 = true;
            } else {
                try {
                    a10.g((org.thunderdog.challegram.a) getContext(), 103);
                } catch (Throwable unused) {
                }
            }
        } else if (z10) {
            if (!iVar.b().f()) {
                this.f23209b0.setShowProgress(false);
            }
            l2();
        }
    }

    public void z2() {
        try {
            this.T.b(null);
        } catch (Throwable unused) {
        }
        j0.d0(new Runnable() {
            @Override
            public final void run() {
                j2.this.y2();
            }
        });
    }

    public void A2() {
        int i10 = this.N;
        if ((i10 & 2) == 0) {
            this.N = i10 | 2;
            try {
                this.T.c();
            } catch (Throwable unused) {
            }
            k5.f fVar = this.f23221n0;
            if (fVar != null) {
                try {
                    fVar.e();
                } catch (Throwable unused2) {
                }
                this.f23221n0 = null;
            }
        }
    }

    public void B2() {
        i2(true, false);
    }

    public final void C2() {
        getParent().getParent().requestDisallowInterceptTouchEvent(true);
        h6.c cVar = this.f23208a0;
        if (cVar != null) {
            LatLng latLng = cVar.c().f5691a;
            this.f23211d0 = latLng.f5698a;
            this.f23212e0 = latLng.f5699b;
        }
    }

    public final void D2() {
        h6.c cVar;
        if (!this.O && (cVar = this.f23208a0) != null) {
            LatLng latLng = cVar.c().f5691a;
            if (latLng.f5698a != this.f23211d0 || latLng.f5699b != this.f23212e0) {
                setUserMovingLocation(true);
                setIgnoreMyLocation(true);
            }
        }
    }

    public final void E2() {
        T2();
        getParent().getParent().requestDisallowInterceptTouchEvent(false);
        if (this.O && !this.f23213f0) {
            setUserMovingLocation(false);
        }
    }

    public void F2() {
        int i10 = this.N;
        if ((i10 & 1) == 0) {
            int i11 = i10 | 1;
            this.N = i11;
            if ((i11 & 8) != 0) {
                J2();
            }
        }
    }

    public void G2(boolean z10) {
        this.f23209b0.setShowProgress(z10);
        if (z10) {
            this.f23223p0 = false;
            i2(true, false);
        }
    }

    public void I2() {
        int i10 = this.N;
        if ((i10 & 1) != 0) {
            int i11 = i10 & (-2);
            this.N = i11;
            if ((i11 & 4) != 0) {
                this.N = i11 & (-5);
                y2();
            } else if ((i11 & 8) != 0) {
                S2();
            }
        }
    }

    public final void J2() {
        try {
            this.T.d();
        } catch (Throwable unused) {
        }
        this.N &= -17;
    }

    @Override
    public void K3(int i10) {
        if (this.f23225r0) {
            setCameraMoving(true);
        } else {
            this.f23225r0 = true;
        }
    }

    public final void L2(double d10, double d11, float f10) {
        Location location = new Location("network");
        location.setLatitude(d10);
        location.setLongitude(d11);
        N2(location, f10);
    }

    public final void M2(Location location) {
        N2(location, k2());
    }

    @Override
    public void N() {
        h6.c cVar;
        if (this.O && (cVar = this.f23208a0) != null) {
            LatLng latLng = cVar.c().f5691a;
            Location location = new Location("network");
            location.setLatitude(latLng.f5698a);
            location.setLongitude(latLng.f5699b);
            this.S = location;
            setShowMyLocationButton(true);
            f fVar = this.M;
            if (fVar != null) {
                boolean z10 = false;
                boolean z11 = this.R != null;
                if (this.O || this.f23210c0) {
                    z10 = true;
                }
                fVar.q1(location, true, z11, z10, true);
            }
        }
    }

    public final void N2(Location location, float f10) {
        P2(location, f10);
        setShowMyLocationButton(this.f23210c0);
        f fVar = this.M;
        if (fVar != null) {
            boolean z10 = this.f23210c0;
            fVar.q1(location, z10, this.R != null, this.O || z10, false);
        }
    }

    public final void P2(Location location, float f10) {
        if (location != null) {
            this.S = location;
            if (!this.O && this.f23208a0 != null) {
                LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
                if (this.P) {
                    this.f23208a0.b((this.f23210c0 || !this.Q) ? h6.b.d(latLng, f10) : h6.b.b(latLng));
                    return;
                }
                this.P = true;
                this.f23208a0.g(h6.b.d(latLng, f10));
            }
        }
    }

    public final void R2() {
        g2();
        e eVar = new e();
        this.f23224q0 = eVar;
        postDelayed(eVar, 400L);
    }

    public final void S2() {
        int i10 = this.N;
        if ((i10 & 16) == 0) {
            this.N = i10 | 16;
            try {
                this.T.e();
            } catch (Throwable unused) {
            }
        }
    }

    public final void T2() {
        if (this.f23208a0 != null) {
            if (this.S == null) {
                Location location = new Location("network");
                this.S = location;
                location.setLatitude(this.f23208a0.c().f5691a.f5698a);
                this.S.setLongitude(this.f23208a0.c().f5691a.f5699b);
            }
            if (this.S != null) {
                he.i.c2().R5(this.S.getLatitude(), this.S.getLongitude(), this.f23208a0.c().f5692b);
            }
        }
    }

    public final void V2(boolean z10, boolean z11) {
        if (this.Q != z10 || z11) {
            this.Q = z10;
            if (!z10 && this.R != null) {
                g2();
                j2();
                M2(this.R);
                T2();
            }
        }
    }

    public void X2(double d10, double d11) {
        Location location = new Location("network");
        location.setLatitude(d10);
        location.setLongitude(d11);
        this.f23210c0 = true;
        setIgnoreMyLocation(true);
        N2(location, k2());
    }

    public final void Y2() {
        this.U.setTranslationY((-a0.i(10.0f)) * this.f23214g0);
        this.V.setAlpha(this.f23214g0);
    }

    @Override
    public void Z4(Location location) {
        this.R = location;
        if (location != null) {
            he.i.c2().Z3(location.getLatitude(), location.getLongitude(), location.getAccuracy());
        }
        if (!this.Q) {
            setShowMyLocationButton(false);
            M2(location);
            T2();
        }
    }

    @Override
    public void c4(h6.c cVar) {
        this.f23208a0 = cVar;
        this.U.setAlpha(1.0f);
        try {
            if (h2()) {
                cVar.j(true);
            }
        } catch (Throwable th) {
            Log.e("No access to Google Play Services", th, new Object[0]);
        }
        cVar.f().b(false);
        cVar.f().c(false);
        cVar.f().a(false);
        cVar.p(this);
        cVar.m(this);
        cVar.n(this);
        cVar.k(this);
        cVar.l(this);
        Location location = this.S;
        if (location == null) {
            Location b10 = c2.c().b();
            if (b10 != null) {
                M2(b10);
            } else {
                double d10 = 45.924197260584734d;
                double d11 = 6.870443522930145d;
                float e10 = cVar.e();
                i.j R1 = he.i.c2().R1();
                if (R1 != null) {
                    d10 = R1.f13860a;
                    d11 = R1.f13861b;
                    e10 = R1.f13862c;
                }
                L2(d10, d11, e10);
            }
        } else {
            M2(location);
        }
        S2();
    }

    public final void d2(float f10) {
        if (this.f23218k0) {
            this.f23218k0 = false;
            ValueAnimator valueAnimator = this.f23219l0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f23219l0 = null;
            }
        }
        if (this.f23220m0 != f10) {
            if (!isAttachedToWindow()) {
                this.f23220m0 = f10;
                this.W.setAlpha(f10);
                return;
            }
            this.f23218k0 = true;
            final float f11 = this.f23220m0;
            final float f12 = f10 - f11;
            ValueAnimator b10 = db.b.b();
            this.f23219l0 = b10;
            b10.setInterpolator(db.b.f7287b);
            this.f23219l0.setDuration(150L);
            this.f23219l0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    j2.this.s2(f11, f12, valueAnimator2);
                }
            });
            this.f23219l0.addListener(new d());
            this.f23219l0.start();
        }
    }

    public final void f2(float f10) {
        if (this.U == null) {
            this.f23214g0 = f10;
            return;
        }
        if (this.f23215h0) {
            this.f23215h0 = false;
            ValueAnimator valueAnimator = this.f23216i0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f23216i0 = null;
            }
        }
        final float f11 = this.f23214g0;
        if (f11 != f10) {
            this.f23215h0 = true;
            final float f12 = f10 - f11;
            ValueAnimator b10 = db.b.b();
            this.f23216i0 = b10;
            b10.setDuration(120L);
            this.f23216i0.setInterpolator(db.b.f7287b);
            this.f23216i0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    j2.this.t2(f11, f12, valueAnimator2);
                }
            });
            this.f23216i0.addListener(new c());
            this.f23216i0.start();
        }
    }

    public final void g2() {
        kb.b bVar = this.f23224q0;
        if (bVar != null) {
            bVar.c();
            this.f23224q0 = null;
        }
    }

    public Location getCurrentLocation() {
        return this.S;
    }

    public final boolean h2() {
        return Build.VERSION.SDK_INT < 23 || getContext().checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    public void i2(final boolean z10, final boolean z11) {
        if (j0.r(getContext()).o0(false) != 0) {
            this.f23209b0.setShowProgress(false);
            if (!z10 || z11) {
                setShowMyLocationButton(true);
            } else {
                ((org.thunderdog.challegram.a) getContext()).L2(false, false, this);
            }
        } else if (this.f23222o0) {
            this.f23209b0.setShowProgress(false);
            if (z10) {
                l2();
            }
        } else {
            try {
                if (this.f23221n0 == null) {
                    f.a aVar = new f.a(getContext());
                    aVar.a(g6.f.f12106a);
                    aVar.b(new f.c() {
                        @Override
                        public final void r(a aVar2) {
                            j2.this.u2(aVar2);
                        }
                    });
                    k5.f c10 = aVar.c();
                    this.f23221n0 = c10;
                    c10.d();
                }
                g6.f.f12109d.a(this.f23221n0, new g.a().a(LocationRequest.b()).c(true).b()).c(new l() {
                    @Override
                    public final void a(k kVar) {
                        j2.this.v2(z10, z11, (g6.i) kVar);
                    }
                });
            } catch (Throwable th) {
                Log.w("Error", th, new Object[0]);
                this.f23222o0 = true;
                i2(z10, z11);
            }
        }
    }

    public final void j2() {
        if (this.f23210c0) {
            this.f23210c0 = false;
            f fVar = this.M;
            if (fVar != null) {
                fVar.P5();
            }
        }
    }

    public final float k2() {
        h6.c cVar = this.f23208a0;
        if (cVar == null) {
            return -1.0f;
        }
        return cVar.d() - (this.f23210c0 ? 3.0f : 5.0f);
    }

    @Override
    public void l1(int i10, boolean z10) {
        if (z10) {
            i2(true, false);
        } else if (!v0.L2("android.permission.ACCESS_FINE_LOCATION")) {
            v.C();
        }
    }

    public final void l2() {
        V2(false, true);
    }

    @Override
    public void m1() {
        setCameraMoving(false);
    }

    public void n2(v4<?> v4Var, l2 l2Var, boolean z10) {
        this.f23209b0 = l2Var;
        int m22 = m2(z10);
        FrameLayout.LayoutParams q12 = FrameLayoutFix.q1(-1, m22 + 0);
        q12.topMargin = 0;
        a aVar = new a(getContext());
        this.T = aVar;
        aVar.setLayoutParams(q12);
        addView(this.T);
        ImageView imageView = new ImageView(getContext());
        this.V = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.V.setImageResource(R.drawable.baseline_close_18);
        this.V.setColorFilter(j.M(R.id.theme_color_icon, 1));
        this.V.setLayoutParams(FrameLayoutFix.r1(-2, -2, 17));
        addView(this.V);
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(-2, -2, 17);
        r12.bottomMargin = a0.i(18.0f);
        ImageView imageView2 = new ImageView(getContext());
        this.U = imageView2;
        imageView2.setImageResource(R.drawable.ic_map_pin_44);
        this.U.setLayoutParams(r12);
        this.U.setAlpha(0.0f);
        addView(this.U);
        Y2();
        int i10 = a0.i(4.0f);
        int i11 = i10 * 2;
        FrameLayout.LayoutParams r13 = FrameLayoutFix.r1(a0.i(40.0f) + i11, a0.i(40.0f) + i11, 85);
        r13.bottomMargin = a0.i(16.0f) - i10;
        r13.rightMargin = a0.i(16.0f) - i10;
        b bVar = new b(getContext());
        this.W = bVar;
        v4Var.t8(bVar);
        this.W.d(R.drawable.baseline_gps_fixed_24, 40.0f, 4.0f, R.id.theme_color_circleButtonOverlay, R.id.theme_color_circleButtonOverlayIcon);
        this.W.setId(R.id.btn_gps);
        this.W.setAlpha(0.0f);
        this.W.setOnClickListener(this);
        this.W.setLayoutParams(r13);
        if (Build.VERSION.SDK_INT < 23 || getContext().checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
            i2(false, false);
        } else {
            this.W.setAlpha(1.0f);
        }
        addView(this.W);
        f3 f3Var = new f3(getContext());
        f3Var.setSimpleTopShadow(true);
        FrameLayout.LayoutParams t12 = FrameLayoutFix.t1(f3Var.getLayoutParams());
        t12.gravity = 80;
        f3Var.setLayoutParams(t12);
        v4Var.t8(f3Var);
        addView(f3Var);
        setBackgroundColor(j.E0());
        v4Var.o8(this, R.id.theme_color_placeholder);
        setLayoutParams(FrameLayoutFix.r1(-1, m22, 48));
        gd.l.a().b(new Runnable() {
            @Override
            public final void run() {
                j2.this.z2();
            }
        });
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_gps) {
            i2(true, false);
        }
    }

    @Override
    public void p1() {
        setCameraMoving(false);
        T2();
    }

    public final void y2() {
        int i10 = this.N;
        if ((i10 & 2) == 0) {
            if ((i10 & 1) != 0) {
                this.N = i10 | 4;
                return;
            }
            this.N = i10 | 8;
            try {
                this.T.b(null);
                this.T.a(this);
            } catch (Throwable unused) {
            }
        }
    }

    public final boolean r2(float f10) {
        h6.c cVar = this.f23208a0;
        return cVar == null || f10 < cVar.d() - 10.0f;
    }

    public void setCallback(f fVar) {
        this.M = fVar;
    }
}
