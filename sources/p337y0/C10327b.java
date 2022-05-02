package p337y0;

import android.os.Build;
import android.os.CancellationSignal;

public final class C10327b {
    public boolean f33190a;
    public AbstractC10328a f33191b;
    public Object f33192c;
    public boolean f33193d;

    public interface AbstractC10328a {
        void mo5413a();
    }

    public void m5417a() {
        synchronized (this) {
            if (!this.f33190a) {
                this.f33190a = true;
                this.f33193d = true;
                AbstractC10328a aVar = this.f33191b;
                Object obj = this.f33192c;
                if (aVar != null) {
                    try {
                        aVar.mo5413a();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f33193d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null && Build.VERSION.SDK_INT >= 16) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f33193d = false;
                    notifyAll();
                }
            }
        }
    }

    public boolean m5416b() {
        boolean z;
        synchronized (this) {
            z = this.f33190a;
        }
        return z;
    }

    public void m5415c(AbstractC10328a aVar) {
        synchronized (this) {
            m5414d();
            if (this.f33191b != aVar) {
                this.f33191b = aVar;
                if (this.f33190a && aVar != null) {
                    aVar.mo5413a();
                }
            }
        }
    }

    public final void m5414d() {
        while (this.f33193d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
