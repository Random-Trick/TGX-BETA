package de;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import de.a0;
import de.u7;
import ed.o;
import gd.w;
import hd.d7;
import hd.t2;
import ie.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jb.c;
import ne.i;
import ne.m1;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import ud.s;
import ud.v4;
import zd.hj;
import zd.o6;
import zd.t7;
import zd.w7;

public class a0 extends vo<c> implements View.OnClickListener, Client.g, t7.i {
    public ArrayList<d7> D0;
    public ArrayList<TdApi.ChatInviteLinkMember> E0 = new ArrayList<>();
    public s F0;
    public iq G0;
    public int H0;
    public boolean I0;
    public boolean J0;

    public class a extends iq {

        public class C0086a implements m1.e {
            public final d7 f7410a;

            public C0086a(d7 d7Var) {
                this.f7410a = d7Var;
            }

            @Override
            public void a7(m1.f fVar, int i10, Object obj) {
                if (i10 == R.id.btn_openChat) {
                    a0.this.f24495b.hd().h7(a0.this, this.f7410a.h(), new hj.j().h());
                } else if (i10 == R.id.btn_restrictMember) {
                    a0.this.Yg(this.f7410a.s());
                }
            }

            @Override
            public void t2(m1.f fVar, int i10, Object obj) {
            }
        }

        public a(v4 v4Var) {
            super(v4Var);
        }

        public m1.e w3(d7 d7Var, View view, m1.f fVar, jb.c cVar, jb.c cVar2, u0 u0Var, v4 v4Var) {
            cVar.a(R.id.btn_openChat);
            cVar2.a(R.drawable.baseline_forum_24);
            u0Var.a(R.string.OpenChat);
            cVar.a(R.id.btn_restrictMember);
            cVar2.a(R.drawable.baseline_remove_circle_24);
            u0Var.a(R.string.RestrictUser);
            fVar.J(true);
            return new C0086a(d7Var);
        }

        @Override
        public void Q2(ra raVar, int i10, o oVar, boolean z10) {
            if (z10) {
                oVar.e1();
                return;
            }
            final d7 d7Var = (d7) a0.this.D0.get(i10);
            oVar.w0(new TdApi.ChatListMain(), d7Var.h(), null);
            oVar.setPreviewActionListProvider(new i.c() {
                @Override
                public final m1.e r6(View view, m1.f fVar, c cVar, c cVar2, u0 u0Var, v4 v4Var) {
                    m1.e w32;
                    w32 = a0.a.this.w3(d7Var, view, fVar, cVar, cVar2, u0Var, v4Var);
                    return w32;
                }
            });
            oVar.setUser(d7Var);
        }
    }

    public class b extends RecyclerView.t {
        public b() {
        }

        @Override
        public void b(RecyclerView recyclerView, int i10, int i11) {
            if (a0.this.Ta() && a0.this.I0 && !a0.this.J0 && a0.this.D0 != null && !a0.this.D0.isEmpty() && a0.this.H0 != 0 && ((LinearLayoutManager) recyclerView.getLayoutManager()).a2() + 10 >= a0.this.D0.size()) {
                a0.this.Xg();
            }
        }
    }

    public static class c {
        public final long f7413a;
        public final String f7414b;

        public c(long j10, String str) {
            this.f7413a = j10;
            this.f7414b = str;
        }
    }

    public a0(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void Rg(ArrayList arrayList, TdApi.ChatInviteLinkMembers chatInviteLinkMembers) {
        if (!Sa()) {
            this.D0 = arrayList;
            int length = chatInviteLinkMembers.members.length;
            this.H0 = length;
            this.I0 = length <= chatInviteLinkMembers.totalCount;
            Pg();
            n9();
        }
    }

    public void Sg(TdApi.Object object) {
        TdApi.ChatInviteLinkMember[] chatInviteLinkMemberArr;
        if (object.getConstructor() == 315635051) {
            final TdApi.ChatInviteLinkMembers chatInviteLinkMembers = (TdApi.ChatInviteLinkMembers) object;
            final ArrayList arrayList = new ArrayList(chatInviteLinkMembers.members.length);
            for (TdApi.ChatInviteLinkMember chatInviteLinkMember : chatInviteLinkMembers.members) {
                this.E0.add(chatInviteLinkMember);
                arrayList.add(Zg(this.f24495b, chatInviteLinkMember, arrayList));
            }
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    a0.this.Rg(arrayList, chatInviteLinkMembers);
                }
            });
        }
    }

    public void Tg(TdApi.ChatInviteLinkMembers chatInviteLinkMembers, ArrayList arrayList) {
        if (!Sa()) {
            boolean z10 = false;
            this.J0 = false;
            int length = this.H0 + chatInviteLinkMembers.members.length;
            this.H0 = length;
            if (length <= chatInviteLinkMembers.totalCount) {
                z10 = true;
            }
            this.I0 = z10;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (Qg(((d7) arrayList.get(size)).h()) != -1) {
                    arrayList.remove(size);
                }
            }
            Og(arrayList);
        }
    }

    public void Ug(TdApi.User user) {
        ArrayList<d7> arrayList;
        if (!Sa() && (arrayList = this.D0) != null && !arrayList.isEmpty()) {
            Iterator<d7> it = this.D0.iterator();
            while (it.hasNext()) {
                d7 next = it.next();
                if (next.s() == user.f19979id) {
                    next.C(user, 0);
                    this.G0.l3(ob.a.c(user.f19979id), false);
                    return;
                }
            }
        }
    }

    public void Vg(TdApi.Object object, long j10) {
        TdApi.ChatMember chatMember = (TdApi.ChatMember) object;
        TdApi.ChatMemberStatus O3 = this.f24495b.O3(((c) x9()).f7413a);
        if (t2.R(O3, chatMember.status) == 1) {
            chatMember = null;
        }
        TdApi.ChatMember chatMember2 = chatMember;
        u7 u7Var = new u7(this.f24493a, this.f24495b);
        u7Var.sg(new u7.d(((c) x9()).f7413a, new TdApi.MessageSenderUser(j10), true, O3, chatMember2).b());
        ac(u7Var);
    }

    public void Wg(final long j10, final TdApi.Object object) {
        if (object.getConstructor() == 1829953909) {
            wd(new Runnable() {
                @Override
                public final void run() {
                    a0.this.Vg(object, j10);
                }
            });
        }
    }

    public static d7 Zg(o6 o6Var, TdApi.ChatInviteLinkMember chatInviteLinkMember, ArrayList<d7> arrayList) {
        d7 d7Var = new d7(o6Var, o6Var.e2().u2(chatInviteLinkMember.userId));
        d7Var.A();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        d7Var.z(w.j1(R.string.MemberSince, w.o0(chatInviteLinkMember.joinedChatDate, timeUnit), w.T2(chatInviteLinkMember.joinedChatDate, timeUnit)));
        d7Var.x(arrayList);
        return d7Var;
    }

    @Override
    public View G9() {
        return this.F0;
    }

    @Override
    public void M1(final TdApi.User user) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                a0.this.Ug(user);
            }
        });
    }

    public final void Og(ArrayList<d7> arrayList) {
        if (!arrayList.isEmpty()) {
            int size = this.D0.size();
            ArrayList<d7> arrayList2 = this.D0;
            arrayList2.ensureCapacity(arrayList2.size() + arrayList.size());
            this.D0.addAll(arrayList);
            List<ra> D0 = this.G0.D0();
            ib.b.m(D0, D0.size() + arrayList.size());
            Iterator<d7> it = arrayList.iterator();
            while (it.hasNext()) {
                D0.add(new ra(27, R.id.user, 0, 0).N(it.next().s()));
            }
            this.G0.M(size, arrayList.size());
        }
    }

    public final void Pg() {
        ArrayList arrayList = new ArrayList();
        ArrayList<d7> arrayList2 = this.D0;
        if (arrayList2 != null) {
            arrayList.ensureCapacity(arrayList2.size());
            Iterator<d7> it = this.D0.iterator();
            while (it.hasNext()) {
                arrayList.add(new ra(27, R.id.user, 0, 0).N(it.next().h()));
            }
        }
        this.G0.s2(arrayList, false);
    }

    public final int Qg(long j10) {
        ArrayList<d7> arrayList = this.D0;
        if (arrayList == null) {
            return -1;
        }
        int i10 = 0;
        Iterator<d7> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().h() == j10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override
    public int R9() {
        return R.id.controller_chatLinkMembers;
    }

    @Override
    public CharSequence X9() {
        return w.i1(R.string.InviteLinkViewMembersTitle);
    }

    public final void Xg() {
        if (!this.J0 && this.I0 && !this.E0.isEmpty()) {
            this.J0 = true;
            Client v42 = this.f24495b.v4();
            long j10 = x9().f7413a;
            String str = x9().f7414b;
            ArrayList<TdApi.ChatInviteLinkMember> arrayList = this.E0;
            v42.o(new TdApi.GetChatInviteLinkMembers(j10, str, arrayList.get(arrayList.size() - 1), 50), this);
        }
    }

    public final void Yg(final long j10) {
        this.f24495b.v4().o(new TdApi.GetChatMember(x9().f7413a, new TdApi.MessageSenderUser(j10)), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                a0.this.Wg(j10, object);
            }
        });
    }

    @Override
    public void Z8() {
        super.Z8();
        this.f24495b.O9().o0(this);
    }

    @Override
    public boolean dc() {
        return this.D0 == null;
    }

    @Override
    public void onClick(View view) {
        d7 user = ((o) view).getUser();
        if (user != null) {
            this.f24495b.hd().v7(this, user.s(), new hj.q());
        }
    }

    @Override
    public void r2(TdApi.Object object) {
        TdApi.ChatInviteLinkMember[] chatInviteLinkMemberArr;
        if (object.getConstructor() == 315635051) {
            final TdApi.ChatInviteLinkMembers chatInviteLinkMembers = (TdApi.ChatInviteLinkMembers) object;
            final ArrayList arrayList = new ArrayList(chatInviteLinkMembers.members.length);
            for (TdApi.ChatInviteLinkMember chatInviteLinkMember : chatInviteLinkMembers.members) {
                this.E0.add(chatInviteLinkMember);
                arrayList.add(Zg(this.f24495b, chatInviteLinkMember, this.D0));
            }
            if (!arrayList.isEmpty()) {
                this.f24495b.hd().post(new Runnable() {
                    @Override
                    public final void run() {
                        a0.this.Tg(chatInviteLinkMembers, arrayList);
                    }
                });
            }
        }
    }

    @Override
    public void rg(Context context, CustomRecyclerView customRecyclerView) {
        s sVar = new s(t());
        this.F0 = sVar;
        sVar.setThemedTextColor(this);
        this.F0.A1(ce.a0.i(49.0f), true);
        this.F0.setTitle(X9());
        this.F0.setSubtitle(x9().f7414b);
        this.G0 = new a(this);
        customRecyclerView.k(new b());
        customRecyclerView.setAdapter(this.G0);
        this.f24495b.v4().o(new TdApi.GetChatInviteLinkMembers(x9().f7413a, x9().f7414b, null, 20), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                a0.this.Sg(object);
            }
        });
        this.f24495b.O9().a0(this);
    }

    @Override
    public void u7(long j10, TdApi.UserFullInfo userFullInfo) {
        w7.a(this, j10, userFullInfo);
    }
}
