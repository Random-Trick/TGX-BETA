package p316w9;

import android.media.MediaFormat;
import ba.AbstractC1296b;
import p192n9.EnumC7313d;
import pa.AbstractC8077a;
import qa.C8298k;

public final class C10003e implements AbstractC1296b {
    public final AbstractC1296b f32611a;
    public final AbstractC8077a<Boolean> f32612b;

    public C10003e(AbstractC1296b bVar, AbstractC8077a<Boolean> aVar) {
        C8298k.m12933e(bVar, "source");
        C8298k.m12933e(aVar, "force");
        this.f32611a = bVar;
        this.f32612b = aVar;
    }

    @Override
    public long mo6292c(long j) {
        return this.f32611a.mo6292c(j);
    }

    @Override
    public long mo6291d() {
        return this.f32611a.mo6291d();
    }

    @Override
    public void mo6290e() {
        this.f32611a.mo6290e();
    }

    @Override
    public void mo6289f(AbstractC1296b.C1297a aVar) {
        C8298k.m12933e(aVar, "chunk");
        this.f32611a.mo6289f(aVar);
    }

    @Override
    public long mo6288g() {
        return this.f32611a.mo6288g();
    }

    @Override
    public void mo6287h(EnumC7313d dVar) {
        C8298k.m12933e(dVar, "type");
        this.f32611a.mo6287h(dVar);
    }

    @Override
    public int mo6286i() {
        return this.f32611a.mo6286i();
    }

    @Override
    public boolean mo6285j() {
        return this.f32612b.mo4925b().booleanValue() || this.f32611a.mo6285j();
    }

    @Override
    public boolean mo6284k(EnumC7313d dVar) {
        C8298k.m12933e(dVar, "type");
        return this.f32611a.mo6284k(dVar);
    }

    @Override
    public void mo6283l(EnumC7313d dVar) {
        C8298k.m12933e(dVar, "type");
        this.f32611a.mo6283l(dVar);
    }

    @Override
    public void mo6282m() {
        this.f32611a.mo6282m();
    }

    @Override
    public MediaFormat mo6281n(EnumC7313d dVar) {
        C8298k.m12933e(dVar, "type");
        return this.f32611a.mo6281n(dVar);
    }

    @Override
    public double[] mo6280o() {
        return this.f32611a.mo6280o();
    }

    @Override
    public boolean mo6279p() {
        return this.f32611a.mo6279p();
    }
}
