package p126j$.util.stream;

class RunnableC5620M3 implements Runnable {
    final Runnable f18195a;
    final Runnable f18196b;

    public RunnableC5620M3(Runnable runnable, Runnable runnable2) {
        this.f18195a = runnable;
        this.f18196b = runnable2;
    }

    @Override
    public void run() {
        try {
            this.f18195a.run();
            this.f18196b.run();
        } catch (Throwable th) {
            try {
                this.f18196b.run();
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
