package mc;

import java.lang.ref.SoftReference;
import java.util.StringTokenizer;
import jc.c;

public abstract class f implements c {
    public static boolean f17370h = true;
    public static String[] f17371i = new String[0];
    public static Class[] f17372j = new Class[0];
    public int f17373a;
    public String f17374b;
    public String f17375c;
    public Class f17376d;
    public a f17377e;
    public String f17378f;
    public ClassLoader f17379g = null;

    public interface a {
        void a(int i10, String str);

        String get(int i10);
    }

    public static final class b implements a {
        public SoftReference f17380a;

        public b() {
            c();
        }

        @Override
        public void a(int i10, String str) {
            String[] b10 = b();
            if (b10 == null) {
                b10 = c();
            }
            b10[i10] = str;
        }

        public final String[] b() {
            return (String[]) this.f17380a.get();
        }

        public final String[] c() {
            String[] strArr = new String[3];
            this.f17380a = new SoftReference(strArr);
            return strArr;
        }

        @Override
        public String get(int i10) {
            String[] b10 = b();
            if (b10 == null) {
                return null;
            }
            return b10[i10];
        }
    }

    public f(int i10, String str, Class cls) {
        this.f17373a = i10;
        this.f17374b = str;
        this.f17376d = cls;
    }

    public abstract String a(h hVar);

    public int b(int i10) {
        return Integer.parseInt(c(i10), 16);
    }

    public String c(int i10) {
        int indexOf = this.f17378f.indexOf(45);
        int i11 = 0;
        while (true) {
            i10--;
            if (i10 <= 0) {
                break;
            }
            i11 = indexOf + 1;
            indexOf = this.f17378f.indexOf(45, i11);
        }
        if (indexOf == -1) {
            indexOf = this.f17378f.length();
        }
        return this.f17378f.substring(i11, indexOf);
    }

    public Class d(int i10) {
        return mc.b.b(c(i10), h());
    }

    public Class[] e(int i10) {
        StringTokenizer stringTokenizer = new StringTokenizer(c(i10), ":");
        int countTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[countTokens];
        for (int i11 = 0; i11 < countTokens; i11++) {
            clsArr[i11] = mc.b.b(stringTokenizer.nextToken(), h());
        }
        return clsArr;
    }

    public Class f() {
        if (this.f17376d == null) {
            this.f17376d = d(2);
        }
        return this.f17376d;
    }

    public String g() {
        if (this.f17375c == null) {
            this.f17375c = f().getName();
        }
        return this.f17375c;
    }

    public final ClassLoader h() {
        if (this.f17379g == null) {
            this.f17379g = getClass().getClassLoader();
        }
        return this.f17379g;
    }

    public int i() {
        if (this.f17373a == -1) {
            this.f17373a = b(0);
        }
        return this.f17373a;
    }

    public String j() {
        if (this.f17374b == null) {
            this.f17374b = c(1);
        }
        return this.f17374b;
    }

    public java.lang.String k(mc.h r3) {
        throw new UnsupportedOperationException("Method not decompiled: mc.f.k(mc.h):java.lang.String");
    }

    public final String toString() {
        return k(h.f17385k);
    }
}
