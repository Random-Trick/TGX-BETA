package de;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import ce.j0;
import de.lj;
import de.qp;
import gd.w;
import hd.t2;
import he.i;
import java.util.ArrayList;
import k0.h;
import kb.j;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import ud.e2;
import ud.f2;
import ud.v4;
import zd.g0;
import zd.h0;
import zd.hj;
import zd.l1;
import zd.m1;
import zd.n1;
import zd.o1;
import zd.o6;
import zd.t7;
import zd.w7;
import zd.w8;
import zd.ya;

public class ww extends vo<b> implements View.OnClickListener, Client.g, v4.r, t7.i, w8.h, m1, o1, h0 {
    public iq D0;
    public ra E0;
    public int F0;
    public o6.p H0;
    public d I0;
    public TdApi.ConnectedWebsites J0;
    public c K0;
    public TdApi.PasswordState L0;
    public TdApi.AccountTtl M0;
    public int G0 = -1;
    public h<TdApi.UserPrivacySettingRules> N0 = new h<>();

    public class a extends iq {
        public a(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void R2(ra raVar, uc.c cVar, boolean z10) {
            boolean z11 = false;
            switch (raVar.j()) {
                case R.id.btn_2fa:
                    if (z10) {
                        if (ww.this.L0 != null) {
                            z11 = true;
                        }
                        cVar.setEnabledAnimated(z11);
                    } else {
                        if (ww.this.L0 != null) {
                            z11 = true;
                        }
                        cVar.setEnabled(z11);
                    }
                    cVar.setData(ww.this.fh());
                    return;
                case R.id.btn_accountTTL:
                    cVar.setData(ww.this.ah());
                    return;
                case R.id.btn_blockedSenders:
                    cVar.setData(ww.this.ch());
                    return;
                case R.id.btn_hideSecretChats:
                    cVar.getToggler().r(i.c2().I2(), z10);
                    return;
                case R.id.btn_incognitoMode:
                    cVar.getToggler().r(i.c2().Z2(), z10);
                    return;
                case R.id.btn_mapProvider:
                    cVar.setData(ww.this.eh(false));
                    return;
                case R.id.btn_mapProviderCloud:
                    cVar.setData(ww.this.eh(true));
                    return;
                case R.id.btn_passcode:
                    cVar.setData(he.d.w().s());
                    return;
                case R.id.btn_privacyRule:
                    cVar.setData(ww.this.Xg(((TdApi.UserPrivacySetting) raVar.d()).getConstructor()));
                    return;
                case R.id.btn_secretLinkPreviews:
                    cVar.getToggler().r(i.c2().S2(), z10);
                    return;
                case R.id.btn_sessions:
                    cVar.setData(ww.this.bh());
                    return;
                case R.id.btn_suggestContacts:
                    cVar.getToggler().r(!ww.this.f24495b.O1(), z10);
                    return;
                case R.id.btn_syncContacts:
                    cVar.getToggler().r(ww.this.f24495b.E4().S(), z10);
                    return;
                default:
                    return;
            }
        }
    }

    public static class b {
        public final boolean f9971a;

        public b(boolean z10) {
            this.f9971a = z10;
        }
    }

    public interface c {
        void d2(TdApi.PasswordState passwordState);
    }

    public interface d {
        void V2(TdApi.ConnectedWebsites connectedWebsites);
    }

    public ww(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public static String Yg(o6 o6Var, TdApi.UserPrivacySettingRules userPrivacySettingRules, int i10) {
        l1 z10 = l1.z(userPrivacySettingRules);
        if (z10 == null) {
            return w.i1(R.string.LoadingInformation);
        }
        return t2.Y1(o6Var, i10, z10);
    }

    public void lh(final o6.p pVar) {
        if (pVar != null) {
            wd(new Runnable() {
                @Override
                public final void run() {
                    ww.this.kh(pVar);
                }
            });
        }
    }

    public void mh(TdApi.Object object, TdApi.UserPrivacySetting userPrivacySetting) {
        if (!Sa()) {
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                j0.t0(object);
            } else if (constructor == 322477541) {
                Bh(userPrivacySetting.getConstructor(), (TdApi.UserPrivacySettingRules) object);
            }
        }
    }

    public void nh(final TdApi.UserPrivacySetting userPrivacySetting, final TdApi.Object object) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                ww.this.mh(object, userPrivacySetting);
            }
        });
    }

    public void oh() {
        if (!Sa()) {
            this.f24495b.v4().o(new TdApi.GetBlockedMessageSenders(0, 1), this);
        }
    }

    public void ph(int i10) {
        if (!Sa()) {
            this.D0.p3(i10);
        }
    }

    public static void qh(int[] iArr, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == -722616727) {
            int i10 = iArr[0] + 1;
            iArr[0] = i10;
            if (i10 == 2) {
                j0.y0(R.string.Done, 0);
            }
        }
    }

    public void rh(int i10, SparseIntArray sparseIntArray) {
        boolean z10 = false;
        boolean z11 = sparseIntArray.get(R.id.btn_clearShipping) == R.id.btn_clearShipping;
        if (sparseIntArray.get(R.id.btn_clearPayment) == R.id.btn_clearPayment) {
            z10 = true;
        }
        if (!z10 || !z11) {
            if (z11) {
                this.f24495b.v4().o(new TdApi.DeleteSavedOrderInfo(), this.f24495b.a5());
            }
            if (z10) {
                this.f24495b.v4().o(new TdApi.DeleteSavedCredentials(), this.f24495b.a5());
                return;
            }
            return;
        }
        final int[] iArr = new int[1];
        Client.g kwVar = new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                ww.qh(iArr, object);
            }
        };
        this.f24495b.v4().o(new TdApi.DeleteSavedOrderInfo(), kwVar);
        this.f24495b.v4().o(new TdApi.DeleteSavedCredentials(), kwVar);
    }

    public static boolean sh(e2 e2Var, View view, boolean z10) {
        if (z10) {
            return false;
        }
        SparseIntArray y02 = e2Var.f24134a.y0();
        return !(y02.get(R.id.btn_clearPayment) == R.id.btn_clearPayment) && !(y02.get(R.id.btn_clearShipping) == R.id.btn_clearShipping);
    }

    public boolean th(View view, int i10) {
        if (i10 == R.id.btn_suggestContacts) {
            this.f24495b.Wb(true);
            this.D0.p3(R.id.btn_suggestContacts);
        }
        return true;
    }

    public boolean uh(View view, int i10) {
        if (i10 != R.id.btn_resetContacts) {
            return true;
        }
        this.f24495b.E4().C();
        return true;
    }

    public boolean vh(View view, int i10) {
        if (i10 == R.id.btn_clearAllDrafts) {
            this.f24495b.v4().o(new TdApi.ClearAllDraftMessages(true), this.f24495b.a5());
        }
        return true;
    }

    public void wh(TdApi.UserPrivacySetting userPrivacySetting, TdApi.UserPrivacySettingRules userPrivacySettingRules) {
        if (!Sa()) {
            Bh(userPrivacySetting.getConstructor(), userPrivacySettingRules);
        }
    }

    public void xh(TdApi.Object object) {
        if (!Sa()) {
            switch (object.getConstructor()) {
                case TdApi.PasswordState.CONSTRUCTOR:
                    Ah((TdApi.PasswordState) object);
                    return;
                case TdApi.ConnectedWebsites.CONSTRUCTOR:
                    Dh((TdApi.ConnectedWebsites) object);
                    return;
                case TdApi.Error.CONSTRUCTOR:
                    j0.t0(object);
                    return;
                case TdApi.MessageSenders.CONSTRUCTOR:
                    int i10 = ((TdApi.MessageSenders) object).totalCount;
                    if (this.G0 != i10) {
                        this.G0 = i10;
                        this.D0.p3(R.id.btn_blockedSenders);
                        return;
                    }
                    return;
                case TdApi.AccountTtl.CONSTRUCTOR:
                    yh((TdApi.AccountTtl) object);
                    return;
                default:
                    Log.unexpectedTdlibResponse(object, TdApi.GetUser.class, TdApi.Users.class);
                    return;
            }
        }
    }

    @Override
    public void Ac() {
        super.Ac();
        int i10 = this.F0;
        if (i10 != 0) {
            this.D0.p3(i10);
            this.F0 = 0;
        }
    }

    public final void Ah(TdApi.PasswordState passwordState) {
        this.L0 = passwordState;
        this.D0.p3(R.id.btn_2fa);
        c cVar = this.K0;
        if (cVar != null) {
            cVar.d2(passwordState);
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

    public final void Bh(int i10, TdApi.UserPrivacySettingRules userPrivacySettingRules) {
        this.N0.j(i10, userPrivacySettingRules);
        iq iqVar = this.D0;
        if (iqVar != null) {
            iqVar.q3(i10);
        }
    }

    public final void kh(o6.p pVar) {
        this.H0 = pVar;
        this.D0.p3(R.id.btn_sessions);
    }

    public final void Dh(TdApi.ConnectedWebsites connectedWebsites) {
        this.J0 = connectedWebsites;
        this.D0.p3(R.id.btn_sessions);
        d dVar = this.I0;
        if (dVar != null) {
            dVar.V2(connectedWebsites);
        }
    }

    public void Eh(d dVar) {
        this.I0 = dVar;
    }

    @Override
    public void F5(o6 o6Var, TdApi.Session session) {
        n1.c(this, o6Var, session);
    }

    public void Fh(TdApi.PasswordState passwordState) {
        this.L0 = passwordState;
        this.D0.p3(R.id.btn_2fa);
    }

    public void Gh(ArrayList<TdApi.ConnectedWebsite> arrayList) {
        if (!Sa()) {
            this.J0.websites = new TdApi.ConnectedWebsite[arrayList.size()];
            arrayList.toArray(this.J0.websites);
            this.D0.p3(R.id.btn_sessions);
        }
    }

    @Override
    public void H0(long j10, String str) {
        g0.t(this, j10, str);
    }

    @Override
    public void H5(o6 o6Var, TdApi.Session session) {
        n1.a(this, o6Var, session);
    }

    @Override
    public void M1(TdApi.User user) {
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
        return R.id.controller_privacySettings;
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
        return w.i1(jh() ? R.string.Privacy : R.string.PrivacySettings);
    }

    public final String Xg(int i10) {
        return Yg(this.f24495b, this.N0.e(i10), i10);
    }

    @Override
    public void Y(long j10, TdApi.Message message) {
        g0.v(this, j10, message);
    }

    @Override
    public void Y1(final TdApi.UserPrivacySetting userPrivacySetting, final TdApi.UserPrivacySettingRules userPrivacySettingRules) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                ww.this.wh(userPrivacySetting, userPrivacySettingRules);
            }
        });
    }

    @Override
    public void Z8() {
        super.Z8();
        this.f24495b.e2().a0(this);
        this.f24495b.E4().j0(this);
        this.f24495b.O9().o0(this);
    }

    public final void Zg() {
        this.f24495b.c6(true, new j() {
            @Override
            public final void a(Object obj) {
                ww.this.lh((o6.p) obj);
            }
        });
    }

    @Override
    public void a0(long j10, TdApi.MessageSender messageSender) {
        g0.f(this, j10, messageSender);
    }

    public CharSequence ah() {
        TdApi.AccountTtl accountTtl = this.M0;
        if (accountTtl == null) {
            return w.i1(R.string.LoadingInformation);
        }
        int i10 = accountTtl.days;
        if (i10 < 30) {
            return w.q2(R.string.DeleteAccountIfAwayForDays, i10);
        }
        int i11 = i10 / 30;
        if (i11 < 12) {
            return w.q2(R.string.DeleteAccountIfAwayForMonths, i11);
        }
        return w.q2(R.string.DeleteAccountIfAwayForYears, i11 / 12);
    }

    @Override
    public void b2(long j10, TdApi.DraftMessage draftMessage) {
        g0.g(this, j10, draftMessage);
    }

    public final CharSequence bh() {
        o6.p pVar = this.H0;
        if (pVar == null) {
            return w.i1(R.string.LoadingInformation);
        }
        CharSequence q22 = w.q2(R.string.xSessions, pVar.f28169h);
        TdApi.ConnectedWebsites connectedWebsites = this.J0;
        if (connectedWebsites == null) {
            return q22;
        }
        TdApi.ConnectedWebsite[] connectedWebsiteArr = connectedWebsites.websites;
        return connectedWebsiteArr.length == 0 ? q22 : w.k0(R.string.format_sessionsAndWebsites, q22, w.q2(R.string.xWebsites, connectedWebsiteArr.length));
    }

    @Override
    public void c1(long j10, TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        g0.m(this, j10, chatJoinRequestsInfo);
    }

    public final CharSequence ch() {
        int i10;
        int i11 = this.G0;
        if (i11 == -1) {
            i10 = R.string.LoadingInformation;
        } else if (i11 > 0) {
            return w.q2(R.string.xSenders, i11);
        } else {
            i10 = R.string.BlockedNone;
        }
        return w.i1(i10);
    }

    public TdApi.PasswordState dh() {
        return this.L0;
    }

    @Override
    public void e7(long j10, int i10) {
        g0.k(this, j10, i10);
    }

    public final String eh(boolean z10) {
        int g12 = i.c2().g1(z10);
        if (g12 == 0) {
            return w.i1(R.string.MapPreviewProviderNone);
        }
        if (g12 == 1) {
            return w.i1(R.string.MapPreviewProviderTelegram);
        }
        if (g12 != 2) {
            return w.i1(R.string.MapPreviewProviderUnset);
        }
        return w.i1(R.string.MapPreviewProviderGoogle);
    }

    @Override
    public void f4(long j10, String str) {
        g0.d(this, j10, str);
    }

    @Override
    public void f5(long j10, String str) {
        g0.u(this, j10, str);
    }

    public final String fh() {
        TdApi.PasswordState passwordState = this.L0;
        return w.i1(passwordState != null ? passwordState.hasPassword ? R.string.PasswordEnabled : passwordState.recoveryEmailAddressCodeInfo != null ? R.string.AwaitingEmailConfirmation : R.string.PasswordDisabled : R.string.LoadingInformation);
    }

    public final void gh(final TdApi.UserPrivacySetting userPrivacySetting) {
        this.f24495b.v4().o(new TdApi.GetUserPrivacySettingRules(userPrivacySetting), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                ww.this.nh(userPrivacySetting, object);
            }
        });
    }

    @Override
    public void h1(o6 o6Var, boolean z10) {
        Zg();
    }

    public final int hh() {
        return this.f24495b.E4().S() ? R.string.SyncContactsInfoOn : R.string.SyncContactsInfoOff;
    }

    public TdApi.ConnectedWebsites ih() {
        return this.J0;
    }

    @Override
    public void j(o6 o6Var, boolean z10) {
        this.D0.p3(R.id.btn_syncContacts);
        int O0 = this.D0.O0(R.id.btn_syncContactsInfo);
        if (O0 != -1) {
            this.D0.D0().get(O0).W(hh());
            this.D0.r3(O0);
        }
    }

    public final boolean jh() {
        return w9() != null && x9().f9971a;
    }

    @Override
    public void k3(long j10, TdApi.VideoChat videoChat) {
        g0.y(this, j10, videoChat);
    }

    @Override
    public void l0(long j10, int i10, boolean z10) {
        g0.w(this, j10, i10, z10);
    }

    @Override
    public void l6(int i10, SparseIntArray sparseIntArray) {
        if (i10 == R.id.btn_accountTTL && sparseIntArray.size() == 1) {
            int i11 = 0;
            switch (sparseIntArray.valueAt(0)) {
                case R.id.btn_1month:
                    i11 = 31;
                    break;
                case R.id.btn_1year:
                    i11 = 366;
                    break;
                case R.id.btn_3months:
                    i11 = 91;
                    break;
                case R.id.btn_6month:
                    i11 = 181;
                    break;
            }
            if (i11 >= 30) {
                TdApi.AccountTtl accountTtl = this.M0;
                if (accountTtl == null || accountTtl.days != i11) {
                    this.M0 = new TdApi.AccountTtl(i11);
                    this.f24495b.v4().o(new TdApi.SetAccountTtl(this.M0), this.f24495b.na());
                    this.D0.p3(R.id.btn_accountTTL);
                }
            }
        }
    }

    @Override
    public void onClick(View view) {
        final int id2 = view.getId();
        int i10 = 1;
        switch (id2) {
            case R.id.btn_2fa:
                TdApi.PasswordState passwordState = this.L0;
                if (passwordState == null) {
                    return;
                }
                if (!passwordState.hasPassword) {
                    qp qpVar = new qp(this.f24493a, this.f24495b);
                    qpVar.ih(new qp.b(this, null, null));
                    ac(qpVar);
                    return;
                }
                lj ljVar = new lj(this.f24493a, this.f24495b);
                ljVar.bg(new lj.a(2, this.L0));
                ac(ljVar);
                return;
            case R.id.btn_accountTTL:
                TdApi.AccountTtl accountTtl = this.M0;
                int i11 = (accountTtl != null ? accountTtl.days : 0) / 30;
                int i12 = i11 / 12;
                ra[] raVarArr = new ra[4];
                raVarArr[0] = new ra(13, (int) R.id.btn_1month, 0, w.q2(R.string.xMonths, 1L), (int) R.id.btn_accountTTL, i11 == 1);
                raVarArr[1] = new ra(13, (int) R.id.btn_3months, 0, w.q2(R.string.xMonths, 3L), (int) R.id.btn_accountTTL, i11 == 3);
                raVarArr[2] = new ra(13, (int) R.id.btn_6month, 0, w.q2(R.string.xMonths, 6L), (int) R.id.btn_accountTTL, i11 == 6);
                raVarArr[3] = new ra(13, (int) R.id.btn_1year, 0, w.q2(R.string.xYears, 1L), (int) R.id.btn_accountTTL, i12 == 1);
                ne(id2, raVarArr, this);
                return;
            case R.id.btn_blockedSenders:
                v4<?> pqVar = new pq(this.f24493a, this.f24495b);
                pqVar.Ad(this);
                ac(pqVar);
                return;
            case R.id.btn_clearAllDrafts:
                ee(w.i1(R.string.AreYouSureClearDrafts), new int[]{R.id.btn_clearAllDrafts, R.id.btn_cancel}, new String[]{w.i1(R.string.PrivacyDeleteCloudDrafts), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new ie.h0() {
                    @Override
                    public boolean P() {
                        return ie.g0.a(this);
                    }

                    @Override
                    public Object a2(int i13) {
                        return ie.g0.b(this, i13);
                    }

                    @Override
                    public final boolean r3(View view2, int i13) {
                        boolean vh;
                        vh = ww.this.vh(view2, i13);
                        return vh;
                    }
                });
                return;
            case R.id.btn_clearPaymentAndShipping:
                me(new f2(R.id.btn_clearPaymentAndShipping).r(R.string.Clear).p(new ra[]{new ra(12, (int) R.id.btn_clearShipping, 0, (int) R.string.PrivacyClearShipping, (int) R.id.btn_clearShipping, true), new ra(12, (int) R.id.btn_clearPayment, 0, (int) R.string.PrivacyClearPayment, (int) R.id.btn_clearPayment, true)}).q(R.id.theme_color_textNegative).b(w.i1(R.string.PrivacyPaymentsClearAlert)).j(new v4.r() {
                    @Override
                    public final void l6(int i13, SparseIntArray sparseIntArray) {
                        ww.this.rh(i13, sparseIntArray);
                    }
                }).m(lw.f8684a));
                return;
            case R.id.btn_hideSecretChats:
                boolean S2 = this.D0.S2(view);
                boolean Z4 = i.c2().Z4(S2);
                ra raVar = this.E0;
                if (raVar != null) {
                    raVar.W(S2 ? R.string.HideSecretOn : R.string.HideSecretOff);
                    this.D0.n3(this.E0);
                }
                if (Z4) {
                    ya.o1().q2();
                    return;
                }
                return;
            case R.id.btn_incognitoMode:
                i.c2().N4(this.D0.S2(view) ? 1 : 0);
                return;
            case R.id.btn_mapProvider:
            case R.id.btn_mapProviderCloud:
                hj hd2 = this.f24495b.hd();
                if (id2 == R.id.btn_mapProviderCloud) {
                    i10 = 2;
                }
                hd2.F8(this, i10, new Runnable() {
                    @Override
                    public final void run() {
                        ww.this.ph(id2);
                    }
                });
                return;
            case R.id.btn_passcode:
                this.F0 = id2;
                if (he.d.w().x()) {
                    ii iiVar = new ii(this.f24493a, this.f24495b);
                    iiVar.Kf(2);
                    ac(iiVar);
                    return;
                }
                ac(new mi(this.f24493a, this.f24495b));
                return;
            case R.id.btn_privacyRule:
                v4<?> axVar = new ax(this.f24493a, this.f24495b);
                axVar.Ad((TdApi.UserPrivacySetting) ((ra) view.getTag()).d());
                ac(axVar);
                return;
            case R.id.btn_resetContacts:
                ee(w.i1(R.string.SyncContactsDeleteInfo), new int[]{R.id.btn_resetContacts, R.id.btn_cancel}, new String[]{w.i1(R.string.SyncContactsDeleteButton), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new ie.h0() {
                    @Override
                    public boolean P() {
                        return ie.g0.a(this);
                    }

                    @Override
                    public Object a2(int i13) {
                        return ie.g0.b(this, i13);
                    }

                    @Override
                    public final boolean r3(View view2, int i13) {
                        boolean uh;
                        uh = ww.this.uh(view2, i13);
                        return uh;
                    }
                });
                return;
            case R.id.btn_secretLinkPreviews:
                i.c2().N5(this.D0.S2(view));
                return;
            case R.id.btn_sessions:
                this.F0 = id2;
                dy dyVar = new dy(this.f24493a, this.f24495b);
                qz qzVar = new qz(this.f24493a, this.f24495b);
                qzVar.bh(this);
                ac(new h20(this.f24493a, this.f24495b, new v4[]{dyVar, qzVar}, new String[]{w.i1(R.string.Devices).toUpperCase(), w.i1(R.string.Websites).toUpperCase()}, false));
                return;
            case R.id.btn_suggestContacts:
                uc.c cVar = (uc.c) view;
                if (cVar.getToggler().isEnabled()) {
                    ee(w.i1(R.string.SuggestContactsAlert), new int[]{R.id.btn_suggestContacts, R.id.btn_cancel}, new String[]{w.i1(R.string.SuggestContactsDone), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new ie.h0() {
                        @Override
                        public boolean P() {
                            return ie.g0.a(this);
                        }

                        @Override
                        public Object a2(int i13) {
                            return ie.g0.b(this, i13);
                        }

                        @Override
                        public final boolean r3(View view2, int i13) {
                            boolean th;
                            th = ww.this.th(view2, i13);
                            return th;
                        }
                    });
                    return;
                } else {
                    this.f24495b.Wb(!cVar.getToggler().t(true));
                    return;
                }
            case R.id.btn_syncContacts:
                if (this.f24495b.E4().S()) {
                    this.f24495b.E4().E();
                    return;
                } else {
                    this.f24495b.E4().F(this.f24493a);
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public void p6(long j10, boolean z10) {
        g0.h(this, j10, z10);
    }

    @Override
    public boolean pg() {
        return true;
    }

    @Override
    public void q2(long j10, boolean z10) {
        g0.e(this, j10, z10);
    }

    @Override
    public void r0(o6 o6Var, int i10) {
        n1.b(this, o6Var, i10);
    }

    @Override
    public void r2(final TdApi.Object object) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                ww.this.xh(object);
            }
        });
    }

    @Override
    public void r7(o6 o6Var, TdApi.Session session) {
        n1.d(this, o6Var, session);
    }

    @Override
    public void rg(Context context, CustomRecyclerView customRecyclerView) {
        this.D0 = new a(this);
        ArrayList arrayList = new ArrayList();
        if (!jh()) {
            arrayList.add(new ra(14));
            arrayList.add(new ra(8, 0, 0, R.string.SecurityTitle));
            arrayList.add(new ra(2));
            arrayList.add(new ra(5, R.id.btn_sessions, R.drawable.baseline_devices_other_24, R.string.SessionsTitle));
            arrayList.add(new ra(11));
            arrayList.add(new ra(5, R.id.btn_passcode, R.drawable.baseline_lock_24, R.string.PasscodeTitle));
            arrayList.add(new ra(11));
            arrayList.add(new ra(5, R.id.btn_2fa, R.drawable.mrgrigri_baseline_textbox_password_24, R.string.TwoStepVerification));
            arrayList.add(new ra(3));
            arrayList.add(new ra(8, 0, 0, R.string.PrivacyTitle));
            arrayList.add(new ra(2));
            arrayList.add(new ra(89, R.id.btn_blockedSenders, R.drawable.baseline_remove_circle_24, R.string.BlockedSenders));
        }
        TdApi.UserPrivacySetting[] userPrivacySettingArr = {new TdApi.UserPrivacySettingShowStatus(), new TdApi.UserPrivacySettingShowProfilePhoto(), new TdApi.UserPrivacySettingShowPhoneNumber(), new TdApi.UserPrivacySettingAllowFindingByPhoneNumber(), new TdApi.UserPrivacySettingShowLinkInForwardedMessages(), new TdApi.UserPrivacySettingAllowChatInvites(), new TdApi.UserPrivacySettingAllowCalls(), new TdApi.UserPrivacySettingAllowPeerToPeerCalls()};
        for (int i10 = 0; i10 < 8; i10++) {
            TdApi.UserPrivacySetting userPrivacySetting = userPrivacySettingArr[i10];
            if (!arrayList.isEmpty()) {
                if (userPrivacySetting.getConstructor() == 1862829310) {
                    arrayList.add(new ra(11));
                } else if (userPrivacySetting.getConstructor() == -1846645423) {
                    arrayList.add(new ra(3));
                    arrayList.add(new ra(9, 0, 0, R.string.EditPrivacyHint));
                    arrayList.add(new ra(2));
                } else {
                    arrayList.add(new ra(11));
                }
            }
            arrayList.add(new ra(89, R.id.btn_privacyRule, ax.Jg(userPrivacySetting), ax.Kg(userPrivacySetting, false, false)).G(userPrivacySetting).N(userPrivacySetting.getConstructor()));
            gh(userPrivacySetting);
        }
        arrayList.add(new ra(3));
        arrayList.add(new ra(9, 0, 0, R.string.PeerToPeerInfo));
        if (!jh()) {
            arrayList.add(new ra(8, 0, 0, R.string.Contacts));
            arrayList.add(new ra(2));
            arrayList.add(new ra(7, R.id.btn_suggestContacts, 0, R.string.SuggestContacts));
            arrayList.add(new ra(11));
            arrayList.add(new ra(4, R.id.btn_resetContacts, 0, R.string.SyncContactsDelete));
            arrayList.add(new ra(11));
            arrayList.add(new ra(7, R.id.btn_syncContacts, 0, R.string.SyncContacts));
            arrayList.add(new ra(3));
            arrayList.add(new ra(9, R.id.btn_syncContactsInfo, 0, hh()));
            arrayList.add(new ra(8, 0, 0, R.string.PrivacyBots));
            arrayList.add(new ra(2));
            arrayList.add(new ra(4, (int) R.id.btn_clearPaymentAndShipping, 0, (int) R.string.PrivacyPaymentsClear, false));
            arrayList.add(new ra(3));
            arrayList.add(new ra(8, 0, 0, R.string.SecretChats));
            arrayList.add(new ra(2));
            arrayList.add(new ra(7, R.id.btn_secretLinkPreviews, 0, R.string.SecretWebPage));
            arrayList.add(new ra(3));
            arrayList.add(new ra(9, 0, 0, R.string.SecretWebPageInfo));
            arrayList.add(new ra(2));
            arrayList.add(new ra(7, R.id.btn_hideSecretChats, 0, R.string.HideSecret));
            arrayList.add(new ra(3));
            ra raVar = new ra(9, 0, 0, i.c2().I2() ? R.string.HideSecretOn : R.string.HideSecretOff);
            this.E0 = raVar;
            arrayList.add(raVar);
            arrayList.add(new ra(2));
            arrayList.add(new ra(7, R.id.btn_incognitoMode, 0, R.string.IncognitoKeyboard));
            arrayList.add(new ra(3));
            arrayList.add(new ra(9, 0, 0, R.string.IncognitoKeyboardInfo));
            arrayList.add(new ra(2));
            arrayList.add(new ra(89, R.id.btn_mapProvider, 0, R.string.MapPreviewProvider));
            arrayList.add(new ra(3));
            arrayList.add(new ra(9, 0, 0, R.string.MapPreviewProviderInfo));
            arrayList.add(new ra(8, 0, 0, R.string.PrivacyAdvanced));
            arrayList.add(new ra(2));
            arrayList.add(new ra(4, R.id.btn_clearAllDrafts, 0, R.string.PrivacyDeleteCloudDrafts));
            arrayList.add(new ra(11));
            arrayList.add(new ra(89, R.id.btn_accountTTL, 0, R.string.DeleteAccountIfAwayFor2));
            arrayList.add(new ra(3));
            arrayList.add(new ra(9, 0, 0, R.string.DeleteAccountHelp));
        }
        this.D0.s2(arrayList, false);
        customRecyclerView.setAdapter(this.D0);
        this.f24495b.v4().o(new TdApi.GetBlockedMessageSenders(0, 1), this);
        Zg();
        this.f24495b.v4().o(new TdApi.GetPasswordState(), this);
        this.f24495b.v4().o(new TdApi.GetAccountTtl(), this);
        this.f24495b.v4().o(new TdApi.GetConnectedWebsites(), this);
        this.f24495b.e2().z1(this);
        this.f24495b.E4().w(this);
        this.f24495b.O9().a0(this);
    }

    @Override
    public boolean sd(Bundle bundle, String str) {
        super.sd(bundle, str);
        Ad(new b(bundle.getBoolean(str + "only", false)));
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
        vd(new Runnable() {
            @Override
            public final void run() {
                ww.this.oh();
            }
        }, 350L);
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
        bundle.putBoolean(str + "only", w9() != null && w9().f9971a);
        return true;
    }

    public final void yh(TdApi.AccountTtl accountTtl) {
        this.M0 = accountTtl;
        this.D0.p3(R.id.btn_accountTTL);
    }

    public void zh(c cVar) {
        this.K0 = cVar;
    }
}
