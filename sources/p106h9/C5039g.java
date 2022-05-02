package p106h9;

import android.opengl.GLU;
import android.opengl.Matrix;
import qa.C8298k;

public final class C5039g {
    public static final String m24205a(int i) {
        String gluErrorString = GLU.gluErrorString(i);
        C8298k.m12935d(gluErrorString, "GLU.gluErrorString(value)");
        return gluErrorString;
    }

    public static final String m24204b(int i) {
        String hexString = Integer.toHexString(i);
        C8298k.m12935d(hexString, "Integer.toHexString(value)");
        return hexString;
    }

    public static final float[] m24203c(float[] fArr) {
        C8298k.m12934e(fArr, "matrix");
        return (float[]) fArr.clone();
    }

    public static final void m24202d(float[] fArr) {
        C8298k.m12934e(fArr, "matrix");
        Matrix.setIdentityM(fArr, 0);
    }
}
