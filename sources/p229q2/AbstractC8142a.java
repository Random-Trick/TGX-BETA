package p229q2;

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
import p158l0.C6286b;

public abstract class AbstractC8142a<V> implements AbstractFutureC1291a<V> {
    public static final boolean f26425M = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger f26426N = Logger.getLogger(AbstractC8142a.class.getName());
    public static final AbstractC8144b f26427O;
    public static final Object f26428P;
    public volatile Object f26429a;
    public volatile C8148e f26430b;
    public volatile C8152i f26431c;

    public static abstract class AbstractC8144b {
        public AbstractC8144b() {
        }

        public abstract boolean mo13355a(AbstractC8142a<?> aVar, C8148e eVar, C8148e eVar2);

        public abstract boolean mo13354b(AbstractC8142a<?> aVar, Object obj, Object obj2);

        public abstract boolean mo13353c(AbstractC8142a<?> aVar, C8152i iVar, C8152i iVar2);

        public abstract void mo13352d(C8152i iVar, C8152i iVar2);

        public abstract void mo13351e(C8152i iVar, Thread thread);
    }

    public static final class C8145c {
        public static final C8145c f26432c;
        public static final C8145c f26433d;
        public final boolean f26434a;
        public final Throwable f26435b;

        static {
            if (AbstractC8142a.f26425M) {
                f26433d = null;
                f26432c = null;
                return;
            }
            f26433d = new C8145c(false, null);
            f26432c = new C8145c(true, null);
        }

        public C8145c(boolean z, Throwable th) {
            this.f26434a = z;
            this.f26435b = th;
        }
    }

    public static final class C8146d {
        public static final C8146d f26436b = new C8146d(new C8147a("Failure occurred while trying to finish a future."));
        public final Throwable f26437a;

        public class C8147a extends Throwable {
            public C8147a(String str) {
                super(str);
            }

            @Override
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public C8146d(Throwable th) {
            this.f26437a = (Throwable) AbstractC8142a.m13367e(th);
        }
    }

    public static final class C8148e {
        public static final C8148e f26438d = new C8148e(null, null);
        public final Runnable f26439a;
        public final Executor f26440b;
        public C8148e f26441c;

        public C8148e(Runnable runnable, Executor executor) {
            this.f26439a = runnable;
            this.f26440b = executor;
        }
    }

    public static final class C8149f extends AbstractC8144b {
        public final AtomicReferenceFieldUpdater<C8152i, Thread> f26442a;
        public final AtomicReferenceFieldUpdater<C8152i, C8152i> f26443b;
        public final AtomicReferenceFieldUpdater<AbstractC8142a, C8152i> f26444c;
        public final AtomicReferenceFieldUpdater<AbstractC8142a, C8148e> f26445d;
        public final AtomicReferenceFieldUpdater<AbstractC8142a, Object> f26446e;

        public C8149f(AtomicReferenceFieldUpdater<C8152i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C8152i, C8152i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC8142a, C8152i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC8142a, C8148e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC8142a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f26442a = atomicReferenceFieldUpdater;
            this.f26443b = atomicReferenceFieldUpdater2;
            this.f26444c = atomicReferenceFieldUpdater3;
            this.f26445d = atomicReferenceFieldUpdater4;
            this.f26446e = atomicReferenceFieldUpdater5;
        }

        @Override
        public boolean mo13355a(AbstractC8142a<?> aVar, C8148e eVar, C8148e eVar2) {
            return C6286b.m20721a(this.f26445d, aVar, eVar, eVar2);
        }

        @Override
        public boolean mo13354b(AbstractC8142a<?> aVar, Object obj, Object obj2) {
            return C6286b.m20721a(this.f26446e, aVar, obj, obj2);
        }

        @Override
        public boolean mo13353c(AbstractC8142a<?> aVar, C8152i iVar, C8152i iVar2) {
            return C6286b.m20721a(this.f26444c, aVar, iVar, iVar2);
        }

        @Override
        public void mo13352d(C8152i iVar, C8152i iVar2) {
            this.f26443b.lazySet(iVar, iVar2);
        }

        @Override
        public void mo13351e(C8152i iVar, Thread thread) {
            this.f26442a.lazySet(iVar, thread);
        }
    }

    public static final class RunnableC8150g<V> implements Runnable {
        public final AbstractC8142a<V> f26447a;
        public final AbstractFutureC1291a<? extends V> f26448b;

        public RunnableC8150g(AbstractC8142a<V> aVar, AbstractFutureC1291a<? extends V> aVar2) {
            this.f26447a = aVar;
            this.f26448b = aVar2;
        }

        @Override
        public void run() {
            if (this.f26447a.f26429a == this) {
                if (AbstractC8142a.f26427O.mo13354b(this.f26447a, this, AbstractC8142a.m13362j(this.f26448b))) {
                    AbstractC8142a.m13365g(this.f26447a);
                }
            }
        }
    }

    public static final class C8151h extends AbstractC8144b {
        public C8151h() {
            super();
        }

        @Override
        public boolean mo13355a(AbstractC8142a<?> aVar, C8148e eVar, C8148e eVar2) {
            synchronized (aVar) {
                if (aVar.f26430b != eVar) {
                    return false;
                }
                aVar.f26430b = eVar2;
                return true;
            }
        }

        @Override
        public boolean mo13354b(AbstractC8142a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f26429a != obj) {
                    return false;
                }
                aVar.f26429a = obj2;
                return true;
            }
        }

        @Override
        public boolean mo13353c(AbstractC8142a<?> aVar, C8152i iVar, C8152i iVar2) {
            synchronized (aVar) {
                if (aVar.f26431c != iVar) {
                    return false;
                }
                aVar.f26431c = iVar2;
                return true;
            }
        }

        @Override
        public void mo13352d(C8152i iVar, C8152i iVar2) {
            iVar.f26451b = iVar2;
        }

        @Override
        public void mo13351e(C8152i iVar, Thread thread) {
            iVar.f26450a = thread;
        }
    }

    public static final class C8152i {
        public static final C8152i f26449c = new C8152i(false);
        public volatile Thread f26450a;
        public volatile C8152i f26451b;

        public C8152i(boolean z) {
        }

        public void m13350a(C8152i iVar) {
            AbstractC8142a.f26427O.mo13352d(this, iVar);
        }

        public void m13349b() {
            Thread thread = this.f26450a;
            if (thread != null) {
                this.f26450a = null;
                LockSupport.unpark(thread);
            }
        }

        public C8152i() {
            AbstractC8142a.f26427O.mo13351e(this, Thread.currentThread());
        }
    }

    static {
        AbstractC8144b bVar;
        Throwable th;
        try {
            bVar = new C8149f(AtomicReferenceFieldUpdater.newUpdater(C8152i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C8152i.class, C8152i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC8142a.class, C8152i.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC8142a.class, C8148e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC8142a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            bVar = new C8151h();
        }
        f26427O = bVar;
        if (th != null) {
            f26426N.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f26428P = new Object();
    }

    public static CancellationException m13368d(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static <T> T m13367e(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    public static void m13365g(AbstractC8142a<?> aVar) {
        C8148e eVar = null;
        while (true) {
            aVar.m13358n();
            aVar.m13369c();
            C8148e f = aVar.m13366f(eVar);
            while (f != null) {
                eVar = f.f26441c;
                Runnable runnable = f.f26439a;
                if (runnable instanceof RunnableC8150g) {
                    RunnableC8150g gVar = (RunnableC8150g) runnable;
                    aVar = gVar.f26447a;
                    if (aVar.f26429a == gVar) {
                        if (f26427O.mo13354b(aVar, gVar, m13362j(gVar.f26448b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    m13364h(runnable, f.f26440b);
                }
                f = eVar;
            }
            return;
        }
    }

    public static void m13364h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f26426N;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object m13362j(AbstractFutureC1291a<?> aVar) {
        if (aVar instanceof AbstractC8142a) {
            Object obj = ((AbstractC8142a) aVar).f26429a;
            if (!(obj instanceof C8145c)) {
                return obj;
            }
            C8145c cVar = (C8145c) obj;
            return cVar.f26434a ? cVar.f26435b != null ? new C8145c(false, cVar.f26435b) : C8145c.f26433d : obj;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f26425M) && isCancelled) {
            return C8145c.f26433d;
        }
        try {
            Object k = m13361k(aVar);
            return k == null ? f26428P : k;
        } catch (CancellationException e) {
            if (isCancelled) {
                return new C8145c(false, e);
            }
            return new C8146d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e));
        } catch (ExecutionException e2) {
            return new C8146d(e2.getCause());
        } catch (Throwable th) {
            return new C8146d(th);
        }
    }

    public static <V> V m13361k(Future<V> future) {
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
        m13367e(runnable);
        m13367e(executor);
        C8148e eVar = this.f26430b;
        if (eVar != C8148e.f26438d) {
            C8148e eVar2 = new C8148e(runnable, executor);
            do {
                eVar2.f26441c = eVar;
                if (!f26427O.mo13355a(this, eVar, eVar2)) {
                    eVar = this.f26430b;
                } else {
                    return;
                }
            } while (eVar != C8148e.f26438d);
            m13364h(runnable, executor);
        }
        m13364h(runnable, executor);
    }

    public final void m13370b(StringBuilder sb2) {
        try {
            Object k = m13361k(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(m13356s(k));
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

    public void m13369c() {
    }

    @Override
    public final boolean cancel(boolean z) {
        C8145c cVar;
        Object obj = this.f26429a;
        if (!(obj == null) && !(obj instanceof RunnableC8150g)) {
            return false;
        }
        if (f26425M) {
            cVar = new C8145c(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            cVar = C8145c.f26432c;
        } else {
            cVar = C8145c.f26433d;
        }
        boolean z2 = false;
        AbstractC8142a<V> aVar = this;
        while (true) {
            if (f26427O.mo13354b(aVar, obj, cVar)) {
                if (z) {
                    aVar.m13360l();
                }
                m13365g(aVar);
                if (!(obj instanceof RunnableC8150g)) {
                    return true;
                }
                AbstractFutureC1291a<? extends V> aVar2 = ((RunnableC8150g) obj).f26448b;
                if (aVar2 instanceof AbstractC8142a) {
                    aVar = (AbstractC8142a) aVar2;
                    obj = aVar.f26429a;
                    if (!(obj == null) && !(obj instanceof RunnableC8150g)) {
                        return true;
                    }
                    z2 = true;
                } else {
                    aVar2.cancel(z);
                    return true;
                }
            } else {
                obj = aVar.f26429a;
                if (!(obj instanceof RunnableC8150g)) {
                    return z2;
                }
            }
        }
    }

    public final C8148e m13366f(C8148e eVar) {
        C8148e eVar2;
        do {
            eVar2 = this.f26430b;
        } while (!f26427O.mo13355a(this, eVar2, C8148e.f26438d));
        C8148e eVar3 = eVar;
        C8148e eVar4 = eVar2;
        while (eVar4 != null) {
            C8148e eVar5 = eVar4.f26441c;
            eVar4.f26441c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    @Override
    public final V get(long r20, java.util.concurrent.TimeUnit r22) {
        throw new UnsupportedOperationException("Method not decompiled: p229q2.AbstractC8142a.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final V m13363i(Object obj) {
        if (obj instanceof C8145c) {
            throw m13368d("Task was cancelled.", ((C8145c) obj).f26435b);
        } else if (obj instanceof C8146d) {
            throw new ExecutionException(((C8146d) obj).f26437a);
        } else if (obj == f26428P) {
            return null;
        } else {
            return obj;
        }
    }

    @Override
    public final boolean isCancelled() {
        return this.f26429a instanceof C8145c;
    }

    @Override
    public final boolean isDone() {
        Object obj = this.f26429a;
        return (!(obj instanceof RunnableC8150g)) & (obj != null);
    }

    public void m13360l() {
    }

    public String m13359m() {
        Object obj = this.f26429a;
        if (obj instanceof RunnableC8150g) {
            return "setFuture=[" + m13356s(((RunnableC8150g) obj).f26448b) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    public final void m13358n() {
        C8152i iVar;
        do {
            iVar = this.f26431c;
        } while (!f26427O.mo13353c(this, iVar, C8152i.f26449c));
        while (iVar != null) {
            iVar.m13349b();
            iVar = iVar.f26451b;
        }
    }

    public final void m13357o(C8152i iVar) {
        iVar.f26450a = null;
        while (true) {
            C8152i iVar2 = this.f26431c;
            if (iVar2 != C8152i.f26449c) {
                C8152i iVar3 = null;
                while (iVar2 != null) {
                    C8152i iVar4 = iVar2.f26451b;
                    if (iVar2.f26450a != null) {
                        iVar3 = iVar2;
                    } else if (iVar3 != null) {
                        iVar3.f26451b = iVar4;
                        if (iVar3.f26450a == null) {
                            break;
                        }
                    } else if (!f26427O.mo13353c(this, iVar2, iVar4)) {
                        break;
                    }
                    iVar2 = iVar4;
                }
                return;
            }
            return;
        }
    }

    public boolean mo13348p(V v) {
        if (v == null) {
            v = (V) f26428P;
        }
        if (!f26427O.mo13354b(this, null, v)) {
            return false;
        }
        m13365g(this);
        return true;
    }

    public boolean mo13347q(Throwable th) {
        if (!f26427O.mo13354b(this, null, new C8146d((Throwable) m13367e(th)))) {
            return false;
        }
        m13365g(this);
        return true;
    }

    public boolean mo13346r(AbstractFutureC1291a<? extends V> aVar) {
        C8146d dVar;
        m13367e(aVar);
        Object obj = this.f26429a;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!f26427O.mo13354b(this, null, m13362j(aVar))) {
                    return false;
                }
                m13365g(this);
                return true;
            }
            RunnableC8150g gVar = new RunnableC8150g(this, aVar);
            if (f26427O.mo13354b(this, null, gVar)) {
                try {
                    aVar.mo13371a(gVar, EnumC8153b.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new C8146d(th);
                    } catch (Throwable unused) {
                        dVar = C8146d.f26436b;
                    }
                    f26427O.mo13354b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f26429a;
        }
        if (obj instanceof C8145c) {
            aVar.cancel(((C8145c) obj).f26434a);
        }
        return false;
    }

    public final String m13356s(Object obj) {
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
            m13370b(sb2);
        } else {
            try {
                str = m13359m();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                m13370b(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override
    public final V get() {
        throw new UnsupportedOperationException("Method not decompiled: p229q2.AbstractC8142a.get():java.lang.Object");
    }
}
