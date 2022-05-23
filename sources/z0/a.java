package z0;

import android.graphics.Typeface;
import android.os.Handler;
import z0.e;
import z0.f;

public class a {
    public final f.c f26765a;
    public final Handler f26766b;

    public class RunnableC0255a implements Runnable {
        public final f.c f26767a;
        public final Typeface f26768b;

        public RunnableC0255a(f.c cVar, Typeface typeface) {
            this.f26767a = cVar;
            this.f26768b = typeface;
        }

        @Override
        public void run() {
            this.f26767a.b(this.f26768b);
        }
    }

    public class b implements Runnable {
        public final f.c f26770a;
        public final int f26771b;

        public b(f.c cVar, int i10) {
            this.f26770a = cVar;
            this.f26771b = i10;
        }

        @Override
        public void run() {
            this.f26770a.a(this.f26771b);
        }
    }

    public a(f.c cVar, Handler handler) {
        this.f26765a = cVar;
        this.f26766b = handler;
    }

    public final void a(int i10) {
        this.f26766b.post(new b(this.f26765a, i10));
    }

    public void b(e.C0256e eVar) {
        if (eVar.a()) {
            c(eVar.f26794a);
        } else {
            a(eVar.f26795b);
        }
    }

    public final void c(Typeface typeface) {
        this.f26766b.post(new RunnableC0255a(this.f26765a, typeface));
    }
}
