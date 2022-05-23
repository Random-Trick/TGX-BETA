package lb;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import k0.h;

public class i {
    public static <T> boolean a(List<Reference<T>> list, T t10) {
        boolean z10 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            Reference<T> reference = list.get(size);
            T t11 = reference != null ? reference.get() : null;
            if (t11 == null) {
                list.remove(size);
            } else if (t11 == t10) {
                z10 = true;
            }
        }
        if (z10) {
            return false;
        }
        list.add(new WeakReference(t10));
        return true;
    }

    public static <T> boolean b(h<List<Reference<T>>> hVar, T t10, int i10) {
        List<Reference<T>> e10 = hVar.e(i10);
        if (e10 != null) {
            return a(e10, t10);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new WeakReference(t10));
        hVar.j(i10, arrayList);
        return true;
    }

    public static <T> boolean c(b<T> bVar, List<Reference<T>> list, T t10) {
        boolean z10 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            Reference<T> reference = list.get(size);
            T t11 = reference != null ? reference.get() : null;
            if (t11 == null) {
                list.remove(size);
            } else if (t11 == t10) {
                z10 = true;
            }
        }
        if (z10) {
            return false;
        }
        Reference<T> f10 = bVar.f(t10);
        if (f10 != null) {
            list.add(f10);
            return true;
        }
        throw new IllegalArgumentException();
    }

    public static <T> void d(List<Reference<T>> list) {
        if (list != null) {
            for (int size = (list.size() - 1) - 1; size >= 0; size--) {
                if (list.get(size).get() == null) {
                    list.remove(size);
                }
            }
        }
    }

    public static <T> boolean e(List<Reference<T>> list, T t10) {
        for (int size = list.size() - 1; size >= 0; size--) {
            T t11 = list.get(size).get();
            if (t11 == null || t11 == t10) {
                list.remove(size);
                return true;
            }
        }
        return false;
    }

    public static <T> boolean f(h<List<Reference<T>>> hVar, T t10, int i10) {
        List<Reference<T>> e10 = hVar.e(i10);
        if (e10 == null) {
            return false;
        }
        boolean e11 = e(e10, t10);
        if (e10.isEmpty()) {
            hVar.k(i10);
        }
        return e11;
    }
}
