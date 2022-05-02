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
    public final CameraManager f28767a;
    public final Object f28768b;

    public static final class C8917a {
        public final Map<CameraManager.AvailabilityCallback, C8906m0.C8907a> f28769a = new HashMap();
        public final Handler f28770b;

        public C8917a(Handler handler) {
            this.f28770b = handler;
        }
    }

    public C8916q0(Context context, Object obj) {
        this.f28767a = (CameraManager) context.getSystemService("camera");
        this.f28768b = obj;
    }

    public static C8916q0 m10957f(Context context, Handler handler) {
        return new C8916q0(context, new C8917a(handler));
    }

    @Override
    public void mo10962a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        if (executor != null) {
            C8906m0.C8907a aVar = null;
            C8917a aVar2 = (C8917a) this.f28768b;
            if (availabilityCallback != null) {
                synchronized (aVar2.f28769a) {
                    aVar = aVar2.f28769a.get(availabilityCallback);
                    if (aVar == null) {
                        aVar = new C8906m0.C8907a(executor, availabilityCallback);
                        aVar2.f28769a.put(availabilityCallback, aVar);
                    }
                }
            }
            this.f28767a.registerAvailabilityCallback(aVar, aVar2.f28770b);
            return;
        }
        throw new IllegalArgumentException("executor was null");
    }

    @Override
    public void mo10961b(CameraManager.AvailabilityCallback availabilityCallback) {
        C8906m0.C8907a aVar;
        if (availabilityCallback != null) {
            C8917a aVar2 = (C8917a) this.f28768b;
            synchronized (aVar2.f28769a) {
                aVar = aVar2.f28769a.remove(availabilityCallback);
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.m10968g();
        }
        this.f28767a.unregisterAvailabilityCallback(aVar);
    }

    @Override
    public CameraCharacteristics mo10960c(String str) {
        try {
            return this.f28767a.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw C8887f.m11022e(e);
        }
    }

    @Override
    public void mo10959d(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        C1132h.m38322e(executor);
        C1132h.m38322e(stateCallback);
        try {
            this.f28767a.openCamera(str, new C8876a0.C8878b(executor, stateCallback), ((C8917a) this.f28768b).f28770b);
        } catch (CameraAccessException e) {
            throw C8887f.m11022e(e);
        }
    }

    @Override
    public String[] mo10958e() {
        try {
            return this.f28767a.getCameraIdList();
        } catch (CameraAccessException e) {
            throw C8887f.m11022e(e);
        }
    }
}
