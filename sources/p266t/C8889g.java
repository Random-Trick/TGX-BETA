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
    public final AbstractC8890a f28716a;

    public interface AbstractC8890a {
        int mo10955a(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        CameraCaptureSession mo10954b();

        int mo10953c(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);
    }

    public static final class C8891b extends CameraCaptureSession.CaptureCallback {
        public final CameraCaptureSession.CaptureCallback f28717a;
        public final Executor f28718b;

        public C8891b(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
            this.f28718b = executor;
            this.f28717a = captureCallback;
        }

        public void m11008h(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
            C8881c.m11029a(this.f28717a, cameraCaptureSession, captureRequest, surface, j);
        }

        public void m11007i(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f28717a.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }

        public void m11006j(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.f28717a.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }

        public void m11005k(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.f28717a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }

        public void m11004l(CameraCaptureSession cameraCaptureSession, int i) {
            this.f28717a.onCaptureSequenceAborted(cameraCaptureSession, i);
        }

        public void m11003m(CameraCaptureSession cameraCaptureSession, int i, long j) {
            this.f28717a.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
        }

        public void m11002n(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            this.f28717a.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        }

        @Override
        public void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j) {
            this.f28718b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8889g.C8891b.this.m11008h(cameraCaptureSession, captureRequest, surface, j);
                }
            });
        }

        @Override
        public void onCaptureCompleted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f28718b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8889g.C8891b.this.m11007i(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
            });
        }

        @Override
        public void onCaptureFailed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureFailure captureFailure) {
            this.f28718b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8889g.C8891b.this.m11006j(cameraCaptureSession, captureRequest, captureFailure);
                }
            });
        }

        @Override
        public void onCaptureProgressed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureResult captureResult) {
            this.f28718b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8889g.C8891b.this.m11005k(cameraCaptureSession, captureRequest, captureResult);
                }
            });
        }

        @Override
        public void onCaptureSequenceAborted(final CameraCaptureSession cameraCaptureSession, final int i) {
            this.f28718b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8889g.C8891b.this.m11004l(cameraCaptureSession, i);
                }
            });
        }

        @Override
        public void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i, final long j) {
            this.f28718b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8889g.C8891b.this.m11003m(cameraCaptureSession, i, j);
                }
            });
        }

        @Override
        public void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j, final long j2) {
            this.f28718b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8889g.C8891b.this.m11002n(cameraCaptureSession, captureRequest, j, j2);
                }
            });
        }
    }

    public static final class C8892c extends CameraCaptureSession.StateCallback {
        public final CameraCaptureSession.StateCallback f28719a;
        public final Executor f28720b;

        public C8892c(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f28720b = executor;
            this.f28719a = stateCallback;
        }

        public void m10994h(CameraCaptureSession cameraCaptureSession) {
            this.f28719a.onActive(cameraCaptureSession);
        }

        public void m10993i(CameraCaptureSession cameraCaptureSession) {
            C8883d.m11027b(this.f28719a, cameraCaptureSession);
        }

        public void m10992j(CameraCaptureSession cameraCaptureSession) {
            this.f28719a.onClosed(cameraCaptureSession);
        }

        public void m10991k(CameraCaptureSession cameraCaptureSession) {
            this.f28719a.onConfigureFailed(cameraCaptureSession);
        }

        public void m10990l(CameraCaptureSession cameraCaptureSession) {
            this.f28719a.onConfigured(cameraCaptureSession);
        }

        public void m10989m(CameraCaptureSession cameraCaptureSession) {
            this.f28719a.onReady(cameraCaptureSession);
        }

        public void m10988n(CameraCaptureSession cameraCaptureSession, Surface surface) {
            C8879b.m11030a(this.f28719a, cameraCaptureSession, surface);
        }

        @Override
        public void onActive(final CameraCaptureSession cameraCaptureSession) {
            this.f28720b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8889g.C8892c.this.m10994h(cameraCaptureSession);
                }
            });
        }

        @Override
        public void onCaptureQueueEmpty(final CameraCaptureSession cameraCaptureSession) {
            this.f28720b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8889g.C8892c.this.m10993i(cameraCaptureSession);
                }
            });
        }

        @Override
        public void onClosed(final CameraCaptureSession cameraCaptureSession) {
            this.f28720b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8889g.C8892c.this.m10992j(cameraCaptureSession);
                }
            });
        }

        @Override
        public void onConfigureFailed(final CameraCaptureSession cameraCaptureSession) {
            this.f28720b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8889g.C8892c.this.m10991k(cameraCaptureSession);
                }
            });
        }

        @Override
        public void onConfigured(final CameraCaptureSession cameraCaptureSession) {
            this.f28720b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8889g.C8892c.this.m10990l(cameraCaptureSession);
                }
            });
        }

        @Override
        public void onReady(final CameraCaptureSession cameraCaptureSession) {
            this.f28720b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8889g.C8892c.this.m10989m(cameraCaptureSession);
                }
            });
        }

        @Override
        public void onSurfacePrepared(final CameraCaptureSession cameraCaptureSession, final Surface surface) {
            this.f28720b.execute(new Runnable() {
                @Override
                public final void run() {
                    C8889g.C8892c.this.m10988n(cameraCaptureSession, surface);
                }
            });
        }
    }

    public C8889g(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f28716a = new C8922v(cameraCaptureSession);
        } else {
            this.f28716a = C8923w.m10952d(cameraCaptureSession, handler);
        }
    }

    public static C8889g m11016d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new C8889g(cameraCaptureSession, handler);
    }

    public int m11019a(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f28716a.mo10953c(list, executor, captureCallback);
    }

    public int m11018b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f28716a.mo10955a(captureRequest, executor, captureCallback);
    }

    public CameraCaptureSession m11017c() {
        return this.f28716a.mo10954b();
    }
}
