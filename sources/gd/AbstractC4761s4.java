package gd;

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
import be.C1357a0;
import be.C1359b;
import be.C1362c;
import be.C1363c0;
import be.C1379j0;
import be.C1389o;
import be.C1392p;
import be.C1410y;
import be.C1411z;
import ge.C4868i;
import ie.AbstractC5408k;
import ie.AbstractC5411l0;
import ie.C5375a;
import ie.C5386e;
import ie.C5402h;
import ie.C5406j;
import ie.C5410l;
import ie.C5417o0;
import ie.C5428t;
import ie.C5455v0;
import ie.C5457w0;
import ie.C5459x0;
import ie.RunnableC5390g;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.drinkmore.Tracer;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p037cb.C2064f;
import p038ce.View$OnClickListenerC2971rh;
import p051db.C3940f;
import p051db.C3950k;
import p051db.C3953l;
import p067ed.C4184b;
import p080fb.C4335b;
import p080fb.C4336c;
import p080fb.C4341g;
import p082fd.C4403w;
import p108hb.C5062b;
import p108hb.C5063c;
import p108hb.C5064d;
import p108hb.C5067f;
import p108hb.C5069h;
import p108hb.C5070i;
import p124ib.C5322e;
import p124ib.C5323f;
import p139jb.AbstractC5918j;
import p143k0.C6035e;
import p154kb.C6227d;
import p156kd.AbstractC6264v;
import p156kd.C6238b;
import p156kd.C6240c;
import p156kd.C6246h;
import p156kd.C6257p;
import p168ld.RunnableC6507m;
import p193nb.C7316a;
import p193nb.C7319d;
import p193nb.C7321e;
import p194nd.C7462l1;
import p225pd.C8112b;
import p291uc.C9552h1;
import p291uc.C9565i1;
import p291uc.C9678w2;
import p291uc.RunnableC9651s3;
import p350yd.AbstractC10664f9;
import p350yd.C10712hc;
import p350yd.C10930q6;
import p350yd.C11115xb;
import p350yd.HandlerC10770jj;
import p364zd.AbstractC11531p;
import p364zd.C11524j;
import p364zd.C11541z;
import td.AbstractC9323v4;
import td.C9357x2;

public abstract class AbstractC4761s4 implements C4341g.AbstractC4342a, AbstractC10664f9, C3950k.AbstractC3952b, Comparable<AbstractC4761s4>, C5375a.AbstractC5378c {
    public static Bitmap f16010A1;
    public static int f16011A2;
    public static Bitmap f16012B1;
    public static int f16013B2;
    public static Bitmap f16014C1;
    public static int f16015C2;
    public static Bitmap f16016D1;
    public static int f16017D2;
    public static Bitmap f16018E1;
    public static int f16019E2;
    public static Bitmap f16020F1;
    public static int f16021F2;
    public static Bitmap f16022G1;
    public static int f16023G2;
    public static Bitmap f16024H1;
    public static int f16025H2;
    public static Paint f16026I1;
    public static int f16027I2;
    public static Paint f16028J1;
    public static int f16029J2;
    public static Paint f16030K1;
    public static int f16031K2;
    public static Paint f16032L1;
    public static int f16033L2;
    public static Bitmap f16034M1;
    public static int f16035M2;
    public static Bitmap f16036N1;
    public static int f16037N2;
    public static Bitmap f16038O1;
    public static Drawable f16039O2;
    public static Bitmap f16040P1;
    public static Drawable f16041P2;
    public static Paint f16042Q1;
    public static Drawable f16043Q2;
    public static HandlerC4768g f16044R1;
    public static String f16045R2;
    public static Paint f16046S1;
    public static String f16047S2;
    public static C5457w0 f16048T1;
    public static boolean f16049T2;
    public static C5457w0 f16050U1;
    public static C5457w0 f16051V1;
    public static C5457w0 f16052W1;
    public static C5457w0 f16053X1;
    public static C5457w0 f16054Y1;
    public static int f16055Z1;
    public static int f16056a2;
    public static int f16057b2;
    public static int f16058c2;
    public static int f16059d2;
    public static int f16060e2;
    public static int f16061f2;
    public static int f16062g2;
    public static int f16063h2;
    public static int f16064i2;
    public static int f16065j2;
    public static int f16066k2;
    public static int f16067l2;
    public static int f16068m2;
    public static int f16069n2;
    public static int f16070o2;
    public static int f16071p2;
    public static int f16072q2;
    public static int f16073r2;
    public static int f16074s2;
    public static int f16075t2;
    public static int f16076u2;
    public static int f16077v2;
    public static int f16078w2;
    public static int f16079x2;
    public static int f16080y2;
    public static int f16081z2;
    public int f16082A0;
    public int f16083B0;
    public int f16084C0;
    public int f16085D0;
    public final Path f16086E0;
    public final Path f16087F0;
    public float f16088G0;
    public float f16089H0;
    public float f16090I0;
    public float f16091J0;
    public final RectF f16092K0;
    public final RectF f16093L0;
    public int f16094M;
    public boolean f16095M0;
    public int f16096N;
    public final C9678w2 f16097N0;
    public int f16098O;
    public final C10930q6 f16099O0;
    public String f16100P;
    public final C4341g f16101P0;
    public final C10712hc f16102Q;
    public final C4341g f16103Q0;
    public final String f16104R;
    public final C3940f f16105R0;
    public AbstractC4705m6 f16106S;
    public final C3940f f16107S0;
    public RunnableC9651s3 f16108T;
    public Object f16109T0;
    public C4602c4 f16110U;
    public String f16112V;
    public RunnableC5390g f16114W;
    public int f16115W0;
    public RunnableC5390g f16116X;
    public int f16117X0;
    public RunnableC5390g f16118Y;
    public ArrayList<TdApi.Message> f16119Y0;
    public C6246h f16120Z;
    public TdApi.ChatAdministrator f16121Z0;
    public TdApi.Message f16122a;
    public C4587b f16123a0;
    public TdApi.Chat f16124a1;
    public int f16125b;
    public C5386e f16126b0;
    public long f16127b1;
    public int f16128c;
    public final C5375a f16129c0;
    public AbstractC4769h f16130c1;
    public final C5375a f16131d0;
    public C6227d<AbstractC4770i> f16132d1;
    public final C5375a f16133e0;
    public boolean f16134e1;
    public final C5375a f16135f0;
    public String f16137g0;
    public float f16138g1;
    public RunnableC5390g f16139h0;
    public float f16140h1;
    public RunnableC5390g f16141i0;
    public C4772k f16142i1;
    public float f16143j0;
    public C5322e f16144j1;
    public int f16145k0;
    public C6035e<C3950k> f16146k1;
    public int f16147l0;
    public C3950k f16148l1;
    public int f16149m0;
    public float f16150m1;
    public int f16151n0;
    public float f16152n1;
    public int f16153o0;
    public float f16154o1;
    public int f16155p0;
    public float f16156p1;
    public int f16157q0;
    public C3950k f16158q1;
    public int f16159r0;
    public C3950k f16160r1;
    public float f16161s0;
    public C3950k f16162s1;
    public float f16163t0;
    public int f16164t1;
    public int f16165u0;
    public boolean f16166u1;
    public int f16167v0;
    public String f16168v1;
    public int f16169w0;
    public C5459x0 f16170w1;
    public int f16171x0;
    public String f16172x1;
    public int f16173y0;
    public int f16174y1;
    public int f16175z0;
    public RunnableC5390g.AbstractC5393c f16176z1;
    public final C4336c f16111U0 = new C4336c(new C4764c());
    public int f16113V0 = 0;
    public float f16136f1 = 0.0f;

    public class C4762a implements C3950k.AbstractC3952b {
        public C4762a() {
        }

        @Override
        public void mo45P5(int i, float f, float f2, C3950k kVar) {
            if (C5063c.m24144b(AbstractC4761s4.this.f16125b, 32) && AbstractC4761s4.this.m26068R9()) {
                int J3 = AbstractC4761s4.this.mo25354J3();
                AbstractC4761s4.this.m25997Z(false);
                if (AbstractC4761s4.this.mo25354J3() != J3) {
                    AbstractC4761s4.this.m26140K8();
                }
            }
            AbstractC4761s4.this.m25791u5();
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
            C3953l.m29526a(this, i, f, kVar);
        }
    }

    public class C4763b implements C3950k.AbstractC3952b {
        public C4763b() {
        }

        @Override
        public void mo45P5(int i, float f, float f2, C3950k kVar) {
            AbstractC4761s4.this.m25791u5();
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
            C3953l.m29526a(this, i, f, kVar);
        }
    }

    public class C4764c implements C4336c.AbstractC4337a {
        public C4764c() {
        }

        @Override
        public boolean mo7429B(float f, float f2) {
            return C4335b.m28258d(this, f, f2);
        }

        @Override
        public void mo7428C(View view, float f, float f2) {
            int i = AbstractC4761s4.this.f16113V0;
            if (i == 1) {
                RunnableC9651s3 s3Var = AbstractC4761s4.this.f16108T;
                if (s3Var != null && s3Var.m7862w()) {
                    AbstractC4761s4 s4Var = AbstractC4761s4.this;
                    TdApi.Message message = s4Var.f16122a;
                    if (message.replyInChatId != message.chatId) {
                        TdApi.Message message2 = AbstractC4761s4.this.f16122a;
                        s4Var.m25926g8(new C7319d(message2.replyInChatId, message2.replyToMessageId));
                    } else {
                        s4Var.m25882l5(message.replyToMessageId);
                    }
                }
            } else if (i == 2) {
                AbstractC4761s4.this.m25906i8(view, null, null, null, ((C9552h1) view).getAvatarReceiver());
            } else if (i == 3) {
                AbstractC4761s4.this.m25926g8(null);
            }
            AbstractC4761s4.this.f16113V0 = 0;
        }

        @Override
        public void mo7427F(View view, float f, float f2) {
            C4335b.m28254h(this, view, f, f2);
        }

        @Override
        public boolean mo7426K4() {
            return C4335b.m28261a(this);
        }

        @Override
        public boolean mo7425W6(float f, float f2) {
            return C4335b.m28259c(this, f, f2);
        }

        @Override
        public void mo7424Z4(View view, float f, float f2) {
            C4335b.m28256f(this, view, f, f2);
        }

        @Override
        public void mo7419f3(View view, float f, float f2) {
            C4335b.m28257e(this, view, f, f2);
        }

        @Override
        public long getLongPressDuration() {
            return C4335b.m28260b(this);
        }

        @Override
        public boolean mo7418n0(View view, float f, float f2) {
            AbstractC4761s4 s4Var = AbstractC4761s4.this;
            s4Var.f16113V0 = s4Var.m26095P2((C9552h1) view, f, f2);
            return AbstractC4761s4.this.f16113V0 != 0;
        }

        @Override
        public void mo7417o2(View view, float f, float f2) {
            C4335b.m28255g(this, view, f, f2);
        }

        @Override
        public void mo7416p(View view, float f, float f2) {
            C4335b.m28253i(this, view, f, f2);
        }

        @Override
        public boolean mo7415z4(View view, float f, float f2) {
            return C4335b.m28251k(this, view, f, f2);
        }

        @Override
        public void mo7414z6(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4) {
            C4335b.m28252j(this, view, motionEvent, f, f2, f3, f4);
        }
    }

    public class C4765d extends C5410l {
        public final int f16180b;

        public C4765d(AbstractC5408k kVar, int i) {
            super(kVar);
            this.f16180b = i;
        }

        @Override
        public int mo7854e(boolean z) {
            if (z) {
                return this.f16180b;
            }
            return 0;
        }

        @Override
        public int mo7852o0(boolean z) {
            return C11524j.m228N(this.f16180b);
        }

        @Override
        public int mo7851p0(boolean z) {
            if (z) {
                return C5064d.m24131a(0.2f, C11524j.m228N(this.f16180b));
            }
            return 0;
        }
    }

    public class C4766e implements C3950k.AbstractC3952b {
        public final float f16182M;
        public final float f16183N;
        public final float f16184O;
        public final View f16185P;
        public final boolean f16187a;
        public final Runnable f16188b;
        public final boolean[] f16189c;

        public C4766e(boolean z, Runnable runnable, boolean[] zArr, float f, float f2, float f3, View view) {
            this.f16187a = z;
            this.f16188b = runnable;
            this.f16189c = zArr;
            this.f16182M = f;
            this.f16183N = f2;
            this.f16184O = f3;
            this.f16185P = view;
        }

        @Override
        public void mo45P5(int i, float f, float f2, C3950k kVar) {
            Runnable runnable;
            if (this.f16187a && f2 >= 0.85f && (runnable = this.f16188b) != null) {
                boolean[] zArr = this.f16189c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    C7389v0.m16743D2(runnable);
                }
            }
            float f3 = 1.0f - f;
            AbstractC4761s4.this.m25848o9(false, this.f16182M * f3, false, true);
            AbstractC4761s4.this.m25848o9(true, this.f16183N * f3, false, true);
            AbstractC4761s4.this.m26169H9(this.f16184O * f3, false);
            View view = this.f16185P;
            if (view instanceof C9565i1) {
                ((C9565i1) view).setSwipeTranslation(AbstractC4761s4.this.f16150m1);
            }
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
            AbstractC4761s4.this.f16125b &= -67108865;
        }
    }

    public class C4767f implements RunnableC5390g.AbstractC5393c {
        public C4767f() {
        }

        @Override
        public boolean mo18245A(String str) {
            return C5402h.m22840i(this, str);
        }

        @Override
        public boolean mo18244H5(String str) {
            return C5402h.m22836m(this, str);
        }

        @Override
        public boolean mo18243I3(String str) {
            return C5402h.m22841h(this, str);
        }

        @Override
        public boolean mo18242M(android.view.View r3, ie.RunnableC5390g r4, ie.C5455v0 r5, java.lang.String r6, boolean r7) {
            throw new UnsupportedOperationException("Method not decompiled: gd.AbstractC4761s4.C4767f.mo18242M(android.view.View, ie.g, ie.v0, java.lang.String, boolean):boolean");
        }

        @Override
        public boolean mo18241P3(long j) {
            return C5402h.m22837l(this, j);
        }

        @Override
        public boolean mo18240S6(View view, String str) {
            return C5402h.m22845d(this, view, str);
        }

        @Override
        public TdApi.WebPage mo18239U2(String str) {
            return AbstractC4761s4.this.mo25816s1(str);
        }

        @Override
        public boolean mo18238V4(String str) {
            return C5402h.m22842g(this, str);
        }

        @Override
        public AbstractC11531p mo18237W4(View view, RunnableC5390g gVar) {
            return C5402h.m22846c(this, view, gVar);
        }

        @Override
        public boolean mo18236f5(String str) {
            return C5402h.m22844e(this, str);
        }

        @Override
        public boolean mo18235g0(View view, String str, boolean z, HandlerC10770jj.C10788q qVar) {
            return C5402h.m22838k(this, view, str, z, qVar);
        }

        @Override
        public boolean mo18234i0(View view, String str, String str2, HandlerC10770jj.C10788q qVar) {
            return C5402h.m22839j(this, view, str, str2, qVar);
        }

        @Override
        public boolean mo18233m2(String str) {
            return AbstractC4761s4.this.mo25919h5(str);
        }
    }

    public static final class HandlerC4768g extends Handler {
        public HandlerC4768g() {
            super(Looper.getMainLooper());
        }

        @Override
        public void handleMessage(Message message) {
            if (message.what == 0) {
                ((AbstractC4761s4) message.obj).m26231C0();
            }
        }
    }

    public interface AbstractC4769h {
        void mo16043a(boolean z);
    }

    public interface AbstractC4770i {
        void mo3330a(AbstractC4761s4 s4Var, long j, long j2, boolean z);
    }

    public interface AbstractC4771j {
        void mo25738R5(boolean z, C3950k kVar);

        void mo25737u0(float f, C3950k kVar);
    }

    public static class C4772k {
        public int f16191a;
        public float f16192b;
        public float f16193c;
        public float f16194d;
        public float f16195e;
        public float f16196f;

        public C4772k(int i, float f, float f2, float f3, float f4, float f5) {
            this.f16191a = i;
            this.f16192b = f;
            this.f16193c = f2;
            this.f16194d = f3;
            this.f16195e = f4;
            this.f16196f = f5;
        }
    }

    public AbstractC4761s4(C9678w2 w2Var, TdApi.Message message) {
        TdApi.User v2;
        TdApi.MessageForwardInfo messageForwardInfo;
        C4762a aVar = new C4762a();
        DecelerateInterpolator decelerateInterpolator = C2057b.f7280b;
        this.f16105R0 = new C3940f(0, aVar, decelerateInterpolator, 200L);
        this.f16107S0 = new C3940f(0, new C4763b(), decelerateInterpolator, 200L);
        if (!f16049T2) {
            synchronized (AbstractC4761s4.class) {
                if (!f16049T2) {
                    m25862n5();
                }
            }
        }
        m25842p5();
        this.f16097N0 = w2Var;
        C10930q6 c = w2Var.m7645r0().mo4348c();
        this.f16099O0 = c;
        this.f16086E0 = new Path();
        this.f16092K0 = new RectF();
        this.f16087F0 = new Path();
        this.f16093L0 = new RectF();
        C4341g gVar = new C4341g();
        this.f16101P0 = gVar;
        gVar.m28233r(this);
        this.f16122a = message;
        TdApi.MessageSender messageSender = message.senderId;
        if (c.m2443g7(message.chatId)) {
            this.f16125b |= 33554432;
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
        C10712hc hcVar = new C10712hc(c, message.chatId, messageSender, w2Var, !message.isOutgoing && m26072R5());
        this.f16102Q = hcVar;
        this.f16135f0 = new C5375a.C5377b().m23016g().m23022a(false).m23019d(this).m23017f(R.drawable.deproko_baseline_pin_14, 14.0f, 0.0f, 1).m23021b();
        float f = 11.0f;
        if (message.isChannelPost || ((messageForwardInfo = message.forwardInfo) != null && (messageForwardInfo.origin.getConstructor() == 1490730723 || C4779t2.m25423t2(message.interactionInfo) > 1 || c.m2784K6(message.forwardInfo.fromChatId) || hcVar.m4203m()))) {
            this.f16129c0 = new C5375a.C5377b().m23016g().m23022a(false).m23013j(m26068R9() ? 11.0f : 12.0f).m23019d(this).m23018e(new AbstractC5408k() {
                @Override
                public int mo7858Q() {
                    return C5406j.m22807d(this);
                }

                @Override
                public long mo7857X0(boolean z) {
                    return C5406j.m22808c(this, z);
                }

                @Override
                public int mo7856b1() {
                    return C5406j.m22805f(this);
                }

                @Override
                public final int mo7855c() {
                    return AbstractC4761s4.this.m26093P4();
                }

                @Override
                public int mo7854e(boolean z) {
                    return C5406j.m22809b(this, z);
                }

                @Override
                public int mo7853g(boolean z) {
                    return C5406j.m22803h(this, z);
                }

                @Override
                public int mo7852o0(boolean z) {
                    return C5406j.m22806e(this, z);
                }

                @Override
                public int mo7851p0(boolean z) {
                    return C5406j.m22810a(this, z);
                }

                @Override
                public int mo7850r0(boolean z) {
                    return C5406j.m22804g(this, z);
                }
            }).m23017f(R.drawable.baseline_visibility_14, 14.0f, 3.0f, 3).m23021b();
        } else {
            this.f16129c0 = null;
        }
        this.f16131d0 = new C5375a.C5377b().m23016g().m23022a(false).m23013j(m26068R9() ? 11.0f : 12.0f).m23019d(this).m23018e(new AbstractC5408k() {
            @Override
            public int mo7858Q() {
                return C5406j.m22807d(this);
            }

            @Override
            public long mo7857X0(boolean z) {
                return C5406j.m22808c(this, z);
            }

            @Override
            public int mo7856b1() {
                return C5406j.m22805f(this);
            }

            @Override
            public final int mo7855c() {
                return AbstractC4761s4.this.m26093P4();
            }

            @Override
            public int mo7854e(boolean z) {
                return C5406j.m22809b(this, z);
            }

            @Override
            public int mo7853g(boolean z) {
                return C5406j.m22803h(this, z);
            }

            @Override
            public int mo7852o0(boolean z) {
                return C5406j.m22806e(this, z);
            }

            @Override
            public int mo7851p0(boolean z) {
                return C5406j.m22810a(this, z);
            }

            @Override
            public int mo7850r0(boolean z) {
                return C5406j.m22804g(this, z);
            }
        }).m23017f(hcVar.m4203m() ? R.drawable.templarian_baseline_comment_12 : R.drawable.baseline_updirectory_arrow_left_14, 12.0f, 3.0f, 3).m23021b();
        this.f16133e0 = new C5375a.C5377b().m23016g().m23022a(false).m23013j(!m26068R9() ? 12.0f : f).m23019d(this).m23018e(new AbstractC5408k() {
            @Override
            public int mo7858Q() {
                return C5406j.m22807d(this);
            }

            @Override
            public long mo7857X0(boolean z) {
                return C5406j.m22808c(this, z);
            }

            @Override
            public int mo7856b1() {
                return C5406j.m22805f(this);
            }

            @Override
            public final int mo7855c() {
                return AbstractC4761s4.this.m26093P4();
            }

            @Override
            public int mo7854e(boolean z) {
                return C5406j.m22809b(this, z);
            }

            @Override
            public int mo7853g(boolean z) {
                return C5406j.m22803h(this, z);
            }

            @Override
            public int mo7852o0(boolean z) {
                return C5406j.m22806e(this, z);
            }

            @Override
            public int mo7851p0(boolean z) {
                return C5406j.m22810a(this, z);
            }

            @Override
            public int mo7850r0(boolean z) {
                return C5406j.m22804g(this, z);
            }
        }).m23017f(R.drawable.baseline_share_arrow_14, 14.0f, 3.0f, 3).m23021b();
        m26139K9(false);
        this.f16100P = m26208E1();
        if (message.viaBotUserId != 0) {
            if (c.m2480e2().m1583v2(message.viaBotUserId) != null) {
                this.f16104R = "@" + v2.username;
            } else {
                this.f16104R = null;
            }
        } else {
            this.f16104R = null;
        }
        if (mo25749y7()) {
            C4341g gVar2 = new C4341g();
            this.f16103Q0 = gVar2;
            gVar2.m28233r(this);
        } else {
            this.f16103Q0 = null;
        }
        if (m26046T9() || m26250A1()) {
            m26132L6();
        }
        long j = message.replyToMessageId;
        if (j != 0) {
            long j2 = message.messageThreadId;
            if (!(j == j2 && j2 == m25981a7().m32266qk())) {
                m26123M6();
            }
        }
        if (m25975b6() && mo25840p7() && message.ttlExpiresIn < message.ttl) {
            m26200E9(false);
        }
    }

    public static int m26249A2(C9678w2 w2Var) {
        return w2Var.m7766P0(0, R.id.theme_color_bubble_overlay, R.id.theme_color_bubble_overlay_noWallpaper, R.id.theme_property_wallpaperOverrideOverlay);
    }

    public void m26245A6(int i, C9552h1 h1Var) {
        TdApi.Message message = this.f16122a;
        h1Var.m8345T(message.chatId, message.f25406id, i);
    }

    public static <T> T m26244A7(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("TDLib bug");
    }

    public static int m26239B2(C9678w2 w2Var) {
        return w2Var.m7794I0(0, R.id.theme_color_bubble_overlayText, R.id.theme_color_bubble_overlayText_noWallpaper, R.id.theme_property_wallpaperOverrideOverlay);
    }

    public void m26235B6(C9552h1 h1Var) {
        TdApi.Message message = this.f16122a;
        h1Var.m8341b0(message.chatId, message.f25406id);
    }

    public void m26225C6(C9552h1 h1Var) {
        TdApi.Message message = this.f16122a;
        h1Var.m8337e0(message.chatId, message.f25406id);
    }

    public static int m26217D3() {
        return C1357a0.m37541i(26.0f);
    }

    public static C5457w0 m26216D4() {
        if (f16052W1 == null) {
            f16052W1 = new C5457w0(C1389o.m37245x()).m22653o(-1.0f).m22655m(C4868i.m24726c2().m24592t0()).m22656l(true);
            C4868i.m24726c2().m24665k(f16052W1);
        }
        return f16052W1;
    }

    public Object m26214D6(boolean z, long j, CharSequence charSequence, int i, int i2, int i3, boolean z2) {
        return new C5417o0(m26096P0(), this.f16099O0, charSequence.toString(), i, i2, 1024 | ((i3 == 1 || z) ? 1 : 0), m25916h8()).m22793B(i3 == 1 ? Long.valueOf(j) : null);
    }

    public static C5457w0 m26211D9() {
        if (f16050U1 == null) {
            f16050U1 = new C5457w0(C1389o.m37245x()).m22655m(15.0f);
        }
        return f16050U1;
    }

    public Object m26193F6(long j, CharSequence charSequence, int i, int i2, int i3, boolean z) {
        return new C5417o0(m26096P0(), this.f16099O0, charSequence.toString(), i, i2, 1025, m25916h8()).m22793B(Long.valueOf(j));
    }

    public void m26182G6(int i, int i2, C9552h1 h1Var) {
        mo4347s().m14477j2(h1Var, i, i2);
    }

    public static HandlerC4768g m26135L3() {
        if (f16044R1 == null) {
            synchronized (HandlerC4768g.class) {
                if (f16044R1 == null) {
                    f16044R1 = new HandlerC4768g();
                }
            }
        }
        return f16044R1;
    }

    public static C5457w0 m26125M4() {
        if (f16048T1 == null) {
            f16048T1 = new C5457w0(C1389o.m37245x()).m22655m(C4868i.m24726c2().m24592t0()).m22656l(true);
            C4868i.m24726c2().m24665k(f16048T1);
        }
        return f16048T1;
    }

    private void m26120M9(long j, long j2, boolean z) {
        mo25990Z7(j, j2, z);
        C6227d<AbstractC4770i> dVar = this.f16132d1;
        if (dVar != null) {
            Iterator<AbstractC4770i> it = dVar.iterator();
            while (it.hasNext()) {
                it.next().mo3330a(this, j, j2, z);
            }
        }
    }

    public static TextPaint m26112N6() {
        return C1410y.m37048b0(12.0f);
    }

    public static TextPaint m26101O6(boolean z) {
        TextPaint b0 = C1410y.m37048b0(12.0f);
        if (z) {
            b0.setColor(C11524j.m228N(R.id.theme_color_textLight));
        }
        return b0;
    }

    public static void m26099O8() {
        f16049T2 = false;
    }

    public static TextPaint m26092P6() {
        return C1410y.m37048b0(11.0f);
    }

    public static String m26087Q1() {
        return C4403w.m27869i1(R.string.NewMessages);
    }

    public static C5457w0 m26084Q4() {
        if (f16054Y1 == null) {
            f16054Y1 = new C5457w0(C1389o.m37245x()).m22655m(11.0f);
        }
        return f16054Y1;
    }

    public static void m26077R0(TdApi.Message message, TdApi.Message message2) {
        message2.f25406id = message.f25406id;
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

    public static C5457w0 m26076R1() {
        if (f16051V1 == null) {
            f16051V1 = new C5457w0(C1389o.m37245x()).m22653o(1.0f).m22655m(C4868i.m24726c2().m24592t0()).m22656l(true);
            C4868i.m24726c2().m24665k(f16051V1);
        }
        return f16051V1;
    }

    public static void m26026W(StringBuilder sb2, int i, int i2, String str, String str2, boolean z) {
        if (!C5070i.m24067c(str, str2)) {
            sb2.append('\n');
            if (C5070i.m24061i(str)) {
                sb2.append("+ ");
                sb2.append(C4403w.m27865j1(i, str2));
            } else if (C5070i.m24061i(str2)) {
                sb2.append("- ");
                sb2.append(C4403w.m27865j1(i, str));
            } else {
                sb2.append("+ ");
                sb2.append(C4403w.m27865j1(i2, str, str2));
            }
        } else if (z && !C5070i.m24061i(str2)) {
            sb2.append(C4403w.m27865j1(i, str2));
        }
    }

    public static gd.AbstractC4761s4 m26018W9(p291uc.C9678w2 r23, org.drinkless.p210td.libcore.telegram.TdApi.Message r24) {
        throw new UnsupportedOperationException("Method not decompiled: gd.AbstractC4761s4.m26018W9(uc.w2, org.drinkless.td.libcore.telegram.TdApi$Message):gd.s4");
    }

    public static void m26017X(StringBuilder sb2, int i, boolean z, boolean z2, boolean z3) {
        if (z != z2) {
            sb2.append('\n');
            sb2.append(z2 ? '+' : '-');
            sb2.append(' ');
            sb2.append(C4403w.m27869i1(i));
        } else if (z3 && z2) {
            sb2.append('\n');
            sb2.append(C4403w.m27869i1(i));
            if (!z2) {
                sb2.append(" (-)");
            }
        }
    }

    public static AbstractC4761s4 m26008X9(C9678w2 w2Var, TdApi.Message message, TdApi.Chat chat, C6035e<TdApi.ChatAdministrator> eVar) {
        return m25998Y9(w2Var, message, chat, (message.senderId.getConstructor() != -336109341 || eVar == null) ? null : eVar.m21505f(((TdApi.MessageSenderUser) message.senderId).userId));
    }

    public static int m26005Y2() {
        return f16066k2;
    }

    public static AbstractC4761s4 m25998Y9(C9678w2 w2Var, TdApi.Message message, TdApi.Chat chat, TdApi.ChatAdministrator chatAdministrator) {
        AbstractC4761s4 W9 = m26018W9(w2Var, message);
        if (chat != null) {
            W9.m26037U8(chat);
        }
        if (chatAdministrator != null) {
            W9.m26047T8(chatAdministrator);
        }
        W9.m25820r5();
        return W9;
    }

    public static AbstractC4761s4 m25988Z9(C9678w2 w2Var, TdApi.Message message, Throwable th) {
        TdApi.TextEntity[] textEntityArr;
        TdApi.Supergroup Y3;
        String i1 = C4403w.m27869i1(R.string.FailureMessageText);
        TdApi.Object e = Client.m14793e(new TdApi.GetTextEntities(i1));
        TdApi.TextEntity[] textEntityArr2 = (e == null || e.getConstructor() != -933199172) ? null : ((TdApi.TextEntities) e).entities;
        TdApi.TextEntity textEntity = new TdApi.TextEntity(-1, -1, new TdApi.TextEntityTypePreCode());
        if (textEntityArr2 == null || textEntityArr2.length <= 0) {
            textEntityArr = new TdApi.TextEntity[]{textEntity};
        } else {
            textEntityArr = new TdApi.TextEntity[textEntityArr2.length + 1];
            System.arraycopy(textEntityArr2, 0, textEntityArr, 0, textEntityArr2.length);
            textEntityArr[textEntityArr2.length] = textEntity;
        }
        StringBuilder sb2 = new StringBuilder(i1);
        sb2.append("\n\n");
        textEntity.offset = sb2.length();
        sb2.append(C4403w.m27869i1(R.string.AppName));
        sb2.append(' ');
        sb2.append("0.24.6.1506-arm64-v8a");
        sb2.append("\n");
        sb2.append("Type: ");
        TdApi.MessageContent messageContent = message.content;
        sb2.append(messageContent != null ? messageContent.getClass().getSimpleName() : "NULL");
        sb2.append("\n");
        sb2.append("Android: ");
        sb2.append(C2064f.m35725a());
        sb2.append(" (");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(")\n");
        sb2.append("Screen: ");
        sb2.append(C1357a0.m37551D());
        sb2.append("x");
        sb2.append(C1357a0.m37553B());
        sb2.append("x");
        sb2.append(C1357a0.m37542h());
        sb2.append("\n");
        C10930q6 c = w2Var.m7645r0().mo4348c();
        TdApi.Chat U2 = c.m2632U2(message.chatId);
        if (U2 == null) {
            sb2.append("FROM UNKNOWN CHAT #");
            sb2.append(message.chatId);
            sb2.append("\n");
        } else if (U2.type.getConstructor() == -1472570774 && (Y3 = c.m2571Y3(message.chatId)) != null && !C5070i.m24061i(Y3.username)) {
            sb2.append("Public post: t.me/");
            sb2.append(Y3.username);
            sb2.append('/');
            sb2.append(message.f25406id >> 20);
            sb2.append("\n");
        }
        sb2.append("\n");
        Log.toStringBuilder(th, sb2);
        textEntity.length = sb2.length() - textEntity.offset;
        C4656h6 h6Var = new C4656h6(w2Var, message, new TdApi.FormattedText(sb2.toString(), textEntityArr));
        h6Var.m26108O(1610612736);
        return h6Var;
    }

    public static void m25951e1(Canvas canvas, AbstractC4761s4 s4Var, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        if (f != 0.0f) {
            Paint D0 = C1410y.m37077D0(C5064d.m24131a(f, s4Var.m25985a3()));
            float f10 = (-D0.getStrokeWidth()) / 2.0f;
            float f11 = f2 + f10;
            float f12 = f3 + f10;
            float f13 = f4 - f10;
            float f14 = f5 - f10;
            RectF a0 = C1410y.m37050a0();
            if (f6 > 0.0f) {
                float f15 = f11 + f6;
                float f16 = f12 + f6;
                float f17 = f6 + 0.0f;
                a0.set(f15 - f17, f16 - f17, f15 + f17, f16 + f17);
                canvas.drawArc(a0, 180.0f, 90.0f, false, D0);
            }
            if (f7 > 0.0f) {
                float f18 = f13 - f7;
                float f19 = f12 + f7;
                float f20 = f7 + 0.0f;
                a0.set(f18 - f20, f19 - f20, f18 + f20, f19 + f20);
                canvas.drawArc(a0, 270.0f, 90.0f, false, D0);
            }
            if (f9 > 0.0f) {
                float f21 = f11 + f9;
                float f22 = f14 - f9;
                float f23 = f9 + 0.0f;
                a0.set(f21 - f23, f22 - f23, f21 + f23, f22 + f23);
                canvas.drawArc(a0, 90.0f, 90.0f, false, D0);
            }
            if (f8 > 0.0f) {
                float f24 = f13 - f8;
                float f25 = f14 - f8;
                float f26 = f8 + 0.0f;
                a0.set(f24 - f26, f25 - f26, f24 + f26, f25 + f26);
                canvas.drawArc(a0, 0.0f, 90.0f, false, D0);
            }
        }
    }

    public static int m25940f2() {
        return m25912i2();
    }

    public static C5457w0 m25920h4() {
        if (f16053X1 == null) {
            f16053X1 = new C5457w0(C1389o.m37245x()).m22655m(15.0f);
        }
        return f16053X1;
    }

    public static int m25912i2() {
        return C1357a0.m37541i(24.0f);
    }

    public static int m25901j3(boolean z) {
        return z ? f16075t2 - (C1357a0.m37541i(3.0f) * 2) : f16075t2;
    }

    public static void m25862n5() {
        try {
            m25831q5();
            m25842p5();
            m25812s5();
            m25802t5();
            f16049T2 = true;
        } catch (Throwable th) {
            Tracer.m14774f(th);
        }
    }

    private boolean m25861n6() {
        TdApi.Chat chat = this.f16124a1;
        return chat != null && chat.type.getConstructor() == 1579049844 && this.f16099O0.m2379k7(((TdApi.ChatTypePrivate) this.f16124a1.type).userId);
    }

    public static void m25852o5() {
        Resources B = C1379j0.m37372B();
        f16012B1 = BitmapFactory.decodeResource(B, R.drawable.corner_small_up_left_w);
        f16010A1 = BitmapFactory.decodeResource(B, R.drawable.corner_big_up_left_w);
        f16016D1 = BitmapFactory.decodeResource(B, R.drawable.corner_small_up_right_w);
        f16014C1 = BitmapFactory.decodeResource(B, R.drawable.corner_big_up_right_w);
        f16020F1 = BitmapFactory.decodeResource(B, R.drawable.corner_small_down_left_w);
        f16018E1 = BitmapFactory.decodeResource(B, R.drawable.corner_big_down_left_w);
        f16024H1 = BitmapFactory.decodeResource(B, R.drawable.corner_small_down_right_w);
        f16022G1 = BitmapFactory.decodeResource(B, R.drawable.corner_big_down_right_w);
        f16036N1 = BitmapFactory.decodeResource(B, R.drawable.msg_top_w);
        Paint paint = new Paint(5);
        f16026I1 = paint;
        paint.setShader(new BitmapShader(f16036N1, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
        f16040P1 = BitmapFactory.decodeResource(B, R.drawable.msg_down_w);
        Paint paint2 = new Paint(5);
        f16028J1 = paint2;
        paint2.setShader(new BitmapShader(f16040P1, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
        f16034M1 = BitmapFactory.decodeResource(B, R.drawable.msg_left_w);
        Paint paint3 = new Paint(5);
        f16030K1 = paint3;
        paint3.setShader(new BitmapShader(f16034M1, Shader.TileMode.CLAMP, Shader.TileMode.REPEAT));
        f16038O1 = BitmapFactory.decodeResource(B, R.drawable.msg_right_w);
        Paint paint4 = new Paint(5);
        f16032L1 = paint4;
        paint4.setShader(new BitmapShader(f16038O1, Shader.TileMode.CLAMP, Shader.TileMode.REPEAT));
        f16042Q1 = new Paint(5);
    }

    public static void m25842p5() {
        if (f16046S1 == null) {
            Paint paint = new Paint(7);
            f16046S1 = paint;
            paint.setColor(C11524j.m181h());
            C11541z.m24e(f16046S1, R.id.theme_color_messageSwipeContent);
            f16046S1.setTypeface(C1389o.m37258k());
            f16046S1.setTextSize(C1357a0.m37541i(16.0f));
        }
    }

    public static void m25831q5() {
        Resources B = C1379j0.m37372B();
        f16043Q2 = C1362c.m37482g(B, R.drawable.baseline_keyboard_arrow_down_20);
        f16039O2 = C1362c.m37482g(B, R.drawable.baseline_reply_24);
        f16041P2 = C1362c.m37482g(B, R.drawable.baseline_forward_24);
        m25852o5();
    }

    public static boolean m25830q6(int i) {
        switch (i) {
            case R.string.SwipeReply:
            case R.string.SwipeShare:
                return true;
            default:
                return false;
        }
    }

    private void m25827q9(float f) {
        if (this.f16140h1 != f) {
            this.f16140h1 = f;
            m26194F5(false);
        }
    }

    public static int m25813s4() {
        return C1357a0.m37541i(20.0f);
    }

    public static void m25812s5() {
        f16056a2 = C1357a0.m37541i(15.0f);
        f16074s2 = C1357a0.m37541i(4.5f);
        f16075t2 = C1357a0.m37541i(40.0f);
        f16076u2 = C1357a0.m37541i(26.0f);
        f16062g2 = C1357a0.m37541i(8.0f);
        f16063h2 = C1357a0.m37541i(2.0f);
        f16064i2 = C1357a0.m37541i(18.0f);
        f16057b2 = C1357a0.m37541i(8.0f);
        f16058c2 = C1357a0.m37541i(9.0f);
        f16065j2 = C1357a0.m37541i(6.0f);
        f16059d2 = C1357a0.m37541i(3.0f);
        f16060e2 = C1357a0.m37541i(1.5f);
        f16061f2 = C1357a0.m37541i(22.0f);
        f16081z2 = C1357a0.m37541i(9.0f);
        int i = C1357a0.m37541i(20.5f);
        f16080y2 = i;
        f16011A2 = f16081z2 + i;
        f16013B2 = C1357a0.m37541i(27.0f);
        f16015C2 = C1357a0.m37541i(14.0f);
        f16017D2 = C1357a0.m37541i(14.0f);
        f16067l2 = C1357a0.m37541i(25.0f);
        f16019E2 = C1357a0.m37541i(8.0f);
        f16023G2 = C1357a0.m37541i(2.5f);
        f16021F2 = C1357a0.m37541i(3.0f);
        f16025H2 = C1357a0.m37541i(5.0f);
        f16055Z1 = C1357a0.m37541i(20.0f);
        f16066k2 = f16081z2 + (f16080y2 * 2) + C1357a0.m37541i(10.0f);
        f16068m2 = C1357a0.m37541i(12.0f);
        f16070o2 = C1357a0.m37541i(7.5f);
        f16071p2 = C1357a0.m37541i(7.5f);
        f16072q2 = C1357a0.m37541i(35.0f);
        f16073r2 = C1357a0.m37541i(10.0f);
        f16069n2 = f16066k2 + C1357a0.m37541i(11.0f);
        f16078w2 = C1357a0.m37541i(18.0f);
        f16077v2 = C1357a0.m37541i(26.0f);
        f16079x2 = C1357a0.m37541i(4.0f);
        f16027I2 = C1357a0.m37541i(124.0f);
        f16029J2 = C1357a0.m37541i(19.0f);
        f16031K2 = C1357a0.m37541i(22.0f);
        f16033L2 = C1357a0.m37541i(5.5f);
    }

    public static void m25802t5() {
        if (f16046S1 != null) {
            f16045R2 = C4403w.m27869i1(R.string.SwipeShare);
            String i1 = C4403w.m27869i1(R.string.SwipeReply);
            f16047S2 = i1;
            f16037N2 = (int) C7389v0.m16680T1(i1, f16046S1);
            f16035M2 = (int) C7389v0.m16680T1(f16045R2, f16046S1);
        }
    }

    public static int m25794u2() {
        return C1357a0.m37541i(16.0f);
    }

    public static int m25793u3() {
        return (C1357a0.m37553B() - f16072q2) - f16066k2;
    }

    public void m25780v6(C9357x2.AbstractC9363f fVar, View view, Rect rect) {
        fVar.mo8098f1(view, rect);
        rect.offset(m25959d3(), m25949e3());
    }

    public static void m25778v8(int i, int i2) {
        if (i != 0) {
            if (i != 2) {
                return;
            }
            if (i2 != 0 && !m25830q6(i2)) {
                return;
            }
        }
        m25802t5();
    }

    public static void m25770w6(SparseIntArray sparseIntArray, TdApi.Message message) {
        int i;
        switch (message.content.getConstructor()) {
            case TdApi.MessagePhoto.CONSTRUCTOR:
            case TdApi.MessageAnimation.CONSTRUCTOR:
            case TdApi.MessageVideo.CONSTRUCTOR:
                i = 2;
                break;
            case TdApi.MessageAudio.CONSTRUCTOR:
                i = 3;
                break;
            case TdApi.MessageDocument.CONSTRUCTOR:
                i = 4;
                break;
            default:
                i = 1;
                break;
        }
        C5062b.m24155q(sparseIntArray, i);
    }

    private void m25768w9(boolean z) {
        int i = this.f16125b;
        if (z != ((i & Log.TAG_ACCOUNTS) != 0)) {
            this.f16125b = C5063c.m24138h(i, Log.TAG_ACCOUNTS, z);
            mo26091P7(z);
            if (z) {
                this.f16097N0.m7605z3();
            }
        }
    }

    public void m25760x6(long j, int i, C9552h1 h1Var) {
        h1Var.m8345T(this.f16122a.chatId, j, i);
    }

    public void m25750y6(C9552h1 h1Var) {
        TdApi.Message message = this.f16122a;
        h1Var.m8345T(message.chatId, message.f25406id, -1);
    }

    public final int m26251A0() {
        return m26068R9() ? (int) this.f16092K0.centerY() : m25949e3() + (mo25222X2() / 2);
    }

    public final boolean m26250A1() {
        return this.f16122a.forwardInfo != null && !m25928g6() && (C5063c.m24144b(this.f16125b, 33554432) || m26124M5() || this.f16122a.forwardInfo.origin.getConstructor() == -739561951 || ((m25899j6() && !this.f16102Q.m4199q() && m26068R9()) || m25890k6()));
    }

    public final int m26248A3() {
        return this.f16167v0 + mo25222X2() + mo25743z3();
    }

    public C10712hc m26247A4() {
        return this.f16102Q;
    }

    public final void m26246A5(final long j, final int i) {
        m25849o8(new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                AbstractC4761s4.this.m25760x6(j, i, (C9552h1) obj);
            }
        });
    }

    public boolean m26243A8() {
        if ((this.f16125b & 32) == 0) {
            return m25740z8();
        }
        m26159I9(true);
        m25997Z(false);
        int i = this.f16098O;
        int N0 = m26118N0();
        this.f16098O = N0;
        return i != N0;
    }

    public final boolean m26242A9() {
        return !mo25351j5() && !m26133L5() && !C4779t2.m25610R2(this.f16122a) && ((m25860n7() && m25928g6()) || (this.f16125b & Log.TAG_GIF_LOADER) != 0) && ((m26068R9() || !m25741z7() || m25860n7()) && !m25992Z5());
    }

    public final void m26241B0() {
        if (m26068R9()) {
            m25997Z(false);
        }
    }

    public final void m26240B1(long j) {
        C5322e eVar = this.f16144j1;
        if (eVar != null) {
            eVar.m23266j(j);
            boolean z = false;
            m25755y1(false);
            ArrayList<TdApi.Message> arrayList = this.f16119Y0;
            boolean z2 = (arrayList != null ? arrayList.size() : 1) == this.f16144j1.m23264l();
            if (z2 && this.f16101P0.mo28225g()) {
                z = true;
            }
            int h = this.f16146k1.m21503h(j);
            if (h >= 0) {
                C3950k q = this.f16146k1.m21495q(h);
                if (z) {
                    q.m29558A(2, true);
                    q.m29541l(this.f16140h1);
                    q.m29544i(1.0f);
                } else if (q.m29537p(4)) {
                    this.f16146k1.m21498n(h);
                } else {
                    q.m29542k();
                    this.f16146k1.m21498n(h);
                }
            }
            if (z2 && !z) {
                m25827q9(1.0f);
            }
        }
    }

    public final int m26238B3() {
        return Math.max(this.f16174y1, this.f16170w1.getWidth()) + C1357a0.m37541i(10.0f);
    }

    public final int m26237B4() {
        return C11524j.m228N(m26227C4());
    }

    public final void m26236B5() {
        C4341g gVar = this.f16103Q0;
        if (gVar != null) {
            gVar.invalidate();
        }
    }

    public void m26234B7(View view, Runnable runnable, boolean z) {
        if (this.f16150m1 != 0.0f) {
            if (runnable != null) {
                int i = this.f16125b;
                if ((268435456 & i) == 0 && (i & 134217728) == 0) {
                    m25978aa();
                }
            }
            if (!z) {
                C7389v0.m16743D2(runnable);
            }
            C3950k kVar = this.f16160r1;
            if (kVar != null) {
                kVar.m29542k();
            }
            C3950k kVar2 = this.f16158q1;
            if (kVar2 != null) {
                kVar2.m29542k();
            }
            boolean[] zArr = (!z || runnable == null) ? null : new boolean[1];
            float f = this.f16150m1;
            float f2 = this.f16154o1;
            float f3 = this.f16156p1;
            this.f16125b |= 67108864;
            new C3950k(0, new C4766e(z, runnable, zArr, f2, f3, f, view), C2057b.f7280b, 180L).m29544i(1.0f);
        }
    }

    public void m26233B8() {
        if ((this.f16125b & 32) == 0) {
            return;
        }
        if (!m26068R9() || !m26045U()) {
            m25962d0();
        } else {
            m26223C8();
        }
    }

    public C9357x2.C9370l m26232B9(View view, C9357x2.AbstractC9363f fVar, int i) {
        return m26222C9(view, fVar, new TdApi.FormattedText(C4403w.m27869i1(i), null));
    }

    public final void m26231C0() {
        long currentTimeMillis = System.currentTimeMillis();
        TdApi.Message message = this.f16122a;
        double d = message.ttlExpiresIn;
        this.f16127b1 = currentTimeMillis;
        message.ttlExpiresIn = Math.max(0.0d, d - ((currentTimeMillis - this.f16127b1) / 1000.0d));
        boolean z = Math.round(d) != Math.round(this.f16122a.ttlExpiresIn);
        mo26111N7(z);
        AbstractC4769h hVar = this.f16130c1;
        if (hVar != null) {
            hVar.mo16043a(z);
        }
        if (mo25840p7() && this.f16127b1 != 0 && this.f16122a.ttlExpiresIn > 0.0d) {
            HandlerC4768g L3 = m26135L3();
            L3.sendMessageDelayed(Message.obtain(L3, 0, this), 18L);
        }
    }

    public final String m26230C1() {
        if (m26072R5() && (this.f16125b & 4) == 0) {
            return C4403w.m27869i1(R.string.ChatPreview);
        }
        if (m25881l6()) {
            int constructor = this.f16122a.schedulingState.getConstructor();
            if (constructor == -1485570073) {
                long j = ((TdApi.MessageSchedulingStateSendAtDate) this.f16122a.schedulingState).sendDate;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (C5067f.m24107m(j, timeUnit)) {
                    return C4403w.m27869i1(R.string.ScheduledToday);
                }
                return C5067f.m24106n(j, timeUnit) ? C4403w.m27869i1(R.string.ScheduledTomorrow) : C4403w.m27865j1(R.string.ScheduledDate, C4403w.m27846o0(j, timeUnit));
            } else if (constructor == 2092947464) {
                return C4403w.m27869i1(R.string.ScheduledUntilOnline);
            }
        }
        if (m26002Y5()) {
            return C4403w.m27910Z0(m26043U2(), TimeUnit.SECONDS);
        }
        if (!C5063c.m24144b(this.f16125b, 16) || !this.f16097N0.m7682j1()) {
            return C4403w.m27846o0(m26043U2(), TimeUnit.SECONDS);
        }
        return C4403w.m27869i1(R.string.DiscussionStart);
    }

    public final int m26229C2() {
        C4602c4 c4Var;
        return (!m26098O9() || m26143K5() || ((c4Var = this.f16110U) != null && !c4Var.m27001v())) ? f16059d2 : f16060e2;
    }

    public final int m26228C3() {
        return m26068R9() ? m26042U3() + C1357a0.m37541i(11.0f) : f16069n2;
    }

    public final int m26227C4() {
        return m26068R9() ? m25918h6() ? R.id.theme_color_bubbleOut_separator : R.id.theme_color_bubbleIn_separator : R.id.theme_color_separator;
    }

    public final void m26226C5() {
        this.f16101P0.m28236o();
    }

    public final void m26224C7() {
        int i = this.f16098O;
        this.f16098O = m26118N0();
        mo26181G7();
        if (this.f16098O != i) {
            m26140K8();
        }
    }

    public void m26223C8() {
        int i = this.f16096N;
        if (i != 0) {
            this.f16096N = 0;
            m25934g0(i);
        }
    }

    public C9357x2.C9370l m26222C9(View view, C9357x2.AbstractC9363f fVar, TdApi.FormattedText formattedText) {
        return m25977b0(view, fVar).m8970E(this.f16099O0, formattedText);
    }

    public boolean m26220D0(boolean z) {
        if (z && this.f16122a.containsUnreadMention) {
            return true;
        }
        TdApi.Chat E2 = m26207E2();
        if (E2 == null) {
            E2 = this.f16099O0.m2632U2(this.f16122a.chatId);
            m26037U8(E2);
        }
        if (E2 != null) {
            if ((this.f16122a.isOutgoing ? E2.lastReadOutboxMessageId : E2.lastReadInboxMessageId) < m26065S1()) {
                return true;
            }
        }
        return false;
    }

    public final String m26219D1() {
        TdApi.MessageForwardInfo messageForwardInfo;
        if (m26046T9() && (messageForwardInfo = this.f16122a.forwardInfo) != null) {
            return C4403w.m27895c1(messageForwardInfo.date, TimeUnit.SECONDS);
        }
        return null;
    }

    public final int m26218D2() {
        return (!m26098O9() || (this.f16125b & Log.TAG_CRASH) != 0) ? f16059d2 : f16060e2;
    }

    public final void m26215D5(int i, int i2, int i3, int i4) {
        this.f16101P0.m28235p(i, i2, i3, i4);
    }

    public void mo26213D7(long j, C3950k kVar) {
    }

    public final int m26212D8(long j) {
        synchronized (this) {
            int m5 = m25871m5(j);
            int i = 1;
            if (m5 >= 0) {
                TdApi.Message remove = this.f16119Y0.remove(m5);
                if (m5 == this.f16119Y0.size() && m5 > 0) {
                    this.f16122a = this.f16119Y0.get(m5 - 1);
                }
                if (this.f16119Y0.isEmpty()) {
                    return 1;
                }
                mo26048T7(remove, m5);
                m26240B1(j);
                m26139K9(true);
                return 2;
            } else if (m5 != -2) {
                return 0;
            } else {
                ArrayList<TdApi.Message> arrayList = this.f16119Y0;
                if (arrayList != null && !arrayList.isEmpty()) {
                    i = 0;
                }
                return i;
            }
        }
    }

    public final RunnableC5390g.AbstractC5393c m26209E0() {
        RunnableC5390g.AbstractC5393c cVar = this.f16176z1;
        if (cVar != null) {
            return cVar;
        }
        C4767f fVar = new C4767f();
        this.f16176z1 = fVar;
        return fVar;
    }

    public final String m26208E1() {
        TdApi.MessageForwardInfo messageForwardInfo;
        if (m26002Y5()) {
            return C4403w.m27895c1(this.f16122a.date, TimeUnit.SECONDS);
        }
        if (mo25841p6()) {
            return C4403w.m27869i1(R.string.SponsoredSign);
        }
        StringBuilder sb2 = new StringBuilder();
        String str = null;
        if (m26133L5() && !C5070i.m24061i(this.f16122a.authorSignature)) {
            str = this.f16122a.authorSignature;
        } else if (m26250A1() && (messageForwardInfo = this.f16122a.forwardInfo) != null) {
            int constructor = messageForwardInfo.origin.getConstructor();
            if (constructor == 1490730723) {
                str = ((TdApi.MessageForwardOriginChannel) this.f16122a.forwardInfo.origin).authorSignature;
            } else if (constructor == 1526010724) {
                str = ((TdApi.MessageForwardOriginChat) this.f16122a.forwardInfo.origin).authorSignature;
            }
        }
        if (!C5070i.m24061i(str)) {
            if (C1389o.m37256m()) {
                sb2.append("\u200e");
            }
            sb2.append(C1363c0.m37450X(str, 18));
            if (C1389o.m37256m()) {
                sb2.append("\u200e");
            }
            sb2.append(", ");
        }
        if (!m26068R9() && m25955d7()) {
            sb2.append(m26156J1());
            sb2.append(" ");
        }
        TdApi.MessageForwardInfo messageForwardInfo2 = this.f16122a.forwardInfo;
        if (messageForwardInfo2 != null && messageForwardInfo2.origin.getConstructor() == -739561951) {
            sb2.append(C4403w.m27869i1(R.string.ImportedSign));
            sb2.append(" ");
        }
        if (C4779t2.m25610R2(this.f16122a)) {
            sb2.append(C4403w.m27869i1(R.string.failed));
        } else if (m25881l6()) {
            int i = this.f16122a.schedulingState.getConstructor() == -1485570073 ? ((TdApi.MessageSchedulingStateSendAtDate) this.f16122a.schedulingState).sendDate : 0;
            if (i != 0) {
                sb2.append(C4403w.m27932T2(i, TimeUnit.SECONDS));
            }
        } else if ((this.f16125b & 33554432) == 0 || m25928g6() || this.f16122a.forwardInfo == null) {
            if (m26250A1()) {
                TdApi.Message message = this.f16122a;
                int i2 = message.forwardInfo.date;
                if (i2 != 0) {
                    sb2.append(C5067f.m24111i(i2, message.date) ? C4403w.m27932T2(this.f16122a.forwardInfo.date, TimeUnit.SECONDS) : C4403w.m27895c1(this.f16122a.forwardInfo.date, TimeUnit.SECONDS));
                }
            }
            int i3 = m26180G8() ? this.f16122a.editDate : this.f16122a.date;
            if (i3 != 0) {
                sb2.append(C4403w.m27932T2(i3, TimeUnit.SECONDS));
            }
        } else {
            int i4 = m26180G8() ? this.f16122a.editDate : this.f16122a.date;
            int i5 = this.f16122a.forwardInfo.date;
            if (i5 != 0) {
                i4 = i5;
            }
            if (i4 != 0) {
                sb2.append(C4403w.m27895c1(i4, TimeUnit.SECONDS));
            }
        }
        return sb2.toString();
    }

    public TdApi.Chat m26207E2() {
        return this.f16124a1;
    }

    public final int m26206E3() {
        return mo25222X2() + m26217D3() + ((!m25899j6() || m26250A1()) ? 0 : m25813s4());
    }

    public final long m26205E4() {
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.f16119Y0;
            if (arrayList == null || arrayList.isEmpty()) {
                return this.f16122a.f25406id;
            }
            return this.f16119Y0.get(0).f25406id;
        }
    }

    public final void m26204E5(int i, int i2, int i3, int i4, boolean z) {
        m25781v5(i, i2, i3, i4);
        if (mo25749y7()) {
            m26215D5(i, i2, i3, i4);
        }
        if (z) {
            m26236B5();
        }
    }

    public final void m26202E7(View view) {
        C4341g gVar;
        m25768w9(view != null || m25957d5());
        if (view != null && (gVar = this.f16103Q0) != null && gVar.m28241j(view)) {
            mo26081Q7(view, true);
        }
    }

    public final void m26201E8(long j) {
        RunnableC9651s3 s3Var;
        if (this.f16122a.replyToMessageId == j && (s3Var = this.f16108T) != null) {
            s3Var.m7875j(j);
        }
    }

    public final void m26200E9(boolean z) {
        if (m25975b6() && mo25840p7() && this.f16127b1 == 0) {
            HandlerC4768g L3 = m26135L3();
            this.f16127b1 = System.currentTimeMillis();
            L3.sendMessageDelayed(Message.obtain(L3, 0, this), 18L);
            mo26100O7(z);
        }
    }

    public final boolean m26199F0(TdApi.Message message, boolean z) {
        if (!m25971ba(message)) {
            return false;
        }
        boolean z2 = (this.f16125b & 32) == 0;
        synchronized (this) {
            if (this.f16119Y0 == null) {
                ArrayList<TdApi.Message> arrayList = new ArrayList<>();
                this.f16119Y0 = arrayList;
                arrayList.add(this.f16122a);
            }
            if (z) {
                this.f16119Y0.add(message);
                this.f16122a = message;
            } else {
                this.f16119Y0.add(0, message);
            }
            mo26038U7(message, z, z2);
            m25755y1(true);
        }
        m26139K9(false);
        if (!z2) {
            if (z) {
                m26142K6();
            }
            m25748y8();
        }
        return true;
    }

    public int mo26198F1(View view, int i) {
        return m26176H1() - i;
    }

    public final int m26197F2() {
        return C11524j.m228N(m26186G2());
    }

    public AbstractC4705m6 m26196F3() {
        return this.f16106S;
    }

    public int m26195F4() {
        return (int) (m26184G4() * 1.24f);
    }

    public final void m26194F5(boolean z) {
        m25791u5();
        if (mo25749y7()) {
            m26226C5();
        }
        if (z) {
            m26236B5();
        }
    }

    public final void m26192F7(C9552h1 h1Var) {
        m25768w9(h1Var != null || m25957d5());
        if (this.f16101P0.m28241j(h1Var) && h1Var != null) {
            mo26070R7(h1Var, true);
        }
    }

    public final void m26191F8(long j, TdApi.MessageContent messageContent) {
        RunnableC9651s3 s3Var;
        if (this.f16122a.replyToMessageId == j && (s3Var = this.f16108T) != null) {
            s3Var.m7897P(j, messageContent);
        }
    }

    public final void m26190F9() {
        if (this.f16127b1 != 0) {
            this.f16127b1 = 0L;
            m26135L3().removeMessages(0, this);
        }
    }

    public int compareTo(AbstractC4761s4 s4Var) {
        return Long.compare(s4Var.m26115N3(), m26115N3());
    }

    public int m26187G1() {
        return m26097P() ? this.f16096N - this.f16159r0 : this.f16153o0;
    }

    public final int m26186G2() {
        return m25918h6() ? R.id.theme_color_bubbleOut_messageAuthor : R.id.theme_color_messageAuthor;
    }

    public final int m26185G3() {
        return m26068R9() ? m26042U3() : f16066k2;
    }

    public int m26184G4() {
        return Math.min(this.f16151n0, (C1357a0.m37553B() - f16072q2) - this.f16149m0);
    }

    public final void m26183G5() {
        m25849o8(new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                AbstractC4761s4.this.m26235B6((C9552h1) obj);
            }
        });
    }

    public void mo26181G7() {
    }

    public boolean m26180G8() {
        return false;
    }

    public final C7319d m26179G9() {
        TdApi.Message message = this.f16122a;
        long j = message.chatId;
        long j2 = message.f25406id;
        return new C7319d(j, j2, m25883l4(j2));
    }

    public void m26177H0() {
        float signum = Math.signum(this.f16150m1);
        this.f16150m1 = 0.0f;
        this.f16138g1 = 0.0f;
        m26035V(signum, 0.0f);
    }

    public int m26176H1() {
        return m26097P() ? this.f16096N - this.f16153o0 : this.f16159r0;
    }

    public final AbstractC5408k m26175H2() {
        return m25839p8(C5428t.AbstractC5441d.f17878I, C5428t.AbstractC5432b.f17856m, C5428t.AbstractC5429a.f17851h);
    }

    public final int m26174H3() {
        if (m26068R9()) {
            return this.f16167v0 - m25940f2();
        }
        return (((this.f16125b & Log.TAG_CRASH) != 0 ? f16067l2 : f16070o2) - C1357a0.m37541i(3.0f)) + m26164I3();
    }

    public final String m26173H4() {
        TdApi.User v2;
        AbstractC4705m6 m6Var = this.f16106S;
        if (m6Var == null) {
            return this.f16102Q.m4209g();
        }
        if (m6Var.m26427e()) {
            return this.f16106S.mo25215b();
        }
        AbstractC4705m6 m6Var2 = this.f16106S;
        if (!(m6Var2 instanceof RunnableC4736p6) && (m6Var2 instanceof C4808u6) && (v2 = this.f16099O0.m2480e2().m1583v2(((C4808u6) this.f16106S).m25209i())) != null) {
            return v2.firstName;
        }
        return null;
    }

    public final void m26172H5() {
        m25849o8(new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                AbstractC4761s4.this.m26225C6((C9552h1) obj);
            }
        });
    }

    public void mo25340H7(int i, float f, C3950k kVar) {
    }

    public final void m26170H8(C6257p pVar) {
        if ((this.f16125b & Log.TAG_CRASH) == 0 || this.f16120Z == null || !m25936f7()) {
            pVar.m20819G(null);
        } else {
            pVar.m20819G(this.f16120Z);
        }
    }

    public void m26169H9(float f, boolean z) {
        int i;
        int i2;
        if (!z || (this.f16125b & 67108864) == 0) {
            boolean R9 = m26068R9();
            if (R9) {
                f = Math.max(-i2, Math.min(C1357a0.m37541i(64.0f), f));
            }
            if (this.f16150m1 != f) {
                int i3 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i3 == 0 || R9) {
                    this.f16138g1 = 0.0f;
                } else {
                    this.f16138g1 = Math.min(1.0f, Math.abs(f) / f16027I2);
                }
                this.f16150m1 = f;
                if (R9) {
                    if (i3 >= 0) {
                        this.f16125b &= -268435457;
                        m25848o9(false, 0.0f, false, false);
                    }
                    if (f <= 0.0f) {
                        this.f16125b &= -134217729;
                        m25848o9(true, 0.0f, false, false);
                    }
                    if (f >= C1357a0.m37541i(42.0f)) {
                        int i4 = this.f16125b;
                        if ((i4 & 134217728) == 0) {
                            this.f16125b = i4 | 134217728;
                            m25978aa();
                            m25848o9(true, 1.0f, true, true);
                        }
                    }
                    if (f <= (-i)) {
                        int i5 = this.f16125b;
                        if ((i5 & 268435456) == 0) {
                            this.f16125b = i5 | 268435456;
                            m25978aa();
                            m25848o9(false, 1.0f, true, true);
                        }
                    }
                }
                m25761x5(true);
            }
        }
    }

    public final int m26167I0() {
        int X2 = mo25222X2();
        if (this.f16108T != null && !m26088Q()) {
            X2 += m25834q2();
        }
        if (m25800t7(true) && (this.f16125b & Log.TAG_CRASH) != 0) {
            X2 += m25912i2();
            if (m25899j6()) {
                X2 += m25813s4();
            }
        }
        if (m26046T9()) {
            X2 += m25940f2();
        }
        if (m25938f5()) {
            X2 += m25763x3() + mo25743z3() + mo25753y3();
        }
        return X2 + m25845p2();
    }

    public final TdApi.ChatAdministrator m26166I1() {
        return this.f16121Z0;
    }

    public final int m26165I2() {
        return C11524j.m228N(m25918h6() ? R.id.theme_color_bubbleOut_messageAuthorPsa : R.id.theme_color_messageAuthorPsa);
    }

    public int m26164I3() {
        int i;
        int i2;
        int i3;
        int i4 = this.f16125b;
        if ((i4 & Log.TAG_CAMERA) != 0) {
            if ((i4 & Log.TAG_VOICE) != 0) {
                i3 = f16077v2 + f16079x2;
                i2 = m26068R9() ? f16075t2 - (C1357a0.m37541i(3.0f) * 2) : f16075t2;
            } else {
                i3 = f16077v2;
                i2 = f16079x2;
            }
            i = i3 + i2;
        } else if ((i4 & Log.TAG_VOICE) != 0) {
            i = m26068R9() ? f16075t2 - (C1357a0.m37541i(3.0f) * 2) : f16075t2;
        } else {
            i = 0;
        }
        return ((this.f16125b & Log.TAG_CRASH) == 0 || m26068R9()) ? i : i + f16074s2;
    }

    public final Object m26163I4() {
        return this.f16109T0;
    }

    public final boolean m26162I5() {
        return C5063c.m24144b(this.f16125b, Integer.MIN_VALUE);
    }

    public final void m26161I6() {
        if (!m26068R9() || m25936f7()) {
            if (this.f16124a1 == null) {
                this.f16124a1 = this.f16099O0.m2632U2(this.f16122a.chatId);
            }
            float f = m26068R9() ? 18.0f : 20.5f;
            if (m26250A1()) {
                this.f16120Z = this.f16106S.mo25214c();
                this.f16123a0 = new C4587b(f, this.f16106S.mo25213d(), null);
                return;
            }
            this.f16120Z = this.f16102Q.m4215a();
            this.f16123a0 = new C4587b(f, this.f16102Q.m4208h(), null);
            return;
        }
        this.f16120Z = null;
    }

    public void mo25338I7(int i, float f, float f2) {
    }

    public void mo26160I8(RunnableC6507m mVar) {
        mVar.m20231r(null);
    }

    public final void m26159I9(boolean z) {
        if (m26036U9()) {
            this.f16165u0 = 0;
            this.f16169w0 = this.f16096N;
        } else if (m26097P()) {
            this.f16165u0 = ((this.f16096N - this.f16159r0) - this.f16153o0) + this.f16149m0;
            this.f16169w0 = this.f16151n0;
        } else {
            this.f16165u0 = this.f16149m0;
            this.f16169w0 = this.f16151n0;
        }
    }

    public final int m26157J0() {
        if (!m25936f7() || m25928g6()) {
            return C4184b.f14114g ? f16058c2 : f16057b2;
        }
        return f16057b2 + C1357a0.m37541i(40.0f);
    }

    public final String m26156J1() {
        String str;
        if (mo25841p6()) {
            return null;
        }
        TdApi.ChatAdministrator chatAdministrator = this.f16121Z0;
        if (chatAdministrator != null) {
            if (!C5070i.m24061i(chatAdministrator.customTitle)) {
                str = this.f16121Z0.customTitle;
            } else if (this.f16121Z0.isOwner) {
                str = C4403w.m27869i1(R.string.message_ownerSign);
            } else {
                str = C4403w.m27869i1(R.string.message_adminSignPlain);
            }
        } else if (this.f16102Q.m4205k()) {
            str = !C5070i.m24061i(this.f16122a.authorSignature) ? this.f16122a.authorSignature : C4403w.m27869i1(R.string.message_adminSignPlain);
        } else {
            if (C5070i.m24061i(this.f16122a.authorSignature)) {
                long j = this.f16122a.chatId;
                if (j != 0 && this.f16099O0.m2583X6(j)) {
                    long c = this.f16102Q.m4213c();
                    if (this.f16099O0.m2784K6(c)) {
                        str = C4403w.m27869i1(R.string.message_channelSign);
                    } else if (C7316a.m17053h(c)) {
                        str = C4403w.m27869i1(R.string.message_groupSign);
                    }
                }
            }
            str = null;
        }
        if (str == null) {
            return null;
        }
        if (!m26068R9()) {
            return str;
        }
        return "  " + str.trim();
    }

    public final AbstractC5408k m26155J2() {
        return m25839p8(C5428t.AbstractC5441d.f17879J, C5428t.AbstractC5432b.f17857n, C5428t.AbstractC5429a.f17852i);
    }

    public int mo25354J3() {
        return this.f16098O;
    }

    public final int m26154J4() {
        return C11524j.m228N(m26068R9() ? m25918h6() ? R.id.theme_color_bubbleOut_text : R.id.theme_color_bubbleIn_text : R.id.theme_color_text);
    }

    public boolean mo26153J5() {
        return false;
    }

    public final void m26152J6(C9552h1 h1Var, C6257p pVar) {
        int i;
        int i2;
        int i3;
        if (m26068R9()) {
            i3 = f16065j2;
            i2 = m26137L0();
            i = f16064i2;
        } else {
            i2 = m26164I3();
            i3 = f16081z2;
            i = f16080y2;
        }
        int i4 = i * 2;
        if (C4403w.m27984G2() && m26068R9()) {
            i3 = (h1Var.getMeasuredWidth() - i3) - i4;
        }
        pVar.mo20256K0(i3, i2, i3 + i4, i4 + i2);
    }

    public final void m26151J7() {
        this.f16134e1 = true;
        m26190F9();
        AbstractC4705m6 m6Var = this.f16106S;
        if (m6Var != null) {
            m6Var.mo25216a();
        }
        RunnableC9651s3 s3Var = this.f16108T;
        if (s3Var != null) {
            s3Var.mo4501a3();
        }
        m25768w9(false);
        mo25321V7();
    }

    public void mo26150J8(C6257p pVar) {
        pVar.m20819G(null);
    }

    public void m26149J9() {
        m26028V8(m26230C1());
        if (m26068R9() || (this.f16125b & Log.TAG_CRASH) != 0) {
            m26142K6();
        }
    }

    public final int m26147K0(boolean z) {
        int i = this.f16173y0 + 0;
        if (i == 0 && !C5070i.m24061i(this.f16100P)) {
            i = (int) C7389v0.m16680T1(this.f16100P, m26092P6());
        }
        if (m25739z9()) {
            i += C1392p.m37228h() + C1357a0.m37541i(2.0f);
        }
        boolean o6 = m25851o6();
        if (m26003Y4() == 1) {
            i = (int) (((!o6 || (!mo26016X0() && m26098O9())) ? (int) (i + this.f16129c0.m23035j(C1357a0.m37541i(6.0f))) : i + C1392p.m37230f() + C1357a0.m37541i(3.0f)) + this.f16133e0.m23035j(C1357a0.m37541i(6.0f)));
        }
        if (m26053T2() == 0) {
            i = (int) (i + this.f16131d0.m23035j(C1357a0.m37541i(6.0f)));
        }
        int j = (int) (i + this.f16135f0.m23035j(C1357a0.m37541i(3.0f)));
        if (!m25992Z5() && (m25918h6() || (o6 && m26003Y4() != 1))) {
            j += C1392p.m37223m();
        }
        return z ? j + C1357a0.m37541i(8.0f) : j;
    }

    public TdApi.Message[] m26146K1() {
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.f16119Y0;
            if (arrayList == null || arrayList.isEmpty()) {
                return new TdApi.Message[]{this.f16122a};
            }
            TdApi.Message[] messageArr = new TdApi.Message[this.f16119Y0.size()];
            this.f16119Y0.toArray(messageArr);
            return messageArr;
        }
    }

    public final long m26145K2() {
        return this.f16122a.chatId;
    }

    public float m26144K3() {
        TdApi.Message message = this.f16122a;
        return (float) (message.ttlExpiresIn / message.ttl);
    }

    public final boolean m26143K5() {
        return (this.f16125b & 2) != 0;
    }

    public final void m26142K6() {
        String str;
        int i;
        String str2;
        boolean z = m25899j6() && m26250A1();
        if (m26068R9()) {
            this.f16173y0 = (int) C7389v0.m16680T1(this.f16100P, m26092P6());
            int c3 = (((m26045U() ? this.f16151n0 : mo25218c3()) + m25885l2()) + m25885l2()) - ((f16062g2 + f16063h2) * 2);
            if (m25955d7()) {
                RunnableC5390g f = new RunnableC5390g.C5392b(m26156J1(), c3, m26084Q4(), m25844p3()).m22868v().m22884f();
                this.f16118Y = f;
                c3 -= f.getWidth();
            } else {
                this.f16118Y = null;
            }
            int i2 = c3;
            if (m26250A1()) {
                str2 = this.f16106S.mo25215b();
            } else {
                str2 = this.f16102Q.m4211e();
            }
            String str3 = str2;
            if (!m25800t7(true) || i2 <= 0) {
                this.f16114W = null;
            } else {
                this.f16114W = m26082Q6(str3, !m26250A1() || !(this.f16106S instanceof C4774s6), z, !m25800t7(false), (this.f16122a.forwardInfo == null || m26250A1()) ? this.f16122a.viaBotUserId : 0L, i2, false);
            }
            if (z) {
                this.f16116X = new RunnableC5390g.C5392b(this.f16099O0, C4403w.m27926V0(m26096P0(), this.f16122a.forwardInfo.publicServiceAnnouncementType), m25916h8(), i2, m25920h4(), m26155J2()).m22886d().m22868v().m22869u(new C4693l4(this)).m22884f();
            } else {
                this.f16116X = null;
            }
            if ((this.f16125b & 32) != 0) {
                m25997Z(false);
                return;
            }
            return;
        }
        int i3 = this.f16096N;
        this.f16173y0 = (int) C7389v0.m16680T1(this.f16100P, m26101O6(false));
        int i4 = C1357a0.m37541i(16.0f);
        this.f16171x0 = (i3 - this.f16173y0) - i4;
        int i5 = (i3 - f16066k2) - C1357a0.m37541i(4.0f);
        int i6 = (i5 - i4) - this.f16173y0;
        if (m26242A9()) {
            i6 -= (C1357a0.m37541i(3.0f) + C1392p.m37223m()) + C1357a0.m37541i(3.0f);
        }
        if (m25739z9()) {
            i6 -= C1357a0.m37541i(5.0f) + C1392p.m37228h();
        }
        if (m26250A1()) {
            str = this.f16106S.mo25215b();
        } else {
            str = this.f16102Q.m4211e();
        }
        int j = (int) (i6 - (this.f16135f0.m23035j(C1357a0.m37541i(3.0f)) + C1357a0.m37541i(3.0f)));
        if (m26053T2() == 0) {
            j = (int) (j - this.f16131d0.m23035j(C1357a0.m37541i(6.0f)));
        }
        if (m26003Y4() == 1) {
            j = (int) (((int) (j - this.f16133e0.m23035j(C1357a0.m37541i(6.0f)))) - this.f16129c0.m23035j(C1357a0.m37541i(6.0f)));
        }
        int i7 = j;
        if (z) {
            this.f16116X = i7 > 0 ? new RunnableC5390g.C5392b(this.f16099O0, C4403w.m27926V0(m26096P0(), this.f16122a.forwardInfo.publicServiceAnnouncementType), m25916h8(), i7, m25920h4(), m26155J2()).m22886d().m22868v().m22869u(new C4693l4(this)).m22884f() : null;
            i = i5;
        } else {
            this.f16116X = null;
            i = i7;
        }
        if (i > 0) {
            this.f16114W = m26082Q6(str, !m26250A1() || !(this.f16106S instanceof C4774s6), z, !m25800t7(false), (this.f16122a.forwardInfo == null || m26250A1()) ? this.f16122a.viaBotUserId : 0L, i, false);
        } else {
            this.f16114W = null;
        }
    }

    public final void m26141K7(View view) {
        C4341g gVar = this.f16103Q0;
        if (!(gVar == null || !gVar.m28239l(view) || view == null)) {
            mo26081Q7(view, false);
        }
        m25768w9(m25957d5());
    }

    public final void m26140K8() {
        this.f16101P0.requestLayout();
    }

    public final void m26139K9(boolean z) {
        TdApi.MessageInteractionInfo messageInteractionInfo = this.f16122a.interactionInfo;
        boolean z2 = true;
        int i = 0;
        boolean z3 = z && m25945e7();
        C5375a aVar = this.f16129c0;
        if (aVar != null) {
            aVar.m23027t(messageInteractionInfo != null ? messageInteractionInfo.viewCount : 0, z3 && m26003Y4() != 0);
        }
        int T2 = m26053T2();
        this.f16131d0.m23027t(m25782v4(), T2 == 0 && z3);
        C3940f fVar = this.f16105R0;
        if (T2 != 1) {
            z2 = false;
        }
        fVar.m29575p(z2, z3);
        C5375a aVar2 = this.f16133e0;
        if (messageInteractionInfo != null) {
            i = messageInteractionInfo.forwardCount;
        }
        aVar2.m23027t(i, z3);
        this.f16135f0.m23023y(m25908i6(), z3);
    }

    public final int m26137L0() {
        return m26164I3() + m26218D2();
    }

    public int m26136L2() {
        return mo25222X2();
    }

    public final AbstractC5408k m26134L4() {
        return m25839p8(C5428t.AbstractC5441d.f17872C, C5428t.AbstractC5432b.f17853j, C5428t.AbstractC5429a.f17848e);
    }

    public boolean m26133L5() {
        return this.f16122a.isChannelPost;
    }

    public final void m26132L6() {
        TdApi.MessageForwardInfo messageForwardInfo = this.f16122a.forwardInfo;
        if (messageForwardInfo != null) {
            switch (messageForwardInfo.origin.getConstructor()) {
                case TdApi.MessageForwardOriginMessageImport.CONSTRUCTOR:
                    this.f16106S = new C4774s6(this, (TdApi.MessageForwardOriginMessageImport) this.f16122a.forwardInfo.origin);
                    break;
                case TdApi.MessageForwardOriginUser.CONSTRUCTOR:
                    this.f16106S = new C4808u6(this, (TdApi.MessageForwardOriginUser) this.f16122a.forwardInfo.origin);
                    break;
                case TdApi.MessageForwardOriginHiddenUser.CONSTRUCTOR:
                    this.f16106S = new C4774s6(this, (TdApi.MessageForwardOriginHiddenUser) this.f16122a.forwardInfo.origin);
                    break;
                case TdApi.MessageForwardOriginChannel.CONSTRUCTOR:
                    this.f16106S = new RunnableC4736p6(this, (TdApi.MessageForwardOriginChannel) this.f16122a.forwardInfo.origin);
                    break;
                case TdApi.MessageForwardOriginChat.CONSTRUCTOR:
                    this.f16106S = new RunnableC4736p6(this, (TdApi.MessageForwardOriginChat) this.f16122a.forwardInfo.origin);
                    break;
            }
            m25952e0();
            this.f16106S.mo25212f();
        }
    }

    public final void m26131L7(C9552h1 h1Var) {
        if (this.f16101P0.m28239l(h1Var) && h1Var != null) {
            mo26070R7(h1Var, false);
        }
        m25768w9(m25957d5());
    }

    public void mo25334L8(C6238b bVar, boolean z, int i) {
        bVar.m20999d();
    }

    public boolean mo25333L9(TdApi.Message message, TdApi.MessageContent messageContent, boolean z) {
        return false;
    }

    public final int m26129M0() {
        throw new UnsupportedOperationException("Method not decompiled: gd.AbstractC4761s4.m26129M0():int");
    }

    public int mo26128M1() {
        throw new RuntimeException();
    }

    public int m26127M2() {
        return this.f16165u0;
    }

    public String m26126M3() {
        return HandlerC10770jj.m3593f3((int) Math.round(this.f16122a.ttlExpiresIn), TimeUnit.SECONDS, false);
    }

    public final boolean m26124M5() {
        TdApi.MessageForwardInfo messageForwardInfo = this.f16122a.forwardInfo;
        if (messageForwardInfo != null && messageForwardInfo.origin.getConstructor() == 1490730723) {
            TdApi.Message message = this.f16122a;
            TdApi.MessageForwardInfo messageForwardInfo2 = message.forwardInfo;
            if (messageForwardInfo2.fromChatId == ((TdApi.MessageForwardOriginChannel) messageForwardInfo2.origin).chatId && message.senderId.getConstructor() == -239660751) {
                TdApi.Message message2 = this.f16122a;
                if (((TdApi.MessageSenderChat) message2.senderId).chatId == message2.forwardInfo.fromChatId) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void m26123M6() {
        RunnableC9651s3 s3Var = new RunnableC9651s3(this);
        this.f16108T = s3Var;
        s3Var.m7885a0(this.f16101P0);
        this.f16108T.m7900M();
    }

    public final boolean m26122M7(View view, RunnableC5390g gVar, C5455v0 v0Var, HandlerC10770jj.C10788q qVar) {
        if (v0Var.m22687g() == null && gVar.m22976Q() == 1) {
            return false;
        }
        if (v0Var.m22687g() == null || !(v0Var.m22687g().m22784j() instanceof Long)) {
            this.f16106S.mo25211g(view, gVar, v0Var, qVar, null);
        } else {
            this.f16097N0.m7645r0().m32522Wp(this.f16122a.viaBotUserId, this.f16104R);
        }
        return true;
    }

    public void mo26121M8(C6240c cVar) {
        cVar.clear();
    }

    public int m26118N0() {
        if (m26068R9()) {
            int n4 = this.f16157q0 + m25863n4() + m25783v3();
            C4602c4 c4Var = this.f16110U;
            return (c4Var == null || c4Var.m27001v()) ? n4 : n4 + this.f16110U.m27005r() + C4602c4.m27006q();
        }
        int X2 = this.f16167v0 + mo25222X2() + m25863n4() + m25783v3();
        C4602c4 c4Var2 = this.f16110U;
        if (c4Var2 != null && !c4Var2.m27001v()) {
            X2 += this.f16110U.m27005r() + f16071p2;
        }
        return m25938f5() ? X2 + m25763x3() + mo25743z3() + mo25753y3() : X2;
    }

    public final int m26117N1() {
        RunnableC5390g gVar = this.f16114W;
        if (gVar != null) {
            return gVar.getWidth();
        }
        if (m25800t7(true)) {
            return -C1357a0.m37541i(3.0f);
        }
        return 0;
    }

    public int m26116N2() {
        return this.f16167v0;
    }

    public final long m26115N3() {
        return this.f16122a.f25406id;
    }

    public final int m26114N4() {
        if ((!m25860n7() || !m25810s7()) && ((!m26046T9() || ((this.f16125b & 33554432) != 0 && !m25928g6())) && this.f16108T == null)) {
            return 0;
        }
        return -C1357a0.m37541i(m26068R9() ? 4.0f : 2.0f);
    }

    public final boolean m26113N5() {
        TdApi.Chat U2 = this.f16099O0.m2632U2(m26145K2());
        if (U2 == null) {
            return false;
        }
        switch (U2.type.getConstructor()) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                TdApi.ChatMemberStatus K3 = this.f16099O0.m2787K3(U2.f25367id);
                return K3 != null && C4779t2.m25499i3(K3, false);
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                return true;
            default:
                return false;
        }
    }

    public void mo26111N7(boolean z) {
    }

    public final void m26110N8(C6240c cVar) {
        RunnableC9651s3 s3Var = this.f16108T;
        if (s3Var != null) {
            s3Var.m7896Q(cVar);
        } else {
            cVar.clear();
        }
    }

    public boolean m26109N9(long j, AbstractC4761s4 s4Var) {
        boolean z = false;
        if (!m25777v9(j)) {
            return false;
        }
        if (m25928g6() && (this.f16125b & Log.TAG_CRASH) == 0) {
            if (s4Var != null) {
                boolean z2 = m25801t6() || m25851o6();
                if (s4Var.m25801t6() || s4Var.m25851o6()) {
                    z = true;
                }
                if (z2 == z) {
                    this.f16125b &= -513;
                }
            }
            this.f16125b |= Log.TAG_GIF_LOADER;
        }
        return true;
    }

    public final void m26108O(int i) {
        this.f16125b = i | this.f16125b;
    }

    public final boolean m26107O0() {
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.f16119Y0;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (this.f16119Y0.get(size).containsUnreadMention) {
                        return true;
                    }
                }
            }
            return this.f16122a.containsUnreadMention;
        }
    }

    public final TextPaint m26106O1(boolean z) {
        return C1410y.m37062P(14.0f, z);
    }

    public int m26105O2() {
        return mo25218c3();
    }

    public final void m26104O3(C5322e eVar, long j, long j2) {
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.f16119Y0;
            if (arrayList == null || arrayList.isEmpty()) {
                long j3 = this.f16122a.f25406id;
                if (j3 > j && j3 < j2) {
                    eVar.m23275a(j3);
                    return;
                }
                return;
            }
            Iterator<TdApi.Message> it = this.f16119Y0.iterator();
            while (it.hasNext()) {
                long j4 = it.next().f25406id;
                if (j4 > j && j4 < j2) {
                    eVar.m23275a(j4);
                }
            }
        }
    }

    public int m26103O4() {
        if (!m26068R9()) {
            return m25822r3();
        }
        boolean z = false;
        boolean z2 = !m26098O9() || mo26057S9();
        if (z2 || (mo26016X0() && !m26046T9())) {
            z = true;
        }
        if (!z) {
            return m25822r3();
        }
        return z2 ? R.id.theme_color_bubble_mediaTime : R.id.theme_color_bubble_mediaOverlayText;
    }

    public final boolean m26102O5() {
        synchronized (this) {
            C5322e eVar = this.f16144j1;
            boolean z = false;
            int l = eVar != null ? eVar.m23264l() : 0;
            if (l == 0) {
                return false;
            }
            ArrayList<TdApi.Message> arrayList = this.f16119Y0;
            int size = arrayList != null ? arrayList.size() : 1;
            if (size > 0 && l >= size) {
                z = true;
            }
            return z;
        }
    }

    public void mo26100O7(boolean z) {
    }

    public final boolean m26098O9() {
        return m26068R9() && (!mo26066S0() || m26046T9());
    }

    public boolean m26097P() {
        return m26068R9() && m25918h6() != C4403w.m27984G2();
    }

    public final AbstractC9323v4<?> m26096P0() {
        return m25981a7().m9300Z9();
    }

    public final int m26095P2(C9552h1 h1Var, float f, float f2) {
        RunnableC9651s3 s3Var = this.f16108T;
        if (s3Var != null) {
            if (s3Var.m7911B(f, f2, m26068R9() && !m26098O9())) {
                return 1;
            }
        }
        if (!m25929g5() || !m25936f7() || !h1Var.getAvatarReceiver().m20793w(f, f2)) {
            return (m26053T2() == 1 && m26068R9() && f >= ((float) this.f16153o0) && f < ((float) this.f16159r0) && f2 >= ((float) (this.f16157q0 - m25845p2())) && f2 < ((float) this.f16157q0)) ? 3 : 0;
        }
        return 2;
    }

    public final void m26094P3(C5323f fVar) {
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.f16119Y0;
            if (arrayList == null || arrayList.isEmpty()) {
                fVar.m23262h(this.f16122a.f25406id);
                return;
            }
            fVar.m23261i(fVar.size() + this.f16119Y0.size());
            Iterator<TdApi.Message> it = this.f16119Y0.iterator();
            while (it.hasNext()) {
                fVar.m23262h(it.next().f25406id);
            }
        }
    }

    public int m26093P4() {
        if (!m26068R9()) {
            return m25873m3();
        }
        boolean z = false;
        boolean z2 = !m26098O9() || mo26057S9();
        if (z2 || (mo26016X0() && !m26046T9())) {
            z = true;
        }
        if (!z) {
            return m25873m3();
        }
        if (z2) {
            return m25764x2();
        }
        return C11524j.m228N(R.id.theme_color_bubble_mediaOverlayText);
    }

    @Override
    public final void mo45P5(int i, float f, float f2, C3950k kVar) {
        AbstractC4771j jVar;
        if (i >= 0) {
            mo25338I7(i, f, f2);
        } else if (i != -5) {
            if (i != -4) {
                if (i == -3) {
                    long r = kVar.m29535r();
                    int q = kVar.m29536q();
                    boolean z = false;
                    boolean z2 = (q & 1) != 0;
                    if (!((q & 8) != 0)) {
                        if ((q & 2) == 0) {
                            if (!z2 || this.f16140h1 == f) {
                                z = true;
                            }
                            mo25973b8(r, f, z);
                        }
                        if (z2) {
                            m25827q9(f);
                        }
                    }
                    if ((q & 4) != 0 && (jVar = (AbstractC4771j) kVar.m29534s()) != null) {
                        jVar.mo25737u0(f, kVar);
                    }
                } else if (i == -2) {
                    m26019W8(f);
                } else if (i == -1) {
                    m25989Z8(1.0f - f);
                }
            } else if (this.f16156p1 != f) {
                this.f16156p1 = f;
                m25791u5();
            }
        } else if (this.f16154o1 != f) {
            this.f16154o1 = f;
            m25791u5();
        }
    }

    public void mo26091P7(boolean z) {
    }

    public void m26090P8() {
        if (this.f16136f1 == 1.0f) {
            m26080Q8();
        }
    }

    public boolean m26089P9() {
        return (this.f16125b & Log.TAG_CRASH) != 0 && m25800t7(true);
    }

    public final boolean m26088Q() {
        return false;
    }

    public final int m26086Q2() {
        int size;
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.f16119Y0;
            size = arrayList != null ? arrayList.size() : 0;
        }
        return size;
    }

    public final long[] m26085Q3() {
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.f16119Y0;
            int i = 0;
            if (arrayList != null) {
                long[] jArr = new long[arrayList.size()];
                Iterator<TdApi.Message> it = this.f16119Y0.iterator();
                while (it.hasNext()) {
                    jArr[i] = it.next().f25406id;
                    i++;
                }
                Arrays.sort(jArr);
                return jArr;
            }
            return new long[]{this.f16122a.f25406id};
        }
    }

    public boolean m26083Q5() {
        return C4779t2.m25492j3(this.f16122a);
    }

    public final ie.RunnableC5390g m26082Q6(java.lang.String r12, final boolean r13, boolean r14, boolean r15, final long r16, int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: gd.AbstractC4761s4.m26082Q6(java.lang.String, boolean, boolean, boolean, long, int, boolean):ie.g");
    }

    public void mo26081Q7(View view, boolean z) {
    }

    public void m26080Q8() {
        C3950k kVar = this.f16148l1;
        if (kVar == null || !kVar.m29531v()) {
            C3950k kVar2 = this.f16148l1;
            if (kVar2 == null) {
                C3950k kVar3 = new C3950k(-1, this, C2057b.f7280b, 400L, 0.0f);
                this.f16148l1 = kVar3;
                kVar3.m29553F(2000L);
            } else {
                kVar2.m29541l(0.0f);
            }
            this.f16148l1.m29544i(1.0f);
        }
    }

    public final boolean m26079Q9() {
        return !mo25351j5() && (!m26046T9() || m25928g6() || (this.f16125b & Log.TAG_CRASH) != 0) && this.f16122a.content.getConstructor() != 538893824;
    }

    public boolean mo26078R() {
        return true;
    }

    public final ArrayList<TdApi.Message> m26075R2() {
        return this.f16119Y0;
    }

    public int mo26074R3(boolean z) {
        return 0;
    }

    public int m26073R4() {
        return this.f16155p0;
    }

    public final boolean m26072R5() {
        return this.f16122a.chatId == 0;
    }

    public final C9678w2 m26071R6() {
        return this.f16097N0;
    }

    public void mo26070R7(C9552h1 h1Var, boolean z) {
    }

    public boolean mo26069R8() {
        return false;
    }

    public final boolean m26068R9() {
        return m26071R6().m7615x3();
    }

    public boolean m26067S() {
        return !m26002Y5() && !m25811s6();
    }

    public boolean mo26066S0() {
        return false;
    }

    public final long m26065S1() {
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.f16119Y0;
            if (arrayList == null || arrayList.isEmpty()) {
                return this.f16122a.f25406id;
            }
            ArrayList<TdApi.Message> arrayList2 = this.f16119Y0;
            return arrayList2.get(arrayList2.size() - 1).f25406id;
        }
    }

    public final int m26064S2() {
        return C1357a0.m37541i(40.0f);
    }

    public final String m26063S3() {
        RunnableC9651s3 s3Var = this.f16108T;
        if (s3Var != null) {
            return s3Var.m7873l();
        }
        return null;
    }

    public float m26062S4() {
        return this.f16150m1;
    }

    public final boolean m26061S5() {
        return m26072R5() && this.f16097N0.m7697g1();
    }

    public void mo26060S6(boolean z) {
        this.f16125b = C5063c.m24138h(this.f16125b, Integer.MIN_VALUE, z);
    }

    public boolean mo26059S7(C9552h1 h1Var, View$OnClickListenerC2971rh rhVar) {
        return false;
    }

    public final boolean m26058S8() {
        return m26068R9() && (!m26098O9() || mo26069R8());
    }

    public boolean mo26057S9() {
        return false;
    }

    public boolean mo26056T(float f, float f2) {
        return true;
    }

    public final void m26055T0(p291uc.C9552h1 r30, android.graphics.Canvas r31, p156kd.C6257p r32, p156kd.AbstractC6264v r33, p156kd.C6240c r34, p156kd.C6257p r35, p168ld.RunnableC6507m r36, p156kd.C6238b r37) {
        throw new UnsupportedOperationException("Method not decompiled: gd.AbstractC4761s4.m26055T0(uc.h1, android.graphics.Canvas, kd.p, kd.v, kd.c, kd.p, ld.m, kd.b):void");
    }

    public int m26054T1() {
        return this.f16157q0;
    }

    public final int m26053T2() {
        if (m25898j7()) {
            return (!m26098O9() || mo26057S9()) ? 2 : 1;
        }
        return 0;
    }

    public final int m26052T3() {
        return (m26176H1() - f16062g2) - f16063h2;
    }

    public final int m26051T4() {
        return this.f16097N0.m7766P0(R.id.theme_color_unread, R.id.theme_color_bubble_unread, R.id.theme_color_bubble_unread_noWallpaper, R.id.theme_property_wallpaperOverrideUnread);
    }

    public boolean m26050T5(long j) {
        return m25835q1(j) != null;
    }

    public void m26049T6() {
        this.f16125b &= -262145;
    }

    public void mo26048T7(TdApi.Message message, int i) {
    }

    public final void m26047T8(TdApi.ChatAdministrator chatAdministrator) {
        boolean z = true;
        boolean z2 = (this.f16121Z0 != null || this.f16102Q.m4205k()) && !m25928g6();
        if (chatAdministrator == null) {
            z = false;
        }
        if (z2 != z || z2) {
            this.f16121Z0 = chatAdministrator;
            if ((this.f16125b & 32) != 0) {
                if (m26068R9()) {
                    m25942f0();
                    m25997Z(false);
                } else {
                    m25904j0();
                    m25942f0();
                }
                m25791u5();
                return;
            }
            m25904j0();
        }
    }

    public final boolean m26046T9() {
        return this.f16122a.forwardInfo != null && (!m26068R9() || !mo26069R8()) && !m26250A1();
    }

    public final boolean m26045U() {
        return !m26068R9() || mo26078R();
    }

    public final void m26044U0(C9552h1 h1Var, Canvas canvas) {
        if (this.f16138g1 != 0.0f) {
            canvas.drawRect(0.0f, m25765x1(), h1Var.getMeasuredWidth(), m25866n1(), C1410y.m37039g(m25762x4(this.f16138g1)));
        }
        if (this.f16140h1 != 0.0f) {
            m25886l1(h1Var, canvas);
        }
        if (this.f16136f1 != 0.0f) {
            m25923h1(h1Var, canvas);
        }
    }

    public int mo25323U1() {
        return -1;
    }

    public final int m26043U2() {
        int i = this.f16164t1;
        if (i != 0) {
            return i;
        }
        TdApi.Message message = this.f16122a;
        TdApi.MessageSchedulingState messageSchedulingState = message.schedulingState;
        if (messageSchedulingState == null) {
            return message.date;
        }
        if (messageSchedulingState.getConstructor() == -1485570073) {
            return ((TdApi.MessageSchedulingStateSendAtDate) this.f16122a.schedulingState).sendDate;
        }
        return 0;
    }

    public final int m26042U3() {
        return m26187G1() + f16062g2 + f16063h2;
    }

    public final int m26041U4() {
        return this.f16097N0.m7794I0(R.id.theme_color_unreadText, R.id.theme_color_bubble_unreadText, R.id.theme_color_bubble_unreadText_noWallpaper, R.id.theme_property_wallpaperOverrideUnread);
    }

    public boolean m26040U5(long j, long[] jArr) {
        return m25824r1(j, jArr) != null;
    }

    public boolean m26039U6() {
        if (!mo25350s0()) {
            return false;
        }
        this.f16125b |= Log.TAG_PAINT;
        if (this.f16122a.containsUnreadMention) {
            m25891k5(true);
        }
        return true;
    }

    public void mo26038U7(TdApi.Message message, boolean z, boolean z2) {
    }

    public final void m26037U8(TdApi.Chat chat) {
        this.f16124a1 = chat;
        this.f16125b = C5063c.m24138h(C5063c.m24138h(this.f16125b, Log.TAG_NDK, m25779v7()), 33554432, m25861n6());
        if (m25928g6() && !m25851o6()) {
            m25777v9(chat.lastReadOutboxMessageId);
        }
        if (this.f16099O0.m2752M6(chat)) {
            RunnableC9651s3 s3Var = this.f16108T;
            if (s3Var != null) {
                s3Var.m7891V(chat.title);
            }
            m25904j0();
        }
    }

    public final boolean m26036U9() {
        return !m26046T9() && !m26068R9() && mo25809s8() && !m26002Y5();
    }

    public final void m26035V(float f, float f2) {
        C3950k kVar = this.f16162s1;
        if (kVar != null) {
            kVar.m29541l(f);
        }
        m26019W8(f);
        C3950k kVar2 = this.f16162s1;
        if (kVar2 == null) {
            float f3 = this.f16152n1;
            if (f3 != f2) {
                this.f16162s1 = new C3950k(-2, this, C2057b.f7280b, 200L, f3);
            } else {
                return;
            }
        } else if (!kVar2.m29531v() && this.f16152n1 == f2) {
            return;
        }
        this.f16162s1.m29544i(f2);
    }

    public final void m26034V0(Canvas canvas, Paint paint, boolean z, int i) {
        if (paint.getAlpha() != 0) {
            RectF rectF = this.f16092K0;
            float f = i;
            float f2 = rectF.left - f;
            float f3 = rectF.top - f;
            float f4 = rectF.right + f;
            float f5 = rectF.bottom + f;
            RectF a0 = C1410y.m37050a0();
            float f6 = this.f16089H0;
            if (f6 != 0.0f) {
                a0.set(f2, f3, (f6 * 2.0f) + f2, (f6 * 2.0f) + f3);
                canvas.drawArc(a0, 180.0f, 90.0f, !z, paint);
                float f7 = this.f16089H0;
                float f8 = this.f16088G0;
                if (f7 < f8 && !z) {
                    canvas.drawRect(f2, f3 + f7, f2 + f7, f3 + f8, paint);
                }
            }
            float f9 = this.f16088G0;
            if (f9 != 0.0f) {
                a0.set(f4 - (f9 * 2.0f), f3, f4, (f9 * 2.0f) + f3);
                canvas.drawArc(a0, 270.0f, 90.0f, !z, paint);
                float f10 = this.f16088G0;
                float f11 = this.f16089H0;
                if (f10 < f11 && !z) {
                    canvas.drawRect(f4 - f10, f3 + f10, f4, f3 + f11, paint);
                }
            }
            float f12 = this.f16089H0;
            if (!(f12 == 0.0f && this.f16088G0 == 0.0f) && !z) {
                float f13 = this.f16088G0;
                canvas.drawRect(f2 + f12, f3, f4 - f13, f3 + Math.max(f12, f13), paint);
            }
            float f14 = this.f16090I0;
            if (f14 != 0.0f) {
                a0.set(f2, f5 - (f14 * 2.0f), (f14 * 2.0f) + f2, f5);
                canvas.drawArc(a0, 90.0f, 90.0f, !z, paint);
                float f15 = this.f16090I0;
                float f16 = this.f16091J0;
                if (f15 < f16 && !z) {
                    canvas.drawRect(f2, f5 - f16, f2 + f15, f5 - f15, paint);
                }
            }
            float f17 = this.f16091J0;
            if (f17 != 0.0f) {
                a0.set(f4 - (f17 * 2.0f), f5 - (f17 * 2.0f), f4, f5);
                canvas.drawArc(a0, 0.0f, 90.0f, !z, paint);
                float f18 = this.f16091J0;
                float f19 = this.f16090I0;
                if (f18 < f19 && !z) {
                    canvas.drawRect(f4 - f18, f5 - f19, f4, f5 - f18, paint);
                }
            }
            float f20 = this.f16090I0;
            if (!(f20 == 0.0f && this.f16091J0 == 0.0f) && !z) {
                canvas.drawRect(f2 + f20, f5 - Math.max(f20, this.f16091J0), f4 - this.f16091J0, f5, paint);
            }
            if (z) {
                canvas.drawLine(f2 + this.f16089H0, f3, f4 - this.f16088G0, f3, paint);
                canvas.drawLine(f2 + this.f16090I0, f5, f4 - this.f16091J0, f5, paint);
                canvas.drawLine(f2, f3 + this.f16089H0, f2, f5 - this.f16090I0, paint);
                canvas.drawLine(f4, f3 + this.f16088G0, f4, f5 - this.f16091J0, paint);
                return;
            }
            float max = f3 + Math.max(this.f16089H0, this.f16088G0);
            float max2 = f5 - Math.max(this.f16090I0, this.f16091J0);
            if (max2 > max) {
                canvas.drawRect(f2, max, f4, max2, paint);
            }
        }
    }

    public float m26033V1() {
        return this.f16090I0;
    }

    public final AbstractC5408k m26032V3() {
        return m25839p8(C5428t.AbstractC5441d.f17874E, C5428t.AbstractC5432b.f17855l, C5428t.AbstractC5429a.f17850g);
    }

    public final int m26031V4() {
        return C11524j.m228N(m25918h6() ? R.id.theme_color_bubbleOut_chatVerticalLine : R.id.theme_color_messageVerticalLine);
    }

    public final boolean m26030V5() {
        return this.f16134e1;
    }

    public final int m26029V6() {
        return m26068R9() ? m26097P() ? m26176H1() - this.f16110U.m27002u() : m26187G1() : this.f16149m0;
    }

    public void mo25321V7() {
    }

    public final void m26028V8(String str) {
        this.f16112V = str;
        boolean M0 = RunnableC5390g.m22983M0(str);
        this.f16125b = C5063c.m24138h(this.f16125b, Log.TAG_PLAYER, M0);
        this.f16085D0 = C5070i.m24061i(str) ? 0 : (int) C7389v0.m16680T1(str, m26068R9() ? C1410y.m37031k(M0) : C1410y.m37020p0(M0));
    }

    public final TdApi.User m26027V9(long j) {
        if (this.f16122a.isOutgoing || !m26072R5()) {
            return this.f16099O0.m2480e2().m1583v2(j);
        }
        return this.f16097N0.m7640s0(j);
    }

    public final void m26025W0(Canvas canvas, float f) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        int i;
        Bitmap bitmap4;
        float f2;
        int i2;
        int i3 = (int) (255.0f * f);
        if (i3 > 0) {
            Paint paint = f16042Q1;
            paint.setAlpha(i3);
            if (!mo26057S9()) {
                int i4 = C1357a0.m37541i(2.0f);
                RectF rectF = this.f16092K0;
                float f3 = i4;
                float f4 = rectF.left - f3;
                float f5 = rectF.top - f3;
                float f6 = rectF.right + f3;
                float f7 = rectF.bottom + f3;
                canvas.drawBitmap(C11524j.m143y0(this.f16089H0) ? f16010A1 : f16012B1, f4, f5, paint);
                canvas.drawBitmap(C11524j.m143y0(this.f16090I0) ? f16018E1 : f16020F1, f4, f7 - bitmap2.getHeight(), paint);
                canvas.drawBitmap(C11524j.m143y0(this.f16088G0) ? f16014C1 : f16016D1, f6 - bitmap3.getWidth(), f5, paint);
                Bitmap bitmap5 = C11524j.m143y0(this.f16091J0) ? f16022G1 : f16024H1;
                canvas.drawBitmap(bitmap5, f6 - bitmap5.getWidth(), f7 - bitmap5.getHeight(), paint);
                paint.setAlpha(255);
                canvas.save();
                int i5 = C1357a0.m37541i(18.0f);
                float width = f4 + bitmap.getWidth();
                float width2 = (f6 - bitmap3.getWidth()) - width;
                if (width2 > 0.0f) {
                    f16026I1.setAlpha(i3);
                    f2 = (this.f16092K0.top - f16036N1.getHeight()) + i5;
                    canvas.translate(width - 0.0f, f2 - 0.0f);
                    i = i5;
                    bitmap4 = bitmap5;
                    canvas.drawRect(0.0f, 0.0f, width2, f16036N1.getHeight(), f16026I1);
                } else {
                    i = i5;
                    bitmap4 = bitmap5;
                    width = 0.0f;
                    f2 = 0.0f;
                }
                float width3 = f4 + bitmap2.getWidth();
                float width4 = (f6 - bitmap4.getWidth()) - width3;
                if (width4 > 0.0f) {
                    f16028J1.setAlpha(i3);
                    i2 = i;
                    float f8 = this.f16092K0.bottom - i2;
                    canvas.translate(width3 - width, f8 - f2);
                    canvas.drawRect(0.0f, 0.0f, width4, f16040P1.getHeight(), f16028J1);
                    width = width3;
                    f2 = f8;
                } else {
                    i2 = i;
                }
                float height = f5 + bitmap.getHeight();
                float height2 = (f7 - bitmap2.getHeight()) - height;
                if (height2 > 0.0f) {
                    f16030K1.setAlpha(i3);
                    float width5 = (this.f16092K0.left - f16034M1.getWidth()) + i2;
                    canvas.translate(width5 - width, height - f2);
                    canvas.drawRect(0.0f, 0.0f, f16034M1.getWidth(), height2, f16030K1);
                    f2 = height;
                    width = width5;
                }
                float height3 = f5 + bitmap3.getHeight();
                float height4 = (f7 - bitmap4.getHeight()) - height3;
                if (height4 > 0.0f) {
                    f16032L1.setAlpha(i3);
                    canvas.translate((this.f16092K0.right - i2) - width, height3 - f2);
                    canvas.drawRect(0.0f, 0.0f, f16038O1.getWidth(), height4, f16032L1);
                }
                canvas.restore();
            }
        }
    }

    public float m26024W1() {
        return this.f16091J0;
    }

    public final int m26023W2() {
        if (!m26068R9()) {
            return C5064d.m24129c(C11524j.m228N(R.id.theme_color_chatBackground), m25762x4(this.f16140h1));
        }
        return C11524j.m228N(m25918h6() ? R.id.theme_color_bubbleOut_background : R.id.theme_color_bubbleIn_background);
    }

    public C7462l1 mo26022W3(long j, View view, int i, int i2, int i3) {
        return null;
    }

    public final int m26021W4() {
        return C11524j.m228N(m25918h6() ? R.id.theme_color_bubbleOut_chatNeutralFillingContent : R.id.theme_color_messageNeutralFillingContent);
    }

    public boolean mo26020W5() {
        if (this.f16122a.editDate > 0) {
            return true;
        }
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.f16119Y0;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<TdApi.Message> it = this.f16119Y0.iterator();
                while (it.hasNext()) {
                    if (it.next().editDate > 0) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public boolean mo25319W7(TdApi.Message message, TdApi.MessageContent messageContent, TdApi.MessageContent messageContent2, boolean z) {
        return false;
    }

    public void m26019W8(float f) {
        if (this.f16152n1 != f) {
            this.f16152n1 = f;
            m26194F5(true);
        }
    }

    public boolean mo26016X0() {
        return false;
    }

    public final int m26015X1() {
        return this.f16097N0.m7766P0(0, R.id.theme_color_bubble_button, R.id.theme_color_bubble_button_noWallpaper, R.id.theme_property_wallpaperOverrideButton);
    }

    public int mo25222X2() {
        return 10;
    }

    public int m26014X3() {
        if ((this.f16125b & Log.TAG_CRASH) != 0) {
            return 0;
        }
        return this.f16094M;
    }

    public final int m26013X4() {
        TdApi.MessageInteractionInfo messageInteractionInfo;
        if (m25851o6() || m25992Z5() || (messageInteractionInfo = this.f16122a.interactionInfo) == null) {
            return 0;
        }
        return messageInteractionInfo.viewCount;
    }

    public final boolean m26012X5() {
        return (this.f16125b & Log.TAG_TDLIB_OPTIONS) != 0;
    }

    public final int m26011X6() {
        int X2;
        int x3;
        if (m26068R9()) {
            X2 = this.f16157q0;
            x3 = C4602c4.m27006q();
        } else {
            X2 = this.f16167v0 + mo25222X2() + m25863n4();
            x3 = m25938f5() ? m25763x3() + mo25743z3() + mo25753y3() : 0;
        }
        return X2 + x3;
    }

    public void mo26010X7(long j) {
    }

    public void m26009X8(String str, String str2, TdApi.TextEntity[] textEntityArr) {
        this.f16168v1 = str;
        C5459x0 D = new C5459x0(str2, m26216D4(), m26134L4(), AbstractC5411l0.m22790E(this.f16099O0, str2, textEntityArr, m25916h8())).m22640D(m26209E0());
        if (m26068R9()) {
            D.m22635a(Log.TAG_YOUTUBE);
        }
        if (!m26068R9()) {
            D.m22635a(64);
        }
        D.m22636H(this.f16101P0);
        this.f16170w1 = D;
    }

    public void mo26007Y(TdApi.ChatType chatType) {
    }

    @Override
    public final void mo35Y0(int i, float f, C3950k kVar) {
        if (i >= 0) {
            mo25340H7(i, f, kVar);
        }
    }

    public final int m26006Y1() {
        return this.f16097N0.m7766P0(0, R.id.theme_color_bubble_buttonRipple, R.id.theme_color_bubble_buttonRipple_noWallpaper, R.id.theme_property_wallpaperOverrideButton);
    }

    public int m26004Y3() {
        int i;
        return ((this.f16125b & Log.TAG_CRASH) != 0 || (i = this.f16128c) == 0) ? this.f16122a.date : i;
    }

    public final int m26003Y4() {
        TdApi.MessageForwardInfo messageForwardInfo;
        if (this.f16129c0 == null) {
            return 0;
        }
        if (m26046T9()) {
            TdApi.Message message = this.f16122a;
            if (!message.isChannelPost && (messageForwardInfo = message.forwardInfo) != null && messageForwardInfo.origin.getConstructor() == 1490730723) {
                return 2;
            }
        }
        return (m26068R9() || C5063c.m24144b(this.f16125b, Log.TAG_CRASH)) ? 1 : 0;
    }

    public final boolean m26002Y5() {
        return (this.f16125b & 4194304) != 0 || this.f16122a.content.getConstructor() == 0;
    }

    public boolean m26001Y6() {
        return false;
    }

    public boolean mo26000Y7(long j, int i) {
        return false;
    }

    public final void m25999Y8(boolean z) {
        int i = this.f16125b;
        if (z != ((i & Log.TAG_CRASH) != 0)) {
            if (z) {
                this.f16125b = i | Log.TAG_CRASH;
            } else {
                this.f16125b = i & (-257);
            }
            if ((this.f16125b & 32) != 0) {
                m25997Z(true);
            }
        }
    }

    public final void m25997Z(boolean z) {
        int j2;
        boolean z2;
        int i;
        int i2;
        int i3;
        if (m26068R9()) {
            boolean O9 = m26098O9();
            int M0 = m26129M0();
            int I0 = m26167I0();
            if (mo25351j5() || ((mo26016X0() && !m26046T9()) || !m26079Q9())) {
                this.f16115W0 = 0;
            } else {
                int K0 = m26147K0(true);
                if (m26046T9()) {
                    i2 = -1;
                } else {
                    i2 = m25938f5() ? this.f16170w1.m22622p() + C1357a0.m37541i(10.0f) : mo25323U1();
                }
                int i4 = i2 + K0;
                boolean R = mo26078R();
                int max = R ? Math.max(M0, K0) : M0;
                int u2 = m25794u2() + I0;
                if (R) {
                    i3 = this.f16151n0;
                } else {
                    i3 = Math.min(this.f16151n0, M0);
                }
                int max2 = Math.max(M0, i4);
                if (i2 == -3) {
                    float e2 = mo25950e2();
                    M0 = C5069h.m24083j(Math.max(M0, mo26128M1() + K0), max, e2);
                    I0 = C5069h.m24083j(I0, u2, e2);
                } else if (i2 != -2) {
                    if (i2 == -1 || i4 > i3) {
                        M0 = max;
                        I0 = u2;
                    } else {
                        M0 = max2;
                    }
                }
                this.f16117X0 = M0;
                this.f16115W0 = K0;
            }
            int k2 = m25894k2();
            int m2 = m25874m2();
            int l2 = m25885l2();
            int i5 = M0 + k2 + l2;
            int j22 = I0 + m2 + m25902j2();
            int J0 = mo25348y0() ? (this.f16096N / 2) - (i5 / 2) : m26157J0();
            int i6 = J0 + i5;
            int L0 = m26137L0();
            int i7 = j22 + L0;
            int i8 = C1357a0.m37541i(C11524j.m240H());
            int i9 = C1357a0.m37541i(C11524j.m238I());
            if (this.f16153o0 != J0 || this.f16155p0 != L0 || this.f16159r0 != i6 || this.f16157q0 != i7 || this.f16161s0 != i9 || this.f16163t0 != i8 || z) {
                this.f16153o0 = J0;
                this.f16155p0 = L0;
                this.f16159r0 = i6;
                this.f16157q0 = i7;
                this.f16161s0 = i9;
                this.f16163t0 = i8;
                if (O9) {
                    this.f16086E0.reset();
                    this.f16087F0.reset();
                }
                if (m26097P()) {
                    int i10 = (this.f16096N - i6) - J0;
                    J0 += i10;
                    i6 += i10;
                }
                if (O9) {
                    boolean S9 = mo26057S9();
                    if (S9) {
                        i8 = i5 / 2;
                        L0 = i7 - i5;
                        i9 = i8;
                    }
                    boolean z3 = !mo25351j5();
                    boolean z4 = (this.f16125b & 2) == 0 || this.f16122a.content.getConstructor() == -69441162;
                    synchronized (this.f16086E0) {
                        boolean P = m26097P();
                        if (S9) {
                            float f = i8;
                            this.f16088G0 = f;
                            this.f16089H0 = f;
                            this.f16090I0 = f;
                            this.f16091J0 = f;
                            float f2 = (J0 + i6) * 0.5f;
                            float f3 = i7 - i8;
                            this.f16086E0.addCircle(f2, f3, f, Path.Direction.CW);
                            this.f16087F0.addCircle(f2, f3, f, Path.Direction.CW);
                            this.f16092K0.set(J0, i7 - i5, i6, i7);
                            this.f16093L0.set(this.f16092K0);
                        } else {
                            int i11 = i9;
                            int i12 = i8;
                            this.f16092K0.set(J0, L0, i6, i7);
                            Path path = this.f16086E0;
                            RectF rectF = this.f16092K0;
                            float f4 = (!z3 || P) ? i12 : i11;
                            this.f16089H0 = f4;
                            float f5 = (!z3 || !P) ? i12 : i11;
                            this.f16088G0 = f5;
                            float f6 = (!z4 || !P) ? i12 : i11;
                            this.f16091J0 = f6;
                            if (!z4 || P) {
                                z2 = z4;
                                i = i12;
                            } else {
                                z2 = z4;
                                i = i11;
                            }
                            float f7 = i;
                            this.f16090I0 = f7;
                            C1359b.m37518a(path, rectF, f4, f5, f6, f7);
                            this.f16093L0.set(J0 + k2, (L0 + m2) - m25823r2(), i6 - l2, i7 - j2);
                            int i13 = (int) (i12 / 1.5d);
                            int i14 = (int) (i11 / 1.5d);
                            C1359b.m37518a(this.f16087F0, this.f16093L0, (!z3 || P) ? i13 : i14, (!z3 || !P) ? i13 : i14, (!z2 || !P) ? i13 : i14, (!z2 || P) ? i13 : i14);
                        }
                    }
                }
                m26159I9(false);
                m26224C7();
            }
        }
    }

    public void mo25996Z0(Canvas canvas, C9552h1 h1Var) {
        Paint paint;
        Paint paint2;
        int i;
        Paint paint3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z = !m26098O9() || mo26057S9();
        if (!(z || (mo26016X0() && !m26046T9()))) {
            int m3 = m25873m3();
            int r3 = m25822r3();
            i2 = m3;
            paint3 = m25814s3();
            i = r3;
            paint2 = C1410y.m37009v();
            paint = C1410y.m37007w();
            i3 = 0;
        } else if (z) {
            int x2 = m25764x2();
            i3 = m25815s2();
            i2 = x2;
            paint3 = C1410y.m37005x(x2);
            paint2 = paint3;
            paint = paint2;
            i = R.id.theme_color_bubble_mediaTimeText;
        } else {
            int N = C11524j.m228N(R.id.theme_color_bubble_mediaOverlayText);
            i3 = C11524j.m228N(R.id.theme_color_bubble_mediaOverlay);
            i2 = N;
            paint3 = C1410y.m37011u(N);
            paint2 = paint3;
            paint = paint2;
            i = R.id.theme_color_bubble_mediaOverlayText;
        }
        int K0 = m26147K0(false);
        boolean o6 = m25851o6();
        boolean Z5 = m25992Z5();
        if (m25974b7()) {
            i4 = m26187G1() + C1357a0.m37541i(10.0f);
        } else {
            i4 = mo26198F1(h1Var, C1357a0.m37541i(11.0f) + K0);
        }
        int u2 = ((this.f16157q0 - m25794u2()) - mo25784v2()) - m25845p2();
        if (i3 != 0) {
            int i8 = u2 - C1357a0.m37541i(4.0f);
            RectF a0 = C1410y.m37050a0();
            int i9 = C1357a0.m37541i(6.0f);
            a0.set(i4 - i9, i8, K0 + i4 + i9, C1357a0.m37541i(21.0f) + i8);
            canvas.drawRoundRect(a0, C1357a0.m37541i(12.0f), C1357a0.m37541i(12.0f), C1410y.m37039g(i3));
            u2 = i8 - C1357a0.m37541i(1.0f);
        }
        int i10 = u2;
        int i11 = i10 + C1357a0.m37541i(11.5f);
        if (m26003Y4() == 1) {
            if (o6) {
                float j = this.f16129c0.m23035j(C1357a0.m37541i(6.0f));
                int f = C1392p.m37230f() + C1357a0.m37541i(3.0f);
                if (m26098O9() && !mo26016X0()) {
                    float f2 = f;
                    if (j > f2) {
                        i4 = (int) (i4 + (j - f2));
                    }
                }
                C1362c.m37487b(canvas, C1392p.m37231e(i), i4 - C1357a0.m37541i(C1392p.f5067g), (i10 + C1357a0.m37541i(5.0f)) - C1357a0.m37541i(C1392p.f5068h), paint3);
                i7 = i4 + f;
                i5 = i11;
            } else {
                float f3 = i4;
                i5 = i11;
                this.f16129c0.m23038f(canvas, f3, i11, 3, 1.0f, h1Var, i);
                i7 = (int) (f3 + this.f16129c0.m23035j(C1357a0.m37541i(6.0f)));
            }
            float f4 = i7;
            this.f16133e0.m23038f(canvas, f4, i5, 3, 1.0f, h1Var, i);
            i4 = (int) (f4 + this.f16133e0.m23035j(C1357a0.m37541i(6.0f)));
        } else {
            i5 = i11;
        }
        if (m26053T2() == 0) {
            float f5 = i4;
            this.f16131d0.m23038f(canvas, f5, i5, 3, 1.0f, h1Var, i);
            i4 = (int) (f5 + this.f16131d0.m23035j(C1357a0.m37541i(6.0f)));
        }
        float f6 = i4;
        this.f16135f0.m23038f(canvas, f6, i5, 3, 1.0f, h1Var, i);
        int j2 = (int) (f6 + this.f16135f0.m23035j(C1357a0.m37541i(3.0f)));
        if (m25739z9()) {
            if (mo26153J5()) {
                C1362c.m37487b(canvas, C1392p.m37231e(i), j2 - C1357a0.m37541i(6.0f), (i10 + C1357a0.m37541i(4.5f)) - C1357a0.m37541i(5.0f), paint3);
            } else {
                C1362c.m37487b(canvas, h1Var.mo14042X(R.drawable.baseline_edit_12, 0), j2, i10 + C1357a0.m37541i(4.5f), paint3);
            }
            j2 += C1392p.m37228h() + C1357a0.m37541i(2.0f);
        }
        String str = this.f16100P;
        if (str != null) {
            canvas.drawText(str, j2, i10 + C1357a0.m37541i(15.5f), C1410y.m37051a(m26092P6(), i2));
            j2 += this.f16173y0;
        }
        if (!m25918h6() && (!o6 || m26003Y4() == 1)) {
            return;
        }
        int i12 = j2 + C1357a0.m37541i(3.5f);
        if (o6) {
            i6 = i10 + C1357a0.m37541i(5.0f);
            i12 += C1357a0.m37541i(1.0f);
        } else {
            i6 = i10 + C1357a0.m37541i(4.5f);
        }
        if (!Z5) {
            if (o6) {
                C1362c.m37487b(canvas, C1392p.m37231e(i), i12 - C1357a0.m37541i(C1392p.f5067g), i6 - C1357a0.m37541i(C1392p.f5068h), paint3);
            } else {
                boolean z2 = m25801t6() && !m25741z7();
                C1362c.m37487b(canvas, z2 ? C1392p.m37224l(i) : C1392p.m37229g(i), i12 - C1357a0.m37541i(C1392p.f5069i), i6 - C1357a0.m37541i(C1392p.f5070j), z2 ? paint2 : paint);
            }
        }
        C1392p.m37223m();
    }

    public final int m25995Z1() {
        return this.f16097N0.m7794I0(0, R.id.theme_color_bubble_buttonText, R.id.theme_color_bubble_buttonText_noWallpaper, R.id.theme_property_wallpaperOverrideButton);
    }

    public int m25994Z2() {
        return this.f16169w0;
    }

    public TdApi.Message m25993Z3() {
        return this.f16122a;
    }

    public final boolean m25992Z5() {
        TdApi.MessageSendingState messageSendingState = this.f16122a.sendingState;
        return messageSendingState != null && messageSendingState.getConstructor() == -1741887228;
    }

    public final boolean m25991Z6(gd.AbstractC4761s4 r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: gd.AbstractC4761s4.m25991Z6(gd.s4, boolean):boolean");
    }

    public void mo25990Z7(long j, long j2, boolean z) {
    }

    public final void m25989Z8(float f) {
        if (this.f16136f1 != f) {
            this.f16136f1 = f;
            m26194F5(false);
        }
    }

    @Override
    public final void mo13519a() {
        m25751y5();
    }

    public void mo25221a0(int i) {
    }

    public final void m25987a1(C9552h1 h1Var, Canvas canvas, int i, int i2, int i3, float f) {
        Drawable X;
        int S2 = i3 + (m26064S2() / 2);
        int G2 = m26186G2();
        float f2 = S2;
        C1362c.m37487b(canvas, h1Var.mo14042X(R.drawable.templarian_outline_comment_22, G2), i + C1357a0.m37541i(12.0f), f2 - (X.getMinimumHeight() / 2.0f), C1411z.m36997c(G2, f));
        C1359b.m37508k(canvas, i2 - C1357a0.m37541i(12.0f), f2, C5064d.m24131a(f, C11524j.m228N(G2)), 5);
    }

    public Path m25986a2() {
        return this.f16087F0;
    }

    public final int m25985a3() {
        if (m26068R9()) {
            return C11524j.m228N(m25918h6() ? R.id.theme_color_bubbleOut_background : R.id.theme_color_bubbleIn_background);
        }
        int N = C11524j.m228N(R.id.theme_color_chatBackground);
        float f = this.f16140h1;
        return f > 0.0f ? C5064d.m24129c(N, C5064d.m24131a(f, C11524j.m178i())) : N;
    }

    public TdApi.Message m25984a4(long j) {
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.f16119Y0;
            if (arrayList != null) {
                Iterator<TdApi.Message> it = arrayList.iterator();
                while (it.hasNext()) {
                    TdApi.Message next = it.next();
                    if (next.f25406id == j) {
                        return next;
                    }
                }
            }
            TdApi.Message message = this.f16122a;
            if (message.f25406id == j) {
                return message;
            }
            return null;
        }
    }

    public int m25983a5() {
        return this.f16096N;
    }

    public boolean m25982a6() {
        return this.f16122a.forwardInfo != null;
    }

    public final View$OnClickListenerC2971rh m25981a7() {
        return this.f16097N0.m7645r0();
    }

    public int mo25980a8(long j, long j2, int i) {
        return 0;
    }

    public void m25979a9(AbstractC4769h hVar) {
        this.f16130c1 = hVar;
    }

    public final void m25978aa() {
        C1379j0.m37360H(m25846p1(), true);
    }

    public C9357x2.C9365h m25977b0(View view, final C9357x2.AbstractC9363f fVar) {
        return mo4347s().m14584H3().m8984h(view, this.f16101P0).m8948u(new C9357x2.AbstractC9363f() {
            @Override
            public final void mo8098f1(View view2, Rect rect) {
                AbstractC4761s4.this.m25780v6(fVar, view2, rect);
            }
        }).m8962e(-2.0f).m8961f(m26209E0()).m8958i(m26096P0()).m8968G(m25916h8());
    }

    public void mo25220b1(C9552h1 h1Var, Canvas canvas, int i, int i2, int i3) {
        float f = i2 + 5.0f;
        canvas.drawCircle(i + 5.0f, f, 5.0f, C1410y.m37039g(C11524j.m235J0()));
        canvas.drawCircle((i + i3) - 5.0f, f, 5.0f, C1410y.m37039g(C11524j.m235J0()));
    }

    public int mo25219b2() {
        return f16062g2;
    }

    public void mo25976b5(int i, int i2, int i3) {
    }

    public boolean m25975b6() {
        return C7316a.m17049l(this.f16122a.chatId) && C7321e.m16947g1(this.f16122a.content);
    }

    public final boolean m25974b7() {
        return C4403w.m27984G2();
    }

    public void mo25973b8(long j, float f, boolean z) {
    }

    public void m25972b9(boolean z) {
        if (z != m26143K5()) {
            if (z) {
                this.f16125b |= 2;
            } else {
                this.f16125b &= -3;
            }
            if ((this.f16125b & 32) != 0) {
                m25997Z(true);
            }
        }
    }

    public final boolean m25971ba(TdApi.Message message) {
        int a1;
        TdApi.Message message2 = this.f16122a;
        long j = message2.mediaAlbumId;
        return j != 0 && j == message.mediaAlbumId && message2.ttl == message.ttl && !m25975b6() && !m26002Y5() && !mo25841p6() && (a1 = C4779t2.m25557a1(this.f16122a)) != 0 && C4779t2.m25557a1(message) == a1;
    }

    @Override
    public final C10930q6 mo4348c() {
        return this.f16099O0;
    }

    public final void m25970c0() {
        int i;
        if (m25938f5()) {
            int c3 = (m26045U() ? this.f16151n0 : mo25218c3()) - C1357a0.m37541i(10.0f);
            if (m26068R9()) {
                i = f16062g2 + f16063h2;
            } else {
                i = C1357a0.m37541i(8.0f);
            }
            int i2 = c3 - i;
            this.f16170w1.m22642B(i2);
            TextPaint d = m26216D4().m22664d();
            this.f16172x1 = TextUtils.ellipsize(this.f16168v1, d, i2, TextUtils.TruncateAt.END).toString();
            this.f16174y1 = (int) C7389v0.m16680T1(this.f16168v1, d);
        }
    }

    public void mo25312c1(C9552h1 h1Var, Canvas canvas, int i, int i2, int i3, C6238b bVar) {
        float f = i2 + 5.0f;
        canvas.drawCircle(i + 5.0f, f, 5.0f, C1410y.m37039g(C11524j.m235J0()));
        canvas.drawCircle((i + i3) - 5.0f, f, 5.0f, C1410y.m37039g(C11524j.m235J0()));
    }

    public final int m25969c2() {
        return this.f16097N0.m7766P0(0, R.id.theme_color_bubble_date, R.id.theme_color_bubble_date_noWallpaper, R.id.theme_property_wallpaperOverrideDate);
    }

    public int mo25218c3() {
        return this.f16151n0;
    }

    public int m25968c4() {
        final SparseIntArray sparseIntArray = new SparseIntArray();
        m25790u6(new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                AbstractC4761s4.m25770w6(sparseIntArray, (TdApi.Message) obj);
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

    public final boolean m25967c5() {
        return this.f16101P0.mo28225g();
    }

    public boolean m25966c6() {
        if (m25928g6()) {
            TdApi.Message message = this.f16122a;
            if (message.ttlExpiresIn < message.ttl) {
                return true;
            }
        }
        return false;
    }

    public final void m25965c7(AbstractC9323v4<?> v4Var) {
        if (!m26096P0().m9291ac(v4Var)) {
            v4Var.mo417Z8();
        }
    }

    public boolean m25964c8(long j) {
        m26120M9(j, j, true);
        return this.f16122a.f25406id == j;
    }

    public final AbstractC4761s4 m25963c9(C4728o7 o7Var, long j) {
        this.f16125b |= 4194304;
        this.f16164t1 = o7Var.f15918a.date;
        this.f16166u1 = o7Var.f15920c;
        this.f16100P = m26208E1();
        m26028V8(m26230C1());
        return this;
    }

    @Override
    public boolean mo8363d(C5375a aVar) {
        return m25945e7();
    }

    public final void m25962d0() {
        int i;
        if (m26046T9() && this.f16106S != null) {
            boolean z = false;
            this.f16143j0 = C7389v0.m16680T1(this.f16137g0, m26068R9() ? m26092P6() : m26101O6(false));
            if (m26068R9()) {
                i = m26045U() ? this.f16151n0 : mo25218c3() + ((m25885l2() + m25894k2()) - ((f16063h2 + f16062g2) * 2));
            } else {
                i = (this.f16096N - f16069n2) - f16072q2;
            }
            float f = i;
            float f2 = (f - this.f16143j0) - f16019E2;
            if (m26003Y4() == 2) {
                f2 -= this.f16129c0.m23035j(C1357a0.m37541i(6.0f)) + this.f16133e0.m23035j(C1357a0.m37541i(6.0f));
            }
            if (m25899j6() && !m26250A1()) {
                z = true;
            }
            String b = this.f16106S.mo25215b();
            boolean z2 = !(this.f16106S instanceof C4774s6);
            long j = this.f16122a.viaBotUserId;
            if (!z) {
                f = f2;
            }
            this.f16139h0 = m26082Q6(b, z2, z, false, j, (int) f, true);
            if (z) {
                this.f16141i0 = new RunnableC5390g.C5392b(this.f16099O0, C4403w.m27926V0(m26096P0(), this.f16122a.forwardInfo.publicServiceAnnouncementType), m25916h8(), (int) f2, m25920h4(), m26155J2()).m22886d().m22868v().m22869u(new C4703m4(this)).m22884f();
            } else {
                this.f16141i0 = null;
            }
        }
    }

    public void mo25961d1(C9552h1 h1Var, Canvas canvas, int i, int i2, int i3, AbstractC6264v vVar, AbstractC6264v vVar2) {
        float f = i2 + 5.0f;
        canvas.drawCircle(i + 5.0f, f, 5.0f, C1410y.m37039g(C11524j.m235J0()));
        canvas.drawCircle((i + i3) - 5.0f, f, 5.0f, C1410y.m37039g(C11524j.m235J0()));
    }

    public final int m25960d2() {
        return this.f16097N0.m7794I0(0, R.id.theme_color_bubble_dateText, R.id.theme_color_bubble_dateText_noWallpaper, R.id.theme_property_wallpaperOverrideDate);
    }

    public int m25959d3() {
        return this.f16165u0;
    }

    public int m25958d4() {
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.f16119Y0;
            if (arrayList == null || arrayList.isEmpty()) {
                return 1;
            }
            return this.f16119Y0.size();
        }
    }

    public final boolean m25957d5() {
        C4341g gVar;
        return this.f16101P0.mo28225g() || ((gVar = this.f16103Q0) != null && gVar.mo28225g());
    }

    public boolean m25956d6() {
        return this.f16127b1 != 0;
    }

    public final boolean m25955d7() {
        return m26156J1() != null;
    }

    public final boolean m25954d8(View view, RunnableC5390g gVar, C5455v0 v0Var, HandlerC10770jj.C10788q qVar) {
        if (v0Var.m22687g() == null || !(v0Var.m22687g().m22784j() instanceof Long)) {
            return m25906i8(view, gVar, v0Var, qVar, null);
        }
        this.f16097N0.m7645r0().m32522Wp(this.f16122a.viaBotUserId, this.f16104R);
        return true;
    }

    public boolean m25953d9(long j, boolean z) {
        boolean z2;
        synchronized (this) {
            int m5 = m25871m5(j);
            if (m5 >= 0) {
                z2 = this.f16119Y0.get(m5).isPinned != z;
                if (z2) {
                    this.f16119Y0.get(m5).isPinned = z;
                    z2 = true;
                }
                if (z2 && !z) {
                    Iterator<TdApi.Message> it = this.f16119Y0.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().isPinned) {
                                z2 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } else if (m5 != -2) {
                return false;
            } else {
                TdApi.Message message = this.f16122a;
                z2 = message.isPinned != z;
                message.isPinned = z;
            }
            if (!z2) {
                return false;
            }
            this.f16135f0.m23023y(z, m25945e7());
            return true;
        }
    }

    public final void m25952e0() {
        this.f16137g0 = m26219D1();
        if ((this.f16125b & 32) != 0) {
            m25962d0();
        }
    }

    public float mo25950e2() {
        throw new RuntimeException();
    }

    public final int m25949e3() {
        return this.f16167v0;
    }

    public int m25948e4(long j, long j2) {
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.f16119Y0;
            int i = 0;
            if (arrayList == null || arrayList.isEmpty()) {
                return 0;
            }
            Iterator<TdApi.Message> it = this.f16119Y0.iterator();
            while (it.hasNext()) {
                long j3 = it.next().f25406id;
                if (j3 > j) {
                    if (j3 >= j2) {
                        break;
                    }
                    i++;
                }
            }
            return i;
        }
    }

    public final boolean m25947e5() {
        return (this.f16125b & Log.TAG_VOICE) != 0;
    }

    public final boolean m25946e6() {
        return this.f16122a.sendingState != null;
    }

    public final boolean m25945e7() {
        return m25967c5() && m26096P0().m9300Z9().m9353Ra() && C5063c.m24144b(this.f16125b, 32) && C1379j0.m37357K();
    }

    public void m25944e8() {
        m25761x5(true);
    }

    public void m25943e9(boolean z) {
        this.f16125b = C5063c.m24138h(this.f16125b, 8, z);
        m26139K9(false);
    }

    public final void m25942f0() {
        int i = this.f16096N;
        if ((this.f16125b & Log.TAG_CRASH) != 0 || m26068R9()) {
            m26161I6();
            m26142K6();
        }
        if ((this.f16125b & Log.TAG_CAMERA) != 0) {
            float f = i / 2.0f;
            C5386e eVar = this.f16126b0;
            float T1 = eVar != null ? C7389v0.m16680T1(eVar.f17711a, m26106O1(eVar.f17712b)) : 0.0f;
            int i2 = (int) (f - (((C1357a0.m37541i(7.0f) + T1) + f16043Q2.getMinimumWidth()) / 2.0f));
            this.f16145k0 = i2;
            this.f16147l0 = i2 + ((int) T1) + C1357a0.m37541i(2.0f);
        }
        this.f16082A0 = m26164I3() + C1357a0.m37541i(3.5f);
        this.f16084C0 = m26164I3() + C1357a0.m37541i(3.0f);
        if ((this.f16125b & Log.TAG_CRASH) != 0) {
            this.f16175z0 = this.f16171x0 - C1357a0.m37541i(6.0f);
            this.f16083B0 = this.f16171x0 - C1357a0.m37541i(3.0f);
            return;
        }
        this.f16175z0 = i - C1357a0.m37541i(17.0f);
        this.f16083B0 = i - C1357a0.m37541i(15.0f);
        if (this.f16108T != null && !m26088Q()) {
            this.f16082A0 += RunnableC9651s3.m7861x();
            this.f16084C0 += RunnableC9651s3.m7861x();
        }
    }

    public boolean m25941f1(Canvas canvas, int i, int i2, float f, float f2) {
        int i3;
        TextPaint textPaint;
        int i4;
        boolean z = false;
        if (!m25947e5()) {
            return false;
        }
        if (f2 == 0.0f) {
            return true;
        }
        RectF a0 = C1410y.m37050a0();
        if (m26068R9()) {
            int c2 = m25969c2();
            int d2 = m25960d2();
            int i5 = C1357a0.m37541i(8.0f);
            a0.set((i - (this.f16085D0 / 2)) - i5, i2 + C1357a0.m37541i(5.0f), i + (this.f16085D0 / 2) + i5, i2 + C1357a0.m37541i(5.0f) + C1357a0.m37541i(26.0f));
            float i6 = C1357a0.m37541i(C11524j.m242G());
            canvas.drawRoundRect(a0, i6, i6, C1410y.m37039g(C5064d.m24131a(f2, c2)));
            i4 = i - (this.f16085D0 / 2);
            i3 = (i2 + f16076u2) - C1357a0.m37541i(3.0f);
            if ((524288 & this.f16125b) != 0) {
                z = true;
            }
            textPaint = C1410y.m37029l(z, d2);
        } else {
            if (f > 0.0f) {
                int i7 = C1357a0.m37541i(10.0f);
                a0.set((i - (this.f16085D0 / 2)) - i7, i2 + C1357a0.m37541i(8.0f), i + (this.f16085D0 / 2) + i7, i2 + C1357a0.m37541i(8.0f) + C1357a0.m37541i(26.0f));
                float i8 = C1357a0.m37541i(C11524j.m216T());
                float f3 = f2 * f;
                canvas.drawRoundRect(a0, i8, i8, C1410y.m37039g(C5064d.m24131a(f3, C11524j.m228N(R.id.theme_color_chatBackground))));
                canvas.drawRoundRect(a0, i8, i8, C1410y.m37053Y(C5064d.m24131a(f3, C11524j.m223P0()), Math.max(1, C1357a0.m37541i(0.5f))));
            }
            i4 = i - (this.f16085D0 / 2);
            i3 = i2 + f16076u2;
            if ((this.f16125b & Log.TAG_CAMERA) != 0) {
                i3 += C1357a0.m37541i(1.0f);
            }
            if ((this.f16125b & Log.TAG_PLAYER) != 0) {
                z = true;
            }
            textPaint = C1410y.m37020p0(z);
        }
        int i9 = (f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1));
        int alpha = i9 != 0 ? textPaint.getAlpha() : 255;
        if (i9 != 0) {
            textPaint.setAlpha((int) (alpha * f2));
        }
        canvas.drawText(this.f16112V, i4, i3, textPaint);
        if (i9 != 0) {
            textPaint.setAlpha(alpha);
        }
        return true;
    }

    public C6227d<AbstractC4770i> m25939f4() {
        C6227d<AbstractC4770i> dVar = this.f16132d1;
        if (dVar != null) {
            return dVar;
        }
        C6227d<AbstractC4770i> dVar2 = new C6227d<>();
        this.f16132d1 = dVar2;
        return dVar2;
    }

    public boolean m25938f5() {
        return (this.f16168v1 == null || this.f16170w1 == null) ? false : true;
    }

    public final boolean m25937f6() {
        return mo4348c().m2562Yc((long) m25911i3(), TimeUnit.SECONDS) >= TimeUnit.MINUTES.toMillis(5L);
    }

    public final boolean m25936f7() {
        if (!m26068R9()) {
            return true;
        }
        if (m25811s6() && m25981a7().m32279pk().m26300a()) {
            return false;
        }
        TdApi.Chat chat = this.f16124a1;
        if (chat != null) {
            int constructor = chat.type.getConstructor();
            if (constructor != -1472570774) {
                if (constructor == 973884508) {
                    return !m25928g6();
                }
                if (constructor == 1579049844) {
                    return ((this.f16125b & 33554432) != 0 && !m25928g6()) || m25890k6();
                }
            } else if (!m26002Y5()) {
                return this.f16099O0.m2283q7(this.f16124a1) && !m25928g6();
            } else {
                return true;
            }
        }
        return !m25928g6() && m26061S5();
    }

    public boolean mo25217f8(C9552h1 h1Var, MotionEvent motionEvent) {
        C4602c4 c4Var;
        if (m25929g5() && m25800t7(true)) {
            RunnableC5390g gVar = this.f16114W;
            if (gVar != null && gVar.m22967U0(h1Var, motionEvent)) {
                return true;
            }
            RunnableC5390g gVar2 = this.f16116X;
            if (gVar2 != null && gVar2.m22967U0(h1Var, motionEvent)) {
                return true;
            }
        }
        if (m26046T9()) {
            RunnableC5390g gVar3 = this.f16141i0;
            if (gVar3 != null && gVar3.m22967U0(h1Var, motionEvent)) {
                return true;
            }
            RunnableC5390g gVar4 = this.f16139h0;
            if (gVar4 != null && gVar4.m22967U0(h1Var, motionEvent)) {
                return true;
            }
        }
        if (m25938f5() && this.f16170w1.m22614x(h1Var, motionEvent)) {
            return true;
        }
        if (m26002Y5() || (c4Var = this.f16110U) == null || c4Var.m27001v() || !this.f16110U.m27000w(h1Var, motionEvent)) {
            return this.f16111U0.m28246e(h1Var, motionEvent);
        }
        return true;
    }

    public final void m25935f9(C8112b bVar, boolean z) {
        if (z) {
            this.f16125b |= Log.TAG_CONTACT;
        } else {
            this.f16125b &= -131073;
        }
        m25791u5();
    }

    public void m25934g0(int i) {
        if (i != 0 && this.f16096N != i) {
            this.f16096N = i;
            if (m26068R9()) {
                this.f16149m0 = m26157J0();
                this.f16151n0 = ((i - (C4184b.f14114g ? f16058c2 : f16057b2)) - m26157J0()) - C1357a0.m37541i(m25811s6() ? 8.0f : 56.0f);
                if (m26046T9()) {
                    this.f16149m0 += C1357a0.m37541i(11.0f);
                    this.f16151n0 -= C1357a0.m37541i(11.0f);
                }
                int k2 = m25894k2();
                int l2 = m25885l2();
                this.f16149m0 += k2;
                this.f16151n0 -= k2 + l2;
            } else {
                if (!m26046T9()) {
                    this.f16149m0 = f16066k2;
                    this.f16167v0 = ((this.f16125b & Log.TAG_CRASH) != 0 ? f16067l2 : f16070o2) + m26164I3();
                } else {
                    this.f16149m0 = f16069n2;
                    this.f16167v0 = m26174H3() + m26217D3();
                }
                this.f16151n0 = (i - f16072q2) - this.f16149m0;
                if (m25899j6()) {
                    this.f16167v0 += m25813s4();
                }
            }
            m26159I9(true);
            if (m26045U()) {
                if (this.f16108T != null && !m26088Q()) {
                    this.f16167v0 += RunnableC9651s3.m7861x();
                }
                m25942f0();
                m25962d0();
                if (m26088Q()) {
                    mo25221a0(this.f16169w0);
                    m25914i0();
                } else {
                    m25914i0();
                    mo25221a0(this.f16169w0);
                }
            } else {
                if (this.f16108T != null) {
                    this.f16167v0 += RunnableC9651s3.m7861x();
                }
                mo25221a0(this.f16169w0);
                m25942f0();
                m25962d0();
                m25914i0();
            }
            m25970c0();
            m25997Z(true);
            if (m26068R9()) {
                this.f16167v0 = this.f16155p0 + m25874m2();
                if (this.f16108T != null && !m26088Q()) {
                    this.f16167v0 += m25834q2();
                }
                if (m25800t7(true) && (this.f16125b & Log.TAG_CRASH) != 0) {
                    this.f16167v0 += m25912i2();
                    if (m25899j6()) {
                        this.f16167v0 += m25813s4();
                    }
                }
                if (m26046T9()) {
                    this.f16167v0 += m25940f2();
                }
            }
            m25924h0();
            this.f16098O = m26118N0();
            this.f16125b |= 32;
        }
    }

    public final void m25933g1(Canvas canvas) {
        int i;
        int A3 = m26248A3();
        if (m26068R9()) {
            i = m26187G1() + f16062g2 + f16063h2;
        } else {
            i = this.f16165u0;
        }
        RectF a0 = C1410y.m37050a0();
        a0.set(i, A3, C1357a0.m37541i(3.0f) + i, m25763x3() + A3);
        canvas.drawRoundRect(a0, C1357a0.m37541i(1.5f), C1357a0.m37541i(1.5f), C1410y.m37039g(m26031V4()));
        int i2 = i + C1357a0.m37541i(10.0f);
        TextPaint d = m26216D4().m22664d();
        d.setColor(C11524j.m228N(R.id.theme_color_textNeutral));
        String str = this.f16172x1;
        if (str == null) {
            str = this.f16168v1;
        }
        canvas.drawText(str, i2, C1357a0.m37541i(15.0f) + A3, d);
        this.f16170w1.m22628j(canvas, i2, A3 + C1357a0.m37541i(22.0f), null, 1.0f);
    }

    public final int m25932g2() {
        return this.f16097N0.m7766P0(0, R.id.theme_color_bubble_mediaReply, R.id.theme_color_bubble_mediaReply_noWallpaper, R.id.theme_property_wallpaperOverrideMediaReply);
    }

    public final int m25931g3(boolean z) {
        int i;
        if (z) {
            i = m25918h6() ? R.id.theme_color_bubbleOut_chatCorrectChosenFilling : R.id.theme_color_messageCorrectChosenFilling;
        } else {
            i = m25918h6() ? R.id.theme_color_bubbleOut_chatCorrectFilling : R.id.theme_color_messageCorrectFilling;
        }
        return C11524j.m228N(i);
    }

    public final long m25930g4() {
        return this.f16122a.messageThreadId;
    }

    public boolean m25929g5() {
        return !mo25351j5() && (this.f16125b & Log.TAG_CRASH) != 0;
    }

    public boolean m25928g6() {
        return this.f16122a.isOutgoing && !m26002Y5();
    }

    public final boolean m25927g7() {
        return m26046T9() || mo26016X0() || m25938f5();
    }

    public final void m25926g8(C7319d dVar) {
        this.f16099O0.m2485dd().m3469r7(m26096P0(), dVar.m17027c(), dVar, m25916h8());
    }

    public void m25925g9(boolean z) {
        if (z) {
            this.f16125b |= Log.TAG_YOUTUBE;
        } else {
            this.f16125b &= -129;
        }
    }

    public final void m25924h0() {
        TdApi.ReplyMarkup replyMarkup;
        TdApi.Message v1 = m25785v1();
        if (v1 == null || (replyMarkup = v1.replyMarkup) == null || replyMarkup.getConstructor() != -619317658) {
            C4602c4 c4Var = this.f16110U;
            if (c4Var != null) {
                c4Var.m27015h();
                return;
            }
            return;
        }
        if (this.f16110U == null) {
            C4602c4 c4Var2 = new C4602c4(this, true);
            this.f16110U = c4Var2;
            c4Var2.m27024B(this.f16101P0);
        }
        if (!m26068R9() || !m26098O9()) {
            this.f16110U.m26997z(v1.f25406id, (TdApi.ReplyMarkupInlineKeyboard) v1.replyMarkup, mo25218c3(), this.f16151n0);
        } else {
            this.f16110U.m26997z(v1.f25406id, (TdApi.ReplyMarkupInlineKeyboard) v1.replyMarkup, m26176H1() - m26187G1(), this.f16151n0 + m25894k2() + m25885l2());
        }
    }

    public void m25923h1(View view, Canvas canvas) {
        if (this.f16136f1 != 0.0f) {
            canvas.drawRect(0.0f, m25765x1(), view.getMeasuredWidth(), m25866n1(), C1410y.m37039g(m25762x4(this.f16136f1)));
        }
    }

    public final int m25922h2() {
        return this.f16097N0.m7794I0(0, R.id.theme_color_bubble_mediaReplyText, R.id.theme_color_bubble_mediaReplyText_noWallpaper, R.id.theme_property_wallpaperOverrideMediaReply);
    }

    public final int m25921h3(boolean z) {
        int i;
        if (z) {
            i = m25918h6() ? R.id.theme_color_bubbleOut_chatCorrectChosenFillingContent : R.id.theme_color_messageCorrectChosenFillingContent;
        } else {
            i = m25918h6() ? R.id.theme_color_bubbleOut_chatCorrectFillingContent : R.id.theme_color_messageCorrectFillingContent;
        }
        return C11524j.m228N(i);
    }

    public boolean mo25919h5(String str) {
        return false;
    }

    public final boolean m25918h6() {
        return m26068R9() && m25928g6() && !m26133L5() && !m26002Y5();
    }

    public boolean mo25917h7() {
        return false;
    }

    public HandlerC10770jj.C10788q m25916h8() {
        return new HandlerC10770jj.C10788q().m3315p(this);
    }

    public int m25915h9(long r5, org.drinkless.p210td.libcore.telegram.TdApi.MessageContent r7) {
        throw new UnsupportedOperationException("Method not decompiled: gd.AbstractC4761s4.m25915h9(long, org.drinkless.td.libcore.telegram.TdApi$MessageContent):int");
    }

    public final void m25914i0() {
        if (this.f16108T != null) {
            int c3 = m26045U() ? this.f16151n0 : mo25218c3();
            if (m26088Q()) {
                c3 = ((this.f16096N - mo25218c3()) - C1357a0.m37541i(18.0f)) - ((C4184b.f14114g ? f16058c2 : f16057b2) * 2);
            }
            this.f16108T.m7902K(c3);
        }
    }

    public final void m25913i1(C9552h1 h1Var, Canvas canvas) {
        int w4 = m25771w4(this.f16097N0.m7747U0());
        C9565i1 parentMessageViewGroup = h1Var.getParentMessageViewGroup();
        if (parentMessageViewGroup != null) {
            parentMessageViewGroup.setSelectableTranslation(w4);
        }
        if (w4 != 0) {
            canvas.save();
            canvas.translate(w4, 0.0f);
        }
        boolean z = this.f16150m1 != 0.0f;
        if (z) {
            canvas.save();
            canvas.translate(this.f16150m1, 0.0f);
        }
        mo25903j1(h1Var, canvas, this.f16165u0, this.f16167v0, this.f16169w0);
        if (z) {
            canvas.restore();
            m25875m1(h1Var, canvas);
        } else if (this.f16152n1 != 0.0f) {
            m25875m1(h1Var, canvas);
        }
        if (m26068R9() && m26079Q9()) {
            mo25996Z0(canvas, h1Var);
        }
        if (w4 != 0) {
            canvas.restore();
        }
    }

    public final int m25911i3() {
        return this.f16122a.date;
    }

    public final int m25910i4() {
        return C11524j.m228N(m25918h6() ? R.id.theme_color_bubbleOut_chatNegativeFilling : R.id.theme_color_messageNegativeLine);
    }

    public boolean m25909i5() {
        return (this.f16125b & Log.TAG_CAMERA) != 0;
    }

    public final boolean m25908i6() {
        if (m25811s6()) {
            return false;
        }
        if (this.f16122a.isPinned) {
            return true;
        }
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.f16119Y0;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<TdApi.Message> it = this.f16119Y0.iterator();
                while (it.hasNext()) {
                    if (it.next().isPinned) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public final boolean m25907i7() {
        return !this.f16122a.isOutgoing && (C4779t2.m25478l3(this.f16124a1) || m26061S5());
    }

    public final boolean m25906i8(View view, RunnableC5390g gVar, C5455v0 v0Var, HandlerC10770jj.C10788q qVar, AbstractC6264v vVar) {
        if (m26250A1()) {
            this.f16106S.mo25211g(view, gVar, v0Var, qVar, vVar);
            return true;
        } else if (this.f16102Q.m4199q()) {
            this.f16099O0.m2485dd().m3429v7(m26096P0(), this.f16102Q.m4207i(), qVar);
            return true;
        } else if (!this.f16102Q.m4202n()) {
            return false;
        } else {
            this.f16099O0.m2485dd().m3529l7(m26096P0(), this.f16102Q.m4213c(), null, qVar);
            return true;
        }
    }

    public int m25905i9(long j, int i, TdApi.ReplyMarkup replyMarkup) {
        boolean z;
        boolean z2;
        boolean z3;
        synchronized (this) {
            int m5 = m25871m5(j);
            if (m5 >= 0) {
                z3 = m5 == this.f16119Y0.size() - 1;
                TdApi.Message message = this.f16119Y0.get(m5);
                z2 = message.editDate != 0;
                message.editDate = i;
                z = !C7321e.m16960c0(message.replyMarkup, replyMarkup);
                message.replyMarkup = replyMarkup;
            } else if (m5 == -2) {
                TdApi.Message message2 = this.f16122a;
                z2 = message2.editDate != 0;
                message2.editDate = i;
                z = !C7321e.m16960c0(message2.replyMarkup, replyMarkup);
                this.f16122a.replyMarkup = replyMarkup;
                z3 = true;
            } else {
                z3 = false;
                z2 = false;
                z = false;
            }
        }
        if (z3 || z) {
            if (z3 && !z2 && (m26068R9() || (this.f16125b & Log.TAG_CRASH) != 0)) {
                m26142K6();
            }
            if (z) {
                m25924h0();
                int J3 = mo25354J3();
                this.f16098O = m26118N0();
                return mo25354J3() == J3 ? 1 : 2;
            } else if (mo26000Y7(j, i) || !z2) {
                return 1;
            }
        } else if (mo26000Y7(j, i)) {
            return 1;
        }
        return 0;
    }

    @Override
    public void mo8362j(C5375a aVar, boolean z) {
        if (z && C5063c.m24144b(this.f16125b, 32)) {
            if (aVar == this.f16129c0) {
                int Y4 = m26003Y4();
                if (Y4 != 1) {
                    if (Y4 == 2) {
                        m25962d0();
                    }
                } else if (m26068R9() || (this.f16125b & Log.TAG_CRASH) != 0) {
                    m26142K6();
                }
            } else if (((aVar == this.f16131d0 && m26053T2() == 0) || aVar == this.f16133e0 || aVar == this.f16135f0) && (m26068R9() || (this.f16125b & Log.TAG_CRASH) != 0)) {
                m26142K6();
            }
        }
        if (C1379j0.m37357K()) {
            m25791u5();
        } else {
            m25828q8();
        }
    }

    public final void m25904j0() {
        this.f16100P = m26208E1();
        if ((this.f16125b & 32) == 0) {
            return;
        }
        if (m26068R9() || (this.f16125b & Log.TAG_CRASH) != 0) {
            m26142K6();
        }
    }

    public void mo25903j1(C9552h1 h1Var, Canvas canvas, int i, int i2, int i3) {
    }

    public final int m25902j2() {
        return m26046T9() ? f16062g2 + f16063h2 : mo25219b2();
    }

    public final int m25900j4() {
        return C11524j.m228N(m25918h6() ? R.id.theme_color_bubbleOut_chatNegativeFillingContent : R.id.theme_color_messageNegativeLineContent);
    }

    public boolean mo25351j5() {
        return false;
    }

    public final boolean m25899j6() {
        TdApi.MessageForwardInfo messageForwardInfo = this.f16122a.forwardInfo;
        return messageForwardInfo != null && !C5070i.m24061i(messageForwardInfo.publicServiceAnnouncementType) && !this.f16102Q.m4199q();
    }

    public final boolean m25898j7() {
        return false;
    }

    public final void m25897j8() {
        if (this.f16122a.forwardInfo == null) {
            return;
        }
        if (m25890k6()) {
            TdApi.MessageForwardInfo messageForwardInfo = this.f16122a.forwardInfo;
            m25926g8(new C7319d(messageForwardInfo.fromChatId, messageForwardInfo.fromMessageId));
            return;
        }
        HandlerC10770jj dd = this.f16099O0.m2485dd();
        AbstractC9323v4<?> P0 = m26096P0();
        long j = this.f16122a.forwardInfo.fromChatId;
        TdApi.MessageForwardInfo messageForwardInfo2 = this.f16122a.forwardInfo;
        dd.m3469r7(P0, j, new C7319d(messageForwardInfo2.fromChatId, messageForwardInfo2.fromMessageId), m25916h8());
    }

    public boolean m25896j9(long r3, org.drinkless.p210td.libcore.telegram.TdApi.MessageInteractionInfo r5) {
        throw new UnsupportedOperationException("Method not decompiled: gd.AbstractC4761s4.m25896j9(long, org.drinkless.td.libcore.telegram.TdApi$MessageInteractionInfo):boolean");
    }

    public final boolean m25895k0() {
        TdApi.Message message = this.f16122a;
        return (message.canBeDeletedOnlyForSelf || message.canBeDeletedForAllUsers) && m26067S();
    }

    public final int m25894k2() {
        return m26046T9() ? f16062g2 + f16063h2 : mo25219b2();
    }

    public int m25893k3() {
        return C1357a0.m37541i(m26068R9() ? 8.0f : 10.0f);
    }

    public final TdApi.Message m25892k4() {
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.f16119Y0;
            if (arrayList == null || arrayList.isEmpty()) {
                return this.f16122a;
            }
            ArrayList<TdApi.Message> arrayList2 = this.f16119Y0;
            return arrayList2.get(arrayList2.size() - 1);
        }
    }

    public void m25891k5(boolean z) {
        m25766x0();
        m25989Z8(1.0f);
        if (z) {
            m26080Q8();
        }
    }

    public final boolean m25890k6() {
        return this.f16099O0.m2475e7(this.f16122a.chatId);
    }

    public boolean mo25298k7() {
        return false;
    }

    public final void m25889k8() {
        this.f16101P0.mo28227e();
    }

    public void m25888k9(long j) {
        synchronized (this) {
            int m5 = m25871m5(j);
            if (m5 >= 0) {
                C4779t2.m25497i5(this.f16119Y0.get(m5));
            } else if (m5 == -2) {
                C4779t2.m25497i5(this.f16122a);
            } else {
                return;
            }
            m26200E9(true);
            mo26010X7(j);
        }
    }

    public boolean m25887l0() {
        TdApi.Message message = this.f16122a;
        return message.canBeForwarded && (message.content.getConstructor() != 303973492 || ((TdApi.MessageLocation) this.f16122a.content).expiresIn == 0) && !m26002Y5();
    }

    public final void m25886l1(View view, Canvas canvas) {
        if (this.f16140h1 == 1.0f) {
            canvas.drawRect(0.0f, m25765x1(), view.getMeasuredWidth(), m25866n1(), C1410y.m37039g(m25762x4(1.0f)));
        } else if (this.f16142i1 != null) {
            canvas.save();
            canvas.clipRect(0, this.f16142i1.f16191a, view.getMeasuredWidth(), m25866n1());
            C4772k kVar = this.f16142i1;
            float f = kVar.f16192b;
            float f2 = kVar.f16194d;
            float f3 = this.f16140h1;
            canvas.drawCircle(f + (f2 * f3), kVar.f16193c + (kVar.f16195e * f3), kVar.f16196f * f3, C1410y.m37039g(m25762x4(1.0f)));
            canvas.restore();
        }
    }

    public final int m25885l2() {
        return m26046T9() ? f16062g2 + f16063h2 : mo25219b2();
    }

    public int m25884l3() {
        return this.f16085D0;
    }

    public final long[] m25883l4(long j) {
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.f16119Y0;
            if (arrayList == null || arrayList.size() <= 1) {
                return null;
            }
            long[] jArr = new long[this.f16119Y0.size() - 1];
            int i = 0;
            Iterator<TdApi.Message> it = this.f16119Y0.iterator();
            while (it.hasNext()) {
                long j2 = it.next().f25406id;
                if (j2 != j) {
                    jArr[i] = j2;
                    i++;
                }
            }
            Arrays.sort(jArr);
            return jArr;
        }
    }

    public final void m25882l5(long j) {
        this.f16097N0.m7645r0().m32619Pk(new C7319d(this.f16122a.chatId, j), m26179G9());
    }

    public boolean m25881l6() {
        return this.f16122a.schedulingState != null;
    }

    public final boolean m25880l7(int i) {
        return i + this.f16115W0 > (mo26078R() ? this.f16151n0 : Math.min(this.f16151n0, this.f16117X0));
    }

    public final void m25879l8(final int i, final int i2) {
        m25849o8(new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                AbstractC4761s4.this.m26182G6(i, i2, (C9552h1) obj);
            }
        });
    }

    public final int m25878l9(long j, long j2) {
        return mo25980a8(j, j2, mo25354J3());
    }

    public final boolean m25876m0() {
        if (!m25861n6()) {
            TdApi.Message message = this.f16122a;
            if (message.sendingState == null && !message.isOutgoing && this.f16099O0.m2900D2(message.chatId) && !m26002Y5()) {
                return true;
            }
        }
        return false;
    }

    public final void m25875m1(View view, Canvas canvas) {
        float f;
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        Drawable drawable;
        float f2 = this.f16150m1;
        if (f2 == 0.0f) {
            int abs = (int) (Math.abs(this.f16152n1) * 255.0f);
            f = Math.signum(this.f16152n1) * view.getMeasuredWidth();
            i = C5064d.m24130b(abs, C11524j.m184g());
            f16046S1.setAlpha(abs);
        } else {
            i = C11524j.m184g();
            f16046S1.setAlpha(255);
            f = f2;
        }
        boolean z = true;
        if (!m26068R9()) {
            if (m26068R9()) {
                i3 = this.f16155p0;
                i2 = this.f16157q0;
            } else {
                i3 = m26164I3() - f16074s2;
                i2 = m25866n1();
            }
            int i5 = i2 - i3;
            float f3 = i5;
            int i6 = ((int) (f3 * 0.5f)) + i3;
            boolean G2 = C4403w.m27984G2();
            int i7 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i7 <= 0) {
                z = false;
            }
            if (G2 != z) {
                drawable = f16041P2;
                str = f16045R2;
                i4 = f16035M2;
            } else {
                drawable = f16039O2;
                str = f16047S2;
                i4 = f16037N2;
            }
            float f4 = i4;
            Drawable drawable2 = drawable;
            if (i7 > 0) {
                String str2 = str;
                canvas.drawRect(0.0f, i3, f, i2, C1410y.m37039g(i));
                float minimumWidth = (f - f16029J2) - drawable2.getMinimumWidth();
                int i8 = C1357a0.m37541i(12.0f) + drawable2.getMinimumHeight();
                if (i8 > i5) {
                    canvas.save();
                    float f5 = f3 / i8;
                    canvas.scale(f5, f5, minimumWidth, i6);
                }
                Paint L = C1410y.m37066L(C5064d.m24131a(f16046S1.getAlpha() / 255.0f, C11524j.m228N(R.id.theme_color_messageSwipeContent)));
                if (G2) {
                    canvas.save();
                    canvas.scale(-1.0f, 1.0f, (drawable2.getMinimumWidth() / 2) + minimumWidth, i6);
                }
                C1362c.m37487b(canvas, drawable2, minimumWidth, i6 - ((int) (drawable2.getMinimumHeight() * 0.5f)), L);
                if (G2) {
                    canvas.restore();
                }
                canvas.drawText(str2, (minimumWidth - f16031K2) - f4, i6 + f16033L2, f16046S1);
                if (i8 > i5) {
                    canvas.restore();
                    return;
                }
                return;
            }
            float measuredWidth = view.getMeasuredWidth();
            float f6 = f + measuredWidth;
            String str3 = str;
            canvas.drawRect(f6, i3, measuredWidth, i2, C1410y.m37039g(i));
            float f7 = f16029J2 + f6;
            int i9 = C1357a0.m37541i(12.0f) + drawable2.getMinimumHeight();
            if (i9 > i5) {
                canvas.save();
                float f8 = f3 / i9;
                canvas.scale(f8, f8, f7, i6);
            }
            Paint L2 = C1410y.m37066L(C5064d.m24131a(f16046S1.getAlpha() / 255.0f, C11524j.m228N(R.id.theme_color_messageSwipeContent)));
            if (G2) {
                canvas.save();
                canvas.scale(-1.0f, 1.0f, (drawable2.getMinimumWidth() / 2) + f7, i6);
            }
            C1362c.m37487b(canvas, drawable2, f7, (i6 - ((int) (drawable2.getMinimumHeight() * 0.5f))) + C1357a0.m37541i(0.5f), L2);
            if (G2) {
                canvas.restore();
            }
            canvas.drawText(str3, (int) (f6 + f16029J2 + drawable2.getMinimumWidth() + f4), i6 + f16033L2, f16046S1);
            if (i9 > i5) {
                canvas.restore();
            }
        } else if (this.f16150m1 != 0.0f) {
            int i10 = C1357a0.m37541i(42.0f);
            float f9 = this.f16150m1;
            float f10 = f9 > 0.0f ? this.f16156p1 : this.f16154o1;
            float d = C5069h.m24089d(Math.abs(f9) / i10) * f10;
            float f11 = (f10 * 0.4f) + 0.6f;
            if (d != 0.0f) {
                int i11 = this.f16155p0;
                int i12 = i11 + ((this.f16157q0 - i11) / 2);
                float f12 = this.f16150m1;
                float measuredWidth2 = f12 > 0.0f ? f12 / 2.0f : view.getMeasuredWidth() + (this.f16150m1 / 2.0f);
                float S = C11524j.m218S() * (1.0f - this.f16097N0.m7645r0().m32662Lr().getBackgroundTransparency());
                float i13 = C1357a0.m37541i(16.0f) * f11;
                if (S > 0.0f) {
                    canvas.drawCircle(measuredWidth2, i12, i13, C1410y.m37053Y(C5064d.m24131a(S * d, C11524j.m167m0()), C1357a0.m37541i(1.0f)));
                }
                float f13 = i12;
                canvas.drawCircle(measuredWidth2, f13, i13, C1410y.m37039g(C5064d.m24131a(d, m26015X1())));
                boolean G22 = C4403w.m27984G2();
                if (this.f16150m1 <= 0.0f) {
                    z = false;
                }
                Drawable drawable3 = G22 != z ? f16041P2 : f16039O2;
                Paint L3 = C1410y.m37066L(C5064d.m24131a(d, m25995Z1()));
                canvas.save();
                canvas.scale((C4403w.m27984G2() ? -0.8f : 0.8f) * f11, f11 * 0.8f, measuredWidth2, f13);
                C1362c.m37487b(canvas, drawable3, measuredWidth2 - (drawable3.getMinimumWidth() / 2), i12 - (drawable3.getMinimumHeight() / 2), L3);
                canvas.restore();
            }
        }
    }

    public final int m25874m2() {
        int r2 = m25823r2();
        return r2 != 0 ? r2 : mo25219b2();
    }

    public final int m25873m3() {
        return C11524j.m228N(m25864n3());
    }

    public final int m25872m4() {
        return C11524j.m228N(m26068R9() ? m25918h6() ? R.id.theme_color_bubbleOut_outline : R.id.theme_color_bubbleIn_outline : R.id.theme_color_separator);
    }

    public final int m25871m5(long j) {
        ArrayList<TdApi.Message> arrayList = this.f16119Y0;
        if (arrayList != null) {
            int i = 0;
            Iterator<TdApi.Message> it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next().f25406id == j) {
                    return i;
                }
                i++;
            }
        }
        return this.f16122a.f25406id == j ? -2 : -1;
    }

    public final boolean m25870m6() {
        return C7316a.m17051j(this.f16122a.chatId);
    }

    public boolean mo25869m7() {
        return false;
    }

    public boolean mo25295m8(View view, float f, float f2) {
        boolean z = false;
        if (mo25841p6()) {
            return false;
        }
        C4602c4 c4Var = this.f16110U;
        boolean y = c4Var != null ? c4Var.m26998y(view) : false;
        if (m25938f5()) {
            if (this.f16170w1.m22643A(view) || y) {
                z = true;
            }
            y = z;
        }
        this.f16111U0.m28249b(view, f, f2);
        return y;
    }

    public boolean m25868m9(boolean z) {
        int i = this.f16098O;
        if (z) {
            int i2 = this.f16125b;
            if ((i2 & Log.TAG_EMOJI) == 0) {
                int i3 = i2 | Log.TAG_EMOJI;
                this.f16125b = i3;
                if ((i3 & 32) != 0) {
                    this.f16098O = m26118N0();
                }
            }
        } else {
            int i4 = this.f16125b;
            if ((i4 & Log.TAG_EMOJI) != 0) {
                int i5 = i4 & (-4097);
                this.f16125b = i5;
                if ((i5 & 32) != 0) {
                    this.f16098O = m26118N0();
                }
            }
        }
        return i != this.f16098O;
    }

    public final int m25866n1() {
        return this.f16098O - m25783v3();
    }

    public Path m25865n2() {
        if (mo26066S0()) {
            return null;
        }
        return this.f16086E0;
    }

    public final int m25864n3() {
        return m25854o3(R.id.theme_color_textLight);
    }

    public final int m25863n4() {
        return m26068R9() ? m26229C2() : f16071p2;
    }

    public final boolean m25860n7() {
        return (this.f16125b & Log.TAG_CRASH) != 0;
    }

    public final void m25859n8(final boolean z) {
        m25849o8(new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                ((C9552h1) obj).m8338d1(z);
            }
        });
    }

    public boolean m25858n9(boolean z) {
        int i = this.f16098O;
        if (z) {
            if (!this.f16095M0) {
                this.f16095M0 = true;
                if ((this.f16125b & 32) != 0) {
                    this.f16098O = m26118N0();
                }
            }
        } else if (this.f16095M0) {
            this.f16095M0 = false;
            if ((this.f16125b & 32) != 0) {
                this.f16098O = m26118N0();
            }
        }
        return i != this.f16098O;
    }

    public boolean m25856o0() {
        return this.f16122a.canBeSaved;
    }

    public long mo25855o1(float f, float f2) {
        return 0L;
    }

    public final int m25854o3(int i) {
        return m26068R9() ? m25918h6() ? R.id.theme_color_bubbleOut_time : R.id.theme_color_bubbleIn_time : i;
    }

    public final int m25853o4() {
        int i = 0;
        if (m25811s6()) {
            return 0;
        }
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.f16119Y0;
            if (arrayList == null || arrayList.isEmpty()) {
                return this.f16122a.isPinned ? 1 : 0;
            }
            Iterator<TdApi.Message> it = this.f16119Y0.iterator();
            while (it.hasNext()) {
                if (it.next().isPinned) {
                    i++;
                }
            }
            return i;
        }
    }

    public final boolean m25851o6() {
        TdApi.MessageSendingState messageSendingState = this.f16122a.sendingState;
        if (messageSendingState != null && messageSendingState.getConstructor() == -1381803582) {
            C11115xb Ma = this.f16099O0.m2748Ma();
            TdApi.Message message = this.f16122a;
            if (!Ma.m1519c(message.chatId, message.f25406id)) {
                return true;
            }
        }
        return false;
    }

    public final boolean m25850o7() {
        return this.f16166u1 || (this.f16122a.content.getConstructor() == 0 && ((C4728o7) this.f16122a.content).f15920c);
    }

    public final void m25849o8(AbstractC5918j<C9552h1> jVar) {
        List<Reference<View>> n = this.f16101P0.m28237n();
        if (n != null) {
            for (int size = n.size() - 1; size >= 0; size--) {
                View view = n.get(size).get();
                if (view != null) {
                    jVar.mo1330a((C9552h1) view);
                } else {
                    n.remove(size);
                }
            }
        }
    }

    public final void m25848o9(boolean z, float f, boolean z2, boolean z3) {
        C3950k kVar = z ? this.f16160r1 : this.f16158q1;
        float f2 = z ? this.f16156p1 : this.f16154o1;
        if (z2) {
            if (kVar == null) {
                if (f2 != f) {
                    kVar = new C3950k(z ? -4 : -5, this, C2057b.f7280b, 110L, f2);
                    if (z) {
                        this.f16160r1 = kVar;
                    } else {
                        this.f16158q1 = kVar;
                    }
                } else {
                    return;
                }
            }
            kVar.m29544i(f);
            return;
        }
        if (kVar != null) {
            kVar.m29541l(f);
        }
        if (f2 != f) {
            if (z) {
                this.f16156p1 = f;
            } else {
                this.f16154o1 = f;
            }
            if (z3) {
                m25791u5();
            }
        }
    }

    public final boolean m25847p0() {
        return (!m25946e6() || m25796u0()) && (this.f16125b & Log.TAG_TDLIB_FILES) == 0 && !(this instanceof C4583a5) && m26067S() && !mo25841p6();
    }

    public final View m25846p1() {
        return this.f16101P0.mo28226f();
    }

    public final int m25845p2() {
        return Math.round(m26064S2() * this.f16105R0.m29584g());
    }

    public final AbstractC5408k m25844p3() {
        return m25839p8(C5428t.AbstractC5441d.f17873D, C5428t.AbstractC5432b.f17854k, C5428t.AbstractC5429a.f17849f);
    }

    public final int m25843p4() {
        return m26068R9() ? m25918h6() ? R.id.theme_color_bubbleOut_pressed : R.id.theme_color_bubbleIn_pressed : R.id.theme_color_messageSelection;
    }

    public boolean mo25841p6() {
        return false;
    }

    public boolean mo25840p7() {
        return false;
    }

    public final AbstractC5408k m25839p8(C5428t.AbstractC5441d dVar, C5428t.AbstractC5432b bVar, C5428t.AbstractC5429a aVar) {
        return m26068R9() ? m25918h6() ? bVar : aVar : dVar;
    }

    public void m25838p9(long r19, boolean r21, boolean r22, float r23, float r24, gd.AbstractC4761s4.AbstractC4771j r25) {
        throw new UnsupportedOperationException("Method not decompiled: gd.AbstractC4761s4.m25838p9(long, boolean, boolean, float, float, gd.s4$j):void");
    }

    public boolean m25836q0() {
        TdApi.Message message = this.f16122a;
        return message.canBeEdited && C4779t2.m25633O(message.content) && m26067S() && m25981a7().m32671Li();
    }

    public TdApi.Message m25835q1(long j) {
        return m25824r1(j, null);
    }

    public final int m25834q2() {
        return RunnableC9651s3.m7861x() + C1357a0.m37541i(m26098O9() ? 3.0f : 6.0f);
    }

    public final int m25833q3() {
        return C11524j.m228N(m25822r3());
    }

    public final int m25832q4() {
        return C11524j.m228N(m25821r4());
    }

    public boolean mo25829q7() {
        return false;
    }

    public final void m25828q8() {
        this.f16101P0.mo28224h();
    }

    public final boolean m25825r0() {
        return this.f16122a.canGetViewers;
    }

    public TdApi.Message m25824r1(long j, long[] jArr) {
        if (this.f16122a.f25406id == j || (jArr != null && C5062b.m24162j(jArr, j))) {
            return this.f16122a;
        }
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.f16119Y0;
            if (arrayList != null) {
                Iterator<TdApi.Message> it = arrayList.iterator();
                while (it.hasNext()) {
                    TdApi.Message next = it.next();
                    long j2 = next.f25406id;
                    if (j2 == j || (jArr != null && C5062b.m24162j(jArr, j2))) {
                        return next;
                    }
                }
            }
            return null;
        }
    }

    public final int m25823r2() {
        int i;
        if (m25929g5() && m25800t7(true) && (this.f16125b & Log.TAG_CRASH) != 0) {
            i = Math.max(f16062g2, mo25219b2());
        } else if (this.f16108T == null || m26088Q()) {
            i = 0;
        } else if (mo26066S0()) {
            i = C1357a0.m37541i(3.0f);
        } else {
            i = Math.max(f16062g2, mo25219b2());
        }
        return (i != 0 || !m26046T9()) ? i : Math.max(f16062g2 + f16063h2, mo25219b2());
    }

    public final int m25822r3() {
        return m25854o3(R.id.theme_color_iconLight);
    }

    public final int m25821r4() {
        return m26068R9() ? m25918h6() ? R.id.theme_color_bubbleOut_progress : R.id.theme_color_bubbleIn_progress : R.id.theme_color_progress;
    }

    public final void m25820r5() {
        int i;
        C5322e eVar;
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.f16119Y0;
            eVar = null;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<TdApi.Message> it = this.f16119Y0.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    TdApi.Message next = it.next();
                    if (this.f16097N0.m7677k1(next.chatId, next.f25406id, this)) {
                        if (eVar == null) {
                            eVar = new C5322e(this.f16119Y0.size() - i2);
                        }
                        eVar.m23275a(next.f25406id);
                    } else {
                        i2++;
                    }
                }
            }
        }
        if (eVar != null) {
            int l = eVar.m23264l();
            for (i = 0; i < l; i++) {
                m25838p9(eVar.m23270f(i), true, false, -1.0f, -1.0f, null);
            }
            return;
        }
        C9678w2 w2Var = this.f16097N0;
        TdApi.Message message = this.f16122a;
        if (w2Var.m7677k1(message.chatId, message.f25406id, this)) {
            m25838p9(this.f16122a.f25406id, true, false, -1.0f, -1.0f, null);
        }
    }

    public boolean mo25289r6(TdApi.Message message, TdApi.MessageContent messageContent) {
        return message.content.getConstructor() == messageContent.getConstructor();
    }

    public final boolean m25819r7() {
        TdApi.Message message;
        TdApi.MessageForwardInfo messageForwardInfo;
        if (((this.f16125b & 33554432) != 0 || m26124M5() || m25890k6()) && (messageForwardInfo = (message = this.f16122a).forwardInfo) != null) {
            long j = messageForwardInfo.fromChatId;
            if (j != 0 && messageForwardInfo.fromMessageId != 0 && j != message.chatId) {
                return true;
            }
        }
        return false;
    }

    public final void m25818r8(boolean z) {
        C4341g gVar;
        this.f16101P0.mo28224h();
        if (z && (gVar = this.f16103Q0) != null) {
            gVar.mo28224h();
        }
    }

    public boolean m25817r9(TdApi.Message message, long j) {
        TdApi.Message a4 = m25984a4(j);
        if (a4 == null || a4.f25406id != j) {
            return false;
        }
        m26077R0(message, a4);
        C4602c4 c4Var = this.f16110U;
        if (c4Var != null) {
            c4Var.m27023C(j, message.f25406id);
        }
        m25904j0();
        m26120M9(j, message.f25406id, false);
        m26139K9(true);
        return true;
    }

    @Override
    public final AbstractView$OnTouchListenerC7889a mo4347s() {
        return this.f16097N0.m7645r0().mo4347s();
    }

    public boolean mo25350s0() {
        TdApi.Message message = this.f16122a;
        return (message.f25406id == 0 || message.chatId == 0 || (this.f16125b & Log.TAG_PAINT) != 0) ? false : true;
    }

    public TdApi.WebPage mo25816s1(String str) {
        return null;
    }

    public final int m25815s2() {
        return this.f16097N0.m7766P0(0, R.id.theme_color_bubble_mediaTime, R.id.theme_color_bubble_mediaTime_noWallpaper, R.id.theme_property_wallpaperOverrideTime);
    }

    public final Paint m25814s3() {
        return m26068R9() ? m25918h6() ? C1410y.m37013t() : C1410y.m37015s() : C1410y.m37067K();
    }

    public final boolean m25811s6() {
        return C5063c.m24144b(this.f16125b, 8);
    }

    public final boolean m25810s7() {
        return m25800t7(true);
    }

    public boolean mo25809s8() {
        return false;
    }

    public final int m25808s9(org.drinkless.p210td.libcore.telegram.TdApi.Message r14, long r15) {
        throw new UnsupportedOperationException("Method not decompiled: gd.AbstractC4761s4.m25808s9(org.drinkless.td.libcore.telegram.TdApi$Message, long):int");
    }

    public boolean mo25806t0() {
        return C4779t2.m25619Q(this.f16122a) && m26067S();
    }

    public final long m25805t1(float f, float f2) {
        return mo25855o1(f - m25771w4(this.f16097N0.m7747U0()), f2);
    }

    public final int m25804t3() {
        int i = 0;
        if ((this.f16125b & Log.TAG_CAMERA) == 0) {
            return 0;
        }
        int i2 = f16077v2;
        if (m26068R9()) {
            i = C1357a0.m37541i(3.5f);
        }
        return i + i2;
    }

    public int m25803t4() {
        return this.f16151n0;
    }

    public boolean m25801t6() {
        return (this.f16125b & 1) == 0 || this.f16122a.sendingState != null;
    }

    public final boolean m25800t7(boolean z) {
        if (!m26068R9() || (m26098O9() && ((this.f16122a.viaBotUserId != 0 && !m26046T9() && z) || ((this.f16125b & 33554432) != 0 && !m25928g6())))) {
            return true;
        }
        if (!m26098O9() || mo26069R8()) {
            return false;
        }
        if (mo25841p6() && m26068R9()) {
            return true;
        }
        if (m25899j6() && m26250A1()) {
            return true;
        }
        if (m25928g6() && this.f16102Q.m4205k()) {
            return true;
        }
        TdApi.Chat chat = this.f16124a1;
        if (chat != null) {
            int constructor = chat.type.getConstructor();
            if (constructor == -1472570774) {
                return !m25928g6() && !((TdApi.ChatTypeSupergroup) this.f16124a1.type).isChannel;
            }
            if (constructor == 973884508) {
                return !m25928g6();
            }
        }
        return !m25928g6() && m26061S5();
    }

    public void m25799t8() {
        if (this.f16096N != 0) {
            m26223C8();
        } else {
            m25934g0(C1357a0.m37543g());
        }
    }

    public void m25798t9(boolean z) {
        this.f16125b = C5063c.m24138h(this.f16125b, Log.TAG_CAMERA, z);
        this.f16126b0 = z ? new C5386e(m26087Q1()) : null;
        if (C5063c.m24144b(this.f16125b, 32)) {
            m26223C8();
            m26140K8();
            m25791u5();
        }
    }

    public final boolean m25796u0() {
        throw new UnsupportedOperationException("Method not decompiled: gd.AbstractC4761s4.m25796u0():boolean");
    }

    public final TdApi.Message m25795u1() {
        TdApi.MessageInteractionInfo messageInteractionInfo;
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.f16119Y0;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<TdApi.Message> it = this.f16119Y0.iterator();
                while (it.hasNext()) {
                    TdApi.Message next = it.next();
                    if (next.canGetMessageThread && (messageInteractionInfo = next.interactionInfo) != null && messageInteractionInfo.replyInfo != null) {
                        return next;
                    }
                }
            }
            TdApi.Message message = this.f16122a;
            if (!message.canGetMessageThread) {
                message = null;
            }
            return message;
        }
    }

    public int m25792u4() {
        return this.f16149m0;
    }

    public final void m25791u5() {
        this.f16101P0.invalidate();
    }

    public void m25790u6(AbstractC5918j<TdApi.Message> jVar, boolean z) {
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.f16119Y0;
            if (arrayList == null || arrayList.isEmpty()) {
                jVar.mo1330a(this.f16122a);
            } else if (z) {
                for (int size = this.f16119Y0.size() - 1; size >= 0; size--) {
                    jVar.mo1330a(this.f16119Y0.get(size));
                }
            } else {
                Iterator<TdApi.Message> it = this.f16119Y0.iterator();
                while (it.hasNext()) {
                    jVar.mo1330a(it.next());
                }
            }
        }
    }

    public final boolean m25789u8(float f, float f2) {
        float f3;
        float f4;
        int m = this.f16101P0.m28238m();
        View p1 = m25846p1();
        if (m == 0 || p1 == null || !this.f16101P0.mo28225g() || p1.getParent() == null || p1.getMeasuredHeight() > ((View) p1.getParent()).getMeasuredHeight() * 2.5f) {
            return false;
        }
        int x1 = m25765x1();
        float f5 = (int) (m * 0.5f);
        float n1 = ((int) ((m25866n1() - x1) * 0.5f)) + x1;
        if (f == -1.0f && f2 == -1.0f) {
            f = f5;
            f4 = n1;
        } else {
            f4 = f2;
        }
        float f6 = f5 - f;
        float f7 = n1 - f4;
        float sqrt = ((float) Math.sqrt((m * m) + (f3 * f3))) * 0.5f;
        C4772k kVar = this.f16142i1;
        if (kVar == null) {
            this.f16142i1 = new C4772k(x1, f, f4, f6, f7, sqrt);
            return true;
        }
        kVar.f16191a = x1;
        kVar.f16192b = f;
        kVar.f16193c = f4;
        kVar.f16194d = f6;
        kVar.f16195e = f7;
        kVar.f16196f = sqrt;
        return true;
    }

    public final void m25788u9(Object obj) {
        this.f16109T0 = obj;
    }

    public boolean m25786v0() {
        return (this.f16125b & 67108864) == 0;
    }

    public TdApi.Message m25785v1() {
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.f16119Y0;
            if (arrayList == null || arrayList.isEmpty()) {
                return this.f16122a;
            }
            Iterator<TdApi.Message> it = this.f16119Y0.iterator();
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

    public int mo25784v2() {
        return C1357a0.m37541i(8.0f);
    }

    public final int m25783v3() {
        if (this.f16095M0) {
            return C1357a0.m37541i(7.0f);
        }
        int i = 0;
        if ((this.f16125b & Log.TAG_EMOJI) == 0) {
            return 0;
        }
        int i2 = C1357a0.m37541i(7.0f);
        if (m25981a7().m32445co()) {
            i = C1357a0.m37541i(48.0f);
        }
        return i + i2;
    }

    public final int m25782v4() {
        return 0;
    }

    public final void m25781v5(int i, int i2, int i3, int i4) {
        this.f16101P0.mo28228d(i, i2, i3, i4);
    }

    public final boolean m25779v7() {
        TdApi.Chat chat = this.f16124a1;
        if (chat == null || chat.type.getConstructor() != 1579049844) {
            return false;
        }
        long j = ((TdApi.ChatTypePrivate) this.f16124a1.type).userId;
        return this.f16099O0.m2379k7(j) || this.f16099O0.m2480e2().m1567z2(j);
    }

    public boolean m25777v9(long j) {
        int i = this.f16125b;
        boolean z = (i & 1) != 0;
        if (this.f16122a.f25406id > j) {
            this.f16125b = i & (-2);
            return z && !m25741z7();
        }
        this.f16125b = i | 1;
        return !z && !m25741z7();
    }

    public final boolean m25775w0() {
        return this.f16122a.canGetStatistics;
    }

    public final C3950k m25774w1(long j) {
        synchronized (this) {
            C6035e<C3950k> eVar = this.f16146k1;
            if (eVar == null) {
                return null;
            }
            return eVar.m21505f(j);
        }
    }

    public final int m25773w2() {
        if (!m26068R9() || !m26079Q9()) {
            return 0;
        }
        return this.f16115W0;
    }

    public final String[] m25772w3() {
        HashSet hashSet = new HashSet();
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.f16119Y0;
            if (arrayList == null || arrayList.isEmpty()) {
                TdApi.MessageSendingState messageSendingState = this.f16122a.sendingState;
                if (messageSendingState instanceof TdApi.MessageSendingStateFailed) {
                    TdApi.MessageSendingStateFailed messageSendingStateFailed = (TdApi.MessageSendingStateFailed) messageSendingState;
                    hashSet.add(C4779t2.m25378z5(new TdApi.Error(messageSendingStateFailed.errorCode, messageSendingStateFailed.errorMessage)));
                }
            } else {
                Iterator<TdApi.Message> it = this.f16119Y0.iterator();
                while (it.hasNext()) {
                    TdApi.MessageSendingState messageSendingState2 = it.next().sendingState;
                    if (messageSendingState2 instanceof TdApi.MessageSendingStateFailed) {
                        TdApi.MessageSendingStateFailed messageSendingStateFailed2 = (TdApi.MessageSendingStateFailed) messageSendingState2;
                        hashSet.add(C4779t2.m25378z5(new TdApi.Error(messageSendingStateFailed2.errorCode, messageSendingStateFailed2.errorMessage)));
                    }
                }
            }
        }
        if (hashSet.isEmpty()) {
            return null;
        }
        return (String[]) hashSet.toArray(new String[0]);
    }

    public final int m25771w4(float f) {
        if (!m26068R9() || m25918h6() || mo25351j5()) {
            return 0;
        }
        return (int) (C1357a0.m37541i(28.0f) * f);
    }

    public boolean mo25349w7() {
        return this.f16129c0 != null && !m25851o6();
    }

    public void m25769w8() {
        if (!m26002Y5()) {
            Client r4 = this.f16099O0.m2270r4();
            TdApi.Message message = this.f16122a;
            r4.m14783o(new TdApi.OpenMessageContent(message.chatId, message.f25406id), this.f16099O0.m2392ja());
            if (!m25928g6()) {
                m26200E9(true);
            }
        }
    }

    public final void m25766x0() {
        C3950k kVar = this.f16148l1;
        if (kVar != null) {
            kVar.m29542k();
            this.f16148l1 = null;
        }
    }

    public int m25765x1() {
        return m26164I3() - (((this.f16125b & Log.TAG_CRASH) == 0 || m26068R9()) ? 0 : f16074s2);
    }

    public final int m25764x2() {
        return this.f16097N0.m7794I0(0, R.id.theme_color_bubble_mediaTimeText, R.id.theme_color_bubble_mediaTimeText_noWallpaper, R.id.theme_property_wallpaperOverrideTime);
    }

    public final int m25763x3() {
        return C1357a0.m37541i(22.0f) + this.f16170w1.getHeight() + C1357a0.m37541i(2.0f);
    }

    public int m25762x4(float f) {
        if (m26068R9()) {
            return C5064d.m24131a(f, C5064d.m24128d(C11524j.m228N(R.id.theme_color_bubble_messageSelection), C11524j.m228N(R.id.theme_color_bubble_messageSelectionNoWallpaper), this.f16097N0.m7645r0().m32662Lr().getBackgroundTransparency()));
        }
        return C5064d.m24131a(f, C5064d.m24129c(C11524j.m228N(R.id.theme_color_chatBackground), C11524j.m178i()));
    }

    public final void m25761x5(boolean z) {
        C4341g gVar;
        this.f16101P0.invalidate();
        if (z && (gVar = this.f16103Q0) != null) {
            gVar.invalidate();
        }
    }

    public final boolean m25759x7() {
        return m26089P9() || m26046T9() || this.f16108T != null;
    }

    public final void m25758x8(long j) {
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.f16119Y0;
            if (arrayList != null) {
                Iterator<TdApi.Message> it = arrayList.iterator();
                while (it.hasNext()) {
                    TdApi.Message next = it.next();
                    if (next.f25406id == j) {
                        next.containsUnreadMention = false;
                        return;
                    }
                }
            }
            TdApi.Message message = this.f16122a;
            if (message.f25406id == j) {
                message.containsUnreadMention = false;
            }
        }
    }

    public final boolean m25757x9() {
        boolean z;
        synchronized (this) {
            ArrayList<TdApi.Message> arrayList = this.f16119Y0;
            z = true;
            if (arrayList != null && arrayList.size() > 1) {
                z = false;
            }
        }
        return z;
    }

    public boolean mo25348y0() {
        return false;
    }

    public final void m25755y1(boolean z) {
        if (this.f16144j1 != null) {
            int p = this.f16146k1.m21496p();
            for (int i = 0; i < p; i++) {
                C3950k q = this.f16146k1.m21495q(i);
                if (q != null && q.m29537p(1)) {
                    q.m29558A(1, false);
                }
            }
            if (z) {
                m25827q9(0.0f);
            }
        }
    }

    public float m25754y2() {
        return this.f16089H0;
    }

    public int mo25753y3() {
        return C1357a0.m37541i(2.0f);
    }

    public final float m25752y4(C3950k kVar) {
        if (kVar == null || (kVar.m29536q() & 2) != 0.0f || m25757x9()) {
            return 0.0f;
        }
        return kVar.m29538o();
    }

    public final void m25751y5() {
        m25849o8(new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                AbstractC4761s4.this.m25750y6((C9552h1) obj);
            }
        });
    }

    public boolean mo25749y7() {
        return false;
    }

    public void m25748y8() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (m25740z8()) {
                m26140K8();
            } else {
                m25818r8(true);
            }
        } else if (m25740z8()) {
            m26140K8();
        } else {
            m25761x5(true);
        }
    }

    public boolean m25747y9(MotionEvent motionEvent) {
        return false;
    }

    public final int m25745z0() {
        int i;
        int i2;
        if (m26068R9()) {
            i2 = m26187G1();
            i = m26176H1() - m26187G1();
        } else {
            i2 = m25959d3();
            i = mo25218c3();
        }
        return i2 + (i / 2);
    }

    public float m25744z2() {
        return this.f16088G0;
    }

    public int mo25743z3() {
        return C1357a0.m37541i(4.0f);
    }

    public final void m25742z5(final int i) {
        m25849o8(new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                AbstractC4761s4.this.m26245A6(i, (C9552h1) obj);
            }
        });
    }

    public boolean m25741z7() {
        return (this.f16125b & Log.TAG_NDK) != 0 || m26072R5();
    }

    public boolean m25740z8() {
        if ((this.f16125b & 32) != 0) {
            m26159I9(true);
            mo25221a0(this.f16169w0);
            m25997Z(false);
            int i = this.f16098O;
            int N0 = m26118N0();
            this.f16098O = N0;
            return i != N0;
        }
        m26223C8();
        return false;
    }

    public final boolean m25739z9() {
        return !mo25351j5() && (mo26020W5() || mo26153J5()) && this.f16122a.viaBotUserId == 0 && !this.f16102Q.m4204l() && !this.f16102Q.m4200p() && (!m26068R9() ? !m25928g6() || m25929g5() || !m26242A9() : m26079Q9()) && (m26013X4() > 0 || !m26002Y5());
    }
}
