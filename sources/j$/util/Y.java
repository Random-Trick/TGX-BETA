package j$.util;

import java.security.AccessController;

abstract class Y {
    static final boolean f14360a = ((Boolean) AccessController.doPrivileged(X.f14359a)).booleanValue();

    public static void a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
