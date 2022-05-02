package p158l0;

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
import p022b7.AbstractFutureC1291a;

public abstract class AbstractC6275a<V> implements AbstractFutureC1291a<V> {
    public static final boolean f19797M = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger f19798N = Logger.getLogger(AbstractC6275a.class.getName());
    public static final AbstractC6277b f19799O;
    public static final Object f19800P;
    public volatile Object f19801a;
    public volatile C6281e f19802b;
    public volatile C6285i f19803c;

    public static abstract class AbstractC6277b {
        public AbstractC6277b() {
        }

        public abstract boolean mo20728a(AbstractC6275a<?> aVar, C6281e eVar, C6281e eVar2);

        public abstract boolean mo20727b(AbstractC6275a<?> aVar, Object obj, Object obj2);

        public abstract boolean mo20726c(AbstractC6275a<?> aVar, C6285i iVar, C6285i iVar2);

        public abstract void mo20725d(C6285i iVar, C6285i iVar2);

        public abstract void mo20724e(C6285i iVar, Thread thread);
    }

    public static final class C6278c {
        public static final C6278c f19804c;
        public static final C6278c f19805d;
        public final boolean f19806a;
        public final Throwable f19807b;

        static {
            if (AbstractC6275a.f19797M) {
                f19805d = null;
                f19804c = null;
                return;
            }
            f19805d = new C6278c(false, null);
            f19804c = new C6278c(true, null);
        }

        public C6278c(boolean z, Throwable th) {
            this.f19806a = z;
            this.f19807b = th;
        }
    }

    public static final class C6279d {
        public static final C6279d f19808b = new C6279d(new C6280a("Failure occurred while trying to finish a future."));
        public final Throwable f19809a;

        public static class C6280a extends Throwable {
            public C6280a(String str) {
                super(str);
            }

            @Override
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public C6279d(Throwable th) {
            this.f19809a = (Throwable) AbstractC6275a.m20739e(th);
        }
    }

    public static final class C6281e {
        public static final C6281e f19810d = new C6281e(null, null);
        public final Runnable f19811a;
        public final Executor f19812b;
        public C6281e f19813c;

        public C6281e(Runnable runnable, Executor executor) {
            this.f19811a = runnable;
            this.f19812b = executor;
        }
    }

    public static final class C6282f extends AbstractC6277b {
        public final AtomicReferenceFieldUpdater<C6285i, Thread> f19814a;
        public final AtomicReferenceFieldUpdater<C6285i, C6285i> f19815b;
        public final AtomicReferenceFieldUpdater<AbstractC6275a, C6285i> f19816c;
        public final AtomicReferenceFieldUpdater<AbstractC6275a, C6281e> f19817d;
        public final AtomicReferenceFieldUpdater<AbstractC6275a, Object> f19818e;

        public C6282f(AtomicReferenceFieldUpdater<C6285i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C6285i, C6285i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC6275a, C6285i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC6275a, C6281e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC6275a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f19814a = atomicReferenceFieldUpdater;
            this.f19815b = atomicReferenceFieldUpdater2;
            this.f19816c = atomicReferenceFieldUpdater3;
            this.f19817d = atomicReferenceFieldUpdater4;
            this.f19818e = atomicReferenceFieldUpdater5;
        }

        @Override
        public boolean mo20728a(AbstractC6275a<?> aVar, C6281e eVar, C6281e eVar2) {
            return C6286b.m20721a(this.f19817d, aVar, eVar, eVar2);
        }

        @Override
        public boolean mo20727b(AbstractC6275a<?> aVar, Object obj, Object obj2) {
            return C6286b.m20721a(this.f19818e, aVar, obj, obj2);
        }

        @Override
        public boolean mo20726c(AbstractC6275a<?> aVar, C6285i iVar, C6285i iVar2) {
            return C6286b.m20721a(this.f19816c, aVar, iVar, iVar2);
        }

        @Override
        public void mo20725d(C6285i iVar, C6285i iVar2) {
            this.f19815b.lazySet(iVar, iVar2);
        }

        @Override
        public void mo20724e(C6285i iVar, Thread thread) {
            this.f19814a.lazySet(iVar, thread);
        }
    }

    public static final class RunnableC6283g<V> implements Runnable {
        public final AbstractC6275a<V> f19819a;
        public final AbstractFutureC1291a<? extends V> f19820b;

        @Override
        public void run() {
            if (this.f19819a.f19801a == this) {
                if (AbstractC6275a.f19799O.mo20727b(this.f19819a, this, AbstractC6275a.m20734j(this.f19820b))) {
                    AbstractC6275a.m20737g(this.f19819a);
                }
            }
        }
    }

    public static final class C6284h extends AbstractC6277b {
        public C6284h() {
            super();
        }

        @Override
        public boolean mo20728a(AbstractC6275a<?> aVar, C6281e eVar, C6281e eVar2) {
            synchronized (aVar) {
                if (aVar.f19802b != eVar) {
                    return false;
                }
                aVar.f19802b = eVar2;
                return true;
            }
        }

        @Override
        public boolean mo20727b(AbstractC6275a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f19801a != obj) {
                    return false;
                }
                aVar.f19801a = obj2;
                return true;
            }
        }

        @Override
        public boolean mo20726c(AbstractC6275a<?> aVar, C6285i iVar, C6285i iVar2) {
            synchronized (aVar) {
                if (aVar.f19803c != iVar) {
                    return false;
                }
                aVar.f19803c = iVar2;
                return true;
            }
        }

        @Override
        public void mo20725d(C6285i iVar, C6285i iVar2) {
            iVar.f19823b = iVar2;
        }

        @Override
        public void mo20724e(C6285i iVar, Thread thread) {
            iVar.f19822a = thread;
        }
    }

    public static final class C6285i {
        public static final C6285i f19821c = new C6285i(false);
        public volatile Thread f19822a;
        public volatile C6285i f19823b;

        public C6285i(boolean z) {
        }

        public void m20723a(C6285i iVar) {
            AbstractC6275a.f19799O.mo20725d(this, iVar);
        }

        public void m20722b() {
            Thread thread = this.f19822a;
            if (thread != null) {
                this.f19822a = null;
                LockSupport.unpark(thread);
            }
        }

        public C6285i() {
            AbstractC6275a.f19799O.mo20724e(this, Thread.currentThread());
        }
    }

    static {
        AbstractC6277b bVar;
        Throwable th;
        try {
            bVar = new C6282f(AtomicReferenceFieldUpdater.newUpdater(C6285i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C6285i.class, C6285i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC6275a.class, C6285i.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC6275a.class, C6281e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC6275a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            bVar = new C6284h();
        }
        f19799O = bVar;
        if (th != null) {
            f19798N.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f19800P = new Object();
    }

    public static CancellationException m20740d(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static <T> T m20739e(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    public static void m20737g(AbstractC6275a<?> aVar) {
        C6281e eVar = null;
        while (true) {
            aVar.m20731n();
            aVar.m20741c();
            C6281e f = aVar.m20738f(eVar);
            while (f != null) {
                eVar = f.f19813c;
                Runnable runnable = f.f19811a;
                if (runnable instanceof RunnableC6283g) {
                    RunnableC6283g gVar = (RunnableC6283g) runnable;
                    aVar = gVar.f19819a;
                    if (aVar.f19801a == gVar) {
                        if (f19799O.mo20727b(aVar, gVar, m20734j(gVar.f19820b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    m20736h(runnable, f.f19812b);
                }
                f = eVar;
            }
            return;
        }
    }

    public static void m20736h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f19798N;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object m20734j(AbstractFutureC1291a<?> aVar) {
        if (aVar instanceof AbstractC6275a) {
            Object obj = ((AbstractC6275a) aVar).f19801a;
            if (!(obj instanceof C6278c)) {
                return obj;
            }
            C6278c cVar = (C6278c) obj;
            return cVar.f19806a ? cVar.f19807b != null ? new C6278c(false, cVar.f19807b) : C6278c.f19805d : obj;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f19797M) && isCancelled) {
            return C6278c.f19805d;
        }
        try {
            Object k = m20733k(aVar);
            return k == null ? f19800P : k;
        } catch (CancellationException e) {
            if (isCancelled) {
                return new C6278c(false, e);
            }
            return new C6279d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e));
        } catch (ExecutionException e2) {
            return new C6279d(e2.getCause());
        } catch (Throwable th) {
            return new C6279d(th);
        }
    }

    public static <V> V m20733k(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    @Override
    public final void mo13371a(Runnable runnable, Executor executor) {
        m20739e(runnable);
        m20739e(executor);
        C6281e eVar = this.f19802b;
        if (eVar != C6281e.f19810d) {
            C6281e eVar2 = new C6281e(runnable, executor);
            do {
                eVar2.f19813c = eVar;
                if (!f19799O.mo20728a(this, eVar, eVar2)) {
                    eVar = this.f19802b;
                } else {
                    return;
                }
            } while (eVar != C6281e.f19810d);
            m20736h(runnable, executor);
        }
        m20736h(runnable, executor);
    }

    public final void m20742b(StringBuilder sb2) {
        try {
            Object k = m20733k(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(m20729r(k));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e2.getCause());
            sb2.append("]");
        }
    }

    public void m20741c() {
    }

    @Override
    public final boolean cancel(boolean z) {
        Object obj = this.f19801a;
        if (!(obj == null) && !(obj instanceof RunnableC6283g)) {
            return false;
        }
        C6278c cVar = f19797M ? new C6278c(z, new CancellationException("Future.cancel() was called.")) : z ? C6278c.f19804c : C6278c.f19805d;
        boolean z2 = false;
        AbstractC6275a<V> aVar = this;
        while (true) {
            if (f19799O.mo20727b(aVar, obj, cVar)) {
                if (z) {
                    aVar.m20732l();
                }
                m20737g(aVar);
                if (!(obj instanceof RunnableC6283g)) {
                    return true;
                }
                AbstractFutureC1291a<? extends V> aVar2 = ((RunnableC6283g) obj).f19820b;
                if (aVar2 instanceof AbstractC6275a) {
                    aVar = (AbstractC6275a) aVar2;
                    obj = aVar.f19801a;
                    if (!(obj == null) && !(obj instanceof RunnableC6283g)) {
                        return true;
                    }
                    z2 = true;
                } else {
                    aVar2.cancel(z);
                    return true;
                }
            } else {
                obj = aVar.f19801a;
                if (!(obj instanceof RunnableC6283g)) {
                    return z2;
                }
            }
        }
    }

    public final C6281e m20738f(C6281e eVar) {
        C6281e eVar2;
        do {
            eVar2 = this.f19802b;
        } while (!f19799O.mo20728a(this, eVar2, C6281e.f19810d));
        C6281e eVar3 = eVar;
        C6281e eVar4 = eVar2;
        while (eVar4 != null) {
            C6281e eVar5 = eVar4.f19813c;
            eVar4.f19813c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    @Override
    public final V get(long r20, java.util.concurrent.TimeUnit r22) {
        throw new UnsupportedOperationException("Method not decompiled: p158l0.AbstractC6275a.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final V m20735i(Object obj) {
        if (obj instanceof C6278c) {
            throw m20740d("Task was cancelled.", ((C6278c) obj).f19807b);
        } else if (obj instanceof C6279d) {
            throw new ExecutionException(((C6279d) obj).f19809a);
        } else if (obj == f19800P) {
            return null;
        } else {
            return obj;
        }
    }

    @Override
    public final boolean isCancelled() {
        return this.f19801a instanceof C6278c;
    }

    @Override
    public final boolean isDone() {
        Object obj = this.f19801a;
        return (!(obj instanceof RunnableC6283g)) & (obj != null);
    }

    public void m20732l() {
    }

    public String mo20710m() {
        Object obj = this.f19801a;
        if (obj instanceof RunnableC6283g) {
            return "setFuture=[" + m20729r(((RunnableC6283g) obj).f19820b) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    public final void m20731n() {
        C6285i iVar;
        do {
            iVar = this.f19803c;
        } while (!f19799O.mo20726c(this, iVar, C6285i.f19821c));
        while (iVar != null) {
            iVar.m20722b();
            iVar = iVar.f19823b;
        }
    }

    public final void m20730o(C6285i iVar) {
        iVar.f19822a = null;
        while (true) {
            C6285i iVar2 = this.f19803c;
            if (iVar2 != C6285i.f19821c) {
                C6285i iVar3 = null;
                while (iVar2 != null) {
                    C6285i iVar4 = iVar2.f19823b;
                    if (iVar2.f19822a != null) {
                        iVar3 = iVar2;
                    } else if (iVar3 != null) {
                        iVar3.f19823b = iVar4;
                        if (iVar3.f19822a == null) {
                            break;
                        }
                    } else if (!f19799O.mo20726c(this, iVar2, iVar4)) {
                        break;
                    }
                    iVar2 = iVar4;
                }
                return;
            }
            return;
        }
    }

    public boolean mo20709p(V v) {
        if (v == null) {
            v = (V) f19800P;
        }
        if (!f19799O.mo20727b(this, null, v)) {
            return false;
        }
        m20737g(this);
        return true;
    }

    public boolean mo20708q(Throwable th) {
        if (!f19799O.mo20727b(this, null, new C6279d((Throwable) m20739e(th)))) {
            return false;
        }
        m20737g(this);
        return true;
    }

    public final String m20729r(Object obj) {
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
            m20742b(sb2);
        } else {
            try {
                str = mo20710m();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                m20742b(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override
    public final V get() {
        throw new UnsupportedOperationException("Method not decompiled: p158l0.AbstractC6275a.get():java.lang.Object");
    }
}
