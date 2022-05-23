package mc;

import java.util.Hashtable;
import java.util.StringTokenizer;
import jc.a;
import jc.c;
import mc.c;

public final class b {
    public static Hashtable f17354e;
    public static Object[] f17355f = new Object[0];
    public static Class f17356g;
    public Class f17357a;
    public ClassLoader f17358b;
    public String f17359c;
    public int f17360d = 0;

    static {
        Hashtable hashtable = new Hashtable();
        f17354e = hashtable;
        hashtable.put("void", Void.TYPE);
        f17354e.put("boolean", Boolean.TYPE);
        f17354e.put("byte", Byte.TYPE);
        f17354e.put("char", Character.TYPE);
        f17354e.put("short", Short.TYPE);
        f17354e.put("int", Integer.TYPE);
        f17354e.put("long", Long.TYPE);
        f17354e.put("float", Float.TYPE);
        f17354e.put("double", Double.TYPE);
    }

    public b(String str, Class cls) {
        this.f17359c = str;
        this.f17357a = cls;
        this.f17358b = cls.getClassLoader();
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e10) {
            throw new NoClassDefFoundError(e10.getMessage());
        }
    }

    public static Class b(String str, ClassLoader classLoader) {
        if (str.equals("*")) {
            return null;
        }
        Class cls = (Class) f17354e.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            if (classLoader == null) {
                return Class.forName(str);
            }
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            Class cls2 = f17356g;
            if (cls2 != null) {
                return cls2;
            }
            Class a10 = a("java.lang.ClassNotFoundException");
            f17356g = a10;
            return a10;
        }
    }

    public static a c(a.AbstractC0131a aVar, Object obj, Object obj2) {
        return new c(aVar, obj, obj2, f17355f);
    }

    public static a d(a.AbstractC0131a aVar, Object obj, Object obj2, Object obj3) {
        return new c(aVar, obj, obj2, new Object[]{obj3});
    }

    public static a e(a.AbstractC0131a aVar, Object obj, Object obj2, Object obj3, Object obj4) {
        return new c(aVar, obj, obj2, new Object[]{obj3, obj4});
    }

    public static a f(a.AbstractC0131a aVar, Object obj, Object obj2, Object[] objArr) {
        return new c(aVar, obj, obj2, objArr);
    }

    public kc.a g(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int parseInt = Integer.parseInt(str, 16);
        Class b10 = b(str3, this.f17358b);
        StringTokenizer stringTokenizer = new StringTokenizer(str4, ":");
        int countTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[countTokens];
        for (int i10 = 0; i10 < countTokens; i10++) {
            clsArr[i10] = b(stringTokenizer.nextToken(), this.f17358b);
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(str5, ":");
        int countTokens2 = stringTokenizer2.countTokens();
        String[] strArr = new String[countTokens2];
        for (int i11 = 0; i11 < countTokens2; i11++) {
            strArr[i11] = stringTokenizer2.nextToken();
        }
        StringTokenizer stringTokenizer3 = new StringTokenizer(str6, ":");
        int countTokens3 = stringTokenizer3.countTokens();
        Class[] clsArr2 = new Class[countTokens3];
        for (int i12 = 0; i12 < countTokens3; i12++) {
            clsArr2[i12] = b(stringTokenizer3.nextToken(), this.f17358b);
        }
        return new e(parseInt, str2, b10, clsArr, strArr, clsArr2, b(str7, this.f17358b));
    }

    public a.AbstractC0131a h(String str, c cVar, int i10) {
        int i11 = this.f17360d;
        this.f17360d = i11 + 1;
        return new c.a(i11, str, cVar, i(i10, -1));
    }

    public kc.b i(int i10, int i11) {
        return new g(this.f17357a, this.f17359c, i10);
    }
}
