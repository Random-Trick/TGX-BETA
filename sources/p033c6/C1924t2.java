package p033c6;

import p163l5.C6374q;

public final class C1924t2 {
    public final EnumC1846n8 f6918a;
    public final Boolean f6920c;
    public final C1876pa f6922e;
    public final AbstractC1721f1<EnumC2014z8> f6923f;
    public final AbstractC1721f1<EnumC1654a9> f6924g;
    public final Boolean f6919b = null;
    public final C1668b8 f6921d = null;

    public C1924t2(C1896r2 r2Var, C1910s2 s2Var) {
        EnumC1846n8 n8Var;
        Boolean bool;
        C1876pa paVar;
        AbstractC1721f1<EnumC2014z8> f1Var;
        AbstractC1721f1<EnumC1654a9> f1Var2;
        n8Var = r2Var.f6849a;
        this.f6918a = n8Var;
        bool = r2Var.f6850b;
        this.f6920c = bool;
        paVar = r2Var.f6851c;
        this.f6922e = paVar;
        f1Var = r2Var.f6852d;
        this.f6923f = f1Var;
        f1Var2 = r2Var.f6853e;
        this.f6924g = f1Var2;
    }

    @AbstractC1707e2(zza = 6)
    public final AbstractC1721f1<EnumC2014z8> m35904a() {
        return this.f6923f;
    }

    @AbstractC1707e2(zza = 7)
    public final AbstractC1721f1<EnumC1654a9> m35903b() {
        return this.f6924g;
    }

    @AbstractC1707e2(zza = 1)
    public final EnumC1846n8 m35902c() {
        return this.f6918a;
    }

    @AbstractC1707e2(zza = 5)
    public final C1876pa m35901d() {
        return this.f6922e;
    }

    @AbstractC1707e2(zza = 3)
    public final Boolean m35900e() {
        return this.f6920c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1924t2)) {
            return false;
        }
        C1924t2 t2Var = (C1924t2) obj;
        return C6374q.m20524a(this.f6918a, t2Var.f6918a) && C6374q.m20524a(null, null) && C6374q.m20524a(this.f6920c, t2Var.f6920c) && C6374q.m20524a(null, null) && C6374q.m20524a(this.f6922e, t2Var.f6922e) && C6374q.m20524a(this.f6923f, t2Var.f6923f) && C6374q.m20524a(this.f6924g, t2Var.f6924g);
    }

    public final int hashCode() {
        return C6374q.m20523b(this.f6918a, null, this.f6920c, null, this.f6922e, this.f6923f, this.f6924g);
    }
}
