package p240r;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.AbstractC0560f0;
import p321x.C10061j;
import p336y.AbstractC10268n0;
import p336y.AbstractC10277o1;
import p336y.C10284p1;
import p336y.C10300t1;

public final class C8333a extends C10061j {
    public static final AbstractC10268n0.AbstractC10269a<Integer> f26998x = AbstractC10268n0.AbstractC10269a.m5582a("camera2.captureRequest.templateType", Integer.TYPE);
    public static final AbstractC10268n0.AbstractC10269a<CameraDevice.StateCallback> f26999y = AbstractC10268n0.AbstractC10269a.m5582a("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class);
    public static final AbstractC10268n0.AbstractC10269a<CameraCaptureSession.StateCallback> f27000z = AbstractC10268n0.AbstractC10269a.m5582a("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class);
    public static final AbstractC10268n0.AbstractC10269a<CameraCaptureSession.CaptureCallback> f26994A = AbstractC10268n0.AbstractC10269a.m5582a("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class);
    public static final AbstractC10268n0.AbstractC10269a<C8336c> f26995B = AbstractC10268n0.AbstractC10269a.m5582a("camera2.cameraEvent.callback", C8336c.class);
    public static final AbstractC10268n0.AbstractC10269a<Object> f26996C = AbstractC10268n0.AbstractC10269a.m5582a("camera2.captureRequest.tag", Object.class);
    public static final AbstractC10268n0.AbstractC10269a<String> f26997D = AbstractC10268n0.AbstractC10269a.m5582a("camera2.cameraCaptureSession.physicalCameraId", String.class);

    public static final class C8334a implements AbstractC0560f0<C8333a> {
        public final C10284p1 f27001a = C10284p1.m5569J();

        @Override
        public AbstractC10277o1 mo6092a() {
            return this.f27001a;
        }

        public C8333a m12791c() {
            return new C8333a(C10300t1.m5524H(this.f27001a));
        }

        public C8334a m12790d(AbstractC10268n0 n0Var) {
            for (AbstractC10268n0.AbstractC10269a<?> aVar : n0Var.mo5425b()) {
                this.f27001a.mo5566n(aVar, n0Var.mo5424c(aVar));
            }
            return this;
        }

        public <ValueT> C8334a m12789e(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.f27001a.mo5566n(C8333a.m12800F(key), valuet);
            return this;
        }
    }

    public C8333a(AbstractC10268n0 n0Var) {
        super(n0Var);
    }

    public static AbstractC10268n0.AbstractC10269a<Object> m12800F(CaptureRequest.Key<?> key) {
        return AbstractC10268n0.AbstractC10269a.m5581b("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    public C8336c m12799G(C8336c cVar) {
        return (C8336c) mo5421k().mo5426a(f26995B, cVar);
    }

    public C10061j m12798H() {
        return C10061j.C10062a.m6089e(mo5421k()).m6090d();
    }

    public Object m12797I(Object obj) {
        return mo5421k().mo5426a(f26996C, obj);
    }

    public int m12796J(int i) {
        return ((Integer) mo5421k().mo5426a(f26998x, Integer.valueOf(i))).intValue();
    }

    public CameraDevice.StateCallback m12795K(CameraDevice.StateCallback stateCallback) {
        return (CameraDevice.StateCallback) mo5421k().mo5426a(f26999y, stateCallback);
    }

    public String m12794L(String str) {
        return (String) mo5421k().mo5426a(f26997D, str);
    }

    public CameraCaptureSession.CaptureCallback m12793M(CameraCaptureSession.CaptureCallback captureCallback) {
        return (CameraCaptureSession.CaptureCallback) mo5421k().mo5426a(f26994A, captureCallback);
    }

    public CameraCaptureSession.StateCallback m12792N(CameraCaptureSession.StateCallback stateCallback) {
        return (CameraCaptureSession.StateCallback) mo5421k().mo5426a(f27000z, stateCallback);
    }
}
