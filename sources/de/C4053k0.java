package de;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import be.C1357a0;
import be.C1410y;
import ge.C4868i;
import ie.RunnableC5390g;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3940f;
import p051db.C3950k;
import p082fd.C4403w;
import p108hb.C5069h;
import p364zd.C11524j;

public class C4053k0 extends C4056l0 implements C3950k.AbstractC3952b {
    public final Paint f13640N;
    public final Paint f13641O;
    public final Paint f13642P;
    public C4054a f13646T;
    public Rect f13651b0;
    public Rect f13652c0;
    public Rect f13653d0;
    public RectF f13654e0;
    public RectF f13655f0;
    public int f13657h0;
    public int f13658i0;
    public int f13659j0;
    public final C3940f f13660k0;
    public final C3940f f13661l0;
    public final C3940f f13662m0;
    public final C3940f f13663n0;
    public RunnableC5390g f13664o0;
    public RunnableC5390g f13665p0;
    public RunnableC5390g f13666q0;
    public boolean f13669t0;
    public boolean f13670u0;
    public boolean f13671v0;
    public boolean f13672w0;
    public boolean f13673x0;
    public int f13674y0;
    public final C4054a f13643Q = new C4054a();
    public final C4054a f13644R = new C4054a();
    public final C4054a f13645S = new C4054a();
    public final Path f13647U = new Path();
    public final Path f13648V = new Path();
    public final Path f13649W = new Path();
    public final Path f13650a0 = new Path();
    public final int f13656g0 = C1357a0.m37544i(20.0f);
    public float f13667r0 = 1.0f;
    public float f13668s0 = 0.0f;

    public static final class C4054a {
        public float f13675a;
        public float f13676b;
        public float f13677c;

        public C4054a() {
        }

        public void m29140a(C4054a aVar) {
            m29139b(aVar.f13675a, aVar.f13676b, aVar.f13677c);
        }

        public void m29139b(float f, float f2, float f3) {
            this.f13675a = f;
            this.f13676b = f2;
            this.f13677c = f3;
        }

        public C4054a(float f, float f2, float f3) {
            this.f13675a = f;
            this.f13676b = f2;
            this.f13677c = f3;
        }
    }

    public C4053k0(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f13640N = paint;
        Paint paint2 = new Paint(1);
        this.f13641O = paint2;
        Paint paint3 = new Paint(1);
        this.f13642P = paint3;
        LinearInterpolator linearInterpolator = C2057b.f7283e;
        this.f13660k0 = new C3940f(1, this, linearInterpolator, 750L, false);
        OvershootInterpolator overshootInterpolator = C2057b.f7284f;
        this.f13661l0 = new C3940f(0, this, overshootInterpolator, 350L, false);
        this.f13662m0 = new C3940f(2, this, linearInterpolator, 150L, false);
        this.f13663n0 = new C3940f(3, this, overshootInterpolator, 750L, true);
        paint.setColor(2130706432);
        paint2.setColor(C11524j.m228N(R.id.theme_color_white));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(C1357a0.m37544i(2.0f));
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint3.setColor(-65536);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(C1357a0.m37544i(2.0f));
        paint3.setStrokeJoin(Paint.Join.ROUND);
    }

    public static int m29144Q1() {
        return -65536;
    }

    public static int m29143S1() {
        return -1;
    }

    @Override
    public void mo29119C1() {
        this.f13670u0 = true;
        this.f13660k0.m29577p(false, false);
        this.f13661l0.m29577p(false, false);
        this.f13663n0.m29577p(true, true);
        C4054a aVar = this.f13645S;
        C4054a aVar2 = this.f13643Q;
        aVar.m29139b(aVar2.f13675a, aVar2.f13676b, aVar2.f13677c);
        m29142T1();
    }

    @Override
    public void mo29118D1() {
        this.f13662m0.m29577p(true, true);
    }

    @Override
    public void mo29117E1(float f) {
        this.f13668s0 = f;
        invalidate();
    }

    @Override
    public void mo29115G1(RectF rectF, int i, int i2, int i3, boolean z) {
        float f;
        if (!this.f13670u0) {
            this.f13662m0.m29577p(false, false);
            this.f13662m0.m29581l(z ? 250L : 150L);
            if (rectF == null) {
                this.f13660k0.m29577p(true, false);
                return;
            }
            float f2 = i2;
            float width = getWidth() / f2;
            float f3 = i;
            float height = getHeight() / f3;
            float f4 = f2 / 2.0f;
            float width2 = (getWidth() / 2.0f) + (rectF.left - f4);
            float width3 = (getWidth() / 2.0f) + (rectF.right - f4);
            float height2 = (getHeight() / 2.0f) + (rectF.top - (f3 / 2.0f));
            if (C4868i.m24727c2().m24617q0() == 3) {
                width = this.f13659j0 / f2;
                RectF rectF2 = new RectF(rectF.left * width, rectF.top * height, rectF.right * width, rectF.bottom * height);
                height2 = rectF2.top;
                f = Math.max(rectF2.width(), rectF2.height());
            } else {
                f = width3 - width2;
            }
            if (this.f13673x0) {
                this.f13666q0 = new RunnableC5390g.C5392b(C4403w.m27937T("camera = %s x %s, view = %s x %s, cameraView = %s x %s\naspect = %s, zxing = %s\nsx: %s, sy: %s\nX: %s, Y: %s, size: %s\nSource bounds: %s (width: %s)", null, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(getHeight()), Integer.valueOf(getWidth()), Integer.valueOf(this.f13658i0), Integer.valueOf(this.f13657h0), Integer.valueOf(C4868i.m24727c2().m24617q0()), Boolean.valueOf(z), Float.valueOf(width), Float.valueOf(height), Float.valueOf(width2), Float.valueOf(height2), Float.valueOf(f), rectF, Float.valueOf(rectF.width())).toString(), getWidth(), C1410y.m37086A0(14.0f), C4042i0.f13571a).m22885f();
                this.f13654e0 = rectF;
                this.f13655f0 = new RectF(rectF.left * width, rectF.top * height, rectF.right * width, rectF.bottom * height);
            }
            m29146N1(width2, height2, f);
            this.f13660k0.m29577p(true, true);
            this.f13663n0.m29577p(false, true);
        }
    }

    @Override
    public void mo29114I1(boolean z, boolean z2) {
        this.f13669t0 = z;
        this.f13673x0 = z2 || C4868i.m24727c2().m24778V2();
        this.f13670u0 = false;
        this.f13645S.m29139b(0.0f, 0.0f, 0.0f);
        invalidate();
    }

    @Override
    public void mo29113J1(int i) {
        this.f13674y0 = i;
        RunnableC5390g gVar = this.f13664o0;
        if (gVar != null) {
            m29141U1(gVar.m22937h0());
        }
    }

    public final void m29146N1(float f, float f2, float f3) {
        this.f13644R.m29140a(this.f13645S);
        this.f13646T = new C4054a(f, f2, f3);
        this.f13661l0.m29577p(false, false);
        this.f13661l0.m29577p(true, true);
    }

    public final int m29145O1() {
        return this.f13678M.mo4347s().m14512a1();
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            this.f13645S.f13675a = C5069h.m24085i(this.f13644R.f13675a, this.f13646T.f13675a, f);
            this.f13645S.f13676b = C5069h.m24085i(this.f13644R.f13676b, this.f13646T.f13676b, f);
            this.f13645S.f13677c = C5069h.m24085i(this.f13644R.f13677c, this.f13646T.f13677c, f);
            m29142T1();
            invalidate();
        } else if (i == 3) {
            this.f13667r0 = C5069h.m24090d(f);
            invalidate();
        } else if (i == 1 && f > 0.25f) {
            this.f13663n0.m29584i();
        }
    }

    public final void m29142T1() {
        C4054a aVar = this.f13645S;
        float f = aVar.f13675a;
        float f2 = aVar.f13676b;
        float f3 = aVar.f13677c;
        this.f13647U.reset();
        this.f13647U.moveTo(f, this.f13656g0 + f2);
        this.f13647U.lineTo(f, f2);
        this.f13647U.lineTo(this.f13656g0 + f, f2);
        this.f13648V.reset();
        float f4 = f + f3;
        this.f13648V.moveTo(f4, this.f13656g0 + f2);
        this.f13648V.lineTo(f4, f2);
        this.f13648V.lineTo(f4 - this.f13656g0, f2);
        this.f13649W.reset();
        float f5 = f2 + f3;
        this.f13649W.moveTo(f, f5 - this.f13656g0);
        this.f13649W.lineTo(f, f5);
        this.f13649W.lineTo(f + this.f13656g0, f5);
        this.f13650a0.reset();
        this.f13650a0.moveTo(f4, f5 - this.f13656g0);
        this.f13650a0.lineTo(f4, f5);
        this.f13650a0.lineTo(f4 - this.f13656g0, f5);
    }

    public final void m29141U1(int i) {
        C4044j0 j0Var = C4044j0.f13573a;
        this.f13664o0 = new RunnableC5390g.C5392b(C4403w.m27871i1(R.string.ScanQRFullTitle), i, C1410y.m37086A0(31.0f), j0Var).m22889b().m22890a(2).m22869v().m22885f();
        int i2 = this.f13674y0;
        if (i2 == 0) {
            i2 = R.string.ScanQRFullSubtitle;
        }
        this.f13665p0 = new RunnableC5390g.C5392b(C4403w.m27871i1(i2), i, C1410y.m37086A0(16.0f), j0Var).m22890a(2).m22875p(2).m22885f();
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        if (i == 1 && f == 1.0f) {
            if (!C4868i.m24727c2().m24904D2()) {
                ((View$OnClickListenerC4045k) this.f13678M).m29228Lf();
                this.f13660k0.m29577p(false, false);
            }
        } else if (i == 2 && f == 1.0f) {
            this.f13660k0.m29577p(false, false);
            this.f13663n0.m29577p(true, true);
            C4054a aVar = this.f13643Q;
            m29146N1(aVar.f13675a, aVar.f13676b, aVar.f13677c);
        }
    }

    @Override
    public boolean drawChild(android.graphics.Canvas r16, android.view.View r17, long r18) {
        throw new UnsupportedOperationException("Method not decompiled: de.C4053k0.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }
}
