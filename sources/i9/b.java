package i9;

import android.opengl.EGLContext;
import ra.k;

public final class b {
    public final EGLContext f14097a;

    public b(EGLContext eGLContext) {
        this.f14097a = eGLContext;
    }

    public final EGLContext a() {
        return this.f14097a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && k.b(this.f14097a, ((b) obj).f14097a);
        }
        return true;
    }

    public int hashCode() {
        EGLContext eGLContext = this.f14097a;
        if (eGLContext != null) {
            return eGLContext.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "EglContext(native=" + this.f14097a + ")";
    }
}
