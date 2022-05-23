package i9;

import android.opengl.EGLConfig;
import ra.k;

public final class a {
    public final EGLConfig f14096a;

    public a(EGLConfig eGLConfig) {
        k.e(eGLConfig, "native");
        this.f14096a = eGLConfig;
    }

    public final EGLConfig a() {
        return this.f14096a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && k.b(this.f14096a, ((a) obj).f14096a);
        }
        return true;
    }

    public int hashCode() {
        EGLConfig eGLConfig = this.f14096a;
        if (eGLConfig != null) {
            return eGLConfig.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "EglConfig(native=" + this.f14096a + ")";
    }
}
