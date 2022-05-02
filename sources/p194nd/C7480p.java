package p194nd;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import be.C1357a0;
import be.C1379j0;
import p037cb.C2057b;
import p037cb.C2065g;
import p051db.C3950k;
import p139jb.AbstractRunnableC5910b;

public class C7480p implements C3950k.AbstractC3952b {
    public static final long f23886v0 = ViewConfiguration.getDoubleTapTimeout();
    public AbstractC7482b f23889O;
    public boolean f23890P;
    public float f23891Q;
    public float f23892R;
    public long f23893S;
    public float f23894T;
    public float f23895U;
    public AbstractRunnableC5910b f23896V;
    public C3950k f23897W;
    public float f23899Y;
    public float f23900Z;
    public final View f23901a;
    public float f23902a0;
    public float f23904b0;
    public float f23906c0;
    public float f23907d0;
    public float f23908e0;
    public float f23909f0;
    public float f23910g0;
    public float f23911h0;
    public boolean f23912i0;
    public int f23914k0;
    public float f23915l0;
    public float f23916m0;
    public float f23917n0;
    public float f23918o0;
    public float f23919p0;
    public float f23920q0;
    public float f23921r0;
    public float f23922s0;
    public float f23923t0;
    public float f23924u0;
    public final Rect f23903b = new Rect();
    public final Rect f23905c = new Rect();
    public final RectF f23887M = new RectF();
    public final RectF f23888N = new RectF();
    public final Matrix f23898X = new Matrix();
    public float f23913j0 = 1.0f;

    public class C7481a extends AbstractRunnableC5910b {
        public C7481a() {
        }

        @Override
        public void mo1364b() {
            C7480p.this.f23893S = 0L;
            C7480p.this.f23889O.mo15855g(C7480p.this.f23894T, C7480p.this.f23895U);
        }
    }

    public interface AbstractC7482b {
        void mo15856c(Rect rect);

        void mo15855g(float f, float f2);

        boolean mo15854h();

        void mo15853j();

        boolean mo15852l();

        boolean mo15851m(float f, float f2);

        void mo15850n(Rect rect);

        void mo15849o();
    }

    public C7480p(Context context, View view, AbstractC7482b bVar) {
        this.f23889O = bVar;
        this.f23901a = view;
    }

    public static float m15875h(float f, float f2, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        return (float) Math.sqrt((f5 * f5) + (f6 * f6));
    }

    public final void m15885A(MotionEvent motionEvent, int i) {
        if (motionEvent == null) {
            i = 0;
        }
        int i2 = this.f23914k0;
        if (i2 == i) {
            return;
        }
        if (i == 0) {
            this.f23914k0 = 0;
            m15874i();
        } else if (i2 != 0 || this.f23889O.mo15854h()) {
            this.f23914k0 = i;
            if (i == 2) {
                m15863t(motionEvent);
            } else if (i == 1 && !this.f23890P) {
                m15866q(motionEvent);
            }
        }
    }

    public final void m15884B(float f, float f2) {
        if (this.f23913j0 == 1.0f) {
            m15858y(f, f2);
            m15878e(3.0f, this.f23919p0, this.f23920q0, 0.0f, 0.0f, true);
        }
    }

    public void m15883C(View view, View view2) {
        if (view2 != null) {
            view2.setScaleX(this.f23913j0);
            view2.setScaleY(this.f23913j0);
            this.f23889O.mo15850n(this.f23903b);
            int width = this.f23903b.width();
            int height = this.f23903b.height();
            float f = width;
            view2.setTranslationX(this.f23916m0 * f);
            float f2 = height;
            view2.setTranslationY(this.f23917n0 * f2);
            view2.setPivotX((this.f23919p0 * f) - view2.getLeft());
            view2.setPivotY((this.f23920q0 * f2) - view2.getTop());
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 1) {
            m15857z(f);
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    public final void m15878e(float f, float f2, float f3, float f4, float f5, boolean z) {
        this.f23899Y = this.f23913j0;
        this.f23900Z = this.f23919p0;
        this.f23902a0 = this.f23920q0;
        this.f23904b0 = this.f23916m0;
        this.f23906c0 = this.f23917n0;
        this.f23907d0 = f;
        this.f23908e0 = f2;
        this.f23909f0 = f3;
        this.f23910g0 = f4;
        this.f23911h0 = f5;
        C3950k kVar = this.f23897W;
        if (kVar != null) {
            kVar.m29541l(0.0f);
        }
        boolean z2 = (this.f23913j0 == f && this.f23919p0 == f2 && this.f23920q0 == f3 && this.f23916m0 == f4 && this.f23917n0 == f5) ? false : true;
        this.f23912i0 = z2;
        if (z && z2) {
            if (this.f23897W == null) {
                this.f23897W = new C3950k(1, this, C2057b.f7280b, 140L);
            }
            this.f23897W.m29544i(1.0f);
        }
    }

    public final void m15877f() {
    }

    public final void m15876g() {
        AbstractRunnableC5910b bVar = this.f23896V;
        if (bVar != null) {
            bVar.m21857c();
            this.f23896V = null;
        }
    }

    public final void m15874i() {
        if (this.f23914k0 == 0) {
            m15871l();
            this.f23889O.mo15853j();
        }
    }

    public void m15873j(float f, float f2, float f3) {
        C3950k kVar = this.f23897W;
        if (kVar != null) {
            kVar.m29542k();
        }
        if (this.f23913j0 != f || this.f23916m0 != f2 || this.f23917n0 != f3) {
            this.f23913j0 = f;
            this.f23916m0 = f2;
            this.f23917n0 = f3;
            this.f23889O.mo15849o();
        }
    }

    public float m15872k() {
        return this.f23913j0;
    }

    public final void m15871l() {
        float max = Math.max(1.0f, Math.min(3.0f, this.f23913j0));
        this.f23889O.mo15850n(this.f23903b);
        int width = this.f23903b.width();
        int height = this.f23903b.height();
        this.f23887M.set(this.f23905c);
        this.f23898X.reset();
        float f = width;
        float f2 = height;
        this.f23898X.preScale(max, max, this.f23919p0 * f, this.f23920q0 * f2);
        this.f23898X.postTranslate(this.f23916m0 * f, this.f23917n0 * f2);
        this.f23898X.mapRect(this.f23887M);
        this.f23898X.reset();
        this.f23888N.set(this.f23905c);
        this.f23898X.preScale(max, max, f * 0.5f, 0.5f * f2);
        this.f23898X.mapRect(this.f23888N);
        RectF rectF = this.f23887M;
        float f3 = rectF.left / f;
        float f4 = rectF.right / f;
        float f5 = rectF.top / f2;
        float f6 = rectF.bottom / f2;
        float f7 = 0.0f;
        float max2 = Math.max(0.0f, this.f23888N.left / f);
        float max3 = Math.max(0.0f, this.f23888N.top / f2);
        float min = Math.min(1.0f, this.f23888N.bottom / f2);
        float min2 = Math.min(1.0f, this.f23888N.right / f);
        float f8 = f3 > max2 ? max2 - f3 : f4 < min2 ? min2 - f4 : 0.0f;
        if (f5 > max3) {
            f7 = max3 - f5;
        } else if (f6 < min) {
            f7 = min - f6;
        }
        m15878e(max, this.f23919p0, this.f23920q0, this.f23916m0 + f8, this.f23917n0 + f7, true);
    }

    public void m15870m(boolean z) {
        if (z && this.f23913j0 > 1.0f) {
            m15878e(1.0f, this.f23919p0, this.f23920q0, 0.0f, 0.0f, true);
        }
    }

    public final void m15869n(float f, float f2) {
        this.f23889O.mo15850n(this.f23903b);
        int width = this.f23903b.width();
        int height = this.f23903b.height();
        this.f23889O.mo15856c(this.f23905c);
        this.f23905c.width();
        this.f23905c.height();
        this.f23916m0 += f / width;
        this.f23917n0 += f2 / height;
    }

    public final void m15868o(float f, float f2) {
        m15876g();
        if (!this.f23889O.mo15851m(f, f2)) {
            this.f23889O.mo15855g(f, f2);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f23893S <= f23886v0) {
            m15862u(f, f2);
            return;
        }
        this.f23894T = f;
        this.f23895U = f2;
        this.f23893S = currentTimeMillis;
        m15859x();
    }

    public final void m15867p(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        m15869n(x - this.f23923t0, y - this.f23924u0);
        this.f23923t0 = x;
        this.f23924u0 = y;
        this.f23889O.mo15849o();
    }

    public final void m15866q(MotionEvent motionEvent) {
        this.f23923t0 = motionEvent.getX();
        this.f23924u0 = motionEvent.getY();
    }

    public boolean m15865r(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int pointerCount = motionEvent.getPointerCount();
        boolean z = false;
        if (pointerCount == 2) {
            i = 2;
        } else {
            i = (pointerCount != 1 || this.f23913j0 <= 1.0f || actionMasked == 1 || actionMasked == 3 || !this.f23889O.mo15852l()) ? 0 : 1;
        }
        m15885A(motionEvent, i);
        if (pointerCount != 1 && this.f23890P) {
            this.f23890P = false;
        }
        if (actionMasked == 0) {
            if (pointerCount == 1) {
                z = true;
            }
            this.f23890P = z;
            this.f23891Q = motionEvent.getX();
            this.f23892R = motionEvent.getY();
        } else if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.f23890P && Math.max(Math.abs(motionEvent.getX() - this.f23891Q), Math.abs(motionEvent.getY() - this.f23892R)) > C1357a0.m37533q()) {
                    this.f23890P = false;
                    if (this.f23914k0 == 1) {
                        m15866q(motionEvent);
                    }
                }
                int i2 = this.f23914k0;
                if (i2 != 1) {
                    if (i2 == 2) {
                        m15864s(motionEvent);
                    }
                } else if (!this.f23890P) {
                    m15867p(motionEvent);
                }
            } else if (actionMasked == 3) {
                this.f23890P = false;
            }
        } else if (this.f23890P) {
            m15868o(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    public final void m15864s(MotionEvent motionEvent) {
        float f;
        float x = motionEvent.getX(0);
        float x2 = motionEvent.getX(1);
        float y = motionEvent.getY(0);
        float y2 = motionEvent.getY(1);
        float f2 = (x + x2) / 2.0f;
        float f3 = (y + y2) / 2.0f;
        float h = m15875h(x, y, x2, y2);
        m15869n(f2 - this.f23921r0, f3 - this.f23922s0);
        this.f23921r0 = f2;
        this.f23922s0 = f3;
        float f4 = this.f23918o0;
        if (f4 != 0.0f) {
            float f5 = this.f23915l0;
            if (f5 != 0.0f) {
                f = Math.max(0.3f, h / (f4 / f5));
                this.f23913j0 = f;
                this.f23889O.mo15849o();
            }
        }
        f = 1.0f;
        this.f23913j0 = f;
        this.f23889O.mo15849o();
    }

    public final void m15863t(MotionEvent motionEvent) {
        C3950k kVar = this.f23897W;
        if (kVar != null) {
            kVar.m29542k();
        }
        float x = motionEvent.getX(0);
        float x2 = motionEvent.getX(1);
        float y = motionEvent.getY(0);
        float y2 = motionEvent.getY(1);
        float f = (x + x2) / 2.0f;
        float f2 = (y + y2) / 2.0f;
        float h = m15875h(x, y, x2, y2);
        this.f23889O.mo15850n(this.f23903b);
        int width = this.f23903b.width();
        int height = this.f23903b.height();
        this.f23889O.mo15856c(this.f23905c);
        if (this.f23913j0 <= 1.0f) {
            Rect rect = this.f23905c;
            this.f23919p0 = Math.max(rect.left, Math.min(rect.right, f)) / width;
            Rect rect2 = this.f23905c;
            this.f23920q0 = Math.max(rect2.top, Math.min(rect2.bottom, f2)) / height;
        } else {
            m15877f();
        }
        this.f23915l0 = this.f23913j0;
        this.f23918o0 = h;
        this.f23921r0 = f;
        this.f23922s0 = f2;
    }

    public final void m15862u(float f, float f2) {
        float f3 = this.f23913j0;
        if (f3 > 1.0f) {
            m15878e(1.0f, this.f23919p0, this.f23920q0, 0.0f, 0.0f, true);
            C2065g.m35719c(this.f23901a);
        } else if (f3 == 1.0f) {
            m15884B(f, f2);
            C2065g.m35719c(this.f23901a);
        }
    }

    public void m15861v() {
        m15878e(1.0f, 0.5f, 0.5f, 0.0f, 0.0f, false);
    }

    public void m15860w() {
        m15873j(1.0f, 0.0f, 0.0f);
        m15885A(null, 0);
    }

    public final void m15859x() {
        C7481a aVar = new C7481a();
        this.f23896V = aVar;
        C1379j0.m37332e0(aVar, f23886v0);
    }

    public final void m15858y(float r12, float r13) {
        throw new UnsupportedOperationException("Method not decompiled: p194nd.C7480p.m15858y(float, float):void");
    }

    public boolean m15857z(float f) {
        if (!this.f23912i0) {
            return false;
        }
        float f2 = this.f23899Y;
        float f3 = f2 + ((this.f23907d0 - f2) * f);
        float f4 = this.f23900Z;
        float f5 = f4 + ((this.f23908e0 - f4) * f);
        float f6 = this.f23902a0;
        float f7 = f6 + ((this.f23909f0 - f6) * f);
        float f8 = this.f23904b0;
        float f9 = f8 + ((this.f23910g0 - f8) * f);
        float f10 = this.f23906c0;
        float f11 = f10 + ((this.f23911h0 - f10) * f);
        if (this.f23913j0 == f3 && this.f23919p0 == f5 && this.f23920q0 == f7 && this.f23916m0 == f9 && this.f23917n0 == f11) {
            return false;
        }
        this.f23913j0 = f3;
        this.f23919p0 = f5;
        this.f23920q0 = f7;
        this.f23916m0 = f9;
        this.f23917n0 = f11;
        this.f23889O.mo15849o();
        return true;
    }
}
