package p064e9;

import android.opengl.EGL14;
import android.opengl.GLES20;
import android.util.Log;
import p094g9.C4532a;
import p106h9.C5036d;
import p106h9.C5038f;
import p106h9.C5039g;
import p107ha.C5055m;
import qa.C8298k;

public final class C4172d {
    public static final float[] f14075a;
    public static final C4172d f14076b = new C4172d();

    static {
        float[] fArr = new float[16];
        C4532a.m27482b(fArr);
        f14075a = fArr;
    }

    public static final void m28623a(String str) {
        int eglGetError;
        C8298k.m12934e(str, "opName");
        if (EGL14.eglGetError() != C5036d.m24226n()) {
            String str2 = "Error during " + str + ": EGL error 0x" + C5039g.m24204b(eglGetError);
            Log.e("Egloo", str2);
            throw new RuntimeException(str2);
        }
    }

    public static final void m28622b(String str) {
        int a;
        C8298k.m12934e(str, "opName");
        if (C5055m.m24187a(GLES20.glGetError()) != C5038f.m24215h()) {
            String str2 = "Error during " + str + ": glError 0x" + C5039g.m24204b(a) + ": " + C5039g.m24205a(a);
            Log.e("Egloo", str2);
            throw new RuntimeException(str2);
        }
    }

    public static final void m28621c(int i, String str) {
        C8298k.m12934e(str, "label");
        if (i < 0) {
            String str2 = "Unable to locate " + str + " in program";
            Log.e("Egloo", str2);
            throw new RuntimeException(str2);
        }
    }
}