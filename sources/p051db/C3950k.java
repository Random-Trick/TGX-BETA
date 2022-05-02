package p051db;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.animation.Interpolator;
import p037cb.C2057b;
import p108hb.C5063c;

public class C3950k {
    public final int f13291a;
    public final AbstractC3952b f13292b;
    public Interpolator f13293c;
    public long f13294d;
    public long f13295e;
    public int f13296f;
    public long f13297g;
    public Object f13298h;
    public float f13299i;
    public float f13300j;
    public boolean f13301k;
    public boolean f13302l;
    public ValueAnimator f13303m;
    public Runnable f13304n;

    public class C3951a extends AnimatorListenerAdapter {
        public final float f13305a;
        public final float f13306b;

        public C3951a(float f, float f2) {
            this.f13305a = f;
            this.f13306b = f2;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (C3950k.this.f13301k) {
                C3950k.this.m29529z(this.f13305a + this.f13306b, 1.0f);
                C3950k.this.m29531x(false);
                C3950k.this.f13292b.mo35Y0(C3950k.this.f13291a, C3950k.this.f13299i, C3950k.this);
            }
        }

        @Override
        public void onAnimationStart(Animator animator) {
            C3950k.this.m29534u();
        }
    }

    public interface AbstractC3952b {
        void mo45P5(int i, float f, float f2, C3950k kVar);

        void mo35Y0(int i, float f, C3950k kVar);
    }

    public C3950k(int i, AbstractC3952b bVar, Interpolator interpolator, long j) {
        if (bVar != null) {
            this.f13291a = i;
            this.f13292b = bVar;
            this.f13293c = interpolator;
            this.f13294d = j;
            return;
        }
        throw new IllegalArgumentException();
    }

    public void m29532w(float f, float f2, ValueAnimator valueAnimator) {
        if (this.f13301k) {
            float a = C2057b.m35738a(valueAnimator);
            m29529z(f + (f2 * a), a);
        }
    }

    public void m29560A(int i, boolean z) {
        this.f13296f = C5063c.m24139h(this.f13296f, i, z);
    }

    public void m29559B(Interpolator interpolator) {
        this.f13293c = interpolator;
    }

    public void m29558C(boolean z) {
        this.f13302l = z;
    }

    public void m29557D(long j) {
        this.f13297g = j;
    }

    public void m29556E(Object obj) {
        this.f13298h = obj;
    }

    public void m29555F(long j) {
        this.f13295e = j;
    }

    public void m29546i(float f) {
        m29545j(f, null);
    }

    public void m29545j(float f, View view) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f13301k) {
                m29544k();
            }
            if (this.f13299i == f) {
                m29534u();
                this.f13292b.mo35Y0(this.f13291a, this.f13299i, this);
            } else if (this.f13302l) {
                this.f13299i = f;
                this.f13292b.mo45P5(this.f13291a, f, 1.0f, this);
                this.f13292b.mo35Y0(this.f13291a, this.f13299i, this);
                m29534u();
            } else {
                m29531x(true);
                final float f2 = this.f13299i;
                final float f3 = f - f2;
                if (this.f13294d <= 0) {
                    m29529z(f, 1.0f);
                    this.f13292b.mo35Y0(this.f13291a, f, this);
                    m29531x(false);
                    return;
                }
                this.f13300j = f;
                ValueAnimator b = C2057b.m35737b();
                this.f13303m = b;
                b.setDuration(this.f13294d);
                this.f13303m.setInterpolator(this.f13293c);
                this.f13303m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C3950k.this.m29532w(f2, f3, valueAnimator);
                    }
                });
                this.f13303m.addListener(new C3951a(f2, f3));
                long j = this.f13295e;
                if (j != 0) {
                    this.f13303m.setStartDelay(j);
                }
                try {
                    if (view != null) {
                        C2057b.m35736c(view, this.f13303m);
                    } else {
                        this.f13303m.start();
                    }
                } catch (Throwable th) {
                    Log.e(org.thunderdog.challegram.Log.LOG_TAG, "Cannot start animation", th);
                    m29543l(f);
                }
            }
        } else {
            throw new AssertionError();
        }
    }

    public void m29544k() {
        if (!this.f13301k) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m29531x(false);
            ValueAnimator valueAnimator = this.f13303m;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f13303m = null;
                return;
            }
            return;
        }
        throw new AssertionError();
    }

    public void m29543l(float f) {
        m29542m(f, false);
    }

    public void m29542m(float f, boolean z) {
        m29544k();
        if (this.f13299i == f || !z) {
            this.f13299i = f;
            return;
        }
        this.f13299i = f;
        this.f13292b.mo35Y0(this.f13291a, f, this);
    }

    public long m29541n() {
        return this.f13294d;
    }

    public float m29540o() {
        return this.f13299i;
    }

    public boolean m29539p(int i) {
        return (i & this.f13296f) != 0;
    }

    public int m29538q() {
        return this.f13296f;
    }

    public long m29537r() {
        return this.f13297g;
    }

    public Object m29536s() {
        return this.f13298h;
    }

    public float m29535t() {
        return this.f13301k ? this.f13300j : this.f13299i;
    }

    public final void m29534u() {
        Runnable runnable = this.f13304n;
        if (runnable != null) {
            runnable.run();
        }
    }

    public boolean m29533v() {
        return this.f13301k;
    }

    public final void m29531x(boolean z) {
        if (this.f13301k != z) {
            this.f13301k = z;
        }
    }

    public void m29530y(long j) {
        this.f13294d = j;
    }

    public final void m29529z(float f, float f2) {
        if (this.f13299i != f) {
            this.f13299i = f;
            this.f13292b.mo45P5(this.f13291a, f, f2, this);
        }
    }

    public C3950k(int i, AbstractC3952b bVar, Interpolator interpolator, long j, float f) {
        if (bVar != null) {
            this.f13291a = i;
            this.f13292b = bVar;
            this.f13293c = interpolator;
            this.f13294d = j;
            this.f13299i = f;
            return;
        }
        throw new IllegalArgumentException();
    }
}
