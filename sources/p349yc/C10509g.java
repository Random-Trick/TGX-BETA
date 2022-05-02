package p349yc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import be.C1357a0;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p108hb.C5064d;
import p364zd.C11524j;

public class C10509g {
    public static Paint f33696m;
    public float f33697a;
    public float f33698b;
    public float f33699c;
    public float f33700d;
    public View f33701e;
    public float f33702f;
    public boolean f33703g;
    public float f33704h;
    public float f33705i;
    public float f33706j;
    public float f33707k;
    public ValueAnimator f33708l;

    public class C10510a extends AnimatorListenerAdapter {
        public final float f33709a;
        public final float f33710b;

        public C10510a(float f, float f2) {
            this.f33709a = f;
            this.f33710b = f2;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (C10509g.this.f33703g) {
                C10509g.this.f33699c = this.f33709a;
                C10509g.this.f33700d = this.f33710b;
                return;
            }
            C10509g.this.f33697a = this.f33709a;
            C10509g.this.f33698b = this.f33710b;
        }
    }

    public C10509g(float f, float f2, float f3, float f4) {
        this.f33697a = f;
        this.f33698b = f2;
        this.f33699c = f3;
        this.f33700d = f4;
        if (f33696m == null) {
            Paint paint = new Paint(5);
            f33696m = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            f33696m.setStrokeWidth(C1357a0.m37541i(3.0f));
        }
    }

    public void m4878k(ValueAnimator valueAnimator) {
        m4876m(C2057b.m35735a(valueAnimator));
    }

    public static void m4877l(float f) {
        f33696m.setAlpha((int) (f * 255.0f));
    }

    public final void m4882g(float f, float f2) {
        this.f33706j = f - this.f33704h;
        this.f33707k = f2 - this.f33705i;
        this.f33702f = 0.0f;
        ValueAnimator b = C2057b.m35734b();
        this.f33708l = b;
        b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C10509g.this.m4878k(valueAnimator);
            }
        });
        this.f33708l.setDuration(140L);
        this.f33708l.setInterpolator(C2057b.f7280b);
        this.f33708l.addListener(new C10510a(f, f2));
        this.f33708l.start();
    }

    public void m4881h(Canvas canvas) {
        int alpha = f33696m.getAlpha();
        f33696m.setColor(C5064d.m24131a(alpha / 255.0f, C11524j.m228N(R.id.theme_color_passcodeIcon)));
        canvas.drawLine(this.f33697a, this.f33698b, this.f33699c, this.f33700d, f33696m);
        f33696m.setAlpha(alpha);
    }

    public float m4880i() {
        return this.f33699c;
    }

    public float m4879j() {
        return this.f33700d;
    }

    public void m4876m(float f) {
        if (this.f33702f != f) {
            this.f33702f = f;
            if (this.f33703g) {
                this.f33699c = this.f33704h + (this.f33706j * f);
                this.f33700d = this.f33705i + (f * this.f33707k);
            } else {
                this.f33697a = this.f33704h + (this.f33706j * f);
                this.f33698b = this.f33705i + (f * this.f33707k);
            }
            View view = this.f33701e;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public void m4875n(float f, float f2) {
        this.f33697a = f;
        this.f33698b = f2;
    }

    public void m4874o(float f, float f2) {
        float f3 = this.f33697a;
        if (f3 != f || this.f33698b != f2) {
            this.f33704h = f3;
            this.f33705i = this.f33698b;
            m4870s();
            this.f33703g = false;
            m4882g(f, f2);
        }
    }

    public void m4873p(View view) {
        this.f33701e = view;
    }

    public void m4872q(float f, float f2) {
        this.f33699c = f;
        this.f33700d = f2;
    }

    public void m4871r(float f, float f2) {
        float f3 = this.f33699c;
        if (f3 != f || this.f33700d != f2) {
            this.f33704h = f3;
            this.f33705i = this.f33700d;
            m4870s();
            this.f33703g = true;
            m4882g(f, f2);
        }
    }

    public void m4870s() {
        ValueAnimator valueAnimator = this.f33708l;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
