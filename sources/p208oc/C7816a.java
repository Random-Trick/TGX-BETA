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
        this.f25107Y0 = true;
        this.f25108Z0 = true;
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
        this.f25087N0 = this.f25112b.size();
        int i = 0;
        while (true) {
            this.f25089O0 = i;
            int i2 = this.f25089O0;
            if (i2 < this.f25087N0) {
                m14933r(canvas, this.f25112b.get(i2));
                mo14883v(canvas, this.f25112b.get(this.f25089O0));
                i = this.f25089O0 + 1;
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
        if (this.f25081J0 != 0) {
            C7838l lVar = this.f25080I0;
            float f = lVar.f25215m;
            float f2 = lVar.f25214l;
            float f3 = this.f25125g1 / (f - f2);
            float horizontalPadding = (f2 * f3) - AbstractC7821f.getHorizontalPadding();
            char c = 1;
            int i2 = this.f25136m0 - 1;
            int i3 = i2 < 0 ? 0 : i2;
            int i4 = this.f25138n0 + 1;
            if (i4 > this.f25081J0.f26324d.get(0).f26329a.length - 1) {
                i4 = this.f25081J0.f26324d.get(0).f26329a.length - 1;
            }
            int i5 = i4;
            canvas.save();
            canvas.clipRect(this.f25121e1, 0, this.f25123f1, getMeasuredHeight() - this.f25124g0);
            canvas.save();
            int i6 = this.f25111a1;
            int i7 = 2;
            float f4 = 0.0f;
            if (i6 == 2) {
                this.f25079H0 = true;
                this.f25106X0 = 0.0f;
                throw null;
            } else if (i6 != 1) {
                int i8 = 0;
                while (i8 < this.f25084M.size()) {
                    C8312a aVar = (C8312a) this.f25084M.get(i8);
                    if (aVar.f26851n || aVar.f26852o != f4) {
                        float[] fArr = this.f25081J0.f26322b;
                        float f5 = fArr.length < i7 ? 1.0f : fArr[c] * f3;
                        int[] iArr = aVar.f26838a.f26329a;
                        float f6 = aVar.f26852o;
                        int i9 = 0;
                        float f7 = 0.0f;
                        float f8 = 0.0f;
                        boolean z = false;
                        for (int i10 = i3; i10 <= i5; i10++) {
                            float f9 = ((f5 / 2.0f) + (this.f25081J0.f26322b[i10] * f3)) - horizontalPadding;
                            iArr = iArr;
                            float measuredHeight = (getMeasuredHeight() - this.f25124g0) - (((iArr[i10] / this.f25126h0) * f6) * ((getMeasuredHeight() - this.f25124g0) - AbstractC7821f.getSignatureTextHeight()));
                            if (i10 != this.f25099T0 || !this.f25105W0) {
                                float[] fArr2 = aVar.f26848k;
                                int i11 = i9 + 1;
                                fArr2[i9] = f9;
                                int i12 = i11 + 1;
                                fArr2[i11] = measuredHeight;
                                int i13 = i12 + 1;
                                fArr2[i12] = f9;
                                i9 = i13 + 1;
                                fArr2[i13] = getMeasuredHeight() - this.f25124g0;
                            } else {
                                f7 = measuredHeight;
                                f8 = f9;
                                z = true;
                            }
                        }
                        Paint paint = (z || this.f25079H0) ? aVar.f26792p : aVar.f26840c;
                        paint.setStrokeWidth(f5);
                        if (aVar.m12902b()) {
                            if (z) {
                                aVar.f26792p.setColor(C8929a.m10945d(aVar.f26850m, aVar.f26793q, this.f25106X0));
                            }
                            if (this.f25079H0) {
                                aVar.f26792p.setColor(C8929a.m10945d(aVar.f26850m, aVar.f26793q, 0.0f));
                            }
                        }
                        int i14 = (int) (255.0f * 1.0f);
                        paint.setAlpha(i14);
                        canvas.drawLines(aVar.f26848k, 0, i9, paint);
                        if (z) {
                            aVar.f26840c.setStrokeWidth(f5);
                            aVar.f26840c.setAlpha(i14);
                            i = i8;
                            canvas.drawLine(f8, f7, f8, getMeasuredHeight() - this.f25124g0, aVar.f26840c);
                            aVar.f26840c.setAlpha(255);
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
        int measuredHeight2 = (getMeasuredHeight() - this.f25117c1) - AbstractC7821f.getPickerPadding();
        int size = this.f25084M.size();
        if (this.f25081J0 != 0) {
            for (int i = 0; i < size; i++) {
                C8312a aVar = (C8312a) this.f25084M.get(i);
                if (aVar.f26851n || aVar.f26852o != 0.0f) {
                    aVar.f26842e.reset();
                    float[] fArr = this.f25081J0.f26322b;
                    int length = fArr.length;
                    float f = 1.0f;
                    float f2 = fArr.length < 2 ? 1.0f : fArr[1] * this.f25119d1;
                    int[] iArr = aVar.f26838a.f26329a;
                    float f3 = aVar.f26852o;
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < length) {
                        if (iArr[i2] >= 0) {
                            T t = this.f25081J0;
                            float f4 = t.f26322b[i2] * this.f25119d1;
                            float f5 = (f - ((iArr[i2] / (AbstractC7821f.f25063I1 ? this.f25083L0 : t.f26325e)) * f3)) * (measuredHeight - measuredHeight2);
                            float[] fArr2 = aVar.f26848k;
                            int i4 = i3 + 1;
                            fArr2[i3] = f4;
                            int i5 = i4 + 1;
                            fArr2[i4] = f5;
                            int i6 = i5 + 1;
                            fArr2[i5] = f4;
                            i3 = i6 + 1;
                            fArr2[i6] = getMeasuredHeight() - this.f25124g0;
                        }
                        i2++;
                        f = 1.0f;
                    }
                    aVar.f26840c.setStrokeWidth(f2 + 2.0f);
                    canvas.drawLines(aVar.f26848k, 0, i3, aVar.f26840c);
                }
            }
        }
    }

    @Override
    public void mo14859u(Canvas canvas) {
    }
}
