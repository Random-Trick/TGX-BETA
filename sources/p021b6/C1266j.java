package p021b6;

public final class C1266j {
    public static Object[] m37813a(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                StringBuilder sb2 = new StringBuilder(20);
                sb2.append("at index ");
                sb2.append(i2);
                throw new NullPointerException(sb2.toString());
            }
        }
        return objArr;
    }
}
