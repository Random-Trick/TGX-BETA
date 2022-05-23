package ne;

import ae.j;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import ce.a0;
import ce.p0;
import ce.y;
import org.thunderdog.challegram.R;

public class b0 extends View {
    public static int T;
    public static int U;
    public static int V;
    public static int W;
    public static int f17874a0;
    public static int f17875b0;
    public static int f17876c0;
    public static int f17877d0;
    public static int f17878e0;
    public float M;
    public Bitmap N;
    public Canvas O;
    public int P;
    public e Q;
    public ValueAnimator R;
    public ValueAnimator S;
    public boolean f17879a;
    public float f17880b;
    public boolean f17881c;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            outline.setOval(b0.T + b0.this.getPaddingLeft(), b0.T + b0.this.getPaddingTop(), b0.U * 2, b0.U * 2);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (!b0.this.f17881c) {
                b0.this.k(false);
            }
            if (b0.this.Q != null) {
                b0.this.Q.b(b0.this.f17881c);
            }
        }
    }

    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            b0.this.j(true);
            if (b0.this.Q != null) {
                b0.this.Q.a(b0.this.f17879a);
            }
        }
    }

    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (b0.this.Q != null) {
                b0.this.Q.a(b0.this.f17879a);
            }
        }
    }

    public interface e {
        void a(boolean z10);

        void b(boolean z10);

        void c(float f10);
    }

    public b0(Context context) {
        super(context);
        if (U == 0) {
            l();
        }
        setOutlineProvider(new a());
    }

    public static void l() {
        T = a0.i(1.0f);
        U = a0.i(10.0f);
        V = a0.i(19.0f);
        f17874a0 = a0.i(20.0f);
        int i10 = a0.i(20.0f);
        f17875b0 = i10;
        f17876c0 = i10 - a0.i(2.0f);
        W = a0.i(15.0f);
        f17877d0 = a0.i(2.0f);
        f17878e0 = a0.i(2.0f);
    }

    public void o(float f10, float f11, ValueAnimator valueAnimator) {
        setFactor(f10 + (f11 * db.b.a(valueAnimator)));
    }

    public void p(float f10, ValueAnimator valueAnimator) {
        setFactor(f10 - (db.b.a(valueAnimator) * f10));
    }

    public void q(float f10, float f11, ValueAnimator valueAnimator) {
        setCheckFactor(f10 + (f11 * db.b.a(valueAnimator)));
    }

    public void r(float f10, ValueAnimator valueAnimator) {
        setCheckFactor(f10 - (db.b.a(valueAnimator) * f10));
    }

    public static void t() {
        if (U != 0) {
            l();
        }
    }

    public float getCheckFactor() {
        return this.f17880b;
    }

    public float getFactor() {
        return this.M;
    }

    public void j(boolean z10) {
        this.f17881c = z10;
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.R = null;
        }
        setFactor(z10 ? 1.0f : 0.0f);
    }

    public void k(boolean z10) {
        this.f17879a = z10;
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.S = null;
        }
        setCheckFactor(z10 ? 1.0f : 0.0f);
    }

    public void m(int i10) {
        this.P = i10;
        j(true);
        s();
        if (i10 == 5) {
            u(0.0f, true);
        }
    }

    public boolean n() {
        return this.f17879a;
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.M != 0.0f || this.f17880b != 0.0f || this.P == 5) {
            if (this.P == 5) {
                int paddingTop = getPaddingTop() + T;
                int i10 = f17875b0;
                canvas.drawCircle(getPaddingLeft() + T + f17875b0, paddingTop + i10, i10, y.g(-1610612736));
            }
            int i11 = (this.M > 0.0f ? 1 : (this.M == 0.0f ? 0 : -1));
            Bitmap bitmap = this.N;
            if (bitmap == null) {
                return;
            }
            if (this.f17880b != 0.0f || this.P == 5) {
                canvas.drawBitmap(bitmap, getPaddingLeft(), getPaddingTop(), y.j());
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return p0.z(this) && super.onTouchEvent(motionEvent);
    }

    public final void s() {
        int i10 = this.P;
        if (this.N == null) {
            if (i10 == 4) {
                int i11 = T;
                int i12 = f17874a0;
                this.N = Bitmap.createBitmap((i11 * 2) + (i12 * 2), (i11 * 2) + (i12 * 2), Bitmap.Config.ARGB_8888);
            } else if (i10 == 5) {
                int i13 = T;
                int i14 = f17875b0;
                this.N = Bitmap.createBitmap((i13 * 2) + (i14 * 2), (i13 * 2) + (i14 * 2), Bitmap.Config.ARGB_8888);
            }
            if (this.N != null) {
                this.O = new Canvas(this.N);
                return;
            }
            throw new IllegalStateException("couldn't load bitmap. abort");
        }
    }

    public void setCallback(e eVar) {
        this.Q = eVar;
    }

    public void setCheckFactor(float f10) {
        u(f10, false);
    }

    public void setCheckable(boolean z10) {
        if (this.f17881c != z10) {
            this.f17881c = z10;
            ValueAnimator valueAnimator = this.R;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            final float factor = getFactor();
            ValueAnimator b10 = db.b.b();
            this.R = b10;
            if (z10) {
                final float f10 = 1.0f - factor;
                b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        b0.this.o(factor, f10, valueAnimator2);
                    }
                });
            } else {
                b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        b0.this.p(factor, valueAnimator2);
                    }
                });
            }
            this.R.setDuration(200L);
            this.R.setInterpolator(db.b.f7287b);
            if (this.Q != null) {
                this.R.addListener(new b());
            }
            this.R.start();
        }
    }

    public void setChecked(boolean z10) {
        if (this.f17879a == z10) {
            return;
        }
        if (getAlpha() == 0.0f || getVisibility() != 0) {
            k(z10);
            return;
        }
        this.f17879a = z10;
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final float checkFactor = getCheckFactor();
        ValueAnimator b10 = db.b.b();
        this.S = b10;
        if (z10) {
            final float f10 = 1.0f - checkFactor;
            b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    b0.this.q(checkFactor, f10, valueAnimator2);
                }
            });
        } else {
            b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    b0.this.r(checkFactor, valueAnimator2);
                }
            });
        }
        this.S.setDuration(200L);
        this.S.setInterpolator(db.b.f7287b);
        if (z10) {
            this.S.addListener(new c());
        } else if (this.Q != null) {
            this.S.addListener(new d());
        }
        this.S.start();
    }

    public void setFactor(float f10) {
    }

    public void u(float f10, boolean z10) {
        int i10;
        int i11;
        float f11;
        int i12;
        int i13;
        int i14;
        float f12;
        float f13;
        float f14 = this.f17880b;
        if (f14 != f10 || z10) {
            boolean z11 = f14 == f10;
            this.f17880b = f10;
            float f15 = 0.0f;
            if (f10 != 0.0f || this.P == 5) {
                this.N.eraseColor(0);
                int i15 = this.P;
                if (i15 == 4 || i15 == 5) {
                    int i16 = -1;
                    if (i15 == 4) {
                        int i17 = T;
                        int i18 = f17874a0;
                        i10 = i17 + i18;
                        i11 = i17 + i18;
                        this.O.drawCircle(i10, i11, i18, y.g(j.L(R.id.theme_color_fileAttach)));
                    } else {
                        int i19 = T;
                        int i20 = f17875b0;
                        i10 = i19 + i20;
                        i11 = i19 + i20;
                        float f16 = i10;
                        float f17 = i11;
                        this.O.drawCircle(f16, f17, i20, y.g(-1));
                        this.O.drawCircle(f16, f17, f17876c0, y.g(j.L(R.id.theme_color_checkActive)));
                        i16 = j.L(R.id.theme_color_checkContent);
                    }
                    int i21 = this.P;
                    if (i21 == 4) {
                        float f18 = this.f17880b;
                        if (f18 > 0.2f) {
                            f12 = f18 - 0.2f;
                            f13 = 0.8f;
                            f11 = f12 / f13;
                        }
                        f11 = 0.0f;
                    } else {
                        float f19 = this.f17880b;
                        if (f19 > 0.75f) {
                            f12 = f19 - 0.75f;
                            f13 = 0.25f;
                            f11 = f12 / f13;
                        }
                        f11 = 0.0f;
                    }
                    if (f11 > 0.0f) {
                        float f20 = i21 == 4 ? 0.3f : 0.45f;
                        int i22 = (f11 > f20 ? 1 : (f11 == f20 ? 0 : -1));
                        float f21 = i22 <= 0 ? f11 / f20 : 1.0f;
                        if (i22 > 0) {
                            f15 = (f11 - f20) / (1.0f - f20);
                        }
                        this.O.save();
                        float f22 = 2.5f;
                        if (this.P == 4) {
                            this.O.translate((i10 / 2) - a0.i(2.5f), a0.i(1.0f) + i11);
                        } else {
                            this.O.translate((i10 / 2) - a0.i(2.5f), a0.i(2.0f) + i11);
                        }
                        this.O.rotate(-45.0f);
                        if (this.P == 4) {
                            i13 = a0.i(14.0f);
                            i12 = a0.i(7.0f);
                        } else {
                            i12 = a0.i(8.0f);
                            i13 = a0.i(15.0f);
                        }
                        int i23 = (int) (i13 * f15);
                        int i24 = (int) (i12 * f21);
                        int i25 = a0.i(4.0f);
                        int i26 = a0.i(11.0f);
                        if (this.P == 4) {
                            f22 = 1.5f;
                        }
                        int i27 = a0.i(f22);
                        float f23 = i25;
                        this.O.drawRect(f23, i26 - i12, i25 + i27, i14 + i24, y.g(i16));
                        this.O.drawRect(f23, i26 - i27, i25 + i23, i26, y.g(i16));
                        this.O.restore();
                    }
                    float f24 = this.f17880b;
                    if (f24 != 1.0f) {
                        if (this.P == 4) {
                            int i28 = f17874a0;
                            this.O.drawCircle(i10, i11, i28 - (i28 * f24), y.D());
                        } else {
                            int i29 = f17876c0;
                            this.O.drawCircle(i10, i11, i29 - (i29 * f24), y.D());
                        }
                    }
                }
            }
            invalidate();
            e eVar = this.Q;
            if (eVar != null && !z11) {
                eVar.c(f10);
            }
        }
    }

    public boolean v() {
        setChecked(!this.f17879a);
        return this.f17879a;
    }
}
