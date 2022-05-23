package eb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.animation.Interpolator;
import ib.c;

public class k {
    public final int f11457a;
    public final b f11458b;
    public Interpolator f11459c;
    public long f11460d;
    public long f11461e;
    public int f11462f;
    public long f11463g;
    public Object f11464h;
    public float f11465i;
    public float f11466j;
    public boolean f11467k;
    public boolean f11468l;
    public ValueAnimator f11469m;
    public Runnable f11470n;

    public class a extends AnimatorListenerAdapter {
        public final float f11471a;
        public final float f11472b;

        public a(float f10, float f11) {
            this.f11471a = f10;
            this.f11472b = f11;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (k.this.f11467k) {
                k.this.z(this.f11471a + this.f11472b, 1.0f);
                k.this.x(false);
                k.this.f11458b.o4(k.this.f11457a, k.this.f11465i, k.this);
            }
        }

        @Override
        public void onAnimationStart(Animator animator) {
            k.this.u();
        }
    }

    public interface b {
        void n4(int i10, float f10, float f11, k kVar);

        void o4(int i10, float f10, k kVar);
    }

    public k(int i10, b bVar, Interpolator interpolator, long j10) {
        if (bVar != null) {
            this.f11457a = i10;
            this.f11458b = bVar;
            this.f11459c = interpolator;
            this.f11460d = j10;
            return;
        }
        throw new IllegalArgumentException();
    }

    public void w(float f10, float f11, ValueAnimator valueAnimator) {
        if (this.f11467k) {
            float a10 = db.b.a(valueAnimator);
            z(f10 + (f11 * a10), a10);
        }
    }

    public void A(int i10, boolean z10) {
        this.f11462f = c.h(this.f11462f, i10, z10);
    }

    public void B(Interpolator interpolator) {
        this.f11459c = interpolator;
    }

    public void C(boolean z10) {
        this.f11468l = z10;
    }

    public void D(long j10) {
        this.f11463g = j10;
    }

    public void E(Object obj) {
        this.f11464h = obj;
    }

    public void F(long j10) {
        this.f11461e = j10;
    }

    public void i(float f10) {
        j(f10, null);
    }

    public void j(float f10, View view) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f11467k) {
                k();
            }
            if (this.f11465i == f10) {
                u();
                this.f11458b.o4(this.f11457a, this.f11465i, this);
            } else if (this.f11468l) {
                this.f11465i = f10;
                this.f11458b.n4(this.f11457a, f10, 1.0f, this);
                this.f11458b.o4(this.f11457a, this.f11465i, this);
                u();
            } else {
                x(true);
                final float f11 = this.f11465i;
                final float f12 = f10 - f11;
                if (this.f11460d <= 0) {
                    z(f10, 1.0f);
                    this.f11458b.o4(this.f11457a, f10, this);
                    x(false);
                    return;
                }
                this.f11466j = f10;
                ValueAnimator b10 = db.b.b();
                this.f11469m = b10;
                b10.setDuration(this.f11460d);
                this.f11469m.setInterpolator(this.f11459c);
                this.f11469m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        k.this.w(f11, f12, valueAnimator);
                    }
                });
                this.f11469m.addListener(new a(f11, f12));
                long j10 = this.f11461e;
                if (j10 != 0) {
                    this.f11469m.setStartDelay(j10);
                }
                try {
                    if (view != null) {
                        db.b.c(view, this.f11469m);
                    } else {
                        this.f11469m.start();
                    }
                } catch (Throwable th) {
                    Log.e(org.thunderdog.challegram.Log.LOG_TAG, "Cannot start animation", th);
                    l(f10);
                }
            }
        } else {
            throw new AssertionError();
        }
    }

    public void k() {
        if (!this.f11467k) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            x(false);
            ValueAnimator valueAnimator = this.f11469m;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f11469m = null;
                return;
            }
            return;
        }
        throw new AssertionError();
    }

    public void l(float f10) {
        m(f10, false);
    }

    public void m(float f10, boolean z10) {
        k();
        if (this.f11465i == f10 || !z10) {
            this.f11465i = f10;
            return;
        }
        this.f11465i = f10;
        this.f11458b.o4(this.f11457a, f10, this);
    }

    public long n() {
        return this.f11460d;
    }

    public float o() {
        return this.f11465i;
    }

    public boolean p(int i10) {
        return (i10 & this.f11462f) != 0;
    }

    public int q() {
        return this.f11462f;
    }

    public long r() {
        return this.f11463g;
    }

    public Object s() {
        return this.f11464h;
    }

    public float t() {
        return this.f11467k ? this.f11466j : this.f11465i;
    }

    public final void u() {
        Runnable runnable = this.f11470n;
        if (runnable != null) {
            runnable.run();
        }
    }

    public boolean v() {
        return this.f11467k;
    }

    public final void x(boolean z10) {
        if (this.f11467k != z10) {
            this.f11467k = z10;
        }
    }

    public void y(long j10) {
        this.f11460d = j10;
    }

    public final void z(float f10, float f11) {
        if (this.f11465i != f10) {
            this.f11465i = f10;
            this.f11458b.n4(this.f11457a, f10, f11, this);
        }
    }

    public k(int i10, b bVar, Interpolator interpolator, long j10, float f10) {
        if (bVar != null) {
            this.f11457a = i10;
            this.f11458b = bVar;
            this.f11459c = interpolator;
            this.f11460d = j10;
            this.f11465i = f10;
            return;
        }
        throw new IllegalArgumentException();
    }
}
