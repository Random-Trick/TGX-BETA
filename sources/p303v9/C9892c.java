package p303v9;

import android.os.Handler;
import p180m9.AbstractC6805b;
import p180m9.C6806c;

public class C9892c {
    public final Handler f32186a;
    public final AbstractC6805b f32187b;

    public class RunnableC9893a implements Runnable {
        public RunnableC9893a() {
        }

        @Override
        public void run() {
            C9892c.this.f32187b.mo18985d();
        }
    }

    public class RunnableC9894b implements Runnable {
        public final int f32189a;

        public RunnableC9894b(int i) {
            this.f32189a = i;
        }

        @Override
        public void run() {
            C9892c.this.f32187b.mo18988a(this.f32189a);
        }
    }

    public class RunnableC9895c implements Runnable {
        public final Throwable f32191a;

        public RunnableC9895c(Throwable th) {
            this.f32191a = th;
        }

        @Override
        public void run() {
            C9892c.this.f32187b.mo18986c(this.f32191a);
        }
    }

    public class RunnableC9896d implements Runnable {
        public final double f32193a;

        public RunnableC9896d(double d) {
            this.f32193a = d;
        }

        @Override
        public void run() {
            C9892c.this.f32187b.mo18987b(this.f32193a);
        }
    }

    public C9892c(C6806c cVar) {
        this.f32186a = cVar.m18966s();
        this.f32187b = cVar.m18967r();
    }

    public void m6681b() {
        this.f32186a.post(new RunnableC9893a());
    }

    public void m6680c(Throwable th) {
        this.f32186a.post(new RunnableC9895c(th));
    }

    public void m6679d(double d) {
        this.f32186a.post(new RunnableC9896d(d));
    }

    public void m6678e(int i) {
        this.f32186a.post(new RunnableC9894b(i));
    }
}
