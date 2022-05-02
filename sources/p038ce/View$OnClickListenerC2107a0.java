package p038ce;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import gd.C4618d7;
import gd.C4779t2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.C6957m1;
import me.View$OnClickListenerC6902i;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import p038ce.View$OnClickListenerC2107a0;
import p038ce.View$OnClickListenerC3141u7;
import p053dd.C4022o;
import p082fd.C4403w;
import p108hb.C5062b;
import p111he.C5146u0;
import p124ib.C5320c;
import p193nb.C7316a;
import p350yd.C10930q6;
import p350yd.C11059v7;
import p350yd.C11133y7;
import p350yd.HandlerC10770jj;
import td.AbstractC9323v4;
import td.C9289s;

public class View$OnClickListenerC2107a0 extends AbstractC3204vo<C2111c> implements View.OnClickListener, Client.AbstractC7865g, C11059v7.AbstractC11068i {
    public ArrayList<C4618d7> f7444D0;
    public ArrayList<TdApi.ChatInviteLinkMember> f7445E0 = new ArrayList<>();
    public C9289s f7446F0;
    public C2546iq f7447G0;
    public int f7448H0;
    public boolean f7449I0;
    public boolean f7450J0;

    public class C2108a extends C2546iq {

        public class C2109a implements C6957m1.AbstractC6962e {
            public final C4618d7 f7452a;

            public C2109a(C4618d7 d7Var) {
                this.f7452a = d7Var;
            }

            @Override
            public void mo3385B6(C6957m1.C6963f fVar, int i, Object obj) {
                if (i == R.id.btn_openChat) {
                    View$OnClickListenerC2107a0.this.f30170b.m2485dd().m3569h7(View$OnClickListenerC2107a0.this, this.f7452a.m26882h(), new HandlerC10770jj.C10780j().m3368h());
                } else if (i == R.id.btn_restrictMember) {
                    View$OnClickListenerC2107a0.this.m35537Yg(this.f7452a.m26871s());
                }
            }

            @Override
            public void mo3384E3(C6957m1.C6963f fVar, int i, Object obj) {
            }
        }

        public C2108a(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        public C6957m1.AbstractC6962e m35534y3(C4618d7 d7Var, View view, C6957m1.C6963f fVar, C5320c cVar, C5320c cVar2, C5146u0 u0Var, AbstractC9323v4 v4Var) {
            cVar.m23285a(R.id.btn_openChat);
            cVar2.m23285a(R.drawable.baseline_forum_24);
            u0Var.m23817a(R.string.OpenChat);
            cVar.m23285a(R.id.btn_restrictMember);
            cVar2.m23285a(R.drawable.baseline_remove_circle_24);
            u0Var.m23817a(R.string.RestrictUser);
            fVar.m18336J(true);
            return new C2109a(d7Var);
        }

        @Override
        public void mo395U2(C2964ra raVar, int i, C4022o oVar, boolean z) {
            if (z) {
                oVar.m29278c1();
                return;
            }
            final C4618d7 d7Var = (C4618d7) View$OnClickListenerC2107a0.this.f7444D0.get(i);
            oVar.m18494v0(new TdApi.ChatListMain(), d7Var.m26882h(), null);
            oVar.setPreviewActionListProvider(new View$OnClickListenerC6902i.AbstractC6905c() {
                @Override
                public final C6957m1.AbstractC6962e mo9610I4(View view, C6957m1.C6963f fVar, C5320c cVar, C5320c cVar2, C5146u0 u0Var, AbstractC9323v4 v4Var) {
                    C6957m1.AbstractC6962e y3;
                    y3 = View$OnClickListenerC2107a0.C2108a.this.m35534y3(d7Var, view, fVar, cVar, cVar2, u0Var, v4Var);
                    return y3;
                }
            });
            oVar.setUser(d7Var);
        }
    }

    public class C2110b extends RecyclerView.AbstractC0910t {
        public C2110b() {
        }

        @Override
        public void mo421b(RecyclerView recyclerView, int i, int i2) {
            if (View$OnClickListenerC2107a0.this.m9339Ta() && View$OnClickListenerC2107a0.this.f7449I0 && !View$OnClickListenerC2107a0.this.f7450J0 && View$OnClickListenerC2107a0.this.f7444D0 != null && !View$OnClickListenerC2107a0.this.f7444D0.isEmpty() && View$OnClickListenerC2107a0.this.f7448H0 != 0 && ((LinearLayoutManager) recyclerView.getLayoutManager()).m39549a2() + 10 >= View$OnClickListenerC2107a0.this.f7444D0.size()) {
                View$OnClickListenerC2107a0.this.m35538Xg();
            }
        }
    }

    public static class C2111c {
        public final long f7455a;
        public final String f7456b;

        public C2111c(long j, String str) {
            this.f7455a = j;
            this.f7456b = str;
        }
    }

    public View$OnClickListenerC2107a0(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m35544Rg(ArrayList arrayList, TdApi.ChatInviteLinkMembers chatInviteLinkMembers) {
        if (!m9347Sa()) {
            this.f7444D0 = arrayList;
            int length = chatInviteLinkMembers.members.length;
            this.f7448H0 = length;
            this.f7449I0 = length <= chatInviteLinkMembers.totalCount;
            m35546Pg();
            m9204n9();
        }
    }

    public void m35543Sg(TdApi.Object object) {
        TdApi.ChatInviteLinkMember[] chatInviteLinkMemberArr;
        if (object.getConstructor() == 315635051) {
            final TdApi.ChatInviteLinkMembers chatInviteLinkMembers = (TdApi.ChatInviteLinkMembers) object;
            final ArrayList arrayList = new ArrayList(chatInviteLinkMembers.members.length);
            for (TdApi.ChatInviteLinkMember chatInviteLinkMember : chatInviteLinkMembers.members) {
                this.f7445E0.add(chatInviteLinkMember);
                arrayList.add(m35536Zg(this.f30170b, chatInviteLinkMember, arrayList));
            }
            this.f30170b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2107a0.this.m35544Rg(arrayList, chatInviteLinkMembers);
                }
            });
        }
    }

    public void m35542Tg(TdApi.ChatInviteLinkMembers chatInviteLinkMembers, ArrayList arrayList) {
        if (!m9347Sa()) {
            boolean z = false;
            this.f7450J0 = false;
            int length = this.f7448H0 + chatInviteLinkMembers.members.length;
            this.f7448H0 = length;
            if (length <= chatInviteLinkMembers.totalCount) {
                z = true;
            }
            this.f7449I0 = z;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (m35545Qg(((C4618d7) arrayList.get(size)).m26882h()) != -1) {
                    arrayList.remove(size);
                }
            }
            m35547Og(arrayList);
        }
    }

    public void m35541Ug(TdApi.User user) {
        ArrayList<C4618d7> arrayList;
        if (!m9347Sa() && (arrayList = this.f7444D0) != null && !arrayList.isEmpty()) {
            Iterator<C4618d7> it = this.f7444D0.iterator();
            while (it.hasNext()) {
                C4618d7 next = it.next();
                if (next.m26871s() == user.f25442id) {
                    next.m26891C(user, 0);
                    this.f7447G0.m34146o3(C7316a.m17058c(user.f25442id), false);
                    return;
                }
            }
        }
    }

    public void m35540Vg(TdApi.Object object, long j) {
        TdApi.ChatMember chatMember = (TdApi.ChatMember) object;
        TdApi.ChatMemberStatus K3 = this.f30170b.m2787K3(((C2111c) m9131x9()).f7455a);
        if (C4779t2.m25614R(K3, chatMember.status) == 1) {
            chatMember = null;
        }
        TdApi.ChatMember chatMember2 = chatMember;
        View$OnClickListenerC3141u7 u7Var = new View$OnClickListenerC3141u7(this.f30168a, this.f30170b);
        u7Var.m31378sg(new View$OnClickListenerC3141u7.C3145d(((C2111c) m9131x9()).f7455a, new TdApi.MessageSenderUser(j), true, K3, chatMember2).m31352b());
        m9291ac(u7Var);
    }

    public void m35539Wg(final long j, final TdApi.Object object) {
        if (object.getConstructor() == 1829953909) {
            m9135wd(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2107a0.this.m35540Vg(object, j);
                }
            });
        }
    }

    public static C4618d7 m35536Zg(C10930q6 q6Var, TdApi.ChatInviteLinkMember chatInviteLinkMember, ArrayList<C4618d7> arrayList) {
        C4618d7 d7Var = new C4618d7(q6Var, q6Var.m2480e2().m1583v2(chatInviteLinkMember.userId));
        d7Var.m26893A();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        d7Var.m26864z(C4403w.m27867j1(R.string.MemberSince, C4403w.m27848o0(chatInviteLinkMember.joinedChatDate, timeUnit), C4403w.m27934T2(chatInviteLinkMember.joinedChatDate, timeUnit)));
        d7Var.m26866x(arrayList);
        return d7Var;
    }

    @Override
    public View mo8869G9() {
        return this.f7446F0;
    }

    public final void m35547Og(ArrayList<C4618d7> arrayList) {
        if (!arrayList.isEmpty()) {
            int size = this.f7444D0.size();
            ArrayList<C4618d7> arrayList2 = this.f7444D0;
            arrayList2.ensureCapacity(arrayList2.size() + arrayList.size());
            this.f7444D0.addAll(arrayList);
            List<C2964ra> F0 = this.f7447G0.m34243F0();
            C5062b.m24160m(F0, F0.size() + arrayList.size());
            Iterator<C4618d7> it = arrayList.iterator();
            while (it.hasNext()) {
                F0.add(new C2964ra(27, R.id.user, 0, 0).m32866N(it.next().m26871s()));
            }
            this.f7447G0.m39311M(size, arrayList.size());
        }
    }

    @Override
    public void mo1348P1(final TdApi.User user) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2107a0.this.m35541Ug(user);
            }
        });
    }

    public final void m35546Pg() {
        ArrayList arrayList = new ArrayList();
        ArrayList<C4618d7> arrayList2 = this.f7444D0;
        if (arrayList2 != null) {
            arrayList.ensureCapacity(arrayList2.size());
            Iterator<C4618d7> it = this.f7444D0.iterator();
            while (it.hasNext()) {
                arrayList.add(new C2964ra(27, R.id.user, 0, 0).m32866N(it.next().m26882h()));
            }
        }
        this.f7447G0.m34119x2(arrayList, false);
    }

    public final int m35545Qg(long j) {
        ArrayList<C4618d7> arrayList = this.f7444D0;
        if (arrayList == null) {
            return -1;
        }
        int i = 0;
        Iterator<C4618d7> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().m26882h() == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override
    public int mo407R9() {
        return R.id.controller_chatLinkMembers;
    }

    @Override
    public CharSequence mo9313X9() {
        return C4403w.m27871i1(R.string.InviteLinkViewMembersTitle);
    }

    public final void m35538Xg() {
        if (!this.f7450J0 && this.f7449I0 && !this.f7445E0.isEmpty()) {
            this.f7450J0 = true;
            Client r4 = this.f30170b.m2270r4();
            long j = m9131x9().f7455a;
            String str = m9131x9().f7456b;
            ArrayList<TdApi.ChatInviteLinkMember> arrayList = this.f7445E0;
            r4.m14783o(new TdApi.GetChatInviteLinkMembers(j, str, arrayList.get(arrayList.size() - 1), 50), this);
        }
    }

    public final void m35537Yg(final long j) {
        this.f30170b.m2270r4().m14783o(new TdApi.GetChatMember(m9131x9().f7455a, new TdApi.MessageSenderUser(j)), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC2107a0.this.m35539Wg(j, object);
            }
        });
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        this.f30170b.m2781K9().m1826o0(this);
    }

    @Override
    public boolean mo9270dc() {
        return this.f7444D0 == null;
    }

    @Override
    public void onClick(View view) {
        C4618d7 user = ((C4022o) view).getUser();
        if (user != null) {
            this.f30170b.m2485dd().m3429v7(this, user.m26871s(), new HandlerC10770jj.C10788q());
        }
    }

    @Override
    public void mo30635rg(Context context, CustomRecyclerView customRecyclerView) {
        C9289s sVar = new C9289s(mo4347s());
        this.f7446F0 = sVar;
        sVar.setThemedTextColor(this);
        this.f7446F0.m9631D1(C1357a0.m37544i(49.0f), true);
        this.f7446F0.setTitle(mo9313X9());
        this.f7446F0.setSubtitle(m9131x9().f7456b);
        this.f7447G0 = new C2108a(this);
        customRecyclerView.m39425k(new C2110b());
        customRecyclerView.setAdapter(this.f7447G0);
        this.f30170b.m2270r4().m14783o(new TdApi.GetChatInviteLinkMembers(m9131x9().f7455a, m9131x9().f7456b, null, 20), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC2107a0.this.m35543Sg(object);
            }
        });
        this.f30170b.m2781K9().m1882a0(this);
    }

    @Override
    public void mo255t2(TdApi.Object object) {
        TdApi.ChatInviteLinkMember[] chatInviteLinkMemberArr;
        if (object.getConstructor() == 315635051) {
            final TdApi.ChatInviteLinkMembers chatInviteLinkMembers = (TdApi.ChatInviteLinkMembers) object;
            final ArrayList arrayList = new ArrayList(chatInviteLinkMembers.members.length);
            for (TdApi.ChatInviteLinkMember chatInviteLinkMember : chatInviteLinkMembers.members) {
                this.f7445E0.add(chatInviteLinkMember);
                arrayList.add(m35536Zg(this.f30170b, chatInviteLinkMember, this.f7444D0));
            }
            if (!arrayList.isEmpty()) {
                this.f30170b.m2485dd().post(new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC2107a0.this.m35542Tg(chatInviteLinkMembers, arrayList);
                    }
                });
            }
        }
    }

    @Override
    public void mo1335u7(long j, TdApi.UserFullInfo userFullInfo) {
        C11133y7.m1438a(this, j, userFullInfo);
    }
}
