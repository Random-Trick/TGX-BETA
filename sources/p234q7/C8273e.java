package p234q7;

import java.util.concurrent.TimeUnit;
import p190n7.C7299o;

public class C8273e {
    public static final long f26745d = TimeUnit.HOURS.toMillis(24);
    public static final long f26746e = TimeUnit.MINUTES.toMillis(30);
    public final C7299o f26747a = C7299o.m17117c();
    public long f26748b;
    public int f26749c;

    public static boolean m12981c(int i) {
        return i == 429 || (i >= 500 && i < 600);
    }

    public static boolean m12980d(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    public final synchronized long m12983a(int i) {
        if (!m12981c(i)) {
            return f26745d;
        }
        return (long) Math.min(Math.pow(2.0d, this.f26749c) + this.f26747a.m17115e(), f26746e);
    }

    public synchronized boolean m12982b() {
        boolean z;
        if (this.f26749c != 0) {
            if (this.f26747a.m17119a() <= this.f26748b) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    public final synchronized void m12979e() {
        this.f26749c = 0;
    }

    public synchronized void m12978f(int i) {
        if (m12980d(i)) {
            m12979e();
            return;
        }
        this.f26749c++;
        this.f26748b = this.f26747a.m17119a() + m12983a(i);
    }
}
