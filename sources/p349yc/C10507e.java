package p349yc;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import be.C1357a0;
import be.C1379j0;
import be.C1410y;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p364zd.C11524j;

public class C10507e {
    public float f33691a;
    public float f33692b;
    public boolean f33693c;
    public C10503c f33694d;
    public float f33695e;
    public float f33696f;
    public float f33697g;

    public C10507e() {
        this.f33695e = C1357a0.m37542k(6.0f);
        this.f33696f = C1357a0.m37542k(10.0f) - this.f33695e;
    }

    public void m4892g(ValueAnimator valueAnimator) {
        m4891h(C2057b.m35738a(valueAnimator));
    }

    public void m4897b(Canvas canvas) {
        canvas.drawCircle(this.f33691a, this.f33692b, m4896c(), C1410y.m37042g(C11524j.m228N(R.id.theme_color_passcodeIcon)));
    }

    public final float m4896c() {
        float f = this.f33695e;
        float f2 = this.f33696f;
        float f3 = this.f33697g;
        return f + (f2 * (f3 > 0.5f ? (1.0f - f3) / 0.5f : f3 / 0.5f));
    }

    public float m4895d() {
        return this.f33691a;
    }

    public float m4894e() {
        return this.f33692b;
    }

    public boolean m4893f(float f, float f2, float f3) {
        if (!this.f33693c) {
            float f4 = this.f33691a;
            if (f >= f4 - f3 && f <= f4 + f3) {
                float f5 = this.f33692b;
                if (f2 >= f5 - f3 && f2 <= f5 + f3) {
                    return true;
                }
            }
        }
        return false;
    }

    public void m4891h(float f) {
        if (this.f33697g != f) {
            this.f33697g = f;
            C10503c cVar = this.f33694d;
            if (cVar != null) {
                cVar.invalidate();
            }
        }
    }

    public void m4890i(boolean z) {
        if (this.f33693c != z) {
            this.f33693c = z;
            if (z) {
                if (this.f33694d.getCallback().mo4902H2()) {
                    this.f33697g = 0.0f;
                    ValueAnimator b = C2057b.m35737b();
                    b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            C10507e.this.m4892g(valueAnimator);
                        }
                    });
                    b.setInterpolator(C2057b.f7285g);
                    b.setDuration(180L);
                    b.start();
                }
                C1379j0.m37363H(this.f33694d, false);
            }
        }
    }

    public void m4889j(float f, float f2) {
        this.f33691a = f;
        this.f33692b = f2;
    }

    public C10507e(C10503c cVar) {
        this();
        this.f33694d = cVar;
    }
}
