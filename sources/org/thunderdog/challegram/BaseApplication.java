package org.thunderdog.challegram;

import androidx.camera.camera2.Camera2Config;
import androidx.camera.core.z;
import androidx.work.a;
import ce.j0;
import q1.b;

public final class BaseApplication extends b implements a.c, z.b {
    @Override
    public a a() {
        return new a.b().a();
    }

    @Override
    public z getCameraXConfig() {
        return Camera2Config.c();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        j0.L(getApplicationContext());
    }
}
