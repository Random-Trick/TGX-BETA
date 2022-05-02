package p157l;

import java.util.concurrent.Executor;

public class C6269a extends AbstractC6274c {
    public static volatile C6269a f19787c;
    public static final Executor f19788d = new ExecutorC6270a();
    public static final Executor f19789e = new ExecutorC6271b();
    public AbstractC6274c f19790a;
    public AbstractC6274c f19791b;

    public static class ExecutorC6270a implements Executor {
        @Override
        public void execute(Runnable runnable) {
            C6269a.m20748f().mo20743d(runnable);
        }
    }

    public static class ExecutorC6271b implements Executor {
        @Override
        public void execute(Runnable runnable) {
            C6269a.m20748f().mo20746a(runnable);
        }
    }

    public C6269a() {
        C6272b bVar = new C6272b();
        this.f19791b = bVar;
        this.f19790a = bVar;
    }

    public static Executor m20749e() {
        return f19789e;
    }

    public static C6269a m20748f() {
        if (f19787c != null) {
            return f19787c;
        }
        synchronized (C6269a.class) {
            if (f19787c == null) {
                f19787c = new C6269a();
            }
        }
        return f19787c;
    }

    @Override
    public void mo20746a(Runnable runnable) {
        this.f19790a.mo20746a(runnable);
    }

    @Override
    public boolean mo20744c() {
        return this.f19790a.mo20744c();
    }

    @Override
    public void mo20743d(Runnable runnable) {
        this.f19790a.mo20743d(runnable);
    }
}
