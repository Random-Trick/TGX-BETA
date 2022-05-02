package qa;

import java.util.List;
import p251ra.AbstractC8415a;
import p251ra.AbstractC8416b;

public class C8310w {
    public static List m12909a(Object obj) {
        if ((obj instanceof AbstractC8415a) && !(obj instanceof AbstractC8416b)) {
            m12905e(obj, "kotlin.collections.MutableList");
        }
        return m12908b(obj);
    }

    public static List m12908b(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw m12906d(e);
        }
    }

    public static <T extends Throwable> T m12907c(T t) {
        return (T) C8298k.m12929i(t, C8310w.class.getName());
    }

    public static ClassCastException m12906d(ClassCastException classCastException) {
        throw ((ClassCastException) m12907c(classCastException));
    }

    public static void m12905e(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        m12904f(name + " cannot be cast to " + str);
    }

    public static void m12904f(String str) {
        throw m12906d(new ClassCastException(str));
    }
}
