package ud;

import ae.j;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import ce.j0;
import ce.y;
import de.lk;
import eb.k;
import gb.b;
import gb.c;
import gd.w;
import hd.t2;
import he.n;
import ib.d;
import ib.h;
import ib.i;
import java.util.concurrent.TimeUnit;
import je.g;
import je.t;
import ne.f3;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.a;
import org.thunderdog.challegram.voip.gui.CallSettings;
import vd.o0;
import vd.p0;
import zd.o6;
import zd.r1;
import zd.s1;
import zd.t1;
import zd.t7;
import zd.y8;
import zd.ya;
import zd.z;

public class x0 extends Drawable implements r1.a, k.b, z.a, t7.c, Runnable, o0.d, o0.f, c.a, kb.c, t1.a {
    public float A0;
    public o6 C0;
    public TdApi.Call D0;
    public TdApi.CallState E0;
    public boolean F0;
    public boolean G0;
    public k H0;
    public float I0;
    public boolean J0;
    public k K0;
    public float L0;
    public int M;
    public boolean M0;
    public int N;
    public k N0;
    public float O;
    public float O0;
    public float P;
    public boolean P0;
    public boolean Q;
    public k Q0;
    public boolean R;
    public float R0;
    public o6 S;
    public k S0;
    public TdApi.Message T;
    public float U;
    public float V;
    public float W;
    public boolean X;
    public int Y;
    public Drawable Z;
    public d1 f24560a;
    public Drawable f24561a0;
    public q1 f24562b;
    public Drawable f24563b0;
    public int f24564c;
    public int f24565c0;
    public int f24566d0;
    public int f24567e0;
    public int f24568f0;
    public boolean f24569g0;
    public final c f24570h0;
    public float f24573k0;
    public int f24574l0;
    public boolean f24575m0;
    public float f24576n0;
    public int f24577o0;
    public o6 f24578p0;
    public TdApi.Message f24579q0;
    public float f24580r0;
    public boolean f24581s0;
    public String f24582t0;
    public String f24583u0;
    public g f24584v0;
    public g f24585w0;
    public int f24586x0;
    public k f24587y0;
    public Path f24588z0;
    public float f24571i0 = 1.0f;
    public float f24572j0 = 1.0f;
    public float B0 = -1.0f;

    public x0(d1 d1Var, q1 q1Var) {
        this.f24560a = d1Var;
        this.f24562b = q1Var;
        if (d1Var != null) {
            c cVar = new c(this);
            this.f24570h0 = cVar;
            cVar.h(true);
        } else {
            this.f24570h0 = null;
        }
        this.U = 1.0f;
        this.f24561a0 = ce.c.g(d1Var.getResources(), R.drawable.baseline_mic_24);
        this.Z = ce.c.g(d1Var.getResources(), R.drawable.baseline_call_end_24);
        this.f24563b0 = ce.c.g(d1Var.getResources(), R.drawable.baseline_fast_forward_24);
        this.f24566d0 = a0.i(72.0f);
        if (q1Var != null) {
            ya.o1().w2().p(this);
            A();
        }
        t1.b().a(this);
    }

    public void I(o6 o6Var, TdApi.Call call) {
        Y(o6Var, call, false);
    }

    public void J(o6 o6Var, TdApi.Call call) {
        TdApi.Call call2;
        o6 o6Var2 = this.C0;
        if (o6Var2 != null && o6Var2.A6() == o6Var.A6() && (call2 = this.D0) != null && call.f19905id == call2.f19905id) {
            this.D0 = null;
            this.C0 = null;
            v0(4, false, false, false);
        }
    }

    public static String f(o6 o6Var, TdApi.Message message) {
        if (o6Var.m7(message)) {
            return w.i1(R.string.FromYou);
        }
        String V9 = o6Var.V9(message);
        if (!i.i(V9)) {
            return V9;
        }
        return w.i1(message.content.getConstructor() == 963323014 ? R.string.AttachRound : R.string.AttachAudio);
    }

    public final void A() {
        ya.o1().c0().B(this);
        Y(ya.o1().c0().L(), ya.o1().c0().J(), true);
    }

    public final void A0(int i10) {
        int i11 = this.M;
        if (i11 != 0) {
            int x10 = (i11 - i10) - x();
            this.f24585w0 = (i.i(this.f24583u0) || x10 <= 0) ? null : new g.b(this.f24583u0, x10, y.q0(), t.d.D).v().f();
        }
    }

    @Override
    public boolean B(float f10, float f11) {
        if (ib.c.b(this.Y, 4) || !ib.c.b(this.Y, 2)) {
            return false;
        }
        int i10 = this.M - a0.i(52.0f);
        return f10 <= ((float) i10) && f10 >= ((float) (i10 - a0.i(24.0f)));
    }

    public final void B0(int i10) {
        this.f24586x0 = i10;
        C0(i10);
        A0(i10);
    }

    @Override
    public void C(View view, float f10, float f11) {
        int i10 = a0.i(52.0f);
        int i11 = this.M;
        if (f10 <= i11 && f10 >= (i11 - i10) - a0.i(24.0f)) {
            int i12 = this.M;
            Q(f10 >= ((float) (i12 - i10)) ? 0 : (((int) ((i12 - f10) - i10)) / a0.i(24.0f)) + 1);
        } else if (f10 < 0.0f || f10 > i10) {
            O();
        } else {
            P();
        }
    }

    public final void C0(int i10) {
        int i11 = this.M;
        if (i11 != 0) {
            int i12 = i11 - i10;
            this.f24584v0 = (i.i(this.f24582t0) || i12 <= 0) ? null : new g.b(this.f24582t0, i12, y.q0(), t.d.C).v().b().f();
        }
    }

    public final void D() {
        this.f24560a.invalidate();
    }

    @Override
    public boolean D0(int i10) {
        return true;
    }

    public final void E() {
        this.f24560a.invalidate(0, this.f24567e0, this.M, this.f24568f0);
    }

    public final void E0(TdApi.Call call) {
        TdApi.Call call2 = this.D0;
        this.E0 = call2 != null ? call2.state : null;
        this.D0 = call;
        e();
        E();
    }

    @Override
    public void E2(int i10) {
        p0.b(this, i10);
    }

    @Override
    public boolean E4() {
        return b.a(this);
    }

    public final boolean F(int i10) {
        return (this.Y & i10) != 0 || (!this.X && this.f24565c0 == i10);
    }

    public final void F0() {
        TdApi.Call call = this.D0;
        f0(call != null && call.state.getConstructor() == -2000107571);
    }

    @Override
    public void F4(final o6 o6Var, final TdApi.Call call) {
        j0.d0(new Runnable() {
            @Override
            public final void run() {
                x0.this.I(o6Var, call);
            }
        });
    }

    @Override
    public void G(View view, float f10, float f11) {
        b.h(this, view, f10, f11);
    }

    public final boolean H() {
        return this.W > 0.0f && this.P > this.O && this.V < 1.0f;
    }

    public void K() {
        N();
        q1 q1Var = this.f24562b;
        if (q1Var != null) {
            q1Var.n(this.W, d1.getPlayerSize() * this.W);
        }
    }

    public void L(int i10, float f10) {
        int y10 = i10 + y();
        this.N = y10;
        if (this.W != 0.0f) {
            N();
        } else {
            this.f24568f0 = y10;
            float f11 = y10;
            this.P = f11;
            this.O = f11;
            this.f24567e0 = y10 - n.d();
        }
        if (this.Q) {
            if (f10 <= 0.5f) {
                this.Q = false;
                this.f24560a.invalidateOutline();
            } else if (f10 == 1.0f) {
                this.f24560a.invalidateOutline();
            }
        } else if (f10 > 0.5f) {
            this.Q = true;
            this.f24560a.invalidateOutline();
        } else if (f10 == 0.0f) {
            this.f24560a.invalidateOutline();
        }
    }

    public void M(int i10, int i11, float f10) {
        this.M = i10;
        B0(this.f24586x0);
        L(i11, f10);
    }

    public final void N() {
        int playerSize = this.N + ((int) (d1.getPlayerSize() * (this.W - h.d((this.N - d1.a3(true)) / n.f(false))) * this.f24571i0));
        this.f24568f0 = playerSize;
        this.f24567e0 = playerSize - d1.getPlayerSize();
        float f10 = this.N;
        this.O = f10;
        this.P = Math.max(f10, this.f24568f0);
    }

    public final void O() {
        U();
        if (ib.c.b(this.Y, 4)) {
            S();
        } else if (ib.c.b(this.Y, 2)) {
            T();
        }
    }

    public final void P() {
        U();
        if (ib.c.b(this.Y, 4)) {
            if (this.G0 && this.D0 != null && this.f24560a != null) {
                if (this.J0) {
                    ya.o1().c0().y(this.f24560a.getContext(), this.C0, this.D0.f19905id);
                } else {
                    ya.o1().c0().N(this.C0, this.D0.f19905id);
                }
            }
        } else if (ib.c.b(this.Y, 2)) {
            ya.o1().w2().d1(true);
        }
    }

    public final boolean Q(int i10) {
        if (i10 == 0) {
            U();
            if (ib.c.b(this.Y, 4)) {
                if (this.G0 && !this.J0) {
                    z0();
                }
            } else if (ib.c.b(this.Y, 2) && !V()) {
                T();
            }
            return true;
        } else if (i10 != 1 || ib.c.b(this.Y, 4) || !ib.c.b(this.Y, 2)) {
            return false;
        } else {
            ya.o1().w2().D0();
            return true;
        }
    }

    @Override
    public void Q2() {
        t1.b().d(this);
    }

    @Override
    public void Q4(int i10, int i11) {
    }

    public boolean R(MotionEvent motionEvent) {
        c cVar = this.f24570h0;
        return cVar != null && cVar.e(this.f24560a, motionEvent);
    }

    public final void S() {
        ya.o1().c0().u0();
    }

    public void T() {
        TdApi.Message message;
        if (this.f24562b != null && this.S != null && (message = this.T) != null) {
            if (message.content.getConstructor() != 276722716) {
                TdApi.Message message2 = this.T;
                if (message2.chatId != 0 && message2.f19946id != 0) {
                    a r10 = j0.r(this.f24562b.E());
                    if (t2.A3(this.T)) {
                        this.S.hd().A7(new y8(r10, this.S), this.T);
                    } else {
                        this.S.hd().s7(new y8(r10, this.S), this.T, null);
                    }
                }
            } else {
                lk lkVar = new lk(this.f24562b.E(), this.S);
                if (lkVar.Vf() != -1) {
                    this.f24562b.h0(lkVar);
                }
            }
        }
    }

    public final void U() {
        d1 d1Var = this.f24560a;
        if (d1Var != null) {
            d1Var.playSoundEffect(0);
        }
    }

    @Override
    public void U2(View view, float f10, float f11) {
        b.e(this, view, f10, f11);
    }

    @Override
    public void U4(View view, float f10, float f11) {
        b.f(this, view, f10, f11);
    }

    public boolean V() {
        if (this.T == null) {
            return false;
        }
        ya.o1().w2().H0(this.S, this.T, null);
        return true;
    }

    public void W() {
        this.f24573k0 = 0.0f;
        this.f24574l0 = 0;
    }

    public void X(float f10) {
        if (this.f24575m0 && this.f24576n0 != f10) {
            this.f24576n0 = f10;
            D();
        }
    }

    @Override
    public boolean X6(float f10, float f11) {
        return b.c(this, f10, f11);
    }

    public final void Y(o6 o6Var, TdApi.Call call, boolean z10) {
        if (this.D0 != null) {
            this.C0.e2().m2(this.D0.f19905id, this);
        }
        final o6 o6Var2 = this.C0;
        final TdApi.Call call2 = this.D0;
        if (call != null) {
            this.D0 = call;
            this.C0 = o6Var;
            o6Var.e2().Y1(call.f19905id, this);
        }
        if (call != null || call2 == null || z10) {
            this.D0 = call;
            v0(4, call != null, false, z10);
            return;
        }
        j0.e0(new Runnable() {
            @Override
            public final void run() {
                x0.this.J(o6Var2, call2);
            }
        }, H() ? 2000L : 0L);
    }

    public final void Z(boolean z10, boolean z11, TdApi.CallState callState) {
        if (this.G0 != z10) {
            this.G0 = z10;
            float f10 = z10 ? 1.0f : 0.0f;
            if (z11) {
                if (this.H0 == null) {
                    this.H0 = new k(4, this, db.b.f7287b, 180L, this.I0);
                }
                this.H0.i(f10);
                return;
            }
            k kVar = this.H0;
            if (kVar != null) {
                kVar.l(f10);
            }
            a0(this.I0);
        }
    }

    public final void a0(float f10) {
        if (this.I0 != f10) {
            this.I0 = f10;
            E();
        }
    }

    public final void b0(float f10) {
        if (this.O0 != f10) {
            this.O0 = f10;
            E();
        }
    }

    @Override
    public void b4() {
        s1.a(this);
    }

    @Override
    public void b7(int i10, CallSettings callSettings) {
        if (s() == i10) {
            i0(callSettings.isMicMuted(), H());
        }
    }

    public final void c() {
        String str;
        String str2;
        String str3;
        String str4;
        StringBuilder sb2;
        String str5;
        if (this.f24588z0 == null) {
            this.f24588z0 = new Path();
        }
        this.f24580r0 = 0.0f;
        boolean z10 = false;
        String str6 = null;
        if (this.T.content.getConstructor() != 276722716) {
            str3 = f(this.S, this.T);
            if (t2.A3(this.T)) {
                str5 = w.i1(R.string.ScheduledMessage);
            } else {
                int i10 = this.T.date;
                str5 = i10 != 0 ? w.b1(i10, TimeUnit.SECONDS, true, 5) : null;
            }
            if (this.T.content.getConstructor() == 527777781) {
                z10 = true;
            }
            str = str5;
            str2 = null;
        } else {
            TdApi.Audio audio = ((TdApi.MessageAudio) this.T.content).audio;
            String m22 = t2.m2(audio);
            str = t2.f2(audio);
            str2 = audio.fileName;
            str3 = m22;
        }
        if (str3 != null) {
            str3 = str3.trim();
        }
        if (str != null) {
            str = str.trim();
        }
        if (str3 != null && str != null && str3.length() > 0 && str.length() > 0) {
            if (!z10 || t2.A3(this.T)) {
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
        if (i.i(str) && i.i(str3) && str2 != null) {
            str = str2.trim();
        }
        if (i.i(str3)) {
            str3 = null;
        }
        if (!i.i(str)) {
            str6 = str;
        }
        w0(str3, str6, (a0.i(56.0f) * 2) + a0.i(24.0f) + a0.i(6.0f));
    }

    public final void c0(boolean z10) {
        if (this.M0 != z10) {
            this.M0 = z10;
            if (z10) {
                if (this.N0 == null) {
                    k kVar = new k(6, this, db.b.f7287b, 1100L);
                    this.N0 = kVar;
                    kVar.F(650L);
                }
                if (!this.N0.v()) {
                    this.N0.l(0.0f);
                    this.N0.i(1.0f);
                    return;
                }
                return;
            }
            k kVar2 = this.N0;
            if (kVar2 != null && kVar2.o() == 0.0f) {
                this.N0.l(0.0f);
            }
        }
    }

    @Override
    public void d(TdApi.Call call) {
        if (s() == call.f19905id) {
            E0(call);
        }
    }

    public final void d0(boolean z10, boolean z11) {
        if (this.J0 != z10) {
            this.J0 = z10;
            float f10 = z10 ? 1.0f : 0.0f;
            if (z11) {
                if (this.K0 == null) {
                    this.K0 = new k(5, this, db.b.f7287b, 180L, this.L0);
                }
                this.K0.i(f10);
                return;
            }
            k kVar = this.K0;
            if (kVar != null) {
                kVar.l(f10);
            }
            e0(f10);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        v4<?> F;
        if (this.f24575m0 && this.f24576n0 > 0.0f) {
            if (w.G2()) {
                canvas.drawRect(0.0f, 0.0f, this.f24576n0, this.O, y.g(this.f24577o0));
            } else {
                int i10 = this.M;
                canvas.drawRect(i10 - this.f24576n0, 0.0f, i10, this.O, y.g(this.f24577o0));
            }
        }
        if (z()) {
            m(canvas);
        }
        float f10 = this.U;
        if (f10 == 1.0f && this.V == 0.0f) {
            canvas.drawRect(0.0f, 0.0f, this.M, this.O, y.g(this.f24564c));
            if (!(this.f24573k0 == 0.0f || this.f24574l0 == 0)) {
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, this.M, this.O);
                int i11 = this.M;
                float f11 = this.O;
                float sqrt = ((float) Math.sqrt((i11 * i11) + (f11 * f11))) * 0.5f;
                float i12 = w.G2() ? ((a0.i(49.0f) / 2) - a0.i(3.0f)) - a0.i(5.0f) : (this.M - (a0.i(49.0f) / 2)) + a0.i(3.0f) + a0.i(5.0f);
                float f12 = this.f24573k0;
                canvas.drawCircle(i12 + (((this.M / 2) - i12) * this.f24573k0), d1.getTopOffset() + (d1.a3(false) / 2) + a0.i(2.0f), sqrt * f12, y.g(d.a((f12 * 0.65f) + 0.35f, this.f24574l0)));
                canvas.restore();
            }
            f3.d(canvas, 0, this.M, (int) this.P, this.f24572j0);
        } else if (f10 == 1.0f) {
            canvas.drawRect(0.0f, 0.0f, this.M, this.O, y.g(this.f24564c));
        } else {
            canvas.drawRect(0.0f, 0.0f, this.M, this.O * f10, y.g(this.f24564c));
        }
        q1 q1Var = this.f24562b;
        if (q1Var != null && (F = q1Var.F()) != null) {
            F.i9(canvas, this.M, (int) this.O);
        }
    }

    public final void e() {
        throw new UnsupportedOperationException("Method not decompiled: ud.x0.e():void");
    }

    public final void e0(float f10) {
        if (this.L0 != f10) {
            this.L0 = f10;
            E();
        }
    }

    @Override
    public void e1(int i10, boolean z10, boolean z11) {
        l0(z10, true);
    }

    @Override
    public void e2() {
        E();
    }

    @Override
    public void e5(o6 o6Var, TdApi.Message message, int i10, int i11, float f10, boolean z10) {
        boolean z11;
        TdApi.Message message2;
        boolean z12 = true;
        if (this.f24578p0 == o6Var && this.f24579q0 == message) {
            z11 = false;
        } else {
            if (this.f24579q0 != null) {
                ya.o1().w2().T0(this.f24578p0, this.f24579q0, this);
            }
            this.f24579q0 = message;
            this.f24578p0 = o6Var;
            z11 = true;
        }
        boolean z13 = i11 == 3;
        TdApi.Message message3 = (message == null || i11 == 0) ? null : message;
        if (this.S != o6Var || (message2 = this.T) != message3) {
            this.S = o6Var;
            this.T = message3;
            boolean z14 = message3 != null;
            v0(2, z14, true, false);
            z12 = z14;
        } else if (message == null || !o0.D(message, message2)) {
            z12 = false;
        }
        if (z12) {
            l0(z13, z());
            if (z11) {
                ya.o1().w2().r(o6Var, message, this);
            }
        }
    }

    public final void f0(boolean z10) {
        if (this.F0 != z10) {
            this.F0 = z10;
            if (z10) {
                j0.d0(this);
            } else {
                j0.f0(this);
            }
        }
    }

    public final void g(int i10) {
        if (i10 == 2) {
            c();
        } else if (i10 == 4) {
            e();
        }
    }

    @Override
    public void g0(o6 o6Var, TdApi.Message message) {
        p0.a(this, o6Var, message);
    }

    @Override
    public long getLongPressDuration() {
        return b.b(this);
    }

    @Override
    public int getOpacity() {
        return 0;
    }

    public final boolean h(int i10) {
        return i10 > (this.Y & (~i10));
    }

    public final void h0(float f10) {
        if (this.R0 != f10) {
            this.R0 = f10;
            E();
        }
    }

    @Override
    public void i(o6 o6Var, long j10, long j11, int i10, int i11) {
    }

    public final void i0(boolean z10, boolean z11) {
        if (this.P0 != z10) {
            this.P0 = z10;
            float f10 = z10 ? 1.0f : 0.0f;
            if (z11) {
                if (this.Q0 == null) {
                    this.Q0 = new k(2, this, db.b.f7287b, 180L, this.R0);
                }
                this.Q0.i(f10);
                return;
            }
            k kVar = this.Q0;
            if (kVar != null) {
                kVar.l(f10);
            }
            h0(f10);
        }
    }

    public void j(float f10) {
        boolean z10 = true;
        float f11 = 0.0f;
        if (f10 <= this.f24568f0) {
            float f12 = f10 - this.f24567e0;
            if (f12 <= 0.0f) {
                f11 = 1.0f;
            } else if (f12 < d1.getPlayerSize()) {
                f11 = 1.0f - (f12 / d1.getPlayerSize());
            }
            this.V = f11;
            float f13 = this.O;
            if (f10 > f13) {
                this.U = 1.0f;
            } else {
                this.U = f10 / f13;
            }
        } else if (this.U == 1.0f && this.V == 0.0f) {
            z10 = false;
        } else {
            this.U = 1.0f;
            this.V = 0.0f;
        }
        if (z10) {
            D();
        }
    }

    public void j0(boolean z10) {
        if (z10) {
            if (this.W != 0.0f) {
                this.V = 1.0f;
            }
            this.U = 0.0f;
        } else {
            this.V = 0.0f;
            this.U = 1.0f;
        }
        D();
    }

    public final void k(Canvas canvas, int i10, float f10, int i11, boolean z10) {
        ce.b.o(canvas, z10 ? f10 - (a0.i(50.0f) / 2) : a0.i(28.0f), i10 + ((i11 - i10) / 2), 1.0f, a0.i(9.0f), y.Y(d.a(this.f24572j0, j.o0()), a0.i(2.0f)));
    }

    public void k0(int i10) {
        this.f24564c = i10;
    }

    public final void l(Canvas canvas, int i10, float f10, int i11) {
        if (this.f24575m0 && this.f24576n0 > 0.0f) {
            canvas.drawRect(f10, i10, this.M, i11, y.g(j.u()));
        }
        float f11 = i11;
        canvas.drawRect(0.0f, i10, f10, f11, y.g(d.a(this.f24572j0, j.u())));
        if (this.f24580r0 != 0.0f) {
            canvas.drawRect(0.0f, i11 - (a0.i(1.0f) + 1), (int) (this.M * this.f24580r0), f11, y.g(d.a(this.f24572j0, j.L(R.id.theme_color_headerBarCallActive))));
        }
        TdApi.File j12 = t2.j1(this.T);
        int i12 = this.M - a0.i(28.0f);
        int d10 = i11 - (n.d() / 2);
        int i13 = a0.i(12.0f);
        Path path = this.f24588z0;
        float f12 = this.B0;
        float f13 = this.A0;
        this.B0 = f13;
        ce.b.t(canvas, i12, d10, i13, path, f12, f13, j12 != null ? t2.s1(j12) : 1.0f, d.a(this.f24572j0, j.o0()));
        Drawable drawable = this.f24563b0;
        float i14 = (this.M - a0.i(52.0f)) - this.f24563b0.getMinimumWidth();
        float d11 = (i11 - (n.d() / 2)) - (this.f24563b0.getMinimumHeight() / 2);
        float f14 = this.f24572j0;
        ce.c.b(canvas, drawable, i14, d11, f14 == 1.0f ? y.J() : y.W(d.a(f14, j.o0())));
        k(canvas, i10, this.M, i11, false);
        p(canvas, i10, f10, i11, a0.i(67.0f), null, 1.0f, 1.0f);
    }

    public void l0(boolean z10, boolean z11) {
        if (this.f24581s0 != z10) {
            this.f24581s0 = z10;
            float f10 = z10 ? 1.0f : 0.0f;
            if (z11) {
                if (this.f24587y0 == null) {
                    this.f24587y0 = new k(1, this, db.b.f7287b, 160L, this.A0);
                }
                this.f24587y0.i(f10);
                return;
            }
            k kVar = this.f24587y0;
            if (kVar != null) {
                kVar.l(f10);
            }
            o0(f10);
        }
    }

    public final void m(android.graphics.Canvas r5) {
        throw new UnsupportedOperationException("Method not decompiled: ud.x0.m(android.graphics.Canvas):void");
    }

    @Override
    public boolean m0(View view, float f10, float f11) {
        q1 q1Var = this.f24562b;
        return (q1Var == null || !q1Var.S()) && (this.X || this.W != 0.0f) && this.f24572j0 != 0.0f && this.V != 1.0f && f11 >= ((float) this.f24567e0) && f11 <= ((float) this.f24568f0) && f11 > this.O;
    }

    public final void n(Canvas canvas, int i10, float f10, int i11) {
        int d10 = d.d(j.L(R.id.theme_color_headerBarCallMuted), d.d(j.L(R.id.theme_color_headerBarCallActive), j.L(R.id.theme_color_headerBarCallIncoming), this.L0), (1.0f - this.R0) * this.I0);
        if (this.f24575m0 && this.f24576n0 > 0.0f) {
            canvas.drawRect(f10, i10, this.M, i11, y.g(d10));
        }
        int a10 = d.a(this.f24572j0, d10);
        canvas.drawRect(0.0f, i10, f10, i11, y.g(a10));
        Paint W = y.W(-1);
        W.setAlpha((int) (this.f24572j0 * 255.0f * this.I0 * (1.0f - this.L0)));
        int i12 = (this.M - a0.i(12.0f)) - this.f24561a0.getMinimumWidth();
        int i13 = a0.i(6.0f) + i10;
        ce.c.b(canvas, this.f24561a0, i12, i13, W);
        ce.b.i(canvas, i12 + (this.f24561a0.getMinimumWidth() / 2), i13 + (this.f24561a0.getMinimumHeight() / 2), this.R0, d.b(W.getAlpha(), 16777215), a10);
        W.setAlpha((int) (this.f24572j0 * 255.0f));
        int i14 = a0.i(18.0f);
        int i15 = a0.i(6.0f) + i10;
        float f11 = this.L0 * this.I0;
        int i16 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        if (i16 != 0) {
            canvas.save();
            canvas.rotate(f11 * 225.0f, (this.Z.getMinimumWidth() / 2) + i14, (this.Z.getMinimumHeight() / 2) + i15);
        }
        ce.c.b(canvas, this.Z, i14, i15, W);
        if (this.I0 != 1.0f) {
            ce.b.i(canvas, i14 + (this.Z.getMinimumWidth() / 2), (i15 + (this.Z.getMinimumHeight() / 2)) - a0.i(2.0f), 1.0f - this.I0, d.b((int) (this.f24572j0 * 255.0f), 16777215), d10);
        }
        if (i16 != 0) {
            canvas.restore();
        }
        W.setAlpha(255);
        float f12 = this.O0;
        p(canvas, i10, f10, i11, this.f24566d0, t.f15467a, 1.0f, (f12 <= 0.5f ? 1.0f - (f12 / 0.5f) : (f12 - 0.5f) / 0.5f) * 0.8784314f);
    }

    public void n0() {
        this.f24569g0 = true;
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 0) {
            u0(f10);
        } else if (i10 == 1) {
            o0(f10);
        } else if (i10 == 2) {
            h0(f10);
        } else if (i10 == 4) {
            a0(f10);
        } else if (i10 == 5) {
            e0(f10);
        } else if (i10 == 6) {
            b0(f10);
        }
    }

    @Override
    public void o(View view, float f10, float f11) {
        ya.o1().w2().a1(0);
    }

    public final void o0(float f10) {
        if (this.A0 != f10) {
            this.A0 = f10;
            E();
        }
    }

    @Override
    public void o2(View view, float f10, float f11) {
        b.g(this, view, f10, f11);
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        if (i10 == 6) {
            this.N0.l(0.0f);
            if (this.M0) {
                this.N0.i(1.0f);
            }
        }
    }

    public final void p(Canvas canvas, int i10, float f10, int i11, int i12, je.k kVar, float f11, float f12) {
        int i13 = a0.i(9.0f);
        g gVar = this.f24584v0;
        if (gVar != null) {
            gVar.z(canvas, i12, i10 + i13, kVar, f11 * this.f24572j0);
        }
        g gVar2 = this.f24585w0;
        if (gVar2 != null) {
            gVar2.z(canvas, i12 + x(), i10 + i13, kVar, f12 * this.f24572j0);
        }
    }

    public void p0(float f10) {
        if (this.f24571i0 != f10) {
            this.f24571i0 = f10;
            K();
            D();
            j0.r(this.f24560a.getContext()).a1().I0();
        }
    }

    public void q(boolean z10) {
        if (this.R != z10) {
            this.R = z10;
            this.f24560a.invalidateOutline();
        }
    }

    public void q0(float f10, int i10) {
        this.f24573k0 = f10;
        this.f24574l0 = i10;
    }

    public int r() {
        return this.N + ((int) (d1.getPlayerSize() * this.W));
    }

    public void r0(boolean z10, float f10, int i10) {
        this.f24575m0 = z10;
        if (z10) {
            this.f24576n0 = f10;
            this.f24577o0 = i10;
            D();
        }
    }

    @Override
    public void run() {
        if (this.D0 != null) {
            e();
            E();
            if (this.F0) {
                j0.e0(this, w());
            }
        }
    }

    public final int s() {
        TdApi.Call call = this.D0;
        if (call != null) {
            return call.f19905id;
        }
        return 0;
    }

    public void s0(float f10) {
        float f11 = this.f24580r0;
        if (f11 != f10) {
            int i10 = this.M;
            int i11 = (int) (i10 * f11);
            this.f24580r0 = f10;
            if (i11 != ((int) (i10 * f10))) {
                E();
            }
        }
    }

    @Override
    public boolean s4(View view, float f10, float f11) {
        if (!B(f10, f11)) {
            return false;
        }
        ya.o1().w2().a1(1);
        return true;
    }

    @Override
    public void setAlpha(int i10) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public int t() {
        return f3.p();
    }

    public void t0(float f10) {
        if (this.f24572j0 != f10) {
            this.f24572j0 = f10;
            D();
        }
    }

    public int u() {
        return this.R ? n.e() + n.h() : this.Q ? Math.min((int) this.O, n.e() + n.h()) : n.e();
    }

    public final void u0(float f10) {
        if (this.W != f10) {
            this.W = f10;
            K();
            D();
            j0.r(this.f24560a.getContext()).a1().I0();
        }
    }

    public int v() {
        return (int) (d1.getPlayerSize() * this.W);
    }

    public final void v0(int i10, boolean z10, boolean z11, boolean z12) {
        if (ib.c.b(this.Y, i10) != z10) {
            int h10 = ib.c.h(this.Y, i10, z10);
            this.Y = h10;
            if (z10) {
                if (h(i10)) {
                    this.f24565c0 = i10;
                    g(i10);
                }
            } else if ((h10 & 4) != 0) {
                e();
            } else if ((h10 & 2) != 0) {
                c();
            }
            if (z10 || this.Y != 0) {
                E();
            }
            y0(this.Y != 0, z12);
            return;
        }
        if (z11) {
            g(i10);
        }
        E();
    }

    public final long w() {
        return ya.o1().c0().M(this.C0, this.D0.f19905id);
    }

    public final void w0(String str, String str2, int i10) {
        int i11 = this.f24586x0;
        boolean z10 = true;
        boolean z11 = (i11 == 0 || i11 == i10) ? false : true;
        if (!i.c(this.f24582t0, str)) {
            this.f24582t0 = str;
            z11 = true;
        }
        if (!i.c(this.f24583u0, str2)) {
            this.f24583u0 = str2;
        } else {
            z10 = z11;
        }
        if (z10) {
            B0(i10);
        }
    }

    public final int x() {
        g gVar = this.f24584v0;
        if (gVar != null) {
            return gVar.getWidth();
        }
        return 0;
    }

    @Override
    public void x0(int i10, int i11) {
        if (s() == i10 && i11 == 3) {
            e();
            E();
        }
    }

    @Override
    public void x6(o6 o6Var, long j10, long j11, int i10, float f10, long j12, long j13, boolean z10) {
        TdApi.Message message = this.f24579q0;
        if (message != null && message.content.getConstructor() != 963323014) {
            s0(f10);
        }
    }

    public final int y() {
        if (this.f24569g0) {
            return d1.getTopOffset();
        }
        return 0;
    }

    public final void y0(boolean z10, boolean z11) {
        boolean z12 = this.X;
        if (z12 != z10) {
            this.X = z10;
            float f10 = 1.0f;
            if (z11) {
                if (!z10) {
                    f10 = 0.0f;
                }
                u0(f10);
                return;
            }
            q1 q1Var = this.f24562b;
            v4<?> F = q1Var != null ? q1Var.F() : null;
            boolean z13 = F != null && !F.Me();
            if (!z10) {
                f10 = 0.0f;
            }
            if (z13) {
                if (this.S0 == null) {
                    this.S0 = new k(0, this, db.b.f7287b, 200L, this.W);
                }
                this.S0.i(f10);
                return;
            }
            k kVar = this.S0;
            if (kVar != null) {
                kVar.l(f10);
            }
            u0(f10);
        } else if (z12) {
            D();
        }
    }

    public final boolean z() {
        return (this.W == 0.0f || this.V == 1.0f || this.f24572j0 == 0.0f) ? false : true;
    }

    public final void z0() {
        if (this.D0 != null) {
            CallSettings h02 = this.C0.e2().h0(this.D0.f19905id);
            if (h02 == null) {
                h02 = new CallSettings(this.C0, this.D0.f19905id);
            }
            i0(!h02.isMicMuted(), true);
            h02.setMicMuted(this.P0);
        }
    }

    @Override
    public void z6(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
        b.j(this, view, motionEvent, f10, f11, f12, f13);
    }
}
