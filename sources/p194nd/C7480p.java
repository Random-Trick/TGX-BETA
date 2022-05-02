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
    public static final long f23889v0 = ViewConfiguration.getDoubleTapTimeout();
    public AbstractC7482b f23892O;
    public boolean f23893P;
    public float f23894Q;
    public float f23895R;
    public long f23896S;
    public float f23897T;
    public float f23898U;
    public AbstractRunnableC5910b f23899V;
    public C3950k f23900W;
    public float f23902Y;
    public float f23903Z;
    public final View f23904a;
    public float f23905a0;
    public float f23907b0;
    public float f23909c0;
    public float f23910d0;
    public float f23911e0;
    public float f23912f0;
    public float f23913g0;
    public float f23914h0;
    public boolean f23915i0;
    public int f23917k0;
    public float f23918l0;
    public float f23919m0;
    public float f23920n0;
    public float f23921o0;
    public float f23922p0;
    public float f23923q0;
    public float f23924r0;
    public float f23925s0;
    public float f23926t0;
    public float f23927u0;
    public final Rect f23906b = new Rect();
    public final Rect f23908c = new Rect();
    public final RectF f23890M = new RectF();
    public final RectF f23891N = new RectF();
    public final Matrix f23901X = new Matrix();
    public float f23916j0 = 1.0f;

    public class C7481a extends AbstractRunnableC5910b {
        public C7481a() {
        }

        @Override
        public void mo1364b() {
            C7480p.this.f23896S = 0L;
            C7480p.this.f23892O.mo15855g(C7480p.this.f23897T, C7480p.this.f23898U);
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
        this.f23892O = bVar;
        this.f23904a = view;
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
        int i2 = this.f23917k0;
        if (i2 == i) {
            return;
        }
        if (i == 0) {
            this.f23917k0 = 0;
            m15874i();
        } else if (i2 != 0 || this.f23892O.mo15854h()) {
            this.f23917k0 = i;
            if (i == 2) {
                m15863t(motionEvent);
            } else if (i == 1 && !this.f23893P) {
                m15866q(motionEvent);
            }
        }
    }

    public final void m15884B(float f, float f2) {
        if (this.f23916j0 == 1.0f) {
            m15858y(f, f2);
            m15878e(3.0f, this.f23922p0, this.f23923q0, 0.0f, 0.0f, true);
        }
    }

    public void m15883C(View view, View view2) {
        if (view2 != null) {
            view2.setScaleX(this.f23916j0);
            view2.setScaleY(this.f23916j0);
            this.f23892O.mo15850n(this.f23906b);
            int width = this.f23906b.width();
            int height = this.f23906b.height();
            float f = width;
            view2.setTranslationX(this.f23919m0 * f);
            float f2 = height;
            view2.setTranslationY(this.f23920n0 * f2);
            view2.setPivotX((this.f23922p0 * f) - view2.getLeft());
            view2.setPivotY((this.f23923q0 * f2) - view2.getTop());
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
        this.f23902Y = this.f23916j0;
        this.f23903Z = this.f23922p0;
        this.f23905a0 = this.f23923q0;
        this.f23907b0 = this.f23919m0;
        this.f23909c0 = this.f23920n0;
        this.f23910d0 = f;
        this.f23911e0 = f2;
        this.f23912f0 = f3;
        this.f23913g0 = f4;
        this.f23914h0 = f5;
        C3950k kVar = this.f23900W;
        if (kVar != null) {
            kVar.m29543l(0.0f);
        }
        boolean z2 = (this.f23916j0 == f && this.f23922p0 == f2 && this.f23923q0 == f3 && this.f23919m0 == f4 && this.f23920n0 == f5) ? false : true;
        this.f23915i0 = z2;
        if (z && z2) {
            if (this.f23900W == null) {
                this.f23900W = new C3950k(1, this, C2057b.f7280b, 140L);
            }
            this.f23900W.m29546i(1.0f);
        }
    }

    public final void m15877f() {
    }

    public final void m15876g() {
        AbstractRunnableC5910b bVar = this.f23899V;
        if (bVar != null) {
            bVar.m21858c();
            this.f23899V = null;
        }
    }

    public final void m15874i() {
        if (this.f23917k0 == 0) {
            m15871l();
            this.f23892O.mo15853j();
        }
    }

    public void m15873j(float f, float f2, float f3) {
        C3950k kVar = this.f23900W;
        if (kVar != null) {
            kVar.m29544k();
        }
        if (this.f23916j0 != f || this.f23919m0 != f2 || this.f23920n0 != f3) {
            this.f23916j0 = f;
            this.f23919m0 = f2;
            this.f23920n0 = f3;
            this.f23892O.mo15849o();
        }
    }

    public float m15872k() {
        return this.f23916j0;
    }

    public final void m15871l() {
        float max = Math.max(1.0f, Math.min(3.0f, this.f23916j0));
        this.f23892O.mo15850n(this.f23906b);
        int width = this.f23906b.width();
        int height = this.f23906b.height();
        this.f23890M.set(this.f23908c);
        this.f23901X.reset();
        float f = width;
        float f2 = height;
        this.f23901X.preScale(max, max, this.f23922p0 * f, this.f23923q0 * f2);
        this.f23901X.postTranslate(this.f23919m0 * f, this.f23920n0 * f2);
        this.f23901X.mapRect(this.f23890M);
        this.f23901X.reset();
        this.f23891N.set(this.f23908c);
        this.f23901X.preScale(max, max, f * 0.5f, 0.5f * f2);
        this.f23901X.mapRect(this.f23891N);
        RectF rectF = this.f23890M;
        float f3 = rectF.left / f;
        float f4 = rectF.right / f;
        float f5 = rectF.top / f2;
        float f6 = rectF.bottom / f2;
        float f7 = 0.0f;
        float max2 = Math.max(0.0f, this.f23891N.left / f);
        float max3 = Math.max(0.0f, this.f23891N.top / f2);
        float min = Math.min(1.0f, this.f23891N.bottom / f2);
        float min2 = Math.min(1.0f, this.f23891N.right / f);
        float f8 = f3 > max2 ? max2 - f3 : f4 < min2 ? min2 - f4 : 0.0f;
        if (f5 > max3) {
            f7 = max3 - f5;
        } else if (f6 < min) {
            f7 = min - f6;
        }
        m15878e(max, this.f23922p0, this.f23923q0, this.f23919m0 + f8, this.f23920n0 + f7, true);
    }

    public void m15870m(boolean z) {
        if (z && this.f23916j0 > 1.0f) {
            m15878e(1.0f, this.f23922p0, this.f23923q0, 0.0f, 0.0f, true);
        }
    }

    public final void m15869n(float f, float f2) {
        this.f23892O.mo15850n(this.f23906b);
        int width = this.f23906b.width();
        int height = this.f23906b.height();
        this.f23892O.mo15856c(this.f23908c);
        this.f23908c.width();
        this.f23908c.height();
        this.f23919m0 += f / width;
        this.f23920n0 += f2 / height;
    }

    public final void m15868o(float f, float f2) {
        m15876g();
        if (!this.f23892O.mo15851m(f, f2)) {
            this.f23892O.mo15855g(f, f2);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f23896S <= f23889v0) {
            m15862u(f, f2);
            return;
        }
        this.f23897T = f;
        this.f23898U = f2;
        this.f23896S = currentTimeMillis;
        m15859x();
    }

    public final void m15867p(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        m15869n(x - this.f23926t0, y - this.f23927u0);
        this.f23926t0 = x;
        this.f23927u0 = y;
        this.f23892O.mo15849o();
    }

    public final void m15866q(MotionEvent motionEvent) {
        this.f23926t0 = motionEvent.getX();
        this.f23927u0 = motionEvent.getY();
    }

    public boolean m15865r(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int pointerCount = motionEvent.getPointerCount();
        boolean z = false;
        if (pointerCount == 2) {
            i = 2;
        } else {
            i = (pointerCount != 1 || this.f23916j0 <= 1.0f || actionMasked == 1 || actionMasked == 3 || !this.f23892O.mo15852l()) ? 0 : 1;
        }
        m15885A(motionEvent, i);
        if (pointerCount != 1 && this.f23893P) {
            this.f23893P = false;
        }
        if (actionMasked == 0) {
            if (pointerCount == 1) {
                z = true;
            }
            this.f23893P = z;
            this.f23894Q = motionEvent.getX();
            this.f23895R = motionEvent.getY();
        } else if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.f23893P && Math.max(Math.abs(motionEvent.getX() - this.f23894Q), Math.abs(motionEvent.getY() - this.f23895R)) > C1357a0.m37536q()) {
                    this.f23893P = false;
                    if (this.f23917k0 == 1) {
                        m15866q(motionEvent);
                    }
                }
                int i2 = this.f23917k0;
                if (i2 != 1) {
                    if (i2 == 2) {
                        m15864s(motionEvent);
                    }
                } else if (!this.f23893P) {
                    m15867p(motionEvent);
                }
            } else if (actionMasked == 3) {
                this.f23893P = false;
            }
        } else if (this.f23893P) {
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
        m15869n(f2 - this.f23924r0, f3 - this.f23925s0);
        this.f23924r0 = f2;
        this.f23925s0 = f3;
        float f4 = this.f23921o0;
        if (f4 != 0.0f) {
            float f5 = this.f23918l0;
            if (f5 != 0.0f) {
                f = Math.max(0.3f, h / (f4 / f5));
                this.f23916j0 = f;
                this.f23892O.mo15849o();
            }
        }
        f = 1.0f;
        this.f23916j0 = f;
        this.f23892O.mo15849o();
    }

    public final void m15863t(MotionEvent motionEvent) {
        C3950k kVar = this.f23900W;
        if (kVar != null) {
            kVar.m29544k();
        }
        float x = motionEvent.getX(0);
        float x2 = motionEvent.getX(1);
        float y = motionEvent.getY(0);
        float y2 = motionEvent.getY(1);
        float f = (x + x2) / 2.0f;
        float f2 = (y + y2) / 2.0f;
        float h = m15875h(x, y, x2, y2);
        this.f23892O.mo15850n(this.f23906b);
        int width = this.f23906b.width();
        int height = this.f23906b.height();
        this.f23892O.mo15856c(this.f23908c);
        if (this.f23916j0 <= 1.0f) {
            Rect rect = this.f23908c;
            this.f23922p0 = Math.max(rect.left, Math.min(rect.right, f)) / width;
            Rect rect2 = this.f23908c;
            this.f23923q0 = Math.max(rect2.top, Math.min(rect2.bottom, f2)) / height;
        } else {
            m15877f();
        }
        this.f23918l0 = this.f23916j0;
        this.f23921o0 = h;
        this.f23924r0 = f;
        this.f23925s0 = f2;
    }

    public final void m15862u(float f, float f2) {
        float f3 = this.f23916j0;
        if (f3 > 1.0f) {
            m15878e(1.0f, this.f23922p0, this.f23923q0, 0.0f, 0.0f, true);
            C2065g.m35722c(this.f23904a);
        } else if (f3 == 1.0f) {
            m15884B(f, f2);
            C2065g.m35722c(this.f23904a);
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
        this.f23899V = aVar;
        C1379j0.m37335e0(aVar, f23889v0);
    }

    public final void m15858y(float r12, float r13) {
        throw new UnsupportedOperationException("Method not decompiled: p194nd.C7480p.m15858y(float, float):void");
    }

    public boolean m15857z(float f) {
        if (!this.f23915i0) {
            return false;
        }
        float f2 = this.f23902Y;
        float f3 = f2 + ((this.f23910d0 - f2) * f);
        float f4 = this.f23903Z;
        float f5 = f4 + ((this.f23911e0 - f4) * f);
        float f6 = this.f23905a0;
        float f7 = f6 + ((this.f23912f0 - f6) * f);
        float f8 = this.f23907b0;
        float f9 = f8 + ((this.f23913g0 - f8) * f);
        float f10 = this.f23909c0;
        float f11 = f10 + ((this.f23914h0 - f10) * f);
        if (this.f23916j0 == f3 && this.f23922p0 == f5 && this.f23923q0 == f7 && this.f23919m0 == f9 && this.f23920n0 == f11) {
            return false;
        }
        this.f23916j0 = f3;
        this.f23922p0 = f5;
        this.f23923q0 = f7;
        this.f23919m0 = f9;
        this.f23920n0 = f11;
        this.f23892O.mo15849o();
        return true;
    }
}
