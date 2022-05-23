package j$.util;

import java.security.PrivilegedAction;

public final class X implements PrivilegedAction {
    public static final X f14359a = new X();

    private X() {
    }

    @Override
    public final Object run() {
        boolean z10 = Y.f14360a;
        return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
    }
}
