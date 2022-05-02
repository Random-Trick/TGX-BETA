package vc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1359b;
import be.C1362c;
import be.C1389o;
import be.C1392p;
import be.C1399s0;
import be.C1410y;
import be.C1411z;
import gd.C4587b;
import gd.C4592b3;
import ge.C4868i;
import ie.C5375a;
import ie.RunnableC5390g;
import me.View$OnClickListenerC6902i;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p038ce.View$OnClickListenerC2805o4;
import p051db.C3940f;
import p051db.C3941g;
import p080fb.C4343h;
import p082fd.C4403w;
import p108hb.C5064d;
import p124ib.C5320c;
import p156kd.AbstractC6264v;
import p156kd.C6246h;
import p156kd.C6257p;
import p193nb.C7317b;
import p335xd.C10189d;
import p350yd.C10733ic;
import p350yd.C10802kc;
import p350yd.C10930q6;
import p364zd.C11524j;
import p364zd.C11541z;
import td.AbstractC9323v4;

public class C9903a extends View$OnClickListenerC6902i implements C10733ic.AbstractC10738e {
    public static Paint f32200r0;
    public static TextPaint f32201s0;
    public static TextPaint f32202t0;
    public C4592b3 f32203k0;
    public final C6257p f32204l0;
    public final C3941g f32205m0;
    public final C3940f f32206n0;
    public boolean f32207o0;
    public boolean f32208p0;
    public final C3940f f32209q0;

    public class C9904a implements View$OnClickListenerC6902i.AbstractC6906d {
        public C9904a() {
        }

        @Override
        public AbstractC9323v4<?> mo6637Z3(View$OnClickListenerC6902i iVar, float f, float f2) {
            View$OnClickListenerC2805o4 o4Var = new View$OnClickListenerC2805o4(C9903a.this.getContext(), C9903a.this.f21820b);
            o4Var.m33354hk(new View$OnClickListenerC2805o4.C2813h(C7317b.f23225b).m33264c(true));
            return o4Var;
        }

        @Override
        public boolean mo6636d(View$OnClickListenerC6902i iVar, float f, float f2, AbstractC9323v4<?> v4Var) {
            return false;
        }

        @Override
        public boolean mo6635e2(View$OnClickListenerC6902i iVar, float f, float f2) {
            return C4868i.m24726c2().m24840M2();
        }
    }

    public C9903a(Context context, C10930q6 q6Var) {
        super(context, q6Var);
        DecelerateInterpolator decelerateInterpolator = C2057b.f7280b;
        this.f32206n0 = new C3940f(this, decelerateInterpolator, 180L);
        this.f32209q0 = new C3940f(this, decelerateInterpolator, 180L);
        if (f32201s0 == null) {
            m6641s1();
        }
        this.f32205m0 = new C3941g(new C4343h(this));
        setId(R.id.chat);
        C10189d.m5794j(this);
        int chatListMode = getChatListMode();
        C6257p pVar = new C6257p(this, m6659J0(chatListMode));
        this.f32204l0 = pVar;
        pVar.mo20256K0(m6660F0(chatListMode), m6656Q0(chatListMode), m6660F0(chatListMode) + m6658M0(chatListMode), m6656Q0(chatListMode) + m6658M0(chatListMode));
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
    }

    public static void m6663C1() {
        TextPaint textPaint = f32201s0;
        if (textPaint != null) {
            textPaint.setTextSize(C1357a0.m37541i(17.0f));
        }
        TextPaint textPaint2 = f32202t0;
        if (textPaint2 != null) {
            textPaint2.setTextSize(C1357a0.m37541i(17.0f));
        }
        Paint paint = f32200r0;
        if (paint != null) {
            paint.setTextSize(C1357a0.m37541i(12.0f));
        }
    }

    public static int m6660F0(int i) {
        return C1357a0.m37541i(7.0f);
    }

    public static int m6659J0(int i) {
        return m6658M0(i) / 2;
    }

    public static int m6658M0(int i) {
        return C1357a0.m37541i(m6657O0(i));
    }

    public static float m6657O0(int i) {
        if (i != 2) {
            return i != 3 ? 52.0f : 60.0f;
        }
        return 58.0f;
    }

    public static int m6656Q0(int i) {
        if (i != 3) {
            return C1357a0.m37541i(10.0f);
        }
        return C1357a0.m37541i(11.0f);
    }

    public static int m6655U0(int i) {
        if (i == 2 || i == 3) {
            return C1357a0.m37541i(15.0f);
        }
        return C1357a0.m37541i(17.0f);
    }

    public static int m6654W0(int i) {
        if (i == 2) {
            return C1357a0.m37541i(42.0f);
        }
        if (i != 3) {
            return C1357a0.m37541i(38.0f);
        }
        return C1357a0.m37541i(44.0f);
    }

    public static int m6652c1(int i) {
        return m6654W0(i) + getCounterRadius();
    }

    public static int m6651d1(int i) {
        return i != 1 ? m6660F0(i) + m6658M0(i) + C1357a0.m37541i(11.0f) : m6642r1(i);
    }

    public static int m6650e1(int i) {
        if (i == 2 || i == 3) {
            return C1357a0.m37541i(9.0f);
        }
        return C1357a0.m37541i(11.0f);
    }

    public static int m6648g1(int i) {
        return C1357a0.m37541i(2.0f);
    }

    private int getChatListMode() {
        C4592b3 b3Var = this.f32203k0;
        return b3Var != null ? b3Var.m27201E() : C4868i.m24726c2().m24584u0();
    }

    public static int getCounterRadius() {
        return C1357a0.m37541i(11.0f);
    }

    public static int getDefaultAvatarCacheSize() {
        return m6658M0(C4868i.m24726c2().m24584u0());
    }

    public static int getMuteOffset() {
        return C1357a0.m37541i(1.0f);
    }

    public static int getMutePadding() {
        return getMuteOffset();
    }

    public static int getRightPadding() {
        return getTimePadding();
    }

    private static int getTextOffset() {
        return C1357a0.m37541i(12.0f);
    }

    private static int getTimePadding() {
        return C1357a0.m37541i(15.0f);
    }

    public static int getTimePaddingLeft() {
        return C1357a0.m37541i(7.0f);
    }

    public static int getTimePaddingRight() {
        return getTimePadding();
    }

    public static Paint getTimePaint() {
        if (f32200r0 == null) {
            synchronized (C9903a.class) {
                if (f32200r0 == null) {
                    m6641s1();
                }
            }
        }
        return f32200r0;
    }

    public static int m6647i1(int i) {
        if (i == 2) {
            return C1357a0.m37541i(32.0f);
        }
        if (i != 3) {
            return C1357a0.m37541i(39.5f);
        }
        return C1357a0.m37541i(33.0f);
    }

    public static TextPaint m6645n1(boolean z) {
        if (f32202t0 == null || f32201s0 == null) {
            m6641s1();
        }
        return z ? f32202t0 : f32201s0;
    }

    public static int m6644o1(int i) {
        int textOffset;
        int i2;
        if (i == 2 || i == 3) {
            textOffset = getTextOffset();
            i2 = C1357a0.m37541i(14.0f);
        } else {
            textOffset = getTextOffset();
            i2 = C1357a0.m37541i(16.0f);
        }
        return textOffset + i2;
    }

    public static int m6643q1(int i) {
        if (i == 2 || i == 3) {
            return C1357a0.m37541i(10.0f);
        }
        return C1357a0.m37541i(12.0f);
    }

    public static int m6642r1(int i) {
        if (i == 2) {
            return C1357a0.m37541i(78.0f);
        }
        if (i != 3) {
            return C1357a0.m37541i(72.0f);
        }
        return C1357a0.m37541i(82.0f);
    }

    public static void m6641s1() {
        TextPaint textPaint = new TextPaint(5);
        f32201s0 = textPaint;
        textPaint.setColor(C11524j.m217S0());
        f32201s0.setTextSize(C1357a0.m37541i(17.0f));
        f32201s0.setTypeface(C1389o.m37260i());
        C11541z.m24e(f32201s0, R.id.theme_color_text);
        TextPaint textPaint2 = new TextPaint(5);
        f32202t0 = textPaint2;
        textPaint2.setColor(C11524j.m217S0());
        f32202t0.setTextSize(C1357a0.m37541i(17.0f));
        f32202t0.setTypeface(C1389o.m37258k());
        f32202t0.setFakeBoldText(true);
        C11541z.m24e(f32202t0, R.id.theme_color_text);
        Paint paint = new Paint(5);
        f32200r0 = paint;
        paint.setColor(C11524j.m213U0());
        f32200r0.setTextSize(C1357a0.m37541i(12.0f));
        f32200r0.setTypeface(C1389o.m37258k());
        C11541z.m24e(f32200r0, R.id.theme_color_textLight);
    }

    @Override
    public void mo4077A1(C10930q6 q6Var, long j, boolean z) {
        C4592b3 b3Var = this.f32203k0;
        if (b3Var != null && b3Var.m27138h0() && j == 1) {
            this.f32209q0.m29575p(!z, true);
        }
    }

    public boolean m6665B1() {
        AbstractC9323v4<?> o9 = AbstractC9323v4.m9196o9(this);
        return o9 == null || o9.m9300Z9().m9118z9();
    }

    public boolean m6664C0(float f, float f2) {
        int chatListMode = getChatListMode();
        int F0 = (m6660F0(chatListMode) * 2) + m6658M0(chatListMode);
        return C4403w.m27984G2() ? f >= ((float) (getMeasuredWidth() - F0)) : f <= ((float) F0);
    }

    public void m6662D1(boolean z, boolean z2) {
        this.f32206n0.m29575p(z, z2);
    }

    public void m6661E1() {
        C3941g gVar = this.f32205m0;
        C4592b3 b3Var = this.f32203k0;
        gVar.m29571b(b3Var != null && b3Var.m27127l0(), m6665B1());
    }

    public void m6653b() {
        this.f32204l0.mo20247b();
    }

    public void m6649f() {
        this.f32204l0.mo20245f();
    }

    public AbstractC6264v getAvatarReceiver() {
        return this.f32204l0;
    }

    public C4592b3 getChat() {
        return this.f32203k0;
    }

    public long getChatId() {
        C4592b3 b3Var = this.f32203k0;
        if (b3Var != null) {
            return b3Var.m27096x();
        }
        return 0L;
    }

    public void m6646m(boolean z) {
        invalidate();
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        float f3;
        RunnableC5390g i2;
        int d1;
        int i3;
        float f4;
        float f5;
        int i4;
        int i5;
        int g1;
        Drawable j;
        if (this.f32203k0 != null) {
            int chatListMode = getChatListMode();
            boolean G2 = C4403w.m27984G2();
            int measuredWidth = getMeasuredWidth();
            if (this.f32208p0) {
                canvas.drawColor(C5064d.m24131a(0.8f, C11524j.m148w()));
            }
            String T = this.f32203k0.m27171T();
            int U = this.f32203k0.m27169U();
            if (G2) {
                U = (measuredWidth - U) - this.f32203k0.m27167V();
            }
            canvas.drawText(T, U, m6644o1(chatListMode), f32200r0);
            RunnableC5390g W = this.f32203k0.m27165W();
            if (W != null) {
                int d12 = m6651d1(chatListMode);
                int q1 = m6643q1(chatListMode);
                if (this.f32203k0.m27118p0()) {
                    C1362c.m37485d(canvas, C1392p.m37226j(), d12 - C1357a0.m37541i(7.0f), ((W.getHeight() / 2) + q1) - (j.getMinimumHeight() / 2), C1410y.m37074F(), measuredWidth, G2);
                    d12 += C1357a0.m37541i(14.0f);
                }
                W.m22903t(canvas, d12, q1);
            }
            if (this.f32203k0.m27158Z0()) {
                C1362c.m37485d(canvas, C1392p.m37232d(), this.f32203k0.m27155b0(), m6650e1(chatListMode), C1410y.m37014s0(), measuredWidth, G2);
            }
            if (this.f32203k0.m27160Y0()) {
                C1362c.m37485d(canvas, C1392p.m37235a(R.id.theme_color_chatListMute), this.f32203k0.m27197G(), m6650e1(chatListMode), C1410y.m37003y(), measuredWidth, G2);
            }
            if (this.f32203k0.m27113r0()) {
                C1362c.m37485d(canvas, C1392p.m37231e(R.id.theme_color_iconLight), (this.f32203k0.m27207B() - C1357a0.m37541i(10.0f)) - C1357a0.m37541i(C1392p.f5067g), m6655U0(chatListMode) - C1357a0.m37541i(C1392p.f5068h), C1410y.m37067K(), measuredWidth, G2);
            } else if (this.f32203k0.m27125m0() && !this.f32203k0.m27116q0()) {
                int B = this.f32203k0.m27207B();
                int U0 = m6655U0(chatListMode);
                if (this.f32203k0.m27156a1()) {
                    U0 -= C1357a0.m37541i(0.5f);
                } else if (this.f32203k0.m27104u0()) {
                    B += C1357a0.m37541i(4.0f);
                }
                if (this.f32203k0.m27156a1()) {
                    this.f32203k0.m27150d0().m23038f(canvas, B + C1357a0.m37541i(3.0f), U0 + (C1357a0.m37541i(14.0f) / 2.0f), 5, 1.0f, this, R.id.theme_color_ticksRead);
                } else {
                    int i6 = (B - C1357a0.m37541i(C1392p.f5069i)) - C1357a0.m37541i(14.0f);
                    boolean u0 = this.f32203k0.m27104u0();
                    C1362c.m37485d(canvas, u0 ? C1392p.m37224l(R.id.theme_color_ticks) : C1392p.m37229g(R.id.theme_color_ticks), i6, U0 - C1357a0.m37541i(C1392p.f5070j), u0 ? C1410y.m37028l0() : C1410y.m37026m0(), measuredWidth, G2);
                }
            }
            C5375a C = this.f32203k0.m27205C();
            float rightPadding = measuredWidth - getRightPadding();
            float counterRadius = getCounterRadius();
            float c1 = m6652c1(chatListMode);
            C.m23039d(canvas, rightPadding - counterRadius, c1, 5, 1.0f);
            float j2 = rightPadding - C.m23035j(getTimePaddingLeft());
            C5375a F = this.f32203k0.m27199F();
            F.m23038f(canvas, j2 - counterRadius, c1, 5, 1.0f, this, R.id.theme_color_badgeText);
            F.m23035j(getTimePaddingLeft());
            C10802kc.C10806d b1 = this.f32203k0.m27154b1();
            C10802kc.C10804b h = b1 != null ? b1.m3261h() : null;
            float n = h != null ? h.m3269n() : 0.0f;
            float f6 = 1.0f - n;
            if (f6 > 0.0f) {
                int i7 = (int) (C1357a0.m37541i(14.0f) * n);
                boolean z = i7 != 0;
                if (z) {
                    i3 = C1399s0.m37199V(canvas);
                    canvas.translate(0.0f, i7);
                } else {
                    i3 = -1;
                }
                int i1 = m6647i1(chatListMode);
                RunnableC5390g I = this.f32203k0.m27193I();
                if (I != null) {
                    C5064d.m24131a(f6, this.f32203k0.m27162X0() ? C11524j.m205Y0() : C11524j.m217S0());
                    i5 = i3;
                    i4 = 1;
                    f5 = f6;
                    f4 = n;
                    I.m22891z(canvas, m6651d1(chatListMode), i1, null, f5);
                } else {
                    i5 = i3;
                    f5 = f6;
                    f4 = n;
                    i4 = 1;
                }
                RunnableC5390g O = this.f32203k0.m27181O();
                if (O != null) {
                    if (chatListMode != i4) {
                        if (I != null) {
                            g1 = I.m22933i0();
                        } else if (O.m22962X() == i4) {
                            g1 = m6648g1(chatListMode);
                        }
                        i1 += g1;
                    }
                    C5320c Q = this.f32203k0.m27177Q();
                    if (Q != null) {
                        int R = this.f32203k0.m27175R();
                        int i8 = 0;
                        while (i8 < Q.m23278g()) {
                            float f7 = f5;
                            Paint c = C1411z.m36997c(this.f32203k0.m27179P(), f7);
                            int d = Q.m23281d(i8);
                            Drawable X = mo14042X(d, 0);
                            int a0 = (i1 + (O.m22955a0(false) / 2)) - (X.getMinimumHeight() / 2);
                            if (d == R.drawable.baseline_camera_alt_16) {
                                a0 += C1357a0.m37541i(0.5f);
                            }
                            Q = Q;
                            O = O;
                            C1362c.m37485d(canvas, X, R, a0, c, measuredWidth, G2);
                            R += C1357a0.m37541i(18.0f);
                            i8++;
                            f5 = f7;
                        }
                    }
                    f = f5;
                    i = 0;
                    f2 = 0.0f;
                    O.m22891z(canvas, this.f32203k0.m27175R(), i1, null, f);
                } else {
                    f = f5;
                    i = 0;
                    f2 = 0.0f;
                }
                if (z) {
                    C1399s0.m37201T(canvas, i5);
                }
                f3 = f4;
            } else {
                f = f6;
                i = 0;
                f2 = 0.0f;
                f3 = n;
            }
            if (f3 > f2 && (i2 = b1.m3260i()) != null) {
                float i12 = m6647i1(chatListMode) - (C1357a0.m37541i(14.0f) * f);
                if (chatListMode != 1 && i2.m22962X() == 1) {
                    i12 += m6648g1(chatListMode);
                }
                float f8 = i12;
                float d13 = G2 ? measuredWidth - d1 : m6651d1(chatListMode);
                float Y = f8 + (i2.m22960Y() / 2.0f);
                int a = C5064d.m24131a(f3, i2.m22921m0());
                if (f3 == 1.0f) {
                    i = R.id.theme_color_textLight;
                }
                C1359b.m37523A(canvas, h, d13, Y, a, this, i);
                i2.m22891z(canvas, m6651d1(chatListMode), (int) f8, null, f3);
            }
            m6638z1();
            if (this.f32203k0.m27147e0()) {
                if (this.f32204l0.mo20246c0()) {
                    this.f32204l0.mo20228u0(canvas, m6659J0(chatListMode));
                }
                this.f32204l0.draw(canvas);
            } else {
                C4587b v = this.f32203k0.m27102v();
                if (v != null) {
                    int I0 = this.f32204l0.mo20257I0();
                    int y0 = this.f32204l0.mo20227y0();
                    if (this.f32203k0.m27138h0()) {
                        float f9 = I0;
                        float f10 = y0;
                        canvas.drawCircle(f9, f10, v.m27210f(), C1410y.m37039g(C5064d.m24128d(C11524j.m228N(R.id.theme_color_avatarArchivePinned), C11524j.m228N(R.id.theme_color_avatarArchive), this.f32209q0.m29584g())));
                        v.m27212d(canvas, f9, f10, 1.0f, v.m27210f(), false);
                    } else {
                        v.m27215a(canvas, I0, y0);
                    }
                }
            }
            C1359b.m37505n(canvas, this.f32204l0, 315.0f, this.f32203k0.m27187L().m29572a(), C11524j.m148w(), mo14042X(R.drawable.baseline_watch_later_10, R.id.theme_color_badgeMuted), C1411z.m36997c(R.id.theme_color_badgeMuted, this.f32203k0.m27187L().m29572a()));
            this.f32205m0.m29571b(this.f32203k0.m27127l0(), true);
            C1359b.m37501r(canvas, this.f32204l0, this.f32205m0.m29572a() * (1.0f - this.f32206n0.m29584g()));
            C1359b.m37494y(canvas, this.f32204l0, this.f32206n0.m29584g());
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(m6642r1(getChatListMode()), Log.TAG_TDLIB_OPTIONS));
        m6638z1();
        C4592b3 b3Var = this.f32203k0;
        if (b3Var != null && b3Var.m27114r(getMeasuredWidth())) {
            this.f32204l0.m20819G(this.f32203k0.m27105u());
        }
    }

    public void setAnimationsDisabled(boolean z) {
        this.f32204l0.mo20251S0(z);
    }

    public void setChat(C4592b3 b3Var) {
        C4592b3 b3Var2 = this.f32203k0;
        C6246h hVar = null;
        if (b3Var2 != b3Var) {
            if (b3Var2 != null) {
                b3Var2.m27108t(this);
                if (this.f32203k0.m27138h0()) {
                    this.f21820b.m2294pc().m4124e0(this);
                }
            }
            this.f32203k0 = b3Var;
            boolean z = true;
            this.f32209q0.m29575p(b3Var != null && b3Var.m27138h0() && !this.f21820b.m2294pc().m4135V(), false);
            if (b3Var != null) {
                b3Var.m27114r(getMeasuredWidth());
                b3Var.m27151c1();
                b3Var.m27136i(this);
                if (b3Var.m27138h0()) {
                    this.f21820b.m2294pc().m4121g(this);
                }
            }
            if (b3Var != null) {
                m18494v0(b3Var.m27094y(), b3Var.m27096x(), null);
            } else {
                m18494v0(null, 0L, null);
            }
            C3941g gVar = this.f32205m0;
            if (b3Var == null || !b3Var.m27127l0()) {
                z = false;
            }
            gVar.m29571b(z, false);
            if (b3Var == null || !b3Var.m27138h0()) {
                setCustomControllerProvider(null);
            } else {
                setCustomControllerProvider(new C9904a());
            }
        }
        C6257p pVar = this.f32204l0;
        if (b3Var != null) {
            hVar = b3Var.m27105u();
        }
        pVar.m20819G(hVar);
    }

    public void setIsDragging(boolean z) {
        if (this.f32208p0 != z) {
            this.f32208p0 = z;
            invalidate();
        }
    }

    public void setNeedBackground(boolean z) {
        if (this.f32207o0 != z) {
            this.f32207o0 = z;
            if (z) {
                C10189d.m5797g(this);
            } else {
                C10189d.m5794j(this);
            }
        }
    }

    public void m6640u1() {
        C6257p pVar = this.f32204l0;
        C4592b3 b3Var = this.f32203k0;
        pVar.m20819G(b3Var != null ? b3Var.m27105u() : null);
        invalidate();
    }

    public boolean m6639v1() {
        return this.f32208p0;
    }

    public final void m6638z1() {
        int chatListMode = getChatListMode();
        int measuredWidth = C4403w.m27984G2() ? (getMeasuredWidth() - m6660F0(chatListMode)) - m6658M0(chatListMode) : m6660F0(chatListMode);
        this.f32204l0.mo20256K0(measuredWidth, m6656Q0(chatListMode), m6658M0(chatListMode) + measuredWidth, m6656Q0(chatListMode) + m6658M0(chatListMode));
    }
}
