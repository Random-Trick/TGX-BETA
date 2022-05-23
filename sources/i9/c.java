package i9;

import android.opengl.EGLDisplay;
import ra.k;

public final class c {
    public final EGLDisplay f14098a;

    public c(EGLDisplay eGLDisplay) {
        this.f14098a = eGLDisplay;
    }

    public final EGLDisplay a() {
        return this.f14098a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof c) && k.b(this.f14098a, ((c) obj).f14098a);
        }
        return true;
    }

    public int hashCode() {
        EGLDisplay eGLDisplay = this.f14098a;
        if (eGLDisplay != null) {
            return eGLDisplay.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "EglDisplay(native=" + this.f14098a + ")";
    }
}
