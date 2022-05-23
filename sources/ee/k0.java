package ee;

import ae.j;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import ce.a0;
import ce.y;
import db.b;
import eb.f;
import eb.k;
import gd.w;
import he.i;
import ib.h;
import je.g;
import org.thunderdog.challegram.R;

public class k0 extends l0 implements k.b {
    public final Paint N;
    public final Paint O;
    public final Paint P;
    public a T;
    public Rect f11690b0;
    public Rect f11691c0;
    public Rect f11692d0;
    public RectF f11693e0;
    public RectF f11694f0;
    public int f11696h0;
    public int f11697i0;
    public int f11698j0;
    public final f f11699k0;
    public final f f11700l0;
    public final f f11701m0;
    public final f f11702n0;
    public g f11703o0;
    public g f11704p0;
    public g f11705q0;
    public boolean f11708t0;
    public boolean f11709u0;
    public boolean f11710v0;
    public boolean f11711w0;
    public boolean f11712x0;
    public int f11713y0;
    public final a Q = new a();
    public final a R = new a();
    public final a S = new a();
    public final Path U = new Path();
    public final Path V = new Path();
    public final Path W = new Path();
    public final Path f11689a0 = new Path();
    public final int f11695g0 = a0.i(20.0f);
    public float f11706r0 = 1.0f;
    public float f11707s0 = 0.0f;

    public static final class a {
        public float f11714a;
        public float f11715b;
        public float f11716c;

        public a() {
        }

        public void a(a aVar) {
            b(aVar.f11714a, aVar.f11715b, aVar.f11716c);
        }

        public void b(float f10, float f11, float f12) {
            this.f11714a = f10;
            this.f11715b = f11;
            this.f11716c = f12;
        }

        public a(float f10, float f11, float f12) {
            this.f11714a = f10;
            this.f11715b = f11;
            this.f11716c = f12;
        }
    }

    public k0(Context context) {
        super(context);
        Paint paint = new Paint();
        this.N = paint;
        Paint paint2 = new Paint(1);
        this.O = paint2;
        Paint paint3 = new Paint(1);
        this.P = paint3;
        LinearInterpolator linearInterpolator = b.f7290e;
        this.f11699k0 = new f(1, this, linearInterpolator, 750L, false);
        OvershootInterpolator overshootInterpolator = b.f7291f;
        this.f11700l0 = new f(0, this, overshootInterpolator, 350L, false);
        this.f11701m0 = new f(2, this, linearInterpolator, 150L, false);
        this.f11702n0 = new f(3, this, overshootInterpolator, 750L, true);
        paint.setColor(2130706432);
        paint2.setColor(j.L(R.id.theme_color_white));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(a0.i(2.0f));
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint3.setColor(-65536);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(a0.i(2.0f));
        paint3.setStrokeJoin(Paint.Join.ROUND);
    }

    public static int O1() {
        return -65536;
    }

    public static int P1() {
        return -1;
    }

    @Override
    public void A1() {
        this.f11701m0.p(true, true);
    }

    @Override
    public void B1(float f10) {
        this.f11707s0 = f10;
        invalidate();
    }

    @Override
    public void D1(RectF rectF, int i10, int i11, int i12, boolean z10) {
        float f10;
        if (!this.f11709u0) {
            this.f11701m0.p(false, false);
            this.f11701m0.l(z10 ? 250L : 150L);
            if (rectF == null) {
                this.f11699k0.p(true, false);
                return;
            }
            float f11 = i11;
            float width = getWidth() / f11;
            float f12 = i10;
            float height = getHeight() / f12;
            float f13 = f11 / 2.0f;
            float width2 = (getWidth() / 2.0f) + (rectF.left - f13);
            float width3 = (getWidth() / 2.0f) + (rectF.right - f13);
            float height2 = (getHeight() / 2.0f) + (rectF.top - (f12 / 2.0f));
            if (i.c2().q0() == 3) {
                width = this.f11698j0 / f11;
                RectF rectF2 = new RectF(rectF.left * width, rectF.top * height, rectF.right * width, rectF.bottom * height);
                height2 = rectF2.top;
                f10 = Math.max(rectF2.width(), rectF2.height());
            } else {
                f10 = width3 - width2;
            }
            if (this.f11712x0) {
                this.f11705q0 = new g.b(w.T("camera = %s x %s, view = %s x %s, cameraView = %s x %s\naspect = %s, zxing = %s\nsx: %s, sy: %s\nX: %s, Y: %s, size: %s\nSource bounds: %s (width: %s)", null, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(getHeight()), Integer.valueOf(getWidth()), Integer.valueOf(this.f11697i0), Integer.valueOf(this.f11696h0), Integer.valueOf(i.c2().q0()), Boolean.valueOf(z10), Float.valueOf(width), Float.valueOf(height), Float.valueOf(width2), Float.valueOf(height2), Float.valueOf(f10), rectF, Float.valueOf(rectF.width())).toString(), getWidth(), y.A0(14.0f), i0.f11647a).f();
                this.f11693e0 = rectF;
                this.f11694f0 = new RectF(rectF.left * width, rectF.top * height, rectF.right * width, rectF.bottom * height);
            }
            K1(width2, height2, f10);
            this.f11699k0.p(true, true);
            this.f11702n0.p(false, true);
        }
    }

    @Override
    public void E1(boolean z10, boolean z11) {
        this.f11708t0 = z10;
        this.f11712x0 = z11 || i.c2().V2();
        this.f11709u0 = false;
        this.S.b(0.0f, 0.0f, 0.0f);
        invalidate();
    }

    @Override
    public void G1(int i10) {
        this.f11713y0 = i10;
        g gVar = this.f11703o0;
        if (gVar != null) {
            S1(gVar.h0());
        }
    }

    public final void K1(float f10, float f11, float f12) {
        this.R.a(this.S);
        this.T = new a(f10, f11, f12);
        this.f11700l0.p(false, false);
        this.f11700l0.p(true, true);
    }

    public final int L1() {
        return this.M.t().c1();
    }

    public final void R1() {
        a aVar = this.S;
        float f10 = aVar.f11714a;
        float f11 = aVar.f11715b;
        float f12 = aVar.f11716c;
        this.U.reset();
        this.U.moveTo(f10, this.f11695g0 + f11);
        this.U.lineTo(f10, f11);
        this.U.lineTo(this.f11695g0 + f10, f11);
        this.V.reset();
        float f13 = f10 + f12;
        this.V.moveTo(f13, this.f11695g0 + f11);
        this.V.lineTo(f13, f11);
        this.V.lineTo(f13 - this.f11695g0, f11);
        this.W.reset();
        float f14 = f11 + f12;
        this.W.moveTo(f10, f14 - this.f11695g0);
        this.W.lineTo(f10, f14);
        this.W.lineTo(f10 + this.f11695g0, f14);
        this.f11689a0.reset();
        this.f11689a0.moveTo(f13, f14 - this.f11695g0);
        this.f11689a0.lineTo(f13, f14);
        this.f11689a0.lineTo(f13 - this.f11695g0, f14);
    }

    public final void S1(int i10) {
        j0 j0Var = j0.f11649a;
        this.f11703o0 = new g.b(w.i1(R.string.ScanQRFullTitle), i10, y.A0(31.0f), j0Var).b().a(2).v().f();
        int i11 = this.f11713y0;
        if (i11 == 0) {
            i11 = R.string.ScanQRFullSubtitle;
        }
        this.f11704p0 = new g.b(w.i1(i11), i10, y.A0(16.0f), j0Var).a(2).p(2).f();
    }

    @Override
    public boolean drawChild(android.graphics.Canvas r16, android.view.View r17, long r18) {
        throw new UnsupportedOperationException("Method not decompiled: ee.k0.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 0) {
            this.S.f11714a = h.i(this.R.f11714a, this.T.f11714a, f10);
            this.S.f11715b = h.i(this.R.f11715b, this.T.f11715b, f10);
            this.S.f11716c = h.i(this.R.f11716c, this.T.f11716c, f10);
            R1();
            invalidate();
        } else if (i10 == 3) {
            this.f11706r0 = h.d(f10);
            invalidate();
        } else if (i10 == 1 && f10 > 0.25f) {
            this.f11702n0.i();
        }
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        if (i10 == 1 && f10 == 1.0f) {
            if (!i.c2().D2()) {
                ((k) this.M).Lf();
                this.f11699k0.p(false, false);
            }
        } else if (i10 == 2 && f10 == 1.0f) {
            this.f11699k0.p(false, false);
            this.f11702n0.p(true, true);
            a aVar = this.Q;
            K1(aVar.f11714a, aVar.f11715b, aVar.f11716c);
        }
    }

    @Override
    public void z1() {
        this.f11709u0 = true;
        this.f11699k0.p(false, false);
        this.f11700l0.p(false, false);
        this.f11702n0.p(true, true);
        a aVar = this.S;
        a aVar2 = this.Q;
        aVar.b(aVar2.f11714a, aVar2.f11715b, aVar2.f11716c);
        R1();
    }
}
