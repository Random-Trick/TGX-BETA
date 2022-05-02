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
    public AbstractC8791f f28348M;
    public int f28349N;
    public boolean f28350O;
    public boolean f28351P;
    public boolean f28352Q;
    public Location f28353R;
    public Location f28354S;
    public MapView f28355T;
    public ImageView f28356U;
    public ImageView f28357V;
    public C6851c0 f28358W;
    public C4481c f28359a0;
    public C8799l2 f28360b0;
    public boolean f28361c0;
    public double f28362d0;
    public double f28363e0;
    public boolean f28364f0;
    public float f28365g0;
    public boolean f28366h0;
    public ValueAnimator f28367i0;
    public boolean f28368j0;
    public boolean f28369k0;
    public ValueAnimator f28370l0;
    public float f28371m0;
    public AbstractC5867f f28372n0;
    public boolean f28373o0;
    public boolean f28374p0;
    public AbstractRunnableC5910b f28375q0;
    public boolean f28376r0;

    public class C8786a extends MapView {
        public C8786a(Context context) {
            super(context);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                View$OnClickListenerC8785j2.this.m11403G2();
            } else if (action == 1) {
                View$OnClickListenerC8785j2.this.m11399J2();
            } else if (action == 2) {
                View$OnClickListenerC8785j2.this.m11402H2();
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
            return (motionEvent.getAction() != 0 || (getAlpha() != 0.0f && !View$OnClickListenerC8785j2.this.f28369k0)) && super.onTouchEvent(motionEvent);
        }
    }

    public class C8788c extends AnimatorListenerAdapter {
        public C8788c() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            View$OnClickListenerC8785j2.this.f28366h0 = false;
            View$OnClickListenerC8785j2.this.f28367i0 = null;
        }
    }

    public class C8789d extends AnimatorListenerAdapter {
        public C8789d() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            View$OnClickListenerC8785j2.this.f28369k0 = false;
            View$OnClickListenerC8785j2.this.f28370l0 = null;
        }
    }

    public class C8790e extends AbstractRunnableC5910b {
        public C8790e() {
        }

        @Override
        public void mo1364b() {
            boolean z;
            if (View$OnClickListenerC8785j2.this.f28352Q) {
                View$OnClickListenerC8785j2.this.setShowMyLocationButton(true);
                if (View$OnClickListenerC8785j2.this.f28348M != null) {
                    AbstractC8791f fVar = View$OnClickListenerC8785j2.this.f28348M;
                    Location location = View$OnClickListenerC8785j2.this.f28354S;
                    boolean z2 = View$OnClickListenerC8785j2.this.f28353R != null;
                    boolean z3 = View$OnClickListenerC8785j2.this.f28350O || View$OnClickListenerC8785j2.this.f28361c0;
                    if (View$OnClickListenerC8785j2.this.f28359a0 != null) {
                        View$OnClickListenerC8785j2 j2Var = View$OnClickListenerC8785j2.this;
                        if (!j2Var.m11351v2(j2Var.f28359a0.m27535c().f11668b)) {
                            z = false;
                            fVar.mo11346s1(location, true, z2, z3, z);
                        }
                    }
                    z = true;
                    fVar.mo11346s1(location, true, z2, z3, z);
                }
            }
        }
    }

    public interface AbstractC8791f {
        void mo11347S5();

        void mo11346s1(Location location, boolean z, boolean z2, boolean z3, boolean z4);
    }

    public View$OnClickListenerC8785j2(Context context) {
        super(context);
    }

    public void m11413A2(boolean z, boolean z2, C4289i iVar) {
        Status a = iVar.mo952a();
        int c = a.m30398c();
        if (c != 0) {
            if (c != 6) {
                this.f28360b0.setShowProgress(false);
                if (z) {
                    m11356p2();
                }
            } else if (!z || z2) {
                setShowMyLocationButton(true);
                this.f28374p0 = true;
            } else {
                try {
                    a.m30394g((AbstractView$OnTouchListenerC7889a) getContext(), 103);
                } catch (Throwable unused) {
                }
            }
        } else if (z) {
            if (!iVar.m28298b().m28293f()) {
                this.f28360b0.setShowProgress(false);
            }
            m11356p2();
        }
    }

    public void m11410C2() {
        try {
            this.f28355T.m30319b(null);
        } catch (Throwable unused) {
        }
        C1379j0.m37337d0(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC8785j2.this.m11412B2();
            }
        });
    }

    public static int m11354r2(boolean z) {
        int i = C1357a0.m37544i(150.0f);
        return z ? Math.max((C1357a0.m37556B() - View$OnClickListenerC9170d1.m10065c3(false)) - C1357a0.m37544i(60.0f), i) : i;
    }

    private void setCameraMoving(boolean z) {
        if (this.f28364f0 != z) {
            this.f28364f0 = z;
            if (z) {
                return;
            }
            if (this.f28350O) {
                setUserMovingLocation(false);
            } else {
                m11376V2();
            }
        }
    }

    private void setIgnoreMyLocation(boolean z) {
        m11373X2(z, false);
    }

    private void setMyLocationButtonFactor(float f) {
        if (this.f28371m0 != f && this.f28369k0) {
            this.f28371m0 = f;
            this.f28358W.setAlpha(f);
        }
    }

    private void setPinFactor(float f) {
        if (this.f28365g0 != f && this.f28366h0) {
            this.f28365g0 = f;
            m11369Z2();
        }
    }

    public void setShowMyLocationButton(boolean z) {
        boolean z2 = z || this.f28374p0;
        if (this.f28368j0 != z2) {
            this.f28368j0 = z2;
            m11364f2(z2 ? 1.0f : 0.0f);
        }
    }

    private void setUserMovingLocation(boolean z) {
        if (this.f28350O != z) {
            this.f28350O = z;
            m11363h2(z ? 1.0f : 0.0f);
            if (!this.f28350O) {
                m11380T2();
                m11376V2();
                return;
            }
            m11359m2();
            m11362i2();
        }
    }

    public void m11350x2(float f, float f2, ValueAnimator valueAnimator) {
        setMyLocationButtonFactor(f + (f2 * C2057b.m35738a(valueAnimator)));
    }

    public void m11349y2(float f, float f2, ValueAnimator valueAnimator) {
        setPinFactor(f + (f2 * C2057b.m35738a(valueAnimator)));
    }

    public void m11348z2(C5217a aVar) {
        if (!this.f28373o0) {
            this.f28373o0 = true;
            m11360l2(false, false);
        }
    }

    public void m11407E2() {
        int i = this.f28349N;
        if ((i & 2) == 0) {
            this.f28349N = i | 2;
            try {
                this.f28355T.m30318c();
            } catch (Throwable unused) {
            }
            AbstractC5867f fVar = this.f28372n0;
            if (fVar != null) {
                try {
                    fVar.mo21089e();
                } catch (Throwable unused2) {
                }
                this.f28372n0 = null;
            }
        }
    }

    public void m11405F2() {
        m11360l2(true, false);
    }

    public final void m11403G2() {
        getParent().getParent().requestDisallowInterceptTouchEvent(true);
        C4481c cVar = this.f28359a0;
        if (cVar != null) {
            LatLng latLng = cVar.m27535c().f11667a;
            this.f28362d0 = latLng.f11674a;
            this.f28363e0 = latLng.f11675b;
        }
    }

    public final void m11402H2() {
        C4481c cVar;
        if (!this.f28350O && (cVar = this.f28359a0) != null) {
            LatLng latLng = cVar.m27535c().f11667a;
            if (latLng.f11674a != this.f28362d0 || latLng.f11675b != this.f28363e0) {
                setUserMovingLocation(true);
                setIgnoreMyLocation(true);
            }
        }
    }

    public final void m11399J2() {
        m11376V2();
        getParent().getParent().requestDisallowInterceptTouchEvent(false);
        if (this.f28350O && !this.f28364f0) {
            setUserMovingLocation(false);
        }
    }

    public void m11398K2() {
        int i = this.f28349N;
        if ((i & 1) == 0) {
            int i2 = i | 1;
            this.f28349N = i2;
            if ((i2 & 8) != 0) {
                m11391N2();
            }
        }
    }

    public void m11396L2(boolean z) {
        this.f28360b0.setShowProgress(z);
        if (z) {
            this.f28374p0 = false;
            m11360l2(true, false);
        }
    }

    @Override
    public void mo11395M() {
        C4481c cVar;
        if (this.f28350O && (cVar = this.f28359a0) != null) {
            LatLng latLng = cVar.m27535c().f11667a;
            Location location = new Location("network");
            location.setLatitude(latLng.f11674a);
            location.setLongitude(latLng.f11675b);
            this.f28354S = location;
            setShowMyLocationButton(true);
            AbstractC8791f fVar = this.f28348M;
            if (fVar != null) {
                boolean z = false;
                boolean z2 = this.f28353R != null;
                if (this.f28350O || this.f28361c0) {
                    z = true;
                }
                fVar.mo11346s1(location, true, z2, z, true);
            }
        }
    }

    public void m11393M2() {
        int i = this.f28349N;
        if ((i & 1) != 0) {
            int i2 = i & (-2);
            this.f28349N = i2;
            if ((i2 & 4) != 0) {
                this.f28349N = i2 & (-5);
                m11412B2();
            } else if ((i2 & 8) != 0) {
                m11378U2();
            }
        }
    }

    public final void m11391N2() {
        try {
            this.f28355T.m30317d();
        } catch (Throwable unused) {
        }
        this.f28349N &= -17;
    }

    public final void m11389O2(double d, double d2, float f) {
        Location location = new Location("network");
        location.setLatitude(d);
        location.setLongitude(d2);
        m11386Q2(location, f);
    }

    public final void m11388P2(Location location) {
        m11386Q2(location, m11358n2());
    }

    public final void m11386Q2(Location location, float f) {
        m11385R2(location, f);
        setShowMyLocationButton(this.f28361c0);
        AbstractC8791f fVar = this.f28348M;
        if (fVar != null) {
            boolean z = this.f28361c0;
            fVar.mo11346s1(location, z, this.f28353R != null, this.f28350O || z, false);
        }
    }

    public final void m11385R2(Location location, float f) {
        if (location != null) {
            this.f28354S = location;
            if (!this.f28350O && this.f28359a0 != null) {
                LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
                if (this.f28351P) {
                    this.f28359a0.m27536b((this.f28361c0 || !this.f28352Q) ? C4480b.m27540d(latLng, f) : C4480b.m27542b(latLng));
                    return;
                }
                this.f28351P = true;
                this.f28359a0.m27531g(C4480b.m27540d(latLng, f));
            }
        }
    }

    @Override
    public void mo11383S2(C4481c cVar) {
        this.f28359a0 = cVar;
        this.f28356U.setAlpha(1.0f);
        try {
            if (m11361k2()) {
                cVar.m27528j(true);
            }
        } catch (Throwable th) {
            Log.m14725e("No access to Google Play Services", th, new Object[0]);
        }
        cVar.m27532f().m27517b(false);
        cVar.m27532f().m27516c(false);
        cVar.m27532f().m27518a(false);
        cVar.m27522p(this);
        cVar.m27525m(this);
        cVar.m27524n(this);
        cVar.m27527k(this);
        cVar.m27526l(this);
        Location location = this.f28354S;
        if (location == null) {
            Location b = C8728c2.m11656c().m11657b();
            if (b != null) {
                m11388P2(b);
            } else {
                double d = 45.924197260584734d;
                double d2 = 6.870443522930145d;
                float e = cVar.m27533e();
                C4868i.C4878j R1 = C4868i.m24727c2().m24807R1();
                if (R1 != null) {
                    d = R1.f16678a;
                    d2 = R1.f16679b;
                    e = R1.f16680c;
                }
                m11389O2(d, d2, e);
            }
        } else {
            m11388P2(location);
        }
        m11378U2();
    }

    @Override
    public void mo11382S3(int i) {
        if (this.f28376r0) {
            setCameraMoving(true);
        } else {
            this.f28376r0 = true;
        }
    }

    public final void m11380T2() {
        m11362i2();
        C8790e eVar = new C8790e();
        this.f28375q0 = eVar;
        postDelayed(eVar, 400L);
    }

    public final void m11378U2() {
        int i = this.f28349N;
        if ((i & 16) == 0) {
            this.f28349N = i | 16;
            try {
                this.f28355T.m30316e();
            } catch (Throwable unused) {
            }
        }
    }

    public final void m11376V2() {
        if (this.f28359a0 != null) {
            if (this.f28354S == null) {
                Location location = new Location("network");
                this.f28354S = location;
                location.setLatitude(this.f28359a0.m27535c().f11667a.f11674a);
                this.f28354S.setLongitude(this.f28359a0.m27535c().f11667a.f11675b);
            }
            if (this.f28354S != null) {
                C4868i.m24727c2().m24803R5(this.f28354S.getLatitude(), this.f28354S.getLongitude(), this.f28359a0.m27535c().f11668b);
            }
        }
    }

    public final void m11373X2(boolean z, boolean z2) {
        if (this.f28352Q != z || z2) {
            this.f28352Q = z;
            if (!z && this.f28353R != null) {
                m11362i2();
                m11359m2();
                m11388P2(this.f28353R);
                m11376V2();
            }
        }
    }

    public void m11371Y2(double d, double d2) {
        Location location = new Location("network");
        location.setLatitude(d);
        location.setLongitude(d2);
        this.f28361c0 = true;
        setIgnoreMyLocation(true);
        m11386Q2(location, m11358n2());
    }

    public final void m11369Z2() {
        this.f28356U.setTranslationY((-C1357a0.m37544i(10.0f)) * this.f28365g0);
        this.f28357V.setAlpha(this.f28365g0);
    }

    @Override
    public void mo11365e5(Location location) {
        this.f28353R = location;
        if (location != null) {
            C4868i.m24727c2().m24749Z3(location.getLatitude(), location.getLongitude(), location.getAccuracy());
        }
        if (!this.f28352Q) {
            setShowMyLocationButton(false);
            m11388P2(location);
            m11376V2();
        }
    }

    public final void m11364f2(float f) {
        if (this.f28369k0) {
            this.f28369k0 = false;
            ValueAnimator valueAnimator = this.f28370l0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f28370l0 = null;
            }
        }
        if (this.f28371m0 != f) {
            if (Build.VERSION.SDK_INT < 19 || isAttachedToWindow()) {
                this.f28369k0 = true;
                final float f2 = this.f28371m0;
                final float f3 = f - f2;
                ValueAnimator b = C2057b.m35737b();
                this.f28370l0 = b;
                b.setInterpolator(C2057b.f7280b);
                this.f28370l0.setDuration(150L);
                this.f28370l0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        View$OnClickListenerC8785j2.this.m11350x2(f2, f3, valueAnimator2);
                    }
                });
                this.f28370l0.addListener(new C8789d());
                this.f28370l0.start();
                return;
            }
            this.f28371m0 = f;
            this.f28358W.setAlpha(f);
        }
    }

    public Location getCurrentLocation() {
        return this.f28354S;
    }

    public final void m11363h2(float f) {
        if (this.f28356U == null) {
            this.f28365g0 = f;
            return;
        }
        if (this.f28366h0) {
            this.f28366h0 = false;
            ValueAnimator valueAnimator = this.f28367i0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f28367i0 = null;
            }
        }
        final float f2 = this.f28365g0;
        if (f2 != f) {
            this.f28366h0 = true;
            final float f3 = f - f2;
            ValueAnimator b = C2057b.m35737b();
            this.f28367i0 = b;
            b.setDuration(120L);
            this.f28367i0.setInterpolator(C2057b.f7280b);
            this.f28367i0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    View$OnClickListenerC8785j2.this.m11349y2(f2, f3, valueAnimator2);
                }
            });
            this.f28367i0.addListener(new C8788c());
            this.f28367i0.start();
        }
    }

    public final void m11362i2() {
        AbstractRunnableC5910b bVar = this.f28375q0;
        if (bVar != null) {
            bVar.m21858c();
            this.f28375q0 = null;
        }
    }

    public final boolean m11361k2() {
        return Build.VERSION.SDK_INT < 23 || getContext().checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    public void m11360l2(final boolean z, final boolean z2) {
        if (C1379j0.m37310r(getContext()).m14466m0(false) != 0) {
            this.f28360b0.setShowProgress(false);
            if (!z || z2) {
                setShowMyLocationButton(true);
            } else {
                ((AbstractView$OnTouchListenerC7889a) getContext()).m14570K2(false, false, this);
            }
        } else if (this.f28373o0) {
            this.f28360b0.setShowProgress(false);
            if (z) {
                m11356p2();
            }
        } else {
            try {
                if (this.f28372n0 == null) {
                    AbstractC5867f.C5868a aVar = new AbstractC5867f.C5868a(getContext());
                    aVar.m21906a(C4282f.f14330a);
                    aVar.m21905b(new AbstractC5867f.AbstractC5870c() {
                        @Override
                        public final void mo11483s(C5217a aVar2) {
                            View$OnClickListenerC8785j2.this.m11348z2(aVar2);
                        }
                    });
                    AbstractC5867f c = aVar.m21904c();
                    this.f28372n0 = c;
                    c.mo21090d();
                }
                C4282f.f14333d.mo951a(this.f28372n0, new C4284g.C4285a().m28301a(LocationRequest.m30355b()).m28299c(true).m28300b()).mo21901c(new AbstractC5877l() {
                    @Override
                    public final void mo11471a(AbstractC5876k kVar) {
                        View$OnClickListenerC8785j2.this.m11413A2(z, z2, (C4289i) kVar);
                    }
                });
            } catch (Throwable th) {
                Log.m14710w("Error", th, new Object[0]);
                this.f28373o0 = true;
                m11360l2(z, z2);
            }
        }
    }

    public final void m11359m2() {
        if (this.f28361c0) {
            this.f28361c0 = false;
            AbstractC8791f fVar = this.f28348M;
            if (fVar != null) {
                fVar.mo11347S5();
            }
        }
    }

    public final float m11358n2() {
        C4481c cVar = this.f28359a0;
        if (cVar == null) {
            return -1.0f;
        }
        return cVar.m27534d() - (this.f28361c0 ? 3.0f : 5.0f);
    }

    @Override
    public void mo4252o1(int i, boolean z) {
        if (z) {
            m11360l2(true, false);
        } else if (!C7389v0.m16711L2("android.permission.ACCESS_FINE_LOCATION")) {
            C1405v.m37143C();
        }
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_gps) {
            m11360l2(true, false);
        }
    }

    @Override
    public void mo11357p1() {
        setCameraMoving(false);
    }

    public final void m11356p2() {
        m11373X2(false, true);
    }

    @Override
    public void mo11355r1() {
        setCameraMoving(false);
        m11376V2();
    }

    public void setCallback(AbstractC8791f fVar) {
        this.f28348M = fVar;
    }

    public void m11353t2(AbstractC9323v4<?> v4Var, C8799l2 l2Var, boolean z) {
        this.f28360b0 = l2Var;
        int r2 = m11354r2(z);
        FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(-1, r2 + 0);
        s1.topMargin = 0;
        C8786a aVar = new C8786a(getContext());
        this.f28355T = aVar;
        aVar.setLayoutParams(s1);
        addView(this.f28355T);
        ImageView imageView = new ImageView(getContext());
        this.f28357V = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f28357V.setImageResource(R.drawable.baseline_close_18);
        this.f28357V.setColorFilter(C11524j.m226O(R.id.theme_color_icon, 1));
        this.f28357V.setLayoutParams(FrameLayoutFix.m18007t1(-2, -2, 17));
        addView(this.f28357V);
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-2, -2, 17);
        t1.bottomMargin = C1357a0.m37544i(18.0f);
        ImageView imageView2 = new ImageView(getContext());
        this.f28356U = imageView2;
        imageView2.setImageResource(R.drawable.ic_map_pin_44);
        this.f28356U.setLayoutParams(t1);
        this.f28356U.setAlpha(0.0f);
        addView(this.f28356U);
        m11369Z2();
        int i = C1357a0.m37544i(4.0f);
        int i2 = i * 2;
        FrameLayout.LayoutParams t12 = FrameLayoutFix.m18007t1(C1357a0.m37544i(40.0f) + i2, C1357a0.m37544i(40.0f) + i2, 85);
        t12.bottomMargin = C1357a0.m37544i(16.0f) - i;
        t12.rightMargin = C1357a0.m37544i(16.0f) - i;
        C8787b bVar = new C8787b(getContext());
        this.f28358W = bVar;
        v4Var.m9163t8(bVar);
        this.f28358W.m18790d(R.drawable.baseline_gps_fixed_24, 40.0f, 4.0f, R.id.theme_color_circleButtonOverlay, R.id.theme_color_circleButtonOverlayIcon);
        this.f28358W.setId(R.id.btn_gps);
        this.f28358W.setAlpha(0.0f);
        this.f28358W.setOnClickListener(this);
        this.f28358W.setLayoutParams(t12);
        if (Build.VERSION.SDK_INT < 23 || getContext().checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
            m11360l2(false, false);
        } else {
            this.f28358W.setAlpha(1.0f);
        }
        addView(this.f28358W);
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
        C4383l.m28061a().m28060b(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC8785j2.this.m11410C2();
            }
        });
    }

    public final void m11412B2() {
        int i = this.f28349N;
        if ((i & 2) == 0) {
            if ((i & 1) != 0) {
                this.f28349N = i | 4;
                return;
            }
            this.f28349N = i | 8;
            try {
                this.f28355T.m30319b(null);
                this.f28355T.m30320a(this);
            } catch (Throwable unused) {
            }
        }
    }

    public final boolean m11351v2(float f) {
        C4481c cVar = this.f28359a0;
        return cVar == null || f < cVar.m27534d() - 10.0f;
    }
}
