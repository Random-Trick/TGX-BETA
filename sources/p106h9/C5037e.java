package p106h9;

import android.opengl.EGLSurface;
import qa.C8298k;

public final class C5037e {
    public final EGLSurface f17023a;

    public C5037e(EGLSurface eGLSurface) {
        this.f17023a = eGLSurface;
    }

    public final EGLSurface m24224a() {
        return this.f17023a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C5037e) && C8298k.m12936b(this.f17023a, ((C5037e) obj).f17023a);
        }
        return true;
    }

    public int hashCode() {
        EGLSurface eGLSurface = this.f17023a;
        if (eGLSurface != null) {
            return eGLSurface.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "EglSurface(native=" + this.f17023a + ")";
    }
}
