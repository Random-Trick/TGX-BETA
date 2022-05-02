package p038ce;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1379j0;
import be.C1399s0;
import be.C1408x;
import gd.C4618d7;
import gd.C4779t2;
import ge.C4896n;
import id.C5337d;
import java.util.ArrayList;
import java.util.Iterator;
import me.C7030t1;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p053dd.C4022o;
import p082fd.C4403w;
import p108hb.C5062b;
import p111he.AbstractC5117h0;
import p111he.AbstractC5155y0;
import p111he.C5115g0;
import p335xd.C10189d;
import p335xd.C10192g;
import p350yd.C10930q6;
import p350yd.C11059v7;
import p350yd.C11133y7;
import td.AbstractC9142a;
import td.AbstractC9323v4;
import td.C9262p0;

public class C3034s5 extends AbstractC9323v4<Void> implements C9262p0.AbstractC9263a, AbstractC5117h0, Client.AbstractC7865g, AbstractC5155y0, AbstractC9142a, C11059v7.AbstractC11068i, C11059v7.AbstractC11069j {
    public ArrayList<C4618d7> f10186n0;
    public C9262p0 f10187o0;
    public View$OnClickListenerC3037c f10188p0;
    public RecyclerView f10189q0;
    public C4618d7 f10190r0;
    public boolean f10191s0;
    public String f10192t0;
    public long[] f10193u0;
    public boolean f10194v0;
    public AbstractC3035a f10195w0;
    public boolean f10196x0;

    public interface AbstractC3035a {
        boolean mo31466a();

        boolean mo31465b(C3034s5 s5Var, TdApi.Chat chat);
    }

    public static class C3036b extends RecyclerView.AbstractC0886d0 {
        public C3036b(View view) {
            super(view);
        }

        public void m32000O() {
            if (m39335n() == 0) {
                ((C4022o) this.f3479a).m29287B0();
            }
        }

        public void m31999P() {
            if (m39335n() == 0) {
                ((C4022o) this.f3479a).m29285F0();
            }
        }
    }

    public static class View$OnClickListenerC3037c extends RecyclerView.AbstractC0890h<C3036b> implements View.OnClickListener {
        public Context f10197M;
        public C3034s5 f10198N;

        public View$OnClickListenerC3037c(Context context, C3034s5 s5Var) {
            this.f10197M = context;
            this.f10198N = s5Var;
        }

        @Override
        public int mo6153D() {
            int size = this.f10198N.f10186n0 == null ? 0 : this.f10198N.f10186n0.size();
            if (size == 0) {
                return 0;
            }
            return size + 2;
        }

        @Override
        public int mo6150F(int i) {
            if (i == 0) {
                return 2;
            }
            return i == this.f10198N.f10186n0.size() + 1 ? 1 : 0;
        }

        public void mo6146Q(C3036b bVar, int i) {
            int n = bVar.m39335n();
            if (n == 0) {
                ((C4022o) bVar.f3479a).setUser((C4618d7) this.f10198N.f10186n0.get(i - 1));
            } else if (n == 1) {
                ((C7030t1) bVar.f3479a).m18058E1(C4403w.m27838q2(R.string.xMembers, this.f10198N.f10186n0.size()));
            }
        }

        public C3036b mo6145S(ViewGroup viewGroup, int i) {
            if (i == 0) {
                C4022o oVar = new C4022o(this.f10197M, this.f10198N.f30170b);
                oVar.setOffsetLeft(C1357a0.m37544i(22.0f));
                C1399s0.m37196a0(oVar);
                C10189d.m5797g(oVar);
                oVar.setOnClickListener(this);
                return new C3036b(oVar);
            } else if (i == 1) {
                return new C3036b(new C7030t1(this.f10197M));
            } else {
                if (i != 2) {
                    return null;
                }
                View view = new View(this.f10197M);
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, C1357a0.m37544i(11.0f)));
                return new C3036b(view);
            }
        }

        public void mo6144V(C3036b bVar) {
            bVar.m32000O();
        }

        public void mo6143W(C3036b bVar) {
            bVar.m31999P();
        }

        @Override
        public void onClick(View view) {
            if (view != null && (view instanceof C4022o)) {
                this.f10198N.m32008df(((C4022o) view).getUser());
            }
        }
    }

    public C3034s5(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m32012Ze(TdApi.Object object, TdApi.Object object2) {
        this.f30170b.m2392ja().mo255t2(object2);
        mo255t2(object);
    }

    public void m32011af(final TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            mo255t2(object);
        } else if (constructor == -1601123095) {
            this.f30170b.m2270r4().m14783o(new TdApi.AddChatMembers(((TdApi.Chat) object).f25370id, this.f10193u0), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object2) {
                    C3034s5.this.m32012Ze(object, object2);
                }
            });
        }
    }

    public void m32010bf(TdApi.Object object, long j) {
        AbstractC3035a aVar = this.f10195w0;
        if (aVar == null || !aVar.mo31465b(this, (TdApi.Chat) object)) {
            this.f30170b.m2485dd().m3569h7(this, j, null);
        }
    }

    @Override
    public boolean mo493A3(View view, int i) {
        long s;
        int Ye;
        if (i != R.id.btn_deleteMember) {
            this.f30170b.m2485dd().m3463s3(this.f30168a, i, null, this.f10187o0);
        } else {
            C4618d7 d7Var = this.f10190r0;
            if (!(d7Var == null || (Ye = m32013Ye((s = d7Var.m26871s()))) == -1)) {
                this.f30170b.m2480e2().m1595s2(s, this);
                this.f10186n0.remove(Ye);
                if (this.f10186n0.isEmpty()) {
                    this.f10188p0.m39310N(0, 3);
                    C1408x.m37091c(this.f10187o0.getInputView());
                    m9298Zb();
                } else {
                    this.f10188p0.m39309O(Ye + 1);
                    this.f10188p0.m39315I(this.f10186n0.size() + 1);
                }
            }
        }
        return true;
    }

    @Override
    public int mo408A9() {
        return 3;
    }

    @Override
    public boolean mo1350D3() {
        return true;
    }

    @Override
    public void mo9773E0(boolean z) {
        this.f10196x0 = z;
    }

    @Override
    public View mo8869G9() {
        return this.f10187o0;
    }

    @Override
    public void mo8867Ia() {
        super.mo8867Ia();
        View$OnClickListenerC3037c cVar = this.f10188p0;
        if (cVar != null) {
            cVar.m39316H();
        }
    }

    @Override
    public void mo1349J3(long j, TdApi.UserStatus userStatus, boolean z) {
        m32001kf(j, userStatus);
    }

    @Override
    public int mo9413J9() {
        return R.drawable.baseline_check_24;
    }

    @Override
    public int mo8865M9() {
        return C4896n.m24482b(false);
    }

    @Override
    public void mo23796O4() {
        this.f10191s0 = false;
        this.f10187o0.setInputEnabled(true);
    }

    @Override
    public void mo1348P1(final TdApi.User user) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                C3034s5.this.m32009cf(user);
            }
        });
    }

    @Override
    public boolean mo492Q() {
        return C5115g0.m23936a(this);
    }

    @Override
    public int mo407R9() {
        return R.id.controller_newGroup;
    }

    public void m32015We() {
        if (!this.f10191s0) {
            boolean z = false;
            if (!this.f10196x0) {
                C1379j0.m37295y0(R.string.GroupEnterValidName, 0);
                return;
            }
            this.f10187o0.setInputEnabled(false);
            this.f10191s0 = true;
            this.f10192t0 = this.f10187o0.getPhoto();
            String input = this.f10187o0.getInput();
            this.f10193u0 = new long[this.f10186n0.size()];
            Iterator<C4618d7> it = this.f10186n0.iterator();
            int i = 0;
            while (it.hasNext()) {
                i++;
                this.f10193u0[i] = it.next().m26871s();
            }
            if (this.f10193u0.length > this.f30170b.m2512c2()) {
                z = true;
            }
            this.f10194v0 = z;
            if (z) {
                this.f30170b.m2270r4().m14783o(new TdApi.CreateNewSupergroupChat(input, false, null, null, false), this);
                return;
            }
            AbstractC3035a aVar = this.f10195w0;
            if (aVar == null || !aVar.mo31466a()) {
                this.f30170b.m2270r4().m14783o(new TdApi.CreateNewBasicGroupChat(this.f10193u0, input), this);
            } else {
                this.f30170b.m2270r4().m14783o(new TdApi.CreateNewSupergroupChat(input, false, null, null, false), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        C3034s5.this.m32011af(object);
                    }
                });
            }
        }
    }

    public final long[] m32014Xe() {
        ArrayList<C4618d7> arrayList = this.f10186n0;
        if (arrayList == null || arrayList.isEmpty()) {
            return C5062b.f17069b;
        }
        long[] jArr = new long[this.f10186n0.size()];
        int i = 0;
        Iterator<C4618d7> it = this.f10186n0.iterator();
        while (it.hasNext()) {
            i++;
            jArr[i] = it.next().m26871s();
        }
        return jArr;
    }

    public final int m32013Ye(long j) {
        ArrayList<C4618d7> arrayList = this.f10186n0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i = 0;
            Iterator<C4618d7> it = this.f10186n0.iterator();
            while (it.hasNext()) {
                if (it.next().m26871s() == j) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        C1399s0.m37165q(this.f10189q0);
        m32004hf();
    }

    @Override
    public Object mo491b2(int i) {
        return C5115g0.m23935b(this, i);
    }

    public final void m32008df(C4618d7 d7Var) {
        this.f10190r0 = d7Var;
        m9268de(null, new int[]{R.id.btn_deleteMember, R.id.btn_cancel}, new String[]{C4403w.m27871i1(R.string.GroupDontAdd), C4403w.m27871i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_remove_circle_24, R.drawable.baseline_cancel_24});
    }

    public void m32007ef(AbstractC3035a aVar) {
        this.f10195w0 = aVar;
    }

    public void m32006ff(ArrayList<C4618d7> arrayList) {
        this.f10186n0 = arrayList;
    }

    public final void m32005gf() {
        this.f30170b.m2480e2().m1642g2(m32014Xe(), this);
    }

    public final void m32004hf() {
        this.f30170b.m2480e2().m1591t2(m32014Xe(), this);
    }

    public final void m32009cf(TdApi.User user) {
        int Ye = m32013Ye(user.f25442id);
        if (Ye != 0) {
            this.f10186n0.get(Ye).m26891C(user, 0);
            m32002jf(Ye + 1, false);
        }
    }

    public final void m32002jf(int i, boolean z) {
        View C = this.f10189q0.getLayoutManager().mo39265C(i);
        if (C instanceof C4022o) {
            if (z) {
                ((C4022o) C).m29278c1();
            } else {
                ((C4022o) C).m29281Q0();
            }
            C.invalidate();
            return;
        }
        this.f10188p0.m39315I(i);
    }

    public final void m32001kf(long j, TdApi.UserStatus userStatus) {
        int Ye = m32013Ye(j);
        if (Ye != 0) {
            this.f10186n0.get(Ye).m26892B(userStatus);
            m32002jf(Ye + 1, true);
        }
    }

    @Override
    public View mo403oc(Context context) {
        C9262p0 p0Var = new C9262p0(context, this);
        this.f10187o0 = p0Var;
        p0Var.m9775G1(R.string.GroupName, Log.TAG_LUX);
        this.f10187o0.setImeOptions(6);
        this.f10187o0.setReadyCallback(this);
        m9446Ed(this.f10187o0.getInputView());
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        C10192g.m5782i(frameLayoutFix, R.id.theme_color_filling, this);
        frameLayoutFix.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(-1, -1);
        s1.topMargin = C4896n.m24478f(false);
        RecyclerView recyclerView = new RecyclerView(context);
        this.f10189q0 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        RecyclerView recyclerView2 = this.f10189q0;
        View$OnClickListenerC3037c cVar = new View$OnClickListenerC3037c(context, this);
        this.f10188p0 = cVar;
        recyclerView2.setAdapter(cVar);
        this.f10189q0.setLayoutParams(s1);
        frameLayoutFix.addView(this.f10189q0);
        m32005gf();
        return frameLayoutFix;
    }

    @Override
    public void mo9174rc() {
        m32015We();
    }

    @Override
    public boolean mo9165sd(Bundle bundle, String str) {
        long[] longArray = bundle.getLongArray(str + "userIds");
        if (!(longArray == null || longArray.length == 0)) {
            ArrayList<C4618d7> arrayList = null;
            for (long j : longArray) {
                TdApi.User v2 = this.f30170b.m2480e2().m1583v2(j);
                if (v2 == null) {
                    return false;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<>(longArray.length);
                }
                arrayList.add(new C4618d7(this.f30170b, v2));
            }
            if (arrayList != null) {
                super.mo9165sd(bundle, str);
                this.f10186n0 = arrayList;
                return true;
            }
        }
        return false;
    }

    @Override
    public void mo10181t(int i, int i2, Intent intent) {
        if (i2 == -1) {
            this.f30170b.m2485dd().m3483q3(i, intent, this.f10187o0);
        }
    }

    @Override
    public void mo255t2(final TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37305t0(object);
            C1379j0.m37368E0(this);
        } else if (constructor == -1601123095) {
            final long P0 = C4779t2.m25626P0(object);
            if (this.f10194v0) {
                this.f30170b.m2270r4().m14783o(new TdApi.AddChatMembers(P0, this.f10193u0), this);
            }
            if (this.f10192t0 != null) {
                Client r4 = this.f30170b.m2270r4();
                String str = this.f10192t0;
                r4.m14783o(new TdApi.SetChatPhoto(P0, new TdApi.InputChatPhotoStatic(new TdApi.InputFileGenerated(str, C5337d.m23203j(str), 0))), this);
            }
            this.f30170b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C3034s5.this.m32010bf(object, P0);
                }
            });
            C1379j0.m37368E0(this);
        }
    }

    @Override
    public void mo1335u7(long j, TdApi.UserFullInfo userFullInfo) {
        C11133y7.m1438a(this, j, userFullInfo);
    }

    @Override
    public boolean mo9122yd(Bundle bundle, String str) {
        long[] Xe = m32014Xe();
        if (Xe == null || Xe.length <= 0) {
            return false;
        }
        super.mo9122yd(bundle, str);
        bundle.putLongArray(str + "userIds", Xe);
        return true;
    }
}
