package p126j$.util;

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
import p126j$.util.function.AbstractC5541w;

public class DesugarCollections {
    public static final Class f17927a;
    static final Class f17928b = Collections.synchronizedList(new LinkedList()).getClass();
    private static final Field f17929c;
    private static final Field f17930d;
    private static final Constructor f17931e;
    private static final Constructor f17932f;

    static {
        Field field;
        Field field2;
        Constructor<?> constructor;
        Class<?> cls = Collections.synchronizedCollection(new ArrayList()).getClass();
        f17927a = cls;
        Constructor constructor2 = null;
        try {
            field = cls.getDeclaredField("mutex");
        } catch (NoSuchFieldException unused) {
            field = null;
        }
        f17929c = field;
        if (field != null) {
            field.setAccessible(true);
        }
        try {
            field2 = f17927a.getDeclaredField("c");
        } catch (NoSuchFieldException unused2) {
            field2 = null;
        }
        f17930d = field2;
        if (field2 != null) {
            field2.setAccessible(true);
        }
        try {
            constructor = Collections.synchronizedSet(new HashSet()).getClass().getDeclaredConstructor(Set.class, Object.class);
        } catch (NoSuchMethodException unused3) {
            constructor = null;
        }
        f17932f = constructor;
        if (constructor != null) {
            constructor.setAccessible(true);
        }
        try {
            constructor2 = f17927a.getDeclaredConstructor(Collection.class, Object.class);
        } catch (NoSuchMethodException unused4) {
        }
        f17931e = constructor2;
        if (constructor2 != null) {
            constructor2.setAccessible(true);
        }
    }

    public static boolean m22607c(Collection collection, AbstractC5541w wVar) {
        boolean b;
        Field field = f17929c;
        if (field == null) {
            try {
                Collection collection2 = (Collection) f17930d.get(collection);
                return collection2 instanceof AbstractC5486b ? ((AbstractC5486b) collection2).mo22509b(wVar) : AbstractC5485a.m22567o(collection2, wVar);
            } catch (IllegalAccessException e) {
                throw new Error("Runtime illegal access in synchronized collection removeIf fall-back.", e);
            }
        } else {
            try {
                synchronized (field.get(collection)) {
                    Collection collection3 = (Collection) f17930d.get(collection);
                    b = collection3 instanceof AbstractC5486b ? ((AbstractC5486b) collection3).mo22509b(wVar) : AbstractC5485a.m22567o(collection3, wVar);
                }
                return b;
            } catch (IllegalAccessException e2) {
                throw new Error("Runtime illegal access in synchronized collection removeIf.", e2);
            }
        }
    }

    public static void m22606d(List list, Comparator comparator) {
        Field field = f17929c;
        if (field == null) {
            try {
                List$EL.sort((List) f17930d.get(list), comparator);
            } catch (IllegalAccessException e) {
                throw new Error("Runtime illegal access in synchronized collection sort fall-back.", e);
            }
        } else {
            try {
                synchronized (field.get(list)) {
                    List$EL.sort((List) f17930d.get(list), comparator);
                }
            } catch (IllegalAccessException e2) {
                throw new Error("Runtime illegal access in synchronized list sort.", e2);
            }
        }
    }

    public static <K, V> Map<K, V> synchronizedMap(Map<K, V> map) {
        return new C5518f(map);
    }
}
