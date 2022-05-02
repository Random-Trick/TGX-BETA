package p208oc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import p208oc.AbstractC7821f;
import p224pc.C8105a;
import p224pc.C8109d;
import p238qc.C8321g;
import p238qc.C8322h;
import p267t0.C8929a;

public class C7850u extends AbstractC7821f<C8109d, C8322h> {
    public int[] f25271K1;

    public C7850u(Context context) {
        super(context);
        this.f25107Y0 = true;
        this.f25108Z0 = true;
    }

    @Override
    public void mo14864K(int i, int i2) {
        if (this.f25081J0 != 0) {
            float horizontalPadding = (this.f25127h1 * this.f25080I0.f25214l) - AbstractC7821f.getHorizontalPadding();
            T t = this.f25081J0;
            float f = (i + horizontalPadding) / (this.f25127h1 - (((C8109d) t).f26322b.length < 2 ? 1.0f : ((C8109d) t).f26322b[1] * this.f25127h1));
            this.f25101U0 = f;
            if (f < 0.0f) {
                this.f25099T0 = 0;
                this.f25101U0 = 0.0f;
            } else if (f > 1.0f) {
                this.f25099T0 = ((C8109d) t).f26321a.length - 1;
                this.f25101U0 = 1.0f;
            } else {
                int b = ((C8109d) t).m13592b(this.f25136m0, this.f25138n0, f);
                this.f25099T0 = b;
                int i3 = this.f25138n0;
                if (b > i3) {
                    this.f25099T0 = i3;
                }
                int i4 = this.f25099T0;
                int i5 = this.f25136m0;
                if (i4 < i5) {
                    this.f25099T0 = i5;
                }
            }
            this.f25105W0 = true;
            m14939i(true);
            m14954H(horizontalPadding);
            AbstractC7821f.AbstractC7829h hVar = this.f25145q1;
            if (hVar != null) {
                hVar.m14931a(getSelectedDate());
            }
            invalidate();
        }
    }

    public C8322h mo14862n(C8105a.C8106a aVar) {
        return new C8322h(aVar);
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
        float f;
        float f2;
        float f3;
        if (this.f25081J0 != 0) {
            C7838l lVar = this.f25080I0;
            float f4 = lVar.f25215m;
            float f5 = lVar.f25214l;
            float f6 = this.f25125g1 / (f4 - f5);
            float horizontalPadding = (f5 * f6) - AbstractC7821f.getHorizontalPadding();
            T t = this.f25081J0;
            boolean z = true;
            if (((C8109d) t).f26322b.length < 2) {
                f2 = 1.0f;
                f = 1.0f;
            } else {
                f = ((C8109d) t).f26322b[1] * f6;
                f2 = ((C8109d) t).f26322b[1] * (f6 - f);
            }
            int horizontalPadding2 = ((int) (AbstractC7821f.getHorizontalPadding() / f)) + 1;
            int max = Math.max(0, (this.f25136m0 - horizontalPadding2) - 2);
            int min = Math.min(((C8109d) this.f25081J0).f26322b.length - 1, this.f25138n0 + horizontalPadding2 + 2);
            for (int i = 0; i < this.f25084M.size(); i++) {
                ((C8321g) this.f25084M.get(i)).f26847j = 0;
            }
            canvas.save();
            int i2 = this.f25111a1;
            float f7 = 0.0f;
            if (i2 == 2) {
                this.f25079H0 = true;
                this.f25106X0 = 0.0f;
                throw null;
            } else if (i2 == 1) {
                throw null;
            } else if (i2 != 3) {
                if (this.f25099T0 < 0 || !this.f25105W0) {
                    z = false;
                }
                while (true) {
                    float f8 = 2.0f;
                    if (max > min) {
                        break;
                    }
                    if (this.f25099T0 != max || !z) {
                        int i3 = 0;
                        float f9 = 0.0f;
                        while (i3 < this.f25084M.size()) {
                            C8321g gVar = (C8321g) this.f25084M.get(i3);
                            if (gVar.f26851n || gVar.f26852o != f7) {
                                int[] iArr = gVar.f26838a.f26329a;
                                float f10 = ((f / f8) + (((C8109d) this.f25081J0).f26322b[max] * (f6 - f))) - horizontalPadding;
                                float measuredHeight = (iArr[max] / this.f25126h0) * ((getMeasuredHeight() - this.f25124g0) - AbstractC7821f.getSignatureTextHeight()) * gVar.f26852o;
                                float[] fArr = gVar.f26848k;
                                int i4 = gVar.f26847j;
                                int i5 = i4 + 1;
                                gVar.f26847j = i5;
                                fArr[i4] = f10;
                                int i6 = i5 + 1;
                                gVar.f26847j = i6;
                                fArr[i5] = ((getMeasuredHeight() - this.f25124g0) - measuredHeight) - f9;
                                int i7 = i6 + 1;
                                gVar.f26847j = i7;
                                fArr[i6] = f10;
                                gVar.f26847j = i7 + 1;
                                fArr[i7] = (getMeasuredHeight() - this.f25124g0) - f9;
                                f9 += measuredHeight;
                            }
                            i3++;
                            f8 = 2.0f;
                            f7 = 0.0f;
                        }
                    }
                    max++;
                    f7 = 0.0f;
                }
                for (int i8 = 0; i8 < this.f25084M.size(); i8++) {
                    C8322h hVar = (C8322h) this.f25084M.get(i8);
                    Paint paint = (z || this.f25079H0) ? hVar.f26853p : hVar.f26840c;
                    if (hVar.m12883b()) {
                        if (z) {
                            hVar.f26853p.setColor(C8929a.m10945d(hVar.f26850m, hVar.f26854q, this.f25106X0));
                        }
                        if (this.f25079H0) {
                            f3 = 1.0f;
                            hVar.f26853p.setColor(C8929a.m10945d(hVar.f26850m, hVar.f26854q, 1.0f));
                            paint.setAlpha((int) (255.0f * f3));
                            paint.setStrokeWidth(f2);
                            canvas.drawLines(hVar.f26848k, 0, hVar.f26847j, paint);
                        }
                    }
                    f3 = 1.0f;
                    paint.setAlpha((int) (255.0f * f3));
                    paint.setStrokeWidth(f2);
                    canvas.drawLines(hVar.f26848k, 0, hVar.f26847j, paint);
                }
                if (z) {
                    float f11 = 0.0f;
                    for (int i9 = 0; i9 < this.f25084M.size(); i9++) {
                        C8321g gVar2 = (C8321g) this.f25084M.get(i9);
                        if (gVar2.f26851n || gVar2.f26852o != 0.0f) {
                            int[] iArr2 = gVar2.f26838a.f26329a;
                            float[] fArr2 = ((C8109d) this.f25081J0).f26322b;
                            int i10 = this.f25099T0;
                            float f12 = ((f / 2.0f) + (fArr2[i10] * (f6 - f))) - horizontalPadding;
                            float measuredHeight2 = (iArr2[i10] / this.f25126h0) * ((getMeasuredHeight() - this.f25124g0) - AbstractC7821f.getSignatureTextHeight()) * gVar2.f26852o;
                            gVar2.f26840c.setStrokeWidth(f2);
                            gVar2.f26840c.setAlpha((int) (1.0f * 255.0f));
                            canvas.drawLine(f12, ((getMeasuredHeight() - this.f25124g0) - measuredHeight2) - f11, f12, (getMeasuredHeight() - this.f25124g0) - f11, gVar2.f26840c);
                            f11 += measuredHeight2;
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
    public void mo14860t(Canvas canvas) {
        float f;
        T t = this.f25081J0;
        if (t != 0) {
            int length = ((C8109d) t).f26322b.length;
            int size = this.f25084M.size();
            for (int i = 0; i < this.f25084M.size(); i++) {
                ((C8321g) this.f25084M.get(i)).f26847j = 0;
            }
            int max = Math.max(1, Math.round(length / 200.0f));
            int[] iArr = this.f25271K1;
            if (iArr == null || iArr.length < size) {
                this.f25271K1 = new int[size];
            }
            for (int i2 = 0; i2 < length; i2++) {
                float f2 = ((C8109d) this.f25081J0).f26322b[i2] * this.f25119d1;
                int i3 = 0;
                while (true) {
                    f = 0.0f;
                    if (i3 >= size) {
                        break;
                    }
                    C8321g gVar = (C8321g) this.f25084M.get(i3);
                    if (gVar.f26851n || gVar.f26852o != 0.0f) {
                        int i4 = gVar.f26838a.f26329a[i2];
                        int[] iArr2 = this.f25271K1;
                        if (i4 > iArr2[i3]) {
                            iArr2[i3] = i4;
                        }
                    }
                    i3++;
                }
                if (i2 % max == 0) {
                    int i5 = 0;
                    float f3 = 0.0f;
                    while (i5 < size) {
                        C8321g gVar2 = (C8321g) this.f25084M.get(i5);
                        if (gVar2.f26851n || gVar2.f26852o != f) {
                            float f4 = AbstractC7821f.f25063I1 ? this.f25083L0 : ((C8109d) this.f25081J0).f26325e;
                            int[] iArr3 = this.f25271K1;
                            float f5 = (iArr3[i5] / f4) * gVar2.f26852o;
                            int i6 = this.f25117c1;
                            float f6 = f5 * i6;
                            float[] fArr = gVar2.f26848k;
                            int i7 = gVar2.f26847j;
                            int i8 = i7 + 1;
                            gVar2.f26847j = i8;
                            fArr[i7] = f2;
                            int i9 = i8 + 1;
                            gVar2.f26847j = i9;
                            fArr[i8] = (i6 - f6) - f3;
                            int i10 = i9 + 1;
                            gVar2.f26847j = i10;
                            fArr[i9] = f2;
                            gVar2.f26847j = i10 + 1;
                            fArr[i10] = i6 - f3;
                            f3 += f6;
                            iArr3[i5] = 0;
                        }
                        i5++;
                        f = 0.0f;
                    }
                }
            }
            T t2 = this.f25081J0;
            float f7 = ((C8109d) t2).f26322b.length < 2 ? 1.0f : ((C8109d) t2).f26322b[1] * this.f25119d1;
            for (int i11 = 0; i11 < size; i11++) {
                C8321g gVar3 = (C8321g) this.f25084M.get(i11);
                gVar3.f26840c.setStrokeWidth(max * f7);
                gVar3.f26840c.setAlpha(255);
                canvas.drawLines(gVar3.f26848k, 0, gVar3.f26847j, gVar3.f26840c);
            }
        }
    }

    @Override
    public void mo14859u(Canvas canvas) {
    }

    @Override
    public int mo14858w(int i, int i2) {
        return ((C8109d) this.f25081J0).m13588f(i, i2);
    }

    @Override
    public void mo14857z() {
        super.mo14857z();
        this.f25083L0 = 0.0f;
        int length = ((C8109d) this.f25081J0).f26321a.length;
        int size = this.f25084M.size();
        for (int i = 0; i < length; i++) {
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C8322h hVar = (C8322h) this.f25084M.get(i3);
                if (hVar.f26851n) {
                    i2 += hVar.f26838a.f26329a[i];
                }
            }
            float f = i2;
            if (f > this.f25083L0) {
                this.f25083L0 = f;
            }
        }
    }
}
