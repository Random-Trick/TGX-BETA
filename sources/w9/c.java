package w9;

import android.os.Handler;

public class c {
    public final Handler f25834a;
    public final n9.b f25835b;

    public class a implements Runnable {
        public a() {
        }

        @Override
        public void run() {
            c.this.f25835b.d();
        }
    }

    public class b implements Runnable {
        public final int f25837a;

        public b(int i10) {
            this.f25837a = i10;
        }

        @Override
        public void run() {
            c.this.f25835b.a(this.f25837a);
        }
    }

    public class RunnableC0238c implements Runnable {
        public final Throwable f25839a;

        public RunnableC0238c(Throwable th) {
            this.f25839a = th;
        }

        @Override
        public void run() {
            c.this.f25835b.c(this.f25839a);
        }
    }

    public class d implements Runnable {
        public final double f25841a;

        public d(double d10) {
            this.f25841a = d10;
        }

        @Override
        public void run() {
            c.this.f25835b.b(this.f25841a);
        }
    }

    public c(n9.c cVar) {
        this.f25834a = cVar.s();
        this.f25835b = cVar.r();
    }

    public void b() {
        this.f25834a.post(new a());
    }

    public void c(Throwable th) {
        this.f25834a.post(new RunnableC0238c(th));
    }

    public void d(double d10) {
        this.f25834a.post(new d(d10));
    }

    public void e(int i10) {
        this.f25834a.post(new b(i10));
    }
}
