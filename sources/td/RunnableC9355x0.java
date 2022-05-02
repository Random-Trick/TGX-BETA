package td;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import be.C1359b;
import be.C1362c;
import be.C1379j0;
import be.C1410y;
import gd.C4779t2;
import ge.C4896n;
import ie.AbstractC5408k;
import ie.C5428t;
import ie.RunnableC5390g;
import java.util.concurrent.TimeUnit;
import me.C6879f3;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.voip.gui.CallSettings;
import p037cb.C2057b;
import p038ce.View$OnClickListenerC2667lk;
import p051db.C3950k;
import p080fb.C4335b;
import p080fb.C4336c;
import p082fd.C4403w;
import p108hb.C5063c;
import p108hb.C5064d;
import p108hb.C5069h;
import p108hb.C5070i;
import p139jb.AbstractC5911c;
import p292ud.C9773p0;
import p292ud.C9781q0;
import p350yd.C10534a9;
import p350yd.C10536ab;
import p350yd.C10552b0;
import p350yd.C10930q6;
import p350yd.C11009t1;
import p350yd.C11031u1;
import p350yd.C11052v1;
import p350yd.C11059v7;
import p364zd.C11524j;

public class RunnableC9355x0 extends Drawable implements C11009t1.AbstractC11010a, C3950k.AbstractC3952b, C10552b0.AbstractC10553a, C11059v7.AbstractC11062c, Runnable, C9773p0.AbstractC9777d, C9773p0.AbstractC9779f, C4336c.AbstractC4337a, AbstractC5911c, C11052v1.AbstractC11053a {
    public float f30249A0;
    public C10930q6 f30251C0;
    public TdApi.Call f30252D0;
    public TdApi.CallState f30253E0;
    public boolean f30254F0;
    public boolean f30255G0;
    public C3950k f30256H0;
    public float f30257I0;
    public boolean f30258J0;
    public C3950k f30259K0;
    public float f30260L0;
    public int f30261M;
    public boolean f30262M0;
    public int f30263N;
    public C3950k f30264N0;
    public float f30265O;
    public float f30266O0;
    public float f30267P;
    public boolean f30268P0;
    public boolean f30269Q;
    public C3950k f30270Q0;
    public boolean f30271R;
    public float f30272R0;
    public C10930q6 f30273S;
    public C3950k f30274S0;
    public TdApi.Message f30275T;
    public float f30276U;
    public float f30277V;
    public float f30278W;
    public boolean f30279X;
    public int f30280Y;
    public Drawable f30281Z;
    public View$OnClickListenerC9170d1 f30282a;
    public Drawable f30283a0;
    public C9270q1 f30284b;
    public Drawable f30285b0;
    public int f30286c;
    public int f30287c0;
    public int f30288d0;
    public int f30289e0;
    public int f30290f0;
    public boolean f30291g0;
    public final C4336c f30292h0;
    public float f30295k0;
    public int f30296l0;
    public boolean f30297m0;
    public float f30298n0;
    public int f30299o0;
    public C10930q6 f30300p0;
    public TdApi.Message f30301q0;
    public float f30302r0;
    public boolean f30303s0;
    public String f30304t0;
    public String f30305u0;
    public RunnableC5390g f30306v0;
    public RunnableC5390g f30307w0;
    public int f30308x0;
    public C3950k f30309y0;
    public Path f30310z0;
    public float f30293i0 = 1.0f;
    public float f30294j0 = 1.0f;
    public float f30250B0 = -1.0f;

    public RunnableC9355x0(View$OnClickListenerC9170d1 d1Var, C9270q1 q1Var) {
        this.f30282a = d1Var;
        this.f30284b = q1Var;
        if (d1Var != null) {
            C4336c cVar = new C4336c(this);
            this.f30292h0 = cVar;
            cVar.m28243h(true);
        } else {
            this.f30292h0 = null;
        }
        this.f30276U = 1.0f;
        this.f30283a0 = C1362c.m37482g(d1Var.getResources(), R.drawable.baseline_mic_24);
        this.f30281Z = C1362c.m37482g(d1Var.getResources(), R.drawable.baseline_call_end_24);
        this.f30285b0 = C1362c.m37482g(d1Var.getResources(), R.drawable.baseline_fast_forward_24);
        this.f30288d0 = C1357a0.m37541i(72.0f);
        if (q1Var != null) {
            C10536ab.m4667o1().m4636w2().m7030p(this);
            m8995z();
        }
        C11052v1.m1768b().m1769a(this);
    }

    public void m9059H(C10930q6 q6Var, TdApi.Call call) {
        m9043Y(q6Var, call, false);
    }

    public void m9058I(C10930q6 q6Var, TdApi.Call call) {
        TdApi.Call call2;
        C10930q6 q6Var2 = this.f30251C0;
        if (q6Var2 != null && q6Var2.m2188w6() == q6Var.m2188w6() && (call2 = this.f30252D0) != null && call.f25364id == call2.f25364id) {
            this.f30252D0 = null;
            this.f30251C0 = null;
            m9003u0(4, false, false, false);
        }
    }

    public static String m9033e(C10930q6 q6Var, TdApi.Message message) {
        if (q6Var.m2411i7(message)) {
            return C4403w.m27869i1(R.string.FromYou);
        }
        String R9 = q6Var.m2670R9(message);
        if (!C5070i.m24061i(R9)) {
            return R9;
        }
        return C4403w.m27869i1(message.content.getConstructor() == 963323014 ? R.string.AttachRound : R.string.AttachAudio);
    }

    public final void m9067A() {
        this.f30282a.invalidate();
    }

    public final void m9066A0(int i) {
        this.f30308x0 = i;
        m9065B0(i);
        m8994z0(i);
    }

    @Override
    public boolean mo7429B(float f, float f2) {
        if (C5063c.m24144b(this.f30280Y, 4) || !C5063c.m24144b(this.f30280Y, 2)) {
            return false;
        }
        int i = this.f30261M - C1357a0.m37541i(52.0f);
        return f <= ((float) i) && f >= ((float) (i - C1357a0.m37541i(24.0f)));
    }

    public final void m9065B0(int i) {
        int i2 = this.f30261M;
        if (i2 != 0) {
            int i3 = i2 - i;
            this.f30306v0 = (C5070i.m24061i(this.f30304t0) || i3 <= 0) ? null : new RunnableC5390g.C5392b(this.f30304t0, i3, C1410y.m37018q0(), C5428t.AbstractC5441d.f17872C).m22868v().m22888b().m22884f();
        }
    }

    @Override
    public void mo7428C(View view, float f, float f2) {
        int i = C1357a0.m37541i(52.0f);
        int i2 = this.f30261M;
        if (f <= i2 && f >= (i2 - i) - C1357a0.m37541i(24.0f)) {
            int i3 = this.f30261M;
            m9051P(f >= ((float) (i3 - i)) ? 0 : (((int) ((i3 - f) - i)) / C1357a0.m37541i(24.0f)) + 1);
        } else if (f < 0.0f || f > i) {
            m9053N();
        } else {
            m9052O();
        }
    }

    @Override
    public boolean mo1990C0(int i) {
        return true;
    }

    public final void m9064D() {
        this.f30282a.invalidate(0, this.f30289e0, this.f30261M, this.f30290f0);
    }

    public final void m9063D0(TdApi.Call call) {
        TdApi.Call call2 = this.f30252D0;
        this.f30253E0 = call2 != null ? call2.state : null;
        this.f30252D0 = call;
        m9035d();
        m9064D();
    }

    public final boolean m9062E(int i) {
        return (this.f30280Y & i) != 0 || (!this.f30279X && this.f30287c0 == i);
    }

    public final void m9061E0() {
        TdApi.Call call = this.f30252D0;
        m9031f0(call != null && call.state.getConstructor() == -2000107571);
    }

    @Override
    public void mo7427F(View view, float f, float f2) {
        C4335b.m28254h(this, view, f, f2);
    }

    public final boolean m9060G() {
        return this.f30278W > 0.0f && this.f30267P > this.f30265O && this.f30277V < 1.0f;
    }

    public void m9057J() {
        m9054M();
        C9270q1 q1Var = this.f30284b;
        if (q1Var != null) {
            q1Var.m9708n(this.f30278W, View$OnClickListenerC9170d1.getPlayerSize() * this.f30278W);
        }
    }

    public void m9056K(int i, float f) {
        int x = i + m8998x();
        this.f30263N = x;
        if (this.f30278W != 0.0f) {
            m9054M();
        } else {
            this.f30290f0 = x;
            float f2 = x;
            this.f30267P = f2;
            this.f30265O = f2;
            this.f30289e0 = x - C4896n.m24479d();
        }
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (this.f30269Q) {
            if (f <= 0.5f) {
                this.f30269Q = false;
                this.f30282a.invalidateOutline();
            } else if (f == 1.0f) {
                this.f30282a.invalidateOutline();
            }
        } else if (f > 0.5f) {
            this.f30269Q = true;
            this.f30282a.invalidateOutline();
        } else if (f == 0.0f) {
            this.f30282a.invalidateOutline();
        }
    }

    @Override
    public boolean mo7426K4() {
        return C4335b.m28261a(this);
    }

    public void m9055L(int i, int i2, float f) {
        this.f30261M = i;
        m9066A0(this.f30308x0);
        m9056K(i2, f);
    }

    public final void m9054M() {
        int playerSize = this.f30263N + ((int) (View$OnClickListenerC9170d1.getPlayerSize() * (this.f30278W - C5069h.m24089d((this.f30263N - View$OnClickListenerC9170d1.m10066c3(true)) / C4896n.m24477f(false))) * this.f30293i0));
        this.f30290f0 = playerSize;
        this.f30289e0 = playerSize - View$OnClickListenerC9170d1.getPlayerSize();
        float f = this.f30263N;
        this.f30265O = f;
        this.f30267P = Math.max(f, this.f30290f0);
    }

    public final void m9053N() {
        m9047T();
        if (C5063c.m24144b(this.f30280Y, 4)) {
            m9049R();
        } else if (C5063c.m24144b(this.f30280Y, 2)) {
            m9048S();
        }
    }

    @Override
    public void mo6985N2(int i) {
        C9781q0.m6970b(this, i);
    }

    public final void m9052O() {
        m9047T();
        if (C5063c.m24144b(this.f30280Y, 4)) {
            if (this.f30255G0 && this.f30252D0 != null && this.f30282a != null) {
                if (this.f30258J0) {
                    C10536ab.m4667o1().m4713c0().m4615A(this.f30282a.getContext(), this.f30251C0, this.f30252D0.f25364id);
                } else {
                    C10536ab.m4667o1().m4713c0().m4597P(this.f30251C0, this.f30252D0.f25364id);
                }
            }
        } else if (C5063c.m24144b(this.f30280Y, 2)) {
            C10536ab.m4667o1().m4636w2().m7061d1(true);
        }
    }

    public final boolean m9051P(int i) {
        if (i == 0) {
            m9047T();
            if (C5063c.m24144b(this.f30280Y, 4)) {
                if (this.f30255G0 && !this.f30258J0) {
                    m8996y0();
                }
            } else if (C5063c.m24144b(this.f30280Y, 2) && !m9046U()) {
                m9048S();
            }
            return true;
        } else if (i != 1 || C5063c.m24144b(this.f30280Y, 4) || !C5063c.m24144b(this.f30280Y, 2)) {
            return false;
        } else {
            C10536ab.m4667o1().m4636w2().m7113D0();
            return true;
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            m9005t0(f);
        } else if (i == 1) {
            m9017m0(f);
        } else if (i == 2) {
            m9029g0(f);
        } else if (i == 4) {
            m9040a0(f);
        } else if (i == 5) {
            m9032e0(f);
        } else if (i == 6) {
            m9038b0(f);
        }
    }

    public boolean m9050Q(MotionEvent motionEvent) {
        C4336c cVar = this.f30292h0;
        return cVar != null && cVar.m28246e(this.f30282a, motionEvent);
    }

    public final void m9049R() {
        C10536ab.m4667o1().m4713c0().m4539y0();
    }

    public void m9048S() {
        TdApi.Message message;
        if (this.f30284b != null && this.f30273S != null && (message = this.f30275T) != null) {
            if (message.content.getConstructor() != 276722716) {
                TdApi.Message message2 = this.f30275T;
                if (message2.chatId != 0 && message2.f25406id != 0) {
                    AbstractView$OnTouchListenerC7889a r = C1379j0.m37307r(this.f30284b.m9765E());
                    if (C4779t2.m25727A3(this.f30275T)) {
                        this.f30273S.m2485dd().m3898A7(new C10534a9(r, this.f30273S), this.f30275T);
                    } else {
                        this.f30273S.m2485dd().m3459s7(new C10534a9(r, this.f30273S), this.f30275T, null);
                    }
                }
            } else {
                View$OnClickListenerC2667lk lkVar = new View$OnClickListenerC2667lk(this.f30284b.m9765E(), this.f30273S);
                if (lkVar.m33891Vf() != -1) {
                    this.f30284b.m9719h0(lkVar);
                }
            }
        }
    }

    public final void m9047T() {
        View$OnClickListenerC9170d1 d1Var = this.f30282a;
        if (d1Var != null) {
            d1Var.playSoundEffect(0);
        }
    }

    public boolean m9046U() {
        if (this.f30275T == null) {
            return false;
        }
        C10536ab.m4667o1().m4636w2().m7105H0(this.f30273S, this.f30275T, null);
        return true;
    }

    public void m9045V() {
        this.f30295k0 = 0.0f;
        this.f30296l0 = 0;
    }

    @Override
    public void mo6973V2(C10930q6 q6Var, long j, long j2, int i, float f, long j3, long j4, boolean z) {
        TdApi.Message message = this.f30301q0;
        if (message != null && message.content.getConstructor() != 963323014) {
            m9009r0(f);
        }
    }

    public void m9044W(float f) {
        if (this.f30297m0 && this.f30298n0 != f) {
            this.f30298n0 = f;
            m9067A();
        }
    }

    @Override
    public boolean mo7425W6(float f, float f2) {
        return C4335b.m28259c(this, f, f2);
    }

    @Override
    public void mo6984X(C10930q6 q6Var, TdApi.Message message) {
        C9781q0.m6971a(this, q6Var, message);
    }

    @Override
    public void mo1564X4(int i, int i2) {
    }

    public final void m9043Y(C10930q6 q6Var, TdApi.Call call, boolean z) {
        if (this.f30252D0 != null) {
            this.f30251C0.m2480e2().m1615n2(this.f30252D0.f25364id, this);
        }
        final C10930q6 q6Var2 = this.f30251C0;
        final TdApi.Call call2 = this.f30252D0;
        if (call != null) {
            this.f30252D0 = call;
            this.f30251C0 = q6Var;
            q6Var.m2480e2().m1665a2(call.f25364id, this);
        }
        if (call != null || call2 == null || z) {
            this.f30252D0 = call;
            m9003u0(4, call != null, false, z);
            return;
        }
        C1379j0.m37332e0(new Runnable() {
            @Override
            public final void run() {
                RunnableC9355x0.this.m9058I(q6Var2, call2);
            }
        }, m9060G() ? 2000L : 0L);
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        if (i == 6) {
            this.f30264N0.m29541l(0.0f);
            if (this.f30262M0) {
                this.f30264N0.m29544i(1.0f);
            }
        }
    }

    @Override
    public void mo6983Y1(C10930q6 q6Var, TdApi.Message message, int i, int i2, float f, boolean z) {
        boolean z2;
        TdApi.Message message2;
        boolean z3 = true;
        if (this.f30300p0 == q6Var && this.f30301q0 == message) {
            z2 = false;
        } else {
            if (this.f30301q0 != null) {
                C10536ab.m4667o1().m4636w2().m7081T0(this.f30300p0, this.f30301q0, this);
            }
            this.f30301q0 = message;
            this.f30300p0 = q6Var;
            z2 = true;
        }
        boolean z4 = i2 == 3;
        TdApi.Message message3 = (message == null || i2 == 0) ? null : message;
        if (this.f30273S != q6Var || (message2 = this.f30275T) != message3) {
            this.f30273S = q6Var;
            this.f30275T = message3;
            boolean z5 = message3 != null;
            m9003u0(2, z5, true, false);
            z3 = z5;
        } else if (message == null || !C9773p0.m7114D(message, message2)) {
            z3 = false;
        }
        if (z3) {
            m9021k0(z4, m8997y());
            if (z2) {
                C10536ab.m4667o1().m4636w2().m7026r(q6Var, message, this);
            }
        }
    }

    public final void m9042Z(boolean z, boolean z2, TdApi.CallState callState) {
        if (this.f30255G0 != z) {
            this.f30255G0 = z;
            float f = z ? 1.0f : 0.0f;
            if (z2) {
                if (this.f30256H0 == null) {
                    this.f30256H0 = new C3950k(4, this, C2057b.f7280b, 180L, this.f30257I0);
                }
                this.f30256H0.m29544i(f);
                return;
            }
            C3950k kVar = this.f30256H0;
            if (kVar != null) {
                kVar.m29541l(f);
            }
            m9040a0(this.f30257I0);
        }
    }

    @Override
    public void mo7424Z4(View view, float f, float f2) {
        C4335b.m28256f(this, view, f, f2);
    }

    public final void m9040a0(float f) {
        if (this.f30257I0 != f) {
            this.f30257I0 = f;
            m9064D();
        }
    }

    @Override
    public void mo4501a3() {
        C11052v1.m1768b().m1766d(this);
    }

    public final void m9038b0(float f) {
        if (this.f30266O0 != f) {
            this.f30266O0 = f;
            m9064D();
        }
    }

    @Override
    public void mo1563b7(int i, CallSettings callSettings) {
        if (m9010r() == i) {
            m9027h0(callSettings.isMicMuted(), m9060G());
        }
    }

    public final void m9037c() {
        String str;
        String str2;
        String str3;
        String str4;
        StringBuilder sb2;
        String str5;
        if (this.f30310z0 == null) {
            this.f30310z0 = new Path();
        }
        this.f30302r0 = 0.0f;
        boolean z = false;
        String str6 = null;
        if (this.f30275T.content.getConstructor() != 276722716) {
            str3 = m9033e(this.f30273S, this.f30275T);
            if (C4779t2.m25727A3(this.f30275T)) {
                str5 = C4403w.m27869i1(R.string.ScheduledMessage);
            } else {
                int i = this.f30275T.date;
                str5 = i != 0 ? C4403w.m27900b1(i, TimeUnit.SECONDS, true, 5) : null;
            }
            if (this.f30275T.content.getConstructor() == 527777781) {
                z = true;
            }
            str = str5;
            str2 = null;
        } else {
            TdApi.Audio audio = ((TdApi.MessageAudio) this.f30275T.content).audio;
            String m2 = C4779t2.m25472m2(audio);
            str = C4779t2.m25521f2(audio);
            str2 = audio.fileName;
            str3 = m2;
        }
        if (str3 != null) {
            str3 = str3.trim();
        }
        if (str != null) {
            str = str.trim();
        }
        if (str3 != null && str != null && str3.length() > 0 && str.length() > 0) {
            if (!z || C4779t2.m25727A3(this.f30275T)) {
                sb2 = new StringBuilder();
                str4 = " — ";
            } else {
                sb2 = new StringBuilder();
                str4 = " ";
            }
            sb2.append(str4);
            sb2.append(str);
            str = sb2.toString();
        }
        if (C5070i.m24061i(str) && C5070i.m24061i(str3) && str2 != null) {
            str = str2.trim();
        }
        if (C5070i.m24061i(str3)) {
            str3 = null;
        }
        if (!C5070i.m24061i(str)) {
            str6 = str;
        }
        m9001v0(str3, str6, (C1357a0.m37541i(56.0f) * 2) + C1357a0.m37541i(24.0f) + C1357a0.m37541i(6.0f));
    }

    public final void m9036c0(boolean z) {
        if (this.f30262M0 != z) {
            this.f30262M0 = z;
            if (z) {
                if (this.f30264N0 == null) {
                    C3950k kVar = new C3950k(6, this, C2057b.f7280b, 1100L);
                    this.f30264N0 = kVar;
                    kVar.m29553F(650L);
                }
                if (!this.f30264N0.m29531v()) {
                    this.f30264N0.m29541l(0.0f);
                    this.f30264N0.m29544i(1.0f);
                    return;
                }
                return;
            }
            C3950k kVar2 = this.f30264N0;
            if (kVar2 != null && kVar2.m29538o() == 0.0f) {
                this.f30264N0.m29541l(0.0f);
            }
        }
    }

    public final void m9035d() {
        throw new UnsupportedOperationException("Method not decompiled: td.RunnableC9355x0.m9035d():void");
    }

    public final void m9034d0(boolean z, boolean z2) {
        if (this.f30258J0 != z) {
            this.f30258J0 = z;
            float f = z ? 1.0f : 0.0f;
            if (z2) {
                if (this.f30259K0 == null) {
                    this.f30259K0 = new C3950k(5, this, C2057b.f7280b, 180L, this.f30260L0);
                }
                this.f30259K0.m29544i(f);
                return;
            }
            C3950k kVar = this.f30259K0;
            if (kVar != null) {
                kVar.m29541l(f);
            }
            m9032e0(f);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        AbstractC9323v4<?> F;
        if (this.f30297m0 && this.f30298n0 > 0.0f) {
            if (C4403w.m27984G2()) {
                canvas.drawRect(0.0f, 0.0f, this.f30298n0, this.f30265O, C1410y.m37039g(this.f30299o0));
            } else {
                int i = this.f30261M;
                canvas.drawRect(i - this.f30298n0, 0.0f, i, this.f30265O, C1410y.m37039g(this.f30299o0));
            }
        }
        if (m8997y()) {
            m9020l(canvas);
        }
        float f = this.f30276U;
        if (f == 1.0f && this.f30277V == 0.0f) {
            canvas.drawRect(0.0f, 0.0f, this.f30261M, this.f30265O, C1410y.m37039g(this.f30286c));
            if (!(this.f30295k0 == 0.0f || this.f30296l0 == 0)) {
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, this.f30261M, this.f30265O);
                int i2 = this.f30261M;
                float f2 = this.f30265O;
                float sqrt = ((float) Math.sqrt((i2 * i2) + (f2 * f2))) * 0.5f;
                float i3 = C4403w.m27984G2() ? ((C1357a0.m37541i(49.0f) / 2) - C1357a0.m37541i(3.0f)) - C1357a0.m37541i(5.0f) : (this.f30261M - (C1357a0.m37541i(49.0f) / 2)) + C1357a0.m37541i(3.0f) + C1357a0.m37541i(5.0f);
                float f3 = this.f30295k0;
                canvas.drawCircle(i3 + (((this.f30261M / 2) - i3) * this.f30295k0), View$OnClickListenerC9170d1.getTopOffset() + (View$OnClickListenerC9170d1.m10066c3(false) / 2) + C1357a0.m37541i(2.0f), sqrt * f3, C1410y.m37039g(C5064d.m24131a((f3 * 0.65f) + 0.35f, this.f30296l0)));
                canvas.restore();
            }
            C6879f3.m18704d(canvas, 0, this.f30261M, (int) this.f30267P, this.f30294j0);
        } else if (f == 1.0f) {
            canvas.drawRect(0.0f, 0.0f, this.f30261M, this.f30265O, C1410y.m37039g(this.f30286c));
        } else {
            canvas.drawRect(0.0f, 0.0f, this.f30261M, this.f30265O * f, C1410y.m37039g(this.f30286c));
        }
        C9270q1 q1Var = this.f30284b;
        if (q1Var != null && (F = q1Var.m9763F()) != null) {
            F.m9238i9(canvas, this.f30261M, (int) this.f30265O);
        }
    }

    public final void m9032e0(float f) {
        if (this.f30260L0 != f) {
            this.f30260L0 = f;
            m9064D();
        }
    }

    @Override
    public void mo1562f(TdApi.Call call) {
        if (m9010r() == call.f25364id) {
            m9063D0(call);
        }
    }

    public final void m9031f0(boolean z) {
        if (this.f30254F0 != z) {
            this.f30254F0 = z;
            if (z) {
                C1379j0.m37334d0(this);
            } else {
                C1379j0.m37330f0(this);
            }
        }
    }

    @Override
    public void mo7419f3(View view, float f, float f2) {
        C4335b.m28257e(this, view, f, f2);
    }

    public final void m9030g(int i) {
        if (i == 2) {
            m9037c();
        } else if (i == 4) {
            m9035d();
        }
    }

    public final void m9029g0(float f) {
        if (this.f30272R0 != f) {
            this.f30272R0 = f;
            m9064D();
        }
    }

    @Override
    public void mo1989g1(int i, boolean z, boolean z2) {
        m9021k0(z, true);
    }

    @Override
    public void mo452g2() {
        m9064D();
    }

    @Override
    public long getLongPressDuration() {
        return C4335b.m28260b(this);
    }

    @Override
    public int getOpacity() {
        return 0;
    }

    public final boolean m9028h(int i) {
        return i > (this.f30280Y & (~i));
    }

    public final void m9027h0(boolean z, boolean z2) {
        if (this.f30268P0 != z) {
            this.f30268P0 = z;
            float f = z ? 1.0f : 0.0f;
            if (z2) {
                if (this.f30270Q0 == null) {
                    this.f30270Q0 = new C3950k(2, this, C2057b.f7280b, 180L, this.f30272R0);
                }
                this.f30270Q0.m29544i(f);
                return;
            }
            C3950k kVar = this.f30270Q0;
            if (kVar != null) {
                kVar.m29541l(f);
            }
            m9029g0(f);
        }
    }

    public void m9026i(float f) {
        boolean z = true;
        float f2 = 0.0f;
        if (f <= this.f30290f0) {
            float f3 = f - this.f30289e0;
            if (f3 <= 0.0f) {
                f2 = 1.0f;
            } else if (f3 < View$OnClickListenerC9170d1.getPlayerSize()) {
                f2 = 1.0f - (f3 / View$OnClickListenerC9170d1.getPlayerSize());
            }
            this.f30277V = f2;
            float f4 = this.f30265O;
            if (f > f4) {
                this.f30276U = 1.0f;
            } else {
                this.f30276U = f / f4;
            }
        } else if (this.f30276U == 1.0f && this.f30277V == 0.0f) {
            z = false;
        } else {
            this.f30276U = 1.0f;
            this.f30277V = 0.0f;
        }
        if (z) {
            m9067A();
        }
    }

    public void m9025i0(boolean z) {
        if (z) {
            if (this.f30278W != 0.0f) {
                this.f30277V = 1.0f;
            }
            this.f30276U = 0.0f;
        } else {
            this.f30277V = 0.0f;
            this.f30276U = 1.0f;
        }
        m9067A();
    }

    public final void m9024j(Canvas canvas, int i, float f, int i2, boolean z) {
        C1359b.m37504o(canvas, z ? f - (C1357a0.m37541i(50.0f) / 2) : C1357a0.m37541i(28.0f), i + ((i2 - i) / 2), 1.0f, C1357a0.m37541i(9.0f), C1410y.m37053Y(C5064d.m24131a(this.f30294j0, C11524j.m159q0()), C1357a0.m37541i(2.0f)));
    }

    public void m9023j0(int i) {
        this.f30286c = i;
    }

    public final void m9022k(Canvas canvas, int i, float f, int i2) {
        if (this.f30297m0 && this.f30298n0 > 0.0f) {
            canvas.drawRect(f, i, this.f30261M, i2, C1410y.m37039g(C11524j.m148w()));
        }
        float f2 = i2;
        canvas.drawRect(0.0f, i, f, f2, C1410y.m37039g(C5064d.m24131a(this.f30294j0, C11524j.m148w())));
        if (this.f30302r0 != 0.0f) {
            canvas.drawRect(0.0f, i2 - (C1357a0.m37541i(1.0f) + 1), (int) (this.f30261M * this.f30302r0), f2, C1410y.m37039g(C5064d.m24131a(this.f30294j0, C11524j.m228N(R.id.theme_color_headerBarCallActive))));
        }
        TdApi.File j1 = C4779t2.m25494j1(this.f30275T);
        int i3 = this.f30261M - C1357a0.m37541i(28.0f);
        int d = i2 - (C4896n.m24479d() / 2);
        int i4 = C1357a0.m37541i(12.0f);
        Path path = this.f30310z0;
        float f3 = this.f30250B0;
        float f4 = this.f30249A0;
        this.f30250B0 = f4;
        C1359b.m37499t(canvas, i3, d, i4, path, f3, f4, j1 != null ? C4779t2.m25431s1(j1) : 1.0f, C5064d.m24131a(this.f30294j0, C11524j.m159q0()));
        Drawable drawable = this.f30285b0;
        float i5 = (this.f30261M - C1357a0.m37541i(52.0f)) - this.f30285b0.getMinimumWidth();
        float d2 = (i2 - (C4896n.m24479d() / 2)) - (this.f30285b0.getMinimumHeight() / 2);
        float f5 = this.f30294j0;
        C1362c.m37487b(canvas, drawable, i5, d2, f5 == 1.0f ? C1410y.m37068J() : C1410y.m37055W(C5064d.m24131a(f5, C11524j.m159q0())));
        m9024j(canvas, i, this.f30261M, i2, false);
        m9016n(canvas, i, f, i2, C1357a0.m37541i(67.0f), null, 1.0f, 1.0f);
    }

    public void m9021k0(boolean z, boolean z2) {
        if (this.f30303s0 != z) {
            this.f30303s0 = z;
            float f = z ? 1.0f : 0.0f;
            if (z2) {
                if (this.f30309y0 == null) {
                    this.f30309y0 = new C3950k(1, this, C2057b.f7280b, 160L, this.f30249A0);
                }
                this.f30309y0.m29544i(f);
                return;
            }
            C3950k kVar = this.f30309y0;
            if (kVar != null) {
                kVar.m29541l(f);
            }
            m9017m0(f);
        }
    }

    public final void m9020l(android.graphics.Canvas r5) {
        throw new UnsupportedOperationException("Method not decompiled: td.RunnableC9355x0.m9020l(android.graphics.Canvas):void");
    }

    public void m9019l0() {
        this.f30291g0 = true;
    }

    public final void m9018m(Canvas canvas, int i, float f, int i2) {
        int d = C5064d.m24128d(C11524j.m228N(R.id.theme_color_headerBarCallMuted), C5064d.m24128d(C11524j.m228N(R.id.theme_color_headerBarCallActive), C11524j.m228N(R.id.theme_color_headerBarCallIncoming), this.f30260L0), (1.0f - this.f30272R0) * this.f30257I0);
        if (this.f30297m0 && this.f30298n0 > 0.0f) {
            canvas.drawRect(f, i, this.f30261M, i2, C1410y.m37039g(d));
        }
        int a = C5064d.m24131a(this.f30294j0, d);
        canvas.drawRect(0.0f, i, f, i2, C1410y.m37039g(a));
        Paint W = C1410y.m37055W(-1);
        W.setAlpha((int) (this.f30294j0 * 255.0f * this.f30257I0 * (1.0f - this.f30260L0)));
        int i3 = (this.f30261M - C1357a0.m37541i(12.0f)) - this.f30283a0.getMinimumWidth();
        int i4 = C1357a0.m37541i(6.0f) + i;
        C1362c.m37487b(canvas, this.f30283a0, i3, i4, W);
        C1359b.m37510i(canvas, i3 + (this.f30283a0.getMinimumWidth() / 2), i4 + (this.f30283a0.getMinimumHeight() / 2), this.f30272R0, C5064d.m24130b(W.getAlpha(), 16777215), a);
        W.setAlpha((int) (this.f30294j0 * 255.0f));
        int i5 = C1357a0.m37541i(18.0f);
        int i6 = C1357a0.m37541i(6.0f) + i;
        float f2 = this.f30260L0 * this.f30257I0;
        int i7 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i7 != 0) {
            canvas.save();
            canvas.rotate(f2 * 225.0f, (this.f30281Z.getMinimumWidth() / 2) + i5, (this.f30281Z.getMinimumHeight() / 2) + i6);
        }
        C1362c.m37487b(canvas, this.f30281Z, i5, i6, W);
        if (this.f30257I0 != 1.0f) {
            C1359b.m37510i(canvas, i5 + (this.f30281Z.getMinimumWidth() / 2), (i6 + (this.f30281Z.getMinimumHeight() / 2)) - C1357a0.m37541i(2.0f), 1.0f - this.f30257I0, C5064d.m24130b((int) (this.f30294j0 * 255.0f), 16777215), d);
        }
        if (i7 != 0) {
            canvas.restore();
        }
        W.setAlpha(255);
        float f3 = this.f30266O0;
        m9016n(canvas, i, f, i2, this.f30288d0, C5428t.f17847a, 1.0f, (f3 <= 0.5f ? 1.0f - (f3 / 0.5f) : (f3 - 0.5f) / 0.5f) * 0.8784314f);
    }

    public final void m9017m0(float f) {
        if (this.f30249A0 != f) {
            this.f30249A0 = f;
            m9064D();
        }
    }

    public final void m9016n(Canvas canvas, int i, float f, int i2, int i3, AbstractC5408k kVar, float f2, float f3) {
        int i4 = C1357a0.m37541i(9.0f);
        RunnableC5390g gVar = this.f30306v0;
        if (gVar != null) {
            gVar.m22891z(canvas, i3, i + i4, kVar, f2 * this.f30294j0);
        }
        RunnableC5390g gVar2 = this.f30307w0;
        if (gVar2 != null) {
            gVar2.m22891z(canvas, i3 + m9000w(), i + i4, kVar, f3 * this.f30294j0);
        }
    }

    @Override
    public boolean mo7418n0(View view, float f, float f2) {
        C9270q1 q1Var = this.f30284b;
        return (q1Var == null || !q1Var.m9742S()) && (this.f30279X || this.f30278W != 0.0f) && this.f30294j0 != 0.0f && this.f30277V != 1.0f && f2 >= ((float) this.f30289e0) && f2 <= ((float) this.f30290f0) && f2 > this.f30265O;
    }

    public void m9015o(boolean z) {
        if (Build.VERSION.SDK_INT >= 21 && this.f30271R != z) {
            this.f30271R = z;
            this.f30282a.invalidateOutline();
        }
    }

    public void m9014o0(float f) {
        if (this.f30293i0 != f) {
            this.f30293i0 = f;
            m9057J();
            m9067A();
            C1379j0.m37307r(this.f30282a.getContext()).m14523X0().m7247h0();
        }
    }

    @Override
    public void mo7417o2(View view, float f, float f2) {
        C4335b.m28255g(this, view, f, f2);
    }

    @Override
    public void mo443o4() {
        C11031u1.m1981a(this);
    }

    @Override
    public void mo7416p(View view, float f, float f2) {
        C10536ab.m4667o1().m4636w2().m7067a1(0);
    }

    public void m9013p0(float f, int i) {
        this.f30295k0 = f;
        this.f30296l0 = i;
    }

    public int m9012q() {
        return this.f30263N + ((int) (View$OnClickListenerC9170d1.getPlayerSize() * this.f30278W));
    }

    public void m9011q0(boolean z, float f, int i) {
        this.f30297m0 = z;
        if (z) {
            this.f30298n0 = f;
            this.f30299o0 = i;
            m9067A();
        }
    }

    public final int m9010r() {
        TdApi.Call call = this.f30252D0;
        if (call != null) {
            return call.f25364id;
        }
        return 0;
    }

    public void m9009r0(float f) {
        float f2 = this.f30302r0;
        if (f2 != f) {
            int i = this.f30261M;
            int i2 = (int) (i * f2);
            this.f30302r0 = f;
            if (i2 != ((int) (i * f))) {
                m9064D();
            }
        }
    }

    @Override
    public void run() {
        if (this.f30252D0 != null) {
            m9035d();
            m9064D();
            if (this.f30254F0) {
                C1379j0.m37332e0(this, m9002v());
            }
        }
    }

    public int m9008s() {
        return C6879f3.m18692p();
    }

    public void m9007s0(float f) {
        if (this.f30294j0 != f) {
            this.f30294j0 = f;
            m9067A();
        }
    }

    @Override
    public void setAlpha(int i) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public int m9006t() {
        return this.f30271R ? C4896n.m24478e() + C4896n.m24475h() : this.f30269Q ? Math.min((int) this.f30265O, C4896n.m24478e() + C4896n.m24475h()) : C4896n.m24478e();
    }

    public final void m9005t0(float f) {
        if (this.f30278W != f) {
            this.f30278W = f;
            m9057J();
            m9067A();
            C1379j0.m37307r(this.f30282a.getContext()).m14523X0().m7247h0();
        }
    }

    public int m9004u() {
        return (int) (View$OnClickListenerC9170d1.getPlayerSize() * this.f30278W);
    }

    public final void m9003u0(int i, boolean z, boolean z2, boolean z3) {
        if (C5063c.m24144b(this.f30280Y, i) != z) {
            int h = C5063c.m24138h(this.f30280Y, i, z);
            this.f30280Y = h;
            if (z) {
                if (m9028h(i)) {
                    this.f30287c0 = i;
                    m9030g(i);
                }
            } else if ((h & 4) != 0) {
                m9035d();
            } else if ((h & 2) != 0) {
                m9037c();
            }
            if (z || this.f30280Y != 0) {
                m9064D();
            }
            m8999w0(this.f30280Y != 0, z3);
            return;
        }
        if (z2) {
            m9030g(i);
        }
        m9064D();
    }

    public final long m9002v() {
        return C10536ab.m4667o1().m4713c0().m4598O(this.f30251C0, this.f30252D0.f25364id);
    }

    public final void m9001v0(String str, String str2, int i) {
        int i2 = this.f30308x0;
        boolean z = true;
        boolean z2 = (i2 == 0 || i2 == i) ? false : true;
        if (!C5070i.m24067c(this.f30304t0, str)) {
            this.f30304t0 = str;
            z2 = true;
        }
        if (!C5070i.m24067c(this.f30305u0, str2)) {
            this.f30305u0 = str2;
        } else {
            z = z2;
        }
        if (z) {
            m9066A0(i);
        }
    }

    public final int m9000w() {
        RunnableC5390g gVar = this.f30306v0;
        if (gVar != null) {
            return gVar.getWidth();
        }
        return 0;
    }

    public final void m8999w0(boolean z, boolean z2) {
        boolean z3 = this.f30279X;
        if (z3 != z) {
            this.f30279X = z;
            float f = 1.0f;
            if (z2) {
                if (!z) {
                    f = 0.0f;
                }
                m9005t0(f);
                return;
            }
            C9270q1 q1Var = this.f30284b;
            AbstractC9323v4<?> F = q1Var != null ? q1Var.m9763F() : null;
            boolean z4 = F != null && !F.mo9386Me();
            if (!z) {
                f = 0.0f;
            }
            if (z4) {
                if (this.f30274S0 == null) {
                    this.f30274S0 = new C3950k(0, this, C2057b.f7280b, 200L, this.f30278W);
                }
                this.f30274S0.m29544i(f);
                return;
            }
            C3950k kVar = this.f30274S0;
            if (kVar != null) {
                kVar.m29541l(f);
            }
            m9005t0(f);
        } else if (z3) {
            m9067A();
        }
    }

    public final int m8998x() {
        if (this.f30291g0) {
            return View$OnClickListenerC9170d1.getTopOffset();
        }
        return 0;
    }

    @Override
    public void mo1561x0(int i, int i2) {
        if (m9010r() == i && i2 == 3) {
            m9035d();
            m9064D();
        }
    }

    public final boolean m8997y() {
        return (this.f30278W == 0.0f || this.f30277V == 1.0f || this.f30294j0 == 0.0f) ? false : true;
    }

    public final void m8996y0() {
        if (this.f30252D0 != null) {
            CallSettings h0 = this.f30251C0.m2480e2().m1640h0(this.f30252D0.f25364id);
            if (h0 == null) {
                h0 = new CallSettings(this.f30251C0, this.f30252D0.f25364id);
            }
            m9027h0(!h0.isMicMuted(), true);
            h0.setMicMuted(this.f30268P0);
        }
    }

    @Override
    public void mo4536y2(final C10930q6 q6Var, final TdApi.Call call) {
        C1379j0.m37334d0(new Runnable() {
            @Override
            public final void run() {
                RunnableC9355x0.this.m9059H(q6Var, call);
            }
        });
    }

    public final void m8995z() {
        C10536ab.m4667o1().m4713c0().m4609D(this);
        m9043Y(C10536ab.m4667o1().m4713c0().m4599N(), C10536ab.m4667o1().m4713c0().m4601L(), true);
    }

    public final void m8994z0(int i) {
        int i2 = this.f30261M;
        if (i2 != 0) {
            int w = (i2 - i) - m9000w();
            this.f30307w0 = (C5070i.m24061i(this.f30305u0) || w <= 0) ? null : new RunnableC5390g.C5392b(this.f30305u0, w, C1410y.m37018q0(), C5428t.AbstractC5441d.f17873D).m22868v().m22884f();
        }
    }

    @Override
    public void mo6972z1(C10930q6 q6Var, long j, long j2, int i, int i2) {
    }

    @Override
    public boolean mo7415z4(View view, float f, float f2) {
        if (!mo7429B(f, f2)) {
            return false;
        }
        C10536ab.m4667o1().m4636w2().m7067a1(1);
        return true;
    }

    @Override
    public void mo7414z6(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4) {
        C4335b.m28252j(this, view, motionEvent, f, f2, f3, f4);
    }
}
