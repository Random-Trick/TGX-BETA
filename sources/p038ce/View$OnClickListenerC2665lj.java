package p038ce;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import be.C1357a0;
import be.C1363c0;
import be.C1379j0;
import be.C1389o;
import be.C1399s0;
import be.C1408x;
import gd.C4779t2;
import me.C6847b2;
import me.C6851c0;
import me.C6977n2;
import me.View$OnFocusChangeListenerC7069y1;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p038ce.View$OnClickListenerC2937qp;
import p051db.C3950k;
import p082fd.C4403w;
import p108hb.C5070i;
import p139jb.AbstractC5918j;
import p335xd.C10192g;
import p350yd.AbstractC10573c;
import p350yd.C10930q6;
import p364zd.C11524j;
import td.AbstractC9323v4;
import td.C9270q1;
import td.View$OnClickListenerC9170d1;

public class View$OnClickListenerC2665lj extends AbstractC9323v4<C2666a> implements View.OnClickListener, C3950k.AbstractC3952b, View$OnFocusChangeListenerC7069y1.AbstractC7073d, View$OnFocusChangeListenerC7069y1.AbstractC7072c, View$OnFocusChangeListenerC7069y1.AbstractC7077h, AbstractC10573c {
    public String f8980A0;
    public boolean f8981B0;
    public C3950k f8982C0;
    public boolean f8983D0;
    public C3950k f8984E0;
    public boolean f8985F0;
    public boolean f8986G0;
    public int f8987H0;
    public String f8988I0;
    public String f8989J0;
    public boolean f8990K0;
    public int f8991n0;
    public TdApi.PasswordState f8992o0;
    public TdApi.AuthorizationState f8993p0;
    public String f8994q0;
    public View$OnFocusChangeListenerC7069y1 f8995r0;
    public C6851c0 f8996s0;
    public TextView f8997t0;
    public C6977n2 f8998u0;
    public TextView f8999v0;
    public boolean f9000w0;
    public float f9001x0;
    public C3950k f9002y0;
    public C3950k f9003z0;

    public View$OnClickListenerC2665lj(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m34006Af(TdApi.Object object) {
        if (!m9347Sa()) {
            m33952ig(false);
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                C1379j0.m37305t0(object);
            } else if (constructor == -860345416) {
                ((TdApi.AuthorizationStateWaitCode) this.f8993p0).codeInfo = (TdApi.AuthenticationCodeInfo) object;
                m33936qg();
            }
        }
    }

    public void m34005Bf(final TdApi.Object object) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2665lj.this.m34006Af(object);
            }
        });
    }

    public void m34004Cf(TdApi.Object object) {
        if (!m9347Sa()) {
            m9387Md(false);
            m33952ig(false);
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                m9425Hc(R.string.RestorePasswordNoEmailTitle, R.string.SinceNotProvided);
            } else if (constructor != -722616727) {
                Log.unexpectedTdlibResponse(object, TdApi.RequestAuthenticationPasswordRecovery.class, TdApi.C7866Ok.class, TdApi.Error.class);
            } else {
                View$OnClickListenerC2665lj ljVar = new View$OnClickListenerC2665lj(this.f30168a, this.f30170b);
                TdApi.AuthorizationStateWaitPassword authorizationStateWaitPassword = (TdApi.AuthorizationStateWaitPassword) this.f8993p0;
                ljVar.m33966bg(new C2666a(6, authorizationStateWaitPassword).m33925b(authorizationStateWaitPassword.recoveryEmailAddressPattern));
                m9291ac(ljVar);
            }
        }
    }

    public void m34003Df(final TdApi.Object object) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2665lj.this.m34004Cf(object);
            }
        });
    }

    public void m34002Ef(TdApi.Object object) {
        if (!m9347Sa()) {
            m33952ig(false);
            if (object.getConstructor() != 1151066659) {
                m9425Hc(R.string.RestorePasswordNoEmailTitle, R.string.SinceNotProvided);
                return;
            }
            TdApi.EmailAddressAuthenticationCodeInfo emailAddressAuthenticationCodeInfo = (TdApi.EmailAddressAuthenticationCodeInfo) object;
            View$OnClickListenerC2665lj ljVar = new View$OnClickListenerC2665lj(this.f30168a, this.f30170b);
            ljVar.m33966bg(new C2666a(3, this.f8992o0).m33925b(emailAddressAuthenticationCodeInfo.emailAddressPattern).m33926a(emailAddressAuthenticationCodeInfo.length));
            m9291ac(ljVar);
        }
    }

    public void m34001Ff(final TdApi.Object object) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2665lj.this.m34002Ef(object);
            }
        });
    }

    public void m34000Gf(DialogInterface dialogInterface, int i) {
        m9298Zb();
    }

    public void m33999Hf(TdApi.Object object) {
        if (!m9347Sa()) {
            m33954hg(false);
            if (this.f8991n0 == 7) {
                m9387Md(false);
            }
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                TdApi.Error error = (TdApi.Error) object;
                if ("PHONE_CODE_INVALID".equals(error.message)) {
                    m33958fg(R.string.InvalidCode, true);
                } else {
                    m33956gg(C4779t2.m25379z5(error), true);
                }
            } else if (constructor == -722616727) {
                int i = this.f8991n0;
                if (i != 7) {
                    if (i == 8) {
                        m9403Kc(R.string.AppName, C4403w.m27867j1(R.string.SuccessfullyChangedNumber, this.f8994q0), new DialogInterface.OnClickListener() {
                            @Override
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                View$OnClickListenerC2665lj.this.m34000Gf(dialogInterface, i2);
                            }
                        }, false);
                    } else if (i == 9) {
                        m9298Zb();
                    }
                } else if (C1379j0.m37361J()) {
                    this.f30170b.m2270r4().m14783o(new TdApi.SetPassword(null, "objection", C1363c0.m37410z("objection"), false, null), this.f30170b.m2214uc());
                }
            }
        }
    }

    public void m33998If(final TdApi.Object object) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2665lj.this.m33999Hf(object);
            }
        });
    }

    public void m33997Jf(TdApi.Object object, String str) {
        if (!m9347Sa()) {
            m33954hg(false);
            int constructor = object.getConstructor();
            if (constructor == -2001619202) {
                m33976Wf((TdApi.PasswordState) object, str);
            } else if (constructor != -1679978726) {
                Log.unexpectedTdlibResponse(object, TdApi.SetRecoveryEmailAddress.class, TdApi.PasswordState.class);
            } else {
                m33956gg(C4779t2.m25379z5(object), true);
            }
        }
    }

    public void m33996Kf(final String str, final TdApi.Object object) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2665lj.this.m33997Jf(object, str);
            }
        });
    }

    public void m33995Lf(TdApi.Object object, String str) {
        if (!m9347Sa()) {
            m33954hg(false);
            int constructor = object.getConstructor();
            if (constructor == -2001619202) {
                m33976Wf((TdApi.PasswordState) object, str);
            } else if (constructor != -1679978726) {
                Log.unexpectedTdlibResponse(object, TdApi.SetPassword.class, TdApi.PasswordState.class);
            } else {
                C1379j0.m37305t0(object);
            }
        }
    }

    public void m33994Mf(final String str, final TdApi.Object object) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2665lj.this.m33995Lf(object, str);
            }
        });
    }

    public void m33993Nf() {
        m33958fg(R.string.PasswordDoNotMatch, true);
    }

    public void m33992Of() {
        this.f8996s0.setIcon(R.drawable.baseline_check_24);
        m33964cg(R.string.Skip);
        m33958fg(R.string.YourEmailInfo, false);
    }

    public void m33990Pf(DialogInterface dialogInterface, int i) {
        m33944mg(this.f8988I0, this.f8989J0, null);
    }

    public void m33988Qf(org.drinkless.p210td.libcore.telegram.TdApi.Object r6, java.lang.String r7) {
        throw new UnsupportedOperationException("Method not decompiled: p038ce.View$OnClickListenerC2665lj.m33988Qf(org.drinkless.td.libcore.telegram.TdApi$Object, java.lang.String):void");
    }

    public void m33986Rf(final String str, final TdApi.Object object) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2665lj.this.m33988Qf(object, str);
            }
        });
    }

    public void m33932uf(TdApi.Object object) {
        if (!m9347Sa()) {
            m33954hg(false);
            m9387Md(false);
            if (object.getConstructor() == -1679978726) {
                TdApi.Error error = (TdApi.Error) object;
                if (error.code != 400 || !"PASSWORD_HASH_INVALID".equals(error.message)) {
                    m33956gg(C4779t2.m25379z5(object), true);
                    return;
                }
                C1399s0.m37201W(this.f8995r0.getEditText());
                C1408x.m37088f(this.f8995r0);
                m33958fg(R.string.InvalidPasswordTryAgain, true);
            }
        }
    }

    public void m33931vf(final TdApi.Object object) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2665lj.this.m33932uf(object);
            }
        });
    }

    public void m33930wf(TdApi.AuthorizationState authorizationState) {
        this.f8993p0 = authorizationState;
        m33936qg();
    }

    public void m33929xf() {
        m33943nf(1.0f);
    }

    public void m33928yf(TdApi.Object object) {
        if (!m9347Sa()) {
            if (this.f8991n0 == 6) {
                m9387Md(false);
            }
            m33954hg(false);
            int constructor = object.getConstructor();
            if (constructor == -2001619202) {
                m33976Wf((TdApi.PasswordState) object, null);
            } else if (constructor == -1679978726) {
                TdApi.Error error = (TdApi.Error) object;
                if (error.code != 400 || !"CODE_INVALID".equals(error.message)) {
                    m33956gg(C4779t2.m25379z5(error), true);
                } else {
                    m33958fg(R.string.RecoveryCodeInvalid, true);
                }
            }
        }
    }

    public void m33927zf(final TdApi.Object object) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2665lj.this.m33928yf(object);
            }
        });
    }

    @Override
    public int mo408A9() {
        return 3;
    }

    @Override
    public void mo17893I1(View$OnFocusChangeListenerC7069y1 y1Var, boolean z) {
        if (this.f9000w0) {
            this.f9000w0 = false;
            return;
        }
        int i = this.f8991n0;
        if ((i != 1 || this.f8987H0 != 3) && i != 3 && i != 6) {
            m33939pf((!z || ((i == 1 || i == 0) && this.f8987H0 == 2)) ? 1.0f : 0.0f);
        }
    }

    @Override
    public void mo4530O2(String str) {
        int i = this.f8991n0;
        if (i == 5 || i == 7) {
            this.f8995r0.setText(str);
            m33980Uf();
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        C6977n2 n2Var;
        if (i == 0) {
            m33946lg(f);
        } else if (i == 1) {
            DecelerateInterpolator decelerateInterpolator = C2057b.f7280b;
            this.f8997t0.setAlpha((decelerateInterpolator.getInterpolation((f * 0.5f) + 0.5f) / decelerateInterpolator.getInterpolation(0.5f)) * f);
        } else if (i == 2) {
            DecelerateInterpolator decelerateInterpolator2 = C2057b.f7280b;
            this.f8999v0.setAlpha((decelerateInterpolator2.getInterpolation((f * 0.5f) + 0.5f) / decelerateInterpolator2.getInterpolation(0.5f)) * f);
        } else if (i == 3 && (n2Var = this.f8998u0) != null) {
            n2Var.setAlpha(f);
        }
    }

    @Override
    public int mo407R9() {
        int i = this.f8991n0;
        return (i == 7 || i == 8 || i == 9) ? R.id.controller_code : i == 3 ? R.id.controller_passwordRecovery : i == 6 ? R.id.controller_loginPassword : R.id.controller_password;
    }

    @Override
    public boolean mo17894S0(View$OnFocusChangeListenerC7069y1 y1Var) {
        m33980Uf();
        return true;
    }

    @Override
    public boolean mo8863S8(C9270q1 q1Var, float f, float f2) {
        return !this.f8986G0;
    }

    public final void m33984Sf(String str) {
        if (!this.f8986G0) {
            if (this.f30170b.m2930B4().m4694g3().m28145j()) {
                C1379j0.m37301v0();
                return;
            }
            m33954hg(true);
            m9387Md(true);
            this.f30170b.m2270r4().m14783o(new TdApi.CheckAuthenticationPassword(str), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC2665lj.this.m33931vf(object);
                }
            });
        }
    }

    public final void m33982Tf() {
        String charSequence = this.f8995r0.getText().toString();
        int i = this.f8987H0;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        String trim = charSequence.trim();
                        if (trim.isEmpty() || !C1363c0.m37461P(charSequence)) {
                            m33940og();
                        } else {
                            m33944mg(this.f8988I0, this.f8989J0, trim);
                        }
                    }
                } else if (charSequence.toLowerCase().equals(this.f8988I0.toLowerCase())) {
                    m33958fg(R.string.PasswordAndHintMustBeDifferent, true);
                } else {
                    int i2 = this.f8991n0;
                    if (i2 == 1) {
                        m33942ng(charSequence, 3);
                    } else if (i2 == 0) {
                        m33944mg(this.f8988I0, this.f8989J0, m9139w9() != null ? m9139w9().f9008e : null);
                    }
                }
            } else if (charSequence.length() <= 0) {
            } else {
                if (this.f8988I0.equals(charSequence)) {
                    m33942ng(charSequence, 2);
                } else {
                    m33942ng(charSequence, 4);
                }
            }
        } else if (charSequence.length() <= 0) {
        } else {
            if (this.f8991n0 != 0 || m9139w9() == null || !charSequence.equals(m9139w9().f9009f)) {
                m33942ng(charSequence, 1);
            } else {
                m33958fg(R.string.PasswordMatchesOldOne, true);
            }
        }
    }

    public final void m33980Uf() {
        TdApi.PasswordState passwordState;
        String charSequence = this.f8995r0.getText().toString();
        switch (this.f8991n0) {
            case 0:
            case 1:
                m33982Tf();
                return;
            case 2:
            case 10:
            case 11:
                if (!charSequence.isEmpty()) {
                    m33938pg(charSequence);
                    return;
                }
                return;
            case 3:
            case 6:
                String D = C1363c0.m37473D(charSequence);
                if (D.length() >= 6) {
                    m33974Xf(D);
                    return;
                }
                return;
            case 4:
                if (C1363c0.m37461P(charSequence) && m9139w9() != null) {
                    if (!charSequence.equals(m9139w9().f9008e) || !((passwordState = this.f8992o0) == null || passwordState.recoveryEmailAddressCodeInfo == null)) {
                        m33948kg(charSequence);
                        return;
                    } else {
                        m33958fg(R.string.EmailMatchesOldOne, true);
                        return;
                    }
                } else {
                    return;
                }
            case 5:
                if (!charSequence.isEmpty()) {
                    m33984Sf(charSequence);
                    return;
                }
                return;
            case 7:
            case 8:
            case 9:
                m33968ag(C1363c0.m37473D(charSequence));
                return;
            default:
                return;
        }
    }

    public final void m33978Vf() {
        switch (this.f8991n0) {
            case 1:
                m33940og();
                return;
            case 2:
            case 5:
            case 10:
            case 11:
                m33970Zf();
                return;
            case 3:
            case 6:
                m9425Hc(R.string.RestorePasswordNoEmailTitle, R.string.RestoreEmailTroubleText);
                return;
            case 4:
            default:
                return;
            case 7:
            case 8:
            case 9:
                m33972Yf();
                return;
        }
    }

    public final void m33976Wf(TdApi.PasswordState passwordState, String str) {
        this.f8992o0 = passwordState;
        int i = this.f8991n0;
        if (i == 1) {
            AbstractC9323v4<?> pd = m9186pd(R.id.controller_2faSettings);
            if (pd instanceof View$OnClickListenerC2937qp) {
                ((View$OnClickListenerC2937qp) pd).m32966nh(passwordState, str);
                m9291ac(pd);
                return;
            }
        } else if (i == 0 || i == 4) {
            AbstractC9323v4<?> p9 = m9190p9(R.id.controller_2faSettings);
            if (p9 instanceof View$OnClickListenerC2937qp) {
                ((View$OnClickListenerC2937qp) p9).m32966nh(passwordState, str);
                m9298Zb();
                return;
            }
        }
        AbstractC9323v4<?> p92 = m9190p9(R.id.controller_privacySettings);
        if (p92 instanceof View$OnClickListenerC3222vw) {
            View$OnClickListenerC3222vw vwVar = (View$OnClickListenerC3222vw) p92;
            vwVar.m31113Fh(passwordState);
            View$OnClickListenerC2937qp qpVar = new View$OnClickListenerC2937qp(this.f30168a, this.f30170b);
            qpVar.m32971ih(new View$OnClickListenerC2937qp.C2939b(vwVar, null, null));
            m9291ac(qpVar);
        }
    }

    @Override
    public CharSequence mo9313X9() {
        switch (this.f8991n0) {
            case 0:
                return C4403w.m27871i1(R.string.ChangePassword);
            case 1:
                return C4403w.m27871i1(R.string.YourPassword);
            case 2:
            case 11:
                return C4403w.m27871i1(R.string.EnterPassword);
            case 3:
            case 6:
                return C4403w.m27871i1(R.string.PasswordRecovery);
            case 4:
                return C4403w.m27871i1(R.string.ChangeRecoveryEmail);
            case 5:
                return C4403w.m27871i1(R.string.TwoStepVerification);
            case 7:
            case 8:
                return C4403w.m27871i1(R.string.ConfirmationCode);
            case 9:
                return C4403w.m27871i1(R.string.CancelAccountReset);
            case 10:
                return C4403w.m27871i1(R.string.TransferOwnershipPasswordAlert);
            default:
                return null;
        }
    }

    public final void m33974Xf(String str) {
        if (!this.f8986G0) {
            if (this.f30170b.m2930B4().m4694g3().m28145j()) {
                C1379j0.m37301v0();
                return;
            }
            m33954hg(true);
            if (this.f8991n0 == 6) {
                m9387Md(true);
            }
            this.f30170b.m2270r4().m14783o(this.f8991n0 == 6 ? new TdApi.RecoverAuthenticationPassword(str, null, null) : new TdApi.RecoverPassword(str, null, null), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC2665lj.this.m33927zf(object);
                }
            });
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        if (i != 1) {
            if (i == 2 && f == 0.0f) {
                String str = this.f8980A0;
                if (str == null || str.isEmpty()) {
                    m33960eg("", false);
                    return;
                }
                m33960eg(this.f8980A0, this.f8981B0);
                this.f8980A0 = null;
                this.f8981B0 = false;
                this.f9003z0.m29546i(1.0f);
            }
        } else if (f == 0.0f) {
            this.f8997t0.setText("");
        }
    }

    public final void m33972Yf() {
        TdApi.Function function;
        if (m33933tf() && !this.f8983D0) {
            if (this.f30170b.m2930B4().m4694g3().m28145j()) {
                C1379j0.m37301v0();
                return;
            }
            m33952ig(true);
            int i = this.f8991n0;
            if (i == 8) {
                function = new TdApi.ResendChangePhoneNumberCode();
            } else if (i != 9) {
                function = new TdApi.ResendAuthenticationCode();
            } else {
                function = new TdApi.ResendPhoneNumberConfirmationCode();
            }
            this.f30170b.m2270r4().m14783o(function, new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC2665lj.this.m34005Bf(object);
                }
            });
        }
    }

    @Override
    public void mo4529Z6(final TdApi.AuthorizationState authorizationState) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2665lj.this.m33930wf(authorizationState);
            }
        });
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        this.f30170b.m2781K9().m1904T(this);
        C6851c0 c0Var = this.f8996s0;
        if (c0Var != null) {
            c0Var.m18792b();
        }
    }

    public final void m33970Zf() {
        TdApi.AuthorizationState authorizationState;
        TdApi.PasswordState passwordState = this.f8992o0;
        if ((passwordState != null && !passwordState.hasRecoveryEmailAddress) || (((authorizationState = this.f8993p0) != null && authorizationState.getConstructor() == 187548796 && !((TdApi.AuthorizationStateWaitPassword) this.f8993p0).hasRecoveryEmailAddress) || (this.f8992o0 == null && this.f8993p0 == null))) {
            m9425Hc(R.string.RestorePasswordNoEmailTitle, R.string.SinceNotProvided);
        } else if (!this.f8983D0) {
            if (this.f30170b.m2930B4().m4694g3().m28145j()) {
                C1379j0.m37301v0();
                return;
            }
            m33952ig(true);
            if (this.f8991n0 != 5) {
                this.f30170b.m2270r4().m14783o(new TdApi.RequestPasswordRecovery(), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        View$OnClickListenerC2665lj.this.m34001Ff(object);
                    }
                });
            } else if (this.f8993p0.getConstructor() != 187548796) {
                Log.m14724e("Can't proceed, authState: %s", this.f8993p0);
            } else if (!((TdApi.AuthorizationStateWaitPassword) this.f8993p0).hasRecoveryEmailAddress) {
                m9425Hc(R.string.RestorePasswordNoEmailTitle, R.string.SinceNotProvided);
            } else {
                m9387Md(true);
                this.f30170b.m2270r4().m14783o(new TdApi.RequestAuthenticationPasswordRecovery(), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        View$OnClickListenerC2665lj.this.m34003Df(object);
                    }
                });
            }
        }
    }

    public final void m33968ag(String str) {
        TdApi.Function function;
        if (!this.f8986G0) {
            if (this.f30170b.m2930B4().m4694g3().m28145j()) {
                C1379j0.m37301v0();
                return;
            }
            m33954hg(true);
            if (this.f8991n0 == 7) {
                m9387Md(true);
            }
            int i = this.f8991n0;
            if (i == 8) {
                function = new TdApi.CheckChangePhoneNumberCode(str);
            } else if (i != 9) {
                function = new TdApi.CheckAuthenticationCode(str);
            } else {
                function = new TdApi.CheckPhoneNumberConfirmationCode(str);
            }
            this.f30170b.m2270r4().m14783o(function, new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC2665lj.this.m33998If(object);
                }
            });
        }
    }

    public void m33966bg(C2666a aVar) {
        super.m9476Ad(aVar);
        this.f8991n0 = aVar.f9004a;
        this.f8992o0 = aVar.f9005b;
        this.f8993p0 = aVar.f9006c;
        this.f8994q0 = aVar.f9007d;
    }

    public final void m33964cg(int i) {
        m33962dg(C4403w.m27871i1(i));
    }

    @Override
    public boolean mo9271db() {
        int i = this.f8991n0;
        return i == 5 || i == 6 || i == 7;
    }

    public final void m33962dg(String str) {
        if (str == null || str.isEmpty()) {
            m33943nf(0.0f);
            if (this.f8997t0.getAlpha() == 0.0f) {
                this.f8997t0.setText("");
                return;
            }
            return;
        }
        this.f8997t0.setText(str);
        m33943nf(1.0f);
    }

    public final void m33960eg(String str, boolean z) {
        this.f8999v0.setText(str);
        this.f8999v0.setTextColor(z ? C11524j.m205Y0() : C11524j.m213U0());
        m9180qd(this.f8999v0);
        m9119z8(this.f8999v0, z ? R.id.theme_color_textNegative : R.id.theme_color_textLight);
        this.f8995r0.setInErrorState(z);
    }

    public final void m33958fg(int i, boolean z) {
        m33956gg(C4403w.m27871i1(i), z);
    }

    public final void m33956gg(String str, boolean z) {
        if (str == null || str.isEmpty()) {
            m33941of(0.0f);
            if (this.f8999v0.getAlpha() == 0.0f) {
                m33960eg("", false);
            }
        } else if (this.f8999v0.getAlpha() == 0.0f) {
            m33960eg(str, z);
            m33941of(1.0f);
        } else {
            this.f8980A0 = str;
            this.f8981B0 = z;
            m33941of(0.0f);
        }
    }

    public final void m33954hg(boolean z) {
        if (this.f8986G0 != z) {
            this.f8986G0 = z;
            this.f8996s0.setInProgress(z);
        }
    }

    @Override
    public void mo17889i2(View$OnFocusChangeListenerC7069y1 y1Var, CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        int i = this.f8991n0;
        boolean z = true;
        if (i == 1 && this.f8987H0 == 3) {
            m33950jg(C1363c0.m37461P(charSequence2));
        } else if (i == 3 || i == 6) {
            if (C1363c0.m37473D(charSequence2).length() < 6) {
                z = false;
            }
            m33950jg(z);
        } else if ((i == 7 || i == 8 || i == 9) && C1363c0.m37472E(charSequence2) >= C4779t2.m25595U0(this.f8993p0)) {
            m33980Uf();
        } else {
            int i2 = this.f8991n0;
            if ((i2 == 1 || i2 == 0) && this.f8987H0 == 2) {
                this.f8989J0 = charSequence2;
            }
        }
    }

    public final void m33952ig(boolean z) {
        if (this.f8983D0 != z) {
            this.f8983D0 = z;
            m33937qf(z ? 1.0f : 0.0f);
        }
    }

    public final void m33950jg(boolean z) {
        if (this.f8990K0 != z) {
            this.f8990K0 = z;
            m33939pf(z ? 1.0f : 0.0f);
        }
    }

    public final void m33948kg(String str) {
        if (!this.f8986G0) {
            if (this.f30170b.m2930B4().m4694g3().m28145j()) {
                C1379j0.m37301v0();
                return;
            }
            m33954hg(true);
            final String str2 = m9139w9() != null ? m9139w9().f9009f : null;
            this.f30170b.m2270r4().m14783o(new TdApi.SetRecoveryEmailAddress(str2, str), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC2665lj.this.m33996Kf(str2, object);
                }
            });
        }
    }

    public final void m33946lg(float f) {
        if (this.f9001x0 != f) {
            this.f9001x0 = f;
            this.f8996s0.setAlpha(Math.min(1.0f, f));
            float f2 = (f * 0.4f) + 0.6f;
            this.f8996s0.setScaleX(f2);
            this.f8996s0.setScaleY(f2);
        }
    }

    public final void m33944mg(final String str, String str2, String str3) {
        if (!this.f8986G0) {
            if (this.f30170b.m2930B4().m4694g3().m28145j()) {
                C1379j0.m37301v0();
                return;
            }
            m33954hg(true);
            this.f30170b.m2270r4().m14783o(new TdApi.SetPassword((this.f8991n0 == 1 || m9139w9() == null) ? null : m9139w9().f9009f, str, str2, this.f8991n0 != 0, str3), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC2665lj.this.m33994Mf(str, object);
                }
            });
        }
    }

    public final void m33943nf(float f) {
        if (this.f8982C0 == null) {
            this.f8982C0 = new C3950k(1, this, C2057b.f7283e, 180L, this.f8997t0.getAlpha());
        }
        this.f8982C0.m29546i(f);
    }

    public final void m33942ng(String str, int i) {
        if (this.f8987H0 != i) {
            if (i != 4) {
                this.f8987H0 = i;
            } else {
                this.f8987H0 = 0;
            }
            Runnable runnable = null;
            if (i != 0) {
                if (i == 1) {
                    m33962dg(null);
                    m33956gg(null, false);
                    this.f8988I0 = str;
                    this.f9000w0 = true;
                    m33939pf(0.0f);
                    this.f8995r0.m17906d2(R.string.ReEnterAPassword, true, null);
                    return;
                } else if (i == 2) {
                    m33962dg(null);
                    String z = C1363c0.m37410z(this.f8988I0);
                    this.f8989J0 = z;
                    this.f8995r0.m17907b2(R.string.CreateAHintForYourPassword, z, false, null);
                    if (this.f8991n0 == 0) {
                        this.f8996s0.m18787g(R.drawable.baseline_check_24);
                        return;
                    }
                    return;
                } else if (i == 3) {
                    this.f9000w0 = true;
                    m33939pf(0.0f);
                    this.f8995r0.m17906d2(R.string.YourEmail, false, new Runnable() {
                        @Override
                        public final void run() {
                            View$OnClickListenerC2665lj.this.m33992Of();
                        }
                    });
                    return;
                } else if (i != 4) {
                    return;
                }
            }
            m33962dg(null);
            this.f9000w0 = true;
            m33939pf(0.0f);
            View$OnFocusChangeListenerC7069y1 y1Var = this.f8995r0;
            if (i == 4) {
                runnable = new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC2665lj.this.m33993Nf();
                    }
                };
            }
            y1Var.m17906d2(R.string.EnterAPassword, true, runnable);
        }
    }

    @Override
    public View mo403oc(Context context) {
        CharSequence charSequence;
        String str;
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        C10192g.m5782i(frameLayoutFix, R.id.theme_color_filling, this);
        int A = ((C1357a0.m37557A() - View$OnClickListenerC9170d1.m10065c3(false)) - C1357a0.m37544i(175.0f)) / 2;
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-1, -2, 51);
        t1.topMargin = A;
        t1.leftMargin = C1357a0.m37544i(16.0f);
        t1.rightMargin = C1357a0.m37544i(16.0f);
        View$OnFocusChangeListenerC7069y1 y1Var = new View$OnFocusChangeListenerC7069y1(context);
        this.f8995r0 = y1Var;
        y1Var.getEditText().setImeOptions(268435462);
        this.f8995r0.m17922J1(this);
        this.f8995r0.setDoneListener(this);
        this.f8995r0.setEmptyListener(this);
        this.f8995r0.setTextListener(this);
        switch (this.f8991n0) {
            case 3:
            case 6:
            case 7:
            case 8:
            case 9:
                this.f8995r0.getEditText().setInputType(2);
                break;
            case 4:
                this.f8995r0.getEditText().setInputType(33);
                break;
            case 5:
            default:
                this.f8995r0.getEditText().setInputType(524417);
                this.f8995r0.getEditText().setIsPassword(true);
                break;
        }
        switch (this.f8991n0) {
            case 0:
                this.f8995r0.setHint(R.string.EnterANewPassword);
                break;
            case 1:
                this.f8995r0.setHint(R.string.EnterAPassword);
                break;
            case 2:
            case 10:
            case 11:
                TdApi.PasswordState passwordState = this.f8992o0;
                if (passwordState != null && (str = passwordState.passwordHint) != null && !str.isEmpty()) {
                    this.f8995r0.setHint(C4403w.m27867j1(R.string.Hint, this.f8992o0.passwordHint));
                    break;
                } else {
                    this.f8995r0.setHint(R.string.EnterAPassword);
                    break;
                }
            case 3:
            case 6:
                this.f8995r0.setHint(R.string.EnterCode);
                break;
            case 4:
                this.f8995r0.setHint(R.string.EnterANewEmail);
                break;
            case 5:
                TdApi.AuthorizationState authorizationState = this.f8993p0;
                if (authorizationState != null && authorizationState.getConstructor() == 187548796 && !C5070i.m24062i(((TdApi.AuthorizationStateWaitPassword) this.f8993p0).passwordHint)) {
                    this.f8995r0.setHint(C4403w.m27867j1(R.string.Hint, ((TdApi.AuthorizationStateWaitPassword) this.f8993p0).passwordHint));
                    break;
                } else {
                    this.f8995r0.setHint(R.string.EnterAPassword);
                    break;
                }
            case 7:
            case 8:
            case 9:
                this.f8995r0.setHint(R.string.login_Code);
                break;
        }
        this.f8995r0.setLayoutParams(t1);
        frameLayoutFix.addView(this.f8995r0);
        int i = C1357a0.m37544i(4.0f);
        int i2 = i * 2;
        FrameLayout.LayoutParams t12 = FrameLayoutFix.m18007t1(C1357a0.m37544i(56.0f) + i2, C1357a0.m37544i(56.0f) + i2, 85);
        int i3 = C1357a0.m37544i(16.0f) - i;
        t12.bottomMargin = i3;
        t12.rightMargin = i3;
        C6851c0 c0Var = new C6851c0(context);
        this.f8996s0 = c0Var;
        m9163t8(c0Var);
        this.f8996s0.setId(R.id.btn_done);
        this.f8996s0.m18790d(m33934sf(), 56.0f, 4.0f, R.id.theme_color_circleButtonRegular, R.id.theme_color_circleButtonRegularIcon);
        this.f8996s0.setOnClickListener(this);
        this.f8996s0.setLayoutParams(t12);
        this.f8996s0.setAlpha(0.0f);
        this.f8996s0.setScaleX(0.6f);
        this.f8996s0.setScaleY(0.6f);
        frameLayoutFix.addView(this.f8996s0);
        C6847b2 b2Var = new C6847b2(context);
        this.f8997t0 = b2Var;
        b2Var.setId(R.id.btn_forgotPassword);
        this.f8997t0.setTextColor(C11524j.m228N(R.id.theme_color_textNeutral));
        m9119z8(this.f8997t0, R.id.theme_color_textNeutral);
        this.f8997t0.setTextSize(1, 15.0f);
        this.f8997t0.setPadding(C1357a0.m37544i(16.0f), C1357a0.m37544i(16.0f), C1357a0.m37544i(16.0f), C1357a0.m37544i(16.0f));
        this.f8997t0.setOnClickListener(this);
        this.f8997t0.setAlpha(0.0f);
        C1399s0.m37196a0(this.f8997t0);
        int i4 = this.f8991n0;
        switch (i4) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 10:
            case 11:
                if (i4 != 11 && i4 != 2 && i4 != 5 && i4 != 10) {
                    if (i4 == 3 || i4 == 6) {
                        String str2 = m9139w9() != null ? ((C2666a) m9139w9()).f9008e : null;
                        if (C5070i.m24062i(str2)) {
                            charSequence = C4403w.m27871i1(R.string.RecoveryCodeSentEmailUnknown);
                            this.f8997t0.setText(C4403w.m27871i1(R.string.RestoreEmailTroubleUnknown));
                            break;
                        } else {
                            CharSequence m1 = C4403w.m27855m1(R.string.RecoveryCodeSent, str2);
                            this.f8997t0.setText(C4403w.m27867j1(R.string.HavingTroubleAccessing, str2));
                            charSequence = m1;
                            break;
                        }
                    }
                    charSequence = null;
                    break;
                } else {
                    this.f8997t0.setText(C4403w.m27871i1(R.string.ForgotPassword));
                    charSequence = C4403w.m27871i1(this.f8991n0 == 10 ? R.string.TransferOwnershipPasswordAlertHint : R.string.LoginPasswordText);
                    break;
                }
            case 4:
                charSequence = C4403w.m27871i1(R.string.YourEmailInfo);
                break;
            case 7:
            case 8:
            case 9:
                if (m33933tf()) {
                    this.f8997t0.setText(C4403w.m27871i1(R.string.DidNotGetTheCode));
                }
                charSequence = m33935rf(((TdApi.AuthorizationStateWaitCode) this.f8993p0).codeInfo.type, this.f8994q0);
                break;
            default:
                charSequence = null;
                break;
        }
        int i5 = this.f8991n0;
        if (i5 == 10 || i5 == 2 || i5 == 11 || i5 == 5 || i5 == 7 || i5 == 8 || i5 == 9) {
            RelativeLayout relativeLayout = new RelativeLayout(context);
            relativeLayout.setLayoutParams(FrameLayoutFix.m18007t1(-2, -2, 83));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            this.f8997t0.setPadding(C1357a0.m37544i(16.0f), C1357a0.m37544i(15.0f), C1357a0.m37544i(12.0f), C1357a0.m37544i(16.0f));
            this.f8997t0.setLayoutParams(layoutParams);
            relativeLayout.addView(this.f8997t0);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(C1357a0.m37544i(16.0f), C1357a0.m37544i(16.0f));
            layoutParams2.addRule(15);
            layoutParams2.addRule(1, R.id.btn_forgotPassword);
            C6977n2 n2Var = new C6977n2(context);
            this.f8998u0 = n2Var;
            n2Var.m18225i(0.0f);
            this.f8998u0.setProgressColor(C11524j.m228N(R.id.theme_color_textNeutral));
            m9119z8(this.f8998u0, R.id.theme_color_textNeutral);
            this.f8998u0.setAlpha(0.0f);
            this.f8998u0.setLayoutParams(layoutParams2);
            relativeLayout.addView(this.f8998u0);
            frameLayoutFix.addView(relativeLayout);
        } else {
            this.f8997t0.setLayoutParams(FrameLayoutFix.m18007t1(-2, -2, 83));
            frameLayoutFix.addView(this.f8997t0);
        }
        FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(-2, -2);
        int i6 = C1357a0.m37544i(16.0f);
        s1.rightMargin = i6;
        s1.leftMargin = i6;
        s1.topMargin = A + C1357a0.m37544i(60.0f) + C1357a0.m37544i(14.0f);
        C6847b2 b2Var2 = new C6847b2(context);
        this.f8999v0 = b2Var2;
        b2Var2.setTextSize(1, 15.0f);
        this.f8999v0.setTextColor(C11524j.m213U0());
        m9119z8(this.f8999v0, R.id.theme_color_textLight);
        this.f8999v0.setTypeface(C1389o.m37261k());
        this.f8999v0.setLayoutParams(s1);
        if (charSequence != null) {
            this.f8999v0.setText(charSequence);
        } else {
            this.f8999v0.setAlpha(0.0f);
        }
        frameLayoutFix.addView(this.f8999v0);
        m9446Ed(this.f8995r0.getEditText());
        int i7 = this.f8991n0;
        if (i7 == 3 || i7 == 5 || i7 == 6 || i7 == 7) {
            this.f30170b.m2781K9().m1843k(this);
        }
        return frameLayoutFix;
    }

    public final void m33941of(float f) {
        if (this.f9003z0 == null) {
            this.f9003z0 = new C3950k(2, this, C2057b.f7283e, 180L, this.f8999v0.getAlpha());
        }
        this.f9003z0.m29546i(f);
    }

    public final void m33940og() {
        m9418Ic(R.string.Warning, R.string.YourEmailSkipWarningText, new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                View$OnClickListenerC2665lj.this.m33990Pf(dialogInterface, i);
            }
        });
    }

    @Override
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.btn_done) {
            m33980Uf();
        } else if (id2 == R.id.btn_forgotPassword) {
            m33978Vf();
        }
    }

    public final void m33939pf(float f) {
        if (this.f9002y0 == null) {
            this.f9002y0 = new C3950k(0, this, C2057b.f7279a, 300L, this.f9001x0);
        }
        this.f9002y0.m29546i(f);
    }

    public final void m33938pg(final String str) {
        if (!this.f8986G0) {
            if (this.f30170b.m2930B4().m4694g3().m28145j()) {
                C1379j0.m37301v0();
                return;
            }
            m33954hg(true);
            this.f30170b.m2270r4().m14783o(new TdApi.GetRecoveryEmailAddress(str), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC2665lj.this.m33986Rf(str, object);
                }
            });
        }
    }

    public final void m33937qf(float f) {
        if (this.f8984E0 == null) {
            this.f8984E0 = new C3950k(3, this, C2057b.f7280b, 180L);
        }
        this.f8984E0.m29546i(f);
    }

    public final void m33936qg() {
        TdApi.AuthorizationState authorizationState = this.f8993p0;
        if (authorizationState != null && authorizationState.getConstructor() == 52643073) {
            this.f8999v0.setText(m33935rf(((TdApi.AuthorizationStateWaitCode) this.f8993p0).codeInfo.type, this.f8994q0));
            if (!m33933tf()) {
                m33962dg(null);
            }
        }
    }

    public final CharSequence m33935rf(TdApi.AuthenticationCodeType authenticationCodeType, String str) {
        if (this.f8991n0 == 9) {
            return C1363c0.m37452Y(C4403w.m27867j1(R.string.CancelAccountResetInfo, str));
        }
        this.f8995r0.setHint(C4403w.m27871i1(R.string.login_Code));
        switch (authenticationCodeType.getConstructor()) {
            case TdApi.AuthenticationCodeTypeMissedCall.CONSTRUCTOR:
                TdApi.AuthenticationCodeTypeMissedCall authenticationCodeTypeMissedCall = (TdApi.AuthenticationCodeTypeMissedCall) authenticationCodeType;
                this.f8995r0.setHint(C4403w.m27838q2(R.string.login_LastDigits, authenticationCodeTypeMissedCall.length));
                return C1363c0.m37451Z(C4403w.m27867j1(R.string.format_doubleLines, C4403w.m27867j1(R.string.SentMissedCall, C1363c0.m37413w(authenticationCodeTypeMissedCall.phoneNumberPrefix)), C4403w.m27846o2(R.string.SentMissedCallXDigits, authenticationCodeTypeMissedCall.length)), R.id.theme_color_textLight);
            case TdApi.AuthenticationCodeTypeSms.CONSTRUCTOR:
                return C1363c0.m37451Z(C4403w.m27867j1(R.string.SentSmsCode, str), R.id.theme_color_textLight);
            case TdApi.AuthenticationCodeTypeFlashCall.CONSTRUCTOR:
                return C1363c0.m37451Z(C4403w.m27867j1(R.string.SentCallOnly, str), R.id.theme_color_textLight);
            case TdApi.AuthenticationCodeTypeCall.CONSTRUCTOR:
                return C1363c0.m37451Z(C4403w.m27867j1(R.string.SentCallCode, str), R.id.theme_color_textLight);
            case TdApi.AuthenticationCodeTypeTelegramMessage.CONSTRUCTOR:
                return C1363c0.m37451Z(C4403w.m27871i1(R.string.SentAppCode), R.id.theme_color_textLight);
            default:
                return C1363c0.m37451Z(C4403w.m27871i1(R.string.SentSmsCode), R.id.theme_color_textLight);
        }
    }

    @Override
    public void mo9166sc() {
        super.mo9166sc();
        if (!this.f8985F0) {
            int i = this.f8991n0;
            if (i == 2) {
                m9280c9(R.id.controller_2faSettings);
            } else if (i == 5) {
                m9280c9(R.id.controller_code);
            } else if (i == 7) {
                m9280c9(R.id.controller_name);
            } else if (i == 8) {
                m9280c9(R.id.controller_phone);
            }
            if (C1379j0.m37361J()) {
                int i2 = this.f8991n0;
                if (i2 == 5) {
                    this.f8995r0.setText("objection");
                    m33980Uf();
                } else if (i2 == 7 || i2 == 8) {
                    this.f8995r0.setText(this.f30170b.m2609Va());
                    m33980Uf();
                }
            }
            this.f8985F0 = true;
        }
        TextView textView = this.f8997t0;
        if (textView != null && textView.getAlpha() == 0.0f && this.f8997t0.getText().length() > 0) {
            this.f8997t0.postDelayed(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2665lj.this.m33929xf();
                }
            }, 100L);
        }
    }

    public final int m33934sf() {
        int i = this.f8991n0;
        if (i == 4) {
            return R.drawable.baseline_check_24;
        }
        switch (i) {
            case 8:
            case 9:
            case 10:
            case 11:
                return R.drawable.baseline_check_24;
            default:
                return R.drawable.baseline_arrow_forward_24;
        }
    }

    public final boolean m33933tf() {
        TdApi.AuthorizationState authorizationState = this.f8993p0;
        return (authorizationState == null || authorizationState.getConstructor() != 52643073 || ((TdApi.AuthorizationStateWaitCode) this.f8993p0).codeInfo.nextType == null) ? false : true;
    }

    public static class C2666a {
        public final int f9004a;
        public final TdApi.PasswordState f9005b;
        public final TdApi.AuthorizationState f9006c;
        public String f9007d;
        public String f9008e;
        public String f9009f;
        public int f9010g;
        public AbstractC5918j<String> f9011h;

        public C2666a(int i, TdApi.PasswordState passwordState) {
            this.f9004a = i;
            this.f9005b = passwordState;
            this.f9006c = null;
        }

        public C2666a m33926a(int i) {
            this.f9010g = i;
            return this;
        }

        public C2666a m33925b(String str) {
            this.f9008e = str;
            return this;
        }

        public C2666a m33924c(String str) {
            this.f9009f = str;
            return this;
        }

        public C2666a m33923d(AbstractC5918j<String> jVar) {
            this.f9011h = jVar;
            return this;
        }

        public C2666a(int i, TdApi.AuthorizationStateWaitPassword authorizationStateWaitPassword) {
            this.f9004a = i;
            this.f9005b = null;
            this.f9006c = authorizationStateWaitPassword;
        }

        public C2666a(int i, TdApi.AuthorizationStateWaitCode authorizationStateWaitCode, String str) {
            this.f9004a = i;
            this.f9005b = null;
            this.f9006c = authorizationStateWaitCode;
            this.f9007d = str;
        }

        public C2666a(int i, TdApi.AuthenticationCodeInfo authenticationCodeInfo, String str) {
            this.f9004a = i;
            this.f9005b = null;
            this.f9006c = new TdApi.AuthorizationStateWaitCode(authenticationCodeInfo);
            this.f9007d = str;
        }
    }
}
