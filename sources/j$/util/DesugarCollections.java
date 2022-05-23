package j$.util;

import j$.util.function.E;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DesugarCollections {
    public static final Class f14314a;
    static final Class f14315b = Collections.synchronizedList(new LinkedList()).getClass();
    private static final Field f14316c;
    private static final Field f14317d;
    private static final Constructor f14318e;
    private static final Constructor f14319f;

    static {
        Field field;
        Field field2;
        Constructor<?> constructor;
        Class<?> cls = Collections.synchronizedCollection(new ArrayList()).getClass();
        f14314a = cls;
        Constructor constructor2 = null;
        try {
            field = cls.getDeclaredField("mutex");
        } catch (NoSuchFieldException unused) {
            field = null;
        }
        f14316c = field;
        if (field != null) {
            field.setAccessible(true);
        }
        try {
            field2 = f14314a.getDeclaredField("c");
        } catch (NoSuchFieldException unused2) {
            field2 = null;
        }
        f14317d = field2;
        if (field2 != null) {
            field2.setAccessible(true);
        }
        try {
            constructor = Collections.synchronizedSet(new HashSet()).getClass().getDeclaredConstructor(Set.class, Object.class);
        } catch (NoSuchMethodException unused3) {
            constructor = null;
        }
        f14319f = constructor;
        if (constructor != null) {
            constructor.setAccessible(true);
        }
        try {
            constructor2 = f14314a.getDeclaredConstructor(Collection.class, Object.class);
        } catch (NoSuchMethodException unused4) {
        }
        f14318e = constructor2;
        if (constructor2 != null) {
            constructor2.setAccessible(true);
        }
    }

    public static boolean c(Collection collection, E e10) {
        boolean b10;
        Field field = f14316c;
        if (field == null) {
            try {
                Collection collection2 = (Collection) f14317d.get(collection);
                return collection2 instanceof AbstractC0265b ? ((AbstractC0265b) collection2).b(e10) : AbstractC0264a.o(collection2, e10);
            } catch (IllegalAccessException e11) {
                throw new Error("Runtime illegal access in synchronized collection removeIf fall-back.", e11);
            }
        } else {
            try {
                synchronized (field.get(collection)) {
                    Collection collection3 = (Collection) f14317d.get(collection);
                    b10 = collection3 instanceof AbstractC0265b ? ((AbstractC0265b) collection3).b(e10) : AbstractC0264a.o(collection3, e10);
                }
                return b10;
            } catch (IllegalAccessException e12) {
                throw new Error("Runtime illegal access in synchronized collection removeIf.", e12);
            }
        }
    }

    public static void d(List list, Comparator comparator) {
        Field field = f14316c;
        if (field == null) {
            try {
                List$EL.sort((List) f14317d.get(list), comparator);
            } catch (IllegalAccessException e10) {
                throw new Error("Runtime illegal access in synchronized collection sort fall-back.", e10);
            }
        } else {
            try {
                synchronized (field.get(list)) {
                    List$EL.sort((List) f14317d.get(list), comparator);
                }
            } catch (IllegalAccessException e11) {
                throw new Error("Runtime illegal access in synchronized list sort.", e11);
            }
        }
    }

    public static <K, V> Map<K, V> synchronizedMap(Map<K, V> map) {
        return new C0272f(map);
    }
}
