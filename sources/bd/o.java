package bd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import ce.y;
import nb.c;
import oc.v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;

public class o extends View {
    public static final c G0 = new c(-1, -9720352);
    public static final c H0 = new c(-1712789529, 15263719);
    public b A0;
    public int B0;
    public float D0;
    public float E0;
    public float F0;
    public int S;
    public int T;
    public boolean f4135a;
    public RectF f4147j0;
    public Paint f4148k0;
    public Paint f4149l0;
    public int f4150m0;
    public int f4151n0;
    public int f4152o0;
    public int f4153p0;
    public float f4155r0;
    public int f4156s0;
    public int f4157t0;
    public int f4158u0;
    public int f4159v0;
    public String f4160w0;
    public String f4161x0;
    public float f4162y0;
    public float f4163z0;
    public int C0 = -1;
    public Drawable f4137b = ce.c.g(getResources(), R.drawable.baseline_picture_in_picture_24);
    public Drawable f4139c = ce.c.g(getResources(), R.drawable.baseline_fullscreen_24);
    public Drawable M = ce.c.g(getResources(), R.drawable.baseline_fullscreen_exit_24);
    public Drawable N = ce.c.g(getResources(), R.drawable.baseline_play_circle_outline_48);
    public int O = a0.i(62.0f);
    public int P = a0.i(103.0f);
    public int Q = a0.i(19.0f);
    public int R = a0.i(4.0f);
    public int U = a0.i(6.0f);
    public int V = a0.i(3.0f);
    public int W = a0.i(11.0f);
    public int f4136a0 = a0.i(17.0f);
    public int f4138b0 = a0.i(22.0f);
    public int f4140c0 = a0.i(14.0f);
    public int f4141d0 = a0.i(19.0f);
    public int f4145h0 = a0.i(48.0f);
    public int f4142e0 = a0.i(31.0f);
    public int f4143f0 = a0.i(72.0f);
    public int f4144g0 = a0.i(17.0f);
    public int f4146i0 = a0.i(46.0f);
    public float f4154q0 = 1.0f;

    public class a extends AnimatorListenerAdapter {
        public final int f4164a;

        public a(int i10) {
            this.f4164a = i10;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            o.this.setCurrentSeek(this.f4164a);
            o.this.C0 = -1;
            if (o.this.A0 != null) {
                o.this.A0.h(this.f4164a);
            }
        }
    }

    public interface b {
        void G0();

        void H();

        void U(boolean z10);

        void a();

        void b1();

        void d0();

        void h(int i10);

        void i();

        void n1(boolean z10);

        boolean w0();
    }

    public o(Context context) {
        super(context);
        int i10 = a0.i(1.5f);
        this.S = i10;
        this.T = this.R - i10;
        RectF rectF = new RectF();
        this.f4147j0 = rectF;
        rectF.bottom = this.f4146i0;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f4146i0, 0, -1879048192, Shader.TileMode.CLAMP);
        Paint paint = new Paint(5);
        this.f4149l0 = paint;
        paint.setShader(linearGradient);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, this.f4146i0, -1879048192, 0, Shader.TileMode.CLAMP);
        Paint paint2 = new Paint(5);
        this.f4148k0 = paint2;
        paint2.setShader(linearGradient2);
    }

    public void p(float f10, ValueAnimator valueAnimator) {
        setPause(f10 - (db.b.a(valueAnimator) * f10));
    }

    public void q(float f10, float f11, ValueAnimator valueAnimator) {
        setPause(f10 + (f11 * db.b.a(valueAnimator)));
    }

    public void r(float f10, ValueAnimator valueAnimator) {
        setMinimize(f10 - (db.b.a(valueAnimator) * f10));
    }

    public void s(float f10, float f11, ValueAnimator valueAnimator) {
        setMinimize(f10 + (f11 * db.b.a(valueAnimator)));
    }

    public void t(float f10, float f11, ValueAnimator valueAnimator) {
        setSeekFactor(f10 + (f11 * db.b.a(valueAnimator)));
    }

    public void u(float f10, ValueAnimator valueAnimator) {
        setSeekFactor(f10 - (db.b.a(valueAnimator) * f10));
    }

    public void A(int i10, int i11, int i12) {
        this.f4150m0 = i10;
        this.f4151n0 = i11;
        this.f4152o0 = i12;
        o(true);
    }

    public void B(boolean z10) {
        if (z10) {
            this.f4153p0 &= -3;
        } else {
            this.f4153p0 |= 2;
        }
        final float minimize = getMinimize();
        ValueAnimator b10 = db.b.b();
        if (z10) {
            b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    o.this.r(minimize, valueAnimator);
                }
            });
        } else {
            final float f10 = 1.0f - minimize;
            b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    o.this.s(minimize, f10, valueAnimator);
                }
            });
        }
        b10.setDuration(200L);
        b10.setInterpolator(db.b.f7287b);
        b10.start();
        b bVar = this.A0;
        if (bVar != null) {
            bVar.U(z10);
        }
    }

    public final void C() {
        final float seekFactor = getSeekFactor();
        final float f10 = 1.0f - seekFactor;
        ValueAnimator b10 = db.b.b();
        b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                o.this.t(seekFactor, f10, valueAnimator);
            }
        });
        b10.setDuration(160L);
        b10.setInterpolator(db.b.f7287b);
        b10.start();
    }

    public final void D(boolean z10) {
        if (z10) {
            int i10 = this.C0;
            int i11 = this.O;
            final float seekFactor = getSeekFactor();
            ValueAnimator b10 = db.b.b();
            b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    o.this.u(seekFactor, valueAnimator);
                }
            });
            b10.setDuration(160L);
            b10.setInterpolator(db.b.f7287b);
            b10.addListener(new a((int) (this.f4156s0 * ((i10 - i11) / ((this.f4150m0 - i11) - this.P)))));
            b10.start();
            return;
        }
        this.C0 = -1;
        o(false);
    }

    public float getFactor() {
        return this.f4154q0;
    }

    public float getMinimize() {
        return this.f4155r0;
    }

    public float getPause() {
        return this.f4162y0;
    }

    public float getSeekFactor() {
        return this.f4163z0;
    }

    public final void i() {
        String str = this.f4161x0;
        int i10 = 0;
        int length = str == null ? 0 : str.length();
        String str2 = this.f4160w0;
        if (str2 != null) {
            i10 = str2.length();
        }
        int i11 = this.f4157t0 / 1000;
        this.f4161x0 = f.a(i11);
        this.f4160w0 = f.a((this.f4156s0 / 1000) - i11);
        if (this.f4161x0.length() != length) {
            this.f4159v0 = (int) v0.T1(this.f4161x0, y.b0(13.0f));
        }
        if (this.f4160w0.length() != i10) {
            this.f4158u0 = (int) v0.T1(this.f4160w0, y.b0(13.0f));
        }
    }

    public final int j(float f10, float f11) {
        int max = (int) ((f10 - this.D0) * (((Math.max(Math.min(this.f4151n0 - this.f4146i0, f11), 0.0f) / (this.f4151n0 - this.f4146i0)) * 0.75f) + 0.25f));
        this.D0 = f10;
        return max;
    }

    public final void k(Canvas canvas) {
        Drawable drawable = (this.f4153p0 & 1) != 0 ? this.M : this.f4139c;
        Paint W = y.W(-1);
        float f10 = this.f4155r0;
        if (f10 == 0.0f) {
            if (this.f4135a) {
                Drawable drawable2 = this.f4137b;
                ce.c.b(canvas, drawable2, (this.f4150m0 - this.f4136a0) - drawable2.getMinimumWidth(), this.W, W);
            }
            int i10 = this.f4150m0 - this.f4138b0;
            int i11 = this.f4141d0;
            ce.c.b(canvas, drawable, i10 - i11, (this.f4151n0 - this.f4140c0) - i11, W);
        } else {
            if (this.f4135a) {
                W.setAlpha((int) ((1.0f - f10) * 255.0f));
                Drawable drawable3 = this.f4137b;
                ce.c.b(canvas, drawable3, (this.f4150m0 - this.f4136a0) - drawable3.getMinimumWidth(), this.W, W);
                W.setAlpha(255);
            }
            int i12 = this.f4150m0 - this.f4138b0;
            int i13 = this.f4141d0;
            float f11 = this.f4155r0;
            ce.c.b(canvas, drawable, (i12 - i13) + ((int) (this.P * f11)), ((this.f4151n0 - this.f4140c0) - i13) + ((int) ((this.Q + this.T) * f11)), W);
        }
        float f12 = this.f4162y0;
        if (f12 != 0.0f) {
            int i14 = (int) (this.f4150m0 * 0.5f);
            int i15 = (int) (this.f4151n0 * 0.5f);
            if (f12 != 1.0f) {
                float f13 = ((1.0f - f12) * 0.25f) + 1.0f;
                canvas.save();
                canvas.scale(f13, f13, i14, i15);
                W.setAlpha((int) (this.f4162y0 * 255.0f));
            }
            Drawable drawable4 = this.N;
            ce.c.b(canvas, drawable4, i14 - ((int) (drawable4.getMinimumWidth() * 0.5f)), i15 - ((int) (this.N.getMinimumHeight() * 0.5f)), W);
            if (this.f4162y0 != 1.0f) {
                W.setAlpha(255);
                canvas.restore();
            }
        }
    }

    public final void l(Canvas canvas) {
        float f10 = this.f4155r0;
        if (f10 != 1.0f) {
            if (f10 != 0.0f) {
                int i10 = (int) ((1.0f - f10) * 255.0f);
                this.f4148k0.setAlpha(i10);
                this.f4149l0.setAlpha(i10);
            }
            RectF rectF = this.f4147j0;
            rectF.right = this.f4150m0;
            canvas.drawRect(rectF, this.f4148k0);
            canvas.save();
            canvas.translate(0.0f, this.f4151n0 - this.f4146i0);
            canvas.drawRect(this.f4147j0, this.f4149l0);
            canvas.restore();
            if (this.f4155r0 != 0.0f) {
                this.f4148k0.setAlpha(255);
                this.f4149l0.setAlpha(255);
            }
        }
    }

    public final void m(Canvas canvas) {
        int i10 = this.f4156s0;
        float f10 = i10 == 0 ? 0.0f : this.f4157t0 / i10;
        int i11 = this.f4150m0;
        int i12 = this.O;
        float f11 = this.f4155r0;
        int i13 = i11 - ((int) ((this.P + i12) * (1.0f - f11)));
        int i14 = this.R - ((int) (this.T * f11));
        int i15 = (int) (this.Q * (1.0f - f11));
        int i16 = this.f4151n0;
        int i17 = (i16 - i15) - i14;
        int i18 = i16 - i15;
        int i19 = (int) (i12 * (1.0f - f11));
        float f12 = ((int) (i13 * f10)) + i19;
        float f13 = i17;
        float f14 = i13 + i19;
        float f15 = i18;
        canvas.drawRect(f12, f13, f14, f15, y.g(H0.a(f11)));
        canvas.drawRect(i19, f13, f12, f15, y.g(G0.a(this.f4155r0)));
        int i20 = this.U + ((int) (this.V * this.f4163z0));
        int i21 = this.C0;
        if (i21 != -1) {
            f12 = i21;
        }
        canvas.drawCircle(f12, i17 + ((int) (i14 * 0.5f)), (int) (i20 * (1.0f - this.f4155r0)), y.z0());
    }

    public final void n(Canvas canvas) {
        TextPaint c02 = y.c0(13.0f, -1);
        float f10 = this.f4155r0;
        if (f10 == 0.0f) {
            String str = this.f4161x0;
            if (str != null) {
                canvas.drawText(str, this.f4142e0 - ((int) (this.f4159v0 * 0.5f)), this.f4151n0 - this.f4144g0, c02);
            }
            String str2 = this.f4160w0;
            if (str2 != null) {
                canvas.drawText(str2, (this.f4150m0 - this.f4143f0) - ((int) (this.f4158u0 * 0.5f)), this.f4151n0 - this.f4144g0, c02);
                return;
            }
            return;
        }
        String str3 = this.f4161x0;
        if (str3 != null) {
            canvas.drawText(str3, (this.f4142e0 - ((int) (this.f4159v0 * 0.5f))) - ((int) (this.O * f10)), (this.f4151n0 - this.f4144g0) + ((int) ((this.Q + this.T) * f10)), c02);
        }
        String str4 = this.f4160w0;
        if (str4 != null) {
            float f11 = this.f4155r0;
            canvas.drawText(str4, ((this.f4150m0 - this.f4143f0) - ((int) (this.f4158u0 * 0.5f))) + ((int) (this.P * f11)), (this.f4151n0 - this.f4144g0) + ((int) ((this.Q + this.T) * f11)), c02);
        }
    }

    public final void o(boolean z10) {
        invalidate(0, (-this.f4151n0) - this.f4152o0, getMeasuredWidth(), getMeasuredHeight());
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (((int) (Math.max(this.f4154q0, this.f4155r0) * 255.0f)) != 0) {
            canvas.save();
            canvas.translate(0.0f, (-this.f4151n0) - this.f4152o0);
            if ((this.f4153p0 & 16) != 0) {
                canvas.clipRect(0, 0, this.f4150m0, this.f4151n0);
            }
            if (!(this.f4161x0 == null || this.f4160w0 == null)) {
                l(canvas);
                m(canvas);
                n(canvas);
                k(canvas);
            }
            canvas.restore();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f4150m0, Log.TAG_TDLIB_OPTIONS), View.MeasureSpec.makeMeasureSpec(this.f4151n0, Log.TAG_TDLIB_OPTIONS));
    }

    @Override
    public void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            o(true);
        }
    }

    public void setCallback(b bVar) {
        this.A0 = bVar;
    }

    public void setCanMinimize(boolean z10) {
        this.f4135a = z10;
    }

    public void setCurrentSeek(int i10) {
        if (this.f4157t0 != i10) {
            this.f4157t0 = i10;
            i();
            o(false);
        }
    }

    public void setDuration(int i10) {
        this.f4156s0 = i10;
        i();
        o(false);
    }

    public void setFactor(float f10) {
        if (this.f4154q0 != f10) {
            this.f4154q0 = f10;
            o(true);
        }
    }

    public void setFullscreen(boolean z10) {
        if (z10) {
            int i10 = this.f4153p0;
            if ((i10 & 1) == 0) {
                this.f4153p0 = i10 | 1;
            } else {
                return;
            }
        } else {
            int i11 = this.f4153p0;
            if ((i11 & 1) != 0) {
                this.f4153p0 = i11 & (-2);
            } else {
                return;
            }
        }
        o(true);
    }

    public void setMinimize(float f10) {
        if (this.f4155r0 != f10) {
            this.f4155r0 = f10;
            o(true);
        }
    }

    public void setMinimized(boolean z10) {
        if (z10) {
            this.f4153p0 |= 8;
            this.f4155r0 = 1.0f;
        } else {
            this.f4153p0 &= -9;
            this.f4155r0 = 0.0f;
        }
        o(true);
    }

    public void setNeedClip(boolean z10) {
        if (z10) {
            this.f4153p0 |= 16;
        } else {
            this.f4153p0 &= -17;
        }
    }

    public void setPause(float f10) {
        if (this.f4162y0 != f10) {
            this.f4162y0 = f10;
            o(true);
        }
    }

    public void setSeekFactor(float f10) {
        if (this.f4163z0 != f10) {
            this.f4163z0 = f10;
            o(false);
        }
    }

    public final void v(float f10, float f11) {
        this.C0 = Math.min(Math.max(this.C0 + j(f10, f11), this.O), this.f4150m0 - this.P);
        o(false);
    }

    public void w() {
        x(false, true);
        setCurrentSeek(0);
        setSeekFactor(0.0f);
        b bVar = this.A0;
        if (bVar != null) {
            bVar.a();
        }
    }

    public void x(boolean z10, boolean z11) {
        b bVar = this.A0;
        if (bVar == null || z11 || !bVar.w0()) {
            if (z10) {
                int i10 = this.f4153p0;
                if ((i10 & 4) == 0) {
                    this.f4153p0 = i10 | 4;
                } else {
                    return;
                }
            } else {
                int i11 = this.f4153p0;
                if ((i11 & 4) != 0) {
                    this.f4153p0 = i11 & (-5);
                } else {
                    return;
                }
            }
            final float pause = getPause();
            ValueAnimator b10 = db.b.b();
            if (z10) {
                b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        o.this.p(pause, valueAnimator);
                    }
                });
            } else {
                final float f10 = 1.0f - pause;
                b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        o.this.q(pause, f10, valueAnimator);
                    }
                });
            }
            b10.setDuration(200L);
            b10.setInterpolator(db.b.f7287b);
            b10.start();
        }
    }

    public void y() {
        b bVar = this.A0;
        if (bVar != null) {
            bVar.G0();
        }
    }

    public boolean z(MotionEvent motionEvent) {
        b bVar;
        b bVar2;
        int action = motionEvent.getAction();
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.E0 = x10;
            this.D0 = x10;
            this.F0 = motionEvent.getY();
            if ((this.f4153p0 & 32) != 0) {
                this.B0 = 0;
            } else {
                if (this.f4155r0 == 0.0f) {
                    if (!this.f4135a || this.E0 < ((this.f4150m0 - this.f4136a0) - this.f4137b.getMinimumWidth()) - this.f4136a0 || this.E0 > this.f4150m0 || this.F0 > this.W + this.f4137b.getMinimumHeight() + this.W || this.F0 < 0.0f) {
                        float f10 = this.E0;
                        int i10 = this.f4150m0;
                        int i11 = this.f4141d0;
                        if (f10 >= ((i10 - this.f4138b0) - i11) - i11 && f10 <= i10) {
                            float f11 = this.F0;
                            int i12 = this.f4151n0;
                            if (f11 >= ((i12 - this.f4140c0) - i11) - i11 && f11 <= i12) {
                                this.B0 = 4;
                            }
                        }
                        int i13 = this.f4156s0;
                        float f12 = i13 == 0 ? 0.0f : this.f4157t0 / i13;
                        int i14 = this.O;
                        int i15 = i14 + ((int) (((i10 - i14) - this.P) * f12));
                        int i16 = (this.f4151n0 - this.Q) - ((int) (this.R * 0.5f));
                        int i17 = this.U * 4;
                        if (f10 >= i15 - i17 && f10 <= i15 + i17) {
                            float f13 = this.F0;
                            if (f13 >= i16 - i17 && f13 <= i16 + i17) {
                                this.C0 = i15;
                                this.B0 = 1;
                                C();
                            }
                        }
                    } else {
                        this.B0 = 2;
                    }
                }
                int i18 = (int) (this.f4150m0 * 0.5f);
                int i19 = (int) (this.f4151n0 * 0.5f);
                if ((this.f4153p0 & 8) != 0) {
                    int minimumWidth = (int) (this.N.getMinimumWidth() * 0.5f);
                    float f14 = this.E0;
                    if (f14 >= i18 - minimumWidth && f14 <= i18 + minimumWidth) {
                        float f15 = this.F0;
                        if (f15 >= i19 - minimumWidth && f15 <= i19 + minimumWidth) {
                            this.B0 = 16;
                        }
                    }
                    if (f14 >= 0.0f && f14 <= this.f4150m0) {
                        float f16 = this.F0;
                        if (f16 >= 0.0f && f16 <= this.f4151n0) {
                            this.B0 = 32;
                        }
                    }
                } else {
                    float f17 = this.E0;
                    int i20 = this.f4145h0;
                    if (f17 >= i18 - i20 && f17 <= i18 + i20) {
                        float f18 = this.F0;
                        if (f18 >= i19 - i20 && f18 <= i19 + i20) {
                            this.B0 = 16;
                        }
                    }
                    this.B0 = 8;
                }
            }
        } else if (action == 1) {
            int i21 = this.B0;
            if (i21 != 0) {
                if ((i21 & 1) != 0) {
                    D(true);
                } else if ((i21 & 4) != 0) {
                    b bVar3 = this.A0;
                    if (bVar3 != null) {
                        bVar3.n1((this.f4153p0 & 1) == 0);
                    }
                } else if (this.f4135a && (i21 & 2) != 0) {
                    b bVar4 = this.A0;
                    if (bVar4 != null) {
                        bVar4.H();
                    }
                } else if ((i21 & 16) != 0) {
                    b bVar5 = this.A0;
                    if (bVar5 != null) {
                        bVar5.d0();
                    }
                } else if ((i21 & 8) != 0) {
                    B((this.f4153p0 & 2) != 0);
                } else if (!((i21 & 32) == 0 || (bVar = this.A0) == null)) {
                    bVar.i();
                }
                this.B0 = 0;
            }
        } else if (action == 2) {
            int i22 = this.B0;
            if (i22 != 0) {
                if ((i22 & 1) != 0) {
                    v(motionEvent.getX(), motionEvent.getY());
                } else {
                    float abs = Math.abs(this.E0 - motionEvent.getX());
                    float abs2 = Math.abs(this.F0 - motionEvent.getY());
                    if (Math.max(abs, abs2) >= a0.r()) {
                        if ((8 & this.f4153p0) != 0) {
                            int i23 = this.B0;
                            if (!(((i23 & 32) == 0 && (16 & i23) == 0) || abs <= abs2 || (bVar2 = this.A0) == null)) {
                                bVar2.b1();
                            }
                        }
                        this.B0 = 0;
                    }
                }
            }
        } else if (action == 3) {
            if ((this.B0 & 1) != 0) {
                D(false);
            }
            this.B0 = 0;
        }
        return true;
    }
}
