package ae;

import ib.d;

public final class d0 implements p {
    public final p f828a;
    public final p f829b;
    public float f830c;

    public d0(p pVar, p pVar2) {
        this.f828a = pVar;
        this.f829b = pVar2;
    }

    @Override
    public int a() {
        return -1;
    }

    @Override
    public String b() {
        return this.f829b.b();
    }

    @Override
    public boolean c() {
        return this.f829b.c();
    }

    @Override
    public float d(int i10) {
        if (this.f830c == 1.0f || z.B(i10)) {
            return this.f829b.d(i10);
        }
        if (this.f830c == 0.0f) {
            return this.f828a.d(i10);
        }
        float d10 = this.f828a.d(i10);
        return d10 + ((this.f829b.d(i10) - d10) * this.f830c);
    }

    @Override
    public int e(int i10) {
        float f10 = this.f830c;
        if (f10 == 0.0f) {
            return this.f828a.e(i10);
        }
        if (f10 == 1.0f) {
            return this.f829b.e(i10);
        }
        return d.d(this.f828a.e(i10), this.f829b.e(i10), this.f830c);
    }

    public boolean equals(Object obj) {
        return (obj instanceof p) && this.f829b.equals(obj);
    }

    @Override
    public boolean f() {
        return o.b(this);
    }

    public float g() {
        return this.f830c;
    }

    public p h() {
        p pVar = this.f828a;
        return pVar instanceof d0 ? ((d0) pVar).i() : pVar;
    }

    public p i() {
        return this.f829b;
    }

    public boolean j(float f10) {
        if (this.f830c == f10) {
            return false;
        }
        this.f830c = f10;
        return true;
    }
}
