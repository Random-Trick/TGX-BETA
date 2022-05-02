package ad;

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
import be.C1357a0;
import be.C1362c;
import be.C1410y;
import nc.C7389v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p181mb.C6812c;

public class C0274o extends View {
    public static final C6812c f820G0 = new C6812c(-1, -9720352);
    public static final C6812c f821H0 = new C6812c(-1712789529, 15263719);
    public AbstractC0276b f822A0;
    public int f823B0;
    public float f825D0;
    public float f826E0;
    public float f827F0;
    public int f834S;
    public int f835T;
    public boolean f839a;
    public RectF f851j0;
    public Paint f852k0;
    public Paint f853l0;
    public int f854m0;
    public int f855n0;
    public int f856o0;
    public int f857p0;
    public float f859r0;
    public int f860s0;
    public int f861t0;
    public int f862u0;
    public int f863v0;
    public String f864w0;
    public String f865x0;
    public float f866y0;
    public float f867z0;
    public int f824C0 = -1;
    public Drawable f841b = C1362c.m37485g(getResources(), R.drawable.baseline_picture_in_picture_24);
    public Drawable f843c = C1362c.m37485g(getResources(), R.drawable.baseline_fullscreen_24);
    public Drawable f828M = C1362c.m37485g(getResources(), R.drawable.baseline_fullscreen_exit_24);
    public Drawable f829N = C1362c.m37485g(getResources(), R.drawable.baseline_play_circle_outline_48);
    public int f830O = C1357a0.m37544i(62.0f);
    public int f831P = C1357a0.m37544i(103.0f);
    public int f832Q = C1357a0.m37544i(19.0f);
    public int f833R = C1357a0.m37544i(4.0f);
    public int f836U = C1357a0.m37544i(6.0f);
    public int f837V = C1357a0.m37544i(3.0f);
    public int f838W = C1357a0.m37544i(11.0f);
    public int f840a0 = C1357a0.m37544i(17.0f);
    public int f842b0 = C1357a0.m37544i(22.0f);
    public int f844c0 = C1357a0.m37544i(14.0f);
    public int f845d0 = C1357a0.m37544i(19.0f);
    public int f849h0 = C1357a0.m37544i(48.0f);
    public int f846e0 = C1357a0.m37544i(31.0f);
    public int f847f0 = C1357a0.m37544i(72.0f);
    public int f848g0 = C1357a0.m37544i(17.0f);
    public int f850i0 = C1357a0.m37544i(46.0f);
    public float f858q0 = 1.0f;

    public class C0275a extends AnimatorListenerAdapter {
        public final int f868a;

        public C0275a(int i) {
            this.f868a = i;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            C0274o.this.setCurrentSeek(this.f868a);
            C0274o.this.f824C0 = -1;
            if (C0274o.this.f822A0 != null) {
                C0274o.this.f822A0.mo41895h(this.f868a);
            }
        }
    }

    public interface AbstractC0276b {
        void mo41917F0();

        void mo41914H();

        void mo41910T(boolean z);

        void mo41902a();

        void mo41900b0();

        void mo41898d1();

        void mo41895h(int i);

        void mo41893i();

        void mo41892q1(boolean z);

        boolean mo41891x0();
    }

    public C0274o(Context context) {
        super(context);
        int i = C1357a0.m37544i(1.5f);
        this.f834S = i;
        this.f835T = this.f833R - i;
        RectF rectF = new RectF();
        this.f851j0 = rectF;
        rectF.bottom = this.f850i0;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f850i0, 0, -1879048192, Shader.TileMode.CLAMP);
        Paint paint = new Paint(5);
        this.f853l0 = paint;
        paint.setShader(linearGradient);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, this.f850i0, -1879048192, 0, Shader.TileMode.CLAMP);
        Paint paint2 = new Paint(5);
        this.f852k0 = paint2;
        paint2.setShader(linearGradient2);
    }

    public void m41942p(float f, ValueAnimator valueAnimator) {
        setPause(f - (C2057b.m35738a(valueAnimator) * f));
    }

    public void m41941q(float f, float f2, ValueAnimator valueAnimator) {
        setPause(f + (f2 * C2057b.m35738a(valueAnimator)));
    }

    public void m41940r(float f, ValueAnimator valueAnimator) {
        setMinimize(f - (C2057b.m35738a(valueAnimator) * f));
    }

    public void m41939s(float f, float f2, ValueAnimator valueAnimator) {
        setMinimize(f + (f2 * C2057b.m35738a(valueAnimator)));
    }

    public void m41938t(float f, float f2, ValueAnimator valueAnimator) {
        setSeekFactor(f + (f2 * C2057b.m35738a(valueAnimator)));
    }

    public void m41937u(float f, ValueAnimator valueAnimator) {
        setSeekFactor(f - (C2057b.m35738a(valueAnimator) * f));
    }

    public void m41961A(int i, int i2, int i3) {
        this.f854m0 = i;
        this.f855n0 = i2;
        this.f856o0 = i3;
        m41943o(true);
    }

    public void m41960B(boolean z) {
        if (z) {
            this.f857p0 &= -3;
        } else {
            this.f857p0 |= 2;
        }
        final float minimize = getMinimize();
        ValueAnimator b = C2057b.m35737b();
        if (z) {
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C0274o.this.m41940r(minimize, valueAnimator);
                }
            });
        } else {
            final float f = 1.0f - minimize;
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C0274o.this.m41939s(minimize, f, valueAnimator);
                }
            });
        }
        b.setDuration(200L);
        b.setInterpolator(C2057b.f7280b);
        b.start();
        AbstractC0276b bVar = this.f822A0;
        if (bVar != null) {
            bVar.mo41910T(z);
        }
    }

    public final void m41959C() {
        final float seekFactor = getSeekFactor();
        final float f = 1.0f - seekFactor;
        ValueAnimator b = C2057b.m35737b();
        b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C0274o.this.m41938t(seekFactor, f, valueAnimator);
            }
        });
        b.setDuration(160L);
        b.setInterpolator(C2057b.f7280b);
        b.start();
    }

    public final void m41958D(boolean z) {
        if (z) {
            int i = this.f824C0;
            int i2 = this.f830O;
            final float seekFactor = getSeekFactor();
            ValueAnimator b = C2057b.m35737b();
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C0274o.this.m41937u(seekFactor, valueAnimator);
                }
            });
            b.setDuration(160L);
            b.setInterpolator(C2057b.f7280b);
            b.addListener(new C0275a((int) (this.f860s0 * ((i - i2) / ((this.f854m0 - i2) - this.f831P)))));
            b.start();
            return;
        }
        this.f824C0 = -1;
        m41943o(false);
    }

    public float getFactor() {
        return this.f858q0;
    }

    public float getMinimize() {
        return this.f859r0;
    }

    public float getPause() {
        return this.f866y0;
    }

    public float getSeekFactor() {
        return this.f867z0;
    }

    public final void m41949i() {
        String str = this.f865x0;
        int i = 0;
        int length = str == null ? 0 : str.length();
        String str2 = this.f864w0;
        if (str2 != null) {
            i = str2.length();
        }
        int i2 = this.f861t0 / 1000;
        this.f865x0 = C0264f.m41977a(i2);
        this.f864w0 = C0264f.m41977a((this.f860s0 / 1000) - i2);
        if (this.f865x0.length() != length) {
            this.f863v0 = (int) C7389v0.m16680T1(this.f865x0, C1410y.m37051b0(13.0f));
        }
        if (this.f864w0.length() != i) {
            this.f862u0 = (int) C7389v0.m16680T1(this.f864w0, C1410y.m37051b0(13.0f));
        }
    }

    public final int m41948j(float f, float f2) {
        int max = (int) ((f - this.f825D0) * (((Math.max(Math.min(this.f855n0 - this.f850i0, f2), 0.0f) / (this.f855n0 - this.f850i0)) * 0.75f) + 0.25f));
        this.f825D0 = f;
        return max;
    }

    public final void m41947k(Canvas canvas) {
        Drawable drawable = (this.f857p0 & 1) != 0 ? this.f828M : this.f843c;
        Paint W = C1410y.m37058W(-1);
        float f = this.f859r0;
        if (f == 0.0f) {
            if (this.f839a) {
                Drawable drawable2 = this.f841b;
                C1362c.m37490b(canvas, drawable2, (this.f854m0 - this.f840a0) - drawable2.getMinimumWidth(), this.f838W, W);
            }
            int i = this.f854m0 - this.f842b0;
            int i2 = this.f845d0;
            C1362c.m37490b(canvas, drawable, i - i2, (this.f855n0 - this.f844c0) - i2, W);
        } else {
            if (this.f839a) {
                W.setAlpha((int) ((1.0f - f) * 255.0f));
                Drawable drawable3 = this.f841b;
                C1362c.m37490b(canvas, drawable3, (this.f854m0 - this.f840a0) - drawable3.getMinimumWidth(), this.f838W, W);
                W.setAlpha(255);
            }
            int i3 = this.f854m0 - this.f842b0;
            int i4 = this.f845d0;
            float f2 = this.f859r0;
            C1362c.m37490b(canvas, drawable, (i3 - i4) + ((int) (this.f831P * f2)), ((this.f855n0 - this.f844c0) - i4) + ((int) ((this.f832Q + this.f835T) * f2)), W);
        }
        float f3 = this.f866y0;
        if (f3 != 0.0f) {
            int i5 = (int) (this.f854m0 * 0.5f);
            int i6 = (int) (this.f855n0 * 0.5f);
            if (f3 != 1.0f) {
                float f4 = ((1.0f - f3) * 0.25f) + 1.0f;
                canvas.save();
                canvas.scale(f4, f4, i5, i6);
                W.setAlpha((int) (this.f866y0 * 255.0f));
            }
            Drawable drawable4 = this.f829N;
            C1362c.m37490b(canvas, drawable4, i5 - ((int) (drawable4.getMinimumWidth() * 0.5f)), i6 - ((int) (this.f829N.getMinimumHeight() * 0.5f)), W);
            if (this.f866y0 != 1.0f) {
                W.setAlpha(255);
                canvas.restore();
            }
        }
    }

    public final void m41946l(Canvas canvas) {
        float f = this.f859r0;
        if (f != 1.0f) {
            if (f != 0.0f) {
                int i = (int) ((1.0f - f) * 255.0f);
                this.f852k0.setAlpha(i);
                this.f853l0.setAlpha(i);
            }
            RectF rectF = this.f851j0;
            rectF.right = this.f854m0;
            canvas.drawRect(rectF, this.f852k0);
            canvas.save();
            canvas.translate(0.0f, this.f855n0 - this.f850i0);
            canvas.drawRect(this.f851j0, this.f853l0);
            canvas.restore();
            if (this.f859r0 != 0.0f) {
                this.f852k0.setAlpha(255);
                this.f853l0.setAlpha(255);
            }
        }
    }

    public final void m41945m(Canvas canvas) {
        int i = this.f860s0;
        float f = i == 0 ? 0.0f : this.f861t0 / i;
        int i2 = this.f854m0;
        int i3 = this.f830O;
        float f2 = this.f859r0;
        int i4 = i2 - ((int) ((this.f831P + i3) * (1.0f - f2)));
        int i5 = this.f833R - ((int) (this.f835T * f2));
        int i6 = (int) (this.f832Q * (1.0f - f2));
        int i7 = this.f855n0;
        int i8 = (i7 - i6) - i5;
        int i9 = i7 - i6;
        int i10 = (int) (i3 * (1.0f - f2));
        float f3 = ((int) (i4 * f)) + i10;
        float f4 = i8;
        float f5 = i4 + i10;
        float f6 = i9;
        canvas.drawRect(f3, f4, f5, f6, C1410y.m37042g(f821H0.m18910a(f2)));
        canvas.drawRect(i10, f4, f3, f6, C1410y.m37042g(f820G0.m18910a(this.f859r0)));
        int i11 = this.f836U + ((int) (this.f837V * this.f867z0));
        int i12 = this.f824C0;
        if (i12 != -1) {
            f3 = i12;
        }
        canvas.drawCircle(f3, i8 + ((int) (i5 * 0.5f)), (int) (i11 * (1.0f - this.f859r0)), C1410y.m37003z0());
    }

    public final void m41944n(Canvas canvas) {
        TextPaint c0 = C1410y.m37049c0(13.0f, -1);
        float f = this.f859r0;
        if (f == 0.0f) {
            String str = this.f865x0;
            if (str != null) {
                canvas.drawText(str, this.f846e0 - ((int) (this.f863v0 * 0.5f)), this.f855n0 - this.f848g0, c0);
            }
            String str2 = this.f864w0;
            if (str2 != null) {
                canvas.drawText(str2, (this.f854m0 - this.f847f0) - ((int) (this.f862u0 * 0.5f)), this.f855n0 - this.f848g0, c0);
                return;
            }
            return;
        }
        String str3 = this.f865x0;
        if (str3 != null) {
            canvas.drawText(str3, (this.f846e0 - ((int) (this.f863v0 * 0.5f))) - ((int) (this.f830O * f)), (this.f855n0 - this.f848g0) + ((int) ((this.f832Q + this.f835T) * f)), c0);
        }
        String str4 = this.f864w0;
        if (str4 != null) {
            float f2 = this.f859r0;
            canvas.drawText(str4, ((this.f854m0 - this.f847f0) - ((int) (this.f862u0 * 0.5f))) + ((int) (this.f831P * f2)), (this.f855n0 - this.f848g0) + ((int) ((this.f832Q + this.f835T) * f2)), c0);
        }
    }

    public final void m41943o(boolean z) {
        invalidate(0, (-this.f855n0) - this.f856o0, getMeasuredWidth(), getMeasuredHeight());
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (((int) (Math.max(this.f858q0, this.f859r0) * 255.0f)) != 0) {
            canvas.save();
            canvas.translate(0.0f, (-this.f855n0) - this.f856o0);
            if ((this.f857p0 & 16) != 0) {
                canvas.clipRect(0, 0, this.f854m0, this.f855n0);
            }
            if (!(this.f865x0 == null || this.f864w0 == null)) {
                m41946l(canvas);
                m41945m(canvas);
                m41944n(canvas);
                m41947k(canvas);
            }
            canvas.restore();
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f854m0, Log.TAG_TDLIB_OPTIONS), View.MeasureSpec.makeMeasureSpec(this.f855n0, Log.TAG_TDLIB_OPTIONS));
    }

    @Override
    public void setAlpha(float f) {
        if (getAlpha() != f) {
            super.setAlpha(f);
            m41943o(true);
        }
    }

    public void setCallback(AbstractC0276b bVar) {
        this.f822A0 = bVar;
    }

    public void setCanMinimize(boolean z) {
        this.f839a = z;
    }

    public void setCurrentSeek(int i) {
        if (this.f861t0 != i) {
            this.f861t0 = i;
            m41949i();
            m41943o(false);
        }
    }

    public void setDuration(int i) {
        this.f860s0 = i;
        m41949i();
        m41943o(false);
    }

    public void setFactor(float f) {
        if (this.f858q0 != f) {
            this.f858q0 = f;
            m41943o(true);
        }
    }

    public void setFullscreen(boolean z) {
        if (z) {
            int i = this.f857p0;
            if ((i & 1) == 0) {
                this.f857p0 = i | 1;
            } else {
                return;
            }
        } else {
            int i2 = this.f857p0;
            if ((i2 & 1) != 0) {
                this.f857p0 = i2 & (-2);
            } else {
                return;
            }
        }
        m41943o(true);
    }

    public void setMinimize(float f) {
        if (this.f859r0 != f) {
            this.f859r0 = f;
            m41943o(true);
        }
    }

    public void setMinimized(boolean z) {
        if (z) {
            this.f857p0 |= 8;
            this.f859r0 = 1.0f;
        } else {
            this.f857p0 &= -9;
            this.f859r0 = 0.0f;
        }
        m41943o(true);
    }

    public void setNeedClip(boolean z) {
        if (z) {
            this.f857p0 |= 16;
        } else {
            this.f857p0 &= -17;
        }
    }

    public void setPause(float f) {
        if (this.f866y0 != f) {
            this.f866y0 = f;
            m41943o(true);
        }
    }

    public void setSeekFactor(float f) {
        if (this.f867z0 != f) {
            this.f867z0 = f;
            m41943o(false);
        }
    }

    public final void m41936v(float f, float f2) {
        this.f824C0 = Math.min(Math.max(this.f824C0 + m41948j(f, f2), this.f830O), this.f854m0 - this.f831P);
        m41943o(false);
    }

    public void m41935w() {
        m41934x(false, true);
        setCurrentSeek(0);
        setSeekFactor(0.0f);
        AbstractC0276b bVar = this.f822A0;
        if (bVar != null) {
            bVar.mo41902a();
        }
    }

    public void m41934x(boolean z, boolean z2) {
        AbstractC0276b bVar = this.f822A0;
        if (bVar == null || z2 || !bVar.mo41891x0()) {
            if (z) {
                int i = this.f857p0;
                if ((i & 4) == 0) {
                    this.f857p0 = i | 4;
                } else {
                    return;
                }
            } else {
                int i2 = this.f857p0;
                if ((i2 & 4) != 0) {
                    this.f857p0 = i2 & (-5);
                } else {
                    return;
                }
            }
            final float pause = getPause();
            ValueAnimator b = C2057b.m35737b();
            if (z) {
                b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C0274o.this.m41942p(pause, valueAnimator);
                    }
                });
            } else {
                final float f = 1.0f - pause;
                b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C0274o.this.m41941q(pause, f, valueAnimator);
                    }
                });
            }
            b.setDuration(200L);
            b.setInterpolator(C2057b.f7280b);
            b.start();
        }
    }

    public void m41933y() {
        AbstractC0276b bVar = this.f822A0;
        if (bVar != null) {
            bVar.mo41917F0();
        }
    }

    public boolean m41932z(MotionEvent motionEvent) {
        AbstractC0276b bVar;
        AbstractC0276b bVar2;
        int action = motionEvent.getAction();
        if (action == 0) {
            float x = motionEvent.getX();
            this.f826E0 = x;
            this.f825D0 = x;
            this.f827F0 = motionEvent.getY();
            if ((this.f857p0 & 32) != 0) {
                this.f823B0 = 0;
            } else {
                if (this.f859r0 == 0.0f) {
                    if (!this.f839a || this.f826E0 < ((this.f854m0 - this.f840a0) - this.f841b.getMinimumWidth()) - this.f840a0 || this.f826E0 > this.f854m0 || this.f827F0 > this.f838W + this.f841b.getMinimumHeight() + this.f838W || this.f827F0 < 0.0f) {
                        float f = this.f826E0;
                        int i = this.f854m0;
                        int i2 = this.f845d0;
                        if (f >= ((i - this.f842b0) - i2) - i2 && f <= i) {
                            float f2 = this.f827F0;
                            int i3 = this.f855n0;
                            if (f2 >= ((i3 - this.f844c0) - i2) - i2 && f2 <= i3) {
                                this.f823B0 = 4;
                            }
                        }
                        int i4 = this.f860s0;
                        float f3 = i4 == 0 ? 0.0f : this.f861t0 / i4;
                        int i5 = this.f830O;
                        int i6 = i5 + ((int) (((i - i5) - this.f831P) * f3));
                        int i7 = (this.f855n0 - this.f832Q) - ((int) (this.f833R * 0.5f));
                        int i8 = this.f836U * 4;
                        if (f >= i6 - i8 && f <= i6 + i8) {
                            float f4 = this.f827F0;
                            if (f4 >= i7 - i8 && f4 <= i7 + i8) {
                                this.f824C0 = i6;
                                this.f823B0 = 1;
                                m41959C();
                            }
                        }
                    } else {
                        this.f823B0 = 2;
                    }
                }
                int i9 = (int) (this.f854m0 * 0.5f);
                int i10 = (int) (this.f855n0 * 0.5f);
                if ((this.f857p0 & 8) != 0) {
                    int minimumWidth = (int) (this.f829N.getMinimumWidth() * 0.5f);
                    float f5 = this.f826E0;
                    if (f5 >= i9 - minimumWidth && f5 <= i9 + minimumWidth) {
                        float f6 = this.f827F0;
                        if (f6 >= i10 - minimumWidth && f6 <= i10 + minimumWidth) {
                            this.f823B0 = 16;
                        }
                    }
                    if (f5 >= 0.0f && f5 <= this.f854m0) {
                        float f7 = this.f827F0;
                        if (f7 >= 0.0f && f7 <= this.f855n0) {
                            this.f823B0 = 32;
                        }
                    }
                } else {
                    float f8 = this.f826E0;
                    int i11 = this.f849h0;
                    if (f8 >= i9 - i11 && f8 <= i9 + i11) {
                        float f9 = this.f827F0;
                        if (f9 >= i10 - i11 && f9 <= i10 + i11) {
                            this.f823B0 = 16;
                        }
                    }
                    this.f823B0 = 8;
                }
            }
        } else if (action == 1) {
            int i12 = this.f823B0;
            if (i12 != 0) {
                if ((i12 & 1) != 0) {
                    m41958D(true);
                } else if ((i12 & 4) != 0) {
                    AbstractC0276b bVar3 = this.f822A0;
                    if (bVar3 != null) {
                        bVar3.mo41892q1((this.f857p0 & 1) == 0);
                    }
                } else if (this.f839a && (i12 & 2) != 0) {
                    AbstractC0276b bVar4 = this.f822A0;
                    if (bVar4 != null) {
                        bVar4.mo41914H();
                    }
                } else if ((i12 & 16) != 0) {
                    AbstractC0276b bVar5 = this.f822A0;
                    if (bVar5 != null) {
                        bVar5.mo41900b0();
                    }
                } else if ((i12 & 8) != 0) {
                    m41960B((this.f857p0 & 2) != 0);
                } else if (!((i12 & 32) == 0 || (bVar = this.f822A0) == null)) {
                    bVar.mo41893i();
                }
                this.f823B0 = 0;
            }
        } else if (action == 2) {
            int i13 = this.f823B0;
            if (i13 != 0) {
                if ((i13 & 1) != 0) {
                    m41936v(motionEvent.getX(), motionEvent.getY());
                } else {
                    float abs = Math.abs(this.f826E0 - motionEvent.getX());
                    float abs2 = Math.abs(this.f827F0 - motionEvent.getY());
                    if (Math.max(abs, abs2) >= C1357a0.m37535r()) {
                        if ((8 & this.f857p0) != 0) {
                            int i14 = this.f823B0;
                            if (!(((i14 & 32) == 0 && (16 & i14) == 0) || abs <= abs2 || (bVar2 = this.f822A0) == null)) {
                                bVar2.mo41898d1();
                            }
                        }
                        this.f823B0 = 0;
                    }
                }
            }
        } else if (action == 3) {
            if ((this.f823B0 & 1) != 0) {
                m41958D(false);
            }
            this.f823B0 = 0;
        }
        return true;
    }
}
