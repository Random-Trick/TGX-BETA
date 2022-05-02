package p266t;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.concurrent.Executor;

public class C8912o0 extends C8916q0 {
    public C8912o0(Context context) {
        super(context, null);
    }

    public static C8912o0 m10966g(Context context) {
        return new C8912o0(context);
    }

    public static boolean m10964i(Throwable th) {
        StackTraceElement[] stackTrace;
        if (!th.getClass().equals(RuntimeException.class) || (stackTrace = th.getStackTrace()) == null || stackTrace.length < 0) {
            return false;
        }
        return "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    @Override
    public void mo10962a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f28767a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override
    public void mo10961b(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f28767a.unregisterAvailabilityCallback(availabilityCallback);
    }

    @Override
    public CameraCharacteristics mo10960c(String str) {
        try {
            return super.mo10960c(str);
        } catch (RuntimeException e) {
            if (m10965h(e)) {
                m10963j(e);
            }
            throw e;
        }
    }

    @Override
    public void mo10959d(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        try {
            this.f28767a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            throw C8887f.m11022e(e);
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (SecurityException e3) {
        } catch (RuntimeException e4) {
            if (m10965h(e4)) {
                m10963j(e4);
            }
            throw e4;
        }
    }

    public final boolean m10965h(Throwable th) {
        return Build.VERSION.SDK_INT == 28 && m10964i(th);
    }

    public final void m10963j(Throwable th) {
        throw new C8887f(10001, th);
    }
}
