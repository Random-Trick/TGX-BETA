package hd;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import ce.a0;
import ce.j0;
import ce.y;
import eb.k;
import gd.w;
import java.util.ArrayList;
import je.l0;
import je.x0;
import kb.b;
import ob.e;
import oc.v0;
import od.j1;
import od.l1;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.v4;
import ud.x2;
import vc.g1;
import vc.v2;
import yd.g;
import zd.o6;

public class n5 extends s4 {
    public static float f13308j3 = 10.0f;
    public x0 U2;
    public String V2;
    public int W2;
    public z0 X2;
    public boolean Y2;
    public TdApi.FormattedText Z2;
    public long f13309a3;
    public boolean f13310b3;
    public boolean f13311c3;
    public float f13312d3;
    public float f13313e3;
    public b f13314f3;
    public ViewParent f13315g3;
    public j1 f13316h3;
    public long f13317i3;

    public class a extends b {
        public final g1 M;

        public a(g1 g1Var) {
            this.M = g1Var;
        }

        @Override
        public void b() {
            if (n5.this.f13310b3 && n5.this.f13314f3 == this) {
                n5.this.f13314f3 = null;
                n5.this.va(this.M);
            }
        }
    }

    public n5(v2 v2Var, TdApi.Message message, TdApi.Photo photo, TdApi.FormattedText formattedText) {
        super(v2Var, message);
        f0 f0Var = new f0(t(), this.O0, photo, message.chatId, message.f19946id, (s4) this, true);
        f0Var.C0(this.P0);
        qa(f0Var, formattedText);
    }

    public static boolean ra(TdApi.MessageContent messageContent) {
        int constructor = messageContent.getConstructor();
        return constructor == -1851395174 || constructor == 1306939396 || constructor == 2021281344;
    }

    public static void ta(ViewParent viewParent, j1 j1Var) {
        viewParent.requestDisallowInterceptTouchEvent(false);
        j1Var.Ih();
    }

    public void ua(View view, Rect rect) {
        this.X2.v().G().T0(rect);
    }

    public final boolean Aa() {
        String J3 = J3();
        String str = this.V2;
        if (str != null && str.equals(J3)) {
            return false;
        }
        this.V2 = J3;
        this.W2 = (int) v0.T1(J3, s4.N6());
        return true;
    }

    @Override
    public void D7(long j10, k kVar) {
        this.X2.M(j10, kVar);
    }

    @Override
    public void G7() {
        za();
    }

    @Override
    public boolean I5() {
        return this.Y2;
    }

    @Override
    public void L8(ld.b bVar, boolean z10, int i10) {
        this.X2.J(bVar, z10);
    }

    @Override
    public boolean L9(TdApi.Message message, TdApi.MessageContent messageContent, boolean z10) {
        int i10;
        if (message.content.getConstructor() != messageContent.getConstructor()) {
            f0 ma2 = ma(message, messageContent);
            synchronized (this) {
                i10 = this.X2.H(ma2) != 0 ? 2 : 0;
            }
        } else {
            f0 p10 = this.X2.p(message.f19946id);
            if (p10 != null && messageContent.getConstructor() == -1851395174) {
                int F = p10.F();
                int E = p10.E();
                if (p10.J0(message.f19946id, (TdApi.MessagePhoto) messageContent)) {
                    if (!(F == p10.F() && E == p10.E())) {
                        this.X2.E();
                    }
                    i10 = 2;
                }
            }
            i10 = 0;
        }
        message.content = messageContent;
        if (ja()) {
            i10 |= 1;
        }
        if (i10 == 0) {
            return false;
        }
        z8();
        if ((i10 & 2) == 0) {
            return true;
        }
        x5();
        return true;
    }

    @Override
    public void N7(boolean z10) {
        z0 z0Var = this.X2;
        f0 v10 = z0Var != null ? z0Var.v() : null;
        if (v10 != null) {
            if (z10) {
                Aa();
            }
            int b32 = b3();
            int c32 = c3();
            int B = v10.B() + b32;
            int x10 = v10.x() + c32;
            int i10 = (b32 + B) / 2;
            int i11 = (c32 + x10) / 2;
            int i12 = a0.i(15.0f);
            if (z10) {
                v5(b32, c32, B, x10);
            } else {
                v5(i10 - i12, i11 - i12, i10 + i12, i11 + i12);
            }
        }
    }

    @Override
    public int O3(boolean z10) {
        return 0;
    }

    @Override
    public void O7(boolean z10) {
        z0 z0Var;
        if (!f6() && (z0Var = this.X2) != null && z0Var.v() != null) {
            this.X2.v().G().q0(true);
        }
    }

    @Override
    public int R1() {
        if (this.U2 == null || w.G2() != this.U2.o()) {
            return -1;
        }
        return this.U2.p() + ((s4.f13430h2 + s4.f13429g2) * 2);
    }

    @Override
    public void R7(g1 g1Var, boolean z10) {
        this.X2.A();
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public void T7(TdApi.Message message, int i10) {
        boolean U9 = U9();
        int F = this.X2.F(message.f19946id, i10);
        if (F == 1) {
            if (U9() != U9) {
                y8();
            }
            u5();
        } else if (F == 2) {
            y8();
        }
    }

    @Override
    public boolean U(float f10, float f11) {
        int b32 = b3();
        int c32 = c3();
        return !a6() || f10 < ((float) b32) || f10 > ((float) (this.X2.w() + b32)) || f11 < ((float) c32) || f11 > ((float) (this.X2.t() + c32));
    }

    @Override
    public l1 U3(long j10, View view, int i10, int i11, int i12) {
        l1 u10 = this.X2.u(j10, view, i10, i11, i12);
        if (u10 != null) {
            u10.m((!R9() || !g6()) ? R.id.theme_color_filling : R.id.theme_color_bubbleOut_background);
        }
        return u10;
    }

    @Override
    public void U7(TdApi.Message message, boolean z10, boolean z11) {
        ja();
        this.X2.d(la(message), z10);
    }

    @Override
    public void V7() {
        this.X2.l();
        ia(null, false);
        ka(null, true, false);
    }

    @Override
    public int W2() {
        if (this.U2 == null) {
            return this.X2.t();
        }
        return this.X2.t() + this.U2.getHeight() + a0.i(f13308j3) + ((!R9() || T9()) ? 0 : a0.i(f13308j3) - Y1());
    }

    @Override
    public boolean W7(TdApi.Message message, TdApi.MessageContent messageContent, TdApi.MessageContent messageContent2, boolean z10) {
        if (message.viaBotUserId == 0 || messageContent.getConstructor() != -1851395174) {
            return false;
        }
        L9(message, messageContent2, z10);
        return true;
    }

    @Override
    public boolean X0() {
        return this.U2 == null && !e5();
    }

    @Override
    public void X7(long j10) {
        if (f6() && a6()) {
            this.X2.v().G().k0(R.drawable.baseline_check_24);
        }
    }

    @Override
    public int Y1() {
        return s4.f13430h2;
    }

    @Override
    public void Z(TdApi.ChatType chatType) {
        this.X2.e(chatType);
    }

    @Override
    public void Z7(long j10, long j11, boolean z10) {
        this.X2.N(j10, j11, z10);
        if (this.f13309a3 == j10) {
            this.f13309a3 = j11;
        }
    }

    @Override
    public int a3() {
        return this.U2 == null ? this.X2.w() : Math.max(this.X2.w(), this.U2.getWidth());
    }

    @Override
    public int a8(long j10, long j11, int i10) {
        if (!ja()) {
            return 0;
        }
        z8();
        return G3() == i10 ? 1 : 2;
    }

    @Override
    public void b0(int i10) {
        int i11;
        boolean U9 = U9();
        if (!U9) {
            i10 = G4();
            i11 = F4();
        } else if (this.X2.y()) {
            float f10 = i10;
            float f11 = this.X2.v().U() ? 1.08f : 1.5f;
            f0 v10 = this.X2.v();
            i11 = Math.min((int) (f11 * f10), (int) (v10.E() * (f10 / v10.F())));
        } else {
            i11 = (int) (i10 * 0.85f);
        }
        this.X2.f(i10, i11, U9 ? 1 : 0, false);
        if (a6()) {
            Aa();
        }
        x0 x0Var = this.U2;
        if (x0Var != null) {
            x0Var.B(R9() ? this.X2.w() - (s4.f13429g2 * 2) : t4());
        }
    }

    @Override
    public void b1(g1 g1Var, Canvas canvas, int i10, int i11, int i12, ld.b bVar) {
        int i13;
        boolean z10 = R9() && !T9();
        int b10 = z10 ? g.b(canvas, X1()) : Integer.MIN_VALUE;
        this.X2.m(g1Var, canvas, i10, i11, bVar, U9());
        if (z10) {
            g.f(canvas, b10);
        }
        if (this.V2 != null) {
            f0 v10 = this.X2.v();
            int i14 = a0.i(4.0f);
            int y10 = v10.y() + i14;
            if (R9()) {
                i13 = a0.i(2.0f) + i14;
            } else {
                i13 = a0.i(4.0f);
            }
            int i15 = y10 + i13;
            int i16 = this.W2 + i15 + i14;
            int x10 = (((i11 + v10.x()) - a0.i(4.0f)) - a0.i(20.0f)) - a0.i(4.0f);
            if (R9()) {
                x10 -= i14;
            }
            RectF a02 = y.a0();
            a02.set(i15 - a0.i(4.0f), a0.i(4.0f) + x10, i16, a0.i(4.0f) + x10 + a0.i(20.0f));
            canvas.drawRoundRect(a02, a0.i(4.0f), a0.i(4.0f), y.g(1275068416));
            canvas.drawText(this.V2, i15, x10 + a0.i(18.0f), y.a(s4.N6(), -1));
            if (c6() && !f6()) {
                int C = v10.C();
                int D = v10.D();
                int i17 = a0.i(10.0f);
                a02.set(C - i17, D - i17, C + i17, D + i17);
                canvas.drawArc(a02, -90.0f, H3() * (-360.0f), true, y.g(-1));
            }
        }
        x0 x0Var = this.U2;
        if (x0Var != null) {
            x0Var.h(canvas, pa(g1Var, x0Var, false), pa(g1Var, this.U2, true), 0, a0.i(f13308j3) + i11 + this.X2.t(), null, 1.0f);
        }
    }

    @Override
    public void b8(long j10, float f10, boolean z10) {
        f0 p10;
        if (z10 && (p10 = this.X2.p(j10)) != null) {
            int y10 = p10.y();
            int A = p10.A();
            D5(y10, A, y10 + p10.B(), A + p10.x(), false);
        }
    }

    @Override
    public boolean f8(g1 g1Var, MotionEvent motionEvent) {
        if (super.f8(g1Var, motionEvent)) {
            return true;
        }
        int b32 = b3();
        int c32 = c3();
        int w10 = this.X2.w() + b32;
        int t10 = this.X2.t() + c32;
        x0 x0Var = this.U2;
        if (x0Var != null && x0Var.x(g1Var, motionEvent)) {
            return true;
        }
        if (!a6() || !this.X2.v().G().H()) {
            return this.X2.C(g1Var, motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            ia(g1Var, false);
            this.f13312d3 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.f13313e3 = y10;
            float f10 = this.f13312d3;
            boolean z10 = f10 >= ((float) b32) && f10 <= ((float) w10) && y10 >= ((float) c32) && y10 <= ((float) t10);
            this.f13310b3 = z10;
            if (z10) {
                wa(g1Var);
                return true;
            }
        } else if (action == 1) {
            if (this.f13310b3) {
                ia(g1Var, true);
            }
            if (this.f13311c3) {
                ka(g1Var, false, true);
            }
        } else if (action != 2) {
            if (action == 3) {
                if (this.f13310b3) {
                    ia(g1Var, false);
                }
                if (this.f13311c3) {
                    ka(g1Var, false, false);
                }
            }
        } else if (this.f13310b3 && Math.max(Math.abs(this.f13312d3 - motionEvent.getX()), Math.abs(this.f13313e3 - motionEvent.getY())) > a0.p()) {
            ia(g1Var, false);
            return true;
        }
        return this.f13310b3 || this.f13311c3;
    }

    @Override
    public boolean h7() {
        return true;
    }

    public final void ia(View view, boolean z10) {
        b bVar = this.f13314f3;
        if (bVar != null) {
            bVar.c();
            this.f13314f3 = null;
            if (z10) {
                ya(view);
            }
        }
        this.f13310b3 = false;
    }

    public final boolean ja() {
        boolean z10;
        long j10;
        TdApi.FormattedText formattedText;
        synchronized (this) {
            ArrayList<TdApi.Message> P2 = P2();
            boolean z11 = true;
            z10 = false;
            if (P2 == null || P2.isEmpty()) {
                o6 o6Var = this.O0;
                TdApi.Message message = this.f13449a;
                TdApi.FormattedText O5 = o6Var.O5(message.chatId, message.f19946id);
                if (O5 != null) {
                    formattedText = O5;
                } else {
                    formattedText = e.y1(this.f13449a.content);
                    z11 = false;
                }
                j10 = this.f13449a.f19946id;
            } else {
                TdApi.Message z02 = t2.z0(this.O0, P2);
                if (z02 != null) {
                    formattedText = this.O0.O5(z02.chatId, z02.f19946id);
                    if (formattedText == null) {
                        formattedText = e.y1(z02.content);
                        z11 = false;
                    }
                    j10 = z02.f19946id;
                } else {
                    formattedText = null;
                    j10 = 0;
                }
            }
            z10 = z11;
        }
        this.Y2 = z10;
        return xa(formattedText, j10);
    }

    @Override
    public boolean k7() {
        return true;
    }

    public final void ka(View view, boolean z10, boolean z11) {
        if (this.f13311c3) {
            this.f13311c3 = false;
            if (z11 && SystemClock.uptimeMillis() - this.f13317i3 <= 200) {
                ya(view);
            }
            if (!z10) {
                this.f13315g3.requestDisallowInterceptTouchEvent(false);
                this.f13316h3.ai();
            } else if (this.X2.v().S() != null) {
                final ViewParent viewParent = this.f13315g3;
                final j1 j1Var = this.f13316h3;
                j0.e0(new Runnable() {
                    @Override
                    public final void run() {
                        n5.ta(viewParent, j1Var);
                    }
                }, 20L);
            } else {
                this.f13315g3.requestDisallowInterceptTouchEvent(false);
                this.f13316h3.Ih();
            }
            this.f13315g3 = null;
            this.f13316h3 = null;
        }
    }

    public final f0 la(TdApi.Message message) {
        return ma(message, message.content);
    }

    @Override
    public long m1(float f10, float f11) {
        f0 q10 = this.X2.q(f10, f11);
        if (q10 != null) {
            return q10.N();
        }
        return 0L;
    }

    @Override
    public boolean m8(View view, float f10, float f11) {
        x0 x0Var;
        return this.X2.D(view) || ((x0Var = this.U2) != null && x0Var.A(view)) || super.m8(view, f10, f11);
    }

    public final f0 ma(TdApi.Message message, TdApi.MessageContent messageContent) {
        f0 f0Var;
        int constructor = messageContent.getConstructor();
        if (constructor == -1851395174) {
            f0Var = new f0(t(), this.O0, ((TdApi.MessagePhoto) messageContent).photo, message.chatId, message.f19946id, (s4) this, true);
        } else if (constructor == 1306939396) {
            f0Var = new f0(t(), this.O0, ((TdApi.MessageAnimation) messageContent).animation, message.chatId, message.f19946id, (s4) this, true);
        } else if (constructor == 2021281344) {
            f0Var = new f0(t(), this.O0, ((TdApi.MessageVideo) messageContent).video, message.chatId, message.f19946id, (s4) this, true);
        } else {
            throw new IllegalArgumentException("message.content == " + messageContent);
        }
        f0Var.C0(this.P0);
        f0Var.y0(u1(message.f19946id));
        return f0Var;
    }

    public long na() {
        return this.f13309a3;
    }

    public TdApi.File oa() {
        return this.X2.v().P();
    }

    @Override
    public boolean p7() {
        return true;
    }

    public final int pa(View view, x0 x0Var, boolean z10) {
        if (!z10) {
            return R9() ? T9() ? b3() : b3() + s4.f13429g2 : u4();
        }
        if (R9()) {
            return (E1() - s4.f13429g2) - s4.f13430h2;
        }
        if (U9()) {
            return view.getMeasuredWidth() - u4();
        }
        int b32 = b3();
        return Math.max(this.X2.w() + b32, b32 + x0Var.getWidth());
    }

    @Override
    public boolean q6(TdApi.Message message, TdApi.MessageContent messageContent) {
        return ra(messageContent) && ra(message.content);
    }

    public final void qa(f0 f0Var, TdApi.FormattedText formattedText) {
        TdApi.Message message = this.f13449a;
        if (message.chatId == 0) {
            f0Var.g0(((TdApi.MessagePhoto) message.content).photo.sizes[0].type);
        }
        this.X2 = new z0(f0Var, this);
        za();
        xa(formattedText, this.f13449a.f19946id);
        ja();
        if (c6()) {
            O7(false);
        }
    }

    @Override
    public boolean s8() {
        if (j0.Q() && !j0.S() && K5() && !X5() && this.f13449a.content.getConstructor() != 1306939396) {
            if (this.X2.y()) {
                if (this.X2.s() >= (this.X2.v().U() ? 0.8f : 0.5f)) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean sa(int i10) {
        return this.X2.y() || (this.X2.v() != null && this.X2.v().a0() && this.X2.v().S().video.f19913id == i10);
    }

    @Override
    public int v3() {
        return a0.i(8.0f);
    }

    public final void va(g1 g1Var) {
        if (!this.f13311c3 && g1Var != null) {
            ViewParent parent = g1Var.getParent();
            this.f13315g3 = parent;
            if (parent != null) {
                this.f13311c3 = true;
                this.f13317i3 = SystemClock.uptimeMillis();
                this.f13315g3.requestDisallowInterceptTouchEvent(true);
                v4<?> F = t().Q1().F();
                if (F != null) {
                    F.La();
                }
                j1 pk = j1.pk(this);
                this.f13316h3 = pk;
                if (pk == null) {
                    this.f13315g3.requestDisallowInterceptTouchEvent(false);
                    this.f13311c3 = false;
                }
            }
        }
    }

    @Override
    public int w3() {
        return e.c1(this.Z2) ? a0.i(8.0f) : -a0.i(2.0f);
    }

    public final void wa(g1 g1Var) {
        ia(g1Var, false);
        a aVar = new a(g1Var);
        this.f13314f3 = aVar;
        aVar.e(j0.o());
        this.f13310b3 = true;
        j0.e0(this.f13314f3, 100L);
    }

    public final boolean xa(TdApi.FormattedText formattedText, long j10) {
        this.f13309a3 = j10;
        if (e.O(this.Z2, formattedText)) {
            return false;
        }
        this.Z2 = formattedText;
        if (!e.c1(formattedText)) {
            x0 D = new x0(formattedText.text, s4.L4(), K4(), l0.F(this.O0, formattedText, h8())).a(Log.TAG_GIF_LOADER).D(F0());
            this.U2 = D;
            D.H(this.P0);
            if (!R9()) {
                this.U2.a(64);
            }
        } else {
            this.U2 = null;
        }
        za();
        return true;
    }

    public final void ya(View view) {
        t().I3().h(view, this.P0).i(Q0()).u(new x2.f() {
            @Override
            public final void d1(View view2, Rect rect) {
                n5.this.ua(view2, rect);
            }
        }).C(this.O0, R.string.HoldMediaTutorial);
    }

    public final void za() {
        if (R9()) {
            this.X2.L(x7(), g7());
        }
    }

    public n5(v2 v2Var, TdApi.Message message, TdApi.Video video, TdApi.FormattedText formattedText) {
        super(v2Var, message);
        f0 f0Var = new f0(t(), this.O0, video, message.chatId, message.f19946id, (s4) this, true);
        f0Var.C0(this.P0);
        qa(f0Var, formattedText);
    }

    public n5(v2 v2Var, TdApi.Message message, TdApi.Animation animation, TdApi.FormattedText formattedText) {
        super(v2Var, message);
        f0 f0Var = new f0(t(), this.O0, animation, message.chatId, message.f19946id, (s4) this, true);
        f0Var.C0(this.P0);
        qa(f0Var, formattedText);
    }

    public n5(v2 v2Var, TdApi.Message message, TdApi.Document document, TdApi.FormattedText formattedText) {
        super(v2Var, message);
        f0 f0Var = new f0(t(), this.O0, document, message.chatId, message.f19946id, (s4) this, true);
        f0Var.C0(this.P0);
        qa(f0Var, formattedText);
    }
}
