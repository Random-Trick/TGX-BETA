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
    public float f33726a;
    public float f33727b;
    public float f33728c;
    public float f33729d;
    public float f33730e;
    public float f33731f;
    public int f33734i;
    public int f33735j;
    public View f33736k;
    public ValueAnimator f33737l;
    public boolean f33738m;
    public boolean f33739n;
    public float f33740o;
    public final C10519c[] f33733h = new C10519c[4];
    public float f33732g = C1357a0.m37542k(21.0f);

    public class C10517a extends AnimatorListenerAdapter {
        public C10517a() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            C10516l.this.f33738m = false;
        }
    }

    public class C10518b extends AnimatorListenerAdapter {
        public C10518b() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            for (int i = 0; i < C10516l.this.f33735j; i++) {
                C10516l.this.f33733h[i].m4829i(false);
            }
            C10516l.this.f33735j = 0;
            C10516l.this.f33739n = false;
            C10516l.this.m4845r();
        }
    }

    public static class C10519c {
        public float f33743a;
        public boolean f33744b;
        public C10516l f33745c;
        public ValueAnimator f33746d;

        public class C10520a extends AnimatorListenerAdapter {
            public C10520a() {
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                C10519c.this.f33744b = false;
            }
        }

        public class C10521b extends AnimatorListenerAdapter {
            public C10521b() {
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                C10519c.this.f33745c.m4838y();
                C10519c.this.f33744b = false;
            }
        }

        public C10519c(C10516l lVar) {
            this.f33745c = lVar;
        }

        public void m4831g(ValueAnimator valueAnimator) {
            m4828j(1.0f - C2057b.m35738a(valueAnimator));
        }

        public void m4830h(ValueAnimator valueAnimator) {
            m4828j(C2057b.m35738a(valueAnimator));
        }

        public final void m4834d() {
            if (this.f33744b) {
                this.f33744b = false;
                float f = this.f33743a;
                ValueAnimator valueAnimator = this.f33746d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.f33743a = f;
            }
        }

        public void m4833e(Canvas canvas, float f, float f2) {
            int i = C1357a0.m37544i(4.5f);
            Paint g = C1410y.m37042g(C11524j.m228N(R.id.theme_color_passcodeIcon));
            if (this.f33744b) {
                canvas.drawCircle(f, f2, i * this.f33743a, g);
            } else {
                canvas.drawCircle(f, f2, i, g);
            }
        }

        public void m4832f() {
            m4834d();
            this.f33744b = true;
            this.f33743a = 1.0f;
            ValueAnimator b = C2057b.m35737b();
            this.f33746d = b;
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C10516l.C10519c.this.m4831g(valueAnimator);
                }
            });
            this.f33746d.setDuration(180L);
            this.f33746d.setInterpolator(C2057b.f7280b);
            this.f33746d.addListener(new C10521b());
            this.f33746d.start();
        }

        public void m4829i(boolean z) {
            if (z) {
                if (this.f33744b) {
                    this.f33744b = false;
                    float f = this.f33743a;
                    this.f33746d.cancel();
                    this.f33743a = f;
                }
                this.f33746d = null;
                this.f33744b = true;
            } else if (this.f33746d == null) {
                this.f33744b = false;
            }
        }

        public void m4828j(float f) {
            if (this.f33744b && this.f33743a != f) {
                this.f33743a = f;
                this.f33745c.m4849n();
            }
        }

        public void m4827k() {
            m4834d();
            this.f33744b = true;
            this.f33743a = 0.0f;
            ValueAnimator b = C2057b.m35737b();
            this.f33746d = b;
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C10516l.C10519c.this.m4830h(valueAnimator);
                }
            });
            this.f33746d.setDuration(180L);
            this.f33746d.setInterpolator(C2057b.f7280b);
            this.f33746d.addListener(new C10520a());
            this.f33746d.start();
        }
    }

    public void m4847p(ValueAnimator valueAnimator) {
        m4841v(C2057b.m35738a(valueAnimator));
    }

    public void m4846q(ValueAnimator valueAnimator) {
        m4842u(1.0f - C2057b.m35738a(valueAnimator));
    }

    public final void m4854i() {
        boolean z = false;
        if (this.f33738m) {
            this.f33738m = false;
            float f = this.f33728c;
            this.f33737l.cancel();
            this.f33728c = f;
        }
        this.f33729d = this.f33728c;
        float m = m4850m() - this.f33728c;
        this.f33730e = m;
        if (m != 0.0f) {
            z = true;
        }
        this.f33738m = z;
        if (z) {
            this.f33731f = 0.0f;
            ValueAnimator b = C2057b.m35737b();
            this.f33737l = b;
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C10516l.this.m4847p(valueAnimator);
                }
            });
            this.f33737l.setInterpolator(C2057b.f7280b);
            this.f33737l.setDuration(180L);
            this.f33737l.addListener(new C10517a());
            this.f33737l.start();
        }
    }

    public void m4853j() {
        int i;
        if (this.f33734i < 4 && (i = this.f33735j) < 4) {
            C10519c[] cVarArr = this.f33733h;
            if (cVarArr[i] == null) {
                cVarArr[i] = new C10519c(this);
            }
            int i2 = this.f33735j + 1;
            this.f33735j = i2;
            this.f33734i++;
            this.f33733h[i2 - 1].m4827k();
            m4854i();
        }
    }

    public void m4852k() {
        this.f33734i = 0;
        this.f33735j = 0;
    }

    public void m4851l(Canvas canvas) {
        float f = this.f33728c;
        for (int i = 0; i < this.f33735j; i++) {
            this.f33733h[i].m4833e(canvas, f, this.f33727b);
            f += this.f33732g;
        }
    }

    public final float m4850m() {
        int i = this.f33734i;
        return i < 2 ? this.f33726a : this.f33726a - (((i - 1) * this.f33732g) * 0.5f);
    }

    public void m4849n() {
        View view = this.f33736k;
        if (view != null) {
            view.invalidate();
        }
    }

    public boolean m4848o() {
        return this.f33739n;
    }

    public final void m4845r() {
        this.f33728c = m4850m();
    }

    public void m4844s() {
        int i = this.f33734i;
        if (i > 0) {
            this.f33733h[i - 1].m4832f();
            this.f33734i--;
            m4854i();
        }
    }

    public boolean m4843t() {
        if (this.f33734i == 0) {
            return false;
        }
        this.f33739n = true;
        this.f33740o = 1.0f;
        for (int i = 0; i < this.f33734i; i++) {
            this.f33733h[i].m4829i(true);
        }
        ValueAnimator b = C2057b.m35737b();
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
        this.f33734i = 0;
        return true;
    }

    public void m4842u(float f) {
        if (this.f33740o != f) {
            for (int i = 0; i < this.f33735j; i++) {
                this.f33733h[i].f33743a = f;
            }
            m4849n();
        }
    }

    public void m4841v(float f) {
        if (this.f33738m && this.f33731f != f) {
            this.f33731f = f;
            this.f33728c = this.f33729d + (this.f33730e * f);
            m4849n();
        }
    }

    public void m4840w(View view) {
        this.f33736k = view;
    }

    public void m4839x(float f, float f2, float f3, float f4) {
        this.f33726a = f + ((f3 - f) * 0.5f);
        this.f33727b = f2 + ((f4 - f2) * 0.5f);
        m4845r();
        m4849n();
    }

    public void m4838y() {
        int i = this.f33735j;
        if (i > 0) {
            this.f33735j = i - 1;
        }
    }
}
