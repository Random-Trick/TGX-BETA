package de;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ce.a0;
import ce.j0;
import de.f5;
import gd.w;
import hd.d7;
import ie.o;
import ie.z0;
import java.util.ArrayList;
import java.util.List;
import jb.e;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import uc.c;
import ud.v4;
import zd.l1;
import zd.m1;
import zd.o6;

public class ax extends vo<TdApi.UserPrivacySetting> implements View.OnClickListener, z0, m1 {
    public iq D0;
    public l1 E0;
    public l1 F0;
    public int G0;

    public class a extends iq {
        public a(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void R2(ra raVar, c cVar, boolean z10) {
            int j10 = raVar.j();
            if (j10 == R.id.btn_alwaysAllow) {
                int o10 = ax.this.Ig().o(ax.this.f24495b);
                cVar.setData(o10 > 0 ? w.o2(R.string.xUsers, o10) : w.i1(R.string.PrivacyAddUsers));
            } else if (j10 == R.id.btn_neverAllow) {
                int k10 = ax.this.Ig().k(ax.this.f24495b);
                cVar.setData(k10 > 0 ? w.o2(R.string.xUsers, k10) : w.i1(R.string.PrivacyAddUsers));
            }
        }

        @Override
        public void s1(TextView textView, int i10, int i11) {
            textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            textView.setPadding(textView.getPaddingLeft(), i11 + a0.i(6.0f), textView.getPaddingRight(), a0.i(6.0f));
            textView.setSingleLine(false);
        }
    }

    public ax(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public static int Jg(TdApi.UserPrivacySetting userPrivacySetting) {
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

    public static int Kg(TdApi.UserPrivacySetting userPrivacySetting, boolean z10, boolean z11) {
        switch (userPrivacySetting.getConstructor()) {
            case TdApi.UserPrivacySettingAllowFindingByPhoneNumber.CONSTRUCTOR:
                return R.string.FindingByPhoneNumber;
            case TdApi.UserPrivacySettingAllowCalls.CONSTRUCTOR:
                return z10 ? R.string.EditPrivacyCall : R.string.VoiceCalls;
            case TdApi.UserPrivacySettingShowPhoneNumber.CONSTRUCTOR:
                return z10 ? R.string.EditPrivacyPhoneNumber : R.string.PhoneNumber;
            case TdApi.UserPrivacySettingAllowPeerToPeerCalls.CONSTRUCTOR:
                return z10 ? R.string.EditPrivacyCallP2P : R.string.PrivacyCallsP2PTitle2;
            case TdApi.UserPrivacySettingShowLinkInForwardedMessages.CONSTRUCTOR:
                return z10 ? R.string.EditPrivacyForward : R.string.PrivacyForwardLinkTitle;
            case TdApi.UserPrivacySettingAllowChatInvites.CONSTRUCTOR:
                return z10 ? z11 ? R.string.EditPrivacyChatInviteGroup : R.string.EditPrivacyChatInvite : R.string.GroupsAndChannels;
            case TdApi.UserPrivacySettingShowProfilePhoto.CONSTRUCTOR:
                return z10 ? R.string.EditPrivacyPhoto : R.string.PrivacyPhotoTitle;
            case TdApi.UserPrivacySettingShowStatus.CONSTRUCTOR:
                return z10 ? R.string.EditPrivacyStatus : R.string.LastSeen;
            default:
                throw new IllegalStateException("privacyKey == " + userPrivacySetting);
        }
    }

    public void Lg(TdApi.Object object) {
        if (!Sa()) {
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                j0.t0(object);
            } else if (constructor == 322477541) {
                Ug((TdApi.UserPrivacySettingRules) object);
            }
        }
    }

    public void Mg(final TdApi.Object object) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                ax.this.Lg(object);
            }
        });
    }

    public void Ng(TdApi.UserPrivacySetting userPrivacySetting, TdApi.UserPrivacySettingRules userPrivacySettingRules) {
        if (!Sa() && x9().getConstructor() == userPrivacySetting.getConstructor()) {
            Ug(userPrivacySettingRules);
        }
    }

    public final void Hg() {
        ra raVar;
        ra raVar2;
        l1 l1Var = this.E0;
        if (l1Var != null) {
            int m10 = l1Var.m();
            switch (x9().getConstructor()) {
                case TdApi.UserPrivacySettingAllowFindingByPhoneNumber.CONSTRUCTOR:
                    raVar2 = new ra(8, 0, 0, R.string.WhoCanFindByPhone);
                    raVar = new ra(9, R.id.btn_description, 0, m10 == 2 ? R.string.WhoCanFindByPhoneInfoEveryone : R.string.WhoCanFindByPhoneInfoContacts);
                    break;
                case TdApi.UserPrivacySettingAllowCalls.CONSTRUCTOR:
                    raVar2 = new ra(8, 0, 0, R.string.WhoCanCallMe);
                    raVar = new ra(9, R.id.btn_description, 0, R.string.VoiceCallPrivacyDesc);
                    break;
                case TdApi.UserPrivacySettingShowPhoneNumber.CONSTRUCTOR:
                    raVar2 = new ra(8, 0, 0, R.string.WhoCanSeePhone);
                    raVar = new ra(9, R.id.btn_description, 0, R.string.WhoCanSeePhoneInfo);
                    break;
                case TdApi.UserPrivacySettingAllowPeerToPeerCalls.CONSTRUCTOR:
                    raVar2 = new ra(8, 0, 0, R.string.UseP2PWith);
                    raVar = new ra(9, R.id.btn_description, 0, R.string.PeerToPeerInfo);
                    break;
                case TdApi.UserPrivacySettingShowLinkInForwardedMessages.CONSTRUCTOR:
                    raVar2 = new ra(8, 0, 0, R.string.WhoCanForwardLink);
                    raVar = new ra(9, R.id.btn_description, 0, R.string.WhoCanForwardLinkInfo);
                    break;
                case TdApi.UserPrivacySettingAllowChatInvites.CONSTRUCTOR:
                    raVar2 = new ra(8, 0, 0, R.string.WhoCanAddYouToGroupsAndChannels);
                    raVar = new ra(9, R.id.btn_description, 0, R.string.WhoCanAddMeInfo);
                    break;
                case TdApi.UserPrivacySettingShowProfilePhoto.CONSTRUCTOR:
                    raVar2 = new ra(8, 0, 0, R.string.WhoCanSeePhoto);
                    raVar = new ra(9, R.id.btn_description, 0, R.string.WhoCanSeePhotoInfo);
                    break;
                case TdApi.UserPrivacySettingShowStatus.CONSTRUCTOR:
                    raVar2 = new ra(8, R.id.btn_description, 0, R.string.LastSeenTitle);
                    String i12 = w.i1(R.string.CustomHelp);
                    int indexOf = i12.indexOf(58);
                    if (indexOf != -1) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i12);
                        spannableStringBuilder.setSpan(new o(ce.o.i(), R.id.theme_color_background_textLight), 0, indexOf + 1, 33);
                        raVar = new ra(9, 0, 0, (CharSequence) spannableStringBuilder, false);
                        break;
                    } else {
                        raVar = new ra(9, 0, 0, R.string.CustomHelp);
                        break;
                    }
                default:
                    throw new IllegalStateException("privacyKey == " + x9());
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new ra(14));
            arrayList.add(raVar2);
            arrayList.add(new ra(2));
            arrayList.add(new ra(13, R.id.btn_everybody, 0, R.string.Everybody, null, R.id.btn_privacyRadio, m10 == 2));
            arrayList.add(new ra(11));
            arrayList.add(new ra(13, R.id.btn_contacts, 0, R.string.MyContacts, null, R.id.btn_privacyRadio, m10 == 1));
            if (Pg() || m10 == 0) {
                arrayList.add(new ra(11));
                arrayList.add(new ra(13, R.id.btn_nobody, 0, R.string.Nobody, null, R.id.btn_privacyRadio, m10 == 0));
            }
            arrayList.add(new ra(3));
            arrayList.add(raVar);
            if (Og()) {
                arrayList.add(new ra(8, 0, 0, R.string.AddExceptions));
                arrayList.add(new ra(2));
                boolean t10 = this.E0.t();
                if (t10) {
                    arrayList.add(new ra(89, R.id.btn_neverAllow, 0, x9().getConstructor() == 1862829310 ? R.string.NeverShareWith : R.string.NeverAllow));
                }
                if (this.E0.s()) {
                    if (t10) {
                        arrayList.add(new ra(11));
                    }
                    arrayList.add(new ra(89, R.id.btn_alwaysAllow, 0, x9().getConstructor() == 1862829310 ? R.string.AlwaysShareWith : R.string.AlwaysAllow));
                }
                arrayList.add(new ra(3));
                arrayList.add(new ra(9, 0, 0, R.string.CustomShareSettingsHelp));
            }
            this.D0.s2(arrayList, true);
            vg();
        }
    }

    public final l1 Ig() {
        l1 l1Var = this.F0;
        return l1Var != null ? l1Var : this.E0;
    }

    public final boolean Og() {
        return x9().getConstructor() != -1846645423;
    }

    public final boolean Pg() {
        int constructor = x9().getConstructor();
        return (constructor == -1846645423 || constructor == 1271668007) ? false : true;
    }

    public final boolean Qg() {
        l1 l1Var = this.F0;
        return l1Var == null || l1Var.equals(this.E0);
    }

    @Override
    public int R9() {
        return R.id.controller_privacyKey;
    }

    public final void Rg() {
        if (this.E0 != null && !Qg()) {
            this.f24495b.v4().o(new TdApi.SetUserPrivacySettingRules(x9(), this.F0.u()), this.f24495b.na());
        }
    }

    public final void Sg(long[] jArr, long[] jArr2) {
        this.F0 = l1.z(Ig().a(jArr, jArr2));
        this.D0.p3(R.id.btn_alwaysAllow);
        this.D0.p3(R.id.btn_neverAllow);
    }

    public final void Tg(long[] jArr, long[] jArr2) {
        this.F0 = l1.z(Ig().b(jArr, jArr2));
        this.D0.p3(R.id.btn_neverAllow);
        this.D0.p3(R.id.btn_alwaysAllow);
    }

    public final void Ug(TdApi.UserPrivacySettingRules userPrivacySettingRules) {
        int i10;
        if (this.E0 == null) {
            this.E0 = l1.z(userPrivacySettingRules);
            Hg();
            n9();
            return;
        }
        Ig().m();
        l1 z10 = l1.z(userPrivacySettingRules);
        this.E0 = z10;
        l1 l1Var = this.F0;
        if (l1Var == null) {
            int m10 = Ig().m();
            if (m10 == 0) {
                i10 = R.id.btn_nobody;
            } else if (m10 == 1) {
                i10 = R.id.btn_contacts;
            } else if (m10 == 2) {
                i10 = R.id.btn_everybody;
            } else {
                throw new UnsupportedOperationException();
            }
            int L0 = this.D0.L0(i10);
            if (L0 != -1) {
                iq iqVar = this.D0;
                iqVar.I1(null, iqVar.D0().get(L0), true);
            }
            Vg(Ig());
            this.D0.p3(R.id.btn_alwaysAllow);
            this.D0.p3(R.id.btn_neverAllow);
        } else if (l1Var.equals(z10)) {
            this.F0 = null;
        }
    }

    public final void Vg(l1 l1Var) {
        int L0;
        int m10 = l1Var.m();
        if (Og()) {
            boolean z10 = this.D0.L0(R.id.btn_neverAllow) != -1;
            boolean z11 = (this.D0.L0(R.id.btn_alwaysAllow) != -1) && z10;
            boolean t10 = l1Var.t();
            boolean s10 = l1Var.s();
            boolean z12 = s10 && t10;
            List<ra> D0 = this.D0.D0();
            int R0 = this.D0.R0(89);
            int i10 = x9().getConstructor() == 1862829310 ? R.string.AlwaysShareWith : R.string.AlwaysAllow;
            int i11 = x9().getConstructor() == 1862829310 ? R.string.NeverShareWith : R.string.NeverAllow;
            if (z12 == z11) {
                if (!z12) {
                    if (s10) {
                        D0.set(R0, new ra(89, R.id.btn_alwaysAllow, 0, i10));
                    } else {
                        D0.set(R0, new ra(89, R.id.btn_neverAllow, 0, i11));
                    }
                    this.D0.I(R0);
                }
            } else if (z12) {
                if (z10) {
                    int i12 = R0 + 1;
                    D0.add(i12, new ra(89, R.id.btn_alwaysAllow, 0, i10));
                    D0.add(i12, new ra(11));
                    this.D0.M(i12, 2);
                    return;
                }
                D0.add(R0, new ra(11));
                D0.add(R0, new ra(89, R.id.btn_neverAllow, 0, i11));
                this.D0.M(R0, 2);
            } else if (t10) {
                int i13 = R0 + 1;
                D0.remove(i13);
                D0.remove(i13);
                this.D0.N(i13, 2);
            } else {
                D0.remove(R0);
                D0.remove(R0);
                this.D0.N(R0, 2);
            }
        } else if (x9().getConstructor() == -1846645423 && (L0 = this.D0.L0(R.id.btn_description)) != -1) {
            if (this.D0.D0().get(L0).Y(m10 == 2 ? R.string.WhoCanFindByPhoneInfoEveryone : R.string.WhoCanFindByPhoneInfoContacts)) {
                this.D0.I(L0);
            }
        }
    }

    @Override
    public CharSequence X9() {
        return w.i1(Kg(x9(), false, false));
    }

    @Override
    public void Y1(final TdApi.UserPrivacySetting userPrivacySetting, final TdApi.UserPrivacySettingRules userPrivacySettingRules) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                ax.this.Ng(userPrivacySetting, userPrivacySettingRules);
            }
        });
    }

    @Override
    public void Z8() {
        super.Z8();
        this.f24495b.O9().u0(this);
    }

    @Override
    public long[] d4() {
        int i10 = this.G0;
        if (i10 == R.id.btn_alwaysAllow) {
            return Ig().i();
        }
        if (i10 != R.id.btn_neverAllow) {
            return null;
        }
        return Ig().h();
    }

    @Override
    public boolean dc() {
        return this.E0 == null;
    }

    @Override
    public int i6() {
        int i10 = this.G0;
        return i10 != R.id.btn_alwaysAllow ? i10 != R.id.btn_neverAllow ? R.string.AlwaysAllow : x9().getConstructor() == 1862829310 ? R.string.NeverShareWith : R.string.NeverAllow : x9().getConstructor() == 1862829310 ? R.string.AlwaysShareWith : R.string.AlwaysAllow;
    }

    @Override
    public void kc() {
        super.kc();
        Rg();
    }

    @Override
    public void m(List<d7> list) {
        e eVar = new e(list.size());
        e eVar2 = new e(list.size());
        for (d7 d7Var : list) {
            long h10 = d7Var.h();
            if (ob.a.i(h10)) {
                eVar.a(ob.a.q(h10));
            } else {
                eVar2.a(h10);
            }
        }
        int i10 = this.G0;
        if (i10 == R.id.btn_alwaysAllow) {
            Sg(eVar.g(), eVar2.g());
        } else if (i10 == R.id.btn_neverAllow) {
            Tg(eVar.g(), eVar2.g());
        }
    }

    @Override
    public void onClick(View view) {
        int i10;
        switch (view.getId()) {
            case R.id.btn_alwaysAllow:
            case R.id.btn_neverAllow:
                this.G0 = view.getId();
                f5 f5Var = new f5(this.f24493a, this.f24495b);
                f5Var.Xg(new f5.b(this).a(2373));
                ac(f5Var);
                return;
            case R.id.btn_contacts:
            case R.id.btn_everybody:
            case R.id.btn_nobody:
                ra raVar = (ra) view.getTag();
                if (this.D0.H1(view)) {
                    int i11 = this.D0.y0().get(raVar.c());
                    if (i11 == R.id.btn_contacts) {
                        i10 = 1;
                    } else if (i11 == R.id.btn_everybody) {
                        i10 = 2;
                    } else if (i11 == R.id.btn_nobody) {
                        i10 = 0;
                    } else {
                        return;
                    }
                    Ig().m();
                    l1 z10 = l1.z(Ig().w(i10));
                    this.F0 = z10;
                    Vg(z10);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void rg(Context context, CustomRecyclerView customRecyclerView) {
        a aVar = new a(this);
        this.D0 = aVar;
        customRecyclerView.setAdapter(aVar);
        this.f24495b.v4().o(new TdApi.GetUserPrivacySettingRules(x9()), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                ax.this.Mg(object);
            }
        });
        this.f24495b.O9().h0(this);
    }

    @Override
    public boolean sd(Bundle bundle, String str) {
        Object obj;
        super.sd(bundle, str);
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
        Ad(obj);
        return true;
    }

    @Override
    public boolean yd(Bundle bundle, String str) {
        super.yd(bundle, str);
        bundle.putInt(str + "setting", x9().getConstructor());
        return true;
    }
}
