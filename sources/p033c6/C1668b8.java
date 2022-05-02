package p033c6;

import p163l5.C6374q;

public final class C1668b8 {
    public final EnumC2013z7 f6118a;
    public final Integer f6119b;
    public final Integer f6120c = null;
    public final Boolean f6121d = null;

    public C1668b8(C1999y7 y7Var, C1653a8 a8Var) {
        EnumC2013z7 z7Var;
        Integer num;
        z7Var = y7Var.f7131a;
        this.f6118a = z7Var;
        num = y7Var.f7132b;
        this.f6119b = num;
    }

    @AbstractC1707e2(zza = 1)
    public final EnumC2013z7 m36114a() {
        return this.f6118a;
    }

    @AbstractC1707e2(zza = 2)
    public final Integer m36113b() {
        return this.f6119b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1668b8)) {
            return false;
        }
        C1668b8 b8Var = (C1668b8) obj;
        return C6374q.m20524a(this.f6118a, b8Var.f6118a) && C6374q.m20524a(this.f6119b, b8Var.f6119b) && C6374q.m20524a(null, null) && C6374q.m20524a(null, null);
    }

    public final int hashCode() {
        return C6374q.m20523b(this.f6118a, this.f6119b, null, null);
    }
}
