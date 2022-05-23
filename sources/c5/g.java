package c5;

public class g {
    public final d f4817a;
    public boolean f4818b;

    public g() {
        this(d.f4804a);
    }

    public synchronized void a() {
        while (!this.f4818b) {
            wait();
        }
    }

    public synchronized void b() {
        boolean z10 = false;
        while (!this.f4818b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean c() {
        boolean z10;
        z10 = this.f4818b;
        this.f4818b = false;
        return z10;
    }

    public synchronized boolean d() {
        return this.f4818b;
    }

    public synchronized boolean e() {
        if (this.f4818b) {
            return false;
        }
        this.f4818b = true;
        notifyAll();
        return true;
    }

    public g(d dVar) {
        this.f4817a = dVar;
    }
}
