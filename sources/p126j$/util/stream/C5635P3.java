package p126j$.util.stream;

import java.security.PrivilegedAction;

public final class C5635P3 implements PrivilegedAction {
    public static final C5635P3 f18213a = new C5635P3();

    private C5635P3() {
    }

    @Override
    public final Object run() {
        boolean z = AbstractC5640Q3.f18220a;
        return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
    }
}
