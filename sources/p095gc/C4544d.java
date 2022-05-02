package p095gc;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import org.thunderdog.challegram.Log;
import p107ha.C5060q;
import qa.C8294g;
import qa.C8298k;

public class C4544d extends C4539b0 {
    public static final long f14959i;
    public static final long f14960j;
    public static C4544d f14961k;
    public static final C4545a f14962l = new C4545a(null);
    public boolean f14963f;
    public C4544d f14964g;
    public long f14965h;

    public static final class C4545a {
        public C4545a() {
        }

        public final C4544d m27454c() {
            C4544d dVar = C4544d.f14961k;
            C8298k.m12935c(dVar);
            C4544d dVar2 = dVar.f14964g;
            if (dVar2 == null) {
                long nanoTime = System.nanoTime();
                C4544d.class.wait(C4544d.f14959i);
                C4544d dVar3 = C4544d.f14961k;
                C8298k.m12935c(dVar3);
                if (dVar3.f14964g != null || System.nanoTime() - nanoTime < C4544d.f14960j) {
                    return null;
                }
                return C4544d.f14961k;
            }
            long u = dVar2.m27459u(System.nanoTime());
            if (u > 0) {
                long j = u / 1000000;
                C4544d.class.wait(j, (int) (u - (1000000 * j)));
                return null;
            }
            C4544d dVar4 = C4544d.f14961k;
            C8298k.m12935c(dVar4);
            dVar4.f14964g = dVar2.f14964g;
            dVar2.f14964g = null;
            return dVar2;
        }

        public final boolean m27453d(C4544d dVar) {
            synchronized (C4544d.class) {
                for (C4544d dVar2 = C4544d.f14961k; dVar2 != null; dVar2 = dVar2.f14964g) {
                    if (dVar2.f14964g == dVar) {
                        dVar2.f14964g = dVar.f14964g;
                        dVar.f14964g = null;
                        return false;
                    }
                }
                return true;
            }
        }

        public final void m27452e(C4544d dVar, long j, boolean z) {
            synchronized (C4544d.class) {
                if (C4544d.f14961k == null) {
                    C4544d.f14961k = new C4544d();
                    new C4546b().start();
                }
                long nanoTime = System.nanoTime();
                int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (i != 0 && z) {
                    dVar.f14965h = Math.min(j, dVar.mo27395c() - nanoTime) + nanoTime;
                } else if (i != 0) {
                    dVar.f14965h = j + nanoTime;
                } else if (z) {
                    dVar.f14965h = dVar.mo27395c();
                } else {
                    throw new AssertionError();
                }
                long u = dVar.m27459u(nanoTime);
                C4544d dVar2 = C4544d.f14961k;
                C8298k.m12935c(dVar2);
                while (dVar2.f14964g != null) {
                    C4544d dVar3 = dVar2.f14964g;
                    C8298k.m12935c(dVar3);
                    if (u < dVar3.m27459u(nanoTime)) {
                        break;
                    }
                    dVar2 = dVar2.f14964g;
                    C8298k.m12935c(dVar2);
                }
                dVar.f14964g = dVar2.f14964g;
                dVar2.f14964g = dVar;
                if (dVar2 == C4544d.f14961k) {
                    C4544d.class.notify();
                }
                C5060q qVar = C5060q.f17066a;
            }
        }

        public C4545a(C8294g gVar) {
            this();
        }
    }

    public static final class C4546b extends Thread {
        public C4546b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override
        public void run() {
            C4544d c;
            while (true) {
                try {
                    synchronized (C4544d.class) {
                        c = C4544d.f14962l.m27454c();
                        if (c == C4544d.f14961k) {
                            C4544d.f14961k = null;
                            return;
                        }
                        C5060q qVar = C5060q.f17066a;
                    }
                    if (c != null) {
                        c.mo4984x();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public static final class C4547c implements AbstractC4572y {
        public final AbstractC4572y f14967b;

        public C4547c(AbstractC4572y yVar) {
            this.f14967b = yVar;
        }

        @Override
        public void close() {
            C4544d dVar = C4544d.this;
            dVar.m27461r();
            try {
                this.f14967b.close();
                C5060q qVar = C5060q.f17066a;
                if (dVar.m27460s()) {
                    throw dVar.m27466m(null);
                }
            } catch (IOException e) {
                if (dVar.m27460s()) {
                    throw dVar.m27466m(e);
                }
            } finally {
                dVar.m27460s();
            }
        }

        @Override
        public void flush() {
            C4544d dVar = C4544d.this;
            dVar.m27461r();
            try {
                this.f14967b.flush();
                C5060q qVar = C5060q.f17066a;
                if (dVar.m27460s()) {
                    throw dVar.m27466m(null);
                }
            } catch (IOException e) {
                if (dVar.m27460s()) {
                    throw dVar.m27466m(e);
                }
            } finally {
                dVar.m27460s();
            }
        }

        @Override
        public void mo5030h0(C4549e eVar, long j) {
            C8298k.m12933e(eVar, "source");
            C4542c.m27477b(eVar.size(), 0L, j);
            while (true) {
                long j2 = 0;
                if (j > 0) {
                    C4568v vVar = eVar.f14970a;
                    C8298k.m12935c(vVar);
                    while (true) {
                        if (j2 >= ((long) Log.TAG_COMPRESS)) {
                            break;
                        }
                        j2 += vVar.f15006c - vVar.f15005b;
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        } else {
                            vVar = vVar.f15009f;
                            C8298k.m12935c(vVar);
                        }
                    }
                    C4544d dVar = C4544d.this;
                    dVar.m27461r();
                    try {
                        this.f14967b.mo5030h0(eVar, j2);
                        C5060q qVar = C5060q.f17066a;
                        if (!dVar.m27460s()) {
                            j -= j2;
                        } else {
                            throw dVar.m27466m(null);
                        }
                    } catch (IOException e) {
                        if (dVar.m27460s()) {
                            throw dVar.m27466m(e);
                        }
                        throw e;
                    } finally {
                        dVar.m27460s();
                    }
                } else {
                    return;
                }
            }
        }

        public C4544d mo27303c() {
            return C4544d.this;
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f14967b + ')';
        }
    }

    public static final class C4548d implements AbstractC4537a0 {
        public final AbstractC4537a0 f14969b;

        public C4548d(AbstractC4537a0 a0Var) {
            this.f14969b = a0Var;
        }

        @Override
        public void close() {
            C4544d dVar = C4544d.this;
            dVar.m27461r();
            try {
                this.f14969b.close();
                C5060q qVar = C5060q.f17066a;
                if (dVar.m27460s()) {
                    throw dVar.m27466m(null);
                }
            } catch (IOException e) {
                if (dVar.m27460s()) {
                    throw dVar.m27466m(e);
                }
            } finally {
                dVar.m27460s();
            }
        }

        public C4544d mo27336c() {
            return C4544d.this;
        }

        @Override
        public long mo5028s(C4549e eVar, long j) {
            C8298k.m12933e(eVar, "sink");
            C4544d dVar = C4544d.this;
            dVar.m27461r();
            try {
                long s = this.f14969b.mo5028s(eVar, j);
                if (!dVar.m27460s()) {
                    return s;
                }
                throw dVar.m27466m(null);
            } catch (IOException e) {
                if (!dVar.m27460s()) {
                    throw e;
                }
                throw dVar.m27466m(e);
            } finally {
                dVar.m27460s();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f14969b + ')';
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f14959i = millis;
        f14960j = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final IOException m27466m(IOException iOException) {
        return mo27302t(iOException);
    }

    public final void m27461r() {
        if (!this.f14963f) {
            long h = m27479h();
            boolean e = mo27393e();
            if (h != 0 || e) {
                this.f14963f = true;
                f14962l.m27452e(this, h, e);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit".toString());
    }

    public final boolean m27460s() {
        if (!this.f14963f) {
            return false;
        }
        this.f14963f = false;
        return f14962l.m27453d(this);
    }

    public IOException mo27302t(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final long m27459u(long j) {
        return this.f14965h - j;
    }

    public final AbstractC4572y m27458v(AbstractC4572y yVar) {
        C8298k.m12933e(yVar, "sink");
        return new C4547c(yVar);
    }

    public final AbstractC4537a0 m27457w(AbstractC4537a0 a0Var) {
        C8298k.m12933e(a0Var, "source");
        return new C4548d(a0Var);
    }

    public void mo4984x() {
    }
}
