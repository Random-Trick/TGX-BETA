package de;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.j0;
import ce.x;
import ed.o;
import gd.w;
import hd.d7;
import hd.t2;
import he.n;
import ie.g0;
import ie.h0;
import ie.y0;
import java.util.ArrayList;
import java.util.Iterator;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.t1;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.p0;
import ud.v4;
import yd.d;
import yd.g;
import zd.o6;
import zd.t7;
import zd.w7;

public class s5 extends v4<Void> implements p0.a, h0, Client.g, y0, ud.a, t7.i, t7.j {
    public ArrayList<d7> f9445n0;
    public p0 f9446o0;
    public c f9447p0;
    public RecyclerView f9448q0;
    public d7 f9449r0;
    public boolean f9450s0;
    public String f9451t0;
    public long[] f9452u0;
    public boolean f9453v0;
    public a f9454w0;
    public boolean f9455x0;

    public interface a {
        boolean a(s5 s5Var, TdApi.Chat chat);

        boolean b();
    }

    public static class b extends RecyclerView.c0 {
        public b(View view) {
            super(view);
        }

        public void O() {
            if (n() == 0) {
                ((o) this.f2982a).C0();
            }
        }

        public void P() {
            if (n() == 0) {
                ((o) this.f2982a).G0();
            }
        }
    }

    public static class c extends RecyclerView.h<b> implements View.OnClickListener {
        public Context M;
        public s5 N;

        public c(Context context, s5 s5Var) {
            this.M = context;
            this.N = s5Var;
        }

        @Override
        public int D() {
            int size = this.N.f9445n0 == null ? 0 : this.N.f9445n0.size();
            if (size == 0) {
                return 0;
            }
            return size + 2;
        }

        @Override
        public int F(int i10) {
            if (i10 == 0) {
                return 2;
            }
            return i10 == this.N.f9445n0.size() + 1 ? 1 : 0;
        }

        public void Q(b bVar, int i10) {
            int n10 = bVar.n();
            if (n10 == 0) {
                ((o) bVar.f2982a).setUser((d7) this.N.f9445n0.get(i10 - 1));
            } else if (n10 == 1) {
                ((t1) bVar.f2982a).B1(w.q2(R.string.xMembers, this.N.f9445n0.size()));
            }
        }

        public b S(ViewGroup viewGroup, int i10) {
            if (i10 == 0) {
                o oVar = new o(this.M, this.N.f24495b);
                oVar.setOffsetLeft(a0.i(22.0f));
                ce.p0.T(oVar);
                d.g(oVar);
                oVar.setOnClickListener(this);
                return new b(oVar);
            } else if (i10 == 1) {
                return new b(new t1(this.M));
            } else {
                if (i10 != 2) {
                    return null;
                }
                View view = new View(this.M);
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, a0.i(11.0f)));
                return new b(view);
            }
        }

        public void V(b bVar) {
            bVar.O();
        }

        public void W(b bVar) {
            bVar.P();
        }

        @Override
        public void onClick(View view) {
            if (view != null && (view instanceof o)) {
                this.N.df(((o) view).getUser());
            }
        }
    }

    public s5(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void Ze(TdApi.Object object, TdApi.Object object2) {
        this.f24495b.na().r2(object2);
        r2(object);
    }

    public void af(final TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            r2(object);
        } else if (constructor == -1601123095) {
            this.f24495b.v4().o(new TdApi.AddChatMembers(((TdApi.Chat) object).f19908id, this.f9452u0), new Client.g() {
                @Override
                public final void r2(TdApi.Object object2) {
                    s5.this.Ze(object, object2);
                }
            });
        }
    }

    public void bf(TdApi.Object object, long j10) {
        a aVar = this.f9454w0;
        if (aVar == null || !aVar.a(this, (TdApi.Chat) object)) {
            this.f24495b.hd().h7(this, j10, null);
        }
    }

    @Override
    public void A3(long j10, TdApi.UserStatus userStatus, boolean z10) {
        kf(j10, userStatus);
    }

    @Override
    public int A9() {
        return 3;
    }

    @Override
    public void E0(boolean z10) {
        this.f9455x0 = z10;
    }

    @Override
    public View G9() {
        return this.f9446o0;
    }

    @Override
    public void H4() {
        this.f9450s0 = false;
        this.f9446o0.setInputEnabled(true);
    }

    @Override
    public void Ia() {
        super.Ia();
        c cVar = this.f9447p0;
        if (cVar != null) {
            cVar.H();
        }
    }

    @Override
    public int J9() {
        return R.drawable.baseline_check_24;
    }

    @Override
    public void M1(final TdApi.User user) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                s5.this.cf(user);
            }
        });
    }

    @Override
    public int M9() {
        return n.b(false);
    }

    @Override
    public boolean P() {
        return g0.a(this);
    }

    @Override
    public int R9() {
        return R.id.controller_newGroup;
    }

    public void We() {
        if (!this.f9450s0) {
            boolean z10 = false;
            if (!this.f9455x0) {
                j0.y0(R.string.GroupEnterValidName, 0);
                return;
            }
            this.f9446o0.setInputEnabled(false);
            this.f9450s0 = true;
            this.f9451t0 = this.f9446o0.getPhoto();
            String input = this.f9446o0.getInput();
            this.f9452u0 = new long[this.f9445n0.size()];
            Iterator<d7> it = this.f9445n0.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                i10++;
                this.f9452u0[i10] = it.next().s();
            }
            if (this.f9452u0.length > this.f24495b.c2()) {
                z10 = true;
            }
            this.f9453v0 = z10;
            if (z10) {
                this.f24495b.v4().o(new TdApi.CreateNewSupergroupChat(input, false, null, null, false), this);
                return;
            }
            a aVar = this.f9454w0;
            if (aVar == null || !aVar.b()) {
                this.f24495b.v4().o(new TdApi.CreateNewBasicGroupChat(this.f9452u0, input), this);
            } else {
                this.f24495b.v4().o(new TdApi.CreateNewSupergroupChat(input, false, null, null, false), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        s5.this.af(object);
                    }
                });
            }
        }
    }

    public final long[] Xe() {
        ArrayList<d7> arrayList = this.f9445n0;
        if (arrayList == null || arrayList.isEmpty()) {
            return ib.b.f14162b;
        }
        long[] jArr = new long[this.f9445n0.size()];
        int i10 = 0;
        Iterator<d7> it = this.f9445n0.iterator();
        while (it.hasNext()) {
            i10++;
            jArr[i10] = it.next().s();
        }
        return jArr;
    }

    public final int Ye(long j10) {
        ArrayList<d7> arrayList = this.f9445n0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i10 = 0;
            Iterator<d7> it = this.f9445n0.iterator();
            while (it.hasNext()) {
                if (it.next().s() == j10) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    @Override
    public void Z8() {
        super.Z8();
        ce.p0.n(this.f9448q0);
        hf();
    }

    @Override
    public Object a2(int i10) {
        return g0.b(this, i10);
    }

    public final void df(d7 d7Var) {
        this.f9449r0 = d7Var;
        de(null, new int[]{R.id.btn_deleteMember, R.id.btn_cancel}, new String[]{w.i1(R.string.GroupDontAdd), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_remove_circle_24, R.drawable.baseline_cancel_24});
    }

    public void ef(a aVar) {
        this.f9454w0 = aVar;
    }

    public void ff(ArrayList<d7> arrayList) {
        this.f9445n0 = arrayList;
    }

    public final void gf() {
        this.f24495b.e2().e2(Xe(), this);
    }

    public final void hf() {
        this.f24495b.e2().s2(Xe(), this);
    }

    public final void cf(TdApi.User user) {
        int Ye = Ye(user.f19979id);
        if (Ye != 0) {
            this.f9445n0.get(Ye).C(user, 0);
            jf(Ye + 1, false);
        }
    }

    public final void jf(int i10, boolean z10) {
        View C = this.f9448q0.getLayoutManager().C(i10);
        if (C instanceof o) {
            if (z10) {
                ((o) C).e1();
            } else {
                ((o) C).V0();
            }
            C.invalidate();
            return;
        }
        this.f9447p0.I(i10);
    }

    public final void kf(long j10, TdApi.UserStatus userStatus) {
        int Ye = Ye(j10);
        if (Ye != 0) {
            this.f9445n0.get(Ye).B(userStatus);
            jf(Ye + 1, true);
        }
    }

    @Override
    public View oc(Context context) {
        p0 p0Var = new p0(context, this);
        this.f9446o0 = p0Var;
        p0Var.D1(R.string.GroupName, Log.TAG_LUX);
        this.f9446o0.setImeOptions(6);
        this.f9446o0.setReadyCallback(this);
        Ed(this.f9446o0.getInputView());
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        g.i(frameLayoutFix, R.id.theme_color_filling, this);
        frameLayoutFix.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        FrameLayout.LayoutParams q12 = FrameLayoutFix.q1(-1, -1);
        q12.topMargin = n.f(false);
        RecyclerView recyclerView = new RecyclerView(context);
        this.f9448q0 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        RecyclerView recyclerView2 = this.f9448q0;
        c cVar = new c(context, this);
        this.f9447p0 = cVar;
        recyclerView2.setAdapter(cVar);
        this.f9448q0.setLayoutParams(q12);
        frameLayoutFix.addView(this.f9448q0);
        gf();
        return frameLayoutFix;
    }

    @Override
    public void r2(final TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
            j0.E0(this);
        } else if (constructor == -1601123095) {
            final long P0 = t2.P0(object);
            if (this.f9453v0) {
                this.f24495b.v4().o(new TdApi.AddChatMembers(P0, this.f9452u0), this);
            }
            if (this.f9451t0 != null) {
                Client v42 = this.f24495b.v4();
                String str = this.f9451t0;
                v42.o(new TdApi.SetChatPhoto(P0, new TdApi.InputChatPhotoStatic(new TdApi.InputFileGenerated(str, jd.d.j(str), 0))), this);
            }
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    s5.this.bf(object, P0);
                }
            });
            j0.E0(this);
        }
    }

    @Override
    public boolean r3(View view, int i10) {
        long s10;
        int Ye;
        if (i10 != R.id.btn_deleteMember) {
            this.f24495b.hd().s3(this.f24493a, i10, null, this.f9446o0);
        } else {
            d7 d7Var = this.f9449r0;
            if (!(d7Var == null || (Ye = Ye((s10 = d7Var.s()))) == -1)) {
                this.f24495b.e2().r2(s10, this);
                this.f9445n0.remove(Ye);
                if (this.f9445n0.isEmpty()) {
                    this.f9447p0.N(0, 3);
                    x.c(this.f9446o0.getInputView());
                    Zb();
                } else {
                    this.f9447p0.O(Ye + 1);
                    this.f9447p0.I(this.f9445n0.size() + 1);
                }
            }
        }
        return true;
    }

    @Override
    public void rc() {
        We();
    }

    @Override
    public boolean sd(Bundle bundle, String str) {
        long[] longArray = bundle.getLongArray(str + "userIds");
        if (!(longArray == null || longArray.length == 0)) {
            ArrayList<d7> arrayList = null;
            for (long j10 : longArray) {
                TdApi.User u22 = this.f24495b.e2().u2(j10);
                if (u22 == null) {
                    return false;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<>(longArray.length);
                }
                arrayList.add(new d7(this.f24495b, u22));
            }
            if (arrayList != null) {
                super.sd(bundle, str);
                this.f9445n0 = arrayList;
                return true;
            }
        }
        return false;
    }

    @Override
    public void u(int i10, int i11, Intent intent) {
        if (i11 == -1) {
            this.f24495b.hd().q3(i10, intent, this.f9446o0);
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
    public boolean yd(Bundle bundle, String str) {
        long[] Xe = Xe();
        if (Xe == null || Xe.length <= 0) {
            return false;
        }
        super.yd(bundle, str);
        bundle.putLongArray(str + "userIds", Xe);
        return true;
    }
}
