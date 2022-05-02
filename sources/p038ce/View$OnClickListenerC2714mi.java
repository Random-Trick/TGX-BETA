package p038ce;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import be.C1357a0;
import be.C1379j0;
import be.C1389o;
import be.C1399s0;
import ge.C4862d;
import me.C6847b2;
import me.C6862d3;
import me.C6879f3;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p038ce.C2536ii;
import p082fd.C4391o;
import p082fd.C4403w;
import p108hb.C5070i;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p111he.C5146u0;
import p124ib.C5320c;
import p139jb.AbstractC5919k;
import p335xd.C10192g;
import p350yd.C10536ab;
import p350yd.C10930q6;
import p364zd.C11524j;
import tc.C9137c;
import td.AbstractC9323v4;
import td.C9289s;

public class View$OnClickListenerC2714mi extends AbstractC9323v4<C2716b> implements View.OnClickListener, Runnable {
    public TdApi.Chat f9179A0;
    public C10930q6.C10940j f9180B0;
    public C9289s f9181C0;
    public LinearLayout f9182D0;
    public boolean f9183E0;
    public boolean f9184F0;
    public String[] f9185G0;
    public ScrollView f9186n0;
    public LinearLayout f9187o0;
    public C9137c f9188p0;
    public C9137c f9189q0;
    public C9137c f9190r0;
    public C9137c f9191s0;
    public C6862d3 f9192t0;
    public C9137c f9193u0;
    public C9137c f9194v0;
    public C9137c f9195w0;
    public C6862d3 f9196x0;
    public C6879f3 f9197y0;
    public C6879f3 f9198z0;

    public class C2715a extends AnimatorListenerAdapter {
        public C2715a() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            View$OnClickListenerC2714mi.this.f9187o0.setVisibility(4);
        }
    }

    public static class C2716b {
        public final TdApi.Chat f9200a;
        public final C10930q6.C10940j f9201b;

        public C2716b(TdApi.Chat chat, C10930q6.C10940j jVar) {
            this.f9200a = chat;
            this.f9201b = jVar;
        }
    }

    public View$OnClickListenerC2714mi(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public boolean m33783Ye(View view, int i) {
        if (m9347Sa()) {
            return true;
        }
        C4862d.m24935w().m24974H(i);
        m33773if();
        return true;
    }

    public void m33782Ze(int i) {
        C2536ii iiVar = new C2536ii(this.f30168a, this.f30170b);
        TdApi.Chat chat = this.f9179A0;
        if (chat != null) {
            iiVar.m34316Ef(new C2536ii.C2538b(chat, this.f9180B0, null));
        }
        iiVar.m34310Kf(1);
        iiVar.m34279cf(i);
        m9291ac(iiVar);
    }

    public static boolean m33781af(AbstractC5919k kVar, View view, int i) {
        int i2;
        switch (i) {
            case R.id.btn_passcodeType_fingerprint:
                i2 = 5;
                break;
            case R.id.btn_passcodeType_gesture:
                i2 = 4;
                break;
            case R.id.btn_passcodeType_password:
                i2 = 2;
                break;
            case R.id.btn_passcodeType_pattern:
                i2 = 3;
                break;
            case R.id.btn_passcodeType_pin:
                i2 = 1;
                break;
            default:
                i2 = 0;
                break;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 != 5 || (C4391o.m28027f() && C4391o.m28028e())) {
            kVar.mo3250a(i2);
            return true;
        }
        C1379j0.m37295y0(R.string.fingerprint_hint3, 0);
        return true;
    }

    public static TextView m33779cf(AbstractC9323v4<?> v4Var) {
        C6847b2 b2Var = new C6847b2(v4Var.mo4347s());
        b2Var.setGravity(C4403w.m27991F1() | 16);
        b2Var.setPadding(C1357a0.m37544i(16.0f), C1357a0.m37544i(6.0f), C1357a0.m37544i(16.0f), C1357a0.m37544i(12.0f));
        b2Var.setTypeface(C1389o.m37261k());
        b2Var.setTextSize(1, 15.0f);
        b2Var.setTextColor(C11524j.m215T0());
        v4Var.m9119z8(b2Var, R.id.theme_color_background_textLight);
        return b2Var;
    }

    public static void m33774hf(AbstractC9323v4<?> v4Var, CharSequence charSequence, final AbstractC5919k kVar) {
        boolean f = C4391o.m28027f();
        int i = f ? 5 : 4;
        C5320c cVar = new C5320c(i);
        C5146u0 u0Var = new C5146u0(i);
        C5320c cVar2 = new C5320c(i);
        cVar.m23285a(R.id.btn_passcodeType_pin);
        u0Var.m23817a(R.string.PasscodePIN);
        cVar2.m23285a(R.drawable.vkryl_baseline_lock_pin_24);
        cVar.m23285a(R.id.btn_passcodeType_password);
        u0Var.m23817a(R.string.login_Password);
        cVar2.m23285a(R.drawable.mrgrigri_baseline_textbox_password_24);
        cVar.m23285a(R.id.btn_passcodeType_pattern);
        u0Var.m23817a(R.string.PasscodePattern);
        cVar2.m23285a(R.drawable.itsspelledhaley_baseline_lock_pattern_24);
        cVar.m23285a(R.id.btn_passcodeType_gesture);
        u0Var.m23817a(R.string.PasscodeGesture);
        cVar2.m23285a(R.drawable.baseline_gesture_24);
        if (f) {
            cVar.m23285a(R.id.btn_passcodeType_fingerprint);
            u0Var.m23817a(R.string.PasscodeFingerprint);
            cVar2.m23285a(R.drawable.baseline_fingerprint_24);
        }
        v4Var.m9261ee(charSequence, cVar.m23281e(), u0Var.m23814d(), null, cVar2.m23281e(), new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i2) {
                boolean af;
                af = View$OnClickListenerC2714mi.m33781af(AbstractC5919k.this, view, i2);
                return af;
            }

            @Override
            public boolean mo492Q() {
                return C5115g0.m23936a(this);
            }

            @Override
            public Object mo491b2(int i2) {
                return C5115g0.m23935b(this, i2);
            }
        });
    }

    public static void m33770lf(ViewGroup viewGroup) {
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof TextView) {
                    ((TextView) childAt).setGravity(C4403w.m27991F1() | 16);
                } else if (childAt instanceof C9137c) {
                    ((C9137c) childAt).m10219J1(true);
                    childAt.invalidate();
                }
            }
        }
    }

    @Override
    public int mo408A9() {
        return 3;
    }

    @Override
    public void mo9477Ac() {
        super.mo9477Ac();
        m33788Te();
    }

    @Override
    public View mo8869G9() {
        return this.f9181C0;
    }

    @Override
    public View mo8868Ga() {
        return this.f9186n0;
    }

    public final boolean m33793H2() {
        if (this.f9179A0 == null) {
            return C4862d.m24935w().m24978D();
        }
        C10930q6.C10940j jVar = this.f9180B0;
        return jVar == null || jVar.m2126a();
    }

    @Override
    public void mo8867Ia() {
        super.mo8867Ia();
        m33770lf(this.f9182D0);
        m33770lf(this.f9187o0);
    }

    @Override
    public int mo407R9() {
        return R.id.controller_passcodeSetup;
    }

    public final void m33788Te() {
        boolean z = true;
        int i = 0;
        boolean z2 = m33785We() != 5 && C4391o.m28027f();
        this.f9196x0.setVisibility(z2 ? 0 : 8);
        this.f9195w0.setVisibility(z2 ? 0 : 8);
        if (m33785We() == 5) {
            z = false;
        }
        this.f9191s0.setVisibility(z ? 0 : 8);
        C6862d3 d3Var = this.f9192t0;
        if (d3Var != null) {
            d3Var.setVisibility(z ? 0 : 8);
        }
        if (this.f9179A0 != null) {
            if (!z2 && !z) {
                i = 8;
            }
            C6879f3 f3Var = this.f9197y0;
            if (f3Var != null) {
                f3Var.setVisibility(i);
            }
            C6879f3 f3Var2 = this.f9198z0;
            if (f3Var2 != null) {
                f3Var2.setVisibility(i);
            }
        }
    }

    public final void m33787Ue() {
        TdApi.Chat chat = this.f9179A0;
        if (chat != null) {
            this.f9180B0 = null;
            this.f30170b.m2406ic(chat, null);
            return;
        }
        C4862d.m24935w().m24948j();
    }

    public final void m33786Ve() {
        TdApi.Chat chat = this.f9179A0;
        if (chat != null) {
            C10930q6.C10940j jVar = this.f9180B0;
            if (jVar != null) {
                jVar.f35147d = null;
                this.f30170b.m2406ic(chat, jVar);
                return;
            }
            return;
        }
        C4862d.m24935w().m24947k();
    }

    public final int m33785We() {
        if (this.f9179A0 == null) {
            return C4862d.m24935w().m24940r();
        }
        C10930q6.C10940j jVar = this.f9180B0;
        if (jVar != null) {
            return jVar.f35144a;
        }
        return 0;
    }

    @Override
    public CharSequence mo9313X9() {
        return C4403w.m27871i1(R.string.PasscodeTitle);
    }

    public final boolean m33784Xe() {
        if (this.f9179A0 == null) {
            return C4862d.m24935w().m24934x();
        }
        C10930q6.C10940j jVar = this.f9180B0;
        return (jVar == null || jVar.f35144a == 0) ? false : true;
    }

    public final boolean m33780bf() {
        if (this.f9179A0 == null) {
            return C4862d.m24935w().m24977E();
        }
        C10930q6.C10940j jVar = this.f9180B0;
        return jVar != null && !C5070i.m24062i(jVar.f35147d);
    }

    public void m33778df(C2716b bVar) {
        super.m9476Ad(bVar);
        this.f9179A0 = bVar.f9200a;
        this.f9180B0 = bVar.f9201b;
    }

    public final void m33777ef(boolean z) {
        if (this.f9179A0 != null) {
            C10930q6.C10940j jVar = this.f9180B0;
            if (jVar != null) {
                jVar.m2125b(z);
                this.f30170b.m2406ic(this.f9179A0, this.f9180B0);
                return;
            }
            return;
        }
        C4862d.m24935w().m24965Q(z);
    }

    public final void m33776ff() {
        if (this.f9185G0 == null) {
            this.f9185G0 = C4862d.m24935w().m24942p();
        }
        C5320c cVar = new C5320c(this.f9185G0.length);
        for (int i = 0; i < this.f9185G0.length; i++) {
            cVar.m23285a(i);
        }
        m9227je(cVar.m23281e(), this.f9185G0, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i2) {
                boolean Ye;
                Ye = View$OnClickListenerC2714mi.this.m33783Ye(view, i2);
                return Ye;
            }

            @Override
            public boolean mo492Q() {
                return C5115g0.m23936a(this);
            }

            @Override
            public Object mo491b2(int i2) {
                return C5115g0.m23935b(this, i2);
            }
        });
    }

    public final void m33775gf() {
        m33774hf(this, null, new AbstractC5919k() {
            @Override
            public final void mo3250a(int i) {
                View$OnClickListenerC2714mi.this.m33782Ze(i);
            }
        });
    }

    public final void m33773if() {
        if (this.f9190r0 != null) {
            if (this.f9185G0 == null) {
                this.f9185G0 = C4862d.m24935w().m24942p();
            }
            this.f9190r0.setData(this.f9185G0[C4862d.m24935w().m24943o()]);
        }
    }

    public final void m33772jf(boolean z) {
        boolean Xe = m33784Xe();
        int i = 0;
        if (!z) {
            this.f9187o0.setAlpha(1.0f);
            LinearLayout linearLayout = this.f9187o0;
            if (!Xe) {
                i = 8;
            }
            linearLayout.setVisibility(i);
            return;
        }
        if (Xe) {
            this.f9187o0.setAlpha(0.0f);
            this.f9187o0.setVisibility(0);
        }
        C1399s0.m37177k(this.f9187o0, Xe ? 1.0f : 0.0f, 150L, C2057b.f7280b, Xe ? null : new C2715a());
    }

    public void m33771kf(boolean z) {
        this.f9183E0 = m33784Xe();
        this.f9188p0.getToggler().m10185r(this.f9183E0, z);
        if (z) {
            this.f9189q0.setEnabledAnimated(this.f9183E0);
        } else {
            this.f9189q0.setEnabled(this.f9183E0);
        }
        m33772jf(z);
    }

    @Override
    public View mo403oc(Context context) {
        if (this.f9179A0 != null) {
            C9289s sVar = new C9289s(context);
            this.f9181C0 = sVar;
            sVar.setThemedTextColor(this);
            this.f9181C0.m9631D1(C1357a0.m37544i(49.0f), true);
            this.f9181C0.setTitle(mo9313X9());
            this.f9181C0.setSubtitle(C4403w.m27855m1(R.string.SecretChatWithUser, this.f30170b.m2661S3(this.f9179A0)));
        }
        this.f9186n0 = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f9182D0 = linearLayout;
        linearLayout.setOrientation(1);
        C9137c cVar = new C9137c(context, this.f30170b);
        this.f9188p0 = cVar;
        cVar.setId(R.id.btn_passcode);
        this.f9188p0.setType(3);
        this.f9188p0.getToggler().m10185r(m33784Xe(), false);
        this.f9188p0.setName(R.string.PasscodeItem);
        this.f9188p0.setOnClickListener(this);
        this.f9188p0.m10224D1(this);
        this.f9182D0.addView(this.f9188p0);
        View e = C6862d3.m18734e(context, new LinearLayout.LayoutParams(-1, C1357a0.m37544i(1.0f)), true);
        m9163t8(e);
        this.f9182D0.addView(e);
        C9137c cVar2 = new C9137c(context, this.f30170b);
        this.f9189q0 = cVar2;
        cVar2.setId(R.id.btn_passcode_change);
        this.f9189q0.setType(2);
        this.f9189q0.setName(R.string.ChangePasscode);
        this.f9189q0.setOnClickListener(this);
        this.f9189q0.m10224D1(this);
        this.f9182D0.addView(this.f9189q0);
        C6879f3 f3Var = new C6879f3(context);
        m9163t8(f3Var);
        f3Var.setSimpleBottomTransparentShadow(true);
        this.f9182D0.addView(f3Var);
        TextView cf = m33779cf(this);
        TdApi.Chat chat = this.f9179A0;
        if (chat != null) {
            cf.setText(C4403w.m27855m1(R.string.SecretPasscodeInfo, this.f30170b.m2661S3(chat)));
        } else {
            cf.setText(C4403w.m27871i1(R.string.ChangePasscodeInfo));
        }
        this.f9182D0.addView(cf);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f9187o0 = linearLayout2;
        linearLayout2.setOrientation(1);
        C6879f3 f3Var2 = new C6879f3(context);
        m9163t8(f3Var2);
        f3Var2.m18695n(true, this);
        this.f9187o0.addView(f3Var2);
        if (this.f9179A0 != null) {
            this.f9197y0 = f3Var2;
        }
        C9137c cVar3 = new C9137c(context, this.f30170b);
        this.f9195w0 = cVar3;
        cVar3.setId(R.id.btn_fingerprint);
        this.f9195w0.setType(3);
        this.f9195w0.setName(R.string.passcode_fingerprint);
        this.f9195w0.getToggler().m10185r(m33780bf(), false);
        this.f9195w0.setOnClickListener(this);
        this.f9195w0.m10224D1(this);
        this.f9187o0.addView(this.f9195w0);
        C6862d3 e2 = C6862d3.m18734e(context, new LinearLayout.LayoutParams(-1, C1357a0.m37544i(1.0f)), true);
        this.f9196x0 = e2;
        m9163t8(e2);
        this.f9187o0.addView(this.f9196x0);
        C9137c cVar4 = new C9137c(context, this.f30170b);
        this.f9191s0 = cVar4;
        cVar4.setId(R.id.btn_pattern);
        this.f9191s0.setType(3);
        this.f9191s0.setName(R.string.passcode_passcodeInvisibility);
        this.f9191s0.getToggler().m10185r(!m33793H2(), false);
        this.f9191s0.setOnClickListener(this);
        this.f9191s0.m10224D1(this);
        this.f9187o0.addView(this.f9191s0);
        if (this.f9179A0 == null) {
            C6862d3 e3 = C6862d3.m18734e(context, new LinearLayout.LayoutParams(-1, C1357a0.m37544i(1.0f)), true);
            this.f9192t0 = e3;
            m9163t8(e3);
            this.f9187o0.addView(this.f9192t0);
            C9137c cVar5 = new C9137c(context, this.f30170b);
            this.f9190r0 = cVar5;
            cVar5.setId(R.id.btn_passcode_auto);
            this.f9190r0.setType(1);
            this.f9190r0.m10204b2();
            this.f9190r0.setName(R.string.AutoLock);
            m33773if();
            this.f9190r0.setOnClickListener(this);
            this.f9190r0.m10224D1(this);
            this.f9187o0.addView(this.f9190r0);
            C6879f3 f3Var3 = new C6879f3(context);
            m9163t8(f3Var3);
            f3Var3.setSimpleBottomTransparentShadow(true);
            this.f9187o0.addView(f3Var3);
            TextView cf2 = m33779cf(this);
            cf2.setText(C4403w.m27871i1(R.string.passcode_auto_hint));
            this.f9187o0.addView(cf2);
            C6879f3 f3Var4 = new C6879f3(context);
            m9163t8(f3Var4);
            f3Var4.m18695n(true, this);
            this.f9187o0.addView(f3Var4);
            C9137c cVar6 = new C9137c(context, this.f30170b);
            this.f9194v0 = cVar6;
            cVar6.setId(R.id.btn_notificationContent);
            this.f9194v0.setType(3);
            this.f9194v0.setName(R.string.AllowNotifications);
            this.f9194v0.getToggler().m10185r(C4862d.m24935w().m24946l(), false);
            this.f9194v0.setOnClickListener(this);
            this.f9194v0.m10224D1(this);
            this.f9187o0.addView(this.f9194v0);
            C6879f3 f3Var5 = new C6879f3(context);
            m9163t8(f3Var5);
            f3Var5.setSimpleBottomTransparentShadow(true);
            this.f9187o0.addView(f3Var5);
            TextView cf3 = m33779cf(this);
            cf3.setText(C4403w.m27871i1(R.string.AllowNotificationsInfo));
            this.f9187o0.addView(cf3);
            C6879f3 f3Var6 = new C6879f3(context);
            m9163t8(f3Var6);
            f3Var6.m18695n(true, this);
            this.f9187o0.addView(f3Var6);
            C9137c cVar7 = new C9137c(context, this.f30170b);
            this.f9193u0 = cVar7;
            cVar7.setId(R.id.btn_screenCapture);
            this.f9193u0.setType(3);
            this.f9193u0.setName(R.string.ScreenCapture);
            this.f9193u0.getToggler().m10185r(C4862d.m24935w().m24955b(), false);
            this.f9193u0.setOnClickListener(this);
            this.f9193u0.m10224D1(this);
            this.f9187o0.addView(this.f9193u0);
            C6879f3 f3Var7 = new C6879f3(context);
            m9163t8(f3Var7);
            f3Var7.setSimpleBottomTransparentShadow(true);
            this.f9187o0.addView(f3Var7);
            TextView cf4 = m33779cf(this);
            cf4.setText(C4403w.m27871i1(R.string.ScreenCaptureInfo));
            this.f9187o0.addView(cf4);
        } else {
            C6879f3 f3Var8 = new C6879f3(context);
            m9163t8(f3Var8);
            f3Var8.setSimpleBottomTransparentShadow(true);
            this.f9187o0.addView(f3Var8);
            this.f9198z0 = f3Var8;
        }
        m33788Te();
        m33771kf(false);
        this.f9182D0.addView(this.f9187o0);
        this.f9186n0.addView(this.f9182D0);
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        C10192g.m5782i(frameLayoutFix, R.id.theme_color_background, this);
        this.f9186n0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        frameLayoutFix.addView(this.f9186n0);
        return frameLayoutFix;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_fingerprint:
                if (this.f9195w0.getToggler().isEnabled()) {
                    this.f9195w0.m10201h2();
                    m33786Ve();
                    return;
                } else if (!C4391o.m28027f() || !C4391o.m28028e()) {
                    C1379j0.m37295y0(R.string.fingerprint_hint3, 0);
                    return;
                } else {
                    C2536ii iiVar = new C2536ii(this.f30168a, this.f30170b);
                    TdApi.Chat chat = this.f9179A0;
                    if (chat != null) {
                        iiVar.m34316Ef(new C2536ii.C2538b(chat, this.f9180B0, null));
                    }
                    iiVar.m34310Kf(1);
                    iiVar.m34313Hf();
                    m9291ac(iiVar);
                    return;
                }
            case R.id.btn_notificationContent:
                if (this.f9194v0 != null) {
                    C4862d.m24935w().m24973I(this.f9194v0.m10201h2());
                    C10536ab.m4667o1().m4666o2();
                    return;
                }
                return;
            case R.id.btn_passcode:
                if (!m33784Xe()) {
                    m33775gf();
                    return;
                }
                m33787Ue();
                m33771kf(true);
                return;
            case R.id.btn_passcode_auto:
                m33776ff();
                return;
            case R.id.btn_passcode_change:
                if (m33784Xe()) {
                    m33775gf();
                    return;
                }
                return;
            case R.id.btn_pattern:
                m33777ef(!this.f9191s0.m10201h2());
                return;
            case R.id.btn_screenCapture:
                if (this.f9193u0 != null) {
                    C4862d.m24935w().m24975G(this.f9193u0.m10201h2());
                    C1379j0.m37334f();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void run() {
        m33771kf(true);
    }

    @Override
    public void mo9166sc() {
        super.mo9166sc();
        TdApi.Chat chat = this.f9179A0;
        if (chat != null) {
            this.f9180B0 = this.f30170b.m2175x3(chat);
        }
        this.f9195w0.getToggler().m10185r(m33780bf(), this.f9195w0.getVisibility() == 0 && m9339Ta());
        if (!this.f9184F0 && m9353Ra()) {
            this.f9184F0 = true;
            if (m33784Xe()) {
                int te = m9157te() - 2;
                if (m9164se(te) instanceof C2536ii) {
                    m9287b9(te);
                }
            }
        }
        if (this.f9183E0 != m33784Xe()) {
            C1379j0.m37335e0(this, 150L);
        }
    }
}
