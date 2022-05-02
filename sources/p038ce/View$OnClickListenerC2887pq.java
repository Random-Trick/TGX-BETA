package p038ce;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1363c0;
import gd.C4618d7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import p038ce.RunnableC2374f5;
import p053dd.C4007j;
import p053dd.C4012k;
import p053dd.C4022o;
import p082fd.C4403w;
import p108hb.C5062b;
import p111he.AbstractC5117h0;
import p111he.AbstractC5129m0;
import p111he.C5115g0;
import p193nb.C7316a;
import p335xd.C10192g;
import p350yd.AbstractC10747j0;
import p350yd.C10721i0;
import p350yd.C10930q6;
import p350yd.C11059v7;
import p350yd.C11133y7;
import p350yd.HandlerC10770jj;
import td.AbstractC9323v4;
import td.View$OnClickListenerC9170d1;

public class View$OnClickListenerC2887pq extends AbstractC3204vo<View$OnClickListenerC3222vw> implements View.OnClickListener, C11059v7.AbstractC11068i, C11059v7.AbstractC11069j, AbstractC5129m0, Client.AbstractC7865g, AbstractC10747j0 {
    public ArrayList<C4618d7> f9665D0;
    public TdApi.MessageSender f9666E0;
    public int f9667F0;
    public boolean f9668G0;
    public boolean f9669H0;
    public C2546iq f9670I0;

    public class C2888a extends C2546iq {
        public C2888a(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo395U2(C2964ra raVar, int i, C4022o oVar, boolean z) {
            if (z) {
                oVar.m29276c1();
            } else {
                oVar.setUser((C4618d7) View$OnClickListenerC2887pq.this.f9665D0.get(i));
            }
        }
    }

    public class C2889b implements C4007j.AbstractC4009b {
        public C2889b() {
        }

        @Override
        public void mo9527a(RecyclerView.AbstractC0886d0 d0Var) {
            View$OnClickListenerC2887pq.this.m33091ah(((C4022o) d0Var.f3479a).getUser());
        }

        @Override
        public boolean mo9526b(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, int i) {
            return d0Var.m39332n() == 27;
        }

        @Override
        public float mo9525e() {
            return C4012k.m29329a(this);
        }
    }

    public class C2890c extends RecyclerView.AbstractC0910t {
        public C2890c() {
        }

        @Override
        public void mo421b(RecyclerView recyclerView, int i, int i2) {
            if (View$OnClickListenerC2887pq.this.m9339Ta() && View$OnClickListenerC2887pq.this.f9668G0 && !View$OnClickListenerC2887pq.this.f9669H0 && View$OnClickListenerC2887pq.this.f9665D0 != null && !View$OnClickListenerC2887pq.this.f9665D0.isEmpty() && View$OnClickListenerC2887pq.this.f9667F0 != 0 && ((LinearLayoutManager) recyclerView.getLayoutManager()).m39546a2() + 10 >= View$OnClickListenerC2887pq.this.f9665D0.size()) {
                View$OnClickListenerC2887pq.this.m33094Xg();
            }
        }
    }

    public View$OnClickListenerC2887pq(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m33100Rg(long j, boolean z) {
        if (!m9347Sa() && this.f9665D0 != null) {
            int Qg = m33101Qg(j);
            if (z && Qg == -1) {
                long d4 = this.f30167b.m2494d4(j);
                if (d4 != 0) {
                    m33105Mg(new TdApi.MessageSenderUser(d4));
                } else {
                    m33105Mg(new TdApi.MessageSenderChat(j));
                }
            } else if (!z && Qg != -1) {
                m33092Zg(Qg);
            }
        }
    }

    public void m33099Sg(ArrayList arrayList, TdApi.MessageSenders messageSenders) {
        if (!m9347Sa()) {
            this.f9665D0 = arrayList;
            int length = messageSenders.senders.length;
            this.f9667F0 = length;
            this.f9668G0 = length <= messageSenders.totalCount;
            m33102Pg();
            m9204n9();
        }
    }

    public void m33098Tg(TdApi.Object object) {
        if (object.getConstructor() == -690158467) {
            final TdApi.MessageSenders messageSenders = (TdApi.MessageSenders) object;
            final ArrayList arrayList = new ArrayList(messageSenders.senders.length);
            for (TdApi.MessageSender messageSender : messageSenders.senders) {
                arrayList.add(m33093Yg(this.f30167b, messageSender, arrayList));
            }
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2887pq.this.m33099Sg(arrayList, messageSenders);
                }
            });
        }
    }

    public void m33097Ug(TdApi.MessageSenders messageSenders, ArrayList arrayList) {
        if (!m9347Sa()) {
            boolean z = false;
            this.f9669H0 = false;
            int length = this.f9667F0 + messageSenders.senders.length;
            this.f9667F0 = length;
            if (length <= messageSenders.totalCount) {
                z = true;
            }
            this.f9668G0 = z;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (m33101Qg(((C4618d7) arrayList.get(size)).m26880h()) != -1) {
                    arrayList.remove(size);
                }
            }
            m33104Ng(arrayList);
        }
    }

    public void m33096Vg(TdApi.User user) {
        ArrayList<C4618d7> arrayList;
        if (!m9347Sa() && (arrayList = this.f9665D0) != null && !arrayList.isEmpty()) {
            Iterator<C4618d7> it = this.f9665D0.iterator();
            while (it.hasNext()) {
                C4618d7 next = it.next();
                if (next.m26869s() == user.f25439id) {
                    next.m26889C(user, 0);
                    this.f9670I0.m34143o3(C7316a.m17058c(user.f25439id), false);
                    return;
                }
            }
        }
    }

    public boolean m33095Wg(C4618d7 d7Var, View view, int i) {
        if (i != R.id.btn_unblockSender) {
            return true;
        }
        this.f30167b.m2496d2(d7Var.m26876l(), false, this.f30167b.m2392ja());
        return true;
    }

    public static C4618d7 m33093Yg(C10930q6 q6Var, TdApi.MessageSender messageSender, ArrayList<C4618d7> arrayList) {
        C4618d7 d7Var;
        int constructor = messageSender.getConstructor();
        if (constructor == -336109341) {
            d7Var = new C4618d7(q6Var, q6Var.m2480e2().m1583v2(((TdApi.MessageSenderUser) messageSender).userId));
        } else if (constructor == -239660751) {
            d7Var = new C4618d7(q6Var, q6Var.m2771L3(((TdApi.MessageSenderChat) messageSender).chatId));
        } else {
            throw new UnsupportedOperationException(messageSender.toString());
        }
        d7Var.m26891A();
        d7Var.m26864x(arrayList);
        return d7Var;
    }

    @Override
    public boolean mo23866A6() {
        return true;
    }

    @Override
    public void mo4076B4(long j, String[] strArr) {
        C10721i0.m4195b(this, j, strArr);
    }

    @Override
    public void mo4075C5(long j, long j2) {
        C10721i0.m4178s(this, j, j2);
    }

    @Override
    public boolean mo1350D3() {
        return true;
    }

    @Override
    public String mo23865D6() {
        return C4403w.m27869i1(R.string.BlockSender);
    }

    @Override
    public void mo4074G5(long j, int i, boolean z) {
        C10721i0.m4173x(this, j, i, z);
    }

    @Override
    public void mo4073H0(long j, String str) {
        C10721i0.m4177t(this, j, str);
    }

    @Override
    public void mo419J(int i, View view) {
        if (i == R.id.menu_btn_addContact) {
            m33103Og();
        }
    }

    @Override
    public void mo1349J3(long j, TdApi.UserStatus userStatus, boolean z) {
        if (!m9347Sa() && this.f9665D0 != null) {
            this.f9670I0.m34143o3(C7316a.m17058c(j), true);
        }
    }

    @Override
    public void mo4072K3(long j, boolean z) {
        C10721i0.m4188i(this, j, z);
    }

    @Override
    public void mo4071L0(long j, int i) {
        C10721i0.m4185l(this, j, i);
    }

    public final void m33105Mg(TdApi.MessageSender messageSender) {
        C4618d7 Yg;
        ArrayList<C4618d7> arrayList = this.f9665D0;
        if (arrayList != null && (Yg = m33093Yg(this.f30167b, messageSender, arrayList)) != null) {
            this.f9665D0.add(0, Yg);
            if (this.f9665D0.size() == 1) {
                m33102Pg();
                return;
            }
            int hg = m31306hg();
            int lg = m31302lg(hg);
            this.f9670I0.m34240F0().add(0, new C2964ra(27, R.id.user, 0, 0).m32863N(Yg.m26880h()));
            this.f9670I0.m39311J(0);
            if (hg != -1) {
                ((LinearLayoutManager) m31303kg().getLayoutManager()).m39522z2(hg, lg);
            }
        }
    }

    public final void m33104Ng(ArrayList<C4618d7> arrayList) {
        if (!arrayList.isEmpty()) {
            int size = this.f9665D0.size();
            ArrayList<C4618d7> arrayList2 = this.f9665D0;
            arrayList2.ensureCapacity(arrayList2.size() + arrayList.size());
            this.f9665D0.addAll(arrayList);
            List<C2964ra> F0 = this.f9670I0.m34240F0();
            C5062b.m24159m(F0, F0.size() + arrayList.size());
            Iterator<C4618d7> it = arrayList.iterator();
            while (it.hasNext()) {
                F0.add(new C2964ra(27, R.id.user, 0, 0).m32863N(it.next().m26869s()));
            }
            this.f9670I0.m39308M(size, arrayList.size());
        }
    }

    public final void m33103Og() {
        RunnableC2374f5 f5Var = new RunnableC2374f5(this.f30165a, this.f30167b);
        f5Var.m34764Xg(new RunnableC2374f5.C2376b(this));
        f5Var.m34766Vg(true);
        f5Var.m34765Wg(true, false);
        m9291ac(f5Var);
    }

    @Override
    public void mo1348P1(final TdApi.User user) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2887pq.this.m33096Vg(user);
            }
        });
    }

    public final void m33102Pg() {
        ArrayList arrayList = new ArrayList();
        ArrayList<C4618d7> arrayList2 = this.f9665D0;
        if (arrayList2 != null) {
            if (arrayList2.isEmpty()) {
                arrayList.add(new C2964ra(24, 0, 0, R.string.BlockListEmpty));
            } else {
                arrayList.ensureCapacity(this.f9665D0.size());
                Iterator<C4618d7> it = this.f9665D0.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C2964ra(27, R.id.user, 0, 0).m32863N(it.next().m26880h()));
                }
            }
        }
        this.f9670I0.m34116x2(arrayList, false);
    }

    public final int m33101Qg(long j) {
        ArrayList<C4618d7> arrayList = this.f9665D0;
        if (arrayList == null) {
            return -1;
        }
        int i = 0;
        Iterator<C4618d7> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().m26880h() == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override
    public void mo4070R1(long j, boolean z) {
        C10721i0.m4187j(this, j, z);
    }

    @Override
    public int mo407R9() {
        return R.id.controller_blocked;
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
    public int mo418W9() {
        return R.id.menu_contacts;
    }

    @Override
    public boolean mo23864X5(RunnableC2374f5 f5Var, View view, TdApi.MessageSender messageSender) {
        CharSequence m1 = C4403w.m27853m1(messageSender.getConstructor() == -336109341 ? R.string.QBlockUser : R.string.QBlockChat, C1363c0.m37418o0(this.f30167b.m2151yb(messageSender)));
        int[] iArr = {R.id.btn_blockSender, R.id.btn_cancel};
        String[] strArr = new String[2];
        strArr[0] = C4403w.m27869i1(messageSender.getConstructor() == -336109341 ? R.string.BlockUserBtn : R.string.BlockChatBtn);
        strArr[1] = C4403w.m27869i1(R.string.Cancel);
        m9268de(m1, iArr, strArr, new int[]{2, 1}, new int[]{R.drawable.baseline_block_24, R.drawable.baseline_cancel_24});
        return false;
    }

    @Override
    public CharSequence mo9313X9() {
        return C4403w.m27869i1(R.string.BlockedSenders);
    }

    public final void m33094Xg() {
        if (!this.f9669H0 && this.f9668G0) {
            this.f9669H0 = true;
            this.f30167b.m2270r4().m14783o(new TdApi.GetBlockedMessageSenders(this.f9667F0, 50), this);
        }
    }

    @Override
    public void mo4067Y(long j, TdApi.Message message) {
        C10721i0.m4175v(this, j, message);
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        this.f30167b.m2480e2().m1710N1(this);
        this.f30167b.m2781K9().m1826o0(this);
    }

    public final void m33092Zg(int i) {
        if (this.f9665D0.size() == 1) {
            this.f9665D0.clear();
            m33102Pg();
            return;
        }
        this.f9670I0.m34141p1(this.f9665D0.remove(i).m26880h());
    }

    @Override
    public void mo4066a0(long j, TdApi.MessageSender messageSender) {
        C10721i0.m4191f(this, j, messageSender);
    }

    public void m33091ah(final C4618d7 d7Var) {
        m9261ee(C4403w.m27853m1(R.string.QUnblockX, this.f30167b.m2151yb(d7Var.m26876l())), new int[]{R.id.btn_unblockSender, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.Unblock), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_block_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean Wg;
                Wg = View$OnClickListenerC2887pq.this.m33095Wg(d7Var, view, i);
                return Wg;
            }

            @Override
            public boolean mo492Q() {
                return C5115g0.m23935a(this);
            }

            @Override
            public Object mo491b2(int i) {
                return C5115g0.m23934b(this, i);
            }
        });
    }

    @Override
    public void mo4065c2(long j, TdApi.DraftMessage draftMessage) {
        C10721i0.m4190g(this, j, draftMessage);
    }

    @Override
    public void mo4064c4(long j, TdApi.ChatPhotoInfo chatPhotoInfo) {
        C10721i0.m4182o(this, j, chatPhotoInfo);
    }

    @Override
    public boolean mo9270dc() {
        return this.f9665D0 == null;
    }

    @Override
    public void mo4063e7(long j, int i) {
        C10721i0.m4186k(this, j, i);
    }

    @Override
    public void mo4062h1(long j, TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        C10721i0.m4184m(this, j, chatJoinRequestsInfo);
    }

    @Override
    public void mo4061i5(long j, String str) {
        C10721i0.m4176u(this, j, str);
    }

    @Override
    public void mo23863j(RunnableC2374f5 f5Var, TdApi.MessageSender messageSender, int i) {
        this.f9666E0 = messageSender;
    }

    @Override
    public void mo4060m0(long j, int i, boolean z) {
        C10721i0.m4174w(this, j, i, z);
    }

    @Override
    public void onClick(View view) {
        C4618d7 user;
        if (view.getId() == R.id.user && (user = ((C4022o) view).getUser()) != null) {
            this.f30167b.m2485dd().m3549j7(this, user.m26876l(), new HandlerC10770jj.C10780j().m3368h());
        }
    }

    @Override
    public void mo414p0(int i, View$OnClickListenerC9170d1 d1Var, LinearLayout linearLayout) {
        if (i == R.id.menu_contacts) {
            d1Var.m10104N1(linearLayout, R.id.menu_btn_addContact, R.drawable.baseline_person_add_24, mo9375O9(), this, C1357a0.m37541i(49.0f));
        }
    }

    @Override
    public void mo4059q6(long j, boolean z) {
        C10721i0.m4189h(this, j, z);
    }

    @Override
    public void mo30633rg(Context context, CustomRecyclerView customRecyclerView) {
        this.f9670I0 = new C2888a(this);
        m33102Pg();
        C10192g.m5782i(customRecyclerView, R.id.theme_color_filling, this);
        C4007j.m29342a(customRecyclerView, new C2889b());
        customRecyclerView.m39422k(new C2890c());
        customRecyclerView.setAdapter(this.f9670I0);
        this.f30167b.m2270r4().m14783o(new TdApi.GetBlockedMessageSenders(0, 20), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC2887pq.this.m33098Tg(object);
            }
        });
        this.f30167b.m2480e2().m1732I(this);
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
    public void mo9166sc() {
        super.mo9166sc();
        TdApi.MessageSender messageSender = this.f9666E0;
        if (messageSender != null) {
            C10930q6 q6Var = this.f30167b;
            q6Var.m2496d2(messageSender, true, q6Var.m2392ja());
            this.f9666E0 = null;
        }
    }

    @Override
    public void mo255t2(TdApi.Object object) {
        if (object.getConstructor() == -690158467) {
            final TdApi.MessageSenders messageSenders = (TdApi.MessageSenders) object;
            final ArrayList arrayList = new ArrayList(messageSenders.senders.length);
            for (TdApi.MessageSender messageSender : messageSenders.senders) {
                arrayList.add(m33093Yg(this.f30167b, messageSender, this.f9665D0));
            }
            if (!arrayList.isEmpty()) {
                this.f30167b.m2485dd().post(new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC2887pq.this.m33097Ug(messageSenders, arrayList);
                    }
                });
            }
        }
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
    public void mo4054w1(final long j, final boolean z) {
        if (!C7316a.m17051j(j)) {
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2887pq.this.m33100Rg(j, z);
                }
            });
        }
    }

    @Override
    public void mo4053w6(long j, TdApi.ChatPosition chatPosition, boolean z, boolean z2, boolean z3) {
        C10721i0.m4181p(this, j, chatPosition, z, z2, z3);
    }

    @Override
    public void mo4052y1(long j, long j2) {
        C10721i0.m4179r(this, j, j2);
    }
}
