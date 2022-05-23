package de;

import ae.j;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ce.a0;
import ce.j0;
import ce.o;
import ce.p0;
import ce.x;
import db.b;
import de.qp;
import eb.k;
import gd.w;
import hd.t2;
import ib.i;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.b2;
import ne.c0;
import ne.n2;
import ne.y1;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.d1;
import ud.q1;
import ud.v4;
import yd.g;
import zd.c;
import zd.o6;

public class lj extends v4<a> implements View.OnClickListener, k.b, y1.d, y1.c, y1.h, c {
    public String A0;
    public boolean B0;
    public k C0;
    public boolean D0;
    public k E0;
    public boolean F0;
    public boolean G0;
    public int H0;
    public String I0;
    public String J0;
    public boolean K0;
    public int f8586n0;
    public TdApi.PasswordState f8587o0;
    public TdApi.AuthorizationState f8588p0;
    public String f8589q0;
    public y1 f8590r0;
    public c0 f8591s0;
    public TextView f8592t0;
    public n2 f8593u0;
    public TextView f8594v0;
    public boolean f8595w0;
    public float f8596x0;
    public k f8597y0;
    public k f8598z0;

    public lj(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void Af(TdApi.Object object) {
        if (!Sa()) {
            ig(false);
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                j0.t0(object);
            } else if (constructor == -860345416) {
                ((TdApi.AuthorizationStateWaitCode) this.f8588p0).codeInfo = (TdApi.AuthenticationCodeInfo) object;
                qg();
            }
        }
    }

    public void Bf(final TdApi.Object object) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                lj.this.Af(object);
            }
        });
    }

    public void Cf(TdApi.Object object) {
        if (!Sa()) {
            Md(false);
            ig(false);
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                Hc(R.string.RestorePasswordNoEmailTitle, R.string.SinceNotProvided);
            } else if (constructor != -722616727) {
                Log.unexpectedTdlibResponse(object, TdApi.RequestAuthenticationPasswordRecovery.class, TdApi.Ok.class, TdApi.Error.class);
            } else {
                lj ljVar = new lj(this.f24493a, this.f24495b);
                TdApi.AuthorizationStateWaitPassword authorizationStateWaitPassword = (TdApi.AuthorizationStateWaitPassword) this.f8588p0;
                ljVar.bg(new a(6, authorizationStateWaitPassword).b(authorizationStateWaitPassword.recoveryEmailAddressPattern));
                ac(ljVar);
            }
        }
    }

    public void Df(final TdApi.Object object) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                lj.this.Cf(object);
            }
        });
    }

    public void Ef(TdApi.Object object) {
        if (!Sa()) {
            ig(false);
            if (object.getConstructor() != 1151066659) {
                Hc(R.string.RestorePasswordNoEmailTitle, R.string.SinceNotProvided);
                return;
            }
            TdApi.EmailAddressAuthenticationCodeInfo emailAddressAuthenticationCodeInfo = (TdApi.EmailAddressAuthenticationCodeInfo) object;
            lj ljVar = new lj(this.f24493a, this.f24495b);
            ljVar.bg(new a(3, this.f8587o0).b(emailAddressAuthenticationCodeInfo.emailAddressPattern).a(emailAddressAuthenticationCodeInfo.length));
            ac(ljVar);
        }
    }

    public void Ff(final TdApi.Object object) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                lj.this.Ef(object);
            }
        });
    }

    public void Gf(DialogInterface dialogInterface, int i10) {
        Zb();
    }

    public void Hf(TdApi.Object object) {
        if (!Sa()) {
            hg(false);
            if (this.f8586n0 == 7) {
                Md(false);
            }
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                TdApi.Error error = (TdApi.Error) object;
                if ("PHONE_CODE_INVALID".equals(error.message)) {
                    fg(R.string.InvalidCode, true);
                } else {
                    gg(t2.z5(error), true);
                }
            } else if (constructor == -722616727) {
                int i10 = this.f8586n0;
                if (i10 != 7) {
                    if (i10 == 8) {
                        Kc(R.string.AppName, w.j1(R.string.SuccessfullyChangedNumber, this.f8589q0), new DialogInterface.OnClickListener() {
                            @Override
                            public final void onClick(DialogInterface dialogInterface, int i11) {
                                lj.this.Gf(dialogInterface, i11);
                            }
                        }, false);
                    } else if (i10 == 9) {
                        Zb();
                    }
                } else if (j0.J()) {
                    this.f24495b.v4().o(new TdApi.SetPassword(null, "objection", ce.c0.z("objection"), false, null), this.f24495b.yc());
                }
            }
        }
    }

    public void If(final TdApi.Object object) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                lj.this.Hf(object);
            }
        });
    }

    public void Jf(TdApi.Object object, String str) {
        if (!Sa()) {
            hg(false);
            int constructor = object.getConstructor();
            if (constructor == -2001619202) {
                Wf((TdApi.PasswordState) object, str);
            } else if (constructor != -1679978726) {
                Log.unexpectedTdlibResponse(object, TdApi.SetRecoveryEmailAddress.class, TdApi.PasswordState.class);
            } else {
                gg(t2.z5(object), true);
            }
        }
    }

    public void Kf(final String str, final TdApi.Object object) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                lj.this.Jf(object, str);
            }
        });
    }

    public void Lf(TdApi.Object object, String str) {
        if (!Sa()) {
            hg(false);
            int constructor = object.getConstructor();
            if (constructor == -2001619202) {
                Wf((TdApi.PasswordState) object, str);
            } else if (constructor != -1679978726) {
                Log.unexpectedTdlibResponse(object, TdApi.SetPassword.class, TdApi.PasswordState.class);
            } else {
                j0.t0(object);
            }
        }
    }

    public void Mf(final String str, final TdApi.Object object) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                lj.this.Lf(object, str);
            }
        });
    }

    public void Nf() {
        fg(R.string.PasswordDoNotMatch, true);
    }

    public void Of() {
        this.f8591s0.setIcon(R.drawable.baseline_check_24);
        cg(R.string.Skip);
        fg(R.string.YourEmailInfo, false);
    }

    public void Pf(DialogInterface dialogInterface, int i10) {
        mg(this.I0, this.J0, null);
    }

    public void Qf(org.drinkless.td.libcore.telegram.TdApi.Object r6, java.lang.String r7) {
        throw new UnsupportedOperationException("Method not decompiled: de.lj.Qf(org.drinkless.td.libcore.telegram.TdApi$Object, java.lang.String):void");
    }

    public void Rf(final String str, final TdApi.Object object) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                lj.this.Qf(object, str);
            }
        });
    }

    public void uf(TdApi.Object object) {
        if (!Sa()) {
            hg(false);
            Md(false);
            if (object.getConstructor() == -1679978726) {
                TdApi.Error error = (TdApi.Error) object;
                if (error.code != 400 || !"PASSWORD_HASH_INVALID".equals(error.message)) {
                    gg(t2.z5(object), true);
                    return;
                }
                p0.P(this.f8590r0.getEditText());
                x.f(this.f8590r0);
                fg(R.string.InvalidPasswordTryAgain, true);
            }
        }
    }

    public void vf(final TdApi.Object object) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                lj.this.uf(object);
            }
        });
    }

    public void wf(TdApi.AuthorizationState authorizationState) {
        this.f8588p0 = authorizationState;
        qg();
    }

    public void xf() {
        nf(1.0f);
    }

    public void yf(TdApi.Object object) {
        if (!Sa()) {
            if (this.f8586n0 == 6) {
                Md(false);
            }
            hg(false);
            int constructor = object.getConstructor();
            if (constructor == -2001619202) {
                Wf((TdApi.PasswordState) object, null);
            } else if (constructor == -1679978726) {
                TdApi.Error error = (TdApi.Error) object;
                if (error.code != 400 || !"CODE_INVALID".equals(error.message)) {
                    gg(t2.z5(error), true);
                } else {
                    fg(R.string.RecoveryCodeInvalid, true);
                }
            }
        }
    }

    public void zf(final TdApi.Object object) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                lj.this.yf(object);
            }
        });
    }

    @Override
    public int A9() {
        return 3;
    }

    @Override
    public void F2(String str) {
        int i10 = this.f8586n0;
        if (i10 == 5 || i10 == 7) {
            this.f8590r0.setText(str);
            Uf();
        }
    }

    @Override
    public void N4(y1 y1Var, boolean z10) {
        if (this.f8595w0) {
            this.f8595w0 = false;
            return;
        }
        int i10 = this.f8586n0;
        if ((i10 != 1 || this.H0 != 3) && i10 != 3 && i10 != 6) {
            pf((!z10 || ((i10 == 1 || i10 == 0) && this.H0 == 2)) ? 1.0f : 0.0f);
        }
    }

    @Override
    public int R9() {
        int i10 = this.f8586n0;
        return (i10 == 7 || i10 == 8 || i10 == 9) ? R.id.controller_code : i10 == 3 ? R.id.controller_passwordRecovery : i10 == 6 ? R.id.controller_loginPassword : R.id.controller_password;
    }

    @Override
    public boolean S8(q1 q1Var, float f10, float f11) {
        return !this.G0;
    }

    public final void Sf(String str) {
        if (!this.G0) {
            if (this.f24495b.F4().g3().j()) {
                j0.v0();
                return;
            }
            hg(true);
            Md(true);
            this.f24495b.v4().o(new TdApi.CheckAuthenticationPassword(str), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    lj.this.vf(object);
                }
            });
        }
    }

    public final void Tf() {
        String charSequence = this.f8590r0.getText().toString();
        int i10 = this.H0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        String trim = charSequence.trim();
                        if (trim.isEmpty() || !ce.c0.P(charSequence)) {
                            og();
                        } else {
                            mg(this.I0, this.J0, trim);
                        }
                    }
                } else if (charSequence.toLowerCase().equals(this.I0.toLowerCase())) {
                    fg(R.string.PasswordAndHintMustBeDifferent, true);
                } else {
                    int i11 = this.f8586n0;
                    if (i11 == 1) {
                        ng(charSequence, 3);
                    } else if (i11 == 0) {
                        mg(this.I0, this.J0, w9() != null ? w9().f8603e : null);
                    }
                }
            } else if (charSequence.length() <= 0) {
            } else {
                if (this.I0.equals(charSequence)) {
                    ng(charSequence, 2);
                } else {
                    ng(charSequence, 4);
                }
            }
        } else if (charSequence.length() <= 0) {
        } else {
            if (this.f8586n0 != 0 || w9() == null || !charSequence.equals(w9().f8604f)) {
                ng(charSequence, 1);
            } else {
                fg(R.string.PasswordMatchesOldOne, true);
            }
        }
    }

    public final void Uf() {
        TdApi.PasswordState passwordState;
        String charSequence = this.f8590r0.getText().toString();
        switch (this.f8586n0) {
            case 0:
            case 1:
                Tf();
                return;
            case 2:
            case 10:
            case 11:
                if (!charSequence.isEmpty()) {
                    pg(charSequence);
                    return;
                }
                return;
            case 3:
            case 6:
                String D = ce.c0.D(charSequence);
                if (D.length() >= 6) {
                    Xf(D);
                    return;
                }
                return;
            case 4:
                if (ce.c0.P(charSequence) && w9() != null) {
                    if (!charSequence.equals(w9().f8603e) || !((passwordState = this.f8587o0) == null || passwordState.recoveryEmailAddressCodeInfo == null)) {
                        kg(charSequence);
                        return;
                    } else {
                        fg(R.string.EmailMatchesOldOne, true);
                        return;
                    }
                } else {
                    return;
                }
            case 5:
                if (!charSequence.isEmpty()) {
                    Sf(charSequence);
                    return;
                }
                return;
            case 7:
            case 8:
            case 9:
                ag(ce.c0.D(charSequence));
                return;
            default:
                return;
        }
    }

    public final void Vf() {
        switch (this.f8586n0) {
            case 1:
                og();
                return;
            case 2:
            case 5:
            case 10:
            case 11:
                Zf();
                return;
            case 3:
            case 6:
                Hc(R.string.RestorePasswordNoEmailTitle, R.string.RestoreEmailTroubleText);
                return;
            case 4:
            default:
                return;
            case 7:
            case 8:
            case 9:
                Yf();
                return;
        }
    }

    public final void Wf(TdApi.PasswordState passwordState, String str) {
        this.f8587o0 = passwordState;
        int i10 = this.f8586n0;
        if (i10 == 1) {
            v4<?> pd2 = pd(R.id.controller_2faSettings);
            if (pd2 instanceof qp) {
                ((qp) pd2).nh(passwordState, str);
                ac(pd2);
                return;
            }
        } else if (i10 == 0 || i10 == 4) {
            v4<?> p92 = p9(R.id.controller_2faSettings);
            if (p92 instanceof qp) {
                ((qp) p92).nh(passwordState, str);
                Zb();
                return;
            }
        }
        v4<?> p93 = p9(R.id.controller_privacySettings);
        if (p93 instanceof ww) {
            ww wwVar = (ww) p93;
            wwVar.Fh(passwordState);
            qp qpVar = new qp(this.f24493a, this.f24495b);
            qpVar.ih(new qp.b(wwVar, null, null));
            ac(qpVar);
        }
    }

    @Override
    public CharSequence X9() {
        switch (this.f8586n0) {
            case 0:
                return w.i1(R.string.ChangePassword);
            case 1:
                return w.i1(R.string.YourPassword);
            case 2:
            case 11:
                return w.i1(R.string.EnterPassword);
            case 3:
            case 6:
                return w.i1(R.string.PasswordRecovery);
            case 4:
                return w.i1(R.string.ChangeRecoveryEmail);
            case 5:
                return w.i1(R.string.TwoStepVerification);
            case 7:
            case 8:
                return w.i1(R.string.ConfirmationCode);
            case 9:
                return w.i1(R.string.CancelAccountReset);
            case 10:
                return w.i1(R.string.TransferOwnershipPasswordAlert);
            default:
                return null;
        }
    }

    public final void Xf(String str) {
        if (!this.G0) {
            if (this.f24495b.F4().g3().j()) {
                j0.v0();
                return;
            }
            hg(true);
            if (this.f8586n0 == 6) {
                Md(true);
            }
            this.f24495b.v4().o(this.f8586n0 == 6 ? new TdApi.RecoverAuthenticationPassword(str, null, null) : new TdApi.RecoverPassword(str, null, null), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    lj.this.zf(object);
                }
            });
        }
    }

    public final void Yf() {
        TdApi.Function function;
        if (tf() && !this.D0) {
            if (this.f24495b.F4().g3().j()) {
                j0.v0();
                return;
            }
            ig(true);
            int i10 = this.f8586n0;
            if (i10 == 8) {
                function = new TdApi.ResendChangePhoneNumberCode();
            } else if (i10 != 9) {
                function = new TdApi.ResendAuthenticationCode();
            } else {
                function = new TdApi.ResendPhoneNumberConfirmationCode();
            }
            this.f24495b.v4().o(function, new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    lj.this.Bf(object);
                }
            });
        }
    }

    @Override
    public void Z6(final TdApi.AuthorizationState authorizationState) {
        wd(new Runnable() {
            @Override
            public final void run() {
                lj.this.wf(authorizationState);
            }
        });
    }

    @Override
    public void Z8() {
        super.Z8();
        this.f24495b.O9().T(this);
        c0 c0Var = this.f8591s0;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    public final void Zf() {
        TdApi.AuthorizationState authorizationState;
        TdApi.PasswordState passwordState = this.f8587o0;
        if ((passwordState != null && !passwordState.hasRecoveryEmailAddress) || (((authorizationState = this.f8588p0) != null && authorizationState.getConstructor() == 187548796 && !((TdApi.AuthorizationStateWaitPassword) this.f8588p0).hasRecoveryEmailAddress) || (this.f8587o0 == null && this.f8588p0 == null))) {
            Hc(R.string.RestorePasswordNoEmailTitle, R.string.SinceNotProvided);
        } else if (!this.D0) {
            if (this.f24495b.F4().g3().j()) {
                j0.v0();
                return;
            }
            ig(true);
            if (this.f8586n0 != 5) {
                this.f24495b.v4().o(new TdApi.RequestPasswordRecovery(), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        lj.this.Ff(object);
                    }
                });
            } else if (this.f8588p0.getConstructor() != 187548796) {
                Log.e("Can't proceed, authState: %s", this.f8588p0);
            } else if (!((TdApi.AuthorizationStateWaitPassword) this.f8588p0).hasRecoveryEmailAddress) {
                Hc(R.string.RestorePasswordNoEmailTitle, R.string.SinceNotProvided);
            } else {
                Md(true);
                this.f24495b.v4().o(new TdApi.RequestAuthenticationPasswordRecovery(), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        lj.this.Df(object);
                    }
                });
            }
        }
    }

    public final void ag(String str) {
        TdApi.Function function;
        if (!this.G0) {
            if (this.f24495b.F4().g3().j()) {
                j0.v0();
                return;
            }
            hg(true);
            if (this.f8586n0 == 7) {
                Md(true);
            }
            int i10 = this.f8586n0;
            if (i10 == 8) {
                function = new TdApi.CheckChangePhoneNumberCode(str);
            } else if (i10 != 9) {
                function = new TdApi.CheckAuthenticationCode(str);
            } else {
                function = new TdApi.CheckPhoneNumberConfirmationCode(str);
            }
            this.f24495b.v4().o(function, new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    lj.this.If(object);
                }
            });
        }
    }

    public void bg(a aVar) {
        super.Ad(aVar);
        this.f8586n0 = aVar.f8599a;
        this.f8587o0 = aVar.f8600b;
        this.f8588p0 = aVar.f8601c;
        this.f8589q0 = aVar.f8602d;
    }

    public final void cg(int i10) {
        dg(w.i1(i10));
    }

    @Override
    public boolean db() {
        int i10 = this.f8586n0;
        return i10 == 5 || i10 == 6 || i10 == 7;
    }

    public final void dg(String str) {
        if (str == null || str.isEmpty()) {
            nf(0.0f);
            if (this.f8592t0.getAlpha() == 0.0f) {
                this.f8592t0.setText("");
                return;
            }
            return;
        }
        this.f8592t0.setText(str);
        nf(1.0f);
    }

    public final void eg(String str, boolean z10) {
        this.f8594v0.setText(str);
        this.f8594v0.setTextColor(z10 ? j.V0() : j.R0());
        qd(this.f8594v0);
        z8(this.f8594v0, z10 ? R.id.theme_color_textNegative : R.id.theme_color_textLight);
        this.f8590r0.setInErrorState(z10);
    }

    public final void fg(int i10, boolean z10) {
        gg(w.i1(i10), z10);
    }

    public final void gg(String str, boolean z10) {
        if (str == null || str.isEmpty()) {
            of(0.0f);
            if (this.f8594v0.getAlpha() == 0.0f) {
                eg("", false);
            }
        } else if (this.f8594v0.getAlpha() == 0.0f) {
            eg(str, z10);
            of(1.0f);
        } else {
            this.A0 = str;
            this.B0 = z10;
            of(0.0f);
        }
    }

    public final void hg(boolean z10) {
        if (this.G0 != z10) {
            this.G0 = z10;
            this.f8591s0.setInProgress(z10);
        }
    }

    public final void ig(boolean z10) {
        if (this.D0 != z10) {
            this.D0 = z10;
            qf(z10 ? 1.0f : 0.0f);
        }
    }

    public final void jg(boolean z10) {
        if (this.K0 != z10) {
            this.K0 = z10;
            pf(z10 ? 1.0f : 0.0f);
        }
    }

    public final void kg(String str) {
        if (!this.G0) {
            if (this.f24495b.F4().g3().j()) {
                j0.v0();
                return;
            }
            hg(true);
            final String str2 = w9() != null ? w9().f8604f : null;
            this.f24495b.v4().o(new TdApi.SetRecoveryEmailAddress(str2, str), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    lj.this.Kf(str2, object);
                }
            });
        }
    }

    public final void lg(float f10) {
        if (this.f8596x0 != f10) {
            this.f8596x0 = f10;
            this.f8591s0.setAlpha(Math.min(1.0f, f10));
            float f11 = (f10 * 0.4f) + 0.6f;
            this.f8591s0.setScaleX(f11);
            this.f8591s0.setScaleY(f11);
        }
    }

    public final void mg(final String str, String str2, String str3) {
        if (!this.G0) {
            if (this.f24495b.F4().g3().j()) {
                j0.v0();
                return;
            }
            hg(true);
            this.f24495b.v4().o(new TdApi.SetPassword((this.f8586n0 == 1 || w9() == null) ? null : w9().f8604f, str, str2, this.f8586n0 != 0, str3), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    lj.this.Mf(str, object);
                }
            });
        }
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        n2 n2Var;
        if (i10 == 0) {
            lg(f10);
        } else if (i10 == 1) {
            DecelerateInterpolator decelerateInterpolator = b.f7287b;
            this.f8592t0.setAlpha((decelerateInterpolator.getInterpolation((f10 * 0.5f) + 0.5f) / decelerateInterpolator.getInterpolation(0.5f)) * f10);
        } else if (i10 == 2) {
            DecelerateInterpolator decelerateInterpolator2 = b.f7287b;
            this.f8594v0.setAlpha((decelerateInterpolator2.getInterpolation((f10 * 0.5f) + 0.5f) / decelerateInterpolator2.getInterpolation(0.5f)) * f10);
        } else if (i10 == 3 && (n2Var = this.f8593u0) != null) {
            n2Var.setAlpha(f10);
        }
    }

    public final void nf(float f10) {
        if (this.C0 == null) {
            this.C0 = new k(1, this, b.f7290e, 180L, this.f8592t0.getAlpha());
        }
        this.C0.i(f10);
    }

    public final void ng(String str, int i10) {
        if (this.H0 != i10) {
            if (i10 != 4) {
                this.H0 = i10;
            } else {
                this.H0 = 0;
            }
            Runnable runnable = null;
            if (i10 != 0) {
                if (i10 == 1) {
                    dg(null);
                    gg(null, false);
                    this.I0 = str;
                    this.f8595w0 = true;
                    pf(0.0f);
                    this.f8590r0.c2(R.string.ReEnterAPassword, true, null);
                    return;
                } else if (i10 == 2) {
                    dg(null);
                    String z10 = ce.c0.z(this.I0);
                    this.J0 = z10;
                    this.f8590r0.a2(R.string.CreateAHintForYourPassword, z10, false, null);
                    if (this.f8586n0 == 0) {
                        this.f8591s0.g(R.drawable.baseline_check_24);
                        return;
                    }
                    return;
                } else if (i10 == 3) {
                    this.f8595w0 = true;
                    pf(0.0f);
                    this.f8590r0.c2(R.string.YourEmail, false, new Runnable() {
                        @Override
                        public final void run() {
                            lj.this.Of();
                        }
                    });
                    return;
                } else if (i10 != 4) {
                    return;
                }
            }
            dg(null);
            this.f8595w0 = true;
            pf(0.0f);
            y1 y1Var = this.f8590r0;
            if (i10 == 4) {
                runnable = new Runnable() {
                    @Override
                    public final void run() {
                        lj.this.Nf();
                    }
                };
            }
            y1Var.c2(R.string.EnterAPassword, true, runnable);
        }
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        if (i10 != 1) {
            if (i10 == 2 && f10 == 0.0f) {
                String str = this.A0;
                if (str == null || str.isEmpty()) {
                    eg("", false);
                    return;
                }
                eg(this.A0, this.B0);
                this.A0 = null;
                this.B0 = false;
                this.f8598z0.i(1.0f);
            }
        } else if (f10 == 0.0f) {
            this.f8592t0.setText("");
        }
    }

    @Override
    public View oc(Context context) {
        CharSequence charSequence;
        String str;
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        g.i(frameLayoutFix, R.id.theme_color_filling, this);
        int A = ((a0.A() - d1.a3(false)) - a0.i(175.0f)) / 2;
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(-1, -2, 51);
        r12.topMargin = A;
        r12.leftMargin = a0.i(16.0f);
        r12.rightMargin = a0.i(16.0f);
        y1 y1Var = new y1(context);
        this.f8590r0 = y1Var;
        y1Var.getEditText().setImeOptions(268435462);
        this.f8590r0.G1(this);
        this.f8590r0.setDoneListener(this);
        this.f8590r0.setEmptyListener(this);
        this.f8590r0.setTextListener(this);
        switch (this.f8586n0) {
            case 3:
            case 6:
            case 7:
            case 8:
            case 9:
                this.f8590r0.getEditText().setInputType(2);
                break;
            case 4:
                this.f8590r0.getEditText().setInputType(33);
                break;
            case 5:
            default:
                this.f8590r0.getEditText().setInputType(524417);
                this.f8590r0.getEditText().setIsPassword(true);
                break;
        }
        switch (this.f8586n0) {
            case 0:
                this.f8590r0.setHint(R.string.EnterANewPassword);
                break;
            case 1:
                this.f8590r0.setHint(R.string.EnterAPassword);
                break;
            case 2:
            case 10:
            case 11:
                TdApi.PasswordState passwordState = this.f8587o0;
                if (passwordState != null && (str = passwordState.passwordHint) != null && !str.isEmpty()) {
                    this.f8590r0.setHint(w.j1(R.string.Hint, this.f8587o0.passwordHint));
                    break;
                } else {
                    this.f8590r0.setHint(R.string.EnterAPassword);
                    break;
                }
            case 3:
            case 6:
                this.f8590r0.setHint(R.string.EnterCode);
                break;
            case 4:
                this.f8590r0.setHint(R.string.EnterANewEmail);
                break;
            case 5:
                TdApi.AuthorizationState authorizationState = this.f8588p0;
                if (authorizationState != null && authorizationState.getConstructor() == 187548796 && !i.i(((TdApi.AuthorizationStateWaitPassword) this.f8588p0).passwordHint)) {
                    this.f8590r0.setHint(w.j1(R.string.Hint, ((TdApi.AuthorizationStateWaitPassword) this.f8588p0).passwordHint));
                    break;
                } else {
                    this.f8590r0.setHint(R.string.EnterAPassword);
                    break;
                }
            case 7:
            case 8:
            case 9:
                this.f8590r0.setHint(R.string.login_Code);
                break;
        }
        this.f8590r0.setLayoutParams(r12);
        frameLayoutFix.addView(this.f8590r0);
        int i10 = a0.i(4.0f);
        int i11 = i10 * 2;
        FrameLayout.LayoutParams r13 = FrameLayoutFix.r1(a0.i(56.0f) + i11, a0.i(56.0f) + i11, 85);
        int i12 = a0.i(16.0f) - i10;
        r13.bottomMargin = i12;
        r13.rightMargin = i12;
        c0 c0Var = new c0(context);
        this.f8591s0 = c0Var;
        t8(c0Var);
        this.f8591s0.setId(R.id.btn_done);
        this.f8591s0.d(sf(), 56.0f, 4.0f, R.id.theme_color_circleButtonRegular, R.id.theme_color_circleButtonRegularIcon);
        this.f8591s0.setOnClickListener(this);
        this.f8591s0.setLayoutParams(r13);
        this.f8591s0.setAlpha(0.0f);
        this.f8591s0.setScaleX(0.6f);
        this.f8591s0.setScaleY(0.6f);
        frameLayoutFix.addView(this.f8591s0);
        b2 b2Var = new b2(context);
        this.f8592t0 = b2Var;
        b2Var.setId(R.id.btn_forgotPassword);
        this.f8592t0.setTextColor(j.L(R.id.theme_color_textNeutral));
        z8(this.f8592t0, R.id.theme_color_textNeutral);
        this.f8592t0.setTextSize(1, 15.0f);
        this.f8592t0.setPadding(a0.i(16.0f), a0.i(16.0f), a0.i(16.0f), a0.i(16.0f));
        this.f8592t0.setOnClickListener(this);
        this.f8592t0.setAlpha(0.0f);
        p0.T(this.f8592t0);
        int i13 = this.f8586n0;
        switch (i13) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 10:
            case 11:
                if (i13 != 11 && i13 != 2 && i13 != 5 && i13 != 10) {
                    if (i13 == 3 || i13 == 6) {
                        String str2 = w9() != null ? ((a) w9()).f8603e : null;
                        if (i.i(str2)) {
                            charSequence = w.i1(R.string.RecoveryCodeSentEmailUnknown);
                            this.f8592t0.setText(w.i1(R.string.RestoreEmailTroubleUnknown));
                            break;
                        } else {
                            CharSequence m12 = w.m1(R.string.RecoveryCodeSent, str2);
                            this.f8592t0.setText(w.j1(R.string.HavingTroubleAccessing, str2));
                            charSequence = m12;
                            break;
                        }
                    }
                    charSequence = null;
                    break;
                } else {
                    this.f8592t0.setText(w.i1(R.string.ForgotPassword));
                    charSequence = w.i1(this.f8586n0 == 10 ? R.string.TransferOwnershipPasswordAlertHint : R.string.LoginPasswordText);
                    break;
                }
            case 4:
                charSequence = w.i1(R.string.YourEmailInfo);
                break;
            case 7:
            case 8:
            case 9:
                if (tf()) {
                    this.f8592t0.setText(w.i1(R.string.DidNotGetTheCode));
                }
                charSequence = rf(((TdApi.AuthorizationStateWaitCode) this.f8588p0).codeInfo.type, this.f8589q0);
                break;
            default:
                charSequence = null;
                break;
        }
        int i14 = this.f8586n0;
        if (i14 == 10 || i14 == 2 || i14 == 11 || i14 == 5 || i14 == 7 || i14 == 8 || i14 == 9) {
            RelativeLayout relativeLayout = new RelativeLayout(context);
            relativeLayout.setLayoutParams(FrameLayoutFix.r1(-2, -2, 83));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            this.f8592t0.setPadding(a0.i(16.0f), a0.i(15.0f), a0.i(12.0f), a0.i(16.0f));
            this.f8592t0.setLayoutParams(layoutParams);
            relativeLayout.addView(this.f8592t0);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a0.i(16.0f), a0.i(16.0f));
            layoutParams2.addRule(15);
            layoutParams2.addRule(1, R.id.btn_forgotPassword);
            n2 n2Var = new n2(context);
            this.f8593u0 = n2Var;
            n2Var.i(0.0f);
            this.f8593u0.setProgressColor(j.L(R.id.theme_color_textNeutral));
            z8(this.f8593u0, R.id.theme_color_textNeutral);
            this.f8593u0.setAlpha(0.0f);
            this.f8593u0.setLayoutParams(layoutParams2);
            relativeLayout.addView(this.f8593u0);
            frameLayoutFix.addView(relativeLayout);
        } else {
            this.f8592t0.setLayoutParams(FrameLayoutFix.r1(-2, -2, 83));
            frameLayoutFix.addView(this.f8592t0);
        }
        FrameLayout.LayoutParams q12 = FrameLayoutFix.q1(-2, -2);
        int i15 = a0.i(16.0f);
        q12.rightMargin = i15;
        q12.leftMargin = i15;
        q12.topMargin = A + a0.i(60.0f) + a0.i(14.0f);
        b2 b2Var2 = new b2(context);
        this.f8594v0 = b2Var2;
        b2Var2.setTextSize(1, 15.0f);
        this.f8594v0.setTextColor(j.R0());
        z8(this.f8594v0, R.id.theme_color_textLight);
        this.f8594v0.setTypeface(o.k());
        this.f8594v0.setLayoutParams(q12);
        if (charSequence != null) {
            this.f8594v0.setText(charSequence);
        } else {
            this.f8594v0.setAlpha(0.0f);
        }
        frameLayoutFix.addView(this.f8594v0);
        Ed(this.f8590r0.getEditText());
        int i16 = this.f8586n0;
        if (i16 == 3 || i16 == 5 || i16 == 6 || i16 == 7) {
            this.f24495b.O9().k(this);
        }
        return frameLayoutFix;
    }

    public final void of(float f10) {
        if (this.f8598z0 == null) {
            this.f8598z0 = new k(2, this, b.f7290e, 180L, this.f8594v0.getAlpha());
        }
        this.f8598z0.i(f10);
    }

    public final void og() {
        Ic(R.string.Warning, R.string.YourEmailSkipWarningText, new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i10) {
                lj.this.Pf(dialogInterface, i10);
            }
        });
    }

    @Override
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.btn_done) {
            Uf();
        } else if (id2 == R.id.btn_forgotPassword) {
            Vf();
        }
    }

    @Override
    public void p4(y1 y1Var, CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        int i10 = this.f8586n0;
        boolean z10 = true;
        if (i10 == 1 && this.H0 == 3) {
            jg(ce.c0.P(charSequence2));
        } else if (i10 == 3 || i10 == 6) {
            if (ce.c0.D(charSequence2).length() < 6) {
                z10 = false;
            }
            jg(z10);
        } else if ((i10 == 7 || i10 == 8 || i10 == 9) && ce.c0.E(charSequence2) >= t2.U0(this.f8588p0)) {
            Uf();
        } else {
            int i11 = this.f8586n0;
            if ((i11 == 1 || i11 == 0) && this.H0 == 2) {
                this.J0 = charSequence2;
            }
        }
    }

    public final void pf(float f10) {
        if (this.f8597y0 == null) {
            this.f8597y0 = new k(0, this, b.f7286a, 300L, this.f8596x0);
        }
        this.f8597y0.i(f10);
    }

    public final void pg(final String str) {
        if (!this.G0) {
            if (this.f24495b.F4().g3().j()) {
                j0.v0();
                return;
            }
            hg(true);
            this.f24495b.v4().o(new TdApi.GetRecoveryEmailAddress(str), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    lj.this.Rf(str, object);
                }
            });
        }
    }

    public final void qf(float f10) {
        if (this.E0 == null) {
            this.E0 = new k(3, this, b.f7287b, 180L);
        }
        this.E0.i(f10);
    }

    public final void qg() {
        TdApi.AuthorizationState authorizationState = this.f8588p0;
        if (authorizationState != null && authorizationState.getConstructor() == 52643073) {
            this.f8594v0.setText(rf(((TdApi.AuthorizationStateWaitCode) this.f8588p0).codeInfo.type, this.f8589q0));
            if (!tf()) {
                dg(null);
            }
        }
    }

    public final CharSequence rf(TdApi.AuthenticationCodeType authenticationCodeType, String str) {
        if (this.f8586n0 == 9) {
            return ce.c0.Y(w.j1(R.string.CancelAccountResetInfo, str));
        }
        this.f8590r0.setHint(w.i1(R.string.login_Code));
        switch (authenticationCodeType.getConstructor()) {
            case TdApi.AuthenticationCodeTypeMissedCall.CONSTRUCTOR:
                TdApi.AuthenticationCodeTypeMissedCall authenticationCodeTypeMissedCall = (TdApi.AuthenticationCodeTypeMissedCall) authenticationCodeType;
                this.f8590r0.setHint(w.q2(R.string.login_LastDigits, authenticationCodeTypeMissedCall.length));
                return ce.c0.Z(w.j1(R.string.format_doubleLines, w.j1(R.string.SentMissedCall, ce.c0.w(authenticationCodeTypeMissedCall.phoneNumberPrefix)), w.o2(R.string.SentMissedCallXDigits, authenticationCodeTypeMissedCall.length)), R.id.theme_color_textLight);
            case TdApi.AuthenticationCodeTypeSms.CONSTRUCTOR:
                return ce.c0.Z(w.j1(R.string.SentSmsCode, str), R.id.theme_color_textLight);
            case TdApi.AuthenticationCodeTypeFlashCall.CONSTRUCTOR:
                return ce.c0.Z(w.j1(R.string.SentCallOnly, str), R.id.theme_color_textLight);
            case TdApi.AuthenticationCodeTypeCall.CONSTRUCTOR:
                return ce.c0.Z(w.j1(R.string.SentCallCode, str), R.id.theme_color_textLight);
            case TdApi.AuthenticationCodeTypeTelegramMessage.CONSTRUCTOR:
                return ce.c0.Z(w.i1(R.string.SentAppCode), R.id.theme_color_textLight);
            default:
                return ce.c0.Z(w.i1(R.string.SentSmsCode), R.id.theme_color_textLight);
        }
    }

    @Override
    public void sc() {
        super.sc();
        if (!this.F0) {
            int i10 = this.f8586n0;
            if (i10 == 2) {
                c9(R.id.controller_2faSettings);
            } else if (i10 == 5) {
                c9(R.id.controller_code);
            } else if (i10 == 7) {
                c9(R.id.controller_name);
            } else if (i10 == 8) {
                c9(R.id.controller_phone);
            }
            if (j0.J()) {
                int i11 = this.f8586n0;
                if (i11 == 5) {
                    this.f8590r0.setText("objection");
                    Uf();
                } else if (i11 == 7 || i11 == 8) {
                    this.f8590r0.setText(this.f24495b.Za());
                    Uf();
                }
            }
            this.F0 = true;
        }
        TextView textView = this.f8592t0;
        if (textView != null && textView.getAlpha() == 0.0f && this.f8592t0.getText().length() > 0) {
            this.f8592t0.postDelayed(new Runnable() {
                @Override
                public final void run() {
                    lj.this.xf();
                }
            }, 100L);
        }
    }

    public final int sf() {
        int i10 = this.f8586n0;
        if (i10 == 4) {
            return R.drawable.baseline_check_24;
        }
        switch (i10) {
            case 8:
            case 9:
            case 10:
            case 11:
                return R.drawable.baseline_check_24;
            default:
                return R.drawable.baseline_arrow_forward_24;
        }
    }

    @Override
    public boolean t6(y1 y1Var) {
        Uf();
        return true;
    }

    public final boolean tf() {
        TdApi.AuthorizationState authorizationState = this.f8588p0;
        return (authorizationState == null || authorizationState.getConstructor() != 52643073 || ((TdApi.AuthorizationStateWaitCode) this.f8588p0).codeInfo.nextType == null) ? false : true;
    }

    public static class a {
        public final int f8599a;
        public final TdApi.PasswordState f8600b;
        public final TdApi.AuthorizationState f8601c;
        public String f8602d;
        public String f8603e;
        public String f8604f;
        public int f8605g;
        public kb.j<String> f8606h;

        public a(int i10, TdApi.PasswordState passwordState) {
            this.f8599a = i10;
            this.f8600b = passwordState;
            this.f8601c = null;
        }

        public a a(int i10) {
            this.f8605g = i10;
            return this;
        }

        public a b(String str) {
            this.f8603e = str;
            return this;
        }

        public a c(String str) {
            this.f8604f = str;
            return this;
        }

        public a d(kb.j<String> jVar) {
            this.f8606h = jVar;
            return this;
        }

        public a(int i10, TdApi.AuthorizationStateWaitPassword authorizationStateWaitPassword) {
            this.f8599a = i10;
            this.f8600b = null;
            this.f8601c = authorizationStateWaitPassword;
        }

        public a(int i10, TdApi.AuthorizationStateWaitCode authorizationStateWaitCode, String str) {
            this.f8599a = i10;
            this.f8600b = null;
            this.f8601c = authorizationStateWaitCode;
            this.f8602d = str;
        }

        public a(int i10, TdApi.AuthenticationCodeInfo authenticationCodeInfo, String str) {
            this.f8599a = i10;
            this.f8600b = null;
            this.f8601c = new TdApi.AuthorizationStateWaitCode(authenticationCodeInfo);
            this.f8602d = str;
        }
    }
}
