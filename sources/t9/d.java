package t9;

import ca.b;
import ra.k;

public final class d {
    public final b.a f23006a;
    public final int f23007b;

    public d(b.a aVar, int i10) {
        k.e(aVar, "chunk");
        this.f23006a = aVar;
        this.f23007b = i10;
    }

    public final b.a a() {
        return this.f23006a;
    }

    public final int b() {
        return this.f23007b;
    }

    public final b.a c() {
        return this.f23006a;
    }

    public final int d() {
        return this.f23007b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k.b(this.f23006a, dVar.f23006a) && this.f23007b == dVar.f23007b;
    }

    public int hashCode() {
        b.a aVar = this.f23006a;
        return ((aVar != null ? aVar.hashCode() : 0) * 31) + this.f23007b;
    }

    public String toString() {
        return "ReaderData(chunk=" + this.f23006a + ", id=" + this.f23007b + ")";
    }
}
