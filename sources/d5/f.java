package d5;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import c5.j;
import c5.m;
import c5.s;

public final class f extends Surface {
    public static int M;
    public static boolean N;
    public final boolean f6242a;
    public final b f6243b;
    public boolean f6244c;

    public static class b extends HandlerThread implements Handler.Callback {
        public RuntimeException M;
        public f N;
        public j f6245a;
        public Handler f6246b;
        public Error f6247c;

        public b() {
            super("ExoPlayer:DummySurface");
        }

        public f a(int i10) {
            boolean z10;
            start();
            this.f6246b = new Handler(getLooper(), this);
            this.f6245a = new j(this.f6246b);
            synchronized (this) {
                z10 = false;
                this.f6246b.obtainMessage(1, i10, 0).sendToTarget();
                while (this.N == null && this.M == null && this.f6247c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.M;
            if (runtimeException == null) {
                Error error = this.f6247c;
                if (error == null) {
                    return (f) c5.a.e(this.N);
                }
                throw error;
            }
            throw runtimeException;
        }

        public final void b(int i10) {
            c5.a.e(this.f6245a);
            this.f6245a.h(i10);
            this.N = new f(this, this.f6245a.g(), i10 != 0);
        }

        public void c() {
            c5.a.e(this.f6246b);
            this.f6246b.sendEmptyMessage(2);
        }

        public final void d() {
            c5.a.e(this.f6245a);
            this.f6245a.i();
        }

        @Override
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            try {
                if (i10 == 1) {
                    try {
                        b(message.arg1);
                        synchronized (this) {
                            notify();
                        }
                    } catch (Error e10) {
                        s.d("DummySurface", "Failed to initialize dummy surface", e10);
                        this.f6247c = e10;
                        synchronized (this) {
                            notify();
                        }
                    } catch (RuntimeException e11) {
                        s.d("DummySurface", "Failed to initialize dummy surface", e11);
                        this.M = e11;
                        synchronized (this) {
                            notify();
                        }
                    }
                    return true;
                } else if (i10 != 2) {
                    return true;
                } else {
                    try {
                        d();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }
    }

    public static int a(Context context) {
        if (m.m(context)) {
            return m.n() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        boolean z10;
        synchronized (f.class) {
            z10 = true;
            if (!N) {
                M = a(context);
                N = true;
            }
            if (M == 0) {
                z10 = false;
            }
        }
        return z10;
    }

    public static f c(Context context, boolean z10) {
        int i10 = 0;
        c5.a.f(!z10 || b(context));
        b bVar = new b();
        if (z10) {
            i10 = M;
        }
        return bVar.a(i10);
    }

    @Override
    public void release() {
        super.release();
        synchronized (this.f6243b) {
            if (!this.f6244c) {
                this.f6243b.c();
                this.f6244c = true;
            }
        }
    }

    public f(b bVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f6243b = bVar;
        this.f6242a = z10;
    }
}
