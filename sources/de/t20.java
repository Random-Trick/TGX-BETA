package de;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import ce.a0;
import ce.c0;
import ce.j0;
import dd.i;
import de.t20;
import gd.w;
import hd.v6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb.g;
import ne.c2;
import ne.p0;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import ud.v4;
import zd.o6;
import zd.p1;
import zd.q1;

public class t20 extends vo<e> implements Client.g, View.OnClickListener, q1 {
    public int D0;
    public boolean E0;
    public iq F0;
    public g G0;
    public boolean H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public ArrayList<v6> L0;
    public ArrayList<v6> M0;
    public boolean N0;
    public ArrayList<long[]> O0;

    public class a extends iq {
        public a(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void L2(ra raVar, int i10, p0 p0Var, boolean z10, boolean z11) {
            v6 v6Var;
            c2 button;
            if (z10 && t20.this.M0 != null) {
                v6Var = (v6) t20.this.M0.get(i10 - t20.this.jh());
            } else if (t20.this.L0 != null) {
                v6Var = (v6) t20.this.L0.get(i10 - t20.this.kh());
            } else {
                return;
            }
            p0Var.setStickerSet(v6Var);
            if (z10 && (button = p0Var.getButton()) != null) {
                int lh = t20.this.lh(v6Var);
                boolean z12 = false;
                button.g(lh == 1, z11);
                if (lh == 2) {
                    z12 = true;
                }
                button.h(z12, z11);
            }
        }
    }

    public class b extends g.e {
        public int f9598d = -1;
        public int f9599e = -1;

        public b() {
        }

        @Override
        public void B(RecyclerView.c0 c0Var, int i10) {
        }

        public final void C(int i10, int i11) {
            t20.this.Gh();
        }

        @Override
        public void c(RecyclerView recyclerView, RecyclerView.c0 c0Var) {
            int i10;
            super.c(recyclerView, c0Var);
            int i11 = this.f9598d;
            if (!(i11 == -1 || (i10 = this.f9599e) == -1 || i11 == i10)) {
                C(i11, i10);
            }
            this.f9599e = -1;
            this.f9598d = -1;
        }

        @Override
        public int k(RecyclerView recyclerView, RecyclerView.c0 c0Var) {
            int k10;
            if (t20.this.L0 == null || (k10 = c0Var.k()) == -1 || k10 < t20.this.kh() || t20.this.L0 == null || k10 >= t20.this.kh() + t20.this.L0.size()) {
                return 0;
            }
            return g.e.t(3, 0);
        }

        @Override
        public boolean r() {
            return true;
        }

        @Override
        public boolean y(RecyclerView recyclerView, RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2) {
            int k10 = c0Var.k();
            int k11 = c0Var2.k();
            if (t20.this.L0 == null || k10 < t20.this.kh() || k10 >= t20.this.kh() + t20.this.L0.size() || k11 < t20.this.kh() || k11 >= t20.this.kh() + t20.this.L0.size()) {
                return false;
            }
            t20 t20Var = t20.this;
            t20Var.Ah(k10 - t20Var.kh(), k11 - t20.this.kh());
            if (this.f9598d == -1) {
                this.f9598d = k10;
            }
            this.f9599e = k11;
            return true;
        }

        @Override
        public void z(RecyclerView recyclerView, RecyclerView.c0 c0Var, int i10, RecyclerView.c0 c0Var2, int i11, int i12, int i13) {
            super.z(recyclerView, c0Var, i10, c0Var2, i11, i12, i13);
            c0Var.f2982a.invalidate();
            c0Var2.f2982a.invalidate();
        }
    }

    public class c extends RecyclerView.t {
        public c() {
        }

        @Override
        public void b(RecyclerView recyclerView, int i10, int i11) {
            int a22;
            if (t20.this.I0) {
                return;
            }
            if (((t20.this.L0 != null && !t20.this.L0.isEmpty()) || (t20.this.M0 != null && !t20.this.M0.isEmpty())) && (a22 = ((LinearLayoutManager) recyclerView.getLayoutManager()).a2()) != -1 && a22 + 10 >= t20.this.F0.D() - 1) {
                t20.this.zh(true);
            }
        }
    }

    public class d implements Client.g {
        public final int[] f9602a;
        public final int f9603b;
        public final long[] f9604c;

        public d(int[] iArr, int i10, long[] jArr) {
            this.f9602a = iArr;
            this.f9603b = i10;
            this.f9604c = jArr;
        }

        public void c(v6 v6Var, int i10) {
            if (!t20.this.Sa()) {
                t20.this.fh(v6Var, i10);
            }
        }

        public void d() {
            if (!t20.this.Sa()) {
                t20.this.Hh(false);
            }
        }

        @Override
        public void r2(TdApi.Object object) {
            if (object.getConstructor() == -1816236758) {
                final v6 v6Var = new v6(t20.this.f24495b, (TdApi.StickerSet) object);
                int[] iArr = this.f9602a;
                final int i10 = iArr[1];
                iArr[1] = i10 + 1;
                t20.this.f24495b.hd().post(new Runnable() {
                    @Override
                    public final void run() {
                        t20.d.this.c(v6Var, i10);
                    }
                });
            }
            int[] iArr2 = this.f9602a;
            int i11 = iArr2[0] + 1;
            iArr2[0] = i11;
            if (i11 < this.f9603b) {
                t20.this.f24495b.v4().o(new TdApi.GetStickerSet(this.f9604c[this.f9602a[0]]), this);
            } else {
                t20.this.f24495b.hd().post(new Runnable() {
                    @Override
                    public final void run() {
                        t20.d.this.d();
                    }
                });
            }
        }
    }

    public static class e {
        public final int f9605a;
        public final boolean f9606b;
        public ArrayList<v6> f9607c;

        public e(int i10, boolean z10) {
            this.f9605a = i10;
            this.f9606b = z10;
        }

        public e a(ArrayList<v6> arrayList) {
            this.f9607c = arrayList;
            return this;
        }
    }

    public t20(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public static boolean nh(TdApi.StickerType stickerType) {
        return stickerType.getConstructor() == -839756573;
    }

    public void ph(TdApi.Object object, final v6 v6Var) {
        if (!Sa()) {
            int i10 = 0;
            boolean z10 = object.getConstructor() == -722616727;
            if (z10) {
                v6Var.y();
            }
            long c10 = v6Var.c();
            if (z10) {
                i10 = 2;
            }
            Jh(c10, i10);
            if (!z10) {
                return;
            }
            if (this.D0 == 1) {
                j0.e0(new Runnable() {
                    @Override
                    public final void run() {
                        t20.this.oh(v6Var);
                    }
                }, 1500L);
                return;
            }
            jb.g gVar = this.G0;
            if (gVar != null) {
                gVar.c(v6Var.c());
            }
        }
    }

    public void qh(final v6 v6Var, final TdApi.Object object) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                t20.this.ph(object, v6Var);
            }
        });
    }

    public void rh(long[] jArr) {
        if (!Sa() && !this.I0 && this.L0 != null) {
            hh(jArr);
        }
    }

    public void sh(TdApi.Object object) {
        if (!Sa()) {
            this.I0 = false;
            j0.t0(object);
        }
    }

    public void th(ArrayList arrayList, ArrayList arrayList2) {
        if (!Sa()) {
            this.I0 = false;
            if (this.J0) {
                eh(arrayList, arrayList2);
            } else {
                Kh(arrayList, arrayList2);
            }
        }
    }

    public void uh(final ArrayList arrayList, TdApi.Object object) {
        final ArrayList<v6> arrayList2;
        if (object.getConstructor() == -1883828812) {
            TdApi.StickerSetInfo[] stickerSetInfoArr = ((TdApi.StickerSets) object).sets;
            if (stickerSetInfoArr.length > 0) {
                arrayList2 = new ArrayList<>(stickerSetInfoArr.length);
                for (TdApi.StickerSetInfo stickerSetInfo : stickerSetInfoArr) {
                    v6 v6Var = new v6(this.f24495b, stickerSetInfo);
                    v6Var.v(arrayList2);
                    arrayList2.add(v6Var);
                }
                this.f24495b.hd().post(new Runnable() {
                    @Override
                    public final void run() {
                        t20.this.th(arrayList, arrayList2);
                    }
                });
            }
        }
        arrayList2 = null;
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                t20.this.th(arrayList, arrayList2);
            }
        });
    }

    public void vh(ArrayList arrayList) {
        if (!Sa()) {
            this.I0 = false;
            if (this.J0) {
                eh(arrayList, null);
            } else {
                Kh(arrayList, null);
            }
        }
    }

    public void wh(TdApi.StickerSetInfo stickerSetInfo) {
        if (!Sa() && !this.I0 && this.L0 != null) {
            if (this.D0 == 2) {
                ch(stickerSetInfo);
            } else {
                dh(stickerSetInfo);
            }
        }
    }

    public void xh(TdApi.StickerSetInfo stickerSetInfo) {
        if (!Sa() && !this.I0 && this.L0 != null && this.D0 != 2) {
            Eh(stickerSetInfo.f19964id);
        }
    }

    public void yh(TdApi.StickerSetInfo stickerSetInfo) {
        if (!Sa() && !this.I0 && this.L0 != null && this.D0 != 2) {
            Eh(stickerSetInfo.f19964id);
        }
    }

    public final void Ah(int i10, int i11) {
        ArrayList<v6> arrayList;
        if (i10 != i11 && (arrayList = this.L0) != null) {
            ib.b.w(arrayList, i10, i11);
            int kh = i10 + kh();
            int kh2 = i11 + kh();
            int X1 = ((LinearLayoutManager) kg().getLayoutManager()).X1();
            View C = kg().getLayoutManager().C(X1);
            int top = C != null ? C.getTop() : 0;
            this.F0.v1(kh, kh2, true);
            ((LinearLayoutManager) kg().getLayoutManager()).z2(X1, top);
        }
    }

    public void Bh() {
        if (!this.H0) {
            this.H0 = true;
            kg().setItemAnimator(new tc.d(db.b.f7287b, 180L));
        }
    }

    public final void Ch(int i10) {
        ArrayList<v6> arrayList = this.M0;
        if (arrayList != null && !arrayList.isEmpty()) {
            v6 remove = this.M0.remove(i10);
            jb.g gVar = this.G0;
            if (gVar != null) {
                gVar.c(remove.c());
            }
            if (this.M0.isEmpty()) {
                this.F0.R1(jh() - 2, 4);
            } else {
                this.F0.R1(jh() + i10, 1);
            }
        }
    }

    public final void oh(v6 v6Var) {
        if (this.L0 != null) {
            jb.g gVar = this.G0;
            if (gVar != null) {
                gVar.c(v6Var.c());
            }
            int mh = mh(v6Var.c());
            if (mh != -1) {
                this.L0.remove(mh);
                if (this.L0.size() == 0) {
                    gh();
                    return;
                }
                int i10 = mh + 3;
                this.F0.D0().remove(i10);
                this.F0.O(i10);
            }
        }
    }

    public final void Eh(long j10) {
        int mh = mh(j10);
        if (mh != -1) {
            Fh(mh);
        }
    }

    public final void Fh(int i10) {
        ArrayList<v6> arrayList = this.L0;
        if (arrayList != null) {
            arrayList.remove(i10);
            if (!this.L0.isEmpty()) {
                int kh = i10 + kh();
                this.F0.D0().remove(kh);
                this.F0.O(kh);
            } else if (this.D0 == 2) {
                this.F0.R1(i10 + 2, 3);
            } else {
                gh();
            }
        }
    }

    public final void Gh() {
        ArrayList<v6> arrayList = this.L0;
        if (arrayList != null && !arrayList.isEmpty()) {
            long[] jArr = new long[this.L0.size()];
            Iterator<v6> it = this.L0.iterator();
            boolean z10 = false;
            int i10 = 0;
            while (it.hasNext()) {
                i10++;
                jArr[i10] = it.next().c();
            }
            Client v42 = this.f24495b.v4();
            if (this.D0 == 2) {
                z10 = true;
            }
            v42.o(new TdApi.ReorderInstalledStickerSets(z10, jArr), this.f24495b.na());
        }
    }

    public final void Hh(boolean z10) {
        ArrayList<long[]> arrayList;
        if (this.N0 != z10) {
            this.N0 = z10;
            if (!z10 && (arrayList = this.O0) != null && !arrayList.isEmpty()) {
                do {
                    hh(this.O0.remove(0));
                    if (this.O0.isEmpty()) {
                        return;
                    }
                } while (!this.N0);
            }
        }
    }

    public void Ih(e eVar) {
        super.Ad(eVar);
        this.D0 = eVar.f9605a;
        this.E0 = eVar.f9606b;
        this.L0 = eVar.f9607c;
    }

    public final void Jh(long j10, int i10) {
        if (this.G0 == null) {
            this.G0 = new jb.g();
        }
        this.G0.g(j10, i10);
        this.F0.j3(j10);
    }

    public void Kh(ArrayList<v6> arrayList, ArrayList<v6> arrayList2) {
        this.L0 = arrayList;
        this.M0 = arrayList2;
        gh();
    }

    @Override
    public void M3(TdApi.StickerSets stickerSets, int i10) {
    }

    @Override
    public int R9() {
        int i10 = this.D0;
        return i10 != 1 ? i10 != 2 ? R.id.controller_stickers : R.id.controller_masks : R.id.controller_stickersArchived;
    }

    @Override
    public void Y4(TdApi.StickerSet stickerSet) {
        p1.g(this, stickerSet);
    }

    @Override
    public void Z(final TdApi.StickerSetInfo stickerSetInfo) {
        if ((this.D0 == 2 && nh(stickerSetInfo.stickerType)) || (this.D0 == 1 && !nh(stickerSetInfo.stickerType))) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    t20.this.wh(stickerSetInfo);
                }
            });
        }
    }

    @Override
    public void Z2(int[] iArr) {
    }

    @Override
    public void Z8() {
        super.Z8();
        this.f24495b.O9().y0(this);
    }

    public final void ch(TdApi.StickerSetInfo stickerSetInfo) {
        ArrayList<v6> arrayList = this.M0;
        if (arrayList == null) {
            this.M0 = new ArrayList<>();
        } else {
            Iterator<v6> it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next().c() == stickerSetInfo.f19964id) {
                    return;
                }
            }
        }
        long j10 = stickerSetInfo.f19964id;
        String str = stickerSetInfo.title;
        v6 v6Var = new v6(this.f24495b, new TdApi.StickerSetInfo(j10, str, str, stickerSetInfo.thumbnail, stickerSetInfo.thumbnailOutline, true, true, stickerSetInfo.isOfficial, stickerSetInfo.stickerType, stickerSetInfo.isViewed, stickerSetInfo.size, stickerSetInfo.covers));
        v6Var.v(this.M0);
        int jh = jh();
        ra N = new ra(26, R.id.btn_stickerSetInfo, 0, 0).N(v6Var.c());
        this.M0.add(0, v6Var);
        if (this.M0.size() == 1) {
            int size = this.F0.D0().size();
            this.F0.D0().add(new ra(8, 0, 0, R.string.Archived));
            this.F0.D0().add(new ra(2));
            this.F0.D0().add(N);
            this.F0.D0().add(new ra(3));
            this.F0.M(size, 4);
            return;
        }
        this.F0.D0().add(jh, N);
        this.F0.J(jh);
    }

    public final void dh(TdApi.StickerSetInfo stickerSetInfo) {
        if (this.L0 != null) {
            long j10 = stickerSetInfo.f19964id;
            String str = stickerSetInfo.title;
            v6 v6Var = new v6(this.f24495b, new TdApi.StickerSetInfo(j10, str, str, stickerSetInfo.thumbnail, stickerSetInfo.thumbnailOutline, stickerSetInfo.isInstalled, true, stickerSetInfo.isOfficial, stickerSetInfo.stickerType, stickerSetInfo.isViewed, stickerSetInfo.size, stickerSetInfo.covers));
            v6Var.v(this.L0);
            this.L0.add(0, v6Var);
            if (this.L0.size() == 1) {
                gh();
                return;
            }
            this.F0.D0().add(3, new ra(26, R.id.btn_stickerSetInfo, 0, 0).N(v6Var.c()));
            this.F0.J(3);
        }
    }

    @Override
    public void e6(final TdApi.StickerSetInfo stickerSetInfo) {
        if ((this.D0 == 2 && nh(stickerSetInfo.stickerType)) || (this.D0 == 1 && !nh(stickerSetInfo.stickerType))) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    t20.this.yh(stickerSetInfo);
                }
            });
        }
    }

    public void eh(ArrayList<v6> arrayList, ArrayList<v6> arrayList2) {
        ArrayList<v6> arrayList3;
        if (this.D0 == 1 && (arrayList3 = this.L0) != null && !arrayList3.isEmpty() && !arrayList.isEmpty()) {
            this.L0.addAll(arrayList);
            List<ra> D0 = this.F0.D0();
            int size = D0.size() - 1;
            ra remove = D0.remove(size);
            Iterator<v6> it = arrayList.iterator();
            while (it.hasNext()) {
                v6 next = it.next();
                next.v(this.L0);
                D0.add(new ra(26, R.id.btn_stickerSetInfo, 0, 0).N(next.c()));
            }
            D0.add(remove);
            this.F0.M(size, arrayList.size());
        }
    }

    public final void fh(v6 v6Var, int i10) {
        ArrayList<v6> arrayList = this.L0;
        if (arrayList != null) {
            v6Var.v(arrayList);
            this.L0.add(i10, v6Var);
            int X1 = ((LinearLayoutManager) kg().getLayoutManager()).X1();
            View C = kg().getLayoutManager().C(X1);
            int top = C != null ? C.getTop() : 0;
            ra N = new ra(23, R.id.btn_stickerSetInfo, 0, 0).N(v6Var.c());
            if (this.L0.size() != 1 || this.D0 == 0) {
                int kh = i10 + kh();
                this.F0.D0().add(kh, N);
                this.F0.J(kh);
            } else {
                int i11 = i10 + 2;
                this.F0.D0().add(i11, new ra(3));
                this.F0.D0().add(i11, N);
                this.F0.D0().add(i11, new ra(2));
                this.F0.M(i11, 3);
            }
            ((LinearLayoutManager) kg().getLayoutManager()).z2(X1, top);
        }
    }

    public final void gh() {
        ArrayList<v6> arrayList;
        ArrayList<v6> arrayList2;
        ArrayList<v6> arrayList3 = this.L0;
        ArrayList arrayList4 = new ArrayList(Math.max(0, arrayList3 != null ? (arrayList3.size() * 2) - 1 : 0));
        if (!this.L0.isEmpty() || ((arrayList2 = this.M0) != null && !arrayList2.isEmpty())) {
            int i10 = this.D0;
            if (i10 == 1) {
                arrayList4.add(new ra(14));
                arrayList4.add(new ra(9, 0, 0, (CharSequence) w.j1(R.string.ArchivedStickersInfo, c0.f(this.f24495b.G5())), false));
                arrayList4.add(new ra(2));
            } else if (i10 == 2) {
                arrayList4.add(new ra(14));
                arrayList4.add(new ra(9, 0, 0, R.string.MasksHint));
                if (!this.L0.isEmpty()) {
                    arrayList4.add(new ra(2));
                }
            }
            if (this.D0 == 1) {
                Iterator<v6> it = this.L0.iterator();
                while (it.hasNext()) {
                    arrayList4.add(new ra(26, R.id.btn_stickerSetInfo, 0, 0).N(it.next().c()));
                }
            } else {
                Iterator<v6> it2 = this.L0.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(new ra(23, R.id.btn_stickerSetInfo, 0, 0).N(it2.next().c()));
                }
            }
            if (!this.L0.isEmpty()) {
                arrayList4.add(new ra(3));
            }
            if (this.D0 == 2 && (arrayList = this.M0) != null && !arrayList.isEmpty()) {
                arrayList4.add(new ra(8, 0, 0, R.string.Archived));
                arrayList4.add(new ra(2));
                Iterator<v6> it3 = this.M0.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(new ra(26, R.id.btn_stickerSetInfo, 0, 0).N(it3.next().c()));
                }
                arrayList4.add(new ra(3));
            }
            if (this.D0 == 0) {
                arrayList4.add(new ra(9, 0, 0, (CharSequence) w.j1(R.string.ArchivedStickersInfo, c0.f(this.f24495b.G5())), false));
            }
        } else {
            int i11 = this.D0;
            if (i11 == 1) {
                arrayList4.add(new ra(24, 0, 0, (CharSequence) w.j1(R.string.ArchivedStickersInfo, c0.f(this.f24495b.G5())), false));
            } else {
                arrayList4.add(new ra(24, 0, 0, i11 == 0 ? R.string.NoStickerSets : R.string.NoMasks));
            }
        }
        this.F0.s2(arrayList4, false);
    }

    @Override
    public void h(final long[] jArr, boolean z10) {
        int i10 = this.D0;
        if ((i10 == 2 && z10) || (i10 == 0 && !z10)) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    t20.this.rh(jArr);
                }
            });
        }
    }

    public final void hh(long[] jArr) {
        if (this.D0 == 1) {
            for (long j10 : jArr) {
                Eh(j10);
            }
        } else if (this.N0) {
            if (this.O0 == null) {
                this.O0 = new ArrayList<>();
            }
            this.O0.add(jArr);
        } else {
            ArrayList<v6> arrayList = this.L0;
            if ((arrayList == null || arrayList.isEmpty()) && this.D0 != 2) {
                zh(false);
                return;
            }
            k0.e eVar = new k0.e();
            Iterator<v6> it = this.L0.iterator();
            while (it.hasNext()) {
                v6 next = it.next();
                eVar.k(next.c(), next);
            }
            k0.e eVar2 = new k0.e(jArr.length);
            k0.e eVar3 = null;
            jb.e eVar4 = null;
            boolean z10 = false;
            int i10 = 0;
            int i11 = 0;
            int i12 = -1;
            for (long j11 : jArr) {
                if (((v6) eVar.f(j11)) != null) {
                    eVar.l(j11);
                    if (eVar3 == null) {
                        eVar3 = new k0.e(5);
                    }
                    eVar3.k(j11, Integer.valueOf(i10));
                    i10++;
                } else if (!z10) {
                    i12++;
                    if (i11 != i12) {
                        z10 = true;
                    } else {
                        if (eVar4 == null) {
                            eVar4 = new jb.e(5);
                        }
                        eVar4.a(j11);
                    }
                }
                eVar2.k(j11, Integer.valueOf(i11));
                i11++;
            }
            ArrayList<v6> arrayList2 = this.M0;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                for (int size = this.M0.size() - 1; size >= 0; size--) {
                    if (((Integer) eVar2.g(this.M0.get(size).c(), -1)).intValue() != -1) {
                        Ch(size);
                    }
                }
            }
            int p10 = eVar.p();
            for (int i13 = 0; i13 < p10; i13++) {
                Eh(((v6) eVar.q(i13)).c());
            }
            if (eVar3 != null && !this.L0.isEmpty()) {
                for (int i14 = 0; i14 < eVar3.p(); i14++) {
                    long j12 = eVar3.j(i14);
                    int intValue = ((Integer) eVar3.q(i14)).intValue();
                    int mh = mh(j12);
                    if (mh != -1) {
                        if (mh != intValue) {
                            Ah(mh, intValue);
                        }
                    } else {
                        throw new RuntimeException();
                    }
                }
            }
            if (z10) {
                zh(false);
            } else if (eVar4 != null) {
                Hh(true);
                long[] g10 = eVar4.g();
                int[] iArr = new int[2];
                this.f24495b.v4().o(new TdApi.GetStickerSet(g10[iArr[0]]), new d(iArr, eVar4.l(), g10));
            }
        }
    }

    public final v6 ih(long j10) {
        ArrayList<v6> arrayList = this.L0;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<v6> it = this.L0.iterator();
            while (it.hasNext()) {
                v6 next = it.next();
                if (next.c() == j10) {
                    return next;
                }
            }
        }
        ArrayList<v6> arrayList2 = this.M0;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return null;
        }
        Iterator<v6> it2 = this.M0.iterator();
        while (it2.hasNext()) {
            v6 next2 = it2.next();
            if (next2.c() == j10) {
                return next2;
            }
        }
        return null;
    }

    public final int jh() {
        int kh = kh();
        ArrayList<v6> arrayList = this.L0;
        return kh + (arrayList != null ? arrayList.size() + 3 : 1);
    }

    public final int kh() {
        ArrayList<v6> arrayList = this.L0;
        if (arrayList == null || this.D0 == 0) {
            return 0;
        }
        return arrayList.isEmpty() ? 1 : 3;
    }

    public final int lh(v6 v6Var) {
        jb.g gVar = this.G0;
        if (gVar != null) {
            return gVar.e(v6Var.c(), 0);
        }
        return 0;
    }

    public final int mh(long j10) {
        ArrayList<v6> arrayList = this.L0;
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

    @Override
    public void onClick(View view) {
        v6 ih;
        jb.g gVar;
        int id2 = view.getId();
        if (id2 == R.id.btn_double) {
            final v6 ih2 = ih(((ra) ((ViewGroup) view.getParent()).getTag()).m());
            if (ih2 != null && lh(ih2) == 0) {
                Jh(ih2.c(), 1);
                this.f24495b.v4().o(new TdApi.ChangeStickerSet(ih2.c(), true, false), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        t20.this.qh(ih2, object);
                    }
                });
            }
        } else if (id2 != R.id.btn_stickerSetInfo || (ih = ih(((ra) view.getTag()).m())) == null) {
        } else {
            if (this.D0 != 1 || (gVar = this.G0) == null || gVar.e(ih.c(), 0) != 2) {
                i.W1(this, ih.d()).T1();
            }
        }
    }

    @Override
    public void r2(final TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1883828812) {
            TdApi.StickerSetInfo[] stickerSetInfoArr = ((TdApi.StickerSets) object).sets;
            final ArrayList<v6> arrayList = new ArrayList<>(stickerSetInfoArr.length);
            int i10 = this.D0;
            int i11 = 0;
            if (i10 == 0) {
                int length = stickerSetInfoArr.length;
                while (i11 < length) {
                    TdApi.StickerSetInfo stickerSetInfo = stickerSetInfoArr[i11];
                    if (!stickerSetInfo.isArchived) {
                        v6 v6Var = new v6(this.f24495b, stickerSetInfo);
                        v6Var.v(arrayList);
                        arrayList.add(v6Var);
                    }
                    i11++;
                }
            } else if (i10 == 1) {
                int length2 = stickerSetInfoArr.length;
                while (i11 < length2) {
                    TdApi.StickerSetInfo stickerSetInfo2 = stickerSetInfoArr[i11];
                    if (stickerSetInfo2.isArchived) {
                        v6 v6Var2 = new v6(this.f24495b, stickerSetInfo2);
                        v6Var2.v(arrayList);
                        arrayList.add(v6Var2);
                    }
                    i11++;
                }
            } else if (i10 == 2) {
                int length3 = stickerSetInfoArr.length;
                while (i11 < length3) {
                    v6 v6Var3 = new v6(this.f24495b, stickerSetInfoArr[i11]);
                    v6Var3.v(arrayList);
                    arrayList.add(v6Var3);
                    i11++;
                }
            }
            arrayList.trimToSize();
            if (this.D0 == 2) {
                this.f24495b.v4().o(new TdApi.GetArchivedStickerSets(true, 0L, 100), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object2) {
                        t20.this.uh(arrayList, object2);
                    }
                });
            } else {
                this.f24495b.hd().post(new Runnable() {
                    @Override
                    public final void run() {
                        t20.this.vh(arrayList);
                    }
                });
            }
        } else if (constructor == -1679978726) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    t20.this.sh(object);
                }
            });
        }
    }

    @Override
    public void rg(Context context, CustomRecyclerView customRecyclerView) {
        this.F0 = new a(this);
        int i10 = this.D0;
        if (i10 == 0 || i10 == 2) {
            if (i10 == 0) {
                customRecyclerView.setItemAnimator(null);
            }
            new androidx.recyclerview.widget.g(new b()).m(customRecyclerView);
        }
        if (this.D0 == 1) {
            customRecyclerView.k(new c());
        }
        if (this.L0 != null) {
            gh();
        } else if (!this.E0) {
            zh(false);
        }
        int i11 = this.D0;
        if (i11 == 0 || i11 == 2 || i11 == 1) {
            this.f24495b.O9().l0(this);
        }
        customRecyclerView.setAdapter(this.F0);
    }

    @Override
    public void y0(final TdApi.StickerSetInfo stickerSetInfo) {
        if ((this.D0 == 2 && nh(stickerSetInfo.stickerType)) || (this.D0 == 1 && !nh(stickerSetInfo.stickerType))) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    t20.this.xh(stickerSetInfo);
                }
            });
        }
    }

    @Override
    public void z4(int[] iArr, boolean z10) {
    }

    public final void zh(boolean z10) {
        int i10;
        long j10;
        if (this.I0) {
            return;
        }
        if (!z10 || !this.K0) {
            this.I0 = true;
            this.J0 = z10;
            int i11 = this.D0;
            if (i11 != 0) {
                if (i11 == 1) {
                    if (z10) {
                        ArrayList<v6> arrayList = this.L0;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            ArrayList<v6> arrayList2 = this.L0;
                            j10 = arrayList2.get(arrayList2.size() - 1).c();
                            i10 = 100;
                        } else {
                            return;
                        }
                    } else {
                        j10 = 0;
                        i10 = a0.b(a0.i(72.0f), 20);
                    }
                    this.f24495b.v4().o(new TdApi.GetArchivedStickerSets(false, j10, i10), this);
                } else if (i11 == 2 && !z10) {
                    this.f24495b.v4().o(new TdApi.GetInstalledStickerSets(true), this);
                }
            } else if (!z10) {
                this.f24495b.v4().o(new TdApi.GetInstalledStickerSets(false), this);
            }
        }
    }
}
