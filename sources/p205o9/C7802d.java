package p205o9;

import ba.AbstractC1296b;
import ba.C1295a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p107ha.C5046f;
import p123ia.C5304n;
import p123ia.C5305o;
import p123ia.C5309s;
import p123ia.C5312v;
import p192n9.EnumC7313d;
import p316w9.AbstractC10012l;
import p316w9.C10007i;
import qa.C8298k;

public final class C7802d implements AbstractC10012l<List<? extends AbstractC1296b>> {
    public final List<AbstractC1296b> f24990M;
    public final C10007i f24991a;
    public final List<AbstractC1296b> f24992b;
    public final List<AbstractC1296b> f24993c;

    public C7802d(List<? extends AbstractC1296b> list, List<? extends AbstractC1296b> list2) {
        int i;
        List list3;
        List list4;
        List arrayList;
        C10007i iVar = new C10007i("DataSources");
        this.f24991a = iVar;
        iVar.m6267c("initializing videoSources...");
        m15038x(list);
        iVar.m6267c("initializing audioSources...");
        m15038x(list2);
        this.f24992b = new ArrayList();
        int i2 = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            i = 0;
            for (AbstractC1296b bVar : list) {
                if ((bVar.mo6281n(EnumC7313d.VIDEO) != null) && (i = i + 1) < 0) {
                    C5304n.m23360m();
                }
            }
        } else {
            i = 0;
        }
        if (i == 0) {
            List f = C5304n.m23367f();
            C5309s.m23355r(this.f24992b, list);
            list3 = f;
        } else {
            list.size();
            list3 = list;
        }
        this.f24993c = list3;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            int i3 = 0;
            for (AbstractC1296b bVar2 : list2) {
                if ((bVar2.mo6281n(EnumC7313d.AUDIO) != null) && (i3 = i3 + 1) < 0) {
                    C5304n.m23360m();
                }
            }
            i2 = i3;
        }
        C10007i iVar2 = this.f24991a;
        iVar2.m6267c("computing audioSources, valid=" + i2);
        if (i2 == 0) {
            arrayList = C5304n.m23367f();
            C5309s.m23355r(this.f24992b, list2);
        } else {
            int size = list2.size();
            list4 = list2;
            if (i2 != size) {
                arrayList = new ArrayList(C5305o.m23358o(list2, 10));
                for (AbstractC1296b bVar3 : list2) {
                    if (bVar3.mo6281n(EnumC7313d.AUDIO) == null) {
                        C1295a aVar = new C1295a(bVar3.mo6291d());
                        this.f24992b.add(bVar3);
                        bVar3 = aVar;
                    }
                    arrayList.add(bVar3);
                }
            }
            this.f24990M = list4;
        }
        list4 = arrayList;
        this.f24990M = list4;
    }

    @Override
    public boolean mo6237g(EnumC7313d dVar) {
        C8298k.m12933e(dVar, "type");
        return !mo6239d(dVar).isEmpty();
    }

    @Override
    public int getSize() {
        return AbstractC10012l.C10013a.m6227f(this);
    }

    public final List<AbstractC1296b> m15047h() {
        return C5312v.m23322z(C5312v.m23339J(mo6241a(), mo6240b()));
    }

    public List<AbstractC1296b> mo6234n() {
        return (List) AbstractC10012l.C10013a.m6232a(this);
    }

    @Override
    public Iterator<List<AbstractC1296b>> iterator() {
        return AbstractC10012l.C10013a.m6225h(this);
    }

    @Override
    public boolean mo6236k() {
        return AbstractC10012l.C10013a.m6230c(this);
    }

    public final void m15045m(AbstractC1296b bVar) {
        if (bVar.mo6279p()) {
            bVar.mo6282m();
        }
    }

    @Override
    public boolean mo6233o() {
        return AbstractC10012l.C10013a.m6229d(this);
    }

    public final void m15044r(List<? extends AbstractC1296b> list) {
        for (AbstractC1296b bVar : list) {
            C10007i iVar = this.f24991a;
            iVar.m6267c("deinitializing " + bVar + "... (isInit=" + bVar.mo6279p() + ')');
            m15045m(bVar);
        }
    }

    public List<AbstractC1296b> mo6239d(EnumC7313d dVar) {
        C8298k.m12933e(dVar, "type");
        int i = C7801c.f24989a[dVar.ordinal()];
        if (i == 1) {
            return this.f24990M;
        }
        if (i == 2) {
            return this.f24993c;
        }
        throw new C5046f();
    }

    public List<AbstractC1296b> mo6241a() {
        return (List) AbstractC10012l.C10013a.m6231b(this);
    }

    public List<AbstractC1296b> mo6238f(EnumC7313d dVar) {
        C8298k.m12933e(dVar, "type");
        return (List) AbstractC10012l.C10013a.m6228e(this, dVar);
    }

    public List<AbstractC1296b> mo6240b() {
        return (List) AbstractC10012l.C10013a.m6226g(this);
    }

    public final void m15039w(AbstractC1296b bVar) {
        if (!bVar.mo6279p()) {
            bVar.mo6290e();
        }
    }

    public final void m15038x(List<? extends AbstractC1296b> list) {
        for (AbstractC1296b bVar : list) {
            C10007i iVar = this.f24991a;
            iVar.m6267c("initializing " + bVar + "... (isInit=" + bVar.mo6279p() + ')');
            m15039w(bVar);
        }
    }

    public final void m15037y() {
        this.f24991a.m6267c("release(): releasing...");
        m15044r(mo6240b());
        m15044r(mo6241a());
        m15044r(this.f24992b);
        this.f24991a.m6267c("release(): released.");
    }

    public List<AbstractC1296b> mo6235l() {
        return (List) AbstractC10012l.C10013a.m6224i(this);
    }

    public C7802d(p180m9.C6806c r3) {
        throw new UnsupportedOperationException("Method not decompiled: p205o9.C7802d.<init>(m9.c):void");
    }
}
