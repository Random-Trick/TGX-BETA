package ra;

import java.util.Collection;
import java.util.List;
import sa.a;
import sa.b;
import sa.c;
import sa.d;

public class w {
    public static Collection a(Object obj) {
        if ((obj instanceof a) && !(obj instanceof b)) {
            i(obj, "kotlin.collections.MutableCollection");
        }
        return d(obj);
    }

    public static Iterable b(Object obj) {
        if ((obj instanceof a) && !(obj instanceof c)) {
            i(obj, "kotlin.collections.MutableIterable");
        }
        return e(obj);
    }

    public static List c(Object obj) {
        if ((obj instanceof a) && !(obj instanceof d)) {
            i(obj, "kotlin.collections.MutableList");
        }
        return f(obj);
    }

    public static Collection d(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e10) {
            throw h(e10);
        }
    }

    public static Iterable e(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e10) {
            throw h(e10);
        }
    }

    public static List f(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            throw h(e10);
        }
    }

    public static <T extends Throwable> T g(T t10) {
        return (T) k.i(t10, w.class.getName());
    }

    public static ClassCastException h(ClassCastException classCastException) {
        throw ((ClassCastException) g(classCastException));
    }

    public static void i(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        j(name + " cannot be cast to " + str);
    }

    public static void j(String str) {
        throw h(new ClassCastException(str));
    }
}
