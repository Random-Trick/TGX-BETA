package j$.util.concurrent;

import java.security.PrivilegedAction;

final class y implements PrivilegedAction {
    @Override
    public final Object run() {
        return Boolean.valueOf(Boolean.getBoolean("java.util.secureRandomSeed"));
    }
}
