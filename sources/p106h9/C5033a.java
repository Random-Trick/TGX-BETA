package p106h9;

import android.opengl.EGLConfig;
import qa.C8298k;

public final class C5033a {
    public final EGLConfig f17000a;

    public C5033a(EGLConfig eGLConfig) {
        C8298k.m12934e(eGLConfig, "native");
        this.f17000a = eGLConfig;
    }

    public final EGLConfig m24242a() {
        return this.f17000a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C5033a) && C8298k.m12937b(this.f17000a, ((C5033a) obj).f17000a);
        }
        return true;
    }

    public int hashCode() {
        EGLConfig eGLConfig = this.f17000a;
        if (eGLConfig != null) {
            return eGLConfig.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "EglConfig(native=" + this.f17000a + ")";
    }
}
