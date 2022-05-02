package lc;

import java.lang.ref.SoftReference;
import java.util.StringTokenizer;
import p125ic.AbstractC5330c;

public abstract class AbstractC6487f implements AbstractC5330c {
    public static boolean f20181h = true;
    public static String[] f20182i = new String[0];
    public static Class[] f20183j = new Class[0];
    public int f20184a;
    public String f20185b;
    public String f20186c;
    public Class f20187d;
    public AbstractC6488a f20188e;
    public String f20189f;
    public ClassLoader f20190g = null;

    public interface AbstractC6488a {
        void mo20367a(int i, String str);

        String get(int i);
    }

    public static final class C6489b implements AbstractC6488a {
        public SoftReference f20191a;

        public C6489b() {
            m20365c();
        }

        @Override
        public void mo20367a(int i, String str) {
            String[] b = m20366b();
            if (b == null) {
                b = m20365c();
            }
            b[i] = str;
        }

        public final String[] m20366b() {
            return (String[]) this.f20191a.get();
        }

        public final String[] m20365c() {
            String[] strArr = new String[3];
            this.f20191a = new SoftReference(strArr);
            return strArr;
        }

        @Override
        public String get(int i) {
            String[] b = m20366b();
            if (b == null) {
                return null;
            }
            return b[i];
        }
    }

    public AbstractC6487f(int i, String str, Class cls) {
        this.f20184a = -1;
        this.f20184a = i;
        this.f20185b = str;
        this.f20187d = cls;
    }

    public abstract String mo20378a(C6491h hVar);

    public int m20377b(int i) {
        return Integer.parseInt(m20376c(i), 16);
    }

    public String m20376c(int i) {
        int indexOf = this.f20189f.indexOf(45);
        int i2 = 0;
        while (true) {
            i--;
            if (i <= 0) {
                break;
            }
            i2 = indexOf + 1;
            indexOf = this.f20189f.indexOf(45, i2);
        }
        if (indexOf == -1) {
            indexOf = this.f20189f.length();
        }
        return this.f20189f.substring(i2, indexOf);
    }

    public Class m20375d(int i) {
        return C6482b.m20391b(m20376c(i), m20371h());
    }

    public Class[] m20374e(int i) {
        StringTokenizer stringTokenizer = new StringTokenizer(m20376c(i), ":");
        int countTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[countTokens];
        for (int i2 = 0; i2 < countTokens; i2++) {
            clsArr[i2] = C6482b.m20391b(stringTokenizer.nextToken(), m20371h());
        }
        return clsArr;
    }

    public Class m20373f() {
        if (this.f20187d == null) {
            this.f20187d = m20375d(2);
        }
        return this.f20187d;
    }

    public String m20372g() {
        if (this.f20186c == null) {
            this.f20186c = m20373f().getName();
        }
        return this.f20186c;
    }

    public final ClassLoader m20371h() {
        if (this.f20190g == null) {
            this.f20190g = getClass().getClassLoader();
        }
        return this.f20190g;
    }

    public int m20370i() {
        if (this.f20184a == -1) {
            this.f20184a = m20377b(0);
        }
        return this.f20184a;
    }

    public String m20369j() {
        if (this.f20185b == null) {
            this.f20185b = m20376c(1);
        }
        return this.f20185b;
    }

    public java.lang.String m20368k(lc.C6491h r3) {
        throw new UnsupportedOperationException("Method not decompiled: lc.AbstractC6487f.m20368k(lc.h):java.lang.String");
    }

    public final String toString() {
        return m20368k(C6491h.f20196k);
    }
}
