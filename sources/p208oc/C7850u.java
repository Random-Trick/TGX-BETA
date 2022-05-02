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
    public int[] f25274K1;

    public C7850u(Context context) {
        super(context);
        this.f25110Y0 = true;
        this.f25111Z0 = true;
    }

    @Override
    public void mo14864K(int i, int i2) {
        if (this.f25084J0 != 0) {
            float horizontalPadding = (this.f25130h1 * this.f25083I0.f25217l) - AbstractC7821f.getHorizontalPadding();
            T t = this.f25084J0;
            float f = (i + horizontalPadding) / (this.f25130h1 - (((C8109d) t).f26325b.length < 2 ? 1.0f : ((C8109d) t).f26325b[1] * this.f25130h1));
            this.f25104U0 = f;
            if (f < 0.0f) {
                this.f25102T0 = 0;
                this.f25104U0 = 0.0f;
            } else if (f > 1.0f) {
                this.f25102T0 = ((C8109d) t).f26324a.length - 1;
                this.f25104U0 = 1.0f;
            } else {
                int b = ((C8109d) t).m13591b(this.f25139m0, this.f25141n0, f);
                this.f25102T0 = b;
                int i3 = this.f25141n0;
                if (b > i3) {
                    this.f25102T0 = i3;
                }
                int i4 = this.f25102T0;
                int i5 = this.f25139m0;
                if (i4 < i5) {
                    this.f25102T0 = i5;
                }
            }
            this.f25108W0 = true;
            m14939i(true);
            m14954H(horizontalPadding);
            AbstractC7821f.AbstractC7829h hVar = this.f25148q1;
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
        float f;
        float f2;
        float f3;
        if (this.f25084J0 != 0) {
            C7838l lVar = this.f25083I0;
            float f4 = lVar.f25218m;
            float f5 = lVar.f25217l;
            float f6 = this.f25128g1 / (f4 - f5);
            float horizontalPadding = (f5 * f6) - AbstractC7821f.getHorizontalPadding();
            T t = this.f25084J0;
            boolean z = true;
            if (((C8109d) t).f26325b.length < 2) {
                f2 = 1.0f;
                f = 1.0f;
            } else {
                f = ((C8109d) t).f26325b[1] * f6;
                f2 = ((C8109d) t).f26325b[1] * (f6 - f);
            }
            int horizontalPadding2 = ((int) (AbstractC7821f.getHorizontalPadding() / f)) + 1;
            int max = Math.max(0, (this.f25139m0 - horizontalPadding2) - 2);
            int min = Math.min(((C8109d) this.f25084J0).f26325b.length - 1, this.f25141n0 + horizontalPadding2 + 2);
            for (int i = 0; i < this.f25087M.size(); i++) {
                ((C8321g) this.f25087M.get(i)).f26850j = 0;
            }
            canvas.save();
            int i2 = this.f25114a1;
            float f7 = 0.0f;
            if (i2 == 2) {
                this.f25082H0 = true;
                this.f25109X0 = 0.0f;
                throw null;
            } else if (i2 == 1) {
                throw null;
            } else if (i2 != 3) {
                if (this.f25102T0 < 0 || !this.f25108W0) {
                    z = false;
                }
                while (true) {
                    float f8 = 2.0f;
                    if (max > min) {
                        break;
                    }
                    if (this.f25102T0 != max || !z) {
                        int i3 = 0;
                        float f9 = 0.0f;
                        while (i3 < this.f25087M.size()) {
                            C8321g gVar = (C8321g) this.f25087M.get(i3);
                            if (gVar.f26854n || gVar.f26855o != f7) {
                                int[] iArr = gVar.f26841a.f26332a;
                                float f10 = ((f / f8) + (((C8109d) this.f25084J0).f26325b[max] * (f6 - f))) - horizontalPadding;
                                float measuredHeight = (iArr[max] / this.f25129h0) * ((getMeasuredHeight() - this.f25127g0) - AbstractC7821f.getSignatureTextHeight()) * gVar.f26855o;
                                float[] fArr = gVar.f26851k;
                                int i4 = gVar.f26850j;
                                int i5 = i4 + 1;
                                gVar.f26850j = i5;
                                fArr[i4] = f10;
                                int i6 = i5 + 1;
                                gVar.f26850j = i6;
                                fArr[i5] = ((getMeasuredHeight() - this.f25127g0) - measuredHeight) - f9;
                                int i7 = i6 + 1;
                                gVar.f26850j = i7;
                                fArr[i6] = f10;
                                gVar.f26850j = i7 + 1;
                                fArr[i7] = (getMeasuredHeight() - this.f25127g0) - f9;
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
                for (int i8 = 0; i8 < this.f25087M.size(); i8++) {
                    C8322h hVar = (C8322h) this.f25087M.get(i8);
                    Paint paint = (z || this.f25082H0) ? hVar.f26856p : hVar.f26843c;
                    if (hVar.m12882b()) {
                        if (z) {
                            hVar.f26856p.setColor(C8929a.m10944d(hVar.f26853m, hVar.f26857q, this.f25109X0));
                        }
                        if (this.f25082H0) {
                            f3 = 1.0f;
                            hVar.f26856p.setColor(C8929a.m10944d(hVar.f26853m, hVar.f26857q, 1.0f));
                            paint.setAlpha((int) (255.0f * f3));
                            paint.setStrokeWidth(f2);
                            canvas.drawLines(hVar.f26851k, 0, hVar.f26850j, paint);
                        }
                    }
                    f3 = 1.0f;
                    paint.setAlpha((int) (255.0f * f3));
                    paint.setStrokeWidth(f2);
                    canvas.drawLines(hVar.f26851k, 0, hVar.f26850j, paint);
                }
                if (z) {
                    float f11 = 0.0f;
                    for (int i9 = 0; i9 < this.f25087M.size(); i9++) {
                        C8321g gVar2 = (C8321g) this.f25087M.get(i9);
                        if (gVar2.f26854n || gVar2.f26855o != 0.0f) {
                            int[] iArr2 = gVar2.f26841a.f26332a;
                            float[] fArr2 = ((C8109d) this.f25084J0).f26325b;
                            int i10 = this.f25102T0;
                            float f12 = ((f / 2.0f) + (fArr2[i10] * (f6 - f))) - horizontalPadding;
                            float measuredHeight2 = (iArr2[i10] / this.f25129h0) * ((getMeasuredHeight() - this.f25127g0) - AbstractC7821f.getSignatureTextHeight()) * gVar2.f26855o;
                            gVar2.f26843c.setStrokeWidth(f2);
                            gVar2.f26843c.setAlpha((int) (1.0f * 255.0f));
                            canvas.drawLine(f12, ((getMeasuredHeight() - this.f25127g0) - measuredHeight2) - f11, f12, (getMeasuredHeight() - this.f25127g0) - f11, gVar2.f26843c);
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
        T t = this.f25084J0;
        if (t != 0) {
            int length = ((C8109d) t).f26325b.length;
            int size = this.f25087M.size();
            for (int i = 0; i < this.f25087M.size(); i++) {
                ((C8321g) this.f25087M.get(i)).f26850j = 0;
            }
            int max = Math.max(1, Math.round(length / 200.0f));
            int[] iArr = this.f25274K1;
            if (iArr == null || iArr.length < size) {
                this.f25274K1 = new int[size];
            }
            for (int i2 = 0; i2 < length; i2++) {
                float f2 = ((C8109d) this.f25084J0).f26325b[i2] * this.f25122d1;
                int i3 = 0;
                while (true) {
                    f = 0.0f;
                    if (i3 >= size) {
                        break;
                    }
                    C8321g gVar = (C8321g) this.f25087M.get(i3);
                    if (gVar.f26854n || gVar.f26855o != 0.0f) {
                        int i4 = gVar.f26841a.f26332a[i2];
                        int[] iArr2 = this.f25274K1;
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
                        C8321g gVar2 = (C8321g) this.f25087M.get(i5);
                        if (gVar2.f26854n || gVar2.f26855o != f) {
                            float f4 = AbstractC7821f.f25066I1 ? this.f25086L0 : ((C8109d) this.f25084J0).f26328e;
                            int[] iArr3 = this.f25274K1;
                            float f5 = (iArr3[i5] / f4) * gVar2.f26855o;
                            int i6 = this.f25120c1;
                            float f6 = f5 * i6;
                            float[] fArr = gVar2.f26851k;
                            int i7 = gVar2.f26850j;
                            int i8 = i7 + 1;
                            gVar2.f26850j = i8;
                            fArr[i7] = f2;
                            int i9 = i8 + 1;
                            gVar2.f26850j = i9;
                            fArr[i8] = (i6 - f6) - f3;
                            int i10 = i9 + 1;
                            gVar2.f26850j = i10;
                            fArr[i9] = f2;
                            gVar2.f26850j = i10 + 1;
                            fArr[i10] = i6 - f3;
                            f3 += f6;
                            iArr3[i5] = 0;
                        }
                        i5++;
                        f = 0.0f;
                    }
                }
            }
            T t2 = this.f25084J0;
            float f7 = ((C8109d) t2).f26325b.length < 2 ? 1.0f : ((C8109d) t2).f26325b[1] * this.f25122d1;
            for (int i11 = 0; i11 < size; i11++) {
                C8321g gVar3 = (C8321g) this.f25087M.get(i11);
                gVar3.f26843c.setStrokeWidth(max * f7);
                gVar3.f26843c.setAlpha(255);
                canvas.drawLines(gVar3.f26851k, 0, gVar3.f26850j, gVar3.f26843c);
            }
        }
    }

    @Override
    public void mo14859u(Canvas canvas) {
    }

    @Override
    public int mo14858w(int i, int i2) {
        return ((C8109d) this.f25084J0).m13587f(i, i2);
    }

    @Override
    public void mo14857z() {
        super.mo14857z();
        this.f25086L0 = 0.0f;
        int length = ((C8109d) this.f25084J0).f26324a.length;
        int size = this.f25087M.size();
        for (int i = 0; i < length; i++) {
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C8322h hVar = (C8322h) this.f25087M.get(i3);
                if (hVar.f26854n) {
                    i2 += hVar.f26841a.f26332a[i];
                }
            }
            float f = i2;
            if (f > this.f25086L0) {
                this.f25086L0 = f;
            }
        }
    }
}
