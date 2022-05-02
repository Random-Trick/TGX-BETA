package p266t;

import android.hardware.camera2.CameraAccessException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class C8887f extends Exception {
    public final int f28714a;
    public final CameraAccessException f28715b;
    public static final Set<Integer> f28713c = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));
    public static final Set<Integer> f28712M = Collections.unmodifiableSet(new HashSet(Arrays.asList(10001, 10002)));

    public C8887f(int i, String str, Throwable th) {
        super(m11025a(i, str), th);
        this.f28714a = i;
        this.f28715b = f28713c.contains(Integer.valueOf(i)) ? new CameraAccessException(i, str, th) : null;
    }

    public static String m11025a(int i, String str) {
        return String.format("%s (%d): %s", m11023c(i), Integer.valueOf(i), str);
    }

    public static String m11024b(int i) {
        if (i == 1) {
            return "The camera is disabled due to a device policy, and cannot be opened.";
        }
        if (i == 2) {
            return "The camera device is removable and has been disconnected from the Android device, or the camera service has shut down the connection due to a higher-priority access request for the camera device.";
        }
        if (i == 3) {
            return "The camera device is currently in the error state; no further calls to it will succeed.";
        }
        if (i == 4) {
            return "The camera device is in use already";
        }
        if (i == 5) {
            return "The system-wide limit for number of open cameras has been reached, and more camera devices cannot be opened until previous instances are closed.";
        }
        if (i == 10001) {
            return "Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.";
        }
        if (i != 10002) {
            return null;
        }
        return "Failed to create CameraCharacteristics.";
    }

    public static String m11023c(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 1000 ? i != 10001 ? i != 10002 ? "<UNKNOWN ERROR>" : "CAMERA_CHARACTERISTICS_CREATION_ERROR" : "CAMERA_UNAVAILABLE_DO_NOT_DISTURB" : "CAMERA_DEPRECATED_HAL" : "MAX_CAMERAS_IN_USE" : "CAMERA_IN_USE" : "CAMERA_ERROR" : "CAMERA_DISCONNECTED" : "CAMERA_DISABLED";
    }

    public static C8887f m11021e(CameraAccessException cameraAccessException) {
        Objects.requireNonNull(cameraAccessException, "cameraAccessException should not be null");
        return new C8887f(cameraAccessException);
    }

    public final int m11022d() {
        return this.f28714a;
    }

    public C8887f(int i, Throwable th) {
        super(m11024b(i), th);
        this.f28714a = i;
        this.f28715b = f28713c.contains(Integer.valueOf(i)) ? new CameraAccessException(i, null, th) : null;
    }

    public C8887f(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.f28714a = cameraAccessException.getReason();
        this.f28715b = cameraAccessException;
    }
}
