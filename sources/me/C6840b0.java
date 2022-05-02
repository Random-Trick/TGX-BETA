package me;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import be.C1357a0;
import be.C1399s0;
import be.C1410y;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p364zd.C11524j;

public class C6840b0 extends View {
    public static int f21431T;
    public static int f21432U;
    public static int f21433V;
    public static int f21434W;
    public static int f21435a0;
    public static int f21436b0;
    public static int f21437c0;
    public static int f21438d0;
    public static int f21439e0;
    public float f21440M;
    public Bitmap f21441N;
    public Canvas f21442O;
    public int f21443P;
    public AbstractC6845e f21444Q;
    public ValueAnimator f21445R;
    public ValueAnimator f21446S;
    public boolean f21447a;
    public float f21448b;
    public boolean f21449c;

    public class C6841a extends ViewOutlineProvider {
        public C6841a() {
        }

        @Override
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            outline.setOval(C6840b0.f21431T + C6840b0.this.getPaddingLeft(), C6840b0.f21431T + C6840b0.this.getPaddingTop(), C6840b0.f21432U * 2, C6840b0.f21432U * 2);
        }
    }

    public class C6842b extends AnimatorListenerAdapter {
        public C6842b() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (!C6840b0.this.f21449c) {
                C6840b0.this.m18810k(false);
            }
            if (C6840b0.this.f21444Q != null) {
                C6840b0.this.f21444Q.m18797b(C6840b0.this.f21449c);
            }
        }
    }

    public class C6843c extends AnimatorListenerAdapter {
        public C6843c() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            C6840b0.this.m18811j(true);
            if (C6840b0.this.f21444Q != null) {
                C6840b0.this.f21444Q.m18798a(C6840b0.this.f21447a);
            }
        }
    }

    public class C6844d extends AnimatorListenerAdapter {
        public C6844d() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (C6840b0.this.f21444Q != null) {
                C6840b0.this.f21444Q.m18798a(C6840b0.this.f21447a);
            }
        }
    }

    public interface AbstractC6845e {
        void m18798a(boolean z);

        void m18797b(boolean z);

        void m18796c(float f);
    }

    public C6840b0(Context context) {
        super(context);
        if (f21432U == 0) {
            m18809l();
        }
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C6841a());
        }
    }

    public static void m18809l() {
        f21431T = C1357a0.m37541i(1.0f);
        f21432U = C1357a0.m37541i(10.0f);
        f21433V = C1357a0.m37541i(19.0f);
        f21435a0 = C1357a0.m37541i(20.0f);
        int i = C1357a0.m37541i(20.0f);
        f21436b0 = i;
        f21437c0 = i - C1357a0.m37541i(2.0f);
        f21434W = C1357a0.m37541i(15.0f);
        f21438d0 = C1357a0.m37541i(2.0f);
        f21439e0 = C1357a0.m37541i(2.0f);
    }

    public void m18806o(float f, float f2, ValueAnimator valueAnimator) {
        setFactor(f + (f2 * C2057b.m35735a(valueAnimator)));
    }

    public void m18805p(float f, ValueAnimator valueAnimator) {
        setFactor(f - (C2057b.m35735a(valueAnimator) * f));
    }

    public void m18804q(float f, float f2, ValueAnimator valueAnimator) {
        setCheckFactor(f + (f2 * C2057b.m35735a(valueAnimator)));
    }

    public void m18803r(float f, ValueAnimator valueAnimator) {
        setCheckFactor(f - (C2057b.m35735a(valueAnimator) * f));
    }

    public static void m18801t() {
        if (f21432U != 0) {
            m18809l();
        }
    }

    public float getCheckFactor() {
        return this.f21448b;
    }

    public float getFactor() {
        return this.f21440M;
    }

    public void m18811j(boolean z) {
        this.f21449c = z;
        ValueAnimator valueAnimator = this.f21445R;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f21445R = null;
        }
        setFactor(z ? 1.0f : 0.0f);
    }

    public void m18810k(boolean z) {
        this.f21447a = z;
        ValueAnimator valueAnimator = this.f21446S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f21446S = null;
        }
        setCheckFactor(z ? 1.0f : 0.0f);
    }

    public void m18808m(int i) {
        this.f21443P = i;
        m18811j(true);
        m18802s();
        if (i == 5) {
            m18800u(0.0f, true);
        }
    }

    public boolean m18807n() {
        return this.f21447a;
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.f21440M != 0.0f || this.f21448b != 0.0f || this.f21443P == 5) {
            if (this.f21443P == 5) {
                int paddingTop = getPaddingTop() + f21431T;
                int i = f21436b0;
                canvas.drawCircle(getPaddingLeft() + f21431T + f21436b0, paddingTop + i, i, C1410y.m37039g(-1610612736));
            }
            int i2 = (this.f21440M > 0.0f ? 1 : (this.f21440M == 0.0f ? 0 : -1));
            Bitmap bitmap = this.f21441N;
            if (bitmap == null) {
                return;
            }
            if (this.f21448b != 0.0f || this.f21443P == 5) {
                canvas.drawBitmap(bitmap, getPaddingLeft(), getPaddingTop(), C1410y.m37033j());
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return C1399s0.m37218C(this) && super.onTouchEvent(motionEvent);
    }

    public final void m18802s() {
        int i = this.f21443P;
        if (this.f21441N == null) {
            if (i == 4) {
                int i2 = f21431T;
                int i3 = f21435a0;
                this.f21441N = Bitmap.createBitmap((i2 * 2) + (i3 * 2), (i2 * 2) + (i3 * 2), Bitmap.Config.ARGB_8888);
            } else if (i == 5) {
                int i4 = f21431T;
                int i5 = f21436b0;
                this.f21441N = Bitmap.createBitmap((i4 * 2) + (i5 * 2), (i4 * 2) + (i5 * 2), Bitmap.Config.ARGB_8888);
            }
            if (this.f21441N != null) {
                this.f21442O = new Canvas(this.f21441N);
                return;
            }
            throw new IllegalStateException("couldn't load bitmap. abort");
        }
    }

    public void setCallback(AbstractC6845e eVar) {
        this.f21444Q = eVar;
    }

    public void setCheckFactor(float f) {
        m18800u(f, false);
    }

    public void setCheckable(boolean z) {
        if (this.f21449c != z) {
            this.f21449c = z;
            ValueAnimator valueAnimator = this.f21445R;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            final float factor = getFactor();
            ValueAnimator b = C2057b.m35734b();
            this.f21445R = b;
            if (z) {
                final float f = 1.0f - factor;
                b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        C6840b0.this.m18806o(factor, f, valueAnimator2);
                    }
                });
            } else {
                b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        C6840b0.this.m18805p(factor, valueAnimator2);
                    }
                });
            }
            this.f21445R.setDuration(200L);
            this.f21445R.setInterpolator(C2057b.f7280b);
            if (this.f21444Q != null) {
                this.f21445R.addListener(new C6842b());
            }
            this.f21445R.start();
        }
    }

    public void setChecked(boolean z) {
        if (this.f21447a == z) {
            return;
        }
        if (getAlpha() == 0.0f || getVisibility() != 0) {
            m18810k(z);
            return;
        }
        this.f21447a = z;
        ValueAnimator valueAnimator = this.f21446S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final float checkFactor = getCheckFactor();
        ValueAnimator b = C2057b.m35734b();
        this.f21446S = b;
        if (z) {
            final float f = 1.0f - checkFactor;
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    C6840b0.this.m18804q(checkFactor, f, valueAnimator2);
                }
            });
        } else {
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    C6840b0.this.m18803r(checkFactor, valueAnimator2);
                }
            });
        }
        this.f21446S.setDuration(200L);
        this.f21446S.setInterpolator(C2057b.f7280b);
        if (z) {
            this.f21446S.addListener(new C6843c());
        } else if (this.f21444Q != null) {
            this.f21446S.addListener(new C6844d());
        }
        this.f21446S.start();
    }

    public void setFactor(float f) {
    }

    public void m18800u(float f, boolean z) {
        int i;
        int i2;
        float f2;
        int i3;
        int i4;
        int i5;
        float f3;
        float f4;
        float f5 = this.f21448b;
        if (f5 != f || z) {
            boolean z2 = f5 == f;
            this.f21448b = f;
            float f6 = 0.0f;
            if (f != 0.0f || this.f21443P == 5) {
                this.f21441N.eraseColor(0);
                int i6 = this.f21443P;
                if (i6 == 4 || i6 == 5) {
                    int i7 = -1;
                    if (i6 == 4) {
                        int i8 = f21431T;
                        int i9 = f21435a0;
                        i = i8 + i9;
                        i2 = i8 + i9;
                        this.f21442O.drawCircle(i, i2, i9, C1410y.m37039g(C11524j.m228N(R.id.theme_color_fileAttach)));
                    } else {
                        int i10 = f21431T;
                        int i11 = f21436b0;
                        i = i10 + i11;
                        i2 = i10 + i11;
                        float f7 = i;
                        float f8 = i2;
                        this.f21442O.drawCircle(f7, f8, i11, C1410y.m37039g(-1));
                        this.f21442O.drawCircle(f7, f8, f21437c0, C1410y.m37039g(C11524j.m228N(R.id.theme_color_checkActive)));
                        i7 = C11524j.m228N(R.id.theme_color_checkContent);
                    }
                    int i12 = this.f21443P;
                    if (i12 == 4) {
                        float f9 = this.f21448b;
                        if (f9 > 0.2f) {
                            f3 = f9 - 0.2f;
                            f4 = 0.8f;
                            f2 = f3 / f4;
                        }
                        f2 = 0.0f;
                    } else {
                        float f10 = this.f21448b;
                        if (f10 > 0.75f) {
                            f3 = f10 - 0.75f;
                            f4 = 0.25f;
                            f2 = f3 / f4;
                        }
                        f2 = 0.0f;
                    }
                    if (f2 > 0.0f) {
                        float f11 = i12 == 4 ? 0.3f : 0.45f;
                        int i13 = (f2 > f11 ? 1 : (f2 == f11 ? 0 : -1));
                        float f12 = i13 <= 0 ? f2 / f11 : 1.0f;
                        if (i13 > 0) {
                            f6 = (f2 - f11) / (1.0f - f11);
                        }
                        this.f21442O.save();
                        float f13 = 2.5f;
                        if (this.f21443P == 4) {
                            this.f21442O.translate((i / 2) - C1357a0.m37541i(2.5f), C1357a0.m37541i(1.0f) + i2);
                        } else {
                            this.f21442O.translate((i / 2) - C1357a0.m37541i(2.5f), C1357a0.m37541i(2.0f) + i2);
                        }
                        this.f21442O.rotate(-45.0f);
                        if (this.f21443P == 4) {
                            i4 = C1357a0.m37541i(14.0f);
                            i3 = C1357a0.m37541i(7.0f);
                        } else {
                            i3 = C1357a0.m37541i(8.0f);
                            i4 = C1357a0.m37541i(15.0f);
                        }
                        int i14 = (int) (i4 * f6);
                        int i15 = (int) (i3 * f12);
                        int i16 = C1357a0.m37541i(4.0f);
                        int i17 = C1357a0.m37541i(11.0f);
                        if (this.f21443P == 4) {
                            f13 = 1.5f;
                        }
                        int i18 = C1357a0.m37541i(f13);
                        float f14 = i16;
                        this.f21442O.drawRect(f14, i17 - i3, i16 + i18, i5 + i15, C1410y.m37039g(i7));
                        this.f21442O.drawRect(f14, i17 - i18, i16 + i14, i17, C1410y.m37039g(i7));
                        this.f21442O.restore();
                    }
                    float f15 = this.f21448b;
                    if (f15 != 1.0f) {
                        if (this.f21443P == 4) {
                            int i19 = f21435a0;
                            this.f21442O.drawCircle(i, i2, i19 - (i19 * f15), C1410y.m37078D());
                        } else {
                            int i20 = f21437c0;
                            this.f21442O.drawCircle(i, i2, i20 - (i20 * f15), C1410y.m37078D());
                        }
                    }
                }
            }
            invalidate();
            AbstractC6845e eVar = this.f21444Q;
            if (eVar != null && !z2) {
                eVar.m18796c(f);
            }
        }
    }

    public boolean m18799v() {
        setChecked(!this.f21447a);
        return this.f21447a;
    }
}
