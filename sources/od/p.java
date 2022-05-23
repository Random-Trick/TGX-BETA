package od;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import ce.a0;
import ce.j0;
import db.g;
import eb.k;

public class p implements k.b {
    public static final long f19796v0 = ViewConfiguration.getDoubleTapTimeout();
    public b O;
    public boolean P;
    public float Q;
    public float R;
    public long S;
    public float T;
    public float U;
    public kb.b V;
    public k W;
    public float Y;
    public float Z;
    public final View f19797a;
    public float f19798a0;
    public float f19800b0;
    public float f19802c0;
    public float f19803d0;
    public float f19804e0;
    public float f19805f0;
    public float f19806g0;
    public float f19807h0;
    public boolean f19808i0;
    public int f19810k0;
    public float f19811l0;
    public float f19812m0;
    public float f19813n0;
    public float f19814o0;
    public float f19815p0;
    public float f19816q0;
    public float f19817r0;
    public float f19818s0;
    public float f19819t0;
    public float f19820u0;
    public final Rect f19799b = new Rect();
    public final Rect f19801c = new Rect();
    public final RectF M = new RectF();
    public final RectF N = new RectF();
    public final Matrix X = new Matrix();
    public float f19809j0 = 1.0f;

    public class a extends kb.b {
        public a() {
        }

        @Override
        public void b() {
            p.this.S = 0L;
            p.this.O.d(p.this.T, p.this.U);
        }
    }

    public interface b {
        void b(Rect rect);

        void d(float f10, float f11);

        boolean f();

        void i();

        boolean l();

        boolean m(float f10, float f11);

        void n(Rect rect);

        void o();
    }

    public p(Context context, View view, b bVar) {
        this.O = bVar;
        this.f19797a = view;
    }

    public static float h(float f10, float f11, float f12, float f13) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        return (float) Math.sqrt((f14 * f14) + (f15 * f15));
    }

    public final void A(MotionEvent motionEvent, int i10) {
        if (motionEvent == null) {
            i10 = 0;
        }
        int i11 = this.f19810k0;
        if (i11 == i10) {
            return;
        }
        if (i10 == 0) {
            this.f19810k0 = 0;
            i();
        } else if (i11 != 0 || this.O.f()) {
            this.f19810k0 = i10;
            if (i10 == 2) {
                t(motionEvent);
            } else if (i10 == 1 && !this.P) {
                q(motionEvent);
            }
        }
    }

    public final void B(float f10, float f11) {
        if (this.f19809j0 == 1.0f) {
            y(f10, f11);
            e(3.0f, this.f19815p0, this.f19816q0, 0.0f, 0.0f, true);
        }
    }

    public void C(View view, View view2) {
        if (view2 != null) {
            view2.setScaleX(this.f19809j0);
            view2.setScaleY(this.f19809j0);
            this.O.n(this.f19799b);
            int width = this.f19799b.width();
            int height = this.f19799b.height();
            float f10 = width;
            view2.setTranslationX(this.f19812m0 * f10);
            float f11 = height;
            view2.setTranslationY(this.f19813n0 * f11);
            view2.setPivotX((this.f19815p0 * f10) - view2.getLeft());
            view2.setPivotY((this.f19816q0 * f11) - view2.getTop());
        }
    }

    public final void e(float f10, float f11, float f12, float f13, float f14, boolean z10) {
        this.Y = this.f19809j0;
        this.Z = this.f19815p0;
        this.f19798a0 = this.f19816q0;
        this.f19800b0 = this.f19812m0;
        this.f19802c0 = this.f19813n0;
        this.f19803d0 = f10;
        this.f19804e0 = f11;
        this.f19805f0 = f12;
        this.f19806g0 = f13;
        this.f19807h0 = f14;
        k kVar = this.W;
        if (kVar != null) {
            kVar.l(0.0f);
        }
        boolean z11 = (this.f19809j0 == f10 && this.f19815p0 == f11 && this.f19816q0 == f12 && this.f19812m0 == f13 && this.f19813n0 == f14) ? false : true;
        this.f19808i0 = z11;
        if (z10 && z11) {
            if (this.W == null) {
                this.W = new k(1, this, db.b.f7287b, 140L);
            }
            this.W.i(1.0f);
        }
    }

    public final void f() {
    }

    public final void g() {
        kb.b bVar = this.V;
        if (bVar != null) {
            bVar.c();
            this.V = null;
        }
    }

    public final void i() {
        if (this.f19810k0 == 0) {
            l();
            this.O.i();
        }
    }

    public void j(float f10, float f11, float f12) {
        k kVar = this.W;
        if (kVar != null) {
            kVar.k();
        }
        if (this.f19809j0 != f10 || this.f19812m0 != f11 || this.f19813n0 != f12) {
            this.f19809j0 = f10;
            this.f19812m0 = f11;
            this.f19813n0 = f12;
            this.O.o();
        }
    }

    public float k() {
        return this.f19809j0;
    }

    public final void l() {
        float max = Math.max(1.0f, Math.min(3.0f, this.f19809j0));
        this.O.n(this.f19799b);
        int width = this.f19799b.width();
        int height = this.f19799b.height();
        this.M.set(this.f19801c);
        this.X.reset();
        float f10 = width;
        float f11 = height;
        this.X.preScale(max, max, this.f19815p0 * f10, this.f19816q0 * f11);
        this.X.postTranslate(this.f19812m0 * f10, this.f19813n0 * f11);
        this.X.mapRect(this.M);
        this.X.reset();
        this.N.set(this.f19801c);
        this.X.preScale(max, max, f10 * 0.5f, 0.5f * f11);
        this.X.mapRect(this.N);
        RectF rectF = this.M;
        float f12 = rectF.left / f10;
        float f13 = rectF.right / f10;
        float f14 = rectF.top / f11;
        float f15 = rectF.bottom / f11;
        float f16 = 0.0f;
        float max2 = Math.max(0.0f, this.N.left / f10);
        float max3 = Math.max(0.0f, this.N.top / f11);
        float min = Math.min(1.0f, this.N.bottom / f11);
        float min2 = Math.min(1.0f, this.N.right / f10);
        float f17 = f12 > max2 ? max2 - f12 : f13 < min2 ? min2 - f13 : 0.0f;
        if (f14 > max3) {
            f16 = max3 - f14;
        } else if (f15 < min) {
            f16 = min - f15;
        }
        e(max, this.f19815p0, this.f19816q0, this.f19812m0 + f17, this.f19813n0 + f16, true);
    }

    public void m(boolean z10) {
        if (z10 && this.f19809j0 > 1.0f) {
            e(1.0f, this.f19815p0, this.f19816q0, 0.0f, 0.0f, true);
        }
    }

    public final void n(float f10, float f11) {
        this.O.n(this.f19799b);
        int width = this.f19799b.width();
        int height = this.f19799b.height();
        this.O.b(this.f19801c);
        this.f19801c.width();
        this.f19801c.height();
        this.f19812m0 += f10 / width;
        this.f19813n0 += f11 / height;
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 1) {
            z(f10);
        }
    }

    public final void o(float f10, float f11) {
        g();
        if (!this.O.m(f10, f11)) {
            this.O.d(f10, f11);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.S <= f19796v0) {
            u(f10, f11);
            return;
        }
        this.T = f10;
        this.U = f11;
        this.S = currentTimeMillis;
        x();
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    public final void p(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        n(x10 - this.f19819t0, y10 - this.f19820u0);
        this.f19819t0 = x10;
        this.f19820u0 = y10;
        this.O.o();
    }

    public final void q(MotionEvent motionEvent) {
        this.f19819t0 = motionEvent.getX();
        this.f19820u0 = motionEvent.getY();
    }

    public boolean r(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int pointerCount = motionEvent.getPointerCount();
        boolean z10 = false;
        if (pointerCount == 2) {
            i10 = 2;
        } else {
            i10 = (pointerCount != 1 || this.f19809j0 <= 1.0f || actionMasked == 1 || actionMasked == 3 || !this.O.l()) ? 0 : 1;
        }
        A(motionEvent, i10);
        if (pointerCount != 1 && this.P) {
            this.P = false;
        }
        if (actionMasked == 0) {
            if (pointerCount == 1) {
                z10 = true;
            }
            this.P = z10;
            this.Q = motionEvent.getX();
            this.R = motionEvent.getY();
        } else if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.P && Math.max(Math.abs(motionEvent.getX() - this.Q), Math.abs(motionEvent.getY() - this.R)) > a0.q()) {
                    this.P = false;
                    if (this.f19810k0 == 1) {
                        q(motionEvent);
                    }
                }
                int i11 = this.f19810k0;
                if (i11 != 1) {
                    if (i11 == 2) {
                        s(motionEvent);
                    }
                } else if (!this.P) {
                    p(motionEvent);
                }
            } else if (actionMasked == 3) {
                this.P = false;
            }
        } else if (this.P) {
            o(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    public final void s(MotionEvent motionEvent) {
        float f10;
        float x10 = motionEvent.getX(0);
        float x11 = motionEvent.getX(1);
        float y10 = motionEvent.getY(0);
        float y11 = motionEvent.getY(1);
        float f11 = (x10 + x11) / 2.0f;
        float f12 = (y10 + y11) / 2.0f;
        float h10 = h(x10, y10, x11, y11);
        n(f11 - this.f19817r0, f12 - this.f19818s0);
        this.f19817r0 = f11;
        this.f19818s0 = f12;
        float f13 = this.f19814o0;
        if (f13 != 0.0f) {
            float f14 = this.f19811l0;
            if (f14 != 0.0f) {
                f10 = Math.max(0.3f, h10 / (f13 / f14));
                this.f19809j0 = f10;
                this.O.o();
            }
        }
        f10 = 1.0f;
        this.f19809j0 = f10;
        this.O.o();
    }

    public final void t(MotionEvent motionEvent) {
        k kVar = this.W;
        if (kVar != null) {
            kVar.k();
        }
        float x10 = motionEvent.getX(0);
        float x11 = motionEvent.getX(1);
        float y10 = motionEvent.getY(0);
        float y11 = motionEvent.getY(1);
        float f10 = (x10 + x11) / 2.0f;
        float f11 = (y10 + y11) / 2.0f;
        float h10 = h(x10, y10, x11, y11);
        this.O.n(this.f19799b);
        int width = this.f19799b.width();
        int height = this.f19799b.height();
        this.O.b(this.f19801c);
        if (this.f19809j0 <= 1.0f) {
            Rect rect = this.f19801c;
            this.f19815p0 = Math.max(rect.left, Math.min(rect.right, f10)) / width;
            Rect rect2 = this.f19801c;
            this.f19816q0 = Math.max(rect2.top, Math.min(rect2.bottom, f11)) / height;
        } else {
            f();
        }
        this.f19811l0 = this.f19809j0;
        this.f19814o0 = h10;
        this.f19817r0 = f10;
        this.f19818s0 = f11;
    }

    public final void u(float f10, float f11) {
        float f12 = this.f19809j0;
        if (f12 > 1.0f) {
            e(1.0f, this.f19815p0, this.f19816q0, 0.0f, 0.0f, true);
            g.c(this.f19797a);
        } else if (f12 == 1.0f) {
            B(f10, f11);
            g.c(this.f19797a);
        }
    }

    public void v() {
        e(1.0f, 0.5f, 0.5f, 0.0f, 0.0f, false);
    }

    public void w() {
        j(1.0f, 0.0f, 0.0f);
        A(null, 0);
    }

    public final void x() {
        a aVar = new a();
        this.V = aVar;
        j0.e0(aVar, f19796v0);
    }

    public final void y(float r12, float r13) {
        throw new UnsupportedOperationException("Method not decompiled: od.p.y(float, float):void");
    }

    public boolean z(float f10) {
        if (!this.f19808i0) {
            return false;
        }
        float f11 = this.Y;
        float f12 = f11 + ((this.f19803d0 - f11) * f10);
        float f13 = this.Z;
        float f14 = f13 + ((this.f19804e0 - f13) * f10);
        float f15 = this.f19798a0;
        float f16 = f15 + ((this.f19805f0 - f15) * f10);
        float f17 = this.f19800b0;
        float f18 = f17 + ((this.f19806g0 - f17) * f10);
        float f19 = this.f19802c0;
        float f20 = f19 + ((this.f19807h0 - f19) * f10);
        if (this.f19809j0 == f12 && this.f19815p0 == f14 && this.f19816q0 == f16 && this.f19812m0 == f18 && this.f19813n0 == f20) {
            return false;
        }
        this.f19809j0 = f12;
        this.f19815p0 = f14;
        this.f19816q0 = f16;
        this.f19812m0 = f18;
        this.f19813n0 = f20;
        this.O.o();
        return true;
    }
}
