package p161l3;

import android.util.SparseArray;
import java.util.HashMap;
import p339y2.EnumC10354d;

public final class C6307a {
    public static SparseArray<EnumC10354d> f19842a = new SparseArray<>();
    public static HashMap<EnumC10354d, Integer> f19843b;

    static {
        HashMap<EnumC10354d, Integer> hashMap = new HashMap<>();
        f19843b = hashMap;
        hashMap.put(EnumC10354d.DEFAULT, 0);
        f19843b.put(EnumC10354d.VERY_LOW, 1);
        f19843b.put(EnumC10354d.HIGHEST, 2);
        for (EnumC10354d dVar : f19843b.keySet()) {
            f19842a.append(f19843b.get(dVar).intValue(), dVar);
        }
    }

    public static int m20688a(EnumC10354d dVar) {
        Integer num = f19843b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static EnumC10354d m20687b(int i) {
        EnumC10354d dVar = f19842a.get(i);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
