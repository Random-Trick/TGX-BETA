package p266t;

import android.hardware.camera2.CameraCharacteristics;
import p266t.C8927z;

public class C8926y implements C8927z.AbstractC8928a {
    public final CameraCharacteristics f28783a;

    public C8926y(CameraCharacteristics cameraCharacteristics) {
        this.f28783a = cameraCharacteristics;
    }

    @Override
    public <T> T mo10949a(CameraCharacteristics.Key<T> key) {
        return (T) this.f28783a.get(key);
    }
}
