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
    public ArrayList<RecyclerView.AbstractC0886d0> f28141h = new ArrayList<>();
    public ArrayList<RecyclerView.AbstractC0886d0> f28142i = new ArrayList<>();
    public ArrayList<C8738g> f28143j = new ArrayList<>();
    public ArrayList<C8737f> f28144k = new ArrayList<>();
    public ArrayList<ArrayList<RecyclerView.AbstractC0886d0>> f28145l = new ArrayList<>();
    public ArrayList<ArrayList<C8738g>> f28146m = new ArrayList<>();
    public ArrayList<ArrayList<C8737f>> f28147n = new ArrayList<>();
    public ArrayList<RecyclerView.AbstractC0886d0> f28148o = new ArrayList<>();
    public ArrayList<RecyclerView.AbstractC0886d0> f28149p = new ArrayList<>();
    public ArrayList<RecyclerView.AbstractC0886d0> f28150q = new ArrayList<>();
    public ArrayList<RecyclerView.AbstractC0886d0> f28151r = new ArrayList<>();
    public final Interpolator f28152s;

    public class C8732a extends C8739h {
        public final RecyclerView.AbstractC0886d0 f28153a;
        public final C1446d0 f28154b;

        public C8732a(RecyclerView.AbstractC0886d0 d0Var, C1446d0 d0Var2) {
            this.f28153a = d0Var;
            this.f28154b = d0Var2;
        }

        @Override
        public void mo11618b(View view) {
            this.f28154b.m36897f(null);
            C8731d.this.mo11622q0(view, 1.0f);
            C8731d.this.m38728L(this.f28153a);
            C8731d.this.f28150q.remove(this.f28153a);
            C8731d.this.m11637f0();
        }

        @Override
        public void mo11617c(View view) {
            C8731d.this.m38727M(this.f28153a);
        }
    }

    public class C8733b extends C8739h {
        public final RecyclerView.AbstractC0886d0 f28156a;
        public final C1446d0 f28157b;

        public C8733b(RecyclerView.AbstractC0886d0 d0Var, C1446d0 d0Var2) {
            this.f28156a = d0Var;
            this.f28157b = d0Var2;
        }

        @Override
        public void mo11616a(View view) {
            C8731d.this.mo11622q0(view, 1.0f);
        }

        @Override
        public void mo11618b(View view) {
            this.f28157b.m36897f(null);
            C8731d.this.m38734F(this.f28156a);
            C8731d.this.f28148o.remove(this.f28156a);
            C8731d.this.m11637f0();
        }

        @Override
        public void mo11617c(View view) {
            C8731d.this.m38733G(this.f28156a);
        }
    }

    public class C8734c extends C8739h {
        public final RecyclerView.AbstractC0886d0 f28159a;
        public final int f28160b;
        public final int f28161c;
        public final C1446d0 f28162d;

        public C8734c(RecyclerView.AbstractC0886d0 d0Var, int i, int i2, C1446d0 d0Var2) {
            this.f28159a = d0Var;
            this.f28160b = i;
            this.f28161c = i2;
            this.f28162d = d0Var2;
        }

        @Override
        public void mo11616a(View view) {
            if (this.f28160b != 0) {
                C8731d.this.m11621r0(view, 0.0f);
            }
            if (this.f28161c != 0) {
                C8731d.this.m11620s0(view, 0.0f);
            }
        }

        @Override
        public void mo11618b(View view) {
            this.f28162d.m36897f(null);
            C8731d.this.m38730J(this.f28159a);
            C8731d.this.f28149p.remove(this.f28159a);
            C8731d.this.m11637f0();
        }

        @Override
        public void mo11617c(View view) {
            C8731d.this.m38729K(this.f28159a);
        }
    }

    public class C8735d extends C8739h {
        public final C8737f f28164a;
        public final C1446d0 f28165b;

        public C8735d(C8737f fVar, C1446d0 d0Var) {
            this.f28164a = fVar;
            this.f28165b = d0Var;
        }

        @Override
        public void mo11618b(View view) {
            this.f28165b.m36897f(null);
            C8731d.this.mo11622q0(view, 1.0f);
            C8731d.this.m11621r0(view, 0.0f);
            C8731d.this.m11620s0(view, 0.0f);
            C8731d.this.m38732H(this.f28164a.f28171a, true);
            C8731d.this.f28151r.remove(this.f28164a.f28171a);
            C8731d.this.m11637f0();
        }

        @Override
        public void mo11617c(View view) {
            C8731d.this.m38731I(this.f28164a.f28171a, true);
        }
    }

    public class C8736e extends C8739h {
        public final C8737f f28167a;
        public final C1446d0 f28168b;
        public final View f28169c;

        public C8736e(C8737f fVar, C1446d0 d0Var, View view) {
            this.f28167a = fVar;
            this.f28168b = d0Var;
            this.f28169c = view;
        }

        @Override
        public void mo11618b(View view) {
            this.f28168b.m36897f(null);
            C8731d.this.mo11622q0(this.f28169c, 1.0f);
            C8731d.this.m11621r0(this.f28169c, 0.0f);
            C8731d.this.m11620s0(this.f28169c, 0.0f);
            C8731d.this.m38732H(this.f28167a.f28172b, false);
            C8731d.this.f28151r.remove(this.f28167a.f28172b);
            C8731d.this.m11637f0();
        }

        @Override
        public void mo11617c(View view) {
            C8731d.this.m38731I(this.f28167a.f28172b, false);
        }
    }

    public static class C8738g {
        public RecyclerView.AbstractC0886d0 f28177a;
        public int f28178b;
        public int f28179c;
        public int f28180d;
        public int f28181e;

        public C8738g(RecyclerView.AbstractC0886d0 d0Var, int i, int i2, int i3, int i4) {
            this.f28177a = d0Var;
            this.f28178b = i;
            this.f28179c = i2;
            this.f28180d = i3;
            this.f28181e = i4;
        }
    }

    public static class C8739h implements AbstractC1451e0 {
        @Override
        public void mo11616a(View view) {
        }
    }

    public C8731d(Interpolator interpolator, long j) {
        this.f28152s = interpolator;
        m39276z(j);
        m39279w(j);
        m39278x(j);
        m39292A(j);
    }

    public void m11627m0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C8738g gVar = (C8738g) it.next();
            m11640c0(gVar.f28177a, gVar.f28178b, gVar.f28179c, gVar.f28180d, gVar.f28181e);
        }
        arrayList.clear();
        this.f28146m.remove(arrayList);
    }

    public void m11626n0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m11641b0((C8737f) it.next());
        }
        arrayList.clear();
        this.f28147n.remove(arrayList);
    }

    public void m11625o0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m11642a0((RecyclerView.AbstractC0886d0) it.next());
        }
        arrayList.clear();
        this.f28145l.remove(arrayList);
    }

    @Override
    public boolean mo11650B(RecyclerView.AbstractC0886d0 d0Var) {
        if (m39288l() <= 0) {
            return false;
        }
        m11623p0(d0Var);
        mo11622q0(d0Var.f3479a, 0.0f);
        this.f28142i.add(d0Var);
        return true;
    }

    @Override
    public boolean mo11649C(RecyclerView.AbstractC0886d0 d0Var, RecyclerView.AbstractC0886d0 d0Var2, int i, int i2, int i3, int i4) {
        if (m39287m() <= 0) {
            return false;
        }
        if (d0Var == d0Var2) {
            return mo11648D(d0Var, i, i2, i3, i4);
        }
        float k0 = m11629k0(d0Var.f3479a);
        float l0 = m11628l0(d0Var.f3479a);
        float j0 = m11631j0(d0Var.f3479a);
        m11623p0(d0Var);
        int i5 = (int) ((i3 - i) - k0);
        int i6 = (int) ((i4 - i2) - l0);
        m11621r0(d0Var.f3479a, k0);
        m11620s0(d0Var.f3479a, l0);
        mo11622q0(d0Var.f3479a, j0);
        if (d0Var2 != null) {
            m11623p0(d0Var2);
            m11621r0(d0Var2.f3479a, -i5);
            m11620s0(d0Var2.f3479a, -i6);
            mo11622q0(d0Var2.f3479a, 0.0f);
        }
        this.f28144k.add(new C8737f(d0Var, d0Var2, i, i2, i3, i4));
        return true;
    }

    @Override
    public boolean mo11648D(RecyclerView.AbstractC0886d0 d0Var, int i, int i2, int i3, int i4) {
        if (m39286n() <= 0) {
            return false;
        }
        View view = d0Var.f3479a;
        int k0 = (int) (i + m11629k0(view));
        int l0 = (int) (i2 + m11628l0(d0Var.f3479a));
        m11623p0(d0Var);
        int i5 = i3 - k0;
        int i6 = i4 - l0;
        if (i5 == 0 && i6 == 0) {
            m38730J(d0Var);
            return false;
        }
        if (i5 != 0) {
            m11621r0(view, -i5);
        }
        if (i6 != 0) {
            m11620s0(view, -i6);
        }
        this.f28143j.add(new C8738g(d0Var, k0, l0, i3, i4));
        return true;
    }

    @Override
    public boolean mo11647E(RecyclerView.AbstractC0886d0 d0Var) {
        if (m39285o() <= 0) {
            return false;
        }
        m11623p0(d0Var);
        this.f28141h.add(d0Var);
        return true;
    }

    public C1446d0 m11643Z(View view) {
        return C1489y.m36741b(view);
    }

    public void m11642a0(RecyclerView.AbstractC0886d0 d0Var) {
        C1446d0 Z = m11643Z(d0Var.f3479a);
        this.f28148o.add(d0Var);
        Z.m36902a(1.0f).m36899d(m39288l()).m36898e(this.f28152s).m36897f(new C8733b(d0Var, Z)).m36893j();
    }

    public void m11641b0(C8737f fVar) {
        RecyclerView.AbstractC0886d0 d0Var = fVar.f28171a;
        View view = null;
        View view2 = d0Var == null ? null : d0Var.f3479a;
        RecyclerView.AbstractC0886d0 d0Var2 = fVar.f28172b;
        if (d0Var2 != null) {
            view = d0Var2.f3479a;
        }
        if (view2 != null) {
            C1446d0 e = m11643Z(view2).m36899d(m39287m()).m36898e(this.f28152s);
            this.f28151r.add(fVar.f28171a);
            e.m36892k(fVar.f28175e - fVar.f28173c);
            e.m36891l(fVar.f28176f - fVar.f28174d);
            e.m36902a(0.0f).m36897f(new C8735d(fVar, e)).m36893j();
        }
        if (view != null) {
            C1446d0 Z = m11643Z(view);
            this.f28151r.add(fVar.f28172b);
            Z.m36892k(0.0f).m36891l(0.0f).m36899d(m39287m()).m36898e(this.f28152s).m36902a(1.0f).m36897f(new C8736e(fVar, Z, view)).m36893j();
        }
    }

    public void m11640c0(RecyclerView.AbstractC0886d0 d0Var, int i, int i2, int i3, int i4) {
        View view = d0Var.f3479a;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            m11643Z(view).m36892k(0.0f);
        }
        if (i6 != 0) {
            m11643Z(view).m36891l(0.0f);
        }
        C1446d0 Z = m11643Z(view);
        this.f28149p.add(d0Var);
        Z.m36899d(m39286n()).m36898e(this.f28152s).m36897f(new C8734c(d0Var, i5, i6, Z)).m36893j();
    }

    public final void m11639d0(RecyclerView.AbstractC0886d0 d0Var) {
        C1446d0 Z = m11643Z(d0Var.f3479a);
        this.f28150q.add(d0Var);
        Z.m36899d(m39285o()).m36898e(this.f28152s).m36902a(0.0f).m36897f(new C8732a(d0Var, Z)).m36893j();
    }

    public void m11638e0(List<RecyclerView.AbstractC0886d0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            m11643Z(list.get(size).f3479a).m36901b();
        }
    }

    public void m11637f0() {
        if (!mo11624p()) {
            m39289i();
        }
    }

    @Override
    public boolean mo11636g(RecyclerView.AbstractC0886d0 d0Var, List<Object> list) {
        return !list.isEmpty() || super.mo11636g(d0Var, list);
    }

    public final void m11635g0(List<C8737f> list, RecyclerView.AbstractC0886d0 d0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C8737f fVar = list.get(size);
            if (m11633i0(fVar, d0Var) && fVar.f28171a == null && fVar.f28172b == null) {
                list.remove(fVar);
            }
        }
    }

    public final void m11634h0(C8737f fVar) {
        RecyclerView.AbstractC0886d0 d0Var = fVar.f28171a;
        if (d0Var != null) {
            m11633i0(fVar, d0Var);
        }
        RecyclerView.AbstractC0886d0 d0Var2 = fVar.f28172b;
        if (d0Var2 != null) {
            m11633i0(fVar, d0Var2);
        }
    }

    public final boolean m11633i0(C8737f fVar, RecyclerView.AbstractC0886d0 d0Var) {
        boolean z = false;
        if (fVar.f28172b == d0Var) {
            fVar.f28172b = null;
        } else if (fVar.f28171a != d0Var) {
            return false;
        } else {
            fVar.f28171a = null;
            z = true;
        }
        mo11622q0(d0Var.f3479a, 1.0f);
        m11621r0(d0Var.f3479a, 0.0f);
        m11620s0(d0Var.f3479a, 0.0f);
        m38732H(d0Var, z);
        return true;
    }

    @Override
    public void mo11632j(RecyclerView.AbstractC0886d0 d0Var) {
        View view = d0Var.f3479a;
        m11643Z(view).m36901b();
        int size = this.f28143j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f28143j.get(size).f28177a == d0Var) {
                m11620s0(view, 0.0f);
                m11621r0(view, 0.0f);
                m38730J(d0Var);
                this.f28143j.remove(size);
            }
        }
        m11635g0(this.f28144k, d0Var);
        if (this.f28141h.remove(d0Var)) {
            mo11622q0(view, 1.0f);
            m38728L(d0Var);
        }
        if (this.f28142i.remove(d0Var)) {
            mo11622q0(view, 1.0f);
            m38734F(d0Var);
        }
        for (int size2 = this.f28147n.size() - 1; size2 >= 0; size2--) {
            ArrayList<C8737f> arrayList = this.f28147n.get(size2);
            m11635g0(arrayList, d0Var);
            if (arrayList.isEmpty()) {
                this.f28147n.remove(size2);
            }
        }
        for (int size3 = this.f28146m.size() - 1; size3 >= 0; size3--) {
            ArrayList<C8738g> arrayList2 = this.f28146m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f28177a == d0Var) {
                    m11620s0(view, 0.0f);
                    m11621r0(view, 0.0f);
                    m38730J(d0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f28146m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f28145l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.AbstractC0886d0> arrayList3 = this.f28145l.get(size5);
            if (arrayList3.remove(d0Var)) {
                mo11622q0(view, 1.0f);
                m38734F(d0Var);
                if (arrayList3.isEmpty()) {
                    this.f28145l.remove(size5);
                }
            }
        }
        this.f28150q.remove(d0Var);
        this.f28148o.remove(d0Var);
        this.f28151r.remove(d0Var);
        this.f28149p.remove(d0Var);
        m11637f0();
    }

    public float m11631j0(View view) {
        return C1489y.m36719m(view);
    }

    @Override
    public void mo11630k() {
        int size = this.f28143j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C8738g gVar = this.f28143j.get(size);
            View view = gVar.f28177a.f3479a;
            m11620s0(view, 0.0f);
            m11621r0(view, 0.0f);
            m38730J(gVar.f28177a);
            this.f28143j.remove(size);
        }
        for (int size2 = this.f28141h.size() - 1; size2 >= 0; size2--) {
            m38728L(this.f28141h.get(size2));
            this.f28141h.remove(size2);
        }
        int size3 = this.f28142i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.AbstractC0886d0 d0Var = this.f28142i.get(size3);
            mo11622q0(d0Var.f3479a, 1.0f);
            m38734F(d0Var);
            this.f28142i.remove(size3);
        }
        for (int size4 = this.f28144k.size() - 1; size4 >= 0; size4--) {
            m11634h0(this.f28144k.get(size4));
        }
        this.f28144k.clear();
        if (mo11624p()) {
            for (int size5 = this.f28146m.size() - 1; size5 >= 0; size5--) {
                ArrayList<C8738g> arrayList = this.f28146m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C8738g gVar2 = arrayList.get(size6);
                    View view2 = gVar2.f28177a.f3479a;
                    m11620s0(view2, 0.0f);
                    m11621r0(view2, 0.0f);
                    m38730J(gVar2.f28177a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f28146m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f28145l.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.AbstractC0886d0> arrayList2 = this.f28145l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.AbstractC0886d0 d0Var2 = arrayList2.get(size8);
                    mo11622q0(d0Var2.f3479a, 1.0f);
                    m38734F(d0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f28145l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f28147n.size() - 1; size9 >= 0; size9--) {
                ArrayList<C8737f> arrayList3 = this.f28147n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m11634h0(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f28147n.remove(arrayList3);
                    }
                }
            }
            m11638e0(this.f28150q);
            m11638e0(this.f28149p);
            m11638e0(this.f28148o);
            m11638e0(this.f28151r);
            m39289i();
        }
    }

    public float m11629k0(View view) {
        return C1489y.m36767C(view);
    }

    public float m11628l0(View view) {
        return C1489y.m36766D(view);
    }

    @Override
    public boolean mo11624p() {
        return !this.f28142i.isEmpty() || !this.f28144k.isEmpty() || !this.f28143j.isEmpty() || !this.f28141h.isEmpty() || !this.f28149p.isEmpty() || !this.f28150q.isEmpty() || !this.f28148o.isEmpty() || !this.f28151r.isEmpty() || !this.f28146m.isEmpty() || !this.f28145l.isEmpty() || !this.f28147n.isEmpty();
    }

    public final void m11623p0(RecyclerView.AbstractC0886d0 d0Var) {
        d0Var.f3479a.animate().setInterpolator(this.f28152s);
        mo11632j(d0Var);
    }

    public void mo11622q0(View view, float f) {
        C1489y.m36742a0(view, f);
    }

    public void m11621r0(View view, float f) {
        C1489y.m36720l0(view, f);
    }

    public void m11620s0(View view, float f) {
        C1489y.m36718m0(view, f);
    }

    @Override
    public void mo11619v() {
        boolean z = !this.f28141h.isEmpty();
        boolean z2 = !this.f28143j.isEmpty();
        boolean z3 = !this.f28144k.isEmpty();
        boolean z4 = !this.f28142i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.AbstractC0886d0> it = this.f28141h.iterator();
            while (it.hasNext()) {
                m11639d0(it.next());
            }
            this.f28141h.clear();
            if (z2) {
                final ArrayList<C8738g> arrayList = new ArrayList<>();
                arrayList.addAll(this.f28143j);
                this.f28146m.add(arrayList);
                this.f28143j.clear();
                Runnable aVar = new Runnable() {
                    @Override
                    public final void run() {
                        C8731d.this.m11627m0(arrayList);
                    }
                };
                if (z) {
                    C1489y.m36748V(arrayList.get(0).f28177a.f3479a, aVar, m39285o());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                final ArrayList<C8737f> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f28144k);
                this.f28147n.add(arrayList2);
                this.f28144k.clear();
                Runnable bVar = new Runnable() {
                    @Override
                    public final void run() {
                        C8731d.this.m11626n0(arrayList2);
                    }
                };
                if (z) {
                    C1489y.m36748V(arrayList2.get(0).f28171a.f3479a, bVar, m39285o());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                final ArrayList<RecyclerView.AbstractC0886d0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f28142i);
                this.f28145l.add(arrayList3);
                this.f28142i.clear();
                Runnable cVar = new Runnable() {
                    @Override
                    public final void run() {
                        C8731d.this.m11625o0(arrayList3);
                    }
                };
                if (z || z2 || z3) {
                    long j = 0;
                    long o = z ? m39285o() : 0L;
                    long n = z2 ? m39286n() : 0L;
                    if (z3) {
                        j = m39287m();
                    }
                    C1489y.m36748V(arrayList3.get(0).f3479a, cVar, o + Math.max(n, j));
                    return;
                }
                cVar.run();
            }
        }
    }

    public static class C8737f {
        public RecyclerView.AbstractC0886d0 f28171a;
        public RecyclerView.AbstractC0886d0 f28172b;
        public int f28173c;
        public int f28174d;
        public int f28175e;
        public int f28176f;

        public C8737f(RecyclerView.AbstractC0886d0 d0Var, RecyclerView.AbstractC0886d0 d0Var2) {
            this.f28171a = d0Var;
            this.f28172b = d0Var2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f28171a + ", newHolder=" + this.f28172b + ", fromX=" + this.f28173c + ", fromY=" + this.f28174d + ", toX=" + this.f28175e + ", toY=" + this.f28176f + '}';
        }

        public C8737f(RecyclerView.AbstractC0886d0 d0Var, RecyclerView.AbstractC0886d0 d0Var2, int i, int i2, int i3, int i4) {
            this(d0Var, d0Var2);
            this.f28173c = i;
            this.f28174d = i2;
            this.f28175e = i3;
            this.f28176f = i4;
        }
    }
}
