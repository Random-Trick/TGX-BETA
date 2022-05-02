package p234q7;

import java.util.concurrent.TimeUnit;
import p190n7.C7299o;

public class C8273e {
    public static final long f26748d = TimeUnit.HOURS.toMillis(24);
    public static final long f26749e = TimeUnit.MINUTES.toMillis(30);
    public final C7299o f26750a = C7299o.m17117c();
    public long f26751b;
    public int f26752c;

    public static boolean m12980c(int i) {
        return i == 429 || (i >= 500 && i < 600);
    }

    public static boolean m12979d(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    public final synchronized long m12982a(int i) {
        if (!m12980c(i)) {
            return f26748d;
        }
        return (long) Math.min(Math.pow(2.0d, this.f26752c) + this.f26750a.m17115e(), f26749e);
    }

    public synchronized boolean m12981b() {
        boolean z;
        if (this.f26752c != 0) {
            if (this.f26750a.m17119a() <= this.f26751b) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    public final synchronized void m12978e() {
        this.f26752c = 0;
    }

    public synchronized void m12977f(int i) {
        if (m12979d(i)) {
            m12978e();
            return;
        }
        this.f26752c++;
        this.f26751b = this.f26750a.m17119a() + m12982a(i);
    }
}
