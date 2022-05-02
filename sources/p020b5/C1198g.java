package p020b5;

public class C1198g {
    public final AbstractC1192d f4496a;
    public boolean f4497b;

    public C1198g() {
        this(AbstractC1192d.f4481a);
    }

    public synchronized void m38080a() {
        while (!this.f4497b) {
            wait();
        }
    }

    public synchronized void m38079b() {
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

    public synchronized boolean m38078c() {
        boolean z;
        z = this.f4497b;
        this.f4497b = false;
        return z;
    }

    public synchronized boolean m38077d() {
        return this.f4497b;
    }

    public synchronized boolean m38076e() {
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
