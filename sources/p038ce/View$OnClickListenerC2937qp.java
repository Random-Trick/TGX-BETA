package p038ce;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import be.C1363c0;
import be.C1379j0;
import gd.C4779t2;
import java.util.ArrayList;
import me.C6897h1;
import me.View$OnFocusChangeListenerC7069y1;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import p038ce.AbstractC2420g6;
import p038ce.C2546iq;
import p038ce.View$OnClickListenerC2665lj;
import p038ce.View$OnClickListenerC3222vw;
import p082fd.C4403w;
import p108hb.C5070i;
import p111he.AbstractC5117h0;
import p111he.AbstractC5135p;
import p111he.C5115g0;
import p139jb.AbstractC5917i;
import p350yd.C10930q6;
import td.AbstractC9323v4;

public class View$OnClickListenerC2937qp extends AbstractC3204vo<C2939b> implements View$OnClickListenerC3222vw.AbstractC3225c, View.OnClickListener, Client.AbstractC7865g, AbstractC5135p, C2546iq.AbstractC2551e {
    public TdApi.PasswordState f9769D0;
    public String f9770E0;
    public C2546iq f9771F0;
    public String f9772G0;
    public boolean f9773H0;
    public C2964ra f9774I0;
    public boolean f9775J0;
    public C6897h1 f9776K0;

    public class C2938a extends C2546iq {
        public C2938a(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo32965o2(C2964ra raVar, TextView textView) {
            textView.setText(View$OnClickListenerC2937qp.this.f9769D0.recoveryEmailAddressCodeInfo != null ? View$OnClickListenerC2937qp.this.f9769D0.recoveryEmailAddressCodeInfo.emailAddressPattern : "");
        }

        @Override
        public void mo30692v1(C2964ra raVar, ViewGroup viewGroup, View$OnFocusChangeListenerC7069y1 y1Var) {
            y1Var.getEditText().setInputType(2);
            y1Var.getEditText().setImeOptions(268435462);
            y1Var.setAlwaysActive(raVar.m32879A() == 56);
        }
    }

    public View$OnClickListenerC2937qp(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m32986Tg(final TdApi.EmailAddressAuthenticationCodeInfo emailAddressAuthenticationCodeInfo, final TdApi.Object object) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2937qp.this.m32985Ug(object, emailAddressAuthenticationCodeInfo);
            }
        });
    }

    public void m32985Ug(TdApi.Object object, TdApi.EmailAddressAuthenticationCodeInfo emailAddressAuthenticationCodeInfo) {
        if (!m9347Sa()) {
            int constructor = object.getConstructor();
            if (constructor != -2001619202) {
                if (constructor == -1679978726) {
                    C1379j0.m37305t0(object);
                    this.f9769D0.recoveryEmailAddressCodeInfo = emailAddressAuthenticationCodeInfo;
                    if (!(m9139w9() == null || m9139w9().f9778a == null)) {
                        m9139w9().f9778a.m31113Fh(this.f9769D0);
                    }
                    m32987Sg();
                }
            } else if (!((TdApi.PasswordState) object).hasRecoveryEmailAddress) {
                this.f9770E0 = null;
            }
        }
    }

    public void m32984Vg(TdApi.Object object) {
        if (object instanceof TdApi.PasswordState) {
            m32966nh((TdApi.PasswordState) object, this.f9772G0);
        }
    }

    public void m32983Wg(final TdApi.Object object) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2937qp.this.m32984Vg(object);
            }
        });
    }

    public void m32982Xg(boolean z) {
        if (z) {
            this.f30170b.m2270r4().m14783o(new TdApi.SetRecoveryEmailAddress(this.f9772G0, this.f9770E0), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC2937qp.this.m32983Wg(object);
                }
            });
        }
    }

    public boolean m32981Yg(View view, int i) {
        if (i != R.id.btn_done) {
            return true;
        }
        mo9397La();
        m32988Rg();
        return true;
    }

    public void m32980Zg() {
        if (!m9347Sa()) {
            C1379j0.m37295y0(R.string.RecoveryCodeResent, 0);
        }
    }

    public void m32979ah(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -2001619202) {
            this.f30170b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2937qp.this.m32980Zg();
                }
            });
        } else if (constructor == -1679978726) {
            C1379j0.m37305t0(object);
        }
    }

    public boolean m32978bh(View view, int i) {
        if (i != R.id.btn_done) {
            return true;
        }
        TdApi.PasswordState passwordState = this.f9769D0;
        passwordState.hasRecoveryEmailAddress = false;
        passwordState.recoveryEmailAddressCodeInfo = null;
        m32970jh(false);
        m32987Sg();
        this.f30170b.m2270r4().m14783o(new TdApi.SetPassword(this.f9772G0, null, null, true, null), this);
        return true;
    }

    public void m32976dh(final TdApi.Object object) {
        if (object.getConstructor() == -2001619202) {
            m9135wd(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2937qp.this.m32977ch(object);
                }
            });
        } else {
            C1379j0.m37305t0(object);
        }
    }

    public void m32975eh(TdApi.Object object) {
        if (!m9347Sa()) {
            int constructor = object.getConstructor();
            if (constructor == -2001619202) {
                TdApi.PasswordState passwordState = (TdApi.PasswordState) object;
                if (!passwordState.hasPassword) {
                    this.f9772G0 = null;
                }
                if (!passwordState.hasRecoveryEmailAddress) {
                    this.f9770E0 = null;
                }
            } else if (constructor == -1679978726) {
                C1379j0.m37305t0(object);
                m32970jh(true);
                this.f9772G0 = null;
                m32987Sg();
            }
        }
    }

    public void m32974fh(TdApi.PasswordState passwordState) {
        if (!m9347Sa()) {
            m32969kh(false, passwordState.recoveryEmailAddressCodeInfo != null);
            if (passwordState.recoveryEmailAddressCodeInfo == null) {
                mo9397La();
                m32966nh(passwordState, this.f9772G0);
            }
        }
    }

    public void m32973gh() {
        if (!m9347Sa()) {
            m32969kh(false, true);
        }
    }

    public void m32972hh(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -2001619202) {
            final TdApi.PasswordState passwordState = (TdApi.PasswordState) object;
            this.f30170b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2937qp.this.m32974fh(passwordState);
                }
            });
        } else if (constructor == -1679978726) {
            C1379j0.m37305t0(object);
            this.f30170b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2937qp.this.m32973gh();
                }
            });
        }
    }

    @Override
    public boolean mo23840B5(View view) {
        return m32967mh(null);
    }

    @Override
    public void mo30700K(int i, C2964ra raVar, View$OnFocusChangeListenerC7069y1 y1Var, String str) {
        if (i == R.id.login_code) {
            if (this.f9769D0.recoveryEmailAddressCodeInfo == null || C1363c0.m37472E(str) < C4779t2.m25589V0(this.f9769D0.recoveryEmailAddressCodeInfo)) {
                y1Var.setInErrorState(false);
            } else {
                m32967mh(y1Var);
            }
        }
    }

    @Override
    public int mo407R9() {
        return R.id.controller_2faSettings;
    }

    public final void m32988Rg() {
        TdApi.PasswordState passwordState = this.f9769D0;
        final TdApi.EmailAddressAuthenticationCodeInfo emailAddressAuthenticationCodeInfo = passwordState.recoveryEmailAddressCodeInfo;
        passwordState.recoveryEmailAddressCodeInfo = null;
        if (!(m9139w9() == null || m9139w9().f9778a == null)) {
            m9139w9().f9778a.m31113Fh(this.f9769D0);
        }
        m32987Sg();
        this.f30170b.m2270r4().m14783o(new TdApi.SetRecoveryEmailAddress(null, null), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC2937qp.this.m32986Tg(emailAddressAuthenticationCodeInfo, object);
            }
        });
    }

    public final void m32987Sg() {
        TdApi.PasswordState passwordState = this.f9769D0;
        boolean z = true;
        if (!passwordState.hasPassword) {
            if (passwordState.recoveryEmailAddressCodeInfo != null) {
                C2546iq iqVar = this.f9771F0;
                C2964ra P = new C2964ra(95, R.id.login_code, 0, R.string.EnterCode).m32864P(new AbstractC2420g6.C2421a(6, this));
                this.f9774I0 = P;
                iqVar.m34116y2(new C2964ra[]{P, new C2964ra(3), new C2964ra(9, 0, 0, C4403w.m27855m1(R.string.CheckYourVerificationEmail2, this.f9769D0.recoveryEmailAddressCodeInfo.emailAddressPattern), false), new C2964ra(2), new C2964ra(4, R.id.btn_resendRecoveryEmail, 0, R.string.ResendRecoveryEmailCode), new C2964ra(11), new C2964ra(4, R.id.btn_abort2FA, 0, R.string.AbortPassword).m32846d0(R.id.theme_color_textNegative), new C2964ra(3)}, false);
                this.f9771F0.m34253A2(this, true);
                m32968lh(true);
                return;
            }
            this.f9771F0.m34116y2(new C2964ra[]{new C2964ra(19, 0, R.drawable.baseline_security_96, R.string.SetAdditionalPasswordInfo), new C2964ra(2), new C2964ra(20, R.id.btn_setPassword, 0, R.string.SetAdditionalPassword), new C2964ra(3)}, false);
            m32968lh(false);
        } else if (this.f9772G0 != null) {
            ArrayList arrayList = new ArrayList(10);
            arrayList.add(new C2964ra(4, R.id.btn_changePassword, 0, R.string.ChangePassword));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(4, R.id.btn_disablePassword, 0, R.string.DisablePassword));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(4, R.id.btn_setRecoveryEmail, 0, this.f9769D0.hasRecoveryEmailAddress ? R.string.ChangeRecoveryEmail : R.string.SetRecoveryEmail));
            arrayList.add(new C2964ra(3));
            arrayList.add(new C2964ra(9, 0, 0, R.string.EnabledPasswordText));
            if (this.f9769D0.recoveryEmailAddressCodeInfo != null) {
                arrayList.add(new C2964ra(2));
                C2964ra P2 = new C2964ra(56, R.id.login_code, 0, R.string.EnterCode).m32864P(new AbstractC2420g6.C2421a(6, this));
                this.f9774I0 = P2;
                arrayList.add(P2);
                arrayList.add(new C2964ra(3));
                TdApi.PasswordState passwordState2 = this.f9769D0;
                arrayList.add(new C2964ra(9, 0, 0, C4403w.m27855m1(passwordState2.hasRecoveryEmailAddress ? R.string.CheckYourVerificationEmail3 : R.string.CheckYourVerificationEmail2, passwordState2.recoveryEmailAddressCodeInfo.emailAddressPattern), false));
                arrayList.add(new C2964ra(2));
                arrayList.add(new C2964ra(4, R.id.btn_resendRecoveryEmail, 0, R.string.ResendRecoveryEmailCode));
                arrayList.add(new C2964ra(11));
                arrayList.add(new C2964ra(4, R.id.btn_abortRecoveryEmail, 0, this.f9769D0.hasRecoveryEmailAddress ? R.string.AbortRecoveryEmailChange : R.string.AbortRecoveryEmail).m32846d0(R.id.theme_color_textNegative));
                arrayList.add(new C2964ra(3));
                this.f9771F0.m34253A2(this, false);
            }
            this.f9771F0.m34119x2(arrayList, false);
            if (this.f9769D0.recoveryEmailAddressCodeInfo == null) {
                z = false;
            }
            m32968lh(z);
        } else {
            View$OnClickListenerC2665lj ljVar = new View$OnClickListenerC2665lj(this.f30168a, this.f30170b);
            ljVar.m33966bg(new View$OnClickListenerC2665lj.C2666a(2, this.f9769D0));
            m9291ac(ljVar);
        }
    }

    @Override
    public CharSequence mo9313X9() {
        return C4403w.m27871i1(R.string.TwoStepVerification);
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        if (m9139w9() != null && m9139w9().f9778a != null) {
            m9139w9().f9778a.m31065zh(null);
        }
    }

    @Override
    public boolean mo9270dc() {
        return this.f9769D0 == null;
    }

    @Override
    public void m32977ch(TdApi.PasswordState passwordState) {
        if (!m9347Sa()) {
            this.f9769D0 = passwordState;
            m32987Sg();
        }
    }

    public void m32971ih(C2939b bVar) {
        View$OnClickListenerC3222vw vwVar;
        super.m9476Ad(bVar);
        TdApi.PasswordState passwordState = bVar.f9779b;
        this.f9769D0 = passwordState;
        this.f9772G0 = bVar.f9781d;
        this.f9770E0 = bVar.f9780c;
        if (passwordState == null && (vwVar = bVar.f9778a) != null) {
            vwVar.m31065zh(this);
        }
    }

    public final void m32970jh(boolean z) {
        this.f9769D0.hasPassword = z;
        if (m9139w9() != null && m9139w9().f9778a != null) {
            m9139w9().f9778a.m31113Fh(this.f9769D0);
        }
    }

    public final void m32969kh(boolean z, boolean z2) {
        int N0;
        View C;
        if (this.f9775J0 != z) {
            this.f9775J0 = z;
            if (!z && z2 && (N0 = this.f9771F0.m34227N0(R.id.login_code)) != -1 && (C = m31305kg().getLayoutManager().mo39265C(N0)) != null && C.getId() == R.id.login_code) {
                ((View$OnFocusChangeListenerC7069y1) ((ViewGroup) C).getChildAt(0)).setInErrorState(true);
            }
        }
    }

    public final void m32968lh(boolean z) {
        if (z) {
            if (this.f9776K0 == null) {
                int max = Math.max(0, this.f9771F0.m34227N0(R.id.login_code));
                CustomRecyclerView kg = m31305kg();
                C6897h1 m = new C6897h1(m31305kg(), this).m18531m(max, max + 1);
                this.f9776K0 = m;
                kg.m39437g(m);
            }
        } else if (this.f9776K0 != null) {
            m31305kg().m39438f1(this.f9776K0);
            this.f9776K0 = null;
        }
    }

    public final boolean m32967mh(View$OnFocusChangeListenerC7069y1 y1Var) {
        int N0;
        View C;
        if (this.f9775J0) {
            return true;
        }
        if (!(this.f9774I0 == null || this.f9769D0.recoveryEmailAddressCodeInfo == null)) {
            if (y1Var == null && (N0 = this.f9771F0.m34227N0(R.id.login_code)) != -1 && (C = m31305kg().getLayoutManager().mo39265C(N0)) != null && C.getId() == R.id.login_code) {
                y1Var = (View$OnFocusChangeListenerC7069y1) ((ViewGroup) C).getChildAt(0);
            }
            String D = C1363c0.m37473D(this.f9774I0.m32824x());
            boolean z = !C5070i.m24062i(D) && D.length() >= C4779t2.m25589V0(this.f9769D0.recoveryEmailAddressCodeInfo);
            if (y1Var != null) {
                y1Var.setInErrorState(!z);
            }
            if (z) {
                m32969kh(true, false);
                this.f30170b.m2270r4().m14783o(new TdApi.CheckRecoveryEmailAddressCode(D), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        View$OnClickListenerC2937qp.this.m32972hh(object);
                    }
                });
            }
        }
        return false;
    }

    public void m32966nh(TdApi.PasswordState passwordState, String str) {
        this.f9769D0 = passwordState;
        this.f9772G0 = str;
        if (!passwordState.hasRecoveryEmailAddress) {
            this.f9770E0 = null;
        }
        if (!(m9139w9() == null || m9139w9().f9778a == null)) {
            m9139w9().f9778a.m31113Fh(passwordState);
        }
        this.f9773H0 = false;
        m32987Sg();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_abort2FA:
                mo9397La();
                m9261ee(C4403w.m27871i1(R.string.AbortPasswordConfirm), new int[]{R.id.btn_done, R.id.btn_cancel}, new String[]{C4403w.m27871i1(R.string.AbortPassword), C4403w.m27871i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_remove_circle_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view2, int i) {
                        boolean Yg;
                        Yg = View$OnClickListenerC2937qp.this.m32981Yg(view2, i);
                        return Yg;
                    }

                    @Override
                    public boolean mo492Q() {
                        return C5115g0.m23936a(this);
                    }

                    @Override
                    public Object mo491b2(int i) {
                        return C5115g0.m23935b(this, i);
                    }
                });
                return;
            case R.id.btn_abortRecoveryEmail:
                m9172re(C4403w.m27871i1(R.string.AbortRecoveryEmailConfirm), new AbstractC5917i() {
                    @Override
                    public final void mo1322a(boolean z) {
                        View$OnClickListenerC2937qp.this.m32982Xg(z);
                    }
                });
                return;
            case R.id.btn_changePassword:
                View$OnClickListenerC2665lj ljVar = new View$OnClickListenerC2665lj(this.f30168a, this.f30170b);
                ljVar.m33966bg(new View$OnClickListenerC2665lj.C2666a(0, this.f9769D0).m33925b(this.f9770E0).m33924c(this.f9772G0));
                m9291ac(ljVar);
                return;
            case R.id.btn_disablePassword:
                m9261ee(C1363c0.m37428l(this, C4403w.m27871i1(this.f9769D0.hasPassportData ? R.string.TurnPasswordOffQuestion2 : R.string.TurnPasswordOffQuestion), null), new int[]{R.id.btn_done, R.id.btn_cancel}, new String[]{C4403w.m27871i1(R.string.DisablePassword), C4403w.m27871i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_remove_circle_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view2, int i) {
                        boolean bh;
                        bh = View$OnClickListenerC2937qp.this.m32978bh(view2, i);
                        return bh;
                    }

                    @Override
                    public boolean mo492Q() {
                        return C5115g0.m23936a(this);
                    }

                    @Override
                    public Object mo491b2(int i) {
                        return C5115g0.m23935b(this, i);
                    }
                });
                return;
            case R.id.btn_resendRecoveryEmail:
                this.f30170b.m2270r4().m14783o(new TdApi.ResendRecoveryEmailAddressCode(), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        View$OnClickListenerC2937qp.this.m32979ah(object);
                    }
                });
                return;
            case R.id.btn_setPassword:
                View$OnClickListenerC2665lj ljVar2 = new View$OnClickListenerC2665lj(this.f30168a, this.f30170b);
                ljVar2.m33966bg(new View$OnClickListenerC2665lj.C2666a(1, this.f9769D0));
                m9291ac(ljVar2);
                return;
            case R.id.btn_setRecoveryEmail:
                View$OnClickListenerC2665lj ljVar3 = new View$OnClickListenerC2665lj(this.f30168a, this.f30170b);
                ljVar3.m33966bg(new View$OnClickListenerC2665lj.C2666a(4, this.f9769D0).m33925b(this.f9770E0).m33924c(this.f9772G0));
                m9291ac(ljVar3);
                return;
            default:
                return;
        }
    }

    @Override
    public void mo30635rg(Context context, CustomRecyclerView customRecyclerView) {
        C2938a aVar = new C2938a(this);
        this.f9771F0 = aVar;
        aVar.m34214S2(this);
        this.f9771F0.m34253A2(this, true);
        if (this.f9769D0 != null) {
            m32987Sg();
        } else if (m9131x9().f9778a == null) {
            this.f30170b.m2270r4().m14783o(new TdApi.GetPasswordState(), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC2937qp.this.m32976dh(object);
                }
            });
        }
        customRecyclerView.setAdapter(this.f9771F0);
    }

    @Override
    public void mo9166sc() {
        super.mo9166sc();
        if (!this.f9773H0 && this.f30161T != null) {
            this.f9773H0 = true;
            m9280c9(R.id.controller_password);
            m9280c9(R.id.controller_passwordRecovery);
            m9280c9(R.id.controller_2faSettings);
        }
    }

    @Override
    public void mo255t2(final TdApi.Object object) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2937qp.this.m32975eh(object);
            }
        });
    }

    public static class C2939b {
        public final View$OnClickListenerC3222vw f9778a;
        public final TdApi.PasswordState f9779b;
        public final String f9780c;
        public final String f9781d;

        public C2939b(View$OnClickListenerC3222vw vwVar, String str, String str2) {
            this.f9778a = vwVar;
            this.f9781d = str;
            this.f9779b = vwVar != null ? vwVar.m31088dh() : null;
            this.f9780c = str2;
        }

        public C2939b(TdApi.PasswordState passwordState) {
            this.f9778a = null;
            this.f9781d = null;
            this.f9780c = null;
            this.f9779b = passwordState;
        }
    }
}
