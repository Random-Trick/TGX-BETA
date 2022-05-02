package p352z0;

import android.graphics.Typeface;
import android.os.Handler;
import p352z0.C11210e;
import p352z0.C11216f;

public class C11203a {
    public final C11216f.C11219c f35891a;
    public final Handler f35892b;

    public class RunnableC11204a implements Runnable {
        public final C11216f.C11219c f35893a;
        public final Typeface f35894b;

        public RunnableC11204a(C11216f.C11219c cVar, Typeface typeface) {
            this.f35893a = cVar;
            this.f35894b = typeface;
        }

        @Override
        public void run() {
            this.f35893a.mo1194b(this.f35894b);
        }
    }

    public class RunnableC11205b implements Runnable {
        public final C11216f.C11219c f35896a;
        public final int f35897b;

        public RunnableC11205b(C11216f.C11219c cVar, int i) {
            this.f35896a = cVar;
            this.f35897b = i;
        }

        @Override
        public void run() {
            this.f35896a.mo1195a(this.f35897b);
        }
    }

    public C11203a(C11216f.C11219c cVar, Handler handler) {
        this.f35891a = cVar;
        this.f35892b = handler;
    }

    public final void m1234a(int i) {
        this.f35892b.post(new RunnableC11205b(this.f35891a, i));
    }

    public void m1233b(C11210e.C11215e eVar) {
        if (eVar.m1206a()) {
            m1232c(eVar.f35920a);
        } else {
            m1234a(eVar.f35921b);
        }
    }

    public final void m1232c(Typeface typeface) {
        this.f35892b.post(new RunnableC11204a(this.f35891a, typeface));
    }
}
