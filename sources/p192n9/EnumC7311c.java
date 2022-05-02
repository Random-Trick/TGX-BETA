package p192n9;

public enum EnumC7311c {
    ABSENT,
    REMOVING,
    PASS_THROUGH,
    COMPRESSING;

    public static class C7312a {
        public static final int[] f23220a;

        static {
            int[] iArr = new int[EnumC7311c.values().length];
            f23220a = iArr;
            try {
                iArr[EnumC7311c.PASS_THROUGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23220a[EnumC7311c.COMPRESSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23220a[EnumC7311c.REMOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23220a[EnumC7311c.ABSENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public boolean m17064a() {
        int i = C7312a.f23220a[ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        throw new RuntimeException("Unexpected track status: " + this);
    }
}
