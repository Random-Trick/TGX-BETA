package de;

import ae.j;
import android.content.Context;
import android.content.res.Configuration;
import android.gesture.Gesture;
import android.gesture.GestureOverlayView;
import android.os.Build;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ce.a0;
import ce.j0;
import ce.p0;
import ce.x;
import db.g;
import gd.l;
import gd.o;
import gd.p;
import gd.w;
import he.d;
import he.i;
import ie.i0;
import ie.u0;
import ie.x0;
import ie.y0;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.q3;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.a;
import org.thunderdog.challegram.v.EditTextBase;
import ud.d1;
import ud.h1;
import ud.s;
import ud.v4;
import ud.w2;
import zc.c;
import zc.i;
import zd.hj;
import zd.o6;

public class ii extends v4<b> implements h1, TextView.OnEditorActionListener, c.b, i.a, x0, y0, GestureOverlayView.OnGesturePerformedListener, p.a, o.b, a.m, i.k {
    public i0 A0;
    public GestureOverlayView B0;
    public boolean C0;
    public q3 D0;
    public int E0;
    public i0 F0;
    public View G0;
    public boolean H0;
    public boolean I0;
    public String[] J0;
    public p K0;
    public String L0;
    public int f8283n0 = 0;
    public int f8284o0;
    public FrameLayoutFix f8285p0;
    public c f8286q0;
    public TdApi.Chat f8287r0;
    public o6.j f8288s0;
    public hj.j f8289t0;
    public boolean f8290u0;
    public int f8291v0;
    public q3 f8292w0;
    public String f8293x0;
    public EditTextBase f8294y0;
    public zc.i f8295z0;

    public class a extends FrameLayoutFix {
        public a(Context context) {
            super(context);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return (motionEvent.getAction() == 0 && !ii.this.nf() && he.i.c2().h2(ii.this.f8284o0, ii.this.L2())) || super.onInterceptTouchEvent(motionEvent);
        }
    }

    public static class b {
        public final TdApi.Chat f8296a;
        public final o6.j f8297b;
        public final hj.j f8298c;

        public b(TdApi.Chat chat, o6.j jVar, hj.j jVar2) {
            this.f8296a = chat;
            this.f8297b = jVar == null ? new o6.j(0, 0, "", null) : jVar;
            this.f8298c = jVar2;
        }
    }

    public ii(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public static int ef(int i10) {
        if (i10 == 1) {
            return R.string.PasscodeInvalidPin;
        }
        if (i10 == 2) {
            return R.string.PasscodeInvalidPassword;
        }
        if (i10 == 3) {
            return R.string.PasscodeInvalidPattern;
        }
        if (i10 == 4) {
            return R.string.PasscodeInvalidGesture;
        }
        throw new IllegalArgumentException("mode == " + i10);
    }

    public static int ff(int i10) {
        if (i10 == 1) {
            return R.string.PasscodeMismatchPin;
        }
        if (i10 == 2) {
            return R.string.PasscodeMismatchPassword;
        }
        if (i10 == 3) {
            return R.string.PasscodeMismatchPattern;
        }
        if (i10 == 4) {
            return R.string.PasscodeMismatchGesture;
        }
        if (i10 == 5) {
            return R.string.PasscodeMismatchFingerprint;
        }
        throw new IllegalArgumentException("mode == " + i10);
    }

    public void pf(i0 i0Var) {
        String i0Var2 = i0Var.toString();
        if (this.f8283n0 == 2 && d.w().h(i0Var2)) {
            he.i.c2().f0(3, L2());
            ac(new mi(this.f24493a, this.f24495b));
        } else if (this.f8283n0 != 0 || !Vf(i0Var2)) {
            he.i.c2().i6(3, i0Var2, L2());
            j0.y0(ef(3), 0);
        } else {
            he.i.c2().f0(3, L2());
            j0.E0(this);
        }
    }

    public void qf(i0 i0Var) {
        String i0Var2 = i0Var.toString();
        if (d.B(i0Var2)) {
            Mf(i0Var2);
            ed();
            return;
        }
        j0.z0("Error setting up pattern", 0);
    }

    public void rf() {
        this.f8286q0.getPincodeOutput().t();
    }

    public void sf(i0 i0Var) {
        String i0Var2 = i0Var.toString();
        if (this.f8283n0 == 2 && d.w().i(i0Var2)) {
            he.i.c2().f0(1, L2());
            ac(new mi(this.f24493a, this.f24495b));
        } else if (this.f8283n0 != 0 || !Wf(i0Var2)) {
            he.i.c2().i6(1, i0Var2, L2());
            j0.y0(ef(1), 0);
            j0.d0(new Runnable() {
                @Override
                public final void run() {
                    ii.this.rf();
                }
            });
        } else {
            he.i.c2().f0(1, L2());
            j0.E0(this);
        }
    }

    public void tf(i0 i0Var) {
        String i0Var2 = i0Var.toString();
        if (d.C(i0Var2)) {
            Nf(i0Var2);
            ed();
            return;
        }
        j0.z0("Error setting up pincode", 0);
    }

    public void uf(int i10) {
        if (this.f8290u0) {
            bf(i10);
        } else {
            Ff(i10);
        }
        ed();
    }

    public void vf(Gesture gesture) {
        if (this.f8283n0 == 2 && df().a(gesture, false, this)) {
            he.i.c2().f0(4, L2());
            ac(new mi(this.f24493a, this.f24495b));
        } else if (this.f8283n0 != 0 || !df().a(gesture, false, this)) {
            he.i.c2().i6(4, null, L2());
            j0.y0(ef(4), 0);
        } else {
            Tf();
            he.i.c2().f0(4, L2());
            j0.E0(this);
        }
    }

    public void wf(Gesture gesture) {
        if (!df().a(gesture, true, null)) {
            j0.y0(ff(4), 0);
        } else if (df().e(gesture)) {
            Gf();
            ed();
        } else {
            j0.z0("Error saving gesture file", 0);
        }
    }

    public void xf(Gesture gesture) {
        df().f(gesture);
        this.C0 = false;
    }

    public void yf(String str) {
        if (this.f8283n0 == 2 && d.w().g(str)) {
            he.i.c2().f0(2, L2());
            ac(new mi(this.f24493a, this.f24495b));
        } else if (this.f8283n0 != 0 || !Uf(str)) {
            he.i.c2().i6(2, str, L2());
            j0.y0(ef(2), 0);
        } else {
            he.i.c2().f0(2, L2());
            j0.E0(this);
        }
    }

    @Override
    public int A9() {
        return 3;
    }

    public final void Af(final Gesture gesture) {
        if (this.f8284o0 != 4) {
            return;
        }
        if (nf()) {
            Bf(gesture);
        } else if (!he.i.c2().h2(4, L2())) {
            l.a().b(new Runnable() {
                @Override
                public final void run() {
                    ii.this.vf(gesture);
                }
            });
        }
    }

    @Override
    public void Bc(int i10, boolean z10) {
        if (i10 == 1 && this.f8283n0 == 1 && z10 && o.f()) {
            If(5);
        }
    }

    public final void Bf(final Gesture gesture) {
        if (this.f8286q0.getState() == 3) {
            l.a().b(new Runnable() {
                @Override
                public final void run() {
                    ii.this.wf(gesture);
                }
            });
            return;
        }
        this.f8286q0.setState(3);
        this.C0 = true;
        l.a().b(new Runnable() {
            @Override
            public final void run() {
                ii.this.xf(gesture);
            }
        });
    }

    @Override
    public void C6() {
        if (!this.f8286q0.getPincodeOutput().o()) {
            i0 i0Var = this.A0;
            if (i0Var != null) {
                i0Var.f();
            }
            this.f8286q0.getPincodeOutput().s();
        }
    }

    @Override
    public long C9() {
        TdApi.Chat chat = this.f8287r0;
        if (chat != null) {
            return chat.f19908id;
        }
        return 0L;
    }

    public final boolean Cf() {
        throw new UnsupportedOperationException("Method not decompiled: de.ii.Cf():boolean");
    }

    public final boolean Df(String str) {
        if (this.f8286q0.getState() == 3) {
            if (!d.A(str) || !str.equals(this.f8293x0)) {
                j0.y0(ff(2), 0);
                return false;
            }
            Lf(str);
            x.c(this.f8294y0);
            Zb();
            return true;
        } else if (str.length() < 1) {
            j0.y0(R.string.passcode_password_tooshort, 0);
            return false;
        } else {
            this.f8293x0 = str;
            this.f8286q0.setState(3);
            this.f8294y0.setText("");
            return false;
        }
    }

    public void Ef(b bVar) {
        super.Ad(bVar);
        this.f8287r0 = bVar.f8296a;
        this.f8288s0 = bVar.f8297b;
        this.f8289t0 = bVar.f8298c;
    }

    public final void Ff(int i10) {
        if (this.f8287r0 != null) {
            this.f8288s0.f28142c = d.u(String.valueOf(i10));
            o6.j jVar = this.f8288s0;
            jVar.f28140a = 5;
            this.f24495b.mc(this.f8287r0, jVar);
            return;
        }
        d.w().J(i10);
    }

    @Override
    public String[] G4() {
        if (this.J0 == null) {
            boolean f10 = o.f();
            u0 u0Var = new u0(f10 ? 5 : 4);
            u0Var.a(R.string.PasscodePIN);
            u0Var.a(R.string.login_Password);
            u0Var.a(R.string.PasscodePattern);
            u0Var.a(R.string.PasscodeGesture);
            if (f10) {
                u0Var.a(R.string.PasscodeFingerprint);
            }
            this.J0 = u0Var.d();
        }
        return this.J0;
    }

    @Override
    public View G9() {
        int i10 = this.f8283n0;
        if (i10 != 0 || this.f8287r0 == null) {
            if (i10 != 1 || this.f8290u0) {
                return null;
            }
            if (this.G0 == null) {
                this.G0 = this.f24493a.Q1().I().J2(t(), this);
            }
        } else if (this.G0 == null) {
            s sVar = new s(this.f24493a);
            sVar.setThemedTextColor(this);
            sVar.A1(a0.i(49.0f), true);
            sVar.setSubtitle(w.m1(R.string.SecretChatWithUser, this.f24495b.W3(this.f8287r0)));
            this.G0 = sVar;
        }
        ag();
        return this.G0;
    }

    public final void Gf() {
        TdApi.Chat chat = this.f8287r0;
        if (chat != null) {
            o6.j jVar = this.f8288s0;
            jVar.f28140a = 4;
            jVar.f28142c = "";
            this.f24495b.mc(chat, jVar);
            return;
        }
        d.w().K();
    }

    @Override
    public void H4() {
        Xf();
    }

    public void Hf() {
        this.f8290u0 = true;
        this.f8291v0 = 5;
    }

    @Override
    public boolean I1() {
        if (this.f8286q0.getPincodeOutput().o() || !this.f8286q0.getPincodeOutput().t()) {
            return false;
        }
        i0 i0Var = this.A0;
        if (i0Var == null) {
            return true;
        }
        i0Var.b();
        return true;
    }

    @Override
    public boolean Ie() {
        return false;
    }

    public final void If(int i10) {
        if (this.f8284o0 != i10) {
            if (Build.VERSION.SDK_INT >= 23 && i10 == 5 && !o.e()) {
                j0.y0(R.string.fingerprint_hint3, 0);
                if (this.f8283n0 == 1) {
                    return;
                }
            }
            Hd(d.t(i10));
            ag();
            int i11 = this.f8284o0;
            if (i11 != 0) {
                if (i11 == 1) {
                    lf();
                } else if (i11 == 2) {
                    kf();
                } else if (i11 == 4) {
                    jf();
                } else if (i11 == 5) {
                    m5if();
                }
            }
            this.f8284o0 = i10;
            this.f8286q0.r(i10, this.f8283n0 == 1 ? 2 : 1);
            if (i10 == 1) {
                Rf();
            } else if (i10 == 2) {
                Qf();
            } else if (i10 == 4) {
                Pf();
            } else if (i10 == 5) {
                Of();
            }
            if (this.f8283n0 == 1) {
                Q();
            }
        }
    }

    @Override
    public void J(int i10, View view) {
        if (i10 == R.id.menu_btn_done) {
            Cf();
        }
    }

    public final void Jf(boolean z10) {
        if (this.H0 != z10) {
            this.H0 = z10;
            af();
        }
    }

    public void Kf(int i10) {
        this.f8283n0 = i10;
    }

    @Override
    public String L2() {
        TdApi.Chat chat = this.f8287r0;
        if (chat == null) {
            return null;
        }
        String str = this.L0;
        if (str != null) {
            return str;
        }
        String kd2 = this.f24495b.kd(chat.f19908id);
        this.L0 = kd2;
        return kd2;
    }

    @Override
    public int L9() {
        return R.id.theme_color_passcode;
    }

    public final void Lf(String str) {
        if (this.f8287r0 != null) {
            this.f8288s0.f28142c = d.u(str);
            o6.j jVar = this.f8288s0;
            jVar.f28140a = 2;
            this.f24495b.mc(this.f8287r0, jVar);
            return;
        }
        d.w().N(str);
    }

    public final void Mf(String str) {
        if (this.f8287r0 != null) {
            this.f8288s0.f28142c = d.u(str);
            o6.j jVar = this.f8288s0;
            jVar.f28140a = 3;
            this.f24495b.mc(this.f8287r0, jVar);
            return;
        }
        d.w().O(str);
    }

    public final void Nf(String str) {
        if (this.f8287r0 != null) {
            this.f8288s0.f28142c = d.u(str);
            o6.j jVar = this.f8288s0;
            jVar.f28140a = 1;
            this.f24495b.mc(this.f8287r0, jVar);
            return;
        }
        d.w().P(str);
    }

    @Override
    public int O9() {
        return R.id.theme_color_passcodeIcon;
    }

    public final void Of() {
        if (this.D0 == null) {
            q3 q3Var = new q3(this.f24493a);
            this.D0 = q3Var;
            q3Var.setColorFilter(ib.d.a(j.f0(), j.L(R.id.theme_color_passcodeIcon)));
            q8(this.D0, R.id.theme_color_passcodeIcon).g(true);
            int z10 = j0.z();
            FrameLayout.LayoutParams q12 = FrameLayoutFix.q1(a0.i(82.0f), a0.i(82.0f));
            Zf(q12, z10);
            this.D0.setLayoutParams(q12);
        } else if (nf()) {
            this.D0.e(q3.c.OFF, false);
        }
        this.f8285p0.addView(this.D0);
        Jf(true);
    }

    @Override
    public void P2(int i10) {
        If(i10 + 1);
    }

    public final void Pf() {
        if (this.B0 == null) {
            GestureOverlayView gestureOverlayView = new GestureOverlayView(t());
            this.B0 = gestureOverlayView;
            gestureOverlayView.setGestureStrokeWidth(a0.i(3.0f));
            this.B0.setOrientation(1);
            this.B0.setGestureColor(j.L(R.id.theme_color_passcodeIcon));
            this.B0.setUncertainGestureColor(j.L(R.id.theme_color_passcodeIcon));
            this.B0.setGestureVisible(z2());
            this.B0.setFadeEnabled(true);
            this.B0.addOnGesturePerformedListener(this);
            this.B0.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        }
        this.f8285p0.addView(this.B0);
    }

    @Override
    public void Q() {
        int i10 = this.f8284o0;
        if (i10 == 1) {
            this.f8295z0.setHasFeedback(z2());
        } else if (i10 == 2) {
            this.f8294y0.setTransformationMethod(z2() ? PasswordTransformationMethod.getInstance() : zc.a.a());
        } else if (i10 == 4) {
            this.B0.setGestureVisible(z2());
        }
    }

    @Override
    public int Q9() {
        return R.id.theme_color_passcodeText;
    }

    public final void Qf() {
        if (this.f8294y0 == null) {
            EditTextBase editTextBase = (EditTextBase) p0.v(t(), R.layout.input_password, this.f8285p0);
            this.f8294y0 = editTextBase;
            editTextBase.setTypeface(ce.o.k());
            this.f8294y0.setTextSize(1, 16.0f);
            this.f8294y0.setUseIncognitoKeyboard(268435456);
            this.f8294y0.setInputType(129);
            this.f8294y0.setTransformationMethod(z2() ? PasswordTransformationMethod.getInstance() : zc.a.a());
            this.f8294y0.setGravity(17);
            this.f8294y0.setTextColor(j.L(R.id.theme_color_passcodeText));
            this.f8294y0.setOnEditorActionListener(this);
            this.f8294y0.setImeOptions(6);
            z8(this.f8294y0, R.id.theme_color_passcodeText);
            g.d(this.f8294y0, null);
            FrameLayout.LayoutParams q12 = FrameLayoutFix.q1(-1, a0.i(43.0f));
            q12.setMargins(a0.i(44.0f), a0.i(127.0f), a0.i(44.0f), 0);
            if (mf()) {
                q12.topMargin += d1.a3(true);
            }
            this.f8294y0.setLayoutParams(q12);
        }
        this.f8285p0.addView(this.f8294y0);
        if (mf()) {
            j0.u0(this.f8294y0);
        } else if (!Wa()) {
            x.f(this.f8294y0);
        }
    }

    @Override
    public void R5(int i10) {
        if (!this.f8286q0.getPincodeOutput().o()) {
            i0 i0Var = this.A0;
            if (i0Var == null || i0Var.e() < 4) {
                if (this.A0 == null) {
                    this.A0 = new i0();
                }
                this.A0.a(i10);
                this.f8286q0.getPincodeOutput().j();
                if (this.A0.e() == 4) {
                    hf(new i0(this.A0));
                    this.A0.b();
                }
            }
        }
    }

    @Override
    public int R9() {
        return R.id.controller_passcode;
    }

    public final void Rf() {
        if (this.f8295z0 == null) {
            zc.i iVar = new zc.i(t());
            this.f8295z0 = iVar;
            iVar.A1(z2());
            this.f8295z0.setCallback(this);
        }
        bg();
        this.f8285p0.addView(this.f8295z0);
    }

    public final boolean Sf(int i10) {
        if (this.f8287r0 == null) {
            return d.w().V(i10);
        }
        String u10 = d.u(String.valueOf(i10));
        o6.j jVar = this.f8288s0;
        if (jVar.f28140a == 5) {
            return jVar.f28142c.equals(u10);
        }
        String str = jVar.f28143d;
        return str != null && str.equals(u10);
    }

    public final void Tf() {
        if (this.f8287r0 == null) {
            d.w().U();
        }
    }

    public final boolean Uf(String str) {
        if (this.f8287r0 == null) {
            return d.w().W(str);
        }
        o6.j jVar = this.f8288s0;
        return jVar.f28140a == 2 && jVar.f28142c.equals(d.u(str));
    }

    @Override
    public void V(org.thunderdog.challegram.a aVar, int i10, int i11) {
        af();
    }

    @Override
    public boolean V0() {
        return this.f24493a.z1();
    }

    @Override
    public void V6(String str, boolean z10) {
        j0.z0(str, 0);
        q3 q3Var = this.f8292w0;
        if (q3Var != null) {
            q3Var.g(z10);
        }
        q3 q3Var2 = this.D0;
        if (q3Var2 != null) {
            q3Var2.g(z10);
        }
    }

    public final boolean Vf(String str) {
        if (this.f8287r0 == null) {
            return d.w().X(str);
        }
        o6.j jVar = this.f8288s0;
        return jVar.f28140a == 3 && jVar.f28142c.equals(d.u(str));
    }

    @Override
    public int W9() {
        return 0;
    }

    public final boolean Wf(String str) {
        if (this.f8287r0 == null) {
            return d.w().Y(str);
        }
        o6.j jVar = this.f8288s0;
        return jVar.f28140a == 1 && jVar.f28142c.equals(d.u(str));
    }

    public void Xf() {
        if (this.f8284o0 == 2) {
            x.c(this.f8294y0);
        }
        if (this.f8287r0 != null) {
            hj hd2 = this.f24495b.hd();
            TdApi.Chat chat = this.f8287r0;
            hj.j jVar = this.f8289t0;
            if (jVar == null) {
                jVar = new hj.j();
            }
            hd2.C4(this, chat, jVar.m());
            return;
        }
        t().l1();
    }

    public void Yf() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.D0.getLayoutParams();
        Zf(layoutParams, j0.z());
        this.D0.setLayoutParams(layoutParams);
    }

    @Override
    public void Z8() {
        Jf(false);
        this.f24493a.A2(this);
        he.i.c2().L3(this);
        super.Z8();
    }

    public final void Zf(FrameLayout.LayoutParams layoutParams, int i10) {
        layoutParams.gravity = i10 == 2 ? 21 : 49;
        int i11 = a0.i(44.0f);
        layoutParams.rightMargin = i11;
        layoutParams.leftMargin = i11;
        if (i10 == 2) {
            layoutParams.topMargin = 0;
            return;
        }
        layoutParams.topMargin = a0.i(118.0f);
        if (mf()) {
            layoutParams.topMargin += d1.a3(true);
        }
    }

    public final void af() {
        boolean z10 = this.H0 && this.f24493a.L0() == 0;
        if (this.I0 != z10) {
            if (z10) {
                o.b(this);
            } else {
                o.c();
            }
            this.I0 = z10;
        }
    }

    public final void ag() {
        View view = this.G0;
        if (view instanceof w2) {
            ((w2) view).setText(X9());
        } else if (view instanceof s) {
            ((s) view).setTitle(X9());
        }
    }

    @Override
    public int ba() {
        return R.id.theme_color_passcode;
    }

    public final void bf(int i10) {
        if (this.f8287r0 != null) {
            this.f8288s0.f28143d = d.u(String.valueOf(i10));
            this.f24495b.mc(this.f8287r0, this.f8288s0);
            return;
        }
        d.w().m(i10);
    }

    public final void bg() {
        FrameLayout.LayoutParams t12 = FrameLayoutFix.t1(this.f8295z0.getLayoutParams());
        if (j0.z() == 2) {
            t12.gravity = 53;
            t12.topMargin = 0;
        } else {
            t12.gravity = 49;
            t12.topMargin = a0.i(156.0f);
        }
        if (mf()) {
            t12.topMargin += d1.a3(true);
        }
        this.f8295z0.B1();
        this.f8295z0.setLayoutParams(t12);
    }

    public void cf(int i10) {
        this.f8291v0 = i10;
    }

    @Override
    public void d6(final int i10) {
        this.I0 = false;
        int i11 = this.f8283n0;
        if (i11 != 1) {
            if (i11 != 2 || !d.w().e(i10)) {
                if (this.f8283n0 != 0 || !Sf(i10)) {
                    j0.y0(R.string.fingerprint_fail, 0);
                } else {
                    j0.E0(this);
                }
                af();
                return;
            }
            ac(new mi(this.f24493a, this.f24495b));
        } else if (this.f8286q0.getState() != 3) {
            this.E0 = i10;
            this.f8286q0.setState(3);
            Jf(true);
            q3 q3Var = this.D0;
            if (q3Var != null) {
                q3Var.f(0);
            }
            af();
        } else if (this.E0 == i10) {
            l.a().b(new Runnable() {
                @Override
                public final void run() {
                    ii.this.uf(i10);
                }
            });
        } else {
            j0.y0(ff(5), 0);
            af();
        }
    }

    public final p df() {
        String str;
        if (this.K0 == null) {
            if (this.f8287r0 != null) {
                str = this.f24495b.jd() + "." + this.f8287r0.f19908id;
            } else {
                str = null;
            }
            this.K0 = new p(str);
        }
        return this.K0;
    }

    @Override
    public void f6(String str) {
        c cVar;
        if (ib.i.c(str, L2()) && (cVar = this.f8286q0) != null) {
            cVar.t();
        }
    }

    public final int gf() {
        if (this.f8287r0 == null) {
            return d.w().r();
        }
        o6.j jVar = this.f8288s0;
        if (jVar != null) {
            return jVar.f28140a;
        }
        return 0;
    }

    public void hf(final i0 i0Var) {
        if (!nf()) {
            if (!he.i.c2().h2(1, L2())) {
                l.a().b(new Runnable() {
                    @Override
                    public final void run() {
                        ii.this.sf(i0Var);
                    }
                });
            }
        } else if (this.f8286q0.getState() == 3) {
            if (i0Var.c(this.F0)) {
                l.a().b(new Runnable() {
                    @Override
                    public final void run() {
                        ii.this.tf(i0Var);
                    }
                });
                return;
            }
            j0.y0(ff(1), 0);
            this.f8286q0.getPincodeOutput().t();
        } else if (i0Var.e() != 4) {
            j0.y0(R.string.passcode_pattern_tooshort, 0);
        } else {
            this.F0 = new i0(i0Var);
            this.f8286q0.setState(3);
            this.f8286q0.getPincodeOutput().t();
        }
    }

    public final void m5if() {
        Jf(false);
        this.f8285p0.removeView(this.D0);
    }

    public final void jf() {
        this.f8285p0.removeView(this.B0);
    }

    @Override
    public void kc() {
        super.kc();
        if (this.f8284o0 == 2) {
            x.c(this.f8294y0);
        }
    }

    public final void kf() {
        x.c(this.f8294y0);
        this.f8285p0.removeView(this.f8294y0);
    }

    public final void lf() {
        i0 i0Var = this.A0;
        if (i0Var != null) {
            i0Var.b();
        }
        this.f8286q0.getPincodeOutput().k();
        this.f8285p0.removeView(this.f8295z0);
    }

    @Override
    public void mc(Configuration configuration) {
        super.mc(configuration);
        this.f8286q0.setOrientation(configuration.orientation);
        int i10 = this.f8284o0;
        if (i10 == 1) {
            bg();
        } else if (i10 == 5) {
            Yf();
        }
    }

    public final boolean mf() {
        return this.f8283n0 == 0 && this.f8287r0 == null;
    }

    public boolean nf() {
        return this.f8283n0 == 1;
    }

    @Override
    public View oc(Context context) {
        a aVar = new a(context);
        this.f8285p0 = aVar;
        yd.g.i(aVar, R.id.theme_color_passcode, this);
        this.f8285p0.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        G9();
        c cVar = new c(context);
        this.f8286q0 = cVar;
        cVar.setCallback(this);
        int i10 = 1;
        if (mf()) {
            this.f8286q0.setPadding(0, d1.a3(true), 0, 0);
            this.f8286q0.q();
        }
        if (nf()) {
            int i11 = this.f8291v0;
            if (i11 != 0) {
                i10 = i11;
            } else if (of()) {
                i10 = gf();
            }
            If(i10);
        } else {
            If(gf());
            if (this.f8284o0 != 5 && zf()) {
                q3 q3Var = new q3(context);
                this.f8292w0 = q3Var;
                q3Var.setColorFilter(ib.d.a(j.f0(), j.L(R.id.theme_color_passcodeIcon)));
                q8(this.f8292w0, R.id.theme_color_passcodeIcon).g(true);
                this.f8292w0.setLayoutParams(FrameLayoutFix.s1(a0.i(36.0f), a0.i(36.0f), 81, 0, 0, 0, a0.i(18.0f)));
                Jf(true);
                this.f8285p0.addView(this.f8292w0);
            }
        }
        this.f8285p0.addView(this.f8286q0, FrameLayoutFix.q1(-1, -1));
        this.f24493a.Z(this);
        if (!nf()) {
            he.i.c2().q(this);
        }
        return this.f8285p0;
    }

    public final boolean of() {
        if (this.f8287r0 == null) {
            return d.w().x();
        }
        o6.j jVar = this.f8288s0;
        return (jVar == null || jVar.f28140a == 0) ? false : true;
    }

    @Override
    public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        return i10 == 6 && !Cf();
    }

    @Override
    public void onGesturePerformed(GestureOverlayView gestureOverlayView, Gesture gesture) {
        if (!this.C0) {
            Af(gesture);
        }
    }

    @Override
    public void sc() {
        super.sc();
        if (this.f8284o0 == 2) {
            j0.u0(this.f8294y0);
        }
        int i10 = this.f8283n0;
        int i11 = (i10 == 2 || this.f8287r0 != null) ? 0 : i10 == 0 ? 300 : 100;
        q3 q3Var = this.f8292w0;
        if (q3Var != null) {
            q3Var.f(i11);
        }
        q3 q3Var2 = this.D0;
        if (q3Var2 != null && this.f8283n0 != 1) {
            q3Var2.f(i11);
        }
    }

    @Override
    public boolean sd(Bundle bundle, String str) {
        o6 o6Var;
        TdApi.Chat R3;
        o6.j A3;
        long j10 = bundle.getLong(str + "chat_id");
        if (j10 == 0 || (o6Var = this.f24495b) == null || (A3 = this.f24495b.A3((R3 = o6Var.R3(j10)))) == null) {
            return false;
        }
        super.sd(bundle, str);
        Ef(new b(R3, A3, hj.j.o(bundle, str)));
        return true;
    }

    @Override
    public void t5() {
        j0.z0("Error loading an existing gesture", 0);
        this.C0 = false;
    }

    @Override
    public void u1(int i10, d1 d1Var, LinearLayout linearLayout) {
        d1Var.T1(linearLayout, this);
    }

    @Override
    public boolean we() {
        return !this.f8286q0.h() && this.f8284o0 != 4;
    }

    @Override
    public boolean yd(Bundle bundle, String str) {
        if (this.f8287r0 == null) {
            return false;
        }
        hj.j jVar = this.f8289t0;
        if (jVar != null && !jVar.p(bundle, str)) {
            return false;
        }
        super.yd(bundle, str);
        bundle.putLong(str + "chat_id", this.f8287r0.f19908id);
        return true;
    }

    @Override
    public void z1(final i0 i0Var) {
        if (!nf()) {
            if (!he.i.c2().h2(3, L2())) {
                l.a().b(new Runnable() {
                    @Override
                    public final void run() {
                        ii.this.pf(i0Var);
                    }
                });
            }
        } else if (this.f8286q0.getState() == 3) {
            if (i0Var.c(this.F0)) {
                l.a().b(new Runnable() {
                    @Override
                    public final void run() {
                        ii.this.qf(i0Var);
                    }
                });
            } else {
                j0.y0(ff(3), 0);
            }
        } else if (i0Var.e() < 4) {
            j0.y0(R.string.passcode_pattern_tooshort, 0);
        } else {
            this.F0 = new i0(i0Var);
            this.f8286q0.setState(3);
        }
    }

    @Override
    public boolean z2() {
        boolean z10;
        if (this.f8284o0 == 2) {
            return true;
        }
        if (this.f8287r0 != null) {
            o6.j jVar = this.f8288s0;
            z10 = jVar == null || jVar.a();
        } else {
            z10 = d.w().D();
        }
        if (!z10) {
            return nf() && this.f8286q0.getState() != 3;
        }
        return true;
    }

    public final boolean zf() {
        if (this.f8287r0 == null) {
            return d.w().E();
        }
        o6.j jVar = this.f8288s0;
        return (jVar == null || jVar.f28140a == 5 || ib.i.i(jVar.f28143d)) ? false : true;
    }
}
