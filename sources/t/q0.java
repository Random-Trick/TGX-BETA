package t;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import b1.h;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import t.a0;
import t.m0;

public class q0 implements m0.b {
    public final CameraManager f22813a;
    public final Object f22814b;

    public static final class a {
        public final Map<CameraManager.AvailabilityCallback, m0.a> f22815a = new HashMap();
        public final Handler f22816b;

        public a(Handler handler) {
            this.f22816b = handler;
        }
    }

    public q0(Context context, Object obj) {
        this.f22813a = (CameraManager) context.getSystemService("camera");
        this.f22814b = obj;
    }

    public static q0 f(Context context, Handler handler) {
        return new q0(context, new a(handler));
    }

    @Override
    public void a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        if (executor != null) {
            m0.a aVar = null;
            a aVar2 = (a) this.f22814b;
            if (availabilityCallback != null) {
                synchronized (aVar2.f22815a) {
                    aVar = aVar2.f22815a.get(availabilityCallback);
                    if (aVar == null) {
                        aVar = new m0.a(executor, availabilityCallback);
                        aVar2.f22815a.put(availabilityCallback, aVar);
                    }
                }
            }
            this.f22813a.registerAvailabilityCallback(aVar, aVar2.f22816b);
            return;
        }
        throw new IllegalArgumentException("executor was null");
    }

    @Override
    public void b(CameraManager.AvailabilityCallback availabilityCallback) {
        m0.a aVar;
        if (availabilityCallback != null) {
            a aVar2 = (a) this.f22814b;
            synchronized (aVar2.f22815a) {
                aVar = aVar2.f22815a.remove(availabilityCallback);
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.g();
        }
        this.f22813a.unregisterAvailabilityCallback(aVar);
    }

    @Override
    public CameraCharacteristics c(String str) {
        try {
            return this.f22813a.getCameraCharacteristics(str);
        } catch (CameraAccessException e10) {
            throw f.e(e10);
        }
    }

    @Override
    public void d(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        h.e(executor);
        h.e(stateCallback);
        try {
            this.f22813a.openCamera(str, new a0.b(executor, stateCallback), ((a) this.f22814b).f22816b);
        } catch (CameraAccessException e10) {
            throw f.e(e10);
        }
    }

    @Override
    public String[] e() {
        try {
            return this.f22813a.getCameraIdList();
        } catch (CameraAccessException e10) {
            throw f.e(e10);
        }
    }
}
