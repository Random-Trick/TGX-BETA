package i9;

import android.opengl.GLU;
import android.opengl.Matrix;
import ra.k;

public final class g {
    public static final String a(int i10) {
        String gluErrorString = GLU.gluErrorString(i10);
        k.d(gluErrorString, "GLU.gluErrorString(value)");
        return gluErrorString;
    }

    public static final String b(int i10) {
        String hexString = Integer.toHexString(i10);
        k.d(hexString, "Integer.toHexString(value)");
        return hexString;
    }

    public static final float[] c(float[] fArr) {
        k.e(fArr, "matrix");
        return (float[]) fArr.clone();
    }

    public static final void d(float[] fArr) {
        k.e(fArr, "matrix");
        Matrix.setIdentityM(fArr, 0);
    }
}
