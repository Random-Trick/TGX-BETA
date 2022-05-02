package p038ce;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1379j0;
import be.C1399s0;
import cd.C2099j;
import cd.C2103k;
import cd.C2104l;
import gd.C4817v6;
import java.util.ArrayList;
import java.util.Iterator;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p038ce.x00;
import p139jb.AbstractRunnableC5910b;
import p143k0.C6035e;
import p319wc.View$OnClickListenerC10042e;
import p335xd.C10192g;
import p350yd.AbstractC10986s1;
import p350yd.C10930q6;
import p350yd.C10965r1;
import td.AbstractC9323v4;

public class h30 extends AbstractC9323v4<Void> implements C2099j.AbstractC2102c, Client.AbstractC7865g, C2104l.AbstractC2105a, AbstractC10986s1, C4817v6.AbstractC4818a {
    public RecyclerView f8474n0;
    public View$OnClickListenerC10042e f8475o0;
    public boolean f8476p0;
    public boolean f8477q0;
    public final ArrayList<C4817v6> f8478r0 = new ArrayList<>();
    public C6035e<Boolean> f8479s0;
    public AbstractRunnableC5910b f8480t0;
    public C6035e<Boolean> f8481u0;

    public class C2470a extends GridLayoutManager.AbstractC0873b {
        public C2470a() {
        }

        @Override
        public int mo7528f(int i) {
            return h30.this.f8475o0.mo6150F(i) == 0 ? 1 : 5;
        }
    }

    public class C2471b extends RecyclerView.AbstractC0910t {
        public C2471b() {
        }

        @Override
        public void mo421b(RecyclerView recyclerView, int i, int i2) {
            int a2;
            int indexOf;
            if (!h30.this.f8476p0 && h30.this.f8477q0 && (a2 = ((LinearLayoutManager) recyclerView.getLayoutManager()).m39546a2()) != -1 && (indexOf = h30.this.f8478r0.indexOf(h30.this.f8475o0.m6136g0(a2).f32684c)) != -1 && indexOf + 5 >= h30.this.f8478r0.size()) {
                h30 h30Var = h30.this;
                h30Var.m34466rf(h30Var.f8478r0.size(), 25, h30.this.f8475o0.mo6153D());
            }
        }
    }

    public class C2472c extends AbstractRunnableC5910b {
        public C2472c() {
        }

        @Override
        public void mo1364b() {
            if (h30.this.f8479s0 != null && h30.this.f8479s0.m21496p() > 0) {
                int p = h30.this.f8479s0.m21496p();
                long[] jArr = new long[p];
                for (int i = 0; i < p; i++) {
                    jArr[i] = h30.this.f8479s0.m21501j(i);
                }
                h30.this.f8479s0.m21509b();
                h30.this.f30167b.m2270r4().m14783o(new TdApi.ViewTrendingStickerSets(jArr), h30.this.f30167b.m2392ja());
            }
        }
    }

    public h30(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m34474jf(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        if (!m9347Sa()) {
            m34478ff(arrayList, arrayList2, i, i2);
            m9300Z9().m9204n9();
        }
    }

    public void m34473kf(final int i, final int i2, TdApi.Object object) {
        ArrayList arrayList;
        int constructor = object.getConstructor();
        if (constructor == -1883828812) {
            final ArrayList arrayList2 = new ArrayList();
            TdApi.StickerSetInfo[] stickerSetInfoArr = ((TdApi.StickerSets) object).sets;
            if (stickerSetInfoArr.length > 0) {
                arrayList = new ArrayList(stickerSetInfoArr.length);
                C2746n9.m33722Ng(this.f30167b, arrayList, arrayList2, i, stickerSetInfoArr, this, this, true);
            } else {
                arrayList = null;
                if (i2 == 0) {
                    arrayList2.add(new View$OnClickListenerC10042e.C10044b(6));
                }
            }
            final ArrayList arrayList3 = arrayList;
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    h30.this.m34474jf(arrayList3, arrayList2, i2, i);
                }
            });
        } else if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        }
    }

    public void m34472lf(C6035e eVar) {
        ArrayList<C4817v6> arrayList;
        if (!m9347Sa() && !this.f8476p0 && (arrayList = this.f8478r0) != null) {
            Iterator<C4817v6> it = arrayList.iterator();
            while (it.hasNext()) {
                C4817v6 next = it.next();
                if (eVar.m21503h(next.m25182c()) >= 0) {
                    next.m25160y();
                    this.f8475o0.m6149F0(next);
                } else {
                    next.m25194A();
                    this.f8475o0.m6149F0(next);
                }
            }
        }
    }

    public void m34471mf(TdApi.StickerSet stickerSet) {
        if (!m9347Sa()) {
            m34477gf(stickerSet);
        }
    }

    public void m34470nf(long j) {
        ArrayList<C4817v6> arrayList;
        if (!m9347Sa() && !this.f8476p0 && (arrayList = this.f8478r0) != null) {
            Iterator<C4817v6> it = arrayList.iterator();
            while (it.hasNext()) {
                C4817v6 next = it.next();
                if (j == next.m25182c()) {
                    next.m25162w();
                    this.f8475o0.m6149F0(next);
                    return;
                }
            }
        }
    }

    public void m34469of(long j) {
        ArrayList<C4817v6> arrayList;
        if (!m9347Sa() && !this.f8476p0 && (arrayList = this.f8478r0) != null) {
            Iterator<C4817v6> it = arrayList.iterator();
            while (it.hasNext()) {
                C4817v6 next = it.next();
                if (j == next.m25182c()) {
                    next.m25160y();
                    this.f8475o0.m6149F0(next);
                    return;
                }
            }
        }
    }

    public void m34468pf(long j) {
        ArrayList<C4817v6> arrayList;
        if (!m9347Sa() && !this.f8476p0 && (arrayList = this.f8478r0) != null) {
            Iterator<C4817v6> it = arrayList.iterator();
            while (it.hasNext()) {
                C4817v6 next = it.next();
                if (j == next.m25182c()) {
                    next.m25194A();
                    next.m25159z();
                    this.f8475o0.m6149F0(next);
                    return;
                }
            }
        }
    }

    public void m34467qf(TdApi.StickerSets stickerSets) {
        if (!this.f8476p0) {
            ArrayList<C4817v6> arrayList = this.f8478r0;
            if ((arrayList == null || arrayList.isEmpty()) && stickerSets.sets.length > 0) {
                m34466rf(0, 20, 0);
            }
        }
    }

    @Override
    public void mo7577A4(C2099j jVar, C2104l lVar) {
        C2103k.m35586c(this, jVar, lVar);
    }

    @Override
    public void mo7576B1(C2099j jVar, C2104l lVar, boolean z) {
        this.f8475o0.m6151E0(lVar, z, this.f8474n0.getLayoutManager());
    }

    @Override
    public void mo25158B2(C4817v6 v6Var) {
        m34465sf(v6Var.m25182c());
    }

    @Override
    public void mo7568H1(C2099j jVar, C2104l lVar) {
        C2103k.m35588a(this, jVar, lVar);
    }

    @Override
    public void mo2038H4(int[] iArr, boolean z) {
    }

    @Override
    public void mo8867Ia() {
        super.mo8867Ia();
        View$OnClickListenerC10042e eVar = this.f8475o0;
        if (eVar != null) {
            eVar.m39313H();
        }
        C1399s0.m37171l0(this.f8474n0);
    }

    @Override
    public int mo407R9() {
        return R.id.controller_stickersTrending;
    }

    @Override
    public void mo2037U3(final TdApi.StickerSets stickerSets, int i) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                h30.this.m34467qf(stickerSets);
            }
        });
    }

    @Override
    public void mo7556U6(C2099j jVar, C2104l lVar) {
        C2103k.m35587b(this, jVar, lVar);
    }

    @Override
    public void mo33695X6(C2104l lVar, long j) {
        C6035e<Boolean> eVar = this.f8481u0;
        if (eVar == null) {
            this.f8481u0 = new C6035e<>();
        } else if (eVar.m21504g(j, Boolean.FALSE).booleanValue()) {
            return;
        }
        this.f8481u0.m21500k(j, Boolean.TRUE);
        this.f30167b.m2270r4().m14783o(new TdApi.GetStickerSet(j), this);
    }

    @Override
    public void mo2036Z(TdApi.StickerSetInfo stickerSetInfo) {
        final long j = stickerSetInfo.f25424id;
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                h30.this.m34470nf(j);
            }
        });
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        C1399s0.m37162q(this.f8474n0);
        this.f30167b.m2781K9().m1786y0(this);
    }

    @Override
    public void mo2035d5(TdApi.StickerSet stickerSet) {
        C10965r1.m2045g(this, stickerSet);
    }

    @Override
    public boolean mo7547e1(C2099j jVar, int i, int i2) {
        return true;
    }

    @Override
    public void mo2034f6(TdApi.StickerSetInfo stickerSetInfo) {
        final long j = stickerSetInfo.f25424id;
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                h30.this.m34468pf(j);
            }
        });
    }

    public final void m34478ff(ArrayList<C4817v6> arrayList, ArrayList<View$OnClickListenerC10042e.C10044b> arrayList2, int i, int i2) {
        if (i == 0 || (this.f8476p0 && i == this.f8478r0.size())) {
            if (arrayList != null) {
                if (i == 0) {
                    this.f8478r0.clear();
                }
                this.f8478r0.addAll(arrayList);
            }
            this.f8477q0 = arrayList != null && !arrayList.isEmpty();
            if (i == 0) {
                this.f8475o0.m6155B0(arrayList2);
            } else {
                this.f8475o0.m6139d0(arrayList2);
            }
            this.f8476p0 = false;
        }
    }

    @Override
    public long getStickerOutputChatId() {
        return 0L;
    }

    @Override
    public int getStickersListTop() {
        return C1399s0.m37154u(this.f8474n0)[1];
    }

    @Override
    public int getViewportHeight() {
        return -1;
    }

    public final void m34477gf(TdApi.StickerSet stickerSet) {
        this.f8481u0.m21499l(stickerSet.f25423id);
        ArrayList<C4817v6> arrayList = this.f8478r0;
        if (arrayList != null) {
            Iterator<C4817v6> it = arrayList.iterator();
            while (it.hasNext()) {
                C4817v6 next = it.next();
                if (next.m25182c() == stickerSet.f25423id) {
                    next.m25189F(stickerSet);
                    int a = next.m25184a();
                    int k = next.m25174k() + 1 + next.m25184a();
                    while (a < Math.min(stickerSet.stickers.length - next.m25184a(), next.m25184a() + 4)) {
                        C2104l lVar = this.f8475o0.m6136g0(k).f32683b;
                        if (lVar != null) {
                            TdApi.Sticker sticker = stickerSet.stickers[a];
                            lVar.m35563u(this.f30167b, sticker, sticker.type, stickerSet.emojis[a].emojis);
                        }
                        RecyclerView recyclerView = this.f8474n0;
                        View C = recyclerView != null ? recyclerView.getLayoutManager().mo39262C(k) : null;
                        if (C == null || !(C instanceof C2099j)) {
                            this.f8475o0.m39312I(k);
                        } else {
                            ((C2099j) C).m35594r();
                        }
                        a++;
                        k++;
                    }
                    return;
                }
            }
        }
    }

    public final int m34476hf(long j) {
        ArrayList<C4817v6> arrayList = this.f8478r0;
        if (arrayList == null) {
            return -1;
        }
        int i = 0;
        Iterator<C4817v6> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().m25182c() == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public boolean m34475if() {
        return !this.f8476p0;
    }

    @Override
    public void mo2033j3(int[] iArr) {
    }

    @Override
    public void mo2032k(long[] jArr, boolean z) {
        final C6035e eVar = new C6035e(jArr.length);
        for (long j : jArr) {
            eVar.m21500k(j, null);
        }
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                h30.this.m34472lf(eVar);
            }
        });
    }

    @Override
    public boolean mo7542k4(C2099j jVar, View view, C2104l lVar, boolean z, boolean z2, TdApi.MessageSchedulingState messageSchedulingState) {
        ArrayList<C4817v6> arrayList;
        int hf = m34476hf(lVar.m35573k());
        if (hf == -1 || (arrayList = this.f8478r0) == null) {
            return false;
        }
        if (z) {
            x00 x00Var = new x00(this.f30165a, this.f30167b);
            x00Var.m30994Vi(new x00.C3281m(lVar.m35574j()));
            x00Var.m30960ej();
            return true;
        }
        arrayList.get(hf).m25187H(this);
        return true;
    }

    @Override
    public View mo403oc(Context context) {
        View$OnClickListenerC10042e eVar = new View$OnClickListenerC10042e(this, this, true, this);
        this.f8475o0 = eVar;
        eVar.m6118z0();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 5);
        gridLayoutManager.m39585e3(new C2470a());
        RecyclerView recyclerView = (RecyclerView) C1399s0.m37146y(mo4347s(), R.layout.recycler, null);
        this.f8474n0 = recyclerView;
        C1399s0.m37171l0(recyclerView);
        this.f8474n0.setItemAnimator(null);
        this.f8474n0.setLayoutManager(gridLayoutManager);
        this.f8474n0.setAdapter(this.f8475o0);
        C10192g.m5782i(this.f8474n0, R.id.theme_color_filling, this);
        this.f8474n0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        this.f8475o0.m6154C0(this.f8474n0.getLayoutManager());
        this.f8475o0.m6156A0(new View$OnClickListenerC10042e.C10044b(5));
        this.f8474n0.m39422k(new C2471b());
        this.f30167b.m2781K9().m1838l0(this);
        m34466rf(0, 20, 0);
        return this.f8474n0;
    }

    public final void m34466rf(final int i, int i2, final int i3) {
        if (!this.f8476p0) {
            this.f8476p0 = true;
            this.f30167b.m2270r4().m14783o(new TdApi.GetTrendingStickerSets(i, i2), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    h30.this.m34473kf(i3, i, object);
                }
            });
        }
    }

    public final void m34465sf(long j) {
        C6035e<Boolean> eVar = this.f8479s0;
        if (eVar == null) {
            this.f8479s0 = new C6035e<>();
        } else if (eVar.m21503h(j) >= 0) {
            return;
        }
        this.f8479s0.m21500k(j, Boolean.TRUE);
        AbstractRunnableC5910b bVar = this.f8480t0;
        if (bVar != null) {
            bVar.m21857c();
        }
        C2472c cVar = new C2472c();
        this.f8480t0 = cVar;
        C1379j0.m37332e0(cVar, 750L);
    }

    @Override
    public void mo255t2(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1816236758) {
            final TdApi.StickerSet stickerSet = (TdApi.StickerSet) object;
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    h30.this.m34471mf(stickerSet);
                }
            });
        } else if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        }
    }

    @Override
    public boolean mo7534v0(C2099j jVar) {
        return true;
    }

    @Override
    public void mo2031y0(TdApi.StickerSetInfo stickerSetInfo) {
        final long j = stickerSetInfo.f25424id;
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                h30.this.m34469of(j);
            }
        });
    }
}
