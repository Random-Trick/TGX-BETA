package d6;

import m5.q;

public final class t2 {
    public final n8 f6982a;
    public final Boolean f6984c;
    public final pa f6986e;
    public final f1<z8> f6987f;
    public final f1<a9> f6988g;
    public final Boolean f6983b = null;
    public final b8 f6985d = null;

    public t2(r2 r2Var, s2 s2Var) {
        n8 n8Var;
        Boolean bool;
        pa paVar;
        f1<z8> f1Var;
        f1<a9> f1Var2;
        n8Var = r2Var.f6918a;
        this.f6982a = n8Var;
        bool = r2Var.f6919b;
        this.f6984c = bool;
        paVar = r2Var.f6920c;
        this.f6986e = paVar;
        f1Var = r2Var.f6921d;
        this.f6987f = f1Var;
        f1Var2 = r2Var.f6922e;
        this.f6988g = f1Var2;
    }

    @e2(zza = 6)
    public final f1<z8> a() {
        return this.f6987f;
    }

    @e2(zza = 7)
    public final f1<a9> b() {
        return this.f6988g;
    }

    @e2(zza = 1)
    public final n8 c() {
        return this.f6982a;
    }

    @e2(zza = 5)
    public final pa d() {
        return this.f6986e;
    }

    @e2(zza = 3)
    public final Boolean e() {
        return this.f6984c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t2)) {
            return false;
        }
        t2 t2Var = (t2) obj;
        return q.a(this.f6982a, t2Var.f6982a) && q.a(null, null) && q.a(this.f6984c, t2Var.f6984c) && q.a(null, null) && q.a(this.f6986e, t2Var.f6986e) && q.a(this.f6987f, t2Var.f6987f) && q.a(this.f6988g, t2Var.f6988g);
    }

    public final int hashCode() {
        return q.b(this.f6982a, null, this.f6984c, null, this.f6986e, this.f6987f, this.f6988g);
    }
}
