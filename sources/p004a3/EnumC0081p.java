package p004a3;

import android.util.SparseArray;

public enum EnumC0081p {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);
    
    public static final SparseArray<EnumC0081p> f274Q;
    public final int f278a;

    static {
        EnumC0081p pVar = DEFAULT;
        EnumC0081p pVar2 = UNMETERED_ONLY;
        EnumC0081p pVar3 = UNMETERED_OR_DAILY;
        EnumC0081p pVar4 = FAST_IF_RADIO_AWAKE;
        EnumC0081p pVar5 = NEVER;
        EnumC0081p pVar6 = UNRECOGNIZED;
        SparseArray<EnumC0081p> sparseArray = new SparseArray<>();
        f274Q = sparseArray;
        sparseArray.put(0, pVar);
        sparseArray.put(1, pVar2);
        sparseArray.put(2, pVar3);
        sparseArray.put(3, pVar4);
        sparseArray.put(4, pVar5);
        sparseArray.put(-1, pVar6);
    }

    EnumC0081p(int i) {
        this.f278a = i;
    }
}
