package p038ce;

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
import bd.C1355a;
import be.C1357a0;
import be.C1379j0;
import be.C1399s0;
import be.C1410y;
import com.googlecode.mp4parser.boxes.microsoft.XtraBox;
import gd.AbstractC4576a1;
import gd.AbstractC4718o;
import gd.C4599c1;
import gd.C4649h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.C6852c1;
import me.C6853c2;
import me.C6857d;
import me.C6861d2;
import me.C6862d3;
import me.C6873e3;
import me.C6879f3;
import me.C6883g1;
import me.C6942k3;
import me.C6952l3;
import me.C6973n0;
import me.C6977n2;
import me.C6981o;
import me.C6985o2;
import me.C6992p0;
import me.C6998q0;
import me.C7023s1;
import me.C7025s3;
import me.C7027t;
import me.C7030t1;
import me.C7043v1;
import me.C7057w;
import me.C7065x2;
import me.C7093z3;
import me.RunnableC6868e2;
import me.View$OnFocusChangeListenerC7069y1;
import me.vkryl.android.widget.FrameLayoutFix;
import nc.C7389v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import org.thunderdog.challegram.widget.EmbeddableStickerView;
import p037cb.C2057b;
import p038ce.AbstractC2420g6;
import p038ce.C2139ap;
import p039d.C3563j;
import p051db.C3950k;
import p053dd.C4022o;
import p080fb.C4336c;
import p082fd.C4403w;
import p108hb.C5062b;
import p108hb.C5069h;
import p108hb.C5070i;
import p111he.AbstractC5109d0;
import p111he.AbstractC5124k0;
import p111he.AbstractC5152x;
import p111he.C5149w;
import p139jb.AbstractC5912d;
import p143k0.C6038h;
import p208oc.AbstractC7821f;
import p208oc.C7833i;
import p208oc.C7846r;
import p225pd.C8112b;
import p238qc.C8315d;
import p254rd.C8426a;
import p291uc.C9494a1;
import p291uc.C9621o;
import p334xc.C10185a;
import p350yd.AbstractC10664f9;
import p350yd.C10930q6;
import p350yd.C11031u1;
import p350yd.C11052v1;
import p350yd.C11131y6;
import p364zd.C11524j;
import sc.AbstractC8749f;
import sc.C8795k2;
import sd.C8871d;
import sd.C8872e;
import tc.C9137c;
import tc.C9139d;
import td.AbstractC9323v4;
import td.C9256o0;

public class C2546iq extends RecyclerView.AbstractC0890h<C2139ap> implements AbstractC8749f, C6942k3.AbstractC6944b, View$OnFocusChangeListenerC7069y1.AbstractC7074e, C3950k.AbstractC3952b, C11052v1.AbstractC11053a, C4403w.AbstractC4404a, View$OnFocusChangeListenerC7069y1.AbstractC7077h, AbstractC5152x, C8872e.AbstractC8873a, C6853c2.AbstractC6854a, C7027t.AbstractC7028a {
    public final Context f8691M;
    public final C10930q6 f8692N;
    public final List<RecyclerView> f8693O;
    public final View.OnClickListener f8694P;
    public final List<C2964ra> f8695Q;
    public View.OnLongClickListener f8696R;
    public AbstractC9323v4<?> f8697S;
    public boolean f8698T;
    public AbstractC2551e f8699U;
    public C6883g1.AbstractC6886c f8700V;
    public AbstractC9323v4<?> f8701W;
    public RecyclerView.AbstractC0910t f8702X;
    public C4336c.AbstractC4337a f8703Y;
    public boolean f8704Z;
    public AbstractC5109d0 f8705a0;
    public C6942k3.AbstractC6945c f8706b0;
    public AbstractC7821f.C7830i f8707c0;
    public boolean f8708d0;
    public float f8709e0;
    public int f8710f0;
    public int f8711g0;
    public C3950k f8712h0;
    public boolean f8713i0;
    public C3950k.AbstractC3952b f8714j0;
    public SparseIntArray f8715k0;
    public C6038h<String> f8716l0;

    public class C2547a extends RecyclerView.AbstractC0910t {
        public final int f8717a;
        public final View f8718b;

        public C2547a(int i, View view) {
            this.f8717a = i;
            this.f8718b = view;
        }

        @Override
        public void mo421b(RecyclerView recyclerView, int i, int i2) {
            float f;
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int X1 = linearLayoutManager.m39549X1();
            if (X1 != -1) {
                if (X1 == 0) {
                    int i3 = 0;
                    View C = linearLayoutManager.mo39262C(0);
                    if (C != null) {
                        i3 = -C.getTop();
                    }
                    f = C5069h.m24089d(i3 / this.f8717a);
                } else {
                    f = 1.0f;
                }
                this.f8718b.setAlpha(f);
            }
        }
    }

    public class C2548b extends RecyclerView.AbstractC0910t {
        public C2548b() {
        }

        @Override
        public void mo421b(RecyclerView recyclerView, int i, int i2) {
            View C;
            int X1 = ((LinearLayoutManager) recyclerView.getLayoutManager()).m39549X1();
            int left = (X1 == -1 || (C = recyclerView.getLayoutManager().mo39262C(X1)) == null) ? 0 : C.getLeft();
            C2964ra raVar = (C2964ra) recyclerView.getTag();
            if (raVar.m32848b()) {
                raVar.m32859R(X1, left);
            }
        }
    }

    public static class C2549c extends RecyclerView.AbstractC0901o {
        public int f8721a;

        public C2549c(int i) {
            this.f8721a = i;
        }

        @Override
        public void mo8191i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
            Object tag;
            Paint g = C1410y.m37039g(C11524j.m228N(this.f8721a));
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != null && (tag = childAt.getTag()) != null && (tag instanceof C2964ra) && mo30707l((C2964ra) tag)) {
                    canvas.drawRect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), g);
                }
            }
        }

        public boolean mo30707l(C2964ra raVar) {
            int A = raVar.m32876A();
            return A == 2 || A == 3 || A == 8 || A == 61 || A == 70;
        }
    }

    public interface AbstractC2550d {
        int mo30660a(C2964ra raVar);
    }

    public interface AbstractC2551e {
        void mo30698K(int i, C2964ra raVar, View$OnFocusChangeListenerC7069y1 y1Var, String str);
    }

    public C2546iq(AbstractC9323v4<?> v4Var) {
        this(v4Var, v4Var instanceof View.OnClickListener ? (View.OnClickListener) v4Var : null, v4Var);
        if (v4Var instanceof View.OnLongClickListener) {
            m34238F2((View.OnLongClickListener) v4Var);
        }
    }

    public static boolean m34191a1(int i) {
        return i == 12 || i == 13 || i == 47 || i == 69 || i == 77 || i == 85 || i == 88 || i == 80 || i == 81 || i == 98 || i == 99;
    }

    public static boolean m34184c1(C2964ra raVar, C2964ra raVar2) {
        return raVar2 == raVar;
    }

    public static boolean m34181d1(Object obj, C2964ra raVar) {
        return raVar.m32844d() == obj;
    }

    public static boolean m34176f1(int i, C2964ra raVar) {
        return raVar.m32835j() == i;
    }

    public static boolean m34172g1(int i, int i2, C2964ra raVar) {
        return raVar.m32835j() == i && raVar.m32833l() == i2;
    }

    public static boolean m34169h1(int i, C2964ra raVar) {
        return raVar.m32835j() == i;
    }

    public static boolean m34165i1(long j, C2964ra raVar) {
        return raVar.m32832m() == j;
    }

    public static boolean m34162j1(String str, C2964ra raVar) {
        return str.equals(raVar.m32823v());
    }

    public static boolean m34158k1(int i, C2964ra raVar) {
        return raVar.m32876A() == i;
    }

    public static int m34154l1(AbstractC5912d dVar, C2964ra raVar) {
        if (dVar.mo1511a(raVar)) {
            return m34119w3(raVar);
        }
        return 1;
    }

    public static int m34119w3(C2964ra raVar) {
        int A = raVar.m32876A();
        if (!(C2139ap.m35481U(A) || A == 1 || A == 23 || A == 26)) {
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
                                    return raVar.m32874C() ? 0 : 1;
                            }
                    }
                }
            }
        }
        return 0;
    }

    public SparseIntArray m34252A0() {
        if (this.f8715k0 == null) {
            this.f8715k0 = new SparseIntArray();
        }
        return this.f8715k0;
    }

    public void m34251A1() {
        m34244D1(C3408zp.f11297a);
    }

    public void m34250A2(AbstractC9323v4<?> v4Var, boolean z) {
        this.f8697S = v4Var;
        this.f8698T = z;
    }

    public int m34249B0() {
        if (this.f8715k0 != null) {
            return 0;
        }
        return this.f8716l0 != null ? 1 : -1;
    }

    public void m34248B2(View view) {
        AbstractC9323v4<?> v4Var = this.f8697S;
        if (v4Var != null && v4Var.m9333U9() == null) {
            this.f8697S.mo9438Fd(view, this.f8698T);
        }
    }

    public C6038h<String> m34247C0() {
        if (this.f8716l0 == null) {
            this.f8716l0 = new C6038h<>();
        }
        return this.f8716l0;
    }

    public void m34246C1(final AbstractC5912d<C2964ra> dVar) {
        m34244D1(new AbstractC2550d() {
            @Override
            public final int mo30660a(C2964ra raVar) {
                int l1;
                l1 = C2546iq.m34154l1(AbstractC5912d.this, raVar);
                return l1;
            }
        });
    }

    public void mo504C2(C2964ra raVar, int i, RecyclerView recyclerView) {
    }

    @Override
    public int mo6153D() {
        return this.f8695Q.isEmpty() ? this.f8704Z ? 0 : 1 : this.f8695Q.size();
    }

    public AbstractC5109d0 m34245D0() {
        return this.f8705a0;
    }

    public final void m34244D1(AbstractC2550d dVar) {
        Iterator<C2964ra> it = this.f8695Q.iterator();
        do {
            int i = -1;
            if (!it.hasNext()) {
                int i2 = 0;
                int i3 = 0;
                for (C2964ra raVar : this.f8695Q) {
                    if (dVar.mo30660a(raVar) != 1) {
                        if (i2 == 0) {
                            i = i3;
                        }
                        i2++;
                    } else if (i2 > 0) {
                        m39309L(i, i2);
                        i2 = 0;
                    }
                    i3++;
                }
                if (i2 > 0) {
                    m39309L(i, i2);
                    return;
                }
                return;
            }
        } while (dVar.mo30660a(it.next()) != -1);
        m39313H();
    }

    public void mo8030D2(C2964ra raVar, int i, C9494a1 a1Var) {
    }

    public C2964ra m34243E0(int i) {
        if (i < 0 || i >= this.f8695Q.size()) {
            return null;
        }
        return this.f8695Q.get(i);
    }

    public void m34242E1(final int i) {
        m34246C1(new AbstractC5912d() {
            @Override
            public final boolean mo1511a(Object obj) {
                boolean B;
                B = ((C2964ra) obj).m32875B(i);
                return B;
            }
        });
    }

    public void m34241E2() {
        this.f8704Z = true;
    }

    @Override
    public int mo6150F(int i) {
        if (this.f8695Q.isEmpty()) {
            return 15;
        }
        return this.f8695Q.get(i).m32876A();
    }

    public List<C2964ra> m34240F0() {
        return this.f8695Q;
    }

    public void mo6146Q(C2139ap apVar, int i) {
        mo34122v3(apVar, i, apVar.m39332n());
    }

    public void m34238F2(View.OnLongClickListener onLongClickListener) {
        this.f8696R = onLongClickListener;
    }

    public C6942k3.AbstractC6945c m34237G0() {
        return this.f8706b0;
    }

    public C2139ap mo6145S(ViewGroup viewGroup, int i) {
        if (i == 32) {
            return mo34207U0(viewGroup);
        }
        if (i <= -1) {
            return mo34205V0(viewGroup, (-1) - i);
        }
        return C2139ap.m35485Q(this.f8691M, this.f8692N, i, this, this.f8694P, this.f8696R, this.f8701W, this.f8702X, this.f8703Y);
    }

    public void mo11660G2(C2964ra raVar, int i, C8795k2 k2Var, boolean z) {
    }

    public int m34235H0(C2964ra raVar) {
        return m34234I0(raVar, 0);
    }

    public void mo9532H2(C2964ra raVar, RecyclerView recyclerView, boolean z) {
    }

    public int m34234I0(final C2964ra raVar, int i) {
        return m34230K0(new AbstractC5912d() {
            @Override
            public final boolean mo1511a(Object obj) {
                boolean c1;
                c1 = C2546iq.m34184c1(C2964ra.this, (C2964ra) obj);
                return c1;
            }
        }, i, false);
    }

    public void mo34233I1(C2964ra raVar, ViewGroup viewGroup, View$OnFocusChangeListenerC7069y1 y1Var, C6985o2 o2Var) {
    }

    public final void m34232I2(float f) {
        if (this.f8709e0 != f) {
            this.f8709e0 = f;
            for (RecyclerView recyclerView : this.f8693O) {
                for (int i = this.f8710f0; i <= this.f8711g0; i++) {
                    View C = recyclerView.getLayoutManager().mo39262C(i);
                    if (C != null && (C instanceof C1355a)) {
                        ((C1355a) C).setSelectableFactor(f);
                    }
                }
            }
        }
    }

    public int m34231J0(AbstractC5912d<C2964ra> dVar) {
        return m34230K0(dVar, -1, false);
    }

    public void mo31467J1(C2964ra raVar, C6942k3 k3Var, int i, int i2) {
    }

    public void mo34062J2(C2964ra raVar, int i, C6862d3 d3Var) {
        d3Var.m18735c(C1357a0.m37541i(72.0f), 0.0f);
    }

    public int m34230K0(AbstractC5912d<C2964ra> dVar, int i, boolean z) {
        if (z) {
            for (int size = i == -1 ? this.f8695Q.size() - 1 : Math.min(this.f8695Q.size() - 1, i); size >= 0; size--) {
                if (dVar.mo1511a(this.f8695Q.get(size))) {
                    return size;
                }
            }
        } else if (i <= 0) {
            int i2 = 0;
            for (C2964ra raVar : this.f8695Q) {
                if (dVar.mo1511a(raVar)) {
                    return i2;
                }
                i2++;
            }
        } else {
            while (i < this.f8695Q.size()) {
                if (dVar.mo1511a(this.f8695Q.get(i))) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public void mo6144V(C2139ap apVar) {
        apVar.m35486P();
    }

    public final void m34229K2(C2964ra raVar, int i, RelativeLayout relativeLayout, boolean z) {
        mo33061L2(raVar, i, relativeLayout, z, (TextView) relativeLayout.getChildAt(0), (TextView) relativeLayout.getChildAt(1), (TextView) relativeLayout.getChildAt(2), (TextView) relativeLayout.getChildAt(3), (C6977n2) relativeLayout.getChildAt(4), raVar.m32876A() == 76 ? (C6857d) relativeLayout.getChildAt(5) : null, raVar.m32876A() == 16 ? (ImageView) relativeLayout.getChildAt(5) : null, raVar.m32876A() == 16 ? (TextView) relativeLayout.getChildAt(6) : null, raVar.m32876A() == 16 ? (TextView) relativeLayout.getChildAt(7) : null);
    }

    public int m34228L0(Object obj) {
        return m34226M0(obj, 0);
    }

    public void mo6143W(C2139ap apVar) {
        apVar.m35482T();
    }

    public void mo33061L2(C2964ra raVar, int i, RelativeLayout relativeLayout, boolean z, TextView textView, TextView textView2, TextView textView3, TextView textView4, C6977n2 n2Var, C6857d dVar, ImageView imageView, TextView textView5, TextView textView6) {
    }

    public int m34226M0(final Object obj, int i) {
        return m34230K0(new AbstractC5912d() {
            @Override
            public final boolean mo1511a(Object obj2) {
                boolean d1;
                d1 = C2546iq.m34181d1(obj, (C2964ra) obj2);
                return d1;
            }
        }, i, false);
    }

    public void mo6142X(C2139ap apVar) {
        apVar.m35483S();
    }

    public void mo31466M2(C2964ra raVar, C6879f3 f3Var) {
    }

    public int m34224N0(int i) {
        return m34221O0(i, -1);
    }

    public boolean m34223N1(View view) {
        C2964ra raVar = (C2964ra) view.getTag();
        return raVar != null && m34220O1(view, raVar, m34201W2(view));
    }

    public void m34222N2(C6942k3.AbstractC6945c cVar) {
        this.f8706b0 = cVar;
    }

    public int m34221O0(final int i, int i2) {
        return m34230K0(new AbstractC5912d() {
            @Override
            public final boolean mo1511a(Object obj) {
                boolean f1;
                f1 = C2546iq.m34176f1(i, (C2964ra) obj);
                return f1;
            }
        }, i2, false);
    }

    public boolean m34220O1(View view, C2964ra raVar, boolean z) {
        SparseIntArray sparseIntArray;
        int i;
        C6038h<String> hVar;
        C6038h<String> hVar2;
        SparseIntArray sparseIntArray2;
        if (z) {
            if (raVar.m32823v() == null) {
                int A = raVar.m32876A();
                int i2 = ((A == 13 || A == 85 || A == 98) && (sparseIntArray2 = this.f8715k0) != null) ? sparseIntArray2.get(raVar.m32846c()) : 0;
                if (raVar.m32835j() != i2) {
                    raVar.m32858S(true);
                    m34217Q1(raVar.m32846c(), raVar.m32835j());
                    m34183c3(raVar.m32835j(), true);
                    if (i2 != 0) {
                        C2964ra z0 = m34112z0(i2);
                        if (z0 != null) {
                            z0.m32858S(false);
                        }
                        m34183c3(i2, false);
                    }
                }
            } else {
                int A2 = raVar.m32876A();
                String str = null;
                if ((A2 == 13 || A2 == 85 || A2 == 98) && (hVar2 = this.f8716l0) != null) {
                    str = hVar2.m21471e(raVar.m32846c());
                }
                if (!C5070i.m24067c(raVar.m32823v(), str)) {
                    raVar.m32858S(true);
                    m34214R1(raVar.m32846c(), raVar.m32823v());
                    m34180d3(raVar.m32823v(), true);
                    if (str != null) {
                        C2964ra y0 = m34115y0(str);
                        if (y0 != null) {
                            y0.m32858S(false);
                        }
                        m34180d3(str, false);
                    }
                }
            }
        } else if (raVar.m32823v() == null || (hVar = this.f8716l0) == null) {
            if (!(raVar.m32823v() != null || (sparseIntArray = this.f8715k0) == null || (i = sparseIntArray.get(raVar.m32846c())) == 0)) {
                C2964ra z02 = m34112z0(i);
                if (z02 != null) {
                    z02.m32858S(false);
                }
                this.f8715k0.delete(raVar.m32846c());
            }
        } else if (hVar.m21471e(raVar.m32846c()) != null) {
            C2964ra y02 = m34115y0(raVar.m32823v());
            if (y02 != null) {
                y02.m32858S(false);
            }
            this.f8716l0.m21465k(raVar.m32846c());
            return true;
        }
        return true;
    }

    public void mo31465O2(C2964ra raVar, C6942k3 k3Var) {
        k3Var.m18393j(raVar.m32824u(), raVar.m32825t(), raVar.m32826s());
    }

    @Override
    public void mo6619P(RecyclerView recyclerView) {
        this.f8693O.add(recyclerView);
    }

    public int m34219P0(final int i, final int i2) {
        return m34231J0(new AbstractC5912d() {
            @Override
            public final boolean mo1511a(Object obj) {
                boolean g1;
                g1 = C2546iq.m34172g1(i, i2, (C2964ra) obj);
                return g1;
            }
        });
    }

    public void mo32051P2(C2964ra raVar, int i, C6992p0 p0Var, boolean z, boolean z2) {
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            m34232I2(f);
            C3950k.AbstractC3952b bVar = this.f8714j0;
            if (bVar != null) {
                bVar.mo45P5(i, f, f2, kVar);
            }
        }
    }

    public int m34218Q0(final int i) {
        return m34230K0(new AbstractC5912d() {
            @Override
            public final boolean mo1511a(Object obj) {
                boolean h1;
                h1 = C2546iq.m34169h1(i, (C2964ra) obj);
                return h1;
            }
        }, -1, true);
    }

    public final void m34217Q1(int i, int i2) {
        if (this.f8715k0 == null) {
            this.f8715k0 = new SparseIntArray();
        }
        this.f8715k0.put(i, i2);
    }

    public void m34216Q2(C2964ra raVar, C6873e3 e3Var, boolean z) {
    }

    public int m34215R0(final long j) {
        return m34231J0(new AbstractC5912d() {
            @Override
            public final boolean mo1511a(Object obj) {
                boolean i1;
                i1 = C2546iq.m34165i1(j, (C2964ra) obj);
                return i1;
            }
        });
    }

    public final void m34214R1(int i, String str) {
        if (this.f8716l0 == null) {
            this.f8716l0 = new C6038h<>();
        }
        this.f8716l0.m21466j(i, str);
    }

    public void mo503R2(C2964ra raVar, C6973n0 n0Var, boolean z) {
        n0Var.m18248v(raVar.m32824u(), null, false);
    }

    public int m34213S0(final String str) {
        return m34231J0(new AbstractC5912d() {
            @Override
            public final boolean mo1511a(Object obj) {
                boolean j1;
                j1 = C2546iq.m34162j1(str, (C2964ra) obj);
                return j1;
            }
        });
    }

    public void m34147n1(final int i) {
        if (m34200X0()) {
            C1379j0.m37334d0(new Runnable() {
                @Override
                public final void run() {
                    C2546iq.this.m34147n1(i);
                }
            });
            return;
        }
        this.f8695Q.remove(i);
        m39306O(i);
    }

    public void m34211S2(AbstractC2551e eVar) {
        this.f8699U = eVar;
    }

    @Override
    public void mo6614T(RecyclerView recyclerView) {
        this.f8693O.remove(recyclerView);
    }

    public int m34210T0(final int i) {
        return m34231J0(new AbstractC5912d() {
            @Override
            public final boolean mo1511a(Object obj) {
                boolean k1;
                k1 = C2546iq.m34158k1(i, (C2964ra) obj);
                return k1;
            }
        });
    }

    public void m34144o1(final int i) {
        if (m34200X0()) {
            C1379j0.m37334d0(new Runnable() {
                @Override
                public final void run() {
                    C2546iq.this.m34144o1(i);
                }
            });
            return;
        }
        int N0 = m34224N0(i);
        if (N0 != -1) {
            this.f8695Q.remove(N0);
            m39306O(N0);
        }
    }

    public void m34208T2(C2964ra raVar, boolean z) {
        m34220O1(null, raVar, z);
        if (!z) {
            m34183c3(raVar.m32835j(), false);
        }
    }

    @Override
    public void mo9343T5(int i, int i2) {
        if (i == 0 || i == 1) {
            m34251A1();
        } else if (i == 2) {
            m34242E1(i2);
        }
    }

    public C2139ap mo34207U0(ViewGroup viewGroup) {
        throw new RuntimeException("Stub!");
    }

    public void m34141p1(final long j) {
        if (m34200X0()) {
            C1379j0.m37334d0(new Runnable() {
                @Override
                public final void run() {
                    C2546iq.this.m34141p1(j);
                }
            });
            return;
        }
        int R0 = m34215R0(j);
        if (R0 != -1) {
            this.f8695Q.remove(R0);
            m39306O(R0);
        }
    }

    public void mo395U2(C2964ra raVar, int i, C4022o oVar, boolean z) {
    }

    public C2139ap mo34205V0(ViewGroup viewGroup, int i) {
        throw new RuntimeException("Stub!");
    }

    public void m34204V1(int i, int i2) {
        for (int i3 = (i + i2) - 1; i3 >= i; i3--) {
            this.f8695Q.remove(i3);
        }
        m39307N(i, i2);
    }

    public void mo394V2(C2964ra raVar, C9137c cVar, boolean z) {
    }

    public final void m34203W0(C2964ra raVar, CustomRecyclerView customRecyclerView) {
        boolean z = customRecyclerView.getAdapter() == null;
        if (z) {
            customRecyclerView.m39422k(new C2548b());
        }
        int g = raVar.m32838g();
        int o = raVar.m32830o();
        if (g != -1) {
            ((LinearLayoutManager) customRecyclerView.getLayoutManager()).m39522z2(g, o);
        } else {
            ((LinearLayoutManager) customRecyclerView.getLayoutManager()).m39522z2(0, 0);
        }
        mo9532H2(raVar, customRecyclerView, z);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) customRecyclerView.getLayoutManager();
        if (linearLayoutManager.m39534m2() != C4403w.m27984G2()) {
            linearLayoutManager.m39572B2(C4403w.m27984G2());
        }
    }

    public void m34202W1(List<C2964ra> list) {
        int D = mo6153D();
        this.f8695Q.clear();
        if (list != null) {
            this.f8695Q.addAll(list);
        }
        C7389v0.m16567w2(this, D);
    }

    public boolean m34201W2(View view) {
        return m34198X2(view, view.getTag() instanceof C2964ra ? (C2964ra) view.getTag() : m34112z0(view.getId()));
    }

    public final boolean m34200X0() {
        for (RecyclerView recyclerView : this.f8693O) {
            if (recyclerView.m39500C0()) {
                return true;
            }
        }
        return false;
    }

    public int m34199X1() {
        SparseIntArray sparseIntArray = this.f8715k0;
        if (sparseIntArray != null) {
            sparseIntArray.clear();
        }
        C6038h<String> hVar = this.f8716l0;
        if (hVar != null) {
            hVar.m21474b();
        }
        boolean z = false;
        int i = 0;
        int i2 = -1;
        for (C2964ra raVar : this.f8695Q) {
            if (raVar.m32876A() == 30) {
                m34217Q1(raVar.m32835j(), raVar.m32826s());
            } else if (raVar.m32873D()) {
                if (raVar.m32823v() != null) {
                    m34214R1(raVar.m32846c(), raVar.m32823v());
                } else {
                    m34217Q1(raVar.m32846c(), raVar.m32835j());
                }
                if (!z) {
                    if (i2 == -1) {
                        i2 = i;
                    } else {
                        z = true;
                        i2 = -1;
                    }
                }
            }
            i++;
        }
        return i2;
    }

    public boolean m34198X2(View view, C2964ra raVar) {
        if (view == null) {
            return false;
        }
        if (raVar == null && (view.getTag() instanceof C2964ra)) {
            raVar = (C2964ra) view.getTag();
        }
        if (raVar == null) {
            return false;
        }
        boolean z = view instanceof C9137c;
        if (z) {
            C9137c cVar = (C9137c) view;
            if (cVar.getToggler() != null) {
                return cVar.m10202h2();
            }
        }
        int A = raVar.m32876A();
        if (A != 12) {
            if (A != 13) {
                if (!(A == 47 || A == 69 || A == 77)) {
                    if (A != 85) {
                        if (A == 88 || A == 80) {
                            return z && ((C9139d) ((FrameLayoutFix) view).getChildAt(0)).m10184t(true);
                        }
                        if (A != 81) {
                            if (A != 98) {
                                if (A != 99) {
                                    return false;
                                }
                            }
                        } else if (!(view instanceof C9256o0)) {
                            return false;
                        } else {
                            C9256o0 o0Var = (C9256o0) view;
                            return o0Var.m9793J0() && o0Var.m9782n1(true);
                        }
                    }
                }
            }
            if (!z) {
                return false;
            }
            C6985o2 o2Var = (C6985o2) ((C9137c) view).getChildAt(0);
            if (!o2Var.m18180a()) {
                o2Var.m18175f();
            }
            return true;
        }
        return z && ((C7057w) ((C9137c) view).getChildAt(0)).m17930h();
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    public void m34197Y1(int i) {
        int N0 = m34224N0(i);
        if (N0 != -1) {
            m34194Z1(N0);
        }
    }

    public void m34196Y2() {
        int i = 0;
        for (C2964ra raVar : this.f8695Q) {
            int A = raVar.m32876A();
            if (A == 16 || A == 76) {
                m34160j3(i);
            }
            i++;
        }
    }

    public boolean m34195Z0() {
        return this.f8708d0;
    }

    public void m34194Z1(int i) {
        if (i != -1) {
            for (RecyclerView recyclerView : this.f8693O) {
                View C = recyclerView.getLayoutManager().mo39262C(i);
                if (C != null && (C instanceof RecyclerView)) {
                    ((LinearLayoutManager) ((RecyclerView) C).getLayoutManager()).m39522z2(0, 0);
                }
            }
        }
    }

    public void m34193Z2() {
        if (!this.f8695Q.isEmpty()) {
            int i = 0;
            for (C2964ra raVar : this.f8695Q) {
                if (C2139ap.m35481U(raVar.m32876A())) {
                    m34124u3(i);
                }
                i++;
            }
        }
    }

    public void m34190a2(C2964ra raVar, TextView textView, boolean z) {
        textView.setText(raVar.m32824u());
    }

    public void m34189a3(AbstractC5912d<C2964ra> dVar) {
        int i = 0;
        for (C2964ra raVar : this.f8695Q) {
            if (dVar.mo1511a(raVar)) {
                m34124u3(i);
            }
            i++;
        }
    }

    public void mo17892b0(View$OnFocusChangeListenerC7069y1 y1Var, boolean z) {
        AbstractC9323v4<?> v4Var = this.f8697S;
        if (v4Var != null && z) {
            v4Var.mo9438Fd(y1Var.getEditText(), this.f8698T);
        }
    }

    public void m34187b2(C2964ra raVar, C7065x2 x2Var, boolean z) {
        String upperCase = raVar.m32824u() != null ? raVar.m32824u().toString().toUpperCase() : null;
        if (z) {
            x2Var.m17929a(upperCase);
        } else {
            C1399s0.m37175j0(x2Var, upperCase);
        }
    }

    public void m34186b3(int i) {
        int i2 = -1;
        while (true) {
            i2 = m34221O0(i, i2 + 1);
            if (i2 != -1) {
                m34124u3(i2);
            } else {
                return;
            }
        }
    }

    public void mo9531c2(C2964ra raVar, int i, C6981o oVar) {
    }

    public void m34183c3(int i, boolean z) {
        int N0 = m34224N0(i);
        if (N0 != -1) {
            m34175f2(N0, z);
        }
    }

    public void mo505d2(C2964ra raVar, C7093z3 z3Var) {
    }

    public void m34180d3(String str, boolean z) {
        int S0 = m34213S0(str);
        if (S0 != -1) {
            m34175f2(S0, z);
        }
    }

    public void mo502e2(C2964ra raVar, int i, C9621o oVar) {
    }

    public void m34178e3(int i, boolean z, boolean z2) {
        int N0 = m34224N0(i);
        if (N0 != -1) {
            for (RecyclerView recyclerView : this.f8693O) {
                View C = recyclerView.getLayoutManager().mo39262C(N0);
                if (C != null) {
                    View$OnFocusChangeListenerC7069y1 y1Var = (View$OnFocusChangeListenerC7069y1) ((ViewGroup) C).getChildAt(0);
                    y1Var.setInGoodState(z);
                    y1Var.setInErrorState(z2);
                }
            }
        }
    }

    public final void m34175f2(int i, boolean z) {
        int A;
        this.f8695Q.get(i).m32858S(z);
        boolean z2 = false;
        for (RecyclerView recyclerView : this.f8693O) {
            View C = recyclerView.getLayoutManager().mo39262C(i);
            if (C != null) {
                if (C instanceof C9137c) {
                    C9137c cVar = (C9137c) C;
                    if (cVar.getChildCount() > 0 && C.getId() == this.f8695Q.get(i).m32835j()) {
                        View childAt = cVar.getChildAt(0);
                        if (childAt instanceof C7057w) {
                            ((C7057w) childAt).m17933e(z, true);
                        } else if (childAt instanceof C6985o2) {
                            ((C6985o2) childAt).m18178c(z, true);
                        }
                    }
                }
                if (C instanceof FrameLayoutFix) {
                    FrameLayoutFix frameLayoutFix = (FrameLayoutFix) C;
                    if (frameLayoutFix.getChildCount() == 2 && C.getId() == this.f8695Q.get(i).m32835j() && ((A = this.f8695Q.get(i).m32876A()) == 80 || A == 88)) {
                        View childAt2 = frameLayoutFix.getChildAt(1);
                        if (childAt2 instanceof C9139d) {
                            C9139d dVar = (C9139d) childAt2;
                            dVar.m10186r(z, true);
                            dVar.m10191m(true);
                        }
                    }
                }
                if ((C instanceof C9256o0) && this.f8695Q.get(i).m32876A() == 81) {
                    ((C9256o0) C).m9787c1(z, true);
                }
            }
            z2 = true;
        }
        if (z2) {
            m39312I(i);
        }
    }

    public void m34135r1(final int i) {
        if (i == -1) {
            return;
        }
        if (m34200X0()) {
            C1379j0.m37334d0(new Runnable() {
                @Override
                public final void run() {
                    C2546iq.this.m34135r1(i);
                }
            });
        } else {
            m39312I(i);
        }
    }

    @Override
    public final AbstractC7821f.C7830i mo18061g() {
        AbstractC7821f.C7830i iVar = this.f8707c0;
        if (iVar != null) {
            return iVar;
        }
        AbstractC7821f.C7830i iVar2 = new AbstractC7821f.C7830i();
        this.f8707c0 = iVar2;
        return iVar2;
    }

    @Override
    public void mo452g2() {
        for (RecyclerView recyclerView : this.f8693O) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int X1 = linearLayoutManager.m39549X1();
            int a2 = linearLayoutManager.m39546a2();
            for (int i = X1; i <= a2; i++) {
                View C = linearLayoutManager.mo39262C(i);
                if (C != null) {
                    C.invalidate();
                }
            }
            if (X1 > 0) {
                m39309L(0, X1);
            }
            if (a2 < mo6153D() - 1) {
                m39309L(a2, mo6153D() - a2);
            }
        }
    }

    public void m34171g3(int i) {
        m34135r1(m34224N0(i));
    }

    @Override
    public final void mo18388h(C6942k3 k3Var, int i) {
        m34217Q1(k3Var.getId(), i);
        C2964ra raVar = (C2964ra) k3Var.getTag();
        int s = raVar.m32826s();
        raVar.m32855V(i);
        mo31467J1(raVar, k3Var, i, s);
    }

    public void m34168h2(C4336c.AbstractC4337a aVar) {
        this.f8703Y = aVar;
    }

    public void m34167h3(int i, String str) {
        int N0 = m34224N0(i);
        if (N0 != -1) {
            for (RecyclerView recyclerView : this.f8693O) {
                View C = recyclerView.getLayoutManager().mo39262C(N0);
                if (C != null) {
                    ((View$OnFocusChangeListenerC7069y1) ((ViewGroup) C).getChildAt(0)).setBlockedText(str);
                }
            }
        }
    }

    public void mo17889i2(View$OnFocusChangeListenerC7069y1 y1Var, CharSequence charSequence) {
        AbstractC2551e eVar;
        int N0;
        String charSequence2 = charSequence.toString();
        int id2 = ((ViewGroup) y1Var.getParent()).getId();
        C2964ra raVar = (y1Var.getParent() == null || !(((ViewGroup) y1Var.getParent()).getTag() instanceof C2964ra)) ? null : (C2964ra) ((ViewGroup) y1Var.getParent()).getTag();
        if (raVar == null && (N0 = m34224N0(id2)) != -1) {
            raVar = this.f8695Q.get(N0);
        }
        boolean z = true;
        if (raVar != null) {
            if (!C5070i.m24067c(raVar.m32821x(), charSequence2)) {
                raVar.m32847b0(charSequence2);
            } else {
                z = false;
            }
        }
        if (z && (eVar = this.f8699U) != null) {
            eVar.mo30698K(id2, raVar, y1Var, charSequence2);
        }
    }

    public void m34164i3(long j) {
        int R0 = m34215R0(j);
        if (R0 != -1) {
            m34160j3(R0);
        }
    }

    public void mo11045j(C8872e eVar, float f, float f2, boolean z) {
    }

    public final void m34161j2(C2964ra raVar, int i, ViewGroup viewGroup, View view) {
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(4);
        View$OnFocusChangeListenerC7069y1 y1Var = (View$OnFocusChangeListenerC7069y1) viewGroup2.getChildAt(3);
        View$OnFocusChangeListenerC7069y1 y1Var2 = (View$OnFocusChangeListenerC7069y1) viewGroup.getChildAt(5);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup.getChildAt(6);
        View$OnFocusChangeListenerC7069y1 y1Var3 = (View$OnFocusChangeListenerC7069y1) viewGroup3.getChildAt(3);
        ViewGroup viewGroup4 = (ViewGroup) viewGroup.getChildAt(7);
        C6853c2 c2Var = (C6853c2) viewGroup4.getChildAt(1);
        ViewGroup viewGroup5 = (ViewGroup) viewGroup.getChildAt(8);
        C6853c2 c2Var2 = (C6853c2) viewGroup5.getChildAt(1);
        C6853c2 c2Var3 = (C6853c2) viewGroup5.getChildAt(2);
        mo34157k2(raVar, i, viewGroup, view, (C8872e) viewGroup.getChildAt(0), (C8426a) viewGroup.getChildAt(1), (C8426a) viewGroup.getChildAt(2), (View$OnFocusChangeListenerC7069y1) viewGroup.getChildAt(3), (View$OnFocusChangeListenerC7069y1) viewGroup2.getChildAt(0), (View$OnFocusChangeListenerC7069y1) viewGroup2.getChildAt(1), (View$OnFocusChangeListenerC7069y1) viewGroup2.getChildAt(2), y1Var, y1Var2, (View$OnFocusChangeListenerC7069y1) viewGroup3.getChildAt(0), (View$OnFocusChangeListenerC7069y1) viewGroup3.getChildAt(1), (View$OnFocusChangeListenerC7069y1) viewGroup3.getChildAt(2), y1Var3, (C6853c2) viewGroup5.getChildAt(3), (C6853c2) viewGroup4.getChildAt(0), c2Var, (C6853c2) viewGroup5.getChildAt(0), c2Var2, c2Var3, (C6853c2) viewGroup5.getChildAt(4));
    }

    public void m34160j3(int i) {
        if (i != -1) {
            boolean z = false;
            for (RecyclerView recyclerView : this.f8693O) {
                View C = recyclerView.getLayoutManager().mo39262C(i);
                if (C == null || C.getTag() != this.f8695Q.get(i) || !(C instanceof RelativeLayout)) {
                    z = true;
                } else {
                    m34229K2(this.f8695Q.get(i), i, (RelativeLayout) C, true);
                }
            }
            if (z) {
                m39312I(i);
            }
        }
    }

    public void mo11044k(C8872e eVar, boolean z) {
        C8871d.m11054a(this, eVar, z);
    }

    public void mo34157k2(C2964ra raVar, int i, ViewGroup viewGroup, View view, C8872e eVar, C8426a aVar, C8426a aVar2, View$OnFocusChangeListenerC7069y1 y1Var, View$OnFocusChangeListenerC7069y1 y1Var2, View$OnFocusChangeListenerC7069y1 y1Var3, View$OnFocusChangeListenerC7069y1 y1Var4, View$OnFocusChangeListenerC7069y1 y1Var5, View$OnFocusChangeListenerC7069y1 y1Var6, View$OnFocusChangeListenerC7069y1 y1Var7, View$OnFocusChangeListenerC7069y1 y1Var8, View$OnFocusChangeListenerC7069y1 y1Var9, View$OnFocusChangeListenerC7069y1 y1Var10, C6853c2 c2Var, C6853c2 c2Var2, C6853c2 c2Var3, C6853c2 c2Var4, C6853c2 c2Var5, C6853c2 c2Var6, C6853c2 c2Var7) {
    }

    public void m34156k3(int i) {
        int N0 = m34224N0(i);
        if (N0 != -1) {
            m34152l3(N0);
        }
    }

    public void mo18765l(C6853c2 c2Var, boolean z) {
    }

    public void mo34153l2(C2964ra raVar, C2139ap apVar, int i) {
    }

    public void m34152l3(int i) {
        RecyclerView.AbstractC0886d0 l0;
        if (i != -1) {
            boolean z = false;
            for (RecyclerView recyclerView : this.f8693O) {
                View C = recyclerView.getLayoutManager().mo39262C(i);
                if (C == null || (l0 = recyclerView.m39418l0(C)) == null || !(l0 instanceof C2139ap)) {
                    z = true;
                } else {
                    mo6146Q((C2139ap) l0, i);
                }
            }
            if (z) {
                m39312I(i);
            }
        }
    }

    public void mo23799m(View view, float f, boolean z) {
    }

    public void mo32877m2(C2964ra raVar, int i, C6992p0 p0Var, boolean z) {
    }

    public void m34149m3(long j) {
        int R0 = m34215R0(j);
        if (R0 != -1) {
            m34146n3(R0);
        }
    }

    public void mo9112n2(C2964ra raVar, C9256o0 o0Var, C7025s3 s3Var, boolean z) {
    }

    public void m34146n3(int i) {
        boolean z = false;
        for (RecyclerView recyclerView : this.f8693O) {
            View C = recyclerView.getLayoutManager().mo39262C(i);
            if (C == null || !(C instanceof C6992p0)) {
                z = true;
            } else {
                mo32051P2(this.f8695Q.get(i), i, (C6992p0) C, this.f8695Q.get(i).m32876A() == 26, true);
            }
        }
        if (z) {
            m39312I(i);
        }
    }

    public void mo23798o(View view, boolean z) {
        C5149w.m23802a(this, view, z);
    }

    public void mo32962o2(C2964ra raVar, TextView textView) {
    }

    public int m34143o3(long j, boolean z) {
        int R0 = m34215R0(j);
        if (R0 != -1) {
            m34140p3(R0, z);
        }
        return R0;
    }

    @Override
    public void mo443o4() {
        C11031u1.m1981a(this);
    }

    public void mo426p2(C2964ra raVar, int i, EmbeddableStickerView embeddableStickerView, boolean z) {
    }

    public void m34140p3(int i, boolean z) {
        if (i != -1) {
            boolean z2 = false;
            for (RecyclerView recyclerView : this.f8693O) {
                View C = recyclerView.getLayoutManager().mo39262C(i);
                if (C == null || !(C instanceof C4022o)) {
                    z2 = true;
                } else {
                    if (z) {
                        ((C4022o) C).m29276c1();
                    } else {
                        ((C4022o) C).m29279Q0();
                    }
                    C.invalidate();
                }
            }
            if (z2) {
                m39312I(i);
            }
        }
    }

    public void mo33213q2(C2964ra raVar, TextView textView, boolean z) {
        C1399s0.m37175j0(textView, raVar.m32824u());
    }

    public void m34137q3(C2964ra raVar) {
        int H0 = m34235H0(raVar);
        if (H0 != -1) {
            m34124u3(H0);
        }
    }

    @Override
    public int mo11422r(int i) {
        if (this.f8695Q.isEmpty()) {
            return C2139ap.m35479W(mo6150F(i));
        }
        int size = this.f8695Q.size();
        int i2 = 0;
        for (int i3 = 0; i3 < i && i3 < size; i3++) {
            i2 += C2139ap.m35478X(this.f8695Q.get(i3));
        }
        return i2;
    }

    public void m34134r2(AbstractC5109d0 d0Var) {
        this.f8705a0 = d0Var;
    }

    public void m34133r3(Object obj) {
        int L0 = m34228L0(obj);
        if (L0 != -1) {
            m34124u3(L0);
        }
    }

    public void m34132s0(RecyclerView recyclerView, View view, int i) {
        recyclerView.m39422k(new C2547a(i, view));
    }

    public void mo33136s1(C2964ra raVar, C6952l3 l3Var, C7057w wVar, boolean z) {
    }

    public void m34131s2(boolean z, boolean z2, C3950k.AbstractC3952b bVar) {
        if (this.f8708d0 != z) {
            this.f8708d0 = z;
            this.f8713i0 = z2;
            this.f8714j0 = bVar;
            m34121w0(z ? 1.0f : 0.0f);
        }
    }

    public void m34130s3(int i) {
        int N0 = m34224N0(i);
        if (N0 != -1) {
            m34124u3(N0);
        }
    }

    public void m34129t0(int i, C2964ra raVar) {
        m34188b1(i, raVar);
    }

    public void mo34128t1(C2139ap apVar, int i, C2964ra raVar, int i2, View view, boolean z) {
    }

    public void mo393t2(C2964ra raVar, int i, C7030t1 t1Var) {
    }

    public void m34127t3(long j) {
        int R0 = m34215R0(j);
        if (R0 != -1) {
            m34124u3(R0);
        }
    }

    public void m34188b1(final int i, final C2964ra... raVarArr) {
        boolean z;
        if (m34200X0()) {
            C1379j0.m37334d0(new Runnable() {
                @Override
                public final void run() {
                    C2546iq.this.m34188b1(i, raVarArr);
                }
            });
        } else if (raVarArr.length > 0) {
            int length = raVarArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                } else if (m34191a1(raVarArr[i2].m32876A())) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (raVarArr.length == 1) {
                this.f8695Q.add(i, raVarArr[0]);
                m39311J(i);
            } else {
                this.f8695Q.addAll(i, Arrays.asList(raVarArr));
                m39308M(i, raVarArr.length);
            }
            if (z) {
                m34199X1();
            }
        }
    }

    public void mo33135u1(C2964ra raVar, TextView textView) {
    }

    public void m34125u2(int i, int i2) {
        int i3;
        SparseIntArray sparseIntArray = this.f8715k0;
        if (sparseIntArray != null && (i3 = sparseIntArray.get(i)) != i2) {
            this.f8715k0.put(i, i2);
            m34183c3(i3, false);
            m34183c3(i2, true);
        }
    }

    public void m34124u3(int i) {
        boolean z;
        C2964ra E0 = m34243E0(i);
        if (E0 != null) {
            boolean z2 = false;
            for (RecyclerView recyclerView : this.f8693O) {
                View C = recyclerView.getLayoutManager().mo39262C(i);
                if (C == null || C.getId() != E0.m32835j()) {
                    z2 = true;
                } else if (C instanceof C9137c) {
                    mo394V2(E0, (C9137c) C, true);
                } else {
                    int A = E0.m32876A();
                    if (A == 10) {
                        z = C instanceof TextView;
                        if (z) {
                            m34190a2(E0, (TextView) C, true);
                        }
                    } else if (A == 20) {
                        z = (C instanceof ViewGroup) && (((ViewGroup) C).getChildAt(0) instanceof C7065x2);
                        if (z) {
                            m34187b2(E0, (C7065x2) ((ViewGroup) C).getChildAt(0), true);
                        }
                    } else if (A != 79) {
                        switch (A) {
                            case 81:
                                z = (C instanceof C9256o0) && ((C9256o0) C).m9793J0();
                                if (z) {
                                    mo9112n2(E0, (C9256o0) C, null, true);
                                    break;
                                }
                                break;
                            case 82:
                            case 83:
                                z = C instanceof C8795k2;
                                if (z) {
                                    mo11660G2(E0, i, (C8795k2) C, true);
                                    break;
                                }
                                break;
                            default:
                                z = false;
                                break;
                        }
                    } else {
                        z = (C instanceof C9256o0) && !((C9256o0) C).m9793J0();
                        if (z) {
                            mo9112n2(E0, (C9256o0) C, null, true);
                        }
                    }
                    if (!z) {
                        C2139ap apVar = (C2139ap) recyclerView.m39418l0(C);
                        int k = apVar != null ? apVar.m39335k() : -1;
                        if (k != -1) {
                            mo6146Q(apVar, k);
                        } else {
                            m39312I(i);
                        }
                    }
                }
            }
            if (z2) {
                m39312I(i);
            }
        }
    }

    @Override
    public int mo11421v(int i) {
        int i2;
        int D = mo6153D();
        int size = this.f8695Q.size();
        int i3 = 0;
        if (size == 0) {
            i2 = 0;
            while (i3 < D) {
                i2 += C2139ap.m35479W(mo6150F(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < D && i3 < size) {
                i4 += C2139ap.m35478X(this.f8695Q.get(i3));
                i3++;
            }
            i2 = i4;
        }
        return i < 0 ? i2 : Math.min(i, i2);
    }

    public void mo30690v1(C2964ra raVar, ViewGroup viewGroup, View$OnFocusChangeListenerC7069y1 y1Var) {
    }

    public void m34123v2(int i, boolean z, int i2) {
        boolean z2 = false;
        for (RecyclerView recyclerView : this.f8693O) {
            View C = recyclerView.getLayoutManager().mo39262C(i);
            if (C == null || !(C instanceof AbstractC5124k0)) {
                z2 = true;
            } else {
                ((AbstractC5124k0) C).mo5809i(z, i2);
            }
        }
        if (z2) {
            m39312I(i);
        }
    }

    public void mo34122v3(C2139ap apVar, int i, int i2) {
        if (i < this.f8695Q.size()) {
            C2964ra raVar = this.f8695Q.get(i);
            apVar.f3479a.setId(raVar.m32835j());
            apVar.f3479a.setTag(raVar);
            int i3 = R.id.theme_color_background_textLight;
            AbstractC2420g6.C2421a aVar = null;
            AbstractC4718o<?> oVar = null;
            boolean z = true;
            switch (i2) {
                case 1:
                    mo34062J2(raVar, i, (C6862d3) apVar.f3479a);
                    return;
                case 2:
                case 3:
                    mo31466M2(raVar, (C6879f3) apVar.f3479a);
                    int y = raVar.m32820y(0);
                    if (y != 0) {
                        apVar.f3479a.setBackgroundColor(C11524j.m228N(y));
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
                    ((C9137c) apVar.f3479a).setIcon(raVar.m32836i());
                    ((C9137c) apVar.f3479a).setName(raVar.m32824u());
                    ((C9137c) apVar.f3479a).setIgnoreEnabled(false);
                    ((C9137c) apVar.f3479a).setTextColorId(raVar.m32820y(R.id.theme_color_text));
                    apVar.f3479a.setEnabled(true);
                    mo394V2(raVar, (C9137c) apVar.f3479a, false);
                    if (i2 == 69 || i2 == 85) {
                        C6857d dVar = (C6857d) ((C9137c) apVar.f3479a).getChildAt(1);
                        if (raVar.m32844d() instanceof C11131y6) {
                            dVar.setUser((C11131y6) raVar.m32844d());
                        } else {
                            C10930q6 q6Var = this.f8692N;
                            if (raVar.m32844d() instanceof C10930q6) {
                                q6Var = (C10930q6) raVar.m32844d();
                            }
                            dVar.m18745q(q6Var, raVar.m32831n(), false);
                        }
                    }
                    if (i2 != 12) {
                        if (i2 != 13) {
                            if (!(i2 == 47 || i2 == 69 || i2 == 77)) {
                                if (!(i2 == 85 || i2 == 98)) {
                                    if (i2 != 99) {
                                        return;
                                    }
                                }
                            }
                        }
                        C6985o2 O1 = ((C9137c) apVar.f3479a).m10216O1();
                        O1.m18178c(raVar.m32873D(), false);
                        O1.setColorId(raVar.m32828q());
                        C1399s0.m37189c0(O1, (C4403w.m27984G2() ? 3 : 5) | 16);
                        return;
                    }
                    C7057w wVar = (C7057w) ((C9137c) apVar.f3479a).getChildAt(0);
                    wVar.m17933e(raVar.m32873D(), false);
                    if (i2 != 77) {
                        z = false;
                    }
                    C1399s0.m37189c0(wVar, (z != C4403w.m27984G2() ? 3 : 5) | 16);
                    return;
                case 5:
                case 6:
                case 37:
                case 87:
                case 89:
                case 90:
                case 91:
                case 92:
                    C9137c cVar = (C9137c) apVar.f3479a;
                    cVar.setIcon(raVar.m32836i());
                    cVar.setName(raVar.m32824u());
                    cVar.setTextColorId(raVar.m32820y(0));
                    apVar.f3479a.setEnabled(true);
                    switch (i2) {
                        case 90:
                            C1399s0.m37189c0(((ViewGroup) apVar.f3479a).getChildAt(0), (C4403w.m27984G2() ? 5 : 3) | 16);
                            break;
                        case 91:
                            C1399s0.m37189c0(((ViewGroup) apVar.f3479a).getChildAt(0), (C4403w.m27984G2() ? 3 : 5) | 16);
                            break;
                        case 92:
                            ((C9137c) apVar.f3479a).m10220J1(true);
                            break;
                    }
                    mo394V2(raVar, cVar, false);
                    return;
                case 7:
                case 67:
                    C9137c cVar2 = (C9137c) apVar.f3479a;
                    cVar2.setName(raVar.m32824u());
                    cVar2.getToggler().m10191m(true);
                    apVar.f3479a.setEnabled(true);
                    mo394V2(raVar, (C9137c) apVar.f3479a, false);
                    return;
                case 8:
                case 70:
                case 110:
                    TextView textView = (TextView) apVar.f3479a;
                    mo33213q2(raVar, textView, false);
                    textView.setTextColor(C11524j.m228N(raVar.m32820y(R.id.theme_color_background_textLight)));
                    textView.setGravity(C4403w.m27985G1(16));
                    return;
                case 9:
                case 71:
                case 93:
                    TextView textView2 = (TextView) apVar.f3479a;
                    if (i2 == 71) {
                        i3 = R.id.theme_color_textLight;
                    }
                    textView2.setTextColor(C11524j.m228N(raVar.m32820y(i3)));
                    int i4 = C1357a0.m37541i(16.0f) + raVar.m32819z();
                    textView2.setText(raVar.m32824u());
                    if (apVar.f3479a.getPaddingLeft() != i4) {
                        View view = apVar.f3479a;
                        view.setPadding(i4, view.getPaddingTop(), apVar.f3479a.getPaddingRight(), apVar.f3479a.getPaddingBottom());
                    }
                    if (i2 != 71) {
                        textView2.setGravity(C4403w.m27985G1(16));
                    }
                    mo33135u1(raVar, textView2);
                    return;
                case 10:
                    m34190a2(raVar, (TextView) apVar.f3479a, false);
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
                case C3563j.f11922E0:
                case 97:
                case 107:
                case 108:
                case 109:
                case 112:
                case 113:
                case C3563j.f11927F0:
                case C3563j.f11932G0:
                case C3563j.f11937H0:
                case C3563j.f11942I0:
                case C3563j.f11947J0:
                case C3563j.f11952K0:
                case C3563j.f11967N0:
                case C3563j.f11972O0:
                case C3563j.f11977P0:
                case 125:
                case 126:
                case 127:
                case Log.TAG_YOUTUBE:
                case 129:
                default:
                    if (i2 <= -1) {
                        mo34128t1(apVar, i, raVar, (-1) - i2, apVar.f3479a, false);
                        return;
                    }
                    return;
                case 16:
                case 76:
                    m34229K2(raVar, i, (RelativeLayout) apVar.f3479a, false);
                    return;
                case 19:
                case 75:
                    ViewGroup viewGroup = (ViewGroup) ((ViewGroup) apVar.f3479a).getChildAt(0);
                    if (i2 == 19) {
                        ((ImageView) viewGroup.getChildAt(0)).setImageResource(raVar.m32836i());
                    }
                    ((TextView) viewGroup.getChildAt(1)).setText(raVar.m32824u());
                    return;
                case 20:
                    m34187b2(raVar, (C7065x2) ((ViewGroup) apVar.f3479a).getChildAt(0), false);
                    return;
                case 21:
                    mo32962o2(raVar, (TextView) ((RelativeLayout) ((FrameLayoutFix) apVar.f3479a).getChildAt(0)).getChildAt(2));
                    return;
                case 22:
                    apVar.f3479a.setEnabled(true);
                    C6873e3 e3Var = (C6873e3) apVar.f3479a;
                    e3Var.setTitle(raVar.m32824u());
                    e3Var.mo8255s();
                    m34216Q2(raVar, e3Var, false);
                    return;
                case 23:
                case 26:
                    C6992p0 p0Var = (C6992p0) apVar.f3479a;
                    p0Var.mo8255s();
                    if (i2 != 26) {
                        z = false;
                    }
                    mo32051P2(raVar, i, p0Var, z, false);
                    return;
                case C3563j.f11955K3:
                    ((TextView) apVar.f3479a).setText(raVar.m32824u());
                    ((TextView) apVar.f3479a).setTextColor(C11524j.m228N(raVar.m32820y(R.id.theme_color_background_textLight)));
                    return;
                case 27:
                    mo395U2(raVar, i, (C4022o) apVar.f3479a, false);
                    return;
                case 28:
                    ((C6973n0) apVar.f3479a).m18246y(raVar.m32824u(), null, false);
                    return;
                case C3563j.f11980P3:
                    if (apVar.f3479a.getMeasuredHeight() != C1357a0.m37544f() / 2) {
                        apVar.f3479a.requestLayout();
                        return;
                    }
                    return;
                case 30:
                    mo31465O2(raVar, (C6942k3) apVar.f3479a);
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
                    View$OnFocusChangeListenerC7069y1 y1Var = (View$OnFocusChangeListenerC7069y1) ((ViewGroup) apVar.f3479a).getChildAt(0);
                    y1Var.m17916S1(C4403w.m27984G2());
                    y1Var.setHint(raVar.m32824u());
                    y1Var.setText(raVar.m32821x());
                    AbstractC2420g6.C2421a p = raVar.m32829p();
                    if (p != null) {
                        y1Var.getEditText().setImeOptions(268435456 | p.m34622a());
                        C7043v1 editText = y1Var.getEditText();
                        if (p.m34621b()) {
                            aVar = p;
                        }
                        editText.setOnEditorActionListener(aVar);
                    } else {
                        y1Var.getEditText().setOnEditorActionListener(null);
                        y1Var.getEditText().setImeOptions(268435456);
                    }
                    if (raVar.m32834k() != null) {
                        y1Var.getEditText().setFilters(raVar.m32834k());
                    }
                    mo30690v1(raVar, (ViewGroup) apVar.f3479a, y1Var);
                    return;
                case Log.TAG_IMAGE_LOADER:
                    mo34153l2(raVar, apVar, i);
                    return;
                case 33:
                    ViewGroup viewGroup2 = (ViewGroup) apVar.f3479a;
                    ((TextView) viewGroup2.getChildAt(0)).setText(raVar.m32824u());
                    ((TextView) viewGroup2.getChildAt(1)).setText((String) raVar.m32844d());
                    return;
                case 35:
                    ((C2139ap.C2151l) apVar.f3479a).setItem(raVar);
                    return;
                case 38:
                    mo504C2(raVar, i, (RecyclerView) apVar.f3479a);
                    return;
                case 39:
                    return;
                case 40:
                    ((C1355a) apVar.f3479a).setListener(this.f8700V);
                    ((C1355a) apVar.f3479a).setItem((C8112b) raVar.m32844d());
                    C1355a aVar2 = (C1355a) apVar.f3479a;
                    float f = 1.0f;
                    float f2 = this.f8708d0 ? 1.0f : 0.0f;
                    if (!raVar.m32873D()) {
                        f = 0.0f;
                    }
                    aVar2.m37563A(f2, f);
                    return;
                case 41:
                    Object d = raVar.m32844d();
                    C10185a aVar3 = (C10185a) apVar.f3479a;
                    if (d instanceof AbstractC4718o) {
                        oVar = (AbstractC4718o) d;
                    } else if (d instanceof C4599c1) {
                        oVar = ((C4599c1) d).m27065Y();
                    }
                    aVar3.setInlineResult(oVar);
                    ((C10185a) apVar.f3479a).m5807u(raVar.m32873D(), raVar.m32827r());
                    return;
                case 42:
                    mo393t2(raVar, i, (C7030t1) apVar.f3479a);
                    return;
                case 44:
                    ((C6852c1) apVar.f3479a).m18776b(raVar.m32833l(), raVar.m32848b(), raVar.m32821x());
                    return;
                case 45:
                case 46:
                    mo32877m2(raVar, i, (C6992p0) apVar.f3479a, false);
                    return;
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                    ((C6861d2) apVar.f3479a).setBlock((AbstractC4576a1) raVar.m32844d());
                    return;
                case 53:
                case 54:
                case 55:
                case 111:
                    ((RunnableC6868e2) apVar.f3479a).setBlock((AbstractC4576a1) raVar.m32844d());
                    return;
                case 57:
                    mo9531c2(raVar, i, (C6981o) apVar.f3479a);
                    return;
                case 58:
                    m34203W0(raVar, (CustomRecyclerView) apVar.f3479a);
                    return;
                case 59:
                case 60:
                    mo505d2(raVar, (C7093z3) apVar.f3479a);
                    return;
                case 61:
                    TextView textView3 = (TextView) ((FrameLayoutFix) apVar.f3479a).getChildAt(0);
                    textView3.setGravity(C4403w.m27985G1(16));
                    mo33213q2(raVar, textView3, false);
                    textView3.setTextColor(C11524j.m228N(raVar.m32820y(R.id.theme_color_background_textLight)));
                    ImageView imageView = (ImageView) ((FrameLayoutFix) apVar.f3479a).getChildAt(1);
                    imageView.setId(raVar.m32835j());
                    imageView.setImageResource(raVar.m32836i());
                    imageView.setTag(raVar);
                    C1399s0.m37185e0(imageView, C4403w.m27984G2());
                    C1399s0.m37187d0((FrameLayout.LayoutParams) imageView.getLayoutParams(), C4403w.m27984G2() ? 3 : 5);
                    return;
                case 63:
                    if (raVar.m32844d() instanceof C4649h) {
                        ((C6952l3) apVar.f3479a).setChat((C4649h) raVar.m32844d());
                    }
                    mo33136s1(raVar, (C6952l3) apVar.f3479a, null, false);
                    return;
                case Log.TAG_SPEED_TEXT:
                    FrameLayoutFix frameLayoutFix = (FrameLayoutFix) apVar.f3479a;
                    ((C6952l3) frameLayoutFix.getChildAt(0)).setChat((C4649h) raVar.m32844d());
                    mo33136s1(raVar, (C6952l3) frameLayoutFix.getChildAt(0), (C7057w) frameLayoutFix.getChildAt(1), false);
                    return;
                case XtraBox.MP4_XTRA_BT_GUID:
                    ((C7023s1) ((ViewGroup) ((ViewGroup) apVar.f3479a).getChildAt(0)).getChildAt(0)).setJoinedText(raVar.m32824u());
                    return;
                case 74:
                    ((C6942k3) apVar.f3479a).m18394i(Float.intBitsToFloat(raVar.m32826s()), Float.intBitsToFloat(raVar.m32833l()));
                    return;
                case 79:
                    C9256o0 o0Var = (C9256o0) apVar.f3479a;
                    o0Var.m9784g1(C1357a0.m37541i(18.0f), C1357a0.m37541i(13.5f), raVar.m32836i());
                    o0Var.setText(raVar.m32824u().toString());
                    mo9112n2(raVar, o0Var, null, false);
                    return;
                case 80:
                case 88:
                    FrameLayoutFix frameLayoutFix2 = (FrameLayoutFix) apVar.f3479a;
                    C9256o0 o0Var2 = (C9256o0) frameLayoutFix2.getChildAt(0);
                    o0Var2.m9784g1(C1357a0.m37541i(18.0f), C1357a0.m37541i(13.5f), raVar.m32836i());
                    o0Var2.setText(raVar.m32824u().toString());
                    C9139d dVar2 = (C9139d) frameLayoutFix2.getChildAt(1);
                    dVar2.m10186r(raVar.m32873D(), false);
                    dVar2.setId(raVar.m32835j());
                    dVar2.m10191m(true);
                    return;
                case 81:
                    mo9112n2(raVar, (C9256o0) apVar.f3479a, null, false);
                    return;
                case 82:
                case 83:
                    mo11660G2(raVar, i, (C8795k2) apVar.f3479a, false);
                    return;
                case 86:
                    FrameLayoutFix frameLayoutFix3 = (FrameLayoutFix) apVar.f3479a;
                    C9256o0 o0Var3 = (C9256o0) frameLayoutFix3.getChildAt(0);
                    mo9112n2(raVar, o0Var3, (C7025s3) frameLayoutFix3.getChildAt(1), false);
                    o0Var3.setTag(raVar);
                    return;
                case 94:
                    m34161j2(raVar, i, (ViewGroup) apVar.f3479a, null);
                    return;
                case 100:
                    mo503R2(raVar, (C6973n0) apVar.f3479a, false);
                    return;
                case 101:
                    ((C8315d) apVar.f3479a).setChart((C7833i) raVar.m32844d());
                    return;
                case 102:
                case 103:
                case 104:
                case 105:
                    ((C7027t) apVar.f3479a).setChart((C7833i) raVar.m32844d());
                    return;
                case 106:
                    ((C8315d) apVar.f3479a).setChart((C7846r) raVar.m32844d());
                    return;
                case C3563j.f11957L0:
                case C3563j.f11962M0:
                    mo8030D2(raVar, i, (C9494a1) apVar.f3479a);
                    return;
                case 130:
                    mo426p2(raVar, i, (EmbeddableStickerView) apVar.f3479a, false);
                    return;
                case 131:
                    C6998q0 q0Var = (C6998q0) apVar.f3479a;
                    q0Var.m18122s();
                    mo423z2(raVar, i, q0Var, false);
                    return;
                case 132:
                    mo502e2(raVar, i, (C9621o) apVar.f3479a);
                    return;
            }
        }
    }

    public final void m34121w0(float f) {
        C3950k kVar = this.f8712h0;
        if (kVar != null) {
            kVar.m29542k();
        }
        if (this.f8713i0) {
            for (RecyclerView recyclerView : this.f8693O) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                this.f8710f0 = linearLayoutManager.m39549X1();
                int a2 = linearLayoutManager.m39546a2();
                this.f8711g0 = a2;
                int i = this.f8710f0;
                if (i == -1 || a2 == -1) {
                    C3950k kVar2 = this.f8712h0;
                    if (kVar2 != null) {
                        kVar2.m29541l(f);
                    }
                    m34232I2(f);
                } else {
                    if (a2 > 0) {
                        m39309L(0, i);
                    }
                    if (this.f8711g0 + 1 < mo6153D() - 1) {
                        m39309L(this.f8711g0 + 1, (mo6153D() - this.f8711g0) - 1);
                    }
                    if (this.f8712h0 == null) {
                        this.f8712h0 = new C3950k(0, this, C2057b.f7280b, 180L, this.f8709e0);
                    }
                    this.f8712h0.m29544i(f);
                }
            }
            return;
        }
        if (this.f8712h0 == null) {
            this.f8712h0 = new C3950k(0, this, C2057b.f7280b, 180L, this.f8709e0);
        }
        this.f8712h0.m29544i(f);
    }

    public void mo30632w1(TextView textView, int i, int i2) {
    }

    public void m34138q1(final int i, final C2964ra raVar) {
        if (m34200X0()) {
            C1379j0.m37334d0(new Runnable() {
                @Override
                public final void run() {
                    C2546iq.this.m34138q1(i, raVar);
                }
            });
            return;
        }
        this.f8695Q.set(i, raVar);
        m39312I(i);
    }

    public void m34118x0() {
        int i = 0;
        for (C2964ra raVar : this.f8695Q) {
            if (raVar.m32873D()) {
                raVar.m32858S(false);
                m34123v2(i, false, raVar.m32827r());
            }
            i++;
        }
    }

    public void m34117x1(int i, C9137c cVar) {
    }

    public int m34116x2(List<C2964ra> list, boolean z) {
        int D = mo6153D();
        this.f8695Q.clear();
        C5062b.m24159m(this.f8695Q, list.size());
        this.f8695Q.addAll(list);
        int X1 = z ? m34199X1() : -1;
        C7389v0.m16615k2(this, D);
        return X1;
    }

    public C2964ra m34115y0(String str) {
        return m34243E0(m34213S0(str));
    }

    public void m34114y1(int i, int i2) {
        C5062b.m24149w(this.f8695Q, i, i2);
        m39310K(i, i2);
    }

    public void m34113y2(C2964ra[] raVarArr, boolean z) {
        int D = mo6153D();
        this.f8695Q.clear();
        C5062b.m24159m(this.f8695Q, raVarArr.length);
        Collections.addAll(this.f8695Q, raVarArr);
        if (z) {
            for (C2964ra raVar : raVarArr) {
                if (raVar.m32873D()) {
                    if (raVar.m32823v() != null) {
                        m34214R1(raVar.m32846c(), raVar.m32823v());
                    } else {
                        m34217Q1(raVar.m32846c(), raVar.m32835j());
                    }
                }
            }
        }
        C7389v0.m16615k2(this, D);
    }

    public C2964ra m34112z0(int i) {
        return m34243E0(m34224N0(i));
    }

    public void m34111z1(int i, int i2, boolean z) {
        C5062b.m24149w(this.f8695Q, i, i2);
        if (z) {
            m39310K(i, i2);
        }
    }

    public void mo423z2(C2964ra raVar, int i, C6998q0 q0Var, boolean z) {
    }

    public C2546iq(AbstractC10664f9 f9Var, View.OnClickListener onClickListener, AbstractC9323v4<?> v4Var) {
        this.f8693O = new ArrayList();
        this.f8698T = true;
        this.f8710f0 = -1;
        this.f8711g0 = -1;
        this.f8691M = f9Var.mo4347s();
        this.f8692N = f9Var.mo4348c();
        this.f8694P = onClickListener;
        this.f8695Q = new ArrayList(5);
        this.f8701W = v4Var;
    }
}