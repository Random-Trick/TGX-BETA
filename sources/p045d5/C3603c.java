package p045d5;

import android.opengl.Matrix;
import p020b5.C1203h0;

public final class C3603c {
    public final float[] f12283a = new float[16];
    public final float[] f12284b = new float[16];
    public final C1203h0<float[]> f12285c = new C1203h0<>();
    public boolean f12286d;

    public static void m29888a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float sqrt = (float) Math.sqrt((fArr2[10] * fArr2[10]) + (fArr2[8] * fArr2[8]));
        fArr[0] = fArr2[10] / sqrt;
        fArr[2] = fArr2[8] / sqrt;
        fArr[8] = (-fArr2[8]) / sqrt;
        fArr[10] = fArr2[10] / sqrt;
    }

    public static void m29887b(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = -fArr2[1];
        float f3 = -fArr2[2];
        float length = Matrix.length(f, f2, f3);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
        } else {
            Matrix.setIdentityM(fArr, 0);
        }
    }

    public boolean m29886c(float[] fArr, long j) {
        float[] j2 = this.f12285c.m38060j(j);
        if (j2 == null) {
            return false;
        }
        m29887b(this.f12284b, j2);
        if (!this.f12286d) {
            m29888a(this.f12283a, this.f12284b);
            this.f12286d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f12283a, 0, this.f12284b, 0);
        return true;
    }

    public void m29885d() {
        this.f12285c.m38067c();
        this.f12286d = false;
    }

    public void m29884e(long j, float[] fArr) {
        this.f12285c.m38069a(j, fArr);
    }
}
