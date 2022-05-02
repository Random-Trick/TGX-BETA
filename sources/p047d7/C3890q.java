package p047d7;

public final class C3890q {
    public final Class<?> f13165a;
    public final int f13166b;
    public final int f13167c;

    public C3890q(Class<?> cls, int i, int i2) {
        this.f13165a = (Class) C3864c0.m29711c(cls, "Null dependency anInterface.");
        this.f13166b = i;
        this.f13167c = i2;
    }

    public static String m29641a(int i) {
        if (i == 0) {
            return "direct";
        }
        if (i == 1) {
            return "provider";
        }
        if (i == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i);
    }

    @Deprecated
    public static C3890q m29635g(Class<?> cls) {
        return new C3890q(cls, 0, 0);
    }

    public static C3890q m29634h(Class<?> cls) {
        return new C3890q(cls, 0, 1);
    }

    public static C3890q m29633i(Class<?> cls) {
        return new C3890q(cls, 1, 0);
    }

    public static C3890q m29632j(Class<?> cls) {
        return new C3890q(cls, 1, 1);
    }

    public static C3890q m29631k(Class<?> cls) {
        return new C3890q(cls, 2, 0);
    }

    public Class<?> m29640b() {
        return this.f13165a;
    }

    public boolean m29639c() {
        return this.f13167c == 2;
    }

    public boolean m29638d() {
        return this.f13167c == 0;
    }

    public boolean m29637e() {
        return this.f13166b == 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3890q)) {
            return false;
        }
        C3890q qVar = (C3890q) obj;
        return this.f13165a == qVar.f13165a && this.f13166b == qVar.f13166b && this.f13167c == qVar.f13167c;
    }

    public boolean m29636f() {
        return this.f13166b == 2;
    }

    public int hashCode() {
        return ((((this.f13165a.hashCode() ^ 1000003) * 1000003) ^ this.f13166b) * 1000003) ^ this.f13167c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f13165a);
        sb2.append(", type=");
        int i = this.f13166b;
        sb2.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb2.append(", injection=");
        sb2.append(m29641a(this.f13167c));
        sb2.append("}");
        return sb2.toString();
    }
}
