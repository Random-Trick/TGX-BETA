package c5;

import a7.q;
import android.os.Bundle;
import android.util.SparseArray;
import java.util.List;
import m3.h;

public final class c {
    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) l0.j(c.class.getClassLoader()));
        }
    }

    public static <T extends h> q<T> b(h.a<T> aVar, List<Bundle> list) {
        q.a x10 = q.x();
        for (int i10 = 0; i10 < list.size(); i10++) {
            x10.a(aVar.a((Bundle) a.e(list.get(i10))));
        }
        return x10.h();
    }

    public static <T extends h> List<T> c(h.a<T> aVar, List<Bundle> list, List<T> list2) {
        return list == null ? list2 : b(aVar, list);
    }

    public static <T extends h> SparseArray<T> d(h.a<T> aVar, SparseArray<Bundle> sparseArray, SparseArray<T> sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2;
        }
        SparseArray<T> sparseArray3 = new SparseArray<>(sparseArray.size());
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray3.put(sparseArray.keyAt(i10), aVar.a(sparseArray.valueAt(i10)));
        }
        return sparseArray3;
    }

    public static <T extends h> T e(h.a<T> aVar, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return aVar.a(bundle);
    }

    public static <T extends h> T f(h.a<T> aVar, Bundle bundle, T t10) {
        return bundle == null ? t10 : aVar.a(bundle);
    }
}
