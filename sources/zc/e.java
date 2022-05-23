package zc;

import ae.j;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import ce.a0;
import ce.j0;
import ce.y;
import db.b;
import org.thunderdog.challegram.R;

public class e {
    public float f27163a;
    public float f27164b;
    public boolean f27165c;
    public c f27166d;
    public float f27167e;
    public float f27168f;
    public float f27169g;

    public e() {
        this.f27167e = a0.k(6.0f);
        this.f27168f = a0.k(10.0f) - this.f27167e;
    }

    public void g(ValueAnimator valueAnimator) {
        h(b.a(valueAnimator));
    }

    public void b(Canvas canvas) {
        canvas.drawCircle(this.f27163a, this.f27164b, c(), y.g(j.L(R.id.theme_color_passcodeIcon)));
    }

    public final float c() {
        float f10 = this.f27167e;
        float f11 = this.f27168f;
        float f12 = this.f27169g;
        return f10 + (f11 * (f12 > 0.5f ? (1.0f - f12) / 0.5f : f12 / 0.5f));
    }

    public float d() {
        return this.f27163a;
    }

    public float e() {
        return this.f27164b;
    }

    public boolean f(float f10, float f11, float f12) {
        if (!this.f27165c) {
            float f13 = this.f27163a;
            if (f10 >= f13 - f12 && f10 <= f13 + f12) {
                float f14 = this.f27164b;
                if (f11 >= f14 - f12 && f11 <= f14 + f12) {
                    return true;
                }
            }
        }
        return false;
    }

    public void h(float f10) {
        if (this.f27169g != f10) {
            this.f27169g = f10;
            c cVar = this.f27166d;
            if (cVar != null) {
                cVar.invalidate();
            }
        }
    }

    public void i(boolean z10) {
        if (this.f27165c != z10) {
            this.f27165c = z10;
            if (z10) {
                if (this.f27166d.getCallback().z2()) {
                    this.f27169g = 0.0f;
                    ValueAnimator b10 = b.b();
                    b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            e.this.g(valueAnimator);
                        }
                    });
                    b10.setInterpolator(b.f7292g);
                    b10.setDuration(180L);
                    b10.start();
                }
                j0.H(this.f27166d, false);
            }
        }
    }

    public void j(float f10, float f11) {
        this.f27163a = f10;
        this.f27164b = f11;
    }

    public e(c cVar) {
        this();
        this.f27166d = cVar;
    }
}
