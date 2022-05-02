package p009a8;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
import p009a8.C0202a;

public final class C0228s extends PhantomReference<Object> implements C0202a.AbstractC0203a {
    public final Set<C0228s> f715a;
    public final Runnable f716b;

    public C0228s(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, C0227r rVar) {
        super(obj, referenceQueue);
        this.f715a = set;
        this.f716b = runnable;
    }

    @Override
    public final void mo42057a() {
        if (this.f715a.remove(this)) {
            clear();
            this.f716b.run();
        }
    }
}
