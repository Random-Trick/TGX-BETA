package jd;

import android.os.SystemClock;
import oc.v0;

public abstract class b {
    public final long f15202a;
    public final String f15203b;
    public final String f15204c;
    public final String f15205d;
    public Runnable f15206e;

    public b(long j10, String str, String str2, String str3, boolean z10) {
        this.f15202a = j10;
        this.f15204c = str3;
        this.f15203b = str;
        this.f15205d = str2;
    }

    public static long g(String str) {
        return v0.D0(str);
    }

    public static String h() {
        return SystemClock.uptimeMillis() + "_" + System.currentTimeMillis() + "_" + Math.random();
    }

    public void b() {
        synchronized (this) {
            Runnable runnable = this.f15206e;
            if (runnable != null) {
                runnable.run();
                this.f15206e = null;
            }
        }
    }

    public String c() {
        return this.f15205d;
    }

    public long d() {
        return this.f15202a;
    }

    public String e() {
        StringBuilder sb2 = new StringBuilder(this.f15203b);
        if (this.f15204c != null) {
            sb2.append('?');
            sb2.append(this.f15204c);
        }
        return sb2.toString();
    }

    public String f() {
        return this.f15203b;
    }

    public void i(Runnable runnable) {
        synchronized (this) {
            this.f15206e = runnable;
        }
    }

    public String toString() {
        return e();
    }
}
