package p266t;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p016b1.C1132h;
import p266t.C8876a0;
import p266t.C8906m0;

public class C8916q0 implements C8906m0.AbstractC8908b {
    public final CameraManager f28770a;
    public final Object f28771b;

    public static final class C8917a {
        public final Map<CameraManager.AvailabilityCallback, C8906m0.C8907a> f28772a = new HashMap();
        public final Handler f28773b;

        public C8917a(Handler handler) {
            this.f28773b = handler;
        }
    }

    public C8916q0(Context context, Object obj) {
        this.f28770a = (CameraManager) context.getSystemService("camera");
        this.f28771b = obj;
    }

    public static C8916q0 m10956f(Context context, Handler handler) {
        return new C8916q0(context, new C8917a(handler));
    }

    @Override
    public void mo10961a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        if (executor != null) {
            C8906m0.C8907a aVar = null;
            C8917a aVar2 = (C8917a) this.f28771b;
            if (availabilityCallback != null) {
                synchronized (aVar2.f28772a) {
                    aVar = aVar2.f28772a.get(availabilityCallback);
                    if (aVar == null) {
                        aVar = new C8906m0.C8907a(executor, availabilityCallback);
                        aVar2.f28772a.put(availabilityCallback, aVar);
                    }
                }
            }
            this.f28770a.registerAvailabilityCallback(aVar, aVar2.f28773b);
            return;
        }
        throw new IllegalArgumentException("executor was null");
    }

    @Override
    public void mo10960b(CameraManager.AvailabilityCallback availabilityCallback) {
        C8906m0.C8907a aVar;
        if (availabilityCallback != null) {
            C8917a aVar2 = (C8917a) this.f28771b;
            synchronized (aVar2.f28772a) {
                aVar = aVar2.f28772a.remove(availabilityCallback);
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.m10967g();
        }
        this.f28770a.unregisterAvailabilityCallback(aVar);
    }

    @Override
    public CameraCharacteristics mo10959c(String str) {
        try {
            return this.f28770a.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw C8887f.m11021e(e);
        }
    }

    @Override
    public void mo10958d(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        C1132h.m38325e(executor);
        C1132h.m38325e(stateCallback);
        try {
            this.f28770a.openCamera(str, new C8876a0.C8878b(executor, stateCallback), ((C8917a) this.f28771b).f28773b);
        } catch (CameraAccessException e) {
            throw C8887f.m11021e(e);
        }
    }

    @Override
    public String[] mo10957e() {
        try {
            return this.f28770a.getCameraIdList();
        } catch (CameraAccessException e) {
            throw C8887f.m11021e(e);
        }
    }
}
