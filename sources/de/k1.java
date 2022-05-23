package de;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import ce.a0;
import ce.c0;
import ce.j0;
import d.j;
import de.gc;
import de.q9;
import de.rh;
import de.u7;
import gd.w;
import hd.h;
import hd.t2;
import ie.g0;
import ie.h0;
import ie.u0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import ne.d3;
import ne.n0;
import ob.e;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import pc.i;
import pc.r;
import ud.f2;
import ud.s;
import ud.v4;
import vc.z0;
import yd.d;
import yd.g;
import zd.hj;
import zd.o6;

public class k1 extends vo<b> implements View.OnClickListener, View.OnLongClickListener {
    public iq D0;
    public s E0;
    public TdApi.ChatStatisticsMessageSenderInfo[] F0;
    public long G0;
    public final ArrayList<c> H0 = new ArrayList<>();
    public final HashMap<Long, List<TdApi.Message>> I0 = new HashMap<>();
    public TdApi.ChatStatistics J0;
    public int K0;

    public class a extends iq {
        public a(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void F2(ra raVar, int i10, d3 d3Var) {
            if (raVar.j() == R.id.separator) {
                d3Var.c((a0.i(8.0f) * 2) + a0.i(40.0f), 0.0f);
            } else {
                super.F2(raVar, i10, d3Var);
            }
        }

        @Override
        public void N2(ra raVar, n0 n0Var, boolean z10) {
            super.N2(raVar, n0Var, z10);
            if (n0Var.getId() == R.id.text_title) {
                n0Var.setTextSize(16.0f);
                n0Var.setPadding(a0.i(16.0f), a0.i(16.0f), a0.i(16.0f), a0.i(16.0f));
                n0Var.setTextColorId(R.id.theme_color_text);
                g.i(n0Var, R.id.theme_color_filling, k1.this);
            }
        }

        @Override
        public void R2(ra raVar, uc.c cVar, boolean z10) {
            switch (raVar.j()) {
                case R.id.btn_members:
                case R.id.btn_membersReading:
                case R.id.btn_membersWriting:
                case R.id.btn_messages:
                case R.id.btn_share:
                case R.id.btn_view:
                    TdApi.StatisticalValue statisticalValue = (TdApi.StatisticalValue) raVar.d();
                    cVar.setIgnoreEnabled(true);
                    cVar.setEnabled(false);
                    double d10 = statisticalValue.value;
                    double d11 = statisticalValue.previousValue;
                    if (d10 == d11 || d11 == 0.0d) {
                        cVar.setTextColorId(0);
                        cVar.setName(c0.f((long) statisticalValue.value));
                    } else {
                        cVar.setTextColorId(d10 > d11 ? R.id.theme_color_textSecure : R.id.theme_color_textNegative);
                        double d12 = statisticalValue.value;
                        cVar.setName(w.j1(d12 > statisticalValue.previousValue ? R.string.StatsValueGrowth : R.string.StatsValueFall, c0.f((long) d12), c0.f((long) Math.abs(statisticalValue.value - statisticalValue.previousValue)), w.o(statisticalValue.growthRatePercentage)));
                    }
                    cVar.setData(raVar.u());
                    return;
                case R.id.btn_notifications:
                    cVar.setIgnoreEnabled(true);
                    cVar.setEnabled(false);
                    cVar.setTextColorId(0);
                    cVar.setName(w.o(raVar.e()) + "%");
                    cVar.setData(raVar.u());
                    return;
                default:
                    return;
            }
        }

        @Override
        public void z2(ra raVar, int i10, z0 z0Var) {
            StringBuilder sb2 = new StringBuilder();
            c cVar = (c) raVar.d();
            sb2.append(w.o2(R.string.xViews, cVar.f8458b.viewCount));
            if (cVar.f8458b.forwardCount > 0) {
                sb2.append(", ");
                sb2.append(w.o2(R.string.StatsXShared, cVar.f8458b.forwardCount));
            }
            d.g(z0Var);
            z0Var.C1(cVar.f8457a, null, sb2.toString(), false);
            z0Var.setContentInset(a0.i(8.0f));
        }
    }

    public static class b {
        public final long f8456a;

        public b(long j10) {
            this.f8456a = j10;
        }
    }

    public static class c {
        public final TdApi.Message f8457a;
        public final TdApi.ChatStatisticsMessageInteractionInfo f8458b;

        public c(TdApi.Message message, TdApi.ChatStatisticsMessageInteractionInfo chatStatisticsMessageInteractionInfo) {
            this.f8457a = message;
            this.f8458b = chatStatisticsMessageInteractionInfo;
        }
    }

    public k1(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void Qg(h hVar, long j10, int i10, SparseIntArray sparseIntArray) {
        boolean z10 = sparseIntArray.get(R.id.right_readMessages) != 0;
        if (hVar.n().status.getConstructor() != 1661432998 || z10) {
            this.f24495b.Mb(j10, hVar.o(), new TdApi.ChatMemberStatusBanned(), hVar.n().status, null);
            if (!z10) {
                this.f24495b.Mb(j10, hVar.o(), new TdApi.ChatMemberStatusLeft(), hVar.n().status, null);
                return;
            }
            return;
        }
        TdApi.ChatMemberStatusRestricted chatMemberStatusRestricted = (TdApi.ChatMemberStatusRestricted) hVar.n().status;
        this.f24495b.Mb(j10, hVar.o(), new TdApi.ChatMemberStatusRestricted(false, chatMemberStatusRestricted.restrictedUntilDate, chatMemberStatusRestricted.permissions), hVar.n().status, null);
    }

    public void Rg(ra raVar, h hVar, View view, int i10, ra raVar2, TextView textView, iq iqVar) {
        raVar.X(w.m1(iqVar.y0().get(R.id.right_readMessages) != 0 ? R.string.MemberCannotJoinGroup : R.string.MemberCanJoinGroup, this.f24495b.e2().J2(hVar.p())));
        iqVar.r3(iqVar.F0(raVar));
    }

    public void Sg(TdApi.ChatStatisticsMessageInteractionInfo[] chatStatisticsMessageInteractionInfoArr, AtomicInteger atomicInteger, Runnable runnable, TdApi.Object object) {
        if (object.getConstructor() == 1435961258) {
            TdApi.Message message = (TdApi.Message) object;
            long j10 = message.mediaAlbumId;
            if (j10 != 0) {
                if (!this.I0.containsKey(Long.valueOf(j10))) {
                    this.I0.put(Long.valueOf(message.mediaAlbumId), new ArrayList());
                }
                this.I0.get(Long.valueOf(message.mediaAlbumId)).add(message);
            }
            if (message.canGetStatistics) {
                long j11 = message.mediaAlbumId;
                if (j11 == 0 || this.G0 != j11) {
                    this.G0 = j11;
                    if (j11 != 0) {
                        message = jh(j11);
                    }
                    this.H0.add(new c(message, chatStatisticsMessageInteractionInfoArr[chatStatisticsMessageInteractionInfoArr.length - atomicInteger.get()]));
                }
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            wd(runnable);
        }
    }

    public void Vg(final TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == -825434183) {
            wd(new Runnable() {
                @Override
                public final void run() {
                    k1.this.Tg(object);
                }
            });
        } else if (constructor == -17244633) {
            wd(new Runnable() {
                @Override
                public final void run() {
                    k1.this.Ug(object);
                }
            });
        }
    }

    public void Wg(jb.c cVar, u0 u0Var, jb.c cVar2, jb.c cVar3, final h hVar, final TdApi.ChatMemberStatus chatMemberStatus, final TdApi.ChatMember chatMember) {
        ee("", cVar.e(), u0Var.d(), cVar2.e(), cVar3.e(), new h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i10) {
                return g0.b(this, i10);
            }

            @Override
            public final boolean r3(View view, int i10) {
                boolean Yg;
                Yg = k1.this.Yg(hVar, chatMemberStatus, chatMember, view, i10);
                return Yg;
            }
        });
    }

    public void Xg(final jb.c cVar, final jb.c cVar2, final jb.c cVar3, final u0 u0Var, final h hVar, TdApi.Object object) {
        int i10;
        int i11;
        if (object.getConstructor() == 1829953909) {
            final TdApi.ChatMember chatMember = (TdApi.ChatMember) object;
            final TdApi.ChatMemberStatus O3 = this.f24495b.O3(x9().f8456a);
            if (O3 != null) {
                if (!t2.P2(chatMember.status)) {
                    int P = t2.P(O3, chatMember.status);
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
                    }
                } else if (t2.P2(O3)) {
                    cVar.a(R.id.btn_editRights);
                    cVar2.a(1);
                    cVar3.a(R.drawable.baseline_edit_24);
                    u0Var.a(R.string.EditAdminTitle);
                }
                int R = t2.R(O3, chatMember.status);
                if (R != 0) {
                    cVar.a(R.id.btn_restrictMember);
                    cVar2.a(1);
                    cVar3.a(R.drawable.baseline_block_24);
                    if (R == 1) {
                        if (hVar.o().getConstructor() == -239660751) {
                            i10 = this.f24495b.O6(e.S0(hVar.o())) ? R.string.BanChannel : R.string.BanChat;
                        } else {
                            i10 = R.string.RestrictUser;
                        }
                        u0Var.a(i10);
                    } else if (R == 2) {
                        if (hVar.o().getConstructor() == -239660751) {
                            i11 = this.f24495b.O6(e.S0(hVar.o())) ? R.string.EditChannelRestrictions : R.string.EditGroupRestrictions;
                        } else {
                            i11 = R.string.EditUserRestrictions;
                        }
                        u0Var.a(i11);
                    } else if (R == 3) {
                        u0Var.a(R.string.ViewRestrictions);
                    } else {
                        throw new IllegalStateException();
                    }
                    if (R != 3 && t2.h3(chatMember.status)) {
                        cVar.a(R.id.btn_blockSender);
                        cVar2.a(1);
                        cVar3.a(R.drawable.baseline_remove_circle_24);
                        u0Var.a(R.string.RemoveFromGroup);
                    }
                }
            }
            cVar.a(R.id.btn_messageViewList);
            if (this.f24495b.o7(hVar.p())) {
                u0Var.a(R.string.ViewMessagesFromYou);
            } else {
                u0Var.b(w.j1(R.string.ViewMessagesFromUser, this.f24495b.e2().C2(hVar.p())));
            }
            cVar3.a(R.drawable.baseline_person_24);
            cVar2.a(1);
            wd(new Runnable() {
                @Override
                public final void run() {
                    k1.this.Wg(cVar, u0Var, cVar2, cVar3, hVar, O3, chatMember);
                }
            });
        }
    }

    public boolean Yg(h hVar, TdApi.ChatMemberStatus chatMemberStatus, TdApi.ChatMember chatMember, View view, int i10) {
        switch (i10) {
            case R.id.btn_blockSender:
                Pg(hVar);
                break;
            case R.id.btn_editRights:
                Og(hVar, false, chatMemberStatus, chatMember);
                break;
            case R.id.btn_messageViewList:
                q9 q9Var = new q9(this.f24493a, this.f24495b);
                q9Var.Ad(new q9.b(null, x9().f8456a, null, new TdApi.MessageSenderUser(hVar.p()), false));
                ac(q9Var);
                break;
            case R.id.btn_restrictMember:
                Og(hVar, true, chatMemberStatus, chatMember);
                break;
        }
        return true;
    }

    public void Zg(List list, i iVar, Runnable runnable, boolean z10) {
        if (!Sa()) {
            this.K0--;
            if (z10) {
                int indexOf = list.indexOf(iVar);
                int i10 = indexOf;
                int i11 = -1;
                while (i11 == -1) {
                    i10--;
                    if (i10 < 0) {
                        break;
                    }
                    i11 = this.D0.L0(((i) list.get(i10)).j());
                }
                if (i11 != -1) {
                    i11 += 2;
                } else {
                    while (i11 == -1) {
                        indexOf++;
                        if (indexOf >= list.size()) {
                            break;
                        }
                        i11 = this.D0.L0(((i) list.get(indexOf)).j());
                    }
                    if (i11 != -1) {
                        i11 -= 2;
                    }
                }
                if (i11 == -1) {
                    i11 = this.D0.D();
                }
                this.D0.Y0(i11, new ra(101).G(iVar), new ra(2), new ra(iVar.m(), iVar.j()).G(iVar), new ra(3));
            }
            if (this.K0 == 0) {
                runnable.run();
            }
        }
    }

    public void ah(int i10, TdApi.DateRange dateRange) {
        int size = this.D0.D0().size();
        this.D0.D0().add(new ra(106).G(new r(i10, dateRange)));
        int i11 = 0;
        while (i11 < this.H0.size()) {
            this.D0.D0().add(new ra(i11 == 0 ? 2 : 11, i11 != 0 ? R.id.separator : 0));
            this.D0.D0().add(new ra(j.M0, R.id.btn_messageMore).G(this.H0.get(i11)));
            i11++;
        }
        this.D0.D0().add(new ra(3));
        iq iqVar = this.D0;
        iqVar.M(size, iqVar.D0().size());
        n9();
    }

    public void bh(TdApi.ChatStatisticsChannel chatStatisticsChannel) {
        TdApi.ChatStatisticsMessageInteractionInfo[] chatStatisticsMessageInteractionInfoArr = chatStatisticsChannel.recentMessageInteractions;
        if (chatStatisticsMessageInteractionInfoArr.length > 0) {
            fh(chatStatisticsChannel.period, chatStatisticsMessageInteractionInfoArr, R.string.StatsRecentPosts);
        } else {
            n9();
        }
    }

    @Override
    public View G9() {
        return this.E0;
    }

    public final void Ng(List<ra> list, TdApi.DateRange dateRange, TdApi.Object[] objectArr, int i10, int i11) {
        int i12;
        list.add(new ra(106).G(new r(i10, dateRange)));
        list.add(new ra(2));
        if (objectArr[0] instanceof TdApi.ChatStatisticsMessageSenderInfo) {
            i12 = Math.min(10, objectArr.length);
        } else {
            i12 = objectArr.length;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            h hVar = null;
            TdApi.Object object = objectArr[i13];
            if (i11 == R.id.btn_openInviterProfile) {
                TdApi.ChatStatisticsInviterInfo chatStatisticsInviterInfo = (TdApi.ChatStatisticsInviterInfo) object;
                hVar = new h(this.f24495b, chatStatisticsInviterInfo.userId, true);
                hVar.w(w.q2(R.string.StatsXInvitations, chatStatisticsInviterInfo.addedMemberCount));
            } else if (i11 == R.id.btn_viewAdminActions) {
                TdApi.ChatStatisticsAdministratorActionsInfo chatStatisticsAdministratorActionsInfo = (TdApi.ChatStatisticsAdministratorActionsInfo) object;
                hVar = new h(this.f24495b, chatStatisticsAdministratorActionsInfo.userId, true);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i14 = chatStatisticsAdministratorActionsInfo.deletedMessageCount;
                if (i14 > 0) {
                    spannableStringBuilder.append(w.q2(R.string.StatsXDeletions, i14));
                    if (chatStatisticsAdministratorActionsInfo.bannedUserCount > 0 || chatStatisticsAdministratorActionsInfo.restrictedUserCount > 0) {
                        spannableStringBuilder.append((CharSequence) ", ");
                    }
                }
                int i15 = chatStatisticsAdministratorActionsInfo.bannedUserCount;
                if (i15 > 0) {
                    spannableStringBuilder.append(w.q2(R.string.StatsXBans, i15));
                    if (chatStatisticsAdministratorActionsInfo.restrictedUserCount > 0) {
                        spannableStringBuilder.append((CharSequence) ", ");
                    }
                }
                int i16 = chatStatisticsAdministratorActionsInfo.restrictedUserCount;
                if (i16 > 0) {
                    spannableStringBuilder.append(w.q2(R.string.StatsXRestrictions, i16));
                }
                hVar.w(spannableStringBuilder);
            } else if (i11 == R.id.btn_viewMemberMessages) {
                TdApi.ChatStatisticsMessageSenderInfo chatStatisticsMessageSenderInfo = (TdApi.ChatStatisticsMessageSenderInfo) object;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                h hVar2 = new h(this.f24495b, chatStatisticsMessageSenderInfo.userId, true);
                int i17 = chatStatisticsMessageSenderInfo.sentMessageCount;
                if (i17 > 0) {
                    spannableStringBuilder2.append(w.q2(R.string.xMessages, i17));
                }
                if (chatStatisticsMessageSenderInfo.averageCharacterCount > 0) {
                    if (spannableStringBuilder2.length() > 0) {
                        spannableStringBuilder2.append((CharSequence) ", ");
                    }
                    spannableStringBuilder2.append(w.q2(R.string.StatsXCharacters, chatStatisticsMessageSenderInfo.averageCharacterCount));
                }
                hVar2.w(spannableStringBuilder2);
                hVar = hVar2;
            }
            if (hVar != null) {
                hVar.s(true);
                list.add(new ra(63, i11).G(hVar));
                if (i13 != i12 - 1) {
                    list.add(new ra(11));
                }
            }
        }
        if (i12 < objectArr.length) {
            list.add(new ra(11));
            list.add(new ra(4, (int) R.id.btn_showAdvanced, (int) R.drawable.baseline_direction_arrow_down_24, (CharSequence) w.o2(R.string.StatsXShowMore, objectArr.length - 10), false));
        }
        list.add(new ra(3));
    }

    public final void Og(h hVar, boolean z10, TdApi.ChatMemberStatus chatMemberStatus, TdApi.ChatMember chatMember) {
        TdApi.ChatMember chatMember2;
        if (z10) {
            if (t2.R(chatMemberStatus, chatMember.status) == 1) {
                chatMember = null;
            }
        } else if (t2.P(chatMemberStatus, chatMember.status) == 1) {
            chatMember2 = null;
            u7 u7Var = new u7(this.f24493a, this.f24495b);
            u7Var.sg(new u7.d(((b) x9()).f8456a, hVar.o(), z10, chatMemberStatus, chatMember2).b());
            ac(u7Var);
        }
        chatMember2 = chatMember;
        u7 u7Var2 = new u7(this.f24493a, this.f24495b);
        u7Var2.sg(new u7.d(((b) x9()).f8456a, hVar.o(), z10, chatMemberStatus, chatMember2).b());
        ac(u7Var2);
    }

    public final void Pg(final h hVar) {
        final long j10 = x9().f8456a;
        final ra raVar = new ra(28, 0, 0, w.m1(R.string.MemberCannotJoinGroup, this.f24495b.e2().J2(hVar.p())), false);
        me(new f2(R.id.btn_blockSender).a(raVar).j(new v4.r() {
            @Override
            public final void l6(int i10, SparseIntArray sparseIntArray) {
                k1.this.Qg(hVar, j10, i10, sparseIntArray);
            }
        }).n(new v4.n() {
            @Override
            public final void a(View view, int i10, ra raVar2, TextView textView, iq iqVar) {
                k1.this.Rg(raVar, hVar, view, i10, raVar2, textView, iqVar);
            }
        }).p(new ra[]{new ra(12, (int) R.id.right_readMessages, 0, (int) R.string.BanMember, true)}).r(R.string.RemoveMember).q(R.id.theme_color_textNegative));
    }

    @Override
    public int R9() {
        return R.id.controller_stats;
    }

    public final void ch(final TdApi.ChatStatisticsMessageInteractionInfo[] chatStatisticsMessageInteractionInfoArr, final Runnable runnable) {
        final AtomicInteger atomicInteger = new AtomicInteger(chatStatisticsMessageInteractionInfoArr.length);
        Client.g y0Var = new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                k1.this.Sg(chatStatisticsMessageInteractionInfoArr, atomicInteger, runnable, object);
            }
        };
        for (TdApi.ChatStatisticsMessageInteractionInfo chatStatisticsMessageInteractionInfo : chatStatisticsMessageInteractionInfoArr) {
            this.f24495b.v4().o(new TdApi.GetMessageLocally(x9().f8456a, chatStatisticsMessageInteractionInfo.messageId), y0Var);
        }
    }

    @Override
    public boolean dc() {
        return this.J0 == null || this.K0 > 0;
    }

    public final void dh(final h hVar) {
        final jb.c cVar = new jb.c(4);
        final jb.c cVar2 = new jb.c(4);
        final jb.c cVar3 = new jb.c(4);
        final u0 u0Var = new u0(4);
        this.f24495b.v4().o(new TdApi.GetChatMember(x9().f8456a, hVar.o()), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                k1.this.Xg(cVar, cVar2, cVar3, u0Var, hVar, object);
            }
        });
    }

    public final void eh(List<ra> list, final List<i> list2, final Runnable runnable) {
        if (list2 != null) {
            for (final i iVar : list2) {
                if (iVar.p()) {
                    this.K0++;
                    iVar.u(new kb.i() {
                        @Override
                        public final void a(boolean z10) {
                            k1.this.Zg(list2, iVar, runnable, z10);
                        }
                    });
                } else if (!iVar.q()) {
                    list.add(new ra(101).G(iVar));
                    list.add(new ra(2));
                    list.add(new ra(iVar.m(), iVar.j()).G(iVar));
                    list.add(new ra(3));
                }
            }
        }
        this.D0.s2(list, false);
        if (this.K0 == 0) {
            runnable.run();
        }
    }

    public final void fh(final TdApi.DateRange dateRange, TdApi.ChatStatisticsMessageInteractionInfo[] chatStatisticsMessageInteractionInfoArr, final int i10) {
        ch(chatStatisticsMessageInteractionInfoArr, new Runnable() {
            @Override
            public final void run() {
                k1.this.ah(i10, dateRange);
            }
        });
    }

    public final void Tg(final TdApi.ChatStatisticsChannel chatStatisticsChannel) {
        this.J0 = chatStatisticsChannel;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ra(89, (int) R.id.btn_members, 0, (int) R.string.StatsMembers, false).G(chatStatisticsChannel.memberCount));
        arrayList.add(new ra(11));
        arrayList.add(new ra(89, (int) R.id.btn_notifications, 0, (int) R.string.StatsNotifications, false).H(chatStatisticsChannel.enabledNotificationsPercentage));
        if (!e.e1(chatStatisticsChannel.meanViewCount)) {
            arrayList.add(new ra(11));
            arrayList.add(new ra(89, (int) R.id.btn_view, 0, (int) R.string.StatsViews, false).G(chatStatisticsChannel.meanViewCount));
        }
        if (!e.e1(chatStatisticsChannel.meanShareCount)) {
            arrayList.add(new ra(11));
            arrayList.add(new ra(89, (int) R.id.btn_share, 0, (int) R.string.StatsShares, false).G(chatStatisticsChannel.meanShareCount));
        }
        arrayList.add(new ra(3));
        TdApi.DateRange dateRange = chatStatisticsChannel.period;
        arrayList.add(new ra(9, 0, 0, w.m1(R.string.StatsRange, w.p0(dateRange.startDate, dateRange.endDate, TimeUnit.SECONDS, true)), false));
        long j10 = x9().f8456a;
        eh(arrayList, Arrays.asList(new i(R.id.stats_memberCount, this.f24495b, j10, R.string.StatsChartGrowth, 0, chatStatisticsChannel.memberCountGraph, 0), new i(R.id.stats_join, this.f24495b, j10, R.string.StatsChartFollowers, 0, chatStatisticsChannel.joinGraph, 0), new i(R.id.stats_mute, this.f24495b, j10, R.string.StatsChartNotifications, 0, chatStatisticsChannel.muteGraph, 0), new i(R.id.stats_viewCountByHour, this.f24495b, j10, R.string.StatsChartViewsByHour, 0, chatStatisticsChannel.viewCountByHourGraph, 1), new i(R.id.stats_viewCountBySource, this.f24495b, j10, R.string.StatsChartViewsBySource, 2, chatStatisticsChannel.viewCountBySourceGraph, 0), new i(R.id.stats_joinBySource, this.f24495b, j10, R.string.StatsChartFollowersBySource, 2, chatStatisticsChannel.joinBySourceGraph, 0), new i(R.id.stats_language, this.f24495b, j10, R.string.StatsChartLanguage, 4, chatStatisticsChannel.languageGraph, 0), new i(R.id.stats_messageInteraction, this.f24495b, j10, R.string.StatsChartInteractions, 1, chatStatisticsChannel.messageInteractionGraph, 0), new i(R.id.stats_instantViewInteraction, this.f24495b, j10, R.string.StatsChartIv, 1, chatStatisticsChannel.instantViewInteractionGraph, 0)), new Runnable() {
            @Override
            public final void run() {
                k1.this.bh(chatStatisticsChannel);
            }
        });
    }

    public final void Ug(TdApi.ChatStatisticsSupergroup chatStatisticsSupergroup) {
        char c10;
        this.J0 = chatStatisticsSupergroup;
        List<ra> arrayList = new ArrayList<>();
        arrayList.add(new ra(89, (int) R.id.btn_members, 0, (int) R.string.StatsMembers, false).G(chatStatisticsSupergroup.memberCount));
        arrayList.add(new ra(11));
        arrayList.add(new ra(89, (int) R.id.btn_messages, 0, (int) R.string.StatsMessages, false).G(chatStatisticsSupergroup.messageCount));
        arrayList.add(new ra(11));
        arrayList.add(new ra(89, (int) R.id.btn_membersReading, 0, (int) R.string.StatsMembersReading, false).G(chatStatisticsSupergroup.viewerCount));
        arrayList.add(new ra(11));
        arrayList.add(new ra(89, (int) R.id.btn_membersWriting, 0, (int) R.string.StatsMembersWriting, false).G(chatStatisticsSupergroup.senderCount));
        arrayList.add(new ra(3));
        TdApi.DateRange dateRange = chatStatisticsSupergroup.period;
        arrayList.add(new ra(9, 0, 0, w.m1(R.string.StatsRange, w.p0(dateRange.startDate, dateRange.endDate, TimeUnit.SECONDS, true)), false));
        TdApi.Object[] objectArr = chatStatisticsSupergroup.topAdministrators;
        if (objectArr.length > 0) {
            c10 = 1;
            Ng(arrayList, chatStatisticsSupergroup.period, objectArr, R.string.StatsTopAdmins, R.id.btn_viewAdminActions);
        } else {
            c10 = 1;
        }
        TdApi.ChatStatisticsMessageSenderInfo[] chatStatisticsMessageSenderInfoArr = chatStatisticsSupergroup.topSenders;
        if (chatStatisticsMessageSenderInfoArr.length > 0) {
            this.F0 = chatStatisticsMessageSenderInfoArr;
            Ng(arrayList, chatStatisticsSupergroup.period, chatStatisticsMessageSenderInfoArr, R.string.StatsTopMembers, R.id.btn_viewMemberMessages);
        }
        TdApi.Object[] objectArr2 = chatStatisticsSupergroup.topInviters;
        if (objectArr2.length > 0) {
            Ng(arrayList, chatStatisticsSupergroup.period, objectArr2, R.string.StatsTopInviters, R.id.btn_openInviterProfile);
        }
        long j10 = ((b) x9()).f8456a;
        i[] iVarArr = new i[8];
        iVarArr[0] = new i(R.id.stats_memberCount, this.f24495b, j10, R.string.StatsChartGrowth, 0, chatStatisticsSupergroup.memberCountGraph, 0);
        iVarArr[c10] = new i(R.id.stats_join, this.f24495b, j10, R.string.StatsChartMembers, 0, chatStatisticsSupergroup.joinGraph, 0);
        iVarArr[2] = new i(R.id.stats_joinBySource, this.f24495b, j10, R.string.StatsChartMembersBySource, 2, chatStatisticsSupergroup.joinBySourceGraph, 0);
        iVarArr[3] = new i(R.id.stats_language, this.f24495b, j10, R.string.StatsChartMembersLanguage, 4, chatStatisticsSupergroup.languageGraph, 0);
        iVarArr[4] = new i(R.id.stats_messages, this.f24495b, j10, R.string.StatsChartMessages, 2, chatStatisticsSupergroup.messageContentGraph, 0);
        iVarArr[5] = new i(R.id.stats_actions, this.f24495b, j10, R.string.StatsChartActions, 0, chatStatisticsSupergroup.actionGraph, 0);
        iVarArr[6] = new i(R.id.stats_topHours, this.f24495b, j10, R.string.StatsChartTopHours, 0, chatStatisticsSupergroup.dayGraph, 0);
        iVarArr[7] = new i(R.id.stats_topDays, this.f24495b, j10, R.string.StatsChartTopDays, 4, chatStatisticsSupergroup.weekGraph, 0);
        eh(arrayList, Arrays.asList(iVarArr), new Runnable() {
            @Override
            public final void run() {
                k1.this.n9();
            }
        });
    }

    public final void ih() {
        int L0 = this.D0.L0(R.id.btn_showAdvanced);
        if (L0 != -1 && this.F0 != null) {
            List<ra> D0 = this.D0.D0();
            D0.remove(L0);
            ArrayList arrayList = new ArrayList();
            int i10 = 10;
            while (true) {
                TdApi.ChatStatisticsMessageSenderInfo[] chatStatisticsMessageSenderInfoArr = this.F0;
                if (i10 >= chatStatisticsMessageSenderInfoArr.length) {
                    break;
                }
                TdApi.ChatStatisticsMessageSenderInfo chatStatisticsMessageSenderInfo = chatStatisticsMessageSenderInfoArr[i10];
                h hVar = new h(this.f24495b, chatStatisticsMessageSenderInfo.userId, true);
                hVar.w(w.o2(R.string.xMessages, chatStatisticsMessageSenderInfo.sentMessageCount) + ", " + w.o2(R.string.StatsXCharacters, chatStatisticsMessageSenderInfo.averageCharacterCount));
                hVar.s(true);
                arrayList.add(new ra(63, R.id.btn_viewMemberMessages).G(hVar));
                if (i10 != this.F0.length - 1) {
                    arrayList.add(new ra(1));
                }
                i10++;
            }
            ib.b.m(D0, D0.size() + arrayList.size());
            Iterator it = arrayList.iterator();
            int i11 = L0;
            while (it.hasNext()) {
                i11++;
                D0.add(i11, (ra) it.next());
            }
            this.D0.N(L0, 1);
            this.D0.M(L0, arrayList.size());
        }
    }

    public final TdApi.Message jh(long j10) {
        List<TdApi.Message> t12 = e.t1(this.I0.get(Long.valueOf(j10)));
        if (t12 == null) {
            return null;
        }
        return t12.get(0);
    }

    @Override
    public void onClick(View view) {
        ra raVar = (ra) view.getTag();
        long p10 = (raVar == null || !(raVar.d() instanceof h)) ? 0L : ((h) raVar.d()).p();
        switch (view.getId()) {
            case R.id.btn_messageMore:
                c cVar = (c) raVar.d();
                v4<?> gcVar = new gc(this.f24493a, this.f24495b);
                List<TdApi.Message> list = this.I0.get(Long.valueOf(cVar.f8457a.mediaAlbumId));
                if (list != null) {
                    gcVar.Ad(new gc.b(((b) x9()).f8456a, list));
                } else {
                    gcVar.Ad(new gc.b(((b) x9()).f8456a, cVar.f8457a));
                }
                ac(gcVar);
                return;
            case R.id.btn_openInviterProfile:
                if (p10 != 0) {
                    this.f24495b.hd().u7(this, p10, new hj.j().h());
                    return;
                }
                return;
            case R.id.btn_showAdvanced:
                ih();
                return;
            case R.id.btn_viewAdminActions:
                rh rhVar = new rh(this.f24493a, this.f24495b);
                rhVar.Lp(new rh.c0(3, null, this.f24495b.W2(((b) x9()).f8456a)).b(p10));
                ac(rhVar);
                return;
            case R.id.btn_viewMemberMessages:
                if (p10 != 0) {
                    v4<?> q9Var = new q9(t(), this.f24495b);
                    q9Var.Ad(new q9.b(null, ((b) x9()).f8456a, null, new TdApi.MessageSenderUser(p10), false));
                    ac(q9Var);
                    this.f24495b.hd().u7(this, p10, new hj.j().h());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public boolean onLongClick(View view) {
        ra raVar = (ra) view.getTag();
        if (raVar == null || !(raVar.d() instanceof h)) {
            return false;
        }
        dh((h) raVar.d());
        return true;
    }

    @Override
    public void rg(Context context, CustomRecyclerView customRecyclerView) {
        long j10 = x9().f8456a;
        s sVar = new s(context);
        sVar.setThemedTextColor(this);
        sVar.A1(a0.i(12.0f), true);
        sVar.setTitle(this.f24495b.U3(j10));
        sVar.setSubtitle(R.string.Stats);
        this.E0 = sVar;
        a aVar = new a(this);
        this.D0 = aVar;
        customRecyclerView.setAdapter(aVar);
        this.f24495b.v4().o(new TdApi.GetChatStatistics(j10, ae.j.x0()), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                k1.this.Vg(object);
            }
        });
    }
}
