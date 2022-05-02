package p279u;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import p016b1.C1132h;

public class C9404e extends C9402d {
    public C9404e(Surface surface) {
        super(new OutputConfiguration(surface));
    }

    public static C9404e m8791g(OutputConfiguration outputConfiguration) {
        return new C9404e(outputConfiguration);
    }

    @Override
    public String mo8790a() {
        return null;
    }

    @Override
    public void mo8788c(String str) {
        ((OutputConfiguration) mo8787d()).setPhysicalCameraId(str);
    }

    @Override
    public Object mo8787d() {
        C1132h.m38329a(this.f30447a instanceof OutputConfiguration);
        return this.f30447a;
    }

    public C9404e(Object obj) {
        super(obj);
    }
}
