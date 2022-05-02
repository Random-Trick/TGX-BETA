package qa;

import java.util.List;
import p251ra.AbstractC8415a;
import p251ra.AbstractC8416b;

public class C8310w {
    public static List m12910a(Object obj) {
        if ((obj instanceof AbstractC8415a) && !(obj instanceof AbstractC8416b)) {
            m12906e(obj, "kotlin.collections.MutableList");
        }
        return m12909b(obj);
    }

    public static List m12909b(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw m12907d(e);
        }
    }

    public static <T extends Throwable> T m12908c(T t) {
        return (T) C8298k.m12930i(t, C8310w.class.getName());
    }

    public static ClassCastException m12907d(ClassCastException classCastException) {
        throw ((ClassCastException) m12908c(classCastException));
    }

    public static void m12906e(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        m12905f(name + " cannot be cast to " + str);
    }

    public static void m12905f(String str) {
        throw m12907d(new ClassCastException(str));
    }
}
