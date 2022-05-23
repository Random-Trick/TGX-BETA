package j$.util.concurrent;

import sun.misc.Unsafe;

public abstract class AbstractC0267a {
    public static boolean a(Unsafe unsafe, Object obj, long j10, Object obj2) {
        while (!unsafe.compareAndSwapObject(obj, j10, (Object) null, obj2)) {
            if (unsafe.getObject(obj, j10) != null) {
                return false;
            }
        }
        return true;
    }
}
