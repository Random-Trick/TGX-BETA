package p020b5;

public class C1198g {
    public final AbstractC1192d f4496a;
    public boolean f4497b;

    public C1198g() {
        this(AbstractC1192d.f4481a);
    }

    public synchronized void m38083a() {
        while (!this.f4497b) {
            wait();
        }
    }

    public synchronized void m38082b() {
        boolean z = false;
        while (!this.f4497b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean m38081c() {
        boolean z;
        z = this.f4497b;
        this.f4497b = false;
        return z;
    }

    public synchronized boolean m38080d() {
        return this.f4497b;
    }

    public synchronized boolean m38079e() {
        if (this.f4497b) {
            return false;
        }
        this.f4497b = true;
        notifyAll();
        return true;
    }

    public C1198g(AbstractC1192d dVar) {
        this.f4496a = dVar;
    }
}
