package wc;

import ae.j;
import ae.z;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.c;
import ce.o;
import ce.p0;
import ce.y;
import de.o4;
import eb.f;
import eb.g;
import gb.h;
import gd.w;
import hd.b3;
import ld.p;
import ld.v;
import ne.i;
import ob.b;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.v4;
import yd.d;
import zd.gc;
import zd.ic;
import zd.o6;

public class a extends i implements gc.e {
    public static Paint f25848r0;
    public static TextPaint f25849s0;
    public static TextPaint f25850t0;
    public b3 f25851k0;
    public final p f25852l0;
    public final g f25853m0;
    public final f f25854n0;
    public boolean f25855o0;
    public boolean f25856p0;
    public final f f25857q0;

    public class C0240a implements i.d {
        public C0240a() {
        }

        @Override
        public v4<?> c7(i iVar, float f10, float f11) {
            o4 o4Var = new o4(a.this.getContext(), a.this.f18085b);
            o4Var.hk(new o4.h(b.f19339b).c(true));
            return o4Var;
        }

        @Override
        public boolean f(i iVar, float f10, float f11, v4<?> v4Var) {
            return false;
        }

        @Override
        public boolean i0(i iVar, float f10, float f11) {
            return he.i.c2().M2();
        }
    }

    public a(Context context, o6 o6Var) {
        super(context, o6Var);
        DecelerateInterpolator decelerateInterpolator = db.b.f7287b;
        this.f25854n0 = new f(this, decelerateInterpolator, 180L);
        this.f25857q0 = new f(this, decelerateInterpolator, 180L);
        if (f25849s0 == null) {
            s1();
        }
        this.f25853m0 = new g(new h(this));
        setId(R.id.chat);
        d.j(this);
        int chatListMode = getChatListMode();
        p pVar = new p(this, L0(chatListMode));
        this.f25852l0 = pVar;
        pVar.K0(G0(chatListMode), V0(chatListMode), G0(chatListMode) + P0(chatListMode), V0(chatListMode) + P0(chatListMode));
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
    }

    public static void A1() {
        TextPaint textPaint = f25849s0;
        if (textPaint != null) {
            textPaint.setTextSize(a0.i(17.0f));
        }
        TextPaint textPaint2 = f25850t0;
        if (textPaint2 != null) {
            textPaint2.setTextSize(a0.i(17.0f));
        }
        Paint paint = f25848r0;
        if (paint != null) {
            paint.setTextSize(a0.i(12.0f));
        }
    }

    public static int G0(int i10) {
        return a0.i(7.0f);
    }

    public static int L0(int i10) {
        return P0(i10) / 2;
    }

    public static int P0(int i10) {
        return a0.i(Q0(i10));
    }

    public static float Q0(int i10) {
        if (i10 != 2) {
            return i10 != 3 ? 52.0f : 60.0f;
        }
        return 58.0f;
    }

    public static int V0(int i10) {
        if (i10 != 3) {
            return a0.i(10.0f);
        }
        return a0.i(11.0f);
    }

    public static int Y0(int i10) {
        if (i10 == 2 || i10 == 3) {
            return a0.i(15.0f);
        }
        return a0.i(17.0f);
    }

    public static int b1(int i10) {
        if (i10 == 2) {
            return a0.i(42.0f);
        }
        if (i10 != 3) {
            return a0.i(38.0f);
        }
        return a0.i(44.0f);
    }

    public static int e1(int i10) {
        return b1(i10) + getCounterRadius();
    }

    public static int f1(int i10) {
        return i10 != 1 ? G0(i10) + P0(i10) + a0.i(11.0f) : r1(i10);
    }

    private int getChatListMode() {
        b3 b3Var = this.f25851k0;
        return b3Var != null ? b3Var.F() : he.i.c2().u0();
    }

    public static int getCounterRadius() {
        return a0.i(11.0f);
    }

    public static int getDefaultAvatarCacheSize() {
        return P0(he.i.c2().u0());
    }

    public static int getMuteOffset() {
        return a0.i(1.0f);
    }

    public static int getMutePadding() {
        return getMuteOffset();
    }

    public static int getRightPadding() {
        return getTimePadding();
    }

    private static int getTextOffset() {
        return a0.i(12.0f);
    }

    private static int getTimePadding() {
        return a0.i(15.0f);
    }

    public static int getTimePaddingLeft() {
        return a0.i(7.0f);
    }

    public static int getTimePaddingRight() {
        return getTimePadding();
    }

    public static Paint getTimePaint() {
        if (f25848r0 == null) {
            synchronized (a.class) {
                if (f25848r0 == null) {
                    s1();
                }
            }
        }
        return f25848r0;
    }

    public static int l1(int i10) {
        if (i10 == 2 || i10 == 3) {
            return a0.i(9.0f);
        }
        return a0.i(11.0f);
    }

    public static int m1(int i10) {
        return a0.i(2.0f);
    }

    public static int n1(int i10) {
        if (i10 == 2) {
            return a0.i(32.0f);
        }
        if (i10 != 3) {
            return a0.i(39.5f);
        }
        return a0.i(33.0f);
    }

    public static TextPaint o1(boolean z10) {
        if (f25850t0 == null || f25849s0 == null) {
            s1();
        }
        return z10 ? f25850t0 : f25849s0;
    }

    public static int p1(int i10) {
        int textOffset;
        int i11;
        if (i10 == 2 || i10 == 3) {
            textOffset = getTextOffset();
            i11 = a0.i(14.0f);
        } else {
            textOffset = getTextOffset();
            i11 = a0.i(16.0f);
        }
        return textOffset + i11;
    }

    public static int q1(int i10) {
        if (i10 == 2 || i10 == 3) {
            return a0.i(10.0f);
        }
        return a0.i(12.0f);
    }

    public static int r1(int i10) {
        if (i10 == 2) {
            return a0.i(78.0f);
        }
        if (i10 != 3) {
            return a0.i(72.0f);
        }
        return a0.i(82.0f);
    }

    public static void s1() {
        TextPaint textPaint = new TextPaint(5);
        f25849s0 = textPaint;
        textPaint.setColor(j.P0());
        f25849s0.setTextSize(a0.i(17.0f));
        f25849s0.setTypeface(o.i());
        z.f(f25849s0, R.id.theme_color_text);
        TextPaint textPaint2 = new TextPaint(5);
        f25850t0 = textPaint2;
        textPaint2.setColor(j.P0());
        f25850t0.setTextSize(a0.i(17.0f));
        f25850t0.setTypeface(o.k());
        f25850t0.setFakeBoldText(true);
        z.f(f25850t0, R.id.theme_color_text);
        Paint paint = new Paint(5);
        f25848r0 = paint;
        paint.setColor(j.R0());
        f25848r0.setTextSize(a0.i(12.0f));
        f25848r0.setTypeface(o.k());
        z.f(f25848r0, R.id.theme_color_textLight);
    }

    public void B1(boolean z10, boolean z11) {
        this.f25854n0.p(z10, z11);
    }

    public void C1() {
        g gVar = this.f25853m0;
        b3 b3Var = this.f25851k0;
        gVar.b(b3Var != null && b3Var.m0(), z1());
    }

    public boolean D0(float f10, float f11) {
        int chatListMode = getChatListMode();
        int G0 = (G0(chatListMode) * 2) + P0(chatListMode);
        return w.G2() ? f10 >= ((float) (getMeasuredWidth() - G0)) : f10 <= ((float) G0);
    }

    public void b() {
        this.f25852l0.b();
    }

    @Override
    public void d7(o6 o6Var, long j10, boolean z10) {
        b3 b3Var = this.f25851k0;
        if (b3Var != null && b3Var.i0() && j10 == 1) {
            this.f25857q0.p(!z10, true);
        }
    }

    public void e() {
        this.f25852l0.e();
    }

    public v getAvatarReceiver() {
        return this.f25852l0;
    }

    public b3 getChat() {
        return this.f25851k0;
    }

    public long getChatId() {
        b3 b3Var = this.f25851k0;
        if (b3Var != null) {
            return b3Var.x();
        }
        return 0L;
    }

    public void n(boolean z10) {
        invalidate();
    }

    @Override
    public void onDraw(Canvas canvas) {
        boolean z10;
        float f10;
        float f11;
        int i10;
        float f12;
        je.g i11;
        int f13;
        int i12;
        float f14;
        float f15;
        int i13;
        ?? r15;
        int m12;
        Drawable j10;
        if (this.f25851k0 != null) {
            int chatListMode = getChatListMode();
            boolean G2 = w.G2();
            int measuredWidth = getMeasuredWidth();
            if (this.f25856p0) {
                canvas.drawColor(ib.d.a(0.8f, j.u()));
            }
            String U = this.f25851k0.U();
            int V = this.f25851k0.V();
            if (G2) {
                V = (measuredWidth - V) - this.f25851k0.W();
            }
            canvas.drawText(U, V, p1(chatListMode), f25848r0);
            je.g X = this.f25851k0.X();
            if (X != null) {
                int f16 = f1(chatListMode);
                int q12 = q1(chatListMode);
                if (this.f25851k0.q0()) {
                    c.d(canvas, ce.p.j(), f16 - a0.i(7.0f), ((X.getHeight() / 2) + q12) - (j10.getMinimumHeight() / 2), y.F(), measuredWidth, G2);
                    f16 += a0.i(14.0f);
                }
                X.t(canvas, f16, q12);
            }
            if (this.f25851k0.c1()) {
                c.d(canvas, ce.p.d(), this.f25851k0.c0(), l1(chatListMode), y.s0(), measuredWidth, G2);
            }
            if ((this.f25851k0.b1() || this.f25851k0.Z0()) && this.f25851k0.z() != null) {
                int i14 = a0.i(4.0f);
                int c02 = this.f25851k0.c0() + a0.i(10.0f);
                int q13 = q1(chatListMode) + a0.i(0.5f);
                RectF a02 = y.a0();
                a02.set(c02 - i14, q13, this.f25851k0.z().getWidth() + c02 + i14, this.f25851k0.z().a0(true) + q13);
                canvas.drawRoundRect(a02, a0.i(2.0f), a0.i(2.0f), y.Y(j.L(R.id.theme_color_textNegative), a0.i(1.5f)));
                this.f25851k0.z().t(canvas, c02, q13 + a0.i(1.0f));
            }
            if (this.f25851k0.a1()) {
                z10 = true;
                c.d(canvas, ce.p.a(R.id.theme_color_chatListMute), this.f25851k0.H(), l1(chatListMode), y.y(), measuredWidth, G2);
            } else {
                z10 = true;
            }
            if (this.f25851k0.s0()) {
                c.d(canvas, ce.p.e(R.id.theme_color_iconLight), (this.f25851k0.C() - a0.i(10.0f)) - a0.i(ce.p.f5332g), Y0(chatListMode) - a0.i(ce.p.f5333h), y.K(), measuredWidth, G2);
            } else if (this.f25851k0.n0() && !this.f25851k0.r0()) {
                int C = this.f25851k0.C();
                int Y0 = Y0(chatListMode);
                if (this.f25851k0.d1()) {
                    Y0 -= a0.i(0.5f);
                } else if (this.f25851k0.v0()) {
                    C += a0.i(4.0f);
                }
                if (this.f25851k0.d1()) {
                    this.f25851k0.e0().f(canvas, C + a0.i(3.0f), Y0 + (a0.i(14.0f) / 2.0f), 5, 1.0f, this, R.id.theme_color_ticksRead);
                } else {
                    int i15 = (C - a0.i(ce.p.f5334i)) - a0.i(14.0f);
                    boolean v02 = this.f25851k0.v0();
                    c.d(canvas, v02 ? ce.p.l(R.id.theme_color_ticks) : ce.p.g(R.id.theme_color_ticks), i15, Y0 - a0.i(ce.p.f5335j), v02 ? y.l0() : y.m0(), measuredWidth, G2);
                }
            }
            je.a D = this.f25851k0.D();
            float rightPadding = measuredWidth - getRightPadding();
            float counterRadius = getCounterRadius();
            float e12 = e1(chatListMode);
            D.e(canvas, rightPadding - counterRadius, e12, 5, 1.0f);
            float j11 = rightPadding - D.j(getTimePaddingLeft());
            je.a G = this.f25851k0.G();
            G.f(canvas, j11 - counterRadius, e12, 5, 1.0f, this, R.id.theme_color_badgeText);
            G.j(getTimePaddingLeft());
            ic.d e13 = this.f25851k0.e1();
            ic.b h10 = e13 != null ? e13.h() : null;
            float n10 = h10 != null ? h10.n() : 0.0f;
            float f17 = 1.0f - n10;
            if (f17 > 0.0f) {
                int i16 = (int) (a0.i(14.0f) * n10);
                boolean z11 = i16 != 0;
                if (z11) {
                    int O = p0.O(canvas);
                    canvas.translate(0.0f, i16);
                    i12 = O;
                } else {
                    i12 = -1;
                }
                int n12 = n1(chatListMode);
                je.g J = this.f25851k0.J();
                if (J != null) {
                    ib.d.a(f17, this.f25851k0.Y0() ? j.V0() : j.P0());
                    i13 = i12;
                    r15 = 0;
                    f15 = f17;
                    f14 = n10;
                    J.z(canvas, f1(chatListMode), n12, null, f15);
                } else {
                    i13 = i12;
                    f15 = f17;
                    f14 = n10;
                    r15 = 0;
                }
                je.g P = this.f25851k0.P();
                if (P != null) {
                    if (chatListMode != z10) {
                        if (J != null) {
                            m12 = J.i0();
                        } else if (P.X() == z10) {
                            m12 = m1(chatListMode);
                        }
                        n12 += m12;
                    }
                    jb.c R = this.f25851k0.R();
                    if (R != null) {
                        int S = this.f25851k0.S();
                        int i17 = 0;
                        while (i17 < R.g()) {
                            float f18 = f15;
                            Paint c10 = ce.z.c(this.f25851k0.Q(), f18);
                            int d10 = R.d(i17);
                            Drawable Z = Z(d10, r15);
                            int a03 = (n12 + (P.a0(r15) / 2)) - (Z.getMinimumHeight() / 2);
                            if (d10 == R.drawable.baseline_camera_alt_16) {
                                a03 += a0.i(0.5f);
                            }
                            R = R;
                            P = P;
                            c.d(canvas, Z, S, a03, c10, measuredWidth, G2);
                            S += a0.i(18.0f);
                            i17++;
                            f15 = f18;
                        }
                    }
                    f10 = f15;
                    f11 = 0.0f;
                    P.z(canvas, this.f25851k0.S(), n12, null, f10);
                } else {
                    f10 = f15;
                    f11 = 0.0f;
                }
                if (z11) {
                    p0.N(canvas, i13);
                }
                f12 = f14;
                i10 = r15;
            } else {
                f10 = f17;
                i10 = 0;
                f11 = 0.0f;
                f12 = n10;
            }
            if (f12 > f11 && (i11 = e13.i()) != null) {
                float n13 = n1(chatListMode) - (a0.i(14.0f) * f10);
                if (chatListMode != z10 && i11.X() == z10) {
                    n13 += m1(chatListMode);
                }
                float f19 = n13;
                float f110 = G2 ? measuredWidth - f13 : f1(chatListMode);
                float Y = f19 + (i11.Y() / 2.0f);
                int a10 = ib.d.a(f12, i11.m0());
                int i18 = i10;
                if (f12 == 1.0f) {
                    i18 = R.id.theme_color_textLight;
                }
                ce.b.A(canvas, h10, f110, Y, a10, this, i18);
                i11.z(canvas, f1(chatListMode), (int) f19, null, f12);
            }
            v1();
            if (this.f25851k0.f0()) {
                if (this.f25852l0.e0()) {
                    this.f25852l0.u0(canvas, L0(chatListMode));
                }
                this.f25852l0.draw(canvas);
            } else {
                hd.b v10 = this.f25851k0.v();
                if (v10 != null) {
                    int J0 = this.f25852l0.J0();
                    int x02 = this.f25852l0.x0();
                    if (this.f25851k0.i0()) {
                        float f20 = J0;
                        float f21 = x02;
                        canvas.drawCircle(f20, f21, v10.f(), y.g(ib.d.d(j.L(R.id.theme_color_avatarArchivePinned), j.L(R.id.theme_color_avatarArchive), this.f25857q0.g())));
                        v10.d(canvas, f20, f21, 1.0f, v10.f(), false);
                    } else {
                        v10.a(canvas, J0, x02);
                    }
                }
            }
            ce.b.n(canvas, this.f25852l0, 315.0f, this.f25851k0.M().a(), j.u(), Z(R.drawable.baseline_watch_later_10, R.id.theme_color_badgeMuted), ce.z.c(R.id.theme_color_badgeMuted, this.f25851k0.M().a()));
            this.f25853m0.b(this.f25851k0.m0(), z10);
            ce.b.r(canvas, this.f25852l0, this.f25853m0.a() * (1.0f - this.f25854n0.g()));
            ce.b.y(canvas, this.f25852l0, this.f25854n0.g());
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(r1(getChatListMode()), Log.TAG_TDLIB_OPTIONS));
        v1();
        b3 b3Var = this.f25851k0;
        if (b3Var != null && b3Var.o(getMeasuredWidth())) {
            this.f25852l0.G(this.f25851k0.t());
        }
    }

    public void setAnimationsDisabled(boolean z10) {
        this.f25852l0.S0(z10);
    }

    public void setChat(b3 b3Var) {
        b3 b3Var2 = this.f25851k0;
        ld.h hVar = null;
        if (b3Var2 != b3Var) {
            if (b3Var2 != null) {
                b3Var2.s(this);
                if (this.f25851k0.i0()) {
                    this.f18085b.tc().e0(this);
                }
            }
            this.f25851k0 = b3Var;
            boolean z10 = true;
            this.f25857q0.p(b3Var != null && b3Var.i0() && !this.f18085b.tc().V(), false);
            if (b3Var != null) {
                b3Var.o(getMeasuredWidth());
                b3Var.f1();
                b3Var.i(this);
                if (b3Var.i0()) {
                    this.f18085b.tc().g(this);
                }
            }
            if (b3Var != null) {
                w0(b3Var.y(), b3Var.x(), null);
            } else {
                w0(null, 0L, null);
            }
            g gVar = this.f25853m0;
            if (b3Var == null || !b3Var.m0()) {
                z10 = false;
            }
            gVar.b(z10, false);
            if (b3Var == null || !b3Var.i0()) {
                setCustomControllerProvider(null);
            } else {
                setCustomControllerProvider(new C0240a());
            }
        }
        p pVar = this.f25852l0;
        if (b3Var != null) {
            hVar = b3Var.t();
        }
        pVar.G(hVar);
    }

    public void setIsDragging(boolean z10) {
        if (this.f25856p0 != z10) {
            this.f25856p0 = z10;
            invalidate();
        }
    }

    public void setNeedBackground(boolean z10) {
        if (this.f25855o0 != z10) {
            this.f25855o0 = z10;
            if (z10) {
                d.g(this);
            } else {
                d.j(this);
            }
        }
    }

    public void t1() {
        p pVar = this.f25852l0;
        b3 b3Var = this.f25851k0;
        pVar.G(b3Var != null ? b3Var.t() : null);
        invalidate();
    }

    public boolean u1() {
        return this.f25856p0;
    }

    public final void v1() {
        int chatListMode = getChatListMode();
        int measuredWidth = w.G2() ? (getMeasuredWidth() - G0(chatListMode)) - P0(chatListMode) : G0(chatListMode);
        this.f25852l0.K0(measuredWidth, V0(chatListMode), P0(chatListMode) + measuredWidth, V0(chatListMode) + P0(chatListMode));
    }

    public boolean z1() {
        v4<?> o92 = v4.o9(this);
        return o92 == null || o92.Z9().z9();
    }
}
