package p208oc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import p224pc.C8105a;
import p238qc.C8312a;
import p267t0.C8929a;

public class C7816a extends AbstractC7821f<C8105a, C8312a> {
    public C7816a(Context context) {
        super(context);
        this.f25110Y0 = true;
        this.f25111Z0 = true;
    }

    public C8312a mo14862n(C8105a.C8106a aVar) {
        return new C8312a(aVar);
    }

    @Override
    public float getMinDistance() {
        return 0.1f;
    }

    @Override
    public void onDraw(Canvas canvas) {
        m14949N();
        mo14861q(canvas);
        m14935o(canvas);
        this.f25090N0 = this.f25115b.size();
        int i = 0;
        while (true) {
            this.f25092O0 = i;
            int i2 = this.f25092O0;
            if (i2 < this.f25090N0) {
                m14933r(canvas, this.f25115b.get(i2));
                mo14883v(canvas, this.f25115b.get(this.f25092O0));
                i = this.f25092O0 + 1;
            } else {
                m14934p(canvas);
                m14932s(canvas);
                mo14859u(canvas);
                super.onDraw(canvas);
                return;
            }
        }
    }

    @Override
    public void mo14861q(Canvas canvas) {
        int i;
        if (this.f25084J0 != 0) {
            C7838l lVar = this.f25083I0;
            float f = lVar.f25218m;
            float f2 = lVar.f25217l;
            float f3 = this.f25128g1 / (f - f2);
            float horizontalPadding = (f2 * f3) - AbstractC7821f.getHorizontalPadding();
            char c = 1;
            int i2 = this.f25139m0 - 1;
            int i3 = i2 < 0 ? 0 : i2;
            int i4 = this.f25141n0 + 1;
            if (i4 > this.f25084J0.f26327d.get(0).f26332a.length - 1) {
                i4 = this.f25084J0.f26327d.get(0).f26332a.length - 1;
            }
            int i5 = i4;
            canvas.save();
            canvas.clipRect(this.f25124e1, 0, this.f25126f1, getMeasuredHeight() - this.f25127g0);
            canvas.save();
            int i6 = this.f25114a1;
            int i7 = 2;
            float f4 = 0.0f;
            if (i6 == 2) {
                this.f25082H0 = true;
                this.f25109X0 = 0.0f;
                throw null;
            } else if (i6 != 1) {
                int i8 = 0;
                while (i8 < this.f25087M.size()) {
                    C8312a aVar = (C8312a) this.f25087M.get(i8);
                    if (aVar.f26854n || aVar.f26855o != f4) {
                        float[] fArr = this.f25084J0.f26325b;
                        float f5 = fArr.length < i7 ? 1.0f : fArr[c] * f3;
                        int[] iArr = aVar.f26841a.f26332a;
                        float f6 = aVar.f26855o;
                        int i9 = 0;
                        float f7 = 0.0f;
                        float f8 = 0.0f;
                        boolean z = false;
                        for (int i10 = i3; i10 <= i5; i10++) {
                            float f9 = ((f5 / 2.0f) + (this.f25084J0.f26325b[i10] * f3)) - horizontalPadding;
                            iArr = iArr;
                            float measuredHeight = (getMeasuredHeight() - this.f25127g0) - (((iArr[i10] / this.f25129h0) * f6) * ((getMeasuredHeight() - this.f25127g0) - AbstractC7821f.getSignatureTextHeight()));
                            if (i10 != this.f25102T0 || !this.f25108W0) {
                                float[] fArr2 = aVar.f26851k;
                                int i11 = i9 + 1;
                                fArr2[i9] = f9;
                                int i12 = i11 + 1;
                                fArr2[i11] = measuredHeight;
                                int i13 = i12 + 1;
                                fArr2[i12] = f9;
                                i9 = i13 + 1;
                                fArr2[i13] = getMeasuredHeight() - this.f25127g0;
                            } else {
                                f7 = measuredHeight;
                                f8 = f9;
                                z = true;
                            }
                        }
                        Paint paint = (z || this.f25082H0) ? aVar.f26795p : aVar.f26843c;
                        paint.setStrokeWidth(f5);
                        if (aVar.m12901b()) {
                            if (z) {
                                aVar.f26795p.setColor(C8929a.m10944d(aVar.f26853m, aVar.f26796q, this.f25109X0));
                            }
                            if (this.f25082H0) {
                                aVar.f26795p.setColor(C8929a.m10944d(aVar.f26853m, aVar.f26796q, 0.0f));
                            }
                        }
                        int i14 = (int) (255.0f * 1.0f);
                        paint.setAlpha(i14);
                        canvas.drawLines(aVar.f26851k, 0, i9, paint);
                        if (z) {
                            aVar.f26843c.setStrokeWidth(f5);
                            aVar.f26843c.setAlpha(i14);
                            i = i8;
                            canvas.drawLine(f8, f7, f8, getMeasuredHeight() - this.f25127g0, aVar.f26843c);
                            aVar.f26843c.setAlpha(255);
                            i8 = i + 1;
                            c = 1;
                            i7 = 2;
                            f4 = 0.0f;
                        }
                    }
                    i = i8;
                    i8 = i + 1;
                    c = 1;
                    i7 = 2;
                    f4 = 0.0f;
                }
                canvas.restore();
                canvas.restore();
            } else {
                throw null;
            }
        }
    }

    @Override
    public void mo14860t(Canvas canvas) {
        int measuredHeight = getMeasuredHeight() - AbstractC7821f.getPickerPadding();
        int measuredHeight2 = (getMeasuredHeight() - this.f25120c1) - AbstractC7821f.getPickerPadding();
        int size = this.f25087M.size();
        if (this.f25084J0 != 0) {
            for (int i = 0; i < size; i++) {
                C8312a aVar = (C8312a) this.f25087M.get(i);
                if (aVar.f26854n || aVar.f26855o != 0.0f) {
                    aVar.f26845e.reset();
                    float[] fArr = this.f25084J0.f26325b;
                    int length = fArr.length;
                    float f = 1.0f;
                    float f2 = fArr.length < 2 ? 1.0f : fArr[1] * this.f25122d1;
                    int[] iArr = aVar.f26841a.f26332a;
                    float f3 = aVar.f26855o;
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < length) {
                        if (iArr[i2] >= 0) {
                            T t = this.f25084J0;
                            float f4 = t.f26325b[i2] * this.f25122d1;
                            float f5 = (f - ((iArr[i2] / (AbstractC7821f.f25066I1 ? this.f25086L0 : t.f26328e)) * f3)) * (measuredHeight - measuredHeight2);
                            float[] fArr2 = aVar.f26851k;
                            int i4 = i3 + 1;
                            fArr2[i3] = f4;
                            int i5 = i4 + 1;
                            fArr2[i4] = f5;
                            int i6 = i5 + 1;
                            fArr2[i5] = f4;
                            i3 = i6 + 1;
                            fArr2[i6] = getMeasuredHeight() - this.f25127g0;
                        }
                        i2++;
                        f = 1.0f;
                    }
                    aVar.f26843c.setStrokeWidth(f2 + 2.0f);
                    canvas.drawLines(aVar.f26851k, 0, i3, aVar.f26843c);
                }
            }
        }
    }

    @Override
    public void mo14859u(Canvas canvas) {
    }
}
