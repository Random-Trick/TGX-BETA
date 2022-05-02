package p255s;

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
import p266t.C8881c;

public class C8464e1 extends CameraCaptureSession.CaptureCallback {
    public AbstractC8465a f27459b = null;
    public final Map<CaptureRequest, List<CameraCaptureSession.CaptureCallback>> f27458a = new HashMap();

    public interface AbstractC8465a {
        void mo12202a(CameraCaptureSession cameraCaptureSession, int i, boolean z);
    }

    public void m12413a(CaptureRequest captureRequest, List<CameraCaptureSession.CaptureCallback> list) {
        List<CameraCaptureSession.CaptureCallback> list2 = this.f27458a.get(captureRequest);
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(list.size() + list2.size());
            arrayList.addAll(list);
            arrayList.addAll(list2);
            this.f27458a.put(captureRequest, arrayList);
            return;
        }
        this.f27458a.put(captureRequest, list);
    }

    public final List<CameraCaptureSession.CaptureCallback> m12412b(CaptureRequest captureRequest) {
        List<CameraCaptureSession.CaptureCallback> list = this.f27458a.get(captureRequest);
        return list != null ? list : Collections.emptyList();
    }

    public void m12411c(AbstractC8465a aVar) {
        this.f27459b = aVar;
    }

    @Override
    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        for (CameraCaptureSession.CaptureCallback captureCallback : m12412b(captureRequest)) {
            C8881c.m11030a(captureCallback, cameraCaptureSession, captureRequest, surface, j);
        }
    }

    @Override
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        for (CameraCaptureSession.CaptureCallback captureCallback : m12412b(captureRequest)) {
            captureCallback.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }
    }

    @Override
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        for (CameraCaptureSession.CaptureCallback captureCallback : m12412b(captureRequest)) {
            captureCallback.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }
    }

    @Override
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        for (CameraCaptureSession.CaptureCallback captureCallback : m12412b(captureRequest)) {
            captureCallback.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }
    }

    @Override
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        for (List<CameraCaptureSession.CaptureCallback> list : this.f27458a.values()) {
            for (CameraCaptureSession.CaptureCallback captureCallback : list) {
                captureCallback.onCaptureSequenceAborted(cameraCaptureSession, i);
            }
        }
        AbstractC8465a aVar = this.f27459b;
        if (aVar != null) {
            aVar.mo12202a(cameraCaptureSession, i, true);
        }
    }

    @Override
    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        for (List<CameraCaptureSession.CaptureCallback> list : this.f27458a.values()) {
            for (CameraCaptureSession.CaptureCallback captureCallback : list) {
                captureCallback.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
            }
        }
        AbstractC8465a aVar = this.f27459b;
        if (aVar != null) {
            aVar.mo12202a(cameraCaptureSession, i, false);
        }
    }

    @Override
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        for (CameraCaptureSession.CaptureCallback captureCallback : m12412b(captureRequest)) {
            captureCallback.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        }
    }
}
