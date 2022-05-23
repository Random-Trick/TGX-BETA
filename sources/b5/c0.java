package b5;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import c5.j0;
import c5.l0;
import c5.s;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

public final class c0 {
    public static final c f3832d = g(false, -9223372036854775807L);
    public static final c f3833e = g(true, -9223372036854775807L);
    public static final c f3834f = new c(2, -9223372036854775807L);
    public static final c f3835g = new c(3, -9223372036854775807L);
    public final ExecutorService f3836a;
    public d<? extends e> f3837b;
    public IOException f3838c;

    public interface b<T extends e> {
        void f(T t10, long j10, long j11, boolean z10);

        c l(T t10, long j10, long j11, IOException iOException, int i10);

        void t(T t10, long j10, long j11);
    }

    public static final class c {
        public final int f3839a;
        public final long f3840b;

        public boolean c() {
            int i10 = this.f3839a;
            return i10 == 0 || i10 == 1;
        }

        public c(int i10, long j10) {
            this.f3839a = i10;
            this.f3840b = j10;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public final class d<T extends e> extends Handler implements Runnable {
        public b<T> M;
        public IOException N;
        public int O;
        public Thread P;
        public boolean Q;
        public volatile boolean R;
        public final int f3841a;
        public final T f3842b;
        public final long f3843c;

        public d(Looper looper, T t10, b<T> bVar, int i10, long j10) {
            super(looper);
            this.f3842b = t10;
            this.M = bVar;
            this.f3841a = i10;
            this.f3843c = j10;
        }

        public void a(boolean z10) {
            this.R = z10;
            this.N = null;
            if (hasMessages(0)) {
                this.Q = true;
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.Q = true;
                    this.f3842b.c();
                    Thread thread = this.P;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z10) {
                c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((b) c5.a.e(this.M)).f(this.f3842b, elapsedRealtime, elapsedRealtime - this.f3843c, true);
                this.M = null;
            }
        }

        public final void b() {
            this.N = null;
            c0.this.f3836a.execute((Runnable) c5.a.e(c0.this.f3837b));
        }

        public final void c() {
            c0.this.f3837b = null;
        }

        public final long d() {
            return Math.min((this.O - 1) * 1000, 5000);
        }

        public void e(int i10) {
            IOException iOException = this.N;
            if (iOException != null && this.O > i10) {
                throw iOException;
            }
        }

        public void f(long j10) {
            c5.a.f(c0.this.f3837b == null);
            c0.this.f3837b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(0, j10);
            } else {
                b();
            }
        }

        @Override
        public void handleMessage(Message message) {
            long j10;
            if (!this.R) {
                int i10 = message.what;
                if (i10 == 0) {
                    b();
                } else if (i10 != 3) {
                    c();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j11 = elapsedRealtime - this.f3843c;
                    b bVar = (b) c5.a.e(this.M);
                    if (this.Q) {
                        bVar.f(this.f3842b, elapsedRealtime, j11, false);
                        return;
                    }
                    int i11 = message.what;
                    if (i11 == 1) {
                        try {
                            bVar.t(this.f3842b, elapsedRealtime, j11);
                        } catch (RuntimeException e10) {
                            s.d("LoadTask", "Unexpected exception handling load completed", e10);
                            c0.this.f3838c = new h(e10);
                        }
                    } else if (i11 == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.N = iOException;
                        int i12 = this.O + 1;
                        this.O = i12;
                        c l10 = bVar.l(this.f3842b, elapsedRealtime, j11, iOException, i12);
                        if (l10.f3839a == 3) {
                            c0.this.f3838c = this.N;
                        } else if (l10.f3839a != 2) {
                            if (l10.f3839a == 1) {
                                this.O = 1;
                            }
                            if (l10.f3840b != -9223372036854775807L) {
                                j10 = l10.f3840b;
                            } else {
                                j10 = d();
                            }
                            f(j10);
                        }
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }

        @Override
        public void run() {
            boolean z10;
            try {
                synchronized (this) {
                    z10 = !this.Q;
                    this.P = Thread.currentThread();
                }
                if (z10) {
                    String simpleName = this.f3842b.getClass().getSimpleName();
                    j0.a(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                    try {
                        this.f3842b.b();
                        j0.c();
                    } catch (Throwable th) {
                        j0.c();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.P = null;
                    Thread.interrupted();
                }
                if (!this.R) {
                    sendEmptyMessage(1);
                }
            } catch (IOException e10) {
                if (!this.R) {
                    obtainMessage(2, e10).sendToTarget();
                }
            } catch (Error e11) {
                if (!this.R) {
                    s.d("LoadTask", "Unexpected error loading stream", e11);
                    obtainMessage(3, e11).sendToTarget();
                }
                throw e11;
            } catch (Exception e12) {
                if (!this.R) {
                    s.d("LoadTask", "Unexpected exception loading stream", e12);
                    obtainMessage(2, new h(e12)).sendToTarget();
                }
            } catch (OutOfMemoryError e13) {
                if (!this.R) {
                    s.d("LoadTask", "OutOfMemory error loading stream", e13);
                    obtainMessage(2, new h(e13)).sendToTarget();
                }
            }
        }
    }

    public interface e {
        void b();

        void c();
    }

    public interface f {
        void b();
    }

    public static final class g implements Runnable {
        public final f f3844a;

        public g(f fVar) {
            this.f3844a = fVar;
        }

        @Override
        public void run() {
            this.f3844a.b();
        }
    }

    public static final class h extends IOException {
        public h(java.lang.Throwable r5) {
            throw new UnsupportedOperationException("Method not decompiled: b5.c0.h.<init>(java.lang.Throwable):void");
        }
    }

    public c0(String str) {
        String valueOf = String.valueOf(str);
        this.f3836a = l0.s0(valueOf.length() != 0 ? "ExoPlayer:Loader:".concat(valueOf) : new String("ExoPlayer:Loader:"));
    }

    public static c g(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10);
    }

    public void e() {
        ((d) c5.a.h(this.f3837b)).a(false);
    }

    public void f() {
        this.f3838c = null;
    }

    public boolean h() {
        return this.f3838c != null;
    }

    public boolean i() {
        return this.f3837b != null;
    }

    public void j(int i10) {
        IOException iOException = this.f3838c;
        if (iOException == null) {
            d<? extends e> dVar = this.f3837b;
            if (dVar != null) {
                if (i10 == Integer.MIN_VALUE) {
                    i10 = dVar.f3841a;
                }
                dVar.e(i10);
                return;
            }
            return;
        }
        throw iOException;
    }

    public void k(f fVar) {
        d<? extends e> dVar = this.f3837b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f3836a.execute(new g(fVar));
        }
        this.f3836a.shutdown();
    }

    public <T extends e> long l(T t10, b<T> bVar, int i10) {
        this.f3838c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new d((Looper) c5.a.h(Looper.myLooper()), t10, bVar, i10, elapsedRealtime).f(0L);
        return elapsedRealtime;
    }
}
