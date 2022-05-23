package f2;

import android.util.Log;

public abstract class j {
    public static j f11817a = null;
    public static final int f11818b = 20;

    public static class a extends j {
        public int f11819c;

        public a(int i10) {
            super(i10);
            this.f11819c = i10;
        }

        @Override
        public void a(String str, String str2, Throwable... thArr) {
            if (this.f11819c > 3) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.d(str, str2);
            } else {
                Log.d(str, str2, thArr[0]);
            }
        }

        @Override
        public void b(String str, String str2, Throwable... thArr) {
            if (this.f11819c > 6) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.e(str, str2);
            } else {
                Log.e(str, str2, thArr[0]);
            }
        }

        @Override
        public void d(String str, String str2, Throwable... thArr) {
            if (this.f11819c > 4) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.i(str, str2);
            } else {
                Log.i(str, str2, thArr[0]);
            }
        }

        @Override
        public void g(String str, String str2, Throwable... thArr) {
            if (this.f11819c > 2) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.v(str, str2);
            } else {
                Log.v(str, str2, thArr[0]);
            }
        }

        @Override
        public void h(String str, String str2, Throwable... thArr) {
            if (this.f11819c > 5) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.w(str, str2);
            } else {
                Log.w(str, str2, thArr[0]);
            }
        }
    }

    public j(int i10) {
    }

    public static synchronized j c() {
        j jVar;
        synchronized (j.class) {
            if (f11817a == null) {
                f11817a = new a(3);
            }
            jVar = f11817a;
        }
        return jVar;
    }

    public static synchronized void e(j jVar) {
        synchronized (j.class) {
            f11817a = jVar;
        }
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        int i10 = f11818b;
        if (length >= i10) {
            sb2.append(str.substring(0, i10));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void g(String str, String str2, Throwable... thArr);

    public abstract void h(String str, String str2, Throwable... thArr);
}
