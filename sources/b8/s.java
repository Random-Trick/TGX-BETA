package b8;

import b8.a;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

public final class s extends PhantomReference<Object> implements a.AbstractC0056a {
    public final Set<s> f4055a;
    public final Runnable f4056b;

    public s(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, r rVar) {
        super(obj, referenceQueue);
        this.f4055a = set;
        this.f4056b = runnable;
    }

    @Override
    public final void a() {
        if (this.f4055a.remove(this)) {
            clear();
            this.f4056b.run();
        }
    }
}
