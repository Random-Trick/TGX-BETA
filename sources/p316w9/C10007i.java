package p316w9;

import android.util.Log;

public class C10007i {
    public static int f32614b;
    public final String f32615a;

    public C10007i(String str) {
        this.f32615a = str;
    }

    public static void m6264f(int i) {
        f32614b = i;
    }

    public void m6269a(String str) {
        m6268b(str, null);
    }

    public void m6268b(String str, Throwable th) {
        m6265e(3, str, th);
    }

    public void m6267c(String str) {
        m6266d(str, null);
    }

    public void m6266d(String str, Throwable th) {
        m6265e(1, str, th);
    }

    public final void m6265e(int i, String str, Throwable th) {
        if (m6263g(i)) {
            if (i == 0) {
                Log.v(this.f32615a, str, th);
            } else if (i == 1) {
                Log.i(this.f32615a, str, th);
            } else if (i == 2) {
                Log.w(this.f32615a, str, th);
            } else if (i == 3) {
                Log.e(this.f32615a, str, th);
            }
        }
    }

    public final boolean m6263g(int i) {
        return f32614b <= i;
    }

    public void m6262h(String str) {
        m6261i(str, null);
    }

    public void m6261i(String str, Throwable th) {
        m6265e(0, str, th);
    }

    public void m6260j(String str) {
        m6259k(str, null);
    }

    public void m6259k(String str, Throwable th) {
        m6265e(2, str, th);
    }
}
