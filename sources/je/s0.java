package je;

import ld.b;
import ld.h;
import md.j;

public class s0 {
    public final int f15461a;
    public final int f15462b;
    public final h f15463c;
    public final h f15464d;
    public final h f15465e;
    public final j f15466f;

    public s0(int i10, int i11, h hVar, h hVar2, h hVar3) {
        this.f15461a = i10;
        this.f15462b = i11;
        this.f15463c = hVar;
        this.f15464d = hVar2;
        this.f15465e = hVar3;
        this.f15466f = null;
    }

    public int a() {
        return this.f15462b;
    }

    public int b() {
        return this.f15461a;
    }

    public boolean c() {
        return this.f15466f != null;
    }

    public boolean d() {
        return this.f15465e != null;
    }

    public void e(int i10, b bVar) {
        bVar.l(i10).j(this.f15463c, this.f15464d);
        if (this.f15465e != null) {
            bVar.k(i10).G(this.f15465e);
        } else if (this.f15466f != null) {
            bVar.j(i10).r(this.f15466f);
        }
    }

    public s0(int i10, int i11, h hVar, h hVar2, j jVar) {
        this.f15461a = i10;
        this.f15462b = i11;
        this.f15463c = hVar;
        this.f15464d = hVar2;
        this.f15466f = jVar;
        this.f15465e = null;
    }
}
