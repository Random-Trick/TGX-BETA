package p209od;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import be.C1357a0;
import be.C1379j0;
import p037cb.C2057b;
import p051db.C3940f;
import p051db.C3950k;

public class C7851a extends View implements C3950k.AbstractC3952b {
    public double f25272A0;
    public double f25273B0;
    public double f25274C0;
    public double f25275D0;
    public int f25276E0;
    public int f25277F0;
    public boolean f25278G0;
    public float f25281O;
    public int f25282P;
    public int f25283Q;
    public int f25285S;
    public int f25286T;
    public double f25287U;
    public double f25288V;
    public AbstractC7853b f25290a;
    public AbstractC7852a f25292b;
    public AbstractC7854c f25294c;
    public int f25296d0;
    public int f25297e0;
    public int f25298f0;
    public int f25299g0;
    public int f25302j0;
    public int f25303k0;
    public boolean f25304l0;
    public float f25305m0;
    public float f25306n0;
    public float f25307o0;
    public float f25308p0;
    public double f25309q0;
    public double f25310r0;
    public double f25311s0;
    public double f25312t0;
    public C3950k f25313u0;
    public float f25314v0;
    public double f25315w0;
    public double f25316x0;
    public double f25317y0;
    public double f25318z0;
    public final Rect f25279M = new Rect();
    public final Paint f25280N = new Paint(5);
    public final C3940f f25284R = new C3940f(0, this, C2057b.f7280b, 170);
    public double f25289W = 0.0d;
    public double f25291a0 = 0.0d;
    public double f25293b0 = 1.0d;
    public double f25295c0 = 1.0d;
    public final Rect f25300h0 = new Rect();
    public final Rect f25301i0 = new Rect();

    public interface AbstractC7852a {
        void mo14833a();

        void mo14832b(float f);
    }

    public interface AbstractC7853b {
        void mo14831a(double d, double d2, double d3, double d4);
    }

    public interface AbstractC7854c {
        void mo14830a(boolean z);
    }

    public C7851a(Context context) {
        super(context);
    }

    public static float m14856a(float f, float f2, float f3, float f4) {
        return Math.abs(m14849h(f, f2, f3, f4));
    }

    private float getProportion() {
        int i;
        float f;
        float f2;
        int targetWidth = getTargetWidth();
        int targetHeight = getTargetHeight();
        int i2 = this.f25276E0;
        if (i2 <= 0 || (i = this.f25277F0) <= 0) {
            return 0.0f;
        }
        float f3 = targetWidth / targetHeight;
        if (targetWidth < targetHeight) {
            f2 = i2;
            f = i;
        } else {
            f2 = i;
            f = i2;
        }
        return f3 * (f2 / f);
    }

    private int getWorkAreaHeight() {
        return (getMeasuredHeight() - this.f25297e0) - this.f25299g0;
    }

    private int getWorkAreaWidth() {
        return (getMeasuredWidth() - this.f25296d0) - this.f25298f0;
    }

    public static float m14849h(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((f5 * f5) + (f6 * f6));
    }

    public static boolean m14846k(float f, float f2, int i, int i2, int i3, int i4) {
        return f <= ((float) (i2 + i)) && f > ((float) (i2 - i)) && f2 <= ((float) (i4 + i)) && f2 > ((float) (i3 - i));
    }

    public static boolean m14845l(float f, float f2, int i, int i2, int i3, int i4) {
        return f2 <= ((float) (i2 + i)) && f2 > ((float) (i2 - i)) && f <= ((float) (i4 + i)) && f > ((float) (i3 - i));
    }

    private void setActiveFactor(float f) {
        if (this.f25281O != f) {
            this.f25281O = f;
            m14850g();
            invalidate();
        }
    }

    private void setDragMode(int i) {
        int i2 = this.f25302j0;
        if (i2 != i) {
            int i3 = 0;
            if (i != 0) {
                i2 = 0;
            }
            this.f25303k0 = i2;
            this.f25302j0 = i;
            if (i == 9) {
                i3 = 3;
            } else if (i != 0) {
                i3 = 1;
            }
            m14836u(i3, true);
        }
    }

    private void setNormalizeFactor(float f) {
        if (this.f25314v0 != f) {
            this.f25314v0 = f;
            double d = f;
            m14839r(this.f25315w0 + (this.f25272A0 * d), this.f25316x0 + (this.f25273B0 * d), this.f25317y0 + (this.f25274C0 * d), this.f25318z0 + (this.f25275D0 * d), true);
            AbstractC7852a aVar = this.f25292b;
            if (aVar != null) {
                aVar.mo14832b(f);
            }
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            setActiveFactor(f);
        } else if (i == 1) {
            setNormalizeFactor(f);
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        AbstractC7852a aVar;
        if (i == 1 && (aVar = this.f25292b) != null) {
            aVar.mo14833a();
        }
    }

    public boolean m14855b(double d, double d2, double d3, double d4, boolean z, boolean z2) {
        C3950k kVar = this.f25313u0;
        if (kVar == null) {
            this.f25313u0 = new C3950k(1, this, C2057b.f7280b, 180L);
        } else {
            kVar.m29541l(0.0f);
            this.f25314v0 = 0.0f;
        }
        if (!z && this.f25289W == d && this.f25291a0 == d2 && this.f25293b0 == d3 && this.f25295c0 == d4) {
            return false;
        }
        double d5 = this.f25289W;
        this.f25315w0 = d5;
        double d6 = this.f25291a0;
        this.f25316x0 = d6;
        double d7 = this.f25293b0;
        this.f25317y0 = d7;
        double d8 = this.f25295c0;
        this.f25318z0 = d8;
        this.f25272A0 = d - d5;
        this.f25273B0 = d2 - d6;
        this.f25274C0 = d3 - d7;
        this.f25275D0 = d4 - d8;
        this.f25313u0.m29528y(z2 ? 120L : 180L);
        this.f25313u0.m29544i(1.0f);
        return true;
    }

    public final void m14854c(Rect rect, Rect rect2) {
        int i = this.f25296d0;
        int i2 = this.f25297e0;
        int workAreaWidth = getWorkAreaWidth();
        int workAreaHeight = getWorkAreaHeight();
        float targetWidth = getTargetWidth();
        float targetHeight = getTargetHeight();
        float min = Math.min(workAreaWidth / targetWidth, workAreaHeight / targetHeight);
        int i3 = (int) (targetWidth * min);
        int i4 = (int) (targetHeight * min);
        int i5 = (i + (workAreaWidth / 2)) - (i3 / 2);
        int i6 = (i2 + (workAreaHeight / 2)) - (i4 / 2);
        int i7 = i5 + i3;
        int i8 = i6 + i4;
        if (rect != null) {
            rect.set(i5, i6, i7, i8);
        }
        if (rect2 != null) {
            double d = i3;
            double d2 = i4;
            rect2.set(((int) Math.ceil(this.f25289W * d)) + i5, ((int) Math.ceil(this.f25291a0 * d2)) + i6, i5 + ((int) Math.floor(d * this.f25293b0)), i6 + ((int) Math.floor(d2 * this.f25295c0)));
        }
    }

    public boolean m14853d() {
        return this.f25282P == 0 && !this.f25284R.m29582i();
    }

    public final void m14852e() {
        C3950k kVar = this.f25313u0;
        if (kVar != null) {
            kVar.m29542k();
        }
    }

    public final void m14851f() {
        if (getWorkAreaWidth() > 0 && getWorkAreaHeight() > 0 && this.f25285S > 0 && this.f25286T > 0) {
            m14854c(this.f25300h0, null);
            setPivotX(this.f25300h0.centerX());
            setPivotY(this.f25300h0.centerY());
        }
    }

    public final void m14850g() {
        throw new UnsupportedOperationException("Method not decompiled: p209od.C7851a.m14850g():void");
    }

    public float getFixedProportion() {
        int i;
        int i2 = this.f25276E0;
        if (i2 <= 0 || (i = this.f25277F0) <= 0) {
            return 0.0f;
        }
        return i2 / i;
    }

    public float getOriginalProportion() {
        return Math.max(this.f25285S, this.f25286T) / Math.min(this.f25285S, this.f25286T);
    }

    public int getTargetHeight() {
        return this.f25286T;
    }

    public int getTargetWidth() {
        return this.f25285S;
    }

    public void m14848i(float f) {
        setActiveFactor(f);
        this.f25284R.m29587d(f);
    }

    public final void m14847j() {
        m14854c(this.f25300h0, null);
        invalidate(this.f25300h0.left - C1357a0.m37541i(2.0f), this.f25300h0.top - C1357a0.m37541i(2.0f), this.f25300h0.right + C1357a0.m37541i(2.0f), this.f25300h0.bottom + C1357a0.m37541i(2.0f));
    }

    public final void m14844m() {
        double d;
        double d2;
        float proportion = getProportion();
        if (proportion == 0.0f) {
            m14852e();
            return;
        }
        double d3 = this.f25289W;
        double d4 = this.f25293b0;
        double d5 = (d3 + d4) / 2.0d;
        double d6 = this.f25291a0;
        double d7 = this.f25295c0;
        double d8 = (d6 + d7) / 2.0d;
        double d9 = d4 - d3;
        double d10 = d7 - d6;
        if (this.f25285S < this.f25286T) {
            d10 = d9 * proportion;
        } else {
            d9 = d10 / proportion;
        }
        double max = Math.max(1.0d, Math.max(((float) this.f25287U) / d9, Math.max(((float) this.f25288V) / d10, 1.0d))) * Math.min(1.0d, Math.min(1.0d / d9, 1.0d / d10));
        if (max != 1.0d) {
            d9 = Math.min(1.0d, Math.max(0.0d, d9 * max));
            d10 = Math.min(1.0d, Math.max(0.0d, d10 * max));
        }
        double d11 = d5 - (d9 / 2.0d);
        double d12 = d9 + d11;
        double d13 = d8 - (d10 / 2.0d);
        double d14 = d10 + d13;
        if (d13 < 0.0d) {
            d14 += -d13;
            d13 = 0.0d;
        } else if (d14 > 1.0d) {
            d13 -= d14 - 1.0d;
            d14 = 1.0d;
        }
        if (d11 < 0.0d) {
            d = d12 + (-d11);
            d2 = 0.0d;
        } else if (d12 > 1.0d) {
            d2 = d11 - (d12 - 1.0d);
            d = 1.0d;
        } else {
            d2 = d11;
            d = d12;
        }
        m14855b(d2, d13, d, d14, false, false);
    }

    public boolean m14843n(boolean z, boolean z2) {
        m14842o();
        return m14855b(0.0d, 0.0d, 1.0d, 1.0d, z, z2);
    }

    public void m14842o() {
        this.f25276E0 = 0;
        this.f25277F0 = 0;
    }

    @Override
    public void onDraw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: p209od.C7851a.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m14851f();
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r54) {
        throw new UnsupportedOperationException("Method not decompiled: p209od.C7851a.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void m14841p(int i, int i2, double d, double d2, double d3, double d4, boolean z) {
        if (this.f25285S != i || this.f25286T != i2 || this.f25289W != d || this.f25291a0 != d2 || this.f25293b0 != d3 || this.f25295c0 != d4) {
            this.f25285S = i;
            this.f25286T = i2;
            this.f25287U = 18.0d / i;
            this.f25288V = 18.0d / i2;
            m14839r(d, d2, d3, d4, z);
            m14851f();
            invalidate();
        }
    }

    public void m14840q(int i) {
        double d;
        double d2;
        double d3;
        double d4 = this.f25289W;
        double d5 = this.f25291a0;
        double d6 = this.f25293b0;
        double d7 = this.f25295c0;
        int i2 = i;
        int i3 = this.f25285S;
        int i4 = this.f25286T;
        double d8 = d7;
        double d9 = d6;
        double d10 = d4;
        double d11 = d5;
        while (i2 != 0) {
            if (d10 == 0.0d && d11 == 0.0d && d9 == 1.0d && d8 == 1.0d) {
                float f = i2;
                i2 = (int) (f + ((-Math.signum(f)) * 90.0f));
            } else {
                if (i2 < 0) {
                    d3 = 1.0d - d10;
                    d2 = 1.0d - d9;
                    i2 += 90;
                    d = d8;
                    d10 = d11;
                } else {
                    d10 = 1.0d - d8;
                    d = 1.0d - d11;
                    i2 -= 90;
                    d3 = d9;
                    d2 = d10;
                }
                d8 = d3;
                d11 = d2;
                d9 = d;
            }
            i3 = i4;
            i4 = i3;
        }
        m14841p(i3, i4, d10, d11, d9, d8, true);
    }

    public final void m14839r(double d, double d2, double d3, double d4, boolean z) {
        AbstractC7853b bVar;
        if (this.f25289W != d || this.f25291a0 != d2 || this.f25293b0 != d3 || this.f25295c0 != d4) {
            this.f25289W = d;
            this.f25291a0 = d2;
            this.f25293b0 = d3;
            this.f25295c0 = d4;
            if (z && (bVar = this.f25290a) != null) {
                bVar.mo14831a(d, d2, d3, d4);
            }
            m14847j();
        }
    }

    public final boolean m14838s(boolean z) {
        if (this.f25304l0 != z) {
            this.f25304l0 = z;
            C1379j0.m37307r(getContext()).m14464m3(64, z);
        }
        return z;
    }

    public void setNormalizeListener(AbstractC7852a aVar) {
        this.f25292b = aVar;
    }

    public void setOffsetBottom(int i) {
        if (this.f25299g0 != i) {
            this.f25299g0 = i;
            m14851f();
            invalidate();
        }
    }

    public void setRectChangeListener(AbstractC7853b bVar) {
        this.f25290a = bVar;
    }

    public void setRotateModeChangeListener(AbstractC7854c cVar) {
        this.f25294c = cVar;
    }

    public void m14837t(int i, int i2) {
        if (this.f25276E0 != i || this.f25277F0 != i2) {
            this.f25276E0 = i;
            this.f25277F0 = i2;
            m14844m();
        }
    }

    public void m14836u(int i, boolean z) {
        int i2 = this.f25282P;
        if (i2 != i) {
            boolean z2 = i != 0;
            if (z2) {
                i2 = 0;
            }
            this.f25283Q = i2;
            this.f25282P = i;
            m14850g();
            if (z) {
                this.f25284R.m29575p(z2, true);
                return;
            }
            this.f25284R.m29588c();
            this.f25284R.m29586e(z2);
        }
    }

    public void m14835v(int i, int i2, int i3, int i4) {
        if (this.f25296d0 != i || this.f25297e0 != i2 || this.f25298f0 != i3 || this.f25299g0 != i4) {
            this.f25296d0 = i;
            this.f25297e0 = i2;
            this.f25298f0 = i3;
            this.f25299g0 = i4;
            m14851f();
            invalidate();
        }
    }

    public final void m14834w(float f, float f2) {
    }
}
