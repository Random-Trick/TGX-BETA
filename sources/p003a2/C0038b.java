package p003a2;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import p016b1.C1132h;
import p159l1.C6295b;

public class C0038b extends Drawable implements Animatable {
    public static final Interpolator f86P = new LinearInterpolator();
    public static final Interpolator f87Q = new C6295b();
    public static final int[] f88R = {-16777216};
    public Animator f89M;
    public float f90N;
    public boolean f91O;
    public final C0041c f92a;
    public float f93b;
    public Resources f94c;

    public class C0039a implements ValueAnimator.AnimatorUpdateListener {
        public final C0041c f95a;

        public C0039a(C0041c cVar) {
            this.f95a = cVar;
        }

        @Override
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C0038b.this.m42540n(floatValue, this.f95a);
            C0038b.this.m42552b(floatValue, this.f95a, false);
            C0038b.this.invalidateSelf();
        }
    }

    public class C0040b implements Animator.AnimatorListener {
        public final C0041c f97a;

        public C0040b(C0041c cVar) {
            this.f97a = cVar;
        }

        @Override
        public void onAnimationCancel(Animator animator) {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
        }

        @Override
        public void onAnimationRepeat(Animator animator) {
            C0038b.this.m42552b(1.0f, this.f97a, true);
            this.f97a.m42539A();
            this.f97a.m42527l();
            C0038b bVar = C0038b.this;
            if (bVar.f91O) {
                bVar.f91O = false;
                animator.cancel();
                animator.setDuration(1332L);
                animator.start();
                this.f97a.m42515x(false);
                return;
            }
            bVar.f90N += 1.0f;
        }

        @Override
        public void onAnimationStart(Animator animator) {
            C0038b.this.f90N = 0.0f;
        }
    }

    public static class C0041c {
        public final Paint f100b;
        public final Paint f101c;
        public final Paint f102d;
        public int[] f107i;
        public int f108j;
        public float f109k;
        public float f110l;
        public float f111m;
        public boolean f112n;
        public Path f113o;
        public float f115q;
        public int f116r;
        public int f117s;
        public int f119u;
        public final RectF f99a = new RectF();
        public float f103e = 0.0f;
        public float f104f = 0.0f;
        public float f105g = 0.0f;
        public float f106h = 5.0f;
        public float f114p = 1.0f;
        public int f118t = 255;

        public C0041c() {
            Paint paint = new Paint();
            this.f100b = paint;
            Paint paint2 = new Paint();
            this.f101c = paint2;
            Paint paint3 = new Paint();
            this.f102d = paint3;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public void m42539A() {
            this.f109k = this.f103e;
            this.f110l = this.f104f;
            this.f111m = this.f105g;
        }

        public void m42538a(Canvas canvas, Rect rect) {
            RectF rectF = this.f99a;
            float f = this.f115q;
            float f2 = (this.f106h / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f116r * this.f114p) / 2.0f, this.f106h / 2.0f);
            }
            rectF.set(rect.centerX() - f2, rect.centerY() - f2, rect.centerX() + f2, rect.centerY() + f2);
            float f3 = this.f103e;
            float f4 = this.f105g;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.f104f + f4) * 360.0f) - f5;
            this.f100b.setColor(this.f119u);
            this.f100b.setAlpha(this.f118t);
            float f7 = this.f106h / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f102d);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.f100b);
            m42537b(canvas, f5, f6, rectF);
        }

        public void m42537b(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f112n) {
                Path path = this.f113o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f113o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.f113o.moveTo(0.0f, 0.0f);
                this.f113o.lineTo(this.f116r * this.f114p, 0.0f);
                Path path3 = this.f113o;
                float f3 = this.f114p;
                path3.lineTo((this.f116r * f3) / 2.0f, this.f117s * f3);
                this.f113o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((this.f116r * this.f114p) / 2.0f), rectF.centerY() + (this.f106h / 2.0f));
                this.f113o.close();
                this.f101c.setColor(this.f119u);
                this.f101c.setAlpha(this.f118t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f113o, this.f101c);
                canvas.restore();
            }
        }

        public int m42536c() {
            return this.f118t;
        }

        public float m42535d() {
            return this.f104f;
        }

        public int m42534e() {
            return this.f107i[m42533f()];
        }

        public int m42533f() {
            return (this.f108j + 1) % this.f107i.length;
        }

        public float m42532g() {
            return this.f103e;
        }

        public int m42531h() {
            return this.f107i[this.f108j];
        }

        public float m42530i() {
            return this.f110l;
        }

        public float m42529j() {
            return this.f111m;
        }

        public float m42528k() {
            return this.f109k;
        }

        public void m42527l() {
            m42519t(m42533f());
        }

        public void m42526m() {
            this.f109k = 0.0f;
            this.f110l = 0.0f;
            this.f111m = 0.0f;
            m42514y(0.0f);
            m42517v(0.0f);
            m42516w(0.0f);
        }

        public void m42525n(int i) {
            this.f118t = i;
        }

        public void m42524o(float f, float f2) {
            this.f116r = (int) f;
            this.f117s = (int) f2;
        }

        public void m42523p(float f) {
            if (f != this.f114p) {
                this.f114p = f;
            }
        }

        public void m42522q(float f) {
            this.f115q = f;
        }

        public void m42521r(int i) {
            this.f119u = i;
        }

        public void m42520s(ColorFilter colorFilter) {
            this.f100b.setColorFilter(colorFilter);
        }

        public void m42519t(int i) {
            this.f108j = i;
            this.f119u = this.f107i[i];
        }

        public void m42518u(int[] iArr) {
            this.f107i = iArr;
            m42519t(0);
        }

        public void m42517v(float f) {
            this.f104f = f;
        }

        public void m42516w(float f) {
            this.f105g = f;
        }

        public void m42515x(boolean z) {
            if (this.f112n != z) {
                this.f112n = z;
            }
        }

        public void m42514y(float f) {
            this.f103e = f;
        }

        public void m42513z(float f) {
            this.f106h = f;
            this.f100b.setStrokeWidth(f);
        }
    }

    public C0038b(Context context) {
        this.f94c = ((Context) C1132h.m38325e(context)).getResources();
        C0041c cVar = new C0041c();
        this.f92a = cVar;
        cVar.m42518u(f88R);
        m42543k(2.5f);
        m42541m();
    }

    public final void m42553a(float f, C0041c cVar) {
        m42540n(f, cVar);
        cVar.m42514y(cVar.m42528k() + (((cVar.m42530i() - 0.01f) - cVar.m42528k()) * f));
        cVar.m42517v(cVar.m42530i());
        cVar.m42516w(cVar.m42529j() + ((((float) (Math.floor(cVar.m42529j() / 0.8f) + 1.0d)) - cVar.m42529j()) * f));
    }

    public void m42552b(float f, C0041c cVar, boolean z) {
        float f2;
        float f3;
        if (this.f91O) {
            m42553a(f, cVar);
        } else if (f != 1.0f || z) {
            float j = cVar.m42529j();
            if (f < 0.5f) {
                f2 = cVar.m42528k();
                f3 = (f87Q.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + f2;
            } else {
                float k = cVar.m42528k() + 0.79f;
                f2 = k - (((1.0f - f87Q.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f3 = k;
            }
            cVar.m42514y(f2);
            cVar.m42517v(f3);
            cVar.m42516w(j + (0.20999998f * f));
            m42546h((f + this.f90N) * 216.0f);
        }
    }

    public final int m42551c(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) ((((i2 >> 24) & 255) - i3) * f))) << 24) | ((i4 + ((int) ((((i2 >> 16) & 255) - i4) * f))) << 16) | ((i5 + ((int) ((((i2 >> 8) & 255) - i5) * f))) << 8) | (i6 + ((int) (f * ((i2 & 255) - i6))));
    }

    public void m42550d(boolean z) {
        this.f92a.m42515x(z);
        invalidateSelf();
    }

    @Override
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f93b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f92a.m42538a(canvas, bounds);
        canvas.restore();
    }

    public void m42549e(float f) {
        this.f92a.m42523p(f);
        invalidateSelf();
    }

    public void m42548f(int... iArr) {
        this.f92a.m42518u(iArr);
        this.f92a.m42519t(0);
        invalidateSelf();
    }

    public void m42547g(float f) {
        this.f92a.m42516w(f);
        invalidateSelf();
    }

    @Override
    public int getAlpha() {
        return this.f92a.m42536c();
    }

    @Override
    public int getOpacity() {
        return -3;
    }

    public final void m42546h(float f) {
        this.f93b = f;
    }

    public final void m42545i(float f, float f2, float f3, float f4) {
        C0041c cVar = this.f92a;
        float f5 = this.f94c.getDisplayMetrics().density;
        cVar.m42513z(f2 * f5);
        cVar.m42522q(f * f5);
        cVar.m42519t(0);
        cVar.m42524o(f3 * f5, f4 * f5);
    }

    @Override
    public boolean isRunning() {
        return this.f89M.isRunning();
    }

    public void m42544j(float f, float f2) {
        this.f92a.m42514y(f);
        this.f92a.m42517v(f2);
        invalidateSelf();
    }

    public void m42543k(float f) {
        this.f92a.m42513z(f);
        invalidateSelf();
    }

    public void m42542l(int i) {
        if (i == 0) {
            m42545i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m42545i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public final void m42541m() {
        C0041c cVar = this.f92a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C0039a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f86P);
        ofFloat.addListener(new C0040b(cVar));
        this.f89M = ofFloat;
    }

    public void m42540n(float f, C0041c cVar) {
        if (f > 0.75f) {
            cVar.m42521r(m42551c((f - 0.75f) / 0.25f, cVar.m42531h(), cVar.m42534e()));
        } else {
            cVar.m42521r(cVar.m42531h());
        }
    }

    @Override
    public void setAlpha(int i) {
        this.f92a.m42525n(i);
        invalidateSelf();
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.f92a.m42520s(colorFilter);
        invalidateSelf();
    }

    @Override
    public void start() {
        this.f89M.cancel();
        this.f92a.m42539A();
        if (this.f92a.m42535d() != this.f92a.m42532g()) {
            this.f91O = true;
            this.f89M.setDuration(666L);
            this.f89M.start();
            return;
        }
        this.f92a.m42519t(0);
        this.f92a.m42526m();
        this.f89M.setDuration(1332L);
        this.f89M.start();
    }

    @Override
    public void stop() {
        this.f89M.cancel();
        m42546h(0.0f);
        this.f92a.m42515x(false);
        this.f92a.m42519t(0);
        this.f92a.m42526m();
        invalidateSelf();
    }
}
