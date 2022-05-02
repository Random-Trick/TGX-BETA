package qa;

public final class C8303p implements AbstractC8290d {
    public final Class<?> f26785a;
    public final String f26786b;

    public C8303p(Class<?> cls, String str) {
        C8298k.m12934e(cls, "jClass");
        C8298k.m12934e(str, "moduleName");
        this.f26785a = cls;
        this.f26786b = str;
    }

    @Override
    public Class<?> mo12923b() {
        return this.f26785a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C8303p) && C8298k.m12937b(mo12923b(), ((C8303p) obj).mo12923b());
    }

    public int hashCode() {
        return mo12923b().hashCode();
    }

    public String toString() {
        return C8298k.m12929j(mo12923b().toString(), " (Kotlin reflection is not available)");
    }
}
