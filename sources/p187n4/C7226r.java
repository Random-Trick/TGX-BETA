package p187n4;

public class C7226r {
    public final Object f23020a;
    public final int f23021b;
    public final int f23022c;
    public final long f23023d;
    public final int f23024e;

    public C7226r(Object obj) {
        this(obj, -1L);
    }

    public C7226r m17275a(Object obj) {
        return this.f23020a.equals(obj) ? this : new C7226r(obj, this.f23021b, this.f23022c, this.f23023d, this.f23024e);
    }

    public boolean m17274b() {
        return this.f23021b != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7226r)) {
            return false;
        }
        C7226r rVar = (C7226r) obj;
        return this.f23020a.equals(rVar.f23020a) && this.f23021b == rVar.f23021b && this.f23022c == rVar.f23022c && this.f23023d == rVar.f23023d && this.f23024e == rVar.f23024e;
    }

    public int hashCode() {
        return ((((((((527 + this.f23020a.hashCode()) * 31) + this.f23021b) * 31) + this.f23022c) * 31) + ((int) this.f23023d)) * 31) + this.f23024e;
    }

    public C7226r(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public C7226r(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public C7226r(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    public C7226r(C7226r rVar) {
        this.f23020a = rVar.f23020a;
        this.f23021b = rVar.f23021b;
        this.f23022c = rVar.f23022c;
        this.f23023d = rVar.f23023d;
        this.f23024e = rVar.f23024e;
    }

    public C7226r(Object obj, int i, int i2, long j, int i3) {
        this.f23020a = obj;
        this.f23021b = i;
        this.f23022c = i2;
        this.f23023d = j;
        this.f23024e = i3;
    }
}
