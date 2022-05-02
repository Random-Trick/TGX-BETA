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
    public int f23931M;
    public float f23932N;
    public float f23933O;
    public C3950k f23934P;
    public int f23935Q;
    public int f23936R;
    public C3950k f23937S;
    public int f23938T;
    public int f23939U;
    public boolean f23940V;
    public C3950k f23941W;
    public float f23943a0;
    public int f23944b;
    public float f23945b0;
    public boolean f23946c;
    public C3950k f23947c0;
    public C3950k f23949e0;
    public long f23950f0;
    public AbstractC7485a f23951g0;
    public float f23952h0;
    public int f23953i0;
    public int f23954j0;
    public int f23942a = R.id.theme_color_sliderActive;
    public float f23948d0 = -1.0f;

    public interface AbstractC7485a {
        void mo15839U0(C7484p1 p1Var, float f);

        void mo15838q2(C7484p1 p1Var, boolean z);

        boolean mo15837s0(C7484p1 p1Var);
    }

    public C7484p1(Context context) {
        super(context);
    }

    private float getSmallValue() {
        C3950k kVar = this.f23949e0;
        return kVar != null ? kVar.m29540o() : this.f23948d0;
    }

    private int getTotalPaddingLeft() {
        return getPaddingLeft() + this.f23953i0;
    }

    private int getTotalPaddingRight() {
        return getPaddingRight() + this.f23954j0;
    }

    private void setColorId(int i) {
        if (this.f23942a != i) {
            this.f23942a = i;
            invalidate();
        }
    }

    private void setEnableFactor(float f) {
        if (this.f23945b0 != f) {
            this.f23945b0 = f;
            invalidate();
        }
    }

    private void setIsUp(boolean z) {
        if (this.f23940V != z) {
            this.f23940V = z;
            getParent().requestDisallowInterceptTouchEvent(z);
            if (this.f23941W == null) {
                this.f23941W = new C3950k(1, this, C2057b.f7280b, 180L);
            }
            this.f23941W.m29546i(z ? 1.0f : 0.0f);
            AbstractC7485a aVar = this.f23951g0;
            if (aVar != null) {
                aVar.mo15838q2(this, z);
            }
        }
    }

    private void setUpFactor(float f) {
        if (this.f23943a0 != f) {
            this.f23943a0 = f;
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
            this.f23942a = this.f23939U;
        }
    }

    public final void m15848a(float f) {
        if (this.f23947c0 == null) {
            float f2 = this.f23945b0;
            if (f2 != f) {
                this.f23947c0 = new C3950k(2, this, C2057b.f7280b, 180L, f2);
            } else {
                return;
            }
        }
        this.f23947c0.m29546i(f);
    }

    public void m15847b(float f) {
        C3950k kVar = this.f23934P;
        if (kVar != null) {
            kVar.m29544k();
        }
        float f2 = this.f23932N;
        if (f2 != f) {
            C3950k kVar2 = this.f23934P;
            if (kVar2 == null) {
                this.f23934P = new C3950k(3, this, C2057b.f7280b, 180L, f2);
            } else {
                kVar2.m29543l(f2);
            }
            this.f23934P.m29546i(f);
        }
    }

    public final void m15846c(float f) {
        if (this.f23932N != f) {
            this.f23932N = f;
            invalidate();
            AbstractC7485a aVar = this.f23951g0;
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
        if (this.f23944b == 1) {
            int i = measuredWidth / 2;
            totalPaddingLeft += i;
            f = i;
            f2 = this.f23932N;
        } else {
            f = measuredWidth;
            f2 = this.f23932N;
        }
        return totalPaddingLeft + ((int) (f * f2));
    }

    public final int m15844e() {
        return getPaddingTop() + (((getMeasuredHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
    }

    public final void m15843f(float f) {
        C3950k kVar = this.f23947c0;
        if (kVar != null) {
            kVar.m29543l(f);
        }
        setEnableFactor(f);
    }

    public void m15842g(int i, boolean z) {
        if (z) {
            C3950k kVar = this.f23937S;
            if (kVar != null) {
                kVar.m29544k();
            } else if (this.f23942a != i) {
                this.f23937S = new C3950k(0, this, C2057b.f7280b, 180L, 0.0f);
            } else {
                return;
            }
            int i2 = this.f23942a;
            if (i2 != i) {
                this.f23938T = i2;
                this.f23939U = i;
                this.f23937S.m29543l(0.0f);
                this.f23937S.m29546i(1.0f);
                return;
            }
            return;
        }
        C3950k kVar2 = this.f23937S;
        if (kVar2 != null) {
            kVar2.m29543l(0.0f);
        }
        setColorId(i);
    }

    public float getSecondaryValue() {
        return this.f23933O;
    }

    public float getValue() {
        return this.f23932N;
    }

    public void m15841h(boolean z, boolean z2) {
        if (this.f23946c != z) {
            this.f23946c = z;
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
        int i8 = C1357a0.m37544i(1.0f);
        int totalPaddingLeft = getTotalPaddingLeft();
        int measuredWidth = getMeasuredWidth() - getTotalPaddingRight();
        int e = m15844e();
        int i9 = e - i8;
        int i10 = e + i8;
        int i11 = measuredWidth - totalPaddingLeft;
        float smallValue = getSmallValue();
        float f4 = (1.0f - this.f23945b0) * 0.65f;
        C3950k kVar = this.f23937S;
        int N = (kVar == null || !kVar.m29533v()) ? C11524j.m228N(this.f23942a) : C5064d.m24129d(C11524j.m228N(this.f23938T), C11524j.m228N(this.f23939U), this.f23937S.m29540o());
        if (f4 > 0.0f) {
            N = C5064d.m24130c(N, C5064d.m24131b((int) (f4 * 255.0f), 0));
        }
        int i12 = this.f23935Q;
        int N2 = i12 != 0 ? C11524j.m228N(i12) : C5064d.m24131b(68, N);
        int i13 = this.f23936R;
        int N3 = i13 != 0 ? C11524j.m228N(i13) : C5064d.m24131b(136, N);
        int i14 = C1357a0.m37544i(4.5f);
        int i15 = C1357a0.m37544i(2.5f);
        RectF a0 = C1410y.m37053a0();
        int i16 = i15;
        float f5 = totalPaddingLeft;
        float f6 = i9;
        float f7 = i10;
        a0.set(f5, f6, measuredWidth, f7);
        int i17 = this.f23931M;
        if (i17 > 1) {
            int i18 = i11 / (i17 - 1);
            int i19 = totalPaddingLeft;
            f = smallValue;
            i2 = N;
            int i20 = 0;
            for (int i21 = 1; i20 < this.f23931M - i21; i21 = 1) {
                i19 += i18;
                i18 = i18;
                i14 = i14;
                a0.set(i19 + i14, a0.top, i19 - i14, a0.bottom);
                float f8 = i8;
                canvas.drawRoundRect(a0, f8, f8, C1410y.m37042g(N2));
                i20++;
            }
            i = i14;
        } else {
            f = smallValue;
            i2 = N;
            i = i14;
            float f9 = i8;
            canvas.drawRoundRect(a0, f9, f9, C1410y.m37042g(N2));
        }
        if (this.f23933O > 0.0f && this.f23944b == 0) {
            a0.set(f5, f6, ((int) (i11 * f2)) + totalPaddingLeft, f7);
            float f10 = i8;
            canvas.drawRoundRect(a0, f10, f10, C1410y.m37042g(N3));
        }
        if (this.f23944b == 1) {
            int i22 = i11 / 2;
            i3 = ((int) (i22 * this.f23932N)) + totalPaddingLeft + i22;
            a0.set(Math.min(i7, i3), f6, Math.max(i7, i3), f7);
        } else {
            i3 = ((int) (i11 * this.f23932N)) + totalPaddingLeft;
            a0.set(f5, f6, i3, f7);
        }
        int i23 = this.f23931M;
        if (i23 > 1) {
            float f11 = a0.left;
            float f12 = a0.right;
            int i24 = i11 / (i23 - 1);
            int i25 = totalPaddingLeft;
            int i26 = 0;
            for (int i27 = 1; i26 < this.f23931M - i27; i27 = 1) {
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
                    canvas.drawRoundRect(a0, f15, f15, C1410y.m37042g(i2));
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
            canvas.drawRoundRect(a0, f16, f16, C1410y.m37042g(i2));
        }
        int i28 = f != -1.0f ? (int) (f5 + (i11 * f)) : -1;
        int i29 = C1357a0.m37544i(3.5f);
        if (i28 != -1) {
            i5 = e;
            canvas.drawCircle(i28, i5, i29, C1410y.m37042g(i28 > i3 ? N2 : i2));
        } else {
            i5 = e;
        }
        int i30 = this.f23931M;
        if (i30 > 1) {
            int i31 = i11 / (i30 - 1);
            int i32 = i4;
            int i33 = 0;
            while (i33 < this.f23931M) {
                int i34 = i16;
                canvas.drawCircle(i32, i5, i34, C1410y.m37042g(i32 > i3 ? N2 : i2));
                i32 += i31;
                i33++;
                i16 = i34;
            }
        }
        int i35 = C1357a0.m37544i(6.0f) + ((int) (C1357a0.m37544i(4.0f) * this.f23943a0));
        float f17 = i5;
        canvas.drawCircle(i3, f17, i35, C1410y.m37042g(i2));
        if (i28 != -1 && Math.abs(i3 - i28) < i35 + i29) {
            canvas.save();
            int i36 = i3 + i35;
            canvas.clipRect(i3 - i35, i5 - i35, i36, i5 + i35);
            canvas.drawCircle(i28, f17, i29, C1410y.m37042g(C5064d.m24129d(C11524j.m148w(), N2, (i28 <= i36 || i28 >= i36 + i29) ? 0.0f : ((i28 - i3) - i35) / i29)));
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
                        if (!this.f23940V) {
                            return false;
                        }
                        setIsUp(false);
                        return true;
                    }
                } else if (this.f23940V) {
                    float f2 = x - this.f23952h0;
                    int totalPaddingLeft = getTotalPaddingLeft();
                    int measuredWidth = (getMeasuredWidth() - getTotalPaddingRight()) - totalPaddingLeft;
                    if (this.f23944b == 1) {
                        int i = measuredWidth / 2;
                        f = Math.max(-1.0f, Math.min(1.0f, (f2 - (totalPaddingLeft + i)) / i));
                    } else {
                        f = Math.max(0.0f, Math.min(1.0f, (f2 - totalPaddingLeft) / measuredWidth));
                    }
                    m15846c(f);
                    return true;
                }
            } else if (this.f23940V) {
                setIsUp(false);
                return true;
            }
            return this.f23940V;
        }
        int d = m15845d();
        int e = m15844e();
        int i2 = C1357a0.m37544i(24.0f);
        if (x < d - i2 || x > d + i2 || y < e - i2 || y > e + i2 || !this.f23946c || (((kVar = this.f23934P) != null && kVar.m29533v()) || ((aVar = this.f23951g0) != null && !aVar.mo15837s0(this)))) {
            return false;
        }
        this.f23952h0 = x - d;
        setIsUp(true);
        return true;
    }

    public void setAddPaddingLeft(int i) {
        if (this.f23953i0 != i) {
            this.f23953i0 = i;
            invalidate();
        }
    }

    public void setAddPaddingRight(int i) {
        if (this.f23954j0 != i) {
            this.f23954j0 = i;
            invalidate();
        }
    }

    public void setAnchorMode(int i) {
        this.f23944b = i;
    }

    public void setForceBackgroundColorId(int i) {
        this.f23935Q = i;
    }

    public void setForceSecondaryColorId(int i) {
        this.f23936R = i;
    }

    public void setListener(AbstractC7485a aVar) {
        this.f23951g0 = aVar;
    }

    public void setSecondaryValue(float f) {
        if (this.f23933O != f) {
            this.f23933O = f;
            invalidate();
        }
    }

    public void setValue(float f) {
        if (this.f23932N != f) {
            this.f23932N = f;
            invalidate();
        }
    }

    public void setValueCount(int i) {
        if (this.f23931M != i) {
            this.f23931M = i;
            invalidate();
        }
    }
}
