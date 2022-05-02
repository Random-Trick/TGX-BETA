package p038ce;

import android.content.Context;
import android.view.View;
import gd.C4649h;
import gd.C4779t2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import me.C6952l3;
import me.C7057w;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.MediaRecyclerView;
import p038ce.C2912q9;
import p038ce.View$OnClickListenerC3141u7;
import p038ce.i10;
import p082fd.C4403w;
import p108hb.C5070i;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p111he.C5146u0;
import p124ib.C5320c;
import p193nb.C7316a;
import p193nb.C7321e;
import p350yd.C10930q6;
import p350yd.C11059v7;
import p350yd.C11133y7;
import p350yd.HandlerC10770jj;

public class c20 extends i10<C4649h> implements C11059v7.AbstractC11061b, C11059v7.AbstractC11068i, C11059v7.AbstractC11063d, C11059v7.AbstractC11069j {
    public TdApi.SupergroupMembersFilter f7727G0;
    public long f7728H0;
    public TdApi.BasicGroupFullInfo f7729I0;
    public final Comparator<C4649h> f7730J0 = new Comparator() {
        @Override
        public final int compare(Object obj, Object obj2) {
            int ph;
            ph = c20.this.m35329ph((C4649h) obj, (C4649h) obj2);
            return ph;
        }
    };

    public c20(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public static int m35336ih(ArrayList<C4649h> arrayList, TdApi.MessageSender messageSender) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int i = 0;
            Iterator<C4649h> it = arrayList.iterator();
            while (it.hasNext()) {
                if (C7321e.m16975W(it.next().m26640o(), messageSender)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public static int m35335jh(TdApi.ChatMember[] chatMemberArr, TdApi.MessageSender messageSender) {
        if (!(chatMemberArr == null || chatMemberArr.length == 0)) {
            int i = 0;
            for (TdApi.ChatMember chatMember : chatMemberArr) {
                if (C7321e.m16975W(chatMember.memberId, messageSender)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public void m35333lh(TdApi.Message message) {
        if (!m9347Sa()) {
            m35341dh(message.senderId);
        }
    }

    public void m35332mh(TdApi.ChatMember chatMember) {
        if (!m9347Sa()) {
            m35344ah(chatMember);
        }
    }

    public void m35331nh(TdApi.Object object) {
        if (object.getConstructor() == 1829953909) {
            final TdApi.ChatMember chatMember = (TdApi.ChatMember) object;
            if (C4779t2.m25507h3(chatMember.status)) {
                this.f30170b.m2485dd().post(new Runnable() {
                    @Override
                    public final void run() {
                        c20.this.m35332mh(chatMember);
                    }
                });
            }
        }
    }

    public int m35330oh(C4649h hVar, C4649h hVar2) {
        boolean k7 = this.f30170b.m2379k7(hVar.m26639p());
        if (k7 != this.f30170b.m2379k7(hVar2.m26639p())) {
            return k7 ? -1 : 1;
        }
        return 0;
    }

    public int m35329ph(C4649h hVar, C4649h hVar2) {
        return this.f30170b.m2744Me().compare(hVar, hVar2);
    }

    public void m35328qh(long j, TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        if (!m9347Sa() && this.f7728H0 == j) {
            m35319zh(basicGroupFullInfo);
        }
    }

    public void m35327rh(TdApi.BasicGroup basicGroup) {
        if (!m9347Sa()) {
            this.f30170b.m2480e2().m1611o2(this.f7728H0, this);
            this.f7728H0 = 0L;
            m34411Bg(new i10.C2519d(C7316a.m17059b(basicGroup.upgradedToSupergroupId), this.f8584o0));
        }
    }

    public void m35326sh(long j, TdApi.ChatMember chatMember) {
        if (!m9347Sa() && this.f8583n0 == j) {
            TdApi.SupergroupMembersFilter supergroupMembersFilter = this.f7727G0;
            if (supergroupMembersFilter == null) {
                supergroupMembersFilter = new TdApi.SupergroupMembersFilterRecent();
            }
            if (C4779t2.m25401w4(supergroupMembersFilter, chatMember.status)) {
                m35344ah(chatMember);
            } else {
                m35360Ah(chatMember.memberId);
            }
        }
    }

    public static Object m35325th(CharSequence charSequence, int i, int i2, int i3, boolean z) {
        if (i3 == 0) {
            return C4403w.m27891d2(z);
        }
        return null;
    }

    public void m35324uh(C4649h hVar, int i) {
        TdApi.ChatMemberStatus k = C7321e.m16937k(hVar.m26641n().status);
        int constructor = k.getConstructor();
        boolean z = true;
        if (constructor == -160019714) {
            TdApi.ChatMemberStatusCreator chatMemberStatusCreator = (TdApi.ChatMemberStatusCreator) k;
            if (i != R.id.btn_makePrivate) {
                z = false;
            }
            chatMemberStatusCreator.isAnonymous = z;
        } else if (constructor == 82243562) {
            TdApi.ChatMemberStatusAdministrator chatMemberStatusAdministrator = (TdApi.ChatMemberStatusAdministrator) k;
            if (i != R.id.btn_makePrivate) {
                z = false;
            }
            chatMemberStatusAdministrator.isAnonymous = z;
        } else {
            return;
        }
        this.f30170b.m2811Ib(this.f8583n0, hVar.m26640o(), k, hVar.m26641n().status, null);
    }

    public boolean m35323vh(final C4649h hVar, View view, final int i) {
        switch (i) {
            case R.id.btn_blockSender:
                this.f30170b.m2485dd().m3902A3(m9300Z9(), this.f8583n0, hVar.m26640o(), hVar.m26641n().status);
                break;
            case R.id.btn_editRights:
                m35340eh(hVar, false);
                break;
            case R.id.btn_makePrivate:
            case R.id.btn_makePublic:
                Runnable w10Var = new Runnable() {
                    @Override
                    public final void run() {
                        c20.this.m35324uh(hVar, i);
                    }
                };
                if (!C7316a.m17054g(this.f8583n0)) {
                    w10Var.run();
                    break;
                } else {
                    m9322Vd(C4403w.m27984H0(this, R.string.UpgradeChatPrompt, new Object[0]), C4403w.m27871i1(R.string.Proceed), w10Var);
                    break;
                }
            case R.id.btn_messageViewList:
                C2912q9 q9Var = new C2912q9(this.f30168a, this.f30170b);
                q9Var.m9476Ad(new C2912q9.C2914b(null, this.f8583n0, null, new TdApi.MessageSenderUser(hVar.m26639p()), false));
                View$OnClickListenerC3062so soVar = this.f8586q0;
                if (soVar == null) {
                    m9300Z9().m9291ac(q9Var);
                    break;
                } else {
                    soVar.m9291ac(q9Var);
                    break;
                }
            case R.id.btn_restrictMember:
                m35340eh(hVar, true);
                break;
            case R.id.btn_unblockSender:
                this.f30170b.m2485dd().m3667X8(m9300Z9(), this.f8583n0, hVar.m26640o(), hVar.m26641n().status);
                break;
        }
        return true;
    }

    @Override
    public long mo34019Af(ArrayList<C4649h> arrayList, long j) {
        return (arrayList == null || arrayList.isEmpty()) ? j : arrayList.size();
    }

    public final void m35360Ah(TdApi.MessageSender messageSender) {
        if (m34384Rf()) {
            m35359Bh(this.f8578B0, messageSender, true);
            m35359Bh(this.f8577A0, messageSender, false);
            return;
        }
        m35359Bh(this.f8577A0, messageSender, true);
    }

    public final void m35359Bh(ArrayList<C4649h> arrayList, TdApi.MessageSender messageSender, boolean z) {
        int ih = m35336ih(arrayList, messageSender);
        if (ih != -1) {
            arrayList.remove(ih);
            if (!z) {
                return;
            }
            if (arrayList.isEmpty()) {
                m34357ff();
                return;
            }
            int Ff = m34406Ff();
            if (ih == 0) {
                this.f8589t0.m34207V1(Ff, 2);
            } else {
                this.f8589t0.m34207V1((Ff + (ih * 2)) - 1, 2);
            }
            m35357Dh();
            m34346pg();
        }
    }

    public c20 m35358Ch(TdApi.SupergroupMembersFilter supergroupMembersFilter) {
        this.f7727G0 = supergroupMembersFilter;
        return this;
    }

    @Override
    public boolean mo1350D3() {
        return true;
    }

    @Override
    public int mo34018Df() {
        TdApi.SupergroupMembersFilter supergroupMembersFilter;
        if (m34384Rf() || (supergroupMembersFilter = this.f7727G0) == null) {
            return 5;
        }
        int constructor = supergroupMembersFilter.getConstructor();
        if (constructor != -1210621683) {
            return constructor != -1107800034 ? 5 : 7;
        }
        return 8;
    }

    public final void m35357Dh() {
        C2546iq iqVar = this.f8589t0;
        iqVar.m34127u3(iqVar.m34243F0().size() - 1);
    }

    @Override
    public String mo34017Ef() {
        TdApi.SupergroupMembersFilter supergroupMembersFilter = this.f7727G0;
        if (supergroupMembersFilter != null) {
            int constructor = supergroupMembersFilter.getConstructor();
            if (constructor == -2097380265) {
                return C4403w.m27871i1(R.string.MembersDetailAdmins);
            }
            if (constructor == -1210621683) {
                return C4403w.m27871i1(m35334kh() ? R.string.MembersDetailBannedChannel : R.string.MembersDetailBannedGroup);
            } else if (constructor == -1107800034) {
                return C4403w.m27871i1(R.string.MembersDetailRestricted);
            }
        }
        return C4403w.m27871i1(R.string.Recent);
    }

    public final void m35356Eh(ArrayList<C4649h> arrayList, long j, boolean z, boolean z2) {
        C2964ra raVar;
        C2964ra raVar2;
        int ih = m35336ih(arrayList, new TdApi.MessageSenderUser(j));
        if (ih != -1) {
            C4649h hVar = arrayList.get(ih);
            hVar.m26630y();
            Comparator<C4649h> vg = mo34338vg();
            if (z && vg != null) {
                arrayList.remove(ih);
                int fh = m35339fh(arrayList, hVar, vg);
                if (fh >= 0) {
                    arrayList.add(ih, hVar);
                    return;
                }
                int i = (fh * (-1)) - 1;
                arrayList.add(i, hVar);
                int Ff = m34406Ff();
                if (z2 && i != ih) {
                    if (ih == 0) {
                        raVar2 = this.f8589t0.m34243F0().remove(Ff);
                        raVar = this.f8589t0.m34243F0().remove(Ff);
                        this.f8589t0.m39310N(Ff, 2);
                    } else {
                        int i2 = (ih * 2) + Ff;
                        raVar2 = this.f8589t0.m34243F0().remove(i2);
                        int i3 = i2 - 1;
                        raVar = this.f8589t0.m34243F0().remove(i3);
                        this.f8589t0.m39310N(i3, 2);
                    }
                    if (i == 0) {
                        this.f8589t0.m34243F0().add(Ff, raVar);
                        this.f8589t0.m34243F0().add(Ff, raVar2);
                        this.f8589t0.m39311M(Ff, 2);
                        return;
                    }
                    int i4 = (Ff + (i * 2)) - 1;
                    this.f8589t0.m34243F0().add(i4, raVar2);
                    this.f8589t0.m34243F0().add(i4, raVar);
                    this.f8589t0.m39311M(i4, 2);
                }
            }
        }
    }

    @Override
    public void mo1349J3(long j, TdApi.UserStatus userStatus, boolean z) {
        boolean Rf = m34384Rf();
        ArrayList<T> arrayList = this.f8577A0;
        if (arrayList != 0 && !arrayList.isEmpty()) {
            m35356Eh(this.f8577A0, j, !z, !Rf);
        }
        ArrayList<T> arrayList2 = this.f8578B0;
        if (arrayList2 != 0 && !arrayList2.isEmpty()) {
            m35356Eh(this.f8578B0, j, !z, Rf);
        }
    }

    @Override
    public boolean mo34399Jg(boolean z) {
        return !z && C7316a.m17045p(this.f8583n0) != 0;
    }

    @Override
    public boolean mo33061Lg() {
        return false;
    }

    @Override
    public void mo1348P1(TdApi.User user) {
    }

    @Override
    public void mo1566W2(final TdApi.BasicGroup basicGroup, boolean z) {
        if (z) {
            this.f30170b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    c20.this.m35327rh(basicGroup);
                }
            });
        }
    }

    @Override
    public CharSequence mo9313X9() {
        TdApi.SupergroupMembersFilter supergroupMembersFilter = this.f7727G0;
        if (supergroupMembersFilter != null) {
            int constructor = supergroupMembersFilter.getConstructor();
            if (constructor == -2097380265) {
                return C4403w.m27871i1(R.string.TabAdmins);
            }
            if (constructor == -1210621683) {
                return C4403w.m27871i1(R.string.TabBlacklist);
            }
            if (constructor == -1107800034) {
                return C4403w.m27871i1(R.string.TabRestricted);
            }
        }
        return C4403w.m27871i1(R.string.TabMembers);
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        if (this.f7728H0 != 0) {
            this.f30170b.m2480e2().m1611o2(this.f7728H0, this);
        }
        this.f30170b.m2480e2().m1710N1(this);
        this.f30170b.m2480e2().m1714M1(this);
    }

    public final void m35344ah(TdApi.ChatMember chatMember) {
        if (m34384Rf()) {
            m35343bh(this.f8578B0, chatMember, false, true);
            m35343bh(this.f8577A0, chatMember, true, false);
            return;
        }
        m35343bh(this.f8577A0, chatMember, true, true);
    }

    public final void m35343bh(ArrayList<C4649h> arrayList, TdApi.ChatMember chatMember, boolean z, boolean z2) {
        C4649h yh;
        int fh;
        if (arrayList != null) {
            int ih = m35336ih(arrayList, chatMember.memberId);
            if (ih != -1) {
                arrayList.get(ih).m26635t(chatMember, m35321xh(), m35322wh());
            } else if (z && (yh = mo33047rg(chatMember)) != null && (fh = m35339fh(arrayList, yh, m35337hh())) < 0) {
                int i = (fh * (-1)) - 1;
                arrayList.add(i, yh);
                if (!z2) {
                    return;
                }
                if (arrayList.size() == 1) {
                    m34357ff();
                    return;
                }
                int Ff = m34406Ff();
                C2964ra raVar = new C2964ra(1);
                C2964ra G = new C2964ra(mo33044xg()).m32873G(yh);
                if (i == 0) {
                    this.f8589t0.m34243F0().add(Ff, raVar);
                    this.f8589t0.m34243F0().add(Ff, G);
                    this.f8589t0.m39311M(Ff, 2);
                } else {
                    int i2 = (Ff + (i * 2)) - 1;
                    this.f8589t0.m34243F0().add(i2, G);
                    this.f8589t0.m34243F0().add(i2, raVar);
                    this.f8589t0.m39311M(i2, 2);
                }
                m35357Dh();
                m34346pg();
            }
        }
    }

    public final void m35342ch(ArrayList<C4649h> arrayList, TdApi.MessageSender messageSender, boolean z, boolean z2) {
        C2964ra raVar;
        C2964ra raVar2;
        if (arrayList != null) {
            int ih = m35336ih(arrayList, messageSender);
            int i = 0;
            if (!arrayList.isEmpty() && this.f30170b.m2379k7(arrayList.get(0).m26639p())) {
                i = 1;
            }
            if (ih != -1) {
                if (ih > i) {
                    arrayList.add(i, arrayList.remove(ih));
                    if (z2) {
                        int Ff = m34406Ff();
                        if (ih == 0) {
                            raVar2 = this.f8589t0.m34243F0().remove(Ff);
                            raVar = this.f8589t0.m34243F0().remove(Ff);
                            this.f8589t0.m39310N(Ff, 2);
                        } else {
                            int i2 = (ih * 2) + Ff;
                            raVar2 = this.f8589t0.m34243F0().remove(i2);
                            int i3 = i2 - 1;
                            raVar = this.f8589t0.m34243F0().remove(i3);
                            this.f8589t0.m39310N(i3, 2);
                        }
                        if (i == 0) {
                            this.f8589t0.m34243F0().add(Ff, raVar);
                            this.f8589t0.m34243F0().add(Ff, raVar2);
                            this.f8589t0.m39311M(Ff, 2);
                            return;
                        }
                        int i4 = (Ff + (i * 2)) - 1;
                        this.f8589t0.m34243F0().add(i4, raVar2);
                        this.f8589t0.m34243F0().add(i4, raVar);
                        this.f8589t0.m39311M(i4, 2);
                    }
                }
            } else if (z) {
                this.f30170b.m2270r4().m14783o(new TdApi.GetChatMember(this.f8583n0, messageSender), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        c20.this.m35331nh(object);
                    }
                });
            }
        }
    }

    public final void m35341dh(TdApi.MessageSender messageSender) {
        if (messageSender.getConstructor() == -336109341) {
            if (m34384Rf()) {
                m35342ch(this.f8578B0, messageSender, false, true);
                m35342ch(this.f8577A0, messageSender, true, false);
                return;
            }
            m35342ch(this.f8577A0, messageSender, true, true);
        }
    }

    @Override
    public void mo34359ef(final TdApi.Message message) {
        if (View$OnClickListenerC3062so.m31577nj(message) && message.chatId == this.f8583n0 && !this.f30170b.m2411i7(message) && this.f30170b.m2299p7(message.chatId)) {
            this.f30170b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    c20.this.m35333lh(message);
                }
            });
        }
    }

    public final void m35340eh(C4649h hVar, boolean z) {
        TdApi.ChatMember chatMember;
        View$OnClickListenerC3062so soVar = this.f8586q0;
        if (soVar != null) {
            TdApi.Supergroup supergroup = soVar.f10337v0;
            TdApi.ChatMemberStatus chatMemberStatus = supergroup != null ? supergroup.status : soVar.f10333t0.status;
            TdApi.ChatMember n = hVar.m26641n();
            if (z) {
                if (C4779t2.m25614R(chatMemberStatus, n.status) == 1) {
                    n = null;
                }
            } else if (C4779t2.m25627P(chatMemberStatus, n.status) == 1) {
                chatMember = null;
                View$OnClickListenerC3141u7 u7Var = new View$OnClickListenerC3141u7(this.f30168a, this.f30170b);
                u7Var.m31378sg(new View$OnClickListenerC3141u7.C3145d(this.f8583n0, hVar.m26640o(), z, chatMemberStatus, chatMember));
                this.f8586q0.m9291ac(u7Var);
            }
            chatMember = n;
            View$OnClickListenerC3141u7 u7Var2 = new View$OnClickListenerC3141u7(this.f30168a, this.f30170b);
            u7Var2.m31378sg(new View$OnClickListenerC3141u7.C3145d(this.f8583n0, hVar.m26640o(), z, chatMemberStatus, chatMember));
            this.f8586q0.m9291ac(u7Var2);
        }
    }

    public final int m35339fh(List<C4649h> list, C4649h hVar, Comparator<C4649h> comparator) {
        return comparator == this.f7730J0 ? Collections.binarySearch(list, hVar, comparator) : list.indexOf(hVar);
    }

    @Override
    public void mo34354gg(C2964ra raVar, C6952l3 l3Var, C7057w wVar, boolean z) {
        C4649h hVar = (C4649h) raVar.m32847d();
        if (hVar != null && hVar.m26641n() != null) {
            TdApi.ChatMember n = hVar.m26641n();
            boolean P2 = C4779t2.m25624P2(n.status);
            if (this.f7727G0 != null && this.f8586q0 != null) {
                int A = raVar.m32879A();
                if (A == 63) {
                    l3Var.m18511K();
                } else if (A == 64) {
                    ((View) l3Var.getParent()).setEnabled(!P2);
                    if (wVar != null) {
                        wVar.setDisabled(P2);
                        wVar.m17933e(P2 || n.status.getConstructor() == 82243562, z);
                    }
                }
            }
        }
    }

    public TdApi.SupergroupMembersFilter m35338gh() {
        return this.f7727G0;
    }

    @Override
    public TdApi.Function mo34008hf(long j, long j2, String str, long j3, String str2, int i) {
        TdApi.ChatMembersFilter chatMembersFilter;
        int i2 = j3 == 0 ? 50 : 100;
        long p = C7316a.m17045p(j);
        if (!C5070i.m24062i(str)) {
            TdApi.SupergroupMembersFilter supergroupMembersFilter = this.f7727G0;
            if (supergroupMembersFilter != null) {
                switch (supergroupMembersFilter.getConstructor()) {
                    case TdApi.SupergroupMembersFilterAdministrators.CONSTRUCTOR:
                        chatMembersFilter = new TdApi.ChatMembersFilterAdministrators();
                        break;
                    case TdApi.SupergroupMembersFilterBanned.CONSTRUCTOR:
                        chatMembersFilter = new TdApi.ChatMembersFilterBanned();
                        break;
                    case TdApi.SupergroupMembersFilterRestricted.CONSTRUCTOR:
                        chatMembersFilter = new TdApi.ChatMembersFilterRestricted();
                        break;
                    case TdApi.SupergroupMembersFilterBots.CONSTRUCTOR:
                        chatMembersFilter = new TdApi.ChatMembersFilterBots();
                        break;
                }
                return new TdApi.SearchChatMembers(j, str, i2, chatMembersFilter);
            }
            chatMembersFilter = null;
            return new TdApi.SearchChatMembers(j, str, i2, chatMembersFilter);
        } else if (p != 0) {
            TdApi.SupergroupMembersFilter supergroupMembersFilter2 = this.f7727G0;
            if (supergroupMembersFilter2 == null) {
                supergroupMembersFilter2 = new TdApi.SupergroupMembersFilterRecent();
            }
            return new TdApi.GetSupergroupMembers(p, supergroupMembersFilter2, (int) j3, i2);
        } else {
            long m = C7316a.m17048m(j);
            if (m != 0) {
                m35319zh(this.f30170b.m2480e2().m1708O(m));
            }
            return null;
        }
    }

    @Override
    public void mo34353hg(ArrayList<C4649h> arrayList, boolean z) {
        Comparator<C4649h> vg;
        ArrayList arrayList2 = m34384Rf() ? this.f8578B0 : this.f8577A0;
        if (z) {
            Comparator<C4649h> hh = m35337hh();
            if (hh != null) {
                Collections.sort(arrayList, hh);
            }
        } else if (arrayList2 != null && !arrayList2.isEmpty() && (vg = mo34338vg()) != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (m35339fh(arrayList2, arrayList.get(size), vg) >= 0) {
                    arrayList.remove(size);
                }
            }
        }
    }

    public final Comparator<C4649h> m35337hh() {
        if (this.f7727G0 != null && this.f7728H0 == 0) {
            return null;
        }
        if (C7316a.m17050k(this.f8583n0)) {
            return new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    int oh;
                    oh = c20.this.m35330oh((C4649h) obj, (C4649h) obj2);
                    return oh;
                }
            };
        }
        return this.f7730J0;
    }

    @Override
    public void mo1565i4(final long j, final TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                c20.this.m35328qh(j, basicGroupFullInfo);
            }
        });
    }

    @Override
    public CharSequence mo33054if(ArrayList<C4649h> arrayList) {
        int i;
        TdApi.SupergroupMembersFilter supergroupMembersFilter = this.f7727G0;
        if (supergroupMembersFilter != null) {
            int constructor = supergroupMembersFilter.getConstructor();
            if (constructor == -2097380265) {
                i = R.string.xAdmins;
            } else if (constructor == -1210621683) {
                i = R.string.xBanned;
            } else if (constructor == -1107800034) {
                i = R.string.xUsers;
            }
            return C4403w.m27838q2(i, arrayList.size());
        }
        i = R.string.xMembers;
        return C4403w.m27838q2(i, arrayList.size());
    }

    @Override
    public boolean mo34007ig() {
        return false;
    }

    @Override
    public boolean mo33505kg() {
        return true;
    }

    public final boolean m35334kh() {
        View$OnClickListenerC3062so soVar = this.f8586q0;
        return soVar != null && soVar.m31756Tj();
    }

    @Override
    public void mo33048ng(Context context, MediaRecyclerView mediaRecyclerView, C2546iq iqVar) {
        super.mo33048ng(context, mediaRecyclerView, iqVar);
        long m = C7316a.m17048m(this.f8583n0);
        this.f7728H0 = m;
        if (m != 0) {
            this.f30170b.m2480e2().m1662b2(this.f7728H0, this);
        }
        this.f30170b.m2480e2().m1732I(this);
        this.f30170b.m2480e2().m1736H(this);
    }

    @Override
    public void onClick(View view) {
        C2964ra raVar = (C2964ra) view.getTag();
        if (raVar != null && (raVar.m32847d() instanceof C4649h)) {
            C4649h hVar = (C4649h) raVar.m32847d();
            if (this.f8586q0 != null) {
                TdApi.SupergroupMembersFilter supergroupMembersFilter = this.f7727G0;
                if (supergroupMembersFilter == null || supergroupMembersFilter.getConstructor() == 1178199509) {
                    this.f30170b.m2485dd().m3429v7(this, hVar.m26639p(), new HandlerC10770jj.C10788q().m3312s(mo4347s().m14584H3().m8985g(view)));
                    return;
                }
                int constructor = this.f7727G0.getConstructor();
                if (constructor == -2097380265) {
                    m35340eh(hVar, false);
                } else if (constructor == -1210621683 || constructor == -1107800034) {
                    m35340eh(hVar, true);
                }
            }
        }
    }

    @Override
    public boolean mo33504qg(View view, C2964ra raVar) {
        CharSequence charSequence;
        int i;
        int i2;
        int i3;
        final C4649h hVar = (C4649h) raVar.m32847d();
        TdApi.ChatMember n = hVar.m26641n();
        if (!(this.f8586q0 == null || n == null)) {
            C5320c cVar = new C5320c(3);
            C5320c cVar2 = new C5320c(3);
            C5320c cVar3 = new C5320c(3);
            C5146u0 u0Var = new C5146u0(3);
            int i4 = (this.f7728H0 > 0L ? 1 : (this.f7728H0 == 0L ? 0 : -1));
            View$OnClickListenerC3062so soVar = this.f8586q0;
            TdApi.ChatMemberStatus chatMemberStatus = i4 != 0 ? soVar.f10333t0.status : soVar.f10337v0.status;
            if (!C4779t2.m25624P2(n.status)) {
                int P = C4779t2.m25627P(chatMemberStatus, n.status);
                if (P != 0) {
                    cVar.m23285a(R.id.btn_editRights);
                    cVar2.m23285a(1);
                    cVar3.m23285a(R.drawable.baseline_stars_24);
                    if (P == 1) {
                        u0Var.m23817a(R.string.SetAsAdmin);
                    } else if (P == 2) {
                        u0Var.m23817a(R.string.EditAdminRights);
                    } else if (P == 3) {
                        u0Var.m23817a(R.string.ViewAdminRights);
                    } else {
                        throw new IllegalStateException();
                    }
                    if (n.status.getConstructor() == 82243562 && ((!m35334kh() || ((TdApi.ChatMemberStatusAdministrator) n.status).isAnonymous) && (C4779t2.m25624P2(chatMemberStatus) || (chatMemberStatus.getConstructor() == 82243562 && ((TdApi.ChatMemberStatusAdministrator) chatMemberStatus).isAnonymous && P != 3)))) {
                        boolean z = ((TdApi.ChatMemberStatusAdministrator) n.status).isAnonymous;
                        cVar.m23285a(z ? R.id.btn_makePublic : R.id.btn_makePrivate);
                        cVar2.m23285a(1);
                        cVar3.m23285a(z ? R.drawable.nilsfast_baseline_incognito_off_24 : R.drawable.infanf_baseline_incognito_24);
                        u0Var.m23817a(z ? R.string.EditAdminPublic : R.string.EditAdminAnonymous);
                    }
                }
                int R = C4779t2.m25614R(chatMemberStatus, n.status);
                if (R != 0) {
                    if (!m35334kh() && !(R == 2 && n.memberId.getConstructor() == -239660751)) {
                        cVar.m23285a(R.id.btn_restrictMember);
                        cVar2.m23285a(1);
                        cVar3.m23285a(R.drawable.baseline_block_24);
                        if (R == 1) {
                            if (n.memberId.getConstructor() == -239660751) {
                                i2 = this.f30170b.m2784K6(((TdApi.MessageSenderChat) n.memberId).chatId) ? R.string.BanChannel : R.string.BanChat;
                            } else {
                                i2 = R.string.RestrictUser;
                            }
                            u0Var.m23817a(i2);
                        } else if (R == 2) {
                            if (n.memberId.getConstructor() == -239660751) {
                                i3 = this.f30170b.m2784K6(((TdApi.MessageSenderChat) n.memberId).chatId) ? R.string.EditChannelRestrictions : R.string.EditGroupRestrictions;
                            } else {
                                i3 = R.string.EditUserRestrictions;
                            }
                            u0Var.m23817a(i3);
                        } else if (R == 3) {
                            u0Var.m23817a(R.string.ViewRestrictions);
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    if (R != 3) {
                        if (C4779t2.m25507h3(n.status)) {
                            cVar.m23285a(R.id.btn_blockSender);
                            cVar2.m23285a(1);
                            cVar3.m23285a(R.drawable.baseline_remove_circle_24);
                            u0Var.m23817a(m35334kh() ? R.string.ChannelRemoveUser : R.string.RemoveFromGroup);
                        } else {
                            int constructor = n.status.getConstructor();
                            if (constructor == -1653518666 || constructor == 1661432998) {
                                if (n.status.getConstructor() == 1661432998) {
                                    i = R.string.RemoveRestrictions;
                                } else if (this.f30170b.m2480e2().m1680V1(n.memberId)) {
                                    i = R.string.UnbanMemberBot;
                                } else if (n.memberId.getConstructor() == -239660751) {
                                    i = this.f30170b.m2784K6(C7321e.m16986Q0(n.memberId)) ? R.string.UnbanMemberChannel : R.string.UnbanMemberGroup;
                                } else {
                                    i = R.string.UnbanMember;
                                }
                                u0Var.m23817a(i);
                                cVar.m23285a(R.id.btn_unblockSender);
                                cVar2.m23285a(1);
                                cVar3.m23285a(R.drawable.baseline_remove_circle_24);
                            }
                        }
                    }
                }
            } else if (C4779t2.m25624P2(chatMemberStatus)) {
                cVar.m23285a(R.id.btn_editRights);
                cVar2.m23285a(1);
                cVar3.m23285a(R.drawable.baseline_edit_24);
                u0Var.m23817a(R.string.EditAdminTitle);
                boolean z2 = ((TdApi.ChatMemberStatusCreator) n.status).isAnonymous;
                if (!m35334kh() || z2) {
                    cVar.m23285a(z2 ? R.id.btn_makePublic : R.id.btn_makePrivate);
                    cVar2.m23285a(1);
                    cVar3.m23285a(z2 ? R.drawable.nilsfast_baseline_incognito_off_24 : R.drawable.infanf_baseline_incognito_24);
                    u0Var.m23817a(z2 ? R.string.EditOwnerPublic : R.string.EditOwnerAnonymous);
                }
            }
            if (!m35334kh() || C4779t2.m25680H2(n.status)) {
                cVar.m23285a(R.id.btn_messageViewList);
                if (this.f30170b.m2379k7(hVar.m26639p())) {
                    u0Var.m23817a(R.string.ViewMessagesFromYou);
                } else {
                    u0Var.m23816b(C4403w.m27867j1(hVar.m26640o().getConstructor() == -336109341 ? R.string.ViewMessagesFromUser : R.string.ViewMessagesFromChat, this.f30170b.m2135zb(hVar.m26640o(), true)));
                }
                cVar3.m23285a(R.drawable.baseline_person_24);
                cVar2.m23285a(1);
            }
            if (!cVar.m23280f()) {
                String yb = this.f30170b.m2151yb(hVar.m26640o());
                CharSequence J1 = C4779t2.m25667J1(this, n, false);
                CharSequence L1 = C4779t2.m25653L1(n);
                r10 r10Var = r10.f9815a;
                if (L1 != null && J1 != null) {
                    charSequence = C4403w.m27875h1(R.string.format_nameStatusDate, r10Var, yb, J1, L1);
                } else if (L1 != null) {
                    charSequence = C4403w.m27875h1(R.string.format_nameAndDate, r10Var, yb, L1);
                } else if (J1 != null) {
                    charSequence = C4403w.m27875h1(R.string.format_nameAndStatus, r10Var, yb, J1);
                } else {
                    charSequence = C4403w.m27841q(yb);
                }
                m9261ee(charSequence, cVar.m23281e(), u0Var.m23814d(), cVar2.m23281e(), cVar3.m23281e(), new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view2, int i5) {
                        boolean vh;
                        vh = c20.this.m35323vh(hVar, view2, i5);
                        return vh;
                    }

                    @Override
                    public boolean mo492Q() {
                        return C5115g0.m23936a(this);
                    }

                    @Override
                    public Object mo491b2(int i5) {
                        return C5115g0.m23935b(this, i5);
                    }
                });
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean mo33503rf() {
        return true;
    }

    @Override
    public void mo1560u2(final long j, final TdApi.ChatMember chatMember) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                c20.this.m35326sh(j, chatMember);
            }
        });
    }

    @Override
    public void mo1335u7(long j, TdApi.UserFullInfo userFullInfo) {
        C11133y7.m1438a(this, j, userFullInfo);
    }

    @Override
    public Comparator<C4649h> mo34338vg() {
        if ((this.f7727G0 == null || this.f7728H0 != 0) && !C7316a.m17050k(this.f8583n0)) {
            return this.f7730J0;
        }
        return null;
    }

    public final boolean m35322wh() {
        TdApi.SupergroupMembersFilter supergroupMembersFilter = this.f7727G0;
        return supergroupMembersFilter == null || supergroupMembersFilter.getConstructor() != -2097380265;
    }

    @Override
    public int mo33044xg() {
        return 63;
    }

    public final boolean m35321xh() {
        TdApi.SupergroupMembersFilter supergroupMembersFilter = this.f7727G0;
        return (supergroupMembersFilter == null || supergroupMembersFilter.getConstructor() == 1178199509) ? false : true;
    }

    public C4649h mo33047rg(TdApi.Object object) {
        TdApi.SupergroupMembersFilter supergroupMembersFilter;
        int constructor = object.getConstructor();
        if (constructor == -537797015) {
            return new C4649h(this.f30170b, ((TdApi.User) object).f25442id, true);
        }
        if (constructor != 1829953909) {
            return null;
        }
        if (this.f7728H0 == 0 || (supergroupMembersFilter = this.f7727G0) == null || C4779t2.m25401w4(supergroupMembersFilter, ((TdApi.ChatMember) object).status)) {
            return C4649h.m26648A(this.f30170b, (TdApi.ChatMember) object, m35321xh(), m35322wh());
        }
        return null;
    }

    public final void m35319zh(TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        TdApi.ChatMember[] chatMemberArr;
        TdApi.SupergroupMembersFilter supergroupMembersFilter;
        if (basicGroupFullInfo != null) {
            if (this.f7729I0 == null || m34384Rf()) {
                this.f7729I0 = basicGroupFullInfo;
                m34370Yf("", 0L, basicGroupFullInfo, 0);
                return;
            }
            this.f7729I0 = basicGroupFullInfo;
            for (int size = this.f8577A0.size() - 1; size >= 0; size--) {
                C4649h hVar = (C4649h) this.f8577A0.get(size);
                if (m35335jh(basicGroupFullInfo.members, hVar.m26640o()) == -1 || ((supergroupMembersFilter = this.f7727G0) != null && !C4779t2.m25401w4(supergroupMembersFilter, hVar.m26641n().status))) {
                    m35360Ah(hVar.m26640o());
                }
            }
            for (TdApi.ChatMember chatMember : basicGroupFullInfo.members) {
                TdApi.SupergroupMembersFilter supergroupMembersFilter2 = this.f7727G0;
                if (supergroupMembersFilter2 == null || C4779t2.m25401w4(supergroupMembersFilter2, chatMember.status)) {
                    m35344ah(chatMember);
                }
            }
        }
    }
}
