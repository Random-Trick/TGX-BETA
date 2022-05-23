package ra;

public final class p implements d {
    public final Class<?> f21815a;
    public final String f21816b;

    public p(Class<?> cls, String str) {
        k.e(cls, "jClass");
        k.e(str, "moduleName");
        this.f21815a = cls;
        this.f21816b = str;
    }

    @Override
    public Class<?> b() {
        return this.f21815a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof p) && k.b(b(), ((p) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b().toString() + " (Kotlin reflection is not available)";
    }
}
