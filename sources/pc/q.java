package pc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import qc.a;
import rc.g;

public class q extends f<a, g> {
    public q(Context context) {
        super(context);
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
            int i10 = 0;
            int i11 = 0;
            while (i11 < this.M.size()) {
                g gVar = (g) this.M.get(i11);
                float f15 = 0.0f;
                if (gVar.f21865n || gVar.f21866o != 0.0f) {
                    float[] fArr = this.J0.f21508b;
                    if (fArr.length >= 2) {
                        f15 = fArr[1] * f14;
                    }
                    int[] iArr = gVar.f21852a.f21515a;
                    int horizontalPadding2 = ((int) (f.getHorizontalPadding() / f15)) + 1;
                    gVar.f21857f.reset();
                    int max = Math.max(i10, this.f21039m0 - horizontalPadding2);
                    int min = Math.min(this.J0.f21508b.length - 1, this.f21041n0 + horizontalPadding2);
                    boolean z10 = true;
                    int i12 = 0;
                    while (max <= min) {
                        if (iArr[max] < 0) {
                            f11 = f14;
                        } else {
                            float f16 = (this.J0.f21508b[max] * f14) - horizontalPadding;
                            float f17 = this.f21031i0;
                            float f18 = (iArr[max] - f17) / (this.f21029h0 - f17);
                            float strokeWidth = gVar.f21854c.getStrokeWidth() / 2.0f;
                            f11 = f14;
                            float measuredHeight = ((getMeasuredHeight() - this.f21027g0) - strokeWidth) - (f18 * (((getMeasuredHeight() - this.f21027g0) - f.getSignatureTextHeight()) - strokeWidth));
                            if (f.H1) {
                                if (i12 == 0) {
                                    float[] fArr2 = gVar.f21862k;
                                    int i13 = i12 + 1;
                                    fArr2[i12] = f16;
                                    i12 = i13 + 1;
                                    fArr2[i13] = measuredHeight;
                                } else {
                                    float[] fArr3 = gVar.f21862k;
                                    int i14 = i12 + 1;
                                    fArr3[i12] = f16;
                                    int i15 = i14 + 1;
                                    fArr3[i14] = measuredHeight;
                                    int i16 = i15 + 1;
                                    fArr3[i15] = f16;
                                    i12 = i16 + 1;
                                    fArr3[i16] = measuredHeight;
                                }
                            } else if (z10) {
                                gVar.f21857f.moveTo(f16, measuredHeight);
                                z10 = false;
                            } else {
                                gVar.f21857f.lineTo(f16, measuredHeight);
                            }
                        }
                        max++;
                        f14 = f11;
                    }
                    f10 = f14;
                    canvas.save();
                    int i17 = this.f21014a1;
                    if (i17 == 2) {
                        throw null;
                    } else if (i17 == 1) {
                        throw null;
                    } else if (i17 != 3) {
                        gVar.f21854c.setAlpha((int) (gVar.f21866o * 255.0f * 1.0f));
                        if (this.f21041n0 - this.f21039m0 > 100) {
                            gVar.f21854c.setStrokeCap(Paint.Cap.SQUARE);
                        } else {
                            gVar.f21854c.setStrokeCap(Paint.Cap.ROUND);
                        }
                        if (!f.H1) {
                            canvas.drawPath(gVar.f21857f, gVar.f21854c);
                        } else {
                            canvas.drawLines(gVar.f21862k, 0, i12, gVar.f21854c);
                        }
                        canvas.restore();
                    } else {
                        throw null;
                    }
                } else {
                    f10 = f14;
                }
                i11++;
                f14 = f10;
                i10 = 0;
            }
        }
    }

    @Override
    public void t(Canvas canvas) {
        getMeasuredHeight();
        f.getPickerPadding();
        getMeasuredHeight();
        f.getPickerPadding();
        int size = this.M.size();
        if (this.J0 != 0) {
            for (int i10 = 0; i10 < size; i10++) {
                g gVar = (g) this.M.get(i10);
                if (gVar.f21865n || gVar.f21866o != 0.0f) {
                    gVar.f21856e.reset();
                    int length = this.J0.f21508b.length;
                    int[] iArr = gVar.f21852a.f21515a;
                    gVar.f21857f.reset();
                    int i11 = 0;
                    for (int i12 = 0; i12 < length; i12++) {
                        if (iArr[i12] >= 0) {
                            T t10 = this.J0;
                            float f10 = t10.f21508b[i12] * this.f21022d1;
                            boolean z10 = f.I1;
                            float f11 = z10 ? this.L0 : t10.f21511e;
                            float f12 = z10 ? this.M0 : t10.f21512f;
                            float f13 = (1.0f - ((iArr[i12] - f12) / (f11 - f12))) * this.f21020c1;
                            if (f.H1) {
                                if (i11 == 0) {
                                    float[] fArr = gVar.f21863l;
                                    int i13 = i11 + 1;
                                    fArr[i11] = f10;
                                    i11 = i13 + 1;
                                    fArr[i13] = f13;
                                } else {
                                    float[] fArr2 = gVar.f21863l;
                                    int i14 = i11 + 1;
                                    fArr2[i11] = f10;
                                    int i15 = i14 + 1;
                                    fArr2[i14] = f13;
                                    int i16 = i15 + 1;
                                    fArr2[i15] = f10;
                                    i11 = i16 + 1;
                                    fArr2[i16] = f13;
                                }
                            } else if (i12 == 0) {
                                gVar.f21856e.moveTo(f10, f13);
                            } else {
                                gVar.f21856e.lineTo(f10, f13);
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
    public void y() {
        this.f21046p1 = true;
        super.y();
    }
}
