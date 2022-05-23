package z5;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public final class u extends WeakReference<Throwable> {
    public final int f26998a;

    public u(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.f26998a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == u.class) {
            if (this == obj) {
                return true;
            }
            u uVar = (u) obj;
            if (this.f26998a == uVar.f26998a && get() == uVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f26998a;
    }
}
