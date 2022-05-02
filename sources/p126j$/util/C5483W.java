package p126j$.util;

import java.security.PrivilegedAction;

public final class C5483W implements PrivilegedAction {
    public static final C5483W f17971a = new C5483W();

    private C5483W() {
    }

    @Override
    public final Object run() {
        boolean z = AbstractC5484X.f17972a;
        return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
    }
}
