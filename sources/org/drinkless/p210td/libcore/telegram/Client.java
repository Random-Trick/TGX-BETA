package org.drinkless.p210td.libcore.telegram;

import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Keep;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p126j$.util.concurrent.ConcurrentHashMap;

public final class Client implements Runnable {
    public static final AtomicLong f25345W = new AtomicLong();
    public static volatile AbstractC7863e f25346X = null;
    public final ConcurrentHashMap<Long, C7864f> f25350P;
    public volatile AbstractC7861c f25352R;
    public final Thread f25355U;
    public final boolean f25356V;
    public final ReadWriteLock f25357a;
    public final Lock f25358b;
    public final Lock f25359c;
    public volatile boolean f25347M = false;
    public volatile boolean f25348N = false;
    public final AtomicLong f25351Q = new AtomicLong();
    public final long[] f25353S = new long[1000];
    public final TdApi.Object[] f25354T = new TdApi.Object[1000];
    public final long f25349O = NativeClient.createClient();

    public final class RunnableC7859a implements Runnable {
        public final String f25360a;

        public RunnableC7859a(String str) {
            this.f25360a = str;
        }

        public final void m14780a() {
            throw new C7862d("Fatal error (" + Client.f25345W.get() + "): " + this.f25360a);
        }

        @Override
        public void run() {
            if (Client.m14787k(this.f25360a)) {
                m14780a();
                return;
            }
            throw new C7860b("TDLib fatal error (" + Client.f25345W.get() + "): " + this.f25360a);
        }
    }

    public static final class C7860b extends RuntimeException {
        public C7860b(String str) {
            super(str);
        }
    }

    public interface AbstractC7861c {
        void mo2122a(Throwable th);
    }

    public static final class C7862d extends RuntimeException {
        public C7862d(String str) {
            super(str);
        }
    }

    public interface AbstractC7863e {
        void mo3307a(Client client, String str, boolean z);
    }

    public static class C7864f {
        public final TdApi.Function f25361a;
        public final long f25362b;
        public final AbstractC7865g f25363c;
        public final AbstractC7861c f25364d;

        public C7864f(TdApi.Function function, AbstractC7865g gVar, AbstractC7861c cVar) {
            this.f25361a = function;
            this.f25362b = function != null ? SystemClock.uptimeMillis() : -1L;
            this.f25363c = gVar;
            this.f25364d = cVar;
        }
    }

    public interface AbstractC7865g {
        void mo255t2(TdApi.Object object);
    }

    public Client(AbstractC7865g gVar, AbstractC7861c cVar, AbstractC7861c cVar2, boolean z) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f25357a = reentrantReadWriteLock;
        this.f25358b = reentrantReadWriteLock.readLock();
        this.f25359c = reentrantReadWriteLock.writeLock();
        ConcurrentHashMap<Long, C7864f> concurrentHashMap = new ConcurrentHashMap<>();
        this.f25350P = concurrentHashMap;
        this.f25352R = null;
        f25345W.incrementAndGet();
        this.f25356V = z;
        concurrentHashMap.put(0L, new C7864f(null, gVar, cVar));
        this.f25352R = cVar2;
        Thread thread = new Thread(this, "TDLib thread");
        this.f25355U = thread;
        thread.start();
    }

    public static Client m14794d(AbstractC7865g gVar, AbstractC7861c cVar, AbstractC7861c cVar2, boolean z) {
        return new Client(gVar, cVar, cVar2, z);
    }

    public static TdApi.Object m14793e(TdApi.Function function) {
        Objects.requireNonNull(function, "query is null");
        return NativeClient.clientExecute(function);
    }

    public static long m14792f() {
        return f25345W.get();
    }

    public static boolean m14789i(String str) {
        return str.contains("Wrong key or database is corrupted") || str.contains("SQL logic error or missing database") || str.contains("database disk image is malformed") || str.contains("file is encrypted or is not a database") || str.contains("unsupported file format");
    }

    public static boolean m14788j(String str) {
        return str.contains("PosixError : No space left on device") || str.contains("database or disk is full");
    }

    public static boolean m14787k(String str) {
        return m14789i(str) || m14788j(str) || str.contains("I/O error");
    }

    public static void m14786l(Client client, String str, boolean z) {
        if (f25346X != null) {
            f25346X.mo3307a(client, str, z);
        }
        new Thread(new RunnableC7859a(str), "TDLib fatal error thread").start();
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
        m14786l(null, str, false);
    }

    public static void m14781q(AbstractC7863e eVar) {
        f25346X = eVar;
    }

    public final String m14796b(TdApi.Function function, long j, TdApi.Error error) {
        StringBuilder sb2 = new StringBuilder("#");
        sb2.append(error.code);
        sb2.append(": ");
        sb2.append(error.message);
        sb2.append(" (");
        sb2.append(f25345W.get());
        sb2.append(")");
        if (this.f25356V) {
            sb2.append(" (debug)");
        }
        if (j != -1) {
            sb2.append(" (in ");
            sb2.append(SystemClock.uptimeMillis() - j);
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

    public void m14795c() {
        this.f25359c.lock();
        try {
            if (!this.f25348N) {
                if (!this.f25347M) {
                    m14783o(new TdApi.Close(), null);
                }
                this.f25348N = true;
                while (!this.f25347M) {
                    Thread.yield();
                }
                if (this.f25350P.size() != 1) {
                    m14784n(0.0d);
                    for (Long l : this.f25350P.keySet()) {
                        if (l.longValue() != 0) {
                            m14785m(l.longValue(), new TdApi.Error(500, "Client is closed"));
                        }
                    }
                }
                NativeClient.destroyClient(this.f25349O);
                f25345W.decrementAndGet();
            }
        } finally {
            this.f25359c.unlock();
        }
    }

    public void finalize() {
        try {
            m14795c();
        } finally {
            super.finalize();
        }
    }

    public Thread m14791g() {
        return this.f25355U;
    }

    public final void m14790h(TdApi.Object object, TdApi.Function function, long j, AbstractC7865g gVar, AbstractC7861c cVar) {
        if (gVar != null) {
            if (object instanceof TdApi.Error) {
                TdApi.Error error = (TdApi.Error) object;
                if (error.code == 0 && "Lost promise".equals(error.message)) {
                    m14786l(this, m14796b(function, j, error), true);
                }
            }
            try {
                gVar.mo255t2(object);
            } catch (Throwable th) {
                if (cVar == null) {
                    cVar = this.f25352R;
                }
                if (cVar != null) {
                    try {
                        cVar.mo2122a(th);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    public final void m14785m(long j, TdApi.Object object) {
        C7864f fVar;
        if (j == 0) {
            fVar = this.f25350P.get(Long.valueOf(j));
            if ((object instanceof TdApi.UpdateAuthorizationState) && (((TdApi.UpdateAuthorizationState) object).authorizationState instanceof TdApi.AuthorizationStateClosed)) {
                this.f25347M = true;
            }
        } else {
            fVar = this.f25350P.remove(Long.valueOf(j));
        }
        if (fVar == null) {
            Log.e("DLTD", "Can't find handler for the result " + j + " -- ignore result");
            return;
        }
        m14790h(object, fVar.f25361a, fVar.f25362b, fVar.f25363c, fVar.f25364d);
    }

    public final void m14784n(double d) {
        int clientReceive = NativeClient.clientReceive(this.f25349O, this.f25353S, this.f25354T, d);
        for (int i = 0; i < clientReceive; i++) {
            m14785m(this.f25353S[i], this.f25354T[i]);
            this.f25354T[i] = null;
        }
    }

    public void m14783o(TdApi.Function function, AbstractC7865g gVar) {
        m14782p(function, gVar, null);
    }

    public void m14782p(TdApi.Function function, AbstractC7865g gVar, AbstractC7861c cVar) {
        Objects.requireNonNull(function, "query is null");
        this.f25358b.lock();
        try {
            if (this.f25348N) {
                if (gVar != null) {
                    m14790h(new TdApi.Error(500, "Client is closed"), function, 0L, gVar, cVar);
                }
                return;
            }
            long incrementAndGet = this.f25351Q.incrementAndGet();
            this.f25350P.put(Long.valueOf(incrementAndGet), new C7864f(function, gVar, cVar));
            NativeClient.clientSend(this.f25349O, incrementAndGet, function);
        } finally {
            this.f25358b.unlock();
        }
    }

    @Override
    public void run() {
        while (!this.f25347M) {
            m14784n(300.0d);
        }
        Log.d("DLTD", "Stop TDLib thread");
    }
}
