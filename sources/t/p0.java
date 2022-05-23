package t;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import java.util.concurrent.Executor;

public class p0 extends o0 {
    public p0(Context context) {
        super(context);
    }

    @Override
    public CameraCharacteristics c(String str) {
        try {
            return this.f22813a.getCameraCharacteristics(str);
        } catch (CameraAccessException e10) {
            throw f.e(e10);
        }
    }

    @Override
    public void d(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        try {
            this.f22813a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e10) {
            throw f.e(e10);
        }
    }
}
