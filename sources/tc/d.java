package tc;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import c1.a0;
import c1.b0;
import c1.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class d extends m {
    public ArrayList<RecyclerView.c0> f23072h = new ArrayList<>();
    public ArrayList<RecyclerView.c0> f23073i = new ArrayList<>();
    public ArrayList<g> f23074j = new ArrayList<>();
    public ArrayList<f> f23075k = new ArrayList<>();
    public ArrayList<ArrayList<RecyclerView.c0>> f23076l = new ArrayList<>();
    public ArrayList<ArrayList<g>> f23077m = new ArrayList<>();
    public ArrayList<ArrayList<f>> f23078n = new ArrayList<>();
    public ArrayList<RecyclerView.c0> f23079o = new ArrayList<>();
    public ArrayList<RecyclerView.c0> f23080p = new ArrayList<>();
    public ArrayList<RecyclerView.c0> f23081q = new ArrayList<>();
    public ArrayList<RecyclerView.c0> f23082r = new ArrayList<>();
    public final Interpolator f23083s;

    public class a extends h {
        public final RecyclerView.c0 f23084a;
        public final a0 f23085b;

        public a(RecyclerView.c0 c0Var, a0 a0Var) {
            this.f23084a = c0Var;
            this.f23085b = a0Var;
        }

        @Override
        public void b(View view) {
            this.f23085b.f(null);
            d.this.q0(view, 1.0f);
            d.this.L(this.f23084a);
            d.this.f23081q.remove(this.f23084a);
            d.this.f0();
        }

        @Override
        public void c(View view) {
            d.this.M(this.f23084a);
        }
    }

    public class b extends h {
        public final RecyclerView.c0 f23087a;
        public final a0 f23088b;

        public b(RecyclerView.c0 c0Var, a0 a0Var) {
            this.f23087a = c0Var;
            this.f23088b = a0Var;
        }

        @Override
        public void a(View view) {
            d.this.q0(view, 1.0f);
        }

        @Override
        public void b(View view) {
            this.f23088b.f(null);
            d.this.F(this.f23087a);
            d.this.f23079o.remove(this.f23087a);
            d.this.f0();
        }

        @Override
        public void c(View view) {
            d.this.G(this.f23087a);
        }
    }

    public class c extends h {
        public final RecyclerView.c0 f23090a;
        public final int f23091b;
        public final int f23092c;
        public final a0 f23093d;

        public c(RecyclerView.c0 c0Var, int i10, int i11, a0 a0Var) {
            this.f23090a = c0Var;
            this.f23091b = i10;
            this.f23092c = i11;
            this.f23093d = a0Var;
        }

        @Override
        public void a(View view) {
            if (this.f23091b != 0) {
                d.this.r0(view, 0.0f);
            }
            if (this.f23092c != 0) {
                d.this.s0(view, 0.0f);
            }
        }

        @Override
        public void b(View view) {
            this.f23093d.f(null);
            d.this.J(this.f23090a);
            d.this.f23080p.remove(this.f23090a);
            d.this.f0();
        }

        @Override
        public void c(View view) {
            d.this.K(this.f23090a);
        }
    }

    public class C0217d extends h {
        public final f f23095a;
        public final a0 f23096b;

        public C0217d(f fVar, a0 a0Var) {
            this.f23095a = fVar;
            this.f23096b = a0Var;
        }

        @Override
        public void b(View view) {
            this.f23096b.f(null);
            d.this.q0(view, 1.0f);
            d.this.r0(view, 0.0f);
            d.this.s0(view, 0.0f);
            d.this.H(this.f23095a.f23102a, true);
            d.this.f23082r.remove(this.f23095a.f23102a);
            d.this.f0();
        }

        @Override
        public void c(View view) {
            d.this.I(this.f23095a.f23102a, true);
        }
    }

    public class e extends h {
        public final f f23098a;
        public final a0 f23099b;
        public final View f23100c;

        public e(f fVar, a0 a0Var, View view) {
            this.f23098a = fVar;
            this.f23099b = a0Var;
            this.f23100c = view;
        }

        @Override
        public void b(View view) {
            this.f23099b.f(null);
            d.this.q0(this.f23100c, 1.0f);
            d.this.r0(this.f23100c, 0.0f);
            d.this.s0(this.f23100c, 0.0f);
            d.this.H(this.f23098a.f23103b, false);
            d.this.f23082r.remove(this.f23098a.f23103b);
            d.this.f0();
        }

        @Override
        public void c(View view) {
            d.this.I(this.f23098a.f23103b, false);
        }
    }

    public static class g {
        public RecyclerView.c0 f23108a;
        public int f23109b;
        public int f23110c;
        public int f23111d;
        public int f23112e;

        public g(RecyclerView.c0 c0Var, int i10, int i11, int i12, int i13) {
            this.f23108a = c0Var;
            this.f23109b = i10;
            this.f23110c = i11;
            this.f23111d = i12;
            this.f23112e = i13;
        }
    }

    public static class h implements b0 {
        @Override
        public void a(View view) {
        }
    }

    public d(Interpolator interpolator, long j10) {
        this.f23083s = interpolator;
        z(j10);
        w(j10);
        x(j10);
        A(j10);
    }

    public void m0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            c0(gVar.f23108a, gVar.f23109b, gVar.f23110c, gVar.f23111d, gVar.f23112e);
        }
        arrayList.clear();
        this.f23077m.remove(arrayList);
    }

    public void n0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b0((f) it.next());
        }
        arrayList.clear();
        this.f23078n.remove(arrayList);
    }

    public void o0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a0((RecyclerView.c0) it.next());
        }
        arrayList.clear();
        this.f23076l.remove(arrayList);
    }

    @Override
    public boolean B(RecyclerView.c0 c0Var) {
        if (l() <= 0) {
            return false;
        }
        p0(c0Var);
        q0(c0Var.f2982a, 0.0f);
        this.f23073i.add(c0Var);
        return true;
    }

    @Override
    public boolean C(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2, int i10, int i11, int i12, int i13) {
        if (m() <= 0) {
            return false;
        }
        if (c0Var == c0Var2) {
            return D(c0Var, i10, i11, i12, i13);
        }
        float k02 = k0(c0Var.f2982a);
        float l02 = l0(c0Var.f2982a);
        float j02 = j0(c0Var.f2982a);
        p0(c0Var);
        int i14 = (int) ((i12 - i10) - k02);
        int i15 = (int) ((i13 - i11) - l02);
        r0(c0Var.f2982a, k02);
        s0(c0Var.f2982a, l02);
        q0(c0Var.f2982a, j02);
        if (c0Var2 != null) {
            p0(c0Var2);
            r0(c0Var2.f2982a, -i14);
            s0(c0Var2.f2982a, -i15);
            q0(c0Var2.f2982a, 0.0f);
        }
        this.f23075k.add(new f(c0Var, c0Var2, i10, i11, i12, i13));
        return true;
    }

    @Override
    public boolean D(RecyclerView.c0 c0Var, int i10, int i11, int i12, int i13) {
        if (n() <= 0) {
            return false;
        }
        View view = c0Var.f2982a;
        int k02 = (int) (i10 + k0(view));
        int l02 = (int) (i11 + l0(c0Var.f2982a));
        p0(c0Var);
        int i14 = i12 - k02;
        int i15 = i13 - l02;
        if (i14 == 0 && i15 == 0) {
            J(c0Var);
            return false;
        }
        if (i14 != 0) {
            r0(view, -i14);
        }
        if (i15 != 0) {
            s0(view, -i15);
        }
        this.f23074j.add(new g(c0Var, k02, l02, i12, i13));
        return true;
    }

    @Override
    public boolean E(RecyclerView.c0 c0Var) {
        if (o() <= 0) {
            return false;
        }
        p0(c0Var);
        this.f23072h.add(c0Var);
        return true;
    }

    public a0 Z(View view) {
        return v.b(view);
    }

    public void a0(RecyclerView.c0 c0Var) {
        a0 Z = Z(c0Var.f2982a);
        this.f23079o.add(c0Var);
        Z.a(1.0f).d(l()).e(this.f23083s).f(new b(c0Var, Z)).j();
    }

    public void b0(f fVar) {
        RecyclerView.c0 c0Var = fVar.f23102a;
        View view = null;
        View view2 = c0Var == null ? null : c0Var.f2982a;
        RecyclerView.c0 c0Var2 = fVar.f23103b;
        if (c0Var2 != null) {
            view = c0Var2.f2982a;
        }
        if (view2 != null) {
            a0 e10 = Z(view2).d(m()).e(this.f23083s);
            this.f23082r.add(fVar.f23102a);
            e10.k(fVar.f23106e - fVar.f23104c);
            e10.l(fVar.f23107f - fVar.f23105d);
            e10.a(0.0f).f(new C0217d(fVar, e10)).j();
        }
        if (view != null) {
            a0 Z = Z(view);
            this.f23082r.add(fVar.f23103b);
            Z.k(0.0f).l(0.0f).d(m()).e(this.f23083s).a(1.0f).f(new e(fVar, Z, view)).j();
        }
    }

    public void c0(RecyclerView.c0 c0Var, int i10, int i11, int i12, int i13) {
        View view = c0Var.f2982a;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            Z(view).k(0.0f);
        }
        if (i15 != 0) {
            Z(view).l(0.0f);
        }
        a0 Z = Z(view);
        this.f23080p.add(c0Var);
        Z.d(n()).e(this.f23083s).f(new c(c0Var, i14, i15, Z)).j();
    }

    public final void d0(RecyclerView.c0 c0Var) {
        a0 Z = Z(c0Var.f2982a);
        this.f23081q.add(c0Var);
        Z.d(o()).e(this.f23083s).a(0.0f).f(new a(c0Var, Z)).j();
    }

    public void e0(List<RecyclerView.c0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            Z(list.get(size).f2982a).b();
        }
    }

    public void f0() {
        if (!p()) {
            i();
        }
    }

    @Override
    public boolean g(RecyclerView.c0 c0Var, List<Object> list) {
        return !list.isEmpty() || super.g(c0Var, list);
    }

    public final void g0(List<f> list, RecyclerView.c0 c0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            f fVar = list.get(size);
            if (i0(fVar, c0Var) && fVar.f23102a == null && fVar.f23103b == null) {
                list.remove(fVar);
            }
        }
    }

    public final void h0(f fVar) {
        RecyclerView.c0 c0Var = fVar.f23102a;
        if (c0Var != null) {
            i0(fVar, c0Var);
        }
        RecyclerView.c0 c0Var2 = fVar.f23103b;
        if (c0Var2 != null) {
            i0(fVar, c0Var2);
        }
    }

    public final boolean i0(f fVar, RecyclerView.c0 c0Var) {
        boolean z10 = false;
        if (fVar.f23103b == c0Var) {
            fVar.f23103b = null;
        } else if (fVar.f23102a != c0Var) {
            return false;
        } else {
            fVar.f23102a = null;
            z10 = true;
        }
        q0(c0Var.f2982a, 1.0f);
        r0(c0Var.f2982a, 0.0f);
        s0(c0Var.f2982a, 0.0f);
        H(c0Var, z10);
        return true;
    }

    @Override
    public void j(RecyclerView.c0 c0Var) {
        View view = c0Var.f2982a;
        Z(view).b();
        int size = this.f23074j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f23074j.get(size).f23108a == c0Var) {
                s0(view, 0.0f);
                r0(view, 0.0f);
                J(c0Var);
                this.f23074j.remove(size);
            }
        }
        g0(this.f23075k, c0Var);
        if (this.f23072h.remove(c0Var)) {
            q0(view, 1.0f);
            L(c0Var);
        }
        if (this.f23073i.remove(c0Var)) {
            q0(view, 1.0f);
            F(c0Var);
        }
        for (int size2 = this.f23078n.size() - 1; size2 >= 0; size2--) {
            ArrayList<f> arrayList = this.f23078n.get(size2);
            g0(arrayList, c0Var);
            if (arrayList.isEmpty()) {
                this.f23078n.remove(size2);
            }
        }
        for (int size3 = this.f23077m.size() - 1; size3 >= 0; size3--) {
            ArrayList<g> arrayList2 = this.f23077m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f23108a == c0Var) {
                    s0(view, 0.0f);
                    r0(view, 0.0f);
                    J(c0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f23077m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f23076l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.c0> arrayList3 = this.f23076l.get(size5);
            if (arrayList3.remove(c0Var)) {
                q0(view, 1.0f);
                F(c0Var);
                if (arrayList3.isEmpty()) {
                    this.f23076l.remove(size5);
                }
            }
        }
        this.f23081q.remove(c0Var);
        this.f23079o.remove(c0Var);
        this.f23082r.remove(c0Var);
        this.f23080p.remove(c0Var);
        f0();
    }

    public float j0(View view) {
        return v.m(view);
    }

    @Override
    public void k() {
        int size = this.f23074j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            g gVar = this.f23074j.get(size);
            View view = gVar.f23108a.f2982a;
            s0(view, 0.0f);
            r0(view, 0.0f);
            J(gVar.f23108a);
            this.f23074j.remove(size);
        }
        for (int size2 = this.f23072h.size() - 1; size2 >= 0; size2--) {
            L(this.f23072h.get(size2));
            this.f23072h.remove(size2);
        }
        int size3 = this.f23073i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.c0 c0Var = this.f23073i.get(size3);
            q0(c0Var.f2982a, 1.0f);
            F(c0Var);
            this.f23073i.remove(size3);
        }
        for (int size4 = this.f23075k.size() - 1; size4 >= 0; size4--) {
            h0(this.f23075k.get(size4));
        }
        this.f23075k.clear();
        if (p()) {
            for (int size5 = this.f23077m.size() - 1; size5 >= 0; size5--) {
                ArrayList<g> arrayList = this.f23077m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    g gVar2 = arrayList.get(size6);
                    View view2 = gVar2.f23108a.f2982a;
                    s0(view2, 0.0f);
                    r0(view2, 0.0f);
                    J(gVar2.f23108a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f23077m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f23076l.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.c0> arrayList2 = this.f23076l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.c0 c0Var2 = arrayList2.get(size8);
                    q0(c0Var2.f2982a, 1.0f);
                    F(c0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f23076l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f23078n.size() - 1; size9 >= 0; size9--) {
                ArrayList<f> arrayList3 = this.f23078n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    h0(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f23078n.remove(arrayList3);
                    }
                }
            }
            e0(this.f23081q);
            e0(this.f23080p);
            e0(this.f23079o);
            e0(this.f23082r);
            i();
        }
    }

    public float k0(View view) {
        return v.C(view);
    }

    public float l0(View view) {
        return v.D(view);
    }

    @Override
    public boolean p() {
        return !this.f23073i.isEmpty() || !this.f23075k.isEmpty() || !this.f23074j.isEmpty() || !this.f23072h.isEmpty() || !this.f23080p.isEmpty() || !this.f23081q.isEmpty() || !this.f23079o.isEmpty() || !this.f23082r.isEmpty() || !this.f23077m.isEmpty() || !this.f23076l.isEmpty() || !this.f23078n.isEmpty();
    }

    public final void p0(RecyclerView.c0 c0Var) {
        c0Var.f2982a.animate().setInterpolator(this.f23083s);
        j(c0Var);
    }

    public void q0(View view, float f10) {
        v.Z(view, f10);
    }

    public void r0(View view, float f10) {
        v.k0(view, f10);
    }

    public void s0(View view, float f10) {
        v.l0(view, f10);
    }

    @Override
    public void v() {
        boolean z10 = !this.f23072h.isEmpty();
        boolean z11 = !this.f23074j.isEmpty();
        boolean z12 = !this.f23075k.isEmpty();
        boolean z13 = !this.f23073i.isEmpty();
        if (z10 || z11 || z13 || z12) {
            Iterator<RecyclerView.c0> it = this.f23072h.iterator();
            while (it.hasNext()) {
                d0(it.next());
            }
            this.f23072h.clear();
            if (z11) {
                final ArrayList<g> arrayList = new ArrayList<>();
                arrayList.addAll(this.f23074j);
                this.f23077m.add(arrayList);
                this.f23074j.clear();
                Runnable aVar = new Runnable() {
                    @Override
                    public final void run() {
                        d.this.m0(arrayList);
                    }
                };
                if (z10) {
                    v.U(arrayList.get(0).f23108a.f2982a, aVar, o());
                } else {
                    aVar.run();
                }
            }
            if (z12) {
                final ArrayList<f> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f23075k);
                this.f23078n.add(arrayList2);
                this.f23075k.clear();
                Runnable bVar = new Runnable() {
                    @Override
                    public final void run() {
                        d.this.n0(arrayList2);
                    }
                };
                if (z10) {
                    v.U(arrayList2.get(0).f23102a.f2982a, bVar, o());
                } else {
                    bVar.run();
                }
            }
            if (z13) {
                final ArrayList<RecyclerView.c0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f23073i);
                this.f23076l.add(arrayList3);
                this.f23073i.clear();
                Runnable cVar = new Runnable() {
                    @Override
                    public final void run() {
                        d.this.o0(arrayList3);
                    }
                };
                if (z10 || z11 || z12) {
                    long j10 = 0;
                    long o10 = z10 ? o() : 0L;
                    long n10 = z11 ? n() : 0L;
                    if (z12) {
                        j10 = m();
                    }
                    v.U(arrayList3.get(0).f2982a, cVar, o10 + Math.max(n10, j10));
                    return;
                }
                cVar.run();
            }
        }
    }

    public static class f {
        public RecyclerView.c0 f23102a;
        public RecyclerView.c0 f23103b;
        public int f23104c;
        public int f23105d;
        public int f23106e;
        public int f23107f;

        public f(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2) {
            this.f23102a = c0Var;
            this.f23103b = c0Var2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f23102a + ", newHolder=" + this.f23103b + ", fromX=" + this.f23104c + ", fromY=" + this.f23105d + ", toX=" + this.f23106e + ", toY=" + this.f23107f + '}';
        }

        public f(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2, int i10, int i11, int i12, int i13) {
            this(c0Var, c0Var2);
            this.f23104c = i10;
            this.f23105d = i11;
            this.f23106e = i12;
            this.f23107f = i13;
        }
    }
}
