package p139jb;

import android.os.Handler;
import p107ha.C5060q;
import p337y0.C10327b;
import qa.C8298k;

public abstract class AbstractRunnableC5910b implements Runnable {
    public Handler f18813b;
    public final C10327b f18812a = new C10327b();
    public final Object f18814c = new Object();

    public static final void m21854f(AbstractRunnableC5910b bVar) {
        C8298k.m12934e(bVar, "this$0");
        synchronized (bVar.f18814c) {
            Handler handler = bVar.f18813b;
            if (handler != null) {
                handler.removeCallbacks(bVar);
            }
            C5060q qVar = C5060q.f17066a;
        }
    }

    public abstract void mo1364b();

    public final void m21857c() {
        this.f18812a.m5417a();
    }

    public final boolean m21856d() {
        return !this.f18812a.m5416b();
    }

    public final AbstractRunnableC5910b m21855e(Handler handler) {
        synchronized (this.f18814c) {
            this.f18813b = handler;
            C5060q qVar = C5060q.f17066a;
        }
        if (handler != null) {
            this.f18812a.m5415c(new C10327b.AbstractC10328a() {
                @Override
                public final void mo5413a() {
                    AbstractRunnableC5910b.m21854f(AbstractRunnableC5910b.this);
                }
            });
        } else {
            this.f18812a.m5415c(null);
        }
        return this;
    }

    @Override
    public final void run() {
        if (!this.f18812a.m5416b()) {
            mo1364b();
        }
    }
}
