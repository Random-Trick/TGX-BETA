package b8;

import androidx.annotation.RecentlyNonNull;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class a {
    public final ReferenceQueue<Object> f4018a = new ReferenceQueue<>();
    public final Set<s> f4019b = Collections.synchronizedSet(new HashSet());

    public interface AbstractC0056a {
        void a();
    }

    @RecentlyNonNull
    public static a a() {
        a aVar = new a();
        aVar.b(aVar, q.f4054a);
        final ReferenceQueue<Object> referenceQueue = aVar.f4018a;
        final Set<s> set = aVar.f4019b;
        Thread thread = new Thread(new Runnable() {
            @Override
            public final void run() {
                ReferenceQueue referenceQueue2 = referenceQueue;
                Set set2 = set;
                while (!set2.isEmpty()) {
                    try {
                        ((s) referenceQueue2.remove()).a();
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
    public AbstractC0056a b(@RecentlyNonNull Object obj, @RecentlyNonNull Runnable runnable) {
        s sVar = new s(obj, this.f4018a, this.f4019b, runnable, null);
        this.f4019b.add(sVar);
        return sVar;
    }
}
