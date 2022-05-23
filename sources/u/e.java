package u;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import b1.h;

public class e extends d {
    public e(Surface surface) {
        super(new OutputConfiguration(surface));
    }

    public static e g(OutputConfiguration outputConfiguration) {
        return new e(outputConfiguration);
    }

    @Override
    public String a() {
        return null;
    }

    @Override
    public void c(String str) {
        ((OutputConfiguration) d()).setPhysicalCameraId(str);
    }

    @Override
    public Object d() {
        h.a(this.f23437a instanceof OutputConfiguration);
        return this.f23437a;
    }

    public e(Object obj) {
        super(obj);
    }
}
