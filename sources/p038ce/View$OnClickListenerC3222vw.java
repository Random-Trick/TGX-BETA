package p038ce;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import be.C1379j0;
import gd.C4779t2;
import ge.C4862d;
import ge.C4868i;
import java.util.ArrayList;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import p038ce.View$OnClickListenerC2665lj;
import p038ce.View$OnClickListenerC2937qp;
import p082fd.C4403w;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p139jb.AbstractC5918j;
import p143k0.C6038h;
import p350yd.AbstractC10747j0;
import p350yd.AbstractC10883o1;
import p350yd.AbstractC10925q1;
import p350yd.C10536ab;
import p350yd.C10721i0;
import p350yd.C10862n1;
import p350yd.C10904p1;
import p350yd.C10930q6;
import p350yd.C11059v7;
import p350yd.C11133y7;
import p350yd.C11134y8;
import p350yd.HandlerC10770jj;
import tc.C9137c;
import td.AbstractC9323v4;
import td.C9180e2;
import td.C9188f2;

public class View$OnClickListenerC3222vw extends AbstractC3204vo<C3224b> implements View.OnClickListener, Client.AbstractC7865g, AbstractC9323v4.AbstractC9343r, C11059v7.AbstractC11068i, C11134y8.AbstractC11143h, AbstractC10883o1, AbstractC10925q1, AbstractC10747j0 {
    public C2546iq f10760D0;
    public C2964ra f10761E0;
    public int f10762F0;
    public C10930q6.C10946p f10764H0;
    public AbstractC3226d f10765I0;
    public TdApi.ConnectedWebsites f10766J0;
    public AbstractC3225c f10767K0;
    public TdApi.PasswordState f10768L0;
    public TdApi.AccountTtl f10769M0;
    public int f10763G0 = -1;
    public C6038h<TdApi.UserPrivacySettingRules> f10770N0 = new C6038h<>();

    public class C3223a extends C2546iq {
        public C3223a(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo394V2(C2964ra raVar, C9137c cVar, boolean z) {
            boolean z2 = false;
            switch (raVar.m32835j()) {
                case R.id.btn_2fa:
                    if (z) {
                        if (View$OnClickListenerC3222vw.this.f10768L0 != null) {
                            z2 = true;
                        }
                        cVar.setEnabledAnimated(z2);
                    } else {
                        if (View$OnClickListenerC3222vw.this.f10768L0 != null) {
                            z2 = true;
                        }
                        cVar.setEnabled(z2);
                    }
                    cVar.setData(View$OnClickListenerC3222vw.this.m31084fh());
                    return;
                case R.id.btn_accountTTL:
                    cVar.setData(View$OnClickListenerC3222vw.this.m31089ah());
                    return;
                case R.id.btn_blockedSenders:
                    cVar.setData(View$OnClickListenerC3222vw.this.m31087ch());
                    return;
                case R.id.btn_hideSecretChats:
                    cVar.getToggler().m10186r(C4868i.m24726c2().m24868I2(), z);
                    return;
                case R.id.btn_incognitoMode:
                    cVar.getToggler().m10186r(C4868i.m24726c2().m24749Z2(), z);
                    return;
                case R.id.btn_mapProvider:
                    cVar.setData(View$OnClickListenerC3222vw.this.m31085eh(false));
                    return;
                case R.id.btn_mapProviderCloud:
                    cVar.setData(View$OnClickListenerC3222vw.this.m31085eh(true));
                    return;
                case R.id.btn_passcode:
                    cVar.setData(C4862d.m24934w().m24938s());
                    return;
                case R.id.btn_privacyRule:
                    cVar.setData(View$OnClickListenerC3222vw.this.m31092Xg(((TdApi.UserPrivacySetting) raVar.m32844d()).getConstructor()));
                    return;
                case R.id.btn_secretLinkPreviews:
                    cVar.getToggler().m10186r(C4868i.m24726c2().m24798S2(), z);
                    return;
                case R.id.btn_sessions:
                    cVar.setData(View$OnClickListenerC3222vw.this.m31088bh());
                    return;
                case R.id.btn_suggestContacts:
                    cVar.getToggler().m10186r(!View$OnClickListenerC3222vw.this.f30167b.m2725O1(), z);
                    return;
                case R.id.btn_syncContacts:
                    cVar.getToggler().m10186r(View$OnClickListenerC3222vw.this.f30167b.m2946A4().m1419S(), z);
                    return;
                default:
                    return;
            }
        }
    }

    public static class C3224b {
        public final boolean f10772a;

        public C3224b(boolean z) {
            this.f10772a = z;
        }
    }

    public interface AbstractC3225c {
        void mo31061f2(TdApi.PasswordState passwordState);
    }

    public interface AbstractC3226d {
        void mo31060g3(TdApi.ConnectedWebsites connectedWebsites);
    }

    public View$OnClickListenerC3222vw(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public static String m31091Yg(C10930q6 q6Var, TdApi.UserPrivacySettingRules userPrivacySettingRules, int i) {
        C10862n1 z = C10862n1.m2969z(userPrivacySettingRules);
        if (z == null) {
            return C4403w.m27869i1(R.string.LoadingInformation);
        }
        return C4779t2.m25569Y1(q6Var, i, z);
    }

    public void m31078lh(final C10930q6.C10946p pVar) {
        if (pVar != null) {
            m9135wd(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3222vw.this.m31079kh(pVar);
                }
            });
        }
    }

    public void m31077mh(TdApi.Object object, TdApi.UserPrivacySetting userPrivacySetting) {
        if (!m9347Sa()) {
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                C1379j0.m37302t0(object);
            } else if (constructor == 322477541) {
                m31119Bh(userPrivacySetting.getConstructor(), (TdApi.UserPrivacySettingRules) object);
            }
        }
    }

    public void m31076nh(final TdApi.UserPrivacySetting userPrivacySetting, final TdApi.Object object) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3222vw.this.m31077mh(object, userPrivacySetting);
            }
        });
    }

    public void m31075oh() {
        if (!m9347Sa()) {
            this.f30167b.m2270r4().m14783o(new TdApi.GetBlockedMessageSenders(0, 1), this);
        }
    }

    public void m31073ph(int i) {
        if (!m9347Sa()) {
            this.f10760D0.m34130s3(i);
        }
    }

    public static void m31072qh(int[] iArr, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        } else if (constructor == -722616727) {
            int i = iArr[0] + 1;
            iArr[0] = i;
            if (i == 2) {
                C1379j0.m37292y0(R.string.Done, 0);
            }
        }
    }

    public void m31071rh(int i, SparseIntArray sparseIntArray) {
        boolean z = false;
        boolean z2 = sparseIntArray.get(R.id.btn_clearShipping) == R.id.btn_clearShipping;
        if (sparseIntArray.get(R.id.btn_clearPayment) == R.id.btn_clearPayment) {
            z = true;
        }
        if (!z || !z2) {
            if (z2) {
                this.f30167b.m2270r4().m14783o(new TdApi.DeleteSavedOrderInfo(), this.f30167b.m2600W4());
            }
            if (z) {
                this.f30167b.m2270r4().m14783o(new TdApi.DeleteSavedCredentials(), this.f30167b.m2600W4());
                return;
            }
            return;
        }
        final int[] iArr = new int[1];
        Client.AbstractC7865g jwVar = new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC3222vw.m31072qh(iArr, object);
            }
        };
        this.f30167b.m2270r4().m14783o(new TdApi.DeleteSavedOrderInfo(), jwVar);
        this.f30167b.m2270r4().m14783o(new TdApi.DeleteSavedCredentials(), jwVar);
    }

    public static boolean m31070sh(C9180e2 e2Var, View view, boolean z) {
        if (z) {
            return false;
        }
        SparseIntArray A0 = e2Var.f29637a.m34252A0();
        return !(A0.get(R.id.btn_clearPayment) == R.id.btn_clearPayment) && !(A0.get(R.id.btn_clearShipping) == R.id.btn_clearShipping);
    }

    public boolean m31069th(View view, int i) {
        if (i == R.id.btn_suggestContacts) {
            this.f30167b.m2653Sb(true);
            this.f10760D0.m34130s3(R.id.btn_suggestContacts);
        }
        return true;
    }

    public boolean m31068uh(View view, int i) {
        if (i != R.id.btn_resetContacts) {
            return true;
        }
        this.f30167b.m2946A4().m1435C();
        return true;
    }

    public boolean m31067vh(View view, int i) {
        if (i == R.id.btn_clearAllDrafts) {
            this.f30167b.m2270r4().m14783o(new TdApi.ClearAllDraftMessages(true), this.f30167b.m2600W4());
        }
        return true;
    }

    public void m31066wh(TdApi.UserPrivacySetting userPrivacySetting, TdApi.UserPrivacySettingRules userPrivacySettingRules) {
        if (!m9347Sa()) {
            m31119Bh(userPrivacySetting.getConstructor(), userPrivacySettingRules);
        }
    }

    public void m31065xh(TdApi.Object object) {
        if (!m9347Sa()) {
            switch (object.getConstructor()) {
                case TdApi.PasswordState.CONSTRUCTOR:
                    m31121Ah((TdApi.PasswordState) object);
                    return;
                case TdApi.ConnectedWebsites.CONSTRUCTOR:
                    m31115Dh((TdApi.ConnectedWebsites) object);
                    return;
                case TdApi.Error.CONSTRUCTOR:
                    C1379j0.m37302t0(object);
                    return;
                case TdApi.MessageSenders.CONSTRUCTOR:
                    int i = ((TdApi.MessageSenders) object).totalCount;
                    if (this.f10763G0 != i) {
                        this.f10763G0 = i;
                        this.f10760D0.m34130s3(R.id.btn_blockedSenders);
                        return;
                    }
                    return;
                case TdApi.AccountTtl.CONSTRUCTOR:
                    m31064yh((TdApi.AccountTtl) object);
                    return;
                default:
                    Log.unexpectedTdlibResponse(object, TdApi.GetUser.class, TdApi.Users.class);
                    return;
            }
        }
    }

    @Override
    public void mo9477Ac() {
        super.mo9477Ac();
        int i = this.f10762F0;
        if (i != 0) {
            this.f10760D0.m34130s3(i);
            this.f10762F0 = 0;
        }
    }

    public final void m31121Ah(TdApi.PasswordState passwordState) {
        this.f10768L0 = passwordState;
        this.f10760D0.m34130s3(R.id.btn_2fa);
        AbstractC3225c cVar = this.f10767K0;
        if (cVar != null) {
            cVar.mo31061f2(passwordState);
        }
    }

    @Override
    public void mo4076B4(long j, String[] strArr) {
        C10721i0.m4195b(this, j, strArr);
    }

    public final void m31119Bh(int i, TdApi.UserPrivacySettingRules userPrivacySettingRules) {
        this.f10770N0.m21466j(i, userPrivacySettingRules);
        C2546iq iqVar = this.f10760D0;
        if (iqVar != null) {
            iqVar.m34127t3(i);
        }
    }

    @Override
    public void mo4075C5(long j, long j2) {
        C10721i0.m4178s(this, j, j2);
    }

    public final void m31079kh(C10930q6.C10946p pVar) {
        this.f10764H0 = pVar;
        this.f10760D0.m34130s3(R.id.btn_sessions);
    }

    public final void m31115Dh(TdApi.ConnectedWebsites connectedWebsites) {
        this.f10766J0 = connectedWebsites;
        this.f10760D0.m34130s3(R.id.btn_sessions);
        AbstractC3226d dVar = this.f10765I0;
        if (dVar != null) {
            dVar.mo31060g3(connectedWebsites);
        }
    }

    @Override
    public void mo2957E6(C10930q6 q6Var, TdApi.Session session) {
        C10904p1.m2961a(this, q6Var, session);
    }

    public void m31113Eh(AbstractC3226d dVar) {
        this.f10765I0 = dVar;
    }

    public void m31111Fh(TdApi.PasswordState passwordState) {
        this.f10768L0 = passwordState;
        this.f10760D0.m34130s3(R.id.btn_2fa);
    }

    @Override
    public void mo4074G5(long j, int i, boolean z) {
        C10721i0.m4173x(this, j, i, z);
    }

    public void m31109Gh(ArrayList<TdApi.ConnectedWebsite> arrayList) {
        if (!m9347Sa()) {
            this.f10766J0.websites = new TdApi.ConnectedWebsite[arrayList.size()];
            arrayList.toArray(this.f10766J0.websites);
            this.f10760D0.m34130s3(R.id.btn_sessions);
        }
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
    public void mo2956O5(C10930q6 q6Var, TdApi.Session session) {
        C10904p1.m2959c(this, q6Var, session);
    }

    @Override
    public void mo1348P1(TdApi.User user) {
    }

    @Override
    public void mo4070R1(long j, boolean z) {
        C10721i0.m4187j(this, j, z);
    }

    @Override
    public int mo407R9() {
        return R.id.controller_privacySettings;
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
    public void mo2955X0(C10930q6 q6Var, TdApi.Session session) {
        C10904p1.m2958d(this, q6Var, session);
    }

    @Override
    public CharSequence mo9313X9() {
        return C4403w.m27869i1(m31080jh() ? R.string.Privacy : R.string.PrivacySettings);
    }

    public final String m31092Xg(int i) {
        return m31091Yg(this.f30167b, this.f10770N0.m21471e(i), i);
    }

    @Override
    public void mo4067Y(long j, TdApi.Message message) {
        C10721i0.m4175v(this, j, message);
    }

    @Override
    public void mo1353Y6(C10930q6 q6Var, boolean z) {
        this.f10760D0.m34130s3(R.id.btn_syncContacts);
        int Q0 = this.f10760D0.m34218Q0(R.id.btn_syncContactsInfo);
        if (Q0 != -1) {
            this.f10760D0.m34240F0().get(Q0).m32854W(m31082hh());
            this.f10760D0.m34124u3(Q0);
        }
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        this.f30167b.m2480e2().m1667a0(this);
        this.f30167b.m2946A4().m1392j0(this);
        this.f30167b.m2781K9().m1826o0(this);
    }

    public final void m31090Zg() {
        this.f30167b.m2569Y5(true, new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                View$OnClickListenerC3222vw.this.m31078lh((C10930q6.C10946p) obj);
            }
        });
    }

    @Override
    public void mo4066a0(long j, TdApi.MessageSender messageSender) {
        C10721i0.m4191f(this, j, messageSender);
    }

    @Override
    public void mo2964a2(final TdApi.UserPrivacySetting userPrivacySetting, final TdApi.UserPrivacySettingRules userPrivacySettingRules) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3222vw.this.m31066wh(userPrivacySetting, userPrivacySettingRules);
            }
        });
    }

    public CharSequence m31089ah() {
        TdApi.AccountTtl accountTtl = this.f10769M0;
        if (accountTtl == null) {
            return C4403w.m27869i1(R.string.LoadingInformation);
        }
        int i = accountTtl.days;
        if (i < 30) {
            return C4403w.m27836q2(R.string.DeleteAccountIfAwayForDays, i);
        }
        int i2 = i / 30;
        if (i2 < 12) {
            return C4403w.m27836q2(R.string.DeleteAccountIfAwayForMonths, i2);
        }
        return C4403w.m27836q2(R.string.DeleteAccountIfAwayForYears, i2 / 12);
    }

    public final CharSequence m31088bh() {
        C10930q6.C10946p pVar = this.f10764H0;
        if (pVar == null) {
            return C4403w.m27869i1(R.string.LoadingInformation);
        }
        CharSequence q2 = C4403w.m27836q2(R.string.xSessions, pVar.f35180h);
        TdApi.ConnectedWebsites connectedWebsites = this.f10766J0;
        if (connectedWebsites == null) {
            return q2;
        }
        TdApi.ConnectedWebsite[] connectedWebsiteArr = connectedWebsites.websites;
        return connectedWebsiteArr.length == 0 ? q2 : C4403w.m27862k0(R.string.format_sessionsAndWebsites, q2, C4403w.m27836q2(R.string.xWebsites, connectedWebsiteArr.length));
    }

    @Override
    public void mo4065c2(long j, TdApi.DraftMessage draftMessage) {
        C10721i0.m4190g(this, j, draftMessage);
    }

    @Override
    public void mo2954c3(C10930q6 q6Var, int i) {
        C10904p1.m2960b(this, q6Var, i);
    }

    @Override
    public void mo4064c4(long j, TdApi.ChatPhotoInfo chatPhotoInfo) {
        C10721i0.m4182o(this, j, chatPhotoInfo);
    }

    @Override
    public void mo2953c7(C10930q6 q6Var, boolean z) {
        m31090Zg();
    }

    public final CharSequence m31087ch() {
        int i;
        int i2 = this.f10763G0;
        if (i2 == -1) {
            i = R.string.LoadingInformation;
        } else if (i2 > 0) {
            return C4403w.m27836q2(R.string.xSenders, i2);
        } else {
            i = R.string.BlockedNone;
        }
        return C4403w.m27869i1(i);
    }

    public TdApi.PasswordState m31086dh() {
        return this.f10768L0;
    }

    @Override
    public void mo4063e7(long j, int i) {
        C10721i0.m4186k(this, j, i);
    }

    public final String m31085eh(boolean z) {
        int g1 = C4868i.m24726c2().m24695g1(z);
        if (g1 == 0) {
            return C4403w.m27869i1(R.string.MapPreviewProviderNone);
        }
        if (g1 == 1) {
            return C4403w.m27869i1(R.string.MapPreviewProviderTelegram);
        }
        if (g1 != 2) {
            return C4403w.m27869i1(R.string.MapPreviewProviderUnset);
        }
        return C4403w.m27869i1(R.string.MapPreviewProviderGoogle);
    }

    public final String m31084fh() {
        TdApi.PasswordState passwordState = this.f10768L0;
        return C4403w.m27869i1(passwordState != null ? passwordState.hasPassword ? R.string.PasswordEnabled : passwordState.recoveryEmailAddressCodeInfo != null ? R.string.AwaitingEmailConfirmation : R.string.PasswordDisabled : R.string.LoadingInformation);
    }

    public final void m31083gh(final TdApi.UserPrivacySetting userPrivacySetting) {
        this.f30167b.m2270r4().m14783o(new TdApi.GetUserPrivacySettingRules(userPrivacySetting), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC3222vw.this.m31076nh(userPrivacySetting, object);
            }
        });
    }

    @Override
    public void mo4062h1(long j, TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        C10721i0.m4184m(this, j, chatJoinRequestsInfo);
    }

    public final int m31082hh() {
        return this.f30167b.m2946A4().m1419S() ? R.string.SyncContactsInfoOn : R.string.SyncContactsInfoOff;
    }

    @Override
    public void mo4061i5(long j, String str) {
        C10721i0.m4176u(this, j, str);
    }

    public TdApi.ConnectedWebsites m31081ih() {
        return this.f10766J0;
    }

    public final boolean m31080jh() {
        return m9139w9() != null && m9131x9().f10772a;
    }

    @Override
    public void mo1773l6(int i, SparseIntArray sparseIntArray) {
        if (i == R.id.btn_accountTTL && sparseIntArray.size() == 1) {
            int i2 = 0;
            switch (sparseIntArray.valueAt(0)) {
                case R.id.btn_1month:
                    i2 = 31;
                    break;
                case R.id.btn_1year:
                    i2 = 366;
                    break;
                case R.id.btn_3months:
                    i2 = 91;
                    break;
                case R.id.btn_6month:
                    i2 = 181;
                    break;
            }
            if (i2 >= 30) {
                TdApi.AccountTtl accountTtl = this.f10769M0;
                if (accountTtl == null || accountTtl.days != i2) {
                    this.f10769M0 = new TdApi.AccountTtl(i2);
                    this.f30167b.m2270r4().m14783o(new TdApi.SetAccountTtl(this.f10769M0), this.f30167b.m2392ja());
                    this.f10760D0.m34130s3(R.id.btn_accountTTL);
                }
            }
        }
    }

    @Override
    public void mo4060m0(long j, int i, boolean z) {
        C10721i0.m4174w(this, j, i, z);
    }

    @Override
    public void onClick(View view) {
        final int id2 = view.getId();
        int i = 1;
        switch (id2) {
            case R.id.btn_2fa:
                TdApi.PasswordState passwordState = this.f10768L0;
                if (passwordState == null) {
                    return;
                }
                if (!passwordState.hasPassword) {
                    View$OnClickListenerC2937qp qpVar = new View$OnClickListenerC2937qp(this.f30165a, this.f30167b);
                    qpVar.m32968ih(new View$OnClickListenerC2937qp.C2939b(this, null, null));
                    m9291ac(qpVar);
                    return;
                }
                View$OnClickListenerC2665lj ljVar = new View$OnClickListenerC2665lj(this.f30165a, this.f30167b);
                ljVar.m33963bg(new View$OnClickListenerC2665lj.C2666a(2, this.f10768L0));
                m9291ac(ljVar);
                return;
            case R.id.btn_accountTTL:
                TdApi.AccountTtl accountTtl = this.f10769M0;
                int i2 = (accountTtl != null ? accountTtl.days : 0) / 30;
                int i3 = i2 / 12;
                C2964ra[] raVarArr = new C2964ra[4];
                raVarArr[0] = new C2964ra(13, (int) R.id.btn_1month, 0, C4403w.m27836q2(R.string.xMonths, 1L), (int) R.id.btn_accountTTL, i2 == 1);
                raVarArr[1] = new C2964ra(13, (int) R.id.btn_3months, 0, C4403w.m27836q2(R.string.xMonths, 3L), (int) R.id.btn_accountTTL, i2 == 3);
                raVarArr[2] = new C2964ra(13, (int) R.id.btn_6month, 0, C4403w.m27836q2(R.string.xMonths, 6L), (int) R.id.btn_accountTTL, i2 == 6);
                raVarArr[3] = new C2964ra(13, (int) R.id.btn_1year, 0, C4403w.m27836q2(R.string.xYears, 1L), (int) R.id.btn_accountTTL, i3 == 1);
                m9199ne(id2, raVarArr, this);
                return;
            case R.id.btn_blockedSenders:
                AbstractC9323v4<?> pqVar = new View$OnClickListenerC2887pq(this.f30165a, this.f30167b);
                pqVar.m9476Ad(this);
                m9291ac(pqVar);
                return;
            case R.id.btn_clearAllDrafts:
                m9261ee(C4403w.m27869i1(R.string.AreYouSureClearDrafts), new int[]{R.id.btn_clearAllDrafts, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.PrivacyDeleteCloudDrafts), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view2, int i4) {
                        boolean vh;
                        vh = View$OnClickListenerC3222vw.this.m31067vh(view2, i4);
                        return vh;
                    }

                    @Override
                    public boolean mo492Q() {
                        return C5115g0.m23935a(this);
                    }

                    @Override
                    public Object mo491b2(int i4) {
                        return C5115g0.m23934b(this, i4);
                    }
                });
                return;
            case R.id.btn_clearPaymentAndShipping:
                m9206me(new C9188f2(R.id.btn_clearPaymentAndShipping).m9995r(R.string.Clear).m9997p(new C2964ra[]{new C2964ra(12, (int) R.id.btn_clearShipping, 0, (int) R.string.PrivacyClearShipping, (int) R.id.btn_clearShipping, true), new C2964ra(12, (int) R.id.btn_clearPayment, 0, (int) R.string.PrivacyClearPayment, (int) R.id.btn_clearPayment, true)}).m9996q(R.id.theme_color_textNegative).m10011b(C4403w.m27869i1(R.string.PrivacyPaymentsClearAlert)).m10003j(new AbstractC9323v4.AbstractC9343r() {
                    @Override
                    public final void mo1773l6(int i4, SparseIntArray sparseIntArray) {
                        View$OnClickListenerC3222vw.this.m31071rh(i4, sparseIntArray);
                    }
                }).m10000m(C2641kw.f8934a));
                return;
            case R.id.btn_hideSecretChats:
                boolean W2 = this.f10760D0.m34201W2(view);
                boolean Z4 = C4868i.m24726c2().m24747Z4(W2);
                C2964ra raVar = this.f10761E0;
                if (raVar != null) {
                    raVar.m32854W(W2 ? R.string.HideSecretOn : R.string.HideSecretOff);
                    this.f10760D0.m34137q3(this.f10761E0);
                }
                if (Z4) {
                    C10536ab.m4667o1().m4660q2();
                    return;
                }
                return;
            case R.id.btn_incognitoMode:
                C4868i.m24726c2().m24831N4(this.f10760D0.m34201W2(view) ? 1 : 0);
                return;
            case R.id.btn_mapProvider:
            case R.id.btn_mapProviderCloud:
                HandlerC10770jj dd = this.f30167b.m2485dd();
                if (id2 == R.id.btn_mapProviderCloud) {
                    i = 2;
                }
                dd.m3847F8(this, i, new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC3222vw.this.m31073ph(id2);
                    }
                });
                return;
            case R.id.btn_passcode:
                this.f10762F0 = id2;
                if (C4862d.m24934w().m24933x()) {
                    C2536ii iiVar = new C2536ii(this.f30165a, this.f30167b);
                    iiVar.m34307Kf(2);
                    m9291ac(iiVar);
                    return;
                }
                m9291ac(new View$OnClickListenerC2714mi(this.f30165a, this.f30167b));
                return;
            case R.id.btn_privacyRule:
                AbstractC9323v4<?> zwVar = new View$OnClickListenerC3415zw(this.f30165a, this.f30167b);
                zwVar.m9476Ad((TdApi.UserPrivacySetting) ((C2964ra) view.getTag()).m32844d());
                m9291ac(zwVar);
                return;
            case R.id.btn_resetContacts:
                m9261ee(C4403w.m27869i1(R.string.SyncContactsDeleteInfo), new int[]{R.id.btn_resetContacts, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.SyncContactsDeleteButton), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view2, int i4) {
                        boolean uh;
                        uh = View$OnClickListenerC3222vw.this.m31068uh(view2, i4);
                        return uh;
                    }

                    @Override
                    public boolean mo492Q() {
                        return C5115g0.m23935a(this);
                    }

                    @Override
                    public Object mo491b2(int i4) {
                        return C5115g0.m23934b(this, i4);
                    }
                });
                return;
            case R.id.btn_secretLinkPreviews:
                C4868i.m24726c2().m24830N5(this.f10760D0.m34201W2(view));
                return;
            case R.id.btn_sessions:
                this.f10762F0 = id2;
                View$OnClickListenerC2265cy cyVar = new View$OnClickListenerC2265cy(this.f30165a, this.f30167b);
                View$OnClickListenerC2899pz pzVar = new View$OnClickListenerC2899pz(this.f30165a, this.f30167b);
                pzVar.m33064bh(this);
                m9291ac(new g20(this.f30165a, this.f30167b, new AbstractC9323v4[]{cyVar, pzVar}, new String[]{C4403w.m27869i1(R.string.Devices).toUpperCase(), C4403w.m27869i1(R.string.Websites).toUpperCase()}, false));
                return;
            case R.id.btn_suggestContacts:
                C9137c cVar = (C9137c) view;
                if (cVar.getToggler().isEnabled()) {
                    m9261ee(C4403w.m27869i1(R.string.SuggestContactsAlert), new int[]{R.id.btn_suggestContacts, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.SuggestContactsDone), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                        @Override
                        public final boolean mo493A3(View view2, int i4) {
                            boolean th;
                            th = View$OnClickListenerC3222vw.this.m31069th(view2, i4);
                            return th;
                        }

                        @Override
                        public boolean mo492Q() {
                            return C5115g0.m23935a(this);
                        }

                        @Override
                        public Object mo491b2(int i4) {
                            return C5115g0.m23934b(this, i4);
                        }
                    });
                    return;
                } else {
                    this.f30167b.m2653Sb(!cVar.getToggler().m10184t(true));
                    return;
                }
            case R.id.btn_syncContacts:
                if (this.f30167b.m2946A4().m1419S()) {
                    this.f30167b.m2946A4().m1433E();
                    return;
                } else {
                    this.f30167b.m2946A4().m1432F(this.f30165a);
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public boolean mo31074pg() {
        return true;
    }

    @Override
    public void mo4059q6(long j, boolean z) {
        C10721i0.m4189h(this, j, z);
    }

    @Override
    public void mo30633rg(Context context, CustomRecyclerView customRecyclerView) {
        this.f10760D0 = new C3223a(this);
        ArrayList arrayList = new ArrayList();
        if (!m31080jh()) {
            arrayList.add(new C2964ra(14));
            arrayList.add(new C2964ra(8, 0, 0, R.string.SecurityTitle));
            arrayList.add(new C2964ra(2));
            arrayList.add(new C2964ra(5, R.id.btn_sessions, R.drawable.baseline_devices_other_24, R.string.SessionsTitle));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(5, R.id.btn_passcode, R.drawable.baseline_lock_24, R.string.PasscodeTitle));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(5, R.id.btn_2fa, R.drawable.mrgrigri_baseline_textbox_password_24, R.string.TwoStepVerification));
            arrayList.add(new C2964ra(3));
            arrayList.add(new C2964ra(8, 0, 0, R.string.PrivacyTitle));
            arrayList.add(new C2964ra(2));
            arrayList.add(new C2964ra(89, R.id.btn_blockedSenders, R.drawable.baseline_remove_circle_24, R.string.BlockedSenders));
        }
        TdApi.UserPrivacySetting[] userPrivacySettingArr = {new TdApi.UserPrivacySettingShowStatus(), new TdApi.UserPrivacySettingShowProfilePhoto(), new TdApi.UserPrivacySettingShowPhoneNumber(), new TdApi.UserPrivacySettingAllowFindingByPhoneNumber(), new TdApi.UserPrivacySettingShowLinkInForwardedMessages(), new TdApi.UserPrivacySettingAllowChatInvites(), new TdApi.UserPrivacySettingAllowCalls(), new TdApi.UserPrivacySettingAllowPeerToPeerCalls()};
        for (int i = 0; i < 8; i++) {
            TdApi.UserPrivacySetting userPrivacySetting = userPrivacySettingArr[i];
            if (!arrayList.isEmpty()) {
                if (userPrivacySetting.getConstructor() == 1862829310) {
                    arrayList.add(new C2964ra(11));
                } else if (userPrivacySetting.getConstructor() == -1846645423) {
                    arrayList.add(new C2964ra(3));
                    arrayList.add(new C2964ra(9, 0, 0, R.string.EditPrivacyHint));
                    arrayList.add(new C2964ra(2));
                } else {
                    arrayList.add(new C2964ra(11));
                }
            }
            arrayList.add(new C2964ra(89, R.id.btn_privacyRule, View$OnClickListenerC3415zw.m30646Jg(userPrivacySetting), View$OnClickListenerC3415zw.m30645Kg(userPrivacySetting, false, false)).m32870G(userPrivacySetting).m32863N(userPrivacySetting.getConstructor()));
            m31083gh(userPrivacySetting);
        }
        arrayList.add(new C2964ra(3));
        arrayList.add(new C2964ra(9, 0, 0, R.string.PeerToPeerInfo));
        if (!m31080jh()) {
            arrayList.add(new C2964ra(8, 0, 0, R.string.Contacts));
            arrayList.add(new C2964ra(2));
            arrayList.add(new C2964ra(7, R.id.btn_suggestContacts, 0, R.string.SuggestContacts));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(4, R.id.btn_resetContacts, 0, R.string.SyncContactsDelete));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(7, R.id.btn_syncContacts, 0, R.string.SyncContacts));
            arrayList.add(new C2964ra(3));
            arrayList.add(new C2964ra(9, R.id.btn_syncContactsInfo, 0, m31082hh()));
            arrayList.add(new C2964ra(8, 0, 0, R.string.PrivacyBots));
            arrayList.add(new C2964ra(2));
            arrayList.add(new C2964ra(4, (int) R.id.btn_clearPaymentAndShipping, 0, (int) R.string.PrivacyPaymentsClear, false));
            arrayList.add(new C2964ra(3));
            arrayList.add(new C2964ra(8, 0, 0, R.string.SecretChats));
            arrayList.add(new C2964ra(2));
            arrayList.add(new C2964ra(7, R.id.btn_secretLinkPreviews, 0, R.string.SecretWebPage));
            arrayList.add(new C2964ra(3));
            arrayList.add(new C2964ra(9, 0, 0, R.string.SecretWebPageInfo));
            arrayList.add(new C2964ra(2));
            arrayList.add(new C2964ra(7, R.id.btn_hideSecretChats, 0, R.string.HideSecret));
            arrayList.add(new C2964ra(3));
            C2964ra raVar = new C2964ra(9, 0, 0, C4868i.m24726c2().m24868I2() ? R.string.HideSecretOn : R.string.HideSecretOff);
            this.f10761E0 = raVar;
            arrayList.add(raVar);
            arrayList.add(new C2964ra(2));
            arrayList.add(new C2964ra(7, R.id.btn_incognitoMode, 0, R.string.IncognitoKeyboard));
            arrayList.add(new C2964ra(3));
            arrayList.add(new C2964ra(9, 0, 0, R.string.IncognitoKeyboardInfo));
            arrayList.add(new C2964ra(2));
            arrayList.add(new C2964ra(89, R.id.btn_mapProvider, 0, R.string.MapPreviewProvider));
            arrayList.add(new C2964ra(3));
            arrayList.add(new C2964ra(9, 0, 0, R.string.MapPreviewProviderInfo));
            arrayList.add(new C2964ra(8, 0, 0, R.string.PrivacyAdvanced));
            arrayList.add(new C2964ra(2));
            arrayList.add(new C2964ra(4, R.id.btn_clearAllDrafts, 0, R.string.PrivacyDeleteCloudDrafts));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(89, R.id.btn_accountTTL, 0, R.string.DeleteAccountIfAwayFor2));
            arrayList.add(new C2964ra(3));
            arrayList.add(new C2964ra(9, 0, 0, R.string.DeleteAccountHelp));
        }
        this.f10760D0.m34116x2(arrayList, false);
        customRecyclerView.setAdapter(this.f10760D0);
        this.f30167b.m2270r4().m14783o(new TdApi.GetBlockedMessageSenders(0, 1), this);
        m31090Zg();
        this.f30167b.m2270r4().m14783o(new TdApi.GetPasswordState(), this);
        this.f30167b.m2270r4().m14783o(new TdApi.GetAccountTtl(), this);
        this.f30167b.m2270r4().m14783o(new TdApi.GetConnectedWebsites(), this);
        this.f30167b.m2480e2().m1758B1(this);
        this.f30167b.m2946A4().m1368w(this);
        this.f30167b.m2781K9().m1882a0(this);
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
        m9476Ad(new C3224b(bundle.getBoolean(str + "only", false)));
        return true;
    }

    @Override
    public void mo255t2(final TdApi.Object object) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3222vw.this.m31065xh(object);
            }
        });
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
        m9143vd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3222vw.this.m31075oh();
            }
        }, 350L);
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
        bundle.putBoolean(str + "only", m9139w9() != null && m9139w9().f10772a);
        return true;
    }

    public final void m31064yh(TdApi.AccountTtl accountTtl) {
        this.f10769M0 = accountTtl;
        this.f10760D0.m34130s3(R.id.btn_accountTTL);
    }

    public void m31063zh(AbstractC3225c cVar) {
        this.f10767K0 = cVar;
    }
}
