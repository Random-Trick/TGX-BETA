package y0;

import android.os.CancellationSignal;

public final class b {
    public boolean f26450a;
    public a f26451b;
    public Object f26452c;
    public boolean f26453d;

    public interface a {
        void a();
    }

    public void a() {
        synchronized (this) {
            if (!this.f26450a) {
                this.f26450a = true;
                this.f26453d = true;
                a aVar = this.f26451b;
                Object obj = this.f26452c;
                if (aVar != null) {
                    try {
                        aVar.a();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f26453d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f26453d = false;
                    notifyAll();
                }
            }
        }
    }

    public boolean b() {
        boolean z10;
        synchronized (this) {
            z10 = this.f26450a;
        }
        return z10;
    }

    public void c(a aVar) {
        synchronized (this) {
            d();
            if (this.f26451b != aVar) {
                this.f26451b = aVar;
                if (this.f26450a && aVar != null) {
                    aVar.a();
                }
            }
        }
    }

    public final void d() {
        while (this.f26453d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
