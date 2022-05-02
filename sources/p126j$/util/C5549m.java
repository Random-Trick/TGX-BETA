package p126j$.util;

import java.util.NoSuchElementException;

public final class C5549m {
    private static final C5549m f18084c = new C5549m();
    private final boolean f18085a;
    private final long f18086b;

    private C5549m() {
        this.f18085a = false;
        this.f18086b = 0L;
    }

    private C5549m(long j) {
        this.f18085a = true;
        this.f18086b = j;
    }

    public static C5549m m22465a() {
        return f18084c;
    }

    public static C5549m m22462d(long j) {
        return new C5549m(j);
    }

    public long m22464b() {
        if (this.f18085a) {
            return this.f18086b;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean m22463c() {
        return this.f18085a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5549m)) {
            return false;
        }
        C5549m mVar = (C5549m) obj;
        boolean z = this.f18085a;
        if (!z || !mVar.f18085a) {
            if (z == mVar.f18085a) {
                return true;
            }
        } else if (this.f18086b == mVar.f18086b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (!this.f18085a) {
            return 0;
        }
        long j = this.f18086b;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return this.f18085a ? String.format("OptionalLong[%s]", Long.valueOf(this.f18086b)) : "OptionalLong.empty";
    }
}
