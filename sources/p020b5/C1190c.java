package p020b5;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.List;
import p174m3.AbstractC6609h;
import p358z6.AbstractC11396q;

public final class C1190c {
    public static void m38119a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) C1216l0.m37971j(C1190c.class.getClassLoader()));
        }
    }

    public static <T extends AbstractC6609h> AbstractC11396q<T> m38118b(AbstractC6609h.AbstractC6610a<T> aVar, List<Bundle> list) {
        AbstractC11396q.C11397a x = AbstractC11396q.m760x();
        for (int i = 0; i < list.size(); i++) {
            x.m757d(aVar.mo998a((Bundle) C1186a.m38188e(list.get(i))));
        }
        return x.m756e();
    }

    public static <T extends AbstractC6609h> List<T> m38117c(AbstractC6609h.AbstractC6610a<T> aVar, List<Bundle> list, List<T> list2) {
        return list == null ? list2 : m38118b(aVar, list);
    }

    public static <T extends AbstractC6609h> SparseArray<T> m38116d(AbstractC6609h.AbstractC6610a<T> aVar, SparseArray<Bundle> sparseArray, SparseArray<T> sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2;
        }
        SparseArray<T> sparseArray3 = new SparseArray<>(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray3.put(sparseArray.keyAt(i), aVar.mo998a(sparseArray.valueAt(i)));
        }
        return sparseArray3;
    }

    public static <T extends AbstractC6609h> T m38115e(AbstractC6609h.AbstractC6610a<T> aVar, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return aVar.mo998a(bundle);
    }

    public static <T extends AbstractC6609h> T m38114f(AbstractC6609h.AbstractC6610a<T> aVar, Bundle bundle, T t) {
        return bundle == null ? t : aVar.mo998a(bundle);
    }
}
