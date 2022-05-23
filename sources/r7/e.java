package r7;

import java.util.concurrent.TimeUnit;
import o7.o;

public class e {
    public static final long f21788d = TimeUnit.HOURS.toMillis(24);
    public static final long f21789e = TimeUnit.MINUTES.toMillis(30);
    public final o f21790a = o.c();
    public long f21791b;
    public int f21792c;

    public static boolean c(int i10) {
        return i10 == 429 || (i10 >= 500 && i10 < 600);
    }

    public static boolean d(int i10) {
        return (i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404;
    }

    public final synchronized long a(int i10) {
        if (!c(i10)) {
            return f21788d;
        }
        return (long) Math.min(Math.pow(2.0d, this.f21792c) + this.f21790a.e(), f21789e);
    }

    public synchronized boolean b() {
        boolean z10;
        if (this.f21792c != 0) {
            if (this.f21790a.a() <= this.f21791b) {
                z10 = false;
            }
        }
        z10 = true;
        return z10;
    }

    public final synchronized void e() {
        this.f21792c = 0;
    }

    public synchronized void f(int i10) {
        if (d(i10)) {
            e();
            return;
        }
        this.f21792c++;
        this.f21791b = this.f21790a.a() + a(i10);
    }
}
