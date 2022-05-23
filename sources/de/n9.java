package de;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.j0;
import ce.p0;
import dd.j;
import dd.l;
import de.n9;
import eb.k;
import gb.c;
import gd.w;
import hd.e3;
import hd.t2;
import hd.v6;
import ie.g0;
import ie.h0;
import ie.u0;
import java.util.ArrayList;
import java.util.Iterator;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.m1;
import ne.z0;
import od.o;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import org.thunderdog.challegram.v.NewFlowLayoutManager;
import org.thunderdog.challegram.v.RtlGridLayoutManager;
import ud.v4;
import xc.b;
import xc.e;
import zd.o6;
import zd.p1;
import zd.q1;

public class n9 extends v4<z0> implements Client.g, j.c, q1, zd.b, l.a, k.b, b.a, v6.a, c.a, m1.e {
    public int A0;
    public v6 B0;
    public int C0;
    public boolean D0;
    public ArrayList<long[]> E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public int I0;
    public int[] J0;
    public boolean K0;
    public int[] L0;
    public boolean M0;
    public TdApi.StickerSets N0;
    public jb.g O0;
    public boolean P0;
    public long Q0;
    public boolean R0;
    public eb.k S0;
    public k0.e<Boolean> T0;
    public kb.b U0;
    public ArrayList<v6> V0;
    public TdApi.Sticker[] W0;
    public TdApi.Sticker[] X0;
    public boolean Y0;
    public ArrayList<e3> Z0;
    public View f8824a1;
    public int f8825b1;
    public View f8826c1;
    public boolean f8827d1;
    public eb.k f8828e1;
    public float f8829f1;
    public int f8830n0;
    public FrameLayoutFix f8831o0;
    public xc.e f8832p0;
    public xc.e f8833q0;
    public xc.b f8834r0;
    public CustomRecyclerView f8835s0;
    public RecyclerView f8836t0;
    public RecyclerView f8837u0;
    public final ArrayList<v6> f8838v0 = new ArrayList<>();
    public boolean f8839w0;
    public boolean f8840x0;
    public int f8841y0;
    public v6 f8842z0;

    public class a implements Client.g {
        public final int[] f8843a;
        public final int f8844b;
        public final long[] f8845c;

        public a(int[] iArr, int i10, long[] jArr) {
            this.f8843a = iArr;
            this.f8844b = i10;
            this.f8845c = jArr;
        }

        public void c(v6 v6Var, ArrayList arrayList, int i10) {
            if (!n9.this.Sa()) {
                n9 n9Var = n9.this;
                n9Var.Ef(v6Var, arrayList, i10 + n9Var.eg());
            }
        }

        public void d() {
            if (!n9.this.Sa()) {
                n9.this.ah(false);
            }
        }

        @Override
        public void r2(TdApi.Object object) {
            if (object.getConstructor() == -1816236758) {
                TdApi.StickerSet stickerSet = (TdApi.StickerSet) object;
                final v6 v6Var = new v6(n9.this.f24495b, stickerSet);
                TdApi.Sticker[] stickerArr = stickerSet.stickers;
                int[] iArr = this.f8843a;
                final int i10 = iArr[1];
                iArr[1] = i10 + 1;
                final ArrayList arrayList = new ArrayList(stickerArr.length + 1);
                arrayList.add(new e.b(2, v6Var));
                int i11 = 0;
                for (TdApi.Sticker sticker : stickerArr) {
                    arrayList.add(new e.b(0, new dd.l(n9.this.f24495b, sticker, sticker.type, stickerSet.emojis[i11].emojis)));
                    i11++;
                }
                n9.this.f24495b.hd().post(new Runnable() {
                    @Override
                    public final void run() {
                        n9.a.this.c(v6Var, arrayList, i10);
                    }
                });
            }
            int[] iArr2 = this.f8843a;
            int i12 = iArr2[0] + 1;
            iArr2[0] = i12;
            if (i12 < this.f8844b) {
                n9.this.f24495b.v4().o(new TdApi.GetStickerSet(this.f8845c[this.f8843a[0]]), this);
            } else {
                n9.this.f24495b.hd().post(new Runnable() {
                    @Override
                    public final void run() {
                        n9.a.this.d();
                    }
                });
            }
        }
    }

    public class b implements k.b {
        public final int f8846a;
        public final int[] f8847b;

        public b(int i10, int[] iArr) {
            this.f8846a = i10;
            this.f8847b = iArr;
        }

        @Override
        public void n4(int i10, float f10, float f11, eb.k kVar) {
            int i11 = (int) (this.f8846a * f10);
            n9.this.f8835s0.scrollBy(0, i11 - this.f8847b[0]);
            this.f8847b[0] = i11;
        }

        @Override
        public void o4(int i10, float f10, eb.k kVar) {
            n9.this.f8835s0.setScrollDisabled(false);
            n9.this.dh(false, 0L);
            if (n9.this.w9() != null) {
                n9.this.w9().setIgnoreMovement(false);
            }
        }
    }

    public class c extends kb.b {
        public c() {
        }

        @Override
        public void b() {
            if (n9.this.T0 != null && n9.this.T0.p() > 0) {
                int p10 = n9.this.T0.p();
                long[] jArr = new long[p10];
                for (int i10 = 0; i10 < p10; i10++) {
                    jArr[i10] = n9.this.T0.j(i10);
                }
                n9.this.T0.b();
                n9.this.f24495b.v4().o(new TdApi.ViewTrendingStickerSets(jArr), n9.this.f24495b.na());
            }
        }
    }

    public class d extends FrameLayoutFix {
        public d(Context context) {
            super(context);
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            n9.this.oh();
        }
    }

    public class e extends GridLayoutManager.b {
        public e() {
        }

        @Override
        public int f(int i10) {
            if (n9.this.f8832p0.F(i10) == 0) {
                return 1;
            }
            return n9.this.f8841y0;
        }
    }

    public class f extends RecyclerView.t {
        public f() {
        }

        @Override
        public void a(RecyclerView recyclerView, int i10) {
            if ((n9.this.f8828e1 == null || n9.this.f8828e1.o() == 0.0f) && n9.this.f8830n0 == 0 && n9.this.w9() != null) {
                boolean z10 = true;
                if (n9.this.w9().getCurrentItem() == 1) {
                    if (!(i10 == 1 || i10 == 2)) {
                        z10 = false;
                    }
                    n9.this.w9().setIsScrolling(z10);
                }
            }
        }

        @Override
        public void b(RecyclerView recyclerView, int i10, int i11) {
            n9.this.Mg(false);
        }
    }

    public class g extends NewFlowLayoutManager {
        public NewFlowLayoutManager.a V = new NewFlowLayoutManager.a();

        public g(Context context, int i10) {
            super(context, i10);
        }

        @Override
        public NewFlowLayoutManager.a l3(int i10) {
            e3 b02 = n9.this.f8834r0.b0(i10);
            this.V.f20174a = b02.f();
            this.V.f20175b = b02.e();
            NewFlowLayoutManager.a aVar = this.V;
            if (aVar.f20174a == 0.0f) {
                aVar.f20174a = 100.0f;
            }
            if (aVar.f20175b == 0.0f) {
                aVar.f20175b = 100.0f;
            }
            return aVar;
        }
    }

    public class h extends GridLayoutManager.b {
        public final NewFlowLayoutManager f8851e;

        public h(NewFlowLayoutManager newFlowLayoutManager) {
            this.f8851e = newFlowLayoutManager;
        }

        @Override
        public int f(int i10) {
            return this.f8851e.m3(i10);
        }
    }

    public class i extends RecyclerView.t {
        public i() {
        }

        @Override
        public void a(RecyclerView recyclerView, int i10) {
            if (n9.this.f8828e1 == null || n9.this.f8828e1.o() == 0.0f) {
                boolean z10 = true;
                if (n9.this.f8830n0 == 1 && n9.this.w9() != null && n9.this.w9().getCurrentItem() == 1) {
                    if (!(i10 == 1 || i10 == 2)) {
                        z10 = false;
                    }
                    n9.this.w9().setIsScrolling(z10);
                }
            }
        }

        @Override
        public void b(RecyclerView recyclerView, int i10, int i11) {
            if ((n9.this.f8828e1 == null || n9.this.f8828e1.o() == 0.0f) && n9.this.f8830n0 == 1 && n9.this.w9() != null && n9.this.w9().getCurrentItem() == 1) {
                n9.this.w9().l2(n9.this.Yf());
            }
        }
    }

    public class j extends RecyclerView.o {
        public final NewFlowLayoutManager f8854a;

        public j(NewFlowLayoutManager newFlowLayoutManager) {
            this.f8854a = newFlowLayoutManager;
        }

        @Override
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            int k02 = recyclerView.k0(view);
            int i10 = 0;
            rect.top = this.f8854a.n3(k02) ? a0.i(4.0f) + z0.getHeaderSize() : 0;
            if (!this.f8854a.o3(k02)) {
                i10 = a0.i(3.0f);
            }
            rect.right = i10;
            rect.bottom = a0.i(3.0f);
        }
    }

    public class k extends GridLayoutManager.b {
        public k() {
        }

        @Override
        public int f(int i10) {
            return n9.this.f8833q0.F(i10) == 0 ? 1 : 5;
        }
    }

    public class l extends RecyclerView.t {
        public l() {
        }

        @Override
        public void a(RecyclerView recyclerView, int i10) {
            if ((n9.this.f8828e1 == null || n9.this.f8828e1.o() == 0.0f) && n9.this.f8830n0 == 2 && n9.this.w9() != null) {
                boolean z10 = true;
                if (n9.this.w9().getCurrentItem() == 1) {
                    if (!(i10 == 1 || i10 == 2)) {
                        z10 = false;
                    }
                    n9.this.w9().setIsScrolling(z10);
                }
            }
        }

        @Override
        public void b(RecyclerView recyclerView, int i10, int i11) {
            int a22;
            int indexOf;
            if ((n9.this.f8828e1 == null || n9.this.f8828e1.o() == 0.0f) && n9.this.f8830n0 == 2 && n9.this.w9() != null && n9.this.w9().getCurrentItem() == 1) {
                n9.this.w9().p2(n9.this.fg());
                if (!n9.this.f8839w0 && n9.this.f8840x0 && (a22 = ((LinearLayoutManager) recyclerView.getLayoutManager()).a2()) != -1 && (indexOf = n9.this.f8838v0.indexOf(n9.this.f8833q0.f0(a22).f26230c)) != -1 && indexOf + 5 >= n9.this.f8838v0.size()) {
                    n9 n9Var = n9.this;
                    n9Var.Jg(n9Var.f8838v0.size(), 25, n9.this.f8833q0.D());
                }
            }
        }
    }

    public n9(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void Ag() {
        if (!Sa() && this.f8836t0 != null) {
            Hg();
        }
    }

    public void Bg(TdApi.StickerSets stickerSets) {
        if (!Sa()) {
            if (w9() != null) {
                w9().setHasNewHots(gg(stickerSets.sets) > 0);
            }
            Wg(stickerSets);
        }
    }

    public void Cg(boolean z10, ArrayList arrayList, TdApi.Sticker[] stickerArr) {
        if (Sa()) {
            return;
        }
        if (z10) {
            if (this.G0) {
                this.G0 = false;
                if (arrayList != null) {
                    bh(stickerArr, arrayList);
                }
            }
        } else if (this.F0) {
            this.F0 = false;
            if (arrayList != null) {
                fh(stickerArr, arrayList);
            }
        }
    }

    public void Dg(TdApi.Object object) {
        Og(object, true);
    }

    public void Eg(TdApi.Object object) {
        Og(object, false);
    }

    public boolean Fg(TdApi.Animation animation, View view, int i10) {
        if (i10 != R.id.btn_deleteGif) {
            return true;
        }
        this.f8834r0.g0(animation.animation.f19913id);
        if (this.f8834r0.D() == 0) {
            mh();
        }
        this.f24495b.v4().o(new TdApi.RemoveSavedAnimation(new TdApi.InputFileId(animation.animation.f19913id)), this.f24495b.na());
        return true;
    }

    public void Gg() {
        if (w9() != null && this.f8830n0 == 0) {
            w9().L2(cg(), true, true);
            w9().z2(true);
        }
        this.I0--;
    }

    public static int Ng(o6 o6Var, ArrayList<v6> arrayList, ArrayList<e.b> arrayList2, int i10, TdApi.StickerSetInfo[] stickerSetInfoArr, l.a aVar, v6.a aVar2, boolean z10) {
        o6 o6Var2 = o6Var;
        ArrayList<v6> arrayList3 = arrayList;
        arrayList3.ensureCapacity(stickerSetInfoArr.length);
        boolean z11 = true;
        arrayList2.ensureCapacity(arrayList2.size() + (stickerSetInfoArr.length * 2) + 1);
        int size = i10 + arrayList2.size();
        int length = stickerSetInfoArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            TdApi.StickerSetInfo stickerSetInfo = stickerSetInfoArr[i11];
            if (!stickerSetInfo.isViewed) {
                i12++;
            }
            v6 v6Var = new v6(o6Var2, stickerSetInfo);
            v6Var.G(aVar2);
            v6Var.C();
            if (z10) {
                if (z11) {
                    z11 = false;
                } else {
                    arrayList2.add(new e.b(10));
                    size++;
                }
            }
            arrayList3.add(v6Var);
            v6Var.E(size);
            arrayList2.add(new e.b(7, v6Var));
            int i13 = 5;
            int i14 = 0;
            while (i14 < i13) {
                TdApi.Sticker[] stickerArr = stickerSetInfo.covers;
                dd.l lVar = new dd.l(o6Var2, i14 < stickerArr.length ? stickerArr[i14] : null, (String) null, stickerSetInfo.stickerType);
                lVar.B(stickerSetInfo.f19964id, null);
                lVar.v(aVar);
                lVar.z();
                arrayList2.add(new e.b(0, lVar));
                i14++;
                i13 = 5;
                o6Var2 = o6Var;
            }
            size += 6;
            i11++;
            o6Var2 = o6Var;
            arrayList3 = arrayList;
        }
        return i12;
    }

    public static int Of(int i10, int i11) {
        int min = Math.min(i10, i11) / 5;
        if (min == 0) {
            return 5;
        }
        return i10 / min;
    }

    public static int Xf() {
        return a0.g() / Of(a0.g(), a0.f());
    }

    public static int Zf(boolean z10) {
        return z10 ? 5 : 20;
    }

    public static int gg(TdApi.StickerSetInfo[] stickerSetInfoArr) {
        int i10 = 0;
        for (TdApi.StickerSetInfo stickerSetInfo : stickerSetInfoArr) {
            if (!stickerSetInfo.isViewed) {
                i10++;
            }
        }
        return i10;
    }

    public void sg(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        if (!Sa()) {
            Ff(arrayList, arrayList2, i10 > 0, i11);
        }
    }

    public void tg(final int i10, int i11, TdApi.Object object) {
        final int i12;
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        if (object.getConstructor() == -1883828812) {
            TdApi.StickerSetInfo[] stickerSetInfoArr = ((TdApi.StickerSets) object).sets;
            if (i10 == 0) {
                arrayList2.add(new e.b(3));
            }
            i12 = Ng(this.f24495b, arrayList, arrayList2, i11, stickerSetInfoArr, this, this, false);
        } else {
            if (i10 == 0) {
                arrayList2.add(new e.b(6));
            }
            i12 = 0;
        }
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                n9.this.sg(arrayList, arrayList2, i12, i10);
            }
        });
    }

    public void ug(int[] iArr) {
        if (!Sa() && !this.R0) {
            if (this.M0) {
                this.M0 = false;
                this.L0 = iArr;
                return;
            }
            Gf(iArr);
        }
    }

    public void vg(long[] jArr) {
        if (!Sa() && !this.R0) {
            Rf(jArr);
        }
    }

    public void wg(int[] iArr) {
        if (!Sa() && !this.R0) {
            if (this.K0) {
                this.K0 = false;
                this.J0 = iArr;
                return;
            }
            Hf(iArr);
        }
    }

    public void xg(ArrayList arrayList, TdApi.Sticker[] stickerArr, TdApi.Sticker[] stickerArr2, ArrayList arrayList2) {
        if (!Sa()) {
            boolean z10 = true;
            if (w9() != null) {
                w9().N2(arrayList, stickerArr.length > 0, stickerArr2.length > 0);
            }
            if (stickerArr.length <= 0) {
                z10 = false;
            }
            gh(z10);
            hh(arrayList, arrayList2);
        }
    }

    public void yg(TdApi.StickerSet stickerSet) {
        if (!Sa()) {
            Mf(stickerSet);
        }
    }

    public void zg(ArrayList arrayList) {
        if (!Sa()) {
            ch(arrayList);
        }
    }

    @Override
    public boolean B(float f10, float f11) {
        return true;
    }

    @Override
    public void B1(View view, TdApi.Animation animation) {
        Sg(animation);
    }

    @Override
    public void C(View view, float f10, float f11) {
        Zg(view, ((xc.a) view).getGif().a());
    }

    @Override
    public void C0(View view, TdApi.Animation animation) {
        Zg(view, animation);
    }

    @Override
    public void D1(int[] iArr) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                n9.this.Ag();
            }
        });
    }

    @Override
    public boolean E4() {
        return he.i.c2().p6();
    }

    @Override
    public void E5(dd.j jVar, dd.l lVar, boolean z10) {
        RecyclerView.p pVar = null;
        if (lVar.r()) {
            int mg = mg(lVar);
            if (mg != -1) {
                xc.e eVar = this.f8833q0;
                RecyclerView recyclerView = this.f8837u0;
                if (recyclerView != null) {
                    pVar = recyclerView.getLayoutManager();
                }
                eVar.B0(mg, z10, pVar);
                return;
            }
            return;
        }
        int ig = ig(lVar);
        if (ig != -1) {
            xc.e eVar2 = this.f8832p0;
            CustomRecyclerView customRecyclerView = this.f8835s0;
            if (customRecyclerView != null) {
                pVar = customRecyclerView.getLayoutManager();
            }
            eVar2.B0(ig, z10, pVar);
        }
    }

    public final void Ef(v6 v6Var, ArrayList<e.b> arrayList, int i10) {
        if (i10 >= 0 && i10 < this.V0.size()) {
            Nf();
            if (w9() != null) {
                w9().K1(i10, v6Var);
            }
            int k10 = this.V0.get(i10).k();
            this.V0.add(i10, v6Var);
            while (i10 < this.V0.size()) {
                v6 v6Var2 = this.V0.get(i10);
                v6Var2.E(k10);
                k10 += v6Var2.j() + 1;
                i10++;
            }
            this.f8832p0.d0(v6Var.k(), arrayList);
            Vg();
        }
    }

    public final void Ff(ArrayList<v6> arrayList, ArrayList<e.b> arrayList2, boolean z10, int i10) {
        if (i10 == 0 || (this.f8839w0 && i10 == this.f8838v0.size())) {
            if (arrayList != null) {
                if (i10 == 0) {
                    this.B0 = null;
                    this.f8838v0.clear();
                }
                this.f8838v0.addAll(arrayList);
            }
            this.f8840x0 = arrayList != null && !arrayList.isEmpty();
            if (w9() != null && (z10 || i10 == 0)) {
                w9().setHasNewHots(z10);
            }
            if (i10 == 0) {
                RecyclerView recyclerView = this.f8837u0;
                if (recyclerView != null) {
                    recyclerView.C1();
                    ((LinearLayoutManager) this.f8837u0.getLayoutManager()).z2(0, 0);
                }
                this.f8833q0.z0(arrayList2);
            } else {
                this.f8833q0.c0(arrayList2);
            }
            this.f8839w0 = false;
        }
    }

    @Override
    public void G(View view, float f10, float f11) {
        gb.b.h(this, view, f10, f11);
    }

    public final void Gf(int[] iArr) {
        Pg();
    }

    public final void Hf(int[] iArr) {
        Qg();
    }

    public final void Hg() {
        if (!this.Y0) {
            this.Y0 = true;
            this.f24495b.v4().o(new TdApi.GetSavedAnimations(), this);
        }
    }

    @Override
    public void Ia() {
        super.Ia();
        CustomRecyclerView customRecyclerView = this.f8835s0;
        if (customRecyclerView != null) {
            customRecyclerView.requestLayout();
        }
        xc.e eVar = this.f8833q0;
        if (eVar != null) {
            eVar.H();
        }
    }

    public void If() {
        int[] iArr = this.J0;
        if (iArr != null) {
            Hf(iArr);
            this.J0 = null;
        }
        TdApi.StickerSets stickerSets = this.N0;
        if (stickerSets != null) {
            Kf(stickerSets);
            this.N0 = null;
        }
    }

    public final void Ig() {
        if (!this.R0) {
            this.R0 = true;
            this.F0 = false;
            this.G0 = false;
            this.f24495b.v4().o(new TdApi.GetFavoriteStickers(), this);
        }
    }

    @Override
    public void J1(dd.j jVar, dd.l lVar) {
    }

    public final void Jf() {
        TdApi.StickerSets stickerSets = this.N0;
        if (stickerSets != null) {
            Kf(stickerSets);
            this.N0 = null;
        }
    }

    public final void Jg(final int i10, int i11, final int i12) {
        if (!this.f8839w0) {
            this.f8839w0 = true;
            this.f24495b.v4().o(new TdApi.GetTrendingStickerSets(i10, i11), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    n9.this.tg(i10, i12, object);
                }
            });
        }
    }

    public final void Kf(TdApi.StickerSets stickerSets) {
        boolean z10;
        if (stickerSets != null && !Sa() && !this.f8839w0) {
            ArrayList<v6> arrayList = this.f8838v0;
            boolean z11 = true;
            if (arrayList != null && arrayList.size() == stickerSets.sets.length && !this.f8838v0.isEmpty()) {
                Iterator<v6> it = this.f8838v0.iterator();
                int i10 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        z10 = true;
                        break;
                    }
                    v6 next = it.next();
                    if (next.c() != stickerSets.sets[i10].f19964id) {
                        z10 = false;
                        break;
                    }
                    boolean t10 = next.t();
                    TdApi.StickerSetInfo[] stickerSetInfoArr = stickerSets.sets;
                    boolean z12 = t10 != stickerSetInfoArr[i10].isViewed;
                    next.I(stickerSetInfoArr[i10]);
                    if (z12) {
                        this.f8833q0.F0(next);
                    }
                    i10++;
                }
                if (z10) {
                    return;
                }
            }
            ArrayList<e.b> arrayList2 = new ArrayList<>((stickerSets.sets.length * 2) + 1);
            ArrayList<v6> arrayList3 = new ArrayList<>(stickerSets.sets.length);
            arrayList2.add(new e.b(3));
            if (Ng(this.f24495b, arrayList3, arrayList2, 0, stickerSets.sets, this, this, false) <= 0) {
                z11 = false;
            }
            Ff(arrayList3, arrayList2, z11, 0);
        }
    }

    public final void Kg(int i10, int i11) {
        Nf();
        if (w9() != null) {
            w9().m2(i10, i11);
        }
        v6 remove = this.V0.remove(i10);
        int k10 = remove.k();
        int j10 = remove.j() + 1;
        int k11 = i10 < i11 ? k10 : this.V0.get(i11).k();
        this.V0.add(i11, remove);
        for (int min = Math.min(i10, i11); min < this.V0.size(); min++) {
            v6 v6Var = this.V0.get(min);
            v6Var.E(k11);
            k11 += v6Var.j() + 1;
        }
        this.f8832p0.q0(k10, j10, remove.k());
        Vg();
    }

    public final void Lf() {
        int i10;
        this.f8831o0.removeView(this.f8824a1);
        if (w9() != null) {
            int i11 = this.f8830n0;
            if (i11 == 1 && ((i10 = this.f8825b1) == 0 || i10 == 2)) {
                w9().setPreferredSection(0);
            } else if (this.f8825b1 == 1 && (i11 == 0 || i11 == 2)) {
                w9().setPreferredSection(1);
            }
        }
        if (this.f8830n0 == 2 && this.f8825b1 != 2) {
            Jf();
        }
        this.f8830n0 = this.f8825b1;
        this.f8824a1 = this.f8826c1;
        this.f8826c1 = null;
        this.f8828e1.l(0.0f);
        this.f8829f1 = 0.0f;
        if (w9() != null) {
            w9().y2();
        }
    }

    public boolean Lg() {
        return this.f8830n0 == 1 && Yf() == 0;
    }

    @Override
    public void M3(final TdApi.StickerSets stickerSets, int i10) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                n9.this.Bg(stickerSets);
            }
        });
    }

    public final void Mf(TdApi.StickerSet stickerSet) {
        ArrayList<v6> arrayList;
        int i10;
        int d10 = this.O0.d(stickerSet.f19963id);
        this.O0.c(stickerSet.f19963id);
        if (d10 != 0) {
            int length = stickerSet.stickers.length;
            if ((d10 & 1) != 0) {
                ArrayList<v6> arrayList2 = this.f8838v0;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    Iterator<v6> it = this.f8838v0.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        v6 next = it.next();
                        if (next.c() == stickerSet.f19963id) {
                            next.F(stickerSet);
                            int a10 = next.a();
                            int k10 = next.k() + 1 + next.a();
                            while (a10 < Math.min(stickerSet.stickers.length - next.a(), next.a() + 4)) {
                                e.b f02 = this.f8833q0.f0(k10);
                                dd.l lVar = f02.f26229b;
                                if (lVar != null) {
                                    TdApi.Sticker sticker = stickerSet.stickers[a10];
                                    lVar.u(this.f24495b, sticker, sticker.type, stickerSet.emojis[a10].emojis);
                                }
                                RecyclerView recyclerView = this.f8837u0;
                                View C = recyclerView != null ? recyclerView.getLayoutManager().C(k10) : null;
                                if (C == null || !(C instanceof dd.j) || C.getTag() != f02) {
                                    this.f8833q0.I(k10);
                                } else {
                                    ((dd.j) C).r();
                                }
                                a10++;
                                k10++;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            if (!((d10 & 2) == 0 || (arrayList = this.V0) == null || arrayList.isEmpty())) {
                Iterator<v6> it2 = this.V0.iterator();
                int i11 = 0;
                while (it2.hasNext()) {
                    v6 next2 = it2.next();
                    if (!next2.r() && next2.c() == stickerSet.f19963id) {
                        next2.F(stickerSet);
                        int j10 = next2.j();
                        if (j10 != length) {
                            if (length == 0) {
                                if (w9() != null) {
                                    w9().setIgnoreMovement(true);
                                }
                                this.V0.remove(i11);
                                if (this.V0.isEmpty()) {
                                    this.f8832p0.y0(new e.b(4));
                                } else {
                                    if (i11 != 0) {
                                        v6 v6Var = this.V0.get(i11 - 1);
                                        i10 = v6Var.k() + v6Var.j() + 1;
                                    } else {
                                        i10 = 1;
                                    }
                                    while (i11 < this.V0.size()) {
                                        v6 v6Var2 = this.V0.get(i11);
                                        v6Var2.E(i10);
                                        i10 += v6Var2.j() + 1;
                                        i11++;
                                    }
                                    this.f8832p0.w0(next2.k(), next2.j() + 1);
                                }
                                if (w9() != null) {
                                    w9().setIgnoreMovement(false);
                                    return;
                                }
                                return;
                            }
                            next2.D(length);
                            int k11 = next2.k() + length + 1;
                            for (int i12 = i11 + 1; i12 < this.V0.size(); i12++) {
                                v6 v6Var3 = this.V0.get(i12);
                                v6Var3.E(k11);
                                k11 += v6Var3.j() + 1;
                            }
                            if (length < j10) {
                                this.f8832p0.w0(next2.k() + 1 + length, j10 - length);
                            } else {
                                ArrayList<e.b> arrayList3 = new ArrayList<>(length - j10);
                                for (int i13 = j10; i13 < length; i13++) {
                                    TdApi.Sticker sticker2 = stickerSet.stickers[i13];
                                    dd.l lVar2 = new dd.l(this.f24495b, sticker2, sticker2.type, stickerSet.emojis[i13].emojis);
                                    lVar2.B(stickerSet.f19963id, stickerSet.emojis[i13].emojis);
                                    lVar2.v(this);
                                    arrayList3.add(new e.b(0, lVar2));
                                }
                                this.f8832p0.k0(next2.k() + 1 + j10, arrayList3);
                            }
                            if (w9() != null) {
                                w9().setIgnoreMovement(false);
                            }
                        }
                        int a11 = next2.a();
                        int k12 = next2.k() + 1 + next2.a();
                        while (a11 < stickerSet.stickers.length) {
                            e.b f03 = this.f8832p0.f0(k12);
                            TdApi.Sticker sticker3 = stickerSet.stickers[a11];
                            f03.f26229b.u(this.f24495b, sticker3, sticker3.type, stickerSet.emojis[a11].emojis);
                            CustomRecyclerView customRecyclerView = this.f8835s0;
                            View C2 = customRecyclerView != null ? customRecyclerView.getLayoutManager().C(k12) : null;
                            if (C2 == null || !(C2 instanceof dd.j)) {
                                this.f8832p0.I(k12);
                            } else {
                                ((dd.j) C2).r();
                            }
                            a11++;
                            k12++;
                        }
                        return;
                    }
                    i11++;
                }
            }
        }
    }

    public final void Mg(boolean z10) {
        if (this.I0 == 0) {
            eb.k kVar = this.f8828e1;
            if ((kVar == null || kVar.o() == 0.0f) && this.f8830n0 == 0 && w9() != null && w9().c2() && w9().getCurrentItem() == 1) {
                w9().p2(dg());
                w9().L2(cg(), true, true);
            }
        }
    }

    public final void Nf() {
        this.I0++;
    }

    public final void Og(TdApi.Object object, final boolean z10) {
        final TdApi.Sticker[] stickerArr;
        int Zf = Zf(z10);
        final ArrayList arrayList = null;
        if (object.getConstructor() == 1974859260) {
            stickerArr = ((TdApi.Stickers) object).stickers;
            if (stickerArr.length > Zf) {
                TdApi.Sticker[] stickerArr2 = new TdApi.Sticker[Zf];
                System.arraycopy(stickerArr, 0, stickerArr2, 0, Zf);
                stickerArr = stickerArr2;
            }
            ArrayList arrayList2 = new ArrayList(stickerArr.length);
            for (TdApi.Sticker sticker : stickerArr) {
                dd.l lVar = new dd.l(this.f24495b, sticker, (String) null, sticker.type);
                if (z10) {
                    lVar.x();
                } else {
                    lVar.y();
                }
                arrayList2.add(new e.b(0, lVar));
            }
            arrayList = arrayList2;
        } else {
            stickerArr = null;
        }
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                n9.this.Cg(z10, arrayList, stickerArr);
            }
        });
    }

    public final boolean Pf() {
        eb.k kVar = this.f8828e1;
        return kVar == null || (!kVar.v() && this.f8828e1.o() == 0.0f && this.f8829f1 == 0.0f);
    }

    public final void Pg() {
        if (!this.R0 && !this.G0) {
            this.G0 = true;
            this.f24495b.v4().o(new TdApi.GetFavoriteStickers(), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    n9.this.Dg(object);
                }
            });
        }
    }

    @Override
    public boolean Q1(dd.j jVar) {
        return false;
    }

    public final boolean Qf(int i10, View view, boolean z10, int i11) {
        int i12;
        boolean z11 = false;
        if (this.f8830n0 == i10 || !Pf()) {
            return false;
        }
        this.f8825b1 = i10;
        this.f8826c1 = view;
        this.f8827d1 = z10;
        this.f8831o0.addView(view);
        if (this.f8828e1 == null) {
            this.f8828e1 = new eb.k(0, this, db.b.f7287b, 180L);
        }
        this.f8828e1.i(1.0f);
        if (w9() != null) {
            if (w9().getCurrentItem() == 1) {
                int i13 = this.f8830n0;
                if (i13 == 1 && ((i12 = this.f8825b1) == 0 || i12 == 2)) {
                    w9().G2(false, false);
                } else if ((i13 == 0 || i13 == 2) && this.f8825b1 == 1) {
                    w9().G2(true, true);
                }
            }
            z0 w92 = w9();
            int i14 = this.f8825b1;
            if (i14 != 0) {
                i11 = i14 == 2 ? 2 : 1;
            } else if (i11 == -1) {
                i11 = cg();
            }
            if (this.f8825b1 == 0) {
                z11 = true;
            }
            w92.L2(i11, z11, true);
        }
        return true;
    }

    public final void Qg() {
        if (!this.R0 && !this.F0) {
            this.F0 = true;
            this.f24495b.v4().o(new TdApi.GetRecentStickers(false), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    n9.this.Eg(object);
                }
            });
        }
    }

    @Override
    public int R9() {
        return R.id.controller_emojiMedia;
    }

    public final void Rf(long[] jArr) {
        if (this.f8838v0 != null) {
            ph(jArr);
        }
        if (this.D0) {
            if (this.E0 == null) {
                this.E0 = new ArrayList<>();
            }
            this.E0.add(jArr);
        } else if (hg()) {
            Rg();
        } else {
            k0.e eVar = new k0.e(this.V0.size());
            Iterator<v6> it = this.V0.iterator();
            while (it.hasNext()) {
                v6 next = it.next();
                if (!next.r()) {
                    eVar.k(next.c(), next);
                }
            }
            k0.e eVar2 = null;
            jb.e eVar3 = null;
            boolean z10 = false;
            int i10 = 0;
            int i11 = 0;
            int i12 = -1;
            for (long j10 : jArr) {
                if (((v6) eVar.f(j10)) != null) {
                    eVar.l(j10);
                    if (eVar2 == null) {
                        eVar2 = new k0.e(5);
                    }
                    eVar2.k(j10, Integer.valueOf(i10));
                    i10++;
                } else if (!z10) {
                    i12++;
                    if (i11 != i12) {
                        z10 = true;
                    } else {
                        if (eVar3 == null) {
                            eVar3 = new jb.e(5);
                        }
                        eVar3.a(j10);
                    }
                }
                i11++;
            }
            int p10 = eVar.p();
            for (int i13 = 0; i13 < p10; i13++) {
                Ug((v6) eVar.q(i13));
            }
            if (eVar2 != null && !this.V0.isEmpty()) {
                for (int i14 = 0; i14 < eVar2.p(); i14++) {
                    long j11 = eVar2.j(i14);
                    int intValue = ((Integer) eVar2.q(i14)).intValue();
                    int lg = lg(j11);
                    if (lg != -1) {
                        if (lg != intValue) {
                            int eg = eg();
                            Kg(lg + eg, intValue + eg);
                        }
                    } else {
                        throw new RuntimeException();
                    }
                }
            }
            if (z10) {
                Rg();
            } else if (eVar3 != null) {
                ah(true);
                long[] g10 = eVar3.g();
                int[] iArr = new int[2];
                this.f24495b.v4().o(new TdApi.GetStickerSet(g10[iArr[0]]), new a(iArr, eVar3.l(), g10));
            }
        }
    }

    public final void Rg() {
        ArrayList<long[]> arrayList = this.E0;
        if (arrayList != null) {
            arrayList.clear();
        }
        Ig();
    }

    public void Sf() {
        int Of = Of(a0.g(), a0.f());
        if (this.f8841y0 != Of) {
            this.f8841y0 = Of;
            CustomRecyclerView customRecyclerView = this.f8835s0;
            if (customRecyclerView != null) {
                ((GridLayoutManager) customRecyclerView.getLayoutManager()).d3(Of);
            }
            RecyclerView recyclerView = this.f8836t0;
            if (recyclerView != null) {
                recyclerView.A0();
            }
        }
    }

    public final void Sg(final TdApi.Animation animation) {
        v4<?> F = t().Q1().F();
        if (F != null) {
            F.ee(w.i1(R.string.RemoveGifConfirm), new int[]{R.id.btn_deleteGif, R.id.btn_cancel}, new String[]{w.i1(R.string.Delete), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new h0() {
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
                    boolean Fg;
                    Fg = n9.this.Fg(animation, view, i10);
                    return Fg;
                }
            });
        }
    }

    public final int Tf() {
        ArrayList<v6> arrayList = this.V0;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        int i10 = 0;
        Iterator<v6> it = this.V0.iterator();
        while (it.hasNext()) {
            if (it.next().n()) {
                return i10;
            }
            i10++;
            if (i10 > 2) {
                return -1;
            }
        }
        return -1;
    }

    public void Tg() {
        fh(null, null);
    }

    @Override
    public void U2(View view, float f10, float f11) {
        gb.b.e(this, view, f10, f11);
    }

    @Override
    public void U4(View view, float f10, float f11) {
        gb.b.f(this, view, f10, f11);
    }

    public final int Uf() {
        ArrayList<v6> arrayList = this.V0;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        int i10 = 0;
        Iterator<v6> it = this.V0.iterator();
        while (it.hasNext()) {
            if (it.next().q()) {
                return i10;
            }
            i10++;
            if (i10 > 2) {
                return -1;
            }
        }
        return -1;
    }

    public final int Ug(v6 v6Var) {
        int indexOf = this.V0.indexOf(v6Var);
        if (indexOf != -1) {
            Nf();
            this.V0.remove(indexOf);
            if (w9() != null) {
                w9().t2(indexOf);
            }
            int k10 = v6Var.k();
            this.f8832p0.w0(k10, v6Var.j() + 1);
            for (int i10 = indexOf; i10 < this.V0.size(); i10++) {
                v6 v6Var2 = this.V0.get(i10);
                v6Var2.E(k10);
                k10 += v6Var2.j() + 1;
            }
            Vg();
        }
        return indexOf;
    }

    public int Vf() {
        int i10 = this.f8830n0;
        if (i10 == 0) {
            return dg();
        }
        if (i10 == 1) {
            return Yf();
        }
        if (i10 != 2) {
            return -1;
        }
        return fg();
    }

    public final void Vg() {
        if (w9() != null) {
            w9().z2(true);
        }
        j0.e0(new Runnable() {
            @Override
            public final void run() {
                n9.this.Gg();
            }
        }, 400L);
    }

    @Override
    public boolean W2(dd.j jVar, View view, dd.l lVar, boolean z10, boolean z11, TdApi.MessageSchedulingState messageSchedulingState) {
        if (lVar.r() && !z10) {
            int og = og(lVar.k());
            if (og == -1) {
                return false;
            }
            this.f8838v0.get(og).H(this);
            return true;
        } else if (w9() == null || !w9().E2(view, lVar, z11, messageSchedulingState)) {
            return false;
        } else {
            if (lVar.q()) {
                this.K0 = true;
            }
            return true;
        }
    }

    public float Wf() {
        if (this.f8830n0 == 1) {
            return Math.min(1.0f, Math.max(0.0f, Yf() / z0.getHeaderSize()));
        }
        return 0.0f;
    }

    public final void Wg(TdApi.StickerSets stickerSets) {
        if (this.f8830n0 == 2) {
            this.N0 = stickerSets;
            return;
        }
        this.N0 = null;
        Kf(stickerSets);
    }

    @Override
    public boolean X6(float f10, float f11) {
        return w9() != null;
    }

    public final void Xg(int i10, boolean z10) {
        int kg = kg(i10);
        if (kg != -1) {
            this.f8835s0.C1();
            int cg = cg();
            int i11 = 0;
            if (!z10 || w9() == null || Math.abs(kg - cg) > 8) {
                if (w9() != null) {
                    w9().setIgnoreMovement(true);
                }
                ((LinearLayoutManager) this.f8835s0.getLayoutManager()).z2(i10, i10 == 0 ? 0 : z0.getHeaderSize() + z0.getHeaderPadding());
                if (w9() != null) {
                    w9().setIgnoreMovement(false);
                    return;
                }
                return;
            }
            if (i10 != 0) {
                i11 = Math.max(0, (this.f8832p0.p0(i10, this.f8841y0, kg, this.V0) - z0.getHeaderSize()) - z0.getHeaderPadding());
            }
            int dg = i11 - dg();
            int[] iArr = new int[1];
            eb.k kVar = this.S0;
            if (kVar != null) {
                kVar.k();
            }
            this.f8835s0.setScrollDisabled(true);
            dh(true, this.V0.get(kg).c());
            if (w9() != null) {
                w9().setIgnoreMovement(true);
                w9().L2(kg, true, true);
            }
            eb.k kVar2 = new eb.k(0, new b(dg, iArr), db.b.f7287b, Math.min(450, Math.max(250, Math.abs(cg - kg) * 150)));
            this.S0 = kVar2;
            kVar2.i(1.0f);
        }
    }

    @Override
    public void Y4(TdApi.StickerSet stickerSet) {
        p1.g(this, stickerSet);
    }

    public final int Yf() {
        RecyclerView recyclerView = this.f8836t0;
        if (recyclerView == null) {
            return 0;
        }
        NewFlowLayoutManager newFlowLayoutManager = (NewFlowLayoutManager) recyclerView.getLayoutManager();
        if (newFlowLayoutManager.X1() != 0) {
            return z0.getHeaderSize();
        }
        View C = newFlowLayoutManager.C(0);
        if (C != null) {
            return -newFlowLayoutManager.U(C);
        }
        return 0;
    }

    public final void Yg(boolean z10) {
        int Tf = Tf();
        if (Tf == -1) {
            Tf = Uf();
        }
        if (Tf != -1) {
            Xg(Tf == 0 ? 0 : this.V0.get(Tf).k(), z10);
        }
    }

    @Override
    public void Z(TdApi.StickerSetInfo stickerSetInfo) {
        p1.d(this, stickerSetInfo);
    }

    @Override
    public void Z2(final int[] iArr) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                n9.this.ug(iArr);
            }
        });
    }

    @Override
    public void Z8() {
        super.Z8();
        this.f24495b.O9().o0(this);
    }

    public final void Zg(View view, TdApi.Animation animation) {
        if (w9() != null) {
            w9().D2(view, animation);
        }
    }

    @Override
    public void a7(m1.f fVar, int i10, Object obj) {
        if (i10 == R.id.btn_deleteGif) {
            Sg((TdApi.Animation) obj);
        } else if (i10 == R.id.btn_send) {
            Zg(fVar.A(), (TdApi.Animation) obj);
        }
    }

    public final int ag() {
        int Tf = Tf();
        if (Tf != -1) {
            return this.V0.get(Tf).b();
        }
        return 1;
    }

    public final void ah(boolean z10) {
        ArrayList<long[]> arrayList;
        if (this.D0 != z10) {
            this.D0 = z10;
            if (!z10 && (arrayList = this.E0) != null && !arrayList.isEmpty()) {
                do {
                    Rf(this.E0.remove(0));
                    if (this.E0.isEmpty()) {
                        return;
                    }
                } while (!this.D0);
            }
        }
    }

    public final int bg() {
        return this.H0 ? 2 : 1;
    }

    public final void bh(TdApi.Sticker[] stickerArr, ArrayList<e.b> arrayList) {
        v6 v6Var;
        if (w9() != null) {
            w9().setShowFavorite(stickerArr != null && stickerArr.length > 0);
        }
        gh(stickerArr != null && stickerArr.length > 0);
        int Tf = Tf();
        if (Tf != -1) {
            v6Var = this.V0.remove(Tf);
            ih(Tf, v6Var.k());
            this.f8832p0.w0(v6Var.k(), v6Var.e());
        } else if (stickerArr == null || stickerArr.length <= 0) {
            v6Var = null;
        } else {
            v6Var = new v6(this.f24495b, stickerArr);
            v6Var.x();
        }
        if (v6Var != null && stickerArr != null && stickerArr.length > 0 && arrayList != null) {
            v6Var.D(stickerArr.length);
            v6Var.E(1);
            this.V0.add(0, v6Var);
            ih(1, v6Var.b());
            this.f8832p0.k0(1, arrayList);
        }
    }

    public final int cg() {
        CustomRecyclerView customRecyclerView = this.f8835s0;
        if (customRecyclerView == null || this.f8841y0 == 0) {
            return -1;
        }
        int T1 = ((LinearLayoutManager) customRecyclerView.getLayoutManager()).T1();
        if (T1 == -1) {
            T1 = ((LinearLayoutManager) this.f8835s0.getLayoutManager()).X1();
        }
        if (T1 != -1) {
            return kg(T1);
        }
        return 0;
    }

    public final void ch(ArrayList<e3> arrayList) {
        this.Y0 = false;
        this.Z0 = arrayList;
        this.f8834r0.i0(arrayList);
        if (arrayList.isEmpty() && this.f8830n0 == 1) {
            mh();
        }
        this.f24495b.O9().Z(this);
    }

    public final int dg() {
        int X1;
        CustomRecyclerView customRecyclerView = this.f8835s0;
        int i10 = 0;
        if (customRecyclerView == null || this.f8841y0 == 0 || (X1 = ((LinearLayoutManager) customRecyclerView.getLayoutManager()).X1()) == -1) {
            return 0;
        }
        View C = this.f8835s0.getLayoutManager().C(X1);
        if (C != null) {
            i10 = -C.getTop();
        }
        return i10 + this.f8832p0.p0(X1, this.f8841y0, kg(X1), this.V0);
    }

    public final void dh(boolean z10, long j10) {
        CustomRecyclerView customRecyclerView;
        dd.l lVar;
        if (this.P0 != z10) {
            this.P0 = z10;
            this.Q0 = j10;
            if (!(z10 || (customRecyclerView = this.f8835s0) == null)) {
                int X1 = ((LinearLayoutManager) customRecyclerView.getLayoutManager()).X1();
                for (int a22 = ((LinearLayoutManager) this.f8835s0.getLayoutManager()).a2(); a22 >= X1; a22--) {
                    e.b f02 = this.f8832p0.f0(a22);
                    if (!(f02 == null || f02.f26228a != 0 || (lVar = f02.f26229b) == null)) {
                        lVar.t();
                    }
                }
            }
        }
    }

    @Override
    public void e6(TdApi.StickerSetInfo stickerSetInfo) {
        p1.f(this, stickerSetInfo);
    }

    public final int eg() {
        Iterator<v6> it = this.V0.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().r()) {
                i10++;
            }
        }
        return i10;
    }

    public final void eh(v6 v6Var, int i10) {
        this.f8842z0 = v6Var;
        this.A0 = i10;
    }

    public int fg() {
        int X1;
        RecyclerView recyclerView = this.f8837u0;
        int i10 = 0;
        if (recyclerView == null || (X1 = ((LinearLayoutManager) recyclerView.getLayoutManager()).X1()) == -1) {
            return 0;
        }
        View C = this.f8837u0.getLayoutManager().C(X1);
        if (C != null) {
            i10 = -C.getTop();
        }
        return i10 + this.f8833q0.p0(X1, 5, ng(X1), this.f8838v0);
    }

    public final void fh(TdApi.Sticker[] stickerArr, ArrayList<e.b> arrayList) {
        v6 v6Var;
        int i10 = 0;
        if (w9() != null) {
            w9().setShowRecents(stickerArr != null && stickerArr.length > 0);
        }
        int Uf = Uf();
        if (Uf != -1) {
            v6Var = this.V0.remove(Uf);
            ih(Uf, v6Var.k());
            this.f8832p0.w0(v6Var.k(), v6Var.e());
        } else if (stickerArr == null || stickerArr.length <= 0) {
            v6Var = null;
        } else {
            v6Var = new v6(this.f24495b, stickerArr);
            v6Var.B();
        }
        if (v6Var != null && stickerArr != null && stickerArr.length > 0 && arrayList != null) {
            arrayList.add(0, new e.b(bg(), v6Var));
            int ag = ag();
            v6Var.D(stickerArr.length);
            v6Var.E(ag);
            if (Tf() != -1) {
                i10 = 1;
            }
            this.V0.add(i10, v6Var);
            ih(i10 + 1, v6Var.b());
            this.f8832p0.k0(ag, arrayList);
        }
    }

    @Override
    public void g2(v6 v6Var) {
        qh(v6Var.c());
    }

    @Override
    public boolean g4(dd.j jVar, int i10, int i11) {
        return i11 > x9().getHeaderBottom();
    }

    @Override
    public long getLongPressDuration() {
        return gb.b.b(this);
    }

    @Override
    public long getStickerOutputChatId() {
        if (w9() != null) {
            return w9().S1();
        }
        return 0L;
    }

    @Override
    public int getStickersListTop() {
        return p0.r(this.f8830n0 == 2 ? this.f8837u0 : this.f8835s0)[1];
    }

    @Override
    public int getViewportHeight() {
        return -1;
    }

    public final void gh(boolean z10) {
        this.H0 = z10;
        int Uf = Uf();
        if (Uf != -1) {
            int k10 = this.V0.get(Uf).k();
            if (this.f8832p0.f0(k10).a(bg())) {
                this.f8832p0.I(k10);
            }
        }
    }

    @Override
    public void h(final long[] jArr, boolean z10) {
        if (!z10) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    n9.this.vg(jArr);
                }
            });
        }
    }

    public final boolean hg() {
        Iterator<v6> it = this.V0.iterator();
        while (it.hasNext()) {
            v6 next = it.next();
            if (!next.n() && !next.q()) {
                return false;
            }
        }
        return true;
    }

    public final void hh(ArrayList<v6> arrayList, ArrayList<e.b> arrayList2) {
        this.V0 = arrayList;
        this.R0 = false;
        this.f8842z0 = null;
        jb.g gVar = this.O0;
        if (gVar != null) {
            gVar.a();
        }
        this.f8832p0.z0(arrayList2);
        this.f24495b.O9().l0(this);
    }

    public final int ig(dd.l lVar) {
        ArrayList<v6> arrayList = this.V0;
        if (arrayList == null) {
            return -1;
        }
        Iterator<v6> it = arrayList.iterator();
        while (it.hasNext()) {
            v6 next = it.next();
            boolean n10 = next.n();
            boolean q10 = next.q();
            boolean o10 = lVar.o();
            boolean q11 = lVar.q();
            if ((n10 && o10) || ((q10 && q11) || (n10 == o10 && q10 == q11 && next.c() == lVar.k()))) {
                return this.f8832p0.j0(lVar, next.k());
            }
        }
        return -1;
    }

    public final void ih(int i10, int i11) {
        while (i10 < this.V0.size()) {
            v6 v6Var = this.V0.get(i10);
            v6Var.E(i11);
            i11 = v6Var.b();
            i10++;
        }
    }

    @Override
    public void j5(dd.j jVar, dd.l lVar) {
    }

    public final int jg(v6 v6Var) {
        ArrayList<v6> arrayList = this.V0;
        if (arrayList == null) {
            return -1;
        }
        Iterator<v6> it = arrayList.iterator();
        while (it.hasNext()) {
            if (v6Var.c() == it.next().c()) {
                return v6Var.k();
            }
        }
        return -1;
    }

    public boolean jh() {
        ArrayList<e3> arrayList;
        if (!Pf() || (arrayList = this.Z0) == null || arrayList.isEmpty()) {
            return false;
        }
        pg();
        return Qf(1, this.f8836t0, true, -1);
    }

    public final int kg(int i10) {
        int i11 = 0;
        if (i10 == 0) {
            return 0;
        }
        if (this.V0 == null) {
            return -1;
        }
        v6 v6Var = this.f8842z0;
        if (v6Var != null) {
            if (i10 >= v6Var.k() && i10 < this.f8842z0.b()) {
                return this.A0;
            }
            if (i10 >= this.f8842z0.b()) {
                int i12 = this.A0;
                while (true) {
                    i12++;
                    if (i12 >= this.V0.size()) {
                        break;
                    }
                    v6 v6Var2 = this.V0.get(i12);
                    if (i10 >= v6Var2.k() && i10 < v6Var2.b()) {
                        eh(v6Var2, i12);
                        return this.A0;
                    }
                }
            } else if (i10 < this.f8842z0.k()) {
                for (int i13 = this.A0 - 1; i13 >= 0; i13--) {
                    v6 v6Var3 = this.V0.get(i13);
                    if (i10 >= v6Var3.k() && i10 < v6Var3.b()) {
                        eh(v6Var3, i13);
                        return this.A0;
                    }
                }
            }
        }
        Iterator<v6> it = this.V0.iterator();
        while (it.hasNext()) {
            v6 next = it.next();
            if (i10 < next.k() || i10 >= next.b()) {
                i11++;
            } else {
                eh(next, i11);
                return this.A0;
            }
        }
        return -1;
    }

    public void kh() {
        if (Pf()) {
            qg();
            boolean z10 = false;
            if (this.f8830n0 != 2 || !Pf()) {
                RecyclerView recyclerView = this.f8837u0;
                if (this.f8830n0 != 1) {
                    z10 = true;
                }
                Qf(2, recyclerView, z10, -1);
                return;
            }
            this.f8837u0.u1(0, -fg());
        }
    }

    public final int lg(long j10) {
        Iterator<v6> it = this.V0.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            v6 next = it.next();
            if (!next.r()) {
                if (next.c() == j10) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    public boolean lh(v6 v6Var) {
        int jg;
        eb.k kVar;
        if (!Pf() || (jg = jg(v6Var)) == -1) {
            return false;
        }
        rg();
        Xg(jg, this.f8830n0 == 0 && ((kVar = this.f8828e1) == null || !kVar.v()));
        return Qf(0, this.f8835s0, false, kg(jg));
    }

    @Override
    public boolean m0(View view, float f10, float f11) {
        return true;
    }

    public final int mg(dd.l lVar) {
        ArrayList<v6> arrayList = this.f8838v0;
        if (arrayList == null) {
            return -1;
        }
        Iterator<v6> it = arrayList.iterator();
        while (it.hasNext()) {
            v6 next = it.next();
            if (next.c() == lVar.k()) {
                return this.f8833q0.j0(lVar, next.k());
            }
        }
        return -1;
    }

    public void mh() {
        if (Pf()) {
            rg();
            Qf(0, this.f8835s0, false, -1);
        }
    }

    @Override
    public void n3(dd.l lVar, long j10) {
        if (!this.P0 || j10 == this.Q0) {
            jb.g gVar = this.O0;
            int i10 = 0;
            if (gVar == null) {
                this.O0 = new jb.g();
            } else {
                i10 = gVar.e(j10, 0);
            }
            int i11 = 2;
            if (i10 == 0) {
                jb.g gVar2 = this.O0;
                if (lVar.r()) {
                    i11 = 1;
                }
                gVar2.g(j10, i11);
                this.f24495b.v4().o(new TdApi.GetStickerSet(j10), this);
            } else if ((i10 & 1) == 0 && lVar.r()) {
                this.O0.g(j10, i10 | 1);
            } else if ((i10 & 2) == 0 && !lVar.r()) {
                this.O0.g(j10, i10 | 2);
            }
        }
    }

    @Override
    public void n4(int i10, float f10, float f11, eb.k kVar) {
        if (i10 == 0) {
            this.f8829f1 = f10;
            oh();
        }
    }

    public final int ng(int i10) {
        int i11 = 0;
        if (i10 == 0) {
            return 0;
        }
        v6 v6Var = this.B0;
        if (v6Var != null) {
            if (i10 >= v6Var.k() && i10 < this.B0.b()) {
                return this.C0;
            }
            if (i10 >= this.B0.b()) {
                int i12 = this.C0;
                while (true) {
                    i12++;
                    if (i12 >= this.f8838v0.size()) {
                        break;
                    }
                    v6 v6Var2 = this.f8838v0.get(i12);
                    if (i10 >= v6Var2.k() && i10 < v6Var2.b()) {
                        this.B0 = v6Var2;
                        this.C0 = i12;
                        return i12;
                    }
                }
            } else if (i10 < this.B0.k()) {
                for (int min = Math.min(this.f8838v0.size() - 1, this.C0 - 1); min >= 0; min--) {
                    v6 v6Var3 = this.f8838v0.get(min);
                    if (i10 >= v6Var3.k() && i10 < v6Var3.b()) {
                        this.B0 = v6Var3;
                        this.C0 = min;
                        return min;
                    }
                }
            }
        }
        Iterator<v6> it = this.f8838v0.iterator();
        while (it.hasNext()) {
            v6 next = it.next();
            if (i10 < next.k() || i10 >= next.b()) {
                i11++;
            } else {
                this.B0 = next;
                this.C0 = i11;
                return i11;
            }
        }
        return -1;
    }

    public void nh() {
        eb.k kVar;
        if (Pf()) {
            rg();
            Yg(this.f8830n0 == 0 && ((kVar = this.f8828e1) == null || !kVar.v()));
            Qf(0, this.f8835s0, false, 0);
        }
    }

    @Override
    public void o(View view, float f10, float f11) {
        this.f8836t0.requestDisallowInterceptTouchEvent(false);
        t().w0();
    }

    @Override
    public void o2(View view, float f10, float f11) {
        gb.b.g(this, view, f10, f11);
    }

    @Override
    public void o4(int i10, float f10, eb.k kVar) {
        if (i10 == 0 && f10 == 1.0f) {
            Lf();
        }
    }

    @Override
    public View oc(Context context) {
        d dVar = new d(context);
        this.f8831o0 = dVar;
        dVar.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        this.f8832p0 = new xc.e(this, this, false, this);
        xc.e eVar = new xc.e(this, this, true, this);
        this.f8833q0 = eVar;
        eVar.y0(new e.b(5));
        xc.b bVar = new xc.b(context, this);
        this.f8834r0 = bVar;
        bVar.h0(this);
        Sf();
        int L0 = he.i.c2().L0();
        if (L0 == 0) {
            rg();
            this.f8830n0 = 0;
            CustomRecyclerView customRecyclerView = this.f8835s0;
            this.f8824a1 = customRecyclerView;
            this.f8831o0.addView(customRecyclerView);
        } else if (L0 == 1) {
            pg();
            if (w9() != null) {
                w9().L2(1, false, false);
                w9().setMediaSection(true);
            }
            this.f8830n0 = 1;
            RecyclerView recyclerView = this.f8836t0;
            this.f8824a1 = recyclerView;
            this.f8831o0.addView(recyclerView);
        }
        Hg();
        Ig();
        Jg(0, 20, 0);
        return this.f8831o0;
    }

    public final int og(long j10) {
        Iterator<v6> it = this.f8838v0.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().c() == j10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final void oh() {
        if (this.f8827d1 != w.G2()) {
            View view = this.f8824a1;
            view.setTranslationX(view.getMeasuredWidth() * this.f8829f1);
            View view2 = this.f8826c1;
            if (view2 != null) {
                view2.setTranslationX((-view2.getMeasuredWidth()) * (1.0f - this.f8829f1));
                return;
            }
            return;
        }
        View view3 = this.f8824a1;
        view3.setTranslationX((-view3.getMeasuredWidth()) * this.f8829f1);
        View view4 = this.f8826c1;
        if (view4 != null) {
            view4.setTranslationX(view4.getMeasuredWidth() * (1.0f - this.f8829f1));
        }
    }

    public final void pg() {
        if (this.f8836t0 == null) {
            g gVar = new g(t(), 100);
            gVar.e3(new h(gVar));
            RecyclerView recyclerView = new RecyclerView(t());
            this.f8836t0 = recyclerView;
            recyclerView.setItemAnimator(null);
            this.f8836t0.setLayoutParams(FrameLayoutFix.q1(-1, -1));
            int i10 = 1;
            this.f8836t0.setHasFixedSize(true);
            RecyclerView recyclerView2 = this.f8836t0;
            if (!fd.a.f11879a) {
                i10 = 2;
            }
            recyclerView2.setOverScrollMode(i10);
            this.f8836t0.setAdapter(this.f8834r0);
            this.f8836t0.k(new i());
            this.f8836t0.g(new j(gVar));
            this.f8836t0.setLayoutManager(gVar);
        }
    }

    public final void ph(long[] jArr) {
        k0.e eVar = new k0.e(jArr.length);
        for (long j10 : jArr) {
            eVar.k(j10, null);
        }
        Iterator<v6> it = this.f8838v0.iterator();
        while (it.hasNext()) {
            v6 next = it.next();
            if (eVar.h(next.c()) >= 0) {
                next.y();
                this.f8833q0.D0(next);
            } else {
                next.A();
                this.f8833q0.D0(next);
            }
        }
    }

    public final void qg() {
        if (this.f8837u0 == null) {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(t(), 5);
            gridLayoutManager.e3(new k());
            this.f8833q0.A0(gridLayoutManager);
            RecyclerView recyclerView = (RecyclerView) p0.v(t(), R.layout.recycler, this.f8831o0);
            this.f8837u0 = recyclerView;
            int i10 = 1;
            recyclerView.setHasFixedSize(true);
            this.f8837u0.setAdapter(this.f8833q0);
            RecyclerView recyclerView2 = this.f8837u0;
            if (!fd.a.f11879a) {
                i10 = 2;
            }
            recyclerView2.setOverScrollMode(i10);
            this.f8837u0.setLayoutManager(gridLayoutManager);
            this.f8837u0.k(new l());
        }
    }

    public final void qh(long j10) {
        k0.e<Boolean> eVar = this.T0;
        if (eVar == null) {
            this.T0 = new k0.e<>();
        } else if (eVar.h(j10) >= 0) {
            return;
        }
        this.T0.k(j10, Boolean.TRUE);
        kb.b bVar = this.U0;
        if (bVar != null) {
            bVar.c();
        }
        c cVar = new c();
        this.U0 = cVar;
        j0.e0(cVar, 750L);
    }

    @Override
    public void r2(TdApi.Object object) {
        int i10;
        boolean z10 = true;
        switch (object.getConstructor()) {
            case TdApi.StickerSets.CONSTRUCTOR:
                TdApi.StickerSetInfo[] stickerSetInfoArr = ((TdApi.StickerSets) object).sets;
                final TdApi.Sticker[] stickerArr = this.W0;
                final TdApi.Sticker[] stickerArr2 = this.X0;
                final ArrayList arrayList = new ArrayList(stickerSetInfoArr.length);
                final ArrayList arrayList2 = new ArrayList();
                this.W0 = null;
                this.X0 = null;
                if (stickerSetInfoArr.length == 0 && stickerArr2.length == 0 && stickerArr.length == 0) {
                    arrayList2.add(new e.b(4));
                } else {
                    arrayList2.add(new e.b(3));
                    if (stickerArr.length > 0) {
                        v6 v6Var = new v6(this.f24495b, stickerArr);
                        v6Var.x();
                        v6Var.E(1);
                        arrayList.add(v6Var);
                        for (TdApi.Sticker sticker : stickerArr) {
                            dd.l lVar = new dd.l(this.f24495b, sticker, (String) null, sticker.type);
                            lVar.x();
                            arrayList2.add(new e.b(0, lVar));
                        }
                        i10 = stickerArr.length + 1;
                    } else {
                        i10 = 1;
                    }
                    if (stickerArr2.length > 0) {
                        v6 v6Var2 = new v6(this.f24495b, stickerArr2);
                        v6Var2.B();
                        v6Var2.E(i10);
                        arrayList.add(v6Var2);
                        arrayList2.add(new e.b(stickerArr.length > 0 ? 2 : 1, v6Var2));
                        for (TdApi.Sticker sticker2 : stickerArr2) {
                            dd.l lVar2 = new dd.l(this.f24495b, sticker2, (String) null, sticker2.type);
                            lVar2.y();
                            arrayList2.add(new e.b(0, lVar2));
                        }
                        i10 += stickerArr2.length + 1;
                    }
                    for (TdApi.StickerSetInfo stickerSetInfo : stickerSetInfoArr) {
                        v6 v6Var3 = new v6(this.f24495b, stickerSetInfo);
                        if (v6Var3.j() != 0) {
                            arrayList.add(v6Var3);
                            v6Var3.E(i10);
                            arrayList2.add(new e.b(2, v6Var3));
                            int i11 = 0;
                            while (true) {
                                int i12 = stickerSetInfo.size;
                                if (i11 < i12) {
                                    o6 o6Var = this.f24495b;
                                    TdApi.Sticker[] stickerArr3 = stickerSetInfo.covers;
                                    dd.l lVar3 = new dd.l(o6Var, i11 < stickerArr3.length ? stickerArr3[i11] : null, (String) null, stickerSetInfo.stickerType);
                                    lVar3.B(stickerSetInfo.f19964id, null);
                                    lVar3.v(this);
                                    arrayList2.add(new e.b(0, lVar3));
                                    i11++;
                                } else {
                                    i10 += i12 + 1;
                                }
                            }
                        }
                    }
                }
                this.f24495b.hd().post(new Runnable() {
                    @Override
                    public final void run() {
                        n9.this.xg(arrayList, stickerArr, stickerArr2, arrayList2);
                    }
                });
                return;
            case TdApi.StickerSet.CONSTRUCTOR:
                final TdApi.StickerSet stickerSet = (TdApi.StickerSet) object;
                this.f24495b.hd().post(new Runnable() {
                    @Override
                    public final void run() {
                        n9.this.yg(stickerSet);
                    }
                });
                return;
            case TdApi.Error.CONSTRUCTOR:
                j0.t0(object);
                return;
            case TdApi.Animations.CONSTRUCTOR:
                TdApi.Animation[] animationArr = ((TdApi.Animations) object).animations;
                final ArrayList arrayList3 = new ArrayList(animationArr.length);
                for (TdApi.Animation animation : animationArr) {
                    arrayList3.add(new e3(this.f24495b, animation));
                }
                this.f24495b.hd().post(new Runnable() {
                    @Override
                    public final void run() {
                        n9.this.zg(arrayList3);
                    }
                });
                return;
            case TdApi.Stickers.CONSTRUCTOR:
                TdApi.Sticker[] stickerArr4 = ((TdApi.Stickers) object).stickers;
                if (this.W0 != null) {
                    z10 = false;
                }
                int Zf = Zf(z10);
                if (stickerArr4.length > Zf) {
                    TdApi.Sticker[] stickerArr5 = new TdApi.Sticker[Zf];
                    System.arraycopy(stickerArr4, 0, stickerArr5, 0, Zf);
                    stickerArr4 = stickerArr5;
                }
                if (z10) {
                    this.W0 = stickerArr4;
                    this.f24495b.v4().o(new TdApi.GetRecentStickers(false), this);
                    return;
                }
                this.X0 = stickerArr4;
                this.f24495b.v4().o(new TdApi.GetInstalledStickerSets(false), this);
                return;
            default:
                return;
        }
    }

    public final void rg() {
        if (this.f8835s0 == null) {
            int i10 = 1;
            RtlGridLayoutManager g32 = new RtlGridLayoutManager(t(), this.f8841y0).g3(true);
            g32.e3(new e());
            CustomRecyclerView customRecyclerView = (CustomRecyclerView) p0.v(t(), R.layout.recycler_custom, this.f8831o0);
            this.f8835s0 = customRecyclerView;
            customRecyclerView.setHasFixedSize(true);
            this.f8835s0.setLayoutManager(g32);
            this.f8835s0.setAdapter(this.f8832p0);
            this.f8835s0.setItemAnimator(new tc.d(db.b.f7287b, 180L));
            CustomRecyclerView customRecyclerView2 = this.f8835s0;
            if (!fd.a.f11879a) {
                i10 = 2;
            }
            customRecyclerView2.setOverScrollMode(i10);
            this.f8835s0.k(new f());
        }
    }

    @Override
    public boolean s4(View view, float f10, float f11) {
        TdApi.Animation a10 = ((xc.a) view).getGif().a();
        if (w9() == null) {
            Sg(a10);
            return true;
        }
        o oVar = new o(t());
        if (t2.T2(a10.animation)) {
            oVar.F0();
        }
        m1.f fVar = new m1.f(this.f24495b, view, oVar, null);
        oVar.setBoundForceTouchContext(fVar);
        qd.b U0 = qd.b.U0(t(), this.f24495b, a10, null);
        U0.q(true);
        oVar.setMedia(U0);
        jb.c cVar = new jb.c(2);
        jb.c cVar2 = new jb.c(2);
        u0 u0Var = new u0(2);
        cVar.a(R.id.btn_deleteGif);
        cVar2.a(R.drawable.baseline_delete_24);
        u0Var.a(R.string.Delete);
        cVar.a(R.id.btn_send);
        cVar2.a(R.drawable.deproko_baseline_send_24);
        u0Var.a(R.string.Send);
        fVar.I(this, a10, cVar.e(), cVar2.e(), u0Var.d());
        if (t().f2(fVar)) {
            this.f8836t0.requestDisallowInterceptTouchEvent(true);
            return true;
        }
        oVar.Q2();
        return false;
    }

    @Override
    public void t2(m1.f fVar, int i10, Object obj) {
    }

    @Override
    public void w2(dd.j jVar, dd.l lVar) {
    }

    @Override
    public void y0(TdApi.StickerSetInfo stickerSetInfo) {
        p1.e(this, stickerSetInfo);
    }

    @Override
    public void z4(final int[] iArr, boolean z10) {
        if (!z10) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    n9.this.wg(iArr);
                }
            });
        }
    }

    @Override
    public void z6(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
        t().o2(f10, f11, f12, f13);
    }
}
