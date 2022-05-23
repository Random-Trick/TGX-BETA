package s;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import t.c;

public final class k0 {

    public static final class a extends CameraCaptureSession.CaptureCallback {
        public final List<CameraCaptureSession.CaptureCallback> f22133a = new ArrayList();

        public a(List<CameraCaptureSession.CaptureCallback> list) {
            for (CameraCaptureSession.CaptureCallback captureCallback : list) {
                if (!(captureCallback instanceof b)) {
                    this.f22133a.add(captureCallback);
                }
            }
        }

        @Override
        public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j10) {
            for (CameraCaptureSession.CaptureCallback captureCallback : this.f22133a) {
                c.a(captureCallback, cameraCaptureSession, captureRequest, surface, j10);
            }
        }

        @Override
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            for (CameraCaptureSession.CaptureCallback captureCallback : this.f22133a) {
                captureCallback.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            }
        }

        @Override
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            for (CameraCaptureSession.CaptureCallback captureCallback : this.f22133a) {
                captureCallback.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            }
        }

        @Override
        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            for (CameraCaptureSession.CaptureCallback captureCallback : this.f22133a) {
                captureCallback.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
            }
        }

        @Override
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i10) {
            for (CameraCaptureSession.CaptureCallback captureCallback : this.f22133a) {
                captureCallback.onCaptureSequenceAborted(cameraCaptureSession, i10);
            }
        }

        @Override
        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i10, long j10) {
            for (CameraCaptureSession.CaptureCallback captureCallback : this.f22133a) {
                captureCallback.onCaptureSequenceCompleted(cameraCaptureSession, i10, j10);
            }
        }

        @Override
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
            for (CameraCaptureSession.CaptureCallback captureCallback : this.f22133a) {
                captureCallback.onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
            }
        }
    }

    public static final class b extends CameraCaptureSession.CaptureCallback {
        @Override
        public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j10) {
        }

        @Override
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        }

        @Override
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        }

        @Override
        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        }

        @Override
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i10) {
        }

        @Override
        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i10, long j10) {
        }

        @Override
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
        }
    }

    public static CameraCaptureSession.CaptureCallback a(List<CameraCaptureSession.CaptureCallback> list) {
        return new a(list);
    }

    public static CameraCaptureSession.CaptureCallback b(CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        return a(Arrays.asList(captureCallbackArr));
    }

    public static CameraCaptureSession.CaptureCallback c() {
        return new b();
    }
}
