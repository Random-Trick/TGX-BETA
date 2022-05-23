package gd;

public class l {
    public static l f12296b;
    public m f12297a = new m("ChallegramThread");

    public static l a() {
        if (f12296b == null) {
            f12296b = new l();
        }
        return f12296b;
    }

    public void b(Runnable runnable) {
        this.f12297a.e(runnable, 0L);
    }

    public void c(Runnable runnable, int i10) {
        this.f12297a.e(runnable, i10);
    }

    public m d() {
        return this.f12297a;
    }
}
