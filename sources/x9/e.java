package x9;

import android.media.MediaFormat;
import ca.b;
import o9.d;
import qa.a;
import ra.k;

public final class e implements b {
    public final b f26176a;
    public final a<Boolean> f26177b;

    public e(b bVar, a<Boolean> aVar) {
        k.e(bVar, "source");
        k.e(aVar, "force");
        this.f26176a = bVar;
        this.f26177b = aVar;
    }

    @Override
    public long c(long j10) {
        return this.f26176a.c(j10);
    }

    @Override
    public long d() {
        return this.f26176a.d();
    }

    @Override
    public void e() {
        this.f26176a.e();
    }

    @Override
    public void f(d dVar) {
        k.e(dVar, "type");
        this.f26176a.f(dVar);
    }

    @Override
    public long g() {
        return this.f26176a.g();
    }

    @Override
    public void h(b.a aVar) {
        k.e(aVar, "chunk");
        this.f26176a.h(aVar);
    }

    @Override
    public boolean i(d dVar) {
        k.e(dVar, "type");
        return this.f26176a.i(dVar);
    }

    @Override
    public int j() {
        return this.f26176a.j();
    }

    @Override
    public MediaFormat k(d dVar) {
        k.e(dVar, "type");
        return this.f26176a.k(dVar);
    }

    @Override
    public boolean l() {
        return this.f26177b.b().booleanValue() || this.f26176a.l();
    }

    @Override
    public void m() {
        this.f26176a.m();
    }

    @Override
    public void n(d dVar) {
        k.e(dVar, "type");
        this.f26176a.n(dVar);
    }

    @Override
    public double[] o() {
        return this.f26176a.o();
    }

    @Override
    public boolean p() {
        return this.f26176a.p();
    }
}
