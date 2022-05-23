package t;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.concurrent.Executor;

public class o0 extends q0 {
    public o0(Context context) {
        super(context, null);
    }

    public static o0 g(Context context) {
        return new o0(context);
    }

    public static boolean i(Throwable th) {
        StackTraceElement[] stackTrace;
        if (!th.getClass().equals(RuntimeException.class) || (stackTrace = th.getStackTrace()) == null || stackTrace.length < 0) {
            return false;
        }
        return "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    @Override
    public void a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f22813a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override
    public void b(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f22813a.unregisterAvailabilityCallback(availabilityCallback);
    }

    @Override
    public CameraCharacteristics c(String str) {
        try {
            return super.c(str);
        } catch (RuntimeException e10) {
            if (h(e10)) {
                j(e10);
            }
            throw e10;
        }
    }

    @Override
    public void d(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        try {
            this.f22813a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e10) {
            throw f.e(e10);
        } catch (IllegalArgumentException e11) {
            throw e11;
        } catch (SecurityException e12) {
        } catch (RuntimeException e13) {
            if (h(e13)) {
                j(e13);
            }
            throw e13;
        }
    }

    public final boolean h(Throwable th) {
        return Build.VERSION.SDK_INT == 28 && i(th);
    }

    public final void j(Throwable th) {
        throw new f(10001, th);
    }
}
