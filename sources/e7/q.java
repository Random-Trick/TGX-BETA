package e7;

public final class q {
    public final Class<?> f11338a;
    public final int f11339b;
    public final int f11340c;

    public q(Class<?> cls, int i10, int i11) {
        this.f11338a = (Class) c0.c(cls, "Null dependency anInterface.");
        this.f11339b = i10;
        this.f11340c = i11;
    }

    public static String a(int i10) {
        if (i10 == 0) {
            return "direct";
        }
        if (i10 == 1) {
            return "provider";
        }
        if (i10 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i10);
    }

    @Deprecated
    public static q g(Class<?> cls) {
        return new q(cls, 0, 0);
    }

    public static q h(Class<?> cls) {
        return new q(cls, 0, 1);
    }

    public static q i(Class<?> cls) {
        return new q(cls, 1, 0);
    }

    public static q j(Class<?> cls) {
        return new q(cls, 1, 1);
    }

    public static q k(Class<?> cls) {
        return new q(cls, 2, 0);
    }

    public Class<?> b() {
        return this.f11338a;
    }

    public boolean c() {
        return this.f11340c == 2;
    }

    public boolean d() {
        return this.f11340c == 0;
    }

    public boolean e() {
        return this.f11339b == 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f11338a == qVar.f11338a && this.f11339b == qVar.f11339b && this.f11340c == qVar.f11340c;
    }

    public boolean f() {
        return this.f11339b == 2;
    }

    public int hashCode() {
        return ((((this.f11338a.hashCode() ^ 1000003) * 1000003) ^ this.f11339b) * 1000003) ^ this.f11340c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f11338a);
        sb2.append(", type=");
        int i10 = this.f11339b;
        sb2.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        sb2.append(a(this.f11340c));
        sb2.append("}");
        return sb2.toString();
    }
}
