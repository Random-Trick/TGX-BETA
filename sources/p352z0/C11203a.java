package p352z0;

import android.graphics.Typeface;
import android.os.Handler;
import p352z0.C11210e;
import p352z0.C11216f;

public class C11203a {
    public final C11216f.C11219c f35894a;
    public final Handler f35895b;

    public class RunnableC11204a implements Runnable {
        public final C11216f.C11219c f35896a;
        public final Typeface f35897b;

        public RunnableC11204a(C11216f.C11219c cVar, Typeface typeface) {
            this.f35896a = cVar;
            this.f35897b = typeface;
        }

        @Override
        public void run() {
            this.f35896a.mo1194b(this.f35897b);
        }
    }

    public class RunnableC11205b implements Runnable {
        public final C11216f.C11219c f35899a;
        public final int f35900b;

        public RunnableC11205b(C11216f.C11219c cVar, int i) {
            this.f35899a = cVar;
            this.f35900b = i;
        }

        @Override
        public void run() {
            this.f35899a.mo1195a(this.f35900b);
        }
    }

    public C11203a(C11216f.C11219c cVar, Handler handler) {
        this.f35894a = cVar;
        this.f35895b = handler;
    }

    public final void m1234a(int i) {
        this.f35895b.post(new RunnableC11205b(this.f35894a, i));
    }

    public void m1233b(C11210e.C11215e eVar) {
        if (eVar.m1206a()) {
            m1232c(eVar.f35923a);
        } else {
            m1234a(eVar.f35924b);
        }
    }

    public final void m1232c(Typeface typeface) {
        this.f35895b.post(new RunnableC11204a(this.f35894a, typeface));
    }
}
