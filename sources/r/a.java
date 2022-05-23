package r;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.e0;
import x.j;
import y.n0;
import y.o1;
import y.p1;
import y.t1;

public final class a extends j {
    public static final n0.a<Integer> f21570x = n0.a.a("camera2.captureRequest.templateType", Integer.TYPE);
    public static final n0.a<CameraDevice.StateCallback> f21571y = n0.a.a("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class);
    public static final n0.a<CameraCaptureSession.StateCallback> f21572z = n0.a.a("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class);
    public static final n0.a<CameraCaptureSession.CaptureCallback> A = n0.a.a("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class);
    public static final n0.a<c> B = n0.a.a("camera2.cameraEvent.callback", c.class);
    public static final n0.a<Object> C = n0.a.a("camera2.captureRequest.tag", Object.class);
    public static final n0.a<String> D = n0.a.a("camera2.cameraCaptureSession.physicalCameraId", String.class);

    public static final class C0201a implements e0<a> {
        public final p1 f21573a = p1.J();

        @Override
        public o1 a() {
            return this.f21573a;
        }

        public a c() {
            return new a(t1.H(this.f21573a));
        }

        public C0201a d(n0 n0Var) {
            for (n0.a<?> aVar : n0Var.b()) {
                this.f21573a.n(aVar, n0Var.c(aVar));
            }
            return this;
        }

        public <ValueT> C0201a e(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.f21573a.n(a.F(key), valuet);
            return this;
        }
    }

    public a(n0 n0Var) {
        super(n0Var);
    }

    public static n0.a<Object> F(CaptureRequest.Key<?> key) {
        return n0.a.b("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    public c G(c cVar) {
        return (c) k().a(B, cVar);
    }

    public j H() {
        return j.a.e(k()).d();
    }

    public Object I(Object obj) {
        return k().a(C, obj);
    }

    public int J(int i10) {
        return ((Integer) k().a(f21570x, Integer.valueOf(i10))).intValue();
    }

    public CameraDevice.StateCallback K(CameraDevice.StateCallback stateCallback) {
        return (CameraDevice.StateCallback) k().a(f21571y, stateCallback);
    }

    public String L(String str) {
        return (String) k().a(D, str);
    }

    public CameraCaptureSession.CaptureCallback M(CameraCaptureSession.CaptureCallback captureCallback) {
        return (CameraCaptureSession.CaptureCallback) k().a(A, captureCallback);
    }

    public CameraCaptureSession.StateCallback N(CameraCaptureSession.StateCallback stateCallback) {
        return (CameraCaptureSession.StateCallback) k().a(f21572z, stateCallback);
    }
}
