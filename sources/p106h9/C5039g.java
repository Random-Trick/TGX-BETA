package p106h9;

import android.opengl.GLU;
import android.opengl.Matrix;
import qa.C8298k;

public final class C5039g {
    public static final String m24206a(int i) {
        String gluErrorString = GLU.gluErrorString(i);
        C8298k.m12934d(gluErrorString, "GLU.gluErrorString(value)");
        return gluErrorString;
    }

    public static final String m24205b(int i) {
        String hexString = Integer.toHexString(i);
        C8298k.m12934d(hexString, "Integer.toHexString(value)");
        return hexString;
    }

    public static final float[] m24204c(float[] fArr) {
        C8298k.m12933e(fArr, "matrix");
        return (float[]) fArr.clone();
    }

    public static final void m24203d(float[] fArr) {
        C8298k.m12933e(fArr, "matrix");
        Matrix.setIdentityM(fArr, 0);
    }
}
