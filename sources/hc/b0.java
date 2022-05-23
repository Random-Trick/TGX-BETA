package hc;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import ra.g;
import ra.k;

public class b0 {
    public boolean f12630a;
    public long f12631b;
    public long f12632c;
    public static final b f12629e = new b(null);
    public static final b0 f12628d = new a();

    public static final class a extends b0 {
        @Override
        public b0 d(long j10) {
            return this;
        }

        @Override
        public void f() {
        }

        @Override
        public b0 g(long j10, TimeUnit timeUnit) {
            k.e(timeUnit, "unit");
            return this;
        }
    }

    public static final class b {
        public b() {
        }

        public b(g gVar) {
            this();
        }
    }

    public b0 a() {
        this.f12630a = false;
        return this;
    }

    public b0 b() {
        this.f12632c = 0L;
        return this;
    }

    public long c() {
        if (this.f12630a) {
            return this.f12631b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public b0 d(long j10) {
        this.f12630a = true;
        this.f12631b = j10;
        return this;
    }

    public boolean e() {
        return this.f12630a;
    }

    public void f() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.f12630a && this.f12631b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public b0 g(long j10, TimeUnit timeUnit) {
        k.e(timeUnit, "unit");
        if (j10 >= 0) {
            this.f12632c = timeUnit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j10).toString());
    }

    public long h() {
        return this.f12632c;
    }
}
