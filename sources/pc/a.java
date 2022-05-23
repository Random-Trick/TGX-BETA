package pc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import qc.a;

public class a extends f<qc.a, rc.a> {
    public a(Context context) {
        super(context);
        this.Y0 = true;
        this.Z0 = true;
    }

    public rc.a n(a.C0200a aVar) {
        return new rc.a(aVar);
    }

    @Override
    public float getMinDistance() {
        return 0.1f;
    }

    @Override
    public void onDraw(Canvas canvas) {
        N();
        q(canvas);
        o(canvas);
        this.N0 = this.f21015b.size();
        int i10 = 0;
        while (true) {
            this.O0 = i10;
            int i11 = this.O0;
            if (i11 < this.N0) {
                r(canvas, this.f21015b.get(i11));
                v(canvas, this.f21015b.get(this.O0));
                i10 = this.O0 + 1;
            } else {
                p(canvas);
                s(canvas);
                u(canvas);
                super.onDraw(canvas);
                return;
            }
        }
    }

    @Override
    public void q(Canvas canvas) {
        int i10;
        if (this.J0 != 0) {
            l lVar = this.I0;
            float f10 = lVar.f21116m;
            float f11 = lVar.f21115l;
            float f12 = this.f21028g1 / (f10 - f11);
            float horizontalPadding = (f11 * f12) - f.getHorizontalPadding();
            char c10 = 1;
            int i11 = this.f21039m0 - 1;
            int i12 = i11 < 0 ? 0 : i11;
            int i13 = this.f21041n0 + 1;
            if (i13 > this.J0.f21510d.get(0).f21515a.length - 1) {
                i13 = this.J0.f21510d.get(0).f21515a.length - 1;
            }
            int i14 = i13;
            canvas.save();
            canvas.clipRect(this.f21024e1, 0, this.f21026f1, getMeasuredHeight() - this.f21027g0);
            canvas.save();
            int i15 = this.f21014a1;
            int i16 = 2;
            float f13 = 0.0f;
            if (i15 == 2) {
                this.H0 = true;
                this.X0 = 0.0f;
                throw null;
            } else if (i15 != 1) {
                int i17 = 0;
                while (i17 < this.M.size()) {
                    rc.a aVar = (rc.a) this.M.get(i17);
                    if (aVar.f21865n || aVar.f21866o != f13) {
                        float[] fArr = this.J0.f21508b;
                        float f14 = fArr.length < i16 ? 1.0f : fArr[c10] * f12;
                        int[] iArr = aVar.f21852a.f21515a;
                        float f15 = aVar.f21866o;
                        int i18 = 0;
                        float f16 = 0.0f;
                        float f17 = 0.0f;
                        boolean z10 = false;
                        for (int i19 = i12; i19 <= i14; i19++) {
                            float f18 = ((f14 / 2.0f) + (this.J0.f21508b[i19] * f12)) - horizontalPadding;
                            iArr = iArr;
                            float measuredHeight = (getMeasuredHeight() - this.f21027g0) - (((iArr[i19] / this.f21029h0) * f15) * ((getMeasuredHeight() - this.f21027g0) - f.getSignatureTextHeight()));
                            if (i19 != this.T0 || !this.W0) {
                                float[] fArr2 = aVar.f21862k;
                                int i20 = i18 + 1;
                                fArr2[i18] = f18;
                                int i21 = i20 + 1;
                                fArr2[i20] = measuredHeight;
                                int i22 = i21 + 1;
                                fArr2[i21] = f18;
                                i18 = i22 + 1;
                                fArr2[i22] = getMeasuredHeight() - this.f21027g0;
                            } else {
                                f16 = measuredHeight;
                                f17 = f18;
                                z10 = true;
                            }
                        }
                        Paint paint = (z10 || this.H0) ? aVar.f21822p : aVar.f21854c;
                        paint.setStrokeWidth(f14);
                        if (aVar.b()) {
                            if (z10) {
                                aVar.f21822p.setColor(t0.a.d(aVar.f21864m, aVar.f21823q, this.X0));
                            }
                            if (this.H0) {
                                aVar.f21822p.setColor(t0.a.d(aVar.f21864m, aVar.f21823q, 0.0f));
                            }
                        }
                        int i23 = (int) (255.0f * 1.0f);
                        paint.setAlpha(i23);
                        canvas.drawLines(aVar.f21862k, 0, i18, paint);
                        if (z10) {
                            aVar.f21854c.setStrokeWidth(f14);
                            aVar.f21854c.setAlpha(i23);
                            i10 = i17;
                            canvas.drawLine(f17, f16, f17, getMeasuredHeight() - this.f21027g0, aVar.f21854c);
                            aVar.f21854c.setAlpha(255);
                            i17 = i10 + 1;
                            c10 = 1;
                            i16 = 2;
                            f13 = 0.0f;
                        }
                    }
                    i10 = i17;
                    i17 = i10 + 1;
                    c10 = 1;
                    i16 = 2;
                    f13 = 0.0f;
                }
                canvas.restore();
                canvas.restore();
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
                rc.a aVar = (rc.a) this.M.get(i10);
                if (aVar.f21865n || aVar.f21866o != 0.0f) {
                    aVar.f21856e.reset();
                    float[] fArr = this.J0.f21508b;
                    int length = fArr.length;
                    float f10 = 1.0f;
                    float f11 = fArr.length < 2 ? 1.0f : fArr[1] * this.f21022d1;
                    int[] iArr = aVar.f21852a.f21515a;
                    float f12 = aVar.f21866o;
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < length) {
                        if (iArr[i11] >= 0) {
                            T t10 = this.J0;
                            float f13 = t10.f21508b[i11] * this.f21022d1;
                            float f14 = (f10 - ((iArr[i11] / (f.I1 ? this.L0 : t10.f21511e)) * f12)) * (measuredHeight - measuredHeight2);
                            float[] fArr2 = aVar.f21862k;
                            int i13 = i12 + 1;
                            fArr2[i12] = f13;
                            int i14 = i13 + 1;
                            fArr2[i13] = f14;
                            int i15 = i14 + 1;
                            fArr2[i14] = f13;
                            i12 = i15 + 1;
                            fArr2[i15] = getMeasuredHeight() - this.f21027g0;
                        }
                        i11++;
                        f10 = 1.0f;
                    }
                    aVar.f21854c.setStrokeWidth(f11 + 2.0f);
                    canvas.drawLines(aVar.f21862k, 0, i12, aVar.f21854c);
                }
            }
        }
    }

    @Override
    public void u(Canvas canvas) {
    }
}
