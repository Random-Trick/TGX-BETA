package p032c5;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import p020b5.C1186a;
import p020b5.C1217m;
import p020b5.C1230s;
import p020b5.RunnableC1206j;

public final class C1611f extends Surface {
    public static int f5933M;
    public static boolean f5934N;
    public final boolean f5935a;
    public final HandlerThreadC1613b f5936b;
    public boolean f5937c;

    public static class HandlerThreadC1613b extends HandlerThread implements Handler.Callback {
        public RuntimeException f5938M;
        public C1611f f5939N;
        public RunnableC1206j f5940a;
        public Handler f5941b;
        public Error f5942c;

        public HandlerThreadC1613b() {
            super("ExoPlayer:DummySurface");
        }

        public C1611f m36249a(int i) {
            boolean z;
            start();
            this.f5941b = new Handler(getLooper(), this);
            this.f5940a = new RunnableC1206j(this.f5941b);
            synchronized (this) {
                z = false;
                this.f5941b.obtainMessage(1, i, 0).sendToTarget();
                while (this.f5939N == null && this.f5938M == null && this.f5942c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f5938M;
            if (runtimeException == null) {
                Error error = this.f5942c;
                if (error == null) {
                    return (C1611f) C1186a.m38188e(this.f5939N);
                }
                throw error;
            }
            throw runtimeException;
        }

        public final void m36248b(int i) {
            C1186a.m38188e(this.f5940a);
            this.f5940a.m38041h(i);
            this.f5939N = new C1611f(this, this.f5940a.m38042g(), i != 0);
        }

        public void m36247c() {
            C1186a.m38188e(this.f5941b);
            this.f5941b.sendEmptyMessage(2);
        }

        public final void m36246d() {
            C1186a.m38188e(this.f5940a);
            this.f5940a.m38040i();
        }

        @Override
        public boolean handleMessage(Message message) {
            int i = message.what;
            try {
                if (i == 1) {
                    try {
                        m36248b(message.arg1);
                        synchronized (this) {
                            notify();
                        }
                    } catch (Error e) {
                        C1230s.m37889d("DummySurface", "Failed to initialize dummy surface", e);
                        this.f5942c = e;
                        synchronized (this) {
                            notify();
                        }
                    } catch (RuntimeException e2) {
                        C1230s.m37889d("DummySurface", "Failed to initialize dummy surface", e2);
                        this.f5938M = e2;
                        synchronized (this) {
                            notify();
                        }
                    }
                    return true;
                } else if (i != 2) {
                    return true;
                } else {
                    try {
                        m36246d();
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

    public static int m36252a(Context context) {
        if (C1217m.m37932f(context)) {
            return C1217m.m37931g() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean m36251b(Context context) {
        boolean z;
        synchronized (C1611f.class) {
            z = true;
            if (!f5934N) {
                f5933M = m36252a(context);
                f5934N = true;
            }
            if (f5933M == 0) {
                z = false;
            }
        }
        return z;
    }

    public static C1611f m36250c(Context context, boolean z) {
        int i = 0;
        C1186a.m38187f(!z || m36251b(context));
        HandlerThreadC1613b bVar = new HandlerThreadC1613b();
        if (z) {
            i = f5933M;
        }
        return bVar.m36249a(i);
    }

    @Override
    public void release() {
        super.release();
        synchronized (this.f5936b) {
            if (!this.f5937c) {
                this.f5936b.m36247c();
                this.f5937c = true;
            }
        }
    }

    public C1611f(HandlerThreadC1613b bVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f5936b = bVar;
        this.f5935a = z;
    }
}
