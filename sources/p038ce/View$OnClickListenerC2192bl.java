package p038ce;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import gd.C4601c3;
import gd.C4779t2;
import java.util.ArrayList;
import me.C6981o;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import p038ce.View$OnClickListenerC2192bl;
import p038ce.View$OnClickListenerC3222vw;
import p082fd.C4403w;
import p108hb.C5062b;
import p124ib.C5322e;
import p143k0.C6038h;
import p350yd.AbstractC10747j0;
import p350yd.AbstractC10883o1;
import p350yd.C10721i0;
import p350yd.C10862n1;
import p350yd.C10930q6;
import p350yd.C11059v7;
import p350yd.C11133y7;
import tc.C9137c;
import td.AbstractC9323v4;

public class View$OnClickListenerC2192bl extends AbstractC3204vo<C2195c> implements AbstractC10883o1, View.OnClickListener, C11059v7.AbstractC11068i, AbstractC10747j0 {
    public C6038h<C10862n1> f7666D0;
    public C6038h<C10862n1> f7667E0;
    public C2546iq f7668F0;
    public int f7669G0;
    public C2964ra f7670H0;
    public C2964ra f7671I0;
    public C2964ra f7672J0;
    public C2964ra f7673K0;
    public boolean f7674L0;
    public C5322e f7675M0;

    public class C2193a implements Client.AbstractC7865g {
        public final long f7676a;

        public C2193a(long j) {
            this.f7676a = j;
        }

        public static boolean m35396d(C2964ra raVar) {
            return raVar.m32838j() == R.id.btn_privacyRule;
        }

        public void m35395e() {
            if (!View$OnClickListenerC2192bl.this.m9347Sa()) {
                View$OnClickListenerC2192bl.this.f7668F0.m34192a3(C2135al.f7525a);
            }
        }

        public void m35394f() {
            if (!View$OnClickListenerC2192bl.this.m9347Sa()) {
                View$OnClickListenerC2192bl.this.f7674L0 = false;
                if (View$OnClickListenerC2192bl.this.f7669G0 == 0) {
                    View$OnClickListenerC2192bl.this.m9204n9();
                }
            }
        }

        @Override
        public void mo255t2(TdApi.Object object) {
            long[] jArr = object.getConstructor() == 1809654812 ? ((TdApi.Chats) object).chatIds : null;
            if (jArr == null || jArr.length <= 0) {
                View$OnClickListenerC2192bl.this.f30170b.m2485dd().post(new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC2192bl.C2193a.this.m35394f();
                    }
                });
                return;
            }
            View$OnClickListenerC2192bl.this.f7675M0.m23275b(jArr);
            if (!View$OnClickListenerC2192bl.this.m9347Sa()) {
                View$OnClickListenerC2192bl.this.f30170b.m2485dd().post(new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC2192bl.C2193a.this.m35395e();
                    }
                });
                View$OnClickListenerC2192bl.this.f30170b.m2270r4().m14783o(new TdApi.GetGroupsInCommon(this.f7676a, jArr[jArr.length - 1], 100), this);
            }
        }
    }

    public class C2194b extends C2546iq {
        public final boolean f7678m0;
        public final long f7679n0;
        public final long f7680o0;

        public C2194b(AbstractC9323v4 v4Var, boolean z, long j, long j2) {
            super(v4Var);
            this.f7678m0 = z;
            this.f7679n0 = j;
            this.f7680o0 = j2;
        }

        @Override
        public void mo394V2(C2964ra raVar, C9137c cVar, boolean z) {
            TdApi.UserPrivacySettingRule userPrivacySettingRule;
            int j = raVar.m32838j();
            int i = 0;
            if (j == R.id.btn_newContact) {
                cVar.setName(raVar.m32827u());
                cVar.setTextColorId(raVar.m32823y(R.id.theme_color_text));
                cVar.setIcon(raVar.m32839i());
                if (!this.f7678m0) {
                    if (View$OnClickListenerC2192bl.this.f30170b.m2480e2().m1761A2(this.f7679n0)) {
                        i = R.id.theme_color_iconNegative;
                    }
                    cVar.setIconColorId(i);
                }
            } else if (j == R.id.btn_privacyRule) {
                TdApi.UserPrivacySetting userPrivacySetting = (TdApi.UserPrivacySetting) raVar.m32847d();
                long[] jArr = null;
                C10862n1 n1Var = View$OnClickListenerC2192bl.this.f7667E0 != null ? (C10862n1) View$OnClickListenerC2192bl.this.f7667E0.m21472e(userPrivacySetting.getConstructor()) : null;
                if (n1Var == null) {
                    n1Var = (C10862n1) View$OnClickListenerC2192bl.this.f7666D0.m21472e(userPrivacySetting.getConstructor());
                }
                if (n1Var == null) {
                    cVar.m10207Y1(false, z);
                    cVar.setData(R.string.LoadingInformation);
                    cVar.setDataColorId(0);
                    cVar.getToggler().m10185r(true, z);
                    return;
                }
                boolean z2 = !this.f7678m0 && View$OnClickListenerC2192bl.this.f30170b.m2480e2().m1761A2(this.f7679n0);
                if (this.f7678m0) {
                    userPrivacySettingRule = n1Var.m2991d(this.f7680o0, false);
                } else {
                    userPrivacySettingRule = n1Var.m2990e(this.f7679n0, z2, View$OnClickListenerC2192bl.this.f7675M0 != null ? View$OnClickListenerC2192bl.this.f7675M0.m23270g() : null);
                }
                cVar.m10207Y1(true, z);
                boolean q = C10862n1.m2978q(userPrivacySettingRule);
                cVar.getToggler().m10185r(q, z);
                if (C10862n1.m2977r(userPrivacySettingRule, !this.f7678m0)) {
                    cVar.setDataColorId(0);
                    TdApi.UserPrivacySettingRule c = n1Var.m2992c(z2);
                    if (C10862n1.m2978q(c) == C10862n1.m2978q(userPrivacySettingRule)) {
                        userPrivacySettingRule = c;
                    }
                    if (userPrivacySettingRule != null) {
                        int constructor = userPrivacySettingRule.getConstructor();
                        if (constructor == -2048749863) {
                            long[] jArr2 = ((TdApi.UserPrivacySettingRuleAllowChatMembers) userPrivacySettingRule).chatIds;
                            if (View$OnClickListenerC2192bl.this.f7675M0 != null) {
                                jArr = View$OnClickListenerC2192bl.this.f7675M0.m23270g();
                            }
                            jArr = C5062b.m24152u(jArr2, jArr);
                        } else if (constructor == 392530897) {
                            long[] jArr3 = ((TdApi.UserPrivacySettingRuleRestrictChatMembers) userPrivacySettingRule).chatIds;
                            if (View$OnClickListenerC2192bl.this.f7675M0 != null) {
                                jArr = View$OnClickListenerC2192bl.this.f7675M0.m23270g();
                            }
                            jArr = C5062b.m24152u(jArr3, jArr);
                        }
                    }
                    if (jArr == null || jArr.length <= 0) {
                        if (!this.f7678m0 || C10862n1.m2978q(userPrivacySettingRule) || !C10862n1.m2978q(n1Var.m2991d(this.f7680o0, true))) {
                            cVar.setData((userPrivacySettingRule == null || !(userPrivacySettingRule.getConstructor() == -1892733680 || userPrivacySettingRule.getConstructor() == 1008389378)) ? R.string.PrivacyDefault : R.string.PrivacyDefaultContacts);
                            return;
                        }
                        switch (userPrivacySetting.getConstructor()) {
                            case TdApi.UserPrivacySettingAllowFindingByPhoneNumber.CONSTRUCTOR:
                                return;
                            case TdApi.UserPrivacySettingAllowCalls.CONSTRUCTOR:
                                cVar.setData(R.string.PrivacyCallsExceptionContacts);
                                return;
                            case TdApi.UserPrivacySettingShowPhoneNumber.CONSTRUCTOR:
                                cVar.setData(R.string.PrivacyShowNumberExceptionContacts);
                                return;
                            case TdApi.UserPrivacySettingAllowPeerToPeerCalls.CONSTRUCTOR:
                                cVar.setData(R.string.PrivacyP2PExceptionContacts);
                                return;
                            case TdApi.UserPrivacySettingShowLinkInForwardedMessages.CONSTRUCTOR:
                                cVar.setData(R.string.PrivacyForwardLinkExceptionContacts);
                                return;
                            case TdApi.UserPrivacySettingAllowChatInvites.CONSTRUCTOR:
                                cVar.setData(R.string.PrivacyAddToGroupsExceptionContacts);
                                return;
                            case TdApi.UserPrivacySettingShowProfilePhoto.CONSTRUCTOR:
                                cVar.setData(R.string.PrivacyPhotoExceptionContacts);
                                return;
                            case TdApi.UserPrivacySettingShowStatus.CONSTRUCTOR:
                                cVar.setData(R.string.PrivacyLastSeenExceptionContacts);
                                return;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    } else if (jArr.length == 1) {
                        cVar.setData(C4403w.m27855m1(R.string.PrivacyDefaultChat, View$OnClickListenerC2192bl.this.f30170b.m2691Q3(jArr[0])));
                    } else {
                        cVar.setData(C4403w.m27838q2(R.string.PrivacyDefaultXChats, jArr.length));
                    }
                } else {
                    cVar.setDataColorId(R.id.theme_color_textNeutral);
                    switch (userPrivacySetting.getConstructor()) {
                        case TdApi.UserPrivacySettingAllowFindingByPhoneNumber.CONSTRUCTOR:
                            return;
                        case TdApi.UserPrivacySettingAllowCalls.CONSTRUCTOR:
                            cVar.setData(q ? R.string.PrivacyCallsExceptionOn : R.string.PrivacyCallsExceptionOff);
                            return;
                        case TdApi.UserPrivacySettingShowPhoneNumber.CONSTRUCTOR:
                            cVar.setData(q ? R.string.PrivacyShowNumberExceptionOn : R.string.PrivacyShowNumberExceptionOff);
                            return;
                        case TdApi.UserPrivacySettingAllowPeerToPeerCalls.CONSTRUCTOR:
                            cVar.setData(q ? R.string.PrivacyP2PExceptionOn : R.string.PrivacyP2PExceptionOff);
                            return;
                        case TdApi.UserPrivacySettingShowLinkInForwardedMessages.CONSTRUCTOR:
                            cVar.setData(q ? R.string.PrivacyForwardLinkExceptionOn : R.string.PrivacyForwardLinkExceptionOff);
                            return;
                        case TdApi.UserPrivacySettingAllowChatInvites.CONSTRUCTOR:
                            cVar.setData(q ? R.string.PrivacyAddToGroupsExceptionOn : R.string.PrivacyAddToGroupsExceptionOff);
                            return;
                        case TdApi.UserPrivacySettingShowProfilePhoto.CONSTRUCTOR:
                            cVar.setData(q ? R.string.PrivacyPhotoExceptionOn : R.string.PrivacyPhotoExceptionOff);
                            return;
                        case TdApi.UserPrivacySettingShowStatus.CONSTRUCTOR:
                            cVar.setData(q ? R.string.PrivacyLastSeenExceptionOn : R.string.PrivacyLastSeenExceptionOff);
                            return;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }
        }

        @Override
        public void mo9531c2(C2964ra raVar, int i, C6981o oVar) {
            oVar.setChat((C4601c3) raVar.m32847d());
            oVar.setEnabled(false);
        }
    }

    public static class C2195c {
        public final long f7682a;

        public C2195c(long j) {
            this.f7682a = j;
        }
    }

    public View$OnClickListenerC2192bl(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m35411Zg(TdApi.Object object, TdApi.UserPrivacySetting userPrivacySetting) {
        if (!m9347Sa()) {
            if (object.getConstructor() == 322477541) {
                this.f7666D0.m21467j(userPrivacySetting.getConstructor(), C10862n1.m2969z((TdApi.UserPrivacySettingRules) object));
                C2546iq iqVar = this.f7668F0;
                if (iqVar != null) {
                    iqVar.m34130t3(userPrivacySetting.getConstructor());
                }
            }
            int i = this.f7669G0 - 1;
            this.f7669G0 = i;
            if (i == 0 && !this.f7674L0) {
                m9204n9();
            }
        }
    }

    public void m35410ah(final TdApi.UserPrivacySetting userPrivacySetting, final TdApi.Object object) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2192bl.this.m35411Zg(object, userPrivacySetting);
            }
        });
    }

    public static boolean m35409bh(C2964ra raVar) {
        return raVar.m32838j() == R.id.text_title;
    }

    public void m35408ch() {
        C2964ra raVar = this.f7671I0;
        if (raVar != null) {
            raVar.m32856X(m35412Yg(0));
        }
        C2964ra raVar2 = this.f7672J0;
        if (raVar2 != null) {
            raVar2.m32856X(m35412Yg(1));
        }
        C2964ra raVar3 = this.f7673K0;
        if (raVar3 != null) {
            raVar3.m32856X(m35412Yg(2));
        }
        this.f7668F0.m34192a3(C3200vk.f10690a);
    }

    public void m35407dh(TdApi.UserPrivacySetting userPrivacySetting, C10862n1 n1Var) {
        int g;
        if (!m9347Sa() && (g = this.f7667E0.m21470g(userPrivacySetting.getConstructor())) >= 0 && this.f7667E0.m21463o(g) == n1Var) {
            this.f7667E0.m21465l(g);
            this.f7668F0.m34130t3(userPrivacySetting.getConstructor());
        }
    }

    public void m35406eh(final TdApi.UserPrivacySetting userPrivacySetting, final C10862n1 n1Var, TdApi.Object object) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2192bl.this.m35407dh(userPrivacySetting, n1Var);
            }
        });
    }

    public static boolean m35405fh(C2964ra raVar) {
        return raVar.m32838j() == R.id.text_title || raVar.m32838j() == R.id.btn_newContact || raVar.m32838j() == R.id.text_title || raVar.m32838j() == R.id.btn_privacyRule;
    }

    public static boolean m35404gh(C2964ra raVar) {
        return raVar.m32838j() == R.id.text_title;
    }

    public void m35403hh(boolean z) {
        if (!m9347Sa()) {
            C2964ra raVar = this.f7671I0;
            int i = 0;
            if (raVar != null) {
                raVar.m32856X(m35412Yg(0));
            }
            C2964ra raVar2 = this.f7672J0;
            if (raVar2 != null) {
                raVar2.m32856X(m35412Yg(1));
            }
            C2964ra raVar3 = this.f7673K0;
            if (raVar3 != null) {
                raVar3.m32856X(m35412Yg(2));
            }
            C2964ra raVar4 = this.f7670H0;
            if (raVar4 == null || z == raVar4.m32851b()) {
                this.f7668F0.m34192a3(C3160uk.f10579a);
                return;
            }
            this.f7670H0.m32875E(z);
            this.f7670H0.m32857W(z ? R.string.DeleteContact : R.string.AddContact);
            this.f7670H0.m32869K(z ? R.drawable.baseline_delete_24 : R.drawable.baseline_person_add_24);
            C2964ra raVar5 = this.f7670H0;
            if (z) {
                i = R.id.theme_color_textNegative;
            }
            raVar5.m32846d0(i);
            this.f7668F0.m34192a3(C3117tk.f10474a);
        }
    }

    public void m35402ih(TdApi.UserPrivacySetting userPrivacySetting, TdApi.UserPrivacySettingRules userPrivacySettingRules) {
        if (!m9347Sa()) {
            this.f7666D0.m21467j(userPrivacySetting.getConstructor(), C10862n1.m2969z(userPrivacySettingRules));
            C2546iq iqVar = this.f7668F0;
            if (iqVar != null) {
                iqVar.m34130t3(userPrivacySetting.getConstructor());
            }
        }
    }

    @Override
    public void mo4076B4(long j, String[] strArr) {
        C10721i0.m4195b(this, j, strArr);
    }

    @Override
    public void mo4075C5(long j, long j2) {
        C10721i0.m4178s(this, j, j2);
    }

    @Override
    public long mo9464C9() {
        return m9131x9().f7682a;
    }

    @Override
    public void mo4074G5(long j, int i, boolean z) {
        C10721i0.m4173x(this, j, i, z);
    }

    @Override
    public void mo4073H0(long j, String str) {
        C10721i0.m4177t(this, j, str);
    }

    @Override
    public void mo4072K3(long j, boolean z) {
        C10721i0.m4188i(this, j, z);
    }

    @Override
    public void mo4071L0(long j, int i) {
        C10721i0.m4185l(this, j, i);
    }

    @Override
    public void mo1348P1(TdApi.User user) {
        final boolean O2 = C4779t2.m25631O2(user);
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2192bl.this.m35403hh(O2);
            }
        });
    }

    @Override
    public void mo4070R1(long j, boolean z) {
        C10721i0.m4187j(this, j, z);
    }

    @Override
    public int mo407R9() {
        return R.id.controller_privacyException;
    }

    @Override
    public void mo4069V5(long j, long j2, int i, boolean z) {
        C10721i0.m4180q(this, j, j2, i, z);
    }

    @Override
    public void mo4068W(long j, TdApi.ChatActionBar chatActionBar) {
        C10721i0.m4196a(this, j, chatActionBar);
    }

    @Override
    public CharSequence mo9313X9() {
        return C4403w.m27871i1(R.string.EditPrivacy);
    }

    public final void m35413Xg(final TdApi.UserPrivacySetting userPrivacySetting) {
        this.f7669G0++;
        this.f30170b.m2270r4().m14783o(new TdApi.GetUserPrivacySettingRules(userPrivacySetting), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC2192bl.this.m35410ah(userPrivacySetting, object);
            }
        });
    }

    @Override
    public void mo4067Y(long j, TdApi.Message message) {
        C10721i0.m4175v(this, j, message);
    }

    public final CharSequence m35412Yg(int i) {
        int i2;
        long C9 = mo9464C9();
        boolean H6 = this.f30170b.m2832H6(C9);
        boolean X6 = this.f30170b.m2583X6(C9);
        C10930q6 q6Var = this.f30170b;
        String Q3 = X6 ? q6Var.m2691Q3(C9) : q6Var.m2480e2().m1749D2(this.f30170b.m2494d4(C9));
        if (i == 0) {
            i2 = X6 ? R.string.PrivacyVisibilityGroup : H6 ? R.string.PrivacyVisibilityBot : R.string.PrivacyVisibilityUser;
        } else if (i == 1) {
            i2 = X6 ? R.string.PrivacyActionGroup : H6 ? R.string.PrivacyActionBot : R.string.PrivacyActionUser;
        } else if (i == 2) {
            i2 = R.string.EditPrivacyCallP2PInfo;
        } else if (i == 3) {
            i2 = R.string.EditPrivacyGroupInfo;
        } else {
            throw new UnsupportedOperationException();
        }
        return C4403w.m27855m1(i2, Q3);
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        this.f30170b.m2781K9().m1802u0(this);
        long C9 = mo9464C9();
        long d4 = this.f30170b.m2494d4(C9);
        if (d4 != 0) {
            this.f30170b.m2480e2().m1702P1(d4, this);
        } else {
            this.f30170b.m2781K9().m1818q0(C9, this);
        }
    }

    @Override
    public void mo4066a0(long j, TdApi.MessageSender messageSender) {
        C10721i0.m4191f(this, j, messageSender);
    }

    @Override
    public void mo2964a2(TdApi.UserPrivacySetting userPrivacySetting, TdApi.UserPrivacySettingRules userPrivacySettingRules) {
        m35400kh(userPrivacySetting, userPrivacySettingRules);
    }

    @Override
    public void mo4065c2(long j, TdApi.DraftMessage draftMessage) {
        C10721i0.m4190g(this, j, draftMessage);
    }

    @Override
    public void mo4064c4(long j, TdApi.ChatPhotoInfo chatPhotoInfo) {
        C10721i0.m4182o(this, j, chatPhotoInfo);
    }

    @Override
    public boolean mo9270dc() {
        return this.f7669G0 > 0 || this.f7674L0;
    }

    @Override
    public void mo4063e7(long j, int i) {
        C10721i0.m4186k(this, j, i);
    }

    @Override
    public void mo4062h1(long j, TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        C10721i0.m4184m(this, j, chatJoinRequestsInfo);
    }

    @Override
    public void mo4061i5(long j, String str) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2192bl.this.m35408ch();
            }
        });
    }

    public final void m35401jh() {
        View$OnClickListenerC3222vw vwVar = new View$OnClickListenerC3222vw(this.f30168a, this.f30170b);
        vwVar.m9476Ad(new View$OnClickListenerC3222vw.C3224b(true));
        m9291ac(vwVar);
    }

    public final void m35400kh(final TdApi.UserPrivacySetting userPrivacySetting, final TdApi.UserPrivacySettingRules userPrivacySettingRules) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2192bl.this.m35402ih(userPrivacySetting, userPrivacySettingRules);
            }
        });
    }

    @Override
    public void mo4060m0(long j, int i, boolean z) {
        C10721i0.m4174w(this, j, i, z);
    }

    @Override
    public void onClick(View view) {
        TdApi.UserPrivacySettingRules userPrivacySettingRules;
        switch (view.getId()) {
            case R.id.btn_newContact:
                long d4 = this.f30170b.m2494d4(mo9464C9());
                if (d4 == 0) {
                    return;
                }
                if (this.f30170b.m2480e2().m1761A2(d4)) {
                    this.f30170b.m2485dd().m3753P2(this, d4);
                    return;
                } else {
                    this.f30170b.m2485dd().m3893B2(this, this.f30170b.m2480e2().m1698Q2(d4));
                    return;
                }
            case R.id.btn_privacyRule:
                final TdApi.UserPrivacySetting userPrivacySetting = (TdApi.UserPrivacySetting) ((C2964ra) view.getTag()).m32847d();
                C10862n1 e = this.f7666D0.m21472e(userPrivacySetting.getConstructor());
                if (e != null) {
                    boolean W2 = this.f7668F0.m34204W2(view);
                    long C9 = mo9464C9();
                    boolean X6 = this.f30170b.m2583X6(C9);
                    long d42 = this.f30170b.m2494d4(C9);
                    if (X6) {
                        userPrivacySettingRules = e.m2973v(C9, false, W2);
                    } else {
                        boolean A2 = this.f30170b.m2480e2().m1761A2(d42);
                        C5322e eVar = this.f7675M0;
                        userPrivacySettingRules = e.m2970y(d42, A2, eVar != null ? eVar.m23270g() : null, W2);
                    }
                    if (this.f7667E0 == null) {
                        this.f7667E0 = new C6038h<>();
                    }
                    final C10862n1 z = C10862n1.m2969z(userPrivacySettingRules);
                    this.f7667E0.m21467j(userPrivacySetting.getConstructor(), z);
                    this.f7668F0.m34130t3(userPrivacySetting.getConstructor());
                    this.f30170b.m2270r4().m14783o(new TdApi.SetUserPrivacySettingRules(userPrivacySetting, userPrivacySettingRules), new Client.AbstractC7865g() {
                        @Override
                        public final void mo255t2(TdApi.Object object) {
                            View$OnClickListenerC2192bl.this.m35406eh(userPrivacySetting, z, object);
                        }
                    });
                    return;
                }
                return;
            case R.id.btn_privacySettings:
                m35401jh();
                return;
            default:
                return;
        }
    }

    @Override
    public void mo4059q6(long j, boolean z) {
        C10721i0.m4189h(this, j, z);
    }

    @Override
    public void mo30635rg(Context context, CustomRecyclerView customRecyclerView) {
        long C9 = mo9464C9();
        long d4 = this.f30170b.m2494d4(C9);
        boolean H6 = this.f30170b.m2832H6(C9);
        boolean X6 = this.f30170b.m2583X6(C9);
        int i = (d4 > 0L ? 1 : (d4 == 0L ? 0 : -1));
        boolean z = i != 0 && !this.f30170b.m2379k7(d4) && !H6;
        if (!X6 && !this.f30170b.m2379k7(d4)) {
            this.f7675M0 = new C5322e(0);
            this.f7674L0 = true;
            this.f30170b.m2270r4().m14783o(new TdApi.GetGroupsInCommon(d4, 0L, 100), new C2193a(d4));
        }
        this.f7666D0 = new C6038h<>();
        this.f7668F0 = new C2194b(this, X6, d4, C9);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2964ra(57).m32873G(new C4601c3(this.f30170b, (TdApi.ChatList) null, C9, false).m27063D()));
        if (z) {
            arrayList.add(new C2964ra(11));
            boolean A2 = this.f30170b.m2480e2().m1761A2(d4);
            C2964ra E = new C2964ra(4, R.id.btn_newContact, A2 ? R.drawable.baseline_delete_24 : R.drawable.baseline_person_add_24, A2 ? R.string.DeleteContact : R.string.AddContact).m32846d0(A2 ? R.id.theme_color_textNegative : 0).m32875E(A2);
            this.f7670H0 = E;
            arrayList.add(E);
        }
        int i2 = 3;
        arrayList.add(new C2964ra(3));
        if (!this.f30170b.m2379k7(d4)) {
            C2964ra raVar = new C2964ra(110, (int) R.id.text_title, 0, m35412Yg(0), false);
            this.f7671I0 = raVar;
            arrayList.add(raVar);
            arrayList.add(new C2964ra(2));
            TdApi.UserPrivacySetting[] userPrivacySettingArr = H6 ? new TdApi.UserPrivacySetting[]{new TdApi.UserPrivacySettingShowStatus(), new TdApi.UserPrivacySettingShowProfilePhoto(), new TdApi.UserPrivacySettingShowLinkInForwardedMessages()} : new TdApi.UserPrivacySetting[]{new TdApi.UserPrivacySettingShowStatus(), new TdApi.UserPrivacySettingShowProfilePhoto(), new TdApi.UserPrivacySettingShowPhoneNumber(), new TdApi.UserPrivacySettingShowLinkInForwardedMessages(), new TdApi.UserPrivacySettingAllowChatInvites(), new TdApi.UserPrivacySettingAllowCalls(), new TdApi.UserPrivacySettingAllowPeerToPeerCalls()};
            int length = userPrivacySettingArr.length;
            int i3 = 0;
            boolean z2 = true;
            while (i3 < length) {
                TdApi.UserPrivacySetting userPrivacySetting = userPrivacySettingArr[i3];
                if (z2) {
                    z2 = false;
                } else if (userPrivacySetting.getConstructor() == 592688870) {
                    arrayList.add(new C2964ra(i2));
                    C2964ra raVar2 = new C2964ra(110, (int) R.id.text_title, 0, m35412Yg(1), false);
                    this.f7672J0 = raVar2;
                    arrayList.add(raVar2);
                    arrayList.add(new C2964ra(2));
                } else {
                    arrayList.add(new C2964ra(11));
                }
                userPrivacySettingArr = userPrivacySettingArr;
                length = length;
                z2 = z2;
                arrayList.add(new C2964ra(92, R.id.btn_privacyRule, View$OnClickListenerC3415zw.m30648Jg(userPrivacySetting), View$OnClickListenerC3415zw.m30647Kg(userPrivacySetting, true, X6)).m32873G(userPrivacySetting).m32866N(userPrivacySetting.getConstructor()));
                m35413Xg(userPrivacySetting);
                i3++;
                i2 = 3;
            }
            arrayList.add(new C2964ra(3));
            if (!H6) {
                C2964ra raVar3 = new C2964ra(9, (int) R.id.text_title, 0, m35412Yg(X6 ? 3 : 2), false);
                this.f7673K0 = raVar3;
                arrayList.add(raVar3);
            }
        }
        arrayList.add(new C2964ra(110, 0, 0, R.string.PrivacyOther));
        arrayList.add(new C2964ra(2));
        arrayList.add(new C2964ra(4, R.id.btn_privacySettings, 0, R.string.EditPrivacyGlobal));
        arrayList.add(new C2964ra(3));
        this.f7668F0.m34119x2(arrayList, false);
        customRecyclerView.setAdapter(this.f7668F0);
        m31296vg();
        if (i != 0) {
            this.f30170b.m2480e2().m1720L(d4, this);
        } else {
            this.f30170b.m2781K9().m1870d0(C9, this);
        }
        this.f30170b.m2781K9().m1854h0(this);
    }

    @Override
    public void mo4058s2(long j, boolean z) {
        C10721i0.m4192e(this, j, z);
    }

    @Override
    public void mo4057s4(long j, String str) {
        C10721i0.m4193d(this, j, str);
    }

    @Override
    public boolean mo9165sd(Bundle bundle, String str) {
        super.mo9165sd(bundle, str);
        long j = bundle.getLong(str + "chat", 0L);
        if (this.f30170b.m2739N3(j) == null) {
            return false;
        }
        m9476Ad(new C2195c(j));
        return true;
    }

    @Override
    public void mo4056t7(long j, TdApi.ChatPermissions chatPermissions) {
        C10721i0.m4183n(this, j, chatPermissions);
    }

    @Override
    public void mo4055u3(long j, TdApi.VideoChat videoChat) {
        C10721i0.m4172y(this, j, videoChat);
    }

    @Override
    public void mo1335u7(long j, TdApi.UserFullInfo userFullInfo) {
        C11133y7.m1438a(this, j, userFullInfo);
    }

    @Override
    public void mo4054w1(long j, boolean z) {
        C10721i0.m4194c(this, j, z);
    }

    @Override
    public void mo4053w6(long j, TdApi.ChatPosition chatPosition, boolean z, boolean z2, boolean z3) {
        C10721i0.m4181p(this, j, chatPosition, z, z2, z3);
    }

    @Override
    public void mo4052y1(long j, long j2) {
        C10721i0.m4179r(this, j, j2);
    }

    @Override
    public boolean mo9122yd(Bundle bundle, String str) {
        super.mo9122yd(bundle, str);
        bundle.putLong(str + "chat", m9131x9().f7682a);
        return true;
    }
}
