package sc;

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
import be.C1357a0;
import be.C1379j0;
import be.C1405v;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.LatLng;
import ge.C4868i;
import me.C6851c0;
import me.C6879f3;
import me.vkryl.android.widget.FrameLayoutFix;
import nc.C7389v0;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p075f6.C4282f;
import p075f6.C4284g;
import p075f6.C4289i;
import p082fd.C4383l;
import p091g6.AbstractC4489e;
import p091g6.C4480b;
import p091g6.C4481c;
import p111he.AbstractC5096a;
import p118i5.C5217a;
import p133j5.AbstractC5867f;
import p133j5.AbstractC5876k;
import p133j5.AbstractC5877l;
import p139jb.AbstractRunnableC5910b;
import p364zd.C11524j;
import td.AbstractC9323v4;
import td.View$OnClickListenerC9170d1;

public class View$OnClickListenerC8785j2 extends FrameLayoutFix implements AbstractC4489e, C4481c.AbstractC4487f, C4481c.AbstractC4484c, C4481c.AbstractC4485d, C4481c.AbstractC4482a, C4481c.AbstractC4483b, View.OnClickListener, AbstractC5096a {
    public AbstractC8791f f28345M;
    public int f28346N;
    public boolean f28347O;
    public boolean f28348P;
    public boolean f28349Q;
    public Location f28350R;
    public Location f28351S;
    public MapView f28352T;
    public ImageView f28353U;
    public ImageView f28354V;
    public C6851c0 f28355W;
    public C4481c f28356a0;
    public C8799l2 f28357b0;
    public boolean f28358c0;
    public double f28359d0;
    public double f28360e0;
    public boolean f28361f0;
    public float f28362g0;
    public boolean f28363h0;
    public ValueAnimator f28364i0;
    public boolean f28365j0;
    public boolean f28366k0;
    public ValueAnimator f28367l0;
    public float f28368m0;
    public AbstractC5867f f28369n0;
    public boolean f28370o0;
    public boolean f28371p0;
    public AbstractRunnableC5910b f28372q0;
    public boolean f28373r0;

    public class C8786a extends MapView {
        public C8786a(Context context) {
            super(context);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                View$OnClickListenerC8785j2.this.m11404G2();
            } else if (action == 1) {
                View$OnClickListenerC8785j2.this.m11400J2();
            } else if (action == 2) {
                View$OnClickListenerC8785j2.this.m11403H2();
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public class C8787b extends C6851c0 {
        public C8787b(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return (motionEvent.getAction() != 0 || (getAlpha() != 0.0f && !View$OnClickListenerC8785j2.this.f28366k0)) && super.onTouchEvent(motionEvent);
        }
    }

    public class C8788c extends AnimatorListenerAdapter {
        public C8788c() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            View$OnClickListenerC8785j2.this.f28363h0 = false;
            View$OnClickListenerC8785j2.this.f28364i0 = null;
        }
    }

    public class C8789d extends AnimatorListenerAdapter {
        public C8789d() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            View$OnClickListenerC8785j2.this.f28366k0 = false;
            View$OnClickListenerC8785j2.this.f28367l0 = null;
        }
    }

    public class C8790e extends AbstractRunnableC5910b {
        public C8790e() {
        }

        @Override
        public void mo1364b() {
            boolean z;
            if (View$OnClickListenerC8785j2.this.f28349Q) {
                View$OnClickListenerC8785j2.this.setShowMyLocationButton(true);
                if (View$OnClickListenerC8785j2.this.f28345M != null) {
                    AbstractC8791f fVar = View$OnClickListenerC8785j2.this.f28345M;
                    Location location = View$OnClickListenerC8785j2.this.f28351S;
                    boolean z2 = View$OnClickListenerC8785j2.this.f28350R != null;
                    boolean z3 = View$OnClickListenerC8785j2.this.f28347O || View$OnClickListenerC8785j2.this.f28358c0;
                    if (View$OnClickListenerC8785j2.this.f28356a0 != null) {
                        View$OnClickListenerC8785j2 j2Var = View$OnClickListenerC8785j2.this;
                        if (!j2Var.m11352v2(j2Var.f28356a0.m27533c().f11668b)) {
                            z = false;
                            fVar.mo11347s1(location, true, z2, z3, z);
                        }
                    }
                    z = true;
                    fVar.mo11347s1(location, true, z2, z3, z);
                }
            }
        }
    }

    public interface AbstractC8791f {
        void mo11348S5();

        void mo11347s1(Location location, boolean z, boolean z2, boolean z3, boolean z4);
    }

    public View$OnClickListenerC8785j2(Context context) {
        super(context);
    }

    public void m11414A2(boolean z, boolean z2, C4289i iVar) {
        Status a = iVar.mo952a();
        int c = a.m30396c();
        if (c != 0) {
            if (c != 6) {
                this.f28357b0.setShowProgress(false);
                if (z) {
                    m11357p2();
                }
            } else if (!z || z2) {
                setShowMyLocationButton(true);
                this.f28371p0 = true;
            } else {
                try {
                    a.m30392g((AbstractView$OnTouchListenerC7889a) getContext(), 103);
                } catch (Throwable unused) {
                }
            }
        } else if (z) {
            if (!iVar.m28296b().m28291f()) {
                this.f28357b0.setShowProgress(false);
            }
            m11357p2();
        }
    }

    public void m11411C2() {
        try {
            this.f28352T.m30317b(null);
        } catch (Throwable unused) {
        }
        C1379j0.m37334d0(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC8785j2.this.m11413B2();
            }
        });
    }

    public static int m11355r2(boolean z) {
        int i = C1357a0.m37541i(150.0f);
        return z ? Math.max((C1357a0.m37553B() - View$OnClickListenerC9170d1.m10066c3(false)) - C1357a0.m37541i(60.0f), i) : i;
    }

    private void setCameraMoving(boolean z) {
        if (this.f28361f0 != z) {
            this.f28361f0 = z;
            if (z) {
                return;
            }
            if (this.f28347O) {
                setUserMovingLocation(false);
            } else {
                m11377V2();
            }
        }
    }

    private void setIgnoreMyLocation(boolean z) {
        m11374X2(z, false);
    }

    private void setMyLocationButtonFactor(float f) {
        if (this.f28368m0 != f && this.f28366k0) {
            this.f28368m0 = f;
            this.f28355W.setAlpha(f);
        }
    }

    private void setPinFactor(float f) {
        if (this.f28362g0 != f && this.f28363h0) {
            this.f28362g0 = f;
            m11370Z2();
        }
    }

    public void setShowMyLocationButton(boolean z) {
        boolean z2 = z || this.f28371p0;
        if (this.f28365j0 != z2) {
            this.f28365j0 = z2;
            m11365f2(z2 ? 1.0f : 0.0f);
        }
    }

    private void setUserMovingLocation(boolean z) {
        if (this.f28347O != z) {
            this.f28347O = z;
            m11364h2(z ? 1.0f : 0.0f);
            if (!this.f28347O) {
                m11381T2();
                m11377V2();
                return;
            }
            m11360m2();
            m11363i2();
        }
    }

    public void m11351x2(float f, float f2, ValueAnimator valueAnimator) {
        setMyLocationButtonFactor(f + (f2 * C2057b.m35735a(valueAnimator)));
    }

    public void m11350y2(float f, float f2, ValueAnimator valueAnimator) {
        setPinFactor(f + (f2 * C2057b.m35735a(valueAnimator)));
    }

    public void m11349z2(C5217a aVar) {
        if (!this.f28370o0) {
            this.f28370o0 = true;
            m11361l2(false, false);
        }
    }

    public void m11408E2() {
        int i = this.f28346N;
        if ((i & 2) == 0) {
            this.f28346N = i | 2;
            try {
                this.f28352T.m30316c();
            } catch (Throwable unused) {
            }
            AbstractC5867f fVar = this.f28369n0;
            if (fVar != null) {
                try {
                    fVar.mo21088e();
                } catch (Throwable unused2) {
                }
                this.f28369n0 = null;
            }
        }
    }

    public void m11406F2() {
        m11361l2(true, false);
    }

    public final void m11404G2() {
        getParent().getParent().requestDisallowInterceptTouchEvent(true);
        C4481c cVar = this.f28356a0;
        if (cVar != null) {
            LatLng latLng = cVar.m27533c().f11667a;
            this.f28359d0 = latLng.f11674a;
            this.f28360e0 = latLng.f11675b;
        }
    }

    public final void m11403H2() {
        C4481c cVar;
        if (!this.f28347O && (cVar = this.f28356a0) != null) {
            LatLng latLng = cVar.m27533c().f11667a;
            if (latLng.f11674a != this.f28359d0 || latLng.f11675b != this.f28360e0) {
                setUserMovingLocation(true);
                setIgnoreMyLocation(true);
            }
        }
    }

    public final void m11400J2() {
        m11377V2();
        getParent().getParent().requestDisallowInterceptTouchEvent(false);
        if (this.f28347O && !this.f28361f0) {
            setUserMovingLocation(false);
        }
    }

    public void m11399K2() {
        int i = this.f28346N;
        if ((i & 1) == 0) {
            int i2 = i | 1;
            this.f28346N = i2;
            if ((i2 & 8) != 0) {
                m11392N2();
            }
        }
    }

    public void m11397L2(boolean z) {
        this.f28357b0.setShowProgress(z);
        if (z) {
            this.f28371p0 = false;
            m11361l2(true, false);
        }
    }

    @Override
    public void mo11396M() {
        C4481c cVar;
        if (this.f28347O && (cVar = this.f28356a0) != null) {
            LatLng latLng = cVar.m27533c().f11667a;
            Location location = new Location("network");
            location.setLatitude(latLng.f11674a);
            location.setLongitude(latLng.f11675b);
            this.f28351S = location;
            setShowMyLocationButton(true);
            AbstractC8791f fVar = this.f28345M;
            if (fVar != null) {
                boolean z = false;
                boolean z2 = this.f28350R != null;
                if (this.f28347O || this.f28358c0) {
                    z = true;
                }
                fVar.mo11347s1(location, true, z2, z, true);
            }
        }
    }

    public void m11394M2() {
        int i = this.f28346N;
        if ((i & 1) != 0) {
            int i2 = i & (-2);
            this.f28346N = i2;
            if ((i2 & 4) != 0) {
                this.f28346N = i2 & (-5);
                m11413B2();
            } else if ((i2 & 8) != 0) {
                m11379U2();
            }
        }
    }

    public final void m11392N2() {
        try {
            this.f28352T.m30315d();
        } catch (Throwable unused) {
        }
        this.f28346N &= -17;
    }

    public final void m11390O2(double d, double d2, float f) {
        Location location = new Location("network");
        location.setLatitude(d);
        location.setLongitude(d2);
        m11387Q2(location, f);
    }

    public final void m11389P2(Location location) {
        m11387Q2(location, m11359n2());
    }

    public final void m11387Q2(Location location, float f) {
        m11386R2(location, f);
        setShowMyLocationButton(this.f28358c0);
        AbstractC8791f fVar = this.f28345M;
        if (fVar != null) {
            boolean z = this.f28358c0;
            fVar.mo11347s1(location, z, this.f28350R != null, this.f28347O || z, false);
        }
    }

    public final void m11386R2(Location location, float f) {
        if (location != null) {
            this.f28351S = location;
            if (!this.f28347O && this.f28356a0 != null) {
                LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
                if (this.f28348P) {
                    this.f28356a0.m27534b((this.f28358c0 || !this.f28349Q) ? C4480b.m27538d(latLng, f) : C4480b.m27540b(latLng));
                    return;
                }
                this.f28348P = true;
                this.f28356a0.m27529g(C4480b.m27538d(latLng, f));
            }
        }
    }

    @Override
    public void mo11384S2(C4481c cVar) {
        this.f28356a0 = cVar;
        this.f28353U.setAlpha(1.0f);
        try {
            if (m11362k2()) {
                cVar.m27526j(true);
            }
        } catch (Throwable th) {
            Log.m14725e("No access to Google Play Services", th, new Object[0]);
        }
        cVar.m27530f().m27515b(false);
        cVar.m27530f().m27514c(false);
        cVar.m27530f().m27516a(false);
        cVar.m27520p(this);
        cVar.m27523m(this);
        cVar.m27522n(this);
        cVar.m27525k(this);
        cVar.m27524l(this);
        Location location = this.f28351S;
        if (location == null) {
            Location b = C8728c2.m11657c().m11658b();
            if (b != null) {
                m11389P2(b);
            } else {
                double d = 45.924197260584734d;
                double d2 = 6.870443522930145d;
                float e = cVar.m27531e();
                C4868i.C4878j R1 = C4868i.m24726c2().m24806R1();
                if (R1 != null) {
                    d = R1.f16678a;
                    d2 = R1.f16679b;
                    e = R1.f16680c;
                }
                m11390O2(d, d2, e);
            }
        } else {
            m11389P2(location);
        }
        m11379U2();
    }

    @Override
    public void mo11383S3(int i) {
        if (this.f28373r0) {
            setCameraMoving(true);
        } else {
            this.f28373r0 = true;
        }
    }

    public final void m11381T2() {
        m11363i2();
        C8790e eVar = new C8790e();
        this.f28372q0 = eVar;
        postDelayed(eVar, 400L);
    }

    public final void m11379U2() {
        int i = this.f28346N;
        if ((i & 16) == 0) {
            this.f28346N = i | 16;
            try {
                this.f28352T.m30314e();
            } catch (Throwable unused) {
            }
        }
    }

    public final void m11377V2() {
        if (this.f28356a0 != null) {
            if (this.f28351S == null) {
                Location location = new Location("network");
                this.f28351S = location;
                location.setLatitude(this.f28356a0.m27533c().f11667a.f11674a);
                this.f28351S.setLongitude(this.f28356a0.m27533c().f11667a.f11675b);
            }
            if (this.f28351S != null) {
                C4868i.m24726c2().m24802R5(this.f28351S.getLatitude(), this.f28351S.getLongitude(), this.f28356a0.m27533c().f11668b);
            }
        }
    }

    public final void m11374X2(boolean z, boolean z2) {
        if (this.f28349Q != z || z2) {
            this.f28349Q = z;
            if (!z && this.f28350R != null) {
                m11363i2();
                m11360m2();
                m11389P2(this.f28350R);
                m11377V2();
            }
        }
    }

    public void m11372Y2(double d, double d2) {
        Location location = new Location("network");
        location.setLatitude(d);
        location.setLongitude(d2);
        this.f28358c0 = true;
        setIgnoreMyLocation(true);
        m11387Q2(location, m11359n2());
    }

    public final void m11370Z2() {
        this.f28353U.setTranslationY((-C1357a0.m37541i(10.0f)) * this.f28362g0);
        this.f28354V.setAlpha(this.f28362g0);
    }

    @Override
    public void mo11366e5(Location location) {
        this.f28350R = location;
        if (location != null) {
            C4868i.m24726c2().m24748Z3(location.getLatitude(), location.getLongitude(), location.getAccuracy());
        }
        if (!this.f28349Q) {
            setShowMyLocationButton(false);
            m11389P2(location);
            m11377V2();
        }
    }

    public final void m11365f2(float f) {
        if (this.f28366k0) {
            this.f28366k0 = false;
            ValueAnimator valueAnimator = this.f28367l0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f28367l0 = null;
            }
        }
        if (this.f28368m0 != f) {
            if (Build.VERSION.SDK_INT < 19 || isAttachedToWindow()) {
                this.f28366k0 = true;
                final float f2 = this.f28368m0;
                final float f3 = f - f2;
                ValueAnimator b = C2057b.m35734b();
                this.f28367l0 = b;
                b.setInterpolator(C2057b.f7280b);
                this.f28367l0.setDuration(150L);
                this.f28367l0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        View$OnClickListenerC8785j2.this.m11351x2(f2, f3, valueAnimator2);
                    }
                });
                this.f28367l0.addListener(new C8789d());
                this.f28367l0.start();
                return;
            }
            this.f28368m0 = f;
            this.f28355W.setAlpha(f);
        }
    }

    public Location getCurrentLocation() {
        return this.f28351S;
    }

    public final void m11364h2(float f) {
        if (this.f28353U == null) {
            this.f28362g0 = f;
            return;
        }
        if (this.f28363h0) {
            this.f28363h0 = false;
            ValueAnimator valueAnimator = this.f28364i0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f28364i0 = null;
            }
        }
        final float f2 = this.f28362g0;
        if (f2 != f) {
            this.f28363h0 = true;
            final float f3 = f - f2;
            ValueAnimator b = C2057b.m35734b();
            this.f28364i0 = b;
            b.setDuration(120L);
            this.f28364i0.setInterpolator(C2057b.f7280b);
            this.f28364i0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    View$OnClickListenerC8785j2.this.m11350y2(f2, f3, valueAnimator2);
                }
            });
            this.f28364i0.addListener(new C8788c());
            this.f28364i0.start();
        }
    }

    public final void m11363i2() {
        AbstractRunnableC5910b bVar = this.f28372q0;
        if (bVar != null) {
            bVar.m21857c();
            this.f28372q0 = null;
        }
    }

    public final boolean m11362k2() {
        return Build.VERSION.SDK_INT < 23 || getContext().checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    public void m11361l2(final boolean z, final boolean z2) {
        if (C1379j0.m37307r(getContext()).m14467m0(false) != 0) {
            this.f28357b0.setShowProgress(false);
            if (!z || z2) {
                setShowMyLocationButton(true);
            } else {
                ((AbstractView$OnTouchListenerC7889a) getContext()).m14570K2(false, false, this);
            }
        } else if (this.f28370o0) {
            this.f28357b0.setShowProgress(false);
            if (z) {
                m11357p2();
            }
        } else {
            try {
                if (this.f28369n0 == null) {
                    AbstractC5867f.C5868a aVar = new AbstractC5867f.C5868a(getContext());
                    aVar.m21905a(C4282f.f14330a);
                    aVar.m21904b(new AbstractC5867f.AbstractC5870c() {
                        @Override
                        public final void mo11484s(C5217a aVar2) {
                            View$OnClickListenerC8785j2.this.m11349z2(aVar2);
                        }
                    });
                    AbstractC5867f c = aVar.m21903c();
                    this.f28369n0 = c;
                    c.mo21089d();
                }
                C4282f.f14333d.mo951a(this.f28369n0, new C4284g.C4285a().m28299a(LocationRequest.m30353b()).m28297c(true).m28298b()).mo21900c(new AbstractC5877l() {
                    @Override
                    public final void mo11472a(AbstractC5876k kVar) {
                        View$OnClickListenerC8785j2.this.m11414A2(z, z2, (C4289i) kVar);
                    }
                });
            } catch (Throwable th) {
                Log.m14710w("Error", th, new Object[0]);
                this.f28370o0 = true;
                m11361l2(z, z2);
            }
        }
    }

    public final void m11360m2() {
        if (this.f28358c0) {
            this.f28358c0 = false;
            AbstractC8791f fVar = this.f28345M;
            if (fVar != null) {
                fVar.mo11348S5();
            }
        }
    }

    public final float m11359n2() {
        C4481c cVar = this.f28356a0;
        if (cVar == null) {
            return -1.0f;
        }
        return cVar.m27532d() - (this.f28358c0 ? 3.0f : 5.0f);
    }

    @Override
    public void mo4252o1(int i, boolean z) {
        if (z) {
            m11361l2(true, false);
        } else if (!C7389v0.m16711L2("android.permission.ACCESS_FINE_LOCATION")) {
            C1405v.m37140C();
        }
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_gps) {
            m11361l2(true, false);
        }
    }

    @Override
    public void mo11358p1() {
        setCameraMoving(false);
    }

    public final void m11357p2() {
        m11374X2(false, true);
    }

    @Override
    public void mo11356r1() {
        setCameraMoving(false);
        m11377V2();
    }

    public void setCallback(AbstractC8791f fVar) {
        this.f28345M = fVar;
    }

    public void m11354t2(AbstractC9323v4<?> v4Var, C8799l2 l2Var, boolean z) {
        this.f28357b0 = l2Var;
        int r2 = m11355r2(z);
        FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(-1, r2 + 0);
        s1.topMargin = 0;
        C8786a aVar = new C8786a(getContext());
        this.f28352T = aVar;
        aVar.setLayoutParams(s1);
        addView(this.f28352T);
        ImageView imageView = new ImageView(getContext());
        this.f28354V = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f28354V.setImageResource(R.drawable.baseline_close_18);
        this.f28354V.setColorFilter(C11524j.m226O(R.id.theme_color_icon, 1));
        this.f28354V.setLayoutParams(FrameLayoutFix.m18007t1(-2, -2, 17));
        addView(this.f28354V);
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-2, -2, 17);
        t1.bottomMargin = C1357a0.m37541i(18.0f);
        ImageView imageView2 = new ImageView(getContext());
        this.f28353U = imageView2;
        imageView2.setImageResource(R.drawable.ic_map_pin_44);
        this.f28353U.setLayoutParams(t1);
        this.f28353U.setAlpha(0.0f);
        addView(this.f28353U);
        m11370Z2();
        int i = C1357a0.m37541i(4.0f);
        int i2 = i * 2;
        FrameLayout.LayoutParams t12 = FrameLayoutFix.m18007t1(C1357a0.m37541i(40.0f) + i2, C1357a0.m37541i(40.0f) + i2, 85);
        t12.bottomMargin = C1357a0.m37541i(16.0f) - i;
        t12.rightMargin = C1357a0.m37541i(16.0f) - i;
        C8787b bVar = new C8787b(getContext());
        this.f28355W = bVar;
        v4Var.m9163t8(bVar);
        this.f28355W.m18789d(R.drawable.baseline_gps_fixed_24, 40.0f, 4.0f, R.id.theme_color_circleButtonOverlay, R.id.theme_color_circleButtonOverlayIcon);
        this.f28355W.setId(R.id.btn_gps);
        this.f28355W.setAlpha(0.0f);
        this.f28355W.setOnClickListener(this);
        this.f28355W.setLayoutParams(t12);
        if (Build.VERSION.SDK_INT < 23 || getContext().checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
            m11361l2(false, false);
        } else {
            this.f28355W.setAlpha(1.0f);
        }
        addView(this.f28355W);
        C6879f3 f3Var = new C6879f3(getContext());
        f3Var.setSimpleTopShadow(true);
        FrameLayout.LayoutParams v1 = FrameLayoutFix.m18005v1(f3Var.getLayoutParams());
        v1.gravity = 80;
        f3Var.setLayoutParams(v1);
        v4Var.m9163t8(f3Var);
        addView(f3Var);
        setBackgroundColor(C11524j.m241G0());
        v4Var.m9197o8(this, R.id.theme_color_placeholder);
        setLayoutParams(FrameLayoutFix.m18007t1(-1, r2, 48));
        C4383l.m28059a().m28058b(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC8785j2.this.m11411C2();
            }
        });
    }

    public final void m11413B2() {
        int i = this.f28346N;
        if ((i & 2) == 0) {
            if ((i & 1) != 0) {
                this.f28346N = i | 4;
                return;
            }
            this.f28346N = i | 8;
            try {
                this.f28352T.m30317b(null);
                this.f28352T.m30318a(this);
            } catch (Throwable unused) {
            }
        }
    }

    public final boolean m11352v2(float f) {
        C4481c cVar = this.f28356a0;
        return cVar == null || f < cVar.m27532d() - 10.0f;
    }
}
