package j$.util;

import java.util.NoSuchElementException;

public final class C0286n {
    private static final C0286n f14472c = new C0286n();
    private final boolean f14473a;
    private final long f14474b;

    private C0286n() {
        this.f14473a = false;
        this.f14474b = 0L;
    }

    private C0286n(long j10) {
        this.f14473a = true;
        this.f14474b = j10;
    }

    public static C0286n a() {
        return f14472c;
    }

    public static C0286n d(long j10) {
        return new C0286n(j10);
    }

    public final long b() {
        if (this.f14473a) {
            return this.f14474b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f14473a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0286n)) {
            return false;
        }
        C0286n nVar = (C0286n) obj;
        boolean z10 = this.f14473a;
        if (!z10 || !nVar.f14473a) {
            if (z10 == nVar.f14473a) {
                return true;
            }
        } else if (this.f14474b == nVar.f14474b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.f14473a) {
            return 0;
        }
        long j10 = this.f14474b;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return this.f14473a ? String.format("OptionalLong[%s]", Long.valueOf(this.f14474b)) : "OptionalLong.empty";
    }
}
