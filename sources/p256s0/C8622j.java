package p256s0;

public final class C8622j {
    public static final C8622j f27913k = m11884k(C8603b.f27883c, (float) ((C8603b.m11969h(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    public final float f27914a;
    public final float f27915b;
    public final float f27916c;
    public final float f27917d;
    public final float f27918e;
    public final float f27919f;
    public final float[] f27920g;
    public final float f27921h;
    public final float f27922i;
    public final float f27923j;

    public C8622j(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f27919f = f;
        this.f27914a = f2;
        this.f27915b = f3;
        this.f27916c = f4;
        this.f27917d = f5;
        this.f27918e = f6;
        this.f27920g = fArr;
        this.f27921h = f7;
        this.f27922i = f8;
        this.f27923j = f9;
    }

    public static C8622j m11884k(float[] fArr, float f, float f2, float f3, boolean z) {
        float[][] fArr2 = C8603b.f27881a;
        float f4 = (fArr[0] * fArr2[0][0]) + (fArr[1] * fArr2[0][1]) + (fArr[2] * fArr2[0][2]);
        float f5 = (fArr[0] * fArr2[1][0]) + (fArr[1] * fArr2[1][1]) + (fArr[2] * fArr2[1][2]);
        float f6 = (fArr[0] * fArr2[2][0]) + (fArr[1] * fArr2[2][1]) + (fArr[2] * fArr2[2][2]);
        float f7 = (f3 / 10.0f) + 0.8f;
        float d = ((double) f7) >= 0.9d ? C8603b.m11973d(0.59f, 0.69f, (f7 - 0.9f) * 10.0f) : C8603b.m11973d(0.525f, 0.59f, (f7 - 0.8f) * 10.0f);
        float exp = z ? 1.0f : (1.0f - (((float) Math.exp(((-f) - 42.0f) / 92.0f)) * 0.2777778f)) * f7;
        double d2 = exp;
        if (d2 > 1.0d) {
            exp = 1.0f;
        } else if (d2 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f4) * exp) + 1.0f) - exp, (((100.0f / f5) * exp) + 1.0f) - exp, (((100.0f / f6) * exp) + 1.0f) - exp};
        float f8 = 1.0f / ((5.0f * f) + 1.0f);
        float f9 = f8 * f8 * f8 * f8;
        float f10 = 1.0f - f9;
        float cbrt = (f9 * f) + (0.1f * f10 * f10 * ((float) Math.cbrt(f * 5.0d)));
        float h = C8603b.m11969h(f2) / fArr[1];
        double d3 = h;
        float sqrt = ((float) Math.sqrt(d3)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d3, 0.2d));
        float[] fArr4 = {(float) Math.pow(((fArr3[0] * cbrt) * f4) / 100.0d, 0.42d), (float) Math.pow(((fArr3[1] * cbrt) * f5) / 100.0d, 0.42d), (float) Math.pow(((fArr3[2] * cbrt) * f6) / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        return new C8622j(h, ((fArr5[0] * 2.0f) + fArr5[1] + (fArr5[2] * 0.05f)) * pow, pow, pow, d, f7, fArr3, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public float m11894a() {
        return this.f27914a;
    }

    public float m11893b() {
        return this.f27917d;
    }

    public float m11892c() {
        return this.f27921h;
    }

    public float m11891d() {
        return this.f27922i;
    }

    public float m11890e() {
        return this.f27919f;
    }

    public float m11889f() {
        return this.f27915b;
    }

    public float m11888g() {
        return this.f27918e;
    }

    public float m11887h() {
        return this.f27916c;
    }

    public float[] m11886i() {
        return this.f27920g;
    }

    public float m11885j() {
        return this.f27923j;
    }
}
