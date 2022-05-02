package p095gc;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import qa.C8294g;
import qa.C8298k;

public class C4539b0 {
    public boolean f14956a;
    public long f14957b;
    public long f14958c;
    public static final C4541b f14955e = new C4541b(null);
    public static final C4539b0 f14954d = new C4540a();

    public static final class C4540a extends C4539b0 {
        @Override
        public C4539b0 mo27394d(long j) {
            return this;
        }

        @Override
        public void mo27392f() {
        }

        @Override
        public C4539b0 mo27391g(long j, TimeUnit timeUnit) {
            C8298k.m12933e(timeUnit, "unit");
            return this;
        }
    }

    public static final class C4541b {
        public C4541b() {
        }

        public C4541b(C8294g gVar) {
            this();
        }
    }

    public C4539b0 mo27397a() {
        this.f14956a = false;
        return this;
    }

    public C4539b0 mo27396b() {
        this.f14958c = 0L;
        return this;
    }

    public long mo27395c() {
        if (this.f14956a) {
            return this.f14957b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public C4539b0 mo27394d(long j) {
        this.f14956a = true;
        this.f14957b = j;
        return this;
    }

    public boolean mo27393e() {
        return this.f14956a;
    }

    public void mo27392f() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.f14956a && this.f14957b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public C4539b0 mo27391g(long j, TimeUnit timeUnit) {
        C8298k.m12933e(timeUnit, "unit");
        if (j >= 0) {
            this.f14958c = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j).toString());
    }

    public long m27479h() {
        return this.f14958c;
    }
}
