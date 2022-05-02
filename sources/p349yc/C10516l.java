package p349yc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import be.C1357a0;
import be.C1410y;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p349yc.C10516l;
import p364zd.C11524j;

public class C10516l {
    public float f33723a;
    public float f33724b;
    public float f33725c;
    public float f33726d;
    public float f33727e;
    public float f33728f;
    public int f33731i;
    public int f33732j;
    public View f33733k;
    public ValueAnimator f33734l;
    public boolean f33735m;
    public boolean f33736n;
    public float f33737o;
    public final C10519c[] f33730h = new C10519c[4];
    public float f33729g = C1357a0.m37539k(21.0f);

    public class C10517a extends AnimatorListenerAdapter {
        public C10517a() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            C10516l.this.f33735m = false;
        }
    }

    public class C10518b extends AnimatorListenerAdapter {
        public C10518b() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            for (int i = 0; i < C10516l.this.f33732j; i++) {
                C10516l.this.f33730h[i].m4829i(false);
            }
            C10516l.this.f33732j = 0;
            C10516l.this.f33736n = false;
            C10516l.this.m4845r();
        }
    }

    public static class C10519c {
        public float f33740a;
        public boolean f33741b;
        public C10516l f33742c;
        public ValueAnimator f33743d;

        public class C10520a extends AnimatorListenerAdapter {
            public C10520a() {
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                C10519c.this.f33741b = false;
            }
        }

        public class C10521b extends AnimatorListenerAdapter {
            public C10521b() {
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                C10519c.this.f33742c.m4838y();
                C10519c.this.f33741b = false;
            }
        }

        public C10519c(C10516l lVar) {
            this.f33742c = lVar;
        }

        public void m4831g(ValueAnimator valueAnimator) {
            m4828j(1.0f - C2057b.m35735a(valueAnimator));
        }

        public void m4830h(ValueAnimator valueAnimator) {
            m4828j(C2057b.m35735a(valueAnimator));
        }

        public final void m4834d() {
            if (this.f33741b) {
                this.f33741b = false;
                float f = this.f33740a;
                ValueAnimator valueAnimator = this.f33743d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.f33740a = f;
            }
        }

        public void m4833e(Canvas canvas, float f, float f2) {
            int i = C1357a0.m37541i(4.5f);
            Paint g = C1410y.m37039g(C11524j.m228N(R.id.theme_color_passcodeIcon));
            if (this.f33741b) {
                canvas.drawCircle(f, f2, i * this.f33740a, g);
            } else {
                canvas.drawCircle(f, f2, i, g);
            }
        }

        public void m4832f() {
            m4834d();
            this.f33741b = true;
            this.f33740a = 1.0f;
            ValueAnimator b = C2057b.m35734b();
            this.f33743d = b;
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C10516l.C10519c.this.m4831g(valueAnimator);
                }
            });
            this.f33743d.setDuration(180L);
            this.f33743d.setInterpolator(C2057b.f7280b);
            this.f33743d.addListener(new C10521b());
            this.f33743d.start();
        }

        public void m4829i(boolean z) {
            if (z) {
                if (this.f33741b) {
                    this.f33741b = false;
                    float f = this.f33740a;
                    this.f33743d.cancel();
                    this.f33740a = f;
                }
                this.f33743d = null;
                this.f33741b = true;
            } else if (this.f33743d == null) {
                this.f33741b = false;
            }
        }

        public void m4828j(float f) {
            if (this.f33741b && this.f33740a != f) {
                this.f33740a = f;
                this.f33742c.m4849n();
            }
        }

        public void m4827k() {
            m4834d();
            this.f33741b = true;
            this.f33740a = 0.0f;
            ValueAnimator b = C2057b.m35734b();
            this.f33743d = b;
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C10516l.C10519c.this.m4830h(valueAnimator);
                }
            });
            this.f33743d.setDuration(180L);
            this.f33743d.setInterpolator(C2057b.f7280b);
            this.f33743d.addListener(new C10520a());
            this.f33743d.start();
        }
    }

    public void m4847p(ValueAnimator valueAnimator) {
        m4841v(C2057b.m35735a(valueAnimator));
    }

    public void m4846q(ValueAnimator valueAnimator) {
        m4842u(1.0f - C2057b.m35735a(valueAnimator));
    }

    public final void m4854i() {
        boolean z = false;
        if (this.f33735m) {
            this.f33735m = false;
            float f = this.f33725c;
            this.f33734l.cancel();
            this.f33725c = f;
        }
        this.f33726d = this.f33725c;
        float m = m4850m() - this.f33725c;
        this.f33727e = m;
        if (m != 0.0f) {
            z = true;
        }
        this.f33735m = z;
        if (z) {
            this.f33728f = 0.0f;
            ValueAnimator b = C2057b.m35734b();
            this.f33734l = b;
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C10516l.this.m4847p(valueAnimator);
                }
            });
            this.f33734l.setInterpolator(C2057b.f7280b);
            this.f33734l.setDuration(180L);
            this.f33734l.addListener(new C10517a());
            this.f33734l.start();
        }
    }

    public void m4853j() {
        int i;
        if (this.f33731i < 4 && (i = this.f33732j) < 4) {
            C10519c[] cVarArr = this.f33730h;
            if (cVarArr[i] == null) {
                cVarArr[i] = new C10519c(this);
            }
            int i2 = this.f33732j + 1;
            this.f33732j = i2;
            this.f33731i++;
            this.f33730h[i2 - 1].m4827k();
            m4854i();
        }
    }

    public void m4852k() {
        this.f33731i = 0;
        this.f33732j = 0;
    }

    public void m4851l(Canvas canvas) {
        float f = this.f33725c;
        for (int i = 0; i < this.f33732j; i++) {
            this.f33730h[i].m4833e(canvas, f, this.f33724b);
            f += this.f33729g;
        }
    }

    public final float m4850m() {
        int i = this.f33731i;
        return i < 2 ? this.f33723a : this.f33723a - (((i - 1) * this.f33729g) * 0.5f);
    }

    public void m4849n() {
        View view = this.f33733k;
        if (view != null) {
            view.invalidate();
        }
    }

    public boolean m4848o() {
        return this.f33736n;
    }

    public final void m4845r() {
        this.f33725c = m4850m();
    }

    public void m4844s() {
        int i = this.f33731i;
        if (i > 0) {
            this.f33730h[i - 1].m4832f();
            this.f33731i--;
            m4854i();
        }
    }

    public boolean m4843t() {
        if (this.f33731i == 0) {
            return false;
        }
        this.f33736n = true;
        this.f33737o = 1.0f;
        for (int i = 0; i < this.f33731i; i++) {
            this.f33730h[i].m4829i(true);
        }
        ValueAnimator b = C2057b.m35734b();
        b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C10516l.this.m4846q(valueAnimator);
            }
        });
        b.setDuration(180L);
        b.setInterpolator(C2057b.f7280b);
        b.addListener(new C10518b());
        b.setStartDelay(20L);
        b.start();
        this.f33731i = 0;
        return true;
    }

    public void m4842u(float f) {
        if (this.f33737o != f) {
            for (int i = 0; i < this.f33732j; i++) {
                this.f33730h[i].f33740a = f;
            }
            m4849n();
        }
    }

    public void m4841v(float f) {
        if (this.f33735m && this.f33728f != f) {
            this.f33728f = f;
            this.f33725c = this.f33726d + (this.f33727e * f);
            m4849n();
        }
    }

    public void m4840w(View view) {
        this.f33733k = view;
    }

    public void m4839x(float f, float f2, float f3, float f4) {
        this.f33723a = f + ((f3 - f) * 0.5f);
        this.f33724b = f2 + ((f4 - f2) * 0.5f);
        m4845r();
        m4849n();
    }

    public void m4838y() {
        int i = this.f33732j;
        if (i > 0) {
            this.f33732j = i - 1;
        }
    }
}
