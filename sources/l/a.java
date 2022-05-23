package l;

import java.util.concurrent.Executor;

public class a extends c {
    public static volatile a f15955c;
    public static final Executor f15956d = new ExecutorC0144a();
    public static final Executor f15957e = new b();
    public c f15958a;
    public c f15959b;

    public static class ExecutorC0144a implements Executor {
        @Override
        public void execute(Runnable runnable) {
            a.f().d(runnable);
        }
    }

    public static class b implements Executor {
        @Override
        public void execute(Runnable runnable) {
            a.f().a(runnable);
        }
    }

    public a() {
        l.b bVar = new l.b();
        this.f15959b = bVar;
        this.f15958a = bVar;
    }

    public static Executor e() {
        return f15957e;
    }

    public static a f() {
        if (f15955c != null) {
            return f15955c;
        }
        synchronized (a.class) {
            if (f15955c == null) {
                f15955c = new a();
            }
        }
        return f15955c;
    }

    @Override
    public void a(Runnable runnable) {
        this.f15958a.a(runnable);
    }

    @Override
    public boolean c() {
        return this.f15958a.c();
    }

    @Override
    public void d(Runnable runnable) {
        this.f15958a.d(runnable);
    }
}
