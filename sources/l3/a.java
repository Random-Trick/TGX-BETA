package l3;

import android.util.SparseArray;
import java.util.HashMap;
import y2.d;

public final class a {
    public static SparseArray<d> f16003a = new SparseArray<>();
    public static HashMap<d, Integer> f16004b;

    static {
        HashMap<d, Integer> hashMap = new HashMap<>();
        f16004b = hashMap;
        hashMap.put(d.DEFAULT, 0);
        f16004b.put(d.VERY_LOW, 1);
        f16004b.put(d.HIGHEST, 2);
        for (d dVar : f16004b.keySet()) {
            f16003a.append(f16004b.get(dVar).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = f16004b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = f16003a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
