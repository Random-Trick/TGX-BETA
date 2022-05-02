package p303v9;

import android.os.Handler;
import p180m9.AbstractC6805b;
import p180m9.C6806c;

public class C9892c {
    public final Handler f32189a;
    public final AbstractC6805b f32190b;

    public class RunnableC9893a implements Runnable {
        public RunnableC9893a() {
        }

        @Override
        public void run() {
            C9892c.this.f32190b.mo18986d();
        }
    }

    public class RunnableC9894b implements Runnable {
        public final int f32192a;

        public RunnableC9894b(int i) {
            this.f32192a = i;
        }

        @Override
        public void run() {
            C9892c.this.f32190b.mo18989a(this.f32192a);
        }
    }

    public class RunnableC9895c implements Runnable {
        public final Throwable f32194a;

        public RunnableC9895c(Throwable th) {
            this.f32194a = th;
        }

        @Override
        public void run() {
            C9892c.this.f32190b.mo18987c(this.f32194a);
        }
    }

    public class RunnableC9896d implements Runnable {
        public final double f32196a;

        public RunnableC9896d(double d) {
            this.f32196a = d;
        }

        @Override
        public void run() {
            C9892c.this.f32190b.mo18988b(this.f32196a);
        }
    }

    public C9892c(C6806c cVar) {
        this.f32189a = cVar.m18967s();
        this.f32190b = cVar.m18968r();
    }

    public void m6681b() {
        this.f32189a.post(new RunnableC9893a());
    }

    public void m6680c(Throwable th) {
        this.f32189a.post(new RunnableC9895c(th));
    }

    public void m6679d(double d) {
        this.f32189a.post(new RunnableC9896d(d));
    }

    public void m6678e(int i) {
        this.f32189a.post(new RunnableC9894b(i));
    }
}
