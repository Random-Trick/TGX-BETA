package de;

import ae.j;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import ce.a0;
import ce.j0;
import ce.p0;
import de.ii;
import gd.o;
import gd.w;
import he.d;
import ib.i;
import ie.g0;
import ie.h0;
import ie.u0;
import kb.k;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.b2;
import ne.d3;
import ne.f3;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import uc.c;
import ud.s;
import ud.v4;
import yd.g;
import zd.o6;
import zd.ya;

public class mi extends v4<b> implements View.OnClickListener, Runnable {
    public TdApi.Chat A0;
    public o6.j B0;
    public s C0;
    public LinearLayout D0;
    public boolean E0;
    public boolean F0;
    public String[] G0;
    public ScrollView f8734n0;
    public LinearLayout f8735o0;
    public c f8736p0;
    public c f8737q0;
    public c f8738r0;
    public c f8739s0;
    public d3 f8740t0;
    public c f8741u0;
    public c f8742v0;
    public c f8743w0;
    public d3 f8744x0;
    public f3 f8745y0;
    public f3 f8746z0;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            mi.this.f8735o0.setVisibility(4);
        }
    }

    public static class b {
        public final TdApi.Chat f8748a;
        public final o6.j f8749b;

        public b(TdApi.Chat chat, o6.j jVar) {
            this.f8748a = chat;
            this.f8749b = jVar;
        }
    }

    public mi(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public boolean Ye(View view, int i10) {
        if (Sa()) {
            return true;
        }
        d.w().H(i10);
        m9if();
        return true;
    }

    public void Ze(int i10) {
        ii iiVar = new ii(this.f24493a, this.f24495b);
        TdApi.Chat chat = this.A0;
        if (chat != null) {
            iiVar.Ef(new ii.b(chat, this.B0, null));
        }
        iiVar.Kf(1);
        iiVar.cf(i10);
        ac(iiVar);
    }

    public static boolean af(k kVar, View view, int i10) {
        int i11;
        switch (i10) {
            case R.id.btn_passcodeType_fingerprint:
                i11 = 5;
                break;
            case R.id.btn_passcodeType_gesture:
                i11 = 4;
                break;
            case R.id.btn_passcodeType_password:
                i11 = 2;
                break;
            case R.id.btn_passcodeType_pattern:
                i11 = 3;
                break;
            case R.id.btn_passcodeType_pin:
                i11 = 1;
                break;
            default:
                i11 = 0;
                break;
        }
        if (i11 == 0) {
            return true;
        }
        if (i11 != 5 || (o.f() && o.e())) {
            kVar.a(i11);
            return true;
        }
        j0.y0(R.string.fingerprint_hint3, 0);
        return true;
    }

    public static TextView cf(v4<?> v4Var) {
        b2 b2Var = new b2(v4Var.t());
        b2Var.setGravity(w.F1() | 16);
        b2Var.setPadding(a0.i(16.0f), a0.i(6.0f), a0.i(16.0f), a0.i(12.0f));
        b2Var.setTypeface(ce.o.k());
        b2Var.setTextSize(1, 15.0f);
        b2Var.setTextColor(j.Q0());
        v4Var.z8(b2Var, R.id.theme_color_background_textLight);
        return b2Var;
    }

    public static void hf(v4<?> v4Var, CharSequence charSequence, final k kVar) {
        boolean f10 = o.f();
        int i10 = f10 ? 5 : 4;
        jb.c cVar = new jb.c(i10);
        u0 u0Var = new u0(i10);
        jb.c cVar2 = new jb.c(i10);
        cVar.a(R.id.btn_passcodeType_pin);
        u0Var.a(R.string.PasscodePIN);
        cVar2.a(R.drawable.vkryl_baseline_lock_pin_24);
        cVar.a(R.id.btn_passcodeType_password);
        u0Var.a(R.string.login_Password);
        cVar2.a(R.drawable.mrgrigri_baseline_textbox_password_24);
        cVar.a(R.id.btn_passcodeType_pattern);
        u0Var.a(R.string.PasscodePattern);
        cVar2.a(R.drawable.itsspelledhaley_baseline_lock_pattern_24);
        cVar.a(R.id.btn_passcodeType_gesture);
        u0Var.a(R.string.PasscodeGesture);
        cVar2.a(R.drawable.baseline_gesture_24);
        if (f10) {
            cVar.a(R.id.btn_passcodeType_fingerprint);
            u0Var.a(R.string.PasscodeFingerprint);
            cVar2.a(R.drawable.baseline_fingerprint_24);
        }
        v4Var.ee(charSequence, cVar.e(), u0Var.d(), null, cVar2.e(), new h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i11) {
                return g0.b(this, i11);
            }

            @Override
            public final boolean r3(View view, int i11) {
                boolean af;
                af = mi.af(k.this, view, i11);
                return af;
            }
        });
    }

    public static void lf(ViewGroup viewGroup) {
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof TextView) {
                    ((TextView) childAt).setGravity(w.F1() | 16);
                } else if (childAt instanceof c) {
                    ((c) childAt).G1(true);
                    childAt.invalidate();
                }
            }
        }
    }

    @Override
    public int A9() {
        return 3;
    }

    @Override
    public void Ac() {
        super.Ac();
        Te();
    }

    @Override
    public View G9() {
        return this.C0;
    }

    @Override
    public View Ga() {
        return this.f8734n0;
    }

    @Override
    public void Ia() {
        super.Ia();
        lf(this.D0);
        lf(this.f8735o0);
    }

    @Override
    public int R9() {
        return R.id.controller_passcodeSetup;
    }

    public final void Te() {
        boolean z10 = true;
        int i10 = 0;
        boolean z11 = We() != 5 && o.f();
        this.f8744x0.setVisibility(z11 ? 0 : 8);
        this.f8743w0.setVisibility(z11 ? 0 : 8);
        if (We() == 5) {
            z10 = false;
        }
        this.f8739s0.setVisibility(z10 ? 0 : 8);
        d3 d3Var = this.f8740t0;
        if (d3Var != null) {
            d3Var.setVisibility(z10 ? 0 : 8);
        }
        if (this.A0 != null) {
            if (!z11 && !z10) {
                i10 = 8;
            }
            f3 f3Var = this.f8745y0;
            if (f3Var != null) {
                f3Var.setVisibility(i10);
            }
            f3 f3Var2 = this.f8746z0;
            if (f3Var2 != null) {
                f3Var2.setVisibility(i10);
            }
        }
    }

    public final void Ue() {
        TdApi.Chat chat = this.A0;
        if (chat != null) {
            this.B0 = null;
            this.f24495b.mc(chat, null);
            return;
        }
        d.w().j();
    }

    public final void Ve() {
        TdApi.Chat chat = this.A0;
        if (chat != null) {
            o6.j jVar = this.B0;
            if (jVar != null) {
                jVar.f28143d = null;
                this.f24495b.mc(chat, jVar);
                return;
            }
            return;
        }
        d.w().k();
    }

    public final int We() {
        if (this.A0 == null) {
            return d.w().r();
        }
        o6.j jVar = this.B0;
        if (jVar != null) {
            return jVar.f28140a;
        }
        return 0;
    }

    @Override
    public CharSequence X9() {
        return w.i1(R.string.PasscodeTitle);
    }

    public final boolean Xe() {
        if (this.A0 == null) {
            return d.w().x();
        }
        o6.j jVar = this.B0;
        return (jVar == null || jVar.f28140a == 0) ? false : true;
    }

    public final boolean bf() {
        if (this.A0 == null) {
            return d.w().E();
        }
        o6.j jVar = this.B0;
        return jVar != null && !i.i(jVar.f28143d);
    }

    public void df(b bVar) {
        super.Ad(bVar);
        this.A0 = bVar.f8748a;
        this.B0 = bVar.f8749b;
    }

    public final void ef(boolean z10) {
        if (this.A0 != null) {
            o6.j jVar = this.B0;
            if (jVar != null) {
                jVar.b(z10);
                this.f24495b.mc(this.A0, this.B0);
                return;
            }
            return;
        }
        d.w().Q(z10);
    }

    public final void ff() {
        if (this.G0 == null) {
            this.G0 = d.w().p();
        }
        jb.c cVar = new jb.c(this.G0.length);
        for (int i10 = 0; i10 < this.G0.length; i10++) {
            cVar.a(i10);
        }
        je(cVar.e(), this.G0, new h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i11) {
                return g0.b(this, i11);
            }

            @Override
            public final boolean r3(View view, int i11) {
                boolean Ye;
                Ye = mi.this.Ye(view, i11);
                return Ye;
            }
        });
    }

    public final void gf() {
        hf(this, null, new k() {
            @Override
            public final void a(int i10) {
                mi.this.Ze(i10);
            }
        });
    }

    public final void m9if() {
        if (this.f8738r0 != null) {
            if (this.G0 == null) {
                this.G0 = d.w().p();
            }
            this.f8738r0.setData(this.G0[d.w().o()]);
        }
    }

    public final void jf(boolean z10) {
        boolean Xe = Xe();
        int i10 = 0;
        if (!z10) {
            this.f8735o0.setAlpha(1.0f);
            LinearLayout linearLayout = this.f8735o0;
            if (!Xe) {
                i10 = 8;
            }
            linearLayout.setVisibility(i10);
            return;
        }
        if (Xe) {
            this.f8735o0.setAlpha(0.0f);
            this.f8735o0.setVisibility(0);
        }
        p0.h(this.f8735o0, Xe ? 1.0f : 0.0f, 150L, db.b.f7287b, Xe ? null : new a());
    }

    public void kf(boolean z10) {
        this.E0 = Xe();
        this.f8736p0.getToggler().r(this.E0, z10);
        if (z10) {
            this.f8737q0.setEnabledAnimated(this.E0);
        } else {
            this.f8737q0.setEnabled(this.E0);
        }
        jf(z10);
    }

    @Override
    public View oc(Context context) {
        if (this.A0 != null) {
            s sVar = new s(context);
            this.C0 = sVar;
            sVar.setThemedTextColor(this);
            this.C0.A1(a0.i(49.0f), true);
            this.C0.setTitle(X9());
            this.C0.setSubtitle(w.m1(R.string.SecretChatWithUser, this.f24495b.W3(this.A0)));
        }
        this.f8734n0 = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        this.D0 = linearLayout;
        linearLayout.setOrientation(1);
        c cVar = new c(context, this.f24495b);
        this.f8736p0 = cVar;
        cVar.setId(R.id.btn_passcode);
        this.f8736p0.setType(3);
        this.f8736p0.getToggler().r(Xe(), false);
        this.f8736p0.setName(R.string.PasscodeItem);
        this.f8736p0.setOnClickListener(this);
        this.f8736p0.A1(this);
        this.D0.addView(this.f8736p0);
        View e10 = d3.e(context, new LinearLayout.LayoutParams(-1, a0.i(1.0f)), true);
        t8(e10);
        this.D0.addView(e10);
        c cVar2 = new c(context, this.f24495b);
        this.f8737q0 = cVar2;
        cVar2.setId(R.id.btn_passcode_change);
        this.f8737q0.setType(2);
        this.f8737q0.setName(R.string.ChangePasscode);
        this.f8737q0.setOnClickListener(this);
        this.f8737q0.A1(this);
        this.D0.addView(this.f8737q0);
        f3 f3Var = new f3(context);
        t8(f3Var);
        f3Var.setSimpleBottomTransparentShadow(true);
        this.D0.addView(f3Var);
        TextView cf = cf(this);
        TdApi.Chat chat = this.A0;
        if (chat != null) {
            cf.setText(w.m1(R.string.SecretPasscodeInfo, this.f24495b.W3(chat)));
        } else {
            cf.setText(w.i1(R.string.ChangePasscodeInfo));
        }
        this.D0.addView(cf);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f8735o0 = linearLayout2;
        linearLayout2.setOrientation(1);
        f3 f3Var2 = new f3(context);
        t8(f3Var2);
        f3Var2.n(true, this);
        this.f8735o0.addView(f3Var2);
        if (this.A0 != null) {
            this.f8745y0 = f3Var2;
        }
        c cVar3 = new c(context, this.f24495b);
        this.f8743w0 = cVar3;
        cVar3.setId(R.id.btn_fingerprint);
        this.f8743w0.setType(3);
        this.f8743w0.setName(R.string.passcode_fingerprint);
        this.f8743w0.getToggler().r(bf(), false);
        this.f8743w0.setOnClickListener(this);
        this.f8743w0.A1(this);
        this.f8735o0.addView(this.f8743w0);
        d3 e11 = d3.e(context, new LinearLayout.LayoutParams(-1, a0.i(1.0f)), true);
        this.f8744x0 = e11;
        t8(e11);
        this.f8735o0.addView(this.f8744x0);
        c cVar4 = new c(context, this.f24495b);
        this.f8739s0 = cVar4;
        cVar4.setId(R.id.btn_pattern);
        this.f8739s0.setType(3);
        this.f8739s0.setName(R.string.passcode_passcodeInvisibility);
        this.f8739s0.getToggler().r(!z2(), false);
        this.f8739s0.setOnClickListener(this);
        this.f8739s0.A1(this);
        this.f8735o0.addView(this.f8739s0);
        if (this.A0 == null) {
            d3 e12 = d3.e(context, new LinearLayout.LayoutParams(-1, a0.i(1.0f)), true);
            this.f8740t0 = e12;
            t8(e12);
            this.f8735o0.addView(this.f8740t0);
            c cVar5 = new c(context, this.f24495b);
            this.f8738r0 = cVar5;
            cVar5.setId(R.id.btn_passcode_auto);
            this.f8738r0.setType(1);
            this.f8738r0.a2();
            this.f8738r0.setName(R.string.AutoLock);
            m9if();
            this.f8738r0.setOnClickListener(this);
            this.f8738r0.A1(this);
            this.f8735o0.addView(this.f8738r0);
            f3 f3Var3 = new f3(context);
            t8(f3Var3);
            f3Var3.setSimpleBottomTransparentShadow(true);
            this.f8735o0.addView(f3Var3);
            TextView cf2 = cf(this);
            cf2.setText(w.i1(R.string.passcode_auto_hint));
            this.f8735o0.addView(cf2);
            f3 f3Var4 = new f3(context);
            t8(f3Var4);
            f3Var4.n(true, this);
            this.f8735o0.addView(f3Var4);
            c cVar6 = new c(context, this.f24495b);
            this.f8742v0 = cVar6;
            cVar6.setId(R.id.btn_notificationContent);
            this.f8742v0.setType(3);
            this.f8742v0.setName(R.string.AllowNotifications);
            this.f8742v0.getToggler().r(d.w().l(), false);
            this.f8742v0.setOnClickListener(this);
            this.f8742v0.A1(this);
            this.f8735o0.addView(this.f8742v0);
            f3 f3Var5 = new f3(context);
            t8(f3Var5);
            f3Var5.setSimpleBottomTransparentShadow(true);
            this.f8735o0.addView(f3Var5);
            TextView cf3 = cf(this);
            cf3.setText(w.i1(R.string.AllowNotificationsInfo));
            this.f8735o0.addView(cf3);
            f3 f3Var6 = new f3(context);
            t8(f3Var6);
            f3Var6.n(true, this);
            this.f8735o0.addView(f3Var6);
            c cVar7 = new c(context, this.f24495b);
            this.f8741u0 = cVar7;
            cVar7.setId(R.id.btn_screenCapture);
            this.f8741u0.setType(3);
            this.f8741u0.setName(R.string.ScreenCapture);
            this.f8741u0.getToggler().r(d.w().b(), false);
            this.f8741u0.setOnClickListener(this);
            this.f8741u0.A1(this);
            this.f8735o0.addView(this.f8741u0);
            f3 f3Var7 = new f3(context);
            t8(f3Var7);
            f3Var7.setSimpleBottomTransparentShadow(true);
            this.f8735o0.addView(f3Var7);
            TextView cf4 = cf(this);
            cf4.setText(w.i1(R.string.ScreenCaptureInfo));
            this.f8735o0.addView(cf4);
        } else {
            f3 f3Var8 = new f3(context);
            t8(f3Var8);
            f3Var8.setSimpleBottomTransparentShadow(true);
            this.f8735o0.addView(f3Var8);
            this.f8746z0 = f3Var8;
        }
        Te();
        kf(false);
        this.D0.addView(this.f8735o0);
        this.f8734n0.addView(this.D0);
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        g.i(frameLayoutFix, R.id.theme_color_background, this);
        this.f8734n0.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        frameLayoutFix.addView(this.f8734n0);
        return frameLayoutFix;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_fingerprint:
                if (this.f8743w0.getToggler().isEnabled()) {
                    this.f8743w0.f2();
                    Ve();
                    return;
                } else if (!o.f() || !o.e()) {
                    j0.y0(R.string.fingerprint_hint3, 0);
                    return;
                } else {
                    ii iiVar = new ii(this.f24493a, this.f24495b);
                    TdApi.Chat chat = this.A0;
                    if (chat != null) {
                        iiVar.Ef(new ii.b(chat, this.B0, null));
                    }
                    iiVar.Kf(1);
                    iiVar.Hf();
                    ac(iiVar);
                    return;
                }
            case R.id.btn_notificationContent:
                if (this.f8742v0 != null) {
                    d.w().I(this.f8742v0.f2());
                    ya.o1().o2();
                    return;
                }
                return;
            case R.id.btn_passcode:
                if (!Xe()) {
                    gf();
                    return;
                }
                Ue();
                kf(true);
                return;
            case R.id.btn_passcode_auto:
                ff();
                return;
            case R.id.btn_passcode_change:
                if (Xe()) {
                    gf();
                    return;
                }
                return;
            case R.id.btn_pattern:
                ef(!this.f8739s0.f2());
                return;
            case R.id.btn_screenCapture:
                if (this.f8741u0 != null) {
                    d.w().G(this.f8741u0.f2());
                    j0.f();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void run() {
        kf(true);
    }

    @Override
    public void sc() {
        super.sc();
        TdApi.Chat chat = this.A0;
        if (chat != null) {
            this.B0 = this.f24495b.A3(chat);
        }
        this.f8743w0.getToggler().r(bf(), this.f8743w0.getVisibility() == 0 && Ta());
        if (!this.F0 && Ra()) {
            this.F0 = true;
            if (Xe()) {
                int te = te() - 2;
                if (se(te) instanceof ii) {
                    b9(te);
                }
            }
        }
        if (this.E0 != Xe()) {
            j0.e0(this, 150L);
        }
    }

    public final boolean z2() {
        if (this.A0 == null) {
            return d.w().D();
        }
        o6.j jVar = this.B0;
        return jVar == null || jVar.a();
    }
}
