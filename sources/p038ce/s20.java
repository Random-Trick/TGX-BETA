package p038ce;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C0962g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1363c0;
import be.C1379j0;
import cd.View$OnClickListenerC2096i;
import gd.C4817v6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.C6853c2;
import me.C6992p0;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import p037cb.C2057b;
import p038ce.s20;
import p082fd.C4403w;
import p108hb.C5062b;
import p124ib.C5322e;
import p124ib.C5324g;
import p143k0.C6035e;
import p350yd.AbstractC10986s1;
import p350yd.C10930q6;
import p350yd.C10965r1;
import sc.C8731d;
import td.AbstractC9323v4;

public class s20 extends AbstractC3204vo<C3030e> implements Client.AbstractC7865g, View.OnClickListener, AbstractC10986s1 {
    public int f10154D0;
    public boolean f10155E0;
    public C2546iq f10156F0;
    public C5324g f10157G0;
    public boolean f10158H0;
    public boolean f10159I0;
    public boolean f10160J0;
    public boolean f10161K0;
    public ArrayList<C4817v6> f10162L0;
    public ArrayList<C4817v6> f10163M0;
    public boolean f10164N0;
    public ArrayList<long[]> f10165O0;

    public class C3026a extends C2546iq {
        public C3026a(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo32051P2(C2964ra raVar, int i, C6992p0 p0Var, boolean z, boolean z2) {
            C4817v6 v6Var;
            C6853c2 button;
            if (z && s20.this.f10163M0 != null) {
                v6Var = (C4817v6) s20.this.f10163M0.get(i - s20.this.m32068jh());
            } else if (s20.this.f10162L0 != null) {
                v6Var = (C4817v6) s20.this.f10162L0.get(i - s20.this.m32067kh());
            } else {
                return;
            }
            p0Var.setStickerSet(v6Var);
            if (z && (button = p0Var.getButton()) != null) {
                int lh = s20.this.m32066lh(v6Var);
                boolean z3 = false;
                button.m18769g(lh == 1, z2);
                if (lh == 2) {
                    z3 = true;
                }
                button.m18768h(z3, z2);
            }
        }
    }

    public class C3027b extends C0962g.AbstractC0968f {
        public int f10167d = -1;
        public int f10168e = -1;

        public C3027b() {
        }

        @Override
        public void mo9884B(RecyclerView.AbstractC0886d0 d0Var, int i) {
        }

        public final void m32050C(int i, int i2) {
            s20.this.m32101Gh();
        }

        @Override
        public void mo9881c(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var) {
            int i;
            super.mo9881c(recyclerView, d0Var);
            int i2 = this.f10167d;
            if (!(i2 == -1 || (i = this.f10168e) == -1 || i2 == i)) {
                m32050C(i2, i);
            }
            this.f10168e = -1;
            this.f10167d = -1;
        }

        @Override
        public int mo9880k(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var) {
            int k;
            if (s20.this.f10162L0 == null || (k = d0Var.m39335k()) == -1 || k < s20.this.m32067kh() || s20.this.f10162L0 == null || k >= s20.this.m32067kh() + s20.this.f10162L0.size()) {
                return 0;
            }
            return C0962g.AbstractC0968f.m38781t(3, 0);
        }

        @Override
        public boolean mo9879r() {
            return true;
        }

        @Override
        public boolean mo9877y(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, RecyclerView.AbstractC0886d0 d0Var2) {
            int k = d0Var.m39335k();
            int k2 = d0Var2.m39335k();
            if (s20.this.f10162L0 == null || k < s20.this.m32067kh() || k >= s20.this.m32067kh() + s20.this.f10162L0.size() || k2 < s20.this.m32067kh() || k2 >= s20.this.m32067kh() + s20.this.f10162L0.size()) {
                return false;
            }
            s20 s20Var = s20.this;
            s20Var.m32113Ah(k - s20Var.m32067kh(), k2 - s20.this.m32067kh());
            if (this.f10167d == -1) {
                this.f10167d = k;
            }
            this.f10168e = k2;
            return true;
        }

        @Override
        public void mo9876z(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, int i, RecyclerView.AbstractC0886d0 d0Var2, int i2, int i3, int i4) {
            super.mo9876z(recyclerView, d0Var, i, d0Var2, i2, i3, i4);
            d0Var.f3479a.invalidate();
            d0Var2.f3479a.invalidate();
        }
    }

    public class C3028c extends RecyclerView.AbstractC0910t {
        public C3028c() {
        }

        @Override
        public void mo421b(RecyclerView recyclerView, int i, int i2) {
            int a2;
            if (s20.this.f10159I0) {
                return;
            }
            if (((s20.this.f10162L0 != null && !s20.this.f10162L0.isEmpty()) || (s20.this.f10163M0 != null && !s20.this.f10163M0.isEmpty())) && (a2 = ((LinearLayoutManager) recyclerView.getLayoutManager()).m39546a2()) != -1 && a2 + 10 >= s20.this.f10156F0.mo6153D() - 1) {
                s20.this.m32052zh(true);
            }
        }
    }

    public class C3029d implements Client.AbstractC7865g {
        public final int[] f10172a;
        public final int f10173b;
        public final long[] f10174c;

        public C3029d(int[] iArr, int i, long[] jArr) {
            this.f10172a = iArr;
            this.f10173b = i;
            this.f10174c = jArr;
        }

        public void m32047c(C4817v6 v6Var, int i) {
            if (!s20.this.m9347Sa()) {
                s20.this.m32072fh(v6Var, i);
            }
        }

        public void m32046d() {
            if (!s20.this.m9347Sa()) {
                s20.this.m32099Hh(false);
            }
        }

        @Override
        public void mo255t2(TdApi.Object object) {
            if (object.getConstructor() == -1816236758) {
                final C4817v6 v6Var = new C4817v6(s20.this.f30167b, (TdApi.StickerSet) object);
                int[] iArr = this.f10172a;
                final int i = iArr[1];
                iArr[1] = i + 1;
                s20.this.f30167b.m2485dd().post(new Runnable() {
                    @Override
                    public final void run() {
                        s20.C3029d.this.m32047c(v6Var, i);
                    }
                });
            }
            int[] iArr2 = this.f10172a;
            int i2 = iArr2[0] + 1;
            iArr2[0] = i2;
            if (i2 < this.f10173b) {
                s20.this.f30167b.m2270r4().m14783o(new TdApi.GetStickerSet(this.f10174c[this.f10172a[0]]), this);
            } else {
                s20.this.f30167b.m2485dd().post(new Runnable() {
                    @Override
                    public final void run() {
                        s20.C3029d.this.m32046d();
                    }
                });
            }
        }
    }

    public static class C3030e {
        public final int f10175a;
        public final boolean f10176b;
        public ArrayList<C4817v6> f10177c;

        public C3030e(int i, boolean z) {
            this.f10175a = i;
            this.f10176b = z;
        }

        public C3030e m32045a(ArrayList<C4817v6> arrayList) {
            this.f10177c = arrayList;
            return this;
        }
    }

    public s20(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public static boolean m32064nh(TdApi.StickerType stickerType) {
        return stickerType.getConstructor() == -839756573;
    }

    public void m32062ph(TdApi.Object object, final C4817v6 v6Var) {
        if (!m9347Sa()) {
            int i = 0;
            boolean z = object.getConstructor() == -722616727;
            if (z) {
                v6Var.m25160y();
            }
            long c = v6Var.m25182c();
            if (z) {
                i = 2;
            }
            m32095Jh(c, i);
            if (!z) {
                return;
            }
            if (this.f10154D0 == 1) {
                C1379j0.m37332e0(new Runnable() {
                    @Override
                    public final void run() {
                        s20.this.m32063oh(v6Var);
                    }
                }, 1500L);
                return;
            }
            C5324g gVar = this.f10157G0;
            if (gVar != null) {
                gVar.m23256c(v6Var.m25182c());
            }
        }
    }

    public void m32061qh(final C4817v6 v6Var, final TdApi.Object object) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                s20.this.m32062ph(object, v6Var);
            }
        });
    }

    public void m32060rh(long[] jArr) {
        if (!m9347Sa() && !this.f10159I0 && this.f10162L0 != null) {
            m32070hh(jArr);
        }
    }

    public void m32059sh(TdApi.Object object) {
        if (!m9347Sa()) {
            this.f10159I0 = false;
            C1379j0.m37302t0(object);
        }
    }

    public void m32058th(ArrayList arrayList, ArrayList arrayList2) {
        if (!m9347Sa()) {
            this.f10159I0 = false;
            if (this.f10160J0) {
                m32073eh(arrayList, arrayList2);
            } else {
                m32093Kh(arrayList, arrayList2);
            }
        }
    }

    public void m32057uh(final ArrayList arrayList, TdApi.Object object) {
        final ArrayList<C4817v6> arrayList2;
        if (object.getConstructor() == -1883828812) {
            TdApi.StickerSetInfo[] stickerSetInfoArr = ((TdApi.StickerSets) object).sets;
            if (stickerSetInfoArr.length > 0) {
                arrayList2 = new ArrayList<>(stickerSetInfoArr.length);
                for (TdApi.StickerSetInfo stickerSetInfo : stickerSetInfoArr) {
                    C4817v6 v6Var = new C4817v6(this.f30167b, stickerSetInfo);
                    v6Var.m25163v(arrayList2);
                    arrayList2.add(v6Var);
                }
                this.f30167b.m2485dd().post(new Runnable() {
                    @Override
                    public final void run() {
                        s20.this.m32058th(arrayList, arrayList2);
                    }
                });
            }
        }
        arrayList2 = null;
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                s20.this.m32058th(arrayList, arrayList2);
            }
        });
    }

    public void m32056vh(ArrayList arrayList) {
        if (!m9347Sa()) {
            this.f10159I0 = false;
            if (this.f10160J0) {
                m32073eh(arrayList, null);
            } else {
                m32093Kh(arrayList, null);
            }
        }
    }

    public void m32055wh(TdApi.StickerSetInfo stickerSetInfo) {
        if (!m9347Sa() && !this.f10159I0 && this.f10162L0 != null) {
            if (this.f10154D0 == 2) {
                m32075ch(stickerSetInfo);
            } else {
                m32074dh(stickerSetInfo);
            }
        }
    }

    public void m32054xh(TdApi.StickerSetInfo stickerSetInfo) {
        if (!m9347Sa() && !this.f10159I0 && this.f10162L0 != null && this.f10154D0 != 2) {
            m32105Eh(stickerSetInfo.f25424id);
        }
    }

    public void m32053yh(TdApi.StickerSetInfo stickerSetInfo) {
        if (!m9347Sa() && !this.f10159I0 && this.f10162L0 != null && this.f10154D0 != 2) {
            m32105Eh(stickerSetInfo.f25424id);
        }
    }

    public final void m32113Ah(int i, int i2) {
        ArrayList<C4817v6> arrayList;
        if (i != i2 && (arrayList = this.f10162L0) != null) {
            C5062b.m24149w(arrayList, i, i2);
            int kh = i + m32067kh();
            int kh2 = i2 + m32067kh();
            int X1 = ((LinearLayoutManager) m31303kg().getLayoutManager()).m39549X1();
            View C = m31303kg().getLayoutManager().mo39262C(X1);
            int top = C != null ? C.getTop() : 0;
            this.f10156F0.m34111z1(kh, kh2, true);
            ((LinearLayoutManager) m31303kg().getLayoutManager()).m39522z2(X1, top);
        }
    }

    public void m32111Bh() {
        if (!this.f10158H0) {
            this.f10158H0 = true;
            m31303kg().setItemAnimator(new C8731d(C2057b.f7280b, 180L));
        }
    }

    public final void m32109Ch(int i) {
        ArrayList<C4817v6> arrayList = this.f10163M0;
        if (arrayList != null && !arrayList.isEmpty()) {
            C4817v6 remove = this.f10163M0.remove(i);
            C5324g gVar = this.f10157G0;
            if (gVar != null) {
                gVar.m23256c(remove.m25182c());
            }
            if (this.f10163M0.isEmpty()) {
                this.f10156F0.m34204V1(m32068jh() - 2, 4);
            } else {
                this.f10156F0.m34204V1(m32068jh() + i, 1);
            }
        }
    }

    public final void m32063oh(C4817v6 v6Var) {
        if (this.f10162L0 != null) {
            C5324g gVar = this.f10157G0;
            if (gVar != null) {
                gVar.m23256c(v6Var.m25182c());
            }
            int mh = m32065mh(v6Var.m25182c());
            if (mh != -1) {
                this.f10162L0.remove(mh);
                if (this.f10162L0.size() == 0) {
                    m32071gh();
                    return;
                }
                int i = mh + 3;
                this.f10156F0.m34240F0().remove(i);
                this.f10156F0.m39306O(i);
            }
        }
    }

    public final void m32105Eh(long j) {
        int mh = m32065mh(j);
        if (mh != -1) {
            m32103Fh(mh);
        }
    }

    public final void m32103Fh(int i) {
        ArrayList<C4817v6> arrayList = this.f10162L0;
        if (arrayList != null) {
            arrayList.remove(i);
            if (!this.f10162L0.isEmpty()) {
                int kh = i + m32067kh();
                this.f10156F0.m34240F0().remove(kh);
                this.f10156F0.m39306O(kh);
            } else if (this.f10154D0 == 2) {
                this.f10156F0.m34204V1(i + 2, 3);
            } else {
                m32071gh();
            }
        }
    }

    public final void m32101Gh() {
        ArrayList<C4817v6> arrayList = this.f10162L0;
        if (arrayList != null && !arrayList.isEmpty()) {
            long[] jArr = new long[this.f10162L0.size()];
            Iterator<C4817v6> it = this.f10162L0.iterator();
            boolean z = false;
            int i = 0;
            while (it.hasNext()) {
                i++;
                jArr[i] = it.next().m25182c();
            }
            Client r4 = this.f30167b.m2270r4();
            if (this.f10154D0 == 2) {
                z = true;
            }
            r4.m14783o(new TdApi.ReorderInstalledStickerSets(z, jArr), this.f30167b.m2392ja());
        }
    }

    @Override
    public void mo2038H4(int[] iArr, boolean z) {
    }

    public final void m32099Hh(boolean z) {
        ArrayList<long[]> arrayList;
        if (this.f10164N0 != z) {
            this.f10164N0 = z;
            if (!z && (arrayList = this.f10165O0) != null && !arrayList.isEmpty()) {
                do {
                    m32070hh(this.f10165O0.remove(0));
                    if (this.f10165O0.isEmpty()) {
                        return;
                    }
                } while (!this.f10164N0);
            }
        }
    }

    public void m32097Ih(C3030e eVar) {
        super.m9476Ad(eVar);
        this.f10154D0 = eVar.f10175a;
        this.f10155E0 = eVar.f10176b;
        this.f10162L0 = eVar.f10177c;
    }

    public final void m32095Jh(long j, int i) {
        if (this.f10157G0 == null) {
            this.f10157G0 = new C5324g();
        }
        this.f10157G0.m23252g(j, i);
        this.f10156F0.m34149m3(j);
    }

    public void m32093Kh(ArrayList<C4817v6> arrayList, ArrayList<C4817v6> arrayList2) {
        this.f10162L0 = arrayList;
        this.f10163M0 = arrayList2;
        m32071gh();
    }

    @Override
    public int mo407R9() {
        int i = this.f10154D0;
        return i != 1 ? i != 2 ? R.id.controller_stickers : R.id.controller_masks : R.id.controller_stickersArchived;
    }

    @Override
    public void mo2037U3(TdApi.StickerSets stickerSets, int i) {
    }

    @Override
    public void mo2036Z(final TdApi.StickerSetInfo stickerSetInfo) {
        if ((this.f10154D0 == 2 && m32064nh(stickerSetInfo.stickerType)) || (this.f10154D0 == 1 && !m32064nh(stickerSetInfo.stickerType))) {
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    s20.this.m32055wh(stickerSetInfo);
                }
            });
        }
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        this.f30167b.m2781K9().m1786y0(this);
    }

    public final void m32075ch(TdApi.StickerSetInfo stickerSetInfo) {
        ArrayList<C4817v6> arrayList = this.f10163M0;
        if (arrayList == null) {
            this.f10163M0 = new ArrayList<>();
        } else {
            Iterator<C4817v6> it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next().m25182c() == stickerSetInfo.f25424id) {
                    return;
                }
            }
        }
        long j = stickerSetInfo.f25424id;
        String str = stickerSetInfo.title;
        C4817v6 v6Var = new C4817v6(this.f30167b, new TdApi.StickerSetInfo(j, str, str, stickerSetInfo.thumbnail, stickerSetInfo.thumbnailOutline, true, true, stickerSetInfo.isOfficial, stickerSetInfo.stickerType, stickerSetInfo.isViewed, stickerSetInfo.size, stickerSetInfo.covers));
        v6Var.m25163v(this.f10163M0);
        int jh = m32068jh();
        C2964ra N = new C2964ra(26, R.id.btn_stickerSetInfo, 0, 0).m32863N(v6Var.m25182c());
        this.f10163M0.add(0, v6Var);
        if (this.f10163M0.size() == 1) {
            int size = this.f10156F0.m34240F0().size();
            this.f10156F0.m34240F0().add(new C2964ra(8, 0, 0, R.string.Archived));
            this.f10156F0.m34240F0().add(new C2964ra(2));
            this.f10156F0.m34240F0().add(N);
            this.f10156F0.m34240F0().add(new C2964ra(3));
            this.f10156F0.m39308M(size, 4);
            return;
        }
        this.f10156F0.m34240F0().add(jh, N);
        this.f10156F0.m39311J(jh);
    }

    @Override
    public void mo2035d5(TdApi.StickerSet stickerSet) {
        C10965r1.m2045g(this, stickerSet);
    }

    public final void m32074dh(TdApi.StickerSetInfo stickerSetInfo) {
        if (this.f10162L0 != null) {
            long j = stickerSetInfo.f25424id;
            String str = stickerSetInfo.title;
            C4817v6 v6Var = new C4817v6(this.f30167b, new TdApi.StickerSetInfo(j, str, str, stickerSetInfo.thumbnail, stickerSetInfo.thumbnailOutline, stickerSetInfo.isInstalled, true, stickerSetInfo.isOfficial, stickerSetInfo.stickerType, stickerSetInfo.isViewed, stickerSetInfo.size, stickerSetInfo.covers));
            v6Var.m25163v(this.f10162L0);
            this.f10162L0.add(0, v6Var);
            if (this.f10162L0.size() == 1) {
                m32071gh();
                return;
            }
            this.f10156F0.m34240F0().add(3, new C2964ra(26, R.id.btn_stickerSetInfo, 0, 0).m32863N(v6Var.m25182c()));
            this.f10156F0.m39311J(3);
        }
    }

    public void m32073eh(ArrayList<C4817v6> arrayList, ArrayList<C4817v6> arrayList2) {
        ArrayList<C4817v6> arrayList3;
        if (this.f10154D0 == 1 && (arrayList3 = this.f10162L0) != null && !arrayList3.isEmpty() && !arrayList.isEmpty()) {
            this.f10162L0.addAll(arrayList);
            List<C2964ra> F0 = this.f10156F0.m34240F0();
            int size = F0.size() - 1;
            C2964ra remove = F0.remove(size);
            Iterator<C4817v6> it = arrayList.iterator();
            while (it.hasNext()) {
                C4817v6 next = it.next();
                next.m25163v(this.f10162L0);
                F0.add(new C2964ra(26, R.id.btn_stickerSetInfo, 0, 0).m32863N(next.m25182c()));
            }
            F0.add(remove);
            this.f10156F0.m39308M(size, arrayList.size());
        }
    }

    @Override
    public void mo2034f6(final TdApi.StickerSetInfo stickerSetInfo) {
        if ((this.f10154D0 == 2 && m32064nh(stickerSetInfo.stickerType)) || (this.f10154D0 == 1 && !m32064nh(stickerSetInfo.stickerType))) {
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    s20.this.m32053yh(stickerSetInfo);
                }
            });
        }
    }

    public final void m32072fh(C4817v6 v6Var, int i) {
        ArrayList<C4817v6> arrayList = this.f10162L0;
        if (arrayList != null) {
            v6Var.m25163v(arrayList);
            this.f10162L0.add(i, v6Var);
            int X1 = ((LinearLayoutManager) m31303kg().getLayoutManager()).m39549X1();
            View C = m31303kg().getLayoutManager().mo39262C(X1);
            int top = C != null ? C.getTop() : 0;
            C2964ra N = new C2964ra(23, R.id.btn_stickerSetInfo, 0, 0).m32863N(v6Var.m25182c());
            if (this.f10162L0.size() != 1 || this.f10154D0 == 0) {
                int kh = i + m32067kh();
                this.f10156F0.m34240F0().add(kh, N);
                this.f10156F0.m39311J(kh);
            } else {
                int i2 = i + 2;
                this.f10156F0.m34240F0().add(i2, new C2964ra(3));
                this.f10156F0.m34240F0().add(i2, N);
                this.f10156F0.m34240F0().add(i2, new C2964ra(2));
                this.f10156F0.m39308M(i2, 3);
            }
            ((LinearLayoutManager) m31303kg().getLayoutManager()).m39522z2(X1, top);
        }
    }

    public final void m32071gh() {
        ArrayList<C4817v6> arrayList;
        ArrayList<C4817v6> arrayList2;
        ArrayList<C4817v6> arrayList3 = this.f10162L0;
        ArrayList arrayList4 = new ArrayList(Math.max(0, arrayList3 != null ? (arrayList3.size() * 2) - 1 : 0));
        if (!this.f10162L0.isEmpty() || ((arrayList2 = this.f10163M0) != null && !arrayList2.isEmpty())) {
            int i = this.f10154D0;
            if (i == 1) {
                arrayList4.add(new C2964ra(14));
                arrayList4.add(new C2964ra(9, 0, 0, (CharSequence) C4403w.m27865j1(R.string.ArchivedStickersInfo, C1363c0.m37437f(this.f30167b.m2913C5())), false));
                arrayList4.add(new C2964ra(2));
            } else if (i == 2) {
                arrayList4.add(new C2964ra(14));
                arrayList4.add(new C2964ra(9, 0, 0, R.string.MasksHint));
                if (!this.f10162L0.isEmpty()) {
                    arrayList4.add(new C2964ra(2));
                }
            }
            if (this.f10154D0 == 1) {
                Iterator<C4817v6> it = this.f10162L0.iterator();
                while (it.hasNext()) {
                    arrayList4.add(new C2964ra(26, R.id.btn_stickerSetInfo, 0, 0).m32863N(it.next().m25182c()));
                }
            } else {
                Iterator<C4817v6> it2 = this.f10162L0.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(new C2964ra(23, R.id.btn_stickerSetInfo, 0, 0).m32863N(it2.next().m25182c()));
                }
            }
            if (!this.f10162L0.isEmpty()) {
                arrayList4.add(new C2964ra(3));
            }
            if (this.f10154D0 == 2 && (arrayList = this.f10163M0) != null && !arrayList.isEmpty()) {
                arrayList4.add(new C2964ra(8, 0, 0, R.string.Archived));
                arrayList4.add(new C2964ra(2));
                Iterator<C4817v6> it3 = this.f10163M0.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(new C2964ra(26, R.id.btn_stickerSetInfo, 0, 0).m32863N(it3.next().m25182c()));
                }
                arrayList4.add(new C2964ra(3));
            }
            if (this.f10154D0 == 0) {
                arrayList4.add(new C2964ra(9, 0, 0, (CharSequence) C4403w.m27865j1(R.string.ArchivedStickersInfo, C1363c0.m37437f(this.f30167b.m2913C5())), false));
            }
        } else {
            int i2 = this.f10154D0;
            if (i2 == 1) {
                arrayList4.add(new C2964ra(24, 0, 0, (CharSequence) C4403w.m27865j1(R.string.ArchivedStickersInfo, C1363c0.m37437f(this.f30167b.m2913C5())), false));
            } else {
                arrayList4.add(new C2964ra(24, 0, 0, i2 == 0 ? R.string.NoStickerSets : R.string.NoMasks));
            }
        }
        this.f10156F0.m34116x2(arrayList4, false);
    }

    public final void m32070hh(long[] jArr) {
        if (this.f10154D0 == 1) {
            for (long j : jArr) {
                m32105Eh(j);
            }
        } else if (this.f10164N0) {
            if (this.f10165O0 == null) {
                this.f10165O0 = new ArrayList<>();
            }
            this.f10165O0.add(jArr);
        } else {
            ArrayList<C4817v6> arrayList = this.f10162L0;
            if ((arrayList == null || arrayList.isEmpty()) && this.f10154D0 != 2) {
                m32052zh(false);
                return;
            }
            C6035e eVar = new C6035e();
            Iterator<C4817v6> it = this.f10162L0.iterator();
            while (it.hasNext()) {
                C4817v6 next = it.next();
                eVar.m21500k(next.m25182c(), next);
            }
            C6035e eVar2 = new C6035e(jArr.length);
            C6035e eVar3 = null;
            C5322e eVar4 = null;
            boolean z = false;
            int i = 0;
            int i2 = 0;
            int i3 = -1;
            for (long j2 : jArr) {
                if (((C4817v6) eVar.m21505f(j2)) != null) {
                    eVar.m21499l(j2);
                    if (eVar3 == null) {
                        eVar3 = new C6035e(5);
                    }
                    eVar3.m21500k(j2, Integer.valueOf(i));
                    i++;
                } else if (!z) {
                    i3++;
                    if (i2 != i3) {
                        z = true;
                    } else {
                        if (eVar4 == null) {
                            eVar4 = new C5322e(5);
                        }
                        eVar4.m23275a(j2);
                    }
                }
                eVar2.m21500k(j2, Integer.valueOf(i2));
                i2++;
            }
            ArrayList<C4817v6> arrayList2 = this.f10163M0;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                for (int size = this.f10163M0.size() - 1; size >= 0; size--) {
                    if (((Integer) eVar2.m21504g(this.f10163M0.get(size).m25182c(), -1)).intValue() != -1) {
                        m32109Ch(size);
                    }
                }
            }
            int p = eVar.m21496p();
            for (int i4 = 0; i4 < p; i4++) {
                m32105Eh(((C4817v6) eVar.m21495q(i4)).m25182c());
            }
            if (eVar3 != null && !this.f10162L0.isEmpty()) {
                for (int i5 = 0; i5 < eVar3.m21496p(); i5++) {
                    long j3 = eVar3.m21501j(i5);
                    int intValue = ((Integer) eVar3.m21495q(i5)).intValue();
                    int mh = m32065mh(j3);
                    if (mh != -1) {
                        if (mh != intValue) {
                            m32113Ah(mh, intValue);
                        }
                    } else {
                        throw new RuntimeException();
                    }
                }
            }
            if (z) {
                m32052zh(false);
            } else if (eVar4 != null) {
                m32099Hh(true);
                long[] g = eVar4.m23269g();
                int[] iArr = new int[2];
                this.f30167b.m2270r4().m14783o(new TdApi.GetStickerSet(g[iArr[0]]), new C3029d(iArr, eVar4.m23264l(), g));
            }
        }
    }

    public final C4817v6 m32069ih(long j) {
        ArrayList<C4817v6> arrayList = this.f10162L0;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<C4817v6> it = this.f10162L0.iterator();
            while (it.hasNext()) {
                C4817v6 next = it.next();
                if (next.m25182c() == j) {
                    return next;
                }
            }
        }
        ArrayList<C4817v6> arrayList2 = this.f10163M0;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return null;
        }
        Iterator<C4817v6> it2 = this.f10163M0.iterator();
        while (it2.hasNext()) {
            C4817v6 next2 = it2.next();
            if (next2.m25182c() == j) {
                return next2;
            }
        }
        return null;
    }

    @Override
    public void mo2033j3(int[] iArr) {
    }

    public final int m32068jh() {
        int kh = m32067kh();
        ArrayList<C4817v6> arrayList = this.f10162L0;
        return kh + (arrayList != null ? arrayList.size() + 3 : 1);
    }

    @Override
    public void mo2032k(final long[] jArr, boolean z) {
        int i = this.f10154D0;
        if ((i == 2 && z) || (i == 0 && !z)) {
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    s20.this.m32060rh(jArr);
                }
            });
        }
    }

    public final int m32067kh() {
        ArrayList<C4817v6> arrayList = this.f10162L0;
        if (arrayList == null || this.f10154D0 == 0) {
            return 0;
        }
        return arrayList.isEmpty() ? 1 : 3;
    }

    public final int m32066lh(C4817v6 v6Var) {
        C5324g gVar = this.f10157G0;
        if (gVar != null) {
            return gVar.m23254e(v6Var.m25182c(), 0);
        }
        return 0;
    }

    public final int m32065mh(long j) {
        ArrayList<C4817v6> arrayList = this.f10162L0;
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

    @Override
    public void onClick(View view) {
        C4817v6 ih;
        C5324g gVar;
        int id2 = view.getId();
        if (id2 == R.id.btn_double) {
            final C4817v6 ih2 = m32069ih(((C2964ra) ((ViewGroup) view.getParent()).getTag()).m32832m());
            if (ih2 != null && m32066lh(ih2) == 0) {
                m32095Jh(ih2.m25182c(), 1);
                this.f30167b.m2270r4().m14783o(new TdApi.ChangeStickerSet(ih2.m25182c(), true, false), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        s20.this.m32061qh(ih2, object);
                    }
                });
            }
        } else if (id2 != R.id.btn_stickerSetInfo || (ih = m32069ih(((C2964ra) view.getTag()).m32832m())) == null) {
        } else {
            if (this.f10154D0 != 1 || (gVar = this.f10157G0) == null || gVar.m23254e(ih.m25182c(), 0) != 2) {
                View$OnClickListenerC2096i.m35618X1(this, ih.m25181d()).m35620V1();
            }
        }
    }

    @Override
    public void mo30633rg(Context context, CustomRecyclerView customRecyclerView) {
        this.f10156F0 = new C3026a(this);
        int i = this.f10154D0;
        if (i == 0 || i == 2) {
            if (i == 0) {
                customRecyclerView.setItemAnimator(null);
            }
            new C0962g(new C3027b()).m38809m(customRecyclerView);
        }
        if (this.f10154D0 == 1) {
            customRecyclerView.m39422k(new C3028c());
        }
        if (this.f10162L0 != null) {
            m32071gh();
        } else if (!this.f10155E0) {
            m32052zh(false);
        }
        int i2 = this.f10154D0;
        if (i2 == 0 || i2 == 2 || i2 == 1) {
            this.f30167b.m2781K9().m1838l0(this);
        }
        customRecyclerView.setAdapter(this.f10156F0);
    }

    @Override
    public void mo255t2(final TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1883828812) {
            TdApi.StickerSetInfo[] stickerSetInfoArr = ((TdApi.StickerSets) object).sets;
            final ArrayList<C4817v6> arrayList = new ArrayList<>(stickerSetInfoArr.length);
            int i = this.f10154D0;
            int i2 = 0;
            if (i == 0) {
                int length = stickerSetInfoArr.length;
                while (i2 < length) {
                    TdApi.StickerSetInfo stickerSetInfo = stickerSetInfoArr[i2];
                    if (!stickerSetInfo.isArchived) {
                        C4817v6 v6Var = new C4817v6(this.f30167b, stickerSetInfo);
                        v6Var.m25163v(arrayList);
                        arrayList.add(v6Var);
                    }
                    i2++;
                }
            } else if (i == 1) {
                int length2 = stickerSetInfoArr.length;
                while (i2 < length2) {
                    TdApi.StickerSetInfo stickerSetInfo2 = stickerSetInfoArr[i2];
                    if (stickerSetInfo2.isArchived) {
                        C4817v6 v6Var2 = new C4817v6(this.f30167b, stickerSetInfo2);
                        v6Var2.m25163v(arrayList);
                        arrayList.add(v6Var2);
                    }
                    i2++;
                }
            } else if (i == 2) {
                int length3 = stickerSetInfoArr.length;
                while (i2 < length3) {
                    C4817v6 v6Var3 = new C4817v6(this.f30167b, stickerSetInfoArr[i2]);
                    v6Var3.m25163v(arrayList);
                    arrayList.add(v6Var3);
                    i2++;
                }
            }
            arrayList.trimToSize();
            if (this.f10154D0 == 2) {
                this.f30167b.m2270r4().m14783o(new TdApi.GetArchivedStickerSets(true, 0L, 100), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object2) {
                        s20.this.m32057uh(arrayList, object2);
                    }
                });
            } else {
                this.f30167b.m2485dd().post(new Runnable() {
                    @Override
                    public final void run() {
                        s20.this.m32056vh(arrayList);
                    }
                });
            }
        } else if (constructor == -1679978726) {
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    s20.this.m32059sh(object);
                }
            });
        }
    }

    @Override
    public void mo2031y0(final TdApi.StickerSetInfo stickerSetInfo) {
        if ((this.f10154D0 == 2 && m32064nh(stickerSetInfo.stickerType)) || (this.f10154D0 == 1 && !m32064nh(stickerSetInfo.stickerType))) {
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    s20.this.m32054xh(stickerSetInfo);
                }
            });
        }
    }

    public final void m32052zh(boolean z) {
        int i;
        long j;
        if (this.f10159I0) {
            return;
        }
        if (!z || !this.f10161K0) {
            this.f10159I0 = true;
            this.f10160J0 = z;
            int i2 = this.f10154D0;
            if (i2 != 0) {
                if (i2 == 1) {
                    if (z) {
                        ArrayList<C4817v6> arrayList = this.f10162L0;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            ArrayList<C4817v6> arrayList2 = this.f10162L0;
                            j = arrayList2.get(arrayList2.size() - 1).m25182c();
                            i = 100;
                        } else {
                            return;
                        }
                    } else {
                        j = 0;
                        i = C1357a0.m37548b(C1357a0.m37541i(72.0f), 20);
                    }
                    this.f30167b.m2270r4().m14783o(new TdApi.GetArchivedStickerSets(false, j, i), this);
                } else if (i2 == 2 && !z) {
                    this.f30167b.m2270r4().m14783o(new TdApi.GetInstalledStickerSets(true), this);
                }
            } else if (!z) {
                this.f30167b.m2270r4().m14783o(new TdApi.GetInstalledStickerSets(false), this);
            }
        }
    }
}
