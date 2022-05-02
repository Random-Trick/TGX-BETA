package qa;

import java.util.Arrays;
import p107ha.C5059p;

public class C8298k {
    public static boolean m12937a(Double d, Double d2) {
        if (d == null) {
            if (d2 == null) {
                return true;
            }
        } else if (d2 != null && d.doubleValue() == d2.doubleValue()) {
            return true;
        }
        return false;
    }

    public static boolean m12936b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void m12935c(Object obj) {
        if (obj == null) {
            m12927k();
        }
    }

    public static void m12934d(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) m12930h(new NullPointerException(str + " must not be null")));
        }
    }

    public static void m12933e(Object obj, String str) {
        if (obj == null) {
            m12926l(str);
        }
    }

    public static int m12932f(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static String m12931g(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    public static <T extends Throwable> T m12930h(T t) {
        return (T) m12929i(t, C8298k.class.getName());
    }

    public static <T extends Throwable> T m12929i(T t, String str) {
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

    public static String m12928j(String str, Object obj) {
        return str + obj;
    }

    public static void m12927k() {
        throw ((NullPointerException) m12930h(new NullPointerException()));
    }

    public static void m12926l(String str) {
        throw ((NullPointerException) m12930h(new NullPointerException(m12931g(str))));
    }

    public static void m12925m(String str) {
        throw ((C5059p) m12930h(new C5059p(str)));
    }

    public static void m12924n(String str) {
        m12925m("lateinit property " + str + " has not been initialized");
    }
}
