package p033c6;

import p163l5.C6374q;

public final class C1876pa {
    public final AbstractC1721f1<EnumC1834ma> f6810a;

    public C1876pa(C1848na naVar, C1862oa oaVar) {
        AbstractC1721f1<EnumC1834ma> f1Var;
        f1Var = naVar.f6574a;
        this.f6810a = f1Var;
    }

    @AbstractC1707e2(zza = 1)
    public final AbstractC1721f1<EnumC1834ma> m35951a() {
        return this.f6810a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1876pa)) {
            return false;
        }
        return C6374q.m20525a(this.f6810a, ((C1876pa) obj).f6810a);
    }

    public final int hashCode() {
        return C6374q.m20524b(this.f6810a);
    }
}
