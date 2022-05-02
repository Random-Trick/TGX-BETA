package p071f2;

import android.util.Log;

public abstract class AbstractC4234j {
    public static AbstractC4234j f14275a = null;
    public static final int f14276b = 20;

    public static class C4235a extends AbstractC4234j {
        public int f14277c;

        public C4235a(int i) {
            super(i);
            this.f14277c = i;
        }

        @Override
        public void mo28359a(String str, String str2, Throwable... thArr) {
            if (this.f14277c > 3) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.d(str, str2);
            } else {
                Log.d(str, str2, thArr[0]);
            }
        }

        @Override
        public void mo28358b(String str, String str2, Throwable... thArr) {
            if (this.f14277c > 6) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.e(str, str2);
            } else {
                Log.e(str, str2, thArr[0]);
            }
        }

        @Override
        public void mo28357d(String str, String str2, Throwable... thArr) {
            if (this.f14277c > 4) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.i(str, str2);
            } else {
                Log.i(str, str2, thArr[0]);
            }
        }

        @Override
        public void mo28356g(String str, String str2, Throwable... thArr) {
            if (this.f14277c > 2) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.v(str, str2);
            } else {
                Log.v(str, str2, thArr[0]);
            }
        }

        @Override
        public void mo28355h(String str, String str2, Throwable... thArr) {
            if (this.f14277c > 5) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.w(str, str2);
            } else {
                Log.w(str, str2, thArr[0]);
            }
        }
    }

    public AbstractC4234j(int i) {
    }

    public static synchronized AbstractC4234j m28362c() {
        AbstractC4234j jVar;
        synchronized (AbstractC4234j.class) {
            if (f14275a == null) {
                f14275a = new C4235a(3);
            }
            jVar = f14275a;
        }
        return jVar;
    }

    public static synchronized void m28361e(AbstractC4234j jVar) {
        synchronized (AbstractC4234j.class) {
            f14275a = jVar;
        }
    }

    public static String m28360f(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        int i = f14276b;
        if (length >= i) {
            sb2.append(str.substring(0, i));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public abstract void mo28359a(String str, String str2, Throwable... thArr);

    public abstract void mo28358b(String str, String str2, Throwable... thArr);

    public abstract void mo28357d(String str, String str2, Throwable... thArr);

    public abstract void mo28356g(String str, String str2, Throwable... thArr);

    public abstract void mo28355h(String str, String str2, Throwable... thArr);
}
