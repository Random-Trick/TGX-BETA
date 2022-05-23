package p9;

import ia.q;
import o9.d;
import ra.k;
import v9.i;
import x9.i;

public final class e {
    public final i f20941a;
    public v9.i<q> f20942b;
    public final d f20943c;
    public final int f20944d;
    public final v9.d f20945e;

    public e(d dVar, int i10, v9.d dVar2) {
        k.e(dVar, "type");
        k.e(dVar2, "pipeline");
        this.f20943c = dVar;
        this.f20944d = i10;
        this.f20945e = dVar2;
        this.f20941a = new i("Segment(" + dVar + ',' + i10 + ')');
    }

    public final boolean a() {
        v9.i<q> a10 = this.f20945e.a();
        this.f20942b = a10;
        return a10 instanceof i.b;
    }

    public final boolean b() {
        x9.i iVar = this.f20941a;
        iVar.h("canAdvance(): state=" + this.f20942b);
        v9.i<q> iVar2 = this.f20942b;
        return iVar2 == null || !(iVar2 instanceof i.a);
    }

    public final int c() {
        return this.f20944d;
    }

    public final d d() {
        return this.f20943c;
    }

    public final void e() {
        this.f20945e.c();
    }
}
