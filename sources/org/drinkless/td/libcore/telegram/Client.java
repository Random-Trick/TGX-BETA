package org.drinkless.td.libcore.telegram;

import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Keep;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.drinkless.td.libcore.telegram.TdApi;

public final class Client implements Runnable {
    public static final AtomicLong W = new AtomicLong();
    public static volatile e X = null;
    public final ConcurrentHashMap<Long, f> P;
    public volatile c R;
    public final Thread U;
    public final boolean V;
    public final ReadWriteLock f19895a;
    public final Lock f19896b;
    public final Lock f19897c;
    public volatile boolean M = false;
    public volatile boolean N = false;
    public final AtomicLong Q = new AtomicLong();
    public final long[] S = new long[1000];
    public final TdApi.Object[] T = new TdApi.Object[1000];
    public final long O = NativeClient.createClient();

    public final class a implements Runnable {
        public final String f19898a;

        public a(String str) {
            this.f19898a = str;
        }

        public final void a() {
            throw new d("Fatal error (" + Client.W.get() + "): " + this.f19898a);
        }

        @Override
        public void run() {
            if (Client.k(this.f19898a)) {
                a();
                return;
            }
            throw new b("TDLib fatal error (" + Client.W.get() + "): " + this.f19898a);
        }
    }

    public static final class b extends RuntimeException {
        public b(String str) {
            super(str);
        }
    }

    public interface c {
        void a(Throwable th);
    }

    public static final class d extends RuntimeException {
        public d(String str) {
            super(str);
        }
    }

    public interface e {
        void a(Client client, String str, boolean z10);
    }

    public static class f {
        public final TdApi.Function f19899a;
        public final long f19900b;
        public final g f19901c;
        public final c f19902d;

        public f(TdApi.Function function, g gVar, c cVar) {
            this.f19899a = function;
            this.f19900b = function != null ? SystemClock.uptimeMillis() : -1L;
            this.f19901c = gVar;
            this.f19902d = cVar;
        }
    }

    public interface g {
        void r2(TdApi.Object object);
    }

    public Client(g gVar, c cVar, c cVar2, boolean z10) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f19895a = reentrantReadWriteLock;
        this.f19896b = reentrantReadWriteLock.readLock();
        this.f19897c = reentrantReadWriteLock.writeLock();
        ConcurrentHashMap<Long, f> concurrentHashMap = new ConcurrentHashMap<>();
        this.P = concurrentHashMap;
        this.R = null;
        W.incrementAndGet();
        this.V = z10;
        concurrentHashMap.put(0L, new f(null, gVar, cVar));
        this.R = cVar2;
        Thread thread = new Thread(this, "TDLib thread");
        this.U = thread;
        thread.start();
    }

    public static Client d(g gVar, c cVar, c cVar2, boolean z10) {
        return new Client(gVar, cVar, cVar2, z10);
    }

    public static TdApi.Object e(TdApi.Function function) {
        Objects.requireNonNull(function, "query is null");
        return NativeClient.clientExecute(function);
    }

    public static long f() {
        return W.get();
    }

    public static boolean i(String str) {
        return str.contains("Wrong key or database is corrupted") || str.contains("SQL logic error or missing database") || str.contains("database disk image is malformed") || str.contains("file is encrypted or is not a database") || str.contains("unsupported file format");
    }

    public static boolean j(String str) {
        return str.contains("PosixError : No space left on device") || str.contains("database or disk is full");
    }

    public static boolean k(String str) {
        return i(str) || j(str) || str.contains("I/O error");
    }

    public static void l(Client client, String str, boolean z10) {
        if (X != null) {
            X.a(client, str, z10);
        }
        new Thread(new a(str), "TDLib fatal error thread").start();
        while (true) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Keep
    public static void onFatalError(String str) {
        l(null, str, false);
    }

    public static void q(e eVar) {
        X = eVar;
    }

    public final String b(TdApi.Function function, long j10, TdApi.Error error) {
        StringBuilder sb2 = new StringBuilder("#");
        sb2.append(error.code);
        sb2.append(": ");
        sb2.append(error.message);
        sb2.append(" (");
        sb2.append(W.get());
        sb2.append(")");
        if (this.V) {
            sb2.append(" (debug)");
        }
        if (j10 != -1) {
            sb2.append(" (in ");
            sb2.append(SystemClock.uptimeMillis() - j10);
            sb2.append("ms)");
        }
        sb2.append(": ");
        if (function != null) {
            sb2.append(function.toString().replace("\n", "\\n"));
        } else {
            sb2.append("updatesHandler");
        }
        return sb2.toString();
    }

    public void c() {
        this.f19897c.lock();
        try {
            if (!this.N) {
                if (!this.M) {
                    o(new TdApi.Close(), null);
                }
                this.N = true;
                while (!this.M) {
                    Thread.yield();
                }
                if (this.P.size() != 1) {
                    n(0.0d);
                    for (Long l10 : this.P.keySet()) {
                        if (l10.longValue() != 0) {
                            m(l10.longValue(), new TdApi.Error(500, "Client is closed"));
                        }
                    }
                }
                NativeClient.destroyClient(this.O);
                W.decrementAndGet();
            }
        } finally {
            this.f19897c.unlock();
        }
    }

    public void finalize() {
        try {
            c();
        } finally {
            super.finalize();
        }
    }

    public Thread g() {
        return this.U;
    }

    public final void h(TdApi.Object object, TdApi.Function function, long j10, g gVar, c cVar) {
        if (gVar != null) {
            if (object instanceof TdApi.Error) {
                TdApi.Error error = (TdApi.Error) object;
                if (error.code == 0 && "Lost promise".equals(error.message)) {
                    l(this, b(function, j10, error), true);
                }
            }
            try {
                gVar.r2(object);
            } catch (Throwable th) {
                if (cVar == null) {
                    cVar = this.R;
                }
                if (cVar != null) {
                    try {
                        cVar.a(th);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    public final void m(long j10, TdApi.Object object) {
        f fVar;
        if (j10 == 0) {
            fVar = this.P.get(Long.valueOf(j10));
            if ((object instanceof TdApi.UpdateAuthorizationState) && (((TdApi.UpdateAuthorizationState) object).authorizationState instanceof TdApi.AuthorizationStateClosed)) {
                this.M = true;
            }
        } else {
            fVar = this.P.remove(Long.valueOf(j10));
        }
        if (fVar == null) {
            Log.e("DLTD", "Can't find handler for the result " + j10 + " -- ignore result");
            return;
        }
        h(object, fVar.f19899a, fVar.f19900b, fVar.f19901c, fVar.f19902d);
    }

    public final void n(double d10) {
        int clientReceive = NativeClient.clientReceive(this.O, this.S, this.T, d10);
        for (int i10 = 0; i10 < clientReceive; i10++) {
            m(this.S[i10], this.T[i10]);
            this.T[i10] = null;
        }
    }

    public void o(TdApi.Function function, g gVar) {
        p(function, gVar, null);
    }

    public void p(TdApi.Function function, g gVar, c cVar) {
        Objects.requireNonNull(function, "query is null");
        this.f19896b.lock();
        try {
            if (this.N) {
                if (gVar != null) {
                    h(new TdApi.Error(500, "Client is closed"), function, 0L, gVar, cVar);
                }
                return;
            }
            long incrementAndGet = this.Q.incrementAndGet();
            this.P.put(Long.valueOf(incrementAndGet), new f(function, gVar, cVar));
            NativeClient.clientSend(this.O, incrementAndGet, function);
        } finally {
            this.f19896b.unlock();
        }
    }

    @Override
    public void run() {
        while (!this.M) {
            n(300.0d);
        }
        Log.d("DLTD", "Stop TDLib thread");
    }
}
