package me;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import be.C1357a0;
import be.C1359b;
import be.C1363c0;
import be.C1379j0;
import be.C1410y;
import id.C5373y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.loader.C7907b;
import p037cb.C2057b;
import p051db.C3940f;
import p051db.C3950k;
import p051db.C3953l;
import p108hb.C5064d;
import p108hb.C5070i;
import p139jb.AbstractC5911c;
import p139jb.AbstractRunnableC5910b;
import p364zd.AbstractC11531p;
import p364zd.C11524j;
import td.C9357x2;

public class C6890g4 extends View implements AbstractC5911c, C3950k.AbstractC3952b {
    public int f21734M;
    public String f21735N;
    public AbstractRunnableC5910b f21736O;
    public C5373y f21737P;
    public String f21738Q;
    public double f21739R;
    public double f21740S;
    public double f21741T;
    public int f21742U;
    public long f21743V;
    public AbstractC6893c f21746a0;
    public int f21751d0;
    public boolean f21752e0;
    public float f21753f0;
    public float f21754g0;
    public C9357x2.AbstractC9363f f21755h0;
    public C9357x2.AbstractC9363f f21756i0;
    public final C3950k f21757j0;
    public final C3950k f21758k0;
    public C9357x2.C9370l f21759l0;
    public C9357x2.C9370l f21760m0;
    public AbstractC11531p f21766s0;
    public C3940f f21767t0;
    public final C3940f f21768u0;
    public float f21769v0;
    public final ArrayList<C6892b> f21745a = new ArrayList<>();
    public final HandlerC6894d f21747b = new HandlerC6894d(this);
    public final Rect f21749c = new Rect();
    public double f21744W = -1.0d;
    public double f21748b0 = -1.0d;
    public double f21750c0 = -1.0d;
    public long f21761n0 = -1;
    public long f21762o0 = -1;
    public int f21763p0 = R.id.theme_color_sliderActive;
    public int f21764q0 = R.id.theme_color_filling;
    public int f21765r0 = R.id.theme_color_previewBackground;

    public class C6891a extends AbstractRunnableC5910b {
        public final String f21770M;
        public final int f21771N;
        public final int f21772O;

        public C6891a(String str, int i, int i2) {
            this.f21770M = str;
            this.f21771N = i;
            this.f21772O = i2;
        }

        @Override
        public void mo1364b() {
            C6890g4.this.m18539z(this, this.f21770M, this.f21771N, this.f21772O);
        }
    }

    public static class C6892b implements C3950k.AbstractC3952b {
        public int f21774M;
        public int f21775N;
        public int f21776O;
        public int f21777P;
        public float f21778Q;
        public final C3950k f21779R = new C3950k(0, this, C2057b.f7280b, 120);
        public boolean f21780S;
        public final C6890g4 f21781a;
        public final String f21782b;
        public final Bitmap f21783c;

        public C6892b(C6890g4 g4Var, String str, Bitmap bitmap) {
            this.f21781a = g4Var;
            this.f21782b = str;
            this.f21783c = bitmap;
        }

        @Override
        public void mo45P5(int i, float f, float f2, C3950k kVar) {
            if (this.f21778Q != f) {
                this.f21778Q = f;
                m18535d();
            }
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
        }

        public void m18537b() {
            if (this.f21779R.m29531v()) {
                this.f21779R.m29542k();
            }
            Bitmap bitmap = this.f21783c;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f21783c.recycle();
            }
        }

        public void m18536c(Canvas canvas, float f) {
            Bitmap bitmap;
            if (this.f21778Q > 0.0f && (bitmap = this.f21783c) != null && !bitmap.isRecycled()) {
                Rect Z = C1410y.m37052Z();
                int width = this.f21783c.getWidth() / 2;
                int height = this.f21783c.getHeight() / 2;
                int max = (int) ((width / 2) * Math.max(1.0f, f));
                int max2 = (int) ((height / 2) * Math.max(1.0f, f));
                this.f21781a.f21749c.set(width - max, height - max2, width + max, height + max2);
                canvas.save();
                int i = this.f21776O - this.f21774M;
                int i2 = this.f21777P - this.f21775N;
                float width2 = this.f21783c.getWidth();
                float height2 = this.f21783c.getHeight();
                float max3 = Math.max(i / width2, i2 / height2);
                int i3 = (int) (width2 * max3);
                int i4 = (int) (height2 * max3);
                int i5 = (this.f21774M + this.f21776O) / 2;
                int i6 = (this.f21775N + this.f21777P) / 2;
                int i7 = i3 / 2;
                int i8 = i4 / 2;
                Z.set(i5 - i7, i6 - i8, i7 + i5, i8 + i6);
                canvas.clipRect(this.f21774M, this.f21775N, this.f21776O, this.f21777P);
                Paint j = C1410y.m37033j();
                float f2 = this.f21778Q;
                if (f2 < 1.0f) {
                    j.setAlpha((int) (f2 * 255.0f));
                    float f3 = (this.f21778Q * 0.4f) + 0.6f;
                    canvas.scale(f3, f3, i5, i6);
                }
                canvas.drawBitmap(this.f21783c, this.f21781a.f21749c, Z, j);
                if (this.f21778Q < 1.0f) {
                    j.setAlpha(255);
                }
                canvas.restore();
            }
        }

        public final void m18535d() {
            int i = this.f21774M;
            if (i != 0 || this.f21775N != 0 || this.f21776O != 0 || this.f21777P != 0) {
                this.f21781a.invalidate(i, this.f21775N, this.f21776O, this.f21777P);
            }
        }

        public void m18534e() {
            if (!this.f21780S) {
                this.f21780S = true;
                this.f21779R.m29544i(1.0f);
            }
        }

        public void m18533f(int i, int i2, int i3, int i4, boolean z) {
            if (this.f21774M != i || this.f21775N != i2 || this.f21776O != i3 || this.f21777P != i4) {
                this.f21774M = i;
                this.f21775N = i2;
                this.f21776O = i3;
                this.f21777P = i4;
                if (z && this.f21778Q > 0.0f) {
                    m18535d();
                }
            }
        }
    }

    public interface AbstractC6893c {
        void mo6838a(C6890g4 g4Var, double d, double d2, double d3, int i, long j);

        void mo6837b(C6890g4 g4Var, boolean z);

        boolean mo6836c(C6890g4 g4Var);

        void mo6835d(C6890g4 g4Var, float f);

        void mo6834e(C6890g4 g4Var, double d, double d2, double d3);
    }

    public static class HandlerC6894d extends Handler {
        public final C6890g4 f21784a;

        public HandlerC6894d(C6890g4 g4Var) {
            this.f21784a = g4Var;
        }

        @Override
        public void handleMessage(Message message) {
            if (message.what == 0) {
                this.f21784a.m18555j(message.arg1, (C6892b) message.obj);
            }
        }
    }

    public C6890g4(Context context) {
        super(context);
        DecelerateInterpolator decelerateInterpolator = C2057b.f7280b;
        this.f21757j0 = new C3950k(0, this, decelerateInterpolator, 180L, 0.0f);
        this.f21758k0 = new C3950k(1, this, decelerateInterpolator, 180L, 1.0f);
        this.f21767t0 = new C3940f(1, new C3950k.AbstractC3952b() {
            @Override
            public final void mo45P5(int i, float f, float f2, C3950k kVar) {
                C6890g4.this.m18546s(i, f, f2, kVar);
            }

            @Override
            public void mo35Y0(int i, float f, C3950k kVar) {
                C3953l.m29526a(this, i, f, kVar);
            }
        }, decelerateInterpolator, 180L);
        this.f21768u0 = new C3940f(1, new C3950k.AbstractC3952b() {
            @Override
            public final void mo45P5(int i, float f, float f2, C3950k kVar) {
                C6890g4.this.m18545t(i, f, f2, kVar);
            }

            @Override
            public void mo35Y0(int i, float f, C3950k kVar) {
                C3953l.m29526a(this, i, f, kVar);
            }
        }, decelerateInterpolator, 180L);
    }

    private int getAddPaddingHorizontal() {
        return C1357a0.m37541i(8.0f) + C1357a0.m37541i(2.0f);
    }

    private int getAddPaddingVertical() {
        return C1357a0.m37541i(2.0f);
    }

    private double getCurrentEnd() {
        return this.f21739R * this.f21758k0.m29538o();
    }

    private double getCurrentStart() {
        return this.f21739R * this.f21757j0.m29538o();
    }

    private void getFramesIfNeeded() {
        m18552m();
        if (!C5070i.m24061i(this.f21735N) && this.f21734M > 0) {
            m18551n();
            this.f21736O = new C6891a(this.f21735N, this.f21734M, (int) (getTimelineHeight() * Math.min(2.0f, Math.max(1.0f, C1357a0.m37542h()))));
            C7907b.m14362k().m14361l(this.f21736O);
        }
    }

    private int getTimelineHeight() {
        return ((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - (getAddPaddingVertical() * 2);
    }

    private int getTimelineWidth() {
        return ((getMeasuredWidth() - getPaddingRight()) - getPaddingLeft()) - (getAddPaddingHorizontal() * 2);
    }

    public void m18548q(View view, Rect rect) {
        int paddingLeft = (int) (getPaddingLeft() + getAddPaddingHorizontal() + (this.f21758k0.m29538o() * getTimelineWidth()));
        rect.left = paddingLeft;
        rect.right = paddingLeft + getAddPaddingHorizontal();
        rect.top = getPaddingTop() - getAddPaddingVertical();
        rect.bottom = (getMeasuredHeight() - getPaddingBottom()) + getAddPaddingVertical();
    }

    public void m18547r(View view, Rect rect) {
        int paddingLeft = (int) (getPaddingLeft() + getAddPaddingHorizontal() + (this.f21757j0.m29538o() * getTimelineWidth()));
        rect.right = paddingLeft;
        rect.left = paddingLeft - getAddPaddingHorizontal();
        rect.top = getPaddingTop() - getAddPaddingVertical();
        rect.bottom = (getMeasuredHeight() - getPaddingBottom()) + getAddPaddingVertical();
    }

    public void m18546s(int i, float f, float f2, C3950k kVar) {
        invalidate();
    }

    private void setFrameCount(int i) {
        if (this.f21734M != i) {
            this.f21734M = i;
            getFramesIfNeeded();
        }
    }

    private void setSlideMode(int i) {
        if (this.f21751d0 != i) {
            boolean z = i != 0;
            this.f21751d0 = i;
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public void m18545t(int i, float f, float f2, C3950k kVar) {
        invalidate();
    }

    public void m18544u() {
        this.f21746a0.mo6838a(this, this.f21739R, this.f21740S, this.f21741T, this.f21742U, this.f21743V);
    }

    public void m18572A(boolean z, boolean z2) {
        this.f21768u0.m29575p(z, z2 && this.f21767t0.m29584g() > 0.0f);
    }

    public void m18571B(int i, int i2, int i3) {
        if (this.f21763p0 != i || this.f21764q0 != i2 || this.f21765r0 != i3) {
            this.f21763p0 = i;
            this.f21764q0 = i2;
            this.f21765r0 = i3;
            invalidate();
        }
    }

    public final boolean m18570C(boolean z, boolean z2) {
        if (this.f21752e0 != z) {
            this.f21752e0 = z;
            AbstractC6893c cVar = this.f21746a0;
            if (cVar != null && z2) {
                cVar.mo6837b(this, z);
            }
        }
        return z;
    }

    public void m18569D(boolean z, boolean z2) {
        this.f21767t0.m29575p(z, z2);
    }

    public final void m18568E(float f, float f2, boolean z) {
        if (this.f21752e0) {
            m18570C(false, true);
        }
        if (z) {
            this.f21757j0.m29544i(f);
            this.f21758k0.m29544i(f2);
            return;
        }
        this.f21757j0.m29541l(f);
        this.f21758k0.m29541l(f2);
    }

    public final void m18567F(final String str, float f, float f2, double d, double d2, double d3, boolean z) {
        this.f21748b0 = d;
        this.f21750c0 = d2;
        if (!C5070i.m24067c(this.f21735N, str)) {
            this.f21735N = str;
            this.f21739R = d3;
            C7907b.m14362k().m14361l(new Runnable() {
                @Override
                public final void run() {
                    C6890g4.this.m18543v(str);
                }
            });
            if (C5070i.m24061i(str)) {
                m18551n();
            } else {
                getFramesIfNeeded();
            }
        }
        m18568E(f, f2, z);
    }

    public final void m18566G() {
        int i = this.f21751d0;
        boolean z = true;
        if (i == 2 || i == 1) {
            if (i != 2) {
                z = false;
            }
            C9357x2.C9370l lVar = z ? this.f21760m0 : this.f21759l0;
            if (lVar == null) {
                AbstractView$OnTouchListenerC7889a r = C1379j0.m37307r(getContext());
                C9357x2.C9370l D = r.m14584H3().m8985g(this).m8948u(m18542w(this.f21751d0)).m8960g(this.f21766s0 != null ? r.m14584H3().m8979m(this.f21766s0) : null).m8971D(null, m18554k(z));
                if (z) {
                    this.f21760m0 = D;
                } else {
                    this.f21759l0 = D;
                }
            } else {
                lVar.m8902W(null, m18554k(z), 0);
                lVar.m8900Y();
            }
        }
    }

    public final void m18565H(boolean z) {
        C9357x2.C9370l lVar = z ? this.f21760m0 : this.f21759l0;
        if (lVar != null) {
            if (Math.round(m18549p(z) * 10000.0d) != (z ? this.f21762o0 : this.f21761n0)) {
                lVar.m8902W(null, m18554k(z), 0);
            }
            lVar.m8904U();
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        m18565H(z);
        invalidate();
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        if (f == 1.0f) {
            C9357x2.C9370l lVar = i == 1 ? this.f21760m0 : this.f21759l0;
            if (lVar != null) {
                lVar.m8916I(true, 1L, TimeUnit.SECONDS);
            }
        }
    }

    @Override
    public void mo4501a3() {
        setVideoPath(null);
    }

    public final void m18555j(int i, C6892b bVar) {
        if (C5070i.m24067c(bVar.f21782b, this.f21735N) && this.f21734M == i) {
            int size = this.f21745a.size();
            this.f21745a.add(bVar);
            float l = m18553l();
            int i2 = (int) (size * l);
            bVar.m18533f(i2, 0, (int) (i2 + l), getTimelineHeight(), true);
            bVar.m18534e();
        }
    }

    public final String m18554k(boolean z) {
        double p = m18549p(z);
        StringBuilder sb2 = new StringBuilder();
        C1363c0.m37431i(Math.round(1000.0d * p), TimeUnit.MILLISECONDS, true, sb2);
        long round = Math.round(p * 10000.0d);
        if (z) {
            this.f21762o0 = round;
        } else {
            this.f21761n0 = round;
        }
        return sb2.toString();
    }

    public final float m18553l() {
        if (this.f21734M > 0) {
            return getTimelineWidth() / this.f21734M;
        }
        return 0.0f;
    }

    public final void m18552m() {
        AbstractRunnableC5910b bVar = this.f21736O;
        if (bVar != null) {
            bVar.m21857c();
            this.f21736O = null;
        }
    }

    public final void m18551n() {
        Iterator<C6892b> it = this.f21745a.iterator();
        while (it.hasNext()) {
            it.next().m18537b();
        }
        this.f21745a.clear();
        invalidate();
    }

    public final void m18550o(int i, C6892b bVar) {
        HandlerC6894d dVar = this.f21747b;
        dVar.sendMessage(Message.obtain(dVar, 0, i, 0, bVar));
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int paddingLeft = getPaddingLeft() + getAddPaddingHorizontal();
        int paddingTop = getPaddingTop() + getAddPaddingVertical();
        int timelineWidth = getTimelineWidth();
        int timelineHeight = getTimelineHeight();
        float l = m18553l();
        float f = paddingLeft;
        Iterator<C6892b> it = this.f21745a.iterator();
        float f2 = f;
        while (it.hasNext()) {
            C6892b next = it.next();
            f2 += l;
            it = it;
            next.m18533f(Math.max(paddingLeft, (int) f2), paddingTop, Math.min(paddingLeft + timelineWidth, (int) f2), paddingTop + timelineHeight, false);
            next.m18536c(canvas, timelineHeight / l);
        }
        RectF a0 = C1410y.m37050a0();
        AbstractC11531p pVar = this.f21766s0;
        if (pVar != null) {
            i3 = pVar.mo92e(this.f21763p0);
            i2 = this.f21766s0.mo92e(this.f21764q0);
            i = this.f21766s0.mo92e(this.f21765r0);
        } else {
            i3 = C11524j.m228N(this.f21763p0);
            i2 = C11524j.m228N(this.f21764q0);
            i = C11524j.m228N(this.f21765r0);
        }
        int i10 = i3;
        int i11 = i2;
        int i12 = i;
        float f3 = timelineWidth;
        int o = paddingLeft + ((int) (this.f21757j0.m29538o() * f3));
        int o2 = paddingLeft + ((int) (f3 * this.f21758k0.m29538o()));
        int i13 = C1357a0.m37541i(2.0f);
        int i14 = C1357a0.m37541i(8.0f);
        float f4 = paddingTop;
        float f5 = i13 / 2.0f;
        int i15 = timelineHeight + paddingTop;
        float f6 = i15;
        a0.set(o - i14, f4 - f5, o2 + i14, f6 + f5);
        float f7 = a0.left;
        if (f7 > f) {
            i5 = o2;
            i6 = i14;
            i4 = i11;
            i7 = timelineWidth;
            canvas.drawRect(f, f4, f7, f6, C1410y.m37039g(i12));
        } else {
            i4 = i11;
            i5 = o2;
            i7 = timelineWidth;
            i6 = i14;
        }
        float f8 = a0.right;
        int i16 = paddingLeft + i7;
        float f9 = i16;
        if (f8 < f9) {
            i8 = i16;
            canvas.drawRect(f8, f4, f9, f6, C1410y.m37039g(i12));
        } else {
            i8 = i16;
        }
        canvas.drawRoundRect(a0, C1357a0.m37541i(2.0f), C1357a0.m37541i(2.0f), C1410y.m37077D0(i10));
        float f10 = a0.left;
        float f11 = i6;
        canvas.drawRect(f10 + f5, a0.top + f5, f10 + f11, a0.bottom - f5, C1410y.m37039g(i10));
        float f12 = a0.right;
        canvas.drawRect(f12 - f11, a0.top + f5, f12 - f5, a0.bottom - f5, C1410y.m37039g(i10));
        float centerY = a0.centerY();
        float f13 = (i6 + i13) / 2.0f;
        float f14 = o - f13;
        canvas.save();
        canvas.scale(0.6f, 0.6f, f14 - C1357a0.m37541i(5.0f), centerY);
        int i17 = i4;
        C1359b.m37508k(canvas, f14, centerY, i17, 3);
        canvas.restore();
        float f15 = i5 + f13;
        canvas.save();
        canvas.scale(0.6f, 0.6f, C1357a0.m37541i(5.0f) + f15, centerY);
        C1359b.m37508k(canvas, f15, centerY, i17, 5);
        canvas.restore();
        float g = this.f21767t0.m29584g();
        if (g > 0.0f) {
            double d = this.f21748b0;
            if (d != -1.0d) {
                double d2 = this.f21750c0;
                if (d2 != -1.0d) {
                    double d3 = i7;
                    double d4 = this.f21739R;
                    paddingLeft = ((int) ((d / d4) * d3)) + paddingLeft;
                    i9 = paddingLeft + ((int) (d3 * (d2 / d4)));
                    int max = Math.max(paddingLeft, Math.min(i9, ((int) ((i9 - paddingLeft) * this.f21769v0)) + paddingLeft));
                    int a = C5064d.m24131a(g, i10);
                    int i18 = C1357a0.m37541i(2.0f);
                    int min = Math.min((getPaddingBottom() / 2) - C1357a0.m37526x(), C1357a0.m37541i(3.0f));
                    int addPaddingVertical = (paddingTop - getAddPaddingVertical()) - C1357a0.m37526x();
                    int addPaddingVertical2 = i15 + getAddPaddingVertical();
                    int a2 = C5064d.m24131a(g, -16777216);
                    float f16 = max;
                    float f17 = addPaddingVertical;
                    float f18 = addPaddingVertical2;
                    canvas.drawLine(f16, f17, f16, f18, C1410y.m37053Y(a2, C1357a0.m37526x() + i18));
                    float f19 = addPaddingVertical2 + min;
                    canvas.drawCircle(f16, f19, C1357a0.m37526x() + min, C1410y.m37039g(a2));
                    float g2 = (this.f21768u0.m29584g() * 0.5f) + 0.5f;
                    canvas.drawLine(f16, f17, f16, f18, C1410y.m37053Y(C5064d.m24131a(g2, a), i18));
                    canvas.drawCircle(f16, f19, min, C1410y.m37039g(C5064d.m24131a(g2, a)));
                }
            }
            i9 = i8;
            int max2 = Math.max(paddingLeft, Math.min(i9, ((int) ((i9 - paddingLeft) * this.f21769v0)) + paddingLeft));
            int a3 = C5064d.m24131a(g, i10);
            int i182 = C1357a0.m37541i(2.0f);
            int min2 = Math.min((getPaddingBottom() / 2) - C1357a0.m37526x(), C1357a0.m37541i(3.0f));
            int addPaddingVertical3 = (paddingTop - getAddPaddingVertical()) - C1357a0.m37526x();
            int addPaddingVertical22 = i15 + getAddPaddingVertical();
            int a22 = C5064d.m24131a(g, -16777216);
            float f162 = max2;
            float f172 = addPaddingVertical3;
            float f182 = addPaddingVertical22;
            canvas.drawLine(f162, f172, f162, f182, C1410y.m37053Y(a22, C1357a0.m37526x() + i182));
            float f192 = addPaddingVertical22 + min2;
            canvas.drawCircle(f162, f192, C1357a0.m37526x() + min2, C1410y.m37039g(a22));
            float g22 = (this.f21768u0.m29584g() * 0.5f) + 0.5f;
            canvas.drawLine(f162, f172, f162, f182, C1410y.m37053Y(C5064d.m24131a(g22, a3), i182));
            canvas.drawCircle(f162, f192, min2, C1410y.m37039g(C5064d.m24131a(g22, a3)));
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setFrameCount((int) Math.ceil((getTimelineWidth() / getTimelineHeight()) * 1.2f));
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: me.C6890g4.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final double m18549p(boolean z) {
        return this.f21752e0 ? z ? getCurrentEnd() : getCurrentStart() : z ? this.f21750c0 : this.f21748b0;
    }

    public void setCurrentTime(double d) {
        if (this.f21744W != d) {
            this.f21744W = d;
            invalidate();
        }
    }

    public void setDelegate(AbstractC6893c cVar) {
        this.f21746a0 = cVar;
    }

    public void setForcedTheme(AbstractC11531p pVar) {
        if (this.f21766s0 != pVar) {
            this.f21766s0 = pVar;
            invalidate();
        }
    }

    public void setSliderProgress(float f) {
        if (this.f21769v0 == f) {
            return;
        }
        if (!this.f21752e0 || this.f21751d0 != 3) {
            this.f21769v0 = f;
            invalidate();
        }
    }

    public final void setVideoPath(String str) {
        m18567F(str, 0.0f, 1.0f, -1.0d, -1.0d, 0.0d, false);
    }

    public final C9357x2.AbstractC9363f m18542w(int i) {
        if (i == 1) {
            C9357x2.AbstractC9363f fVar = this.f21756i0;
            if (fVar != null) {
                return fVar;
            }
            C9357x2.AbstractC9363f e4Var = new C9357x2.AbstractC9363f() {
                @Override
                public final void mo8098f1(View view, Rect rect) {
                    C6890g4.this.m18547r(view, rect);
                }
            };
            this.f21756i0 = e4Var;
            return e4Var;
        } else if (i != 2) {
            return null;
        } else {
            C9357x2.AbstractC9363f fVar2 = this.f21755h0;
            if (fVar2 != null) {
                return fVar2;
            }
            C9357x2.AbstractC9363f f4Var = new C9357x2.AbstractC9363f() {
                @Override
                public final void mo8098f1(View view, Rect rect) {
                    C6890g4.this.m18548q(view, rect);
                }
            };
            this.f21755h0 = f4Var;
            return f4Var;
        }
    }

    public final void m18541x(boolean z) {
        double d;
        if (this.f21737P != null) {
            double d2 = 0.0d;
            if (this.f21739R > 0.0d) {
                if (z) {
                    this.f21757j0.m29542k();
                    double d3 = this.f21748b0;
                    if (d3 != -1.0d) {
                        d2 = d3;
                    }
                    d = this.f21737P.m23061b(d2, getCurrentEnd(), true);
                    this.f21758k0.m29544i((float) (d / this.f21739R));
                } else {
                    this.f21758k0.m29542k();
                    double d4 = this.f21750c0;
                    d = d4 == -1.0d ? this.f21739R : d4;
                    d2 = this.f21737P.m23060c(getCurrentStart(), d, true);
                    this.f21757j0.m29544i((float) (d2 / this.f21739R));
                }
                double d5 = d;
                double d6 = d2;
                if (!(this.f21748b0 == d6 && this.f21750c0 == d5)) {
                    this.f21748b0 = d6;
                    this.f21750c0 = d5;
                    AbstractC6893c cVar = this.f21746a0;
                    if (cVar != null) {
                        cVar.mo6834e(this, this.f21739R, d6, d5);
                    }
                }
                m18565H(z);
                C9357x2.C9370l lVar = z ? this.f21760m0 : this.f21759l0;
                if (lVar != null) {
                    lVar.m8916I(true, 1L, TimeUnit.SECONDS);
                }
            }
        }
    }

    public final void m18543v(String str) {
        if (!C5070i.m24067c(this.f21738Q, str)) {
            C5373y yVar = this.f21737P;
            if (yVar != null) {
                yVar.m23043t();
                this.f21738Q = null;
            }
            this.f21738Q = str;
            if (!C5070i.m24061i(str)) {
                try {
                    C5373y yVar2 = new C5373y(str);
                    this.f21737P = yVar2;
                    this.f21739R = yVar2.m23049n();
                    this.f21740S = this.f21737P.m23048o();
                    this.f21741T = this.f21737P.m23052k();
                    this.f21742U = this.f21737P.m23053j();
                    this.f21743V = this.f21737P.m23055h();
                    this.f21747b.post(new Runnable() {
                        @Override
                        public final void run() {
                            C6890g4.this.m18544u();
                        }
                    });
                } catch (Throwable unused) {
                    m18543v(null);
                }
            }
        }
    }

    public final void m18539z(p139jb.AbstractRunnableC5910b r12, java.lang.String r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: me.C6890g4.m18539z(jb.b, java.lang.String, int, int):void");
    }
}
