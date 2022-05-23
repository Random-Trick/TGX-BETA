package j$.util.stream;

public abstract class AbstractC0330h3 {
    public static final int[] f14773a = {1, 2, 3, 4};

    public static int a(int i10) {
        if (i10 != 0) {
            return i10 - 1;
        }
        throw null;
    }

    public static String b(int i10) {
        return i10 == 1 ? "REFERENCE" : i10 == 2 ? "INT_VALUE" : i10 == 3 ? "LONG_VALUE" : i10 == 4 ? "DOUBLE_VALUE" : "null";
    }

    public static int[] c(int i10) {
        int[] iArr = new int[i10];
        System.arraycopy(f14773a, 0, iArr, 0, i10);
        return iArr;
    }
}
