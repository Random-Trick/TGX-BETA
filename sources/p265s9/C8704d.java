package p265s9;

import ba.AbstractC1296b;
import qa.C8298k;

public final class C8704d {
    public final AbstractC1296b.C1297a f28049a;
    public final int f28050b;

    public C8704d(AbstractC1296b.C1297a aVar, int i) {
        C8298k.m12933e(aVar, "chunk");
        this.f28049a = aVar;
        this.f28050b = i;
    }

    public final AbstractC1296b.C1297a m11712a() {
        return this.f28049a;
    }

    public final int m11711b() {
        return this.f28050b;
    }

    public final AbstractC1296b.C1297a m11710c() {
        return this.f28049a;
    }

    public final int m11709d() {
        return this.f28050b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8704d)) {
            return false;
        }
        C8704d dVar = (C8704d) obj;
        return C8298k.m12936b(this.f28049a, dVar.f28049a) && this.f28050b == dVar.f28050b;
    }

    public int hashCode() {
        AbstractC1296b.C1297a aVar = this.f28049a;
        return ((aVar != null ? aVar.hashCode() : 0) * 31) + this.f28050b;
    }

    public String toString() {
        return "ReaderData(chunk=" + this.f28049a + ", id=" + this.f28050b + ")";
    }
}
