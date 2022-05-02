package p070f1;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import p028c1.C1489y;

public abstract class AbstractView$OnTouchListenerC4202a implements View.OnTouchListener {
    public static final int f14197a0 = ViewConfiguration.getTapTimeout();
    public Runnable f14198M;
    public int f14201P;
    public int f14202Q;
    public boolean f14206U;
    public boolean f14207V;
    public boolean f14208W;
    public boolean f14209X;
    public boolean f14210Y;
    public boolean f14211Z;
    public final View f14214c;
    public final C4203a f14212a = new C4203a();
    public final Interpolator f14213b = new AccelerateInterpolator();
    public float[] f14199N = {0.0f, 0.0f};
    public float[] f14200O = {Float.MAX_VALUE, Float.MAX_VALUE};
    public float[] f14203R = {0.0f, 0.0f};
    public float[] f14204S = {0.0f, 0.0f};
    public float[] f14205T = {Float.MAX_VALUE, Float.MAX_VALUE};

    public static class C4203a {
        public int f14215a;
        public int f14216b;
        public float f14217c;
        public float f14218d;
        public float f14224j;
        public int f14225k;
        public long f14219e = Long.MIN_VALUE;
        public long f14223i = -1;
        public long f14220f = 0;
        public int f14221g = 0;
        public int f14222h = 0;

        public void m28455a() {
            if (this.f14220f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g = m28449g(m28451e(currentAnimationTimeMillis));
                this.f14220f = currentAnimationTimeMillis;
                float f = ((float) (currentAnimationTimeMillis - this.f14220f)) * g;
                this.f14221g = (int) (this.f14217c * f);
                this.f14222h = (int) (f * this.f14218d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public int m28454b() {
            return this.f14221g;
        }

        public int m28453c() {
            return this.f14222h;
        }

        public int m28452d() {
            float f = this.f14217c;
            return (int) (f / Math.abs(f));
        }

        public final float m28451e(long j) {
            long j2 = this.f14219e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.f14223i;
            if (j3 < 0 || j < j3) {
                return AbstractView$OnTouchListenerC4202a.m28472e(((float) (j - j2)) / this.f14215a, 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f14224j;
            return (1.0f - f) + (f * AbstractView$OnTouchListenerC4202a.m28472e(((float) (j - j3)) / this.f14225k, 0.0f, 1.0f));
        }

        public int m28450f() {
            float f = this.f14218d;
            return (int) (f / Math.abs(f));
        }

        public final float m28449g(float f) {
            return ((-4.0f) * f * f) + (f * 4.0f);
        }

        public boolean m28448h() {
            return this.f14223i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f14223i + ((long) this.f14225k);
        }

        public void m28447i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f14225k = AbstractView$OnTouchListenerC4202a.m28471f((int) (currentAnimationTimeMillis - this.f14219e), 0, this.f14216b);
            this.f14224j = m28451e(currentAnimationTimeMillis);
            this.f14223i = currentAnimationTimeMillis;
        }

        public void m28446j(int i) {
            this.f14216b = i;
        }

        public void m28445k(int i) {
            this.f14215a = i;
        }

        public void m28444l(float f, float f2) {
            this.f14217c = f;
            this.f14218d = f2;
        }

        public void m28443m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f14219e = currentAnimationTimeMillis;
            this.f14223i = -1L;
            this.f14220f = currentAnimationTimeMillis;
            this.f14224j = 0.5f;
            this.f14221g = 0;
            this.f14222h = 0;
        }
    }

    public class RunnableC4204b implements Runnable {
        public RunnableC4204b() {
        }

        @Override
        public void run() {
            AbstractView$OnTouchListenerC4202a aVar = AbstractView$OnTouchListenerC4202a.this;
            if (aVar.f14209X) {
                if (aVar.f14207V) {
                    aVar.f14207V = false;
                    aVar.f14212a.m28443m();
                }
                C4203a aVar2 = AbstractView$OnTouchListenerC4202a.this.f14212a;
                if (aVar2.m28448h() || !AbstractView$OnTouchListenerC4202a.this.m28457u()) {
                    AbstractView$OnTouchListenerC4202a.this.f14209X = false;
                    return;
                }
                AbstractView$OnTouchListenerC4202a aVar3 = AbstractView$OnTouchListenerC4202a.this;
                if (aVar3.f14208W) {
                    aVar3.f14208W = false;
                    aVar3.m28474c();
                }
                aVar2.m28455a();
                AbstractView$OnTouchListenerC4202a.this.mo28426j(aVar2.m28454b(), aVar2.m28453c());
                C1489y.m36749U(AbstractView$OnTouchListenerC4202a.this.f14214c, this);
            }
        }
    }

    public AbstractView$OnTouchListenerC4202a(View view) {
        this.f14214c = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (int) ((1575.0f * f) + 0.5f);
        m28463o(f2, f2);
        float f3 = (int) ((f * 315.0f) + 0.5f);
        m28462p(f3, f3);
        m28466l(1);
        m28464n(Float.MAX_VALUE, Float.MAX_VALUE);
        m28459s(0.2f, 0.2f);
        m28458t(1.0f, 1.0f);
        m28467k(f14197a0);
        m28460r(500);
        m28461q(500);
    }

    public static float m28472e(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    public static int m28471f(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    public abstract boolean mo28428a(int i);

    public abstract boolean mo28427b(int i);

    public void m28474c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f14214c.onTouchEvent(obtain);
        obtain.recycle();
    }

    public final float m28473d(int i, float f, float f2, float f3) {
        float h = m28469h(this.f14199N[i], f2, this.f14200O[i], f);
        int i2 = (h > 0.0f ? 1 : (h == 0.0f ? 0 : -1));
        if (i2 == 0) {
            return 0.0f;
        }
        float f4 = this.f14203R[i];
        float f5 = this.f14204S[i];
        float f6 = this.f14205T[i];
        float f7 = f4 * f3;
        if (i2 > 0) {
            return m28472e(h * f7, f5, f6);
        }
        return -m28472e((-h) * f7, f5, f6);
    }

    public final float m28470g(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f14201P;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.f14209X && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    public final float m28469h(float f, float f2, float f3, float f4) {
        float f5;
        float e = m28472e(f * f2, 0.0f, f3);
        float g = m28470g(f2 - f4, e) - m28470g(f4, e);
        if (g < 0.0f) {
            f5 = -this.f14213b.getInterpolation(-g);
        } else if (g <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.f14213b.getInterpolation(g);
        }
        return m28472e(f5, -1.0f, 1.0f);
    }

    public final void m28468i() {
        if (this.f14207V) {
            this.f14209X = false;
        } else {
            this.f14212a.m28447i();
        }
    }

    public abstract void mo28426j(int i, int i2);

    public AbstractView$OnTouchListenerC4202a m28467k(int i) {
        this.f14202Q = i;
        return this;
    }

    public AbstractView$OnTouchListenerC4202a m28466l(int i) {
        this.f14201P = i;
        return this;
    }

    public AbstractView$OnTouchListenerC4202a m28465m(boolean z) {
        if (this.f14210Y && !z) {
            m28468i();
        }
        this.f14210Y = z;
        return this;
    }

    public AbstractView$OnTouchListenerC4202a m28464n(float f, float f2) {
        float[] fArr = this.f14200O;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    public AbstractView$OnTouchListenerC4202a m28463o(float f, float f2) {
        float[] fArr = this.f14205T;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    @Override
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: p070f1.AbstractView$OnTouchListenerC4202a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public AbstractView$OnTouchListenerC4202a m28462p(float f, float f2) {
        float[] fArr = this.f14204S;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    public AbstractView$OnTouchListenerC4202a m28461q(int i) {
        this.f14212a.m28446j(i);
        return this;
    }

    public AbstractView$OnTouchListenerC4202a m28460r(int i) {
        this.f14212a.m28445k(i);
        return this;
    }

    public AbstractView$OnTouchListenerC4202a m28459s(float f, float f2) {
        float[] fArr = this.f14199N;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    public AbstractView$OnTouchListenerC4202a m28458t(float f, float f2) {
        float[] fArr = this.f14203R;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    public boolean m28457u() {
        C4203a aVar = this.f14212a;
        int f = aVar.m28450f();
        int d = aVar.m28452d();
        return (f != 0 && mo28427b(f)) || (d != 0 && mo28428a(d));
    }

    public final void m28456v() {
        int i;
        if (this.f14198M == null) {
            this.f14198M = new RunnableC4204b();
        }
        this.f14209X = true;
        this.f14207V = true;
        if (this.f14206U || (i = this.f14202Q) <= 0) {
            this.f14198M.run();
        } else {
            C1489y.m36748V(this.f14214c, this.f14198M, i);
        }
        this.f14206U = true;
    }
}
