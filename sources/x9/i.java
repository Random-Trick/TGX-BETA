package x9;

import android.util.Log;

public class i {
    public static int f26182b;
    public final String f26183a;

    public i(String str) {
        this.f26183a = str;
    }

    public static void f(int i10) {
        f26182b = i10;
    }

    public void a(String str) {
        b(str, null);
    }

    public void b(String str, Throwable th) {
        e(3, str, th);
    }

    public void c(String str) {
        d(str, null);
    }

    public void d(String str, Throwable th) {
        e(1, str, th);
    }

    public final void e(int i10, String str, Throwable th) {
        if (g(i10)) {
            if (i10 == 0) {
                Log.v(this.f26183a, str, th);
            } else if (i10 == 1) {
                Log.i(this.f26183a, str, th);
            } else if (i10 == 2) {
                Log.w(this.f26183a, str, th);
            } else if (i10 == 3) {
                Log.e(this.f26183a, str, th);
            }
        }
    }

    public final boolean g(int i10) {
        return f26182b <= i10;
    }

    public void h(String str) {
        i(str, null);
    }

    public void i(String str, Throwable th) {
        e(0, str, th);
    }

    public void j(String str) {
        k(str, null);
    }

    public void k(String str, Throwable th) {
        e(2, str, th);
    }
}
