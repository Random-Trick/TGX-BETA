package p006a5;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import p020b5.C1186a;
import p020b5.C1210j0;
import p020b5.C1216l0;
import p020b5.C1230s;

public final class C0122c0 {
    public static final C0125c f470d = m42249g(false, -9223372036854775807L);
    public static final C0125c f471e = m42249g(true, -9223372036854775807L);
    public static final C0125c f472f = new C0125c(2, -9223372036854775807L);
    public static final C0125c f473g = new C0125c(3, -9223372036854775807L);
    public final ExecutorService f474a;
    public HandlerC0126d<? extends AbstractC0127e> f475b;
    public IOException f476c;

    public interface AbstractC0124b<T extends AbstractC0127e> {
        void mo17454i(T t, long j, long j2, boolean z);

        C0125c mo17453j(T t, long j, long j2, IOException iOException, int i);

        void mo17452l(T t, long j, long j2);
    }

    public static final class C0125c {
        public final int f477a;
        public final long f478b;

        public boolean m42241c() {
            int i = this.f477a;
            return i == 0 || i == 1;
        }

        public C0125c(int i, long j) {
            this.f477a = i;
            this.f478b = j;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public final class HandlerC0126d<T extends AbstractC0127e> extends Handler implements Runnable {
        public AbstractC0124b<T> f479M;
        public IOException f480N;
        public int f481O;
        public Thread f482P;
        public boolean f483Q;
        public volatile boolean f484R;
        public final int f486a;
        public final T f487b;
        public final long f488c;

        public HandlerC0126d(Looper looper, T t, AbstractC0124b<T> bVar, int i, long j) {
            super(looper);
            this.f487b = t;
            this.f479M = bVar;
            this.f486a = i;
            this.f488c = j;
        }

        public void m42240a(boolean z) {
            this.f484R = z;
            this.f480N = null;
            if (hasMessages(0)) {
                this.f483Q = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f483Q = true;
                    this.f487b.mo17445c();
                    Thread thread = this.f482P;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z) {
                m42238c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((AbstractC0124b) C1186a.m38185e(this.f479M)).mo17454i(this.f487b, elapsedRealtime, elapsedRealtime - this.f488c, true);
                this.f479M = null;
            }
        }

        public final void m42239b() {
            this.f480N = null;
            C0122c0.this.f474a.execute((Runnable) C1186a.m38185e(C0122c0.this.f475b));
        }

        public final void m42238c() {
            C0122c0.this.f475b = null;
        }

        public final long m42237d() {
            return Math.min((this.f481O - 1) * 1000, 5000);
        }

        public void m42236e(int i) {
            IOException iOException = this.f480N;
            if (iOException != null && this.f481O > i) {
                throw iOException;
            }
        }

        public void m42235f(long j) {
            C1186a.m38184f(C0122c0.this.f475b == null);
            C0122c0.this.f475b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                m42239b();
            }
        }

        @Override
        public void handleMessage(Message message) {
            long j;
            if (!this.f484R) {
                int i = message.what;
                if (i == 0) {
                    m42239b();
                } else if (i != 3) {
                    m42238c();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j2 = elapsedRealtime - this.f488c;
                    AbstractC0124b bVar = (AbstractC0124b) C1186a.m38185e(this.f479M);
                    if (this.f483Q) {
                        bVar.mo17454i(this.f487b, elapsedRealtime, j2, false);
                        return;
                    }
                    int i2 = message.what;
                    if (i2 == 1) {
                        try {
                            bVar.mo17452l(this.f487b, elapsedRealtime, j2);
                        } catch (RuntimeException e) {
                            C1230s.m37886d("LoadTask", "Unexpected exception handling load completed", e);
                            C0122c0.this.f476c = new C0130h(e);
                        }
                    } else if (i2 == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.f480N = iOException;
                        int i3 = this.f481O + 1;
                        this.f481O = i3;
                        C0125c j3 = bVar.mo17453j(this.f487b, elapsedRealtime, j2, iOException, i3);
                        if (j3.f477a == 3) {
                            C0122c0.this.f476c = this.f480N;
                        } else if (j3.f477a != 2) {
                            if (j3.f477a == 1) {
                                this.f481O = 1;
                            }
                            if (j3.f478b != -9223372036854775807L) {
                                j = j3.f478b;
                            } else {
                                j = m42237d();
                            }
                            m42235f(j);
                        }
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }

        @Override
        public void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = !this.f483Q;
                    this.f482P = Thread.currentThread();
                }
                if (z) {
                    String simpleName = this.f487b.getClass().getSimpleName();
                    C1210j0.m38035a(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                    try {
                        this.f487b.mo17446b();
                        C1210j0.m38033c();
                    } catch (Throwable th) {
                        C1210j0.m38033c();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f482P = null;
                    Thread.interrupted();
                }
                if (!this.f484R) {
                    sendEmptyMessage(1);
                }
            } catch (IOException e) {
                if (!this.f484R) {
                    obtainMessage(2, e).sendToTarget();
                }
            } catch (Error e2) {
                if (!this.f484R) {
                    C1230s.m37886d("LoadTask", "Unexpected error loading stream", e2);
                    obtainMessage(3, e2).sendToTarget();
                }
                throw e2;
            } catch (Exception e3) {
                if (!this.f484R) {
                    C1230s.m37886d("LoadTask", "Unexpected exception loading stream", e3);
                    obtainMessage(2, new C0130h(e3)).sendToTarget();
                }
            } catch (OutOfMemoryError e4) {
                if (!this.f484R) {
                    C1230s.m37886d("LoadTask", "OutOfMemory error loading stream", e4);
                    obtainMessage(2, new C0130h(e4)).sendToTarget();
                }
            }
        }
    }

    public interface AbstractC0127e {
        void mo17446b();

        void mo17445c();
    }

    public interface AbstractC0128f {
        void mo17462b();
    }

    public static final class RunnableC0129g implements Runnable {
        public final AbstractC0128f f489a;

        public RunnableC0129g(AbstractC0128f fVar) {
            this.f489a = fVar;
        }

        @Override
        public void run() {
            this.f489a.mo17462b();
        }
    }

    public static final class C0130h extends IOException {
        public C0130h(java.lang.Throwable r5) {
            throw new UnsupportedOperationException("Method not decompiled: p006a5.C0122c0.C0130h.<init>(java.lang.Throwable):void");
        }
    }

    public C0122c0(String str) {
        String valueOf = String.valueOf(str);
        this.f474a = C1216l0.m37951r0(valueOf.length() != 0 ? "ExoPlayer:Loader:".concat(valueOf) : new String("ExoPlayer:Loader:"));
    }

    public static C0125c m42249g(boolean z, long j) {
        return new C0125c(z ? 1 : 0, j);
    }

    public void m42251e() {
        ((HandlerC0126d) C1186a.m38182h(this.f475b)).m42240a(false);
    }

    public void m42250f() {
        this.f476c = null;
    }

    public boolean m42248h() {
        return this.f476c != null;
    }

    public boolean m42247i() {
        return this.f475b != null;
    }

    public void m42246j(int i) {
        IOException iOException = this.f476c;
        if (iOException == null) {
            HandlerC0126d<? extends AbstractC0127e> dVar = this.f475b;
            if (dVar != null) {
                if (i == Integer.MIN_VALUE) {
                    i = dVar.f486a;
                }
                dVar.m42236e(i);
                return;
            }
            return;
        }
        throw iOException;
    }

    public void m42245k(AbstractC0128f fVar) {
        HandlerC0126d<? extends AbstractC0127e> dVar = this.f475b;
        if (dVar != null) {
            dVar.m42240a(true);
        }
        if (fVar != null) {
            this.f474a.execute(new RunnableC0129g(fVar));
        }
        this.f474a.shutdown();
    }

    public <T extends AbstractC0127e> long m42244l(T t, AbstractC0124b<T> bVar, int i) {
        this.f476c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC0126d((Looper) C1186a.m38182h(Looper.myLooper()), t, bVar, i, elapsedRealtime).m42235f(0L);
        return elapsedRealtime;
    }
}
