package i6;

public final class g {
    public static Boolean a(byte b10) {
        if (b10 == 0) {
            return Boolean.FALSE;
        }
        if (b10 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    public static byte b(Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : (byte) 1;
        }
        return (byte) -1;
    }
}
