package o9;

public enum c {
    ABSENT,
    REMOVING,
    PASS_THROUGH,
    COMPRESSING;

    public static class a {
        public static final int[] f19334a;

        static {
            int[] iArr = new int[c.values().length];
            f19334a = iArr;
            try {
                iArr[c.PASS_THROUGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19334a[c.COMPRESSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19334a[c.REMOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19334a[c.ABSENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public boolean a() {
        int i10 = a.f19334a[ordinal()];
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        if (i10 == 3 || i10 == 4) {
            return false;
        }
        throw new RuntimeException("Unexpected track status: " + this);
    }
}
