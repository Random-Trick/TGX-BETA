package f1;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import c1.v;

public abstract class a implements View.OnTouchListener {
    public static final int f11758a0 = ViewConfiguration.getTapTimeout();
    public Runnable M;
    public int P;
    public int Q;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final View f11761c;
    public final C0100a f11759a = new C0100a();
    public final Interpolator f11760b = new AccelerateInterpolator();
    public float[] N = {0.0f, 0.0f};
    public float[] O = {Float.MAX_VALUE, Float.MAX_VALUE};
    public float[] R = {0.0f, 0.0f};
    public float[] S = {0.0f, 0.0f};
    public float[] T = {Float.MAX_VALUE, Float.MAX_VALUE};

    public static class C0100a {
        public int f11762a;
        public int f11763b;
        public float f11764c;
        public float f11765d;
        public float f11771j;
        public int f11772k;
        public long f11766e = Long.MIN_VALUE;
        public long f11770i = -1;
        public long f11767f = 0;
        public int f11768g = 0;
        public int f11769h = 0;

        public void a() {
            if (this.f11767f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g10 = g(e(currentAnimationTimeMillis));
                this.f11767f = currentAnimationTimeMillis;
                float f10 = ((float) (currentAnimationTimeMillis - this.f11767f)) * g10;
                this.f11768g = (int) (this.f11764c * f10);
                this.f11769h = (int) (f10 * this.f11765d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public int b() {
            return this.f11768g;
        }

        public int c() {
            return this.f11769h;
        }

        public int d() {
            float f10 = this.f11764c;
            return (int) (f10 / Math.abs(f10));
        }

        public final float e(long j10) {
            long j11 = this.f11766e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f11770i;
            if (j12 < 0 || j10 < j12) {
                return a.e(((float) (j10 - j11)) / this.f11762a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f11771j;
            return (1.0f - f10) + (f10 * a.e(((float) (j10 - j12)) / this.f11772k, 0.0f, 1.0f));
        }

        public int f() {
            float f10 = this.f11765d;
            return (int) (f10 / Math.abs(f10));
        }

        public final float g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        public boolean h() {
            return this.f11770i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f11770i + ((long) this.f11772k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f11772k = a.f((int) (currentAnimationTimeMillis - this.f11766e), 0, this.f11763b);
            this.f11771j = e(currentAnimationTimeMillis);
            this.f11770i = currentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.f11763b = i10;
        }

        public void k(int i10) {
            this.f11762a = i10;
        }

        public void l(float f10, float f11) {
            this.f11764c = f10;
            this.f11765d = f11;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f11766e = currentAnimationTimeMillis;
            this.f11770i = -1L;
            this.f11767f = currentAnimationTimeMillis;
            this.f11771j = 0.5f;
            this.f11768g = 0;
            this.f11769h = 0;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override
        public void run() {
            a aVar = a.this;
            if (aVar.X) {
                if (aVar.V) {
                    aVar.V = false;
                    aVar.f11759a.m();
                }
                C0100a aVar2 = a.this.f11759a;
                if (aVar2.h() || !a.this.u()) {
                    a.this.X = false;
                    return;
                }
                a aVar3 = a.this;
                if (aVar3.W) {
                    aVar3.W = false;
                    aVar3.c();
                }
                aVar2.a();
                a.this.j(aVar2.b(), aVar2.c());
                v.T(a.this.f11761c, this);
            }
        }
    }

    public a(View view) {
        this.f11761c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        o(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        p(f12, f12);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f11758a0);
        r(500);
        q(500);
    }

    public static float e(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    public static int f(int i10, int i11, int i12) {
        return i10 > i12 ? i12 : i10 < i11 ? i11 : i10;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    public void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f11761c.onTouchEvent(obtain);
        obtain.recycle();
    }

    public final float d(int i10, float f10, float f11, float f12) {
        float h10 = h(this.N[i10], f11, this.O[i10], f10);
        int i11 = (h10 > 0.0f ? 1 : (h10 == 0.0f ? 0 : -1));
        if (i11 == 0) {
            return 0.0f;
        }
        float f13 = this.R[i10];
        float f14 = this.S[i10];
        float f15 = this.T[i10];
        float f16 = f13 * f12;
        if (i11 > 0) {
            return e(h10 * f16, f14, f15);
        }
        return -e((-h10) * f16, f14, f15);
    }

    public final float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.P;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.X && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    public final float h(float f10, float f11, float f12, float f13) {
        float f14;
        float e10 = e(f10 * f11, 0.0f, f12);
        float g10 = g(f11 - f13, e10) - g(f13, e10);
        if (g10 < 0.0f) {
            f14 = -this.f11760b.getInterpolation(-g10);
        } else if (g10 <= 0.0f) {
            return 0.0f;
        } else {
            f14 = this.f11760b.getInterpolation(g10);
        }
        return e(f14, -1.0f, 1.0f);
    }

    public final void i() {
        if (this.V) {
            this.X = false;
        } else {
            this.f11759a.i();
        }
    }

    public abstract void j(int i10, int i11);

    public a k(int i10) {
        this.Q = i10;
        return this;
    }

    public a l(int i10) {
        this.P = i10;
        return this;
    }

    public a m(boolean z10) {
        if (this.Y && !z10) {
            i();
        }
        this.Y = z10;
        return this;
    }

    public a n(float f10, float f11) {
        float[] fArr = this.O;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a o(float f10, float f11) {
        float[] fArr = this.T;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    @Override
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: f1.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f10, float f11) {
        float[] fArr = this.S;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a q(int i10) {
        this.f11759a.j(i10);
        return this;
    }

    public a r(int i10) {
        this.f11759a.k(i10);
        return this;
    }

    public a s(float f10, float f11) {
        float[] fArr = this.N;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a t(float f10, float f11) {
        float[] fArr = this.R;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public boolean u() {
        C0100a aVar = this.f11759a;
        int f10 = aVar.f();
        int d10 = aVar.d();
        return (f10 != 0 && b(f10)) || (d10 != 0 && a(d10));
    }

    public final void v() {
        int i10;
        if (this.M == null) {
            this.M = new b();
        }
        this.X = true;
        this.V = true;
        if (this.U || (i10 = this.Q) <= 0) {
            this.M.run();
        } else {
            v.U(this.f11761c, this.M, i10);
        }
        this.U = true;
    }
}
