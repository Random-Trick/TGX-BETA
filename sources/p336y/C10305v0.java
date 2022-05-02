package p336y;

import android.view.Surface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p015b0.AbstractC1107c;
import p015b0.C1111f;
import p022b7.AbstractFutureC1291a;
import p158l0.C6287c;
import p336y.AbstractC10287q0;

public final class C10305v0 {

    public class C10306a implements AbstractC1107c<List<Surface>> {
        public final boolean f33159a;
        public final C6287c.C6288a f33160b;
        public final ScheduledFuture f33161c;

        public C10306a(boolean z, C6287c.C6288a aVar, ScheduledFuture scheduledFuture) {
            this.f33159a = z;
            this.f33160b = aVar;
            this.f33161c = scheduledFuture;
        }

        @Override
        public void mo5502b(Throwable th) {
            this.f33160b.m20717c(Collections.unmodifiableList(Collections.emptyList()));
            this.f33161c.cancel(true);
        }

        public void mo5503a(List<Surface> list) {
            ArrayList arrayList = new ArrayList(list);
            if (this.f33159a) {
                arrayList.removeAll(Collections.singleton(null));
            }
            this.f33160b.m20717c(arrayList);
            this.f33161c.cancel(true);
        }
    }

    public static void m5510e(List<AbstractC10287q0> list) {
        for (AbstractC10287q0 q0Var : list) {
            q0Var.m5550d();
        }
    }

    public static void m5509f(List<AbstractC10287q0> list) {
        if (!list.isEmpty()) {
            int i = 0;
            do {
                try {
                    list.get(i).m5544j();
                    i++;
                } catch (AbstractC10287q0.C10288a e) {
                    for (int i2 = i - 1; i2 >= 0; i2--) {
                        list.get(i2).m5550d();
                    }
                    throw e;
                }
            } while (i < list.size());
        }
    }

    public static void m5508g(AbstractFutureC1291a aVar, C6287c.C6288a aVar2, long j) {
        if (!aVar.isDone()) {
            aVar2.m20714f(new TimeoutException("Cannot complete surfaceList within " + j));
            aVar.cancel(true);
        }
    }

    public static void m5507h(Executor executor, final AbstractFutureC1291a aVar, final C6287c.C6288a aVar2, final long j) {
        executor.execute(new Runnable() {
            @Override
            public final void run() {
                C10305v0.m5508g(AbstractFutureC1291a.this, aVar2, j);
            }
        });
    }

    public static Object m5505j(List list, ScheduledExecutorService scheduledExecutorService, final Executor executor, final long j, boolean z, final C6287c.C6288a aVar) {
        final AbstractFutureC1291a n = C1111f.m38348n(list);
        ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() {
            @Override
            public final void run() {
                C10305v0.m5507h(executor, n, aVar, j);
            }
        }, j, TimeUnit.MILLISECONDS);
        aVar.m20719a(new Runnable() {
            @Override
            public final void run() {
                AbstractFutureC1291a.this.cancel(true);
            }
        }, executor);
        C1111f.m38360b(n, new C10306a(z, aVar, schedule), executor);
        return "surfaceList";
    }

    public static AbstractFutureC1291a<List<Surface>> m5504k(Collection<AbstractC10287q0> collection, final boolean z, final long j, final Executor executor, final ScheduledExecutorService scheduledExecutorService) {
        final ArrayList arrayList = new ArrayList();
        for (AbstractC10287q0 q0Var : collection) {
            arrayList.add(q0Var.m5546h());
        }
        return C6287c.m20720a(new C6287c.AbstractC6290c() {
            @Override
            public final Object mo5520a(C6287c.C6288a aVar) {
                Object j2;
                j2 = C10305v0.m5505j(arrayList, scheduledExecutorService, executor, j, z, aVar);
                return j2;
            }
        });
    }
}
