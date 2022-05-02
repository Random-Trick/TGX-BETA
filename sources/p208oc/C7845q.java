package p208oc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import p224pc.C8105a;
import p238qc.C8321g;

public class C7845q extends AbstractC7821f<C8105a, C8321g> {
    public C7845q(Context context) {
        super(context);
    }

    @Override
    public C8321g mo14862n(C8105a.C8106a aVar) {
        return new C8321g(aVar);
    }

    @Override
    public void mo14861q(Canvas canvas) {
        float f;
        float f2;
        if (this.f25081J0 != 0) {
            C7838l lVar = this.f25080I0;
            float f3 = lVar.f25215m;
            float f4 = lVar.f25214l;
            float f5 = this.f25125g1 / (f3 - f4);
            float horizontalPadding = (f4 * f5) - AbstractC7821f.getHorizontalPadding();
            int i = 0;
            int i2 = 0;
            while (i2 < this.f25084M.size()) {
                C8321g gVar = (C8321g) this.f25084M.get(i2);
                float f6 = 0.0f;
                if (gVar.f26851n || gVar.f26852o != 0.0f) {
                    float[] fArr = this.f25081J0.f26322b;
                    if (fArr.length >= 2) {
                        f6 = fArr[1] * f5;
                    }
                    int[] iArr = gVar.f26838a.f26329a;
                    int horizontalPadding2 = ((int) (AbstractC7821f.getHorizontalPadding() / f6)) + 1;
                    gVar.f26843f.reset();
                    int max = Math.max(i, this.f25136m0 - horizontalPadding2);
                    int min = Math.min(this.f25081J0.f26322b.length - 1, this.f25138n0 + horizontalPadding2);
                    boolean z = true;
                    int i3 = 0;
                    while (max <= min) {
                        if (iArr[max] < 0) {
                            f2 = f5;
                        } else {
                            float f7 = (this.f25081J0.f26322b[max] * f5) - horizontalPadding;
                            float f8 = this.f25128i0;
                            float f9 = (iArr[max] - f8) / (this.f25126h0 - f8);
                            float strokeWidth = gVar.f26840c.getStrokeWidth() / 2.0f;
                            f2 = f5;
                            float measuredHeight = ((getMeasuredHeight() - this.f25124g0) - strokeWidth) - (f9 * (((getMeasuredHeight() - this.f25124g0) - AbstractC7821f.getSignatureTextHeight()) - strokeWidth));
                            if (AbstractC7821f.f25062H1) {
                                if (i3 == 0) {
                                    float[] fArr2 = gVar.f26848k;
                                    int i4 = i3 + 1;
                                    fArr2[i3] = f7;
                                    i3 = i4 + 1;
                                    fArr2[i4] = measuredHeight;
                                } else {
                                    float[] fArr3 = gVar.f26848k;
                                    int i5 = i3 + 1;
                                    fArr3[i3] = f7;
                                    int i6 = i5 + 1;
                                    fArr3[i5] = measuredHeight;
                                    int i7 = i6 + 1;
                                    fArr3[i6] = f7;
                                    i3 = i7 + 1;
                                    fArr3[i7] = measuredHeight;
                                }
                            } else if (z) {
                                gVar.f26843f.moveTo(f7, measuredHeight);
                                z = false;
                            } else {
                                gVar.f26843f.lineTo(f7, measuredHeight);
                            }
                        }
                        max++;
                        f5 = f2;
                    }
                    f = f5;
                    canvas.save();
                    int i8 = this.f25111a1;
                    if (i8 == 2) {
                        throw null;
                    } else if (i8 == 1) {
                        throw null;
                    } else if (i8 != 3) {
                        gVar.f26840c.setAlpha((int) (gVar.f26852o * 255.0f * 1.0f));
                        if (this.f25138n0 - this.f25136m0 > 100) {
                            gVar.f26840c.setStrokeCap(Paint.Cap.SQUARE);
                        } else {
                            gVar.f26840c.setStrokeCap(Paint.Cap.ROUND);
                        }
                        if (!AbstractC7821f.f25062H1) {
                            canvas.drawPath(gVar.f26843f, gVar.f26840c);
                        } else {
                            canvas.drawLines(gVar.f26848k, 0, i3, gVar.f26840c);
                        }
                        canvas.restore();
                    } else {
                        throw null;
                    }
                } else {
                    f = f5;
                }
                i2++;
                f5 = f;
                i = 0;
            }
        }
    }

    @Override
    public void mo14860t(Canvas canvas) {
        getMeasuredHeight();
        AbstractC7821f.getPickerPadding();
        getMeasuredHeight();
        AbstractC7821f.getPickerPadding();
        int size = this.f25084M.size();
        if (this.f25081J0 != 0) {
            for (int i = 0; i < size; i++) {
                C8321g gVar = (C8321g) this.f25084M.get(i);
                if (gVar.f26851n || gVar.f26852o != 0.0f) {
                    gVar.f26842e.reset();
                    int length = this.f25081J0.f26322b.length;
                    int[] iArr = gVar.f26838a.f26329a;
                    gVar.f26843f.reset();
                    int i2 = 0;
                    for (int i3 = 0; i3 < length; i3++) {
                        if (iArr[i3] >= 0) {
                            T t = this.f25081J0;
                            float f = t.f26322b[i3] * this.f25119d1;
                            boolean z = AbstractC7821f.f25063I1;
                            float f2 = z ? this.f25083L0 : t.f26325e;
                            float f3 = z ? this.f25085M0 : t.f26326f;
                            float f4 = (1.0f - ((iArr[i3] - f3) / (f2 - f3))) * this.f25117c1;
                            if (AbstractC7821f.f25062H1) {
                                if (i2 == 0) {
                                    float[] fArr = gVar.f26849l;
                                    int i4 = i2 + 1;
                                    fArr[i2] = f;
                                    i2 = i4 + 1;
                                    fArr[i4] = f4;
                                } else {
                                    float[] fArr2 = gVar.f26849l;
                                    int i5 = i2 + 1;
                                    fArr2[i2] = f;
                                    int i6 = i5 + 1;
                                    fArr2[i5] = f4;
                                    int i7 = i6 + 1;
                                    fArr2[i6] = f;
                                    i2 = i7 + 1;
                                    fArr2[i7] = f4;
                                }
                            } else if (i3 == 0) {
                                gVar.f26842e.moveTo(f, f4);
                            } else {
                                gVar.f26842e.lineTo(f, f4);
                            }
                        }
                    }
                    gVar.f26847j = i2;
                    if (gVar.f26851n || gVar.f26852o != 0.0f) {
                        gVar.f26839b.setAlpha((int) (gVar.f26852o * 255.0f));
                        if (AbstractC7821f.f25062H1) {
                            canvas.drawLines(gVar.f26849l, 0, gVar.f26847j, gVar.f26839b);
                        } else {
                            canvas.drawPath(gVar.f26842e, gVar.f26839b);
                        }
                    }
                }
            }
        }
    }

    @Override
    public void mo14876y() {
        this.f25143p1 = true;
        super.mo14876y();
    }
}
