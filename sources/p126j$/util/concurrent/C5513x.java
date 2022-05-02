package p126j$.util.concurrent;

import java.security.PrivilegedAction;

class C5513x implements PrivilegedAction {
    @Override
    public Object run() {
        return Boolean.valueOf(Boolean.getBoolean("java.util.secureRandomSeed"));
    }
}
