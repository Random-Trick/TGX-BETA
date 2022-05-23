package f9;

import android.opengl.EGL14;
import android.opengl.GLES20;
import android.util.Log;
import h9.a;
import i9.f;
import i9.g;
import ia.m;
import ra.k;

public final class d {
    public static final float[] f11871a;
    public static final d f11872b = new d();

    static {
        float[] fArr = new float[16];
        a.b(fArr);
        f11871a = fArr;
    }

    public static final void a(String str) {
        int eglGetError;
        k.e(str, "opName");
        if (EGL14.eglGetError() != i9.d.n()) {
            String str2 = "Error during " + str + ": EGL error 0x" + g.b(eglGetError);
            Log.e("Egloo", str2);
            throw new RuntimeException(str2);
        }
    }

    public static final void b(String str) {
        int a10;
        k.e(str, "opName");
        if (m.a(GLES20.glGetError()) != f.h()) {
            String str2 = "Error during " + str + ": glError 0x" + g.b(a10) + ": " + g.a(a10);
            Log.e("Egloo", str2);
            throw new RuntimeException(str2);
        }
    }

    public static final void c(int i10, String str) {
        k.e(str, "label");
        if (i10 < 0) {
            String str2 = "Unable to locate " + str + " in program";
            Log.e("Egloo", str2);
            throw new RuntimeException(str2);
        }
    }
}
