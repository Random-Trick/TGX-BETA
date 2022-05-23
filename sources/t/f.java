package t;

import android.hardware.camera2.CameraAccessException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class f extends Exception {
    public final int f22765a;
    public final CameraAccessException f22766b;
    public static final Set<Integer> f22764c = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));
    public static final Set<Integer> M = Collections.unmodifiableSet(new HashSet(Arrays.asList(10001, 10002)));

    public f(int i10, String str, Throwable th) {
        super(a(i10, str), th);
        this.f22765a = i10;
        this.f22766b = f22764c.contains(Integer.valueOf(i10)) ? new CameraAccessException(i10, str, th) : null;
    }

    public static String a(int i10, String str) {
        return String.format("%s (%d): %s", c(i10), Integer.valueOf(i10), str);
    }

    public static String b(int i10) {
        if (i10 == 1) {
            return "The camera is disabled due to a device policy, and cannot be opened.";
        }
        if (i10 == 2) {
            return "The camera device is removable and has been disconnected from the Android device, or the camera service has shut down the connection due to a higher-priority access request for the camera device.";
        }
        if (i10 == 3) {
            return "The camera device is currently in the error state; no further calls to it will succeed.";
        }
        if (i10 == 4) {
            return "The camera device is in use already";
        }
        if (i10 == 5) {
            return "The system-wide limit for number of open cameras has been reached, and more camera devices cannot be opened until previous instances are closed.";
        }
        if (i10 == 10001) {
            return "Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.";
        }
        if (i10 != 10002) {
            return null;
        }
        return "Failed to create CameraCharacteristics.";
    }

    public static String c(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? i10 != 1000 ? i10 != 10001 ? i10 != 10002 ? "<UNKNOWN ERROR>" : "CAMERA_CHARACTERISTICS_CREATION_ERROR" : "CAMERA_UNAVAILABLE_DO_NOT_DISTURB" : "CAMERA_DEPRECATED_HAL" : "MAX_CAMERAS_IN_USE" : "CAMERA_IN_USE" : "CAMERA_ERROR" : "CAMERA_DISCONNECTED" : "CAMERA_DISABLED";
    }

    public static f e(CameraAccessException cameraAccessException) {
        Objects.requireNonNull(cameraAccessException, "cameraAccessException should not be null");
        return new f(cameraAccessException);
    }

    public final int d() {
        return this.f22765a;
    }

    public f(int i10, Throwable th) {
        super(b(i10), th);
        this.f22765a = i10;
        this.f22766b = f22764c.contains(Integer.valueOf(i10)) ? new CameraAccessException(i10, null, th) : null;
    }

    public f(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.f22765a = cameraAccessException.getReason();
        this.f22766b = cameraAccessException;
    }
}
