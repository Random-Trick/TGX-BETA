package ud;

import ae.q;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.ViewGroup;
import ce.a0;
import ce.y;
import db.b;
import eb.k;
import je.e;
import oc.v0;
import org.thunderdog.challegram.R;

public class h2 extends u0 implements k.b {
    public e U;
    public int V;
    public final Paint W;
    public boolean f24188a0;
    public k f24189b0;
    public float f24190c0;
    public k f24191d0;
    public float f24192e0;
    public e f24193f0;
    public int f24194g0;
    public k f24195h0;
    public float f24196i0;
    public boolean f24197j0;

    public h2(Context context) {
        super(context);
        Paint paint = new Paint(5);
        this.W = paint;
        paint.setStrokeWidth(a0.i(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        setId(R.id.menu_btn_stopwatch);
        setButtonBackground(q.b());
        setPadding(0, a0.i(2.0f), 0, 0);
        setLayoutParams(new ViewGroup.LayoutParams(a0.i(39.0f), -1));
        setEnabled(false);
    }

    public boolean getIsVisible() {
        return this.f24188a0;
    }

    public final void i(e eVar, int i10) {
        k kVar = this.f24191d0;
        if (kVar == null) {
            this.f24191d0 = new k(2, this, b.f7287b, 200L);
        } else {
            kVar.k();
        }
        if (this.f24191d0.o() == 1.0f) {
            k kVar2 = this.f24191d0;
            this.f24192e0 = 0.0f;
            kVar2.l(0.0f);
        }
        this.f24193f0 = eVar;
        this.f24194g0 = i10;
        this.f24191d0.i(1.0f);
    }

    public final void j(float f10, boolean z10) {
        if (this.f24195h0 == null) {
            this.f24195h0 = new k(0, this, b.f7290e, 930L, this.f24196i0);
        }
        boolean z11 = f10 == 1.0f && z10;
        this.f24197j0 = z11;
        this.f24195h0.y(z11 ? 930L : 200L);
        if (this.f24197j0) {
            this.f24195h0.B(b.f7290e);
        } else {
            this.f24195h0.B(b.f7287b);
        }
        this.f24195h0.i(f10);
    }

    public final void k(float f10) {
        if (this.f24189b0 == null) {
            this.f24189b0 = new k(1, this, b.f7290e, 400L, this.f24190c0);
        }
        this.f24189b0.i(f10);
    }

    public void l(String str, boolean z10) {
        k kVar = this.f24191d0;
        float f10 = 0.0f;
        if (kVar != null) {
            kVar.l(0.0f);
        }
        this.f24192e0 = 0.0f;
        e eVar = null;
        this.f24193f0 = null;
        k kVar2 = this.f24189b0;
        if (kVar2 != null) {
            kVar2.l(z10 ? 1.0f : 0.0f);
        }
        this.f24188a0 = z10;
        this.f24190c0 = z10 ? 1.0f : 0.0f;
        setEnabled(z10);
        k kVar3 = this.f24195h0;
        if (kVar3 != null) {
            kVar3.l(str != null ? 1.0f : 0.0f);
        }
        if (str != null) {
            f10 = 1.0f;
        }
        this.f24196i0 = f10;
        if (str != null) {
            eVar = new e(str);
        }
        this.U = eVar;
        this.V = str != null ? (int) v0.T1(str, m(eVar.f15364b)) : 0;
    }

    public final TextPaint m(boolean z10) {
        return y.P(16.0f, z10);
    }

    public void n(String str, boolean z10) {
        e eVar = this.U;
        if (eVar != null || str != null) {
            if (eVar == null || str == null) {
                if (str != null) {
                    e eVar2 = new e(str);
                    this.U = eVar2;
                    this.V = (int) v0.T1(str, m(eVar2.f15364b));
                    j(1.0f, z10);
                    return;
                }
                j(0.0f, false);
            } else if (!eVar.f15363a.equals(str)) {
                e eVar3 = new e(str);
                i(eVar3, (int) v0.T1(str, m(eVar3.f15364b)));
            }
        }
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 != 0) {
            boolean z10 = true;
            if (i10 == 1) {
                float interpolation = this.f24188a0 ? b.f7286a.getInterpolation(f10) : 1.0f - b.f7286a.getInterpolation(1.0f - f10);
                this.f24190c0 = interpolation;
                if (interpolation != 1.0f) {
                    z10 = false;
                }
                setEnabled(z10);
            } else if (i10 == 2) {
                this.f24192e0 = f10;
                e eVar = this.f24193f0;
                if (eVar != null && f10 >= 0.5f) {
                    this.U = eVar;
                    this.V = this.f24194g0;
                    this.f24193f0 = null;
                }
            }
        } else {
            this.f24196i0 = f10;
        }
        invalidate();
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        if (i10 == 0 && f10 == 0.0f) {
            this.U = null;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15 = 0.0f;
        if (this.f24190c0 > 0.0f) {
            int paddingLeft = getPaddingLeft() + (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) / 2);
            int paddingTop = getPaddingTop() + (((getMeasuredHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
            float f16 = this.f24190c0;
            if (f16 != 1.0f) {
                float f17 = (f16 * 0.39999998f) + 0.6f;
                canvas.save();
                canvas.scale(f17, f17, paddingLeft, paddingTop);
            }
            float f18 = this.f24196i0;
            if (f18 == 1.0f) {
                float f19 = this.f24192e0;
                float f20 = f19 < 0.5f ? 1.0f - (f19 / 0.5f) : (f19 - 0.5f) / 0.5f;
                int i10 = (f20 > 1.0f ? 1 : (f20 == 1.0f ? 0 : -1));
                if (i10 != 0) {
                    canvas.save();
                    float f21 = (0.6f * f20) + 0.4f;
                    canvas.scale(f21, f21, paddingLeft, paddingTop);
                }
                if (this.U != null) {
                    int c10 = (((int) (f20 * 255.0f)) << 24) | c(-1);
                    TextPaint m10 = m(this.U.f15364b);
                    m10.setColor(c10);
                    float min = Math.min(1.0f, getMeasuredWidth() / this.V);
                    int i11 = (min > 1.0f ? 1 : (min == 1.0f ? 0 : -1));
                    if (i11 != 0) {
                        canvas.save();
                        canvas.scale(min, min, paddingLeft, paddingTop);
                    }
                    canvas.drawText(this.U.f15363a, paddingLeft - (this.V / 2), paddingTop + a0.i(5.0f), m10);
                    if (i11 != 0) {
                        canvas.restore();
                    }
                }
                if (i10 != 0) {
                    canvas.restore();
                }
            } else {
                if (this.f24197j0) {
                    float f22 = f18 * 930.0f;
                    f12 = f22 <= 200.0f ? b.f7287b.getInterpolation(f22 / 200.0f) : 1.0f;
                    if (f22 >= 900.0f) {
                        f13 = 1.0f;
                    } else {
                        f13 = f22 > 100.0f ? b.f7289d.getInterpolation((f22 - 100.0f) / 800.0f) : 0.0f;
                    }
                    if (f22 >= 930.0f) {
                        f14 = 1.0f;
                    } else {
                        f14 = f22 > 730.0f ? b.f7287b.getInterpolation((f22 - 730.0f) / 200.0f) : 0.0f;
                    }
                    f10 = f13;
                    f11 = f14;
                } else {
                    f11 = f18;
                    f12 = 0.0f;
                    f10 = 0.0f;
                }
                int c11 = c(-1);
                int max = (Math.max(0, Math.min((int) ((this.f24190c0 * 255.0f) * (1.0f - (Math.min(f11, 0.5f) / 0.5f))), 255)) << 24) | c11;
                Paint g10 = y.g(max);
                int i12 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
                if (i12 != 0) {
                    canvas.save();
                    float f23 = ((1.0f - f11) * 0.6f) + 0.4f;
                    canvas.scale(f23, f23, paddingLeft, paddingTop);
                }
                int i13 = a0.i(2.0f);
                int i14 = a0.i(8.0f);
                int i15 = i13 / 2;
                int i16 = paddingLeft - i15;
                int i17 = paddingLeft + i15;
                int i18 = a0.i(6.0f);
                int i19 = (int) (i13 * (f12 < 0.5f ? f12 / 0.5f : 1.0f - ((f12 - 0.5f) / 0.5f)));
                int i20 = i18 / 2;
                int i21 = paddingTop - i14;
                int i22 = i21 - i13;
                canvas.drawRect(paddingLeft - i20, (i22 - i13) + i19, paddingLeft + i20, i22 + i19, g10);
                int i23 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                if (!(i23 == 0 || f10 == 1.0f)) {
                    canvas.save();
                    canvas.rotate(360.0f * f10, paddingLeft, paddingTop);
                }
                float f24 = i16;
                float f25 = i17;
                canvas.drawRect(f24, (paddingTop - i15) - a0.i(4.0f), f25, paddingTop + i15, g10);
                if (!(i23 == 0 || f10 == 1.0f)) {
                    canvas.restore();
                }
                this.W.setColor(max);
                float f26 = paddingLeft;
                float f27 = paddingTop;
                canvas.drawCircle(f26, f27, i14, this.W);
                canvas.save();
                canvas.rotate(45.0f, f26, f27);
                canvas.drawRect(f24, i22 - i15, f25, i21, g10);
                canvas.restore();
                if (i12 != 0) {
                    canvas.restore();
                    e eVar = this.U;
                    if (eVar != null) {
                        if (f11 >= 0.5f) {
                            f15 = (f11 - 0.5f) / 0.5f;
                        }
                        TextPaint m11 = m(eVar.f15364b);
                        m11.setColor((((int) (f15 * 255.0f)) << 24) | c11);
                        canvas.save();
                        float min2 = ((f11 * 0.6f) + 0.4f) * Math.min(1.0f, getMeasuredWidth() / this.V);
                        canvas.scale(min2, min2, f26, f27);
                        canvas.drawText(this.U.f15363a, paddingLeft - (this.V / 2), paddingTop + a0.i(5.0f), m11);
                        canvas.restore();
                    }
                }
            }
            if (this.f24190c0 != 1.0f) {
                canvas.restore();
            }
        }
    }

    public void setIsVisible(boolean z10) {
        if (this.f24188a0 != z10) {
            this.f24188a0 = z10;
            k(z10 ? 1.0f : 0.0f);
        }
    }

    public void setValue(String str) {
        n(str, true);
    }
}
