package hc;

import ia.q;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import org.thunderdog.challegram.Log;
import ra.g;
import ra.k;

public class d extends b0 {
    public static final long f12633i;
    public static final long f12634j;
    public static d f12635k;
    public static final a f12636l = new a(null);
    public boolean f12637f;
    public d f12638g;
    public long f12639h;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }

        public final d c() {
            d dVar = d.f12635k;
            k.c(dVar);
            d dVar2 = dVar.f12638g;
            if (dVar2 == null) {
                long nanoTime = System.nanoTime();
                d.class.wait(d.f12633i);
                d dVar3 = d.f12635k;
                k.c(dVar3);
                if (dVar3.f12638g != null || System.nanoTime() - nanoTime < d.f12634j) {
                    return null;
                }
                return d.f12635k;
            }
            long u10 = dVar2.u(System.nanoTime());
            if (u10 > 0) {
                long j10 = u10 / 1000000;
                d.class.wait(j10, (int) (u10 - (1000000 * j10)));
                return null;
            }
            d dVar4 = d.f12635k;
            k.c(dVar4);
            dVar4.f12638g = dVar2.f12638g;
            dVar2.f12638g = null;
            return dVar2;
        }

        public final boolean d(d dVar) {
            synchronized (d.class) {
                for (d dVar2 = d.f12635k; dVar2 != null; dVar2 = dVar2.f12638g) {
                    if (dVar2.f12638g == dVar) {
                        dVar2.f12638g = dVar.f12638g;
                        dVar.f12638g = null;
                        return false;
                    }
                }
                return true;
            }
        }

        public final void e(d dVar, long j10, boolean z10) {
            synchronized (d.class) {
                if (d.f12635k == null) {
                    d.f12635k = new d();
                    new b().start();
                }
                long nanoTime = System.nanoTime();
                int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                if (i10 != 0 && z10) {
                    dVar.f12639h = Math.min(j10, dVar.c() - nanoTime) + nanoTime;
                } else if (i10 != 0) {
                    dVar.f12639h = j10 + nanoTime;
                } else if (z10) {
                    dVar.f12639h = dVar.c();
                } else {
                    throw new AssertionError();
                }
                long u10 = dVar.u(nanoTime);
                d dVar2 = d.f12635k;
                k.c(dVar2);
                while (dVar2.f12638g != null) {
                    d dVar3 = dVar2.f12638g;
                    k.c(dVar3);
                    if (u10 < dVar3.u(nanoTime)) {
                        break;
                    }
                    dVar2 = dVar2.f12638g;
                    k.c(dVar2);
                }
                dVar.f12638g = dVar2.f12638g;
                dVar2.f12638g = dVar;
                if (dVar2 == d.f12635k) {
                    d.class.notify();
                }
                q qVar = q.f14159a;
            }
        }
    }

    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override
        public void run() {
            d c10;
            while (true) {
                try {
                    synchronized (d.class) {
                        c10 = d.f12636l.c();
                        if (c10 == d.f12635k) {
                            d.f12635k = null;
                            return;
                        }
                        q qVar = q.f14159a;
                    }
                    if (c10 != null) {
                        c10.x();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public static final class c implements y {
        public final y f12641b;

        public c(y yVar) {
            this.f12641b = yVar;
        }

        @Override
        public void c0(e eVar, long j10) {
            k.e(eVar, "source");
            hc.c.b(eVar.size(), 0L, j10);
            while (true) {
                long j11 = 0;
                if (j10 > 0) {
                    v vVar = eVar.f12644a;
                    k.c(vVar);
                    while (true) {
                        if (j11 >= ((long) Log.TAG_COMPRESS)) {
                            break;
                        }
                        j11 += vVar.f12674c - vVar.f12673b;
                        if (j11 >= j10) {
                            j11 = j10;
                            break;
                        } else {
                            vVar = vVar.f12677f;
                            k.c(vVar);
                        }
                    }
                    d dVar = d.this;
                    dVar.r();
                    try {
                        this.f12641b.c0(eVar, j11);
                        q qVar = q.f14159a;
                        if (!dVar.s()) {
                            j10 -= j11;
                        } else {
                            throw dVar.m(null);
                        }
                    } catch (IOException e10) {
                        if (dVar.s()) {
                            throw dVar.m(e10);
                        }
                        throw e10;
                    } finally {
                        dVar.s();
                    }
                } else {
                    return;
                }
            }
        }

        @Override
        public void close() {
            d dVar = d.this;
            dVar.r();
            try {
                this.f12641b.close();
                q qVar = q.f14159a;
                if (dVar.s()) {
                    throw dVar.m(null);
                }
            } catch (IOException e10) {
                if (dVar.s()) {
                    throw dVar.m(e10);
                }
            } finally {
                dVar.s();
            }
        }

        @Override
        public void flush() {
            d dVar = d.this;
            dVar.r();
            try {
                this.f12641b.flush();
                q qVar = q.f14159a;
                if (dVar.s()) {
                    throw dVar.m(null);
                }
            } catch (IOException e10) {
                if (dVar.s()) {
                    throw dVar.m(e10);
                }
            } finally {
                dVar.s();
            }
        }

        public d c() {
            return d.this;
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f12641b + ')';
        }
    }

    public static final class C0117d implements a0 {
        public final a0 f12643b;

        public C0117d(a0 a0Var) {
            this.f12643b = a0Var;
        }

        @Override
        public long A(e eVar, long j10) {
            k.e(eVar, "sink");
            d dVar = d.this;
            dVar.r();
            try {
                long A = this.f12643b.A(eVar, j10);
                if (!dVar.s()) {
                    return A;
                }
                throw dVar.m(null);
            } catch (IOException e10) {
                if (!dVar.s()) {
                    throw e10;
                }
                throw dVar.m(e10);
            } finally {
                dVar.s();
            }
        }

        @Override
        public void close() {
            d dVar = d.this;
            dVar.r();
            try {
                this.f12643b.close();
                q qVar = q.f14159a;
                if (dVar.s()) {
                    throw dVar.m(null);
                }
            } catch (IOException e10) {
                if (dVar.s()) {
                    throw dVar.m(e10);
                }
            } finally {
                dVar.s();
            }
        }

        public d c() {
            return d.this;
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f12643b + ')';
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f12633i = millis;
        f12634j = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final IOException m(IOException iOException) {
        return t(iOException);
    }

    public final void r() {
        if (!this.f12637f) {
            long h10 = h();
            boolean e10 = e();
            if (h10 != 0 || e10) {
                this.f12637f = true;
                f12636l.e(this, h10, e10);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit".toString());
    }

    public final boolean s() {
        if (!this.f12637f) {
            return false;
        }
        this.f12637f = false;
        return f12636l.d(this);
    }

    public IOException t(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final long u(long j10) {
        return this.f12639h - j10;
    }

    public final y v(y yVar) {
        k.e(yVar, "sink");
        return new c(yVar);
    }

    public final a0 w(a0 a0Var) {
        k.e(a0Var, "source");
        return new C0117d(a0Var);
    }

    public void x() {
    }
}
