package zc;

import ae.j;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import ce.a0;
import ce.y;
import org.thunderdog.challegram.R;
import zc.l;

public class l {
    public float f27192a;
    public float f27193b;
    public float f27194c;
    public float f27195d;
    public float f27196e;
    public float f27197f;
    public int f27200i;
    public int f27201j;
    public View f27202k;
    public ValueAnimator f27203l;
    public boolean f27204m;
    public boolean f27205n;
    public float f27206o;
    public final c[] f27199h = new c[4];
    public float f27198g = a0.k(21.0f);

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            l.this.f27204m = false;
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            for (int i10 = 0; i10 < l.this.f27201j; i10++) {
                l.this.f27199h[i10].i(false);
            }
            l.this.f27201j = 0;
            l.this.f27205n = false;
            l.this.r();
        }
    }

    public static class c {
        public float f27209a;
        public boolean f27210b;
        public l f27211c;
        public ValueAnimator f27212d;

        public class a extends AnimatorListenerAdapter {
            public a() {
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                c.this.f27210b = false;
            }
        }

        public class b extends AnimatorListenerAdapter {
            public b() {
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                c.this.f27211c.y();
                c.this.f27210b = false;
            }
        }

        public c(l lVar) {
            this.f27211c = lVar;
        }

        public void g(ValueAnimator valueAnimator) {
            j(1.0f - db.b.a(valueAnimator));
        }

        public void h(ValueAnimator valueAnimator) {
            j(db.b.a(valueAnimator));
        }

        public final void d() {
            if (this.f27210b) {
                this.f27210b = false;
                float f10 = this.f27209a;
                ValueAnimator valueAnimator = this.f27212d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.f27209a = f10;
            }
        }

        public void e(Canvas canvas, float f10, float f11) {
            int i10 = a0.i(4.5f);
            Paint g10 = y.g(j.L(R.id.theme_color_passcodeIcon));
            if (this.f27210b) {
                canvas.drawCircle(f10, f11, i10 * this.f27209a, g10);
            } else {
                canvas.drawCircle(f10, f11, i10, g10);
            }
        }

        public void f() {
            d();
            this.f27210b = true;
            this.f27209a = 1.0f;
            ValueAnimator b10 = db.b.b();
            this.f27212d = b10;
            b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    l.c.this.g(valueAnimator);
                }
            });
            this.f27212d.setDuration(180L);
            this.f27212d.setInterpolator(db.b.f7287b);
            this.f27212d.addListener(new b());
            this.f27212d.start();
        }

        public void i(boolean z10) {
            if (z10) {
                if (this.f27210b) {
                    this.f27210b = false;
                    float f10 = this.f27209a;
                    this.f27212d.cancel();
                    this.f27209a = f10;
                }
                this.f27212d = null;
                this.f27210b = true;
            } else if (this.f27212d == null) {
                this.f27210b = false;
            }
        }

        public void j(float f10) {
            if (this.f27210b && this.f27209a != f10) {
                this.f27209a = f10;
                this.f27211c.n();
            }
        }

        public void k() {
            d();
            this.f27210b = true;
            this.f27209a = 0.0f;
            ValueAnimator b10 = db.b.b();
            this.f27212d = b10;
            b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    l.c.this.h(valueAnimator);
                }
            });
            this.f27212d.setDuration(180L);
            this.f27212d.setInterpolator(db.b.f7287b);
            this.f27212d.addListener(new a());
            this.f27212d.start();
        }
    }

    public void p(ValueAnimator valueAnimator) {
        v(db.b.a(valueAnimator));
    }

    public void q(ValueAnimator valueAnimator) {
        u(1.0f - db.b.a(valueAnimator));
    }

    public final void i() {
        boolean z10 = false;
        if (this.f27204m) {
            this.f27204m = false;
            float f10 = this.f27194c;
            this.f27203l.cancel();
            this.f27194c = f10;
        }
        this.f27195d = this.f27194c;
        float m10 = m() - this.f27194c;
        this.f27196e = m10;
        if (m10 != 0.0f) {
            z10 = true;
        }
        this.f27204m = z10;
        if (z10) {
            this.f27197f = 0.0f;
            ValueAnimator b10 = db.b.b();
            this.f27203l = b10;
            b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    l.this.p(valueAnimator);
                }
            });
            this.f27203l.setInterpolator(db.b.f7287b);
            this.f27203l.setDuration(180L);
            this.f27203l.addListener(new a());
            this.f27203l.start();
        }
    }

    public void j() {
        int i10;
        if (this.f27200i < 4 && (i10 = this.f27201j) < 4) {
            c[] cVarArr = this.f27199h;
            if (cVarArr[i10] == null) {
                cVarArr[i10] = new c(this);
            }
            int i11 = this.f27201j + 1;
            this.f27201j = i11;
            this.f27200i++;
            this.f27199h[i11 - 1].k();
            i();
        }
    }

    public void k() {
        this.f27200i = 0;
        this.f27201j = 0;
    }

    public void l(Canvas canvas) {
        float f10 = this.f27194c;
        for (int i10 = 0; i10 < this.f27201j; i10++) {
            this.f27199h[i10].e(canvas, f10, this.f27193b);
            f10 += this.f27198g;
        }
    }

    public final float m() {
        int i10 = this.f27200i;
        return i10 < 2 ? this.f27192a : this.f27192a - (((i10 - 1) * this.f27198g) * 0.5f);
    }

    public void n() {
        View view = this.f27202k;
        if (view != null) {
            view.invalidate();
        }
    }

    public boolean o() {
        return this.f27205n;
    }

    public final void r() {
        this.f27194c = m();
    }

    public void s() {
        int i10 = this.f27200i;
        if (i10 > 0) {
            this.f27199h[i10 - 1].f();
            this.f27200i--;
            i();
        }
    }

    public boolean t() {
        if (this.f27200i == 0) {
            return false;
        }
        this.f27205n = true;
        this.f27206o = 1.0f;
        for (int i10 = 0; i10 < this.f27200i; i10++) {
            this.f27199h[i10].i(true);
        }
        ValueAnimator b10 = db.b.b();
        b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                l.this.q(valueAnimator);
            }
        });
        b10.setDuration(180L);
        b10.setInterpolator(db.b.f7287b);
        b10.addListener(new b());
        b10.setStartDelay(20L);
        b10.start();
        this.f27200i = 0;
        return true;
    }

    public void u(float f10) {
        if (this.f27206o != f10) {
            for (int i10 = 0; i10 < this.f27201j; i10++) {
                this.f27199h[i10].f27209a = f10;
            }
            n();
        }
    }

    public void v(float f10) {
        if (this.f27204m && this.f27197f != f10) {
            this.f27197f = f10;
            this.f27194c = this.f27195d + (this.f27196e * f10);
            n();
        }
    }

    public void w(View view) {
        this.f27202k = view;
    }

    public void x(float f10, float f11, float f12, float f13) {
        this.f27192a = f10 + ((f12 - f10) * 0.5f);
        this.f27193b = f11 + ((f13 - f11) * 0.5f);
        r();
        n();
    }

    public void y() {
        int i10 = this.f27201j;
        if (i10 > 0) {
            this.f27201j = i10 - 1;
        }
    }
}
