package fe;

import android.hardware.Camera;

public final class c implements Camera.PreviewCallback {
    public final h f11945a;

    @Override
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        this.f11945a.J0(bArr, camera);
    }
}
