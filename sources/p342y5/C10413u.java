package p342y5;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public final class C10413u extends WeakReference<Throwable> {
    public final int f33480a;

    public C10413u(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.f33480a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C10413u.class) {
            if (this == obj) {
                return true;
            }
            C10413u uVar = (C10413u) obj;
            if (this.f33480a == uVar.f33480a && get() == uVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f33480a;
    }
}
