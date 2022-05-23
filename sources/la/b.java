package la;

import ab.o;
import na.a;
import org.thunderdog.challegram.Log;
import ra.k;

public final class b {
    public static final a f16325a;

    static {
        a aVar;
        Object newInstance;
        Object newInstance2;
        int a10 = a();
        if (a10 >= 65544 || a10 < 65536) {
            try {
                newInstance = a.class.newInstance();
                k.d(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    try {
                    } catch (ClassCastException e10) {
                        ClassLoader classLoader = newInstance.getClass().getClassLoader();
                        ClassLoader classLoader2 = a.class.getClassLoader();
                        if (!k.b(classLoader, classLoader2)) {
                            throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e10);
                        }
                        throw e10;
                    }
                } catch (ClassNotFoundException unused) {
                }
            } catch (ClassNotFoundException unused2) {
                Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                k.d(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    if (newInstance3 != null) {
                        aVar = (a) newInstance3;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassCastException e11) {
                    ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                    ClassLoader classLoader4 = a.class.getClassLoader();
                    if (!k.b(classLoader3, classLoader4)) {
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e11);
                    }
                    throw e11;
                }
            }
            if (newInstance != null) {
                aVar = (a) newInstance;
                f16325a = aVar;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
        }
        if (a10 >= 65543 || a10 < 65536) {
            try {
                try {
                    newInstance2 = ma.a.class.newInstance();
                    k.d(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                    } catch (ClassCastException e12) {
                        ClassLoader classLoader5 = newInstance2.getClass().getClassLoader();
                        ClassLoader classLoader6 = a.class.getClassLoader();
                        if (!k.b(classLoader5, classLoader6)) {
                            throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e12);
                        }
                        throw e12;
                    }
                } catch (ClassNotFoundException unused3) {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    k.d(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                        if (newInstance4 != null) {
                            aVar = (a) newInstance4;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                        }
                    } catch (ClassCastException e13) {
                        ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                        ClassLoader classLoader8 = a.class.getClassLoader();
                        if (!k.b(classLoader7, classLoader8)) {
                            throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e13);
                        }
                        throw e13;
                    }
                }
            } catch (ClassNotFoundException unused4) {
            }
            if (newInstance2 != null) {
                aVar = (a) newInstance2;
                f16325a = aVar;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
        }
        aVar = new a();
        f16325a = aVar;
    }

    public static final int a() {
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        int M = o.M(property, '.', 0, false, 6, null);
        if (M < 0) {
            try {
                return Integer.parseInt(property) * Log.TAG_COMPRESS;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        } else {
            int i10 = M + 1;
            int M2 = o.M(property, '.', i10, false, 4, null);
            if (M2 < 0) {
                M2 = property.length();
            }
            String substring = property.substring(0, M);
            k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring2 = property.substring(i10, M2);
            k.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            try {
                return (Integer.parseInt(substring) * Log.TAG_COMPRESS) + Integer.parseInt(substring2);
            } catch (NumberFormatException unused2) {
                return 65542;
            }
        }
    }
}
