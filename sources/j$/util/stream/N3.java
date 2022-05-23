package j$.util.stream;

final class N3 implements Runnable {
    final Runnable f14590a;
    final Runnable f14591b;

    public N3(Runnable runnable, Runnable runnable2) {
        this.f14590a = runnable;
        this.f14591b = runnable2;
    }

    @Override
    public final void run() {
        try {
            this.f14590a.run();
            this.f14591b.run();
        } catch (Throwable th) {
            try {
                this.f14591b.run();
            } catch (Throwable th2) {
                try {
                    th.addSuppressed(th2);
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
