package h8;

public abstract class j extends Exception {
    public static final boolean f12611a;
    public static final StackTraceElement[] f12612b;

    static {
        f12611a = System.getProperty("surefire.test.class.path") != null;
        f12612b = new StackTraceElement[0];
    }

    @Override
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
