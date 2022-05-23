package de;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.c0;
import de.f5;
import ed.j;
import ed.k;
import ed.o;
import gd.w;
import hd.d7;
import ie.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import ud.d1;
import ud.v4;
import yd.g;
import zd.g0;
import zd.h0;
import zd.hj;
import zd.o6;
import zd.t7;
import zd.w7;

public class pq extends vo<ww> implements View.OnClickListener, t7.i, t7.j, m0, Client.g, h0 {
    public ArrayList<d7> D0;
    public TdApi.MessageSender E0;
    public int F0;
    public boolean G0;
    public boolean H0;
    public iq I0;

    public class a extends iq {
        public a(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void Q2(ra raVar, int i10, o oVar, boolean z10) {
            if (z10) {
                oVar.e1();
            } else {
                oVar.setUser((d7) pq.this.D0.get(i10));
            }
        }
    }

    public class b implements j.b {
        public b() {
        }

        @Override
        public void a(RecyclerView.c0 c0Var) {
            pq.this.ah(((o) c0Var.f2982a).getUser());
        }

        @Override
        public boolean b(RecyclerView recyclerView, RecyclerView.c0 c0Var, int i10) {
            return c0Var.n() == 27;
        }

        @Override
        public float e() {
            return k.a(this);
        }
    }

    public class c extends RecyclerView.t {
        public c() {
        }

        @Override
        public void b(RecyclerView recyclerView, int i10, int i11) {
            if (pq.this.Ta() && pq.this.G0 && !pq.this.H0 && pq.this.D0 != null && !pq.this.D0.isEmpty() && pq.this.F0 != 0 && ((LinearLayoutManager) recyclerView.getLayoutManager()).a2() + 10 >= pq.this.D0.size()) {
                pq.this.Xg();
            }
        }
    }

    public pq(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void Rg(long j10, boolean z10) {
        if (!Sa() && this.D0 != null) {
            int Qg = Qg(j10);
            if (z10 && Qg == -1) {
                long h42 = this.f24495b.h4(j10);
                if (h42 != 0) {
                    Mg(new TdApi.MessageSenderUser(h42));
                } else {
                    Mg(new TdApi.MessageSenderChat(j10));
                }
            } else if (!z10 && Qg != -1) {
                Zg(Qg);
            }
        }
    }

    public void Sg(ArrayList arrayList, TdApi.MessageSenders messageSenders) {
        if (!Sa()) {
            this.D0 = arrayList;
            int length = messageSenders.senders.length;
            this.F0 = length;
            this.G0 = length <= messageSenders.totalCount;
            Pg();
            n9();
        }
    }

    public void Tg(TdApi.Object object) {
        if (object.getConstructor() == -690158467) {
            final TdApi.MessageSenders messageSenders = (TdApi.MessageSenders) object;
            final ArrayList arrayList = new ArrayList(messageSenders.senders.length);
            for (TdApi.MessageSender messageSender : messageSenders.senders) {
                arrayList.add(Yg(this.f24495b, messageSender, arrayList));
            }
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    pq.this.Sg(arrayList, messageSenders);
                }
            });
        }
    }

    public void Ug(TdApi.MessageSenders messageSenders, ArrayList arrayList) {
        if (!Sa()) {
            boolean z10 = false;
            this.H0 = false;
            int length = this.F0 + messageSenders.senders.length;
            this.F0 = length;
            if (length <= messageSenders.totalCount) {
                z10 = true;
            }
            this.G0 = z10;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (Qg(((d7) arrayList.get(size)).h()) != -1) {
                    arrayList.remove(size);
                }
            }
            Ng(arrayList);
        }
    }

    public void Vg(TdApi.User user) {
        ArrayList<d7> arrayList;
        if (!Sa() && (arrayList = this.D0) != null && !arrayList.isEmpty()) {
            Iterator<d7> it = this.D0.iterator();
            while (it.hasNext()) {
                d7 next = it.next();
                if (next.s() == user.f19979id) {
                    next.C(user, 0);
                    this.I0.l3(ob.a.c(user.f19979id), false);
                    return;
                }
            }
        }
    }

    public boolean Wg(d7 d7Var, View view, int i10) {
        if (i10 != R.id.btn_unblockSender) {
            return true;
        }
        this.f24495b.d2(d7Var.l(), false, this.f24495b.na());
        return true;
    }

    public static d7 Yg(o6 o6Var, TdApi.MessageSender messageSender, ArrayList<d7> arrayList) {
        d7 d7Var;
        int constructor = messageSender.getConstructor();
        if (constructor == -336109341) {
            d7Var = new d7(o6Var, o6Var.e2().u2(((TdApi.MessageSenderUser) messageSender).userId));
        } else if (constructor == -239660751) {
            d7Var = new d7(o6Var, o6Var.P3(((TdApi.MessageSenderChat) messageSender).chatId));
        } else {
            throw new UnsupportedOperationException(messageSender.toString());
        }
        d7Var.A();
        d7Var.x(arrayList);
        return d7Var;
    }

    @Override
    public void A3(long j10, TdApi.UserStatus userStatus, boolean z10) {
        if (!Sa() && this.D0 != null) {
            this.I0.l3(ob.a.c(j10), true);
        }
    }

    @Override
    public boolean A6() {
        return true;
    }

    @Override
    public void B3(long j10, boolean z10) {
        g0.i(this, j10, z10);
    }

    @Override
    public void B5(long j10, int i10, boolean z10) {
        g0.x(this, j10, i10, z10);
    }

    @Override
    public String B6() {
        return w.i1(R.string.BlockSender);
    }

    @Override
    public void H0(long j10, String str) {
        g0.t(this, j10, str);
    }

    @Override
    public void J(int i10, View view) {
        if (i10 == R.id.menu_btn_addContact) {
            Og();
        }
    }

    @Override
    public void M1(final TdApi.User user) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                pq.this.Vg(user);
            }
        });
    }

    public final void Mg(TdApi.MessageSender messageSender) {
        d7 Yg;
        ArrayList<d7> arrayList = this.D0;
        if (arrayList != null && (Yg = Yg(this.f24495b, messageSender, arrayList)) != null) {
            this.D0.add(0, Yg);
            if (this.D0.size() == 1) {
                Pg();
                return;
            }
            int hg = hg();
            int lg = lg(hg);
            this.I0.D0().add(0, new ra(27, R.id.user, 0, 0).N(Yg.h()));
            this.I0.J(0);
            if (hg != -1) {
                ((LinearLayoutManager) kg().getLayoutManager()).z2(hg, lg);
            }
        }
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
    public boolean N3(f5 f5Var, View view, TdApi.MessageSender messageSender) {
        CharSequence m12 = w.m1(messageSender.getConstructor() == -336109341 ? R.string.QBlockUser : R.string.QBlockChat, c0.o0(this.f24495b.Cb(messageSender)));
        int[] iArr = {R.id.btn_blockSender, R.id.btn_cancel};
        String[] strArr = new String[2];
        strArr[0] = w.i1(messageSender.getConstructor() == -336109341 ? R.string.BlockUserBtn : R.string.BlockChatBtn);
        strArr[1] = w.i1(R.string.Cancel);
        de(m12, iArr, strArr, new int[]{2, 1}, new int[]{R.drawable.baseline_block_24, R.drawable.baseline_cancel_24});
        return false;
    }

    public final void Ng(ArrayList<d7> arrayList) {
        if (!arrayList.isEmpty()) {
            int size = this.D0.size();
            ArrayList<d7> arrayList2 = this.D0;
            arrayList2.ensureCapacity(arrayList2.size() + arrayList.size());
            this.D0.addAll(arrayList);
            List<ra> D0 = this.I0.D0();
            ib.b.m(D0, D0.size() + arrayList.size());
            Iterator<d7> it = arrayList.iterator();
            while (it.hasNext()) {
                D0.add(new ra(27, R.id.user, 0, 0).N(it.next().s()));
            }
            this.I0.M(size, arrayList.size());
        }
    }

    public final void Og() {
        f5 f5Var = new f5(this.f24493a, this.f24495b);
        f5Var.Xg(new f5.b(this));
        f5Var.Vg(true);
        f5Var.Wg(true, false);
        ac(f5Var);
    }

    public final void Pg() {
        ArrayList arrayList = new ArrayList();
        ArrayList<d7> arrayList2 = this.D0;
        if (arrayList2 != null) {
            if (arrayList2.isEmpty()) {
                arrayList.add(new ra(24, 0, 0, R.string.BlockListEmpty));
            } else {
                arrayList.ensureCapacity(this.D0.size());
                Iterator<d7> it = this.D0.iterator();
                while (it.hasNext()) {
                    arrayList.add(new ra(27, R.id.user, 0, 0).N(it.next().h()));
                }
            }
        }
        this.I0.s2(arrayList, false);
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
    public void R3(long j10, TdApi.ChatPhotoInfo chatPhotoInfo) {
        g0.o(this, j10, chatPhotoInfo);
    }

    @Override
    public int R9() {
        return R.id.controller_blocked;
    }

    @Override
    public void T5(long j10, long j11, int i10, boolean z10) {
        g0.q(this, j10, j11, i10, z10);
    }

    @Override
    public int W9() {
        return R.id.menu_contacts;
    }

    @Override
    public void X(long j10, TdApi.ChatActionBar chatActionBar) {
        g0.a(this, j10, chatActionBar);
    }

    @Override
    public CharSequence X9() {
        return w.i1(R.string.BlockedSenders);
    }

    public final void Xg() {
        if (!this.H0 && this.G0) {
            this.H0 = true;
            this.f24495b.v4().o(new TdApi.GetBlockedMessageSenders(this.F0, 50), this);
        }
    }

    @Override
    public void Y(long j10, TdApi.Message message) {
        g0.v(this, j10, message);
    }

    @Override
    public void Z8() {
        super.Z8();
        this.f24495b.e2().L1(this);
        this.f24495b.O9().o0(this);
    }

    public final void Zg(int i10) {
        if (this.D0.size() == 1) {
            this.D0.clear();
            Pg();
            return;
        }
        this.I0.l1(this.D0.remove(i10).h());
    }

    @Override
    public void a0(long j10, TdApi.MessageSender messageSender) {
        g0.f(this, j10, messageSender);
    }

    public void ah(final d7 d7Var) {
        ee(w.m1(R.string.QUnblockX, this.f24495b.Cb(d7Var.l())), new int[]{R.id.btn_unblockSender, R.id.btn_cancel}, new String[]{w.i1(R.string.Unblock), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_block_24, R.drawable.baseline_cancel_24}, new ie.h0() {
            @Override
            public boolean P() {
                return ie.g0.a(this);
            }

            @Override
            public Object a2(int i10) {
                return ie.g0.b(this, i10);
            }

            @Override
            public final boolean r3(View view, int i10) {
                boolean Wg;
                Wg = pq.this.Wg(d7Var, view, i10);
                return Wg;
            }
        });
    }

    @Override
    public void b2(long j10, TdApi.DraftMessage draftMessage) {
        g0.g(this, j10, draftMessage);
    }

    @Override
    public void c1(long j10, TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        g0.m(this, j10, chatJoinRequestsInfo);
    }

    @Override
    public boolean dc() {
        return this.D0 == null;
    }

    @Override
    public void e7(long j10, int i10) {
        g0.k(this, j10, i10);
    }

    @Override
    public void f4(long j10, String str) {
        g0.d(this, j10, str);
    }

    @Override
    public void f5(long j10, String str) {
        g0.u(this, j10, str);
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
    public void onClick(View view) {
        d7 user;
        if (view.getId() == R.id.user && (user = ((o) view).getUser()) != null) {
            this.f24495b.hd().j7(this, user.l(), new hj.j().h());
        }
    }

    @Override
    public void p6(long j10, boolean z10) {
        g0.h(this, j10, z10);
    }

    @Override
    public void q2(long j10, boolean z10) {
        g0.e(this, j10, z10);
    }

    @Override
    public void r2(TdApi.Object object) {
        if (object.getConstructor() == -690158467) {
            final TdApi.MessageSenders messageSenders = (TdApi.MessageSenders) object;
            final ArrayList arrayList = new ArrayList(messageSenders.senders.length);
            for (TdApi.MessageSender messageSender : messageSenders.senders) {
                arrayList.add(Yg(this.f24495b, messageSender, this.D0));
            }
            if (!arrayList.isEmpty()) {
                this.f24495b.hd().post(new Runnable() {
                    @Override
                    public final void run() {
                        pq.this.Ug(messageSenders, arrayList);
                    }
                });
            }
        }
    }

    @Override
    public void rg(Context context, CustomRecyclerView customRecyclerView) {
        this.I0 = new a(this);
        Pg();
        g.i(customRecyclerView, R.id.theme_color_filling, this);
        j.a(customRecyclerView, new b());
        customRecyclerView.k(new c());
        customRecyclerView.setAdapter(this.I0);
        this.f24495b.v4().o(new TdApi.GetBlockedMessageSenders(0, 20), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                pq.this.Tg(object);
            }
        });
        this.f24495b.e2().I(this);
        this.f24495b.O9().a0(this);
    }

    @Override
    public void s6(f5 f5Var, TdApi.MessageSender messageSender, int i10) {
        this.E0 = messageSender;
    }

    @Override
    public void sc() {
        super.sc();
        TdApi.MessageSender messageSender = this.E0;
        if (messageSender != null) {
            o6 o6Var = this.f24495b;
            o6Var.d2(messageSender, true, o6Var.na());
            this.E0 = null;
        }
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
    public void u1(int i10, d1 d1Var, LinearLayout linearLayout) {
        if (i10 == R.id.menu_contacts) {
            d1Var.K1(linearLayout, R.id.menu_btn_addContact, R.drawable.baseline_person_add_24, O9(), this, a0.i(49.0f));
        }
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
    public void w1(final long j10, final boolean z10) {
        if (!ob.a.j(j10)) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    pq.this.Rg(j10, z10);
                }
            });
        }
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
}
