package a2;

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
import b1.h;

public class b extends Drawable implements Animatable {
    public static final Interpolator P = new LinearInterpolator();
    public static final Interpolator Q = new l1.a();
    public static final int[] R = {-16777216};
    public Animator M;
    public float N;
    public boolean O;
    public final c f78a;
    public float f79b;
    public Resources f80c;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final c f81a;

        public a(c cVar) {
            this.f81a = cVar;
        }

        @Override
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.n(floatValue, this.f81a);
            b.this.b(floatValue, this.f81a, false);
            b.this.invalidateSelf();
        }
    }

    public class C0008b implements Animator.AnimatorListener {
        public final c f83a;

        public C0008b(c cVar) {
            this.f83a = cVar;
        }

        @Override
        public void onAnimationCancel(Animator animator) {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
        }

        @Override
        public void onAnimationRepeat(Animator animator) {
            b.this.b(1.0f, this.f83a, true);
            this.f83a.A();
            this.f83a.l();
            b bVar = b.this;
            if (bVar.O) {
                bVar.O = false;
                animator.cancel();
                animator.setDuration(1332L);
                animator.start();
                this.f83a.x(false);
                return;
            }
            bVar.N += 1.0f;
        }

        @Override
        public void onAnimationStart(Animator animator) {
            b.this.N = 0.0f;
        }
    }

    public static class c {
        public final Paint f86b;
        public final Paint f87c;
        public final Paint f88d;
        public int[] f93i;
        public int f94j;
        public float f95k;
        public float f96l;
        public float f97m;
        public boolean f98n;
        public Path f99o;
        public float f101q;
        public int f102r;
        public int f103s;
        public int f105u;
        public final RectF f85a = new RectF();
        public float f89e = 0.0f;
        public float f90f = 0.0f;
        public float f91g = 0.0f;
        public float f92h = 5.0f;
        public float f100p = 1.0f;
        public int f104t = 255;

        public c() {
            Paint paint = new Paint();
            this.f86b = paint;
            Paint paint2 = new Paint();
            this.f87c = paint2;
            Paint paint3 = new Paint();
            this.f88d = paint3;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public void A() {
            this.f95k = this.f89e;
            this.f96l = this.f90f;
            this.f97m = this.f91g;
        }

        public void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f85a;
            float f10 = this.f101q;
            float f11 = (this.f92h / 2.0f) + f10;
            if (f10 <= 0.0f) {
                f11 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f102r * this.f100p) / 2.0f, this.f92h / 2.0f);
            }
            rectF.set(rect.centerX() - f11, rect.centerY() - f11, rect.centerX() + f11, rect.centerY() + f11);
            float f12 = this.f89e;
            float f13 = this.f91g;
            float f14 = (f12 + f13) * 360.0f;
            float f15 = ((this.f90f + f13) * 360.0f) - f14;
            this.f86b.setColor(this.f105u);
            this.f86b.setAlpha(this.f104t);
            float f16 = this.f92h / 2.0f;
            rectF.inset(f16, f16);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f88d);
            float f17 = -f16;
            rectF.inset(f17, f17);
            canvas.drawArc(rectF, f14, f15, false, this.f86b);
            b(canvas, f14, f15, rectF);
        }

        public void b(Canvas canvas, float f10, float f11, RectF rectF) {
            if (this.f98n) {
                Path path = this.f99o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f99o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.f99o.moveTo(0.0f, 0.0f);
                this.f99o.lineTo(this.f102r * this.f100p, 0.0f);
                Path path3 = this.f99o;
                float f12 = this.f100p;
                path3.lineTo((this.f102r * f12) / 2.0f, this.f103s * f12);
                this.f99o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((this.f102r * this.f100p) / 2.0f), rectF.centerY() + (this.f92h / 2.0f));
                this.f99o.close();
                this.f87c.setColor(this.f105u);
                this.f87c.setAlpha(this.f104t);
                canvas.save();
                canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f99o, this.f87c);
                canvas.restore();
            }
        }

        public int c() {
            return this.f104t;
        }

        public float d() {
            return this.f90f;
        }

        public int e() {
            return this.f93i[f()];
        }

        public int f() {
            return (this.f94j + 1) % this.f93i.length;
        }

        public float g() {
            return this.f89e;
        }

        public int h() {
            return this.f93i[this.f94j];
        }

        public float i() {
            return this.f96l;
        }

        public float j() {
            return this.f97m;
        }

        public float k() {
            return this.f95k;
        }

        public void l() {
            t(f());
        }

        public void m() {
            this.f95k = 0.0f;
            this.f96l = 0.0f;
            this.f97m = 0.0f;
            y(0.0f);
            v(0.0f);
            w(0.0f);
        }

        public void n(int i10) {
            this.f104t = i10;
        }

        public void o(float f10, float f11) {
            this.f102r = (int) f10;
            this.f103s = (int) f11;
        }

        public void p(float f10) {
            if (f10 != this.f100p) {
                this.f100p = f10;
            }
        }

        public void q(float f10) {
            this.f101q = f10;
        }

        public void r(int i10) {
            this.f105u = i10;
        }

        public void s(ColorFilter colorFilter) {
            this.f86b.setColorFilter(colorFilter);
        }

        public void t(int i10) {
            this.f94j = i10;
            this.f105u = this.f93i[i10];
        }

        public void u(int[] iArr) {
            this.f93i = iArr;
            t(0);
        }

        public void v(float f10) {
            this.f90f = f10;
        }

        public void w(float f10) {
            this.f91g = f10;
        }

        public void x(boolean z10) {
            if (this.f98n != z10) {
                this.f98n = z10;
            }
        }

        public void y(float f10) {
            this.f89e = f10;
        }

        public void z(float f10) {
            this.f92h = f10;
            this.f86b.setStrokeWidth(f10);
        }
    }

    public b(Context context) {
        this.f80c = ((Context) h.e(context)).getResources();
        c cVar = new c();
        this.f78a = cVar;
        cVar.u(R);
        k(2.5f);
        m();
    }

    public final void a(float f10, c cVar) {
        n(f10, cVar);
        cVar.y(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f10));
        cVar.v(cVar.i());
        cVar.w(cVar.j() + ((((float) (Math.floor(cVar.j() / 0.8f) + 1.0d)) - cVar.j()) * f10));
    }

    public void b(float f10, c cVar, boolean z10) {
        float f11;
        float f12;
        if (this.O) {
            a(f10, cVar);
        } else if (f10 != 1.0f || z10) {
            float j10 = cVar.j();
            if (f10 < 0.5f) {
                f11 = cVar.k();
                f12 = (Q.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + f11;
            } else {
                float k10 = cVar.k() + 0.79f;
                f11 = k10 - (((1.0f - Q.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f12 = k10;
            }
            cVar.y(f11);
            cVar.v(f12);
            cVar.w(j10 + (0.20999998f * f10));
            h((f10 + this.N) * 216.0f);
        }
    }

    public final int c(float f10, int i10, int i11) {
        int i12 = (i10 >> 24) & 255;
        int i13 = (i10 >> 16) & 255;
        int i14 = (i10 >> 8) & 255;
        int i15 = i10 & 255;
        return ((i12 + ((int) ((((i11 >> 24) & 255) - i12) * f10))) << 24) | ((i13 + ((int) ((((i11 >> 16) & 255) - i13) * f10))) << 16) | ((i14 + ((int) ((((i11 >> 8) & 255) - i14) * f10))) << 8) | (i15 + ((int) (f10 * ((i11 & 255) - i15))));
    }

    public void d(boolean z10) {
        this.f78a.x(z10);
        invalidateSelf();
    }

    @Override
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f79b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f78a.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f10) {
        this.f78a.p(f10);
        invalidateSelf();
    }

    public void f(int... iArr) {
        this.f78a.u(iArr);
        this.f78a.t(0);
        invalidateSelf();
    }

    public void g(float f10) {
        this.f78a.w(f10);
        invalidateSelf();
    }

    @Override
    public int getAlpha() {
        return this.f78a.c();
    }

    @Override
    public int getOpacity() {
        return -3;
    }

    public final void h(float f10) {
        this.f79b = f10;
    }

    public final void i(float f10, float f11, float f12, float f13) {
        c cVar = this.f78a;
        float f14 = this.f80c.getDisplayMetrics().density;
        cVar.z(f11 * f14);
        cVar.q(f10 * f14);
        cVar.t(0);
        cVar.o(f12 * f14, f13 * f14);
    }

    @Override
    public boolean isRunning() {
        return this.M.isRunning();
    }

    public void j(float f10, float f11) {
        this.f78a.y(f10);
        this.f78a.v(f11);
        invalidateSelf();
    }

    public void k(float f10) {
        this.f78a.z(f10);
        invalidateSelf();
    }

    public void l(int i10) {
        if (i10 == 0) {
            i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public final void m() {
        c cVar = this.f78a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(P);
        ofFloat.addListener(new C0008b(cVar));
        this.M = ofFloat;
    }

    public void n(float f10, c cVar) {
        if (f10 > 0.75f) {
            cVar.r(c((f10 - 0.75f) / 0.25f, cVar.h(), cVar.e()));
        } else {
            cVar.r(cVar.h());
        }
    }

    @Override
    public void setAlpha(int i10) {
        this.f78a.n(i10);
        invalidateSelf();
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.f78a.s(colorFilter);
        invalidateSelf();
    }

    @Override
    public void start() {
        this.M.cancel();
        this.f78a.A();
        if (this.f78a.d() != this.f78a.g()) {
            this.O = true;
            this.M.setDuration(666L);
            this.M.start();
            return;
        }
        this.f78a.t(0);
        this.f78a.m();
        this.M.setDuration(1332L);
        this.M.start();
    }

    @Override
    public void stop() {
        this.M.cancel();
        h(0.0f);
        this.f78a.x(false);
        this.f78a.t(0);
        this.f78a.m();
        invalidateSelf();
    }
}
