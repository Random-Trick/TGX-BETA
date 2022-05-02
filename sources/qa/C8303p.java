package qa;

public final class C8303p implements AbstractC8290d {
    public final Class<?> f26788a;
    public final String f26789b;

    public C8303p(Class<?> cls, String str) {
        C8298k.m12933e(cls, "jClass");
        C8298k.m12933e(str, "moduleName");
        this.f26788a = cls;
        this.f26789b = str;
    }

    @Override
    public Class<?> mo12922b() {
        return this.f26788a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C8303p) && C8298k.m12936b(mo12922b(), ((C8303p) obj).mo12922b());
    }

    public int hashCode() {
        return mo12922b().hashCode();
    }

    public String toString() {
        return C8298k.m12928j(mo12922b().toString(), " (Kotlin reflection is not available)");
    }
}
