package de;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ce.c0;
import ce.j0;
import de.g6;
import de.iq;
import de.lj;
import de.ww;
import gd.w;
import hd.t2;
import ib.i;
import ie.g0;
import ie.h0;
import ie.p;
import java.util.ArrayList;
import ne.h1;
import ne.y1;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import ud.v4;
import zd.o6;

public class qp extends vo<b> implements ww.c, View.OnClickListener, Client.g, p, iq.e {
    public TdApi.PasswordState D0;
    public String E0;
    public iq F0;
    public String G0;
    public boolean H0;
    public ra I0;
    public boolean J0;
    public h1 K0;

    public class a extends iq {
        public a(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void j2(ra raVar, TextView textView) {
            textView.setText(qp.this.D0.recoveryEmailAddressCodeInfo != null ? qp.this.D0.recoveryEmailAddressCodeInfo.emailAddressPattern : "");
        }

        @Override
        public void r1(ra raVar, ViewGroup viewGroup, y1 y1Var) {
            y1Var.getEditText().setInputType(2);
            y1Var.getEditText().setImeOptions(268435462);
            y1Var.setAlwaysActive(raVar.A() == 56);
        }
    }

    public qp(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void Tg(final TdApi.EmailAddressAuthenticationCodeInfo emailAddressAuthenticationCodeInfo, final TdApi.Object object) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                qp.this.Ug(object, emailAddressAuthenticationCodeInfo);
            }
        });
    }

    public void Ug(TdApi.Object object, TdApi.EmailAddressAuthenticationCodeInfo emailAddressAuthenticationCodeInfo) {
        if (!Sa()) {
            int constructor = object.getConstructor();
            if (constructor != -2001619202) {
                if (constructor == -1679978726) {
                    j0.t0(object);
                    this.D0.recoveryEmailAddressCodeInfo = emailAddressAuthenticationCodeInfo;
                    if (!(w9() == null || w9().f9180a == null)) {
                        w9().f9180a.Fh(this.D0);
                    }
                    Sg();
                }
            } else if (!((TdApi.PasswordState) object).hasRecoveryEmailAddress) {
                this.E0 = null;
            }
        }
    }

    public void Vg(TdApi.Object object) {
        if (object instanceof TdApi.PasswordState) {
            nh((TdApi.PasswordState) object, this.G0);
        }
    }

    public void Wg(final TdApi.Object object) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                qp.this.Vg(object);
            }
        });
    }

    public void Xg(boolean z10) {
        if (z10) {
            this.f24495b.v4().o(new TdApi.SetRecoveryEmailAddress(this.G0, this.E0), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    qp.this.Wg(object);
                }
            });
        }
    }

    public boolean Yg(View view, int i10) {
        if (i10 != R.id.btn_done) {
            return true;
        }
        La();
        Rg();
        return true;
    }

    public void Zg() {
        if (!Sa()) {
            j0.y0(R.string.RecoveryCodeResent, 0);
        }
    }

    public void ah(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -2001619202) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    qp.this.Zg();
                }
            });
        } else if (constructor == -1679978726) {
            j0.t0(object);
        }
    }

    public boolean bh(View view, int i10) {
        if (i10 != R.id.btn_done) {
            return true;
        }
        TdApi.PasswordState passwordState = this.D0;
        passwordState.hasRecoveryEmailAddress = false;
        passwordState.recoveryEmailAddressCodeInfo = null;
        jh(false);
        Sg();
        this.f24495b.v4().o(new TdApi.SetPassword(this.G0, null, null, true, null), this);
        return true;
    }

    public void dh(final TdApi.Object object) {
        if (object.getConstructor() == -2001619202) {
            wd(new Runnable() {
                @Override
                public final void run() {
                    qp.this.ch(object);
                }
            });
        } else {
            j0.t0(object);
        }
    }

    public void eh(TdApi.Object object) {
        if (!Sa()) {
            int constructor = object.getConstructor();
            if (constructor == -2001619202) {
                TdApi.PasswordState passwordState = (TdApi.PasswordState) object;
                if (!passwordState.hasPassword) {
                    this.G0 = null;
                }
                if (!passwordState.hasRecoveryEmailAddress) {
                    this.E0 = null;
                }
            } else if (constructor == -1679978726) {
                j0.t0(object);
                jh(true);
                this.G0 = null;
                Sg();
            }
        }
    }

    public void fh(TdApi.PasswordState passwordState) {
        if (!Sa()) {
            kh(false, passwordState.recoveryEmailAddressCodeInfo != null);
            if (passwordState.recoveryEmailAddressCodeInfo == null) {
                La();
                nh(passwordState, this.G0);
            }
        }
    }

    public void gh() {
        if (!Sa()) {
            kh(false, true);
        }
    }

    public void hh(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -2001619202) {
            final TdApi.PasswordState passwordState = (TdApi.PasswordState) object;
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    qp.this.fh(passwordState);
                }
            });
        } else if (constructor == -1679978726) {
            j0.t0(object);
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    qp.this.gh();
                }
            });
        }
    }

    @Override
    public void N5(int i10, ra raVar, y1 y1Var, String str) {
        if (i10 == R.id.login_code) {
            if (this.D0.recoveryEmailAddressCodeInfo == null || c0.E(str) < t2.V0(this.D0.recoveryEmailAddressCodeInfo)) {
                y1Var.setInErrorState(false);
            } else {
                mh(y1Var);
            }
        }
    }

    @Override
    public int R9() {
        return R.id.controller_2faSettings;
    }

    public final void Rg() {
        TdApi.PasswordState passwordState = this.D0;
        final TdApi.EmailAddressAuthenticationCodeInfo emailAddressAuthenticationCodeInfo = passwordState.recoveryEmailAddressCodeInfo;
        passwordState.recoveryEmailAddressCodeInfo = null;
        if (!(w9() == null || w9().f9180a == null)) {
            w9().f9180a.Fh(this.D0);
        }
        Sg();
        this.f24495b.v4().o(new TdApi.SetRecoveryEmailAddress(null, null), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                qp.this.Tg(emailAddressAuthenticationCodeInfo, object);
            }
        });
    }

    public final void Sg() {
        TdApi.PasswordState passwordState = this.D0;
        boolean z10 = true;
        if (!passwordState.hasPassword) {
            if (passwordState.recoveryEmailAddressCodeInfo != null) {
                iq iqVar = this.F0;
                ra P = new ra(95, R.id.login_code, 0, R.string.EnterCode).P(new g6.a(6, this));
                this.I0 = P;
                iqVar.t2(new ra[]{P, new ra(3), new ra(9, 0, 0, w.m1(R.string.CheckYourVerificationEmail2, this.D0.recoveryEmailAddressCodeInfo.emailAddressPattern), false), new ra(2), new ra(4, R.id.btn_resendRecoveryEmail, 0, R.string.ResendRecoveryEmailCode), new ra(11), new ra(4, R.id.btn_abort2FA, 0, R.string.AbortPassword).d0(R.id.theme_color_textNegative), new ra(3)}, false);
                this.F0.v2(this, true);
                lh(true);
                return;
            }
            this.F0.t2(new ra[]{new ra(19, 0, R.drawable.baseline_security_96, R.string.SetAdditionalPasswordInfo), new ra(2), new ra(20, R.id.btn_setPassword, 0, R.string.SetAdditionalPassword), new ra(3)}, false);
            lh(false);
        } else if (this.G0 != null) {
            ArrayList arrayList = new ArrayList(10);
            arrayList.add(new ra(4, R.id.btn_changePassword, 0, R.string.ChangePassword));
            arrayList.add(new ra(11));
            arrayList.add(new ra(4, R.id.btn_disablePassword, 0, R.string.DisablePassword));
            arrayList.add(new ra(11));
            arrayList.add(new ra(4, R.id.btn_setRecoveryEmail, 0, this.D0.hasRecoveryEmailAddress ? R.string.ChangeRecoveryEmail : R.string.SetRecoveryEmail));
            arrayList.add(new ra(3));
            arrayList.add(new ra(9, 0, 0, R.string.EnabledPasswordText));
            if (this.D0.recoveryEmailAddressCodeInfo != null) {
                arrayList.add(new ra(2));
                ra P2 = new ra(56, R.id.login_code, 0, R.string.EnterCode).P(new g6.a(6, this));
                this.I0 = P2;
                arrayList.add(P2);
                arrayList.add(new ra(3));
                TdApi.PasswordState passwordState2 = this.D0;
                arrayList.add(new ra(9, 0, 0, w.m1(passwordState2.hasRecoveryEmailAddress ? R.string.CheckYourVerificationEmail3 : R.string.CheckYourVerificationEmail2, passwordState2.recoveryEmailAddressCodeInfo.emailAddressPattern), false));
                arrayList.add(new ra(2));
                arrayList.add(new ra(4, R.id.btn_resendRecoveryEmail, 0, R.string.ResendRecoveryEmailCode));
                arrayList.add(new ra(11));
                arrayList.add(new ra(4, R.id.btn_abortRecoveryEmail, 0, this.D0.hasRecoveryEmailAddress ? R.string.AbortRecoveryEmailChange : R.string.AbortRecoveryEmail).d0(R.id.theme_color_textNegative));
                arrayList.add(new ra(3));
                this.F0.v2(this, false);
            }
            this.F0.s2(arrayList, false);
            if (this.D0.recoveryEmailAddressCodeInfo == null) {
                z10 = false;
            }
            lh(z10);
        } else {
            lj ljVar = new lj(this.f24493a, this.f24495b);
            ljVar.bg(new lj.a(2, this.D0));
            ac(ljVar);
        }
    }

    @Override
    public CharSequence X9() {
        return w.i1(R.string.TwoStepVerification);
    }

    @Override
    public void Z8() {
        super.Z8();
        if (w9() != null && w9().f9180a != null) {
            w9().f9180a.zh(null);
        }
    }

    @Override
    public void ch(TdApi.PasswordState passwordState) {
        if (!Sa()) {
            this.D0 = passwordState;
            Sg();
        }
    }

    @Override
    public boolean dc() {
        return this.D0 == null;
    }

    public void ih(b bVar) {
        ww wwVar;
        super.Ad(bVar);
        TdApi.PasswordState passwordState = bVar.f9181b;
        this.D0 = passwordState;
        this.G0 = bVar.f9183d;
        this.E0 = bVar.f9182c;
        if (passwordState == null && (wwVar = bVar.f9180a) != null) {
            wwVar.zh(this);
        }
    }

    public final void jh(boolean z10) {
        this.D0.hasPassword = z10;
        if (w9() != null && w9().f9180a != null) {
            w9().f9180a.Fh(this.D0);
        }
    }

    public final void kh(boolean z10, boolean z11) {
        int L0;
        View C;
        if (this.J0 != z10) {
            this.J0 = z10;
            if (!z10 && z11 && (L0 = this.F0.L0(R.id.login_code)) != -1 && (C = kg().getLayoutManager().C(L0)) != null && C.getId() == R.id.login_code) {
                ((y1) ((ViewGroup) C).getChildAt(0)).setInErrorState(true);
            }
        }
    }

    public final void lh(boolean z10) {
        if (z10) {
            if (this.K0 == null) {
                int max = Math.max(0, this.F0.L0(R.id.login_code));
                CustomRecyclerView kg = kg();
                h1 m10 = new h1(kg(), this).m(max, max + 1);
                this.K0 = m10;
                kg.g(m10);
            }
        } else if (this.K0 != null) {
            kg().e1(this.K0);
            this.K0 = null;
        }
    }

    public final boolean mh(y1 y1Var) {
        int L0;
        View C;
        if (this.J0) {
            return true;
        }
        if (!(this.I0 == null || this.D0.recoveryEmailAddressCodeInfo == null)) {
            if (y1Var == null && (L0 = this.F0.L0(R.id.login_code)) != -1 && (C = kg().getLayoutManager().C(L0)) != null && C.getId() == R.id.login_code) {
                y1Var = (y1) ((ViewGroup) C).getChildAt(0);
            }
            String D = c0.D(this.I0.x());
            boolean z10 = !i.i(D) && D.length() >= t2.V0(this.D0.recoveryEmailAddressCodeInfo);
            if (y1Var != null) {
                y1Var.setInErrorState(!z10);
            }
            if (z10) {
                kh(true, false);
                this.f24495b.v4().o(new TdApi.CheckRecoveryEmailAddressCode(D), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        qp.this.hh(object);
                    }
                });
            }
        }
        return false;
    }

    public void nh(TdApi.PasswordState passwordState, String str) {
        this.D0 = passwordState;
        this.G0 = str;
        if (!passwordState.hasRecoveryEmailAddress) {
            this.E0 = null;
        }
        if (!(w9() == null || w9().f9180a == null)) {
            w9().f9180a.Fh(passwordState);
        }
        this.H0 = false;
        Sg();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_abort2FA:
                La();
                ee(w.i1(R.string.AbortPasswordConfirm), new int[]{R.id.btn_done, R.id.btn_cancel}, new String[]{w.i1(R.string.AbortPassword), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_remove_circle_24, R.drawable.baseline_cancel_24}, new h0() {
                    @Override
                    public boolean P() {
                        return g0.a(this);
                    }

                    @Override
                    public Object a2(int i10) {
                        return g0.b(this, i10);
                    }

                    @Override
                    public final boolean r3(View view2, int i10) {
                        boolean Yg;
                        Yg = qp.this.Yg(view2, i10);
                        return Yg;
                    }
                });
                return;
            case R.id.btn_abortRecoveryEmail:
                re(w.i1(R.string.AbortRecoveryEmailConfirm), new kb.i() {
                    @Override
                    public final void a(boolean z10) {
                        qp.this.Xg(z10);
                    }
                });
                return;
            case R.id.btn_changePassword:
                lj ljVar = new lj(this.f24493a, this.f24495b);
                ljVar.bg(new lj.a(0, this.D0).b(this.E0).c(this.G0));
                ac(ljVar);
                return;
            case R.id.btn_disablePassword:
                ee(c0.l(this, w.i1(this.D0.hasPassportData ? R.string.TurnPasswordOffQuestion2 : R.string.TurnPasswordOffQuestion), null), new int[]{R.id.btn_done, R.id.btn_cancel}, new String[]{w.i1(R.string.DisablePassword), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_remove_circle_24, R.drawable.baseline_cancel_24}, new h0() {
                    @Override
                    public boolean P() {
                        return g0.a(this);
                    }

                    @Override
                    public Object a2(int i10) {
                        return g0.b(this, i10);
                    }

                    @Override
                    public final boolean r3(View view2, int i10) {
                        boolean bh;
                        bh = qp.this.bh(view2, i10);
                        return bh;
                    }
                });
                return;
            case R.id.btn_resendRecoveryEmail:
                this.f24495b.v4().o(new TdApi.ResendRecoveryEmailAddressCode(), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        qp.this.ah(object);
                    }
                });
                return;
            case R.id.btn_setPassword:
                lj ljVar2 = new lj(this.f24493a, this.f24495b);
                ljVar2.bg(new lj.a(1, this.D0));
                ac(ljVar2);
                return;
            case R.id.btn_setRecoveryEmail:
                lj ljVar3 = new lj(this.f24493a, this.f24495b);
                ljVar3.bg(new lj.a(4, this.D0).b(this.E0).c(this.G0));
                ac(ljVar3);
                return;
            default:
                return;
        }
    }

    @Override
    public void r2(final TdApi.Object object) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                qp.this.eh(object);
            }
        });
    }

    @Override
    public void rg(Context context, CustomRecyclerView customRecyclerView) {
        a aVar = new a(this);
        this.F0 = aVar;
        aVar.O2(this);
        this.F0.v2(this, true);
        if (this.D0 != null) {
            Sg();
        } else if (x9().f9180a == null) {
            this.f24495b.v4().o(new TdApi.GetPasswordState(), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    qp.this.dh(object);
                }
            });
        }
        customRecyclerView.setAdapter(this.F0);
    }

    @Override
    public void sc() {
        super.sc();
        if (!this.H0 && this.T != null) {
            this.H0 = true;
            c9(R.id.controller_password);
            c9(R.id.controller_passwordRecovery);
            c9(R.id.controller_2faSettings);
        }
    }

    @Override
    public boolean v5(View view) {
        return mh(null);
    }

    public static class b {
        public final ww f9180a;
        public final TdApi.PasswordState f9181b;
        public final String f9182c;
        public final String f9183d;

        public b(ww wwVar, String str, String str2) {
            this.f9180a = wwVar;
            this.f9183d = str;
            this.f9181b = wwVar != null ? wwVar.dh() : null;
            this.f9182c = str2;
        }

        public b(TdApi.PasswordState passwordState) {
            this.f9180a = null;
            this.f9183d = null;
            this.f9182c = null;
            this.f9181b = passwordState;
        }
    }
}
