package de;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import de.bl;
import de.ww;
import gd.w;
import hd.c3;
import hd.t2;
import java.util.ArrayList;
import jb.e;
import k0.h;
import ne.o;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import ud.v4;
import zd.g0;
import zd.h0;
import zd.l1;
import zd.m1;
import zd.o6;
import zd.t7;
import zd.w7;

public class bl extends vo<c> implements m1, View.OnClickListener, t7.i, h0 {
    public h<l1> D0;
    public h<l1> E0;
    public iq F0;
    public int G0;
    public ra H0;
    public ra I0;
    public ra J0;
    public ra K0;
    public boolean L0;
    public e M0;

    public class a implements Client.g {
        public final long f7574a;

        public a(long j10) {
            this.f7574a = j10;
        }

        public static boolean d(ra raVar) {
            return raVar.j() == R.id.btn_privacyRule;
        }

        public void e() {
            if (!bl.this.Sa()) {
                bl.this.F0.X2(al.f7475a);
            }
        }

        public void f() {
            if (!bl.this.Sa()) {
                bl.this.L0 = false;
                if (bl.this.G0 == 0) {
                    bl.this.n9();
                }
            }
        }

        @Override
        public void r2(TdApi.Object object) {
            long[] jArr = object.getConstructor() == 1809654812 ? ((TdApi.Chats) object).chatIds : null;
            if (jArr == null || jArr.length <= 0) {
                bl.this.f24495b.hd().post(new Runnable() {
                    @Override
                    public final void run() {
                        bl.a.this.f();
                    }
                });
                return;
            }
            bl.this.M0.b(jArr);
            if (!bl.this.Sa()) {
                bl.this.f24495b.hd().post(new Runnable() {
                    @Override
                    public final void run() {
                        bl.a.this.e();
                    }
                });
                bl.this.f24495b.v4().o(new TdApi.GetGroupsInCommon(this.f7574a, jArr[jArr.length - 1], 100), this);
            }
        }
    }

    public class b extends iq {
        public final boolean f7576m0;
        public final long f7577n0;
        public final long f7578o0;

        public b(v4 v4Var, boolean z10, long j10, long j11) {
            super(v4Var);
            this.f7576m0 = z10;
            this.f7577n0 = j10;
            this.f7578o0 = j11;
        }

        @Override
        public void R2(ra raVar, uc.c cVar, boolean z10) {
            TdApi.UserPrivacySettingRule userPrivacySettingRule;
            int j10 = raVar.j();
            int i10 = 0;
            if (j10 == R.id.btn_newContact) {
                cVar.setName(raVar.u());
                cVar.setTextColorId(raVar.y(R.id.theme_color_text));
                cVar.setIcon(raVar.i());
                if (!this.f7576m0) {
                    if (bl.this.f24495b.e2().z2(this.f7577n0)) {
                        i10 = R.id.theme_color_iconNegative;
                    }
                    cVar.setIconColorId(i10);
                }
            } else if (j10 == R.id.btn_privacyRule) {
                TdApi.UserPrivacySetting userPrivacySetting = (TdApi.UserPrivacySetting) raVar.d();
                long[] jArr = null;
                l1 l1Var = bl.this.E0 != null ? (l1) bl.this.E0.e(userPrivacySetting.getConstructor()) : null;
                if (l1Var == null) {
                    l1Var = (l1) bl.this.D0.e(userPrivacySetting.getConstructor());
                }
                if (l1Var == null) {
                    cVar.X1(false, z10);
                    cVar.setData(R.string.LoadingInformation);
                    cVar.setDataColorId(0);
                    cVar.getToggler().r(true, z10);
                    return;
                }
                boolean z11 = !this.f7576m0 && bl.this.f24495b.e2().z2(this.f7577n0);
                if (this.f7576m0) {
                    userPrivacySettingRule = l1Var.d(this.f7578o0, false);
                } else {
                    userPrivacySettingRule = l1Var.e(this.f7577n0, z11, bl.this.M0 != null ? bl.this.M0.g() : null);
                }
                cVar.X1(true, z10);
                boolean q10 = l1.q(userPrivacySettingRule);
                cVar.getToggler().r(q10, z10);
                if (l1.r(userPrivacySettingRule, !this.f7576m0)) {
                    cVar.setDataColorId(0);
                    TdApi.UserPrivacySettingRule c10 = l1Var.c(z11);
                    if (l1.q(c10) == l1.q(userPrivacySettingRule)) {
                        userPrivacySettingRule = c10;
                    }
                    if (userPrivacySettingRule != null) {
                        int constructor = userPrivacySettingRule.getConstructor();
                        if (constructor == -2048749863) {
                            long[] jArr2 = ((TdApi.UserPrivacySettingRuleAllowChatMembers) userPrivacySettingRule).chatIds;
                            if (bl.this.M0 != null) {
                                jArr = bl.this.M0.g();
                            }
                            jArr = ib.b.u(jArr2, jArr);
                        } else if (constructor == 392530897) {
                            long[] jArr3 = ((TdApi.UserPrivacySettingRuleRestrictChatMembers) userPrivacySettingRule).chatIds;
                            if (bl.this.M0 != null) {
                                jArr = bl.this.M0.g();
                            }
                            jArr = ib.b.u(jArr3, jArr);
                        }
                    }
                    if (jArr == null || jArr.length <= 0) {
                        if (!this.f7576m0 || l1.q(userPrivacySettingRule) || !l1.q(l1Var.d(this.f7578o0, true))) {
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
                        cVar.setData(w.m1(R.string.PrivacyDefaultChat, bl.this.f24495b.U3(jArr[0])));
                    } else {
                        cVar.setData(w.q2(R.string.PrivacyDefaultXChats, jArr.length));
                    }
                } else {
                    cVar.setDataColorId(R.id.theme_color_textNeutral);
                    switch (userPrivacySetting.getConstructor()) {
                        case TdApi.UserPrivacySettingAllowFindingByPhoneNumber.CONSTRUCTOR:
                            return;
                        case TdApi.UserPrivacySettingAllowCalls.CONSTRUCTOR:
                            cVar.setData(q10 ? R.string.PrivacyCallsExceptionOn : R.string.PrivacyCallsExceptionOff);
                            return;
                        case TdApi.UserPrivacySettingShowPhoneNumber.CONSTRUCTOR:
                            cVar.setData(q10 ? R.string.PrivacyShowNumberExceptionOn : R.string.PrivacyShowNumberExceptionOff);
                            return;
                        case TdApi.UserPrivacySettingAllowPeerToPeerCalls.CONSTRUCTOR:
                            cVar.setData(q10 ? R.string.PrivacyP2PExceptionOn : R.string.PrivacyP2PExceptionOff);
                            return;
                        case TdApi.UserPrivacySettingShowLinkInForwardedMessages.CONSTRUCTOR:
                            cVar.setData(q10 ? R.string.PrivacyForwardLinkExceptionOn : R.string.PrivacyForwardLinkExceptionOff);
                            return;
                        case TdApi.UserPrivacySettingAllowChatInvites.CONSTRUCTOR:
                            cVar.setData(q10 ? R.string.PrivacyAddToGroupsExceptionOn : R.string.PrivacyAddToGroupsExceptionOff);
                            return;
                        case TdApi.UserPrivacySettingShowProfilePhoto.CONSTRUCTOR:
                            cVar.setData(q10 ? R.string.PrivacyPhotoExceptionOn : R.string.PrivacyPhotoExceptionOff);
                            return;
                        case TdApi.UserPrivacySettingShowStatus.CONSTRUCTOR:
                            cVar.setData(q10 ? R.string.PrivacyLastSeenExceptionOn : R.string.PrivacyLastSeenExceptionOff);
                            return;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }
            }
        }

        @Override
        public void Y1(ra raVar, int i10, o oVar) {
            oVar.setChat((c3) raVar.d());
            oVar.setEnabled(false);
        }
    }

    public static class c {
        public final long f7580a;

        public c(long j10) {
            this.f7580a = j10;
        }
    }

    public bl(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void Zg(TdApi.Object object, TdApi.UserPrivacySetting userPrivacySetting) {
        if (!Sa()) {
            if (object.getConstructor() == 322477541) {
                this.D0.j(userPrivacySetting.getConstructor(), l1.z((TdApi.UserPrivacySettingRules) object));
                iq iqVar = this.F0;
                if (iqVar != null) {
                    iqVar.q3(userPrivacySetting.getConstructor());
                }
            }
            int i10 = this.G0 - 1;
            this.G0 = i10;
            if (i10 == 0 && !this.L0) {
                n9();
            }
        }
    }

    public void ah(final TdApi.UserPrivacySetting userPrivacySetting, final TdApi.Object object) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                bl.this.Zg(object, userPrivacySetting);
            }
        });
    }

    public static boolean bh(ra raVar) {
        return raVar.j() == R.id.text_title;
    }

    public void ch() {
        ra raVar = this.I0;
        if (raVar != null) {
            raVar.X(Yg(0));
        }
        ra raVar2 = this.J0;
        if (raVar2 != null) {
            raVar2.X(Yg(1));
        }
        ra raVar3 = this.K0;
        if (raVar3 != null) {
            raVar3.X(Yg(2));
        }
        this.F0.X2(vk.f9848a);
    }

    public void dh(TdApi.UserPrivacySetting userPrivacySetting, l1 l1Var) {
        int g10;
        if (!Sa() && (g10 = this.E0.g(userPrivacySetting.getConstructor())) >= 0 && this.E0.o(g10) == l1Var) {
            this.E0.l(g10);
            this.F0.q3(userPrivacySetting.getConstructor());
        }
    }

    public void eh(final TdApi.UserPrivacySetting userPrivacySetting, final l1 l1Var, TdApi.Object object) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                bl.this.dh(userPrivacySetting, l1Var);
            }
        });
    }

    public static boolean fh(ra raVar) {
        return raVar.j() == R.id.text_title || raVar.j() == R.id.btn_newContact || raVar.j() == R.id.text_title || raVar.j() == R.id.btn_privacyRule;
    }

    public static boolean gh(ra raVar) {
        return raVar.j() == R.id.text_title;
    }

    public void hh(boolean z10) {
        if (!Sa()) {
            ra raVar = this.I0;
            int i10 = 0;
            if (raVar != null) {
                raVar.X(Yg(0));
            }
            ra raVar2 = this.J0;
            if (raVar2 != null) {
                raVar2.X(Yg(1));
            }
            ra raVar3 = this.K0;
            if (raVar3 != null) {
                raVar3.X(Yg(2));
            }
            ra raVar4 = this.H0;
            if (raVar4 == null || z10 == raVar4.b()) {
                this.F0.X2(uk.f9754a);
                return;
            }
            this.H0.E(z10);
            this.H0.W(z10 ? R.string.DeleteContact : R.string.AddContact);
            this.H0.K(z10 ? R.drawable.baseline_delete_24 : R.drawable.baseline_person_add_24);
            ra raVar5 = this.H0;
            if (z10) {
                i10 = R.id.theme_color_textNegative;
            }
            raVar5.d0(i10);
            this.F0.X2(tk.f9662a);
        }
    }

    public void ih(TdApi.UserPrivacySetting userPrivacySetting, TdApi.UserPrivacySettingRules userPrivacySettingRules) {
        if (!Sa()) {
            this.D0.j(userPrivacySetting.getConstructor(), l1.z(userPrivacySettingRules));
            iq iqVar = this.F0;
            if (iqVar != null) {
                iqVar.q3(userPrivacySetting.getConstructor());
            }
        }
    }

    @Override
    public void B3(long j10, boolean z10) {
        g0.i(this, j10, z10);
    }

    @Override
    public void B5(long j10, int i10, boolean z10) {
        g0.x(this, j10, i10, z10);
    }

    @Override
    public long C9() {
        return x9().f7580a;
    }

    @Override
    public void H0(long j10, String str) {
        g0.t(this, j10, str);
    }

    @Override
    public void M1(TdApi.User user) {
        final boolean O2 = t2.O2(user);
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                bl.this.hh(O2);
            }
        });
    }

    @Override
    public void N0(long j10, int i10) {
        g0.l(this, j10, i10);
    }

    @Override
    public void N1(long j10, boolean z10) {
        g0.j(this, j10, z10);
    }

    @Override
    public void R3(long j10, TdApi.ChatPhotoInfo chatPhotoInfo) {
        g0.o(this, j10, chatPhotoInfo);
    }

    @Override
    public int R9() {
        return R.id.controller_privacyException;
    }

    @Override
    public void T5(long j10, long j11, int i10, boolean z10) {
        g0.q(this, j10, j11, i10, z10);
    }

    @Override
    public void X(long j10, TdApi.ChatActionBar chatActionBar) {
        g0.a(this, j10, chatActionBar);
    }

    @Override
    public CharSequence X9() {
        return w.i1(R.string.EditPrivacy);
    }

    public final void Xg(final TdApi.UserPrivacySetting userPrivacySetting) {
        this.G0++;
        this.f24495b.v4().o(new TdApi.GetUserPrivacySettingRules(userPrivacySetting), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                bl.this.ah(userPrivacySetting, object);
            }
        });
    }

    @Override
    public void Y(long j10, TdApi.Message message) {
        g0.v(this, j10, message);
    }

    @Override
    public void Y1(TdApi.UserPrivacySetting userPrivacySetting, TdApi.UserPrivacySettingRules userPrivacySettingRules) {
        kh(userPrivacySetting, userPrivacySettingRules);
    }

    public final CharSequence Yg(int i10) {
        int i11;
        long C9 = C9();
        boolean L6 = this.f24495b.L6(C9);
        boolean b72 = this.f24495b.b7(C9);
        o6 o6Var = this.f24495b;
        String U3 = b72 ? o6Var.U3(C9) : o6Var.e2().C2(this.f24495b.h4(C9));
        if (i10 == 0) {
            i11 = b72 ? R.string.PrivacyVisibilityGroup : L6 ? R.string.PrivacyVisibilityBot : R.string.PrivacyVisibilityUser;
        } else if (i10 == 1) {
            i11 = b72 ? R.string.PrivacyActionGroup : L6 ? R.string.PrivacyActionBot : R.string.PrivacyActionUser;
        } else if (i10 == 2) {
            i11 = R.string.EditPrivacyCallP2PInfo;
        } else if (i10 == 3) {
            i11 = R.string.EditPrivacyGroupInfo;
        } else {
            throw new UnsupportedOperationException();
        }
        return w.m1(i11, U3);
    }

    @Override
    public void Z8() {
        super.Z8();
        this.f24495b.O9().u0(this);
        long C9 = C9();
        long h42 = this.f24495b.h4(C9);
        if (h42 != 0) {
            this.f24495b.e2().N1(h42, this);
        } else {
            this.f24495b.O9().q0(C9, this);
        }
    }

    @Override
    public void a0(long j10, TdApi.MessageSender messageSender) {
        g0.f(this, j10, messageSender);
    }

    @Override
    public void b2(long j10, TdApi.DraftMessage draftMessage) {
        g0.g(this, j10, draftMessage);
    }

    @Override
    public void c1(long j10, TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        g0.m(this, j10, chatJoinRequestsInfo);
    }

    @Override
    public boolean dc() {
        return this.G0 > 0 || this.L0;
    }

    @Override
    public void e7(long j10, int i10) {
        g0.k(this, j10, i10);
    }

    @Override
    public void f4(long j10, String str) {
        g0.d(this, j10, str);
    }

    @Override
    public void f5(long j10, String str) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                bl.this.ch();
            }
        });
    }

    public final void jh() {
        ww wwVar = new ww(this.f24493a, this.f24495b);
        wwVar.Ad(new ww.b(true));
        ac(wwVar);
    }

    @Override
    public void k3(long j10, TdApi.VideoChat videoChat) {
        g0.y(this, j10, videoChat);
    }

    public final void kh(final TdApi.UserPrivacySetting userPrivacySetting, final TdApi.UserPrivacySettingRules userPrivacySettingRules) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                bl.this.ih(userPrivacySetting, userPrivacySettingRules);
            }
        });
    }

    @Override
    public void l0(long j10, int i10, boolean z10) {
        g0.w(this, j10, i10, z10);
    }

    @Override
    public void onClick(View view) {
        TdApi.UserPrivacySettingRules userPrivacySettingRules;
        switch (view.getId()) {
            case R.id.btn_newContact:
                long h42 = this.f24495b.h4(C9());
                if (h42 == 0) {
                    return;
                }
                if (this.f24495b.e2().z2(h42)) {
                    this.f24495b.hd().P2(this, h42);
                    return;
                } else {
                    this.f24495b.hd().B2(this, this.f24495b.e2().P2(h42));
                    return;
                }
            case R.id.btn_privacyRule:
                final TdApi.UserPrivacySetting userPrivacySetting = (TdApi.UserPrivacySetting) ((ra) view.getTag()).d();
                l1 e10 = this.D0.e(userPrivacySetting.getConstructor());
                if (e10 != null) {
                    boolean S2 = this.F0.S2(view);
                    long C9 = C9();
                    boolean b72 = this.f24495b.b7(C9);
                    long h43 = this.f24495b.h4(C9);
                    if (b72) {
                        userPrivacySettingRules = e10.v(C9, false, S2);
                    } else {
                        boolean z22 = this.f24495b.e2().z2(h43);
                        e eVar = this.M0;
                        userPrivacySettingRules = e10.y(h43, z22, eVar != null ? eVar.g() : null, S2);
                    }
                    if (this.E0 == null) {
                        this.E0 = new h<>();
                    }
                    final l1 z10 = l1.z(userPrivacySettingRules);
                    this.E0.j(userPrivacySetting.getConstructor(), z10);
                    this.F0.q3(userPrivacySetting.getConstructor());
                    this.f24495b.v4().o(new TdApi.SetUserPrivacySettingRules(userPrivacySetting, userPrivacySettingRules), new Client.g() {
                        @Override
                        public final void r2(TdApi.Object object) {
                            bl.this.eh(userPrivacySetting, z10, object);
                        }
                    });
                    return;
                }
                return;
            case R.id.btn_privacySettings:
                jh();
                return;
            default:
                return;
        }
    }

    @Override
    public void p6(long j10, boolean z10) {
        g0.h(this, j10, z10);
    }

    @Override
    public void q2(long j10, boolean z10) {
        g0.e(this, j10, z10);
    }

    @Override
    public void rg(Context context, CustomRecyclerView customRecyclerView) {
        long C9 = C9();
        long h42 = this.f24495b.h4(C9);
        boolean L6 = this.f24495b.L6(C9);
        boolean b72 = this.f24495b.b7(C9);
        int i10 = (h42 > 0L ? 1 : (h42 == 0L ? 0 : -1));
        boolean z10 = i10 != 0 && !this.f24495b.o7(h42) && !L6;
        if (!b72 && !this.f24495b.o7(h42)) {
            this.M0 = new e(0);
            this.L0 = true;
            this.f24495b.v4().o(new TdApi.GetGroupsInCommon(h42, 0L, 100), new a(h42));
        }
        this.D0 = new h<>();
        this.F0 = new b(this, b72, h42, C9);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ra(57).G(new c3(this.f24495b, (TdApi.ChatList) null, C9, false).D()));
        if (z10) {
            arrayList.add(new ra(11));
            boolean z22 = this.f24495b.e2().z2(h42);
            ra E = new ra(4, R.id.btn_newContact, z22 ? R.drawable.baseline_delete_24 : R.drawable.baseline_person_add_24, z22 ? R.string.DeleteContact : R.string.AddContact).d0(z22 ? R.id.theme_color_textNegative : 0).E(z22);
            this.H0 = E;
            arrayList.add(E);
        }
        int i11 = 3;
        arrayList.add(new ra(3));
        if (!this.f24495b.o7(h42)) {
            ra raVar = new ra(110, (int) R.id.text_title, 0, Yg(0), false);
            this.I0 = raVar;
            arrayList.add(raVar);
            arrayList.add(new ra(2));
            TdApi.UserPrivacySetting[] userPrivacySettingArr = L6 ? new TdApi.UserPrivacySetting[]{new TdApi.UserPrivacySettingShowStatus(), new TdApi.UserPrivacySettingShowProfilePhoto(), new TdApi.UserPrivacySettingShowLinkInForwardedMessages()} : new TdApi.UserPrivacySetting[]{new TdApi.UserPrivacySettingShowStatus(), new TdApi.UserPrivacySettingShowProfilePhoto(), new TdApi.UserPrivacySettingShowPhoneNumber(), new TdApi.UserPrivacySettingShowLinkInForwardedMessages(), new TdApi.UserPrivacySettingAllowChatInvites(), new TdApi.UserPrivacySettingAllowCalls(), new TdApi.UserPrivacySettingAllowPeerToPeerCalls()};
            int length = userPrivacySettingArr.length;
            int i12 = 0;
            boolean z11 = true;
            while (i12 < length) {
                TdApi.UserPrivacySetting userPrivacySetting = userPrivacySettingArr[i12];
                if (z11) {
                    z11 = false;
                } else if (userPrivacySetting.getConstructor() == 592688870) {
                    arrayList.add(new ra(i11));
                    ra raVar2 = new ra(110, (int) R.id.text_title, 0, Yg(1), false);
                    this.J0 = raVar2;
                    arrayList.add(raVar2);
                    arrayList.add(new ra(2));
                } else {
                    arrayList.add(new ra(11));
                }
                userPrivacySettingArr = userPrivacySettingArr;
                length = length;
                z11 = z11;
                arrayList.add(new ra(92, R.id.btn_privacyRule, ax.Jg(userPrivacySetting), ax.Kg(userPrivacySetting, true, b72)).G(userPrivacySetting).N(userPrivacySetting.getConstructor()));
                Xg(userPrivacySetting);
                i12++;
                i11 = 3;
            }
            arrayList.add(new ra(3));
            if (!L6) {
                ra raVar3 = new ra(9, (int) R.id.text_title, 0, Yg(b72 ? 3 : 2), false);
                this.K0 = raVar3;
                arrayList.add(raVar3);
            }
        }
        arrayList.add(new ra(110, 0, 0, R.string.PrivacyOther));
        arrayList.add(new ra(2));
        arrayList.add(new ra(4, R.id.btn_privacySettings, 0, R.string.EditPrivacyGlobal));
        arrayList.add(new ra(3));
        this.F0.s2(arrayList, false);
        customRecyclerView.setAdapter(this.F0);
        vg();
        if (i10 != 0) {
            this.f24495b.e2().L(h42, this);
        } else {
            this.f24495b.O9().d0(C9, this);
        }
        this.f24495b.O9().h0(this);
    }

    @Override
    public boolean sd(Bundle bundle, String str) {
        super.sd(bundle, str);
        long j10 = bundle.getLong(str + "chat", 0L);
        if (this.f24495b.R3(j10) == null) {
            return false;
        }
        Ad(new c(j10));
        return true;
    }

    @Override
    public void t4(long j10, String[] strArr) {
        g0.b(this, j10, strArr);
    }

    @Override
    public void t7(long j10, TdApi.ChatPermissions chatPermissions) {
        g0.n(this, j10, chatPermissions);
    }

    @Override
    public void u7(long j10, TdApi.UserFullInfo userFullInfo) {
        w7.a(this, j10, userFullInfo);
    }

    @Override
    public void w1(long j10, boolean z10) {
        g0.c(this, j10, z10);
    }

    @Override
    public void w6(long j10, TdApi.ChatPosition chatPosition, boolean z10, boolean z11, boolean z12) {
        g0.p(this, j10, chatPosition, z10, z11, z12);
    }

    @Override
    public void x5(long j10, long j11) {
        g0.s(this, j10, j11);
    }

    @Override
    public void y1(long j10, long j11) {
        g0.r(this, j10, j11);
    }

    @Override
    public boolean yd(Bundle bundle, String str) {
        super.yd(bundle, str);
        bundle.putLong(str + "chat", x9().f7580a);
        return true;
    }
}
