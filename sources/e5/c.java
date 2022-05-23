package e5;

import android.opengl.Matrix;
import c5.h0;

public final class c {
    public final float[] f10586a = new float[16];
    public final float[] f10587b = new float[16];
    public final h0<float[]> f10588c = new h0<>();
    public boolean f10589d;

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float sqrt = (float) Math.sqrt((fArr2[10] * fArr2[10]) + (fArr2[8] * fArr2[8]));
        fArr[0] = fArr2[10] / sqrt;
        fArr[2] = fArr2[8] / sqrt;
        fArr[8] = (-fArr2[8]) / sqrt;
        fArr[10] = fArr2[10] / sqrt;
    }

    public static void b(float[] fArr, float[] fArr2) {
        float f10 = fArr2[0];
        float f11 = -fArr2[1];
        float f12 = -fArr2[2];
        float length = Matrix.length(f10, f11, f12);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f10 / length, f11 / length, f12 / length);
        } else {
            Matrix.setIdentityM(fArr, 0);
        }
    }

    public boolean c(float[] fArr, long j10) {
        float[] j11 = this.f10588c.j(j10);
        if (j11 == null) {
            return false;
        }
        b(this.f10587b, j11);
        if (!this.f10589d) {
            a(this.f10586a, this.f10587b);
            this.f10589d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f10586a, 0, this.f10587b, 0);
        return true;
    }

    public void d() {
        this.f10588c.c();
        this.f10589d = false;
    }

    public void e(long j10, float[] fArr) {
        this.f10588c.a(j10, fArr);
    }
}
