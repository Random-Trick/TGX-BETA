package l0;

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
    public volatile Object f15965a;
    public volatile e f15966b;
    public volatile i f15967c;

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
        public static final c f15968c;
        public static final c f15969d;
        public final boolean f15970a;
        public final Throwable f15971b;

        static {
            if (a.M) {
                f15969d = null;
                f15968c = null;
                return;
            }
            f15969d = new c(false, null);
            f15968c = new c(true, null);
        }

        public c(boolean z10, Throwable th) {
            this.f15970a = z10;
            this.f15971b = th;
        }
    }

    public static final class d {
        public static final d f15972b = new d(new C0146a("Failure occurred while trying to finish a future."));
        public final Throwable f15973a;

        public static class C0146a extends Throwable {
            public C0146a(String str) {
                super(str);
            }

            @Override
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th) {
            this.f15973a = (Throwable) a.e(th);
        }
    }

    public static final class e {
        public static final e f15974d = new e(null, null);
        public final Runnable f15975a;
        public final Executor f15976b;
        public e f15977c;

        public e(Runnable runnable, Executor executor) {
            this.f15975a = runnable;
            this.f15976b = executor;
        }
    }

    public static final class f extends b {
        public final AtomicReferenceFieldUpdater<i, Thread> f15978a;
        public final AtomicReferenceFieldUpdater<i, i> f15979b;
        public final AtomicReferenceFieldUpdater<a, i> f15980c;
        public final AtomicReferenceFieldUpdater<a, e> f15981d;
        public final AtomicReferenceFieldUpdater<a, Object> f15982e;

        public f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f15978a = atomicReferenceFieldUpdater;
            this.f15979b = atomicReferenceFieldUpdater2;
            this.f15980c = atomicReferenceFieldUpdater3;
            this.f15981d = atomicReferenceFieldUpdater4;
            this.f15982e = atomicReferenceFieldUpdater5;
        }

        @Override
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            return l0.b.a(this.f15981d, aVar, eVar, eVar2);
        }

        @Override
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            return l0.b.a(this.f15982e, aVar, obj, obj2);
        }

        @Override
        public boolean c(a<?> aVar, i iVar, i iVar2) {
            return l0.b.a(this.f15980c, aVar, iVar, iVar2);
        }

        @Override
        public void d(i iVar, i iVar2) {
            this.f15979b.lazySet(iVar, iVar2);
        }

        @Override
        public void e(i iVar, Thread thread) {
            this.f15978a.lazySet(iVar, thread);
        }
    }

    public static final class g<V> implements Runnable {
        public final a<V> f15983a;
        public final c7.a<? extends V> f15984b;

        @Override
        public void run() {
            if (this.f15983a.f15965a == this) {
                if (a.O.b(this.f15983a, this, a.j(this.f15984b))) {
                    a.g(this.f15983a);
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
                if (aVar.f15966b != eVar) {
                    return false;
                }
                aVar.f15966b = eVar2;
                return true;
            }
        }

        @Override
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f15965a != obj) {
                    return false;
                }
                aVar.f15965a = obj2;
                return true;
            }
        }

        @Override
        public boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.f15967c != iVar) {
                    return false;
                }
                aVar.f15967c = iVar2;
                return true;
            }
        }

        @Override
        public void d(i iVar, i iVar2) {
            iVar.f15987b = iVar2;
        }

        @Override
        public void e(i iVar, Thread thread) {
            iVar.f15986a = thread;
        }
    }

    public static final class i {
        public static final i f15985c = new i(false);
        public volatile Thread f15986a;
        public volatile i f15987b;

        public i(boolean z10) {
        }

        public void a(i iVar) {
            a.O.d(this, iVar);
        }

        public void b() {
            Thread thread = this.f15986a;
            if (thread != null) {
                this.f15986a = null;
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
                eVar = f10.f15977c;
                Runnable runnable = f10.f15975a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f15983a;
                    if (aVar.f15965a == gVar) {
                        if (O.b(aVar, gVar, j(gVar.f15984b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    h(runnable, f10.f15976b);
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
            Object obj = ((a) aVar).f15965a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f15970a ? cVar.f15971b != null ? new c(false, cVar.f15971b) : c.f15969d : obj;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!M) && isCancelled) {
            return c.f15969d;
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
        e eVar = this.f15966b;
        if (eVar != e.f15974d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f15977c = eVar;
                if (!O.a(this, eVar, eVar2)) {
                    eVar = this.f15966b;
                } else {
                    return;
                }
            } while (eVar != e.f15974d);
            h(runnable, executor);
        }
        h(runnable, executor);
    }

    public final void b(StringBuilder sb2) {
        try {
            Object k10 = k(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(r(k10));
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
        Object obj = this.f15965a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = M ? new c(z10, new CancellationException("Future.cancel() was called.")) : z10 ? c.f15968c : c.f15969d;
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
                c7.a<? extends V> aVar2 = ((g) obj).f15984b;
                if (aVar2 instanceof a) {
                    aVar = (a) aVar2;
                    obj = aVar.f15965a;
                    if (!(obj == null) && !(obj instanceof g)) {
                        return true;
                    }
                    z11 = true;
                } else {
                    aVar2.cancel(z10);
                    return true;
                }
            } else {
                obj = aVar.f15965a;
                if (!(obj instanceof g)) {
                    return z11;
                }
            }
        }
    }

    public final e f(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f15966b;
        } while (!O.a(this, eVar2, e.f15974d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f15977c;
            eVar4.f15977c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    @Override
    public final V get(long r20, java.util.concurrent.TimeUnit r22) {
        throw new UnsupportedOperationException("Method not decompiled: l0.a.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final V i(Object obj) {
        if (obj instanceof c) {
            throw d("Task was cancelled.", ((c) obj).f15971b);
        } else if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f15973a);
        } else if (obj == P) {
            return null;
        } else {
            return obj;
        }
    }

    @Override
    public final boolean isCancelled() {
        return this.f15965a instanceof c;
    }

    @Override
    public final boolean isDone() {
        Object obj = this.f15965a;
        return (!(obj instanceof g)) & (obj != null);
    }

    public void l() {
    }

    public String m() {
        Object obj = this.f15965a;
        if (obj instanceof g) {
            return "setFuture=[" + r(((g) obj).f15984b) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    public final void n() {
        i iVar;
        do {
            iVar = this.f15967c;
        } while (!O.c(this, iVar, i.f15985c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f15987b;
        }
    }

    public final void o(i iVar) {
        iVar.f15986a = null;
        while (true) {
            i iVar2 = this.f15967c;
            if (iVar2 != i.f15985c) {
                i iVar3 = null;
                while (iVar2 != null) {
                    i iVar4 = iVar2.f15987b;
                    if (iVar2.f15986a != null) {
                        iVar3 = iVar2;
                    } else if (iVar3 != null) {
                        iVar3.f15987b = iVar4;
                        if (iVar3.f15986a == null) {
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

    public final String r(Object obj) {
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
        throw new UnsupportedOperationException("Method not decompiled: l0.a.get():java.lang.Object");
    }
}
