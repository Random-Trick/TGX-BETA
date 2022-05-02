package p082fd;

public class C4383l {
    public static C4383l f14530b;
    public C4384m f14531a = new C4384m("ChallegramThread");

    public static C4383l m28059a() {
        if (f14530b == null) {
            f14530b = new C4383l();
        }
        return f14530b;
    }

    public void m28058b(Runnable runnable) {
        this.f14531a.m28052e(runnable, 0L);
    }

    public void m28057c(Runnable runnable, int i) {
        this.f14531a.m28052e(runnable, i);
    }

    public C4384m m28056d() {
        return this.f14531a;
    }
}
