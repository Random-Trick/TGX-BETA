package y;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.camera.core.s;
import androidx.camera.core.t1;

public final class h0 {

    public static class a extends Exception {
        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    public static void a(Context context, d0 d0Var, s sVar) {
        Integer d10;
        if (sVar != null) {
            try {
                d10 = sVar.d();
                if (d10 == null) {
                    t1.k("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e10) {
                t1.d("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e10);
                return;
            }
        } else {
            d10 = null;
        }
        t1.a("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + d10);
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (sVar == null || d10.intValue() == 1)) {
                s.f2202c.e(d0Var.a());
            }
            if (!packageManager.hasSystemFeature("android.hardware.camera.front")) {
                return;
            }
            if (sVar == null || d10.intValue() == 0) {
                s.f2201b.e(d0Var.a());
            }
        } catch (IllegalArgumentException e11) {
            t1.c("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + d0Var.a());
            throw new a("Expected camera missing from device.", e11);
        }
    }
}
