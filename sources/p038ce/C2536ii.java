package p038ce;

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
import be.C1357a0;
import be.C1379j0;
import be.C1389o;
import be.C1399s0;
import be.C1408x;
import ge.C4862d;
import ge.C4868i;
import me.C7015r3;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.EditTextBase;
import p037cb.C2065g;
import p082fd.C4383l;
import p082fd.C4391o;
import p082fd.C4395p;
import p082fd.C4403w;
import p108hb.C5064d;
import p108hb.C5070i;
import p111he.AbstractC5153x0;
import p111he.AbstractC5155y0;
import p111he.C5119i0;
import p111he.C5146u0;
import p335xd.C10192g;
import p349yc.C10500a;
import p349yc.C10503c;
import p349yc.View$OnClickListenerC10512i;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;
import p364zd.C11524j;
import td.AbstractC9201h1;
import td.AbstractC9323v4;
import td.C9289s;
import td.C9351w2;
import td.View$OnClickListenerC9170d1;

public class C2536ii extends AbstractC9323v4<C2538b> implements AbstractC9201h1, TextView.OnEditorActionListener, C10503c.AbstractC10505b, View$OnClickListenerC10512i.AbstractC10513a, AbstractC5153x0, AbstractC5155y0, GestureOverlayView.OnGesturePerformedListener, C4395p.AbstractC4396a, C4391o.AbstractC4394b, AbstractView$OnTouchListenerC7889a.AbstractC7902m, C4868i.AbstractC4879k {
    public C5119i0 f8646A0;
    public GestureOverlayView f8647B0;
    public boolean f8648C0;
    public C7015r3 f8649D0;
    public int f8650E0;
    public C5119i0 f8651F0;
    public View f8652G0;
    public boolean f8653H0;
    public boolean f8654I0;
    public String[] f8655J0;
    public C4395p f8656K0;
    public String f8657L0;
    public int f8658n0 = 0;
    public int f8659o0;
    public FrameLayoutFix f8660p0;
    public C10503c f8661q0;
    public TdApi.Chat f8662r0;
    public C10930q6.C10940j f8663s0;
    public HandlerC10770jj.C10780j f8664t0;
    public boolean f8665u0;
    public int f8666v0;
    public C7015r3 f8667w0;
    public String f8668x0;
    public EditTextBase f8669y0;
    public View$OnClickListenerC10512i f8670z0;

    public class C2537a extends FrameLayoutFix {
        public C2537a(Context context) {
            super(context);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return (motionEvent.getAction() == 0 && !C2536ii.this.m34268nf() && C4868i.m24727c2().m24687h2(C2536ii.this.f8659o0, C2536ii.this.mo4900X2())) || super.onInterceptTouchEvent(motionEvent);
        }
    }

    public static class C2538b {
        public final TdApi.Chat f8672a;
        public final C10930q6.C10940j f8673b;
        public final HandlerC10770jj.C10780j f8674c;

        public C2538b(TdApi.Chat chat, C10930q6.C10940j jVar, HandlerC10770jj.C10780j jVar2) {
            this.f8672a = chat;
            this.f8673b = jVar == null ? new C10930q6.C10940j(0, 0, "", null) : jVar;
            this.f8674c = jVar2;
        }
    }

    public C2536ii(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public static int m34277ef(int i) {
        if (i == 1) {
            return R.string.PasscodeInvalidPin;
        }
        if (i == 2) {
            return R.string.PasscodeInvalidPassword;
        }
        if (i == 3) {
            return R.string.PasscodeInvalidPattern;
        }
        if (i == 4) {
            return R.string.PasscodeInvalidGesture;
        }
        throw new IllegalArgumentException("mode == " + i);
    }

    public static int m34276ff(int i) {
        if (i == 1) {
            return R.string.PasscodeMismatchPin;
        }
        if (i == 2) {
            return R.string.PasscodeMismatchPassword;
        }
        if (i == 3) {
            return R.string.PasscodeMismatchPattern;
        }
        if (i == 4) {
            return R.string.PasscodeMismatchGesture;
        }
        if (i == 5) {
            return R.string.PasscodeMismatchFingerprint;
        }
        throw new IllegalArgumentException("mode == " + i);
    }

    public void m34266pf(C5119i0 i0Var) {
        String i0Var2 = i0Var.toString();
        if (this.f8658n0 == 2 && C4862d.m24935w().m24950g(i0Var2)) {
            C4868i.m24727c2().m24705f0(3, mo4900X2());
            m9291ac(new View$OnClickListenerC2714mi(this.f30168a, this.f30170b));
        } else if (this.f8658n0 != 0 || !m34292Vf(i0Var2)) {
            C4868i.m24727c2().m24675i6(3, i0Var2, mo4900X2());
            C1379j0.m37295y0(m34277ef(3), 0);
        } else {
            C4868i.m24727c2().m24705f0(3, mo4900X2());
            C1379j0.m37368E0(this);
        }
    }

    public void m34265qf(C5119i0 i0Var) {
        String i0Var2 = i0Var.toString();
        if (C4862d.m24980B(i0Var2)) {
            m34308Mf(i0Var2);
            m9262ed();
            return;
        }
        C1379j0.m37293z0("Error setting up pattern", 0);
    }

    public void m34264rf() {
        this.f8661q0.getPincodeOutput().m4843t();
    }

    public void m34263sf(C5119i0 i0Var) {
        String i0Var2 = i0Var.toString();
        if (this.f8658n0 == 2 && C4862d.m24935w().m24949i(i0Var2)) {
            C4868i.m24727c2().m24705f0(1, mo4900X2());
            m9291ac(new View$OnClickListenerC2714mi(this.f30168a, this.f30170b));
        } else if (this.f8658n0 != 0 || !m34290Wf(i0Var2)) {
            C4868i.m24727c2().m24675i6(1, i0Var2, mo4900X2());
            C1379j0.m37295y0(m34277ef(1), 0);
            C1379j0.m37337d0(new Runnable() {
                @Override
                public final void run() {
                    C2536ii.this.m34264rf();
                }
            });
        } else {
            C4868i.m24727c2().m24705f0(1, mo4900X2());
            C1379j0.m37368E0(this);
        }
    }

    public void m34262tf(C5119i0 i0Var) {
        String i0Var2 = i0Var.toString();
        if (C4862d.m24979C(i0Var2)) {
            m34307Nf(i0Var2);
            m9262ed();
            return;
        }
        C1379j0.m37293z0("Error setting up pincode", 0);
    }

    public void m34261uf(int i) {
        if (this.f8665u0) {
            m34281bf(i);
        } else {
            m34315Ff(i);
        }
        m9262ed();
    }

    public void m34260vf(Gesture gesture) {
        if (this.f8658n0 == 2 && m34278df().m28020a(gesture, false, this)) {
            C4868i.m24727c2().m24705f0(4, mo4900X2());
            m9291ac(new View$OnClickListenerC2714mi(this.f30168a, this.f30170b));
        } else if (this.f8658n0 != 0 || !m34278df().m28020a(gesture, false, this)) {
            C4868i.m24727c2().m24675i6(4, null, mo4900X2());
            C1379j0.m37295y0(m34277ef(4), 0);
        } else {
            m34296Tf();
            C4868i.m24727c2().m24705f0(4, mo4900X2());
            C1379j0.m37368E0(this);
        }
    }

    public void m34259wf(Gesture gesture) {
        if (!m34278df().m28020a(gesture, true, null)) {
            C1379j0.m37295y0(m34276ff(4), 0);
        } else if (m34278df().m28016e(gesture)) {
            m34314Gf();
            m9262ed();
        } else {
            C1379j0.m37293z0("Error saving gesture file", 0);
        }
    }

    public void m34258xf(Gesture gesture) {
        m34278df().m28015f(gesture);
        this.f8648C0 = false;
    }

    public void m34257yf(String str) {
        if (this.f8658n0 == 2 && C4862d.m24935w().m24951f(str)) {
            C4868i.m24727c2().m24705f0(2, mo4900X2());
            m9291ac(new View$OnClickListenerC2714mi(this.f30168a, this.f30170b));
        } else if (this.f8658n0 != 0 || !m34294Uf(str)) {
            C4868i.m24727c2().m24675i6(2, str, mo4900X2());
            C1379j0.m37295y0(m34277ef(2), 0);
        } else {
            C4868i.m24727c2().m24705f0(2, mo4900X2());
            C1379j0.m37368E0(this);
        }
    }

    @Override
    public void mo28014A5() {
        C1379j0.m37293z0("Error loading an existing gesture", 0);
        this.f8648C0 = false;
    }

    @Override
    public int mo408A9() {
        return 3;
    }

    public final void m34320Af(final Gesture gesture) {
        if (this.f8659o0 != 4) {
            return;
        }
        if (m34268nf()) {
            m34319Bf(gesture);
        } else if (!C4868i.m24727c2().m24687h2(4, mo4900X2())) {
            C4383l.m28061a().m28060b(new Runnable() {
                @Override
                public final void run() {
                    C2536ii.this.m34260vf(gesture);
                }
            });
        }
    }

    @Override
    public void mo9469Bc(int i, boolean z) {
        if (i == 1 && this.f8658n0 == 1 && z && C4391o.m28027f()) {
            m34312If(5);
        }
    }

    public final void m34319Bf(final Gesture gesture) {
        if (this.f8661q0.getState() == 3) {
            C4383l.m28061a().m28060b(new Runnable() {
                @Override
                public final void run() {
                    C2536ii.this.m34259wf(gesture);
                }
            });
            return;
        }
        this.f8661q0.setState(3);
        this.f8648C0 = true;
        C4383l.m28061a().m28060b(new Runnable() {
            @Override
            public final void run() {
                C2536ii.this.m34258xf(gesture);
            }
        });
    }

    @Override
    public long mo9464C9() {
        TdApi.Chat chat = this.f8662r0;
        if (chat != null) {
            return chat.f25370id;
        }
        return 0L;
    }

    public final boolean m34318Cf() {
        throw new UnsupportedOperationException("Method not decompiled: p038ce.C2536ii.m34318Cf():boolean");
    }

    public final boolean m34317Df(String str) {
        if (this.f8661q0.getState() == 3) {
            if (!C4862d.m24981A(str) || !str.equals(this.f8668x0)) {
                C1379j0.m37295y0(m34276ff(2), 0);
                return false;
            }
            m34309Lf(str);
            C1408x.m37091c(this.f8669y0);
            m9298Zb();
            return true;
        } else if (str.length() < 1) {
            C1379j0.m37295y0(R.string.passcode_password_tooshort, 0);
            return false;
        } else {
            this.f8668x0 = str;
            this.f8661q0.setState(3);
            this.f8669y0.setText("");
            return false;
        }
    }

    public void m34316Ef(C2538b bVar) {
        super.m9476Ad(bVar);
        this.f8662r0 = bVar.f8672a;
        this.f8663s0 = bVar.f8673b;
        this.f8664t0 = bVar.f8674c;
    }

    @Override
    public void mo4865F6() {
        if (!this.f8661q0.getPincodeOutput().m4848o()) {
            C5119i0 i0Var = this.f8646A0;
            if (i0Var != null) {
                i0Var.m23928f();
            }
            this.f8661q0.getPincodeOutput().m4844s();
        }
    }

    public final void m34315Ff(int i) {
        if (this.f8662r0 != null) {
            this.f8663s0.f35146c = C4862d.m24937u(String.valueOf(i));
            C10930q6.C10940j jVar = this.f8663s0;
            jVar.f35144a = 5;
            this.f30170b.m2406ic(this.f8662r0, jVar);
            return;
        }
        C4862d.m24935w().m24972J(i);
    }

    @Override
    public View mo8869G9() {
        int i = this.f8658n0;
        if (i != 0 || this.f8662r0 == null) {
            if (i != 1 || this.f8665u0) {
                return null;
            }
            if (this.f8652G0 == null) {
                this.f8652G0 = this.f30168a.m14551P1().m9756I().m10102N2(mo4347s(), this);
            }
        } else if (this.f8652G0 == null) {
            C9289s sVar = new C9289s(this.f30168a);
            sVar.setThemedTextColor(this);
            sVar.m9631D1(C1357a0.m37544i(49.0f), true);
            sVar.setSubtitle(C4403w.m27855m1(R.string.SecretChatWithUser, this.f30170b.m2661S3(this.f8662r0)));
            this.f8652G0 = sVar;
        }
        m34282ag();
        return this.f8652G0;
    }

    public final void m34314Gf() {
        TdApi.Chat chat = this.f8662r0;
        if (chat != null) {
            C10930q6.C10940j jVar = this.f8663s0;
            jVar.f35144a = 4;
            jVar.f35146c = "";
            this.f30170b.m2406ic(chat, jVar);
            return;
        }
        C4862d.m24935w().m24971K();
    }

    @Override
    public boolean mo4902H2() {
        boolean z;
        if (this.f8659o0 == 2) {
            return true;
        }
        if (this.f8662r0 != null) {
            C10930q6.C10940j jVar = this.f8663s0;
            z = jVar == null || jVar.m2126a();
        } else {
            z = C4862d.m24935w().m24978D();
        }
        if (!z) {
            return m34268nf() && this.f8661q0.getState() != 3;
        }
        return true;
    }

    public void m34313Hf() {
        this.f8665u0 = true;
        this.f8666v0 = 5;
    }

    @Override
    public boolean mo9416Ie() {
        return false;
    }

    public final void m34312If(int i) {
        if (this.f8659o0 != i) {
            if (Build.VERSION.SDK_INT >= 23 && i == 5 && !C4391o.m28028e()) {
                C1379j0.m37295y0(R.string.fingerprint_hint3, 0);
                if (this.f8658n0 == 1) {
                    return;
                }
            }
            m9424Hd(C4862d.m24938t(i));
            m34282ag();
            int i2 = this.f8659o0;
            if (i2 != 0) {
                if (i2 == 1) {
                    m34270lf();
                } else if (i2 == 2) {
                    m34271kf();
                } else if (i2 == 4) {
                    m34272jf();
                } else if (i2 == 5) {
                    m34273if();
                }
            }
            this.f8659o0 = i;
            this.f8661q0.m4905r(i, this.f8658n0 == 1 ? 2 : 1);
            if (i == 1) {
                m34300Rf();
            } else if (i == 2) {
                m34302Qf();
            } else if (i == 4) {
                m34304Pf();
            } else if (i == 5) {
                m34306Of();
            }
            if (this.f8658n0 == 1) {
                mo4901R();
            }
        }
    }

    @Override
    public void mo419J(int i, View view) {
        if (i == R.id.menu_btn_done) {
            m34318Cf();
        }
    }

    public final void m34311Jf(boolean z) {
        if (this.f8653H0 != z) {
            this.f8653H0 = z;
            m34283af();
        }
    }

    public void m34310Kf(int i) {
        this.f8658n0 = i;
    }

    @Override
    public int mo9398L9() {
        return R.id.theme_color_passcode;
    }

    public final void m34309Lf(String str) {
        if (this.f8662r0 != null) {
            this.f8663s0.f35146c = C4862d.m24937u(str);
            C10930q6.C10940j jVar = this.f8663s0;
            jVar.f35144a = 2;
            this.f30170b.m2406ic(this.f8662r0, jVar);
            return;
        }
        C4862d.m24935w().m24968N(str);
    }

    public final void m34308Mf(String str) {
        if (this.f8662r0 != null) {
            this.f8663s0.f35146c = C4862d.m24937u(str);
            C10930q6.C10940j jVar = this.f8663s0;
            jVar.f35144a = 3;
            this.f30170b.m2406ic(this.f8662r0, jVar);
            return;
        }
        C4862d.m24935w().m24967O(str);
    }

    @Override
    public boolean mo4864N1() {
        if (this.f8661q0.getPincodeOutput().m4848o() || !this.f8661q0.getPincodeOutput().m4843t()) {
            return false;
        }
        C5119i0 i0Var = this.f8646A0;
        if (i0Var == null) {
            return true;
        }
        i0Var.m23932b();
        return true;
    }

    @Override
    public String[] mo23798N4() {
        if (this.f8655J0 == null) {
            boolean f = C4391o.m28027f();
            C5146u0 u0Var = new C5146u0(f ? 5 : 4);
            u0Var.m23817a(R.string.PasscodePIN);
            u0Var.m23817a(R.string.login_Password);
            u0Var.m23817a(R.string.PasscodePattern);
            u0Var.m23817a(R.string.PasscodeGesture);
            if (f) {
                u0Var.m23817a(R.string.PasscodeFingerprint);
            }
            this.f8655J0 = u0Var.m23814d();
        }
        return this.f8655J0;
    }

    public final void m34307Nf(String str) {
        if (this.f8662r0 != null) {
            this.f8663s0.f35146c = C4862d.m24937u(str);
            C10930q6.C10940j jVar = this.f8663s0;
            jVar.f35144a = 1;
            this.f30170b.m2406ic(this.f8662r0, jVar);
            return;
        }
        C4862d.m24935w().m24966P(str);
    }

    @Override
    public void mo23796O4() {
        m34288Xf();
    }

    @Override
    public int mo9375O9() {
        return R.id.theme_color_passcodeIcon;
    }

    public final void m34306Of() {
        if (this.f8649D0 == null) {
            C7015r3 r3Var = new C7015r3(this.f30168a);
            this.f8649D0 = r3Var;
            r3Var.setColorFilter(C5064d.m24132a(C11524j.m180h0(), C11524j.m228N(R.id.theme_color_passcodeIcon)));
            m9184q8(this.f8649D0, R.id.theme_color_passcodeIcon).m83g(true);
            int z = C1379j0.m37294z();
            FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(C1357a0.m37544i(82.0f), C1357a0.m37544i(82.0f));
            m34284Zf(s1, z);
            this.f8649D0.setLayoutParams(s1);
        } else if (m34268nf()) {
            this.f8649D0.m18093e(C7015r3.EnumC7018c.OFF, false);
        }
        this.f8660p0.addView(this.f8649D0);
        m34311Jf(true);
    }

    public final void m34304Pf() {
        if (this.f8647B0 == null) {
            GestureOverlayView gestureOverlayView = new GestureOverlayView(mo4347s());
            this.f8647B0 = gestureOverlayView;
            gestureOverlayView.setGestureStrokeWidth(C1357a0.m37544i(3.0f));
            this.f8647B0.setOrientation(1);
            this.f8647B0.setGestureColor(C11524j.m228N(R.id.theme_color_passcodeIcon));
            this.f8647B0.setUncertainGestureColor(C11524j.m228N(R.id.theme_color_passcodeIcon));
            this.f8647B0.setGestureVisible(mo4902H2());
            this.f8647B0.setFadeEnabled(true);
            this.f8647B0.addOnGesturePerformedListener(this);
            this.f8647B0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        }
        this.f8660p0.addView(this.f8647B0);
    }

    @Override
    public int mo9360Q9() {
        return R.id.theme_color_passcodeText;
    }

    public final void m34302Qf() {
        if (this.f8669y0 == null) {
            EditTextBase editTextBase = (EditTextBase) C1399s0.m37149y(mo4347s(), R.layout.input_password, this.f8660p0);
            this.f8669y0 = editTextBase;
            editTextBase.setTypeface(C1389o.m37261k());
            this.f8669y0.setTextSize(1, 16.0f);
            this.f8669y0.setUseIncognitoKeyboard(268435456);
            this.f8669y0.setInputType(129);
            this.f8669y0.setTransformationMethod(mo4902H2() ? PasswordTransformationMethod.getInstance() : C10500a.m4923a());
            this.f8669y0.setGravity(17);
            this.f8669y0.setTextColor(C11524j.m228N(R.id.theme_color_passcodeText));
            this.f8669y0.setOnEditorActionListener(this);
            this.f8669y0.setImeOptions(6);
            m9119z8(this.f8669y0, R.id.theme_color_passcodeText);
            C2065g.m35721d(this.f8669y0, null);
            FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(-1, C1357a0.m37544i(43.0f));
            s1.setMargins(C1357a0.m37544i(44.0f), C1357a0.m37544i(127.0f), C1357a0.m37544i(44.0f), 0);
            if (m34269mf()) {
                s1.topMargin += View$OnClickListenerC9170d1.m10065c3(true);
            }
            this.f8669y0.setLayoutParams(s1);
        }
        this.f8660p0.addView(this.f8669y0);
        if (m34269mf()) {
            C1379j0.m37303u0(this.f8669y0);
        } else if (!m9319Wa()) {
            C1408x.m37088f(this.f8669y0);
        }
    }

    @Override
    public void mo4901R() {
        int i = this.f8659o0;
        if (i == 1) {
            this.f8670z0.setHasFeedback(mo4902H2());
        } else if (i == 2) {
            this.f8669y0.setTransformationMethod(mo4902H2() ? PasswordTransformationMethod.getInstance() : C10500a.m4923a());
        } else if (i == 4) {
            this.f8647B0.setGestureVisible(mo4902H2());
        }
    }

    @Override
    public int mo407R9() {
        return R.id.controller_passcode;
    }

    public final void m34300Rf() {
        if (this.f8670z0 == null) {
            View$OnClickListenerC10512i iVar = new View$OnClickListenerC10512i(mo4347s());
            this.f8670z0 = iVar;
            iVar.m4867D1(mo4902H2());
            this.f8670z0.setCallback(this);
        }
        m34280bg();
        this.f8660p0.addView(this.f8670z0);
    }

    public final boolean m34298Sf(int i) {
        if (this.f8662r0 == null) {
            return C4862d.m24935w().m24960V(i);
        }
        String u = C4862d.m24937u(String.valueOf(i));
        C10930q6.C10940j jVar = this.f8663s0;
        if (jVar.f35144a == 5) {
            return jVar.f35146c.equals(u);
        }
        String str = jVar.f35147d;
        return str != null && str.equals(u);
    }

    public final void m34296Tf() {
        if (this.f8662r0 == null) {
            C4862d.m24935w().m24961U();
        }
    }

    @Override
    public void mo14403U(AbstractView$OnTouchListenerC7889a aVar, int i, int i2) {
        m34283af();
    }

    @Override
    public void mo4863U5(int i) {
        if (!this.f8661q0.getPincodeOutput().m4848o()) {
            C5119i0 i0Var = this.f8646A0;
            if (i0Var == null || i0Var.m23929e() < 4) {
                if (this.f8646A0 == null) {
                    this.f8646A0 = new C5119i0();
                }
                this.f8646A0.m23933a(i);
                this.f8661q0.getPincodeOutput().m4853j();
                if (this.f8646A0.m23929e() == 4) {
                    m34274hf(new C5119i0(this.f8646A0));
                    this.f8646A0.m23932b();
                }
            }
        }
    }

    public final boolean m34294Uf(String str) {
        if (this.f8662r0 == null) {
            return C4862d.m24935w().m24959W(str);
        }
        C10930q6.C10940j jVar = this.f8663s0;
        return jVar.f35144a == 2 && jVar.f35146c.equals(C4862d.m24937u(str));
    }

    @Override
    public void mo28022V6(String str, boolean z) {
        C1379j0.m37293z0(str, 0);
        C7015r3 r3Var = this.f8667w0;
        if (r3Var != null) {
            r3Var.m18091g(z);
        }
        C7015r3 r3Var2 = this.f8649D0;
        if (r3Var2 != null) {
            r3Var2.m18091g(z);
        }
    }

    public final boolean m34292Vf(String str) {
        if (this.f8662r0 == null) {
            return C4862d.m24935w().m24958X(str);
        }
        C10930q6.C10940j jVar = this.f8663s0;
        return jVar.f35144a == 3 && jVar.f35146c.equals(C4862d.m24937u(str));
    }

    @Override
    public boolean mo136W0() {
        return this.f30168a.m14413y1();
    }

    @Override
    public int mo418W9() {
        return 0;
    }

    public final boolean m34290Wf(String str) {
        if (this.f8662r0 == null) {
            return C4862d.m24935w().m24957Y(str);
        }
        C10930q6.C10940j jVar = this.f8663s0;
        return jVar.f35144a == 1 && jVar.f35146c.equals(C4862d.m24937u(str));
    }

    @Override
    public String mo4900X2() {
        TdApi.Chat chat = this.f8662r0;
        if (chat == null) {
            return null;
        }
        String str = this.f8657L0;
        if (str != null) {
            return str;
        }
        String gd2 = this.f30170b.m2437gd(chat.f25370id);
        this.f8657L0 = gd2;
        return gd2;
    }

    public void m34288Xf() {
        if (this.f8659o0 == 2) {
            C1408x.m37091c(this.f8669y0);
        }
        if (this.f8662r0 != null) {
            HandlerC10770jj dd = this.f30170b.m2485dd();
            TdApi.Chat chat = this.f8662r0;
            HandlerC10770jj.C10780j jVar = this.f8664t0;
            if (jVar == null) {
                jVar = new HandlerC10770jj.C10780j();
            }
            dd.m3881C4(this, chat, jVar.m3363m());
            return;
        }
        mo4347s().m14473k1();
    }

    public void m34286Yf() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f8649D0.getLayoutParams();
        m34284Zf(layoutParams, C1379j0.m37294z());
        this.f8649D0.setLayoutParams(layoutParams);
    }

    @Override
    public void mo23797Z2(int i) {
        m34312If(i + 1);
    }

    @Override
    public void mo417Z8() {
        m34311Jf(false);
        this.f30168a.m14407z2(this);
        C4868i.m24727c2().m24847L3(this);
        super.mo417Z8();
    }

    public final void m34284Zf(FrameLayout.LayoutParams layoutParams, int i) {
        layoutParams.gravity = i == 2 ? 21 : 49;
        int i2 = C1357a0.m37544i(44.0f);
        layoutParams.rightMargin = i2;
        layoutParams.leftMargin = i2;
        if (i == 2) {
            layoutParams.topMargin = 0;
            return;
        }
        layoutParams.topMargin = C1357a0.m37544i(118.0f);
        if (m34269mf()) {
            layoutParams.topMargin += View$OnClickListenerC9170d1.m10065c3(true);
        }
    }

    public final void m34283af() {
        boolean z = this.f8653H0 && this.f30168a.m14582I0() == 0;
        if (this.f8654I0 != z) {
            if (z) {
                C4391o.m28031b(this);
            } else {
                C4391o.m28030c();
            }
            this.f8654I0 = z;
        }
    }

    public final void m34282ag() {
        View view = this.f8652G0;
        if (view instanceof C9351w2) {
            ((C9351w2) view).setText(mo9313X9());
        } else if (view instanceof C9289s) {
            ((C9289s) view).setTitle(mo9313X9());
        }
    }

    @Override
    public int mo9286ba() {
        return R.id.theme_color_passcode;
    }

    public final void m34281bf(int i) {
        if (this.f8662r0 != null) {
            this.f8663s0.f35147d = C4862d.m24937u(String.valueOf(i));
            this.f30170b.m2406ic(this.f8662r0, this.f8663s0);
            return;
        }
        C4862d.m24935w().m24945m(i);
    }

    public final void m34280bg() {
        FrameLayout.LayoutParams v1 = FrameLayoutFix.m18005v1(this.f8670z0.getLayoutParams());
        if (C1379j0.m37294z() == 2) {
            v1.gravity = 53;
            v1.topMargin = 0;
        } else {
            v1.gravity = 49;
            v1.topMargin = C1357a0.m37544i(156.0f);
        }
        if (m34269mf()) {
            v1.topMargin += View$OnClickListenerC9170d1.m10065c3(true);
        }
        this.f8670z0.m4866E1();
        this.f8670z0.setLayoutParams(v1);
    }

    public void m34279cf(int i) {
        this.f8666v0 = i;
    }

    public final C4395p m34278df() {
        String str;
        if (this.f8656K0 == null) {
            if (this.f8662r0 != null) {
                str = this.f30170b.m2453fd() + "." + this.f8662r0.f25370id;
            } else {
                str = null;
            }
            this.f8656K0 = new C4395p(str);
        }
        return this.f8656K0;
    }

    @Override
    public void mo28021e6(final int i) {
        this.f8654I0 = false;
        int i2 = this.f8658n0;
        if (i2 != 1) {
            if (i2 != 2 || !C4862d.m24935w().m24952e(i)) {
                if (this.f8658n0 != 0 || !m34298Sf(i)) {
                    C1379j0.m37295y0(R.string.fingerprint_fail, 0);
                } else {
                    C1379j0.m37368E0(this);
                }
                m34283af();
                return;
            }
            m9291ac(new View$OnClickListenerC2714mi(this.f30168a, this.f30170b));
        } else if (this.f8661q0.getState() != 3) {
            this.f8650E0 = i;
            this.f8661q0.setState(3);
            m34311Jf(true);
            C7015r3 r3Var = this.f8649D0;
            if (r3Var != null) {
                r3Var.m18092f(0);
            }
            m34283af();
        } else if (this.f8650E0 == i) {
            C4383l.m28061a().m28060b(new Runnable() {
                @Override
                public final void run() {
                    C2536ii.this.m34261uf(i);
                }
            });
        } else {
            C1379j0.m37295y0(m34276ff(5), 0);
            m34283af();
        }
    }

    @Override
    public void mo24528g6(String str) {
        C10503c cVar;
        if (C5070i.m24068c(str, mo4900X2()) && (cVar = this.f8661q0) != null) {
            cVar.m4903t();
        }
    }

    public final int m34275gf() {
        if (this.f8662r0 == null) {
            return C4862d.m24935w().m24940r();
        }
        C10930q6.C10940j jVar = this.f8663s0;
        if (jVar != null) {
            return jVar.f35144a;
        }
        return 0;
    }

    public void m34274hf(final C5119i0 i0Var) {
        if (!m34268nf()) {
            if (!C4868i.m24727c2().m24687h2(1, mo4900X2())) {
                C4383l.m28061a().m28060b(new Runnable() {
                    @Override
                    public final void run() {
                        C2536ii.this.m34263sf(i0Var);
                    }
                });
            }
        } else if (this.f8661q0.getState() == 3) {
            if (i0Var.m23931c(this.f8651F0)) {
                C4383l.m28061a().m28060b(new Runnable() {
                    @Override
                    public final void run() {
                        C2536ii.this.m34262tf(i0Var);
                    }
                });
                return;
            }
            C1379j0.m37295y0(m34276ff(1), 0);
            this.f8661q0.getPincodeOutput().m4843t();
        } else if (i0Var.m23929e() != 4) {
            C1379j0.m37295y0(R.string.passcode_pattern_tooshort, 0);
        } else {
            this.f8651F0 = new C5119i0(i0Var);
            this.f8661q0.setState(3);
            this.f8661q0.getPincodeOutput().m4843t();
        }
    }

    public final void m34273if() {
        m34311Jf(false);
        this.f8660p0.removeView(this.f8649D0);
    }

    @Override
    public void mo4899j5(final C5119i0 i0Var) {
        if (!m34268nf()) {
            if (!C4868i.m24727c2().m24687h2(3, mo4900X2())) {
                C4383l.m28061a().m28060b(new Runnable() {
                    @Override
                    public final void run() {
                        C2536ii.this.m34266pf(i0Var);
                    }
                });
            }
        } else if (this.f8661q0.getState() == 3) {
            if (i0Var.m23931c(this.f8651F0)) {
                C4383l.m28061a().m28060b(new Runnable() {
                    @Override
                    public final void run() {
                        C2536ii.this.m34265qf(i0Var);
                    }
                });
            } else {
                C1379j0.m37295y0(m34276ff(3), 0);
            }
        } else if (i0Var.m23929e() < 4) {
            C1379j0.m37295y0(R.string.passcode_pattern_tooshort, 0);
        } else {
            this.f8651F0 = new C5119i0(i0Var);
            this.f8661q0.setState(3);
        }
    }

    public final void m34272jf() {
        this.f8660p0.removeView(this.f8647B0);
    }

    @Override
    public void mo9222kc() {
        super.mo9222kc();
        if (this.f8659o0 == 2) {
            C1408x.m37091c(this.f8669y0);
        }
    }

    public final void m34271kf() {
        C1408x.m37091c(this.f8669y0);
        this.f8660p0.removeView(this.f8669y0);
    }

    public final void m34270lf() {
        C5119i0 i0Var = this.f8646A0;
        if (i0Var != null) {
            i0Var.m23932b();
        }
        this.f8661q0.getPincodeOutput().m4852k();
        this.f8660p0.removeView(this.f8670z0);
    }

    @Override
    public void mo9208mc(Configuration configuration) {
        super.mo9208mc(configuration);
        this.f8661q0.setOrientation(configuration.orientation);
        int i = this.f8659o0;
        if (i == 1) {
            m34280bg();
        } else if (i == 5) {
            m34286Yf();
        }
    }

    public final boolean m34269mf() {
        return this.f8658n0 == 0 && this.f8662r0 == null;
    }

    public boolean m34268nf() {
        return this.f8658n0 == 1;
    }

    @Override
    public View mo403oc(Context context) {
        C2537a aVar = new C2537a(context);
        this.f8660p0 = aVar;
        C10192g.m5782i(aVar, R.id.theme_color_passcode, this);
        this.f8660p0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        mo8869G9();
        C10503c cVar = new C10503c(context);
        this.f8661q0 = cVar;
        cVar.setCallback(this);
        int i = 1;
        if (m34269mf()) {
            this.f8661q0.setPadding(0, View$OnClickListenerC9170d1.m10065c3(true), 0, 0);
            this.f8661q0.m4906q();
        }
        if (m34268nf()) {
            int i2 = this.f8666v0;
            if (i2 != 0) {
                i = i2;
            } else if (m34267of()) {
                i = m34275gf();
            }
            m34312If(i);
        } else {
            m34312If(m34275gf());
            if (this.f8659o0 != 5 && m34256zf()) {
                C7015r3 r3Var = new C7015r3(context);
                this.f8667w0 = r3Var;
                r3Var.setColorFilter(C5064d.m24132a(C11524j.m180h0(), C11524j.m228N(R.id.theme_color_passcodeIcon)));
                m9184q8(this.f8667w0, R.id.theme_color_passcodeIcon).m83g(true);
                this.f8667w0.setLayoutParams(FrameLayoutFix.m18006u1(C1357a0.m37544i(36.0f), C1357a0.m37544i(36.0f), 81, 0, 0, 0, C1357a0.m37544i(18.0f)));
                m34311Jf(true);
                this.f8660p0.addView(this.f8667w0);
            }
        }
        this.f8660p0.addView(this.f8661q0, FrameLayoutFix.m18008s1(-1, -1));
        this.f30168a.m14519Y(this);
        if (!m34268nf()) {
            C4868i.m24727c2().m24618q(this);
        }
        return this.f8660p0;
    }

    public final boolean m34267of() {
        if (this.f8662r0 == null) {
            return C4862d.m24935w().m24934x();
        }
        C10930q6.C10940j jVar = this.f8663s0;
        return (jVar == null || jVar.f35144a == 0) ? false : true;
    }

    @Override
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return i == 6 && !m34318Cf();
    }

    @Override
    public void onGesturePerformed(GestureOverlayView gestureOverlayView, Gesture gesture) {
        if (!this.f8648C0) {
            m34320Af(gesture);
        }
    }

    @Override
    public void mo414p0(int i, View$OnClickListenerC9170d1 d1Var, LinearLayout linearLayout) {
        d1Var.m10083V1(linearLayout, this);
    }

    @Override
    public void mo9166sc() {
        super.mo9166sc();
        if (this.f8659o0 == 2) {
            C1379j0.m37303u0(this.f8669y0);
        }
        int i = this.f8658n0;
        int i2 = (i == 2 || this.f8662r0 != null) ? 0 : i == 0 ? 300 : 100;
        C7015r3 r3Var = this.f8667w0;
        if (r3Var != null) {
            r3Var.m18092f(i2);
        }
        C7015r3 r3Var2 = this.f8649D0;
        if (r3Var2 != null && this.f8658n0 != 1) {
            r3Var2.m18092f(i2);
        }
    }

    @Override
    public boolean mo9165sd(Bundle bundle, String str) {
        C10930q6 q6Var;
        TdApi.Chat N3;
        C10930q6.C10940j x3;
        long j = bundle.getLong(str + "chat_id");
        if (j == 0 || (q6Var = this.f30170b) == null || (x3 = this.f30170b.m2175x3((N3 = q6Var.m2739N3(j)))) == null) {
            return false;
        }
        super.mo9165sd(bundle, str);
        m34316Ef(new C2538b(N3, x3, HandlerC10770jj.C10780j.m3361o(bundle, str)));
        return true;
    }

    @Override
    public boolean mo9134we() {
        return !this.f8661q0.m4915h() && this.f8659o0 != 4;
    }

    @Override
    public boolean mo9122yd(Bundle bundle, String str) {
        if (this.f8662r0 == null) {
            return false;
        }
        HandlerC10770jj.C10780j jVar = this.f8664t0;
        if (jVar != null && !jVar.m3360p(bundle, str)) {
            return false;
        }
        super.mo9122yd(bundle, str);
        bundle.putLong(str + "chat_id", this.f8662r0.f25370id);
        return true;
    }

    public final boolean m34256zf() {
        if (this.f8662r0 == null) {
            return C4862d.m24935w().m24977E();
        }
        C10930q6.C10940j jVar = this.f8663s0;
        return (jVar == null || jVar.f35144a == 5 || C5070i.m24062i(jVar.f35147d)) ? false : true;
    }
}
