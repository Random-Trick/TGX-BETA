package p106h9;

import android.opengl.EGLDisplay;
import qa.C8298k;

public final class C5035c {
    public final EGLDisplay f17002a;

    public C5035c(EGLDisplay eGLDisplay) {
        this.f17002a = eGLDisplay;
    }

    public final EGLDisplay m24240a() {
        return this.f17002a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C5035c) && C8298k.m12937b(this.f17002a, ((C5035c) obj).f17002a);
        }
        return true;
    }

    public int hashCode() {
        EGLDisplay eGLDisplay = this.f17002a;
        if (eGLDisplay != null) {
            return eGLDisplay.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "EglDisplay(native=" + this.f17002a + ")";
    }
}
