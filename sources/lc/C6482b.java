package lc;

import java.util.Hashtable;
import java.util.StringTokenizer;
import lc.C6483c;
import p125ic.AbstractC5327a;
import p125ic.AbstractC5330c;
import p140jc.AbstractC5921a;
import p140jc.AbstractC5922b;

public final class C6482b {
    public static Hashtable f20165e;
    public static Object[] f20166f = new Object[0];
    public static Class f20167g;
    public Class f20168a;
    public ClassLoader f20169b;
    public String f20170c;
    public int f20171d = 0;

    static {
        Hashtable hashtable = new Hashtable();
        f20165e = hashtable;
        hashtable.put("void", Void.TYPE);
        f20165e.put("boolean", Boolean.TYPE);
        f20165e.put("byte", Byte.TYPE);
        f20165e.put("char", Character.TYPE);
        f20165e.put("short", Short.TYPE);
        f20165e.put("int", Integer.TYPE);
        f20165e.put("long", Long.TYPE);
        f20165e.put("float", Float.TYPE);
        f20165e.put("double", Double.TYPE);
    }

    public C6482b(String str, Class cls) {
        this.f20170c = str;
        this.f20168a = cls;
        this.f20169b = cls.getClassLoader();
    }

    public static Class m20392a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static Class m20391b(String str, ClassLoader classLoader) {
        if (str.equals("*")) {
            return null;
        }
        Class cls = (Class) f20165e.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            if (classLoader == null) {
                return Class.forName(str);
            }
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            Class cls2 = f20167g;
            if (cls2 != null) {
                return cls2;
            }
            Class a = m20392a("java.lang.ClassNotFoundException");
            f20167g = a;
            return a;
        }
    }

    public static AbstractC5327a m20390c(AbstractC5327a.AbstractC5328a aVar, Object obj, Object obj2) {
        return new C6483c(aVar, obj, obj2, f20166f);
    }

    public static AbstractC5327a m20389d(AbstractC5327a.AbstractC5328a aVar, Object obj, Object obj2, Object obj3) {
        return new C6483c(aVar, obj, obj2, new Object[]{obj3});
    }

    public static AbstractC5327a m20388e(AbstractC5327a.AbstractC5328a aVar, Object obj, Object obj2, Object obj3, Object obj4) {
        return new C6483c(aVar, obj, obj2, new Object[]{obj3, obj4});
    }

    public static AbstractC5327a m20387f(AbstractC5327a.AbstractC5328a aVar, Object obj, Object obj2, Object[] objArr) {
        return new C6483c(aVar, obj, obj2, objArr);
    }

    public AbstractC5921a m20386g(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int parseInt = Integer.parseInt(str, 16);
        Class b = m20391b(str3, this.f20169b);
        StringTokenizer stringTokenizer = new StringTokenizer(str4, ":");
        int countTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[countTokens];
        for (int i = 0; i < countTokens; i++) {
            clsArr[i] = m20391b(stringTokenizer.nextToken(), this.f20169b);
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(str5, ":");
        int countTokens2 = stringTokenizer2.countTokens();
        String[] strArr = new String[countTokens2];
        for (int i2 = 0; i2 < countTokens2; i2++) {
            strArr[i2] = stringTokenizer2.nextToken();
        }
        StringTokenizer stringTokenizer3 = new StringTokenizer(str6, ":");
        int countTokens3 = stringTokenizer3.countTokens();
        Class[] clsArr2 = new Class[countTokens3];
        for (int i3 = 0; i3 < countTokens3; i3++) {
            clsArr2[i3] = m20391b(stringTokenizer3.nextToken(), this.f20169b);
        }
        return new C6486e(parseInt, str2, b, clsArr, strArr, clsArr2, m20391b(str7, this.f20169b));
    }

    public AbstractC5327a.AbstractC5328a m20385h(String str, AbstractC5330c cVar, int i) {
        int i2 = this.f20171d;
        this.f20171d = i2 + 1;
        return new C6483c.C6484a(i2, str, cVar, m20384i(i, -1));
    }

    public AbstractC5922b m20384i(int i, int i2) {
        return new C6490g(this.f20168a, this.f20170c, i);
    }
}
