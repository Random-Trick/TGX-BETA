package i9;

import android.opengl.EGLSurface;
import ra.k;

public final class e {
    public final EGLSurface f14119a;

    public e(EGLSurface eGLSurface) {
        this.f14119a = eGLSurface;
    }

    public final EGLSurface a() {
        return this.f14119a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof e) && k.b(this.f14119a, ((e) obj).f14119a);
        }
        return true;
    }

    public int hashCode() {
        EGLSurface eGLSurface = this.f14119a;
        if (eGLSurface != null) {
            return eGLSurface.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "EglSurface(native=" + this.f14119a + ")";
    }
}
