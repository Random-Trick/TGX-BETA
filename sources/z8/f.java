package z8;

public abstract class f {
    public static f a(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new a(cls.getSimpleName());
        }
        return new d(cls.getSimpleName());
    }

    public abstract void b(String str);

    public abstract void c(String str);

    public abstract void d(String str);
}
