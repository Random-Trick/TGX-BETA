package j$.util.stream;

import java.security.AccessController;

abstract class R3 {
    static final boolean f14615a = ((Boolean) AccessController.doPrivileged(Q3.f14608a)).booleanValue();

    public static void a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
