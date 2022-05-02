package p266t;

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
import p266t.C8889g;

public final class C8889g {
    public final AbstractC8890a f28713a;

    public interface AbstractC8890a {
        int mo10956a(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        CameraCaptureSession mo10955b();

        int mo10954c(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);
    }

    public static final class C8891b extends CameraCaptureSession.CaptureCallback {
        public final CameraCaptureSession.CaptureCallback f28714a;
        public final Executor f28715b;

        public C8891b(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
            this.f28715b = executor;
            this.f28714a = captureCallback;
        }

        public void m11009h(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
            C8881c.m11030a(this.f28714a, cameraCaptureSession, captureRequest, surface, j);
        }

        public void m11008i(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f28714a.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }

        public void m11007j(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.f28714a.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }

        public void m11006k(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.f28714a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }

        public void m11005l(CameraCaptureSession cameraCaptureSession, int i) {
            this.f28714a.onCaptureSequenceAborted(cameraCaptureSession, i);
        }

        public void m11004m(CameraCaptureSession cameraCaptureSession, int i, long j) {
            this.f28714a.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
        }

        public void m11003n(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            this.f28714a.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        }

        @Override
        public void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j) {
            this.f28715b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8889g.C8891b.this.m11009h(cameraCaptureSession, captureRequest, surface, j);
                }
            });
        }

        @Override
        public void onCaptureCompleted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f28715b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8889g.C8891b.this.m11008i(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
            });
        }

        @Override
        public void onCaptureFailed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureFailure captureFailure) {
            this.f28715b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8889g.C8891b.this.m11007j(cameraCaptureSession, captureRequest, captureFailure);
                }
            });
        }

        @Override
        public void onCaptureProgressed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureResult captureResult) {
            this.f28715b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8889g.C8891b.this.m11006k(cameraCaptureSession, captureRequest, captureResult);
                }
            });
        }

        @Override
        public void onCaptureSequenceAborted(final CameraCaptureSession cameraCaptureSession, final int i) {
            this.f28715b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8889g.C8891b.this.m11005l(cameraCaptureSession, i);
                }
            });
        }

        @Override
        public void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i, final long j) {
            this.f28715b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8889g.C8891b.this.m11004m(cameraCaptureSession, i, j);
                }
            });
        }

        @Override
        public void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j, final long j2) {
            this.f28715b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8889g.C8891b.this.m11003n(cameraCaptureSession, captureRequest, j, j2);
                }
            });
        }
    }

    public static final class C8892c extends CameraCaptureSession.StateCallback {
        public final CameraCaptureSession.StateCallback f28716a;
        public final Executor f28717b;

        public C8892c(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f28717b = executor;
            this.f28716a = stateCallback;
        }

        public void m10995h(CameraCaptureSession cameraCaptureSession) {
            this.f28716a.onActive(cameraCaptureSession);
        }

        public void m10994i(CameraCaptureSession cameraCaptureSession) {
            C8883d.m11028b(this.f28716a, cameraCaptureSession);
        }

        public void m10993j(CameraCaptureSession cameraCaptureSession) {
            this.f28716a.onClosed(cameraCaptureSession);
        }

        public void m10992k(CameraCaptureSession cameraCaptureSession) {
            this.f28716a.onConfigureFailed(cameraCaptureSession);
        }

        public void m10991l(CameraCaptureSession cameraCaptureSession) {
            this.f28716a.onConfigured(cameraCaptureSession);
        }

        public void m10990m(CameraCaptureSession cameraCaptureSession) {
            this.f28716a.onReady(cameraCaptureSession);
        }

        public void m10989n(CameraCaptureSession cameraCaptureSession, Surface surface) {
            C8879b.m11031a(this.f28716a, cameraCaptureSession, surface);
        }

        @Override
        public void onActive(final CameraCaptureSession cameraCaptureSession) {
            this.f28717b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8889g.C8892c.this.m10995h(cameraCaptureSession);
                }
            });
        }

        @Override
        public void onCaptureQueueEmpty(final CameraCaptureSession cameraCaptureSession) {
            this.f28717b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8889g.C8892c.this.m10994i(cameraCaptureSession);
                }
            });
        }

        @Override
        public void onClosed(final CameraCaptureSession cameraCaptureSession) {
            this.f28717b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8889g.C8892c.this.m10993j(cameraCaptureSession);
                }
            });
        }

        @Override
        public void onConfigureFailed(final CameraCaptureSession cameraCaptureSession) {
            this.f28717b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8889g.C8892c.this.m10992k(cameraCaptureSession);
                }
            });
        }

        @Override
        public void onConfigured(final CameraCaptureSession cameraCaptureSession) {
            this.f28717b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8889g.C8892c.this.m10991l(cameraCaptureSession);
                }
            });
        }

        @Override
        public void onReady(final CameraCaptureSession cameraCaptureSession) {
            this.f28717b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8889g.C8892c.this.m10990m(cameraCaptureSession);
                }
            });
        }

        @Override
        public void onSurfacePrepared(final CameraCaptureSession cameraCaptureSession, final Surface surface) {
            this.f28717b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8889g.C8892c.this.m10989n(cameraCaptureSession, surface);
                }
            });
        }
    }

    public C8889g(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f28713a = new C8922v(cameraCaptureSession);
        } else {
            this.f28713a = C8923w.m10953d(cameraCaptureSession, handler);
        }
    }

    public static C8889g m11017d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new C8889g(cameraCaptureSession, handler);
    }

    public int m11020a(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f28713a.mo10954c(list, executor, captureCallback);
    }

    public int m11019b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f28713a.mo10956a(captureRequest, executor, captureCallback);
    }

    public CameraCaptureSession m11018c() {
        return this.f28713a.mo10955b();
    }
}
