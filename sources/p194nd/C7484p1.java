package p194nd;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import be.C1410y;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3950k;
import p108hb.C5064d;
import p364zd.C11524j;

public class C7484p1 extends View implements C3950k.AbstractC3952b {
    public int f23928M;
    public float f23929N;
    public float f23930O;
    public C3950k f23931P;
    public int f23932Q;
    public int f23933R;
    public C3950k f23934S;
    public int f23935T;
    public int f23936U;
    public boolean f23937V;
    public C3950k f23938W;
    public float f23940a0;
    public int f23941b;
    public float f23942b0;
    public boolean f23943c;
    public C3950k f23944c0;
    public C3950k f23946e0;
    public long f23947f0;
    public AbstractC7485a f23948g0;
    public float f23949h0;
    public int f23950i0;
    public int f23951j0;
    public int f23939a = R.id.theme_color_sliderActive;
    public float f23945d0 = -1.0f;

    public interface AbstractC7485a {
        void mo15839U0(C7484p1 p1Var, float f);

        void mo15838q2(C7484p1 p1Var, boolean z);

        boolean mo15837s0(C7484p1 p1Var);
    }

    public C7484p1(Context context) {
        super(context);
    }

    private float getSmallValue() {
        C3950k kVar = this.f23946e0;
        return kVar != null ? kVar.m29538o() : this.f23945d0;
    }

    private int getTotalPaddingLeft() {
        return getPaddingLeft() + this.f23950i0;
    }

    private int getTotalPaddingRight() {
        return getPaddingRight() + this.f23951j0;
    }

    private void setColorId(int i) {
        if (this.f23939a != i) {
            this.f23939a = i;
            invalidate();
        }
    }

    private void setEnableFactor(float f) {
        if (this.f23942b0 != f) {
            this.f23942b0 = f;
            invalidate();
        }
    }

    private void setIsUp(boolean z) {
        if (this.f23937V != z) {
            this.f23937V = z;
            getParent().requestDisallowInterceptTouchEvent(z);
            if (this.f23938W == null) {
                this.f23938W = new C3950k(1, this, C2057b.f7280b, 180L);
            }
            this.f23938W.m29544i(z ? 1.0f : 0.0f);
            AbstractC7485a aVar = this.f23948g0;
            if (aVar != null) {
                aVar.mo15838q2(this, z);
            }
        }
    }

    private void setUpFactor(float f) {
        if (this.f23940a0 != f) {
            this.f23940a0 = f;
            invalidate();
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            invalidate();
        } else if (i == 1) {
            setUpFactor(f);
        } else if (i == 2) {
            setEnableFactor(f);
        } else if (i == 3) {
            setValue(f);
        } else if (i == 4) {
            invalidate(getTotalPaddingLeft(), 0, getMeasuredWidth() - getTotalPaddingRight(), getMeasuredHeight());
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        if (i == 0 && f == 1.0f) {
            this.f23939a = this.f23936U;
        }
    }

    public final void m15848a(float f) {
        if (this.f23944c0 == null) {
            float f2 = this.f23942b0;
            if (f2 != f) {
                this.f23944c0 = new C3950k(2, this, C2057b.f7280b, 180L, f2);
            } else {
                return;
            }
        }
        this.f23944c0.m29544i(f);
    }

    public void m15847b(float f) {
        C3950k kVar = this.f23931P;
        if (kVar != null) {
            kVar.m29542k();
        }
        float f2 = this.f23929N;
        if (f2 != f) {
            C3950k kVar2 = this.f23931P;
            if (kVar2 == null) {
                this.f23931P = new C3950k(3, this, C2057b.f7280b, 180L, f2);
            } else {
                kVar2.m29541l(f2);
            }
            this.f23931P.m29544i(f);
        }
    }

    public final void m15846c(float f) {
        if (this.f23929N != f) {
            this.f23929N = f;
            invalidate();
            AbstractC7485a aVar = this.f23948g0;
            if (aVar != null) {
                aVar.mo15839U0(this, f);
            }
        }
    }

    public final int m15845d() {
        float f;
        float f2;
        int totalPaddingLeft = getTotalPaddingLeft();
        int measuredWidth = (getMeasuredWidth() - getTotalPaddingRight()) - totalPaddingLeft;
        if (this.f23941b == 1) {
            int i = measuredWidth / 2;
            totalPaddingLeft += i;
            f = i;
            f2 = this.f23929N;
        } else {
            f = measuredWidth;
            f2 = this.f23929N;
        }
        return totalPaddingLeft + ((int) (f * f2));
    }

    public final int m15844e() {
        return getPaddingTop() + (((getMeasuredHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
    }

    public final void m15843f(float f) {
        C3950k kVar = this.f23944c0;
        if (kVar != null) {
            kVar.m29541l(f);
        }
        setEnableFactor(f);
    }

    public void m15842g(int i, boolean z) {
        if (z) {
            C3950k kVar = this.f23934S;
            if (kVar != null) {
                kVar.m29542k();
            } else if (this.f23939a != i) {
                this.f23934S = new C3950k(0, this, C2057b.f7280b, 180L, 0.0f);
            } else {
                return;
            }
            int i2 = this.f23939a;
            if (i2 != i) {
                this.f23935T = i2;
                this.f23936U = i;
                this.f23934S.m29541l(0.0f);
                this.f23934S.m29544i(1.0f);
                return;
            }
            return;
        }
        C3950k kVar2 = this.f23934S;
        if (kVar2 != null) {
            kVar2.m29541l(0.0f);
        }
        setColorId(i);
    }

    public float getSecondaryValue() {
        return this.f23930O;
    }

    public float getValue() {
        return this.f23929N;
    }

    public void m15841h(boolean z, boolean z2) {
        if (this.f23943c != z) {
            this.f23943c = z;
            float f = 1.0f;
            if (z2) {
                if (!z) {
                    f = 0.0f;
                }
                m15848a(f);
                return;
            }
            if (!z) {
                f = 0.0f;
            }
            m15843f(f);
        }
    }

    public void m15840i(float r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: p194nd.C7484p1.m15840i(float, boolean):void");
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        float f;
        float f2;
        int i3;
        int i4;
        int i5;
        float f3;
        int i6;
        int i7;
        int i8 = C1357a0.m37541i(1.0f);
        int totalPaddingLeft = getTotalPaddingLeft();
        int measuredWidth = getMeasuredWidth() - getTotalPaddingRight();
        int e = m15844e();
        int i9 = e - i8;
        int i10 = e + i8;
        int i11 = measuredWidth - totalPaddingLeft;
        float smallValue = getSmallValue();
        float f4 = (1.0f - this.f23942b0) * 0.65f;
        C3950k kVar = this.f23934S;
        int N = (kVar == null || !kVar.m29531v()) ? C11524j.m228N(this.f23939a) : C5064d.m24128d(C11524j.m228N(this.f23935T), C11524j.m228N(this.f23936U), this.f23934S.m29538o());
        if (f4 > 0.0f) {
            N = C5064d.m24129c(N, C5064d.m24130b((int) (f4 * 255.0f), 0));
        }
        int i12 = this.f23932Q;
        int N2 = i12 != 0 ? C11524j.m228N(i12) : C5064d.m24130b(68, N);
        int i13 = this.f23933R;
        int N3 = i13 != 0 ? C11524j.m228N(i13) : C5064d.m24130b(136, N);
        int i14 = C1357a0.m37541i(4.5f);
        int i15 = C1357a0.m37541i(2.5f);
        RectF a0 = C1410y.m37050a0();
        int i16 = i15;
        float f5 = totalPaddingLeft;
        float f6 = i9;
        float f7 = i10;
        a0.set(f5, f6, measuredWidth, f7);
        int i17 = this.f23928M;
        if (i17 > 1) {
            int i18 = i11 / (i17 - 1);
            int i19 = totalPaddingLeft;
            f = smallValue;
            i2 = N;
            int i20 = 0;
            for (int i21 = 1; i20 < this.f23928M - i21; i21 = 1) {
                i19 += i18;
                i18 = i18;
                i14 = i14;
                a0.set(i19 + i14, a0.top, i19 - i14, a0.bottom);
                float f8 = i8;
                canvas.drawRoundRect(a0, f8, f8, C1410y.m37039g(N2));
                i20++;
            }
            i = i14;
        } else {
            f = smallValue;
            i2 = N;
            i = i14;
            float f9 = i8;
            canvas.drawRoundRect(a0, f9, f9, C1410y.m37039g(N2));
        }
        if (this.f23930O > 0.0f && this.f23941b == 0) {
            a0.set(f5, f6, ((int) (i11 * f2)) + totalPaddingLeft, f7);
            float f10 = i8;
            canvas.drawRoundRect(a0, f10, f10, C1410y.m37039g(N3));
        }
        if (this.f23941b == 1) {
            int i22 = i11 / 2;
            i3 = ((int) (i22 * this.f23929N)) + totalPaddingLeft + i22;
            a0.set(Math.min(i7, i3), f6, Math.max(i7, i3), f7);
        } else {
            i3 = ((int) (i11 * this.f23929N)) + totalPaddingLeft;
            a0.set(f5, f6, i3, f7);
        }
        int i23 = this.f23928M;
        if (i23 > 1) {
            float f11 = a0.left;
            float f12 = a0.right;
            int i24 = i11 / (i23 - 1);
            int i25 = totalPaddingLeft;
            int i26 = 0;
            for (int i27 = 1; i26 < this.f23928M - i27; i27 = 1) {
                float f13 = i25;
                if (f13 < f11 || f13 > f12) {
                    i6 = totalPaddingLeft;
                    f3 = f11;
                } else {
                    i6 = totalPaddingLeft;
                    float f14 = i;
                    f3 = f11;
                    a0.set(Math.max(f11, f13) + f14, a0.top, Math.min(f12, i25 + i24) - f14, a0.bottom);
                    float f15 = i8;
                    canvas.drawRoundRect(a0, f15, f15, C1410y.m37039g(i2));
                }
                i25 += i24;
                i26++;
                totalPaddingLeft = i6;
                f11 = f3;
            }
            i4 = totalPaddingLeft;
        } else {
            i4 = totalPaddingLeft;
            float f16 = i8;
            canvas.drawRoundRect(a0, f16, f16, C1410y.m37039g(i2));
        }
        int i28 = f != -1.0f ? (int) (f5 + (i11 * f)) : -1;
        int i29 = C1357a0.m37541i(3.5f);
        if (i28 != -1) {
            i5 = e;
            canvas.drawCircle(i28, i5, i29, C1410y.m37039g(i28 > i3 ? N2 : i2));
        } else {
            i5 = e;
        }
        int i30 = this.f23928M;
        if (i30 > 1) {
            int i31 = i11 / (i30 - 1);
            int i32 = i4;
            int i33 = 0;
            while (i33 < this.f23928M) {
                int i34 = i16;
                canvas.drawCircle(i32, i5, i34, C1410y.m37039g(i32 > i3 ? N2 : i2));
                i32 += i31;
                i33++;
                i16 = i34;
            }
        }
        int i35 = C1357a0.m37541i(6.0f) + ((int) (C1357a0.m37541i(4.0f) * this.f23940a0));
        float f17 = i5;
        canvas.drawCircle(i3, f17, i35, C1410y.m37039g(i2));
        if (i28 != -1 && Math.abs(i3 - i28) < i35 + i29) {
            canvas.save();
            int i36 = i3 + i35;
            canvas.clipRect(i3 - i35, i5 - i35, i36, i5 + i35);
            canvas.drawCircle(i28, f17, i29, C1410y.m37039g(C5064d.m24128d(C11524j.m148w(), N2, (i28 <= i36 || i28 >= i36 + i29) ? 0.0f : ((i28 - i3) - i35) / i29)));
            canvas.restore();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C3950k kVar;
        AbstractC7485a aVar;
        float f;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        if (!this.f23937V) {
                            return false;
                        }
                        setIsUp(false);
                        return true;
                    }
                } else if (this.f23937V) {
                    float f2 = x - this.f23949h0;
                    int totalPaddingLeft = getTotalPaddingLeft();
                    int measuredWidth = (getMeasuredWidth() - getTotalPaddingRight()) - totalPaddingLeft;
                    if (this.f23941b == 1) {
                        int i = measuredWidth / 2;
                        f = Math.max(-1.0f, Math.min(1.0f, (f2 - (totalPaddingLeft + i)) / i));
                    } else {
                        f = Math.max(0.0f, Math.min(1.0f, (f2 - totalPaddingLeft) / measuredWidth));
                    }
                    m15846c(f);
                    return true;
                }
            } else if (this.f23937V) {
                setIsUp(false);
                return true;
            }
            return this.f23937V;
        }
        int d = m15845d();
        int e = m15844e();
        int i2 = C1357a0.m37541i(24.0f);
        if (x < d - i2 || x > d + i2 || y < e - i2 || y > e + i2 || !this.f23943c || (((kVar = this.f23931P) != null && kVar.m29531v()) || ((aVar = this.f23948g0) != null && !aVar.mo15837s0(this)))) {
            return false;
        }
        this.f23949h0 = x - d;
        setIsUp(true);
        return true;
    }

    public void setAddPaddingLeft(int i) {
        if (this.f23950i0 != i) {
            this.f23950i0 = i;
            invalidate();
        }
    }

    public void setAddPaddingRight(int i) {
        if (this.f23951j0 != i) {
            this.f23951j0 = i;
            invalidate();
        }
    }

    public void setAnchorMode(int i) {
        this.f23941b = i;
    }

    public void setForceBackgroundColorId(int i) {
        this.f23932Q = i;
    }

    public void setForceSecondaryColorId(int i) {
        this.f23933R = i;
    }

    public void setListener(AbstractC7485a aVar) {
        this.f23948g0 = aVar;
    }

    public void setSecondaryValue(float f) {
        if (this.f23930O != f) {
            this.f23930O = f;
            invalidate();
        }
    }

    public void setValue(float f) {
        if (this.f23929N != f) {
            this.f23929N = f;
            invalidate();
        }
    }

    public void setValueCount(int i) {
        if (this.f23928M != i) {
            this.f23928M = i;
            invalidate();
        }
    }
}
