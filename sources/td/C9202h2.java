package td;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.ViewGroup;
import be.C1357a0;
import be.C1410y;
import ie.C5386e;
import nc.C7389v0;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3950k;
import p364zd.C11532q;

public class C9202h2 extends C9310u0 implements C3950k.AbstractC3952b {
    public C5386e f29695U;
    public int f29696V;
    public final Paint f29697W;
    public boolean f29698a0;
    public C3950k f29699b0;
    public float f29700c0;
    public C3950k f29701d0;
    public float f29702e0;
    public C5386e f29703f0;
    public int f29704g0;
    public C3950k f29705h0;
    public float f29706i0;
    public boolean f29707j0;

    public C9202h2(Context context) {
        super(context);
        Paint paint = new Paint(5);
        this.f29697W = paint;
        paint.setStrokeWidth(C1357a0.m37541i(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        setId(R.id.menu_btn_stopwatch);
        setButtonBackground(C11532q.m113b());
        setPadding(0, C1357a0.m37541i(2.0f), 0, 0);
        setLayoutParams(new ViewGroup.LayoutParams(C1357a0.m37541i(39.0f), -1));
        setEnabled(false);
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i != 0) {
            boolean z = true;
            if (i == 1) {
                float interpolation = this.f29698a0 ? C2057b.f7279a.getInterpolation(f) : 1.0f - C2057b.f7279a.getInterpolation(1.0f - f);
                this.f29700c0 = interpolation;
                if (interpolation != 1.0f) {
                    z = false;
                }
                setEnabled(z);
            } else if (i == 2) {
                this.f29702e0 = f;
                C5386e eVar = this.f29703f0;
                if (eVar != null && f >= 0.5f) {
                    this.f29695U = eVar;
                    this.f29696V = this.f29704g0;
                    this.f29703f0 = null;
                }
            }
        } else {
            this.f29706i0 = f;
        }
        invalidate();
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        if (i == 0 && f == 0.0f) {
            this.f29695U = null;
        }
    }

    public boolean getIsVisible() {
        return this.f29698a0;
    }

    public final void m9982i(C5386e eVar, int i) {
        C3950k kVar = this.f29701d0;
        if (kVar == null) {
            this.f29701d0 = new C3950k(2, this, C2057b.f7280b, 200L);
        } else {
            kVar.m29542k();
        }
        if (this.f29701d0.m29538o() == 1.0f) {
            C3950k kVar2 = this.f29701d0;
            this.f29702e0 = 0.0f;
            kVar2.m29541l(0.0f);
        }
        this.f29703f0 = eVar;
        this.f29704g0 = i;
        this.f29701d0.m29544i(1.0f);
    }

    public final void m9981j(float f, boolean z) {
        if (this.f29705h0 == null) {
            this.f29705h0 = new C3950k(0, this, C2057b.f7283e, 930L, this.f29706i0);
        }
        boolean z2 = f == 1.0f && z;
        this.f29707j0 = z2;
        this.f29705h0.m29528y(z2 ? 930L : 200L);
        if (this.f29707j0) {
            this.f29705h0.m29557B(C2057b.f7283e);
        } else {
            this.f29705h0.m29557B(C2057b.f7280b);
        }
        this.f29705h0.m29544i(f);
    }

    public final void m9980k(float f) {
        if (this.f29699b0 == null) {
            this.f29699b0 = new C3950k(1, this, C2057b.f7283e, 400L, this.f29700c0);
        }
        this.f29699b0.m29544i(f);
    }

    public void m9979l(String str, boolean z) {
        C3950k kVar = this.f29701d0;
        float f = 0.0f;
        if (kVar != null) {
            kVar.m29541l(0.0f);
        }
        this.f29702e0 = 0.0f;
        C5386e eVar = null;
        this.f29703f0 = null;
        C3950k kVar2 = this.f29699b0;
        if (kVar2 != null) {
            kVar2.m29541l(z ? 1.0f : 0.0f);
        }
        this.f29698a0 = z;
        this.f29700c0 = z ? 1.0f : 0.0f;
        setEnabled(z);
        C3950k kVar3 = this.f29705h0;
        if (kVar3 != null) {
            kVar3.m29541l(str != null ? 1.0f : 0.0f);
        }
        if (str != null) {
            f = 1.0f;
        }
        this.f29706i0 = f;
        if (str != null) {
            eVar = new C5386e(str);
        }
        this.f29695U = eVar;
        this.f29696V = str != null ? (int) C7389v0.m16680T1(str, m9978m(eVar.f17712b)) : 0;
    }

    public final TextPaint m9978m(boolean z) {
        return C1410y.m37062P(16.0f, z);
    }

    public void m9977n(String str, boolean z) {
        C5386e eVar = this.f29695U;
        if (eVar != null || str != null) {
            if (eVar == null || str == null) {
                if (str != null) {
                    C5386e eVar2 = new C5386e(str);
                    this.f29695U = eVar2;
                    this.f29696V = (int) C7389v0.m16680T1(str, m9978m(eVar2.f17712b));
                    m9981j(1.0f, z);
                    return;
                }
                m9981j(0.0f, false);
            } else if (!eVar.f17711a.equals(str)) {
                C5386e eVar3 = new C5386e(str);
                m9982i(eVar3, (int) C7389v0.m16680T1(str, m9978m(eVar3.f17712b)));
            }
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6 = 0.0f;
        if (this.f29700c0 > 0.0f) {
            int paddingLeft = getPaddingLeft() + (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) / 2);
            int paddingTop = getPaddingTop() + (((getMeasuredHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
            float f7 = this.f29700c0;
            if (f7 != 1.0f) {
                float f8 = (f7 * 0.39999998f) + 0.6f;
                canvas.save();
                canvas.scale(f8, f8, paddingLeft, paddingTop);
            }
            float f9 = this.f29706i0;
            if (f9 == 1.0f) {
                float f10 = this.f29702e0;
                float f11 = f10 < 0.5f ? 1.0f - (f10 / 0.5f) : (f10 - 0.5f) / 0.5f;
                int i = (f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1));
                if (i != 0) {
                    canvas.save();
                    float f12 = (0.6f * f11) + 0.4f;
                    canvas.scale(f12, f12, paddingLeft, paddingTop);
                }
                if (this.f29695U != null) {
                    int c = (((int) (f11 * 255.0f)) << 24) | m9522c(-1);
                    TextPaint m = m9978m(this.f29695U.f17712b);
                    m.setColor(c);
                    float min = Math.min(1.0f, getMeasuredWidth() / this.f29696V);
                    int i2 = (min > 1.0f ? 1 : (min == 1.0f ? 0 : -1));
                    if (i2 != 0) {
                        canvas.save();
                        canvas.scale(min, min, paddingLeft, paddingTop);
                    }
                    canvas.drawText(this.f29695U.f17711a, paddingLeft - (this.f29696V / 2), paddingTop + C1357a0.m37541i(5.0f), m);
                    if (i2 != 0) {
                        canvas.restore();
                    }
                }
                if (i != 0) {
                    canvas.restore();
                }
            } else {
                if (this.f29707j0) {
                    float f13 = f9 * 930.0f;
                    f3 = f13 <= 200.0f ? C2057b.f7280b.getInterpolation(f13 / 200.0f) : 1.0f;
                    if (f13 >= 900.0f) {
                        f4 = 1.0f;
                    } else {
                        f4 = f13 > 100.0f ? C2057b.f7282d.getInterpolation((f13 - 100.0f) / 800.0f) : 0.0f;
                    }
                    if (f13 >= 930.0f) {
                        f5 = 1.0f;
                    } else {
                        f5 = f13 > 730.0f ? C2057b.f7280b.getInterpolation((f13 - 730.0f) / 200.0f) : 0.0f;
                    }
                    f = f4;
                    f2 = f5;
                } else {
                    f2 = f9;
                    f3 = 0.0f;
                    f = 0.0f;
                }
                int c2 = m9522c(-1);
                int max = (Math.max(0, Math.min((int) ((this.f29700c0 * 255.0f) * (1.0f - (Math.min(f2, 0.5f) / 0.5f))), 255)) << 24) | c2;
                Paint g = C1410y.m37039g(max);
                int i3 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                if (i3 != 0) {
                    canvas.save();
                    float f14 = ((1.0f - f2) * 0.6f) + 0.4f;
                    canvas.scale(f14, f14, paddingLeft, paddingTop);
                }
                int i4 = C1357a0.m37541i(2.0f);
                int i5 = C1357a0.m37541i(8.0f);
                int i6 = i4 / 2;
                int i7 = paddingLeft - i6;
                int i8 = paddingLeft + i6;
                int i9 = C1357a0.m37541i(6.0f);
                int i10 = (int) (i4 * (f3 < 0.5f ? f3 / 0.5f : 1.0f - ((f3 - 0.5f) / 0.5f)));
                int i11 = i9 / 2;
                int i12 = paddingTop - i5;
                int i13 = i12 - i4;
                canvas.drawRect(paddingLeft - i11, (i13 - i4) + i10, paddingLeft + i11, i13 + i10, g);
                int i14 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (!(i14 == 0 || f == 1.0f)) {
                    canvas.save();
                    canvas.rotate(360.0f * f, paddingLeft, paddingTop);
                }
                float f15 = i7;
                float f16 = i8;
                canvas.drawRect(f15, (paddingTop - i6) - C1357a0.m37541i(4.0f), f16, paddingTop + i6, g);
                if (!(i14 == 0 || f == 1.0f)) {
                    canvas.restore();
                }
                this.f29697W.setColor(max);
                float f17 = paddingLeft;
                float f18 = paddingTop;
                canvas.drawCircle(f17, f18, i5, this.f29697W);
                canvas.save();
                canvas.rotate(45.0f, f17, f18);
                canvas.drawRect(f15, i13 - i6, f16, i12, g);
                canvas.restore();
                if (i3 != 0) {
                    canvas.restore();
                    C5386e eVar = this.f29695U;
                    if (eVar != null) {
                        if (f2 >= 0.5f) {
                            f6 = (f2 - 0.5f) / 0.5f;
                        }
                        TextPaint m2 = m9978m(eVar.f17712b);
                        m2.setColor((((int) (f6 * 255.0f)) << 24) | c2);
                        canvas.save();
                        float min2 = ((f2 * 0.6f) + 0.4f) * Math.min(1.0f, getMeasuredWidth() / this.f29696V);
                        canvas.scale(min2, min2, f17, f18);
                        canvas.drawText(this.f29695U.f17711a, paddingLeft - (this.f29696V / 2), paddingTop + C1357a0.m37541i(5.0f), m2);
                        canvas.restore();
                    }
                }
            }
            if (this.f29700c0 != 1.0f) {
                canvas.restore();
            }
        }
    }

    public void setIsVisible(boolean z) {
        if (this.f29698a0 != z) {
            this.f29698a0 = z;
            m9980k(z ? 1.0f : 0.0f);
        }
    }

    public void setValue(String str) {
        m9977n(str, true);
    }
}
