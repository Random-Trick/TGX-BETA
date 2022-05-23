package de;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.j0;
import ce.p0;
import dd.j;
import dd.k;
import dd.l;
import de.y00;
import hd.v6;
import java.util.ArrayList;
import java.util.Iterator;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import ud.v4;
import xc.e;
import yd.g;
import zd.o6;
import zd.p1;
import zd.q1;

public class i30 extends v4<Void> implements j.c, Client.g, l.a, q1, v6.a {
    public RecyclerView f8242n0;
    public e f8243o0;
    public boolean f8244p0;
    public boolean f8245q0;
    public final ArrayList<v6> f8246r0 = new ArrayList<>();
    public k0.e<Boolean> f8247s0;
    public kb.b f8248t0;
    public k0.e<Boolean> f8249u0;

    public class a extends GridLayoutManager.b {
        public a() {
        }

        @Override
        public int f(int i10) {
            return i30.this.f8243o0.F(i10) == 0 ? 1 : 5;
        }
    }

    public class b extends RecyclerView.t {
        public b() {
        }

        @Override
        public void b(RecyclerView recyclerView, int i10, int i11) {
            int a22;
            int indexOf;
            if (!i30.this.f8244p0 && i30.this.f8245q0 && (a22 = ((LinearLayoutManager) recyclerView.getLayoutManager()).a2()) != -1 && (indexOf = i30.this.f8246r0.indexOf(i30.this.f8243o0.f0(a22).f26230c)) != -1 && indexOf + 5 >= i30.this.f8246r0.size()) {
                i30 i30Var = i30.this;
                i30Var.rf(i30Var.f8246r0.size(), 25, i30.this.f8243o0.D());
            }
        }
    }

    public class c extends kb.b {
        public c() {
        }

        @Override
        public void b() {
            if (i30.this.f8247s0 != null && i30.this.f8247s0.p() > 0) {
                int p10 = i30.this.f8247s0.p();
                long[] jArr = new long[p10];
                for (int i10 = 0; i10 < p10; i10++) {
                    jArr[i10] = i30.this.f8247s0.j(i10);
                }
                i30.this.f8247s0.b();
                i30.this.f24495b.v4().o(new TdApi.ViewTrendingStickerSets(jArr), i30.this.f24495b.na());
            }
        }
    }

    public i30(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void jf(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        if (!Sa()) {
            ff(arrayList, arrayList2, i10, i11);
            Z9().n9();
        }
    }

    public void kf(final int i10, final int i11, TdApi.Object object) {
        ArrayList arrayList;
        int constructor = object.getConstructor();
        if (constructor == -1883828812) {
            final ArrayList arrayList2 = new ArrayList();
            TdApi.StickerSetInfo[] stickerSetInfoArr = ((TdApi.StickerSets) object).sets;
            if (stickerSetInfoArr.length > 0) {
                arrayList = new ArrayList(stickerSetInfoArr.length);
                n9.Ng(this.f24495b, arrayList, arrayList2, i10, stickerSetInfoArr, this, this, true);
            } else {
                arrayList = null;
                if (i11 == 0) {
                    arrayList2.add(new e.b(6));
                }
            }
            final ArrayList arrayList3 = arrayList;
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    i30.this.jf(arrayList3, arrayList2, i11, i10);
                }
            });
        } else if (constructor == -1679978726) {
            j0.t0(object);
        }
    }

    public void lf(k0.e eVar) {
        ArrayList<v6> arrayList;
        if (!Sa() && !this.f8244p0 && (arrayList = this.f8246r0) != null) {
            Iterator<v6> it = arrayList.iterator();
            while (it.hasNext()) {
                v6 next = it.next();
                if (eVar.h(next.c()) >= 0) {
                    next.y();
                    this.f8243o0.D0(next);
                } else {
                    next.A();
                    this.f8243o0.D0(next);
                }
            }
        }
    }

    public void mf(TdApi.StickerSet stickerSet) {
        if (!Sa()) {
            gf(stickerSet);
        }
    }

    public void nf(long j10) {
        ArrayList<v6> arrayList;
        if (!Sa() && !this.f8244p0 && (arrayList = this.f8246r0) != null) {
            Iterator<v6> it = arrayList.iterator();
            while (it.hasNext()) {
                v6 next = it.next();
                if (j10 == next.c()) {
                    next.w();
                    this.f8243o0.D0(next);
                    return;
                }
            }
        }
    }

    public void of(long j10) {
        ArrayList<v6> arrayList;
        if (!Sa() && !this.f8244p0 && (arrayList = this.f8246r0) != null) {
            Iterator<v6> it = arrayList.iterator();
            while (it.hasNext()) {
                v6 next = it.next();
                if (j10 == next.c()) {
                    next.y();
                    this.f8243o0.D0(next);
                    return;
                }
            }
        }
    }

    public void pf(long j10) {
        ArrayList<v6> arrayList;
        if (!Sa() && !this.f8244p0 && (arrayList = this.f8246r0) != null) {
            Iterator<v6> it = arrayList.iterator();
            while (it.hasNext()) {
                v6 next = it.next();
                if (j10 == next.c()) {
                    next.A();
                    next.z();
                    this.f8243o0.D0(next);
                    return;
                }
            }
        }
    }

    public void qf(TdApi.StickerSets stickerSets) {
        if (!this.f8244p0) {
            ArrayList<v6> arrayList = this.f8246r0;
            if ((arrayList == null || arrayList.isEmpty()) && stickerSets.sets.length > 0) {
                rf(0, 20, 0);
            }
        }
    }

    @Override
    public void E5(j jVar, l lVar, boolean z10) {
        this.f8243o0.C0(lVar, z10, this.f8242n0.getLayoutManager());
    }

    @Override
    public void Ia() {
        super.Ia();
        e eVar = this.f8243o0;
        if (eVar != null) {
            eVar.H();
        }
        p0.e0(this.f8242n0);
    }

    @Override
    public void J1(j jVar, l lVar) {
        k.c(this, jVar, lVar);
    }

    @Override
    public void M3(final TdApi.StickerSets stickerSets, int i10) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                i30.this.qf(stickerSets);
            }
        });
    }

    @Override
    public boolean Q1(j jVar) {
        return true;
    }

    @Override
    public int R9() {
        return R.id.controller_stickersTrending;
    }

    @Override
    public boolean W2(j jVar, View view, l lVar, boolean z10, boolean z11, TdApi.MessageSchedulingState messageSchedulingState) {
        ArrayList<v6> arrayList;
        int hf = hf(lVar.k());
        if (hf == -1 || (arrayList = this.f8246r0) == null) {
            return false;
        }
        if (z10) {
            y00 y00Var = new y00(this.f24493a, this.f24495b);
            y00Var.Vi(new y00.m(lVar.j()));
            y00Var.ej();
            return true;
        }
        arrayList.get(hf).H(this);
        return true;
    }

    @Override
    public void Y4(TdApi.StickerSet stickerSet) {
        p1.g(this, stickerSet);
    }

    @Override
    public void Z(TdApi.StickerSetInfo stickerSetInfo) {
        final long j10 = stickerSetInfo.f19964id;
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                i30.this.nf(j10);
            }
        });
    }

    @Override
    public void Z2(int[] iArr) {
    }

    @Override
    public void Z8() {
        super.Z8();
        p0.n(this.f8242n0);
        this.f24495b.O9().y0(this);
    }

    @Override
    public void e6(TdApi.StickerSetInfo stickerSetInfo) {
        final long j10 = stickerSetInfo.f19964id;
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                i30.this.pf(j10);
            }
        });
    }

    public final void ff(ArrayList<v6> arrayList, ArrayList<e.b> arrayList2, int i10, int i11) {
        if (i10 == 0 || (this.f8244p0 && i10 == this.f8246r0.size())) {
            if (arrayList != null) {
                if (i10 == 0) {
                    this.f8246r0.clear();
                }
                this.f8246r0.addAll(arrayList);
            }
            this.f8245q0 = arrayList != null && !arrayList.isEmpty();
            if (i10 == 0) {
                this.f8243o0.z0(arrayList2);
            } else {
                this.f8243o0.c0(arrayList2);
            }
            this.f8244p0 = false;
        }
    }

    @Override
    public void g2(v6 v6Var) {
        sf(v6Var.c());
    }

    @Override
    public boolean g4(j jVar, int i10, int i11) {
        return true;
    }

    @Override
    public long getStickerOutputChatId() {
        return 0L;
    }

    @Override
    public int getStickersListTop() {
        return p0.r(this.f8242n0)[1];
    }

    @Override
    public int getViewportHeight() {
        return -1;
    }

    public final void gf(TdApi.StickerSet stickerSet) {
        this.f8249u0.l(stickerSet.f19963id);
        ArrayList<v6> arrayList = this.f8246r0;
        if (arrayList != null) {
            Iterator<v6> it = arrayList.iterator();
            while (it.hasNext()) {
                v6 next = it.next();
                if (next.c() == stickerSet.f19963id) {
                    next.F(stickerSet);
                    int a10 = next.a();
                    int k10 = next.k() + 1 + next.a();
                    while (a10 < Math.min(stickerSet.stickers.length - next.a(), next.a() + 4)) {
                        l lVar = this.f8243o0.f0(k10).f26229b;
                        if (lVar != null) {
                            TdApi.Sticker sticker = stickerSet.stickers[a10];
                            lVar.u(this.f24495b, sticker, sticker.type, stickerSet.emojis[a10].emojis);
                        }
                        RecyclerView recyclerView = this.f8242n0;
                        View C = recyclerView != null ? recyclerView.getLayoutManager().C(k10) : null;
                        if (C == null || !(C instanceof j)) {
                            this.f8243o0.I(k10);
                        } else {
                            ((j) C).r();
                        }
                        a10++;
                        k10++;
                    }
                    return;
                }
            }
        }
    }

    @Override
    public void h(long[] jArr, boolean z10) {
        final k0.e eVar = new k0.e(jArr.length);
        for (long j10 : jArr) {
            eVar.k(j10, null);
        }
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                i30.this.lf(eVar);
            }
        });
    }

    public final int hf(long j10) {
        ArrayList<v6> arrayList = this.f8246r0;
        if (arrayList == null) {
            return -1;
        }
        int i10 = 0;
        Iterator<v6> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().c() == j10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public boolean m4if() {
        return !this.f8244p0;
    }

    @Override
    public void j5(j jVar, l lVar) {
        k.a(this, jVar, lVar);
    }

    @Override
    public void n3(l lVar, long j10) {
        k0.e<Boolean> eVar = this.f8249u0;
        if (eVar == null) {
            this.f8249u0 = new k0.e<>();
        } else if (eVar.g(j10, Boolean.FALSE).booleanValue()) {
            return;
        }
        this.f8249u0.k(j10, Boolean.TRUE);
        this.f24495b.v4().o(new TdApi.GetStickerSet(j10), this);
    }

    @Override
    public View oc(Context context) {
        e eVar = new e(this, this, true, this);
        this.f8243o0 = eVar;
        eVar.x0();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 5);
        gridLayoutManager.e3(new a());
        RecyclerView recyclerView = (RecyclerView) p0.v(t(), R.layout.recycler, null);
        this.f8242n0 = recyclerView;
        p0.e0(recyclerView);
        this.f8242n0.setItemAnimator(null);
        this.f8242n0.setLayoutManager(gridLayoutManager);
        this.f8242n0.setAdapter(this.f8243o0);
        g.i(this.f8242n0, R.id.theme_color_filling, this);
        this.f8242n0.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        this.f8243o0.A0(this.f8242n0.getLayoutManager());
        this.f8243o0.y0(new e.b(5));
        this.f8242n0.k(new b());
        this.f24495b.O9().l0(this);
        rf(0, 20, 0);
        return this.f8242n0;
    }

    @Override
    public void r2(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1816236758) {
            final TdApi.StickerSet stickerSet = (TdApi.StickerSet) object;
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    i30.this.mf(stickerSet);
                }
            });
        } else if (constructor == -1679978726) {
            j0.t0(object);
        }
    }

    public final void rf(final int i10, int i11, final int i12) {
        if (!this.f8244p0) {
            this.f8244p0 = true;
            this.f24495b.v4().o(new TdApi.GetTrendingStickerSets(i10, i11), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    i30.this.kf(i12, i10, object);
                }
            });
        }
    }

    public final void sf(long j10) {
        k0.e<Boolean> eVar = this.f8247s0;
        if (eVar == null) {
            this.f8247s0 = new k0.e<>();
        } else if (eVar.h(j10) >= 0) {
            return;
        }
        this.f8247s0.k(j10, Boolean.TRUE);
        kb.b bVar = this.f8248t0;
        if (bVar != null) {
            bVar.c();
        }
        c cVar = new c();
        this.f8248t0 = cVar;
        j0.e0(cVar, 750L);
    }

    @Override
    public void w2(j jVar, l lVar) {
        k.b(this, jVar, lVar);
    }

    @Override
    public void y0(TdApi.StickerSetInfo stickerSetInfo) {
        final long j10 = stickerSetInfo.f19964id;
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                i30.this.of(j10);
            }
        });
    }

    @Override
    public void z4(int[] iArr, boolean z10) {
    }
}
