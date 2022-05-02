package p265s9;

import ba.AbstractC1296b;
import qa.C8298k;

public final class C8704d {
    public final AbstractC1296b.C1297a f28046a;
    public final int f28047b;

    public C8704d(AbstractC1296b.C1297a aVar, int i) {
        C8298k.m12934e(aVar, "chunk");
        this.f28046a = aVar;
        this.f28047b = i;
    }

    public final AbstractC1296b.C1297a m11713a() {
        return this.f28046a;
    }

    public final int m11712b() {
        return this.f28047b;
    }

    public final AbstractC1296b.C1297a m11711c() {
        return this.f28046a;
    }

    public final int m11710d() {
        return this.f28047b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8704d)) {
            return false;
        }
        C8704d dVar = (C8704d) obj;
        return C8298k.m12937b(this.f28046a, dVar.f28046a) && this.f28047b == dVar.f28047b;
    }

    public int hashCode() {
        AbstractC1296b.C1297a aVar = this.f28046a;
        return ((aVar != null ? aVar.hashCode() : 0) * 31) + this.f28047b;
    }

    public String toString() {
        return "ReaderData(chunk=" + this.f28046a + ", id=" + this.f28047b + ")";
    }
}
