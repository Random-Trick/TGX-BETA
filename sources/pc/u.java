package pc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import pc.f;
import qc.a;
import qc.d;
import rc.g;
import rc.h;

public class u extends f<d, h> {
    public int[] K1;

    public u(Context context) {
        super(context);
        this.Y0 = true;
        this.Z0 = true;
    }

    @Override
    public void K(int i10, int i11) {
        if (this.J0 != 0) {
            float horizontalPadding = (this.f21030h1 * this.I0.f21115l) - f.getHorizontalPadding();
            T t10 = this.J0;
            float f10 = (i10 + horizontalPadding) / (this.f21030h1 - (((d) t10).f21508b.length < 2 ? 1.0f : ((d) t10).f21508b[1] * this.f21030h1));
            this.U0 = f10;
            if (f10 < 0.0f) {
                this.T0 = 0;
                this.U0 = 0.0f;
            } else if (f10 > 1.0f) {
                this.T0 = ((d) t10).f21507a.length - 1;
                this.U0 = 1.0f;
            } else {
                int b10 = ((d) t10).b(this.f21039m0, this.f21041n0, f10);
                this.T0 = b10;
                int i12 = this.f21041n0;
                if (b10 > i12) {
                    this.T0 = i12;
                }
                int i13 = this.T0;
                int i14 = this.f21039m0;
                if (i13 < i14) {
                    this.T0 = i14;
                }
            }
            this.W0 = true;
            i(true);
            H(horizontalPadding);
            f.h hVar = this.f21048q1;
            if (hVar != null) {
                hVar.a(getSelectedDate());
            }
            invalidate();
        }
    }

    public h n(a.C0200a aVar) {
        return new h(aVar);
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
        float f10;
        float f11;
        float f12;
        if (this.J0 != 0) {
            l lVar = this.I0;
            float f13 = lVar.f21116m;
            float f14 = lVar.f21115l;
            float f15 = this.f21028g1 / (f13 - f14);
            float horizontalPadding = (f14 * f15) - f.getHorizontalPadding();
            T t10 = this.J0;
            boolean z10 = true;
            if (((d) t10).f21508b.length < 2) {
                f11 = 1.0f;
                f10 = 1.0f;
            } else {
                f10 = ((d) t10).f21508b[1] * f15;
                f11 = ((d) t10).f21508b[1] * (f15 - f10);
            }
            int horizontalPadding2 = ((int) (f.getHorizontalPadding() / f10)) + 1;
            int max = Math.max(0, (this.f21039m0 - horizontalPadding2) - 2);
            int min = Math.min(((d) this.J0).f21508b.length - 1, this.f21041n0 + horizontalPadding2 + 2);
            for (int i10 = 0; i10 < this.M.size(); i10++) {
                ((g) this.M.get(i10)).f21861j = 0;
            }
            canvas.save();
            int i11 = this.f21014a1;
            float f16 = 0.0f;
            if (i11 == 2) {
                this.H0 = true;
                this.X0 = 0.0f;
                throw null;
            } else if (i11 == 1) {
                throw null;
            } else if (i11 != 3) {
                if (this.T0 < 0 || !this.W0) {
                    z10 = false;
                }
                while (true) {
                    float f17 = 2.0f;
                    if (max > min) {
                        break;
                    }
                    if (this.T0 != max || !z10) {
                        int i12 = 0;
                        float f18 = 0.0f;
                        while (i12 < this.M.size()) {
                            g gVar = (g) this.M.get(i12);
                            if (gVar.f21865n || gVar.f21866o != f16) {
                                int[] iArr = gVar.f21852a.f21515a;
                                float f19 = ((f10 / f17) + (((d) this.J0).f21508b[max] * (f15 - f10))) - horizontalPadding;
                                float measuredHeight = (iArr[max] / this.f21029h0) * ((getMeasuredHeight() - this.f21027g0) - f.getSignatureTextHeight()) * gVar.f21866o;
                                float[] fArr = gVar.f21862k;
                                int i13 = gVar.f21861j;
                                int i14 = i13 + 1;
                                gVar.f21861j = i14;
                                fArr[i13] = f19;
                                int i15 = i14 + 1;
                                gVar.f21861j = i15;
                                fArr[i14] = ((getMeasuredHeight() - this.f21027g0) - measuredHeight) - f18;
                                int i16 = i15 + 1;
                                gVar.f21861j = i16;
                                fArr[i15] = f19;
                                gVar.f21861j = i16 + 1;
                                fArr[i16] = (getMeasuredHeight() - this.f21027g0) - f18;
                                f18 += measuredHeight;
                            }
                            i12++;
                            f17 = 2.0f;
                            f16 = 0.0f;
                        }
                    }
                    max++;
                    f16 = 0.0f;
                }
                for (int i17 = 0; i17 < this.M.size(); i17++) {
                    h hVar = (h) this.M.get(i17);
                    Paint paint = (z10 || this.H0) ? hVar.f21867p : hVar.f21854c;
                    if (hVar.b()) {
                        if (z10) {
                            hVar.f21867p.setColor(t0.a.d(hVar.f21864m, hVar.f21868q, this.X0));
                        }
                        if (this.H0) {
                            f12 = 1.0f;
                            hVar.f21867p.setColor(t0.a.d(hVar.f21864m, hVar.f21868q, 1.0f));
                            paint.setAlpha((int) (255.0f * f12));
                            paint.setStrokeWidth(f11);
                            canvas.drawLines(hVar.f21862k, 0, hVar.f21861j, paint);
                        }
                    }
                    f12 = 1.0f;
                    paint.setAlpha((int) (255.0f * f12));
                    paint.setStrokeWidth(f11);
                    canvas.drawLines(hVar.f21862k, 0, hVar.f21861j, paint);
                }
                if (z10) {
                    float f20 = 0.0f;
                    for (int i18 = 0; i18 < this.M.size(); i18++) {
                        g gVar2 = (g) this.M.get(i18);
                        if (gVar2.f21865n || gVar2.f21866o != 0.0f) {
                            int[] iArr2 = gVar2.f21852a.f21515a;
                            float[] fArr2 = ((d) this.J0).f21508b;
                            int i19 = this.T0;
                            float f21 = ((f10 / 2.0f) + (fArr2[i19] * (f15 - f10))) - horizontalPadding;
                            float measuredHeight2 = (iArr2[i19] / this.f21029h0) * ((getMeasuredHeight() - this.f21027g0) - f.getSignatureTextHeight()) * gVar2.f21866o;
                            gVar2.f21854c.setStrokeWidth(f11);
                            gVar2.f21854c.setAlpha((int) (1.0f * 255.0f));
                            canvas.drawLine(f21, ((getMeasuredHeight() - this.f21027g0) - measuredHeight2) - f20, f21, (getMeasuredHeight() - this.f21027g0) - f20, gVar2.f21854c);
                            f20 += measuredHeight2;
                        }
                    }
                }
                canvas.restore();
            } else {
                throw null;
            }
        }
    }

    @Override
    public void t(Canvas canvas) {
        float f10;
        T t10 = this.J0;
        if (t10 != 0) {
            int length = ((d) t10).f21508b.length;
            int size = this.M.size();
            for (int i10 = 0; i10 < this.M.size(); i10++) {
                ((g) this.M.get(i10)).f21861j = 0;
            }
            int max = Math.max(1, Math.round(length / 200.0f));
            int[] iArr = this.K1;
            if (iArr == null || iArr.length < size) {
                this.K1 = new int[size];
            }
            for (int i11 = 0; i11 < length; i11++) {
                float f11 = ((d) this.J0).f21508b[i11] * this.f21022d1;
                int i12 = 0;
                while (true) {
                    f10 = 0.0f;
                    if (i12 >= size) {
                        break;
                    }
                    g gVar = (g) this.M.get(i12);
                    if (gVar.f21865n || gVar.f21866o != 0.0f) {
                        int i13 = gVar.f21852a.f21515a[i11];
                        int[] iArr2 = this.K1;
                        if (i13 > iArr2[i12]) {
                            iArr2[i12] = i13;
                        }
                    }
                    i12++;
                }
                if (i11 % max == 0) {
                    int i14 = 0;
                    float f12 = 0.0f;
                    while (i14 < size) {
                        g gVar2 = (g) this.M.get(i14);
                        if (gVar2.f21865n || gVar2.f21866o != f10) {
                            float f13 = f.I1 ? this.L0 : ((d) this.J0).f21511e;
                            int[] iArr3 = this.K1;
                            float f14 = (iArr3[i14] / f13) * gVar2.f21866o;
                            int i15 = this.f21020c1;
                            float f15 = f14 * i15;
                            float[] fArr = gVar2.f21862k;
                            int i16 = gVar2.f21861j;
                            int i17 = i16 + 1;
                            gVar2.f21861j = i17;
                            fArr[i16] = f11;
                            int i18 = i17 + 1;
                            gVar2.f21861j = i18;
                            fArr[i17] = (i15 - f15) - f12;
                            int i19 = i18 + 1;
                            gVar2.f21861j = i19;
                            fArr[i18] = f11;
                            gVar2.f21861j = i19 + 1;
                            fArr[i19] = i15 - f12;
                            f12 += f15;
                            iArr3[i14] = 0;
                        }
                        i14++;
                        f10 = 0.0f;
                    }
                }
            }
            T t11 = this.J0;
            float f16 = ((d) t11).f21508b.length < 2 ? 1.0f : ((d) t11).f21508b[1] * this.f21022d1;
            for (int i20 = 0; i20 < size; i20++) {
                g gVar3 = (g) this.M.get(i20);
                gVar3.f21854c.setStrokeWidth(max * f16);
                gVar3.f21854c.setAlpha(255);
                canvas.drawLines(gVar3.f21862k, 0, gVar3.f21861j, gVar3.f21854c);
            }
        }
    }

    @Override
    public void u(Canvas canvas) {
    }

    @Override
    public int w(int i10, int i11) {
        return ((d) this.J0).f(i10, i11);
    }

    @Override
    public void z() {
        super.z();
        this.L0 = 0.0f;
        int length = ((d) this.J0).f21507a.length;
        int size = this.M.size();
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                h hVar = (h) this.M.get(i12);
                if (hVar.f21865n) {
                    i11 += hVar.f21852a.f21515a[i10];
                }
            }
            float f10 = i11;
            if (f10 > this.L0) {
                this.L0 = f10;
            }
        }
    }
}
