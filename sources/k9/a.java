package k9;

import i9.d;
import i9.e;
import ra.k;

public class a {
    public int f15737a = -1;
    public int f15738b = -1;
    public f9.a f15739c;
    public e f15740d;

    public a(f9.a aVar, e eVar) {
        k.e(aVar, "eglCore");
        k.e(eVar, "eglSurface");
        this.f15739c = aVar;
        this.f15740d = eVar;
    }

    public final f9.a a() {
        return this.f15739c;
    }

    public final e b() {
        return this.f15740d;
    }

    public final void c() {
        this.f15739c.b(this.f15740d);
    }

    public void d() {
        this.f15739c.d(this.f15740d);
        this.f15740d = d.h();
        this.f15738b = -1;
        this.f15737a = -1;
    }

    public final void e(long j10) {
        this.f15739c.e(this.f15740d, j10);
    }
}
