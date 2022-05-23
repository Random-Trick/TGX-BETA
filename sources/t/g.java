package t;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;
import t.g;

public final class g {
    public final a f22767a;

    public interface a {
        int a(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        CameraCaptureSession b();

        int c(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);
    }

    public static final class b extends CameraCaptureSession.CaptureCallback {
        public final CameraCaptureSession.CaptureCallback f22768a;
        public final Executor f22769b;

        public b(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
            this.f22769b = executor;
            this.f22768a = captureCallback;
        }

        public void h(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j10) {
            t.c.a(this.f22768a, cameraCaptureSession, captureRequest, surface, j10);
        }

        public void i(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f22768a.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }

        public void j(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.f22768a.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }

        public void k(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.f22768a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }

        public void l(CameraCaptureSession cameraCaptureSession, int i10) {
            this.f22768a.onCaptureSequenceAborted(cameraCaptureSession, i10);
        }

        public void m(CameraCaptureSession cameraCaptureSession, int i10, long j10) {
            this.f22768a.onCaptureSequenceCompleted(cameraCaptureSession, i10, j10);
        }

        public void n(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
            this.f22768a.onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
        }

        @Override
        public void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j10) {
            this.f22769b.execute(new Runnable() {
                @Override
                public final void run() {
                    g.b.this.h(cameraCaptureSession, captureRequest, surface, j10);
                }
            });
        }

        @Override
        public void onCaptureCompleted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f22769b.execute(new Runnable() {
                @Override
                public final void run() {
                    g.b.this.i(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
            });
        }

        @Override
        public void onCaptureFailed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureFailure captureFailure) {
            this.f22769b.execute(new Runnable() {
                @Override
                public final void run() {
                    g.b.this.j(cameraCaptureSession, captureRequest, captureFailure);
                }
            });
        }

        @Override
        public void onCaptureProgressed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureResult captureResult) {
            this.f22769b.execute(new Runnable() {
                @Override
                public final void run() {
                    g.b.this.k(cameraCaptureSession, captureRequest, captureResult);
                }
            });
        }

        @Override
        public void onCaptureSequenceAborted(final CameraCaptureSession cameraCaptureSession, final int i10) {
            this.f22769b.execute(new Runnable() {
                @Override
                public final void run() {
                    g.b.this.l(cameraCaptureSession, i10);
                }
            });
        }

        @Override
        public void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i10, final long j10) {
            this.f22769b.execute(new Runnable() {
                @Override
                public final void run() {
                    g.b.this.m(cameraCaptureSession, i10, j10);
                }
            });
        }

        @Override
        public void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j10, final long j11) {
            this.f22769b.execute(new Runnable() {
                @Override
                public final void run() {
                    g.b.this.n(cameraCaptureSession, captureRequest, j10, j11);
                }
            });
        }
    }

    public static final class c extends CameraCaptureSession.StateCallback {
        public final CameraCaptureSession.StateCallback f22770a;
        public final Executor f22771b;

        public c(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f22771b = executor;
            this.f22770a = stateCallback;
        }

        public void h(CameraCaptureSession cameraCaptureSession) {
            this.f22770a.onActive(cameraCaptureSession);
        }

        public void i(CameraCaptureSession cameraCaptureSession) {
            d.b(this.f22770a, cameraCaptureSession);
        }

        public void j(CameraCaptureSession cameraCaptureSession) {
            this.f22770a.onClosed(cameraCaptureSession);
        }

        public void k(CameraCaptureSession cameraCaptureSession) {
            this.f22770a.onConfigureFailed(cameraCaptureSession);
        }

        public void l(CameraCaptureSession cameraCaptureSession) {
            this.f22770a.onConfigured(cameraCaptureSession);
        }

        public void m(CameraCaptureSession cameraCaptureSession) {
            this.f22770a.onReady(cameraCaptureSession);
        }

        public void n(CameraCaptureSession cameraCaptureSession, Surface surface) {
            t.b.a(this.f22770a, cameraCaptureSession, surface);
        }

        @Override
        public void onActive(final CameraCaptureSession cameraCaptureSession) {
            this.f22771b.execute(new Runnable() {
                @Override
                public final void run() {
                    g.c.this.h(cameraCaptureSession);
                }
            });
        }

        @Override
        public void onCaptureQueueEmpty(final CameraCaptureSession cameraCaptureSession) {
            this.f22771b.execute(new Runnable() {
                @Override
                public final void run() {
                    g.c.this.i(cameraCaptureSession);
                }
            });
        }

        @Override
        public void onClosed(final CameraCaptureSession cameraCaptureSession) {
            this.f22771b.execute(new Runnable() {
                @Override
                public final void run() {
                    g.c.this.j(cameraCaptureSession);
                }
            });
        }

        @Override
        public void onConfigureFailed(final CameraCaptureSession cameraCaptureSession) {
            this.f22771b.execute(new Runnable() {
                @Override
                public final void run() {
                    g.c.this.k(cameraCaptureSession);
                }
            });
        }

        @Override
        public void onConfigured(final CameraCaptureSession cameraCaptureSession) {
            this.f22771b.execute(new Runnable() {
                @Override
                public final void run() {
                    g.c.this.l(cameraCaptureSession);
                }
            });
        }

        @Override
        public void onReady(final CameraCaptureSession cameraCaptureSession) {
            this.f22771b.execute(new Runnable() {
                @Override
                public final void run() {
                    g.c.this.m(cameraCaptureSession);
                }
            });
        }

        @Override
        public void onSurfacePrepared(final CameraCaptureSession cameraCaptureSession, final Surface surface) {
            this.f22771b.execute(new Runnable() {
                @Override
                public final void run() {
                    g.c.this.n(cameraCaptureSession, surface);
                }
            });
        }
    }

    public g(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f22767a = new v(cameraCaptureSession);
        } else {
            this.f22767a = w.d(cameraCaptureSession, handler);
        }
    }

    public static g d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new g(cameraCaptureSession, handler);
    }

    public int a(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f22767a.c(list, executor, captureCallback);
    }

    public int b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f22767a.a(captureRequest, executor, captureCallback);
    }

    public CameraCaptureSession c() {
        return this.f22767a.b();
    }
}
