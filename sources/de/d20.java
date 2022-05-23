package de;

import android.content.Context;
import android.view.View;
import de.j10;
import de.q9;
import de.u7;
import gd.w;
import hd.h;
import hd.t2;
import ib.i;
import ie.g0;
import ie.h0;
import ie.u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import jb.c;
import ne.l3;
import ob.a;
import ob.e;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.MediaRecyclerView;
import zd.hj;
import zd.o6;
import zd.t7;
import zd.w7;

public class d20 extends j10<h> implements t7.b, t7.i, t7.d, t7.j {
    public TdApi.SupergroupMembersFilter G0;
    public long H0;
    public TdApi.BasicGroupFullInfo I0;
    public final Comparator<h> J0 = new Comparator() {
        @Override
        public final int compare(Object obj, Object obj2) {
            int ph;
            ph = d20.this.ph((h) obj, (h) obj2);
            return ph;
        }
    };

    public d20(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public static int ih(ArrayList<h> arrayList, TdApi.MessageSender messageSender) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int i10 = 0;
            Iterator<h> it = arrayList.iterator();
            while (it.hasNext()) {
                if (e.Y(it.next().o(), messageSender)) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    public static int jh(TdApi.ChatMember[] chatMemberArr, TdApi.MessageSender messageSender) {
        if (!(chatMemberArr == null || chatMemberArr.length == 0)) {
            int i10 = 0;
            for (TdApi.ChatMember chatMember : chatMemberArr) {
                if (e.Y(chatMember.memberId, messageSender)) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    public void lh(TdApi.Message message) {
        if (!Sa()) {
            dh(message.senderId);
        }
    }

    public void mh(TdApi.ChatMember chatMember) {
        if (!Sa()) {
            ah(chatMember);
        }
    }

    public void nh(TdApi.Object object) {
        if (object.getConstructor() == 1829953909) {
            final TdApi.ChatMember chatMember = (TdApi.ChatMember) object;
            if (t2.h3(chatMember.status)) {
                this.f24495b.hd().post(new Runnable() {
                    @Override
                    public final void run() {
                        d20.this.mh(chatMember);
                    }
                });
            }
        }
    }

    public int oh(h hVar, h hVar2) {
        boolean o72 = this.f24495b.o7(hVar.p());
        if (o72 != this.f24495b.o7(hVar2.p())) {
            return o72 ? -1 : 1;
        }
        return 0;
    }

    public int ph(h hVar, h hVar2) {
        return this.f24495b.Se().compare(hVar, hVar2);
    }

    public void qh(long j10, TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        if (!Sa() && this.H0 == j10) {
            zh(basicGroupFullInfo);
        }
    }

    public void rh(TdApi.BasicGroup basicGroup) {
        if (!Sa()) {
            this.f24495b.e2().n2(this.H0, this);
            this.H0 = 0L;
            Bg(new j10.d(a.b(basicGroup.upgradedToSupergroupId), this.f8362o0));
        }
    }

    public void sh(long j10, TdApi.ChatMember chatMember) {
        if (!Sa() && this.f8361n0 == j10) {
            TdApi.SupergroupMembersFilter supergroupMembersFilter = this.G0;
            if (supergroupMembersFilter == null) {
                supergroupMembersFilter = new TdApi.SupergroupMembersFilterRecent();
            }
            if (t2.w4(supergroupMembersFilter, chatMember.status)) {
                ah(chatMember);
            } else {
                Ah(chatMember.memberId);
            }
        }
    }

    public static Object th(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
        if (i12 == 0) {
            return w.d2(z10);
        }
        return null;
    }

    public void uh(h hVar, int i10) {
        TdApi.ChatMemberStatus l10 = e.l(hVar.n().status);
        int constructor = l10.getConstructor();
        boolean z10 = true;
        if (constructor == -160019714) {
            TdApi.ChatMemberStatusCreator chatMemberStatusCreator = (TdApi.ChatMemberStatusCreator) l10;
            if (i10 != R.id.btn_makePrivate) {
                z10 = false;
            }
            chatMemberStatusCreator.isAnonymous = z10;
        } else if (constructor == -70024163) {
            TdApi.ChatAdministratorRights chatAdministratorRights = ((TdApi.ChatMemberStatusAdministrator) l10).rights;
            if (i10 != R.id.btn_makePrivate) {
                z10 = false;
            }
            chatAdministratorRights.isAnonymous = z10;
        } else {
            return;
        }
        this.f24495b.Mb(this.f8361n0, hVar.o(), l10, hVar.n().status, null);
    }

    public boolean vh(final h hVar, View view, final int i10) {
        switch (i10) {
            case R.id.btn_blockSender:
                this.f24495b.hd().A3(Z9(), this.f8361n0, hVar.o(), hVar.n().status);
                break;
            case R.id.btn_editRights:
                eh(hVar, false);
                break;
            case R.id.btn_makePrivate:
            case R.id.btn_makePublic:
                Runnable x10Var = new Runnable() {
                    @Override
                    public final void run() {
                        d20.this.uh(hVar, i10);
                    }
                };
                if (!a.g(this.f8361n0)) {
                    x10Var.run();
                    break;
                } else {
                    Vd(w.H0(this, R.string.UpgradeChatPrompt, new Object[0]), w.i1(R.string.Proceed), x10Var);
                    break;
                }
            case R.id.btn_messageViewList:
                q9 q9Var = new q9(this.f24493a, this.f24495b);
                q9Var.Ad(new q9.b(null, this.f8361n0, null, new TdApi.MessageSenderUser(hVar.p()), false));
                so soVar = this.f8364q0;
                if (soVar == null) {
                    Z9().ac(q9Var);
                    break;
                } else {
                    soVar.ac(q9Var);
                    break;
                }
            case R.id.btn_restrictMember:
                eh(hVar, true);
                break;
            case R.id.btn_unblockSender:
                this.f24495b.hd().Y8(Z9(), this.f8361n0, hVar.o(), hVar.n().status);
                break;
        }
        return true;
    }

    @Override
    public void A3(long j10, TdApi.UserStatus userStatus, boolean z10) {
        boolean Rf = Rf();
        ArrayList<T> arrayList = this.A0;
        if (arrayList != 0 && !arrayList.isEmpty()) {
            Eh(this.A0, j10, !z10, !Rf);
        }
        ArrayList<T> arrayList2 = this.B0;
        if (arrayList2 != 0 && !arrayList2.isEmpty()) {
            Eh(this.B0, j10, !z10, Rf);
        }
    }

    @Override
    public long Af(ArrayList<h> arrayList, long j10) {
        return (arrayList == null || arrayList.isEmpty()) ? j10 : arrayList.size();
    }

    public final void Ah(TdApi.MessageSender messageSender) {
        if (Rf()) {
            Bh(this.B0, messageSender, true);
            Bh(this.A0, messageSender, false);
            return;
        }
        Bh(this.A0, messageSender, true);
    }

    public final void Bh(ArrayList<h> arrayList, TdApi.MessageSender messageSender, boolean z10) {
        int ih = ih(arrayList, messageSender);
        if (ih != -1) {
            arrayList.remove(ih);
            if (!z10) {
                return;
            }
            if (arrayList.isEmpty()) {
                ff();
                return;
            }
            int Ff = Ff();
            if (ih == 0) {
                this.f8367t0.R1(Ff, 2);
            } else {
                this.f8367t0.R1((Ff + (ih * 2)) - 1, 2);
            }
            Dh();
            pg();
        }
    }

    public d20 Ch(TdApi.SupergroupMembersFilter supergroupMembersFilter) {
        this.G0 = supergroupMembersFilter;
        return this;
    }

    @Override
    public int Df() {
        TdApi.SupergroupMembersFilter supergroupMembersFilter;
        if (Rf() || (supergroupMembersFilter = this.G0) == null) {
            return 5;
        }
        int constructor = supergroupMembersFilter.getConstructor();
        if (constructor != -1210621683) {
            return constructor != -1107800034 ? 5 : 7;
        }
        return 8;
    }

    public final void Dh() {
        iq iqVar = this.f8367t0;
        iqVar.r3(iqVar.D0().size() - 1);
    }

    @Override
    public String Ef() {
        TdApi.SupergroupMembersFilter supergroupMembersFilter = this.G0;
        if (supergroupMembersFilter != null) {
            int constructor = supergroupMembersFilter.getConstructor();
            if (constructor == -2097380265) {
                return w.i1(R.string.MembersDetailAdmins);
            }
            if (constructor == -1210621683) {
                return w.i1(kh() ? R.string.MembersDetailBannedChannel : R.string.MembersDetailBannedGroup);
            } else if (constructor == -1107800034) {
                return w.i1(R.string.MembersDetailRestricted);
            }
        }
        return w.i1(R.string.Recent);
    }

    public final void Eh(ArrayList<h> arrayList, long j10, boolean z10, boolean z11) {
        ra raVar;
        ra raVar2;
        int ih = ih(arrayList, new TdApi.MessageSenderUser(j10));
        if (ih != -1) {
            h hVar = arrayList.get(ih);
            hVar.y();
            Comparator<h> vg = vg();
            if (z10 && vg != null) {
                arrayList.remove(ih);
                int fh = fh(arrayList, hVar, vg);
                if (fh >= 0) {
                    arrayList.add(ih, hVar);
                    return;
                }
                int i10 = (fh * (-1)) - 1;
                arrayList.add(i10, hVar);
                int Ff = Ff();
                if (z11 && i10 != ih) {
                    if (ih == 0) {
                        raVar2 = this.f8367t0.D0().remove(Ff);
                        raVar = this.f8367t0.D0().remove(Ff);
                        this.f8367t0.N(Ff, 2);
                    } else {
                        int i11 = (ih * 2) + Ff;
                        raVar2 = this.f8367t0.D0().remove(i11);
                        int i12 = i11 - 1;
                        raVar = this.f8367t0.D0().remove(i12);
                        this.f8367t0.N(i12, 2);
                    }
                    if (i10 == 0) {
                        this.f8367t0.D0().add(Ff, raVar);
                        this.f8367t0.D0().add(Ff, raVar2);
                        this.f8367t0.M(Ff, 2);
                        return;
                    }
                    int i13 = (Ff + (i10 * 2)) - 1;
                    this.f8367t0.D0().add(i13, raVar2);
                    this.f8367t0.D0().add(i13, raVar);
                    this.f8367t0.M(i13, 2);
                }
            }
        }
    }

    @Override
    public boolean Jg(boolean z10) {
        return !z10 && a.p(this.f8361n0) != 0;
    }

    @Override
    public void K2(final TdApi.BasicGroup basicGroup, boolean z10) {
        if (z10) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    d20.this.rh(basicGroup);
                }
            });
        }
    }

    @Override
    public boolean Lg() {
        return false;
    }

    @Override
    public void M1(TdApi.User user) {
    }

    @Override
    public void V3(final long j10, final TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                d20.this.qh(j10, basicGroupFullInfo);
            }
        });
    }

    @Override
    public CharSequence X9() {
        TdApi.SupergroupMembersFilter supergroupMembersFilter = this.G0;
        if (supergroupMembersFilter != null) {
            int constructor = supergroupMembersFilter.getConstructor();
            if (constructor == -2097380265) {
                return w.i1(R.string.TabAdmins);
            }
            if (constructor == -1210621683) {
                return w.i1(R.string.TabBlacklist);
            }
            if (constructor == -1107800034) {
                return w.i1(R.string.TabRestricted);
            }
        }
        return w.i1(R.string.TabMembers);
    }

    @Override
    public void Z8() {
        super.Z8();
        if (this.H0 != 0) {
            this.f24495b.e2().n2(this.H0, this);
        }
        this.f24495b.e2().L1(this);
        this.f24495b.e2().K1(this);
    }

    public final void ah(TdApi.ChatMember chatMember) {
        if (Rf()) {
            bh(this.B0, chatMember, false, true);
            bh(this.A0, chatMember, true, false);
            return;
        }
        bh(this.A0, chatMember, true, true);
    }

    public final void bh(ArrayList<h> arrayList, TdApi.ChatMember chatMember, boolean z10, boolean z11) {
        h yh;
        int fh;
        if (arrayList != null) {
            int ih = ih(arrayList, chatMember.memberId);
            if (ih != -1) {
                arrayList.get(ih).t(chatMember, xh(), wh());
            } else if (z10 && (yh = rg(chatMember)) != null && (fh = fh(arrayList, yh, hh())) < 0) {
                int i10 = (fh * (-1)) - 1;
                arrayList.add(i10, yh);
                if (!z11) {
                    return;
                }
                if (arrayList.size() == 1) {
                    ff();
                    return;
                }
                int Ff = Ff();
                ra raVar = new ra(1);
                ra G = new ra(xg()).G(yh);
                if (i10 == 0) {
                    this.f8367t0.D0().add(Ff, raVar);
                    this.f8367t0.D0().add(Ff, G);
                    this.f8367t0.M(Ff, 2);
                } else {
                    int i11 = (Ff + (i10 * 2)) - 1;
                    this.f8367t0.D0().add(i11, G);
                    this.f8367t0.D0().add(i11, raVar);
                    this.f8367t0.M(i11, 2);
                }
                Dh();
                pg();
            }
        }
    }

    public final void ch(ArrayList<h> arrayList, TdApi.MessageSender messageSender, boolean z10, boolean z11) {
        ra raVar;
        ra raVar2;
        if (arrayList != null) {
            int ih = ih(arrayList, messageSender);
            int i10 = 0;
            if (!arrayList.isEmpty() && this.f24495b.o7(arrayList.get(0).p())) {
                i10 = 1;
            }
            if (ih != -1) {
                if (ih > i10) {
                    arrayList.add(i10, arrayList.remove(ih));
                    if (z11) {
                        int Ff = Ff();
                        if (ih == 0) {
                            raVar2 = this.f8367t0.D0().remove(Ff);
                            raVar = this.f8367t0.D0().remove(Ff);
                            this.f8367t0.N(Ff, 2);
                        } else {
                            int i11 = (ih * 2) + Ff;
                            raVar2 = this.f8367t0.D0().remove(i11);
                            int i12 = i11 - 1;
                            raVar = this.f8367t0.D0().remove(i12);
                            this.f8367t0.N(i12, 2);
                        }
                        if (i10 == 0) {
                            this.f8367t0.D0().add(Ff, raVar);
                            this.f8367t0.D0().add(Ff, raVar2);
                            this.f8367t0.M(Ff, 2);
                            return;
                        }
                        int i13 = (Ff + (i10 * 2)) - 1;
                        this.f8367t0.D0().add(i13, raVar2);
                        this.f8367t0.D0().add(i13, raVar);
                        this.f8367t0.M(i13, 2);
                    }
                }
            } else if (z10) {
                this.f24495b.v4().o(new TdApi.GetChatMember(this.f8361n0, messageSender), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        d20.this.nh(object);
                    }
                });
            }
        }
    }

    public final void dh(TdApi.MessageSender messageSender) {
        if (messageSender.getConstructor() == -336109341) {
            if (Rf()) {
                ch(this.B0, messageSender, false, true);
                ch(this.A0, messageSender, true, false);
                return;
            }
            ch(this.A0, messageSender, true, true);
        }
    }

    @Override
    public void ef(final TdApi.Message message) {
        if (so.nj(message) && message.chatId == this.f8361n0 && !this.f24495b.m7(message) && this.f24495b.t7(message.chatId)) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    d20.this.lh(message);
                }
            });
        }
    }

    public final void eh(h hVar, boolean z10) {
        TdApi.ChatMember chatMember;
        so soVar = this.f8364q0;
        if (soVar != null) {
            TdApi.Supergroup supergroup = soVar.f9534v0;
            TdApi.ChatMemberStatus chatMemberStatus = supergroup != null ? supergroup.status : soVar.f9530t0.status;
            TdApi.ChatMember n10 = hVar.n();
            if (z10) {
                if (t2.R(chatMemberStatus, n10.status) == 1) {
                    n10 = null;
                }
            } else if (t2.P(chatMemberStatus, n10.status) == 1) {
                chatMember = null;
                u7 u7Var = new u7(this.f24493a, this.f24495b);
                u7Var.sg(new u7.d(this.f8361n0, hVar.o(), z10, chatMemberStatus, chatMember));
                this.f8364q0.ac(u7Var);
            }
            chatMember = n10;
            u7 u7Var2 = new u7(this.f24493a, this.f24495b);
            u7Var2.sg(new u7.d(this.f8361n0, hVar.o(), z10, chatMemberStatus, chatMember));
            this.f8364q0.ac(u7Var2);
        }
    }

    public final int fh(List<h> list, h hVar, Comparator<h> comparator) {
        return comparator == this.J0 ? Collections.binarySearch(list, hVar, comparator) : list.indexOf(hVar);
    }

    @Override
    public void gg(ra raVar, l3 l3Var, ne.w wVar, boolean z10) {
        h hVar = (h) raVar.d();
        if (hVar != null && hVar.n() != null) {
            TdApi.ChatMember n10 = hVar.n();
            boolean P2 = t2.P2(n10.status);
            if (this.G0 != null && this.f8364q0 != null) {
                int A = raVar.A();
                if (A == 63) {
                    l3Var.L();
                } else if (A == 64) {
                    ((View) l3Var.getParent()).setEnabled(!P2);
                    if (wVar != null) {
                        wVar.setDisabled(P2);
                        wVar.e(P2 || n10.status.getConstructor() == -70024163, z10);
                    }
                }
            }
        }
    }

    public TdApi.SupergroupMembersFilter gh() {
        return this.G0;
    }

    @Override
    public TdApi.Function hf(long j10, long j11, String str, long j12, String str2, int i10) {
        TdApi.ChatMembersFilter chatMembersFilter;
        int i11 = j12 == 0 ? 50 : 100;
        long p10 = a.p(j10);
        if (!i.i(str)) {
            TdApi.SupergroupMembersFilter supergroupMembersFilter = this.G0;
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
                return new TdApi.SearchChatMembers(j10, str, i11, chatMembersFilter);
            }
            chatMembersFilter = null;
            return new TdApi.SearchChatMembers(j10, str, i11, chatMembersFilter);
        } else if (p10 != 0) {
            TdApi.SupergroupMembersFilter supergroupMembersFilter2 = this.G0;
            if (supergroupMembersFilter2 == null) {
                supergroupMembersFilter2 = new TdApi.SupergroupMembersFilterRecent();
            }
            return new TdApi.GetSupergroupMembers(p10, supergroupMembersFilter2, (int) j12, i11);
        } else {
            long m10 = a.m(j10);
            if (m10 != 0) {
                zh(this.f24495b.e2().O(m10));
            }
            return null;
        }
    }

    @Override
    public void hg(ArrayList<h> arrayList, boolean z10) {
        Comparator<h> vg;
        ArrayList arrayList2 = Rf() ? this.B0 : this.A0;
        if (z10) {
            Comparator<h> hh = hh();
            if (hh != null) {
                Collections.sort(arrayList, hh);
            }
        } else if (arrayList2 != null && !arrayList2.isEmpty() && (vg = vg()) != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (fh(arrayList2, arrayList.get(size), vg) >= 0) {
                    arrayList.remove(size);
                }
            }
        }
    }

    public final Comparator<h> hh() {
        if (this.G0 != null && this.H0 == 0) {
            return null;
        }
        if (a.k(this.f8361n0)) {
            return new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    int oh;
                    oh = d20.this.oh((h) obj, (h) obj2);
                    return oh;
                }
            };
        }
        return this.J0;
    }

    @Override
    public CharSequence mo1if(ArrayList<h> arrayList) {
        int i10;
        TdApi.SupergroupMembersFilter supergroupMembersFilter = this.G0;
        if (supergroupMembersFilter != null) {
            int constructor = supergroupMembersFilter.getConstructor();
            if (constructor == -2097380265) {
                i10 = R.string.xAdmins;
            } else if (constructor == -1210621683) {
                i10 = R.string.xBanned;
            } else if (constructor == -1107800034) {
                i10 = R.string.xUsers;
            }
            return w.q2(i10, arrayList.size());
        }
        i10 = R.string.xMembers;
        return w.q2(i10, arrayList.size());
    }

    @Override
    public boolean ig() {
        return false;
    }

    @Override
    public boolean kg() {
        return true;
    }

    public final boolean kh() {
        so soVar = this.f8364q0;
        return soVar != null && soVar.Tj();
    }

    @Override
    public void ng(Context context, MediaRecyclerView mediaRecyclerView, iq iqVar) {
        super.ng(context, mediaRecyclerView, iqVar);
        long m10 = a.m(this.f8361n0);
        this.H0 = m10;
        if (m10 != 0) {
            this.f24495b.e2().Z1(this.H0, this);
        }
        this.f24495b.e2().I(this);
        this.f24495b.e2().H(this);
    }

    @Override
    public void onClick(View view) {
        ra raVar = (ra) view.getTag();
        if (raVar != null && (raVar.d() instanceof h)) {
            h hVar = (h) raVar.d();
            if (this.f8364q0 != null) {
                TdApi.SupergroupMembersFilter supergroupMembersFilter = this.G0;
                if (supergroupMembersFilter == null || supergroupMembersFilter.getConstructor() == 1178199509) {
                    this.f24495b.hd().v7(this, hVar.p(), new hj.q().s(t().I3().g(view)));
                    return;
                }
                int constructor = this.G0.getConstructor();
                if (constructor == -2097380265) {
                    eh(hVar, false);
                } else if (constructor == -1210621683 || constructor == -1107800034) {
                    eh(hVar, true);
                }
            }
        }
    }

    @Override
    public boolean qg(View view, ra raVar) {
        CharSequence charSequence;
        int i10;
        int i11;
        int i12;
        final h hVar = (h) raVar.d();
        TdApi.ChatMember n10 = hVar.n();
        if (!(this.f8364q0 == null || n10 == null)) {
            c cVar = new c(3);
            c cVar2 = new c(3);
            c cVar3 = new c(3);
            u0 u0Var = new u0(3);
            int i13 = (this.H0 > 0L ? 1 : (this.H0 == 0L ? 0 : -1));
            so soVar = this.f8364q0;
            TdApi.ChatMemberStatus chatMemberStatus = i13 != 0 ? soVar.f9530t0.status : soVar.f9534v0.status;
            if (!t2.P2(n10.status)) {
                int P = t2.P(chatMemberStatus, n10.status);
                if (P != 0) {
                    cVar.a(R.id.btn_editRights);
                    cVar2.a(1);
                    cVar3.a(R.drawable.baseline_stars_24);
                    if (P == 1) {
                        u0Var.a(R.string.SetAsAdmin);
                    } else if (P == 2) {
                        u0Var.a(R.string.EditAdminRights);
                    } else if (P == 3) {
                        u0Var.a(R.string.ViewAdminRights);
                    } else {
                        throw new IllegalStateException();
                    }
                    if (n10.status.getConstructor() == -70024163 && ((!kh() || ((TdApi.ChatMemberStatusAdministrator) n10.status).rights.isAnonymous) && (t2.P2(chatMemberStatus) || (chatMemberStatus.getConstructor() == -70024163 && ((TdApi.ChatMemberStatusAdministrator) chatMemberStatus).rights.isAnonymous && P != 3)))) {
                        boolean z10 = ((TdApi.ChatMemberStatusAdministrator) n10.status).rights.isAnonymous;
                        cVar.a(z10 ? R.id.btn_makePublic : R.id.btn_makePrivate);
                        cVar2.a(1);
                        cVar3.a(z10 ? R.drawable.nilsfast_baseline_incognito_off_24 : R.drawable.infanf_baseline_incognito_24);
                        u0Var.a(z10 ? R.string.EditAdminPublic : R.string.EditAdminAnonymous);
                    }
                }
                int R = t2.R(chatMemberStatus, n10.status);
                if (R != 0) {
                    if (!kh() && !(R == 2 && n10.memberId.getConstructor() == -239660751)) {
                        cVar.a(R.id.btn_restrictMember);
                        cVar2.a(1);
                        cVar3.a(R.drawable.baseline_block_24);
                        if (R == 1) {
                            if (n10.memberId.getConstructor() == -239660751) {
                                i11 = this.f24495b.O6(((TdApi.MessageSenderChat) n10.memberId).chatId) ? R.string.BanChannel : R.string.BanChat;
                            } else {
                                i11 = R.string.RestrictUser;
                            }
                            u0Var.a(i11);
                        } else if (R == 2) {
                            if (n10.memberId.getConstructor() == -239660751) {
                                i12 = this.f24495b.O6(((TdApi.MessageSenderChat) n10.memberId).chatId) ? R.string.EditChannelRestrictions : R.string.EditGroupRestrictions;
                            } else {
                                i12 = R.string.EditUserRestrictions;
                            }
                            u0Var.a(i12);
                        } else if (R == 3) {
                            u0Var.a(R.string.ViewRestrictions);
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    if (R != 3) {
                        if (t2.h3(n10.status)) {
                            cVar.a(R.id.btn_blockSender);
                            cVar2.a(1);
                            cVar3.a(R.drawable.baseline_remove_circle_24);
                            u0Var.a(kh() ? R.string.ChannelRemoveUser : R.string.RemoveFromGroup);
                        } else {
                            int constructor = n10.status.getConstructor();
                            if (constructor == -1653518666 || constructor == 1661432998) {
                                if (n10.status.getConstructor() == 1661432998) {
                                    i10 = R.string.RemoveRestrictions;
                                } else if (this.f24495b.e2().T1(n10.memberId)) {
                                    i10 = R.string.UnbanMemberBot;
                                } else if (n10.memberId.getConstructor() == -239660751) {
                                    i10 = this.f24495b.O6(e.S0(n10.memberId)) ? R.string.UnbanMemberChannel : R.string.UnbanMemberGroup;
                                } else {
                                    i10 = R.string.UnbanMember;
                                }
                                u0Var.a(i10);
                                cVar.a(R.id.btn_unblockSender);
                                cVar2.a(1);
                                cVar3.a(R.drawable.baseline_remove_circle_24);
                            }
                        }
                    }
                }
            } else if (t2.P2(chatMemberStatus)) {
                cVar.a(R.id.btn_editRights);
                cVar2.a(1);
                cVar3.a(R.drawable.baseline_edit_24);
                u0Var.a(R.string.EditAdminTitle);
                boolean z11 = ((TdApi.ChatMemberStatusCreator) n10.status).isAnonymous;
                if (!kh() || z11) {
                    cVar.a(z11 ? R.id.btn_makePublic : R.id.btn_makePrivate);
                    cVar2.a(1);
                    cVar3.a(z11 ? R.drawable.nilsfast_baseline_incognito_off_24 : R.drawable.infanf_baseline_incognito_24);
                    u0Var.a(z11 ? R.string.EditOwnerPublic : R.string.EditOwnerAnonymous);
                }
            }
            if (!kh() || t2.H2(n10.status)) {
                cVar.a(R.id.btn_messageViewList);
                if (this.f24495b.o7(hVar.p())) {
                    u0Var.a(R.string.ViewMessagesFromYou);
                } else {
                    u0Var.b(w.j1(hVar.o().getConstructor() == -336109341 ? R.string.ViewMessagesFromUser : R.string.ViewMessagesFromChat, this.f24495b.Db(hVar.o(), true)));
                }
                cVar3.a(R.drawable.baseline_person_24);
                cVar2.a(1);
            }
            if (!cVar.f()) {
                String Cb = this.f24495b.Cb(hVar.o());
                CharSequence J1 = t2.J1(this, n10, false);
                CharSequence L1 = t2.L1(n10);
                s10 s10Var = s10.f9438a;
                if (L1 != null && J1 != null) {
                    charSequence = w.h1(R.string.format_nameStatusDate, s10Var, Cb, J1, L1);
                } else if (L1 != null) {
                    charSequence = w.h1(R.string.format_nameAndDate, s10Var, Cb, L1);
                } else if (J1 != null) {
                    charSequence = w.h1(R.string.format_nameAndStatus, s10Var, Cb, J1);
                } else {
                    charSequence = w.q(Cb);
                }
                ee(charSequence, cVar.e(), u0Var.d(), cVar2.e(), cVar3.e(), new h0() {
                    @Override
                    public boolean P() {
                        return g0.a(this);
                    }

                    @Override
                    public Object a2(int i14) {
                        return g0.b(this, i14);
                    }

                    @Override
                    public final boolean r3(View view2, int i14) {
                        boolean vh;
                        vh = d20.this.vh(hVar, view2, i14);
                        return vh;
                    }
                });
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rf() {
        return true;
    }

    @Override
    public void s2(final long j10, final TdApi.ChatMember chatMember) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                d20.this.sh(j10, chatMember);
            }
        });
    }

    @Override
    public boolean u3() {
        return true;
    }

    @Override
    public void u7(long j10, TdApi.UserFullInfo userFullInfo) {
        w7.a(this, j10, userFullInfo);
    }

    @Override
    public Comparator<h> vg() {
        if ((this.G0 == null || this.H0 != 0) && !a.k(this.f8361n0)) {
            return this.J0;
        }
        return null;
    }

    public final boolean wh() {
        TdApi.SupergroupMembersFilter supergroupMembersFilter = this.G0;
        return supergroupMembersFilter == null || supergroupMembersFilter.getConstructor() != -2097380265;
    }

    @Override
    public int xg() {
        return 63;
    }

    public final boolean xh() {
        TdApi.SupergroupMembersFilter supergroupMembersFilter = this.G0;
        return (supergroupMembersFilter == null || supergroupMembersFilter.getConstructor() == 1178199509) ? false : true;
    }

    public h rg(TdApi.Object object) {
        TdApi.SupergroupMembersFilter supergroupMembersFilter;
        int constructor = object.getConstructor();
        if (constructor == -537797015) {
            return new h(this.f24495b, ((TdApi.User) object).f19979id, true);
        }
        if (constructor != 1829953909) {
            return null;
        }
        if (this.H0 == 0 || (supergroupMembersFilter = this.G0) == null || t2.w4(supergroupMembersFilter, ((TdApi.ChatMember) object).status)) {
            return h.A(this.f24495b, (TdApi.ChatMember) object, xh(), wh());
        }
        return null;
    }

    public final void zh(TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        TdApi.ChatMember[] chatMemberArr;
        TdApi.SupergroupMembersFilter supergroupMembersFilter;
        if (basicGroupFullInfo != null) {
            if (this.I0 == null || Rf()) {
                this.I0 = basicGroupFullInfo;
                Yf("", 0L, basicGroupFullInfo, 0);
                return;
            }
            this.I0 = basicGroupFullInfo;
            for (int size = this.A0.size() - 1; size >= 0; size--) {
                h hVar = (h) this.A0.get(size);
                if (jh(basicGroupFullInfo.members, hVar.o()) == -1 || ((supergroupMembersFilter = this.G0) != null && !t2.w4(supergroupMembersFilter, hVar.n().status))) {
                    Ah(hVar.o());
                }
            }
            for (TdApi.ChatMember chatMember : basicGroupFullInfo.members) {
                TdApi.SupergroupMembersFilter supergroupMembersFilter2 = this.G0;
                if (supergroupMembersFilter2 == null || t2.w4(supergroupMembersFilter2, chatMember.status)) {
                    ah(chatMember);
                }
            }
        }
    }
}
