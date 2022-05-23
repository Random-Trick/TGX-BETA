package d6;

import m5.q;

public final class pa {
    public final f1<ma> f6882a;

    public pa(na naVar, oa oaVar) {
        f1<ma> f1Var;
        f1Var = naVar.f6738a;
        this.f6882a = f1Var;
    }

    @e2(zza = 1)
    public final f1<ma> a() {
        return this.f6882a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pa)) {
            return false;
        }
        return q.a(this.f6882a, ((pa) obj).f6882a);
    }

    public final int hashCode() {
        return q.b(this.f6882a);
    }
}
