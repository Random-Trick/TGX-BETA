package p009a8;

import androidx.annotation.RecentlyNonNull;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class C0202a {
    public final ReferenceQueue<Object> f673a = new ReferenceQueue<>();
    public final Set<C0228s> f674b = Collections.synchronizedSet(new HashSet());

    public interface AbstractC0203a {
        void mo42060a();
    }

    @RecentlyNonNull
    public static C0202a m42093a() {
        C0202a aVar = new C0202a();
        aVar.m42092b(aVar, RunnableC0226q.f714a);
        final ReferenceQueue<Object> referenceQueue = aVar.f673a;
        final Set<C0228s> set = aVar.f674b;
        Thread thread = new Thread(new Runnable() {
            @Override
            public final void run() {
                ReferenceQueue referenceQueue2 = referenceQueue;
                Set set2 = set;
                while (!set2.isEmpty()) {
                    try {
                        ((C0228s) referenceQueue2.remove()).mo42060a();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }, "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return aVar;
    }

    @RecentlyNonNull
    public AbstractC0203a m42092b(@RecentlyNonNull Object obj, @RecentlyNonNull Runnable runnable) {
        C0228s sVar = new C0228s(obj, this.f673a, this.f674b, runnable, null);
        this.f674b.add(sVar);
        return sVar;
    }
}
