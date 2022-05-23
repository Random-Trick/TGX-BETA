package pc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import qc.a;
import qc.c;
import rc.e;
import rc.g;

public class o extends f<c, g> {
    public o(Context context) {
        super(context);
    }

    @Override
    public e l(int i10, int i11) {
        T t10 = this.J0;
        float f10 = 1.0f;
        if (((c) t10).f21525i.length >= 2) {
            char c10 = 0;
            if (((c) t10).f21525i[0] == 1.0f) {
                c10 = 1;
            }
            f10 = ((c) t10).f21525i[c10];
        }
        return new e(i10, i11, this.f21046p1, f10);
    }

    @Override
    public g n(a.C0200a aVar) {
        return new g(aVar);
    }

    @Override
    public void q(Canvas canvas) {
        float f10;
        float f11;
        if (this.J0 != 0) {
            l lVar = this.I0;
            float f12 = lVar.f21116m;
            float f13 = lVar.f21115l;
            float f14 = this.f21028g1 / (f12 - f13);
            float horizontalPadding = (f13 * f14) - f.getHorizontalPadding();
            canvas.save();
            int i10 = this.f21014a1;
            int i11 = 2;
            if (i10 != 2) {
                int i12 = 1;
                if (i10 == 1) {
                    throw null;
                } else if (i10 != 3) {
                    int i13 = 0;
                    int i14 = 0;
                    while (i14 < this.M.size()) {
                        g gVar = (g) this.M.get(i14);
                        if (gVar.f21865n || gVar.f21866o != 0.0f) {
                            int[] iArr = gVar.f21852a.f21515a;
                            gVar.f21857f.reset();
                            T t10 = this.J0;
                            int horizontalPadding2 = ((int) (f.getHorizontalPadding() / (((c) t10).f21508b.length < i11 ? 1.0f : ((c) t10).f21508b[i12] * f14))) + i12;
                            int max = Math.max(i13, this.f21039m0 - horizontalPadding2);
                            int min = Math.min(((c) this.J0).f21508b.length - i12, this.f21041n0 + horizontalPadding2);
                            boolean z10 = true;
                            int i15 = 0;
                            while (max <= min) {
                                if (iArr[max] < 0) {
                                    f11 = f14;
                                } else {
                                    T t11 = this.J0;
                                    float f15 = (((c) t11).f21508b[max] * f14) - horizontalPadding;
                                    float f16 = iArr[max] * ((c) t11).f21525i[i14];
                                    float f17 = this.f21031i0;
                                    float f18 = (f16 - f17) / (this.f21029h0 - f17);
                                    float strokeWidth = gVar.f21854c.getStrokeWidth() / 2.0f;
                                    f11 = f14;
                                    float measuredHeight = ((getMeasuredHeight() - this.f21027g0) - strokeWidth) - (f18 * (((getMeasuredHeight() - this.f21027g0) - f.getSignatureTextHeight()) - strokeWidth));
                                    if (f.H1) {
                                        if (i15 == 0) {
                                            float[] fArr = gVar.f21862k;
                                            int i16 = i15 + 1;
                                            fArr[i15] = f15;
                                            i15 = i16 + 1;
                                            fArr[i16] = measuredHeight;
                                        } else {
                                            float[] fArr2 = gVar.f21862k;
                                            int i17 = i15 + 1;
                                            fArr2[i15] = f15;
                                            int i18 = i17 + 1;
                                            fArr2[i17] = measuredHeight;
                                            int i19 = i18 + 1;
                                            fArr2[i18] = f15;
                                            i15 = i19 + 1;
                                            fArr2[i19] = measuredHeight;
                                        }
                                    } else if (z10) {
                                        gVar.f21857f.moveTo(f15, measuredHeight);
                                        z10 = false;
                                    } else {
                                        gVar.f21857f.lineTo(f15, measuredHeight);
                                    }
                                }
                                max++;
                                f14 = f11;
                            }
                            f10 = f14;
                            if (this.f21041n0 - this.f21039m0 > 100) {
                                gVar.f21854c.setStrokeCap(Paint.Cap.SQUARE);
                            } else {
                                gVar.f21854c.setStrokeCap(Paint.Cap.ROUND);
                            }
                            gVar.f21854c.setAlpha((int) (gVar.f21866o * 255.0f * 1.0f));
                            if (!f.H1) {
                                canvas.drawPath(gVar.f21857f, gVar.f21854c);
                            } else {
                                canvas.drawLines(gVar.f21862k, 0, i15, gVar.f21854c);
                                i14++;
                                f14 = f10;
                                i13 = 0;
                                i11 = 2;
                                i12 = 1;
                            }
                        } else {
                            f10 = f14;
                        }
                        i14++;
                        f14 = f10;
                        i13 = 0;
                        i11 = 2;
                        i12 = 1;
                    }
                    canvas.restore();
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
    }

    @Override
    public void t(Canvas canvas) {
        int measuredHeight = getMeasuredHeight() - f.getPickerPadding();
        int measuredHeight2 = (getMeasuredHeight() - this.f21020c1) - f.getPickerPadding();
        int size = this.M.size();
        if (this.J0 != 0) {
            for (int i10 = 0; i10 < size; i10++) {
                g gVar = (g) this.M.get(i10);
                if (gVar.f21865n || gVar.f21866o != 0.0f) {
                    gVar.f21856e.reset();
                    int length = ((c) this.J0).f21508b.length;
                    int[] iArr = gVar.f21852a.f21515a;
                    gVar.f21857f.reset();
                    int i11 = 0;
                    for (int i12 = 0; i12 < length; i12++) {
                        if (iArr[i12] >= 0) {
                            T t10 = this.J0;
                            float f10 = ((c) t10).f21508b[i12] * this.f21022d1;
                            float f11 = (1.0f - ((iArr[i12] * ((c) t10).f21525i[i10]) / (f.I1 ? this.L0 : ((c) t10).f21511e))) * (measuredHeight - measuredHeight2);
                            if (f.H1) {
                                if (i11 == 0) {
                                    float[] fArr = gVar.f21863l;
                                    int i13 = i11 + 1;
                                    fArr[i11] = f10;
                                    i11 = i13 + 1;
                                    fArr[i13] = f11;
                                } else {
                                    float[] fArr2 = gVar.f21863l;
                                    int i14 = i11 + 1;
                                    fArr2[i11] = f10;
                                    int i15 = i14 + 1;
                                    fArr2[i14] = f11;
                                    int i16 = i15 + 1;
                                    fArr2[i15] = f10;
                                    i11 = i16 + 1;
                                    fArr2[i16] = f11;
                                }
                            } else if (i12 == 0) {
                                gVar.f21856e.moveTo(f10, f11);
                            } else {
                                gVar.f21856e.lineTo(f10, f11);
                            }
                        }
                    }
                    gVar.f21861j = i11;
                    if (gVar.f21865n || gVar.f21866o != 0.0f) {
                        gVar.f21853b.setAlpha((int) (gVar.f21866o * 255.0f));
                        if (f.H1) {
                            canvas.drawLines(gVar.f21863l, 0, gVar.f21861j, gVar.f21853b);
                        } else {
                            canvas.drawPath(gVar.f21856e, gVar.f21853b);
                        }
                    }
                }
            }
        }
    }

    @Override
    public void u(Canvas canvas) {
        if (this.T0 >= 0 && this.W0) {
            l lVar = this.I0;
            float f10 = lVar.f21116m;
            float f11 = lVar.f21115l;
            float f12 = this.f21028g1 / (f10 - f11);
            float horizontalPadding = (((c) this.J0).f21508b[this.T0] * f12) - ((f11 * f12) - f.getHorizontalPadding());
            this.f21051s0.setAlpha((int) (this.f21025f0 * this.X0));
            canvas.drawLine(horizontalPadding, 0.0f, horizontalPadding, this.f21032i1.bottom, this.f21051s0);
            this.N0 = this.M.size();
            int i10 = 0;
            while (true) {
                this.O0 = i10;
                int i11 = this.O0;
                if (i11 < this.N0) {
                    g gVar = (g) this.M.get(i11);
                    if (gVar.f21865n || gVar.f21866o != 0.0f) {
                        float f13 = gVar.f21852a.f21515a[this.T0] * ((c) this.J0).f21525i[this.O0];
                        float f14 = this.f21031i0;
                        float measuredHeight = (getMeasuredHeight() - this.f21027g0) - (((f13 - f14) / (this.f21029h0 - f14)) * ((getMeasuredHeight() - this.f21027g0) - f.getSignatureTextHeight()));
                        gVar.f21855d.setAlpha((int) (gVar.f21866o * 255.0f * this.X0));
                        this.f21063y0.setAlpha((int) (gVar.f21866o * 255.0f * this.X0));
                        canvas.drawPoint(horizontalPadding, measuredHeight, gVar.f21855d);
                        canvas.drawPoint(horizontalPadding, measuredHeight, this.f21063y0);
                    }
                    i10 = this.O0 + 1;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public void v(android.graphics.Canvas r18, rc.e r19) {
        throw new UnsupportedOperationException("Method not decompiled: pc.o.v(android.graphics.Canvas, rc.e):void");
    }

    @Override
    public int w(int i10, int i11) {
        if (this.M.isEmpty()) {
            return 0;
        }
        int size = this.M.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            int f10 = ((g) this.M.get(i13)).f21865n ? (int) (((c) this.J0).f21510d.get(i13).f21516b.f(i10, i11) * ((c) this.J0).f21525i[i13]) : 0;
            if (f10 > i12) {
                i12 = f10;
            }
        }
        return i12;
    }

    @Override
    public int x(int i10, int i11) {
        if (this.M.isEmpty()) {
            return 0;
        }
        int size = this.M.size();
        int i12 = Integer.MAX_VALUE;
        for (int i13 = 0; i13 < size; i13++) {
            int h10 = ((g) this.M.get(i13)).f21865n ? (int) (((c) this.J0).f21510d.get(i13).f21516b.h(i10, i11) * ((c) this.J0).f21525i[i13]) : Integer.MAX_VALUE;
            if (h10 < i12) {
                i12 = h10;
            }
        }
        return i12;
    }

    @Override
    public void y() {
        this.f21046p1 = true;
        super.y();
    }
}
