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
    public int f21737M;
    public String f21738N;
    public AbstractRunnableC5910b f21739O;
    public C5373y f21740P;
    public String f21741Q;
    public double f21742R;
    public double f21743S;
    public double f21744T;
    public int f21745U;
    public long f21746V;
    public AbstractC6893c f21749a0;
    public int f21754d0;
    public boolean f21755e0;
    public float f21756f0;
    public float f21757g0;
    public C9357x2.AbstractC9363f f21758h0;
    public C9357x2.AbstractC9363f f21759i0;
    public final C3950k f21760j0;
    public final C3950k f21761k0;
    public C9357x2.C9370l f21762l0;
    public C9357x2.C9370l f21763m0;
    public AbstractC11531p f21769s0;
    public C3940f f21770t0;
    public final C3940f f21771u0;
    public float f21772v0;
    public final ArrayList<C6892b> f21748a = new ArrayList<>();
    public final HandlerC6894d f21750b = new HandlerC6894d(this);
    public final Rect f21752c = new Rect();
    public double f21747W = -1.0d;
    public double f21751b0 = -1.0d;
    public double f21753c0 = -1.0d;
    public long f21764n0 = -1;
    public long f21765o0 = -1;
    public int f21766p0 = R.id.theme_color_sliderActive;
    public int f21767q0 = R.id.theme_color_filling;
    public int f21768r0 = R.id.theme_color_previewBackground;

    public class C6891a extends AbstractRunnableC5910b {
        public final String f21773M;
        public final int f21774N;
        public final int f21775O;

        public C6891a(String str, int i, int i2) {
            this.f21773M = str;
            this.f21774N = i;
            this.f21775O = i2;
        }

        @Override
        public void mo1364b() {
            C6890g4.this.m18539z(this, this.f21773M, this.f21774N, this.f21775O);
        }
    }

    public static class C6892b implements C3950k.AbstractC3952b {
        public int f21777M;
        public int f21778N;
        public int f21779O;
        public int f21780P;
        public float f21781Q;
        public final C3950k f21782R = new C3950k(0, this, C2057b.f7280b, 120);
        public boolean f21783S;
        public final C6890g4 f21784a;
        public final String f21785b;
        public final Bitmap f21786c;

        public C6892b(C6890g4 g4Var, String str, Bitmap bitmap) {
            this.f21784a = g4Var;
            this.f21785b = str;
            this.f21786c = bitmap;
        }

        @Override
        public void mo45P5(int i, float f, float f2, C3950k kVar) {
            if (this.f21781Q != f) {
                this.f21781Q = f;
                m18535d();
            }
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
        }

        public void m18537b() {
            if (this.f21782R.m29533v()) {
                this.f21782R.m29544k();
            }
            Bitmap bitmap = this.f21786c;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f21786c.recycle();
            }
        }

        public void m18536c(Canvas canvas, float f) {
            Bitmap bitmap;
            if (this.f21781Q > 0.0f && (bitmap = this.f21786c) != null && !bitmap.isRecycled()) {
                Rect Z = C1410y.m37055Z();
                int width = this.f21786c.getWidth() / 2;
                int height = this.f21786c.getHeight() / 2;
                int max = (int) ((width / 2) * Math.max(1.0f, f));
                int max2 = (int) ((height / 2) * Math.max(1.0f, f));
                this.f21784a.f21752c.set(width - max, height - max2, width + max, height + max2);
                canvas.save();
                int i = this.f21779O - this.f21777M;
                int i2 = this.f21780P - this.f21778N;
                float width2 = this.f21786c.getWidth();
                float height2 = this.f21786c.getHeight();
                float max3 = Math.max(i / width2, i2 / height2);
                int i3 = (int) (width2 * max3);
                int i4 = (int) (height2 * max3);
                int i5 = (this.f21777M + this.f21779O) / 2;
                int i6 = (this.f21778N + this.f21780P) / 2;
                int i7 = i3 / 2;
                int i8 = i4 / 2;
                Z.set(i5 - i7, i6 - i8, i7 + i5, i8 + i6);
                canvas.clipRect(this.f21777M, this.f21778N, this.f21779O, this.f21780P);
                Paint j = C1410y.m37036j();
                float f2 = this.f21781Q;
                if (f2 < 1.0f) {
                    j.setAlpha((int) (f2 * 255.0f));
                    float f3 = (this.f21781Q * 0.4f) + 0.6f;
                    canvas.scale(f3, f3, i5, i6);
                }
                canvas.drawBitmap(this.f21786c, this.f21784a.f21752c, Z, j);
                if (this.f21781Q < 1.0f) {
                    j.setAlpha(255);
                }
                canvas.restore();
            }
        }

        public final void m18535d() {
            int i = this.f21777M;
            if (i != 0 || this.f21778N != 0 || this.f21779O != 0 || this.f21780P != 0) {
                this.f21784a.invalidate(i, this.f21778N, this.f21779O, this.f21780P);
            }
        }

        public void m18534e() {
            if (!this.f21783S) {
                this.f21783S = true;
                this.f21782R.m29546i(1.0f);
            }
        }

        public void m18533f(int i, int i2, int i3, int i4, boolean z) {
            if (this.f21777M != i || this.f21778N != i2 || this.f21779O != i3 || this.f21780P != i4) {
                this.f21777M = i;
                this.f21778N = i2;
                this.f21779O = i3;
                this.f21780P = i4;
                if (z && this.f21781Q > 0.0f) {
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
        public final C6890g4 f21787a;

        public HandlerC6894d(C6890g4 g4Var) {
            this.f21787a = g4Var;
        }

        @Override
        public void handleMessage(Message message) {
            if (message.what == 0) {
                this.f21787a.m18555j(message.arg1, (C6892b) message.obj);
            }
        }
    }

    public C6890g4(Context context) {
        super(context);
        DecelerateInterpolator decelerateInterpolator = C2057b.f7280b;
        this.f21760j0 = new C3950k(0, this, decelerateInterpolator, 180L, 0.0f);
        this.f21761k0 = new C3950k(1, this, decelerateInterpolator, 180L, 1.0f);
        this.f21770t0 = new C3940f(1, new C3950k.AbstractC3952b() {
            @Override
            public final void mo45P5(int i, float f, float f2, C3950k kVar) {
                C6890g4.this.m18546s(i, f, f2, kVar);
            }

            @Override
            public void mo35Y0(int i, float f, C3950k kVar) {
                C3953l.m29528a(this, i, f, kVar);
            }
        }, decelerateInterpolator, 180L);
        this.f21771u0 = new C3940f(1, new C3950k.AbstractC3952b() {
            @Override
            public final void mo45P5(int i, float f, float f2, C3950k kVar) {
                C6890g4.this.m18545t(i, f, f2, kVar);
            }

            @Override
            public void mo35Y0(int i, float f, C3950k kVar) {
                C3953l.m29528a(this, i, f, kVar);
            }
        }, decelerateInterpolator, 180L);
    }

    private int getAddPaddingHorizontal() {
        return C1357a0.m37544i(8.0f) + C1357a0.m37544i(2.0f);
    }

    private int getAddPaddingVertical() {
        return C1357a0.m37544i(2.0f);
    }

    private double getCurrentEnd() {
        return this.f21742R * this.f21761k0.m29540o();
    }

    private double getCurrentStart() {
        return this.f21742R * this.f21760j0.m29540o();
    }

    private void getFramesIfNeeded() {
        m18552m();
        if (!C5070i.m24062i(this.f21738N) && this.f21737M > 0) {
            m18551n();
            this.f21739O = new C6891a(this.f21738N, this.f21737M, (int) (getTimelineHeight() * Math.min(2.0f, Math.max(1.0f, C1357a0.m37545h()))));
            C7907b.m14361k().m14360l(this.f21739O);
        }
    }

    private int getTimelineHeight() {
        return ((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - (getAddPaddingVertical() * 2);
    }

    private int getTimelineWidth() {
        return ((getMeasuredWidth() - getPaddingRight()) - getPaddingLeft()) - (getAddPaddingHorizontal() * 2);
    }

    public void m18548q(View view, Rect rect) {
        int paddingLeft = (int) (getPaddingLeft() + getAddPaddingHorizontal() + (this.f21761k0.m29540o() * getTimelineWidth()));
        rect.left = paddingLeft;
        rect.right = paddingLeft + getAddPaddingHorizontal();
        rect.top = getPaddingTop() - getAddPaddingVertical();
        rect.bottom = (getMeasuredHeight() - getPaddingBottom()) + getAddPaddingVertical();
    }

    public void m18547r(View view, Rect rect) {
        int paddingLeft = (int) (getPaddingLeft() + getAddPaddingHorizontal() + (this.f21760j0.m29540o() * getTimelineWidth()));
        rect.right = paddingLeft;
        rect.left = paddingLeft - getAddPaddingHorizontal();
        rect.top = getPaddingTop() - getAddPaddingVertical();
        rect.bottom = (getMeasuredHeight() - getPaddingBottom()) + getAddPaddingVertical();
    }

    public void m18546s(int i, float f, float f2, C3950k kVar) {
        invalidate();
    }

    private void setFrameCount(int i) {
        if (this.f21737M != i) {
            this.f21737M = i;
            getFramesIfNeeded();
        }
    }

    private void setSlideMode(int i) {
        if (this.f21754d0 != i) {
            boolean z = i != 0;
            this.f21754d0 = i;
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public void m18545t(int i, float f, float f2, C3950k kVar) {
        invalidate();
    }

    public void m18544u() {
        this.f21749a0.mo6838a(this, this.f21742R, this.f21743S, this.f21744T, this.f21745U, this.f21746V);
    }

    public void m18572A(boolean z, boolean z2) {
        this.f21771u0.m29577p(z, z2 && this.f21770t0.m29586g() > 0.0f);
    }

    public void m18571B(int i, int i2, int i3) {
        if (this.f21766p0 != i || this.f21767q0 != i2 || this.f21768r0 != i3) {
            this.f21766p0 = i;
            this.f21767q0 = i2;
            this.f21768r0 = i3;
            invalidate();
        }
    }

    public final boolean m18570C(boolean z, boolean z2) {
        if (this.f21755e0 != z) {
            this.f21755e0 = z;
            AbstractC6893c cVar = this.f21749a0;
            if (cVar != null && z2) {
                cVar.mo6837b(this, z);
            }
        }
        return z;
    }

    public void m18569D(boolean z, boolean z2) {
        this.f21770t0.m29577p(z, z2);
    }

    public final void m18568E(float f, float f2, boolean z) {
        if (this.f21755e0) {
            m18570C(false, true);
        }
        if (z) {
            this.f21760j0.m29546i(f);
            this.f21761k0.m29546i(f2);
            return;
        }
        this.f21760j0.m29543l(f);
        this.f21761k0.m29543l(f2);
    }

    public final void m18567F(final String str, float f, float f2, double d, double d2, double d3, boolean z) {
        this.f21751b0 = d;
        this.f21753c0 = d2;
        if (!C5070i.m24068c(this.f21738N, str)) {
            this.f21738N = str;
            this.f21742R = d3;
            C7907b.m14361k().m14360l(new Runnable() {
                @Override
                public final void run() {
                    C6890g4.this.m18543v(str);
                }
            });
            if (C5070i.m24062i(str)) {
                m18551n();
            } else {
                getFramesIfNeeded();
            }
        }
        m18568E(f, f2, z);
    }

    public final void m18566G() {
        int i = this.f21754d0;
        boolean z = true;
        if (i == 2 || i == 1) {
            if (i != 2) {
                z = false;
            }
            C9357x2.C9370l lVar = z ? this.f21763m0 : this.f21762l0;
            if (lVar == null) {
                AbstractView$OnTouchListenerC7889a r = C1379j0.m37310r(getContext());
                C9357x2.C9370l D = r.m14584H3().m8985g(this).m8948u(m18542w(this.f21754d0)).m8960g(this.f21769s0 != null ? r.m14584H3().m8979m(this.f21769s0) : null).m8971D(null, m18554k(z));
                if (z) {
                    this.f21763m0 = D;
                } else {
                    this.f21762l0 = D;
                }
            } else {
                lVar.m8902W(null, m18554k(z), 0);
                lVar.m8900Y();
            }
        }
    }

    public final void m18565H(boolean z) {
        C9357x2.C9370l lVar = z ? this.f21763m0 : this.f21762l0;
        if (lVar != null) {
            if (Math.round(m18549p(z) * 10000.0d) != (z ? this.f21765o0 : this.f21764n0)) {
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
            C9357x2.C9370l lVar = i == 1 ? this.f21763m0 : this.f21762l0;
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
        if (C5070i.m24068c(bVar.f21785b, this.f21738N) && this.f21737M == i) {
            int size = this.f21748a.size();
            this.f21748a.add(bVar);
            float l = m18553l();
            int i2 = (int) (size * l);
            bVar.m18533f(i2, 0, (int) (i2 + l), getTimelineHeight(), true);
            bVar.m18534e();
        }
    }

    public final String m18554k(boolean z) {
        double p = m18549p(z);
        StringBuilder sb2 = new StringBuilder();
        C1363c0.m37434i(Math.round(1000.0d * p), TimeUnit.MILLISECONDS, true, sb2);
        long round = Math.round(p * 10000.0d);
        if (z) {
            this.f21765o0 = round;
        } else {
            this.f21764n0 = round;
        }
        return sb2.toString();
    }

    public final float m18553l() {
        if (this.f21737M > 0) {
            return getTimelineWidth() / this.f21737M;
        }
        return 0.0f;
    }

    public final void m18552m() {
        AbstractRunnableC5910b bVar = this.f21739O;
        if (bVar != null) {
            bVar.m21858c();
            this.f21739O = null;
        }
    }

    public final void m18551n() {
        Iterator<C6892b> it = this.f21748a.iterator();
        while (it.hasNext()) {
            it.next().m18537b();
        }
        this.f21748a.clear();
        invalidate();
    }

    public final void m18550o(int i, C6892b bVar) {
        HandlerC6894d dVar = this.f21750b;
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
        Iterator<C6892b> it = this.f21748a.iterator();
        float f2 = f;
        while (it.hasNext()) {
            C6892b next = it.next();
            f2 += l;
            it = it;
            next.m18533f(Math.max(paddingLeft, (int) f2), paddingTop, Math.min(paddingLeft + timelineWidth, (int) f2), paddingTop + timelineHeight, false);
            next.m18536c(canvas, timelineHeight / l);
        }
        RectF a0 = C1410y.m37053a0();
        AbstractC11531p pVar = this.f21769s0;
        if (pVar != null) {
            i3 = pVar.mo92e(this.f21766p0);
            i2 = this.f21769s0.mo92e(this.f21767q0);
            i = this.f21769s0.mo92e(this.f21768r0);
        } else {
            i3 = C11524j.m228N(this.f21766p0);
            i2 = C11524j.m228N(this.f21767q0);
            i = C11524j.m228N(this.f21768r0);
        }
        int i10 = i3;
        int i11 = i2;
        int i12 = i;
        float f3 = timelineWidth;
        int o = paddingLeft + ((int) (this.f21760j0.m29540o() * f3));
        int o2 = paddingLeft + ((int) (f3 * this.f21761k0.m29540o()));
        int i13 = C1357a0.m37544i(2.0f);
        int i14 = C1357a0.m37544i(8.0f);
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
            canvas.drawRect(f, f4, f7, f6, C1410y.m37042g(i12));
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
            canvas.drawRect(f8, f4, f9, f6, C1410y.m37042g(i12));
        } else {
            i8 = i16;
        }
        canvas.drawRoundRect(a0, C1357a0.m37544i(2.0f), C1357a0.m37544i(2.0f), C1410y.m37080D0(i10));
        float f10 = a0.left;
        float f11 = i6;
        canvas.drawRect(f10 + f5, a0.top + f5, f10 + f11, a0.bottom - f5, C1410y.m37042g(i10));
        float f12 = a0.right;
        canvas.drawRect(f12 - f11, a0.top + f5, f12 - f5, a0.bottom - f5, C1410y.m37042g(i10));
        float centerY = a0.centerY();
        float f13 = (i6 + i13) / 2.0f;
        float f14 = o - f13;
        canvas.save();
        canvas.scale(0.6f, 0.6f, f14 - C1357a0.m37544i(5.0f), centerY);
        int i17 = i4;
        C1359b.m37511k(canvas, f14, centerY, i17, 3);
        canvas.restore();
        float f15 = i5 + f13;
        canvas.save();
        canvas.scale(0.6f, 0.6f, C1357a0.m37544i(5.0f) + f15, centerY);
        C1359b.m37511k(canvas, f15, centerY, i17, 5);
        canvas.restore();
        float g = this.f21770t0.m29586g();
        if (g > 0.0f) {
            double d = this.f21751b0;
            if (d != -1.0d) {
                double d2 = this.f21753c0;
                if (d2 != -1.0d) {
                    double d3 = i7;
                    double d4 = this.f21742R;
                    paddingLeft = ((int) ((d / d4) * d3)) + paddingLeft;
                    i9 = paddingLeft + ((int) (d3 * (d2 / d4)));
                    int max = Math.max(paddingLeft, Math.min(i9, ((int) ((i9 - paddingLeft) * this.f21772v0)) + paddingLeft));
                    int a = C5064d.m24132a(g, i10);
                    int i18 = C1357a0.m37544i(2.0f);
                    int min = Math.min((getPaddingBottom() / 2) - C1357a0.m37529x(), C1357a0.m37544i(3.0f));
                    int addPaddingVertical = (paddingTop - getAddPaddingVertical()) - C1357a0.m37529x();
                    int addPaddingVertical2 = i15 + getAddPaddingVertical();
                    int a2 = C5064d.m24132a(g, -16777216);
                    float f16 = max;
                    float f17 = addPaddingVertical;
                    float f18 = addPaddingVertical2;
                    canvas.drawLine(f16, f17, f16, f18, C1410y.m37056Y(a2, C1357a0.m37529x() + i18));
                    float f19 = addPaddingVertical2 + min;
                    canvas.drawCircle(f16, f19, C1357a0.m37529x() + min, C1410y.m37042g(a2));
                    float g2 = (this.f21771u0.m29586g() * 0.5f) + 0.5f;
                    canvas.drawLine(f16, f17, f16, f18, C1410y.m37056Y(C5064d.m24132a(g2, a), i18));
                    canvas.drawCircle(f16, f19, min, C1410y.m37042g(C5064d.m24132a(g2, a)));
                }
            }
            i9 = i8;
            int max2 = Math.max(paddingLeft, Math.min(i9, ((int) ((i9 - paddingLeft) * this.f21772v0)) + paddingLeft));
            int a3 = C5064d.m24132a(g, i10);
            int i182 = C1357a0.m37544i(2.0f);
            int min2 = Math.min((getPaddingBottom() / 2) - C1357a0.m37529x(), C1357a0.m37544i(3.0f));
            int addPaddingVertical3 = (paddingTop - getAddPaddingVertical()) - C1357a0.m37529x();
            int addPaddingVertical22 = i15 + getAddPaddingVertical();
            int a22 = C5064d.m24132a(g, -16777216);
            float f162 = max2;
            float f172 = addPaddingVertical3;
            float f182 = addPaddingVertical22;
            canvas.drawLine(f162, f172, f162, f182, C1410y.m37056Y(a22, C1357a0.m37529x() + i182));
            float f192 = addPaddingVertical22 + min2;
            canvas.drawCircle(f162, f192, C1357a0.m37529x() + min2, C1410y.m37042g(a22));
            float g22 = (this.f21771u0.m29586g() * 0.5f) + 0.5f;
            canvas.drawLine(f162, f172, f162, f182, C1410y.m37056Y(C5064d.m24132a(g22, a3), i182));
            canvas.drawCircle(f162, f192, min2, C1410y.m37042g(C5064d.m24132a(g22, a3)));
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
        return this.f21755e0 ? z ? getCurrentEnd() : getCurrentStart() : z ? this.f21753c0 : this.f21751b0;
    }

    public void setCurrentTime(double d) {
        if (this.f21747W != d) {
            this.f21747W = d;
            invalidate();
        }
    }

    public void setDelegate(AbstractC6893c cVar) {
        this.f21749a0 = cVar;
    }

    public void setForcedTheme(AbstractC11531p pVar) {
        if (this.f21769s0 != pVar) {
            this.f21769s0 = pVar;
            invalidate();
        }
    }

    public void setSliderProgress(float f) {
        if (this.f21772v0 == f) {
            return;
        }
        if (!this.f21755e0 || this.f21754d0 != 3) {
            this.f21772v0 = f;
            invalidate();
        }
    }

    public final void setVideoPath(String str) {
        m18567F(str, 0.0f, 1.0f, -1.0d, -1.0d, 0.0d, false);
    }

    public final C9357x2.AbstractC9363f m18542w(int i) {
        if (i == 1) {
            C9357x2.AbstractC9363f fVar = this.f21759i0;
            if (fVar != null) {
                return fVar;
            }
            C9357x2.AbstractC9363f e4Var = new C9357x2.AbstractC9363f() {
                @Override
                public final void mo8098f1(View view, Rect rect) {
                    C6890g4.this.m18547r(view, rect);
                }
            };
            this.f21759i0 = e4Var;
            return e4Var;
        } else if (i != 2) {
            return null;
        } else {
            C9357x2.AbstractC9363f fVar2 = this.f21758h0;
            if (fVar2 != null) {
                return fVar2;
            }
            C9357x2.AbstractC9363f f4Var = new C9357x2.AbstractC9363f() {
                @Override
                public final void mo8098f1(View view, Rect rect) {
                    C6890g4.this.m18548q(view, rect);
                }
            };
            this.f21758h0 = f4Var;
            return f4Var;
        }
    }

    public final void m18541x(boolean z) {
        double d;
        if (this.f21740P != null) {
            double d2 = 0.0d;
            if (this.f21742R > 0.0d) {
                if (z) {
                    this.f21760j0.m29544k();
                    double d3 = this.f21751b0;
                    if (d3 != -1.0d) {
                        d2 = d3;
                    }
                    d = this.f21740P.m23062b(d2, getCurrentEnd(), true);
                    this.f21761k0.m29546i((float) (d / this.f21742R));
                } else {
                    this.f21761k0.m29544k();
                    double d4 = this.f21753c0;
                    d = d4 == -1.0d ? this.f21742R : d4;
                    d2 = this.f21740P.m23061c(getCurrentStart(), d, true);
                    this.f21760j0.m29546i((float) (d2 / this.f21742R));
                }
                double d5 = d;
                double d6 = d2;
                if (!(this.f21751b0 == d6 && this.f21753c0 == d5)) {
                    this.f21751b0 = d6;
                    this.f21753c0 = d5;
                    AbstractC6893c cVar = this.f21749a0;
                    if (cVar != null) {
                        cVar.mo6834e(this, this.f21742R, d6, d5);
                    }
                }
                m18565H(z);
                C9357x2.C9370l lVar = z ? this.f21763m0 : this.f21762l0;
                if (lVar != null) {
                    lVar.m8916I(true, 1L, TimeUnit.SECONDS);
                }
            }
        }
    }

    public final void m18543v(String str) {
        if (!C5070i.m24068c(this.f21741Q, str)) {
            C5373y yVar = this.f21740P;
            if (yVar != null) {
                yVar.m23044t();
                this.f21741Q = null;
            }
            this.f21741Q = str;
            if (!C5070i.m24062i(str)) {
                try {
                    C5373y yVar2 = new C5373y(str);
                    this.f21740P = yVar2;
                    this.f21742R = yVar2.m23050n();
                    this.f21743S = this.f21740P.m23049o();
                    this.f21744T = this.f21740P.m23053k();
                    this.f21745U = this.f21740P.m23054j();
                    this.f21746V = this.f21740P.m23056h();
                    this.f21750b.post(new Runnable() {
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
