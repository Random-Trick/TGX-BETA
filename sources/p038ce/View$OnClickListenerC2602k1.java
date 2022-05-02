package p038ce;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import be.C1357a0;
import be.C1363c0;
import be.C1379j0;
import gd.C4649h;
import gd.C4779t2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import me.C6862d3;
import me.C6973n0;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import p038ce.C2912q9;
import p038ce.View$OnClickListenerC2439gc;
import p038ce.View$OnClickListenerC2971rh;
import p038ce.View$OnClickListenerC3141u7;
import p039d.C3563j;
import p082fd.C4403w;
import p108hb.C5062b;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p111he.C5146u0;
import p124ib.C5320c;
import p139jb.AbstractC5917i;
import p193nb.C7321e;
import p208oc.C7833i;
import p208oc.C7846r;
import p291uc.C9494a1;
import p335xd.C10189d;
import p335xd.C10192g;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;
import p364zd.C11524j;
import tc.C9137c;
import td.AbstractC9323v4;
import td.C9188f2;
import td.C9289s;

public class View$OnClickListenerC2602k1 extends AbstractC3204vo<C2604b> implements View.OnClickListener, View.OnLongClickListener {
    public C2546iq f8826D0;
    public C9289s f8827E0;
    public TdApi.ChatStatisticsMessageSenderInfo[] f8828F0;
    public long f8829G0;
    public final ArrayList<C2605c> f8830H0 = new ArrayList<>();
    public final HashMap<Long, List<TdApi.Message>> f8831I0 = new HashMap<>();
    public TdApi.ChatStatistics f8832J0;
    public int f8833K0;

    public class C2603a extends C2546iq {
        public C2603a(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo8030D2(C2964ra raVar, int i, C9494a1 a1Var) {
            StringBuilder sb2 = new StringBuilder();
            C2605c cVar = (C2605c) raVar.m32847d();
            sb2.append(C4403w.m27846o2(R.string.xViews, cVar.f8837b.viewCount));
            if (cVar.f8837b.forwardCount > 0) {
                sb2.append(", ");
                sb2.append(C4403w.m27846o2(R.string.StatsXShared, cVar.f8837b.forwardCount));
            }
            C10189d.m5797g(a1Var);
            a1Var.m8490E1(cVar.f8836a, null, sb2.toString(), false);
            a1Var.setContentInset(C1357a0.m37544i(8.0f));
        }

        @Override
        public void mo34065J2(C2964ra raVar, int i, C6862d3 d3Var) {
            if (raVar.m32838j() == R.id.separator) {
                d3Var.m18736c((C1357a0.m37544i(8.0f) * 2) + C1357a0.m37544i(40.0f), 0.0f);
            } else {
                super.mo34065J2(raVar, i, d3Var);
            }
        }

        @Override
        public void mo503R2(C2964ra raVar, C6973n0 n0Var, boolean z) {
            super.mo503R2(raVar, n0Var, z);
            if (n0Var.getId() == R.id.text_title) {
                n0Var.setTextSize(16.0f);
                n0Var.setPadding(C1357a0.m37544i(16.0f), C1357a0.m37544i(16.0f), C1357a0.m37544i(16.0f), C1357a0.m37544i(16.0f));
                n0Var.setTextColorId(R.id.theme_color_text);
                C10192g.m5782i(n0Var, R.id.theme_color_filling, View$OnClickListenerC2602k1.this);
            }
        }

        @Override
        public void mo394V2(C2964ra raVar, C9137c cVar, boolean z) {
            switch (raVar.m32838j()) {
                case R.id.btn_members:
                case R.id.btn_membersReading:
                case R.id.btn_membersWriting:
                case R.id.btn_messages:
                case R.id.btn_share:
                case R.id.btn_view:
                    TdApi.StatisticalValue statisticalValue = (TdApi.StatisticalValue) raVar.m32847d();
                    cVar.setIgnoreEnabled(true);
                    cVar.setEnabled(false);
                    double d = statisticalValue.value;
                    double d2 = statisticalValue.previousValue;
                    if (d == d2 || d2 == 0.0d) {
                        cVar.setTextColorId(0);
                        cVar.setName(C1363c0.m37440f((long) statisticalValue.value));
                    } else {
                        cVar.setTextColorId(d > d2 ? R.id.theme_color_textSecure : R.id.theme_color_textNegative);
                        double d3 = statisticalValue.value;
                        cVar.setName(C4403w.m27867j1(d3 > statisticalValue.previousValue ? R.string.StatsValueGrowth : R.string.StatsValueFall, C1363c0.m37440f((long) d3), C1363c0.m37440f((long) Math.abs(statisticalValue.value - statisticalValue.previousValue)), C4403w.m27849o(statisticalValue.growthRatePercentage)));
                    }
                    cVar.setData(raVar.m32827u());
                    return;
                case R.id.btn_notifications:
                    cVar.setIgnoreEnabled(true);
                    cVar.setEnabled(false);
                    cVar.setTextColorId(0);
                    cVar.setName(C4403w.m27849o(raVar.m32845e()) + "%");
                    cVar.setData(raVar.m32827u());
                    return;
                default:
                    return;
            }
        }
    }

    public static class C2604b {
        public final long f8835a;

        public C2604b(long j) {
            this.f8835a = j;
        }
    }

    public static class C2605c {
        public final TdApi.Message f8836a;
        public final TdApi.ChatStatisticsMessageInteractionInfo f8837b;

        public C2605c(TdApi.Message message, TdApi.ChatStatisticsMessageInteractionInfo chatStatisticsMessageInteractionInfo) {
            this.f8836a = message;
            this.f8837b = chatStatisticsMessageInteractionInfo;
        }
    }

    public View$OnClickListenerC2602k1(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m34085Qg(C4649h hVar, long j, int i, SparseIntArray sparseIntArray) {
        boolean z = sparseIntArray.get(R.id.right_readMessages) != 0;
        if (hVar.m26641n().status.getConstructor() != 1661432998 || z) {
            this.f30170b.m2811Ib(j, hVar.m26640o(), new TdApi.ChatMemberStatusBanned(), hVar.m26641n().status, null);
            if (!z) {
                this.f30170b.m2811Ib(j, hVar.m26640o(), new TdApi.ChatMemberStatusLeft(), hVar.m26641n().status, null);
                return;
            }
            return;
        }
        TdApi.ChatMemberStatusRestricted chatMemberStatusRestricted = (TdApi.ChatMemberStatusRestricted) hVar.m26641n().status;
        this.f30170b.m2811Ib(j, hVar.m26640o(), new TdApi.ChatMemberStatusRestricted(false, chatMemberStatusRestricted.restrictedUntilDate, chatMemberStatusRestricted.permissions), hVar.m26641n().status, null);
    }

    public void m34084Rg(C2964ra raVar, C4649h hVar, View view, int i, C2964ra raVar2, TextView textView, C2546iq iqVar) {
        raVar.m32856X(C4403w.m27855m1(iqVar.m34255A0().get(R.id.right_readMessages) != 0 ? R.string.MemberCannotJoinGroup : R.string.MemberCanJoinGroup, this.f30170b.m2480e2().m1721K2(hVar.m26639p())));
        iqVar.m34127u3(iqVar.m34238H0(raVar));
    }

    public void m34083Sg(TdApi.ChatStatisticsMessageInteractionInfo[] chatStatisticsMessageInteractionInfoArr, AtomicInteger atomicInteger, Runnable runnable, TdApi.Object object) {
        if (object.getConstructor() == 1435961258) {
            TdApi.Message message = (TdApi.Message) object;
            long j = message.mediaAlbumId;
            if (j != 0) {
                if (!this.f8831I0.containsKey(Long.valueOf(j))) {
                    this.f8831I0.put(Long.valueOf(message.mediaAlbumId), new ArrayList());
                }
                this.f8831I0.get(Long.valueOf(message.mediaAlbumId)).add(message);
            }
            if (message.canGetStatistics) {
                long j2 = message.mediaAlbumId;
                if (j2 == 0 || this.f8829G0 != j2) {
                    this.f8829G0 = j2;
                    if (j2 != 0) {
                        message = m34066jh(j2);
                    }
                    this.f8830H0.add(new C2605c(message, chatStatisticsMessageInteractionInfoArr[chatStatisticsMessageInteractionInfoArr.length - atomicInteger.get()]));
                }
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            m9135wd(runnable);
        }
    }

    public void m34080Vg(final TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37305t0(object);
        } else if (constructor == -825434183) {
            m9135wd(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2602k1.this.m34082Tg(object);
                }
            });
        } else if (constructor == -17244633) {
            m9135wd(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2602k1.this.m34081Ug(object);
                }
            });
        }
    }

    public void m34079Wg(C5320c cVar, C5146u0 u0Var, C5320c cVar2, C5320c cVar3, final C4649h hVar, final TdApi.ChatMemberStatus chatMemberStatus, final TdApi.ChatMember chatMember) {
        m9261ee("", cVar.m23281e(), u0Var.m23814d(), cVar2.m23281e(), cVar3.m23281e(), new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean Yg;
                Yg = View$OnClickListenerC2602k1.this.m34077Yg(hVar, chatMemberStatus, chatMember, view, i);
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
    }

    public void m34078Xg(final C5320c cVar, final C5320c cVar2, final C5320c cVar3, final C5146u0 u0Var, final C4649h hVar, TdApi.Object object) {
        int i;
        int i2;
        if (object.getConstructor() == 1829953909) {
            final TdApi.ChatMember chatMember = (TdApi.ChatMember) object;
            final TdApi.ChatMemberStatus K3 = this.f30170b.m2787K3(m9131x9().f8835a);
            if (K3 != null) {
                if (!C4779t2.m25624P2(chatMember.status)) {
                    int P = C4779t2.m25627P(K3, chatMember.status);
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
                    }
                } else if (C4779t2.m25624P2(K3)) {
                    cVar.m23285a(R.id.btn_editRights);
                    cVar2.m23285a(1);
                    cVar3.m23285a(R.drawable.baseline_edit_24);
                    u0Var.m23817a(R.string.EditAdminTitle);
                }
                int R = C4779t2.m25614R(K3, chatMember.status);
                if (R != 0) {
                    cVar.m23285a(R.id.btn_restrictMember);
                    cVar2.m23285a(1);
                    cVar3.m23285a(R.drawable.baseline_block_24);
                    if (R == 1) {
                        if (hVar.m26640o().getConstructor() == -239660751) {
                            i = this.f30170b.m2784K6(C7321e.m16986Q0(hVar.m26640o())) ? R.string.BanChannel : R.string.BanChat;
                        } else {
                            i = R.string.RestrictUser;
                        }
                        u0Var.m23817a(i);
                    } else if (R == 2) {
                        if (hVar.m26640o().getConstructor() == -239660751) {
                            i2 = this.f30170b.m2784K6(C7321e.m16986Q0(hVar.m26640o())) ? R.string.EditChannelRestrictions : R.string.EditGroupRestrictions;
                        } else {
                            i2 = R.string.EditUserRestrictions;
                        }
                        u0Var.m23817a(i2);
                    } else if (R == 3) {
                        u0Var.m23817a(R.string.ViewRestrictions);
                    } else {
                        throw new IllegalStateException();
                    }
                    if (R != 3 && C4779t2.m25507h3(chatMember.status)) {
                        cVar.m23285a(R.id.btn_blockSender);
                        cVar2.m23285a(1);
                        cVar3.m23285a(R.drawable.baseline_remove_circle_24);
                        u0Var.m23817a(R.string.RemoveFromGroup);
                    }
                }
            }
            cVar.m23285a(R.id.btn_messageViewList);
            if (this.f30170b.m2379k7(hVar.m26639p())) {
                u0Var.m23817a(R.string.ViewMessagesFromYou);
            } else {
                u0Var.m23816b(C4403w.m27867j1(R.string.ViewMessagesFromUser, this.f30170b.m2480e2().m1749D2(hVar.m26639p())));
            }
            cVar3.m23285a(R.drawable.baseline_person_24);
            cVar2.m23285a(1);
            m9135wd(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2602k1.this.m34079Wg(cVar, u0Var, cVar2, cVar3, hVar, K3, chatMember);
                }
            });
        }
    }

    public boolean m34077Yg(C4649h hVar, TdApi.ChatMemberStatus chatMemberStatus, TdApi.ChatMember chatMember, View view, int i) {
        switch (i) {
            case R.id.btn_blockSender:
                m34086Pg(hVar);
                break;
            case R.id.btn_editRights:
                m34087Og(hVar, false, chatMemberStatus, chatMember);
                break;
            case R.id.btn_messageViewList:
                C2912q9 q9Var = new C2912q9(this.f30168a, this.f30170b);
                q9Var.m9476Ad(new C2912q9.C2914b(null, m9131x9().f8835a, null, new TdApi.MessageSenderUser(hVar.m26639p()), false));
                m9291ac(q9Var);
                break;
            case R.id.btn_restrictMember:
                m34087Og(hVar, true, chatMemberStatus, chatMember);
                break;
        }
        return true;
    }

    public void m34076Zg(List list, C7833i iVar, Runnable runnable, boolean z) {
        if (!m9347Sa()) {
            this.f8833K0--;
            if (z) {
                int indexOf = list.indexOf(iVar);
                int i = indexOf;
                int i2 = -1;
                while (i2 == -1) {
                    i--;
                    if (i < 0) {
                        break;
                    }
                    i2 = this.f8826D0.m34227N0(((C7833i) list.get(i)).m14919j());
                }
                if (i2 != -1) {
                    i2 += 2;
                } else {
                    while (i2 == -1) {
                        indexOf++;
                        if (indexOf >= list.size()) {
                            break;
                        }
                        i2 = this.f8826D0.m34227N0(((C7833i) list.get(indexOf)).m14919j());
                    }
                    if (i2 != -1) {
                        i2 -= 2;
                    }
                }
                if (i2 == -1) {
                    i2 = this.f8826D0.mo6153D();
                }
                this.f8826D0.m34191b1(i2, new C2964ra(101).m32873G(iVar), new C2964ra(2), new C2964ra(iVar.m14916m(), iVar.m14919j()).m32873G(iVar), new C2964ra(3));
            }
            if (this.f8833K0 == 0) {
                runnable.run();
            }
        }
    }

    public void m34075ah(int i, TdApi.DateRange dateRange) {
        int size = this.f8826D0.m34243F0().size();
        this.f8826D0.m34243F0().add(new C2964ra(106).m32873G(new C7846r(i, dateRange)));
        int i2 = 0;
        while (i2 < this.f8830H0.size()) {
            this.f8826D0.m34243F0().add(new C2964ra(i2 == 0 ? 2 : 11, i2 != 0 ? R.id.separator : 0));
            this.f8826D0.m34243F0().add(new C2964ra(C3563j.f11962M0, R.id.btn_messageMore).m32873G(this.f8830H0.get(i2)));
            i2++;
        }
        this.f8826D0.m34243F0().add(new C2964ra(3));
        C2546iq iqVar = this.f8826D0;
        iqVar.m39311M(size, iqVar.m34243F0().size());
        m9204n9();
    }

    public void m34074bh(TdApi.ChatStatisticsChannel chatStatisticsChannel) {
        TdApi.ChatStatisticsMessageInteractionInfo[] chatStatisticsMessageInteractionInfoArr = chatStatisticsChannel.recentMessageInteractions;
        if (chatStatisticsMessageInteractionInfoArr.length > 0) {
            m34070fh(chatStatisticsChannel.period, chatStatisticsMessageInteractionInfoArr, R.string.StatsRecentPosts);
        } else {
            m9204n9();
        }
    }

    @Override
    public View mo8869G9() {
        return this.f8827E0;
    }

    public final void m34088Ng(List<C2964ra> list, TdApi.DateRange dateRange, TdApi.Object[] objectArr, int i, int i2) {
        int i3;
        list.add(new C2964ra(106).m32873G(new C7846r(i, dateRange)));
        list.add(new C2964ra(2));
        if (objectArr[0] instanceof TdApi.ChatStatisticsMessageSenderInfo) {
            i3 = Math.min(10, objectArr.length);
        } else {
            i3 = objectArr.length;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            C4649h hVar = null;
            TdApi.Object object = objectArr[i4];
            if (i2 == R.id.btn_openInviterProfile) {
                TdApi.ChatStatisticsInviterInfo chatStatisticsInviterInfo = (TdApi.ChatStatisticsInviterInfo) object;
                hVar = new C4649h(this.f30170b, chatStatisticsInviterInfo.userId, true);
                hVar.m26632w(C4403w.m27838q2(R.string.StatsXInvitations, chatStatisticsInviterInfo.addedMemberCount));
            } else if (i2 == R.id.btn_viewAdminActions) {
                TdApi.ChatStatisticsAdministratorActionsInfo chatStatisticsAdministratorActionsInfo = (TdApi.ChatStatisticsAdministratorActionsInfo) object;
                hVar = new C4649h(this.f30170b, chatStatisticsAdministratorActionsInfo.userId, true);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i5 = chatStatisticsAdministratorActionsInfo.deletedMessageCount;
                if (i5 > 0) {
                    spannableStringBuilder.append(C4403w.m27838q2(R.string.StatsXDeletions, i5));
                    if (chatStatisticsAdministratorActionsInfo.bannedUserCount > 0 || chatStatisticsAdministratorActionsInfo.restrictedUserCount > 0) {
                        spannableStringBuilder.append((CharSequence) ", ");
                    }
                }
                int i6 = chatStatisticsAdministratorActionsInfo.bannedUserCount;
                if (i6 > 0) {
                    spannableStringBuilder.append(C4403w.m27838q2(R.string.StatsXBans, i6));
                    if (chatStatisticsAdministratorActionsInfo.restrictedUserCount > 0) {
                        spannableStringBuilder.append((CharSequence) ", ");
                    }
                }
                int i7 = chatStatisticsAdministratorActionsInfo.restrictedUserCount;
                if (i7 > 0) {
                    spannableStringBuilder.append(C4403w.m27838q2(R.string.StatsXRestrictions, i7));
                }
                hVar.m26632w(spannableStringBuilder);
            } else if (i2 == R.id.btn_viewMemberMessages) {
                TdApi.ChatStatisticsMessageSenderInfo chatStatisticsMessageSenderInfo = (TdApi.ChatStatisticsMessageSenderInfo) object;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                C4649h hVar2 = new C4649h(this.f30170b, chatStatisticsMessageSenderInfo.userId, true);
                int i8 = chatStatisticsMessageSenderInfo.sentMessageCount;
                if (i8 > 0) {
                    spannableStringBuilder2.append(C4403w.m27838q2(R.string.xMessages, i8));
                }
                if (chatStatisticsMessageSenderInfo.averageCharacterCount > 0) {
                    if (spannableStringBuilder2.length() > 0) {
                        spannableStringBuilder2.append((CharSequence) ", ");
                    }
                    spannableStringBuilder2.append(C4403w.m27838q2(R.string.StatsXCharacters, chatStatisticsMessageSenderInfo.averageCharacterCount));
                }
                hVar2.m26632w(spannableStringBuilder2);
                hVar = hVar2;
            }
            if (hVar != null) {
                hVar.m26636s(true);
                list.add(new C2964ra(63, i2).m32873G(hVar));
                if (i4 != i3 - 1) {
                    list.add(new C2964ra(11));
                }
            }
        }
        if (i3 < objectArr.length) {
            list.add(new C2964ra(11));
            list.add(new C2964ra(4, (int) R.id.btn_showAdvanced, (int) R.drawable.baseline_direction_arrow_down_24, (CharSequence) C4403w.m27846o2(R.string.StatsXShowMore, objectArr.length - 10), false));
        }
        list.add(new C2964ra(3));
    }

    public final void m34087Og(C4649h hVar, boolean z, TdApi.ChatMemberStatus chatMemberStatus, TdApi.ChatMember chatMember) {
        TdApi.ChatMember chatMember2;
        if (z) {
            if (C4779t2.m25614R(chatMemberStatus, chatMember.status) == 1) {
                chatMember = null;
            }
        } else if (C4779t2.m25627P(chatMemberStatus, chatMember.status) == 1) {
            chatMember2 = null;
            View$OnClickListenerC3141u7 u7Var = new View$OnClickListenerC3141u7(this.f30168a, this.f30170b);
            u7Var.m31378sg(new View$OnClickListenerC3141u7.C3145d(((C2604b) m9131x9()).f8835a, hVar.m26640o(), z, chatMemberStatus, chatMember2).m31352b());
            m9291ac(u7Var);
        }
        chatMember2 = chatMember;
        View$OnClickListenerC3141u7 u7Var2 = new View$OnClickListenerC3141u7(this.f30168a, this.f30170b);
        u7Var2.m31378sg(new View$OnClickListenerC3141u7.C3145d(((C2604b) m9131x9()).f8835a, hVar.m26640o(), z, chatMemberStatus, chatMember2).m31352b());
        m9291ac(u7Var2);
    }

    public final void m34086Pg(final C4649h hVar) {
        final long j = m9131x9().f8835a;
        final C2964ra raVar = new C2964ra(28, 0, 0, C4403w.m27855m1(R.string.MemberCannotJoinGroup, this.f30170b.m2480e2().m1721K2(hVar.m26639p())), false);
        m9206me(new C9188f2(R.id.btn_blockSender).m10011a(raVar).m10002j(new AbstractC9323v4.AbstractC9343r() {
            @Override
            public final void mo1773l6(int i, SparseIntArray sparseIntArray) {
                View$OnClickListenerC2602k1.this.m34085Qg(hVar, j, i, sparseIntArray);
            }
        }).m9998n(new AbstractC9323v4.AbstractC9337n() {
            @Override
            public final void mo3907a(View view, int i, C2964ra raVar2, TextView textView, C2546iq iqVar) {
                View$OnClickListenerC2602k1.this.m34084Rg(raVar, hVar, view, i, raVar2, textView, iqVar);
            }
        }).m9996p(new C2964ra[]{new C2964ra(12, (int) R.id.right_readMessages, 0, (int) R.string.BanMember, true)}).m9994r(R.string.RemoveMember).m9995q(R.id.theme_color_textNegative));
    }

    @Override
    public int mo407R9() {
        return R.id.controller_stats;
    }

    public final void m34073ch(final TdApi.ChatStatisticsMessageInteractionInfo[] chatStatisticsMessageInteractionInfoArr, final Runnable runnable) {
        final AtomicInteger atomicInteger = new AtomicInteger(chatStatisticsMessageInteractionInfoArr.length);
        Client.AbstractC7865g y0Var = new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC2602k1.this.m34083Sg(chatStatisticsMessageInteractionInfoArr, atomicInteger, runnable, object);
            }
        };
        for (TdApi.ChatStatisticsMessageInteractionInfo chatStatisticsMessageInteractionInfo : chatStatisticsMessageInteractionInfoArr) {
            this.f30170b.m2270r4().m14783o(new TdApi.GetMessageLocally(m9131x9().f8835a, chatStatisticsMessageInteractionInfo.messageId), y0Var);
        }
    }

    @Override
    public boolean mo9270dc() {
        return this.f8832J0 == null || this.f8833K0 > 0;
    }

    public final void m34072dh(final C4649h hVar) {
        final C5320c cVar = new C5320c(4);
        final C5320c cVar2 = new C5320c(4);
        final C5320c cVar3 = new C5320c(4);
        final C5146u0 u0Var = new C5146u0(4);
        this.f30170b.m2270r4().m14783o(new TdApi.GetChatMember(m9131x9().f8835a, hVar.m26640o()), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC2602k1.this.m34078Xg(cVar, cVar2, cVar3, u0Var, hVar, object);
            }
        });
    }

    public final void m34071eh(List<C2964ra> list, final List<C7833i> list2, final Runnable runnable) {
        if (list2 != null) {
            for (final C7833i iVar : list2) {
                if (iVar.m14913p()) {
                    this.f8833K0++;
                    iVar.m14908u(new AbstractC5917i() {
                        @Override
                        public final void mo1322a(boolean z) {
                            View$OnClickListenerC2602k1.this.m34076Zg(list2, iVar, runnable, z);
                        }
                    });
                } else if (!iVar.m14912q()) {
                    list.add(new C2964ra(101).m32873G(iVar));
                    list.add(new C2964ra(2));
                    list.add(new C2964ra(iVar.m14916m(), iVar.m14919j()).m32873G(iVar));
                    list.add(new C2964ra(3));
                }
            }
        }
        this.f8826D0.m34119x2(list, false);
        if (this.f8833K0 == 0) {
            runnable.run();
        }
    }

    public final void m34070fh(final TdApi.DateRange dateRange, TdApi.ChatStatisticsMessageInteractionInfo[] chatStatisticsMessageInteractionInfoArr, final int i) {
        m34073ch(chatStatisticsMessageInteractionInfoArr, new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2602k1.this.m34075ah(i, dateRange);
            }
        });
    }

    public final void m34082Tg(final TdApi.ChatStatisticsChannel chatStatisticsChannel) {
        this.f8832J0 = chatStatisticsChannel;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2964ra(89, (int) R.id.btn_members, 0, (int) R.string.StatsMembers, false).m32873G(chatStatisticsChannel.memberCount));
        arrayList.add(new C2964ra(11));
        arrayList.add(new C2964ra(89, (int) R.id.btn_notifications, 0, (int) R.string.StatsNotifications, false).m32872H(chatStatisticsChannel.enabledNotificationsPercentage));
        if (!C7321e.m16959c1(chatStatisticsChannel.meanViewCount)) {
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(89, (int) R.id.btn_view, 0, (int) R.string.StatsViews, false).m32873G(chatStatisticsChannel.meanViewCount));
        }
        if (!C7321e.m16959c1(chatStatisticsChannel.meanShareCount)) {
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(89, (int) R.id.btn_share, 0, (int) R.string.StatsShares, false).m32873G(chatStatisticsChannel.meanShareCount));
        }
        arrayList.add(new C2964ra(3));
        TdApi.DateRange dateRange = chatStatisticsChannel.period;
        arrayList.add(new C2964ra(9, 0, 0, C4403w.m27855m1(R.string.StatsRange, C4403w.m27844p0(dateRange.startDate, dateRange.endDate, TimeUnit.SECONDS, true)), false));
        long j = m9131x9().f8835a;
        m34071eh(arrayList, Arrays.asList(new C7833i(R.id.stats_memberCount, this.f30170b, j, R.string.StatsChartGrowth, 0, chatStatisticsChannel.memberCountGraph, 0), new C7833i(R.id.stats_join, this.f30170b, j, R.string.StatsChartFollowers, 0, chatStatisticsChannel.joinGraph, 0), new C7833i(R.id.stats_mute, this.f30170b, j, R.string.StatsChartNotifications, 0, chatStatisticsChannel.muteGraph, 0), new C7833i(R.id.stats_viewCountByHour, this.f30170b, j, R.string.StatsChartViewsByHour, 0, chatStatisticsChannel.viewCountByHourGraph, 1), new C7833i(R.id.stats_viewCountBySource, this.f30170b, j, R.string.StatsChartViewsBySource, 2, chatStatisticsChannel.viewCountBySourceGraph, 0), new C7833i(R.id.stats_joinBySource, this.f30170b, j, R.string.StatsChartFollowersBySource, 2, chatStatisticsChannel.joinBySourceGraph, 0), new C7833i(R.id.stats_language, this.f30170b, j, R.string.StatsChartLanguage, 4, chatStatisticsChannel.languageGraph, 0), new C7833i(R.id.stats_messageInteraction, this.f30170b, j, R.string.StatsChartInteractions, 1, chatStatisticsChannel.messageInteractionGraph, 0), new C7833i(R.id.stats_instantViewInteraction, this.f30170b, j, R.string.StatsChartIv, 1, chatStatisticsChannel.instantViewInteractionGraph, 0)), new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2602k1.this.m34074bh(chatStatisticsChannel);
            }
        });
    }

    public final void m34081Ug(TdApi.ChatStatisticsSupergroup chatStatisticsSupergroup) {
        char c;
        this.f8832J0 = chatStatisticsSupergroup;
        List<C2964ra> arrayList = new ArrayList<>();
        arrayList.add(new C2964ra(89, (int) R.id.btn_members, 0, (int) R.string.StatsMembers, false).m32873G(chatStatisticsSupergroup.memberCount));
        arrayList.add(new C2964ra(11));
        arrayList.add(new C2964ra(89, (int) R.id.btn_messages, 0, (int) R.string.StatsMessages, false).m32873G(chatStatisticsSupergroup.messageCount));
        arrayList.add(new C2964ra(11));
        arrayList.add(new C2964ra(89, (int) R.id.btn_membersReading, 0, (int) R.string.StatsMembersReading, false).m32873G(chatStatisticsSupergroup.viewerCount));
        arrayList.add(new C2964ra(11));
        arrayList.add(new C2964ra(89, (int) R.id.btn_membersWriting, 0, (int) R.string.StatsMembersWriting, false).m32873G(chatStatisticsSupergroup.senderCount));
        arrayList.add(new C2964ra(3));
        TdApi.DateRange dateRange = chatStatisticsSupergroup.period;
        arrayList.add(new C2964ra(9, 0, 0, C4403w.m27855m1(R.string.StatsRange, C4403w.m27844p0(dateRange.startDate, dateRange.endDate, TimeUnit.SECONDS, true)), false));
        TdApi.Object[] objectArr = chatStatisticsSupergroup.topAdministrators;
        if (objectArr.length > 0) {
            c = 1;
            m34088Ng(arrayList, chatStatisticsSupergroup.period, objectArr, R.string.StatsTopAdmins, R.id.btn_viewAdminActions);
        } else {
            c = 1;
        }
        TdApi.ChatStatisticsMessageSenderInfo[] chatStatisticsMessageSenderInfoArr = chatStatisticsSupergroup.topSenders;
        if (chatStatisticsMessageSenderInfoArr.length > 0) {
            this.f8828F0 = chatStatisticsMessageSenderInfoArr;
            m34088Ng(arrayList, chatStatisticsSupergroup.period, chatStatisticsMessageSenderInfoArr, R.string.StatsTopMembers, R.id.btn_viewMemberMessages);
        }
        TdApi.Object[] objectArr2 = chatStatisticsSupergroup.topInviters;
        if (objectArr2.length > 0) {
            m34088Ng(arrayList, chatStatisticsSupergroup.period, objectArr2, R.string.StatsTopInviters, R.id.btn_openInviterProfile);
        }
        long j = ((C2604b) m9131x9()).f8835a;
        C7833i[] iVarArr = new C7833i[8];
        iVarArr[0] = new C7833i(R.id.stats_memberCount, this.f30170b, j, R.string.StatsChartGrowth, 0, chatStatisticsSupergroup.memberCountGraph, 0);
        iVarArr[c] = new C7833i(R.id.stats_join, this.f30170b, j, R.string.StatsChartMembers, 0, chatStatisticsSupergroup.joinGraph, 0);
        iVarArr[2] = new C7833i(R.id.stats_joinBySource, this.f30170b, j, R.string.StatsChartMembersBySource, 2, chatStatisticsSupergroup.joinBySourceGraph, 0);
        iVarArr[3] = new C7833i(R.id.stats_language, this.f30170b, j, R.string.StatsChartMembersLanguage, 4, chatStatisticsSupergroup.languageGraph, 0);
        iVarArr[4] = new C7833i(R.id.stats_messages, this.f30170b, j, R.string.StatsChartMessages, 2, chatStatisticsSupergroup.messageContentGraph, 0);
        iVarArr[5] = new C7833i(R.id.stats_actions, this.f30170b, j, R.string.StatsChartActions, 0, chatStatisticsSupergroup.actionGraph, 0);
        iVarArr[6] = new C7833i(R.id.stats_topHours, this.f30170b, j, R.string.StatsChartTopHours, 0, chatStatisticsSupergroup.dayGraph, 0);
        iVarArr[7] = new C7833i(R.id.stats_topDays, this.f30170b, j, R.string.StatsChartTopDays, 4, chatStatisticsSupergroup.weekGraph, 0);
        m34071eh(arrayList, Arrays.asList(iVarArr), new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2602k1.this.m9204n9();
            }
        });
    }

    public final void m34067ih() {
        int N0 = this.f8826D0.m34227N0(R.id.btn_showAdvanced);
        if (N0 != -1 && this.f8828F0 != null) {
            List<C2964ra> F0 = this.f8826D0.m34243F0();
            F0.remove(N0);
            ArrayList arrayList = new ArrayList();
            int i = 10;
            while (true) {
                TdApi.ChatStatisticsMessageSenderInfo[] chatStatisticsMessageSenderInfoArr = this.f8828F0;
                if (i >= chatStatisticsMessageSenderInfoArr.length) {
                    break;
                }
                TdApi.ChatStatisticsMessageSenderInfo chatStatisticsMessageSenderInfo = chatStatisticsMessageSenderInfoArr[i];
                C4649h hVar = new C4649h(this.f30170b, chatStatisticsMessageSenderInfo.userId, true);
                hVar.m26632w(C4403w.m27846o2(R.string.xMessages, chatStatisticsMessageSenderInfo.sentMessageCount) + ", " + C4403w.m27846o2(R.string.StatsXCharacters, chatStatisticsMessageSenderInfo.averageCharacterCount));
                hVar.m26636s(true);
                arrayList.add(new C2964ra(63, R.id.btn_viewMemberMessages).m32873G(hVar));
                if (i != this.f8828F0.length - 1) {
                    arrayList.add(new C2964ra(1));
                }
                i++;
            }
            C5062b.m24160m(F0, F0.size() + arrayList.size());
            Iterator it = arrayList.iterator();
            int i2 = N0;
            while (it.hasNext()) {
                i2++;
                F0.add(i2, (C2964ra) it.next());
            }
            this.f8826D0.m39310N(N0, 1);
            this.f8826D0.m39311M(N0, arrayList.size());
        }
    }

    public final TdApi.Message m34066jh(long j) {
        List<TdApi.Message> r1 = C7321e.m16914r1(this.f8831I0.get(Long.valueOf(j)));
        if (r1 == null) {
            return null;
        }
        return r1.get(0);
    }

    @Override
    public void onClick(View view) {
        C2964ra raVar = (C2964ra) view.getTag();
        long p = (raVar == null || !(raVar.m32847d() instanceof C4649h)) ? 0L : ((C4649h) raVar.m32847d()).m26639p();
        switch (view.getId()) {
            case R.id.btn_messageMore:
                C2605c cVar = (C2605c) raVar.m32847d();
                AbstractC9323v4<?> gcVar = new View$OnClickListenerC2439gc(this.f30168a, this.f30170b);
                List<TdApi.Message> list = this.f8831I0.get(Long.valueOf(cVar.f8836a.mediaAlbumId));
                if (list != null) {
                    gcVar.m9476Ad(new View$OnClickListenerC2439gc.C2441b(((C2604b) m9131x9()).f8835a, list));
                } else {
                    gcVar.m9476Ad(new View$OnClickListenerC2439gc.C2441b(((C2604b) m9131x9()).f8835a, cVar.f8836a));
                }
                m9291ac(gcVar);
                return;
            case R.id.btn_openInviterProfile:
                if (p != 0) {
                    this.f30170b.m2485dd().m3439u7(this, p, new HandlerC10770jj.C10780j().m3368h());
                    return;
                }
                return;
            case R.id.btn_showAdvanced:
                m34067ih();
                return;
            case R.id.btn_viewAdminActions:
                View$OnClickListenerC2971rh rhVar = new View$OnClickListenerC2971rh(this.f30168a, this.f30170b);
                rhVar.m32667Lp(new View$OnClickListenerC2971rh.C2977c0(3, null, this.f30170b.m2632U2(((C2604b) m9131x9()).f8835a)).m32143b(p));
                m9291ac(rhVar);
                return;
            case R.id.btn_viewMemberMessages:
                if (p != 0) {
                    AbstractC9323v4<?> q9Var = new C2912q9(mo4347s(), this.f30170b);
                    q9Var.m9476Ad(new C2912q9.C2914b(null, ((C2604b) m9131x9()).f8835a, null, new TdApi.MessageSenderUser(p), false));
                    m9291ac(q9Var);
                    this.f30170b.m2485dd().m3439u7(this, p, new HandlerC10770jj.C10780j().m3368h());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public boolean onLongClick(View view) {
        C2964ra raVar = (C2964ra) view.getTag();
        if (raVar == null || !(raVar.m32847d() instanceof C4649h)) {
            return false;
        }
        m34072dh((C4649h) raVar.m32847d());
        return true;
    }

    @Override
    public void mo30635rg(Context context, CustomRecyclerView customRecyclerView) {
        long j = m9131x9().f8835a;
        C9289s sVar = new C9289s(context);
        sVar.setThemedTextColor(this);
        sVar.m9631D1(C1357a0.m37544i(12.0f), true);
        sVar.setTitle(this.f30170b.m2691Q3(j));
        sVar.setSubtitle(R.string.Stats);
        this.f8827E0 = sVar;
        C2603a aVar = new C2603a(this);
        this.f8826D0 = aVar;
        customRecyclerView.setAdapter(aVar);
        this.f30170b.m2270r4().m14783o(new TdApi.GetChatStatistics(j, C11524j.m141z0()), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC2602k1.this.m34080Vg(object);
            }
        });
    }
}
