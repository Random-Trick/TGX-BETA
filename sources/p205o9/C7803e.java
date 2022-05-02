package p205o9;

import p107ha.C5060q;
import p192n9.EnumC7313d;
import p289u9.AbstractC9475i;
import p289u9.C9464d;
import p316w9.C10007i;
import qa.C8298k;

public final class C7803e {
    public final C10007i f24994a;
    public AbstractC9475i<C5060q> f24995b;
    public final EnumC7313d f24996c;
    public final int f24997d;
    public final C9464d f24998e;

    public C7803e(EnumC7313d dVar, int i, C9464d dVar2) {
        C8298k.m12933e(dVar, "type");
        C8298k.m12933e(dVar2, "pipeline");
        this.f24996c = dVar;
        this.f24997d = i;
        this.f24998e = dVar2;
        this.f24994a = new C10007i("Segment(" + dVar + ',' + i + ')');
    }

    public final boolean m15035a() {
        AbstractC9475i<C5060q> a = this.f24998e.m8578a();
        this.f24995b = a;
        return a instanceof AbstractC9475i.C9477b;
    }

    public final boolean m15034b() {
        C10007i iVar = this.f24994a;
        iVar.m6262h("canAdvance(): state=" + this.f24995b);
        AbstractC9475i<C5060q> iVar2 = this.f24995b;
        return iVar2 == null || !(iVar2 instanceof AbstractC9475i.C9476a);
    }

    public final int m15033c() {
        return this.f24997d;
    }

    public final EnumC7313d m15032d() {
        return this.f24996c;
    }

    public final void m15031e() {
        this.f24998e.m8576c();
    }
}
