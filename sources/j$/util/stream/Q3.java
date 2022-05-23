package j$.util.stream;

import java.security.PrivilegedAction;

public final class Q3 implements PrivilegedAction {
    public static final Q3 f14608a = new Q3();

    private Q3() {
    }

    @Override
    public final Object run() {
        boolean z10 = R3.f14615a;
        return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
    }
}
