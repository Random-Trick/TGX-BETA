package zc;

import ae.j;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import ce.a0;
import db.b;
import ib.d;
import org.thunderdog.challegram.R;

public class g {
    public static Paint f27171m;
    public float f27172a;
    public float f27173b;
    public float f27174c;
    public float f27175d;
    public View f27176e;
    public float f27177f;
    public boolean f27178g;
    public float f27179h;
    public float f27180i;
    public float f27181j;
    public float f27182k;
    public ValueAnimator f27183l;

    public class a extends AnimatorListenerAdapter {
        public final float f27184a;
        public final float f27185b;

        public a(float f10, float f11) {
            this.f27184a = f10;
            this.f27185b = f11;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (g.this.f27178g) {
                g.this.f27174c = this.f27184a;
                g.this.f27175d = this.f27185b;
                return;
            }
            g.this.f27172a = this.f27184a;
            g.this.f27173b = this.f27185b;
        }
    }

    public g(float f10, float f11, float f12, float f13) {
        this.f27172a = f10;
        this.f27173b = f11;
        this.f27174c = f12;
        this.f27175d = f13;
        if (f27171m == null) {
            Paint paint = new Paint(5);
            f27171m = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            f27171m.setStrokeWidth(a0.i(3.0f));
        }
    }

    public void k(ValueAnimator valueAnimator) {
        m(b.a(valueAnimator));
    }

    public static void l(float f10) {
        f27171m.setAlpha((int) (f10 * 255.0f));
    }

    public final void g(float f10, float f11) {
        this.f27181j = f10 - this.f27179h;
        this.f27182k = f11 - this.f27180i;
        this.f27177f = 0.0f;
        ValueAnimator b10 = b.b();
        this.f27183l = b10;
        b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                g.this.k(valueAnimator);
            }
        });
        this.f27183l.setDuration(140L);
        this.f27183l.setInterpolator(b.f7287b);
        this.f27183l.addListener(new a(f10, f11));
        this.f27183l.start();
    }

    public void h(Canvas canvas) {
        int alpha = f27171m.getAlpha();
        f27171m.setColor(d.a(alpha / 255.0f, j.L(R.id.theme_color_passcodeIcon)));
        canvas.drawLine(this.f27172a, this.f27173b, this.f27174c, this.f27175d, f27171m);
        f27171m.setAlpha(alpha);
    }

    public float i() {
        return this.f27174c;
    }

    public float j() {
        return this.f27175d;
    }

    public void m(float f10) {
        if (this.f27177f != f10) {
            this.f27177f = f10;
            if (this.f27178g) {
                this.f27174c = this.f27179h + (this.f27181j * f10);
                this.f27175d = this.f27180i + (f10 * this.f27182k);
            } else {
                this.f27172a = this.f27179h + (this.f27181j * f10);
                this.f27173b = this.f27180i + (f10 * this.f27182k);
            }
            View view = this.f27176e;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public void n(float f10, float f11) {
        this.f27172a = f10;
        this.f27173b = f11;
    }

    public void o(float f10, float f11) {
        float f12 = this.f27172a;
        if (f12 != f10 || this.f27173b != f11) {
            this.f27179h = f12;
            this.f27180i = this.f27173b;
            s();
            this.f27178g = false;
            g(f10, f11);
        }
    }

    public void p(View view) {
        this.f27176e = view;
    }

    public void q(float f10, float f11) {
        this.f27174c = f10;
        this.f27175d = f11;
    }

    public void r(float f10, float f11) {
        float f12 = this.f27174c;
        if (f12 != f10 || this.f27175d != f11) {
            this.f27179h = f12;
            this.f27180i = this.f27175d;
            s();
            this.f27178g = true;
            g(f10, f11);
        }
    }

    public void s() {
        ValueAnimator valueAnimator = this.f27183l;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
