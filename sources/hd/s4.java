package hd;

import ae.p;
import ae.z;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import ce.a0;
import ce.c0;
import ce.j0;
import ce.o;
import ce.y;
import de.rh;
import eb.k;
import eb.l;
import gb.c;
import gb.g;
import gd.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import je.a;
import je.g;
import je.j;
import je.l0;
import je.o0;
import je.t;
import je.w0;
import je.x0;
import ld.v;
import md.m;
import oc.v0;
import od.l1;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.drinkmore.Tracer;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.v4;
import ud.x2;
import vc.g1;
import vc.h1;
import vc.r3;
import vc.v2;
import zd.d9;
import zd.fc;
import zd.hj;
import zd.o6;
import zd.vb;

public abstract class s4 implements g.a, d9, k.b, Comparable<s4>, a.c {
    public static Bitmap A1;
    public static int A2;
    public static Bitmap B1;
    public static int B2;
    public static Bitmap C1;
    public static int C2;
    public static Bitmap D1;
    public static int D2;
    public static Bitmap E1;
    public static int E2;
    public static Bitmap F1;
    public static int F2;
    public static Bitmap G1;
    public static int G2;
    public static Bitmap H1;
    public static int H2;
    public static Paint I1;
    public static int I2;
    public static Paint J1;
    public static int J2;
    public static Paint K1;
    public static int K2;
    public static Paint L1;
    public static int L2;
    public static Bitmap M1;
    public static int M2;
    public static Bitmap N1;
    public static int N2;
    public static Bitmap O1;
    public static Drawable O2;
    public static Bitmap P1;
    public static Drawable P2;
    public static Paint Q1;
    public static Drawable Q2;
    public static g R1;
    public static String R2;
    public static Paint S1;
    public static String S2;
    public static w0 T1;
    public static boolean T2;
    public static w0 U1;
    public static w0 V1;
    public static w0 W1;
    public static w0 X1;
    public static w0 Y1;
    public static int Z1;
    public static int f13423a2;
    public static int f13424b2;
    public static int f13425c2;
    public static int f13426d2;
    public static int f13427e2;
    public static int f13428f2;
    public static int f13429g2;
    public static int f13430h2;
    public static int f13431i2;
    public static int f13432j2;
    public static int f13433k2;
    public static int f13434l2;
    public static int f13435m2;
    public static int f13436n2;
    public static int f13437o2;
    public static int f13438p2;
    public static int f13439q2;
    public static int f13440r2;
    public static int f13441s2;
    public static int f13442t2;
    public static int f13443u2;
    public static int f13444v2;
    public static int f13445w2;
    public static int f13446x2;
    public static int f13447y2;
    public static int f13448z2;
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public final Path E0;
    public final Path F0;
    public float G0;
    public float H0;
    public float I0;
    public float J0;
    public final RectF K0;
    public final RectF L0;
    public int M;
    public boolean M0;
    public int N;
    public final v2 N0;
    public int O;
    public final o6 O0;
    public String P;
    public final gb.g P0;
    public final fc Q;
    public final gb.g Q0;
    public final String R;
    public final eb.f R0;
    public m6 S;
    public final eb.f S0;
    public r3 T;
    public Object T0;
    public c4 U;
    public String V;
    public je.g W;
    public int W0;
    public je.g X;
    public int X0;
    public je.g Y;
    public ArrayList<TdApi.Message> Y0;
    public ld.h Z;
    public TdApi.ChatAdministrator Z0;
    public TdApi.Message f13449a;
    public hd.b f13450a0;
    public TdApi.Chat f13451a1;
    public int f13452b;
    public je.e f13453b0;
    public long f13454b1;
    public int f13455c;
    public final je.a f13456c0;
    public h f13457c1;
    public final je.a f13458d0;
    public lb.d<i> f13459d1;
    public final je.a f13460e0;
    public boolean f13461e1;
    public final je.a f13462f0;
    public String f13464g0;
    public float f13465g1;
    public je.g f13466h0;
    public float f13467h1;
    public je.g f13468i0;
    public k f13469i1;
    public float f13470j0;
    public jb.e f13471j1;
    public int f13472k0;
    public k0.e<eb.k> f13473k1;
    public int f13474l0;
    public eb.k f13475l1;
    public int f13476m0;
    public float f13477m1;
    public int f13478n0;
    public float f13479n1;
    public int f13480o0;
    public float f13481o1;
    public int f13482p0;
    public float f13483p1;
    public int f13484q0;
    public eb.k f13485q1;
    public int f13486r0;
    public eb.k f13487r1;
    public float f13488s0;
    public eb.k f13489s1;
    public float f13490t0;
    public int f13491t1;
    public int f13492u0;
    public boolean f13493u1;
    public int f13494v0;
    public String f13495v1;
    public int f13496w0;
    public x0 f13497w1;
    public int f13498x0;
    public String f13499x1;
    public int f13500y0;
    public int f13501y1;
    public int f13502z0;
    public g.c f13503z1;
    public final gb.c U0 = new gb.c(new c());
    public int V0 = 0;
    public float f13463f1 = 0.0f;

    public class a implements k.b {
        public a() {
        }

        @Override
        public void n4(int i10, float f10, float f11, eb.k kVar) {
            if (ib.c.b(s4.this.f13452b, 32) && s4.this.R9()) {
                int G3 = s4.this.G3();
                s4.this.a0(false);
                if (s4.this.G3() != G3) {
                    s4.this.K8();
                }
            }
            s4.this.u5();
        }

        @Override
        public void o4(int i10, float f10, eb.k kVar) {
            l.a(this, i10, f10, kVar);
        }
    }

    public class b implements k.b {
        public b() {
        }

        @Override
        public void n4(int i10, float f10, float f11, eb.k kVar) {
            s4.this.u5();
        }

        @Override
        public void o4(int i10, float f10, eb.k kVar) {
            l.a(this, i10, f10, kVar);
        }
    }

    public class c implements c.a {
        public c() {
        }

        @Override
        public boolean B(float f10, float f11) {
            return gb.b.d(this, f10, f11);
        }

        @Override
        public void C(View view, float f10, float f11) {
            int i10 = s4.this.V0;
            if (i10 == 1) {
                r3 r3Var = s4.this.T;
                if (r3Var != null && r3Var.w()) {
                    s4 s4Var = s4.this;
                    TdApi.Message message = s4Var.f13449a;
                    if (message.replyInChatId != message.chatId) {
                        TdApi.Message message2 = s4.this.f13449a;
                        s4Var.g8(new ob.d(message2.replyInChatId, message2.replyToMessageId));
                    } else {
                        s4Var.k5(message.replyToMessageId);
                    }
                }
            } else if (i10 == 2) {
                s4.this.i8(view, null, null, null, ((g1) view).getAvatarReceiver());
            } else if (i10 == 3) {
                s4.this.g8(null);
            }
            s4.this.V0 = 0;
        }

        @Override
        public boolean E4() {
            return gb.b.a(this);
        }

        @Override
        public void G(View view, float f10, float f11) {
            gb.b.h(this, view, f10, f11);
        }

        @Override
        public void U2(View view, float f10, float f11) {
            gb.b.e(this, view, f10, f11);
        }

        @Override
        public void U4(View view, float f10, float f11) {
            gb.b.f(this, view, f10, f11);
        }

        @Override
        public boolean X6(float f10, float f11) {
            return gb.b.c(this, f10, f11);
        }

        @Override
        public long getLongPressDuration() {
            return gb.b.b(this);
        }

        @Override
        public boolean m0(View view, float f10, float f11) {
            s4 s4Var = s4.this;
            s4Var.V0 = s4Var.N2((g1) view, f10, f11);
            return s4.this.V0 != 0;
        }

        @Override
        public void o(View view, float f10, float f11) {
            gb.b.i(this, view, f10, f11);
        }

        @Override
        public void o2(View view, float f10, float f11) {
            gb.b.g(this, view, f10, f11);
        }

        @Override
        public boolean s4(View view, float f10, float f11) {
            return gb.b.k(this, view, f10, f11);
        }

        @Override
        public void z6(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
            gb.b.j(this, view, motionEvent, f10, f11, f12, f13);
        }
    }

    public class d extends je.l {
        public final int f13507b;

        public d(je.k kVar, int i10) {
            super(kVar);
            this.f13507b = i10;
        }

        @Override
        public int d(boolean z10) {
            if (z10) {
                return this.f13507b;
            }
            return 0;
        }

        @Override
        public int o0(boolean z10) {
            return ae.j.L(this.f13507b);
        }

        @Override
        public int r0(boolean z10) {
            if (z10) {
                return ib.d.a(0.2f, ae.j.L(this.f13507b));
            }
            return 0;
        }
    }

    public class e implements k.b {
        public final float M;
        public final float N;
        public final float O;
        public final View P;
        public final boolean f13509a;
        public final Runnable f13510b;
        public final boolean[] f13511c;

        public e(boolean z10, Runnable runnable, boolean[] zArr, float f10, float f11, float f12, View view) {
            this.f13509a = z10;
            this.f13510b = runnable;
            this.f13511c = zArr;
            this.M = f10;
            this.N = f11;
            this.O = f12;
            this.P = view;
        }

        @Override
        public void n4(int i10, float f10, float f11, eb.k kVar) {
            Runnable runnable;
            if (this.f13509a && f11 >= 0.85f && (runnable = this.f13510b) != null) {
                boolean[] zArr = this.f13511c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    v0.D2(runnable);
                }
            }
            float f12 = 1.0f - f10;
            s4.this.o9(false, this.M * f12, false, true);
            s4.this.o9(true, this.N * f12, false, true);
            s4.this.H9(this.O * f12, false);
            View view = this.P;
            if (view instanceof h1) {
                ((h1) view).setSwipeTranslation(s4.this.f13477m1);
            }
        }

        @Override
        public void o4(int i10, float f10, eb.k kVar) {
            s4.this.f13452b &= -67108865;
        }
    }

    public class f implements g.c {
        public f() {
        }

        @Override
        public boolean A(String str) {
            return je.h.i(this, str);
        }

        @Override
        public boolean C5(String str) {
            return je.h.m(this, str);
        }

        @Override
        public boolean D3(android.view.View r3, je.g r4, je.v0 r5, java.lang.String r6, boolean r7) {
            throw new UnsupportedOperationException("Method not decompiled: hd.s4.f.D3(android.view.View, je.g, je.v0, java.lang.String, boolean):boolean");
        }

        @Override
        public boolean H3(long j10) {
            return je.h.l(this, j10);
        }

        @Override
        public TdApi.WebPage J2(String str) {
            return s4.this.q1(str);
        }

        @Override
        public p O1(View view, je.g gVar) {
            return je.h.c(this, view, gVar);
        }

        @Override
        public boolean O4(String str) {
            return je.h.g(this, str);
        }

        @Override
        public boolean R6(View view, String str) {
            return je.h.d(this, view, str);
        }

        @Override
        public boolean a5(String str) {
            return je.h.e(this, str);
        }

        @Override
        public boolean d5(View view, String str, boolean z10, hj.q qVar) {
            return je.h.k(this, view, str, z10, qVar);
        }

        @Override
        public boolean l2(String str) {
            return s4.this.g5(str);
        }

        @Override
        public boolean l7(View view, String str, String str2, hj.q qVar) {
            return je.h.j(this, view, str, str2, qVar);
        }

        @Override
        public boolean z3(String str) {
            return je.h.h(this, str);
        }
    }

    public static final class g extends Handler {
        public g() {
            super(Looper.getMainLooper());
        }

        @Override
        public void handleMessage(Message message) {
            if (message.what == 0) {
                ((s4) message.obj).D0();
            }
        }
    }

    public interface h {
        void a(boolean z10);
    }

    public interface i {
        void a(s4 s4Var, long j10, long j11, boolean z10);
    }

    public interface j {
        void L1(boolean z10, eb.k kVar);

        void w3(float f10, eb.k kVar);
    }

    public static class k {
        public int f13513a;
        public float f13514b;
        public float f13515c;
        public float f13516d;
        public float f13517e;
        public float f13518f;

        public k(int i10, float f10, float f11, float f12, float f13, float f14) {
            this.f13513a = i10;
            this.f13514b = f10;
            this.f13515c = f11;
            this.f13516d = f12;
            this.f13517e = f13;
            this.f13518f = f14;
        }
    }

    public s4(v2 v2Var, TdApi.Message message) {
        TdApi.User u22;
        TdApi.MessageForwardInfo messageForwardInfo;
        a aVar = new a();
        DecelerateInterpolator decelerateInterpolator = db.b.f7287b;
        this.R0 = new eb.f(0, aVar, decelerateInterpolator, 200L);
        this.S0 = new eb.f(0, new b(), decelerateInterpolator, 200L);
        if (!T2) {
            synchronized (s4.class) {
                if (!T2) {
                    m5();
                }
            }
        }
        o5();
        this.N0 = v2Var;
        o6 c10 = v2Var.r0().c();
        this.O0 = c10;
        this.E0 = new Path();
        this.K0 = new RectF();
        this.F0 = new Path();
        this.L0 = new RectF();
        gb.g gVar = new gb.g();
        this.P0 = gVar;
        gVar.r(this);
        this.f13449a = message;
        TdApi.MessageSender messageSender = message.senderId;
        if (c10.k7(message.chatId)) {
            this.f13452b |= 33554432;
            TdApi.MessageForwardInfo messageForwardInfo2 = message.forwardInfo;
            if (messageForwardInfo2 != null) {
                int constructor = messageForwardInfo2.origin.getConstructor();
                if (constructor == -355174191) {
                    messageSender = new TdApi.MessageSenderUser(((TdApi.MessageForwardOriginUser) message.forwardInfo.origin).senderUserId);
                } else if (constructor == 1490730723) {
                    TdApi.MessageForwardInfo messageForwardInfo3 = message.forwardInfo;
                    TdApi.MessageForwardOriginChannel messageForwardOriginChannel = (TdApi.MessageForwardOriginChannel) messageForwardInfo3.origin;
                    if (messageForwardInfo3.fromChatId == 0 && messageForwardInfo3.fromMessageId == 0) {
                        messageForwardInfo3.fromChatId = messageForwardOriginChannel.chatId;
                        messageForwardInfo3.fromMessageId = messageForwardOriginChannel.messageId;
                    }
                } else if (constructor == 1526010724) {
                    messageSender = new TdApi.MessageSenderChat(((TdApi.MessageForwardOriginChat) message.forwardInfo.origin).senderChatId);
                }
            }
        }
        fc fcVar = new fc(c10, message.chatId, messageSender, v2Var, !message.isOutgoing && Q5());
        this.Q = fcVar;
        this.f13462f0 = new a.b().g().a(false).d(this).f(R.drawable.deproko_baseline_pin_14, 14.0f, 0.0f, 1).b();
        float f10 = 11.0f;
        if (message.isChannelPost || ((messageForwardInfo = message.forwardInfo) != null && (messageForwardInfo.origin.getConstructor() == 1490730723 || t2.t2(message.interactionInfo) > 1 || c10.O6(message.forwardInfo.fromChatId) || fcVar.m()))) {
            this.f13456c0 = new a.b().g().a(false).j(R9() ? 11.0f : 12.0f).d(this).e(new je.k() {
                @Override
                public int R() {
                    return j.d(this);
                }

                @Override
                public long W0(boolean z10) {
                    return j.c(this, z10);
                }

                @Override
                public int a1() {
                    return j.f(this);
                }

                @Override
                public final int c() {
                    return s4.this.O4();
                }

                @Override
                public int d(boolean z10) {
                    return j.b(this, z10);
                }

                @Override
                public int g(boolean z10) {
                    return j.h(this, z10);
                }

                @Override
                public int o0(boolean z10) {
                    return j.e(this, z10);
                }

                @Override
                public int r0(boolean z10) {
                    return j.a(this, z10);
                }

                @Override
                public int t0(boolean z10) {
                    return j.g(this, z10);
                }
            }).f(R.drawable.baseline_visibility_14, 14.0f, 3.0f, 3).b();
        } else {
            this.f13456c0 = null;
        }
        this.f13458d0 = new a.b().g().a(false).j(R9() ? 11.0f : 12.0f).d(this).e(new je.k() {
            @Override
            public int R() {
                return j.d(this);
            }

            @Override
            public long W0(boolean z10) {
                return j.c(this, z10);
            }

            @Override
            public int a1() {
                return j.f(this);
            }

            @Override
            public final int c() {
                return s4.this.O4();
            }

            @Override
            public int d(boolean z10) {
                return j.b(this, z10);
            }

            @Override
            public int g(boolean z10) {
                return j.h(this, z10);
            }

            @Override
            public int o0(boolean z10) {
                return j.e(this, z10);
            }

            @Override
            public int r0(boolean z10) {
                return j.a(this, z10);
            }

            @Override
            public int t0(boolean z10) {
                return j.g(this, z10);
            }
        }).f(fcVar.m() ? R.drawable.templarian_baseline_comment_12 : R.drawable.baseline_updirectory_arrow_left_14, 12.0f, 3.0f, 3).b();
        this.f13460e0 = new a.b().g().a(false).j(!R9() ? 12.0f : f10).d(this).e(new je.k() {
            @Override
            public int R() {
                return j.d(this);
            }

            @Override
            public long W0(boolean z10) {
                return j.c(this, z10);
            }

            @Override
            public int a1() {
                return j.f(this);
            }

            @Override
            public final int c() {
                return s4.this.O4();
            }

            @Override
            public int d(boolean z10) {
                return j.b(this, z10);
            }

            @Override
            public int g(boolean z10) {
                return j.h(this, z10);
            }

            @Override
            public int o0(boolean z10) {
                return j.e(this, z10);
            }

            @Override
            public int r0(boolean z10) {
                return j.a(this, z10);
            }

            @Override
            public int t0(boolean z10) {
                return j.g(this, z10);
            }
        }).f(R.drawable.baseline_share_arrow_14, 14.0f, 3.0f, 3).b();
        K9(false);
        this.P = B1();
        if (message.viaBotUserId != 0) {
            if (c10.e2().u2(message.viaBotUserId) != null) {
                this.R = "@" + u22.username;
            } else {
                this.R = null;
            }
        } else {
            this.R = null;
        }
        if (y7()) {
            gb.g gVar2 = new gb.g();
            this.Q0 = gVar2;
            gVar2.r(this);
        } else {
            this.Q0 = null;
        }
        if (T9() || x1()) {
            L6();
        }
        long j10 = message.replyToMessageId;
        if (j10 != 0) {
            long j11 = message.messageThreadId;
            if (!(j10 == j11 && j11 == a7().qk())) {
                M6();
            }
        }
        if (a6() && p7() && message.ttlExpiresIn < message.ttl) {
            E9(false);
        }
    }

    public static int A3() {
        return a0.i(26.0f);
    }

    public void A6(int i10, g1 g1Var) {
        TdApi.Message message = this.f13449a;
        g1Var.U(message.chatId, message.f19946id, i10);
    }

    public static <T> T A7(T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("TDLib bug");
    }

    public void B6(g1 g1Var) {
        TdApi.Message message = this.f13449a;
        g1Var.c0(message.chatId, message.f19946id);
    }

    public static w0 C4() {
        if (W1 == null) {
            W1 = new w0(o.x()).o(-1.0f).m(he.i.c2().t0()).l(true);
            he.i.c2().k(W1);
        }
        return W1;
    }

    public void C6(g1 g1Var) {
        TdApi.Message message = this.f13449a;
        g1Var.g0(message.chatId, message.f19946id);
    }

    public Object D6(boolean z10, long j10, CharSequence charSequence, int i10, int i11, int i12, boolean z11) {
        return new o0(Q0(), this.O0, charSequence.toString(), i10, i11, 1024 | ((i12 == 1 || z10) ? 1 : 0), h8()).B(i12 == 1 ? Long.valueOf(j10) : null);
    }

    public static w0 D9() {
        if (U1 == null) {
            U1 = new w0(o.x()).m(15.0f);
        }
        return U1;
    }

    public Object F6(long j10, CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
        return new o0(Q0(), this.O0, charSequence.toString(), i10, i11, 1025, h8()).B(Long.valueOf(j10));
    }

    public void G6(int i10, int i11, g1 g1Var) {
        t().k2(g1Var, i10, i11);
    }

    public static g I3() {
        if (R1 == null) {
            synchronized (g.class) {
                if (R1 == null) {
                    R1 = new g();
                }
            }
        }
        return R1;
    }

    public static w0 L4() {
        if (T1 == null) {
            T1 = new w0(o.x()).m(he.i.c2().t0()).l(true);
            he.i.c2().k(T1);
        }
        return T1;
    }

    private void M9(long j10, long j11, boolean z10) {
        Z7(j10, j11, z10);
        lb.d<i> dVar = this.f13459d1;
        if (dVar != null) {
            Iterator<i> it = dVar.iterator();
            while (it.hasNext()) {
                it.next().a(this, j10, j11, z10);
            }
        }
    }

    public static String N1() {
        return w.i1(R.string.NewMessages);
    }

    public static TextPaint N6() {
        return y.b0(12.0f);
    }

    public static w0 O1() {
        if (V1 == null) {
            V1 = new w0(o.x()).o(1.0f).m(he.i.c2().t0()).l(true);
            he.i.c2().k(V1);
        }
        return V1;
    }

    public static TextPaint O6(boolean z10) {
        TextPaint b02 = y.b0(12.0f);
        if (z10) {
            b02.setColor(ae.j.L(R.id.theme_color_textLight));
        }
        return b02;
    }

    public static void O8() {
        T2 = false;
    }

    public static w0 P4() {
        if (Y1 == null) {
            Y1 = new w0(o.x()).m(11.0f);
        }
        return Y1;
    }

    public static TextPaint P6() {
        return y.b0(11.0f);
    }

    public static void R0(TdApi.Message message, TdApi.Message message2) {
        message2.f19946id = message.f19946id;
        message2.date = message.date;
        message2.sendingState = message.sendingState;
        message2.canBeDeletedOnlyForSelf = message.canBeDeletedOnlyForSelf;
        message2.canBeDeletedForAllUsers = message.canBeDeletedForAllUsers;
        message2.canGetMessageThread = message.canGetMessageThread;
        message2.canBeForwarded = message.canBeForwarded;
        message2.canBeSaved = message.canBeSaved;
        message2.canBeEdited = message.canBeEdited;
        message2.canGetStatistics = message.canGetStatistics;
        message2.canGetViewers = message.canGetViewers;
        message2.canGetMediaTimestampLinks = message.canGetMediaTimestampLinks;
        message2.hasTimestampedMedia = message.hasTimestampedMedia;
        message2.editDate = message.editDate;
        message2.isChannelPost = message.isChannelPost;
        message2.interactionInfo = message.interactionInfo;
    }

    public static hd.s4 W9(vc.v2 r22, org.drinkless.td.libcore.telegram.TdApi.Message r23) {
        throw new UnsupportedOperationException("Method not decompiled: hd.s4.W9(vc.v2, org.drinkless.td.libcore.telegram.TdApi$Message):hd.s4");
    }

    public static void X(StringBuilder sb2, int i10, int i11, String str, String str2, boolean z10) {
        if (!ib.i.c(str, str2)) {
            sb2.append('\n');
            if (ib.i.i(str)) {
                sb2.append("+ ");
                sb2.append(w.j1(i10, str2));
            } else if (ib.i.i(str2)) {
                sb2.append("- ");
                sb2.append(w.j1(i10, str));
            } else {
                sb2.append("+ ");
                sb2.append(w.j1(i11, str, str2));
            }
        } else if (z10 && !ib.i.i(str2)) {
            sb2.append(w.j1(i10, str2));
        }
    }

    public static int X2() {
        return f13433k2;
    }

    public static s4 X9(v2 v2Var, TdApi.Message message, TdApi.Chat chat, k0.e<TdApi.ChatAdministrator> eVar) {
        return Y9(v2Var, message, chat, (message.senderId.getConstructor() != -336109341 || eVar == null) ? null : eVar.f(((TdApi.MessageSenderUser) message.senderId).userId));
    }

    public static void Y(StringBuilder sb2, int i10, boolean z10, boolean z11, boolean z12) {
        if (z10 != z11) {
            sb2.append('\n');
            sb2.append(z11 ? '+' : '-');
            sb2.append(' ');
            sb2.append(w.i1(i10));
        } else if (z12 && z11) {
            sb2.append('\n');
            sb2.append(w.i1(i10));
            if (!z11) {
                sb2.append(" (-)");
            }
        }
    }

    public static s4 Y9(v2 v2Var, TdApi.Message message, TdApi.Chat chat, TdApi.ChatAdministrator chatAdministrator) {
        s4 W9 = W9(v2Var, message);
        if (chat != null) {
            W9.U8(chat);
        }
        if (chatAdministrator != null) {
            W9.T8(chatAdministrator);
        }
        W9.r5();
        return W9;
    }

    public static s4 Z9(v2 v2Var, TdApi.Message message, Throwable th) {
        TdApi.TextEntity[] textEntityArr;
        TdApi.Supergroup c42;
        String i12 = w.i1(R.string.FailureMessageText);
        TdApi.Object e10 = Client.e(new TdApi.GetTextEntities(i12));
        TdApi.TextEntity[] textEntityArr2 = (e10 == null || e10.getConstructor() != -933199172) ? null : ((TdApi.TextEntities) e10).entities;
        TdApi.TextEntity textEntity = new TdApi.TextEntity(-1, -1, new TdApi.TextEntityTypePreCode());
        if (textEntityArr2 == null || textEntityArr2.length <= 0) {
            textEntityArr = new TdApi.TextEntity[]{textEntity};
        } else {
            textEntityArr = new TdApi.TextEntity[textEntityArr2.length + 1];
            System.arraycopy(textEntityArr2, 0, textEntityArr, 0, textEntityArr2.length);
            textEntityArr[textEntityArr2.length] = textEntity;
        }
        StringBuilder sb2 = new StringBuilder(i12);
        sb2.append("\n\n");
        textEntity.offset = sb2.length();
        sb2.append(w.i1(R.string.AppName));
        sb2.append(' ');
        sb2.append("0.24.8.1519-arm64-v8a");
        sb2.append("\n");
        sb2.append("Type: ");
        TdApi.MessageContent messageContent = message.content;
        sb2.append(messageContent != null ? messageContent.getClass().getSimpleName() : "NULL");
        sb2.append("\n");
        sb2.append("Android: ");
        sb2.append(db.f.a());
        sb2.append(" (");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(")\n");
        sb2.append("Screen: ");
        sb2.append(a0.D());
        sb2.append("x");
        sb2.append(a0.B());
        sb2.append("x");
        sb2.append(a0.h());
        sb2.append("\n");
        o6 c10 = v2Var.r0().c();
        TdApi.Chat W2 = c10.W2(message.chatId);
        if (W2 == null) {
            sb2.append("FROM UNKNOWN CHAT #");
            sb2.append(message.chatId);
            sb2.append("\n");
        } else if (W2.type.getConstructor() == -1472570774 && (c42 = c10.c4(message.chatId)) != null && !ib.i.i(c42.username)) {
            sb2.append("Public post: t.me/");
            sb2.append(c42.username);
            sb2.append('/');
            sb2.append(message.f19946id >> 20);
            sb2.append("\n");
        }
        sb2.append("\n");
        Log.toStringBuilder(th, sb2);
        textEntity.length = sb2.length() - textEntity.offset;
        h6 h6Var = new h6(v2Var, message, new TdApi.FormattedText(sb2.toString(), textEntityArr));
        h6Var.P(1610612736);
        return h6Var;
    }

    public static int c2() {
        return g2();
    }

    public static void d1(Canvas canvas, s4 s4Var, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        if (f10 != 0.0f) {
            Paint C0 = y.C0(ib.d.a(f10, s4Var.Z2()));
            float f19 = (-C0.getStrokeWidth()) / 2.0f;
            float f20 = f11 + f19;
            float f21 = f12 + f19;
            float f22 = f13 - f19;
            float f23 = f14 - f19;
            RectF a02 = y.a0();
            if (f15 > 0.0f) {
                float f24 = f20 + f15;
                float f25 = f21 + f15;
                float f26 = f15 + 0.0f;
                a02.set(f24 - f26, f25 - f26, f24 + f26, f25 + f26);
                canvas.drawArc(a02, 180.0f, 90.0f, false, C0);
            }
            if (f16 > 0.0f) {
                float f27 = f22 - f16;
                float f28 = f21 + f16;
                float f29 = f16 + 0.0f;
                a02.set(f27 - f29, f28 - f29, f27 + f29, f28 + f29);
                canvas.drawArc(a02, 270.0f, 90.0f, false, C0);
            }
            if (f18 > 0.0f) {
                float f30 = f20 + f18;
                float f31 = f23 - f18;
                float f32 = f18 + 0.0f;
                a02.set(f30 - f32, f31 - f32, f30 + f32, f31 + f32);
                canvas.drawArc(a02, 90.0f, 90.0f, false, C0);
            }
            if (f17 > 0.0f) {
                float f33 = f22 - f17;
                float f34 = f23 - f17;
                float f35 = f17 + 0.0f;
                a02.set(f33 - f35, f34 - f35, f33 + f35, f34 + f35);
                canvas.drawArc(a02, 0.0f, 90.0f, false, C0);
            }
        }
    }

    public static w0 e4() {
        if (X1 == null) {
            X1 = new w0(o.x()).m(15.0f);
        }
        return X1;
    }

    public static int g2() {
        return a0.i(24.0f);
    }

    public static int g3(boolean z10) {
        return z10 ? f13442t2 - (a0.i(3.0f) * 2) : f13442t2;
    }

    public static void m5() {
        try {
            p5();
            o5();
            s5();
            t5();
            T2 = true;
        } catch (Throwable th) {
            Tracer.f(th);
        }
    }

    private boolean m6() {
        TdApi.Chat chat = this.f13451a1;
        return chat != null && chat.type.getConstructor() == 1579049844 && this.O0.o7(((TdApi.ChatTypePrivate) this.f13451a1.type).userId);
    }

    public static void n5() {
        Resources B = j0.B();
        B1 = BitmapFactory.decodeResource(B, R.drawable.corner_small_up_left_w);
        A1 = BitmapFactory.decodeResource(B, R.drawable.corner_big_up_left_w);
        D1 = BitmapFactory.decodeResource(B, R.drawable.corner_small_up_right_w);
        C1 = BitmapFactory.decodeResource(B, R.drawable.corner_big_up_right_w);
        F1 = BitmapFactory.decodeResource(B, R.drawable.corner_small_down_left_w);
        E1 = BitmapFactory.decodeResource(B, R.drawable.corner_big_down_left_w);
        H1 = BitmapFactory.decodeResource(B, R.drawable.corner_small_down_right_w);
        G1 = BitmapFactory.decodeResource(B, R.drawable.corner_big_down_right_w);
        N1 = BitmapFactory.decodeResource(B, R.drawable.msg_top_w);
        Paint paint = new Paint(5);
        I1 = paint;
        paint.setShader(new BitmapShader(N1, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
        P1 = BitmapFactory.decodeResource(B, R.drawable.msg_down_w);
        Paint paint2 = new Paint(5);
        J1 = paint2;
        paint2.setShader(new BitmapShader(P1, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
        M1 = BitmapFactory.decodeResource(B, R.drawable.msg_left_w);
        Paint paint3 = new Paint(5);
        K1 = paint3;
        paint3.setShader(new BitmapShader(M1, Shader.TileMode.CLAMP, Shader.TileMode.REPEAT));
        O1 = BitmapFactory.decodeResource(B, R.drawable.msg_right_w);
        Paint paint4 = new Paint(5);
        L1 = paint4;
        paint4.setShader(new BitmapShader(O1, Shader.TileMode.CLAMP, Shader.TileMode.REPEAT));
        Q1 = new Paint(5);
    }

    public static void o5() {
        if (S1 == null) {
            Paint paint = new Paint(7);
            S1 = paint;
            paint.setColor(ae.j.h());
            z.f(S1, R.id.theme_color_messageSwipeContent);
            S1.setTypeface(o.k());
            S1.setTextSize(a0.i(16.0f));
        }
    }

    public static void p5() {
        Resources B = j0.B();
        Q2 = ce.c.g(B, R.drawable.baseline_keyboard_arrow_down_20);
        O2 = ce.c.g(B, R.drawable.baseline_reply_24);
        P2 = ce.c.g(B, R.drawable.baseline_forward_24);
        n5();
    }

    public static boolean p6(int i10) {
        switch (i10) {
            case R.string.SwipeReply:
            case R.string.SwipeShare:
                return true;
            default:
                return false;
        }
    }

    private void q9(float f10) {
        if (this.f13467h1 != f10) {
            this.f13467h1 = f10;
            E5(false);
        }
    }

    public static int r3() {
        return (a0.B() - f13439q2) - f13433k2;
    }

    public static int r4() {
        return a0.i(20.0f);
    }

    public static int s2() {
        return a0.i(16.0f);
    }

    public static void s5() {
        f13423a2 = a0.i(15.0f);
        f13441s2 = a0.i(4.5f);
        f13442t2 = a0.i(40.0f);
        f13443u2 = a0.i(26.0f);
        f13429g2 = a0.i(8.0f);
        f13430h2 = a0.i(2.0f);
        f13431i2 = a0.i(18.0f);
        f13424b2 = a0.i(8.0f);
        f13425c2 = a0.i(9.0f);
        f13432j2 = a0.i(6.0f);
        f13426d2 = a0.i(3.0f);
        f13427e2 = a0.i(1.5f);
        f13428f2 = a0.i(22.0f);
        f13448z2 = a0.i(9.0f);
        int i10 = a0.i(20.5f);
        f13447y2 = i10;
        A2 = f13448z2 + i10;
        B2 = a0.i(27.0f);
        C2 = a0.i(14.0f);
        D2 = a0.i(14.0f);
        f13434l2 = a0.i(25.0f);
        E2 = a0.i(8.0f);
        G2 = a0.i(2.5f);
        F2 = a0.i(3.0f);
        H2 = a0.i(5.0f);
        Z1 = a0.i(20.0f);
        f13433k2 = f13448z2 + (f13447y2 * 2) + a0.i(10.0f);
        f13435m2 = a0.i(12.0f);
        f13437o2 = a0.i(7.5f);
        f13438p2 = a0.i(7.5f);
        f13439q2 = a0.i(35.0f);
        f13440r2 = a0.i(10.0f);
        f13436n2 = f13433k2 + a0.i(11.0f);
        f13445w2 = a0.i(18.0f);
        f13444v2 = a0.i(26.0f);
        f13446x2 = a0.i(4.0f);
        I2 = a0.i(124.0f);
        J2 = a0.i(19.0f);
        K2 = a0.i(22.0f);
        L2 = a0.i(5.5f);
    }

    public static void t5() {
        if (S1 != null) {
            R2 = w.i1(R.string.SwipeShare);
            String i12 = w.i1(R.string.SwipeReply);
            S2 = i12;
            N2 = (int) v0.T1(i12, S1);
            M2 = (int) v0.T1(R2, S1);
        }
    }

    public void u6(x2.f fVar, View view, Rect rect) {
        fVar.d1(view, rect);
        rect.offset(b3(), c3());
    }

    public static void v6(SparseIntArray sparseIntArray, TdApi.Message message) {
        int i10;
        switch (message.content.getConstructor()) {
            case TdApi.MessagePhoto.CONSTRUCTOR:
            case TdApi.MessageAnimation.CONSTRUCTOR:
            case TdApi.MessageVideo.CONSTRUCTOR:
                i10 = 2;
                break;
            case TdApi.MessageAudio.CONSTRUCTOR:
                i10 = 3;
                break;
            case TdApi.MessageDocument.CONSTRUCTOR:
                i10 = 4;
                break;
            default:
                i10 = 1;
                break;
        }
        ib.b.q(sparseIntArray, i10);
    }

    public static void v8(int i10, int i11) {
        if (i10 != 0) {
            if (i10 != 2) {
                return;
            }
            if (i11 != 0 && !p6(i11)) {
                return;
            }
        }
        t5();
    }

    public void w6(long j10, int i10, g1 g1Var) {
        g1Var.U(this.f13449a.chatId, j10, i10);
    }

    private void w9(boolean z10) {
        int i10 = this.f13452b;
        if (z10 != ((i10 & Log.TAG_ACCOUNTS) != 0)) {
            this.f13452b = ib.c.h(i10, Log.TAG_ACCOUNTS, z10);
            P7(z10);
            if (z10) {
                this.N0.z3();
            }
        }
    }

    public static int y2(v2 v2Var) {
        return v2Var.P0(0, R.id.theme_color_bubble_overlay, R.id.theme_color_bubble_overlay_noWallpaper, R.id.theme_property_wallpaperOverrideOverlay);
    }

    public void y6(g1 g1Var) {
        TdApi.Message message = this.f13449a;
        g1Var.U(message.chatId, message.f19946id, -1);
    }

    public static int z2(v2 v2Var) {
        return v2Var.I0(0, R.id.theme_color_bubble_overlayText, R.id.theme_color_bubble_overlayText_noWallpaper, R.id.theme_property_wallpaperOverrideOverlay);
    }

    public final int A0() {
        int i10;
        int i11;
        if (R9()) {
            i11 = D1();
            i10 = E1() - D1();
        } else {
            i11 = b3();
            i10 = a3();
        }
        return i11 + (i10 / 2);
    }

    public final String A1() {
        TdApi.MessageForwardInfo messageForwardInfo;
        if (T9() && (messageForwardInfo = this.f13449a.forwardInfo) != null) {
            return w.c1(messageForwardInfo.date, TimeUnit.SECONDS);
        }
        return null;
    }

    public final int A2() {
        c4 c4Var;
        return (!O9() || J5() || ((c4Var = this.U) != null && !c4Var.v())) ? f13426d2 : f13427e2;
    }

    public final int A4() {
        return ae.j.L(B4());
    }

    public final void A5() {
        gb.g gVar = this.Q0;
        if (gVar != null) {
            gVar.invalidate();
        }
    }

    public boolean A8() {
        if ((this.f13452b & 32) == 0) {
            return z8();
        }
        I9(true);
        a0(false);
        int i10 = this.O;
        int O0 = O0();
        this.O = O0;
        return i10 != O0;
    }

    public final boolean A9() {
        return !i5() && !K5() && !t2.R2(this.f13449a) && ((n7() && f6()) || (this.f13452b & Log.TAG_GIF_LOADER) != 0) && ((R9() || !z7() || n7()) && !Y5());
    }

    public final int B0() {
        return R9() ? (int) this.K0.centerY() : c3() + (W2() / 2);
    }

    public final String B1() {
        TdApi.MessageForwardInfo messageForwardInfo;
        if (X5()) {
            return w.c1(this.f13449a.date, TimeUnit.SECONDS);
        }
        if (o6()) {
            return w.i1(R.string.SponsoredSign);
        }
        StringBuilder sb2 = new StringBuilder();
        String str = null;
        if (K5() && !ib.i.i(this.f13449a.authorSignature)) {
            str = this.f13449a.authorSignature;
        } else if (x1() && (messageForwardInfo = this.f13449a.forwardInfo) != null) {
            int constructor = messageForwardInfo.origin.getConstructor();
            if (constructor == 1490730723) {
                str = ((TdApi.MessageForwardOriginChannel) this.f13449a.forwardInfo.origin).authorSignature;
            } else if (constructor == 1526010724) {
                str = ((TdApi.MessageForwardOriginChat) this.f13449a.forwardInfo.origin).authorSignature;
            }
        }
        if (!ib.i.i(str)) {
            if (o.m()) {
                sb2.append("\u200e");
            }
            sb2.append(c0.X(str, 18));
            if (o.m()) {
                sb2.append("\u200e");
            }
            sb2.append(", ");
        }
        if (!R9() && d7()) {
            sb2.append(G1());
            sb2.append(" ");
        }
        TdApi.MessageForwardInfo messageForwardInfo2 = this.f13449a.forwardInfo;
        if (messageForwardInfo2 != null && messageForwardInfo2.origin.getConstructor() == -739561951) {
            sb2.append(w.i1(R.string.ImportedSign));
            sb2.append(" ");
        }
        if (t2.R2(this.f13449a)) {
            sb2.append(w.i1(R.string.failed));
        } else if (k6()) {
            int i10 = this.f13449a.schedulingState.getConstructor() == -1485570073 ? ((TdApi.MessageSchedulingStateSendAtDate) this.f13449a.schedulingState).sendDate : 0;
            if (i10 != 0) {
                sb2.append(w.T2(i10, TimeUnit.SECONDS));
            }
        } else if ((this.f13452b & 33554432) == 0 || f6() || this.f13449a.forwardInfo == null) {
            if (x1()) {
                TdApi.Message message = this.f13449a;
                int i11 = message.forwardInfo.date;
                if (i11 != 0) {
                    sb2.append(ib.f.i(i11, message.date) ? w.T2(this.f13449a.forwardInfo.date, TimeUnit.SECONDS) : w.c1(this.f13449a.forwardInfo.date, TimeUnit.SECONDS));
                }
            }
            int i12 = G8() ? this.f13449a.editDate : this.f13449a.date;
            if (i12 != 0) {
                sb2.append(w.T2(i12, TimeUnit.SECONDS));
            }
        } else {
            int i13 = G8() ? this.f13449a.editDate : this.f13449a.date;
            int i14 = this.f13449a.forwardInfo.date;
            if (i14 != 0) {
                i13 = i14;
            }
            if (i13 != 0) {
                sb2.append(w.c1(i13, TimeUnit.SECONDS));
            }
        }
        return sb2.toString();
    }

    public final int B2() {
        return (!O9() || (this.f13452b & Log.TAG_CRASH) != 0) ? f13426d2 : f13427e2;
    }

    public final int B3() {
        return W2() + A3() + ((!i6() || x1()) ? 0 : r4());
    }

    public final int B4() {
        return R9() ? g6() ? R.id.theme_color_bubbleOut_separator : R.id.theme_color_bubbleIn_separator : R.id.theme_color_separator;
    }

    public final void B5() {
        this.P0.o();
    }

    public void B7(View view, Runnable runnable, boolean z10) {
        if (this.f13477m1 != 0.0f) {
            if (runnable != null) {
                int i10 = this.f13452b;
                if ((268435456 & i10) == 0 && (i10 & 134217728) == 0) {
                    aa();
                }
            }
            if (!z10) {
                v0.D2(runnable);
            }
            eb.k kVar = this.f13487r1;
            if (kVar != null) {
                kVar.k();
            }
            eb.k kVar2 = this.f13485q1;
            if (kVar2 != null) {
                kVar2.k();
            }
            boolean[] zArr = (!z10 || runnable == null) ? null : new boolean[1];
            float f10 = this.f13477m1;
            float f11 = this.f13481o1;
            float f12 = this.f13483p1;
            this.f13452b |= 67108864;
            new eb.k(0, new e(z10, runnable, zArr, f11, f12, f10, view), db.b.f7287b, 180L).i(1.0f);
        }
    }

    public void B8() {
        if ((this.f13452b & 32) == 0) {
            return;
        }
        if (!R9() || !V()) {
            e0();
        } else {
            C8();
        }
    }

    public x2.l B9(View view, x2.f fVar, int i10) {
        return C9(view, fVar, new TdApi.FormattedText(w.i1(i10), null));
    }

    public final void C0() {
        if (R9()) {
            a0(false);
        }
    }

    public int C1(View view, int i10) {
        return E1() - i10;
    }

    public TdApi.Chat C2() {
        return this.f13451a1;
    }

    public m6 C3() {
        return this.S;
    }

    public final void C5(int i10, int i11, int i12, int i13) {
        this.P0.p(i10, i11, i12, i13);
    }

    public final void C7() {
        int i10 = this.O;
        this.O = O0();
        G7();
        if (this.O != i10) {
            K8();
        }
    }

    public void C8() {
        int i10 = this.N;
        if (i10 != 0) {
            this.N = 0;
            h0(i10);
        }
    }

    public x2.l C9(View view, x2.f fVar, TdApi.FormattedText formattedText) {
        return c0(view, fVar).E(this.O0, formattedText);
    }

    public final void D0() {
        long currentTimeMillis = System.currentTimeMillis();
        TdApi.Message message = this.f13449a;
        double d10 = message.ttlExpiresIn;
        this.f13454b1 = currentTimeMillis;
        message.ttlExpiresIn = Math.max(0.0d, d10 - ((currentTimeMillis - this.f13454b1) / 1000.0d));
        boolean z10 = Math.round(d10) != Math.round(this.f13449a.ttlExpiresIn);
        N7(z10);
        h hVar = this.f13457c1;
        if (hVar != null) {
            hVar.a(z10);
        }
        if (p7() && this.f13454b1 != 0 && this.f13449a.ttlExpiresIn > 0.0d) {
            g I3 = I3();
            I3.sendMessageDelayed(Message.obtain(I3, 0, this), 18L);
        }
    }

    public int D1() {
        return Q() ? this.N - this.f13486r0 : this.f13480o0;
    }

    public final int D2() {
        return ae.j.L(E2());
    }

    public final int D3() {
        return R9() ? S3() : f13433k2;
    }

    public final long D4() {
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.Y0;
            if (arrayList == null || arrayList.isEmpty()) {
                return this.f13449a.f19946id;
            }
            return this.Y0.get(0).f19946id;
        }
    }

    public final void D5(int i10, int i11, int i12, int i13, boolean z10) {
        v5(i10, i11, i12, i13);
        if (y7()) {
            C5(i10, i11, i12, i13);
        }
        if (z10) {
            A5();
        }
    }

    public void D7(long j10, eb.k kVar) {
    }

    public final int D8(long j10) {
        synchronized (this) {
            int l52 = l5(j10);
            int i10 = 1;
            if (l52 >= 0) {
                TdApi.Message remove = this.Y0.remove(l52);
                if (l52 == this.Y0.size() && l52 > 0) {
                    this.f13449a = this.Y0.get(l52 - 1);
                }
                if (this.Y0.isEmpty()) {
                    return 1;
                }
                T7(remove, l52);
                y1(j10);
                K9(true);
                return 2;
            } else if (l52 != -2) {
                return 0;
            } else {
                ArrayList<TdApi.Message> arrayList = this.Y0;
                if (arrayList != null && !arrayList.isEmpty()) {
                    i10 = 0;
                }
                return i10;
            }
        }
    }

    public boolean E0(boolean z10) {
        if (z10 && this.f13449a.containsUnreadMention) {
            return true;
        }
        TdApi.Chat C22 = C2();
        if (C22 == null) {
            C22 = this.O0.W2(this.f13449a.chatId);
            U8(C22);
        }
        if (C22 != null) {
            if ((this.f13449a.isOutgoing ? C22.lastReadOutboxMessageId : C22.lastReadInboxMessageId) < P1()) {
                return true;
            }
        }
        return false;
    }

    public int E1() {
        return Q() ? this.N - this.f13480o0 : this.f13486r0;
    }

    public final int E2() {
        return g6() ? R.id.theme_color_bubbleOut_messageAuthor : R.id.theme_color_messageAuthor;
    }

    public final int E3() {
        if (R9()) {
            return this.f13494v0 - c2();
        }
        return (((this.f13452b & Log.TAG_CRASH) != 0 ? f13434l2 : f13437o2) - a0.i(3.0f)) + F3();
    }

    public final void E5(boolean z10) {
        u5();
        if (y7()) {
            B5();
        }
        if (z10) {
            A5();
        }
    }

    public final void E7(View view) {
        gb.g gVar;
        w9(view != null || c5());
        if (view != null && (gVar = this.Q0) != null && gVar.j(view)) {
            Q7(view, true);
        }
    }

    public final void E8(long j10) {
        r3 r3Var;
        if (this.f13449a.replyToMessageId == j10 && (r3Var = this.T) != null) {
            r3Var.j(j10);
        }
    }

    public final void E9(boolean z10) {
        if (a6() && p7() && this.f13454b1 == 0) {
            g I3 = I3();
            this.f13454b1 = System.currentTimeMillis();
            I3.sendMessageDelayed(Message.obtain(I3, 0, this), 18L);
            O7(z10);
        }
    }

    public final g.c F0() {
        g.c cVar = this.f13503z1;
        if (cVar != null) {
            return cVar;
        }
        f fVar = new f();
        this.f13503z1 = fVar;
        return fVar;
    }

    public final TdApi.ChatAdministrator F1() {
        return this.Z0;
    }

    public final je.k F2() {
        return p8(t.d.I, t.b.f15476m, t.a.f15471h);
    }

    public int F3() {
        int i10;
        int i11;
        int i12;
        int i13 = this.f13452b;
        if ((i13 & Log.TAG_CAMERA) != 0) {
            if ((i13 & Log.TAG_VOICE) != 0) {
                i12 = f13444v2 + f13446x2;
                i11 = R9() ? f13442t2 - (a0.i(3.0f) * 2) : f13442t2;
            } else {
                i12 = f13444v2;
                i11 = f13446x2;
            }
            i10 = i12 + i11;
        } else if ((i13 & Log.TAG_VOICE) != 0) {
            i10 = R9() ? f13442t2 - (a0.i(3.0f) * 2) : f13442t2;
        } else {
            i10 = 0;
        }
        return ((this.f13452b & Log.TAG_CRASH) == 0 || R9()) ? i10 : i10 + f13441s2;
    }

    public int F4() {
        return (int) (G4() * 1.24f);
    }

    public final void F5() {
        o8(new kb.j() {
            @Override
            public final void a(Object obj) {
                s4.this.B6((g1) obj);
            }
        });
    }

    public final void F7(g1 g1Var) {
        w9(g1Var != null || c5());
        if (this.P0.j(g1Var) && g1Var != null) {
            R7(g1Var, true);
        }
    }

    public final void F8(long j10, TdApi.MessageContent messageContent) {
        r3 r3Var;
        if (this.f13449a.replyToMessageId == j10 && (r3Var = this.T) != null) {
            r3Var.P(j10, messageContent);
        }
    }

    public final void F9() {
        if (this.f13454b1 != 0) {
            this.f13454b1 = 0L;
            I3().removeMessages(0, this);
        }
    }

    public final boolean G0(TdApi.Message message, boolean z10) {
        if (!ba(message)) {
            return false;
        }
        boolean z11 = (this.f13452b & 32) == 0;
        synchronized (this) {
            if (this.Y0 == null) {
                ArrayList<TdApi.Message> arrayList = new ArrayList<>();
                this.Y0 = arrayList;
                arrayList.add(this.f13449a);
            }
            if (z10) {
                this.Y0.add(message);
                this.f13449a = message;
            } else {
                this.Y0.add(0, message);
            }
            U7(message, z10, z11);
            w1(true);
        }
        K9(false);
        if (!z11) {
            if (z10) {
                K6();
            }
            y8();
        }
        return true;
    }

    public final String G1() {
        String str;
        if (o6()) {
            return null;
        }
        TdApi.ChatAdministrator chatAdministrator = this.Z0;
        if (chatAdministrator != null) {
            if (!ib.i.i(chatAdministrator.customTitle)) {
                str = this.Z0.customTitle;
            } else if (this.Z0.isOwner) {
                str = w.i1(R.string.message_ownerSign);
            } else {
                str = w.i1(R.string.message_adminSignPlain);
            }
        } else if (this.Q.k()) {
            str = !ib.i.i(this.f13449a.authorSignature) ? this.f13449a.authorSignature : w.i1(R.string.message_adminSignPlain);
        } else {
            if (ib.i.i(this.f13449a.authorSignature)) {
                long j10 = this.f13449a.chatId;
                if (j10 != 0 && this.O0.b7(j10)) {
                    long c10 = this.Q.c();
                    if (this.O0.O6(c10)) {
                        str = w.i1(R.string.message_channelSign);
                    } else if (ob.a.h(c10)) {
                        str = w.i1(R.string.message_groupSign);
                    }
                }
            }
            str = null;
        }
        if (str == null) {
            return null;
        }
        if (!R9()) {
            return str;
        }
        return "  " + str.trim();
    }

    public final int G2() {
        return ae.j.L(g6() ? R.id.theme_color_bubbleOut_messageAuthorPsa : R.id.theme_color_messageAuthorPsa);
    }

    public int G3() {
        return this.O;
    }

    public int G4() {
        return Math.min(this.f13478n0, (a0.B() - f13439q2) - this.f13476m0);
    }

    public final void G5() {
        o8(new kb.j() {
            @Override
            public final void a(Object obj) {
                s4.this.C6((g1) obj);
            }
        });
    }

    public void G7() {
    }

    public boolean G8() {
        return false;
    }

    public final ob.d G9() {
        TdApi.Message message = this.f13449a;
        long j10 = message.chatId;
        long j11 = message.f19946id;
        return new ob.d(j10, j11, i4(j11));
    }

    public int compareTo(s4 s4Var) {
        return Long.compare(s4Var.K3(), K3());
    }

    public final je.k H2() {
        return p8(t.d.J, t.b.f15477n, t.a.f15472i);
    }

    public float H3() {
        TdApi.Message message = this.f13449a;
        return (float) (message.ttlExpiresIn / message.ttl);
    }

    public final String H4() {
        TdApi.User u22;
        m6 m6Var = this.S;
        if (m6Var == null) {
            return this.Q.g();
        }
        if (m6Var.e()) {
            return this.S.b();
        }
        m6 m6Var2 = this.S;
        if (!(m6Var2 instanceof p6) && (m6Var2 instanceof u6) && (u22 = this.O0.e2().u2(((u6) this.S).i())) != null) {
            return u22.firstName;
        }
        return null;
    }

    public final boolean H5() {
        return ib.c.b(this.f13452b, Integer.MIN_VALUE);
    }

    public void H7(int i10, float f10, eb.k kVar) {
    }

    public final void H8(ld.p pVar) {
        if ((this.f13452b & Log.TAG_CRASH) == 0 || this.Z == null || !f7()) {
            pVar.G(null);
        } else {
            pVar.G(this.Z);
        }
    }

    public void H9(float f10, boolean z10) {
        int i10;
        int i11;
        if (!z10 || (this.f13452b & 67108864) == 0) {
            boolean R9 = R9();
            if (R9) {
                f10 = Math.max(-i11, Math.min(a0.i(64.0f), f10));
            }
            if (this.f13477m1 != f10) {
                int i12 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                if (i12 == 0 || R9) {
                    this.f13465g1 = 0.0f;
                } else {
                    this.f13465g1 = Math.min(1.0f, Math.abs(f10) / I2);
                }
                this.f13477m1 = f10;
                if (R9) {
                    if (i12 >= 0) {
                        this.f13452b &= -268435457;
                        o9(false, 0.0f, false, false);
                    }
                    if (f10 <= 0.0f) {
                        this.f13452b &= -134217729;
                        o9(true, 0.0f, false, false);
                    }
                    if (f10 >= a0.i(42.0f)) {
                        int i13 = this.f13452b;
                        if ((i13 & 134217728) == 0) {
                            this.f13452b = i13 | 134217728;
                            aa();
                            o9(true, 1.0f, true, true);
                        }
                    }
                    if (f10 <= (-i10)) {
                        int i14 = this.f13452b;
                        if ((i14 & 268435456) == 0) {
                            this.f13452b = i14 | 268435456;
                            aa();
                            o9(false, 1.0f, true, true);
                        }
                    }
                }
                w5(true);
            }
        }
    }

    public void I0() {
        float signum = Math.signum(this.f13477m1);
        this.f13477m1 = 0.0f;
        this.f13465g1 = 0.0f;
        W(signum, 0.0f);
    }

    public TdApi.Message[] I1() {
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.Y0;
            if (arrayList == null || arrayList.isEmpty()) {
                return new TdApi.Message[]{this.f13449a};
            }
            TdApi.Message[] messageArr = new TdApi.Message[this.Y0.size()];
            this.Y0.toArray(messageArr);
            return messageArr;
        }
    }

    public final long I2() {
        return this.f13449a.chatId;
    }

    public final Object I4() {
        return this.T0;
    }

    public boolean I5() {
        return false;
    }

    public final void I6() {
        if (!R9() || f7()) {
            if (this.f13451a1 == null) {
                this.f13451a1 = this.O0.W2(this.f13449a.chatId);
            }
            float f10 = R9() ? 18.0f : 20.5f;
            if (x1()) {
                this.Z = this.S.c();
                this.f13450a0 = new hd.b(f10, this.S.d(), null);
                return;
            }
            this.Z = this.Q.a();
            this.f13450a0 = new hd.b(f10, this.Q.h(), null);
            return;
        }
        this.Z = null;
    }

    public void I7(int i10, float f10, float f11) {
    }

    public void I8(m mVar) {
        mVar.r(null);
    }

    public final void I9(boolean z10) {
        if (U9()) {
            this.f13492u0 = 0;
            this.f13496w0 = this.N;
        } else if (Q()) {
            this.f13492u0 = ((this.N - this.f13486r0) - this.f13480o0) + this.f13476m0;
            this.f13496w0 = this.f13478n0;
        } else {
            this.f13492u0 = this.f13476m0;
            this.f13496w0 = this.f13478n0;
        }
    }

    public final int J0() {
        int W2 = W2();
        if (this.T != null && !R()) {
            W2 += n2();
        }
        if (t7(true) && (this.f13452b & Log.TAG_CRASH) != 0) {
            W2 += g2();
            if (i6()) {
                W2 += r4();
            }
        }
        if (T9()) {
            W2 += c2();
        }
        if (e5()) {
            W2 += u3() + w3() + v3();
        }
        return W2 + m2();
    }

    public int J1() {
        throw new RuntimeException();
    }

    public int J2() {
        return W2();
    }

    public String J3() {
        return hj.f3((int) Math.round(this.f13449a.ttlExpiresIn), TimeUnit.SECONDS, false);
    }

    public final int J4() {
        return ae.j.L(R9() ? g6() ? R.id.theme_color_bubbleOut_text : R.id.theme_color_bubbleIn_text : R.id.theme_color_text);
    }

    public final boolean J5() {
        return (this.f13452b & 2) != 0;
    }

    public final void J6(g1 g1Var, ld.p pVar) {
        int i10;
        int i11;
        int i12;
        if (R9()) {
            i12 = f13432j2;
            i11 = M0();
            i10 = f13431i2;
        } else {
            i11 = F3();
            i12 = f13448z2;
            i10 = f13447y2;
        }
        int i13 = i10 * 2;
        if (w.G2() && R9()) {
            i12 = (g1Var.getMeasuredWidth() - i12) - i13;
        }
        pVar.K0(i12, i11, i12 + i13, i13 + i11);
    }

    public final void J7() {
        this.f13461e1 = true;
        F9();
        m6 m6Var = this.S;
        if (m6Var != null) {
            m6Var.a();
        }
        r3 r3Var = this.T;
        if (r3Var != null) {
            r3Var.Q2();
        }
        w9(false);
        V7();
    }

    public void J8(ld.p pVar) {
        pVar.G(null);
    }

    public void J9() {
        V8(z1());
        if (R9() || (this.f13452b & Log.TAG_CRASH) != 0) {
            K6();
        }
    }

    public final int K0() {
        if (!f7() || f6()) {
            return fd.b.f11910g ? f13425c2 : f13424b2;
        }
        return f13424b2 + a0.i(40.0f);
    }

    public final int K1() {
        je.g gVar = this.W;
        if (gVar != null) {
            return gVar.getWidth();
        }
        if (t7(true)) {
            return -a0.i(3.0f);
        }
        return 0;
    }

    public int K2() {
        return this.f13492u0;
    }

    public final long K3() {
        return this.f13449a.f19946id;
    }

    public final je.k K4() {
        return p8(t.d.C, t.b.f15473j, t.a.f15468e);
    }

    public boolean K5() {
        return this.f13449a.isChannelPost;
    }

    public final void K6() {
        String str;
        int i10;
        String str2;
        boolean z10 = i6() && x1();
        if (R9()) {
            this.f13500y0 = (int) v0.T1(this.P, P6());
            int a32 = (((V() ? this.f13478n0 : a3()) + j2()) + j2()) - ((f13429g2 + f13430h2) * 2);
            if (d7()) {
                je.g f10 = new g.b(G1(), a32, P4(), m3()).v().f();
                this.Y = f10;
                a32 -= f10.getWidth();
            } else {
                this.Y = null;
            }
            int i11 = a32;
            if (x1()) {
                str2 = this.S.b();
            } else {
                str2 = this.Q.e();
            }
            String str3 = str2;
            if (!t7(true) || i11 <= 0) {
                this.W = null;
            } else {
                this.W = Q6(str3, !x1() || !(this.S instanceof s6), z10, !t7(false), (this.f13449a.forwardInfo == null || x1()) ? this.f13449a.viaBotUserId : 0L, i11, false);
            }
            if (z10) {
                this.X = new g.b(this.O0, w.V0(Q0(), this.f13449a.forwardInfo.publicServiceAnnouncementType), h8(), i11, e4(), H2()).d().v().u(new l4(this)).f();
            } else {
                this.X = null;
            }
            if ((this.f13452b & 32) != 0) {
                a0(false);
                return;
            }
            return;
        }
        int i12 = this.N;
        this.f13500y0 = (int) v0.T1(this.P, O6(false));
        int i13 = a0.i(16.0f);
        this.f13498x0 = (i12 - this.f13500y0) - i13;
        int i14 = (i12 - f13433k2) - a0.i(4.0f);
        int i15 = (i14 - i13) - this.f13500y0;
        if (A9()) {
            i15 -= (a0.i(3.0f) + ce.p.m()) + a0.i(3.0f);
        }
        if (z9()) {
            i15 -= a0.i(5.0f) + ce.p.h();
        }
        if (x1()) {
            str = this.S.b();
        } else {
            str = this.Q.e();
        }
        int j10 = (int) (i15 - (this.f13462f0.j(a0.i(3.0f)) + a0.i(3.0f)));
        if (S2() == 0) {
            j10 = (int) (j10 - this.f13458d0.j(a0.i(6.0f)));
        }
        if (Y4() == 1) {
            j10 = (int) (((int) (j10 - this.f13460e0.j(a0.i(6.0f)))) - this.f13456c0.j(a0.i(6.0f)));
        }
        int i16 = j10;
        if (z10) {
            this.X = i16 > 0 ? new g.b(this.O0, w.V0(Q0(), this.f13449a.forwardInfo.publicServiceAnnouncementType), h8(), i16, e4(), H2()).d().v().u(new l4(this)).f() : null;
            i10 = i14;
        } else {
            this.X = null;
            i10 = i16;
        }
        if (i10 > 0) {
            this.W = Q6(str, !x1() || !(this.S instanceof s6), z10, !t7(false), (this.f13449a.forwardInfo == null || x1()) ? this.f13449a.viaBotUserId : 0L, i10, false);
        } else {
            this.W = null;
        }
    }

    public final void K7(View view) {
        gb.g gVar = this.Q0;
        if (!(gVar == null || !gVar.l(view) || view == null)) {
            Q7(view, false);
        }
        w9(c5());
    }

    public final void K8() {
        this.P0.requestLayout();
    }

    public final void K9(boolean z10) {
        TdApi.MessageInteractionInfo messageInteractionInfo = this.f13449a.interactionInfo;
        boolean z11 = true;
        int i10 = 0;
        boolean z12 = z10 && e7();
        je.a aVar = this.f13456c0;
        if (aVar != null) {
            aVar.u(messageInteractionInfo != null ? messageInteractionInfo.viewCount : 0, z12 && Y4() != 0);
        }
        int S22 = S2();
        this.f13458d0.u(v4(), S22 == 0 && z12);
        eb.f fVar = this.R0;
        if (S22 != 1) {
            z11 = false;
        }
        fVar.p(z11, z12);
        je.a aVar2 = this.f13460e0;
        if (messageInteractionInfo != null) {
            i10 = messageInteractionInfo.forwardCount;
        }
        aVar2.u(i10, z12);
        this.f13462f0.y(h6(), z12);
    }

    public final int L0(boolean z10) {
        int i10 = this.f13500y0 + 0;
        if (i10 == 0 && !ib.i.i(this.P)) {
            i10 = (int) v0.T1(this.P, P6());
        }
        if (z9()) {
            i10 += ce.p.h() + a0.i(2.0f);
        }
        boolean n62 = n6();
        if (Y4() == 1) {
            i10 = (int) (((!n62 || (!X0() && O9())) ? (int) (i10 + this.f13456c0.j(a0.i(6.0f))) : i10 + ce.p.f() + a0.i(3.0f)) + this.f13460e0.j(a0.i(6.0f)));
        }
        if (S2() == 0) {
            i10 = (int) (i10 + this.f13458d0.j(a0.i(6.0f)));
        }
        int j10 = (int) (i10 + this.f13462f0.j(a0.i(3.0f)));
        if (!Y5() && (g6() || (n62 && Y4() != 1))) {
            j10 += ce.p.m();
        }
        return z10 ? j10 + a0.i(8.0f) : j10;
    }

    public final TextPaint L1(boolean z10) {
        return y.P(14.0f, z10);
    }

    public int L2() {
        return this.f13494v0;
    }

    public final void L3(jb.e eVar, long j10, long j11) {
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.Y0;
            if (arrayList == null || arrayList.isEmpty()) {
                long j12 = this.f13449a.f19946id;
                if (j12 > j10 && j12 < j11) {
                    eVar.a(j12);
                    return;
                }
                return;
            }
            Iterator<TdApi.Message> it = this.Y0.iterator();
            while (it.hasNext()) {
                long j13 = it.next().f19946id;
                if (j13 > j10 && j13 < j11) {
                    eVar.a(j13);
                }
            }
        }
    }

    public final boolean L5() {
        TdApi.MessageForwardInfo messageForwardInfo = this.f13449a.forwardInfo;
        if (messageForwardInfo != null && messageForwardInfo.origin.getConstructor() == 1490730723) {
            TdApi.Message message = this.f13449a;
            TdApi.MessageForwardInfo messageForwardInfo2 = message.forwardInfo;
            if (messageForwardInfo2.fromChatId == ((TdApi.MessageForwardOriginChannel) messageForwardInfo2.origin).chatId && message.senderId.getConstructor() == -239660751) {
                TdApi.Message message2 = this.f13449a;
                if (((TdApi.MessageSenderChat) message2.senderId).chatId == message2.forwardInfo.fromChatId) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void L6() {
        TdApi.MessageForwardInfo messageForwardInfo = this.f13449a.forwardInfo;
        if (messageForwardInfo != null) {
            switch (messageForwardInfo.origin.getConstructor()) {
                case TdApi.MessageForwardOriginMessageImport.CONSTRUCTOR:
                    this.S = new s6(this, (TdApi.MessageForwardOriginMessageImport) this.f13449a.forwardInfo.origin);
                    break;
                case TdApi.MessageForwardOriginUser.CONSTRUCTOR:
                    this.S = new u6(this, (TdApi.MessageForwardOriginUser) this.f13449a.forwardInfo.origin);
                    break;
                case TdApi.MessageForwardOriginHiddenUser.CONSTRUCTOR:
                    this.S = new s6(this, (TdApi.MessageForwardOriginHiddenUser) this.f13449a.forwardInfo.origin);
                    break;
                case TdApi.MessageForwardOriginChannel.CONSTRUCTOR:
                    this.S = new p6(this, (TdApi.MessageForwardOriginChannel) this.f13449a.forwardInfo.origin);
                    break;
                case TdApi.MessageForwardOriginChat.CONSTRUCTOR:
                    this.S = new p6(this, (TdApi.MessageForwardOriginChat) this.f13449a.forwardInfo.origin);
                    break;
            }
            f0();
            this.S.f();
        }
    }

    public final void L7(g1 g1Var) {
        if (this.P0.l(g1Var) && g1Var != null) {
            R7(g1Var, false);
        }
        w9(c5());
    }

    public void L8(ld.b bVar, boolean z10, int i10) {
        bVar.d();
    }

    public boolean L9(TdApi.Message message, TdApi.MessageContent messageContent, boolean z10) {
        return false;
    }

    public final int M0() {
        return F3() + B2();
    }

    public int M2() {
        return a3();
    }

    public final void M3(jb.f fVar) {
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.Y0;
            if (arrayList == null || arrayList.isEmpty()) {
                fVar.f(this.f13449a.f19946id);
                return;
            }
            fVar.g(fVar.size() + this.Y0.size());
            Iterator<TdApi.Message> it = this.Y0.iterator();
            while (it.hasNext()) {
                fVar.f(it.next().f19946id);
            }
        }
    }

    public final int M4() {
        if ((!n7() || !s7()) && ((!T9() || ((this.f13452b & 33554432) != 0 && !f6())) && this.T == null)) {
            return 0;
        }
        return -a0.i(R9() ? 4.0f : 2.0f);
    }

    public final void M6() {
        r3 r3Var = new r3(this);
        this.T = r3Var;
        r3Var.a0(this.P0);
        this.T.M();
    }

    public final boolean M7(View view, je.g gVar, je.v0 v0Var, hj.q qVar) {
        if (v0Var.g() == null && gVar.Q() == 1) {
            return false;
        }
        if (v0Var.g() == null || !(v0Var.g().j() instanceof Long)) {
            this.S.g(view, gVar, v0Var, qVar, null);
        } else {
            this.N0.r0().Wp(this.f13449a.viaBotUserId, this.R);
        }
        return true;
    }

    public void M8(ld.c cVar) {
        cVar.clear();
    }

    public final int N0() {
        throw new UnsupportedOperationException("Method not decompiled: hd.s4.N0():int");
    }

    public final int N2(g1 g1Var, float f10, float f11) {
        r3 r3Var = this.T;
        if (r3Var != null) {
            if (r3Var.B(f10, f11, R9() && !O9())) {
                return 1;
            }
        }
        if (!f5() || !f7() || !g1Var.getAvatarReceiver().w(f10, f11)) {
            return (S2() == 1 && R9() && f10 >= ((float) this.f13480o0) && f10 < ((float) this.f13486r0) && f11 >= ((float) (this.f13484q0 - m2())) && f11 < ((float) this.f13484q0)) ? 3 : 0;
        }
        return 2;
    }

    public final long[] N3() {
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.Y0;
            int i10 = 0;
            if (arrayList != null) {
                long[] jArr = new long[arrayList.size()];
                Iterator<TdApi.Message> it = this.Y0.iterator();
                while (it.hasNext()) {
                    jArr[i10] = it.next().f19946id;
                    i10++;
                }
                Arrays.sort(jArr);
                return jArr;
            }
            return new long[]{this.f13449a.f19946id};
        }
    }

    public int N4() {
        if (!R9()) {
            return o3();
        }
        boolean z10 = false;
        boolean z11 = !O9() || S9();
        if (z11 || (X0() && !T9())) {
            z10 = true;
        }
        if (!z10) {
            return o3();
        }
        return z11 ? R.id.theme_color_bubble_mediaTime : R.id.theme_color_bubble_mediaOverlayText;
    }

    public final boolean N5() {
        TdApi.Chat W2 = this.O0.W2(I2());
        if (W2 == null) {
            return false;
        }
        switch (W2.type.getConstructor()) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                TdApi.ChatMemberStatus O3 = this.O0.O3(W2.f19908id);
                return O3 != null && t2.i3(O3, false);
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                return true;
            default:
                return false;
        }
    }

    public void N7(boolean z10) {
    }

    public final void N8(ld.c cVar) {
        r3 r3Var = this.T;
        if (r3Var != null) {
            r3Var.Q(cVar);
        } else {
            cVar.clear();
        }
    }

    public boolean N9(long j10, s4 s4Var) {
        boolean z10 = false;
        if (!v9(j10)) {
            return false;
        }
        if (f6() && (this.f13452b & Log.TAG_CRASH) == 0) {
            if (s4Var != null) {
                boolean z11 = s6() || n6();
                if (s4Var.s6() || s4Var.n6()) {
                    z10 = true;
                }
                if (z11 == z10) {
                    this.f13452b &= -513;
                }
            }
            this.f13452b |= Log.TAG_GIF_LOADER;
        }
        return true;
    }

    public int O0() {
        if (R9()) {
            int k42 = this.f13484q0 + k4() + s3();
            c4 c4Var = this.U;
            return (c4Var == null || c4Var.v()) ? k42 : k42 + this.U.r() + c4.q();
        }
        int W2 = this.f13494v0 + W2() + k4() + s3();
        c4 c4Var2 = this.U;
        if (c4Var2 != null && !c4Var2.v()) {
            W2 += this.U.r() + f13438p2;
        }
        return e5() ? W2 + u3() + w3() + v3() : W2;
    }

    public final int O2() {
        int size;
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.Y0;
            size = arrayList != null ? arrayList.size() : 0;
        }
        return size;
    }

    public int O3(boolean z10) {
        return 0;
    }

    public int O4() {
        if (!R9()) {
            return j3();
        }
        boolean z10 = false;
        boolean z11 = !O9() || S9();
        if (z11 || (X0() && !T9())) {
            z10 = true;
        }
        if (!z10) {
            return j3();
        }
        if (z11) {
            return v2();
        }
        return ae.j.L(R.id.theme_color_bubble_mediaOverlayText);
    }

    public final boolean O5() {
        synchronized (this) {
            jb.e eVar = this.f13471j1;
            boolean z10 = false;
            int l10 = eVar != null ? eVar.l() : 0;
            if (l10 == 0) {
                return false;
            }
            ArrayList<TdApi.Message> arrayList = this.Y0;
            int size = arrayList != null ? arrayList.size() : 1;
            if (size > 0 && l10 >= size) {
                z10 = true;
            }
            return z10;
        }
    }

    public void O7(boolean z10) {
    }

    public final boolean O9() {
        return R9() && (!S0() || T9());
    }

    public final void P(int i10) {
        this.f13452b = i10 | this.f13452b;
    }

    public final boolean P0() {
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.Y0;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (this.Y0.get(size).containsUnreadMention) {
                        return true;
                    }
                }
            }
            return this.f13449a.containsUnreadMention;
        }
    }

    public final long P1() {
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.Y0;
            if (arrayList == null || arrayList.isEmpty()) {
                return this.f13449a.f19946id;
            }
            ArrayList<TdApi.Message> arrayList2 = this.Y0;
            return arrayList2.get(arrayList2.size() - 1).f19946id;
        }
    }

    public final ArrayList<TdApi.Message> P2() {
        return this.Y0;
    }

    public final String P3() {
        r3 r3Var = this.T;
        if (r3Var != null) {
            return r3Var.l();
        }
        return null;
    }

    public boolean P5() {
        return t2.j3(this.f13449a);
    }

    public void P7(boolean z10) {
    }

    public void P8() {
        if (this.f13463f1 == 1.0f) {
            Q8();
        }
    }

    public boolean P9() {
        return (this.f13452b & Log.TAG_CRASH) != 0 && t7(true);
    }

    public boolean Q() {
        return R9() && g6() != w.G2();
    }

    public final v4<?> Q0() {
        return a7().Z9();
    }

    public int Q1() {
        return this.f13484q0;
    }

    public final int Q2() {
        return a0.i(40.0f);
    }

    public int Q4() {
        return this.f13482p0;
    }

    public final boolean Q5() {
        return this.f13449a.chatId == 0;
    }

    public final je.g Q6(java.lang.String r12, final boolean r13, boolean r14, boolean r15, final long r16, int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: hd.s4.Q6(java.lang.String, boolean, boolean, boolean, long, int, boolean):je.g");
    }

    public void Q7(View view, boolean z10) {
    }

    public void Q8() {
        eb.k kVar = this.f13475l1;
        if (kVar == null || !kVar.v()) {
            eb.k kVar2 = this.f13475l1;
            if (kVar2 == null) {
                eb.k kVar3 = new eb.k(-1, this, db.b.f7287b, 400L, 0.0f);
                this.f13475l1 = kVar3;
                kVar3.F(2000L);
            } else {
                kVar2.l(0.0f);
            }
            this.f13475l1.i(1.0f);
        }
    }

    public final boolean Q9() {
        return !i5() && (!T9() || f6() || (this.f13452b & Log.TAG_CRASH) != 0) && this.f13449a.content.getConstructor() != 538893824;
    }

    public final boolean R() {
        return false;
    }

    public int R1() {
        return -1;
    }

    public final int R3() {
        return (E1() - f13429g2) - f13430h2;
    }

    public float R4() {
        return this.f13477m1;
    }

    public final boolean R5() {
        return Q5() && this.N0.g1();
    }

    public final v2 R6() {
        return this.N0;
    }

    public void R7(g1 g1Var, boolean z10) {
    }

    public boolean R8() {
        return false;
    }

    public final boolean R9() {
        return R6().x3();
    }

    public boolean S() {
        return true;
    }

    public boolean S0() {
        return false;
    }

    public float S1() {
        return this.I0;
    }

    public final int S2() {
        if (j7()) {
            return (!O9() || S9()) ? 2 : 1;
        }
        return 0;
    }

    public final int S3() {
        return D1() + f13429g2 + f13430h2;
    }

    public final int S4() {
        return this.N0.P0(R.id.theme_color_unread, R.id.theme_color_bubble_unread, R.id.theme_color_bubble_unread_noWallpaper, R.id.theme_property_wallpaperOverrideUnread);
    }

    public boolean S5(long j10) {
        return o1(j10) != null;
    }

    public void S6(boolean z10) {
        this.f13452b = ib.c.h(this.f13452b, Integer.MIN_VALUE, z10);
    }

    public boolean S7(g1 g1Var, rh rhVar) {
        return false;
    }

    public final boolean S8() {
        return R9() && (!O9() || R8());
    }

    public boolean S9() {
        return false;
    }

    public boolean T() {
        return !X5() && !r6();
    }

    public final void T0(vc.g1 r30, android.graphics.Canvas r31, ld.p r32, ld.v r33, ld.c r34, ld.p r35, md.m r36, ld.b r37) {
        throw new UnsupportedOperationException("Method not decompiled: hd.s4.T0(vc.g1, android.graphics.Canvas, ld.p, ld.v, ld.c, ld.p, md.m, ld.b):void");
    }

    public float T1() {
        return this.J0;
    }

    public final int T2() {
        int i10 = this.f13491t1;
        if (i10 != 0) {
            return i10;
        }
        TdApi.Message message = this.f13449a;
        TdApi.MessageSchedulingState messageSchedulingState = message.schedulingState;
        if (messageSchedulingState == null) {
            return message.date;
        }
        if (messageSchedulingState.getConstructor() == -1485570073) {
            return ((TdApi.MessageSchedulingStateSendAtDate) this.f13449a.schedulingState).sendDate;
        }
        return 0;
    }

    public final je.k T3() {
        return p8(t.d.E, t.b.f15475l, t.a.f15470g);
    }

    public final int T4() {
        return this.N0.I0(R.id.theme_color_unreadText, R.id.theme_color_bubble_unreadText, R.id.theme_color_bubble_unreadText_noWallpaper, R.id.theme_property_wallpaperOverrideUnread);
    }

    public boolean T5(long j10, long[] jArr) {
        return p1(j10, jArr) != null;
    }

    public void T6() {
        this.f13452b &= -262145;
    }

    public void T7(TdApi.Message message, int i10) {
    }

    public final void T8(TdApi.ChatAdministrator chatAdministrator) {
        boolean z10 = true;
        boolean z11 = (this.Z0 != null || this.Q.k()) && !f6();
        if (chatAdministrator == null) {
            z10 = false;
        }
        if (z11 != z10 || z11) {
            this.Z0 = chatAdministrator;
            if ((this.f13452b & 32) != 0) {
                if (R9()) {
                    g0();
                    a0(false);
                } else {
                    k0();
                    g0();
                }
                u5();
                return;
            }
            k0();
        }
    }

    public final boolean T9() {
        return this.f13449a.forwardInfo != null && (!R9() || !R8()) && !x1();
    }

    public boolean U(float f10, float f11) {
        return true;
    }

    public final void U0(g1 g1Var, Canvas canvas) {
        if (this.f13465g1 != 0.0f) {
            canvas.drawRect(0.0f, v1(), g1Var.getMeasuredWidth(), l1(), y.g(x4(this.f13465g1)));
        }
        if (this.f13467h1 != 0.0f) {
            j1(g1Var, canvas);
        }
        if (this.f13463f1 != 0.0f) {
            g1(g1Var, canvas);
        }
    }

    public final int U1() {
        return this.N0.P0(0, R.id.theme_color_bubble_button, R.id.theme_color_bubble_button_noWallpaper, R.id.theme_property_wallpaperOverrideButton);
    }

    public l1 U3(long j10, View view, int i10, int i11, int i12) {
        return null;
    }

    public final boolean U5() {
        return this.f13461e1;
    }

    public boolean U6() {
        if (!t0()) {
            return false;
        }
        this.f13452b |= Log.TAG_PAINT;
        if (this.f13449a.containsUnreadMention) {
            j5(true);
        }
        return true;
    }

    public void U7(TdApi.Message message, boolean z10, boolean z11) {
    }

    public final void U8(TdApi.Chat chat) {
        this.f13451a1 = chat;
        this.f13452b = ib.c.h(ib.c.h(this.f13452b, Log.TAG_NDK, v7()), 33554432, m6());
        if (f6() && !n6()) {
            v9(chat.lastReadOutboxMessageId);
        }
        if (this.O0.Q6(chat)) {
            r3 r3Var = this.T;
            if (r3Var != null) {
                r3Var.V(chat.title);
            }
            k0();
        }
    }

    public final boolean U9() {
        return !T9() && !R9() && s8() && !X5();
    }

    public final boolean V() {
        return !R9() || S();
    }

    public final void V0(Canvas canvas, Paint paint, boolean z10, int i10) {
        if (paint.getAlpha() != 0) {
            RectF rectF = this.K0;
            float f10 = i10;
            float f11 = rectF.left - f10;
            float f12 = rectF.top - f10;
            float f13 = rectF.right + f10;
            float f14 = rectF.bottom + f10;
            RectF a02 = y.a0();
            float f15 = this.H0;
            if (f15 != 0.0f) {
                a02.set(f11, f12, (f15 * 2.0f) + f11, (f15 * 2.0f) + f12);
                canvas.drawArc(a02, 180.0f, 90.0f, !z10, paint);
                float f16 = this.H0;
                float f17 = this.G0;
                if (f16 < f17 && !z10) {
                    canvas.drawRect(f11, f12 + f16, f11 + f16, f12 + f17, paint);
                }
            }
            float f18 = this.G0;
            if (f18 != 0.0f) {
                a02.set(f13 - (f18 * 2.0f), f12, f13, (f18 * 2.0f) + f12);
                canvas.drawArc(a02, 270.0f, 90.0f, !z10, paint);
                float f19 = this.G0;
                float f20 = this.H0;
                if (f19 < f20 && !z10) {
                    canvas.drawRect(f13 - f19, f12 + f19, f13, f12 + f20, paint);
                }
            }
            float f21 = this.H0;
            if (!(f21 == 0.0f && this.G0 == 0.0f) && !z10) {
                float f22 = this.G0;
                canvas.drawRect(f11 + f21, f12, f13 - f22, f12 + Math.max(f21, f22), paint);
            }
            float f23 = this.I0;
            if (f23 != 0.0f) {
                a02.set(f11, f14 - (f23 * 2.0f), (f23 * 2.0f) + f11, f14);
                canvas.drawArc(a02, 90.0f, 90.0f, !z10, paint);
                float f24 = this.I0;
                float f25 = this.J0;
                if (f24 < f25 && !z10) {
                    canvas.drawRect(f11, f14 - f25, f11 + f24, f14 - f24, paint);
                }
            }
            float f26 = this.J0;
            if (f26 != 0.0f) {
                a02.set(f13 - (f26 * 2.0f), f14 - (f26 * 2.0f), f13, f14);
                canvas.drawArc(a02, 0.0f, 90.0f, !z10, paint);
                float f27 = this.J0;
                float f28 = this.I0;
                if (f27 < f28 && !z10) {
                    canvas.drawRect(f13 - f27, f14 - f28, f13, f14 - f27, paint);
                }
            }
            float f29 = this.I0;
            if (!(f29 == 0.0f && this.J0 == 0.0f) && !z10) {
                canvas.drawRect(f11 + f29, f14 - Math.max(f29, this.J0), f13 - this.J0, f14, paint);
            }
            if (z10) {
                canvas.drawLine(f11 + this.H0, f12, f13 - this.G0, f12, paint);
                canvas.drawLine(f11 + this.I0, f14, f13 - this.J0, f14, paint);
                canvas.drawLine(f11, f12 + this.H0, f11, f14 - this.I0, paint);
                canvas.drawLine(f13, f12 + this.G0, f13, f14 - this.J0, paint);
                return;
            }
            float max = f12 + Math.max(this.H0, this.G0);
            float max2 = f14 - Math.max(this.I0, this.J0);
            if (max2 > max) {
                canvas.drawRect(f11, max, f13, max2, paint);
            }
        }
    }

    public final int V1() {
        return this.N0.P0(0, R.id.theme_color_bubble_buttonRipple, R.id.theme_color_bubble_buttonRipple_noWallpaper, R.id.theme_property_wallpaperOverrideButton);
    }

    public final int V2() {
        if (!R9()) {
            return ib.d.c(ae.j.L(R.id.theme_color_chatBackground), x4(this.f13467h1));
        }
        return ae.j.L(g6() ? R.id.theme_color_bubbleOut_background : R.id.theme_color_bubbleIn_background);
    }

    public int V3() {
        if ((this.f13452b & Log.TAG_CRASH) != 0) {
            return 0;
        }
        return this.M;
    }

    public final int V4() {
        return ae.j.L(g6() ? R.id.theme_color_bubbleOut_chatVerticalLine : R.id.theme_color_messageVerticalLine);
    }

    public boolean V5() {
        if (this.f13449a.editDate > 0) {
            return true;
        }
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.Y0;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<TdApi.Message> it = this.Y0.iterator();
                while (it.hasNext()) {
                    if (it.next().editDate > 0) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public final int V6() {
        return R9() ? Q() ? E1() - this.U.u() : D1() : this.f13476m0;
    }

    public void V7() {
    }

    public final void V8(String str) {
        this.V = str;
        boolean M0 = je.g.M0(str);
        this.f13452b = ib.c.h(this.f13452b, Log.TAG_PLAYER, M0);
        this.D0 = ib.i.i(str) ? 0 : (int) v0.T1(str, R9() ? y.k(M0) : y.p0(M0));
    }

    public final TdApi.User V9(long j10) {
        if (this.f13449a.isOutgoing || !Q5()) {
            return this.O0.e2().u2(j10);
        }
        return this.N0.s0(j10);
    }

    public final void W(float f10, float f11) {
        eb.k kVar = this.f13489s1;
        if (kVar != null) {
            kVar.l(f10);
        }
        W8(f10);
        eb.k kVar2 = this.f13489s1;
        if (kVar2 == null) {
            float f12 = this.f13479n1;
            if (f12 != f11) {
                this.f13489s1 = new eb.k(-2, this, db.b.f7287b, 200L, f12);
            } else {
                return;
            }
        } else if (!kVar2.v() && this.f13479n1 == f11) {
            return;
        }
        this.f13489s1.i(f11);
    }

    public final void W0(Canvas canvas, float f10) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        int i10;
        Bitmap bitmap4;
        float f11;
        int i11;
        int i12 = (int) (255.0f * f10);
        if (i12 > 0) {
            Paint paint = Q1;
            paint.setAlpha(i12);
            if (!S9()) {
                int i13 = a0.i(2.0f);
                RectF rectF = this.K0;
                float f12 = i13;
                float f13 = rectF.left - f12;
                float f14 = rectF.top - f12;
                float f15 = rectF.right + f12;
                float f16 = rectF.bottom + f12;
                canvas.drawBitmap(ae.j.w0(this.H0) ? A1 : B1, f13, f14, paint);
                canvas.drawBitmap(ae.j.w0(this.I0) ? E1 : F1, f13, f16 - bitmap2.getHeight(), paint);
                canvas.drawBitmap(ae.j.w0(this.G0) ? C1 : D1, f15 - bitmap3.getWidth(), f14, paint);
                Bitmap bitmap5 = ae.j.w0(this.J0) ? G1 : H1;
                canvas.drawBitmap(bitmap5, f15 - bitmap5.getWidth(), f16 - bitmap5.getHeight(), paint);
                paint.setAlpha(255);
                canvas.save();
                int i14 = a0.i(18.0f);
                float width = f13 + bitmap.getWidth();
                float width2 = (f15 - bitmap3.getWidth()) - width;
                if (width2 > 0.0f) {
                    I1.setAlpha(i12);
                    f11 = (this.K0.top - N1.getHeight()) + i14;
                    canvas.translate(width - 0.0f, f11 - 0.0f);
                    i10 = i14;
                    bitmap4 = bitmap5;
                    canvas.drawRect(0.0f, 0.0f, width2, N1.getHeight(), I1);
                } else {
                    i10 = i14;
                    bitmap4 = bitmap5;
                    width = 0.0f;
                    f11 = 0.0f;
                }
                float width3 = f13 + bitmap2.getWidth();
                float width4 = (f15 - bitmap4.getWidth()) - width3;
                if (width4 > 0.0f) {
                    J1.setAlpha(i12);
                    i11 = i10;
                    float f17 = this.K0.bottom - i11;
                    canvas.translate(width3 - width, f17 - f11);
                    canvas.drawRect(0.0f, 0.0f, width4, P1.getHeight(), J1);
                    width = width3;
                    f11 = f17;
                } else {
                    i11 = i10;
                }
                float height = f14 + bitmap.getHeight();
                float height2 = (f16 - bitmap2.getHeight()) - height;
                if (height2 > 0.0f) {
                    K1.setAlpha(i12);
                    float width5 = (this.K0.left - M1.getWidth()) + i11;
                    canvas.translate(width5 - width, height - f11);
                    canvas.drawRect(0.0f, 0.0f, M1.getWidth(), height2, K1);
                    f11 = height;
                    width = width5;
                }
                float height3 = f14 + bitmap3.getHeight();
                float height4 = (f16 - bitmap4.getHeight()) - height3;
                if (height4 > 0.0f) {
                    L1.setAlpha(i12);
                    canvas.translate((this.K0.right - i11) - width, height3 - f11);
                    canvas.drawRect(0.0f, 0.0f, O1.getWidth(), height4, L1);
                }
                canvas.restore();
            }
        }
    }

    public final int W1() {
        return this.N0.I0(0, R.id.theme_color_bubble_buttonText, R.id.theme_color_bubble_buttonText_noWallpaper, R.id.theme_property_wallpaperOverrideButton);
    }

    public int W2() {
        return 10;
    }

    public int W3() {
        int i10;
        return ((this.f13452b & Log.TAG_CRASH) != 0 || (i10 = this.f13455c) == 0) ? this.f13449a.date : i10;
    }

    public final int W4() {
        return ae.j.L(g6() ? R.id.theme_color_bubbleOut_chatNeutralFillingContent : R.id.theme_color_messageNeutralFillingContent);
    }

    public final boolean W5() {
        return (this.f13452b & Log.TAG_TDLIB_OPTIONS) != 0;
    }

    public final int W6() {
        int W2;
        int u32;
        if (R9()) {
            W2 = this.f13484q0;
            u32 = c4.q();
        } else {
            W2 = this.f13494v0 + W2() + k4();
            u32 = e5() ? u3() + w3() + v3() : 0;
        }
        return W2 + u32;
    }

    public boolean W7(TdApi.Message message, TdApi.MessageContent messageContent, TdApi.MessageContent messageContent2, boolean z10) {
        return false;
    }

    public void W8(float f10) {
        if (this.f13479n1 != f10) {
            this.f13479n1 = f10;
            E5(true);
        }
    }

    public boolean X0() {
        return false;
    }

    public Path X1() {
        return this.F0;
    }

    public TdApi.Message X3() {
        return this.f13449a;
    }

    public final int X4() {
        TdApi.MessageInteractionInfo messageInteractionInfo;
        if (n6() || Y5() || (messageInteractionInfo = this.f13449a.interactionInfo) == null) {
            return 0;
        }
        return messageInteractionInfo.viewCount;
    }

    public final boolean X5() {
        return (this.f13452b & 4194304) != 0 || this.f13449a.content.getConstructor() == 0;
    }

    public void X7(long j10) {
    }

    public void X8(String str, String str2, TdApi.TextEntity[] textEntityArr) {
        this.f13495v1 = str;
        x0 D = new x0(str2, C4(), K4(), l0.E(this.O0, str2, textEntityArr, h8())).D(F0());
        if (R9()) {
            D.a(Log.TAG_YOUTUBE);
        }
        if (!R9()) {
            D.a(64);
        }
        D.H(this.P0);
        this.f13497w1 = D;
    }

    public void Y0(Canvas canvas, g1 g1Var) {
        Paint paint;
        Paint paint2;
        int i10;
        Paint paint3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10 = !O9() || S9();
        if (!(z10 || (X0() && !T9()))) {
            int j32 = j3();
            int o32 = o3();
            i11 = j32;
            paint3 = p3();
            i10 = o32;
            paint2 = y.v();
            paint = y.w();
            i12 = 0;
        } else if (z10) {
            int v22 = v2();
            i12 = q2();
            i11 = v22;
            paint3 = y.x(v22);
            paint2 = paint3;
            paint = paint2;
            i10 = R.id.theme_color_bubble_mediaTimeText;
        } else {
            int L = ae.j.L(R.id.theme_color_bubble_mediaOverlayText);
            i12 = ae.j.L(R.id.theme_color_bubble_mediaOverlay);
            i11 = L;
            paint3 = y.u(L);
            paint2 = paint3;
            paint = paint2;
            i10 = R.id.theme_color_bubble_mediaOverlayText;
        }
        int L0 = L0(false);
        boolean n62 = n6();
        boolean Y5 = Y5();
        if (b7()) {
            i13 = D1() + a0.i(10.0f);
        } else {
            i13 = C1(g1Var, a0.i(11.0f) + L0);
        }
        int s22 = ((this.f13484q0 - s2()) - t2()) - m2();
        if (i12 != 0) {
            int i17 = s22 - a0.i(4.0f);
            RectF a02 = y.a0();
            int i18 = a0.i(6.0f);
            a02.set(i13 - i18, i17, L0 + i13 + i18, a0.i(21.0f) + i17);
            canvas.drawRoundRect(a02, a0.i(12.0f), a0.i(12.0f), y.g(i12));
            s22 = i17 - a0.i(1.0f);
        }
        int i19 = s22;
        int i20 = i19 + a0.i(11.5f);
        if (Y4() == 1) {
            if (n62) {
                float j10 = this.f13456c0.j(a0.i(6.0f));
                int f10 = ce.p.f() + a0.i(3.0f);
                if (O9() && !X0()) {
                    float f11 = f10;
                    if (j10 > f11) {
                        i13 = (int) (i13 + (j10 - f11));
                    }
                }
                ce.c.b(canvas, ce.p.e(i10), i13 - a0.i(ce.p.f5332g), (i19 + a0.i(5.0f)) - a0.i(ce.p.f5333h), paint3);
                i16 = i13 + f10;
                i14 = i20;
            } else {
                float f12 = i13;
                i14 = i20;
                this.f13456c0.f(canvas, f12, i20, 3, 1.0f, g1Var, i10);
                i16 = (int) (f12 + this.f13456c0.j(a0.i(6.0f)));
            }
            float f13 = i16;
            this.f13460e0.f(canvas, f13, i14, 3, 1.0f, g1Var, i10);
            i13 = (int) (f13 + this.f13460e0.j(a0.i(6.0f)));
        } else {
            i14 = i20;
        }
        if (S2() == 0) {
            float f14 = i13;
            this.f13458d0.f(canvas, f14, i14, 3, 1.0f, g1Var, i10);
            i13 = (int) (f14 + this.f13458d0.j(a0.i(6.0f)));
        }
        float f15 = i13;
        this.f13462f0.f(canvas, f15, i14, 3, 1.0f, g1Var, i10);
        int j11 = (int) (f15 + this.f13462f0.j(a0.i(3.0f)));
        if (z9()) {
            if (I5()) {
                ce.c.b(canvas, ce.p.e(i10), j11 - a0.i(6.0f), (i19 + a0.i(4.5f)) - a0.i(5.0f), paint3);
            } else {
                ce.c.b(canvas, g1Var.Z(R.drawable.baseline_edit_12, 0), j11, i19 + a0.i(4.5f), paint3);
            }
            j11 += ce.p.h() + a0.i(2.0f);
        }
        String str = this.P;
        if (str != null) {
            canvas.drawText(str, j11, i19 + a0.i(15.5f), y.a(P6(), i11));
            j11 += this.f13500y0;
        }
        if (!g6() && (!n62 || Y4() == 1)) {
            return;
        }
        int i21 = j11 + a0.i(3.5f);
        if (n62) {
            i15 = i19 + a0.i(5.0f);
            i21 += a0.i(1.0f);
        } else {
            i15 = i19 + a0.i(4.5f);
        }
        if (!Y5) {
            if (n62) {
                ce.c.b(canvas, ce.p.e(i10), i21 - a0.i(ce.p.f5332g), i15 - a0.i(ce.p.f5333h), paint3);
            } else {
                boolean z11 = s6() && !z7();
                ce.c.b(canvas, z11 ? ce.p.l(i10) : ce.p.g(i10), i21 - a0.i(ce.p.f5334i), i15 - a0.i(ce.p.f5335j), z11 ? paint2 : paint);
            }
        }
        ce.p.m();
    }

    public int Y1() {
        return f13429g2;
    }

    public int Y2() {
        return this.f13496w0;
    }

    public TdApi.Message Y3(long j10) {
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.Y0;
            if (arrayList != null) {
                Iterator<TdApi.Message> it = arrayList.iterator();
                while (it.hasNext()) {
                    TdApi.Message next = it.next();
                    if (next.f19946id == j10) {
                        return next;
                    }
                }
            }
            TdApi.Message message = this.f13449a;
            if (message.f19946id == j10) {
                return message;
            }
            return null;
        }
    }

    public final int Y4() {
        TdApi.MessageForwardInfo messageForwardInfo;
        if (this.f13456c0 == null) {
            return 0;
        }
        if (T9()) {
            TdApi.Message message = this.f13449a;
            if (!message.isChannelPost && (messageForwardInfo = message.forwardInfo) != null && messageForwardInfo.origin.getConstructor() == 1490730723) {
                return 2;
            }
        }
        return (R9() || ib.c.b(this.f13452b, Log.TAG_CRASH)) ? 1 : 0;
    }

    public final boolean Y5() {
        TdApi.MessageSendingState messageSendingState = this.f13449a.sendingState;
        return messageSendingState != null && messageSendingState.getConstructor() == -1741887228;
    }

    public boolean Y6() {
        return false;
    }

    public boolean Y7(long j10, int i10) {
        return false;
    }

    public final void Y8(boolean z10) {
        int i10 = this.f13452b;
        if (z10 != ((i10 & Log.TAG_CRASH) != 0)) {
            if (z10) {
                this.f13452b = i10 | Log.TAG_CRASH;
            } else {
                this.f13452b = i10 & (-257);
            }
            if ((this.f13452b & 32) != 0) {
                a0(true);
            }
        }
    }

    public void Z(TdApi.ChatType chatType) {
    }

    public final void Z0(g1 g1Var, Canvas canvas, int i10, int i11, int i12, float f10) {
        Drawable Z;
        int Q22 = i12 + (Q2() / 2);
        int E22 = E2();
        float f11 = Q22;
        ce.c.b(canvas, g1Var.Z(R.drawable.templarian_outline_comment_22, E22), i10 + a0.i(12.0f), f11 - (Z.getMinimumHeight() / 2.0f), ce.z.c(E22, f10));
        ce.b.k(canvas, i11 - a0.i(12.0f), f11, ib.d.a(f10, ae.j.L(E22)), 5);
    }

    public final int Z1() {
        return this.N0.P0(0, R.id.theme_color_bubble_date, R.id.theme_color_bubble_date_noWallpaper, R.id.theme_property_wallpaperOverrideDate);
    }

    public final int Z2() {
        if (R9()) {
            return ae.j.L(g6() ? R.id.theme_color_bubbleOut_background : R.id.theme_color_bubbleIn_background);
        }
        int L = ae.j.L(R.id.theme_color_chatBackground);
        float f10 = this.f13467h1;
        return f10 > 0.0f ? ib.d.c(L, ib.d.a(f10, ae.j.i())) : L;
    }

    public int Z3() {
        final SparseIntArray sparseIntArray = new SparseIntArray();
        t6(new kb.j() {
            @Override
            public final void a(Object obj) {
                s4.v6(sparseIntArray, (TdApi.Message) obj);
            }
        }, false);
        if (sparseIntArray.size() > 1) {
            return 1;
        }
        if (sparseIntArray.valueAt(0) > 1) {
            return sparseIntArray.keyAt(0);
        }
        return 0;
    }

    public int Z4() {
        return this.N;
    }

    public boolean Z5() {
        return this.f13449a.forwardInfo != null;
    }

    public final boolean Z6(hd.s4 r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: hd.s4.Z6(hd.s4, boolean):boolean");
    }

    public void Z7(long j10, long j11, boolean z10) {
    }

    public final void Z8(float f10) {
        if (this.f13463f1 != f10) {
            this.f13463f1 = f10;
            E5(false);
        }
    }

    @Override
    public final void a() {
        x5();
    }

    public final void a0(boolean z10) {
        int h22;
        boolean z11;
        int i10;
        int i11;
        int i12;
        if (R9()) {
            boolean O9 = O9();
            int N0 = N0();
            int J0 = J0();
            if (i5() || ((X0() && !T9()) || !Q9())) {
                this.W0 = 0;
            } else {
                int L0 = L0(true);
                if (T9()) {
                    i11 = -1;
                } else {
                    i11 = e5() ? this.f13497w1.p() + a0.i(10.0f) : R1();
                }
                int i13 = i11 + L0;
                boolean S = S();
                int max = S ? Math.max(N0, L0) : N0;
                int s22 = s2() + J0;
                if (S) {
                    i12 = this.f13478n0;
                } else {
                    i12 = Math.min(this.f13478n0, N0);
                }
                int max2 = Math.max(N0, i13);
                if (i11 == -3) {
                    float b22 = b2();
                    N0 = ib.h.j(Math.max(N0, J1() + L0), max, b22);
                    J0 = ib.h.j(J0, s22, b22);
                } else if (i11 != -2) {
                    if (i11 == -1 || i13 > i12) {
                        N0 = max;
                        J0 = s22;
                    } else {
                        N0 = max2;
                    }
                }
                this.X0 = N0;
                this.W0 = L0;
            }
            int i22 = i2();
            int k22 = k2();
            int j22 = j2();
            int i14 = N0 + i22 + j22;
            int h23 = J0 + k22 + h2();
            int K0 = z0() ? (this.N / 2) - (i14 / 2) : K0();
            int i15 = K0 + i14;
            int M0 = M0();
            int i16 = h23 + M0;
            int i17 = a0.i(ae.j.F());
            int i18 = a0.i(ae.j.G());
            if (this.f13480o0 != K0 || this.f13482p0 != M0 || this.f13486r0 != i15 || this.f13484q0 != i16 || this.f13488s0 != i18 || this.f13490t0 != i17 || z10) {
                this.f13480o0 = K0;
                this.f13482p0 = M0;
                this.f13486r0 = i15;
                this.f13484q0 = i16;
                this.f13488s0 = i18;
                this.f13490t0 = i17;
                if (O9) {
                    this.E0.reset();
                    this.F0.reset();
                }
                if (Q()) {
                    int i19 = (this.N - i15) - K0;
                    K0 += i19;
                    i15 += i19;
                }
                if (O9) {
                    boolean S9 = S9();
                    if (S9) {
                        i17 = i14 / 2;
                        M0 = i16 - i14;
                        i18 = i17;
                    }
                    boolean z12 = !i5();
                    boolean z13 = (this.f13452b & 2) == 0 || this.f13449a.content.getConstructor() == -69441162;
                    synchronized (this.E0) {
                        boolean Q = Q();
                        if (S9) {
                            float f10 = i17;
                            this.G0 = f10;
                            this.H0 = f10;
                            this.I0 = f10;
                            this.J0 = f10;
                            float f11 = (K0 + i15) * 0.5f;
                            float f12 = i16 - i17;
                            this.E0.addCircle(f11, f12, f10, Path.Direction.CW);
                            this.F0.addCircle(f11, f12, f10, Path.Direction.CW);
                            this.K0.set(K0, i16 - i14, i15, i16);
                            this.L0.set(this.K0);
                        } else {
                            int i20 = i18;
                            int i21 = i17;
                            this.K0.set(K0, M0, i15, i16);
                            Path path = this.E0;
                            RectF rectF = this.K0;
                            float f13 = (!z12 || Q) ? i21 : i20;
                            this.H0 = f13;
                            float f14 = (!z12 || !Q) ? i21 : i20;
                            this.G0 = f14;
                            float f15 = (!z13 || !Q) ? i21 : i20;
                            this.J0 = f15;
                            if (!z13 || Q) {
                                z11 = z13;
                                i10 = i21;
                            } else {
                                z11 = z13;
                                i10 = i20;
                            }
                            float f16 = i10;
                            this.I0 = f16;
                            ce.b.a(path, rectF, f13, f14, f15, f16);
                            this.L0.set(K0 + i22, (M0 + k22) - p2(), i15 - j22, i16 - h22);
                            int i23 = (int) (i21 / 1.5d);
                            int i24 = (int) (i20 / 1.5d);
                            ce.b.a(this.F0, this.L0, (!z12 || Q) ? i23 : i24, (!z12 || !Q) ? i23 : i24, (!z11 || !Q) ? i23 : i24, (!z11 || Q) ? i23 : i24);
                        }
                    }
                }
                I9(false);
                C7();
            }
        }
    }

    public void a1(g1 g1Var, Canvas canvas, int i10, int i11, int i12) {
        float f10 = i11 + 5.0f;
        canvas.drawCircle(i10 + 5.0f, f10, 5.0f, y.g(ae.j.H0()));
        canvas.drawCircle((i10 + i12) - 5.0f, f10, 5.0f, y.g(ae.j.H0()));
    }

    public final int a2() {
        return this.N0.I0(0, R.id.theme_color_bubble_dateText, R.id.theme_color_bubble_dateText_noWallpaper, R.id.theme_property_wallpaperOverrideDate);
    }

    public int a3() {
        return this.f13478n0;
    }

    public int a4() {
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.Y0;
            if (arrayList == null || arrayList.isEmpty()) {
                return 1;
            }
            return this.Y0.size();
        }
    }

    public void a5(int i10, int i11, int i12) {
    }

    public boolean a6() {
        return ob.a.l(this.f13449a.chatId) && ob.e.i1(this.f13449a.content);
    }

    public final rh a7() {
        return this.N0.r0();
    }

    public int a8(long j10, long j11, int i10) {
        return 0;
    }

    public void a9(h hVar) {
        this.f13457c1 = hVar;
    }

    public final void aa() {
        j0.H(n1(), true);
    }

    public void b0(int i10) {
    }

    public void b1(g1 g1Var, Canvas canvas, int i10, int i11, int i12, ld.b bVar) {
        float f10 = i11 + 5.0f;
        canvas.drawCircle(i10 + 5.0f, f10, 5.0f, y.g(ae.j.H0()));
        canvas.drawCircle((i10 + i12) - 5.0f, f10, 5.0f, y.g(ae.j.H0()));
    }

    public float b2() {
        throw new RuntimeException();
    }

    public int b3() {
        return this.f13492u0;
    }

    public int b4(long j10, long j11) {
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.Y0;
            int i10 = 0;
            if (arrayList == null || arrayList.isEmpty()) {
                return 0;
            }
            Iterator<TdApi.Message> it = this.Y0.iterator();
            while (it.hasNext()) {
                long j12 = it.next().f19946id;
                if (j12 > j10) {
                    if (j12 >= j11) {
                        break;
                    }
                    i10++;
                }
            }
            return i10;
        }
    }

    public final boolean b5() {
        return this.P0.g();
    }

    public boolean b6() {
        if (f6()) {
            TdApi.Message message = this.f13449a;
            if (message.ttlExpiresIn < message.ttl) {
                return true;
            }
        }
        return false;
    }

    public final boolean b7() {
        return w.G2();
    }

    public void b8(long j10, float f10, boolean z10) {
    }

    public void b9(boolean z10) {
        if (z10 != J5()) {
            if (z10) {
                this.f13452b |= 2;
            } else {
                this.f13452b &= -3;
            }
            if ((this.f13452b & 32) != 0) {
                a0(true);
            }
        }
    }

    public final boolean ba(TdApi.Message message) {
        int a12;
        TdApi.Message message2 = this.f13449a;
        long j10 = message2.mediaAlbumId;
        return j10 != 0 && j10 == message.mediaAlbumId && message2.ttl == message.ttl && !a6() && !X5() && !o6() && (a12 = t2.a1(this.f13449a)) != 0 && t2.a1(message) == a12;
    }

    @Override
    public final o6 c() {
        return this.O0;
    }

    public x2.h c0(View view, final x2.f fVar) {
        return t().I3().h(view, this.P0).u(new x2.f() {
            @Override
            public final void d1(View view2, Rect rect) {
                s4.this.u6(fVar, view2, rect);
            }
        }).e(-2.0f).f(F0()).i(Q0()).G(h8());
    }

    public void c1(g1 g1Var, Canvas canvas, int i10, int i11, int i12, v vVar, v vVar2) {
        float f10 = i11 + 5.0f;
        canvas.drawCircle(i10 + 5.0f, f10, 5.0f, y.g(ae.j.H0()));
        canvas.drawCircle((i10 + i12) - 5.0f, f10, 5.0f, y.g(ae.j.H0()));
    }

    public final int c3() {
        return this.f13494v0;
    }

    public lb.d<i> c4() {
        lb.d<i> dVar = this.f13459d1;
        if (dVar != null) {
            return dVar;
        }
        lb.d<i> dVar2 = new lb.d<>();
        this.f13459d1 = dVar2;
        return dVar2;
    }

    public final boolean c5() {
        gb.g gVar;
        return this.P0.g() || ((gVar = this.Q0) != null && gVar.g());
    }

    public boolean c6() {
        return this.f13454b1 != 0;
    }

    public final void c7(v4<?> v4Var) {
        if (!Q0().ac(v4Var)) {
            v4Var.Z8();
        }
    }

    public boolean c8(long j10) {
        M9(j10, j10, true);
        return this.f13449a.f19946id == j10;
    }

    public final s4 c9(o7 o7Var, long j10) {
        this.f13452b |= 4194304;
        this.f13491t1 = o7Var.f13336a.date;
        this.f13493u1 = o7Var.f13338c;
        this.P = B1();
        V8(z1());
        return this;
    }

    @Override
    public boolean d(je.a aVar) {
        return e7();
    }

    public final void d0() {
        int i10;
        if (e5()) {
            int a32 = (V() ? this.f13478n0 : a3()) - a0.i(10.0f);
            if (R9()) {
                i10 = f13429g2 + f13430h2;
            } else {
                i10 = a0.i(8.0f);
            }
            int i11 = a32 - i10;
            this.f13497w1.B(i11);
            TextPaint d10 = C4().d();
            this.f13499x1 = TextUtils.ellipsize(this.f13495v1, d10, i11, TextUtils.TruncateAt.END).toString();
            this.f13501y1 = (int) v0.T1(this.f13495v1, d10);
        }
    }

    public final int d2() {
        return this.N0.P0(0, R.id.theme_color_bubble_mediaReply, R.id.theme_color_bubble_mediaReply_noWallpaper, R.id.theme_property_wallpaperOverrideMediaReply);
    }

    public final int d3(boolean z10) {
        int i10;
        if (z10) {
            i10 = g6() ? R.id.theme_color_bubbleOut_chatCorrectChosenFilling : R.id.theme_color_messageCorrectChosenFilling;
        } else {
            i10 = g6() ? R.id.theme_color_bubbleOut_chatCorrectFilling : R.id.theme_color_messageCorrectFilling;
        }
        return ae.j.L(i10);
    }

    public final long d4() {
        return this.f13449a.messageThreadId;
    }

    public final boolean d5() {
        return (this.f13452b & Log.TAG_VOICE) != 0;
    }

    public final boolean d6() {
        return this.f13449a.sendingState != null;
    }

    public final boolean d7() {
        return G1() != null;
    }

    public final boolean d8(View view, je.g gVar, je.v0 v0Var, hj.q qVar) {
        if (v0Var.g() == null || !(v0Var.g().j() instanceof Long)) {
            return i8(view, gVar, v0Var, qVar, null);
        }
        this.N0.r0().Wp(this.f13449a.viaBotUserId, this.R);
        return true;
    }

    public boolean d9(long j10, boolean z10) {
        boolean z11;
        synchronized (this) {
            int l52 = l5(j10);
            if (l52 >= 0) {
                z11 = this.Y0.get(l52).isPinned != z10;
                if (z11) {
                    this.Y0.get(l52).isPinned = z10;
                    z11 = true;
                }
                if (z11 && !z10) {
                    Iterator<TdApi.Message> it = this.Y0.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().isPinned) {
                                z11 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } else if (l52 != -2) {
                return false;
            } else {
                TdApi.Message message = this.f13449a;
                z11 = message.isPinned != z10;
                message.isPinned = z10;
            }
            if (!z11) {
                return false;
            }
            this.f13462f0.y(z10, e7());
            return true;
        }
    }

    public final void e0() {
        int i10;
        if (T9() && this.S != null) {
            boolean z10 = false;
            this.f13470j0 = v0.T1(this.f13464g0, R9() ? P6() : O6(false));
            if (R9()) {
                i10 = V() ? this.f13478n0 : a3() + ((j2() + i2()) - ((f13430h2 + f13429g2) * 2));
            } else {
                i10 = (this.N - f13436n2) - f13439q2;
            }
            float f10 = i10;
            float f11 = (f10 - this.f13470j0) - E2;
            if (Y4() == 2) {
                f11 -= this.f13456c0.j(a0.i(6.0f)) + this.f13460e0.j(a0.i(6.0f));
            }
            if (i6() && !x1()) {
                z10 = true;
            }
            String b10 = this.S.b();
            boolean z11 = !(this.S instanceof s6);
            long j10 = this.f13449a.viaBotUserId;
            if (!z10) {
                f10 = f11;
            }
            this.f13466h0 = Q6(b10, z11, z10, false, j10, (int) f10, true);
            if (z10) {
                this.f13468i0 = new g.b(this.O0, w.V0(Q0(), this.f13449a.forwardInfo.publicServiceAnnouncementType), h8(), (int) f11, e4(), H2()).d().v().u(new m4(this)).f();
            } else {
                this.f13468i0 = null;
            }
        }
    }

    public boolean e1(Canvas canvas, int i10, int i11, float f10, float f11) {
        int i12;
        TextPaint textPaint;
        int i13;
        boolean z10 = false;
        if (!d5()) {
            return false;
        }
        if (f11 == 0.0f) {
            return true;
        }
        RectF a02 = y.a0();
        if (R9()) {
            int Z12 = Z1();
            int a22 = a2();
            int i14 = a0.i(8.0f);
            a02.set((i10 - (this.D0 / 2)) - i14, i11 + a0.i(5.0f), i10 + (this.D0 / 2) + i14, i11 + a0.i(5.0f) + a0.i(26.0f));
            float i15 = a0.i(ae.j.E());
            canvas.drawRoundRect(a02, i15, i15, y.g(ib.d.a(f11, Z12)));
            i13 = i10 - (this.D0 / 2);
            i12 = (i11 + f13443u2) - a0.i(3.0f);
            if ((524288 & this.f13452b) != 0) {
                z10 = true;
            }
            textPaint = y.l(z10, a22);
        } else {
            if (f10 > 0.0f) {
                int i16 = a0.i(10.0f);
                a02.set((i10 - (this.D0 / 2)) - i16, i11 + a0.i(8.0f), i10 + (this.D0 / 2) + i16, i11 + a0.i(8.0f) + a0.i(26.0f));
                float i17 = a0.i(ae.j.R());
                float f12 = f11 * f10;
                canvas.drawRoundRect(a02, i17, i17, y.g(ib.d.a(f12, ae.j.L(R.id.theme_color_chatBackground))));
                canvas.drawRoundRect(a02, i17, i17, y.Y(ib.d.a(f12, ae.j.M0()), Math.max(1, a0.i(0.5f))));
            }
            i13 = i10 - (this.D0 / 2);
            i12 = i11 + f13443u2;
            if ((this.f13452b & Log.TAG_CAMERA) != 0) {
                i12 += a0.i(1.0f);
            }
            if ((this.f13452b & Log.TAG_PLAYER) != 0) {
                z10 = true;
            }
            textPaint = y.p0(z10);
        }
        int i18 = (f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1));
        int alpha = i18 != 0 ? textPaint.getAlpha() : 255;
        if (i18 != 0) {
            textPaint.setAlpha((int) (alpha * f11));
        }
        canvas.drawText(this.V, i13, i12, textPaint);
        if (i18 != 0) {
            textPaint.setAlpha(alpha);
        }
        return true;
    }

    public final int e2() {
        return this.N0.I0(0, R.id.theme_color_bubble_mediaReplyText, R.id.theme_color_bubble_mediaReplyText_noWallpaper, R.id.theme_property_wallpaperOverrideMediaReply);
    }

    public final int e3(boolean z10) {
        int i10;
        if (z10) {
            i10 = g6() ? R.id.theme_color_bubbleOut_chatCorrectChosenFillingContent : R.id.theme_color_messageCorrectChosenFillingContent;
        } else {
            i10 = g6() ? R.id.theme_color_bubbleOut_chatCorrectFillingContent : R.id.theme_color_messageCorrectFillingContent;
        }
        return ae.j.L(i10);
    }

    public boolean e5() {
        return (this.f13495v1 == null || this.f13497w1 == null) ? false : true;
    }

    public final boolean e6() {
        return c().cd((long) f3(), TimeUnit.SECONDS) >= TimeUnit.MINUTES.toMillis(5L);
    }

    public final boolean e7() {
        return b5() && Q0().Z9().Ra() && ib.c.b(this.f13452b, 32) && j0.K();
    }

    public void e8() {
        w5(true);
    }

    public void e9(boolean z10) {
        this.f13452b = ib.c.h(this.f13452b, 8, z10);
        K9(false);
    }

    public final void f0() {
        this.f13464g0 = A1();
        if ((this.f13452b & 32) != 0) {
            e0();
        }
    }

    public final void f1(Canvas canvas) {
        int i10;
        int x32 = x3();
        if (R9()) {
            i10 = D1() + f13429g2 + f13430h2;
        } else {
            i10 = this.f13492u0;
        }
        RectF a02 = y.a0();
        a02.set(i10, x32, a0.i(3.0f) + i10, u3() + x32);
        canvas.drawRoundRect(a02, a0.i(1.5f), a0.i(1.5f), y.g(V4()));
        int i11 = i10 + a0.i(10.0f);
        TextPaint d10 = C4().d();
        d10.setColor(ae.j.L(R.id.theme_color_textNeutral));
        String str = this.f13499x1;
        if (str == null) {
            str = this.f13495v1;
        }
        canvas.drawText(str, i11, a0.i(15.0f) + x32, d10);
        this.f13497w1.j(canvas, i11, x32 + a0.i(22.0f), null, 1.0f);
    }

    public final int f3() {
        return this.f13449a.date;
    }

    public final int f4() {
        return ae.j.L(g6() ? R.id.theme_color_bubbleOut_chatNegativeFilling : R.id.theme_color_messageNegativeLine);
    }

    public boolean f5() {
        return !i5() && (this.f13452b & Log.TAG_CRASH) != 0;
    }

    public boolean f6() {
        return this.f13449a.isOutgoing && !X5();
    }

    public final boolean f7() {
        if (!R9()) {
            return true;
        }
        if (r6() && a7().pk().a()) {
            return false;
        }
        TdApi.Chat chat = this.f13451a1;
        if (chat != null) {
            int constructor = chat.type.getConstructor();
            if (constructor != -1472570774) {
                if (constructor == 973884508) {
                    return !f6();
                }
                if (constructor == 1579049844) {
                    return ((this.f13452b & 33554432) != 0 && !f6()) || j6();
                }
            } else if (!X5()) {
                return this.O0.u7(this.f13451a1) && !f6();
            } else {
                return true;
            }
        }
        return !f6() && R5();
    }

    public boolean f8(g1 g1Var, MotionEvent motionEvent) {
        c4 c4Var;
        if (f5() && t7(true)) {
            je.g gVar = this.W;
            if (gVar != null && gVar.U0(g1Var, motionEvent)) {
                return true;
            }
            je.g gVar2 = this.X;
            if (gVar2 != null && gVar2.U0(g1Var, motionEvent)) {
                return true;
            }
        }
        if (T9()) {
            je.g gVar3 = this.f13468i0;
            if (gVar3 != null && gVar3.U0(g1Var, motionEvent)) {
                return true;
            }
            je.g gVar4 = this.f13466h0;
            if (gVar4 != null && gVar4.U0(g1Var, motionEvent)) {
                return true;
            }
        }
        if (e5() && this.f13497w1.x(g1Var, motionEvent)) {
            return true;
        }
        if (X5() || (c4Var = this.U) == null || c4Var.v() || !this.U.w(g1Var, motionEvent)) {
            return this.U0.e(g1Var, motionEvent);
        }
        return true;
    }

    public final void f9(qd.b bVar, boolean z10) {
        if (z10) {
            this.f13452b |= Log.TAG_CONTACT;
        } else {
            this.f13452b &= -131073;
        }
        u5();
    }

    public final void g0() {
        int i10 = this.N;
        if ((this.f13452b & Log.TAG_CRASH) != 0 || R9()) {
            I6();
            K6();
        }
        if ((this.f13452b & Log.TAG_CAMERA) != 0) {
            float f10 = i10 / 2.0f;
            je.e eVar = this.f13453b0;
            float T12 = eVar != null ? v0.T1(eVar.f15363a, L1(eVar.f15364b)) : 0.0f;
            int i11 = (int) (f10 - (((a0.i(7.0f) + T12) + Q2.getMinimumWidth()) / 2.0f));
            this.f13472k0 = i11;
            this.f13474l0 = i11 + ((int) T12) + a0.i(2.0f);
        }
        this.A0 = F3() + a0.i(3.5f);
        this.C0 = F3() + a0.i(3.0f);
        if ((this.f13452b & Log.TAG_CRASH) != 0) {
            this.f13502z0 = this.f13498x0 - a0.i(6.0f);
            this.B0 = this.f13498x0 - a0.i(3.0f);
            return;
        }
        this.f13502z0 = i10 - a0.i(17.0f);
        this.B0 = i10 - a0.i(15.0f);
        if (this.T != null && !R()) {
            this.A0 += r3.x();
            this.C0 += r3.x();
        }
    }

    public void g1(View view, Canvas canvas) {
        if (this.f13463f1 != 0.0f) {
            canvas.drawRect(0.0f, v1(), view.getMeasuredWidth(), l1(), y.g(x4(this.f13463f1)));
        }
    }

    public final int g4() {
        return ae.j.L(g6() ? R.id.theme_color_bubbleOut_chatNegativeFillingContent : R.id.theme_color_messageNegativeLineContent);
    }

    public boolean g5(String str) {
        return false;
    }

    public final boolean g6() {
        return R9() && f6() && !K5() && !X5();
    }

    public final boolean g7() {
        return T9() || X0() || e5();
    }

    public final void g8(ob.d dVar) {
        this.O0.hd().r7(Q0(), dVar.c(), dVar, h8());
    }

    public void g9(boolean z10) {
        if (z10) {
            this.f13452b |= Log.TAG_YOUTUBE;
        } else {
            this.f13452b &= -129;
        }
    }

    public void h0(int i10) {
        if (i10 != 0 && this.N != i10) {
            this.N = i10;
            if (R9()) {
                this.f13476m0 = K0();
                this.f13478n0 = ((i10 - (fd.b.f11910g ? f13425c2 : f13424b2)) - K0()) - a0.i(r6() ? 8.0f : 56.0f);
                if (T9()) {
                    this.f13476m0 += a0.i(11.0f);
                    this.f13478n0 -= a0.i(11.0f);
                }
                int i22 = i2();
                int j22 = j2();
                this.f13476m0 += i22;
                this.f13478n0 -= i22 + j22;
            } else {
                if (!T9()) {
                    this.f13476m0 = f13433k2;
                    this.f13494v0 = ((this.f13452b & Log.TAG_CRASH) != 0 ? f13434l2 : f13437o2) + F3();
                } else {
                    this.f13476m0 = f13436n2;
                    this.f13494v0 = E3() + A3();
                }
                this.f13478n0 = (i10 - f13439q2) - this.f13476m0;
                if (i6()) {
                    this.f13494v0 += r4();
                }
            }
            I9(true);
            if (V()) {
                if (this.T != null && !R()) {
                    this.f13494v0 += r3.x();
                }
                g0();
                e0();
                if (R()) {
                    b0(this.f13496w0);
                    j0();
                } else {
                    j0();
                    b0(this.f13496w0);
                }
            } else {
                if (this.T != null) {
                    this.f13494v0 += r3.x();
                }
                b0(this.f13496w0);
                g0();
                e0();
                j0();
            }
            d0();
            a0(true);
            if (R9()) {
                this.f13494v0 = this.f13482p0 + k2();
                if (this.T != null && !R()) {
                    this.f13494v0 += n2();
                }
                if (t7(true) && (this.f13452b & Log.TAG_CRASH) != 0) {
                    this.f13494v0 += g2();
                    if (i6()) {
                        this.f13494v0 += r4();
                    }
                }
                if (T9()) {
                    this.f13494v0 += c2();
                }
            }
            i0();
            this.O = O0();
            this.f13452b |= 32;
        }
    }

    public final void h1(g1 g1Var, Canvas canvas) {
        int w42 = w4(this.N0.U0());
        h1 parentMessageViewGroup = g1Var.getParentMessageViewGroup();
        if (parentMessageViewGroup != null) {
            parentMessageViewGroup.setSelectableTranslation(w42);
        }
        if (w42 != 0) {
            canvas.save();
            canvas.translate(w42, 0.0f);
        }
        boolean z10 = this.f13477m1 != 0.0f;
        if (z10) {
            canvas.save();
            canvas.translate(this.f13477m1, 0.0f);
        }
        i1(g1Var, canvas, this.f13492u0, this.f13494v0, this.f13496w0);
        if (z10) {
            canvas.restore();
            k1(g1Var, canvas);
        } else if (this.f13479n1 != 0.0f) {
            k1(g1Var, canvas);
        }
        if (R9() && Q9()) {
            Y0(canvas, g1Var);
        }
        if (w42 != 0) {
            canvas.restore();
        }
    }

    public final int h2() {
        return T9() ? f13429g2 + f13430h2 : Y1();
    }

    public int h3() {
        return a0.i(R9() ? 8.0f : 10.0f);
    }

    public final TdApi.Message h4() {
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.Y0;
            if (arrayList == null || arrayList.isEmpty()) {
                return this.f13449a;
            }
            ArrayList<TdApi.Message> arrayList2 = this.Y0;
            return arrayList2.get(arrayList2.size() - 1);
        }
    }

    public boolean h5() {
        return (this.f13452b & Log.TAG_CAMERA) != 0;
    }

    public final boolean h6() {
        if (r6()) {
            return false;
        }
        if (this.f13449a.isPinned) {
            return true;
        }
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.Y0;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<TdApi.Message> it = this.Y0.iterator();
                while (it.hasNext()) {
                    if (it.next().isPinned) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public boolean h7() {
        return false;
    }

    public hj.q h8() {
        return new hj.q().p(this);
    }

    public int h9(long r5, org.drinkless.td.libcore.telegram.TdApi.MessageContent r7) {
        throw new UnsupportedOperationException("Method not decompiled: hd.s4.h9(long, org.drinkless.td.libcore.telegram.TdApi$MessageContent):int");
    }

    public final void i0() {
        TdApi.ReplyMarkup replyMarkup;
        TdApi.Message t12 = t1();
        if (t12 == null || (replyMarkup = t12.replyMarkup) == null || replyMarkup.getConstructor() != -619317658) {
            c4 c4Var = this.U;
            if (c4Var != null) {
                c4Var.h();
                return;
            }
            return;
        }
        if (this.U == null) {
            c4 c4Var2 = new c4(this, true);
            this.U = c4Var2;
            c4Var2.B(this.P0);
        }
        if (!R9() || !O9()) {
            this.U.z(t12.f19946id, (TdApi.ReplyMarkupInlineKeyboard) t12.replyMarkup, a3(), this.f13478n0);
        } else {
            this.U.z(t12.f19946id, (TdApi.ReplyMarkupInlineKeyboard) t12.replyMarkup, E1() - D1(), this.f13478n0 + i2() + j2());
        }
    }

    public void i1(g1 g1Var, Canvas canvas, int i10, int i11, int i12) {
    }

    public final int i2() {
        return T9() ? f13429g2 + f13430h2 : Y1();
    }

    public int i3() {
        return this.D0;
    }

    public final long[] i4(long j10) {
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.Y0;
            if (arrayList == null || arrayList.size() <= 1) {
                return null;
            }
            long[] jArr = new long[this.Y0.size() - 1];
            int i10 = 0;
            Iterator<TdApi.Message> it = this.Y0.iterator();
            while (it.hasNext()) {
                long j11 = it.next().f19946id;
                if (j11 != j10) {
                    jArr[i10] = j11;
                    i10++;
                }
            }
            Arrays.sort(jArr);
            return jArr;
        }
    }

    public boolean i5() {
        return false;
    }

    public final boolean i6() {
        TdApi.MessageForwardInfo messageForwardInfo = this.f13449a.forwardInfo;
        return messageForwardInfo != null && !ib.i.i(messageForwardInfo.publicServiceAnnouncementType) && !this.Q.q();
    }

    public final boolean i7() {
        return !this.f13449a.isOutgoing && (t2.l3(this.f13451a1) || R5());
    }

    public final boolean i8(View view, je.g gVar, je.v0 v0Var, hj.q qVar, v vVar) {
        if (x1()) {
            this.S.g(view, gVar, v0Var, qVar, vVar);
            return true;
        } else if (this.Q.q()) {
            this.O0.hd().v7(Q0(), this.Q.i(), qVar);
            return true;
        } else if (!this.Q.n()) {
            return false;
        } else {
            this.O0.hd().l7(Q0(), this.Q.c(), null, qVar);
            return true;
        }
    }

    public int i9(long j10, int i10, TdApi.ReplyMarkup replyMarkup) {
        boolean z10;
        boolean z11;
        boolean z12;
        synchronized (this) {
            int l52 = l5(j10);
            if (l52 >= 0) {
                z12 = l52 == this.Y0.size() - 1;
                TdApi.Message message = this.Y0.get(l52);
                z11 = message.editDate != 0;
                message.editDate = i10;
                z10 = !ob.e.e0(message.replyMarkup, replyMarkup);
                message.replyMarkup = replyMarkup;
            } else if (l52 == -2) {
                TdApi.Message message2 = this.f13449a;
                z11 = message2.editDate != 0;
                message2.editDate = i10;
                z10 = !ob.e.e0(message2.replyMarkup, replyMarkup);
                this.f13449a.replyMarkup = replyMarkup;
                z12 = true;
            } else {
                z12 = false;
                z11 = false;
                z10 = false;
            }
        }
        if (z12 || z10) {
            if (z12 && !z11 && (R9() || (this.f13452b & Log.TAG_CRASH) != 0)) {
                K6();
            }
            if (z10) {
                i0();
                int G3 = G3();
                this.O = O0();
                return G3() == G3 ? 1 : 2;
            } else if (Y7(j10, i10) || !z11) {
                return 1;
            }
        } else if (Y7(j10, i10)) {
            return 1;
        }
        return 0;
    }

    public final void j0() {
        if (this.T != null) {
            int a32 = V() ? this.f13478n0 : a3();
            if (R()) {
                a32 = ((this.N - a3()) - a0.i(18.0f)) - ((fd.b.f11910g ? f13425c2 : f13424b2) * 2);
            }
            this.T.K(a32);
        }
    }

    public final void j1(View view, Canvas canvas) {
        if (this.f13467h1 == 1.0f) {
            canvas.drawRect(0.0f, v1(), view.getMeasuredWidth(), l1(), y.g(x4(1.0f)));
        } else if (this.f13469i1 != null) {
            canvas.save();
            canvas.clipRect(0, this.f13469i1.f13513a, view.getMeasuredWidth(), l1());
            k kVar = this.f13469i1;
            float f10 = kVar.f13514b;
            float f11 = kVar.f13516d;
            float f12 = this.f13467h1;
            canvas.drawCircle(f10 + (f11 * f12), kVar.f13515c + (kVar.f13517e * f12), kVar.f13518f * f12, y.g(x4(1.0f)));
            canvas.restore();
        }
    }

    public final int j2() {
        return T9() ? f13429g2 + f13430h2 : Y1();
    }

    public final int j3() {
        return ae.j.L(k3());
    }

    public final int j4() {
        return ae.j.L(R9() ? g6() ? R.id.theme_color_bubbleOut_outline : R.id.theme_color_bubbleIn_outline : R.id.theme_color_separator);
    }

    public void j5(boolean z10) {
        y0();
        Z8(1.0f);
        if (z10) {
            Q8();
        }
    }

    public final boolean j6() {
        return this.O0.i7(this.f13449a.chatId);
    }

    public final boolean j7() {
        return false;
    }

    public final void j8() {
        if (this.f13449a.forwardInfo == null) {
            return;
        }
        if (j6()) {
            TdApi.MessageForwardInfo messageForwardInfo = this.f13449a.forwardInfo;
            g8(new ob.d(messageForwardInfo.fromChatId, messageForwardInfo.fromMessageId));
            return;
        }
        hj hd2 = this.O0.hd();
        v4<?> Q0 = Q0();
        long j10 = this.f13449a.forwardInfo.fromChatId;
        TdApi.MessageForwardInfo messageForwardInfo2 = this.f13449a.forwardInfo;
        hd2.r7(Q0, j10, new ob.d(messageForwardInfo2.fromChatId, messageForwardInfo2.fromMessageId), h8());
    }

    public boolean j9(long r3, org.drinkless.td.libcore.telegram.TdApi.MessageInteractionInfo r5) {
        throw new UnsupportedOperationException("Method not decompiled: hd.s4.j9(long, org.drinkless.td.libcore.telegram.TdApi$MessageInteractionInfo):boolean");
    }

    public final void k0() {
        this.P = B1();
        if ((this.f13452b & 32) == 0) {
            return;
        }
        if (R9() || (this.f13452b & Log.TAG_CRASH) != 0) {
            K6();
        }
    }

    public final void k1(View view, Canvas canvas) {
        float f10;
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        Drawable drawable;
        float f11 = this.f13477m1;
        if (f11 == 0.0f) {
            int abs = (int) (Math.abs(this.f13479n1) * 255.0f);
            f10 = Math.signum(this.f13479n1) * view.getMeasuredWidth();
            i10 = ib.d.b(abs, ae.j.g());
            S1.setAlpha(abs);
        } else {
            i10 = ae.j.g();
            S1.setAlpha(255);
            f10 = f11;
        }
        boolean z10 = true;
        if (!R9()) {
            if (R9()) {
                i12 = this.f13482p0;
                i11 = this.f13484q0;
            } else {
                i12 = F3() - f13441s2;
                i11 = l1();
            }
            int i14 = i11 - i12;
            float f12 = i14;
            int i15 = ((int) (f12 * 0.5f)) + i12;
            boolean G22 = w.G2();
            int i16 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i16 <= 0) {
                z10 = false;
            }
            if (G22 != z10) {
                drawable = P2;
                str = R2;
                i13 = M2;
            } else {
                drawable = O2;
                str = S2;
                i13 = N2;
            }
            float f13 = i13;
            Drawable drawable2 = drawable;
            if (i16 > 0) {
                String str2 = str;
                canvas.drawRect(0.0f, i12, f10, i11, y.g(i10));
                float minimumWidth = (f10 - J2) - drawable2.getMinimumWidth();
                int i17 = a0.i(12.0f) + drawable2.getMinimumHeight();
                if (i17 > i14) {
                    canvas.save();
                    float f14 = f12 / i17;
                    canvas.scale(f14, f14, minimumWidth, i15);
                }
                Paint L = y.L(ib.d.a(S1.getAlpha() / 255.0f, ae.j.L(R.id.theme_color_messageSwipeContent)));
                if (G22) {
                    canvas.save();
                    canvas.scale(-1.0f, 1.0f, (drawable2.getMinimumWidth() / 2) + minimumWidth, i15);
                }
                ce.c.b(canvas, drawable2, minimumWidth, i15 - ((int) (drawable2.getMinimumHeight() * 0.5f)), L);
                if (G22) {
                    canvas.restore();
                }
                canvas.drawText(str2, (minimumWidth - K2) - f13, i15 + L2, S1);
                if (i17 > i14) {
                    canvas.restore();
                    return;
                }
                return;
            }
            String str3 = str;
            float measuredWidth = view.getMeasuredWidth();
            float f15 = f10 + measuredWidth;
            canvas.drawRect(f15, i12, measuredWidth, i11, y.g(i10));
            float f16 = J2 + f15;
            int i18 = a0.i(12.0f) + drawable2.getMinimumHeight();
            if (i18 > i14) {
                canvas.save();
                float f17 = f12 / i18;
                canvas.scale(f17, f17, f16, i15);
            }
            Paint L3 = y.L(ib.d.a(S1.getAlpha() / 255.0f, ae.j.L(R.id.theme_color_messageSwipeContent)));
            if (G22) {
                canvas.save();
                canvas.scale(-1.0f, 1.0f, (drawable2.getMinimumWidth() / 2) + f16, i15);
            }
            ce.c.b(canvas, drawable2, f16, (i15 - ((int) (drawable2.getMinimumHeight() * 0.5f))) + a0.i(0.5f), L3);
            if (G22) {
                canvas.restore();
            }
            canvas.drawText(str3, (int) (f15 + J2 + drawable2.getMinimumWidth() + f13), i15 + L2, S1);
            if (i18 > i14) {
                canvas.restore();
            }
        } else if (this.f13477m1 != 0.0f) {
            int i19 = a0.i(42.0f);
            float f18 = this.f13477m1;
            float f19 = f18 > 0.0f ? this.f13483p1 : this.f13481o1;
            float d10 = ib.h.d(Math.abs(f18) / i19) * f19;
            float f20 = (f19 * 0.4f) + 0.6f;
            if (d10 != 0.0f) {
                int i20 = this.f13482p0;
                int i21 = i20 + ((this.f13484q0 - i20) / 2);
                float f21 = this.f13477m1;
                float measuredWidth2 = f21 > 0.0f ? f21 / 2.0f : view.getMeasuredWidth() + (this.f13477m1 / 2.0f);
                float Q = ae.j.Q() * (1.0f - this.N0.r0().Lr().getBackgroundTransparency());
                float i22 = a0.i(16.0f) * f20;
                if (Q > 0.0f) {
                    canvas.drawCircle(measuredWidth2, i21, i22, y.Y(ib.d.a(Q * d10, ae.j.k0()), a0.i(1.0f)));
                }
                float f22 = i21;
                canvas.drawCircle(measuredWidth2, f22, i22, y.g(ib.d.a(d10, U1())));
                boolean G23 = w.G2();
                if (this.f13477m1 <= 0.0f) {
                    z10 = false;
                }
                Drawable drawable3 = G23 != z10 ? P2 : O2;
                Paint L4 = y.L(ib.d.a(d10, W1()));
                canvas.save();
                canvas.scale((w.G2() ? -0.8f : 0.8f) * f20, f20 * 0.8f, measuredWidth2, f22);
                ce.c.b(canvas, drawable3, measuredWidth2 - (drawable3.getMinimumWidth() / 2), i21 - (drawable3.getMinimumHeight() / 2), L4);
                canvas.restore();
            }
        }
    }

    public final int k2() {
        int p22 = p2();
        return p22 != 0 ? p22 : Y1();
    }

    public final int k3() {
        return l3(R.id.theme_color_textLight);
    }

    public final int k4() {
        return R9() ? A2() : f13438p2;
    }

    public final void k5(long j10) {
        this.N0.r0().Pk(new ob.d(this.f13449a.chatId, j10), G9());
    }

    public boolean k6() {
        return this.f13449a.schedulingState != null;
    }

    public boolean k7() {
        return false;
    }

    public final void k8() {
        this.P0.e();
    }

    public void k9(long j10) {
        synchronized (this) {
            int l52 = l5(j10);
            if (l52 >= 0) {
                t2.i5(this.Y0.get(l52));
            } else if (l52 == -2) {
                t2.i5(this.f13449a);
            } else {
                return;
            }
            E9(true);
            X7(j10);
        }
    }

    public final boolean l0() {
        TdApi.Message message = this.f13449a;
        return (message.canBeDeletedOnlyForSelf || message.canBeDeletedForAllUsers) && T();
    }

    public final int l1() {
        return this.O - s3();
    }

    public Path l2() {
        if (S0()) {
            return null;
        }
        return this.E0;
    }

    public final int l3(int i10) {
        return R9() ? g6() ? R.id.theme_color_bubbleOut_time : R.id.theme_color_bubbleIn_time : i10;
    }

    public final int l4() {
        int i10 = 0;
        if (r6()) {
            return 0;
        }
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.Y0;
            if (arrayList == null || arrayList.isEmpty()) {
                return this.f13449a.isPinned ? 1 : 0;
            }
            Iterator<TdApi.Message> it = this.Y0.iterator();
            while (it.hasNext()) {
                if (it.next().isPinned) {
                    i10++;
                }
            }
            return i10;
        }
    }

    public final int l5(long j10) {
        ArrayList<TdApi.Message> arrayList = this.Y0;
        if (arrayList != null) {
            int i10 = 0;
            Iterator<TdApi.Message> it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next().f19946id == j10) {
                    return i10;
                }
                i10++;
            }
        }
        return this.f13449a.f19946id == j10 ? -2 : -1;
    }

    public final boolean l6() {
        return ob.a.j(this.f13449a.chatId);
    }

    public final boolean l7(int i10) {
        return i10 + this.W0 > (S() ? this.f13478n0 : Math.min(this.f13478n0, this.X0));
    }

    public final void l8(final int i10, final int i11) {
        o8(new kb.j() {
            @Override
            public final void a(Object obj) {
                s4.this.G6(i10, i11, (g1) obj);
            }
        });
    }

    public final int l9(long j10, long j11) {
        return a8(j10, j11, G3());
    }

    @Override
    public void m(je.a aVar, boolean z10) {
        if (z10 && ib.c.b(this.f13452b, 32)) {
            if (aVar == this.f13456c0) {
                int Y4 = Y4();
                if (Y4 != 1) {
                    if (Y4 == 2) {
                        e0();
                    }
                } else if (R9() || (this.f13452b & Log.TAG_CRASH) != 0) {
                    K6();
                }
            } else if (((aVar == this.f13458d0 && S2() == 0) || aVar == this.f13460e0 || aVar == this.f13462f0) && (R9() || (this.f13452b & Log.TAG_CRASH) != 0)) {
                K6();
            }
        }
        if (j0.K()) {
            u5();
        } else {
            q8();
        }
    }

    public long m1(float f10, float f11) {
        return 0L;
    }

    public final int m2() {
        return Math.round(Q2() * this.R0.g());
    }

    public final je.k m3() {
        return p8(t.d.D, t.b.f15474k, t.a.f15469f);
    }

    public final int m4() {
        return R9() ? g6() ? R.id.theme_color_bubbleOut_pressed : R.id.theme_color_bubbleIn_pressed : R.id.theme_color_messageSelection;
    }

    public boolean m7() {
        return false;
    }

    public boolean m8(View view, float f10, float f11) {
        boolean z10 = false;
        if (o6()) {
            return false;
        }
        c4 c4Var = this.U;
        boolean y10 = c4Var != null ? c4Var.y(view) : false;
        if (e5()) {
            if (this.f13497w1.A(view) || y10) {
                z10 = true;
            }
            y10 = z10;
        }
        this.U0.b(view, f10, f11);
        return y10;
    }

    public boolean m9(boolean z10) {
        int i10 = this.O;
        if (z10) {
            int i11 = this.f13452b;
            if ((i11 & Log.TAG_EMOJI) == 0) {
                int i12 = i11 | Log.TAG_EMOJI;
                this.f13452b = i12;
                if ((i12 & 32) != 0) {
                    this.O = O0();
                }
            }
        } else {
            int i13 = this.f13452b;
            if ((i13 & Log.TAG_EMOJI) != 0) {
                int i14 = i13 & (-4097);
                this.f13452b = i14;
                if ((i14 & 32) != 0) {
                    this.O = O0();
                }
            }
        }
        return i10 != this.O;
    }

    public boolean n0() {
        TdApi.Message message = this.f13449a;
        return message.canBeForwarded && (message.content.getConstructor() != 303973492 || ((TdApi.MessageLocation) this.f13449a.content).expiresIn == 0) && !X5();
    }

    public final View n1() {
        return this.P0.f();
    }

    public final int n2() {
        return (r3.x() + a0.i(O9() ? 3.0f : 6.0f)) - (T9() ? a0.i(4.0f) : 0);
    }

    public final int n3() {
        return ae.j.L(o3());
    }

    @Override
    public final void n4(int i10, float f10, float f11, eb.k kVar) {
        j jVar;
        if (i10 >= 0) {
            I7(i10, f10, f11);
        } else if (i10 != -5) {
            if (i10 != -4) {
                if (i10 == -3) {
                    long r10 = kVar.r();
                    int q10 = kVar.q();
                    boolean z10 = false;
                    boolean z11 = (q10 & 1) != 0;
                    if (!((q10 & 8) != 0)) {
                        if ((q10 & 2) == 0) {
                            if (!z11 || this.f13467h1 == f10) {
                                z10 = true;
                            }
                            b8(r10, f10, z10);
                        }
                        if (z11) {
                            q9(f10);
                        }
                    }
                    if ((q10 & 4) != 0 && (jVar = (j) kVar.s()) != null) {
                        jVar.w3(f10, kVar);
                    }
                } else if (i10 == -2) {
                    W8(f10);
                } else if (i10 == -1) {
                    Z8(1.0f - f10);
                }
            } else if (this.f13483p1 != f10) {
                this.f13483p1 = f10;
                u5();
            }
        } else if (this.f13481o1 != f10) {
            this.f13481o1 = f10;
            u5();
        }
    }

    public final boolean n6() {
        TdApi.MessageSendingState messageSendingState = this.f13449a.sendingState;
        if (messageSendingState != null && messageSendingState.getConstructor() == -1381803582) {
            vb Qa = this.O0.Qa();
            TdApi.Message message = this.f13449a;
            if (!Qa.c(message.chatId, message.f19946id)) {
                return true;
            }
        }
        return false;
    }

    public final boolean n7() {
        return (this.f13452b & Log.TAG_CRASH) != 0;
    }

    public final void n8(final boolean z10) {
        o8(new kb.j() {
            @Override
            public final void a(Object obj) {
                ((g1) obj).f1(z10);
            }
        });
    }

    public boolean n9(boolean z10) {
        int i10 = this.O;
        if (z10) {
            if (!this.M0) {
                this.M0 = true;
                if ((this.f13452b & 32) != 0) {
                    this.O = O0();
                }
            }
        } else if (this.M0) {
            this.M0 = false;
            if ((this.f13452b & 32) != 0) {
                this.O = O0();
            }
        }
        return i10 != this.O;
    }

    public final boolean o0() {
        if (!m6()) {
            TdApi.Message message = this.f13449a;
            if (message.sendingState == null && !message.isOutgoing && this.O0.F2(message.chatId) && !X5()) {
                return true;
            }
        }
        return false;
    }

    public TdApi.Message o1(long j10) {
        return p1(j10, null);
    }

    public final int o3() {
        return l3(R.id.theme_color_iconLight);
    }

    @Override
    public final void o4(int i10, float f10, eb.k kVar) {
        if (i10 >= 0) {
            H7(i10, f10, kVar);
        }
    }

    public boolean o6() {
        return false;
    }

    public final boolean o7() {
        return this.f13493u1 || (this.f13449a.content.getConstructor() == 0 && ((o7) this.f13449a.content).f13338c);
    }

    public final void o8(kb.j<g1> jVar) {
        Iterator<View> it = this.P0.n().iterator();
        while (it.hasNext()) {
            jVar.a((g1) it.next());
        }
    }

    public final void o9(boolean z10, float f10, boolean z11, boolean z12) {
        eb.k kVar = z10 ? this.f13487r1 : this.f13485q1;
        float f11 = z10 ? this.f13483p1 : this.f13481o1;
        if (z11) {
            if (kVar == null) {
                if (f11 != f10) {
                    kVar = new eb.k(z10 ? -4 : -5, this, db.b.f7287b, 110L, f11);
                    if (z10) {
                        this.f13487r1 = kVar;
                    } else {
                        this.f13485q1 = kVar;
                    }
                } else {
                    return;
                }
            }
            kVar.i(f10);
            return;
        }
        if (kVar != null) {
            kVar.l(f10);
        }
        if (f11 != f10) {
            if (z10) {
                this.f13483p1 = f10;
            } else {
                this.f13481o1 = f10;
            }
            if (z12) {
                u5();
            }
        }
    }

    public boolean p0() {
        return this.f13449a.canBeSaved;
    }

    public TdApi.Message p1(long j10, long[] jArr) {
        if (this.f13449a.f19946id == j10 || (jArr != null && ib.b.j(jArr, j10))) {
            return this.f13449a;
        }
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.Y0;
            if (arrayList != null) {
                Iterator<TdApi.Message> it = arrayList.iterator();
                while (it.hasNext()) {
                    TdApi.Message next = it.next();
                    long j11 = next.f19946id;
                    if (j11 == j10 || (jArr != null && ib.b.j(jArr, j11))) {
                        return next;
                    }
                }
            }
            return null;
        }
    }

    public final int p2() {
        int i10;
        if (f5() && t7(true) && (this.f13452b & Log.TAG_CRASH) != 0) {
            i10 = Math.max(f13429g2, Y1());
        } else if (this.T == null || R()) {
            i10 = 0;
        } else if (S0()) {
            i10 = a0.i(3.0f);
        } else {
            i10 = Math.max(f13429g2, Y1());
        }
        return (i10 != 0 || !T9()) ? i10 : Math.max(f13429g2 + f13430h2, Y1());
    }

    public final Paint p3() {
        return R9() ? g6() ? y.t() : y.s() : y.K();
    }

    public final int p4() {
        return ae.j.L(q4());
    }

    public boolean p7() {
        return false;
    }

    public final je.k p8(t.d dVar, t.b bVar, t.a aVar) {
        return R9() ? g6() ? bVar : aVar : dVar;
    }

    public void p9(long r19, boolean r21, boolean r22, float r23, float r24, hd.s4.j r25) {
        throw new UnsupportedOperationException("Method not decompiled: hd.s4.p9(long, boolean, boolean, float, float, hd.s4$j):void");
    }

    public final boolean q0() {
        return (!d6() || v0()) && (this.f13452b & Log.TAG_TDLIB_FILES) == 0 && !(this instanceof a5) && T() && !o6();
    }

    public TdApi.WebPage q1(String str) {
        return null;
    }

    public final int q2() {
        return this.N0.P0(0, R.id.theme_color_bubble_mediaTime, R.id.theme_color_bubble_mediaTime_noWallpaper, R.id.theme_property_wallpaperOverrideTime);
    }

    public final int q3() {
        int i10 = 0;
        if ((this.f13452b & Log.TAG_CAMERA) == 0) {
            return 0;
        }
        int i11 = f13444v2;
        if (R9()) {
            i10 = a0.i(3.5f);
        }
        return i10 + i11;
    }

    public final int q4() {
        return R9() ? g6() ? R.id.theme_color_bubbleOut_progress : R.id.theme_color_bubbleIn_progress : R.id.theme_color_progress;
    }

    public boolean q6(TdApi.Message message, TdApi.MessageContent messageContent) {
        return message.content.getConstructor() == messageContent.getConstructor();
    }

    public boolean q7() {
        return false;
    }

    public final void q8() {
        this.P0.h();
    }

    public boolean r0() {
        TdApi.Message message = this.f13449a;
        return message.canBeEdited && t2.O(message.content) && T() && a7().Li();
    }

    public final long r1(float f10, float f11) {
        return m1(f10 - w4(this.N0.U0()), f11);
    }

    public final void r5() {
        int i10;
        jb.e eVar;
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.Y0;
            eVar = null;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<TdApi.Message> it = this.Y0.iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    TdApi.Message next = it.next();
                    if (this.N0.l1(next.chatId, next.f19946id, this)) {
                        if (eVar == null) {
                            eVar = new jb.e(this.Y0.size() - i11);
                        }
                        eVar.a(next.f19946id);
                    } else {
                        i11++;
                    }
                }
            }
        }
        if (eVar != null) {
            int l10 = eVar.l();
            for (i10 = 0; i10 < l10; i10++) {
                p9(eVar.f(i10), true, false, -1.0f, -1.0f, null);
            }
            return;
        }
        v2 v2Var = this.N0;
        TdApi.Message message = this.f13449a;
        if (v2Var.l1(message.chatId, message.f19946id, this)) {
            p9(this.f13449a.f19946id, true, false, -1.0f, -1.0f, null);
        }
    }

    public final boolean r6() {
        return ib.c.b(this.f13452b, 8);
    }

    public final boolean r7() {
        TdApi.Message message;
        TdApi.MessageForwardInfo messageForwardInfo;
        if (((this.f13452b & 33554432) != 0 || L5() || j6()) && (messageForwardInfo = (message = this.f13449a).forwardInfo) != null) {
            long j10 = messageForwardInfo.fromChatId;
            if (j10 != 0 && messageForwardInfo.fromMessageId != 0 && j10 != message.chatId) {
                return true;
            }
        }
        return false;
    }

    public final void r8(boolean z10) {
        gb.g gVar;
        this.P0.h();
        if (z10 && (gVar = this.Q0) != null) {
            gVar.h();
        }
    }

    public boolean r9(TdApi.Message message, long j10) {
        TdApi.Message Y3 = Y3(j10);
        if (Y3 == null || Y3.f19946id != j10) {
            return false;
        }
        R0(message, Y3);
        c4 c4Var = this.U;
        if (c4Var != null) {
            c4Var.C(j10, message.f19946id);
        }
        k0();
        M9(j10, message.f19946id, false);
        K9(true);
        return true;
    }

    public final boolean s0() {
        return this.f13449a.canGetViewers;
    }

    public final TdApi.Message s1() {
        TdApi.MessageInteractionInfo messageInteractionInfo;
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.Y0;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<TdApi.Message> it = this.Y0.iterator();
                while (it.hasNext()) {
                    TdApi.Message next = it.next();
                    if (next.canGetMessageThread && (messageInteractionInfo = next.interactionInfo) != null && messageInteractionInfo.replyInfo != null) {
                        return next;
                    }
                }
            }
            TdApi.Message message = this.f13449a;
            if (!message.canGetMessageThread) {
                message = null;
            }
            return message;
        }
    }

    public final int s3() {
        if (this.M0) {
            return a0.i(7.0f);
        }
        int i10 = 0;
        if ((this.f13452b & Log.TAG_EMOJI) == 0) {
            return 0;
        }
        int i11 = a0.i(7.0f);
        if (a7().co()) {
            i10 = a0.i(48.0f);
        }
        return i10 + i11;
    }

    public boolean s6() {
        return (this.f13452b & 1) == 0 || this.f13449a.sendingState != null;
    }

    public final boolean s7() {
        return t7(true);
    }

    public boolean s8() {
        return false;
    }

    public final int s9(org.drinkless.td.libcore.telegram.TdApi.Message r14, long r15) {
        throw new UnsupportedOperationException("Method not decompiled: hd.s4.s9(org.drinkless.td.libcore.telegram.TdApi$Message, long):int");
    }

    @Override
    public final org.thunderdog.challegram.a t() {
        return this.N0.r0().t();
    }

    public boolean t0() {
        TdApi.Message message = this.f13449a;
        return (message.f19946id == 0 || message.chatId == 0 || (this.f13452b & Log.TAG_PAINT) != 0) ? false : true;
    }

    public TdApi.Message t1() {
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.Y0;
            if (arrayList == null || arrayList.isEmpty()) {
                return this.f13449a;
            }
            Iterator<TdApi.Message> it = this.Y0.iterator();
            TdApi.Message message = null;
            while (it.hasNext()) {
                TdApi.Message next = it.next();
                if (next.replyMarkup != null) {
                    if (message != null) {
                        return null;
                    }
                    message = next;
                }
            }
            return message;
        }
    }

    public int t2() {
        return a0.i(8.0f);
    }

    public final String[] t3() {
        HashSet hashSet = new HashSet();
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.Y0;
            if (arrayList == null || arrayList.isEmpty()) {
                TdApi.MessageSendingState messageSendingState = this.f13449a.sendingState;
                if (messageSendingState instanceof TdApi.MessageSendingStateFailed) {
                    TdApi.MessageSendingStateFailed messageSendingStateFailed = (TdApi.MessageSendingStateFailed) messageSendingState;
                    hashSet.add(t2.z5(new TdApi.Error(messageSendingStateFailed.errorCode, messageSendingStateFailed.errorMessage)));
                }
            } else {
                Iterator<TdApi.Message> it = this.Y0.iterator();
                while (it.hasNext()) {
                    TdApi.MessageSendingState messageSendingState2 = it.next().sendingState;
                    if (messageSendingState2 instanceof TdApi.MessageSendingStateFailed) {
                        TdApi.MessageSendingStateFailed messageSendingStateFailed2 = (TdApi.MessageSendingStateFailed) messageSendingState2;
                        hashSet.add(t2.z5(new TdApi.Error(messageSendingStateFailed2.errorCode, messageSendingStateFailed2.errorMessage)));
                    }
                }
            }
        }
        if (hashSet.isEmpty()) {
            return null;
        }
        return (String[]) hashSet.toArray(new String[0]);
    }

    public int t4() {
        return this.f13478n0;
    }

    public void t6(kb.j<TdApi.Message> jVar, boolean z10) {
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.Y0;
            if (arrayList == null || arrayList.isEmpty()) {
                jVar.a(this.f13449a);
            } else if (z10) {
                for (int size = this.Y0.size() - 1; size >= 0; size--) {
                    jVar.a(this.Y0.get(size));
                }
            } else {
                Iterator<TdApi.Message> it = this.Y0.iterator();
                while (it.hasNext()) {
                    jVar.a(it.next());
                }
            }
        }
    }

    public final boolean t7(boolean z10) {
        if (!R9() || (O9() && ((this.f13449a.viaBotUserId != 0 && !T9() && z10) || ((this.f13452b & 33554432) != 0 && !f6())))) {
            return true;
        }
        if (!O9() || R8()) {
            return false;
        }
        if (o6() && R9()) {
            return true;
        }
        if (i6() && x1()) {
            return true;
        }
        if (f6() && this.Q.k()) {
            return true;
        }
        TdApi.Chat chat = this.f13451a1;
        if (chat != null) {
            int constructor = chat.type.getConstructor();
            if (constructor == -1472570774) {
                return !f6() && !((TdApi.ChatTypeSupergroup) this.f13451a1.type).isChannel;
            }
            if (constructor == 973884508) {
                return !f6();
            }
        }
        return !f6() && R5();
    }

    public void t8() {
        if (this.N != 0) {
            C8();
        } else {
            h0(a0.g());
        }
    }

    public void t9(boolean z10) {
        this.f13452b = ib.c.h(this.f13452b, Log.TAG_CAMERA, z10);
        this.f13453b0 = z10 ? new je.e(N1()) : null;
        if (ib.c.b(this.f13452b, 32)) {
            C8();
            K8();
            u5();
        }
    }

    public boolean u0() {
        return t2.Q(this.f13449a) && T();
    }

    public final eb.k u1(long j10) {
        synchronized (this) {
            k0.e<eb.k> eVar = this.f13473k1;
            if (eVar == null) {
                return null;
            }
            return eVar.f(j10);
        }
    }

    public final int u2() {
        if (!R9() || !Q9()) {
            return 0;
        }
        return this.W0;
    }

    public final int u3() {
        return a0.i(22.0f) + this.f13497w1.getHeight() + a0.i(2.0f);
    }

    public int u4() {
        return this.f13476m0;
    }

    public final void u5() {
        this.P0.invalidate();
    }

    public final boolean u8(float f10, float f11) {
        float f12;
        float f13;
        int m10 = this.P0.m();
        View n12 = n1();
        if (m10 == 0 || n12 == null || !this.P0.g() || n12.getParent() == null || n12.getMeasuredHeight() > ((View) n12.getParent()).getMeasuredHeight() * 2.5f) {
            return false;
        }
        int v12 = v1();
        float f14 = (int) (m10 * 0.5f);
        float l12 = ((int) ((l1() - v12) * 0.5f)) + v12;
        if (f10 == -1.0f && f11 == -1.0f) {
            f10 = f14;
            f13 = l12;
        } else {
            f13 = f11;
        }
        float f15 = f14 - f10;
        float f16 = l12 - f13;
        float sqrt = ((float) Math.sqrt((m10 * m10) + (f12 * f12))) * 0.5f;
        k kVar = this.f13469i1;
        if (kVar == null) {
            this.f13469i1 = new k(v12, f10, f13, f15, f16, sqrt);
            return true;
        }
        kVar.f13513a = v12;
        kVar.f13514b = f10;
        kVar.f13515c = f13;
        kVar.f13516d = f15;
        kVar.f13517e = f16;
        kVar.f13518f = sqrt;
        return true;
    }

    public final void u9(Object obj) {
        this.T0 = obj;
    }

    public final boolean v0() {
        throw new UnsupportedOperationException("Method not decompiled: hd.s4.v0():boolean");
    }

    public int v1() {
        return F3() - (((this.f13452b & Log.TAG_CRASH) == 0 || R9()) ? 0 : f13441s2);
    }

    public final int v2() {
        return this.N0.I0(0, R.id.theme_color_bubble_mediaTimeText, R.id.theme_color_bubble_mediaTimeText_noWallpaper, R.id.theme_property_wallpaperOverrideTime);
    }

    public int v3() {
        return a0.i(2.0f);
    }

    public final int v4() {
        return 0;
    }

    public final void v5(int i10, int i11, int i12, int i13) {
        this.P0.d(i10, i11, i12, i13);
    }

    public final boolean v7() {
        TdApi.Chat chat = this.f13451a1;
        if (chat == null || chat.type.getConstructor() != 1579049844) {
            return false;
        }
        long j10 = ((TdApi.ChatTypePrivate) this.f13451a1.type).userId;
        return this.O0.o7(j10) || this.O0.e2().y2(j10);
    }

    public boolean v9(long j10) {
        int i10 = this.f13452b;
        boolean z10 = (i10 & 1) != 0;
        if (this.f13449a.f19946id > j10) {
            this.f13452b = i10 & (-2);
            return z10 && !z7();
        }
        this.f13452b = i10 | 1;
        return !z10 && !z7();
    }

    public boolean w0() {
        return (this.f13452b & 67108864) == 0;
    }

    public final void w1(boolean z10) {
        if (this.f13471j1 != null) {
            int p10 = this.f13473k1.p();
            for (int i10 = 0; i10 < p10; i10++) {
                eb.k q10 = this.f13473k1.q(i10);
                if (q10 != null && q10.p(1)) {
                    q10.A(1, false);
                }
            }
            if (z10) {
                q9(0.0f);
            }
        }
    }

    public float w2() {
        return this.H0;
    }

    public int w3() {
        return a0.i(4.0f);
    }

    public final int w4(float f10) {
        if (!R9() || g6() || i5()) {
            return 0;
        }
        return (int) (a0.i(28.0f) * f10);
    }

    public final void w5(boolean z10) {
        gb.g gVar;
        this.P0.invalidate();
        if (z10 && (gVar = this.Q0) != null) {
            gVar.invalidate();
        }
    }

    public boolean w7() {
        return this.f13456c0 != null && !n6();
    }

    public void w8() {
        if (!X5()) {
            Client v42 = this.O0.v4();
            TdApi.Message message = this.f13449a;
            v42.o(new TdApi.OpenMessageContent(message.chatId, message.f19946id), this.O0.na());
            if (!f6()) {
                E9(true);
            }
        }
    }

    public final boolean x0() {
        return this.f13449a.canGetStatistics;
    }

    public final boolean x1() {
        return this.f13449a.forwardInfo != null && !f6() && (ib.c.b(this.f13452b, 33554432) || L5() || this.f13449a.forwardInfo.origin.getConstructor() == -739561951 || ((i6() && !this.Q.q() && R9()) || j6()));
    }

    public float x2() {
        return this.G0;
    }

    public final int x3() {
        return this.f13494v0 + W2() + w3();
    }

    public int x4(float f10) {
        if (R9()) {
            return ib.d.a(f10, ib.d.d(ae.j.L(R.id.theme_color_bubble_messageSelection), ae.j.L(R.id.theme_color_bubble_messageSelectionNoWallpaper), this.N0.r0().Lr().getBackgroundTransparency()));
        }
        return ib.d.a(f10, ib.d.c(ae.j.L(R.id.theme_color_chatBackground), ae.j.i()));
    }

    public final void x5() {
        o8(new kb.j() {
            @Override
            public final void a(Object obj) {
                s4.this.y6((g1) obj);
            }
        });
    }

    public final boolean x7() {
        return P9() || T9() || this.T != null;
    }

    public final void x8(long j10) {
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.Y0;
            if (arrayList != null) {
                Iterator<TdApi.Message> it = arrayList.iterator();
                while (it.hasNext()) {
                    TdApi.Message next = it.next();
                    if (next.f19946id == j10) {
                        next.containsUnreadMention = false;
                        return;
                    }
                }
            }
            TdApi.Message message = this.f13449a;
            if (message.f19946id == j10) {
                message.containsUnreadMention = false;
            }
        }
    }

    public final boolean x9() {
        boolean z10;
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.Y0;
            z10 = true;
            if (arrayList != null && arrayList.size() > 1) {
                z10 = false;
            }
        }
        return z10;
    }

    public final void y0() {
        eb.k kVar = this.f13475l1;
        if (kVar != null) {
            kVar.k();
            this.f13475l1 = null;
        }
    }

    public final void y1(long j10) {
        jb.e eVar = this.f13471j1;
        if (eVar != null) {
            eVar.j(j10);
            boolean z10 = false;
            w1(false);
            ArrayList<TdApi.Message> arrayList = this.Y0;
            boolean z11 = (arrayList != null ? arrayList.size() : 1) == this.f13471j1.l();
            if (z11 && this.P0.g()) {
                z10 = true;
            }
            int h10 = this.f13473k1.h(j10);
            if (h10 >= 0) {
                eb.k q10 = this.f13473k1.q(h10);
                if (z10) {
                    q10.A(2, true);
                    q10.l(this.f13467h1);
                    q10.i(1.0f);
                } else if (q10.p(4)) {
                    this.f13473k1.n(h10);
                } else {
                    q10.k();
                    this.f13473k1.n(h10);
                }
            }
            if (z11 && !z10) {
                q9(1.0f);
            }
        }
    }

    public final int y3() {
        return Math.max(this.f13501y1, this.f13497w1.getWidth()) + a0.i(10.0f);
    }

    public final float y4(eb.k kVar) {
        if (kVar == null || (kVar.q() & 2) != 0.0f || x9()) {
            return 0.0f;
        }
        return kVar.o();
    }

    public final void y5(final int i10) {
        o8(new kb.j() {
            @Override
            public final void a(Object obj) {
                s4.this.A6(i10, (g1) obj);
            }
        });
    }

    public boolean y7() {
        return false;
    }

    public void y8() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (z8()) {
                K8();
            } else {
                r8(true);
            }
        } else if (z8()) {
            K8();
        } else {
            w5(true);
        }
    }

    public boolean y9(MotionEvent motionEvent) {
        return false;
    }

    public boolean z0() {
        return false;
    }

    public final String z1() {
        if (Q5() && (this.f13452b & 4) == 0) {
            return w.i1(R.string.ChatPreview);
        }
        if (k6()) {
            int constructor = this.f13449a.schedulingState.getConstructor();
            if (constructor == -1485570073) {
                long j10 = ((TdApi.MessageSchedulingStateSendAtDate) this.f13449a.schedulingState).sendDate;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (ib.f.m(j10, timeUnit)) {
                    return w.i1(R.string.ScheduledToday);
                }
                return ib.f.n(j10, timeUnit) ? w.i1(R.string.ScheduledTomorrow) : w.j1(R.string.ScheduledDate, w.o0(j10, timeUnit));
            } else if (constructor == 2092947464) {
                return w.i1(R.string.ScheduledUntilOnline);
            }
        }
        if (X5()) {
            return w.Z0(T2(), TimeUnit.SECONDS);
        }
        if (!ib.c.b(this.f13452b, 16) || !this.N0.j1()) {
            return w.o0(T2(), TimeUnit.SECONDS);
        }
        return w.i1(R.string.DiscussionStart);
    }

    public final int z3() {
        return R9() ? S3() + a0.i(11.0f) : f13436n2;
    }

    public fc z4() {
        return this.Q;
    }

    public final void z5(final long j10, final int i10) {
        o8(new kb.j() {
            @Override
            public final void a(Object obj) {
                s4.this.w6(j10, i10, (g1) obj);
            }
        });
    }

    public boolean z7() {
        return (this.f13452b & Log.TAG_NDK) != 0 || Q5();
    }

    public boolean z8() {
        if ((this.f13452b & 32) != 0) {
            I9(true);
            b0(this.f13496w0);
            a0(false);
            int i10 = this.O;
            int O0 = O0();
            this.O = O0;
            return i10 != O0;
        }
        C8();
        return false;
    }

    public final boolean z9() {
        return !i5() && (V5() || I5()) && this.f13449a.viaBotUserId == 0 && !this.Q.l() && !this.Q.p() && (!R9() ? !f6() || f5() || !A9() : Q9()) && (X4() > 0 || !X5());
    }
}
