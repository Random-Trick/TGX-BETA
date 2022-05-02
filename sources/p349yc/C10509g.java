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
    public static Paint f33699m;
    public float f33700a;
    public float f33701b;
    public float f33702c;
    public float f33703d;
    public View f33704e;
    public float f33705f;
    public boolean f33706g;
    public float f33707h;
    public float f33708i;
    public float f33709j;
    public float f33710k;
    public ValueAnimator f33711l;

    public class C10510a extends AnimatorListenerAdapter {
        public final float f33712a;
        public final float f33713b;

        public C10510a(float f, float f2) {
            this.f33712a = f;
            this.f33713b = f2;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (C10509g.this.f33706g) {
                C10509g.this.f33702c = this.f33712a;
                C10509g.this.f33703d = this.f33713b;
                return;
            }
            C10509g.this.f33700a = this.f33712a;
            C10509g.this.f33701b = this.f33713b;
        }
    }

    public C10509g(float f, float f2, float f3, float f4) {
        this.f33700a = f;
        this.f33701b = f2;
        this.f33702c = f3;
        this.f33703d = f4;
        if (f33699m == null) {
            Paint paint = new Paint(5);
            f33699m = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            f33699m.setStrokeWidth(C1357a0.m37544i(3.0f));
        }
    }

    public void m4878k(ValueAnimator valueAnimator) {
        m4876m(C2057b.m35738a(valueAnimator));
    }

    public static void m4877l(float f) {
        f33699m.setAlpha((int) (f * 255.0f));
    }

    public final void m4882g(float f, float f2) {
        this.f33709j = f - this.f33707h;
        this.f33710k = f2 - this.f33708i;
        this.f33705f = 0.0f;
        ValueAnimator b = C2057b.m35737b();
        this.f33711l = b;
        b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C10509g.this.m4878k(valueAnimator);
            }
        });
        this.f33711l.setDuration(140L);
        this.f33711l.setInterpolator(C2057b.f7280b);
        this.f33711l.addListener(new C10510a(f, f2));
        this.f33711l.start();
    }

    public void m4881h(Canvas canvas) {
        int alpha = f33699m.getAlpha();
        f33699m.setColor(C5064d.m24132a(alpha / 255.0f, C11524j.m228N(R.id.theme_color_passcodeIcon)));
        canvas.drawLine(this.f33700a, this.f33701b, this.f33702c, this.f33703d, f33699m);
        f33699m.setAlpha(alpha);
    }

    public float m4880i() {
        return this.f33702c;
    }

    public float m4879j() {
        return this.f33703d;
    }

    public void m4876m(float f) {
        if (this.f33705f != f) {
            this.f33705f = f;
            if (this.f33706g) {
                this.f33702c = this.f33707h + (this.f33709j * f);
                this.f33703d = this.f33708i + (f * this.f33710k);
            } else {
                this.f33700a = this.f33707h + (this.f33709j * f);
                this.f33701b = this.f33708i + (f * this.f33710k);
            }
            View view = this.f33704e;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public void m4875n(float f, float f2) {
        this.f33700a = f;
        this.f33701b = f2;
    }

    public void m4874o(float f, float f2) {
        float f3 = this.f33700a;
        if (f3 != f || this.f33701b != f2) {
            this.f33707h = f3;
            this.f33708i = this.f33701b;
            m4870s();
            this.f33706g = false;
            m4882g(f, f2);
        }
    }

    public void m4873p(View view) {
        this.f33704e = view;
    }

    public void m4872q(float f, float f2) {
        this.f33702c = f;
        this.f33703d = f2;
    }

    public void m4871r(float f, float f2) {
        float f3 = this.f33702c;
        if (f3 != f || this.f33703d != f2) {
            this.f33707h = f3;
            this.f33708i = this.f33703d;
            m4870s();
            this.f33706g = true;
            m4882g(f, f2);
        }
    }

    public void m4870s() {
        ValueAnimator valueAnimator = this.f33711l;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
