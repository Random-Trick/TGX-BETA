package id;

import android.os.SystemClock;
import nc.C7389v0;

public abstract class AbstractC5333b {
    public final long f17516a;
    public final String f17517b;
    public final String f17518c;
    public final String f17519d;
    public Runnable f17520e;

    public AbstractC5333b(long j, String str, String str2, String str3, boolean z) {
        this.f17516a = j;
        this.f17518c = str3;
        this.f17517b = str;
        this.f17519d = str2;
    }

    public static long m23224g(String str) {
        return C7389v0.m16745D0(str);
    }

    public static String m23223h() {
        return SystemClock.uptimeMillis() + "_" + System.currentTimeMillis() + "_" + Math.random();
    }

    public void m23229b() {
        synchronized (this) {
            Runnable runnable = this.f17520e;
            if (runnable != null) {
                runnable.run();
                this.f17520e = null;
            }
        }
    }

    public String m23228c() {
        return this.f17519d;
    }

    public long m23227d() {
        return this.f17516a;
    }

    public String m23226e() {
        StringBuilder sb2 = new StringBuilder(this.f17517b);
        if (this.f17518c != null) {
            sb2.append('?');
            sb2.append(this.f17518c);
        }
        return sb2.toString();
    }

    public String m23225f() {
        return this.f17517b;
    }

    public void m23222i(Runnable runnable) {
        synchronized (this) {
            this.f17520e = runnable;
        }
    }

    public String toString() {
        return m23226e();
    }
}
