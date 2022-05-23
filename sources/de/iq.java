package de;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.j0;
import ce.y;
import com.googlecode.mp4parser.boxes.microsoft.XtraBox;
import de.ap;
import de.g6;
import eb.k;
import ed.o;
import gb.c;
import gd.w;
import hd.a1;
import hd.c1;
import ib.i;
import ie.d0;
import ie.k0;
import ie.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k0.h;
import kb.d;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.c2;
import ne.d2;
import ne.d3;
import ne.e2;
import ne.e3;
import ne.f3;
import ne.g1;
import ne.k3;
import ne.l3;
import ne.n0;
import ne.n2;
import ne.o2;
import ne.p0;
import ne.q0;
import ne.r3;
import ne.t;
import ne.v1;
import ne.x2;
import ne.y1;
import ne.y3;
import oc.v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import org.thunderdog.challegram.widget.EmbeddableStickerView;
import pc.f;
import pc.r;
import tc.f;
import tc.k2;
import td.e;
import ud.o0;
import ud.v4;
import vc.n;
import vc.z0;
import zd.d9;
import zd.o6;
import zd.s1;
import zd.t1;
import zd.w6;

public class iq extends RecyclerView.h<ap> implements f, k3.b, y1.e, k.b, t1.a, w.a, y1.h, x, e.a, c2.a, t.a {
    public final Context M;
    public final o6 N;
    public final List<RecyclerView> O;
    public final View.OnClickListener P;
    public final List<ra> Q;
    public View.OnLongClickListener R;
    public v4<?> S;
    public boolean T;
    public e U;
    public g1.c V;
    public v4<?> W;
    public RecyclerView.t X;
    public c.a Y;
    public boolean Z;
    public d0 f8313a0;
    public k3.c f8314b0;
    public f.i f8315c0;
    public boolean f8316d0;
    public float f8317e0;
    public int f8318f0;
    public int f8319g0;
    public k f8320h0;
    public boolean f8321i0;
    public k.b f8322j0;
    public SparseIntArray f8323k0;
    public h<String> f8324l0;

    public class a extends RecyclerView.t {
        public final int f8325a;
        public final View f8326b;

        public a(int i10, View view) {
            this.f8325a = i10;
            this.f8326b = view;
        }

        @Override
        public void b(RecyclerView recyclerView, int i10, int i11) {
            float f10;
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int X1 = linearLayoutManager.X1();
            if (X1 != -1) {
                if (X1 == 0) {
                    int i12 = 0;
                    View C = linearLayoutManager.C(0);
                    if (C != null) {
                        i12 = -C.getTop();
                    }
                    f10 = ib.h.d(i12 / this.f8325a);
                } else {
                    f10 = 1.0f;
                }
                this.f8326b.setAlpha(f10);
            }
        }
    }

    public class b extends RecyclerView.t {
        public b() {
        }

        @Override
        public void b(RecyclerView recyclerView, int i10, int i11) {
            View C;
            int X1 = ((LinearLayoutManager) recyclerView.getLayoutManager()).X1();
            int left = (X1 == -1 || (C = recyclerView.getLayoutManager().C(X1)) == null) ? 0 : C.getLeft();
            ra raVar = (ra) recyclerView.getTag();
            if (raVar.b()) {
                raVar.R(X1, left);
            }
        }
    }

    public static class c extends RecyclerView.o {
        public int f8329a;

        public c(int i10) {
            this.f8329a = i10;
        }

        @Override
        public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
            Object tag;
            Paint g10 = y.g(j.L(this.f8329a));
            int childCount = recyclerView.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = recyclerView.getChildAt(i10);
                if (childAt != null && (tag = childAt.getTag()) != null && (tag instanceof ra) && l((ra) tag)) {
                    canvas.drawRect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), g10);
                }
            }
        }

        public boolean l(ra raVar) {
            int A = raVar.A();
            return A == 2 || A == 3 || A == 8 || A == 61 || A == 70;
        }
    }

    public interface d {
        int a(ra raVar);
    }

    public interface e {
        void N5(int i10, ra raVar, y1 y1Var, String str);
    }

    public iq(v4<?> v4Var) {
        this(v4Var, v4Var instanceof View.OnClickListener ? (View.OnClickListener) v4Var : null, v4Var);
        if (v4Var instanceof View.OnLongClickListener) {
            B2((View.OnLongClickListener) v4Var);
        }
    }

    public static boolean X0(int i10) {
        return i10 == 12 || i10 == 13 || i10 == 47 || i10 == 69 || i10 == 77 || i10 == 85 || i10 == 88 || i10 == 80 || i10 == 81 || i10 == 98 || i10 == 99;
    }

    public static boolean Z0(ra raVar, ra raVar2) {
        return raVar2 == raVar;
    }

    public static boolean a1(Object obj, ra raVar) {
        return raVar.d() == obj;
    }

    public static boolean b1(int i10, ra raVar) {
        return raVar.j() == i10;
    }

    public static boolean c1(int i10, int i11, ra raVar) {
        return raVar.j() == i10 && raVar.l() == i11;
    }

    public static boolean d1(int i10, ra raVar) {
        return raVar.j() == i10;
    }

    public static boolean e1(long j10, ra raVar) {
        return raVar.m() == j10;
    }

    public static boolean f1(String str, ra raVar) {
        return str.equals(raVar.v());
    }

    public static boolean g1(int i10, ra raVar) {
        return raVar.A() == i10;
    }

    public static int h1(kb.d dVar, ra raVar) {
        if (dVar.a(raVar)) {
            return t3(raVar);
        }
        return 1;
    }

    public static int t3(ra raVar) {
        int A = raVar.A();
        if (!(ap.U(A) || A == 1 || A == 23 || A == 26)) {
            if (A == 31 || A == 34) {
                return -1;
            }
            if (A != 42) {
                if (A == 68) {
                    return -1;
                }
                if (!(A == 70 || A == 93 || A == 110 || A == 61)) {
                    if (A == 62 || A == 65 || A == 66 || A == 95 || A == 96) {
                        return -1;
                    }
                    switch (A) {
                        case 8:
                        case 9:
                        case 10:
                            break;
                        default:
                            switch (A) {
                                case 56:
                                    return -1;
                                case 57:
                                case 58:
                                    break;
                                default:
                                    return raVar.C() ? 0 : 1;
                            }
                    }
                }
            }
        }
        return 0;
    }

    public h<String> A0() {
        if (this.f8324l0 == null) {
            this.f8324l0 = new h<>();
        }
        return this.f8324l0;
    }

    public void Q(ap apVar, int i10) {
        s3(apVar, i10, apVar.n());
    }

    public void A2() {
        this.Z = true;
    }

    public d0 B0() {
        return this.f8313a0;
    }

    public ap S(ViewGroup viewGroup, int i10) {
        if (i10 == 32) {
            return S0(viewGroup);
        }
        if (i10 <= -1) {
            return T0(viewGroup, (-1) - i10);
        }
        return ap.Q(this.M, this.N, i10, this, this.P, this.R, this.W, this.X, this.Y);
    }

    public void B2(View.OnLongClickListener onLongClickListener) {
        this.R = onLongClickListener;
    }

    public ra C0(int i10) {
        if (i10 < 0 || i10 >= this.Q.size()) {
            return null;
        }
        return this.Q.get(i10);
    }

    public void C1(ra raVar, ViewGroup viewGroup, y1 y1Var, o2 o2Var) {
    }

    public void C2(ra raVar, int i10, k2 k2Var, boolean z10) {
    }

    @Override
    public int D() {
        return this.Q.isEmpty() ? this.Z ? 0 : 1 : this.Q.size();
    }

    public List<ra> D0() {
        return this.Q;
    }

    public void D1(ra raVar, k3 k3Var, int i10, int i11) {
    }

    public void D2(ra raVar, RecyclerView recyclerView, boolean z10) {
    }

    public k3.c E0() {
        return this.f8314b0;
    }

    public void V(ap apVar) {
        apVar.P();
    }

    public final void E2(float f10) {
        if (this.f8317e0 != f10) {
            this.f8317e0 = f10;
            for (RecyclerView recyclerView : this.O) {
                for (int i10 = this.f8318f0; i10 <= this.f8319g0; i10++) {
                    View C = recyclerView.getLayoutManager().C(i10);
                    if (C != null && (C instanceof cd.a)) {
                        ((cd.a) C).setSelectableFactor(f10);
                    }
                }
            }
        }
    }

    @Override
    public int F(int i10) {
        if (this.Q.isEmpty()) {
            return 15;
        }
        return this.Q.get(i10).A();
    }

    public int F0(ra raVar) {
        return G0(raVar, 0);
    }

    public void W(ap apVar) {
        apVar.T();
    }

    public void F2(ra raVar, int i10, d3 d3Var) {
        d3Var.c(a0.i(72.0f), 0.0f);
    }

    public int G0(final ra raVar, int i10) {
        return I0(new kb.d() {
            @Override
            public final boolean a(Object obj) {
                boolean Z0;
                Z0 = iq.Z0(ra.this, (ra) obj);
                return Z0;
            }
        }, i10, false);
    }

    public void X(ap apVar) {
        apVar.S();
    }

    public final void G2(ra raVar, int i10, RelativeLayout relativeLayout, boolean z10) {
        H2(raVar, i10, relativeLayout, z10, (TextView) relativeLayout.getChildAt(0), (TextView) relativeLayout.getChildAt(1), (TextView) relativeLayout.getChildAt(2), (TextView) relativeLayout.getChildAt(3), (n2) relativeLayout.getChildAt(4), raVar.A() == 76 ? (ne.d) relativeLayout.getChildAt(5) : null, raVar.A() == 16 ? (ImageView) relativeLayout.getChildAt(5) : null, raVar.A() == 16 ? (TextView) relativeLayout.getChildAt(6) : null, raVar.A() == 16 ? (TextView) relativeLayout.getChildAt(7) : null);
    }

    public int H0(kb.d<ra> dVar) {
        return I0(dVar, -1, false);
    }

    public boolean H1(View view) {
        ra raVar = (ra) view.getTag();
        return raVar != null && I1(view, raVar, S2(view));
    }

    public void H2(ra raVar, int i10, RelativeLayout relativeLayout, boolean z10, TextView textView, TextView textView2, TextView textView3, TextView textView4, n2 n2Var, ne.d dVar, ImageView imageView, TextView textView5, TextView textView6) {
    }

    public int I0(kb.d<ra> dVar, int i10, boolean z10) {
        if (z10) {
            for (int size = i10 == -1 ? this.Q.size() - 1 : Math.min(this.Q.size() - 1, i10); size >= 0; size--) {
                if (dVar.a(this.Q.get(size))) {
                    return size;
                }
            }
        } else if (i10 <= 0) {
            int i11 = 0;
            for (ra raVar : this.Q) {
                if (dVar.a(raVar)) {
                    return i11;
                }
                i11++;
            }
        } else {
            while (i10 < this.Q.size()) {
                if (dVar.a(this.Q.get(i10))) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    public boolean I1(View view, ra raVar, boolean z10) {
        SparseIntArray sparseIntArray;
        int i10;
        h<String> hVar;
        h<String> hVar2;
        SparseIntArray sparseIntArray2;
        if (z10) {
            if (raVar.v() == null) {
                int A = raVar.A();
                int i11 = ((A == 13 || A == 85 || A == 98) && (sparseIntArray2 = this.f8323k0) != null) ? sparseIntArray2.get(raVar.c()) : 0;
                if (raVar.j() != i11) {
                    raVar.S(true);
                    K1(raVar.c(), raVar.j());
                    Z2(raVar.j(), true);
                    if (i11 != 0) {
                        ra x02 = x0(i11);
                        if (x02 != null) {
                            x02.S(false);
                        }
                        Z2(i11, false);
                    }
                }
            } else {
                int A2 = raVar.A();
                String str = null;
                if ((A2 == 13 || A2 == 85 || A2 == 98) && (hVar2 = this.f8324l0) != null) {
                    str = hVar2.e(raVar.c());
                }
                if (!i.c(raVar.v(), str)) {
                    raVar.S(true);
                    L1(raVar.c(), raVar.v());
                    a3(raVar.v(), true);
                    if (str != null) {
                        ra w02 = w0(str);
                        if (w02 != null) {
                            w02.S(false);
                        }
                        a3(str, false);
                    }
                }
            }
        } else if (raVar.v() == null || (hVar = this.f8324l0) == null) {
            if (!(raVar.v() != null || (sparseIntArray = this.f8323k0) == null || (i10 = sparseIntArray.get(raVar.c())) == 0)) {
                ra x03 = x0(i10);
                if (x03 != null) {
                    x03.S(false);
                }
                this.f8323k0.delete(raVar.c());
            }
        } else if (hVar.e(raVar.c()) != null) {
            ra w03 = w0(raVar.v());
            if (w03 != null) {
                w03.S(false);
            }
            this.f8324l0.k(raVar.c());
            return true;
        }
        return true;
    }

    public void I2(ra raVar, f3 f3Var) {
    }

    public int J0(Object obj) {
        return K0(obj, 0);
    }

    public void J2(k3.c cVar) {
        this.f8314b0 = cVar;
    }

    public int K0(final Object obj, int i10) {
        return I0(new kb.d() {
            @Override
            public final boolean a(Object obj2) {
                boolean a12;
                a12 = iq.a1(obj, (ra) obj2);
                return a12;
            }
        }, i10, false);
    }

    public final void K1(int i10, int i11) {
        if (this.f8323k0 == null) {
            this.f8323k0 = new SparseIntArray();
        }
        this.f8323k0.put(i10, i11);
    }

    public void K2(ra raVar, k3 k3Var) {
        k3Var.j(raVar.u(), raVar.t(), raVar.s());
    }

    public int L0(int i10) {
        return M0(i10, -1);
    }

    public final void L1(int i10, String str) {
        if (this.f8324l0 == null) {
            this.f8324l0 = new h<>();
        }
        this.f8324l0.j(i10, str);
    }

    public void L2(ra raVar, int i10, p0 p0Var, boolean z10, boolean z11) {
    }

    public int M0(final int i10, int i11) {
        return I0(new kb.d() {
            @Override
            public final boolean a(Object obj) {
                boolean b12;
                b12 = iq.b1(i10, (ra) obj);
                return b12;
            }
        }, i11, false);
    }

    public void M2(ra raVar, e3 e3Var, boolean z10) {
    }

    public int N0(final int i10, final int i11) {
        return H0(new kb.d() {
            @Override
            public final boolean a(Object obj) {
                boolean c12;
                c12 = iq.c1(i10, i11, (ra) obj);
                return c12;
            }
        });
    }

    public void j1(final int i10) {
        if (V0()) {
            j0.d0(new Runnable() {
                @Override
                public final void run() {
                    iq.this.j1(i10);
                }
            });
            return;
        }
        this.Q.remove(i10);
        O(i10);
    }

    public void N2(ra raVar, n0 n0Var, boolean z10) {
        n0Var.w(raVar.u(), null, false);
    }

    public int O0(final int i10) {
        return I0(new kb.d() {
            @Override
            public final boolean a(Object obj) {
                boolean d12;
                d12 = iq.d1(i10, (ra) obj);
                return d12;
            }
        }, -1, true);
    }

    public void k1(final int i10) {
        if (V0()) {
            j0.d0(new Runnable() {
                @Override
                public final void run() {
                    iq.this.k1(i10);
                }
            });
            return;
        }
        int L0 = L0(i10);
        if (L0 != -1) {
            this.Q.remove(L0);
            O(L0);
        }
    }

    public void O2(e eVar) {
        this.U = eVar;
    }

    @Override
    public void P(RecyclerView recyclerView) {
        this.O.add(recyclerView);
    }

    public int P0(final long j10) {
        return H0(new kb.d() {
            @Override
            public final boolean a(Object obj) {
                boolean e12;
                e12 = iq.e1(j10, (ra) obj);
                return e12;
            }
        });
    }

    public void l1(final long j10) {
        if (V0()) {
            j0.d0(new Runnable() {
                @Override
                public final void run() {
                    iq.this.l1(j10);
                }
            });
            return;
        }
        int P0 = P0(j10);
        if (P0 != -1) {
            this.Q.remove(P0);
            O(P0);
        }
    }

    public void P2(ra raVar, boolean z10) {
        I1(null, raVar, z10);
        if (!z10) {
            Z2(raVar.j(), false);
        }
    }

    public int Q0(final String str) {
        return H0(new kb.d() {
            @Override
            public final boolean a(Object obj) {
                boolean f12;
                f12 = iq.f1(str, (ra) obj);
                return f12;
            }
        });
    }

    public void Q2(ra raVar, int i10, o oVar, boolean z10) {
    }

    @Override
    public void Q5(int i10, int i11) {
        if (i10 == 0 || i10 == 1) {
            w1();
        } else if (i10 == 2) {
            z1(i11);
        }
    }

    public int R0(final int i10) {
        return H0(new kb.d() {
            @Override
            public final boolean a(Object obj) {
                boolean g12;
                g12 = iq.g1(i10, (ra) obj);
                return g12;
            }
        });
    }

    public void R1(int i10, int i11) {
        for (int i12 = (i10 + i11) - 1; i12 >= i10; i12--) {
            this.Q.remove(i12);
        }
        N(i10, i11);
    }

    public void R2(ra raVar, uc.c cVar, boolean z10) {
    }

    public ap S0(ViewGroup viewGroup) {
        throw new RuntimeException("Stub!");
    }

    public void S1(List<ra> list) {
        int D = D();
        this.Q.clear();
        if (list != null) {
            this.Q.addAll(list);
        }
        v0.w2(this, D);
    }

    public boolean S2(View view) {
        return T2(view, view.getTag() instanceof ra ? (ra) view.getTag() : x0(view.getId()));
    }

    @Override
    public void T(RecyclerView recyclerView) {
        this.O.remove(recyclerView);
    }

    public ap T0(ViewGroup viewGroup, int i10) {
        throw new RuntimeException("Stub!");
    }

    public int T1() {
        SparseIntArray sparseIntArray = this.f8323k0;
        if (sparseIntArray != null) {
            sparseIntArray.clear();
        }
        h<String> hVar = this.f8324l0;
        if (hVar != null) {
            hVar.b();
        }
        boolean z10 = false;
        int i10 = 0;
        int i11 = -1;
        for (ra raVar : this.Q) {
            if (raVar.A() == 30) {
                K1(raVar.j(), raVar.s());
            } else if (raVar.D()) {
                if (raVar.v() != null) {
                    L1(raVar.c(), raVar.v());
                } else {
                    K1(raVar.c(), raVar.j());
                }
                if (!z10) {
                    if (i11 == -1) {
                        i11 = i10;
                    } else {
                        z10 = true;
                        i11 = -1;
                    }
                }
            }
            i10++;
        }
        return i11;
    }

    public boolean T2(View view, ra raVar) {
        if (view == null) {
            return false;
        }
        if (raVar == null && (view.getTag() instanceof ra)) {
            raVar = (ra) view.getTag();
        }
        if (raVar == null) {
            return false;
        }
        boolean z10 = view instanceof uc.c;
        if (z10) {
            uc.c cVar = (uc.c) view;
            if (cVar.getToggler() != null) {
                return cVar.f2();
            }
        }
        int A = raVar.A();
        if (A != 12) {
            if (A != 13) {
                if (!(A == 47 || A == 69 || A == 77)) {
                    if (A != 85) {
                        if (A == 88 || A == 80) {
                            return z10 && ((uc.d) ((FrameLayoutFix) view).getChildAt(0)).t(true);
                        }
                        if (A != 81) {
                            if (A != 98) {
                                if (A != 99) {
                                    return false;
                                }
                            }
                        } else if (!(view instanceof o0)) {
                            return false;
                        } else {
                            o0 o0Var = (o0) view;
                            return o0Var.L0() && o0Var.o1(true);
                        }
                    }
                }
            }
            if (!z10) {
                return false;
            }
            o2 o2Var = (o2) ((uc.c) view).getChildAt(0);
            if (!o2Var.a()) {
                o2Var.f();
            }
            return true;
        }
        return z10 && ((ne.w) ((uc.c) view).getChildAt(0)).h();
    }

    public final void U0(ra raVar, CustomRecyclerView customRecyclerView) {
        boolean z10 = customRecyclerView.getAdapter() == null;
        if (z10) {
            customRecyclerView.k(new b());
        }
        int g10 = raVar.g();
        int o10 = raVar.o();
        if (g10 != -1) {
            ((LinearLayoutManager) customRecyclerView.getLayoutManager()).z2(g10, o10);
        } else {
            ((LinearLayoutManager) customRecyclerView.getLayoutManager()).z2(0, 0);
        }
        D2(raVar, customRecyclerView, z10);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) customRecyclerView.getLayoutManager();
        if (linearLayoutManager.m2() != w.G2()) {
            linearLayoutManager.B2(w.G2());
        }
    }

    public void U1(int i10) {
        int L0 = L0(i10);
        if (L0 != -1) {
            V1(L0);
        }
    }

    public void U2() {
        int i10 = 0;
        for (ra raVar : this.Q) {
            int A = raVar.A();
            if (A == 16 || A == 76) {
                g3(i10);
            }
            i10++;
        }
    }

    public final boolean V0() {
        for (RecyclerView recyclerView : this.O) {
            if (recyclerView.C0()) {
                return true;
            }
        }
        return false;
    }

    public void V1(int i10) {
        if (i10 != -1) {
            for (RecyclerView recyclerView : this.O) {
                View C = recyclerView.getLayoutManager().C(i10);
                if (C != null && (C instanceof RecyclerView)) {
                    ((LinearLayoutManager) ((RecyclerView) C).getLayoutManager()).z2(0, 0);
                }
            }
        }
    }

    public void V2() {
        if (!this.Q.isEmpty()) {
            int i10 = 0;
            for (ra raVar : this.Q) {
                if (ap.U(raVar.A())) {
                    r3(i10);
                }
                i10++;
            }
        }
    }

    public boolean W0() {
        return this.f8316d0;
    }

    public void W1(ra raVar, TextView textView, boolean z10) {
        textView.setText(raVar.u());
    }

    public void X1(ra raVar, x2 x2Var, boolean z10) {
        String upperCase = raVar.u() != null ? raVar.u().toString().toUpperCase() : null;
        if (z10) {
            x2Var.a(upperCase);
        } else {
            ce.p0.c0(x2Var, upperCase);
        }
    }

    public void X2(kb.d<ra> dVar) {
        int i10 = 0;
        for (ra raVar : this.Q) {
            if (dVar.a(raVar)) {
                r3(i10);
            }
            i10++;
        }
    }

    public void Y1(ra raVar, int i10, ne.o oVar) {
    }

    public void Y2(int i10) {
        int i11 = -1;
        while (true) {
            i11 = M0(i10, i11 + 1);
            if (i11 != -1) {
                r3(i11);
            } else {
                return;
            }
        }
    }

    public void Z1(ra raVar, y3 y3Var) {
    }

    public void Z2(int i10, boolean z10) {
        int L0 = L0(i10);
        if (L0 != -1) {
            b2(L0, z10);
        }
    }

    public void a2(ra raVar, int i10, n nVar) {
    }

    public void a3(String str, boolean z10) {
        int Q0 = Q0(str);
        if (Q0 != -1) {
            b2(Q0, z10);
        }
    }

    public final void b2(int i10, boolean z10) {
        int A;
        this.Q.get(i10).S(z10);
        boolean z11 = false;
        for (RecyclerView recyclerView : this.O) {
            View C = recyclerView.getLayoutManager().C(i10);
            if (C != null) {
                if (C instanceof uc.c) {
                    uc.c cVar = (uc.c) C;
                    if (cVar.getChildCount() > 0 && C.getId() == this.Q.get(i10).j()) {
                        View childAt = cVar.getChildAt(0);
                        if (childAt instanceof ne.w) {
                            ((ne.w) childAt).e(z10, true);
                        } else if (childAt instanceof o2) {
                            ((o2) childAt).c(z10, true);
                        }
                    }
                }
                if (C instanceof FrameLayoutFix) {
                    FrameLayoutFix frameLayoutFix = (FrameLayoutFix) C;
                    if (frameLayoutFix.getChildCount() == 2 && C.getId() == this.Q.get(i10).j() && ((A = this.Q.get(i10).A()) == 80 || A == 88)) {
                        View childAt2 = frameLayoutFix.getChildAt(1);
                        if (childAt2 instanceof uc.d) {
                            uc.d dVar = (uc.d) childAt2;
                            dVar.r(z10, true);
                            dVar.m(true);
                        }
                    }
                }
                if ((C instanceof o0) && this.Q.get(i10).A() == 81) {
                    ((o0) C).e1(z10, true);
                }
            }
            z11 = true;
        }
        if (z11) {
            I(i10);
        }
    }

    public void b3(int i10, boolean z10, boolean z11) {
        int L0 = L0(i10);
        if (L0 != -1) {
            for (RecyclerView recyclerView : this.O) {
                View C = recyclerView.getLayoutManager().C(L0);
                if (C != null) {
                    y1 y1Var = (y1) ((ViewGroup) C).getChildAt(0);
                    y1Var.setInGoodState(z10);
                    y1Var.setInErrorState(z11);
                }
            }
        }
    }

    @Override
    public void b4() {
        s1.a(this);
    }

    public void c2(c.a aVar) {
        this.Y = aVar;
    }

    public void n1(final int i10) {
        if (i10 == -1) {
            return;
        }
        if (V0()) {
            j0.d0(new Runnable() {
                @Override
                public final void run() {
                    iq.this.n1(i10);
                }
            });
        } else {
            I(i10);
        }
    }

    public final void d2(ra raVar, int i10, ViewGroup viewGroup, View view) {
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(4);
        y1 y1Var = (y1) viewGroup2.getChildAt(3);
        y1 y1Var2 = (y1) viewGroup.getChildAt(5);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup.getChildAt(6);
        y1 y1Var3 = (y1) viewGroup3.getChildAt(3);
        ViewGroup viewGroup4 = (ViewGroup) viewGroup.getChildAt(7);
        c2 c2Var = (c2) viewGroup4.getChildAt(1);
        ViewGroup viewGroup5 = (ViewGroup) viewGroup.getChildAt(8);
        c2 c2Var2 = (c2) viewGroup5.getChildAt(1);
        c2 c2Var3 = (c2) viewGroup5.getChildAt(2);
        f2(raVar, i10, viewGroup, view, (td.e) viewGroup.getChildAt(0), (sd.a) viewGroup.getChildAt(1), (sd.a) viewGroup.getChildAt(2), (y1) viewGroup.getChildAt(3), (y1) viewGroup2.getChildAt(0), (y1) viewGroup2.getChildAt(1), (y1) viewGroup2.getChildAt(2), y1Var, y1Var2, (y1) viewGroup3.getChildAt(0), (y1) viewGroup3.getChildAt(1), (y1) viewGroup3.getChildAt(2), y1Var3, (c2) viewGroup5.getChildAt(3), (c2) viewGroup4.getChildAt(0), c2Var, (c2) viewGroup5.getChildAt(0), c2Var2, c2Var3, (c2) viewGroup5.getChildAt(4));
    }

    public void d3(int i10) {
        n1(L0(i10));
    }

    @Override
    public void e2() {
        for (RecyclerView recyclerView : this.O) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int X1 = linearLayoutManager.X1();
            int a22 = linearLayoutManager.a2();
            for (int i10 = X1; i10 <= a22; i10++) {
                View C = linearLayoutManager.C(i10);
                if (C != null) {
                    C.invalidate();
                }
            }
            if (X1 > 0) {
                L(0, X1);
            }
            if (a22 < D() - 1) {
                L(a22, D() - a22);
            }
        }
    }

    public void e3(int i10, String str) {
        int L0 = L0(i10);
        if (L0 != -1) {
            for (RecyclerView recyclerView : this.O) {
                View C = recyclerView.getLayoutManager().C(L0);
                if (C != null) {
                    ((y1) ((ViewGroup) C).getChildAt(0)).setBlockedText(str);
                }
            }
        }
    }

    public void f2(ra raVar, int i10, ViewGroup viewGroup, View view, td.e eVar, sd.a aVar, sd.a aVar2, y1 y1Var, y1 y1Var2, y1 y1Var3, y1 y1Var4, y1 y1Var5, y1 y1Var6, y1 y1Var7, y1 y1Var8, y1 y1Var9, y1 y1Var10, c2 c2Var, c2 c2Var2, c2 c2Var3, c2 c2Var4, c2 c2Var5, c2 c2Var6, c2 c2Var7) {
    }

    public void f3(long j10) {
        int P0 = P0(j10);
        if (P0 != -1) {
            g3(P0);
        }
    }

    public void g2(ra raVar, ap apVar, int i10) {
    }

    public void g3(int i10) {
        if (i10 != -1) {
            boolean z10 = false;
            for (RecyclerView recyclerView : this.O) {
                View C = recyclerView.getLayoutManager().C(i10);
                if (C == null || C.getTag() != this.Q.get(i10) || !(C instanceof RelativeLayout)) {
                    z10 = true;
                } else {
                    G2(this.Q.get(i10), i10, (RelativeLayout) C, true);
                }
            }
            if (z10) {
                I(i10);
            }
        }
    }

    public void h(c2 c2Var, boolean z10) {
    }

    public void h2(ra raVar, int i10, p0 p0Var, boolean z10) {
    }

    public void h3(int i10) {
        int L0 = L0(i10);
        if (L0 != -1) {
            i3(L0);
        }
    }

    @Override
    public final f.i i() {
        f.i iVar = this.f8315c0;
        if (iVar != null) {
            return iVar;
        }
        f.i iVar2 = new f.i();
        this.f8315c0 = iVar2;
        return iVar2;
    }

    public void i2(ra raVar, o0 o0Var, r3 r3Var, boolean z10) {
    }

    public void i3(int i10) {
        RecyclerView.c0 l02;
        if (i10 != -1) {
            boolean z10 = false;
            for (RecyclerView recyclerView : this.O) {
                View C = recyclerView.getLayoutManager().C(i10);
                if (C == null || (l02 = recyclerView.l0(C)) == null || !(l02 instanceof ap)) {
                    z10 = true;
                } else {
                    Q((ap) l02, i10);
                }
            }
            if (z10) {
                I(i10);
            }
        }
    }

    public void i4(y1 y1Var, boolean z10) {
        v4<?> v4Var = this.S;
        if (v4Var != null && z10) {
            v4Var.Fd(y1Var.getEditText(), this.T);
        }
    }

    public void j(td.e eVar, boolean z10) {
        td.d.a(this, eVar, z10);
    }

    public void j2(ra raVar, TextView textView) {
    }

    public void j3(long j10) {
        int P0 = P0(j10);
        if (P0 != -1) {
            k3(P0);
        }
    }

    public void k2(ra raVar, int i10, EmbeddableStickerView embeddableStickerView, boolean z10) {
    }

    public void k3(int i10) {
        boolean z10 = false;
        for (RecyclerView recyclerView : this.O) {
            View C = recyclerView.getLayoutManager().C(i10);
            if (C == null || !(C instanceof p0)) {
                z10 = true;
            } else {
                L2(this.Q.get(i10), i10, (p0) C, this.Q.get(i10).A() == 26, true);
            }
        }
        if (z10) {
            I(i10);
        }
    }

    public void l2(ra raVar, TextView textView, boolean z10) {
        ce.p0.c0(textView, raVar.u());
    }

    public int l3(long j10, boolean z10) {
        int P0 = P0(j10);
        if (P0 != -1) {
            m3(P0, z10);
        }
        return P0;
    }

    public void m(td.e eVar, float f10, float f11, boolean z10) {
    }

    public void m2(d0 d0Var) {
        this.f8313a0 = d0Var;
    }

    public void m3(int i10, boolean z10) {
        if (i10 != -1) {
            boolean z11 = false;
            for (RecyclerView recyclerView : this.O) {
                View C = recyclerView.getLayoutManager().C(i10);
                if (C == null || !(C instanceof o)) {
                    z11 = true;
                } else {
                    if (z10) {
                        ((o) C).e1();
                    } else {
                        ((o) C).V0();
                    }
                    C.invalidate();
                }
            }
            if (z11) {
                I(i10);
            }
        }
    }

    public void n(View view, float f10, boolean z10) {
    }

    public void n2(boolean z10, boolean z11, k.b bVar) {
        if (this.f8316d0 != z10) {
            this.f8316d0 = z10;
            this.f8321i0 = z11;
            this.f8322j0 = bVar;
            u0(z10 ? 1.0f : 0.0f);
        }
    }

    public void n3(ra raVar) {
        int F0 = F0(raVar);
        if (F0 != -1) {
            r3(F0);
        }
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 0) {
            E2(f10);
            k.b bVar = this.f8322j0;
            if (bVar != null) {
                bVar.n4(i10, f10, f11, kVar);
            }
        }
    }

    public void o1(ra raVar, l3 l3Var, ne.w wVar, boolean z10) {
    }

    public void o2(ra raVar, int i10, ne.t1 t1Var) {
    }

    public void o3(Object obj) {
        int J0 = J0(obj);
        if (J0 != -1) {
            r3(J0);
        }
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    public void p(View view, boolean z10) {
        ie.w.a(this, view, z10);
    }

    public void p1(ap apVar, int i10, ra raVar, int i11, View view, boolean z10) {
    }

    public void p2(int i10, int i11) {
        int i12;
        SparseIntArray sparseIntArray = this.f8323k0;
        if (sparseIntArray != null && (i12 = sparseIntArray.get(i10)) != i11) {
            this.f8323k0.put(i10, i11);
            Z2(i12, false);
            Z2(i11, true);
        }
    }

    public void p3(int i10) {
        int L0 = L0(i10);
        if (L0 != -1) {
            r3(L0);
        }
    }

    public void p4(y1 y1Var, CharSequence charSequence) {
        e eVar;
        int L0;
        String charSequence2 = charSequence.toString();
        int id2 = ((ViewGroup) y1Var.getParent()).getId();
        ra raVar = (y1Var.getParent() == null || !(((ViewGroup) y1Var.getParent()).getTag() instanceof ra)) ? null : (ra) ((ViewGroup) y1Var.getParent()).getTag();
        if (raVar == null && (L0 = L0(id2)) != -1) {
            raVar = this.Q.get(L0);
        }
        boolean z10 = true;
        if (raVar != null) {
            if (!i.c(raVar.x(), charSequence2)) {
                raVar.b0(charSequence2);
            } else {
                z10 = false;
            }
        }
        if (z10 && (eVar = this.U) != null) {
            eVar.N5(id2, raVar, y1Var, charSequence2);
        }
    }

    @Override
    public final void q(k3 k3Var, int i10) {
        K1(k3Var.getId(), i10);
        ra raVar = (ra) k3Var.getTag();
        int s10 = raVar.s();
        raVar.V(i10);
        D1(raVar, k3Var, i10, s10);
    }

    public void q1(ra raVar, TextView textView) {
    }

    public void q2(int i10, boolean z10, int i11) {
        boolean z11 = false;
        for (RecyclerView recyclerView : this.O) {
            View C = recyclerView.getLayoutManager().C(i10);
            if (C == null || !(C instanceof k0)) {
                z11 = true;
            } else {
                ((k0) C).h(z10, i11);
            }
        }
        if (z11) {
            I(i10);
        }
    }

    public void q3(long j10) {
        int P0 = P0(j10);
        if (P0 != -1) {
            r3(P0);
        }
    }

    public void r0(RecyclerView recyclerView, View view, int i10) {
        recyclerView.k(new a(i10, view));
    }

    public void r1(ra raVar, ViewGroup viewGroup, y1 y1Var) {
    }

    public void m1(final int i10, final ra raVar) {
        if (V0()) {
            j0.d0(new Runnable() {
                @Override
                public final void run() {
                    iq.this.m1(i10, raVar);
                }
            });
            return;
        }
        this.Q.set(i10, raVar);
        I(i10);
    }

    public void r3(int i10) {
        boolean z10;
        ra C0 = C0(i10);
        if (C0 != null) {
            boolean z11 = false;
            for (RecyclerView recyclerView : this.O) {
                View C = recyclerView.getLayoutManager().C(i10);
                if (C == null || C.getId() != C0.j()) {
                    z11 = true;
                } else if (C instanceof uc.c) {
                    R2(C0, (uc.c) C, true);
                } else {
                    int A = C0.A();
                    if (A == 10) {
                        z10 = C instanceof TextView;
                        if (z10) {
                            W1(C0, (TextView) C, true);
                        }
                    } else if (A == 20) {
                        z10 = (C instanceof ViewGroup) && (((ViewGroup) C).getChildAt(0) instanceof x2);
                        if (z10) {
                            X1(C0, (x2) ((ViewGroup) C).getChildAt(0), true);
                        }
                    } else if (A != 79) {
                        switch (A) {
                            case 81:
                                z10 = (C instanceof o0) && ((o0) C).L0();
                                if (z10) {
                                    i2(C0, (o0) C, null, true);
                                    break;
                                }
                                break;
                            case 82:
                            case 83:
                                z10 = C instanceof k2;
                                if (z10) {
                                    C2(C0, i10, (k2) C, true);
                                    break;
                                }
                                break;
                            default:
                                z10 = false;
                                break;
                        }
                    } else {
                        z10 = (C instanceof o0) && !((o0) C).L0();
                        if (z10) {
                            i2(C0, (o0) C, null, true);
                        }
                    }
                    if (!z10) {
                        ap apVar = (ap) recyclerView.l0(C);
                        int k10 = apVar != null ? apVar.k() : -1;
                        if (k10 != -1) {
                            Q(apVar, k10);
                        } else {
                            I(i10);
                        }
                    }
                }
            }
            if (z11) {
                I(i10);
            }
        }
    }

    @Override
    public int s(int i10) {
        if (this.Q.isEmpty()) {
            return ap.W(F(i10));
        }
        int size = this.Q.size();
        int i11 = 0;
        for (int i12 = 0; i12 < i10 && i12 < size; i12++) {
            i11 += ap.X(this.Q.get(i12));
        }
        return i11;
    }

    public void s0(int i10, ra raVar) {
        Y0(i10, raVar);
    }

    public void s1(TextView textView, int i10, int i11) {
    }

    public int s2(List<ra> list, boolean z10) {
        int D = D();
        this.Q.clear();
        ib.b.m(this.Q, list.size());
        this.Q.addAll(list);
        int T1 = z10 ? T1() : -1;
        v0.k2(this, D);
        return T1;
    }

    public void s3(ap apVar, int i10, int i11) {
        if (i10 < this.Q.size()) {
            ra raVar = this.Q.get(i10);
            apVar.f2982a.setId(raVar.j());
            apVar.f2982a.setTag(raVar);
            int i12 = R.id.theme_color_background_textLight;
            g6.a aVar = null;
            hd.o<?> oVar = null;
            boolean z10 = true;
            switch (i11) {
                case 1:
                    F2(raVar, i10, (d3) apVar.f2982a);
                    return;
                case 2:
                case 3:
                    I2(raVar, (f3) apVar.f2982a);
                    int y10 = raVar.y(0);
                    if (y10 != 0) {
                        apVar.f2982a.setBackgroundColor(j.L(y10));
                        return;
                    }
                    return;
                case 4:
                case 12:
                case 13:
                case 47:
                case 69:
                case 77:
                case 85:
                case 98:
                case 99:
                    ((uc.c) apVar.f2982a).setIcon(raVar.i());
                    ((uc.c) apVar.f2982a).setName(raVar.u());
                    ((uc.c) apVar.f2982a).setIgnoreEnabled(false);
                    ((uc.c) apVar.f2982a).setTextColorId(raVar.y(R.id.theme_color_text));
                    apVar.f2982a.setEnabled(true);
                    R2(raVar, (uc.c) apVar.f2982a, false);
                    if (i11 == 69 || i11 == 85) {
                        ne.d dVar = (ne.d) ((uc.c) apVar.f2982a).getChildAt(1);
                        if (raVar.d() instanceof w6) {
                            dVar.setUser((w6) raVar.d());
                        } else {
                            o6 o6Var = this.N;
                            if (raVar.d() instanceof o6) {
                                o6Var = (o6) raVar.d();
                            }
                            dVar.q(o6Var, raVar.n(), false);
                        }
                    }
                    if (i11 != 12) {
                        if (i11 != 13) {
                            if (!(i11 == 47 || i11 == 69 || i11 == 77)) {
                                if (!(i11 == 85 || i11 == 98)) {
                                    if (i11 != 99) {
                                        return;
                                    }
                                }
                            }
                        }
                        o2 L1 = ((uc.c) apVar.f2982a).L1();
                        L1.c(raVar.D(), false);
                        L1.setColorId(raVar.q());
                        ce.p0.V(L1, (w.G2() ? 3 : 5) | 16);
                        return;
                    }
                    ne.w wVar = (ne.w) ((uc.c) apVar.f2982a).getChildAt(0);
                    wVar.e(raVar.D(), false);
                    if (i11 != 77) {
                        z10 = false;
                    }
                    ce.p0.V(wVar, (z10 != w.G2() ? 3 : 5) | 16);
                    return;
                case 5:
                case 6:
                case 37:
                case 87:
                case 89:
                case 90:
                case 91:
                case 92:
                    uc.c cVar = (uc.c) apVar.f2982a;
                    cVar.setIcon(raVar.i());
                    cVar.setName(raVar.u());
                    cVar.setTextColorId(raVar.y(0));
                    apVar.f2982a.setEnabled(true);
                    switch (i11) {
                        case 90:
                            ce.p0.V(((ViewGroup) apVar.f2982a).getChildAt(0), (w.G2() ? 5 : 3) | 16);
                            break;
                        case 91:
                            ce.p0.V(((ViewGroup) apVar.f2982a).getChildAt(0), (w.G2() ? 3 : 5) | 16);
                            break;
                        case 92:
                            ((uc.c) apVar.f2982a).G1(true);
                            break;
                    }
                    R2(raVar, cVar, false);
                    return;
                case 7:
                case 67:
                    uc.c cVar2 = (uc.c) apVar.f2982a;
                    cVar2.setName(raVar.u());
                    cVar2.getToggler().m(true);
                    apVar.f2982a.setEnabled(true);
                    R2(raVar, (uc.c) apVar.f2982a, false);
                    return;
                case 8:
                case 70:
                case 110:
                    TextView textView = (TextView) apVar.f2982a;
                    l2(raVar, textView, false);
                    textView.setTextColor(j.L(raVar.y(R.id.theme_color_background_textLight)));
                    textView.setGravity(w.G1(16));
                    return;
                case 9:
                case 71:
                case 93:
                    TextView textView2 = (TextView) apVar.f2982a;
                    if (i11 == 71) {
                        i12 = R.id.theme_color_textLight;
                    }
                    textView2.setTextColor(j.L(raVar.y(i12)));
                    int i13 = a0.i(16.0f) + raVar.z();
                    textView2.setText(raVar.u());
                    if (apVar.f2982a.getPaddingLeft() != i13) {
                        View view = apVar.f2982a;
                        view.setPadding(i13, view.getPaddingTop(), apVar.f2982a.getPaddingRight(), apVar.f2982a.getPaddingBottom());
                    }
                    if (i11 != 71) {
                        textView2.setGravity(w.G1(16));
                    }
                    q1(raVar, textView2);
                    return;
                case 10:
                    W1(raVar, (TextView) apVar.f2982a, false);
                    return;
                case 11:
                case 14:
                case 15:
                case 17:
                case 18:
                case 25:
                case 36:
                case 43:
                case 73:
                case 78:
                case d.j.E0:
                case 97:
                case 107:
                case 108:
                case 109:
                case 112:
                case 113:
                case d.j.F0:
                case d.j.G0:
                case d.j.H0:
                case d.j.I0:
                case d.j.J0:
                case d.j.K0:
                case d.j.N0:
                case d.j.O0:
                case d.j.P0:
                case 125:
                case 126:
                case 127:
                case Log.TAG_YOUTUBE:
                case 129:
                default:
                    if (i11 <= -1) {
                        p1(apVar, i10, raVar, (-1) - i11, apVar.f2982a, false);
                        return;
                    }
                    return;
                case 16:
                case 76:
                    G2(raVar, i10, (RelativeLayout) apVar.f2982a, false);
                    return;
                case 19:
                case 75:
                    ViewGroup viewGroup = (ViewGroup) ((ViewGroup) apVar.f2982a).getChildAt(0);
                    if (i11 == 19) {
                        ((ImageView) viewGroup.getChildAt(0)).setImageResource(raVar.i());
                    }
                    ((TextView) viewGroup.getChildAt(1)).setText(raVar.u());
                    return;
                case 20:
                    X1(raVar, (x2) ((ViewGroup) apVar.f2982a).getChildAt(0), false);
                    return;
                case 21:
                    j2(raVar, (TextView) ((RelativeLayout) ((FrameLayoutFix) apVar.f2982a).getChildAt(0)).getChildAt(2));
                    return;
                case 22:
                    apVar.f2982a.setEnabled(true);
                    e3 e3Var = (e3) apVar.f2982a;
                    e3Var.setTitle(raVar.u());
                    e3Var.s();
                    M2(raVar, e3Var, false);
                    return;
                case 23:
                case 26:
                    p0 p0Var = (p0) apVar.f2982a;
                    p0Var.s();
                    if (i11 != 26) {
                        z10 = false;
                    }
                    L2(raVar, i10, p0Var, z10, false);
                    return;
                case d.j.K3:
                    ((TextView) apVar.f2982a).setText(raVar.u());
                    ((TextView) apVar.f2982a).setTextColor(j.L(raVar.y(R.id.theme_color_background_textLight)));
                    return;
                case 27:
                    Q2(raVar, i10, (o) apVar.f2982a, false);
                    return;
                case 28:
                    ((n0) apVar.f2982a).y(raVar.u(), null, false);
                    return;
                case d.j.P3:
                    if (apVar.f2982a.getMeasuredHeight() != a0.f() / 2) {
                        apVar.f2982a.requestLayout();
                        return;
                    }
                    return;
                case 30:
                    K2(raVar, (k3) apVar.f2982a);
                    return;
                case 31:
                case 34:
                case 56:
                case 62:
                case 65:
                case 66:
                case 68:
                case 95:
                case 96:
                    y1 y1Var = (y1) ((ViewGroup) apVar.f2982a).getChildAt(0);
                    y1Var.P1(w.G2());
                    y1Var.setHint(raVar.u());
                    y1Var.setText(raVar.x());
                    g6.a p10 = raVar.p();
                    if (p10 != null) {
                        y1Var.getEditText().setImeOptions(268435456 | p10.a());
                        v1 editText = y1Var.getEditText();
                        if (p10.b()) {
                            aVar = p10;
                        }
                        editText.setOnEditorActionListener(aVar);
                    } else {
                        y1Var.getEditText().setOnEditorActionListener(null);
                        y1Var.getEditText().setImeOptions(268435456);
                    }
                    if (raVar.k() != null) {
                        y1Var.getEditText().setFilters(raVar.k());
                    }
                    r1(raVar, (ViewGroup) apVar.f2982a, y1Var);
                    return;
                case Log.TAG_IMAGE_LOADER:
                    g2(raVar, apVar, i10);
                    return;
                case 33:
                    ViewGroup viewGroup2 = (ViewGroup) apVar.f2982a;
                    ((TextView) viewGroup2.getChildAt(0)).setText(raVar.u());
                    ((TextView) viewGroup2.getChildAt(1)).setText((String) raVar.d());
                    return;
                case 35:
                    ((ap.l) apVar.f2982a).setItem(raVar);
                    return;
                case 38:
                    y2(raVar, i10, (RecyclerView) apVar.f2982a);
                    return;
                case 39:
                    return;
                case 40:
                    ((cd.a) apVar.f2982a).setListener(this.V);
                    ((cd.a) apVar.f2982a).setItem((qd.b) raVar.d());
                    cd.a aVar2 = (cd.a) apVar.f2982a;
                    float f10 = 1.0f;
                    float f11 = this.f8316d0 ? 1.0f : 0.0f;
                    if (!raVar.D()) {
                        f10 = 0.0f;
                    }
                    aVar2.E(f11, f10);
                    return;
                case 41:
                    Object d10 = raVar.d();
                    yc.a aVar3 = (yc.a) apVar.f2982a;
                    if (d10 instanceof hd.o) {
                        oVar = (hd.o) d10;
                    } else if (d10 instanceof c1) {
                        oVar = ((c1) d10).X();
                    }
                    aVar3.setInlineResult(oVar);
                    ((yc.a) apVar.f2982a).w(raVar.D(), raVar.r());
                    return;
                case 42:
                    o2(raVar, i10, (ne.t1) apVar.f2982a);
                    return;
                case 44:
                    ((ne.c1) apVar.f2982a).b(raVar.l(), raVar.b(), raVar.x());
                    return;
                case 45:
                case 46:
                    h2(raVar, i10, (p0) apVar.f2982a, false);
                    return;
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                    ((d2) apVar.f2982a).setBlock((a1) raVar.d());
                    return;
                case 53:
                case 54:
                case 55:
                case 111:
                    ((e2) apVar.f2982a).setBlock((a1) raVar.d());
                    return;
                case 57:
                    Y1(raVar, i10, (ne.o) apVar.f2982a);
                    return;
                case 58:
                    U0(raVar, (CustomRecyclerView) apVar.f2982a);
                    return;
                case 59:
                case 60:
                    Z1(raVar, (y3) apVar.f2982a);
                    return;
                case 61:
                    TextView textView3 = (TextView) ((FrameLayoutFix) apVar.f2982a).getChildAt(0);
                    textView3.setGravity(w.G1(16));
                    l2(raVar, textView3, false);
                    textView3.setTextColor(j.L(raVar.y(R.id.theme_color_background_textLight)));
                    ImageView imageView = (ImageView) ((FrameLayoutFix) apVar.f2982a).getChildAt(1);
                    imageView.setId(raVar.j());
                    imageView.setImageResource(raVar.i());
                    imageView.setTag(raVar);
                    ce.p0.X(imageView, w.G2());
                    ce.p0.W((FrameLayout.LayoutParams) imageView.getLayoutParams(), w.G2() ? 3 : 5);
                    return;
                case 63:
                    if (raVar.d() instanceof hd.h) {
                        ((l3) apVar.f2982a).setChat((hd.h) raVar.d());
                    }
                    o1(raVar, (l3) apVar.f2982a, null, false);
                    return;
                case Log.TAG_SPEED_TEXT:
                    FrameLayoutFix frameLayoutFix = (FrameLayoutFix) apVar.f2982a;
                    ((l3) frameLayoutFix.getChildAt(0)).setChat((hd.h) raVar.d());
                    o1(raVar, (l3) frameLayoutFix.getChildAt(0), (ne.w) frameLayoutFix.getChildAt(1), false);
                    return;
                case XtraBox.MP4_XTRA_BT_GUID:
                    ((ne.s1) ((ViewGroup) ((ViewGroup) apVar.f2982a).getChildAt(0)).getChildAt(0)).setJoinedText(raVar.u());
                    return;
                case 74:
                    ((k3) apVar.f2982a).i(Float.intBitsToFloat(raVar.s()), Float.intBitsToFloat(raVar.l()));
                    return;
                case 79:
                    o0 o0Var = (o0) apVar.f2982a;
                    o0Var.m1(a0.i(18.0f), a0.i(13.5f), raVar.i());
                    o0Var.setText(raVar.u().toString());
                    i2(raVar, o0Var, null, false);
                    return;
                case 80:
                case 88:
                    FrameLayoutFix frameLayoutFix2 = (FrameLayoutFix) apVar.f2982a;
                    o0 o0Var2 = (o0) frameLayoutFix2.getChildAt(0);
                    o0Var2.m1(a0.i(18.0f), a0.i(13.5f), raVar.i());
                    o0Var2.setText(raVar.u().toString());
                    uc.d dVar2 = (uc.d) frameLayoutFix2.getChildAt(1);
                    dVar2.r(raVar.D(), false);
                    dVar2.setId(raVar.j());
                    dVar2.m(true);
                    return;
                case 81:
                    i2(raVar, (o0) apVar.f2982a, null, false);
                    return;
                case 82:
                case 83:
                    C2(raVar, i10, (k2) apVar.f2982a, false);
                    return;
                case 86:
                    FrameLayoutFix frameLayoutFix3 = (FrameLayoutFix) apVar.f2982a;
                    o0 o0Var3 = (o0) frameLayoutFix3.getChildAt(0);
                    i2(raVar, o0Var3, (r3) frameLayoutFix3.getChildAt(1), false);
                    o0Var3.setTag(raVar);
                    return;
                case 94:
                    d2(raVar, i10, (ViewGroup) apVar.f2982a, null);
                    return;
                case 100:
                    N2(raVar, (n0) apVar.f2982a, false);
                    return;
                case 101:
                    ((rc.d) apVar.f2982a).setChart((pc.i) raVar.d());
                    return;
                case 102:
                case 103:
                case 104:
                case 105:
                    ((t) apVar.f2982a).setChart((pc.i) raVar.d());
                    return;
                case 106:
                    ((rc.d) apVar.f2982a).setChart((r) raVar.d());
                    return;
                case d.j.L0:
                case d.j.M0:
                    z2(raVar, i10, (z0) apVar.f2982a);
                    return;
                case 130:
                    k2(raVar, i10, (EmbeddableStickerView) apVar.f2982a, false);
                    return;
                case 131:
                    q0 q0Var = (q0) apVar.f2982a;
                    q0Var.s();
                    u2(raVar, i10, q0Var, false);
                    return;
                case 132:
                    a2(raVar, i10, (n) apVar.f2982a);
                    return;
            }
        }
    }

    public void Y0(final int i10, final ra... raVarArr) {
        boolean z10;
        if (V0()) {
            j0.d0(new Runnable() {
                @Override
                public final void run() {
                    iq.this.Y0(i10, raVarArr);
                }
            });
        } else if (raVarArr.length > 0) {
            int length = raVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z10 = false;
                    break;
                } else if (X0(raVarArr[i11].A())) {
                    z10 = true;
                    break;
                } else {
                    i11++;
                }
            }
            if (raVarArr.length == 1) {
                this.Q.add(i10, raVarArr[0]);
                J(i10);
            } else {
                this.Q.addAll(i10, Arrays.asList(raVarArr));
                M(i10, raVarArr.length);
            }
            if (z10) {
                T1();
            }
        }
    }

    public void t1(int i10, uc.c cVar) {
    }

    public void t2(ra[] raVarArr, boolean z10) {
        int D = D();
        this.Q.clear();
        ib.b.m(this.Q, raVarArr.length);
        Collections.addAll(this.Q, raVarArr);
        if (z10) {
            for (ra raVar : raVarArr) {
                if (raVar.D()) {
                    if (raVar.v() != null) {
                        L1(raVar.c(), raVar.v());
                    } else {
                        K1(raVar.c(), raVar.j());
                    }
                }
            }
        }
        v0.k2(this, D);
    }

    public final void u0(float f10) {
        k kVar = this.f8320h0;
        if (kVar != null) {
            kVar.k();
        }
        if (this.f8321i0) {
            for (RecyclerView recyclerView : this.O) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                this.f8318f0 = linearLayoutManager.X1();
                int a22 = linearLayoutManager.a2();
                this.f8319g0 = a22;
                int i10 = this.f8318f0;
                if (i10 == -1 || a22 == -1) {
                    k kVar2 = this.f8320h0;
                    if (kVar2 != null) {
                        kVar2.l(f10);
                    }
                    E2(f10);
                } else {
                    if (a22 > 0) {
                        L(0, i10);
                    }
                    if (this.f8319g0 + 1 < D() - 1) {
                        L(this.f8319g0 + 1, (D() - this.f8319g0) - 1);
                    }
                    if (this.f8320h0 == null) {
                        this.f8320h0 = new k(0, this, db.b.f7287b, 180L, this.f8317e0);
                    }
                    this.f8320h0.i(f10);
                }
            }
            return;
        }
        if (this.f8320h0 == null) {
            this.f8320h0 = new k(0, this, db.b.f7287b, 180L, this.f8317e0);
        }
        this.f8320h0.i(f10);
    }

    public void u1(int i10, int i11) {
        ib.b.w(this.Q, i10, i11);
        K(i10, i11);
    }

    public void u2(ra raVar, int i10, q0 q0Var, boolean z10) {
    }

    @Override
    public int v(int i10) {
        int i11;
        int D = D();
        int size = this.Q.size();
        int i12 = 0;
        if (size == 0) {
            i11 = 0;
            while (i12 < D) {
                i11 += ap.W(F(i12));
                i12++;
            }
        } else {
            int i13 = 0;
            while (i12 < D && i12 < size) {
                i13 += ap.X(this.Q.get(i12));
                i12++;
            }
            i11 = i13;
        }
        return i10 < 0 ? i11 : Math.min(i10, i11);
    }

    public void v0() {
        int i10 = 0;
        for (ra raVar : this.Q) {
            if (raVar.D()) {
                raVar.S(false);
                q2(i10, false, raVar.r());
            }
            i10++;
        }
    }

    public void v1(int i10, int i11, boolean z10) {
        ib.b.w(this.Q, i10, i11);
        if (z10) {
            K(i10, i11);
        }
    }

    public void v2(v4<?> v4Var, boolean z10) {
        this.S = v4Var;
        this.T = z10;
    }

    public ra w0(String str) {
        return C0(Q0(str));
    }

    public void w1() {
        y1(zp.f10324a);
    }

    public ra x0(int i10) {
        return C0(L0(i10));
    }

    public void x1(final kb.d<ra> dVar) {
        y1(new d() {
            @Override
            public final int a(ra raVar) {
                int h12;
                h12 = iq.h1(d.this, raVar);
                return h12;
            }
        });
    }

    public void x2(View view) {
        v4<?> v4Var = this.S;
        if (v4Var != null && v4Var.U9() == null) {
            this.S.Fd(view, this.T);
        }
    }

    public SparseIntArray y0() {
        if (this.f8323k0 == null) {
            this.f8323k0 = new SparseIntArray();
        }
        return this.f8323k0;
    }

    public final void y1(d dVar) {
        Iterator<ra> it = this.Q.iterator();
        do {
            int i10 = -1;
            if (!it.hasNext()) {
                int i11 = 0;
                int i12 = 0;
                for (ra raVar : this.Q) {
                    if (dVar.a(raVar) != 1) {
                        if (i11 == 0) {
                            i10 = i12;
                        }
                        i11++;
                    } else if (i11 > 0) {
                        L(i10, i11);
                        i11 = 0;
                    }
                    i12++;
                }
                if (i11 > 0) {
                    L(i10, i11);
                    return;
                }
                return;
            }
        } while (dVar.a(it.next()) != -1);
        H();
    }

    public void y2(ra raVar, int i10, RecyclerView recyclerView) {
    }

    public int z0() {
        if (this.f8323k0 != null) {
            return 0;
        }
        return this.f8324l0 != null ? 1 : -1;
    }

    public void z1(final int i10) {
        x1(new kb.d() {
            @Override
            public final boolean a(Object obj) {
                boolean B;
                B = ((ra) obj).B(i10);
                return B;
            }
        });
    }

    public void z2(ra raVar, int i10, z0 z0Var) {
    }

    public iq(d9 d9Var, View.OnClickListener onClickListener, v4<?> v4Var) {
        this.O = new ArrayList();
        this.T = true;
        this.f8318f0 = -1;
        this.f8319g0 = -1;
        this.M = d9Var.t();
        this.N = d9Var.c();
        this.P = onClickListener;
        this.Q = new ArrayList(5);
        this.W = v4Var;
    }
}
