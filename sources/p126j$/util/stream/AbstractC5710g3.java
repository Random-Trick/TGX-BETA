package p126j$.util.stream;

public abstract class AbstractC5710g3 {
    public static final int[] f18379a = {1, 2, 3, 4};

    public static int[] m22258a() {
        return m22255d(4);
    }

    public static int m22257b(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static String m22256c(int i) {
        return i == 1 ? "REFERENCE" : i == 2 ? "INT_VALUE" : i == 3 ? "LONG_VALUE" : i == 4 ? "DOUBLE_VALUE" : "null";
    }

    public static int[] m22255d(int i) {
        int[] iArr = new int[i];
        System.arraycopy(f18379a, 0, iArr, 0, i);
        return iArr;
    }
}
