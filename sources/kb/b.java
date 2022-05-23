package kb;

import android.os.Handler;
import ia.q;
import ra.k;
import y0.b;

public abstract class b implements Runnable {
    public Handler f15749b;
    public final y0.b f15748a = new y0.b();
    public final Object f15750c = new Object();

    public static final void f(b bVar) {
        k.e(bVar, "this$0");
        synchronized (bVar.f15750c) {
            Handler handler = bVar.f15749b;
            if (handler != null) {
                handler.removeCallbacks(bVar);
            }
            q qVar = q.f14159a;
        }
    }

    public abstract void b();

    public final void c() {
        this.f15748a.a();
    }

    public final boolean d() {
        return !this.f15748a.b();
    }

    public final b e(Handler handler) {
        synchronized (this.f15750c) {
            this.f15749b = handler;
            q qVar = q.f14159a;
        }
        if (handler != null) {
            this.f15748a.c(new b.a() {
                @Override
                public final void a() {
                    b.f(b.this);
                }
            });
        } else {
            this.f15748a.c(null);
        }
        return this;
    }

    @Override
    public final void run() {
        if (!this.f15748a.b()) {
            b();
        }
    }
}
