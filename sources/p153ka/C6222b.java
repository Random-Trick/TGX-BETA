package p153ka;

import la.C6432a;
import ma.C6809a;
import org.thunderdog.challegram.Log;
import qa.C8298k;
import za.C11452o;

public final class C6222b {
    public static final C6220a f19644a;

    static {
        C6220a aVar;
        Object newInstance;
        int a = m21040a();
        if (a >= 65544) {
            try {
                try {
                    newInstance = C6809a.class.newInstance();
                    C8298k.m12935d(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
                } catch (ClassNotFoundException unused) {
                }
            } catch (ClassNotFoundException unused2) {
                Object newInstance2 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                C8298k.m12935d(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    aVar = (C6220a) newInstance2;
                } catch (ClassCastException e) {
                    ClassLoader classLoader = newInstance2.getClass().getClassLoader();
                    ClassLoader classLoader2 = C6220a.class.getClassLoader();
                    Throwable initCause = new ClassCastException("Instance classloader: " + classLoader + ", base type classloader: " + classLoader2).initCause(e);
                    C8298k.m12935d(initCause, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                    throw initCause;
                }
            }
            try {
                aVar = (C6220a) newInstance;
                f19644a = aVar;
            } catch (ClassCastException e2) {
                ClassLoader classLoader3 = newInstance.getClass().getClassLoader();
                ClassLoader classLoader4 = C6220a.class.getClassLoader();
                Throwable initCause2 = new ClassCastException("Instance classloader: " + classLoader3 + ", base type classloader: " + classLoader4).initCause(e2);
                C8298k.m12935d(initCause2, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                throw initCause2;
            }
        }
        if (a >= 65543) {
            try {
                Object newInstance3 = C6432a.class.newInstance();
                C8298k.m12935d(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    try {
                        aVar = (C6220a) newInstance3;
                    } catch (ClassCastException e3) {
                        ClassLoader classLoader5 = newInstance3.getClass().getClassLoader();
                        ClassLoader classLoader6 = C6220a.class.getClassLoader();
                        Throwable initCause3 = new ClassCastException("Instance classloader: " + classLoader5 + ", base type classloader: " + classLoader6).initCause(e3);
                        C8298k.m12935d(initCause3, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                        throw initCause3;
                    }
                } catch (ClassNotFoundException unused3) {
                }
            } catch (ClassNotFoundException unused4) {
                Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                C8298k.m12935d(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    aVar = (C6220a) newInstance4;
                } catch (ClassCastException e4) {
                    ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                    ClassLoader classLoader8 = C6220a.class.getClassLoader();
                    Throwable initCause4 = new ClassCastException("Instance classloader: " + classLoader7 + ", base type classloader: " + classLoader8).initCause(e4);
                    C8298k.m12935d(initCause4, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                    throw initCause4;
                }
            }
            f19644a = aVar;
        }
        aVar = new C6220a();
        f19644a = aVar;
    }

    public static final int m21040a() {
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        int M = C11452o.m608M(property, '.', 0, false, 6, null);
        if (M < 0) {
            try {
                return Integer.parseInt(property) * Log.TAG_COMPRESS;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        } else {
            int i = M + 1;
            int M2 = C11452o.m608M(property, '.', i, false, 4, null);
            if (M2 < 0) {
                M2 = property.length();
            }
            String substring = property.substring(0, M);
            C8298k.m12935d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring2 = property.substring(i, M2);
            C8298k.m12935d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            try {
                return (Integer.parseInt(substring) * Log.TAG_COMPRESS) + Integer.parseInt(substring2);
            } catch (NumberFormatException unused2) {
                return 65542;
            }
        }
    }
}
