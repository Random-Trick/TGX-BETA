package p266t;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import java.util.concurrent.Executor;

public class C8914p0 extends C8912o0 {
    public C8914p0(Context context) {
        super(context);
    }

    @Override
    public CameraCharacteristics mo10960c(String str) {
        try {
            return this.f28767a.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw C8887f.m11022e(e);
        }
    }

    @Override
    public void mo10959d(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        try {
            this.f28767a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            throw C8887f.m11022e(e);
        }
    }
}
