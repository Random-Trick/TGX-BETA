package p256s0;

import android.graphics.Color;
import p267t0.C8929a;

public final class C8603b {
    public static final float[][] f27881a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] f27882b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] f27883c = {95.047f, 100.0f, 108.883f};
    public static final float[][] f27884d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static int m11976a(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = (f > 8.0f ? 1 : (f == 8.0f ? 0 : -1)) > 0 ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f27883c;
        return C8929a.m10946c(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    public static float m11975b(int i) {
        return m11974c(m11970g(i));
    }

    public static float m11974c(float f) {
        float f2 = f / 100.0f;
        return f2 <= 0.008856452f ? f2 * 903.2963f : (((float) Math.cbrt(f2)) * 116.0f) - 16.0f;
    }

    public static float m11973d(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    public static float m11972e(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static float[] m11971f(int i) {
        float e = m11972e(Color.red(i));
        float e2 = m11972e(Color.green(i));
        float e3 = m11972e(Color.blue(i));
        float[][] fArr = f27884d;
        return new float[]{(fArr[0][0] * e) + (fArr[0][1] * e2) + (fArr[0][2] * e3), (fArr[1][0] * e) + (fArr[1][1] * e2) + (fArr[1][2] * e3), (e * fArr[2][0]) + (e2 * fArr[2][1]) + (e3 * fArr[2][2])};
    }

    public static float m11970g(int i) {
        float e = m11972e(Color.red(i));
        float e2 = m11972e(Color.green(i));
        float e3 = m11972e(Color.blue(i));
        float[][] fArr = f27884d;
        return (e * fArr[1][0]) + (e2 * fArr[1][1]) + (e3 * fArr[1][2]);
    }

    public static float m11969h(float f) {
        return (f > 8.0f ? (float) Math.pow((f + 16.0d) / 116.0d, 3.0d) : f / 903.2963f) * 100.0f;
    }
}
