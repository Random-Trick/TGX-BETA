package p9;

import ca.a;
import ca.b;
import ia.f;
import ja.n;
import ja.o;
import ja.s;
import ja.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ra.k;
import x9.i;
import x9.l;

public final class d implements l<List<? extends b>> {
    public final List<b> M;
    public final i f20938a;
    public final List<b> f20939b;
    public final List<b> f20940c;

    public d(List<? extends b> list, List<? extends b> list2) {
        int i10;
        List list3;
        List list4;
        List arrayList;
        i iVar = new i("DataSources");
        this.f20938a = iVar;
        iVar.c("initializing videoSources...");
        x(list);
        iVar.c("initializing audioSources...");
        x(list2);
        this.f20939b = new ArrayList();
        int i11 = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            i10 = 0;
            for (b bVar : list) {
                if ((bVar.k(o9.d.VIDEO) != null) && (i10 = i10 + 1) < 0) {
                    n.m();
                }
            }
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            List f10 = n.f();
            s.r(this.f20939b, list);
            list3 = f10;
        } else {
            list.size();
            list3 = list;
        }
        this.f20940c = list3;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            int i12 = 0;
            for (b bVar2 : list2) {
                if ((bVar2.k(o9.d.AUDIO) != null) && (i12 = i12 + 1) < 0) {
                    n.m();
                }
            }
            i11 = i12;
        }
        i iVar2 = this.f20938a;
        iVar2.c("computing audioSources, valid=" + i11);
        if (i11 == 0) {
            arrayList = n.f();
            s.r(this.f20939b, list2);
        } else {
            int size = list2.size();
            list4 = list2;
            if (i11 != size) {
                arrayList = new ArrayList(o.o(list2, 10));
                for (b bVar3 : list2) {
                    if (bVar3.k(o9.d.AUDIO) == null) {
                        a aVar = new a(bVar3.d());
                        this.f20939b.add(bVar3);
                        bVar3 = aVar;
                    }
                    arrayList.add(bVar3);
                }
            }
            this.M = list4;
        }
        list4 = arrayList;
        this.M = list4;
    }

    public final List<b> f() {
        return v.z(v.J(a(), b()));
    }

    public List<b> k() {
        return (List) l.a.a(this);
    }

    @Override
    public int getSize() {
        return l.a.f(this);
    }

    @Override
    public boolean i() {
        return l.a.c(this);
    }

    @Override
    public Iterator<List<b>> iterator() {
        return l.a.h(this);
    }

    @Override
    public boolean l() {
        return l.a.d(this);
    }

    public final void m(b bVar) {
        if (bVar.p()) {
            bVar.m();
        }
    }

    @Override
    public boolean q(o9.d dVar) {
        k.e(dVar, "type");
        return !n(dVar).isEmpty();
    }

    public final void r(List<? extends b> list) {
        for (b bVar : list) {
            i iVar = this.f20938a;
            iVar.c("deinitializing " + bVar + "... (isInit=" + bVar.p() + ')');
            m(bVar);
        }
    }

    public List<b> n(o9.d dVar) {
        k.e(dVar, "type");
        int i10 = c.f20937a[dVar.ordinal()];
        if (i10 == 1) {
            return this.M;
        }
        if (i10 == 2) {
            return this.f20940c;
        }
        throw new f();
    }

    public List<b> a() {
        return (List) l.a.b(this);
    }

    public List<b> o(o9.d dVar) {
        k.e(dVar, "type");
        return (List) l.a.e(this, dVar);
    }

    public List<b> b() {
        return (List) l.a.g(this);
    }

    public final void w(b bVar) {
        if (!bVar.p()) {
            bVar.e();
        }
    }

    public final void x(List<? extends b> list) {
        for (b bVar : list) {
            i iVar = this.f20938a;
            iVar.c("initializing " + bVar + "... (isInit=" + bVar.p() + ')');
            w(bVar);
        }
    }

    public final void y() {
        this.f20938a.c("release(): releasing...");
        r(b());
        r(a());
        r(this.f20939b);
        this.f20938a.c("release(): released.");
    }

    public List<b> j() {
        return (List) l.a.i(this);
    }

    public d(n9.c r3) {
        throw new UnsupportedOperationException("Method not decompiled: p9.d.<init>(n9.c):void");
    }
}
