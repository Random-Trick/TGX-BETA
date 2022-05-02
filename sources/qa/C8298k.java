package qa;

import java.util.Arrays;
import p107ha.C5059p;

public class C8298k {
    public static boolean m12938a(Double d, Double d2) {
        if (d == null) {
            if (d2 == null) {
                return true;
            }
        } else if (d2 != null && d.doubleValue() == d2.doubleValue()) {
            return true;
        }
        return false;
    }

    public static boolean m12937b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void m12936c(Object obj) {
        if (obj == null) {
            m12928k();
        }
    }

    public static void m12935d(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) m12931h(new NullPointerException(str + " must not be null")));
        }
    }

    public static void m12934e(Object obj, String str) {
        if (obj == null) {
            m12927l(str);
        }
    }

    public static int m12933f(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static String m12932g(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    public static <T extends Throwable> T m12931h(T t) {
        return (T) m12930i(t, C8298k.class.getName());
    }

    public static <T extends Throwable> T m12930i(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    public static String m12929j(String str, Object obj) {
        return str + obj;
    }

    public static void m12928k() {
        throw ((NullPointerException) m12931h(new NullPointerException()));
    }

    public static void m12927l(String str) {
        throw ((NullPointerException) m12931h(new NullPointerException(m12932g(str))));
    }

    public static void m12926m(String str) {
        throw ((C5059p) m12931h(new C5059p(str)));
    }

    public static void m12925n(String str) {
        m12926m("lateinit property " + str + " has not been initialized");
    }
}
