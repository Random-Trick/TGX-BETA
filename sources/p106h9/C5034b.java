package p106h9;

import android.opengl.EGLContext;
import qa.C8298k;

public final class C5034b {
    public final EGLContext f17001a;

    public C5034b(EGLContext eGLContext) {
        this.f17001a = eGLContext;
    }

    public final EGLContext m24242a() {
        return this.f17001a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C5034b) && C8298k.m12936b(this.f17001a, ((C5034b) obj).f17001a);
        }
        return true;
    }

    public int hashCode() {
        EGLContext eGLContext = this.f17001a;
        if (eGLContext != null) {
            return eGLContext.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "EglContext(native=" + this.f17001a + ")";
    }
}
