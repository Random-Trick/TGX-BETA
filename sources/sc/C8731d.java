package sc;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.AbstractC0984m;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p028c1.AbstractC1451e0;
import p028c1.C1446d0;
import p028c1.C1489y;

public class C8731d extends AbstractC0984m {
    public ArrayList<RecyclerView.AbstractC0886d0> f28144h = new ArrayList<>();
    public ArrayList<RecyclerView.AbstractC0886d0> f28145i = new ArrayList<>();
    public ArrayList<C8738g> f28146j = new ArrayList<>();
    public ArrayList<C8737f> f28147k = new ArrayList<>();
    public ArrayList<ArrayList<RecyclerView.AbstractC0886d0>> f28148l = new ArrayList<>();
    public ArrayList<ArrayList<C8738g>> f28149m = new ArrayList<>();
    public ArrayList<ArrayList<C8737f>> f28150n = new ArrayList<>();
    public ArrayList<RecyclerView.AbstractC0886d0> f28151o = new ArrayList<>();
    public ArrayList<RecyclerView.AbstractC0886d0> f28152p = new ArrayList<>();
    public ArrayList<RecyclerView.AbstractC0886d0> f28153q = new ArrayList<>();
    public ArrayList<RecyclerView.AbstractC0886d0> f28154r = new ArrayList<>();
    public final Interpolator f28155s;

    public class C8732a extends C8739h {
        public final RecyclerView.AbstractC0886d0 f28156a;
        public final C1446d0 f28157b;

        public C8732a(RecyclerView.AbstractC0886d0 d0Var, C1446d0 d0Var2) {
            this.f28156a = d0Var;
            this.f28157b = d0Var2;
        }

        @Override
        public void mo11617b(View view) {
            this.f28157b.m36900f(null);
            C8731d.this.mo11621q0(view, 1.0f);
            C8731d.this.m38731L(this.f28156a);
            C8731d.this.f28153q.remove(this.f28156a);
            C8731d.this.m11636f0();
        }

        @Override
        public void mo11616c(View view) {
            C8731d.this.m38730M(this.f28156a);
        }
    }

    public class C8733b extends C8739h {
        public final RecyclerView.AbstractC0886d0 f28159a;
        public final C1446d0 f28160b;

        public C8733b(RecyclerView.AbstractC0886d0 d0Var, C1446d0 d0Var2) {
            this.f28159a = d0Var;
            this.f28160b = d0Var2;
        }

        @Override
        public void mo11615a(View view) {
            C8731d.this.mo11621q0(view, 1.0f);
        }

        @Override
        public void mo11617b(View view) {
            this.f28160b.m36900f(null);
            C8731d.this.m38737F(this.f28159a);
            C8731d.this.f28151o.remove(this.f28159a);
            C8731d.this.m11636f0();
        }

        @Override
        public void mo11616c(View view) {
            C8731d.this.m38736G(this.f28159a);
        }
    }

    public class C8734c extends C8739h {
        public final RecyclerView.AbstractC0886d0 f28162a;
        public final int f28163b;
        public final int f28164c;
        public final C1446d0 f28165d;

        public C8734c(RecyclerView.AbstractC0886d0 d0Var, int i, int i2, C1446d0 d0Var2) {
            this.f28162a = d0Var;
            this.f28163b = i;
            this.f28164c = i2;
            this.f28165d = d0Var2;
        }

        @Override
        public void mo11615a(View view) {
            if (this.f28163b != 0) {
                C8731d.this.m11620r0(view, 0.0f);
            }
            if (this.f28164c != 0) {
                C8731d.this.m11619s0(view, 0.0f);
            }
        }

        @Override
        public void mo11617b(View view) {
            this.f28165d.m36900f(null);
            C8731d.this.m38733J(this.f28162a);
            C8731d.this.f28152p.remove(this.f28162a);
            C8731d.this.m11636f0();
        }

        @Override
        public void mo11616c(View view) {
            C8731d.this.m38732K(this.f28162a);
        }
    }

    public class C8735d extends C8739h {
        public final C8737f f28167a;
        public final C1446d0 f28168b;

        public C8735d(C8737f fVar, C1446d0 d0Var) {
            this.f28167a = fVar;
            this.f28168b = d0Var;
        }

        @Override
        public void mo11617b(View view) {
            this.f28168b.m36900f(null);
            C8731d.this.mo11621q0(view, 1.0f);
            C8731d.this.m11620r0(view, 0.0f);
            C8731d.this.m11619s0(view, 0.0f);
            C8731d.this.m38735H(this.f28167a.f28174a, true);
            C8731d.this.f28154r.remove(this.f28167a.f28174a);
            C8731d.this.m11636f0();
        }

        @Override
        public void mo11616c(View view) {
            C8731d.this.m38734I(this.f28167a.f28174a, true);
        }
    }

    public class C8736e extends C8739h {
        public final C8737f f28170a;
        public final C1446d0 f28171b;
        public final View f28172c;

        public C8736e(C8737f fVar, C1446d0 d0Var, View view) {
            this.f28170a = fVar;
            this.f28171b = d0Var;
            this.f28172c = view;
        }

        @Override
        public void mo11617b(View view) {
            this.f28171b.m36900f(null);
            C8731d.this.mo11621q0(this.f28172c, 1.0f);
            C8731d.this.m11620r0(this.f28172c, 0.0f);
            C8731d.this.m11619s0(this.f28172c, 0.0f);
            C8731d.this.m38735H(this.f28170a.f28175b, false);
            C8731d.this.f28154r.remove(this.f28170a.f28175b);
            C8731d.this.m11636f0();
        }

        @Override
        public void mo11616c(View view) {
            C8731d.this.m38734I(this.f28170a.f28175b, false);
        }
    }

    public static class C8738g {
        public RecyclerView.AbstractC0886d0 f28180a;
        public int f28181b;
        public int f28182c;
        public int f28183d;
        public int f28184e;

        public C8738g(RecyclerView.AbstractC0886d0 d0Var, int i, int i2, int i3, int i4) {
            this.f28180a = d0Var;
            this.f28181b = i;
            this.f28182c = i2;
            this.f28183d = i3;
            this.f28184e = i4;
        }
    }

    public static class C8739h implements AbstractC1451e0 {
        @Override
        public void mo11615a(View view) {
        }
    }

    public C8731d(Interpolator interpolator, long j) {
        this.f28155s = interpolator;
        m39279z(j);
        m39282w(j);
        m39281x(j);
        m39295A(j);
    }

    public void m11626m0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C8738g gVar = (C8738g) it.next();
            m11639c0(gVar.f28180a, gVar.f28181b, gVar.f28182c, gVar.f28183d, gVar.f28184e);
        }
        arrayList.clear();
        this.f28149m.remove(arrayList);
    }

    public void m11625n0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m11640b0((C8737f) it.next());
        }
        arrayList.clear();
        this.f28150n.remove(arrayList);
    }

    public void m11624o0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m11641a0((RecyclerView.AbstractC0886d0) it.next());
        }
        arrayList.clear();
        this.f28148l.remove(arrayList);
    }

    @Override
    public boolean mo11649B(RecyclerView.AbstractC0886d0 d0Var) {
        if (m39291l() <= 0) {
            return false;
        }
        m11622p0(d0Var);
        mo11621q0(d0Var.f3479a, 0.0f);
        this.f28145i.add(d0Var);
        return true;
    }

    @Override
    public boolean mo11648C(RecyclerView.AbstractC0886d0 d0Var, RecyclerView.AbstractC0886d0 d0Var2, int i, int i2, int i3, int i4) {
        if (m39290m() <= 0) {
            return false;
        }
        if (d0Var == d0Var2) {
            return mo11647D(d0Var, i, i2, i3, i4);
        }
        float k0 = m11628k0(d0Var.f3479a);
        float l0 = m11627l0(d0Var.f3479a);
        float j0 = m11630j0(d0Var.f3479a);
        m11622p0(d0Var);
        int i5 = (int) ((i3 - i) - k0);
        int i6 = (int) ((i4 - i2) - l0);
        m11620r0(d0Var.f3479a, k0);
        m11619s0(d0Var.f3479a, l0);
        mo11621q0(d0Var.f3479a, j0);
        if (d0Var2 != null) {
            m11622p0(d0Var2);
            m11620r0(d0Var2.f3479a, -i5);
            m11619s0(d0Var2.f3479a, -i6);
            mo11621q0(d0Var2.f3479a, 0.0f);
        }
        this.f28147k.add(new C8737f(d0Var, d0Var2, i, i2, i3, i4));
        return true;
    }

    @Override
    public boolean mo11647D(RecyclerView.AbstractC0886d0 d0Var, int i, int i2, int i3, int i4) {
        if (m39289n() <= 0) {
            return false;
        }
        View view = d0Var.f3479a;
        int k0 = (int) (i + m11628k0(view));
        int l0 = (int) (i2 + m11627l0(d0Var.f3479a));
        m11622p0(d0Var);
        int i5 = i3 - k0;
        int i6 = i4 - l0;
        if (i5 == 0 && i6 == 0) {
            m38733J(d0Var);
            return false;
        }
        if (i5 != 0) {
            m11620r0(view, -i5);
        }
        if (i6 != 0) {
            m11619s0(view, -i6);
        }
        this.f28146j.add(new C8738g(d0Var, k0, l0, i3, i4));
        return true;
    }

    @Override
    public boolean mo11646E(RecyclerView.AbstractC0886d0 d0Var) {
        if (m39288o() <= 0) {
            return false;
        }
        m11622p0(d0Var);
        this.f28144h.add(d0Var);
        return true;
    }

    public C1446d0 m11642Z(View view) {
        return C1489y.m36744b(view);
    }

    public void m11641a0(RecyclerView.AbstractC0886d0 d0Var) {
        C1446d0 Z = m11642Z(d0Var.f3479a);
        this.f28151o.add(d0Var);
        Z.m36905a(1.0f).m36902d(m39291l()).m36901e(this.f28155s).m36900f(new C8733b(d0Var, Z)).m36896j();
    }

    public void m11640b0(C8737f fVar) {
        RecyclerView.AbstractC0886d0 d0Var = fVar.f28174a;
        View view = null;
        View view2 = d0Var == null ? null : d0Var.f3479a;
        RecyclerView.AbstractC0886d0 d0Var2 = fVar.f28175b;
        if (d0Var2 != null) {
            view = d0Var2.f3479a;
        }
        if (view2 != null) {
            C1446d0 e = m11642Z(view2).m36902d(m39290m()).m36901e(this.f28155s);
            this.f28154r.add(fVar.f28174a);
            e.m36895k(fVar.f28178e - fVar.f28176c);
            e.m36894l(fVar.f28179f - fVar.f28177d);
            e.m36905a(0.0f).m36900f(new C8735d(fVar, e)).m36896j();
        }
        if (view != null) {
            C1446d0 Z = m11642Z(view);
            this.f28154r.add(fVar.f28175b);
            Z.m36895k(0.0f).m36894l(0.0f).m36902d(m39290m()).m36901e(this.f28155s).m36905a(1.0f).m36900f(new C8736e(fVar, Z, view)).m36896j();
        }
    }

    public void m11639c0(RecyclerView.AbstractC0886d0 d0Var, int i, int i2, int i3, int i4) {
        View view = d0Var.f3479a;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            m11642Z(view).m36895k(0.0f);
        }
        if (i6 != 0) {
            m11642Z(view).m36894l(0.0f);
        }
        C1446d0 Z = m11642Z(view);
        this.f28152p.add(d0Var);
        Z.m36902d(m39289n()).m36901e(this.f28155s).m36900f(new C8734c(d0Var, i5, i6, Z)).m36896j();
    }

    public final void m11638d0(RecyclerView.AbstractC0886d0 d0Var) {
        C1446d0 Z = m11642Z(d0Var.f3479a);
        this.f28153q.add(d0Var);
        Z.m36902d(m39288o()).m36901e(this.f28155s).m36905a(0.0f).m36900f(new C8732a(d0Var, Z)).m36896j();
    }

    public void m11637e0(List<RecyclerView.AbstractC0886d0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            m11642Z(list.get(size).f3479a).m36904b();
        }
    }

    public void m11636f0() {
        if (!mo11623p()) {
            m39292i();
        }
    }

    @Override
    public boolean mo11635g(RecyclerView.AbstractC0886d0 d0Var, List<Object> list) {
        return !list.isEmpty() || super.mo11635g(d0Var, list);
    }

    public final void m11634g0(List<C8737f> list, RecyclerView.AbstractC0886d0 d0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C8737f fVar = list.get(size);
            if (m11632i0(fVar, d0Var) && fVar.f28174a == null && fVar.f28175b == null) {
                list.remove(fVar);
            }
        }
    }

    public final void m11633h0(C8737f fVar) {
        RecyclerView.AbstractC0886d0 d0Var = fVar.f28174a;
        if (d0Var != null) {
            m11632i0(fVar, d0Var);
        }
        RecyclerView.AbstractC0886d0 d0Var2 = fVar.f28175b;
        if (d0Var2 != null) {
            m11632i0(fVar, d0Var2);
        }
    }

    public final boolean m11632i0(C8737f fVar, RecyclerView.AbstractC0886d0 d0Var) {
        boolean z = false;
        if (fVar.f28175b == d0Var) {
            fVar.f28175b = null;
        } else if (fVar.f28174a != d0Var) {
            return false;
        } else {
            fVar.f28174a = null;
            z = true;
        }
        mo11621q0(d0Var.f3479a, 1.0f);
        m11620r0(d0Var.f3479a, 0.0f);
        m11619s0(d0Var.f3479a, 0.0f);
        m38735H(d0Var, z);
        return true;
    }

    @Override
    public void mo11631j(RecyclerView.AbstractC0886d0 d0Var) {
        View view = d0Var.f3479a;
        m11642Z(view).m36904b();
        int size = this.f28146j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f28146j.get(size).f28180a == d0Var) {
                m11619s0(view, 0.0f);
                m11620r0(view, 0.0f);
                m38733J(d0Var);
                this.f28146j.remove(size);
            }
        }
        m11634g0(this.f28147k, d0Var);
        if (this.f28144h.remove(d0Var)) {
            mo11621q0(view, 1.0f);
            m38731L(d0Var);
        }
        if (this.f28145i.remove(d0Var)) {
            mo11621q0(view, 1.0f);
            m38737F(d0Var);
        }
        for (int size2 = this.f28150n.size() - 1; size2 >= 0; size2--) {
            ArrayList<C8737f> arrayList = this.f28150n.get(size2);
            m11634g0(arrayList, d0Var);
            if (arrayList.isEmpty()) {
                this.f28150n.remove(size2);
            }
        }
        for (int size3 = this.f28149m.size() - 1; size3 >= 0; size3--) {
            ArrayList<C8738g> arrayList2 = this.f28149m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f28180a == d0Var) {
                    m11619s0(view, 0.0f);
                    m11620r0(view, 0.0f);
                    m38733J(d0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f28149m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f28148l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.AbstractC0886d0> arrayList3 = this.f28148l.get(size5);
            if (arrayList3.remove(d0Var)) {
                mo11621q0(view, 1.0f);
                m38737F(d0Var);
                if (arrayList3.isEmpty()) {
                    this.f28148l.remove(size5);
                }
            }
        }
        this.f28153q.remove(d0Var);
        this.f28151o.remove(d0Var);
        this.f28154r.remove(d0Var);
        this.f28152p.remove(d0Var);
        m11636f0();
    }

    public float m11630j0(View view) {
        return C1489y.m36722m(view);
    }

    @Override
    public void mo11629k() {
        int size = this.f28146j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C8738g gVar = this.f28146j.get(size);
            View view = gVar.f28180a.f3479a;
            m11619s0(view, 0.0f);
            m11620r0(view, 0.0f);
            m38733J(gVar.f28180a);
            this.f28146j.remove(size);
        }
        for (int size2 = this.f28144h.size() - 1; size2 >= 0; size2--) {
            m38731L(this.f28144h.get(size2));
            this.f28144h.remove(size2);
        }
        int size3 = this.f28145i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.AbstractC0886d0 d0Var = this.f28145i.get(size3);
            mo11621q0(d0Var.f3479a, 1.0f);
            m38737F(d0Var);
            this.f28145i.remove(size3);
        }
        for (int size4 = this.f28147k.size() - 1; size4 >= 0; size4--) {
            m11633h0(this.f28147k.get(size4));
        }
        this.f28147k.clear();
        if (mo11623p()) {
            for (int size5 = this.f28149m.size() - 1; size5 >= 0; size5--) {
                ArrayList<C8738g> arrayList = this.f28149m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C8738g gVar2 = arrayList.get(size6);
                    View view2 = gVar2.f28180a.f3479a;
                    m11619s0(view2, 0.0f);
                    m11620r0(view2, 0.0f);
                    m38733J(gVar2.f28180a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f28149m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f28148l.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.AbstractC0886d0> arrayList2 = this.f28148l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.AbstractC0886d0 d0Var2 = arrayList2.get(size8);
                    mo11621q0(d0Var2.f3479a, 1.0f);
                    m38737F(d0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f28148l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f28150n.size() - 1; size9 >= 0; size9--) {
                ArrayList<C8737f> arrayList3 = this.f28150n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m11633h0(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f28150n.remove(arrayList3);
                    }
                }
            }
            m11637e0(this.f28153q);
            m11637e0(this.f28152p);
            m11637e0(this.f28151o);
            m11637e0(this.f28154r);
            m39292i();
        }
    }

    public float m11628k0(View view) {
        return C1489y.m36770C(view);
    }

    public float m11627l0(View view) {
        return C1489y.m36769D(view);
    }

    @Override
    public boolean mo11623p() {
        return !this.f28145i.isEmpty() || !this.f28147k.isEmpty() || !this.f28146j.isEmpty() || !this.f28144h.isEmpty() || !this.f28152p.isEmpty() || !this.f28153q.isEmpty() || !this.f28151o.isEmpty() || !this.f28154r.isEmpty() || !this.f28149m.isEmpty() || !this.f28148l.isEmpty() || !this.f28150n.isEmpty();
    }

    public final void m11622p0(RecyclerView.AbstractC0886d0 d0Var) {
        d0Var.f3479a.animate().setInterpolator(this.f28155s);
        mo11631j(d0Var);
    }

    public void mo11621q0(View view, float f) {
        C1489y.m36745a0(view, f);
    }

    public void m11620r0(View view, float f) {
        C1489y.m36723l0(view, f);
    }

    public void m11619s0(View view, float f) {
        C1489y.m36721m0(view, f);
    }

    @Override
    public void mo11618v() {
        boolean z = !this.f28144h.isEmpty();
        boolean z2 = !this.f28146j.isEmpty();
        boolean z3 = !this.f28147k.isEmpty();
        boolean z4 = !this.f28145i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.AbstractC0886d0> it = this.f28144h.iterator();
            while (it.hasNext()) {
                m11638d0(it.next());
            }
            this.f28144h.clear();
            if (z2) {
                final ArrayList<C8738g> arrayList = new ArrayList<>();
                arrayList.addAll(this.f28146j);
                this.f28149m.add(arrayList);
                this.f28146j.clear();
                Runnable aVar = new Runnable() {
                    @Override
                    public final void run() {
                        C8731d.this.m11626m0(arrayList);
                    }
                };
                if (z) {
                    C1489y.m36751V(arrayList.get(0).f28180a.f3479a, aVar, m39288o());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                final ArrayList<C8737f> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f28147k);
                this.f28150n.add(arrayList2);
                this.f28147k.clear();
                Runnable bVar = new Runnable() {
                    @Override
                    public final void run() {
                        C8731d.this.m11625n0(arrayList2);
                    }
                };
                if (z) {
                    C1489y.m36751V(arrayList2.get(0).f28174a.f3479a, bVar, m39288o());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                final ArrayList<RecyclerView.AbstractC0886d0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f28145i);
                this.f28148l.add(arrayList3);
                this.f28145i.clear();
                Runnable cVar = new Runnable() {
                    @Override
                    public final void run() {
                        C8731d.this.m11624o0(arrayList3);
                    }
                };
                if (z || z2 || z3) {
                    long j = 0;
                    long o = z ? m39288o() : 0L;
                    long n = z2 ? m39289n() : 0L;
                    if (z3) {
                        j = m39290m();
                    }
                    C1489y.m36751V(arrayList3.get(0).f3479a, cVar, o + Math.max(n, j));
                    return;
                }
                cVar.run();
            }
        }
    }

    public static class C8737f {
        public RecyclerView.AbstractC0886d0 f28174a;
        public RecyclerView.AbstractC0886d0 f28175b;
        public int f28176c;
        public int f28177d;
        public int f28178e;
        public int f28179f;

        public C8737f(RecyclerView.AbstractC0886d0 d0Var, RecyclerView.AbstractC0886d0 d0Var2) {
            this.f28174a = d0Var;
            this.f28175b = d0Var2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f28174a + ", newHolder=" + this.f28175b + ", fromX=" + this.f28176c + ", fromY=" + this.f28177d + ", toX=" + this.f28178e + ", toY=" + this.f28179f + '}';
        }

        public C8737f(RecyclerView.AbstractC0886d0 d0Var, RecyclerView.AbstractC0886d0 d0Var2, int i, int i2, int i3, int i4) {
            this(d0Var, d0Var2);
            this.f28176c = i;
            this.f28177d = i2;
            this.f28178e = i3;
            this.f28179f = i4;
        }
    }
}
