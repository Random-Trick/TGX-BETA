package s;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import t.c;

public class e1 extends CameraCaptureSession.CaptureCallback {
    public a f22004b = null;
    public final Map<CaptureRequest, List<CameraCaptureSession.CaptureCallback>> f22003a = new HashMap();

    public interface a {
        void a(CameraCaptureSession cameraCaptureSession, int i10, boolean z10);
    }

    public void a(CaptureRequest captureRequest, List<CameraCaptureSession.CaptureCallback> list) {
        List<CameraCaptureSession.CaptureCallback> list2 = this.f22003a.get(captureRequest);
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(list.size() + list2.size());
            arrayList.addAll(list);
            arrayList.addAll(list2);
            this.f22003a.put(captureRequest, arrayList);
            return;
        }
        this.f22003a.put(captureRequest, list);
    }

    public final List<CameraCaptureSession.CaptureCallback> b(CaptureRequest captureRequest) {
        List<CameraCaptureSession.CaptureCallback> list = this.f22003a.get(captureRequest);
        return list != null ? list : Collections.emptyList();
    }

    public void c(a aVar) {
        this.f22004b = aVar;
    }

    @Override
    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j10) {
        for (CameraCaptureSession.CaptureCallback captureCallback : b(captureRequest)) {
            c.a(captureCallback, cameraCaptureSession, captureRequest, surface, j10);
        }
    }

    @Override
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        for (CameraCaptureSession.CaptureCallback captureCallback : b(captureRequest)) {
            captureCallback.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }
    }

    @Override
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        for (CameraCaptureSession.CaptureCallback captureCallback : b(captureRequest)) {
            captureCallback.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }
    }

    @Override
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        for (CameraCaptureSession.CaptureCallback captureCallback : b(captureRequest)) {
            captureCallback.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }
    }

    @Override
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i10) {
        for (List<CameraCaptureSession.CaptureCallback> list : this.f22003a.values()) {
            for (CameraCaptureSession.CaptureCallback captureCallback : list) {
                captureCallback.onCaptureSequenceAborted(cameraCaptureSession, i10);
            }
        }
        a aVar = this.f22004b;
        if (aVar != null) {
            aVar.a(cameraCaptureSession, i10, true);
        }
    }

    @Override
    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i10, long j10) {
        for (List<CameraCaptureSession.CaptureCallback> list : this.f22003a.values()) {
            for (CameraCaptureSession.CaptureCallback captureCallback : list) {
                captureCallback.onCaptureSequenceCompleted(cameraCaptureSession, i10, j10);
            }
        }
        a aVar = this.f22004b;
        if (aVar != null) {
            aVar.a(cameraCaptureSession, i10, false);
        }
    }

    @Override
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
        for (CameraCaptureSession.CaptureCallback captureCallback : b(captureRequest)) {
            captureCallback.onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
        }
    }
}
