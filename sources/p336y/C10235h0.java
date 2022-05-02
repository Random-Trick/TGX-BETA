package p336y;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.camera.core.C0653t;
import androidx.camera.core.C0662u1;

public final class C10235h0 {

    public static class C10236a extends Exception {
        public C10236a(String str, Throwable th) {
            super(str, th);
        }
    }

    public static void m5674a(Context context, C10214d0 d0Var, C0653t tVar) {
        Integer d;
        if (tVar != null) {
            try {
                d = tVar.m40667d();
                if (d == null) {
                    C0662u1.m40643k("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e) {
                C0662u1.m40650d("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e);
                return;
            }
        } else {
            d = null;
        }
        C0662u1.m40653a("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + d);
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (tVar == null || d.intValue() == 1)) {
                C0653t.f2434c.m40666e(d0Var.m5718a());
            }
            if (!packageManager.hasSystemFeature("android.hardware.camera.front")) {
                return;
            }
            if (tVar == null || d.intValue() == 0) {
                C0653t.f2433b.m40666e(d0Var.m5718a());
            }
        } catch (IllegalArgumentException e2) {
            C0662u1.m40651c("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + d0Var.m5718a());
            throw new C10236a("Expected camera missing from device.", e2);
        }
    }
}
