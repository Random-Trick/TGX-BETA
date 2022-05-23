package ne;

import ae.j;
import ae.p;
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
import ce.a0;
import ce.c0;
import ce.j0;
import eb.f;
import eb.k;
import eb.l;
import ib.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import jd.y;
import org.thunderdog.challegram.R;
import ud.x2;

public class f4 extends View implements kb.c, k.b {
    public int M;
    public String N;
    public kb.b O;
    public y P;
    public String Q;
    public double R;
    public double S;
    public double T;
    public int U;
    public long V;
    public c f17994a0;
    public int f17999d0;
    public boolean f18000e0;
    public float f18001f0;
    public float f18002g0;
    public x2.f f18003h0;
    public x2.f f18004i0;
    public final k f18005j0;
    public final k f18006k0;
    public x2.l f18007l0;
    public x2.l f18008m0;
    public p f18014s0;
    public f f18015t0;
    public final f f18016u0;
    public float f18017v0;
    public final ArrayList<b> f17993a = new ArrayList<>();
    public final d f17995b = new d(this);
    public final Rect f17997c = new Rect();
    public double W = -1.0d;
    public double f17996b0 = -1.0d;
    public double f17998c0 = -1.0d;
    public long f18009n0 = -1;
    public long f18010o0 = -1;
    public int f18011p0 = R.id.theme_color_sliderActive;
    public int f18012q0 = R.id.theme_color_filling;
    public int f18013r0 = R.id.theme_color_previewBackground;

    public class a extends kb.b {
        public final String M;
        public final int N;
        public final int O;

        public a(String str, int i10, int i11) {
            this.M = str;
            this.N = i10;
            this.O = i11;
        }

        @Override
        public void b() {
            f4.this.z(this, this.M, this.N, this.O);
        }
    }

    public static class b implements k.b {
        public int M;
        public int N;
        public int O;
        public int P;
        public float Q;
        public final k R = new k(0, this, db.b.f7287b, 120);
        public boolean S;
        public final f4 f18018a;
        public final String f18019b;
        public final Bitmap f18020c;

        public b(f4 f4Var, String str, Bitmap bitmap) {
            this.f18018a = f4Var;
            this.f18019b = str;
            this.f18020c = bitmap;
        }

        public void b() {
            if (this.R.v()) {
                this.R.k();
            }
            Bitmap bitmap = this.f18020c;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f18020c.recycle();
            }
        }

        public void c(Canvas canvas, float f10) {
            Bitmap bitmap;
            if (this.Q > 0.0f && (bitmap = this.f18020c) != null && !bitmap.isRecycled()) {
                Rect Z = ce.y.Z();
                int width = this.f18020c.getWidth() / 2;
                int height = this.f18020c.getHeight() / 2;
                int max = (int) ((width / 2) * Math.max(1.0f, f10));
                int max2 = (int) ((height / 2) * Math.max(1.0f, f10));
                this.f18018a.f17997c.set(width - max, height - max2, width + max, height + max2);
                canvas.save();
                int i10 = this.O - this.M;
                int i11 = this.P - this.N;
                float width2 = this.f18020c.getWidth();
                float height2 = this.f18020c.getHeight();
                float max3 = Math.max(i10 / width2, i11 / height2);
                int i12 = (int) (width2 * max3);
                int i13 = (int) (height2 * max3);
                int i14 = (this.M + this.O) / 2;
                int i15 = (this.N + this.P) / 2;
                int i16 = i12 / 2;
                int i17 = i13 / 2;
                Z.set(i14 - i16, i15 - i17, i16 + i14, i17 + i15);
                canvas.clipRect(this.M, this.N, this.O, this.P);
                Paint j10 = ce.y.j();
                float f11 = this.Q;
                if (f11 < 1.0f) {
                    j10.setAlpha((int) (f11 * 255.0f));
                    float f12 = (this.Q * 0.4f) + 0.6f;
                    canvas.scale(f12, f12, i14, i15);
                }
                canvas.drawBitmap(this.f18020c, this.f18018a.f17997c, Z, j10);
                if (this.Q < 1.0f) {
                    j10.setAlpha(255);
                }
                canvas.restore();
            }
        }

        public final void d() {
            int i10 = this.M;
            if (i10 != 0 || this.N != 0 || this.O != 0 || this.P != 0) {
                this.f18018a.invalidate(i10, this.N, this.O, this.P);
            }
        }

        public void e() {
            if (!this.S) {
                this.S = true;
                this.R.i(1.0f);
            }
        }

        public void f(int i10, int i11, int i12, int i13, boolean z10) {
            if (this.M != i10 || this.N != i11 || this.O != i12 || this.P != i13) {
                this.M = i10;
                this.N = i11;
                this.O = i12;
                this.P = i13;
                if (z10 && this.Q > 0.0f) {
                    d();
                }
            }
        }

        @Override
        public void n4(int i10, float f10, float f11, k kVar) {
            if (this.Q != f10) {
                this.Q = f10;
                d();
            }
        }

        @Override
        public void o4(int i10, float f10, k kVar) {
        }
    }

    public interface c {
        void a(f4 f4Var, double d10, double d11, double d12);

        void b(f4 f4Var, float f10);

        boolean c(f4 f4Var);

        void d(f4 f4Var, boolean z10);

        void e(f4 f4Var, double d10, double d11, double d12, int i10, long j10);
    }

    public static class d extends Handler {
        public final f4 f18021a;

        public d(f4 f4Var) {
            this.f18021a = f4Var;
        }

        @Override
        public void handleMessage(Message message) {
            if (message.what == 0) {
                this.f18021a.j(message.arg1, (b) message.obj);
            }
        }
    }

    public f4(Context context) {
        super(context);
        DecelerateInterpolator decelerateInterpolator = db.b.f7287b;
        this.f18005j0 = new k(0, this, decelerateInterpolator, 180L, 0.0f);
        this.f18006k0 = new k(1, this, decelerateInterpolator, 180L, 1.0f);
        this.f18015t0 = new f(1, new k.b() {
            @Override
            public final void n4(int i10, float f10, float f11, k kVar) {
                f4.this.s(i10, f10, f11, kVar);
            }

            @Override
            public void o4(int i10, float f10, k kVar) {
                l.a(this, i10, f10, kVar);
            }
        }, decelerateInterpolator, 180L);
        this.f18016u0 = new f(1, new k.b() {
            @Override
            public final void n4(int i10, float f10, float f11, k kVar) {
                f4.this.t(i10, f10, f11, kVar);
            }

            @Override
            public void o4(int i10, float f10, k kVar) {
                l.a(this, i10, f10, kVar);
            }
        }, decelerateInterpolator, 180L);
    }

    private int getAddPaddingHorizontal() {
        return a0.i(8.0f) + a0.i(2.0f);
    }

    private int getAddPaddingVertical() {
        return a0.i(2.0f);
    }

    private double getCurrentEnd() {
        return this.R * this.f18006k0.o();
    }

    private double getCurrentStart() {
        return this.R * this.f18005j0.o();
    }

    private void getFramesIfNeeded() {
        m();
        if (!i.i(this.N) && this.M > 0) {
            n();
            this.O = new a(this.N, this.M, (int) (getTimelineHeight() * Math.min(2.0f, Math.max(1.0f, a0.h()))));
            org.thunderdog.challegram.loader.b.k().l(this.O);
        }
    }

    private int getTimelineHeight() {
        return ((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - (getAddPaddingVertical() * 2);
    }

    private int getTimelineWidth() {
        return ((getMeasuredWidth() - getPaddingRight()) - getPaddingLeft()) - (getAddPaddingHorizontal() * 2);
    }

    public void q(View view, Rect rect) {
        int paddingLeft = (int) (getPaddingLeft() + getAddPaddingHorizontal() + (this.f18006k0.o() * getTimelineWidth()));
        rect.left = paddingLeft;
        rect.right = paddingLeft + getAddPaddingHorizontal();
        rect.top = getPaddingTop() - getAddPaddingVertical();
        rect.bottom = (getMeasuredHeight() - getPaddingBottom()) + getAddPaddingVertical();
    }

    public void r(View view, Rect rect) {
        int paddingLeft = (int) (getPaddingLeft() + getAddPaddingHorizontal() + (this.f18005j0.o() * getTimelineWidth()));
        rect.right = paddingLeft;
        rect.left = paddingLeft - getAddPaddingHorizontal();
        rect.top = getPaddingTop() - getAddPaddingVertical();
        rect.bottom = (getMeasuredHeight() - getPaddingBottom()) + getAddPaddingVertical();
    }

    public void s(int i10, float f10, float f11, k kVar) {
        invalidate();
    }

    private void setFrameCount(int i10) {
        if (this.M != i10) {
            this.M = i10;
            getFramesIfNeeded();
        }
    }

    private void setSlideMode(int i10) {
        if (this.f17999d0 != i10) {
            boolean z10 = i10 != 0;
            this.f17999d0 = i10;
            getParent().requestDisallowInterceptTouchEvent(z10);
        }
    }

    public void t(int i10, float f10, float f11, k kVar) {
        invalidate();
    }

    public void u() {
        this.f17994a0.e(this, this.R, this.S, this.T, this.U, this.V);
    }

    public void A(boolean z10, boolean z11) {
        this.f18016u0.p(z10, z11 && this.f18015t0.g() > 0.0f);
    }

    public void B(int i10, int i11, int i12) {
        if (this.f18011p0 != i10 || this.f18012q0 != i11 || this.f18013r0 != i12) {
            this.f18011p0 = i10;
            this.f18012q0 = i11;
            this.f18013r0 = i12;
            invalidate();
        }
    }

    public final boolean C(boolean z10, boolean z11) {
        if (this.f18000e0 != z10) {
            this.f18000e0 = z10;
            c cVar = this.f17994a0;
            if (cVar != null && z11) {
                cVar.d(this, z10);
            }
        }
        return z10;
    }

    public void D(boolean z10, boolean z11) {
        this.f18015t0.p(z10, z11);
    }

    public final void E(float f10, float f11, boolean z10) {
        if (this.f18000e0) {
            C(false, true);
        }
        if (z10) {
            this.f18005j0.i(f10);
            this.f18006k0.i(f11);
            return;
        }
        this.f18005j0.l(f10);
        this.f18006k0.l(f11);
    }

    public final void F(final String str, float f10, float f11, double d10, double d11, double d12, boolean z10) {
        this.f17996b0 = d10;
        this.f17998c0 = d11;
        if (!i.c(this.N, str)) {
            this.N = str;
            this.R = d12;
            org.thunderdog.challegram.loader.b.k().l(new Runnable() {
                @Override
                public final void run() {
                    f4.this.v(str);
                }
            });
            if (i.i(str)) {
                n();
            } else {
                getFramesIfNeeded();
            }
        }
        E(f10, f11, z10);
    }

    public final void G() {
        int i10 = this.f17999d0;
        boolean z10 = true;
        if (i10 == 2 || i10 == 1) {
            if (i10 != 2) {
                z10 = false;
            }
            x2.l lVar = z10 ? this.f18008m0 : this.f18007l0;
            if (lVar == null) {
                org.thunderdog.challegram.a r10 = j0.r(getContext());
                x2.l D = r10.I3().g(this).u(w(this.f17999d0)).g(this.f18014s0 != null ? r10.I3().m(this.f18014s0) : null).D(null, k(z10));
                if (z10) {
                    this.f18008m0 = D;
                } else {
                    this.f18007l0 = D;
                }
            } else {
                lVar.W(null, k(z10), 0);
                lVar.Y();
            }
        }
    }

    public final void H(boolean z10) {
        x2.l lVar = z10 ? this.f18008m0 : this.f18007l0;
        if (lVar != null) {
            if (Math.round(p(z10) * 10000.0d) != (z10 ? this.f18010o0 : this.f18009n0)) {
                lVar.W(null, k(z10), 0);
            }
            lVar.U();
        }
    }

    @Override
    public void Q2() {
        setVideoPath(null);
    }

    public final void j(int i10, b bVar) {
        if (i.c(bVar.f18019b, this.N) && this.M == i10) {
            int size = this.f17993a.size();
            this.f17993a.add(bVar);
            float l10 = l();
            int i11 = (int) (size * l10);
            bVar.f(i11, 0, (int) (i11 + l10), getTimelineHeight(), true);
            bVar.e();
        }
    }

    public final String k(boolean z10) {
        double p10 = p(z10);
        StringBuilder sb2 = new StringBuilder();
        c0.i(Math.round(1000.0d * p10), TimeUnit.MILLISECONDS, true, sb2);
        long round = Math.round(p10 * 10000.0d);
        if (z10) {
            this.f18010o0 = round;
        } else {
            this.f18009n0 = round;
        }
        return sb2.toString();
    }

    public final float l() {
        if (this.M > 0) {
            return getTimelineWidth() / this.M;
        }
        return 0.0f;
    }

    public final void m() {
        kb.b bVar = this.O;
        if (bVar != null) {
            bVar.c();
            this.O = null;
        }
    }

    public final void n() {
        Iterator<b> it = this.f17993a.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        this.f17993a.clear();
        invalidate();
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        H(z10);
        invalidate();
    }

    public final void o(int i10, b bVar) {
        d dVar = this.f17995b;
        dVar.sendMessage(Message.obtain(dVar, 0, i10, 0, bVar));
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        if (f10 == 1.0f) {
            x2.l lVar = i10 == 1 ? this.f18008m0 : this.f18007l0;
            if (lVar != null) {
                lVar.I(true, 1L, TimeUnit.SECONDS);
            }
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int paddingLeft = getPaddingLeft() + getAddPaddingHorizontal();
        int paddingTop = getPaddingTop() + getAddPaddingVertical();
        int timelineWidth = getTimelineWidth();
        int timelineHeight = getTimelineHeight();
        float l10 = l();
        float f10 = paddingLeft;
        Iterator<b> it = this.f17993a.iterator();
        float f11 = f10;
        while (it.hasNext()) {
            b next = it.next();
            f11 += l10;
            it = it;
            next.f(Math.max(paddingLeft, (int) f11), paddingTop, Math.min(paddingLeft + timelineWidth, (int) f11), paddingTop + timelineHeight, false);
            next.c(canvas, timelineHeight / l10);
        }
        RectF a02 = ce.y.a0();
        p pVar = this.f18014s0;
        if (pVar != null) {
            i12 = pVar.e(this.f18011p0);
            i11 = this.f18014s0.e(this.f18012q0);
            i10 = this.f18014s0.e(this.f18013r0);
        } else {
            i12 = j.L(this.f18011p0);
            i11 = j.L(this.f18012q0);
            i10 = j.L(this.f18013r0);
        }
        int i19 = i12;
        int i20 = i11;
        int i21 = i10;
        float f12 = timelineWidth;
        int o10 = paddingLeft + ((int) (this.f18005j0.o() * f12));
        int o11 = paddingLeft + ((int) (f12 * this.f18006k0.o()));
        int i22 = a0.i(2.0f);
        int i23 = a0.i(8.0f);
        float f13 = paddingTop;
        float f14 = i22 / 2.0f;
        int i24 = timelineHeight + paddingTop;
        float f15 = i24;
        a02.set(o10 - i23, f13 - f14, o11 + i23, f15 + f14);
        float f16 = a02.left;
        if (f16 > f10) {
            i14 = o11;
            i15 = i23;
            i13 = i20;
            i16 = timelineWidth;
            canvas.drawRect(f10, f13, f16, f15, ce.y.g(i21));
        } else {
            i13 = i20;
            i14 = o11;
            i16 = timelineWidth;
            i15 = i23;
        }
        float f17 = a02.right;
        int i25 = paddingLeft + i16;
        float f18 = i25;
        if (f17 < f18) {
            i17 = i25;
            canvas.drawRect(f17, f13, f18, f15, ce.y.g(i21));
        } else {
            i17 = i25;
        }
        canvas.drawRoundRect(a02, a0.i(2.0f), a0.i(2.0f), ce.y.C0(i19));
        float f19 = a02.left;
        float f20 = i15;
        canvas.drawRect(f19 + f14, a02.top + f14, f19 + f20, a02.bottom - f14, ce.y.g(i19));
        float f21 = a02.right;
        canvas.drawRect(f21 - f20, a02.top + f14, f21 - f14, a02.bottom - f14, ce.y.g(i19));
        float centerY = a02.centerY();
        float f22 = (i15 + i22) / 2.0f;
        float f23 = o10 - f22;
        canvas.save();
        canvas.scale(0.6f, 0.6f, f23 - a0.i(5.0f), centerY);
        int i26 = i13;
        ce.b.k(canvas, f23, centerY, i26, 3);
        canvas.restore();
        float f24 = i14 + f22;
        canvas.save();
        canvas.scale(0.6f, 0.6f, a0.i(5.0f) + f24, centerY);
        ce.b.k(canvas, f24, centerY, i26, 5);
        canvas.restore();
        float g10 = this.f18015t0.g();
        if (g10 > 0.0f) {
            double d10 = this.f17996b0;
            if (d10 != -1.0d) {
                double d11 = this.f17998c0;
                if (d11 != -1.0d) {
                    double d12 = i16;
                    double d13 = this.R;
                    paddingLeft = ((int) ((d10 / d13) * d12)) + paddingLeft;
                    i18 = paddingLeft + ((int) (d12 * (d11 / d13)));
                    int max = Math.max(paddingLeft, Math.min(i18, ((int) ((i18 - paddingLeft) * this.f18017v0)) + paddingLeft));
                    int a10 = ib.d.a(g10, i19);
                    int i27 = a0.i(2.0f);
                    int min = Math.min((getPaddingBottom() / 2) - a0.x(), a0.i(3.0f));
                    int addPaddingVertical = (paddingTop - getAddPaddingVertical()) - a0.x();
                    int addPaddingVertical2 = i24 + getAddPaddingVertical();
                    int a11 = ib.d.a(g10, -16777216);
                    float f25 = max;
                    float f26 = addPaddingVertical;
                    float f27 = addPaddingVertical2;
                    canvas.drawLine(f25, f26, f25, f27, ce.y.Y(a11, a0.x() + i27));
                    float f28 = addPaddingVertical2 + min;
                    canvas.drawCircle(f25, f28, a0.x() + min, ce.y.g(a11));
                    float g11 = (this.f18016u0.g() * 0.5f) + 0.5f;
                    canvas.drawLine(f25, f26, f25, f27, ce.y.Y(ib.d.a(g11, a10), i27));
                    canvas.drawCircle(f25, f28, min, ce.y.g(ib.d.a(g11, a10)));
                }
            }
            i18 = i17;
            int max2 = Math.max(paddingLeft, Math.min(i18, ((int) ((i18 - paddingLeft) * this.f18017v0)) + paddingLeft));
            int a102 = ib.d.a(g10, i19);
            int i272 = a0.i(2.0f);
            int min2 = Math.min((getPaddingBottom() / 2) - a0.x(), a0.i(3.0f));
            int addPaddingVertical3 = (paddingTop - getAddPaddingVertical()) - a0.x();
            int addPaddingVertical22 = i24 + getAddPaddingVertical();
            int a112 = ib.d.a(g10, -16777216);
            float f252 = max2;
            float f262 = addPaddingVertical3;
            float f272 = addPaddingVertical22;
            canvas.drawLine(f252, f262, f252, f272, ce.y.Y(a112, a0.x() + i272));
            float f282 = addPaddingVertical22 + min2;
            canvas.drawCircle(f252, f282, a0.x() + min2, ce.y.g(a112));
            float g112 = (this.f18016u0.g() * 0.5f) + 0.5f;
            canvas.drawLine(f252, f262, f252, f272, ce.y.Y(ib.d.a(g112, a102), i272));
            canvas.drawCircle(f252, f282, min2, ce.y.g(ib.d.a(g112, a102)));
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setFrameCount((int) Math.ceil((getTimelineWidth() / getTimelineHeight()) * 1.2f));
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: ne.f4.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final double p(boolean z10) {
        return this.f18000e0 ? z10 ? getCurrentEnd() : getCurrentStart() : z10 ? this.f17998c0 : this.f17996b0;
    }

    public void setCurrentTime(double d10) {
        if (this.W != d10) {
            this.W = d10;
            invalidate();
        }
    }

    public void setDelegate(c cVar) {
        this.f17994a0 = cVar;
    }

    public void setForcedTheme(p pVar) {
        if (this.f18014s0 != pVar) {
            this.f18014s0 = pVar;
            invalidate();
        }
    }

    public void setSliderProgress(float f10) {
        if (this.f18017v0 == f10) {
            return;
        }
        if (!this.f18000e0 || this.f17999d0 != 3) {
            this.f18017v0 = f10;
            invalidate();
        }
    }

    public final void setVideoPath(String str) {
        F(str, 0.0f, 1.0f, -1.0d, -1.0d, 0.0d, false);
    }

    public final x2.f w(int i10) {
        if (i10 == 1) {
            x2.f fVar = this.f18004i0;
            if (fVar != null) {
                return fVar;
            }
            x2.f d4Var = new x2.f() {
                @Override
                public final void d1(View view, Rect rect) {
                    f4.this.r(view, rect);
                }
            };
            this.f18004i0 = d4Var;
            return d4Var;
        } else if (i10 != 2) {
            return null;
        } else {
            x2.f fVar2 = this.f18003h0;
            if (fVar2 != null) {
                return fVar2;
            }
            x2.f e4Var = new x2.f() {
                @Override
                public final void d1(View view, Rect rect) {
                    f4.this.q(view, rect);
                }
            };
            this.f18003h0 = e4Var;
            return e4Var;
        }
    }

    public final void x(boolean z10) {
        double d10;
        if (this.P != null) {
            double d11 = 0.0d;
            if (this.R > 0.0d) {
                if (z10) {
                    this.f18005j0.k();
                    double d12 = this.f17996b0;
                    if (d12 != -1.0d) {
                        d11 = d12;
                    }
                    d10 = this.P.b(d11, getCurrentEnd(), true);
                    this.f18006k0.i((float) (d10 / this.R));
                } else {
                    this.f18006k0.k();
                    double d13 = this.f17998c0;
                    d10 = d13 == -1.0d ? this.R : d13;
                    d11 = this.P.c(getCurrentStart(), d10, true);
                    this.f18005j0.i((float) (d11 / this.R));
                }
                double d14 = d10;
                double d15 = d11;
                if (!(this.f17996b0 == d15 && this.f17998c0 == d14)) {
                    this.f17996b0 = d15;
                    this.f17998c0 = d14;
                    c cVar = this.f17994a0;
                    if (cVar != null) {
                        cVar.a(this, this.R, d15, d14);
                    }
                }
                H(z10);
                x2.l lVar = z10 ? this.f18008m0 : this.f18007l0;
                if (lVar != null) {
                    lVar.I(true, 1L, TimeUnit.SECONDS);
                }
            }
        }
    }

    public final void v(String str) {
        if (!i.c(this.Q, str)) {
            y yVar = this.P;
            if (yVar != null) {
                yVar.t();
                this.Q = null;
            }
            this.Q = str;
            if (!i.i(str)) {
                try {
                    y yVar2 = new y(str);
                    this.P = yVar2;
                    this.R = yVar2.n();
                    this.S = this.P.o();
                    this.T = this.P.k();
                    this.U = this.P.j();
                    this.V = this.P.h();
                    this.f17995b.post(new Runnable() {
                        @Override
                        public final void run() {
                            f4.this.u();
                        }
                    });
                } catch (Throwable unused) {
                    v(null);
                }
            }
        }
    }

    public final void z(kb.b r12, java.lang.String r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: ne.f4.z(kb.b, java.lang.String, int, int):void");
    }
}
