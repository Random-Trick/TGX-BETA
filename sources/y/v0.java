package y;

import android.view.Surface;
import b0.c;
import b0.f;
import c7.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import l0.c;
import y.q0;

public final class v0 {

    public class a implements c<List<Surface>> {
        public final boolean f26429a;
        public final c.a f26430b;
        public final ScheduledFuture f26431c;

        public a(boolean z10, c.a aVar, ScheduledFuture scheduledFuture) {
            this.f26429a = z10;
            this.f26430b = aVar;
            this.f26431c = scheduledFuture;
        }

        @Override
        public void b(Throwable th) {
            this.f26430b.c(Collections.unmodifiableList(Collections.emptyList()));
            this.f26431c.cancel(true);
        }

        public void a(List<Surface> list) {
            ArrayList arrayList = new ArrayList(list);
            if (this.f26429a) {
                arrayList.removeAll(Collections.singleton(null));
            }
            this.f26430b.c(arrayList);
            this.f26431c.cancel(true);
        }
    }

    public static void e(List<q0> list) {
        for (q0 q0Var : list) {
            q0Var.d();
        }
    }

    public static void f(List<q0> list) {
        if (!list.isEmpty()) {
            int i10 = 0;
            do {
                try {
                    list.get(i10).j();
                    i10++;
                } catch (q0.a e10) {
                    for (int i11 = i10 - 1; i11 >= 0; i11--) {
                        list.get(i11).d();
                    }
                    throw e10;
                }
            } while (i10 < list.size());
        }
    }

    public static void g(c7.a aVar, c.a aVar2, long j10) {
        if (!aVar.isDone()) {
            aVar2.f(new TimeoutException("Cannot complete surfaceList within " + j10));
            aVar.cancel(true);
        }
    }

    public static void h(Executor executor, final c7.a aVar, final c.a aVar2, final long j10) {
        executor.execute(new Runnable() {
            @Override
            public final void run() {
                v0.g(a.this, aVar2, j10);
            }
        });
    }

    public static Object j(List list, ScheduledExecutorService scheduledExecutorService, final Executor executor, final long j10, boolean z10, final c.a aVar) {
        final c7.a n10 = f.n(list);
        ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() {
            @Override
            public final void run() {
                v0.h(executor, n10, aVar, j10);
            }
        }, j10, TimeUnit.MILLISECONDS);
        aVar.a(new Runnable() {
            @Override
            public final void run() {
                a.this.cancel(true);
            }
        }, executor);
        f.b(n10, new a(z10, aVar, schedule), executor);
        return "surfaceList";
    }

    public static c7.a<List<Surface>> k(Collection<q0> collection, final boolean z10, final long j10, final Executor executor, final ScheduledExecutorService scheduledExecutorService) {
        final ArrayList arrayList = new ArrayList();
        for (q0 q0Var : collection) {
            arrayList.add(q0Var.h());
        }
        return l0.c.a(new c.AbstractC0147c() {
            @Override
            public final Object a(c.a aVar) {
                Object j11;
                j11 = v0.j(arrayList, scheduledExecutorService, executor, j10, z10, aVar);
                return j11;
            }
        });
    }
}
