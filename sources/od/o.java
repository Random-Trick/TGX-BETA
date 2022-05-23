package od;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import ce.a0;
import ce.j0;
import ce.y;
import eb.k;
import gd.w;
import hd.t2;
import ld.h;
import ld.v;
import md.m;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.g1;
import ne.m1;
import oc.v0;
import od.p;
import od.t1;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.loader.ImageLoader;
import org.thunderdog.challegram.loader.b;
import org.thunderdog.challegram.widget.SparseDrawableView;
import zd.ya;

public class o extends ViewGroup implements p.b, Runnable, h.c, g1.c, t1.c, kb.c, m1.k, k.b {
    public boolean A0;
    public boolean B0;
    public b C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public final m M;
    public final ld.p N;
    public final ld.p O;
    public v P;
    public v Q;
    public p R;
    public f S;
    public d T;
    public t1 U;
    public c V;
    public e W;
    public qd.b f19760a;
    public od.e f19761a0;
    public float f19762b;
    public boolean f19763b0;
    public final ld.p f19764c;
    public m1.f f19765c0;
    public boolean f19766d0;
    public boolean f19767e0;
    public l1 f19768f0;
    public k f19769g0;
    public boolean f19771i0;
    public float f19772j0;
    public int f19774l0;
    public int f19775m0;
    public int f19776n0;
    public int f19777o0;
    public int f19778p0;
    public int f19779q0;
    public int f19780r0;
    public k f19781s0;
    public float f19782t0;
    public kb.b f19783u0;
    public boolean f19784v0;
    public float f19786x0;
    public k f19787y0;
    public float f19788z0;
    public float f19770h0 = 1.0f;
    public float f19773k0 = 1.0f;
    public Runnable f19785w0 = new Runnable() {
        @Override
        public final void run() {
            o.this.c0();
        }
    };
    public long G0 = -1;
    public long H0 = -1;

    public class a extends kb.b {
        public a() {
        }

        @Override
        public void b() {
            if (o.this.f19783u0 == this && o.this.f19760a != null) {
                o.this.x0(false, 1.0f);
                o.this.j0();
                o.this.W();
            }
        }
    }

    public interface b {
        void L(qd.b bVar, float f10);

        void g(qd.b bVar, long j10, long j11, float f10);

        void l1(qd.b bVar, boolean z10);

        void r1(qd.b bVar, boolean z10);

        void u5(qd.b bVar, boolean z10);
    }

    public class c extends SparseDrawableView {
        public c(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            if (o.this.f19760a != null && !o.this.F0 && !o.this.E0) {
                if (o.this.f19760a.a0()) {
                    o.this.f19760a.f0();
                } else {
                    o.this.f19760a.r(this, canvas, o.this.Q.getLeft(), o.this.Q.getTop(), o.this.Q.getRight(), o.this.Q.getBottom());
                }
            }
        }
    }

    public class d extends View {
        public d(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            if (o.this.f19760a != null && o.this.f19773k0 != 0.0f) {
                if (o.this.f19770h0 != 0.0f) {
                    boolean z10 = true;
                    boolean z11 = o.this.f19762b != 0.0f;
                    if (z11) {
                        canvas.save();
                    }
                    float max = Math.max(0.0f, Math.min(1.0f, o.this.f19770h0));
                    if (o.this.f19768f0 == null || max >= 1.0f) {
                        z10 = false;
                    }
                    if (z10) {
                        float f10 = 1.0f - max;
                        int i10 = (int) ((o.this.f19768f0.f19721g + o.this.f19780r0) * f10);
                        canvas.save();
                        canvas.clipRect(o.this.Q.getLeft() + ((int) ((o.this.f19768f0.f19719e + o.this.f19780r0) * f10)), o.this.Q.getTop() + ((int) ((o.this.f19768f0.f19720f + o.this.f19779q0) * f10)), o.this.Q.getRight() - i10, o.this.Q.getBottom() - ((int) ((o.this.f19768f0.f19722h + o.this.f19779q0) * f10)));
                    }
                    if (!o.this.E0 || !o.this.D0) {
                        if (o.this.Q.e0()) {
                            if (o.this.P.e0()) {
                                o.this.O.draw(canvas);
                            }
                            o.this.P.draw(canvas);
                        } else if (o.this.f19769g0 != null) {
                            o.this.f19769g0.i(1.0f);
                            o.this.f19769g0 = null;
                        }
                        o.this.Q.draw(canvas);
                    } else if (o.this.f19769g0 != null) {
                        o.this.f19769g0.i(1.0f);
                        o.this.f19769g0 = null;
                    }
                    if (z10) {
                        canvas.restore();
                    }
                    if (z11) {
                        canvas.restore();
                    }
                } else if (o.this.f19769g0 == null) {
                } else {
                    if ((o.this.E0 && o.this.D0) || !o.this.Q.e0()) {
                        o.this.f19769g0.i(1.0f);
                        o.this.f19769g0 = null;
                    }
                }
            }
        }
    }

    public class e extends ViewGroup {
        public e(Context context) {
            super(context);
        }

        @Override
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            int i14;
            int i15;
            int i16;
            int i17;
            int childCount = getChildCount();
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int i18 = o.this.f19777o0 - (o.this.f19776n0 * 2);
            int i19 = o.this.f19778p0 - o.this.f19775m0;
            if (o.this.f19760a == null) {
                i15 = 0;
                i14 = 0;
            } else if (!o.this.f19760a.n0() || !o.this.f19760a.k0()) {
                i15 = o.this.f19760a.Z();
                i14 = o.this.f19760a.A();
            } else {
                i15 = o.this.f19760a.A();
                i14 = o.this.f19760a.Z();
            }
            if (i15 == 0 || i14 == 0) {
                i17 = i18;
                i16 = i19;
            } else {
                float f10 = i15;
                float f11 = i14;
                float min = Math.min(i18 / f10, i19 / f11);
                i17 = (int) (f10 * min);
                i16 = (int) (f11 * min);
            }
            int i20 = o.this.f19776n0 + (i18 / 2);
            int i21 = i19 / 2;
            int i22 = i17 / 2;
            int i23 = i20 - i22;
            int i24 = i20 + i22;
            int i25 = i16 / 2;
            int i26 = i21 - i25;
            int i27 = i21 + i25;
            for (int i28 = 0; i28 < childCount; i28++) {
                View childAt = getChildAt(i28);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams == null || layoutParams.width != -2 || layoutParams.height != -2 || o.this.f19763b0) {
                    childAt.layout(0, 0, measuredWidth, measuredHeight);
                } else {
                    childAt.layout(i23, i26, i24, i27);
                }
            }
            if (o.this.A0) {
                o.this.A0 = false;
                o.this.f19787y0.i(0.0f);
            }
        }

        @Override
        public void onMeasure(int i10, int i11) {
            int i12;
            int i13;
            setMeasuredDimension(i10, i11);
            int childCount = getChildCount();
            int i14 = o.this.f19777o0 - (o.this.f19776n0 * 2);
            int i15 = o.this.f19778p0 - o.this.f19775m0;
            if (o.this.f19760a == null) {
                i13 = 0;
                i12 = 0;
            } else if (!o.this.f19760a.n0() || !o.this.f19760a.k0()) {
                i13 = o.this.f19760a.Z();
                i12 = o.this.f19760a.A();
            } else {
                i13 = o.this.f19760a.A();
                i12 = o.this.f19760a.Z();
            }
            if (!(i13 == 0 || i12 == 0)) {
                float f10 = i13;
                float f11 = i12;
                float min = Math.min(i14 / f10, i15 / f11);
                i14 = (int) (f10 * min);
                i15 = (int) (f11 * min);
            }
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = getChildAt(i16);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams != null && layoutParams.width == -2 && layoutParams.height == -2) {
                    measureChild(childAt, View.MeasureSpec.makeMeasureSpec(i14, Log.TAG_TDLIB_OPTIONS), View.MeasureSpec.makeMeasureSpec(i15, Log.TAG_TDLIB_OPTIONS));
                } else {
                    measureChild(childAt, i10, i11);
                }
            }
        }
    }

    public class f extends View {
        public float f19792a;

        public f(Context context) {
            super(context);
        }

        public void a(float f10) {
            if (this.f19792a != f10) {
                this.f19792a = f10;
                invalidate();
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            if (o.this.Q != null && o.this.f19773k0 != 0.0f && o.this.f19770h0 != 0.0f) {
                canvas.drawRect(o.this.Q.getLeft(), o.this.Q.getTop(), o.this.Q.getRight(), o.this.Q.getBottom(), y.g(ib.d.b((int) (this.f19792a * 255.0f), o.this.f19763b0 ? -1 : 0)));
            }
        }
    }

    public o(Context context) {
        super(context);
        this.R = new p(context, this, this);
        d dVar = new d(context);
        this.T = dVar;
        dVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ld.p pVar = new ld.p(this.T, 0);
        this.f19764c = pVar;
        pVar.F();
        this.M = new m(this.T);
        ld.p pVar2 = new ld.p(this.T, 0);
        this.N = pVar2;
        pVar2.F();
        ld.p pVar3 = new ld.p(this.T, 0);
        this.O = pVar3;
        pVar3.F();
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        frameLayoutFix.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        frameLayoutFix.addView(this.T);
        this.Q = pVar;
        this.P = pVar2;
        addView(frameLayoutFix);
        f fVar = new f(context);
        this.S = fVar;
        fVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(this.S);
        c cVar = new c(context);
        this.V = cVar;
        cVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(this.V);
        od.e eVar = new od.e(context);
        this.f19761a0 = eVar;
        eVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(this.f19761a0);
    }

    public void p0(qd.b bVar, h hVar) {
        qd.b bVar2 = this.f19760a;
        if (bVar2 == bVar) {
            this.N.G(bVar2.F());
            this.f19764c.G(hVar);
        }
    }

    public void q0(final qd.b bVar, final h hVar, boolean z10, Bitmap bitmap) {
        j0.d0(new Runnable() {
            @Override
            public final void run() {
                o.this.p0(bVar, hVar);
            }
        });
    }

    public void r0(h hVar) {
        qd.b bVar = this.f19760a;
        if (bVar != null && bVar.K() == hVar && this.U != null) {
            w0(true);
        }
    }

    public void s0() {
        t1 t1Var = this.U;
        if (t1Var != null) {
            t1Var.L0(null);
        }
    }

    private void setCanSeek(boolean z10) {
        b bVar = this.C0;
        if (bVar != null) {
            bVar.r1(this.f19760a, z10);
        }
    }

    private void setImageRadius(int i10) {
        v vVar = this.Q;
        if (vVar instanceof ld.p) {
            ((ld.p) vVar).E0(i10);
        }
        v vVar2 = this.P;
        if (vVar2 instanceof ld.p) {
            ((ld.p) vVar2).E0(i10);
        }
        this.O.E0(i10);
    }

    private void setPreviewOverlayFactor(float f10) {
        if (this.f19782t0 != f10) {
            this.f19782t0 = f10;
            this.V.setAlpha(1.0f - f10);
            this.V.invalidate();
        }
    }

    private void setRotateFactor(float f10) {
        if (this.f19788z0 != f10) {
            this.f19788z0 = f10;
            e0();
        }
    }

    private void setVideoReady(boolean z10) {
        if (this.D0 != z10) {
            this.D0 = z10;
            o0();
        }
    }

    public void A0() {
        t1 t1Var = this.U;
        if (t1Var != null) {
            t1Var.O();
        }
    }

    public void B0() {
        G0(true, true);
        t1 t1Var = this.U;
        if (t1Var != null) {
            t1Var.t0();
        }
    }

    public final void C0() {
        if (this.U == null) {
            e eVar = new e(getContext());
            this.W = eVar;
            eVar.setLayoutParams(FrameLayoutFix.q1(-1, -1));
            t1 t1Var = new t1(getContext(), this.W, 0);
            this.U = t1Var;
            t1Var.D0();
            this.U.k0(this.f19763b0);
            this.U.z0(this);
            this.U.A0(this);
            this.E0 = true;
            addView(this.W, 0);
            d0(false);
            return;
        }
        w0(true);
    }

    public final void D0() {
        G0(false, false);
        this.F0 = false;
        this.D0 = false;
        this.G0 = -1L;
        this.H0 = -1L;
    }

    public void E0(float f10) {
        t1 t1Var = this.U;
        if (t1Var != null) {
            t1Var.y0(f10);
        }
    }

    public void F0() {
        this.f19766d0 = true;
    }

    public final void G0(boolean z10, boolean z11) {
        if (this.E0 != z10) {
            this.E0 = z10;
            if (z10) {
                C0();
                t1 t1Var = this.U;
                if (t1Var != null) {
                    t1Var.L0(this.f19760a);
                }
                b bVar = this.C0;
                if (bVar != null) {
                    bVar.l1(this.f19760a, this.F0);
                    return;
                }
                return;
            }
            o0();
            this.f19761a0.e(false, false);
            if (z11) {
                j0.d0(new Runnable() {
                    @Override
                    public final void run() {
                        o.this.s0();
                    }
                });
                return;
            }
            t1 t1Var2 = this.U;
            if (t1Var2 != null) {
                t1Var2.L0(null);
            }
        }
    }

    public void H0(qd.b bVar, boolean z10, int i10, float f10) {
        qd.b bVar2 = this.f19760a;
        if (bVar2 != bVar) {
            if (bVar2 != null) {
                b0();
                this.f19760a.p(this.V);
                this.f19760a.p(this.T);
                if ((this.f19763b0 && this.f19760a.n0()) || (z10 && !this.f19760a.f0() && !this.f19760a.n0())) {
                    this.f19760a.s0();
                }
            }
            this.f19760a = bVar;
            this.f19761a0.setProgressVisibleInstant(false);
            if (y0()) {
                j0.e(this.f19785w0);
                c0();
            } else {
                j0.e0(this.f19785w0, 350L);
            }
            this.R.w();
            D0();
            L0();
            d0(false);
            h hVar = null;
            if (bVar == null) {
                this.N.G(null);
                this.O.G(null);
                this.M.r(null);
                this.f19764c.G(null);
                return;
            }
            this.O.G(bVar.B());
            if (!bVar.n0() || !bVar.e0() || !bVar.f0() || z10) {
                ld.p pVar = this.N;
                this.P = pVar;
                if (z10) {
                    bVar.f0();
                    if (!bVar.n0()) {
                        hVar = bVar.T(i10, true);
                    }
                    if (hVar != null) {
                        k0(1.0f);
                        this.N.G(hVar);
                    } else {
                        this.N.G(bVar.F());
                    }
                } else if (!this.f19766d0) {
                    if (this.f19770h0 != 0.0f || !bVar.d0()) {
                        hVar = bVar.F();
                    }
                    pVar.G(hVar);
                }
            } else {
                m mVar = this.M;
                this.P = mVar;
                mVar.r(bVar.Q());
            }
            this.Q = bVar.d0() ? this.M : this.f19764c;
            if (!this.f19763b0 || bVar.F() == null) {
                x0(z10, f10);
            }
            u0();
            bVar.e(this.T, this, this);
            if (!z10) {
                j0();
            }
        }
    }

    public void I0(int i10, int i11, int i12) {
        t1 t1Var;
        if (this.f19776n0 != i10 || this.f19774l0 != i11 || this.f19775m0 != i12) {
            this.f19776n0 = i10;
            this.f19774l0 = i11;
            this.f19775m0 = i12;
            u0();
            n0();
            qd.b bVar = this.f19760a;
            if (bVar != null && bVar.n0() && this.E0 && (t1Var = this.U) != null) {
                t1Var.w0();
            }
        }
    }

    public final void J0(float f10, boolean z10) {
        qd.b bVar;
        float f11 = this.f19786x0;
        if (f11 != f10 || !z10) {
            this.f19786x0 = f10;
            boolean z11 = f11 != f10;
            if (z10 && ib.h.k(f10 + 90.0f, 360.0f) == f11) {
                k kVar = this.f19787y0;
                if (kVar == null) {
                    this.f19787y0 = new k(0, this, db.b.f7287b, 180L, 1.0f);
                } else {
                    kVar.l(1.0f);
                }
                this.f19788z0 = 1.0f;
                e0();
                this.A0 = false;
                if (z11) {
                    v0(true);
                    this.T.invalidate();
                    if (!(this.U == null || (bVar = this.f19760a) == null || bVar.Z() / this.f19760a.A() == 1.0f)) {
                        this.A0 = true;
                        this.U.w0();
                    }
                }
                if (!this.A0) {
                    this.f19787y0.i(0.0f);
                }
            } else if (z11) {
                k kVar2 = this.f19787y0;
                if (kVar2 != null) {
                    kVar2.l(1.0f);
                }
                this.A0 = false;
                this.f19788z0 = 0.0f;
                e0();
                v0(true);
                this.T.invalidate();
            } else {
                e0();
            }
        }
    }

    @Override
    public void J5(m1.f fVar) {
        if (!this.f19766d0) {
            x0(false, 1.0f);
        }
        Y(false);
    }

    public void K0() {
        qd.b bVar;
        if (this.U != null && (bVar = this.f19760a) != null && bVar.n0()) {
            this.f19760a.f0();
            if (this.f19760a.X() == 4) {
                this.U.G0(this.f19760a.p0());
            }
        }
    }

    public final void L0() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (!(childAt == null || childAt == this.V)) {
                this.R.C(this, childAt);
            }
        }
    }

    @Override
    public void Q2() {
        h0();
    }

    @Override
    public void T3(m1.f fVar) {
        if (this.f19766d0) {
            x0(false, 1.0f);
        }
    }

    public final void W() {
        if (this.f19781s0 == null) {
            this.f19781s0 = new k(1, this, db.b.f7287b, 120L, this.f19782t0);
        }
        qd.b bVar = this.f19760a;
        if (bVar != null) {
            bVar.f0();
        }
        k0(0.0f);
    }

    public void X() {
        this.M.e();
        this.f19764c.e();
        this.N.e();
        this.O.e();
    }

    public void Y(boolean z10) {
        qd.b bVar = this.f19760a;
        if (bVar != null && bVar.n0()) {
            if (!z10 || this.f19760a.e0()) {
                this.f19760a.f0();
                if (this.f19760a.j0() && !this.f19767e0) {
                    if (!this.f19760a.e0()) {
                        ya.o1().w2().A0(8);
                    }
                    if (fd.a.f11891m) {
                        G0(true, true);
                        t1 t1Var = this.U;
                        if (t1Var != null && !t1Var.q0()) {
                            this.U.u0();
                        }
                        this.f19760a.x0(1.0f);
                        return;
                    }
                    v0.n2(j0.r(getContext()).Q1().F(), this.f19760a.N());
                }
            }
        }
    }

    public boolean Z(boolean z10) {
        return getVisibility() == 0 && (getParent() instanceof b0) && ((b0) getParent()).f2(z10) && this.f19760a != null && this.f19770h0 == 1.0f;
    }

    @Override
    public void a(final h hVar, int i10, boolean z10) {
        j0.d0(new Runnable() {
            @Override
            public final void run() {
                o.this.r0(hVar);
            }
        });
    }

    public boolean a0() {
        if (!Z(false) || getVisibility() != 0 || this.f19760a == null || getAlpha() != 1.0f) {
            return false;
        }
        this.f19760a.f0();
        return this.f19770h0 == 1.0f && this.f19762b == 0.0f && ((b0) getParent()).L1(this);
    }

    @Override
    public void b(Rect rect) {
        int i10;
        int i11;
        int width = this.Q.getWidth();
        int height = this.Q.getHeight();
        qd.b bVar = this.f19760a;
        if (bVar == null) {
            i11 = 0;
            i10 = 0;
        } else if (!bVar.b0() || !this.f19760a.n0()) {
            i11 = this.f19760a.Z();
            i10 = this.f19760a.A();
        } else {
            i11 = this.f19760a.A();
            i10 = this.f19760a.Z();
        }
        if (!(i11 == 0 || i10 == 0)) {
            float f10 = i11;
            float f11 = i10;
            float min = Math.min(width / f10, height / f11);
            i11 = (int) (f10 * min);
            i10 = (int) (f11 * min);
        }
        int i12 = i11 / 2;
        rect.left = this.Q.J0() - i12;
        int i13 = i10 / 2;
        rect.top = this.Q.x0() - i13;
        rect.right = this.Q.J0() + i12;
        rect.bottom = this.Q.x0() + i13;
    }

    public final void b0() {
        k0(0.0f);
        kb.b bVar = this.f19783u0;
        if (bVar != null) {
            bVar.c();
            this.f19783u0 = null;
        }
    }

    @Override
    public void c(boolean z10) {
        od.e eVar = this.f19761a0;
        qd.b bVar = this.f19760a;
        eVar.e(z10, bVar != null && bVar.x().F());
    }

    public final void c0() {
        qd.b bVar;
        boolean y02 = y0();
        if (this.f19784v0 != y02) {
            this.f19784v0 = y02;
            if (y02 && (bVar = this.f19760a) != null && bVar.Q() != null && !(getParent() instanceof b0)) {
                md.e.L(this.f19760a.Q());
            }
            md.e.n(y02 ? 1 : -1);
        }
    }

    @Override
    public void d(float f10, float f11) {
        v vVar = this.Q;
        if ((vVar instanceof ld.p) && !((ld.p) vVar).x()) {
            vVar = this.N;
        }
        qd.b bVar = this.f19760a;
        int Z = bVar != null ? bVar.Z() : 0;
        qd.b bVar2 = this.f19760a;
        if (vVar.h1(f10, f11, Z, bVar2 != null ? bVar2.A() : 0) && Z(false)) {
            ((b0) getParent()).k2(f10, f11);
        }
    }

    public void d0(boolean z10) {
        qd.b bVar = this.f19760a;
        if (bVar != null) {
            J0(bVar.n0() ? this.f19760a.E() : 0.0f, z10);
        }
    }

    @Override
    public void e(TdApi.File file, int i10) {
        qd.b bVar;
        qd.b bVar2 = this.f19760a;
        boolean z10 = true;
        if (bVar2 == null || !bVar2.n0()) {
            qd.b bVar3 = this.f19760a;
            if (bVar3 == null || !bVar3.n0() || i10 != 2) {
                z10 = false;
            }
            setCanSeek(z10);
        } else {
            setCanSeek(true);
        }
        if (i10 != 2) {
            return;
        }
        if (this.f19763b0 || ((bVar = this.f19760a) != null && bVar.a0())) {
            Y(false);
        }
    }

    public final void e0() {
        int i10;
        int i11;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        qd.b bVar = this.f19760a;
        if (bVar != null) {
            if (!bVar.n0() ? !this.f19760a.i0() : !this.f19760a.b0()) {
                i11 = this.f19760a.Z();
                i10 = this.f19760a.A();
            } else {
                i11 = this.f19760a.A();
                i10 = this.f19760a.Z();
            }
            if (i11 != 0 && i10 != 0) {
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                if (!this.f19760a.n0() || !this.f19760a.k0() ? measuredWidth <= measuredHeight : measuredWidth >= measuredHeight) {
                    f11 = i11;
                    f10 = i10;
                } else {
                    f11 = i10;
                    f10 = i11;
                }
                float f15 = this.f19788z0;
                float f16 = 90.0f * f15;
                float f17 = (((f11 / f10) - 1.0f) * f15) + 1.0f;
                this.T.setRotation(f16);
                this.T.setScaleX(f17);
                this.T.setScaleY(f17);
                if (measuredWidth > measuredHeight) {
                    f12 = i10;
                    f13 = i11;
                } else {
                    f12 = i11;
                    f13 = i10;
                }
                t1 t1Var = this.U;
                View l02 = t1Var != null ? t1Var.l0() : null;
                if (l02 != null) {
                    l02.setRotation(this.f19786x0 + f16);
                    if (this.f19760a.i0()) {
                        f14 = (((f13 / f12) - 1.0f) * (1.0f - this.f19788z0)) + 1.0f;
                    } else {
                        f14 = (((f12 / f13) - 1.0f) * this.f19788z0) + 1.0f;
                    }
                    l02.setScaleX(f14);
                    l02.setScaleY(f14);
                }
            }
        }
    }

    @Override
    public boolean f() {
        if (!a0()) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        j0.r(getContext()).n3(4, true);
        ((b0) getParent()).O1();
        this.B0 = true;
        return true;
    }

    public void f0(boolean z10) {
        qd.b bVar;
        t1 t1Var = this.U;
        if (t1Var != null && t1Var.a0()) {
            this.H0 = -1L;
            this.G0 = -1L;
        }
        if (z10 && (bVar = this.f19760a) != null && bVar.n0() && !this.f19760a.e0()) {
            final qd.b bVar2 = this.f19760a;
            final h S = bVar2.S(true);
            ImageLoader.e().g(S, new b.c() {
                @Override
                public final void b(boolean z11, Bitmap bitmap) {
                    o.this.q0(bVar2, S, z11, bitmap);
                }
            });
        }
    }

    @Override
    public void g(TdApi.File file, float f10) {
        if (this.C0 != null) {
            this.C0.L(this.f19760a, t2.p1(file) + t2.r1(file));
        }
    }

    public final void g0() {
        int i10 = Math.abs(this.f19762b) == 1.0f ? 4 : 0;
        if (getVisibility() != i10) {
            setVisibility(i10);
        }
    }

    public p getDetector() {
        return this.R;
    }

    public float getFactor() {
        return this.f19762b;
    }

    public ld.p getImageReceiver() {
        v vVar = this.Q;
        ld.p pVar = this.f19764c;
        if (vVar == pVar) {
            return pVar;
        }
        return null;
    }

    public qd.b getMedia() {
        return this.f19760a;
    }

    public v getReceiver() {
        return this.Q;
    }

    public long getTimeNow() {
        return this.G0;
    }

    public long getTimeTotal() {
        return this.H0;
    }

    public float getZoomFactor() {
        return this.R.k();
    }

    @Override
    public void h() {
        this.f19761a0.e(false, false);
    }

    public void h0() {
        setMedia(null);
        this.f19761a0.Q2();
        this.f19764c.b0();
        this.M.b0();
        this.N.b0();
        this.O.b0();
        t1 t1Var = this.U;
        if (t1Var != null) {
            t1Var.b0();
        }
        this.f19767e0 = true;
    }

    @Override
    public void i() {
        getParent().requestDisallowInterceptTouchEvent(false);
        j0.r(getContext()).n3(4, false);
    }

    public void i0() {
        this.M.b();
        this.f19764c.b();
        this.N.b();
        this.O.b();
    }

    @Override
    public void j(boolean z10) {
        if (this.F0 != z10) {
            this.F0 = z10;
            o0();
            b bVar = this.C0;
            if (bVar != null) {
                bVar.u5(this.f19760a, z10);
            }
        }
    }

    public final void j0() {
        qd.b bVar = this.f19760a;
        if (bVar != null) {
            g1 x10 = bVar.x();
            boolean z10 = true;
            if (x10 != null) {
                x10.s0(true);
            }
            this.f19760a.c(this.V);
            qd.b bVar2 = this.f19760a;
            if (bVar2.n0() && !this.f19763b0) {
                z10 = false;
            }
            bVar2.q(z10);
            if (x10 != null) {
                x10.s0(false);
            }
        }
    }

    @Override
    public boolean k(g1 g1Var, View view, TdApi.File file, long j10) {
        qd.b bVar = this.f19760a;
        if (bVar == null || !bVar.n0()) {
            return false;
        }
        if (!fd.a.f11891m) {
            if (this.f19760a.f0()) {
                v0.n2(j0.r(getContext()).Q1().F(), this.f19760a.N());
            }
            return true;
        } else if ((this.F0 || this.E0 || this.f19760a.a0()) && view == getParent()) {
            return false;
        } else {
            G0(true, true);
            t1 t1Var = this.U;
            if (t1Var != null) {
                t1Var.u0();
            }
            return true;
        }
    }

    public final void k0(float f10) {
        k kVar = this.f19781s0;
        if (kVar != null) {
            kVar.l(f10);
        }
        setPreviewOverlayFactor(f10);
    }

    @Override
    public boolean l() {
        return getParent() != null && ((b0) getParent()).K1(this);
    }

    public boolean l0() {
        return !this.Q.e0() || !this.P.e0() || !this.M.e0() || !this.O.e0() || this.E0;
    }

    @Override
    public boolean m(float f10, float f11) {
        if (!((b0) getParent()).I1() || this.f19760a == null || !a0()) {
            return false;
        }
        if (!this.f19760a.n0()) {
            return true;
        }
        int i10 = a0.i(28.0f);
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        return f10 < ((float) (measuredWidth - i10)) || f10 > ((float) (measuredWidth + i10)) || f11 < ((float) (measuredHeight - i10)) || f11 > ((float) (measuredHeight + i10));
    }

    public void m0(qd.b bVar) {
        if (this.f19760a == bVar && bVar != null) {
            if (bVar.d0()) {
                this.M.r(bVar.Q());
            } else {
                this.f19764c.G(bVar.S(true));
            }
        }
    }

    @Override
    public void n(Rect rect) {
        rect.left = 0;
        rect.top = 0;
        rect.right = getMeasuredWidth();
        rect.bottom = getMeasuredHeight();
    }

    public final void n0() {
        this.S.invalidate();
        this.V.invalidate();
        this.T.invalidate();
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 0) {
            setRotateFactor(f10);
        } else if (i10 == 1) {
            setPreviewOverlayFactor(f10);
        }
    }

    @Override
    public void o() {
        L0();
    }

    public final void o0() {
        this.T.invalidate();
        this.V.invalidate();
    }

    @Override
    public void o1(m1.f fVar) {
        B0();
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        if (i10 == 0) {
            t1 t1Var = this.U;
            if (t1Var != null) {
                t1Var.w0();
            }
            J0(this.f19786x0, false);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = motionEvent.getAction() == 0;
        if (z10) {
            this.B0 = false;
        }
        if (Z(z10)) {
            this.R.r(motionEvent);
        }
        return this.B0 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int childCount = getChildCount();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i22 = this.f19777o0 - (this.f19776n0 * 2);
        int i23 = this.f19778p0 - this.f19775m0;
        qd.b bVar = this.f19760a;
        if (bVar == null) {
            i15 = 0;
            i14 = 0;
        } else if (!bVar.n0() || !this.f19760a.k0()) {
            i15 = this.f19760a.Z();
            i14 = this.f19760a.A();
        } else {
            i15 = this.f19760a.A();
            i14 = this.f19760a.Z();
        }
        if (i15 == 0 || i14 == 0) {
            i19 = i22;
            i17 = i19;
            i18 = i23;
            i16 = i18;
        } else {
            pd.c v10 = this.f19760a.v();
            if (v10 == null || v10.m()) {
                i21 = i15;
                i20 = i14;
            } else {
                double g10 = v10.g() - v10.d();
                double b10 = v10.b() - v10.i();
                i21 = (int) (i15 * g10);
                i20 = (int) (i14 * b10);
            }
            float f10 = i22;
            float f11 = i15;
            float f12 = i23;
            float f13 = i14;
            float min = Math.min(f10 / f11, f12 / f13);
            i19 = (int) (f11 * min);
            i18 = (int) (f13 * min);
            float f14 = i21;
            float f15 = i20;
            float min2 = Math.min(f10 / f14, f12 / f15);
            i17 = (int) (f14 * min2);
            i16 = (int) (f15 * min2);
        }
        int i24 = this.f19776n0 + (i22 / 2);
        int i25 = i23 / 2;
        int i26 = i19 / 2;
        int i27 = i24 - i26;
        int i28 = i26 + i24;
        int i29 = i18 / 2;
        int i30 = i25 - i29;
        int i31 = i29 + i25;
        int i32 = i17 / 2;
        int i33 = i16 / 2;
        for (int i34 = 0; i34 < childCount; i34++) {
            View childAt = getChildAt(i34);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (childAt instanceof rd.e) {
                ((rd.e) childAt).t(i24, i25);
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else if (layoutParams == null || layoutParams.width != -2 || layoutParams.height != -2 || this.f19763b0) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else {
                childAt.layout(i27, i30, i28, i31);
            }
        }
        L0();
        d0(false);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (!this.f19763b0 || this.f19760a == null) {
            setMeasuredDimension(i10, i11);
            int childCount = getChildCount();
            int i18 = this.f19777o0 - (this.f19776n0 * 2);
            int i19 = this.f19778p0 - this.f19775m0;
            qd.b bVar = this.f19760a;
            if (bVar == null) {
                i13 = 0;
                i12 = 0;
            } else if (!bVar.n0() || !this.f19760a.k0()) {
                i13 = this.f19760a.Z();
                i12 = this.f19760a.A();
            } else {
                i13 = this.f19760a.A();
                i12 = this.f19760a.Z();
            }
            if (i13 == 0 || i12 == 0) {
                i15 = i18;
                i14 = i19;
            } else {
                pd.c v10 = this.f19760a.v();
                if (v10 == null || v10.m()) {
                    i17 = i13;
                    i16 = i12;
                } else {
                    i17 = (int) (i13 * (v10.g() - v10.d()));
                    i16 = (int) (i12 * (v10.b() - v10.i()));
                }
                float f10 = i18;
                float f11 = i13;
                float f12 = i19;
                float f13 = i12;
                float min = Math.min(f10 / f11, f12 / f13);
                i18 = (int) (f11 * min);
                i19 = (int) (f13 * min);
                float f14 = i17;
                float f15 = i16;
                float min2 = Math.min(f10 / f14, f12 / f15);
                i15 = (int) (f14 * min2);
                i14 = (int) (f15 * min2);
            }
            for (int i20 = 0; i20 < childCount; i20++) {
                View childAt = getChildAt(i20);
                if (childAt instanceof rd.e) {
                    ((rd.e) childAt).v(i18, i19, i15, i14);
                    measureChild(childAt, i10, i11);
                } else {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams != null && layoutParams.width == -2 && layoutParams.height == -2) {
                        measureChild(childAt, View.MeasureSpec.makeMeasureSpec(i18, Log.TAG_TDLIB_OPTIONS), View.MeasureSpec.makeMeasureSpec(i19, Log.TAG_TDLIB_OPTIONS));
                    } else {
                        measureChild(childAt, i10, i11);
                    }
                }
            }
            L0();
            d0(false);
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11) - (this.f19765c0.B() ? a0.i(56.0f) : 0);
        int z10 = this.f19765c0.z();
        float Z = this.f19760a.Z();
        float A = this.f19760a.A();
        float min3 = Math.min(size / Z, size2 / A);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(z10, (int) (Z * min3)), Log.TAG_TDLIB_OPTIONS);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((int) (A * min3), Log.TAG_TDLIB_OPTIONS);
        setMeasuredDimension(makeMeasureSpec, makeMeasureSpec2);
        u0();
        measureChildren(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10 = Z(motionEvent.getAction() == 0) && this.R.r(motionEvent);
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            this.B0 = false;
        }
        return z10;
    }

    @Override
    public void p(long j10, long j11) {
        this.G0 = j11;
        this.H0 = j10;
        b bVar = this.C0;
        if (bVar != null) {
            bVar.g(this.f19760a, j11, j10, (float) (j11 / j10));
        }
    }

    @Override
    public void q() {
        setVideoReady(true);
    }

    @Override
    public void run() {
        k kVar = this.f19769g0;
        if (kVar != null) {
            kVar.i(1.0f);
            this.f19769g0 = null;
        }
    }

    public void setBoundForceTouchContext(m1.f fVar) {
        this.f19763b0 = true;
        this.f19765c0 = fVar;
    }

    public void setCallback(b bVar) {
        this.C0 = bVar;
    }

    public void setDisableAnimations(boolean z10) {
        this.Q.S0(z10);
        this.P.S0(z10);
        this.O.S0(z10);
    }

    public void setDisappearing(boolean z10) {
        qd.b bVar;
        this.f19771i0 = z10;
        if (z10) {
            float f10 = 0.0f;
            if (this.F0 && (bVar = this.f19760a) != null) {
                bVar.x0(0.0f);
            }
            qd.b bVar2 = this.f19760a;
            if (bVar2 != null) {
                f10 = bVar2.u();
            }
            this.f19772j0 = f10;
            G0(false, true);
        }
    }

    public void setFactor(float f10) {
        if (this.f19762b != f10) {
            this.f19762b = f10;
            float f11 = 1.0f;
            int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            float f12 = i10 < 0 ? f10 + 1.0f : 1.0f;
            if (this.f19773k0 != f12) {
                this.f19773k0 = f12;
                this.S.a(f12 == 0.0f ? 0.0f : 1.0f - f12);
                o0();
            }
            if (i10 < 0) {
                float f13 = (f10 * 0.25f) + 1.0f;
                setScaleX(f13);
                setScaleY(f13);
                setTranslationX(0.0f);
            } else if (f10 > 0.0f) {
                setScaleX(1.0f);
                setScaleY(1.0f);
                float f14 = this.f19777o0 * f10;
                if (!w.G2()) {
                    f11 = -1.0f;
                }
                setTranslationX((int) (f14 * f11));
            } else {
                setScaleX(1.0f);
                setScaleY(1.0f);
                setTranslationX(0.0f);
            }
            g0();
        }
    }

    public void setMedia(qd.b bVar) {
        H0(bVar, false, 0, 1.0f);
    }

    public void setRevealFactor(float f10) {
        qd.b bVar;
        if (this.f19770h0 != f10) {
            this.f19770h0 = f10;
            if (this.f19760a != null) {
                float d10 = ib.h.d(f10);
                this.f19760a.f0();
                if (!this.f19760a.n0() || !this.f19760a.j0()) {
                    this.f19760a.x0(d10);
                } else if (this.f19771i0) {
                    float f11 = this.f19772j0;
                    this.f19760a.x0(f11 + ((1.0f - f11) * (1.0f - d10)));
                } else {
                    this.f19760a.x0(1.0f - d10);
                }
            }
            u0();
            if (this.f19771i0 && (bVar = this.f19760a) != null && qd.b.c0(bVar.X())) {
                this.Q.setAlpha(Math.max(0.0f, Math.min(1.0f, f10)));
            }
            n0();
        }
    }

    public void setSeekProgress(float f10) {
        t1 t1Var = this.U;
        if (t1Var != null) {
            t1Var.J0(f10);
        }
    }

    public void setTargetAnimator(k kVar) {
        if (!this.Q.e0()) {
            this.f19769g0 = null;
            kVar.i(1.0f);
            return;
        }
        this.f19769g0 = kVar;
        j0.e0(this, 134L);
    }

    public void setTargetLocation(l1 l1Var) {
        this.f19768f0 = l1Var;
    }

    public void t0(int i10, int i11, int i12, int i13, int i14) {
        this.f19777o0 = i13;
        this.f19778p0 = i14;
        this.f19776n0 = i10;
        this.f19774l0 = i11;
        this.f19775m0 = i12;
        u0();
    }

    public final void u0() {
        v0(false);
    }

    public final void v0(boolean z10) {
        qd.b bVar;
        int i10;
        int i11;
        float f10;
        float f11;
        float max;
        int i12;
        int i13;
        int i14;
        int i15;
        qd.b bVar2;
        if (!this.f19763b0 || (bVar2 = this.f19760a) == null) {
            l1 l1Var = this.f19768f0;
            if (l1Var == null || this.f19770h0 == 1.0f || (bVar = this.f19760a) == null) {
                v vVar = this.Q;
                int i16 = this.f19776n0;
                if (!vVar.K0(i16, this.f19774l0, this.f19777o0 - i16, this.f19778p0 - this.f19775m0) && z10) {
                    this.Q.l();
                }
                v vVar2 = this.P;
                int i17 = this.f19776n0;
                if (!vVar2.K0(i17, this.f19774l0, this.f19777o0 - i17, this.f19778p0 - this.f19775m0) && z10) {
                    this.P.l();
                }
                ld.p pVar = this.O;
                int i18 = this.f19776n0;
                if (!pVar.K0(i18, this.f19774l0, this.f19777o0 - i18, this.f19778p0 - this.f19775m0) && z10) {
                    this.O.l();
                }
                setPivotX(this.Q.J0());
                setPivotY(this.Q.x0());
                setImageRadius(0);
                return;
            }
            int i19 = l1Var.f19715a;
            int i20 = l1Var.f19716b;
            int i21 = l1Var.f19717c;
            int i22 = l1Var.f19718d;
            if (!bVar.n0() || !this.f19760a.b0()) {
                i11 = this.f19760a.Z();
                i10 = this.f19760a.A();
            } else {
                i11 = this.f19760a.A();
                i10 = this.f19760a.Z();
            }
            this.f19779q0 = 0;
            this.f19780r0 = 0;
            int i23 = i21 - i19;
            int i24 = i22 - i20;
            float f12 = i23;
            float f13 = i24;
            if (Math.max(f12 / i11, f13 / i10) != 1.0f) {
                this.f19780r0 = (int) (((((int) (f10 * max)) - i23) / 2) * Math.max(0.0f, Math.min(1.0f, 1.0f - this.f19770h0)));
                this.f19779q0 = (int) (((((int) (f11 * max)) - i24) / 2) * Math.max(0.0f, Math.min(1.0f, 1.0f - this.f19770h0)));
            }
            float f14 = this.f19770h0;
            if (f14 >= 0.0f) {
                int i25 = this.f19776n0;
                int i26 = this.f19780r0;
                i14 = (i19 + ((int) ((i25 - i19) * f14))) - i26;
                int i27 = this.f19779q0;
                i13 = (i20 + ((int) ((this.f19774l0 - i20) * f14))) - i27;
                i12 = i21 + ((int) (((this.f19777o0 - i25) - i21) * f14)) + i26;
                i15 = i22 + ((int) (((this.f19778p0 - this.f19775m0) - i22) * f14)) + i27;
            } else {
                int a10 = this.f19768f0.a();
                int b10 = this.f19768f0.b();
                float f15 = this.f19770h0;
                int i28 = i24 + ((int) (f13 * f15));
                int i29 = (i23 + ((int) (f12 * f15))) / 2;
                int i30 = this.f19780r0;
                i14 = (a10 - i29) - i30;
                int i31 = i28 / 2;
                int i32 = this.f19779q0;
                i13 = (b10 - i31) - i32;
                i12 = a10 + i29 + i30;
                i15 = b10 + i31 + i32;
            }
            setImageRadius(i11 != i10 ? 0 : (int) (this.f19768f0.d() * (1.0f - ib.h.d(this.f19770h0))));
            if (!this.Q.K0(i14, i13, i12, i15) && z10) {
                this.Q.l();
            }
            if (!this.P.K0(i14, i13, i12, i15) && z10) {
                this.P.l();
            }
            if (!this.O.K0(i14, i13, i12, i15) && z10) {
                this.O.l();
            }
            setPivotX((i14 + i12) / 2);
            setPivotY((i13 + i15) / 2);
            return;
        }
        int Z = bVar2.Z();
        int A = this.f19760a.A();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f16 = Z;
        float f17 = A;
        float min = Math.min(measuredWidth / f16, measuredHeight / f17);
        int i33 = (int) (f16 * min);
        int i34 = (int) (f17 * min);
        int i35 = (measuredWidth / 2) - (i33 / 2);
        int i36 = i33 + i35;
        int i37 = (measuredHeight / 2) - (i34 / 2);
        int i38 = i34 + i37;
        if (!this.P.K0(i35, i37, i36, i38) && z10) {
            this.P.l();
        }
        if (!this.O.K0(i35, i37, i36, i38) && z10) {
            this.O.l();
        }
        if (!this.Q.K0(i35, i37, i36, i38) && z10) {
            this.Q.l();
        }
        setPivotX((i35 + i36) / 2);
        setPivotY((i37 + i38) / 2);
    }

    public final void w0(boolean z10) {
        t1 t1Var = this.U;
        if (t1Var != null) {
            t1Var.w0();
            d0(false);
        }
    }

    @Override
    public void w4(m1.f fVar) {
    }

    public void x0(boolean r7, float r8) {
        throw new UnsupportedOperationException("Method not decompiled: od.o.x0(boolean, float):void");
    }

    public final boolean y0() {
        qd.b bVar = this.f19760a;
        return bVar != null && bVar.n0() && this.f19760a.e0();
    }

    public void z0() {
        t1 t1Var = this.U;
        if (t1Var != null) {
            t1Var.g0();
        }
    }
}
