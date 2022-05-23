package id;

import nb.a;
import nb.b;

public class o implements b {
    public int f14221a;
    public int f14222b;

    public o() {
    }

    public o(int i10, int i11) {
        this.f14221a = i10;
        this.f14222b = i11;
    }

    @Override
    public void a(a aVar) {
        this.f14221a = aVar.s();
        this.f14222b = aVar.s();
    }

    @Override
    public int b() {
        return a.w(this.f14221a) + a.w(this.f14222b);
    }

    @Override
    public void c(a aVar) {
        aVar.M(this.f14221a);
        aVar.M(this.f14222b);
    }
}
