package p208oc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import p224pc.C8105a;
import p224pc.C8108c;
import p238qc.C8316e;
import p238qc.C8321g;

public class C7843o extends AbstractC7821f<C8108c, C8321g> {
    public C7843o(Context context) {
        super(context);
    }

    @Override
    public C8316e mo14884l(int i, int i2) {
        T t = this.f25081J0;
        float f = 1.0f;
        if (((C8108c) t).f26339i.length >= 2) {
            char c = 0;
            if (((C8108c) t).f26339i[0] == 1.0f) {
                c = 1;
            }
            f = ((C8108c) t).f26339i[c];
        }
        return new C8316e(i, i2, this.f25143p1, f);
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
            canvas.save();
            int i = this.f25111a1;
            int i2 = 2;
            if (i != 2) {
                int i3 = 1;
                if (i == 1) {
                    throw null;
                } else if (i != 3) {
                    int i4 = 0;
                    int i5 = 0;
                    while (i5 < this.f25084M.size()) {
                        C8321g gVar = (C8321g) this.f25084M.get(i5);
                        if (gVar.f26851n || gVar.f26852o != 0.0f) {
                            int[] iArr = gVar.f26838a.f26329a;
                            gVar.f26843f.reset();
                            T t = this.f25081J0;
                            int horizontalPadding2 = ((int) (AbstractC7821f.getHorizontalPadding() / (((C8108c) t).f26322b.length < i2 ? 1.0f : ((C8108c) t).f26322b[i3] * f5))) + i3;
                            int max = Math.max(i4, this.f25136m0 - horizontalPadding2);
                            int min = Math.min(((C8108c) this.f25081J0).f26322b.length - i3, this.f25138n0 + horizontalPadding2);
                            boolean z = true;
                            int i6 = 0;
                            while (max <= min) {
                                if (iArr[max] < 0) {
                                    f2 = f5;
                                } else {
                                    T t2 = this.f25081J0;
                                    float f6 = (((C8108c) t2).f26322b[max] * f5) - horizontalPadding;
                                    float f7 = iArr[max] * ((C8108c) t2).f26339i[i5];
                                    float f8 = this.f25128i0;
                                    float f9 = (f7 - f8) / (this.f25126h0 - f8);
                                    float strokeWidth = gVar.f26840c.getStrokeWidth() / 2.0f;
                                    f2 = f5;
                                    float measuredHeight = ((getMeasuredHeight() - this.f25124g0) - strokeWidth) - (f9 * (((getMeasuredHeight() - this.f25124g0) - AbstractC7821f.getSignatureTextHeight()) - strokeWidth));
                                    if (AbstractC7821f.f25062H1) {
                                        if (i6 == 0) {
                                            float[] fArr = gVar.f26848k;
                                            int i7 = i6 + 1;
                                            fArr[i6] = f6;
                                            i6 = i7 + 1;
                                            fArr[i7] = measuredHeight;
                                        } else {
                                            float[] fArr2 = gVar.f26848k;
                                            int i8 = i6 + 1;
                                            fArr2[i6] = f6;
                                            int i9 = i8 + 1;
                                            fArr2[i8] = measuredHeight;
                                            int i10 = i9 + 1;
                                            fArr2[i9] = f6;
                                            i6 = i10 + 1;
                                            fArr2[i10] = measuredHeight;
                                        }
                                    } else if (z) {
                                        gVar.f26843f.moveTo(f6, measuredHeight);
                                        z = false;
                                    } else {
                                        gVar.f26843f.lineTo(f6, measuredHeight);
                                    }
                                }
                                max++;
                                f5 = f2;
                            }
                            f = f5;
                            if (this.f25138n0 - this.f25136m0 > 100) {
                                gVar.f26840c.setStrokeCap(Paint.Cap.SQUARE);
                            } else {
                                gVar.f26840c.setStrokeCap(Paint.Cap.ROUND);
                            }
                            gVar.f26840c.setAlpha((int) (gVar.f26852o * 255.0f * 1.0f));
                            if (!AbstractC7821f.f25062H1) {
                                canvas.drawPath(gVar.f26843f, gVar.f26840c);
                            } else {
                                canvas.drawLines(gVar.f26848k, 0, i6, gVar.f26840c);
                                i5++;
                                f5 = f;
                                i4 = 0;
                                i2 = 2;
                                i3 = 1;
                            }
                        } else {
                            f = f5;
                        }
                        i5++;
                        f5 = f;
                        i4 = 0;
                        i2 = 2;
                        i3 = 1;
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
    public void mo14860t(Canvas canvas) {
        int measuredHeight = getMeasuredHeight() - AbstractC7821f.getPickerPadding();
        int measuredHeight2 = (getMeasuredHeight() - this.f25117c1) - AbstractC7821f.getPickerPadding();
        int size = this.f25084M.size();
        if (this.f25081J0 != 0) {
            for (int i = 0; i < size; i++) {
                C8321g gVar = (C8321g) this.f25084M.get(i);
                if (gVar.f26851n || gVar.f26852o != 0.0f) {
                    gVar.f26842e.reset();
                    int length = ((C8108c) this.f25081J0).f26322b.length;
                    int[] iArr = gVar.f26838a.f26329a;
                    gVar.f26843f.reset();
                    int i2 = 0;
                    for (int i3 = 0; i3 < length; i3++) {
                        if (iArr[i3] >= 0) {
                            T t = this.f25081J0;
                            float f = ((C8108c) t).f26322b[i3] * this.f25119d1;
                            float f2 = (1.0f - ((iArr[i3] * ((C8108c) t).f26339i[i]) / (AbstractC7821f.f25063I1 ? this.f25083L0 : ((C8108c) t).f26325e))) * (measuredHeight - measuredHeight2);
                            if (AbstractC7821f.f25062H1) {
                                if (i2 == 0) {
                                    float[] fArr = gVar.f26849l;
                                    int i4 = i2 + 1;
                                    fArr[i2] = f;
                                    i2 = i4 + 1;
                                    fArr[i4] = f2;
                                } else {
                                    float[] fArr2 = gVar.f26849l;
                                    int i5 = i2 + 1;
                                    fArr2[i2] = f;
                                    int i6 = i5 + 1;
                                    fArr2[i5] = f2;
                                    int i7 = i6 + 1;
                                    fArr2[i6] = f;
                                    i2 = i7 + 1;
                                    fArr2[i7] = f2;
                                }
                            } else if (i3 == 0) {
                                gVar.f26842e.moveTo(f, f2);
                            } else {
                                gVar.f26842e.lineTo(f, f2);
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
    public void mo14859u(Canvas canvas) {
        if (this.f25099T0 >= 0 && this.f25105W0) {
            C7838l lVar = this.f25080I0;
            float f = lVar.f25215m;
            float f2 = lVar.f25214l;
            float f3 = this.f25125g1 / (f - f2);
            float horizontalPadding = (((C8108c) this.f25081J0).f26322b[this.f25099T0] * f3) - ((f2 * f3) - AbstractC7821f.getHorizontalPadding());
            this.f25148s0.setAlpha((int) (this.f25122f0 * this.f25106X0));
            canvas.drawLine(horizontalPadding, 0.0f, horizontalPadding, this.f25129i1.bottom, this.f25148s0);
            this.f25087N0 = this.f25084M.size();
            int i = 0;
            while (true) {
                this.f25089O0 = i;
                int i2 = this.f25089O0;
                if (i2 < this.f25087N0) {
                    C8321g gVar = (C8321g) this.f25084M.get(i2);
                    if (gVar.f26851n || gVar.f26852o != 0.0f) {
                        float f4 = gVar.f26838a.f26329a[this.f25099T0] * ((C8108c) this.f25081J0).f26339i[this.f25089O0];
                        float f5 = this.f25128i0;
                        float measuredHeight = (getMeasuredHeight() - this.f25124g0) - (((f4 - f5) / (this.f25126h0 - f5)) * ((getMeasuredHeight() - this.f25124g0) - AbstractC7821f.getSignatureTextHeight()));
                        gVar.f26841d.setAlpha((int) (gVar.f26852o * 255.0f * this.f25106X0));
                        this.f25160y0.setAlpha((int) (gVar.f26852o * 255.0f * this.f25106X0));
                        canvas.drawPoint(horizontalPadding, measuredHeight, gVar.f26841d);
                        canvas.drawPoint(horizontalPadding, measuredHeight, this.f25160y0);
                    }
                    i = this.f25089O0 + 1;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public void mo14883v(android.graphics.Canvas r18, p238qc.C8316e r19) {
        throw new UnsupportedOperationException("Method not decompiled: p208oc.C7843o.mo14883v(android.graphics.Canvas, qc.e):void");
    }

    @Override
    public int mo14858w(int i, int i2) {
        if (this.f25084M.isEmpty()) {
            return 0;
        }
        int size = this.f25084M.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            int f = ((C8321g) this.f25084M.get(i4)).f26851n ? (int) (((C8108c) this.f25081J0).f26324d.get(i4).f26330b.m14869f(i, i2) * ((C8108c) this.f25081J0).f26339i[i4]) : 0;
            if (f > i3) {
                i3 = f;
            }
        }
        return i3;
    }

    @Override
    public int mo14882x(int i, int i2) {
        if (this.f25084M.isEmpty()) {
            return 0;
        }
        int size = this.f25084M.size();
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < size; i4++) {
            int h = ((C8321g) this.f25084M.get(i4)).f26851n ? (int) (((C8108c) this.f25081J0).f26324d.get(i4).f26330b.m14867h(i, i2) * ((C8108c) this.f25081J0).f26339i[i4]) : Integer.MAX_VALUE;
            if (h < i3) {
                i3 = h;
            }
        }
        return i3;
    }

    @Override
    public void mo14876y() {
        this.f25143p1 = true;
        super.mo14876y();
    }
}
