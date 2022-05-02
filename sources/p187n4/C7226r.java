package p187n4;

public class C7226r {
    public final Object f23017a;
    public final int f23018b;
    public final int f23019c;
    public final long f23020d;
    public final int f23021e;

    public C7226r(Object obj) {
        this(obj, -1L);
    }

    public C7226r m17275a(Object obj) {
        return this.f23017a.equals(obj) ? this : new C7226r(obj, this.f23018b, this.f23019c, this.f23020d, this.f23021e);
    }

    public boolean m17274b() {
        return this.f23018b != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7226r)) {
            return false;
        }
        C7226r rVar = (C7226r) obj;
        return this.f23017a.equals(rVar.f23017a) && this.f23018b == rVar.f23018b && this.f23019c == rVar.f23019c && this.f23020d == rVar.f23020d && this.f23021e == rVar.f23021e;
    }

    public int hashCode() {
        return ((((((((527 + this.f23017a.hashCode()) * 31) + this.f23018b) * 31) + this.f23019c) * 31) + ((int) this.f23020d)) * 31) + this.f23021e;
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
        this.f23017a = rVar.f23017a;
        this.f23018b = rVar.f23018b;
        this.f23019c = rVar.f23019c;
        this.f23020d = rVar.f23020d;
        this.f23021e = rVar.f23021e;
    }

    public C7226r(Object obj, int i, int i2, long j, int i3) {
        this.f23017a = obj;
        this.f23018b = i;
        this.f23019c = i2;
        this.f23020d = j;
        this.f23021e = i3;
    }
}
