package p154kb;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p143k0.C6038h;

public class C6235i {
    public static <T> boolean m21015a(List<Reference<T>> list, T t) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            Reference<T> reference = list.get(size);
            T t2 = reference != null ? reference.get() : null;
            if (t2 == null) {
                list.remove(size);
            } else if (t2 == t) {
                z = true;
            }
        }
        if (z) {
            return false;
        }
        list.add(new WeakReference(t));
        return true;
    }

    public static <T> boolean m21014b(C6038h<List<Reference<T>>> hVar, T t, int i) {
        List<Reference<T>> e = hVar.m21471e(i);
        if (e != null) {
            return m21015a(e, t);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new WeakReference(t));
        hVar.m21466j(i, arrayList);
        return true;
    }

    public static <T> boolean m21013c(AbstractC6225b<T> bVar, List<Reference<T>> list, T t) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            Reference<T> reference = list.get(size);
            T t2 = reference != null ? reference.get() : null;
            if (t2 == null) {
                list.remove(size);
            } else if (t2 == t) {
                z = true;
            }
        }
        if (z) {
            return false;
        }
        Reference<T> h = bVar.mo21032h(t);
        if (h != null) {
            list.add(h);
            return true;
        }
        throw new IllegalArgumentException();
    }

    public static <T> void m21012d(List<Reference<T>> list) {
        if (list != null) {
            for (int size = (list.size() - 1) - 1; size >= 0; size--) {
                if (list.get(size).get() == null) {
                    list.remove(size);
                }
            }
        }
    }

    public static <T> boolean m21011e(List<Reference<T>> list, T t) {
        for (int size = list.size() - 1; size >= 0; size--) {
            T t2 = list.get(size).get();
            if (t2 == null || t2 == t) {
                list.remove(size);
                return true;
            }
        }
        return false;
    }

    public static <T> boolean m21010f(C6038h<List<Reference<T>>> hVar, T t, int i) {
        List<Reference<T>> e = hVar.m21471e(i);
        if (e == null) {
            return false;
        }
        boolean e2 = m21011e(e, t);
        if (e.isEmpty()) {
            hVar.m21465k(i);
        }
        return e2;
    }
}
