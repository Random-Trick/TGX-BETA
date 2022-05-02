package p038ce;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import be.C1357a0;
import be.C1379j0;
import be.C1389o;
import gd.C4618d7;
import java.util.ArrayList;
import java.util.List;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import p038ce.RunnableC2374f5;
import p082fd.C4403w;
import p111he.AbstractC5157z0;
import p111he.C5132o;
import p124ib.C5322e;
import p193nb.C7316a;
import p350yd.AbstractC10883o1;
import p350yd.C10862n1;
import p350yd.C10930q6;
import tc.C9137c;
import td.AbstractC9323v4;

public class View$OnClickListenerC3415zw extends AbstractC3204vo<TdApi.UserPrivacySetting> implements View.OnClickListener, AbstractC5157z0, AbstractC10883o1 {
    public C2546iq f11307D0;
    public C10862n1 f11308E0;
    public C10862n1 f11309F0;
    public int f11310G0;

    public class C3416a extends C2546iq {
        public C3416a(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo394V2(C2964ra raVar, C9137c cVar, boolean z) {
            int j = raVar.m32838j();
            if (j == R.id.btn_alwaysAllow) {
                int o = View$OnClickListenerC3415zw.this.m30649Ig().m2980o(View$OnClickListenerC3415zw.this.f30170b);
                cVar.setData(o > 0 ? C4403w.m27846o2(R.string.xUsers, o) : C4403w.m27871i1(R.string.PrivacyAddUsers));
            } else if (j == R.id.btn_neverAllow) {
                int k = View$OnClickListenerC3415zw.this.m30649Ig().m2984k(View$OnClickListenerC3415zw.this.f30170b);
                cVar.setData(k > 0 ? C4403w.m27846o2(R.string.xUsers, k) : C4403w.m27871i1(R.string.PrivacyAddUsers));
            }
        }

        @Override
        public void mo30634w1(TextView textView, int i, int i2) {
            textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            textView.setPadding(textView.getPaddingLeft(), i2 + C1357a0.m37544i(6.0f), textView.getPaddingRight(), C1357a0.m37544i(6.0f));
            textView.setSingleLine(false);
        }
    }

    public View$OnClickListenerC3415zw(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public static int m30648Jg(TdApi.UserPrivacySetting userPrivacySetting) {
        switch (userPrivacySetting.getConstructor()) {
            case TdApi.UserPrivacySettingAllowFindingByPhoneNumber.CONSTRUCTOR:
                return R.drawable.baseline_search_24;
            case TdApi.UserPrivacySettingAllowCalls.CONSTRUCTOR:
                return R.drawable.baseline_phone_in_talk_24;
            case TdApi.UserPrivacySettingShowPhoneNumber.CONSTRUCTOR:
                return R.drawable.baseline_call_24;
            case TdApi.UserPrivacySettingAllowPeerToPeerCalls.CONSTRUCTOR:
                return R.drawable.baseline_swap_horiz_24;
            case TdApi.UserPrivacySettingShowLinkInForwardedMessages.CONSTRUCTOR:
                return R.drawable.baseline_forward_24;
            case TdApi.UserPrivacySettingAllowChatInvites.CONSTRUCTOR:
                return R.drawable.baseline_person_add_24;
            case TdApi.UserPrivacySettingShowProfilePhoto.CONSTRUCTOR:
                return R.drawable.baseline_emoticon_outline_24;
            case TdApi.UserPrivacySettingShowStatus.CONSTRUCTOR:
                return R.drawable.baseline_visibility_24;
            default:
                return 0;
        }
    }

    public static int m30647Kg(TdApi.UserPrivacySetting userPrivacySetting, boolean z, boolean z2) {
        switch (userPrivacySetting.getConstructor()) {
            case TdApi.UserPrivacySettingAllowFindingByPhoneNumber.CONSTRUCTOR:
                return R.string.FindingByPhoneNumber;
            case TdApi.UserPrivacySettingAllowCalls.CONSTRUCTOR:
                return z ? R.string.EditPrivacyCall : R.string.VoiceCalls;
            case TdApi.UserPrivacySettingShowPhoneNumber.CONSTRUCTOR:
                return z ? R.string.EditPrivacyPhoneNumber : R.string.PhoneNumber;
            case TdApi.UserPrivacySettingAllowPeerToPeerCalls.CONSTRUCTOR:
                return z ? R.string.EditPrivacyCallP2P : R.string.PrivacyCallsP2PTitle2;
            case TdApi.UserPrivacySettingShowLinkInForwardedMessages.CONSTRUCTOR:
                return z ? R.string.EditPrivacyForward : R.string.PrivacyForwardLinkTitle;
            case TdApi.UserPrivacySettingAllowChatInvites.CONSTRUCTOR:
                return z ? z2 ? R.string.EditPrivacyChatInviteGroup : R.string.EditPrivacyChatInvite : R.string.GroupsAndChannels;
            case TdApi.UserPrivacySettingShowProfilePhoto.CONSTRUCTOR:
                return z ? R.string.EditPrivacyPhoto : R.string.PrivacyPhotoTitle;
            case TdApi.UserPrivacySettingShowStatus.CONSTRUCTOR:
                return z ? R.string.EditPrivacyStatus : R.string.LastSeen;
            default:
                throw new IllegalStateException("privacyKey == " + userPrivacySetting);
        }
    }

    public void m30646Lg(TdApi.Object object) {
        if (!m9347Sa()) {
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                C1379j0.m37305t0(object);
            } else if (constructor == 322477541) {
                m30637Ug((TdApi.UserPrivacySettingRules) object);
            }
        }
    }

    public void m30645Mg(final TdApi.Object object) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3415zw.this.m30646Lg(object);
            }
        });
    }

    public void m30644Ng(TdApi.UserPrivacySetting userPrivacySetting, TdApi.UserPrivacySettingRules userPrivacySettingRules) {
        if (!m9347Sa() && m9131x9().getConstructor() == userPrivacySetting.getConstructor()) {
            m30637Ug(userPrivacySettingRules);
        }
    }

    public final void m30650Hg() {
        C2964ra raVar;
        C2964ra raVar2;
        C10862n1 n1Var = this.f11308E0;
        if (n1Var != null) {
            int m = n1Var.m2982m();
            switch (m9131x9().getConstructor()) {
                case TdApi.UserPrivacySettingAllowFindingByPhoneNumber.CONSTRUCTOR:
                    raVar2 = new C2964ra(8, 0, 0, R.string.WhoCanFindByPhone);
                    raVar = new C2964ra(9, R.id.btn_description, 0, m == 2 ? R.string.WhoCanFindByPhoneInfoEveryone : R.string.WhoCanFindByPhoneInfoContacts);
                    break;
                case TdApi.UserPrivacySettingAllowCalls.CONSTRUCTOR:
                    raVar2 = new C2964ra(8, 0, 0, R.string.WhoCanCallMe);
                    raVar = new C2964ra(9, R.id.btn_description, 0, R.string.VoiceCallPrivacyDesc);
                    break;
                case TdApi.UserPrivacySettingShowPhoneNumber.CONSTRUCTOR:
                    raVar2 = new C2964ra(8, 0, 0, R.string.WhoCanSeePhone);
                    raVar = new C2964ra(9, R.id.btn_description, 0, R.string.WhoCanSeePhoneInfo);
                    break;
                case TdApi.UserPrivacySettingAllowPeerToPeerCalls.CONSTRUCTOR:
                    raVar2 = new C2964ra(8, 0, 0, R.string.UseP2PWith);
                    raVar = new C2964ra(9, R.id.btn_description, 0, R.string.PeerToPeerInfo);
                    break;
                case TdApi.UserPrivacySettingShowLinkInForwardedMessages.CONSTRUCTOR:
                    raVar2 = new C2964ra(8, 0, 0, R.string.WhoCanForwardLink);
                    raVar = new C2964ra(9, R.id.btn_description, 0, R.string.WhoCanForwardLinkInfo);
                    break;
                case TdApi.UserPrivacySettingAllowChatInvites.CONSTRUCTOR:
                    raVar2 = new C2964ra(8, 0, 0, R.string.WhoCanAddYouToGroupsAndChannels);
                    raVar = new C2964ra(9, R.id.btn_description, 0, R.string.WhoCanAddMeInfo);
                    break;
                case TdApi.UserPrivacySettingShowProfilePhoto.CONSTRUCTOR:
                    raVar2 = new C2964ra(8, 0, 0, R.string.WhoCanSeePhoto);
                    raVar = new C2964ra(9, R.id.btn_description, 0, R.string.WhoCanSeePhotoInfo);
                    break;
                case TdApi.UserPrivacySettingShowStatus.CONSTRUCTOR:
                    raVar2 = new C2964ra(8, R.id.btn_description, 0, R.string.LastSeenTitle);
                    String i1 = C4403w.m27871i1(R.string.CustomHelp);
                    int indexOf = i1.indexOf(58);
                    if (indexOf != -1) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i1);
                        spannableStringBuilder.setSpan(new C5132o(C1389o.m37263i(), R.id.theme_color_background_textLight), 0, indexOf + 1, 33);
                        raVar = new C2964ra(9, 0, 0, (CharSequence) spannableStringBuilder, false);
                        break;
                    } else {
                        raVar = new C2964ra(9, 0, 0, R.string.CustomHelp);
                        break;
                    }
                default:
                    throw new IllegalStateException("privacyKey == " + m9131x9());
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C2964ra(14));
            arrayList.add(raVar2);
            arrayList.add(new C2964ra(2));
            arrayList.add(new C2964ra(13, R.id.btn_everybody, 0, R.string.Everybody, null, R.id.btn_privacyRadio, m == 2));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(13, R.id.btn_contacts, 0, R.string.MyContacts, null, R.id.btn_privacyRadio, m == 1));
            if (m30642Pg() || m == 0) {
                arrayList.add(new C2964ra(11));
                arrayList.add(new C2964ra(13, R.id.btn_nobody, 0, R.string.Nobody, null, R.id.btn_privacyRadio, m == 0));
            }
            arrayList.add(new C2964ra(3));
            arrayList.add(raVar);
            if (m30643Og()) {
                arrayList.add(new C2964ra(8, 0, 0, R.string.AddExceptions));
                arrayList.add(new C2964ra(2));
                boolean t = this.f11308E0.m2975t();
                if (t) {
                    arrayList.add(new C2964ra(89, R.id.btn_neverAllow, 0, m9131x9().getConstructor() == 1862829310 ? R.string.NeverShareWith : R.string.NeverAllow));
                }
                if (this.f11308E0.m2976s()) {
                    if (t) {
                        arrayList.add(new C2964ra(11));
                    }
                    arrayList.add(new C2964ra(89, R.id.btn_alwaysAllow, 0, m9131x9().getConstructor() == 1862829310 ? R.string.AlwaysShareWith : R.string.AlwaysAllow));
                }
                arrayList.add(new C2964ra(3));
                arrayList.add(new C2964ra(9, 0, 0, R.string.CustomShareSettingsHelp));
            }
            this.f11307D0.m34119x2(arrayList, true);
            m31296vg();
        }
    }

    public final C10862n1 m30649Ig() {
        C10862n1 n1Var = this.f11309F0;
        return n1Var != null ? n1Var : this.f11308E0;
    }

    public final boolean m30643Og() {
        return m9131x9().getConstructor() != -1846645423;
    }

    public final boolean m30642Pg() {
        int constructor = m9131x9().getConstructor();
        return (constructor == -1846645423 || constructor == 1271668007) ? false : true;
    }

    public final boolean m30641Qg() {
        C10862n1 n1Var = this.f11309F0;
        return n1Var == null || n1Var.equals(this.f11308E0);
    }

    @Override
    public int mo407R9() {
        return R.id.controller_privacyKey;
    }

    public final void m30640Rg() {
        if (this.f11308E0 != null && !m30641Qg()) {
            this.f30170b.m2270r4().m14783o(new TdApi.SetUserPrivacySettingRules(m9131x9(), this.f11309F0.m2974u()), this.f30170b.m2392ja());
        }
    }

    public final void m30639Sg(long[] jArr, long[] jArr2) {
        this.f11309F0 = C10862n1.m2969z(m30649Ig().m2994a(jArr, jArr2));
        this.f11307D0.m34133s3(R.id.btn_alwaysAllow);
        this.f11307D0.m34133s3(R.id.btn_neverAllow);
    }

    public final void m30638Tg(long[] jArr, long[] jArr2) {
        this.f11309F0 = C10862n1.m2969z(m30649Ig().m2993b(jArr, jArr2));
        this.f11307D0.m34133s3(R.id.btn_neverAllow);
        this.f11307D0.m34133s3(R.id.btn_alwaysAllow);
    }

    public final void m30637Ug(TdApi.UserPrivacySettingRules userPrivacySettingRules) {
        int i;
        if (this.f11308E0 == null) {
            this.f11308E0 = C10862n1.m2969z(userPrivacySettingRules);
            m30650Hg();
            m9204n9();
            return;
        }
        m30649Ig().m2982m();
        C10862n1 z = C10862n1.m2969z(userPrivacySettingRules);
        this.f11308E0 = z;
        C10862n1 n1Var = this.f11309F0;
        if (n1Var == null) {
            int m = m30649Ig().m2982m();
            if (m == 0) {
                i = R.id.btn_nobody;
            } else if (m == 1) {
                i = R.id.btn_contacts;
            } else if (m == 2) {
                i = R.id.btn_everybody;
            } else {
                throw new UnsupportedOperationException();
            }
            int N0 = this.f11307D0.m34227N0(i);
            if (N0 != -1) {
                C2546iq iqVar = this.f11307D0;
                iqVar.m34223O1(null, iqVar.m34243F0().get(N0), true);
            }
            m30636Vg(m30649Ig());
            this.f11307D0.m34133s3(R.id.btn_alwaysAllow);
            this.f11307D0.m34133s3(R.id.btn_neverAllow);
        } else if (n1Var.equals(z)) {
            this.f11309F0 = null;
        }
    }

    public final void m30636Vg(C10862n1 n1Var) {
        int N0;
        int m = n1Var.m2982m();
        if (m30643Og()) {
            boolean z = this.f11307D0.m34227N0(R.id.btn_neverAllow) != -1;
            boolean z2 = (this.f11307D0.m34227N0(R.id.btn_alwaysAllow) != -1) && z;
            boolean t = n1Var.m2975t();
            boolean s = n1Var.m2976s();
            boolean z3 = s && t;
            List<C2964ra> F0 = this.f11307D0.m34243F0();
            int T0 = this.f11307D0.m34213T0(89);
            int i = m9131x9().getConstructor() == 1862829310 ? R.string.AlwaysShareWith : R.string.AlwaysAllow;
            int i2 = m9131x9().getConstructor() == 1862829310 ? R.string.NeverShareWith : R.string.NeverAllow;
            if (z3 == z2) {
                if (!z3) {
                    if (s) {
                        F0.set(T0, new C2964ra(89, R.id.btn_alwaysAllow, 0, i));
                    } else {
                        F0.set(T0, new C2964ra(89, R.id.btn_neverAllow, 0, i2));
                    }
                    this.f11307D0.m39315I(T0);
                }
            } else if (z3) {
                if (z) {
                    int i3 = T0 + 1;
                    F0.add(i3, new C2964ra(89, R.id.btn_alwaysAllow, 0, i));
                    F0.add(i3, new C2964ra(11));
                    this.f11307D0.m39311M(i3, 2);
                    return;
                }
                F0.add(T0, new C2964ra(11));
                F0.add(T0, new C2964ra(89, R.id.btn_neverAllow, 0, i2));
                this.f11307D0.m39311M(T0, 2);
            } else if (t) {
                int i4 = T0 + 1;
                F0.remove(i4);
                F0.remove(i4);
                this.f11307D0.m39310N(i4, 2);
            } else {
                F0.remove(T0);
                F0.remove(T0);
                this.f11307D0.m39310N(T0, 2);
            }
        } else if (m9131x9().getConstructor() == -1846645423 && (N0 = this.f11307D0.m34227N0(R.id.btn_description)) != -1) {
            if (this.f11307D0.m34243F0().get(N0).m32855Y(m == 2 ? R.string.WhoCanFindByPhoneInfoEveryone : R.string.WhoCanFindByPhoneInfoContacts)) {
                this.f11307D0.m39315I(N0);
            }
        }
    }

    @Override
    public CharSequence mo9313X9() {
        return C4403w.m27871i1(m30647Kg(m9131x9(), false, false));
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        this.f30170b.m2781K9().m1802u0(this);
    }

    @Override
    public void mo2964a2(final TdApi.UserPrivacySetting userPrivacySetting, final TdApi.UserPrivacySettingRules userPrivacySettingRules) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3415zw.this.m30644Ng(userPrivacySetting, userPrivacySettingRules);
            }
        });
    }

    @Override
    public boolean mo9270dc() {
        return this.f11308E0 == null;
    }

    @Override
    public int mo23795j6() {
        int i = this.f11310G0;
        return i != R.id.btn_alwaysAllow ? i != R.id.btn_neverAllow ? R.string.AlwaysAllow : m9131x9().getConstructor() == 1862829310 ? R.string.NeverShareWith : R.string.NeverAllow : m9131x9().getConstructor() == 1862829310 ? R.string.AlwaysShareWith : R.string.AlwaysAllow;
    }

    @Override
    public void mo9222kc() {
        super.mo9222kc();
        m30640Rg();
    }

    @Override
    public void mo23794l(List<C4618d7> list) {
        C5322e eVar = new C5322e(list.size());
        C5322e eVar2 = new C5322e(list.size());
        for (C4618d7 d7Var : list) {
            long h = d7Var.m26882h();
            if (C7316a.m17052i(h)) {
                eVar.m23276a(C7316a.m17044q(h));
            } else {
                eVar2.m23276a(h);
            }
        }
        int i = this.f11310G0;
        if (i == R.id.btn_alwaysAllow) {
            m30639Sg(eVar.m23270g(), eVar2.m23270g());
        } else if (i == R.id.btn_neverAllow) {
            m30638Tg(eVar.m23270g(), eVar2.m23270g());
        }
    }

    @Override
    public void onClick(View view) {
        int i;
        switch (view.getId()) {
            case R.id.btn_alwaysAllow:
            case R.id.btn_neverAllow:
                this.f11310G0 = view.getId();
                RunnableC2374f5 f5Var = new RunnableC2374f5(this.f30168a, this.f30170b);
                f5Var.m34767Xg(new RunnableC2374f5.C2376b(this).m34727a(2373));
                m9291ac(f5Var);
                return;
            case R.id.btn_contacts:
            case R.id.btn_everybody:
            case R.id.btn_nobody:
                C2964ra raVar = (C2964ra) view.getTag();
                if (this.f11307D0.m34226N1(view)) {
                    int i2 = this.f11307D0.m34255A0().get(raVar.m32849c());
                    if (i2 == R.id.btn_contacts) {
                        i = 1;
                    } else if (i2 == R.id.btn_everybody) {
                        i = 2;
                    } else if (i2 == R.id.btn_nobody) {
                        i = 0;
                    } else {
                        return;
                    }
                    m30649Ig().m2982m();
                    C10862n1 z = C10862n1.m2969z(m30649Ig().m2972w(i));
                    this.f11309F0 = z;
                    m30636Vg(z);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public long[] mo23793q4() {
        int i = this.f11310G0;
        if (i == R.id.btn_alwaysAllow) {
            return m30649Ig().m2986i();
        }
        if (i != R.id.btn_neverAllow) {
            return null;
        }
        return m30649Ig().m2987h();
    }

    @Override
    public void mo30635rg(Context context, CustomRecyclerView customRecyclerView) {
        C3416a aVar = new C3416a(this);
        this.f11307D0 = aVar;
        customRecyclerView.setAdapter(aVar);
        this.f30170b.m2270r4().m14783o(new TdApi.GetUserPrivacySettingRules(m9131x9()), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC3415zw.this.m30645Mg(object);
            }
        });
        this.f30170b.m2781K9().m1854h0(this);
    }

    @Override
    public boolean mo9165sd(Bundle bundle, String str) {
        Object obj;
        super.mo9165sd(bundle, str);
        switch (bundle.getInt(str + "setting", 0)) {
            case TdApi.UserPrivacySettingAllowFindingByPhoneNumber.CONSTRUCTOR:
                obj = new TdApi.UserPrivacySettingAllowFindingByPhoneNumber();
                break;
            case TdApi.UserPrivacySettingAllowCalls.CONSTRUCTOR:
                obj = new TdApi.UserPrivacySettingAllowCalls();
                break;
            case TdApi.UserPrivacySettingShowPhoneNumber.CONSTRUCTOR:
                obj = new TdApi.UserPrivacySettingShowPhoneNumber();
                break;
            case TdApi.UserPrivacySettingAllowPeerToPeerCalls.CONSTRUCTOR:
                obj = new TdApi.UserPrivacySettingAllowPeerToPeerCalls();
                break;
            case TdApi.UserPrivacySettingShowLinkInForwardedMessages.CONSTRUCTOR:
                obj = new TdApi.UserPrivacySettingShowLinkInForwardedMessages();
                break;
            case TdApi.UserPrivacySettingAllowChatInvites.CONSTRUCTOR:
                obj = new TdApi.UserPrivacySettingAllowChatInvites();
                break;
            case TdApi.UserPrivacySettingShowProfilePhoto.CONSTRUCTOR:
                obj = new TdApi.UserPrivacySettingShowProfilePhoto();
                break;
            case TdApi.UserPrivacySettingShowStatus.CONSTRUCTOR:
                obj = new TdApi.UserPrivacySettingShowStatus();
                break;
            default:
                obj = null;
                break;
        }
        if (obj == null) {
            return false;
        }
        m9476Ad(obj);
        return true;
    }

    @Override
    public boolean mo9122yd(Bundle bundle, String str) {
        super.mo9122yd(bundle, str);
        bundle.putInt(str + "setting", m9131x9().getConstructor());
        return true;
    }
}
