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

    public static C8912o0 m10965g(Context context) {
        return new C8912o0(context);
    }

    public static boolean m10963i(Throwable th) {
        StackTraceElement[] stackTrace;
        if (!th.getClass().equals(RuntimeException.class) || (stackTrace = th.getStackTrace()) == null || stackTrace.length < 0) {
            return false;
        }
        return "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    @Override
    public void mo10961a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f28770a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override
    public void mo10960b(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f28770a.unregisterAvailabilityCallback(availabilityCallback);
    }

    @Override
    public CameraCharacteristics mo10959c(String str) {
        try {
            return super.mo10959c(str);
        } catch (RuntimeException e) {
            if (m10964h(e)) {
                m10962j(e);
            }
            throw e;
        }
    }

    @Override
    public void mo10958d(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        try {
            this.f28770a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            throw C8887f.m11021e(e);
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (SecurityException e3) {
        } catch (RuntimeException e4) {
            if (m10964h(e4)) {
                m10962j(e4);
            }
            throw e4;
        }
    }

    public final boolean m10964h(Throwable th) {
        return Build.VERSION.SDK_INT == 28 && m10963i(th);
    }

    public final void m10962j(Throwable th) {
        throw new C8887f(10001, th);
    }
}
