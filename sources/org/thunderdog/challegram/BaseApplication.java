package org.thunderdog.challegram;

import androidx.camera.camera2.Camera2Config;
import androidx.camera.core.C0504a0;
import androidx.work.C1066a;
import be.C1379j0;
import p228q1.ApplicationC8136b;

public final class BaseApplication extends ApplicationC8136b implements C1066a.AbstractC1069c, C0504a0.AbstractC0506b {
    @Override
    public C1066a mo14755a() {
        return new C1066a.C1068b().m38485a();
    }

    @Override
    public C0504a0 getCameraXConfig() {
        return Camera2Config.m41021c();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        C1379j0.m37359L(getApplicationContext());
    }
}
