package q2;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class a<V> implements c7.a<V> {
    public static final boolean M = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger N = Logger.getLogger(a.class.getName());
    public static final b O;
    public static final Object P;
    public volatile Object f21209a;
    public volatile e f21210b;
    public volatile i f21211c;

    public static abstract class b {
        public b() {
        }

        public abstract boolean a(a<?> aVar, e eVar, e eVar2);

        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        public abstract boolean c(a<?> aVar, i iVar, i iVar2);

        public abstract void d(i iVar, i iVar2);

        public abstract void e(i iVar, Thread thread);
    }

    public static final class c {
        public static final c f21212c;
        public static final c f21213d;
        public final boolean f21214a;
        public final Throwable f21215b;

        static {
            if (a.M) {
                f21213d = null;
                f21212c = null;
                return;
            }
            f21213d = new c(false, null);
            f21212c = new c(true, null);
        }

        public c(boolean z10, Throwable th) {
            this.f21214a = z10;
            this.f21215b = th;
        }
    }

    public static final class d {
        public static final d f21216b = new d(new C0192a("Failure occurred while trying to finish a future."));
        public final Throwable f21217a;

        public class C0192a extends Throwable {
            public C0192a(String str) {
                super(str);
            }

            @Override
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th) {
            this.f21217a = (Throwable) a.e(th);
        }
    }

    public static final class e {
        public static final e f21218d = new e(null, null);
        public final Runnable f21219a;
        public final Executor f21220b;
        public e f21221c;

        public e(Runnable runnable, Executor executor) {
            this.f21219a = runnable;
            this.f21220b = executor;
        }
    }

    public static final class f extends b {
        public final AtomicReferenceFieldUpdater<i, Thread> f21222a;
        public final AtomicReferenceFieldUpdater<i, i> f21223b;
        public final AtomicReferenceFieldUpdater<a, i> f21224c;
        public final AtomicReferenceFieldUpdater<a, e> f21225d;
        public final AtomicReferenceFieldUpdater<a, Object> f21226e;

        public f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f21222a = atomicReferenceFieldUpdater;
            this.f21223b = atomicReferenceFieldUpdater2;
            this.f21224c = atomicReferenceFieldUpdater3;
            this.f21225d = atomicReferenceFieldUpdater4;
            this.f21226e = atomicReferenceFieldUpdater5;
        }

        @Override
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            return l0.b.a(this.f21225d, aVar, eVar, eVar2);
        }

        @Override
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            return l0.b.a(this.f21226e, aVar, obj, obj2);
        }

        @Override
        public boolean c(a<?> aVar, i iVar, i iVar2) {
            return l0.b.a(this.f21224c, aVar, iVar, iVar2);
        }

        @Override
        public void d(i iVar, i iVar2) {
            this.f21223b.lazySet(iVar, iVar2);
        }

        @Override
        public void e(i iVar, Thread thread) {
            this.f21222a.lazySet(iVar, thread);
        }
    }

    public static final class g<V> implements Runnable {
        public final a<V> f21227a;
        public final c7.a<? extends V> f21228b;

        public g(a<V> aVar, c7.a<? extends V> aVar2) {
            this.f21227a = aVar;
            this.f21228b = aVar2;
        }

        @Override
        public void run() {
            if (this.f21227a.f21209a == this) {
                if (a.O.b(this.f21227a, this, a.j(this.f21228b))) {
                    a.g(this.f21227a);
                }
            }
        }
    }

    public static final class h extends b {
        public h() {
            super();
        }

        @Override
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f21210b != eVar) {
                    return false;
                }
                aVar.f21210b = eVar2;
                return true;
            }
        }

        @Override
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f21209a != obj) {
                    return false;
                }
                aVar.f21209a = obj2;
                return true;
            }
        }

        @Override
        public boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.f21211c != iVar) {
                    return false;
                }
                aVar.f21211c = iVar2;
                return true;
            }
        }

        @Override
        public void d(i iVar, i iVar2) {
            iVar.f21231b = iVar2;
        }

        @Override
        public void e(i iVar, Thread thread) {
            iVar.f21230a = thread;
        }
    }

    public static final class i {
        public static final i f21229c = new i(false);
        public volatile Thread f21230a;
        public volatile i f21231b;

        public i(boolean z10) {
        }

        public void a(i iVar) {
            a.O.d(this, iVar);
        }

        public void b() {
            Thread thread = this.f21230a;
            if (thread != null) {
                this.f21230a = null;
                LockSupport.unpark(thread);
            }
        }

        public i() {
            a.O.e(this, Thread.currentThread());
        }
    }

    static {
        b bVar;
        Throwable th;
        try {
            bVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            bVar = new h();
        }
        O = bVar;
        if (th != null) {
            N.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        P = new Object();
    }

    public static CancellationException d(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static <T> T e(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    public static void g(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.n();
            aVar.c();
            e f10 = aVar.f(eVar);
            while (f10 != null) {
                eVar = f10.f21221c;
                Runnable runnable = f10.f21219a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f21227a;
                    if (aVar.f21209a == gVar) {
                        if (O.b(aVar, gVar, j(gVar.f21228b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    h(runnable, f10.f21220b);
                }
                f10 = eVar;
            }
            return;
        }
    }

    public static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = N;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object j(c7.a<?> aVar) {
        if (aVar instanceof a) {
            Object obj = ((a) aVar).f21209a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f21214a ? cVar.f21215b != null ? new c(false, cVar.f21215b) : c.f21213d : obj;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!M) && isCancelled) {
            return c.f21213d;
        }
        try {
            Object k10 = k(aVar);
            return k10 == null ? P : k10;
        } catch (CancellationException e10) {
            if (isCancelled) {
                return new c(false, e10);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e10));
        } catch (ExecutionException e11) {
            return new d(e11.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    public static <V> V k(Future<V> future) {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    @Override
    public final void a(Runnable runnable, Executor executor) {
        e(runnable);
        e(executor);
        e eVar = this.f21210b;
        if (eVar != e.f21218d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f21221c = eVar;
                if (!O.a(this, eVar, eVar2)) {
                    eVar = this.f21210b;
                } else {
                    return;
                }
            } while (eVar != e.f21218d);
            h(runnable, executor);
        }
        h(runnable, executor);
    }

    public final void b(StringBuilder sb2) {
        try {
            Object k10 = k(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(s(k10));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        }
    }

    public void c() {
    }

    @Override
    public final boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.f21209a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (M) {
            cVar = new c(z10, new CancellationException("Future.cancel() was called."));
        } else if (z10) {
            cVar = c.f21212c;
        } else {
            cVar = c.f21213d;
        }
        boolean z11 = false;
        a<V> aVar = this;
        while (true) {
            if (O.b(aVar, obj, cVar)) {
                if (z10) {
                    aVar.l();
                }
                g(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                c7.a<? extends V> aVar2 = ((g) obj).f21228b;
                if (aVar2 instanceof a) {
                    aVar = (a) aVar2;
                    obj = aVar.f21209a;
                    if (!(obj == null) && !(obj instanceof g)) {
                        return true;
                    }
                    z11 = true;
                } else {
                    aVar2.cancel(z10);
                    return true;
                }
            } else {
                obj = aVar.f21209a;
                if (!(obj instanceof g)) {
                    return z11;
                }
            }
        }
    }

    public final e f(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f21210b;
        } while (!O.a(this, eVar2, e.f21218d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f21221c;
            eVar4.f21221c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    @Override
    public final V get(long r20, java.util.concurrent.TimeUnit r22) {
        throw new UnsupportedOperationException("Method not decompiled: q2.a.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final V i(Object obj) {
        if (obj instanceof c) {
            throw d("Task was cancelled.", ((c) obj).f21215b);
        } else if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f21217a);
        } else if (obj == P) {
            return null;
        } else {
            return obj;
        }
    }

    @Override
    public final boolean isCancelled() {
        return this.f21209a instanceof c;
    }

    @Override
    public final boolean isDone() {
        Object obj = this.f21209a;
        return (!(obj instanceof g)) & (obj != null);
    }

    public void l() {
    }

    public String m() {
        Object obj = this.f21209a;
        if (obj instanceof g) {
            return "setFuture=[" + s(((g) obj).f21228b) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    public final void n() {
        i iVar;
        do {
            iVar = this.f21211c;
        } while (!O.c(this, iVar, i.f21229c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f21231b;
        }
    }

    public final void o(i iVar) {
        iVar.f21230a = null;
        while (true) {
            i iVar2 = this.f21211c;
            if (iVar2 != i.f21229c) {
                i iVar3 = null;
                while (iVar2 != null) {
                    i iVar4 = iVar2.f21231b;
                    if (iVar2.f21230a != null) {
                        iVar3 = iVar2;
                    } else if (iVar3 != null) {
                        iVar3.f21231b = iVar4;
                        if (iVar3.f21230a == null) {
                            break;
                        }
                    } else if (!O.c(this, iVar2, iVar4)) {
                        break;
                    }
                    iVar2 = iVar4;
                }
                return;
            }
            return;
        }
    }

    public boolean p(V v10) {
        if (v10 == null) {
            v10 = (V) P;
        }
        if (!O.b(this, null, v10)) {
            return false;
        }
        g(this);
        return true;
    }

    public boolean q(Throwable th) {
        if (!O.b(this, null, new d((Throwable) e(th)))) {
            return false;
        }
        g(this);
        return true;
    }

    public boolean r(c7.a<? extends V> aVar) {
        d dVar;
        e(aVar);
        Object obj = this.f21209a;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!O.b(this, null, j(aVar))) {
                    return false;
                }
                g(this);
                return true;
            }
            g gVar = new g(this, aVar);
            if (O.b(this, null, gVar)) {
                try {
                    aVar.a(gVar, q2.b.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.f21216b;
                    }
                    O.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f21209a;
        }
        if (obj instanceof c) {
            aVar.cancel(((c) obj).f21214a);
        }
        return false;
    }

    public final String s(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                str = m();
            } catch (RuntimeException e10) {
                str = "Exception thrown from implementation: " + e10.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                b(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override
    public final V get() {
        throw new UnsupportedOperationException("Method not decompiled: q2.a.get():java.lang.Object");
    }
}
