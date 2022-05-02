package p205o9;

import p107ha.C5060q;
import p192n9.EnumC7313d;
import p289u9.AbstractC9475i;
import p289u9.C9464d;
import p316w9.C10007i;
import qa.C8298k;

public final class C7803e {
    public final C10007i f24991a;
    public AbstractC9475i<C5060q> f24992b;
    public final EnumC7313d f24993c;
    public final int f24994d;
    public final C9464d f24995e;

    public C7803e(EnumC7313d dVar, int i, C9464d dVar2) {
        C8298k.m12934e(dVar, "type");
        C8298k.m12934e(dVar2, "pipeline");
        this.f24993c = dVar;
        this.f24994d = i;
        this.f24995e = dVar2;
        this.f24991a = new C10007i("Segment(" + dVar + ',' + i + ')');
    }

    public final boolean m15035a() {
        AbstractC9475i<C5060q> a = this.f24995e.m8578a();
        this.f24992b = a;
        return a instanceof AbstractC9475i.C9477b;
    }

    public final boolean m15034b() {
        C10007i iVar = this.f24991a;
        iVar.m6262h("canAdvance(): state=" + this.f24992b);
        AbstractC9475i<C5060q> iVar2 = this.f24992b;
        return iVar2 == null || !(iVar2 instanceof AbstractC9475i.C9476a);
    }

    public final int m15033c() {
        return this.f24994d;
    }

    public final EnumC7313d m15032d() {
        return this.f24993c;
    }

    public final void m15031e() {
        this.f24995e.m8576c();
    }
}
