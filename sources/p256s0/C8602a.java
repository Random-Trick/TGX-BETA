package p256s0;

import p267t0.C8929a;

public class C8602a {
    public final float f27872a;
    public final float f27873b;
    public final float f27874c;
    public final float f27875d;
    public final float f27876e;
    public final float f27877f;
    public final float f27878g;
    public final float f27879h;
    public final float f27880i;

    public C8602a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f27872a = f;
        this.f27873b = f2;
        this.f27874c = f3;
        this.f27875d = f4;
        this.f27876e = f5;
        this.f27877f = f6;
        this.f27878g = f7;
        this.f27879h = f8;
        this.f27880i = f9;
    }

    public static C8602a m11991b(float f, float f2, float f3) {
        float f4 = 1000.0f;
        C8602a aVar = null;
        float f5 = 1000.0f;
        float f6 = 100.0f;
        float f7 = 0.0f;
        while (Math.abs(f7 - f6) > 0.01f) {
            float f8 = ((f6 - f7) / 2.0f) + f7;
            int p = m11988e(f8, f2, f).m11977p();
            float b = C8603b.m11975b(p);
            float abs = Math.abs(f3 - b);
            if (abs < 0.2f) {
                C8602a c = m11990c(p);
                float a = c.m11992a(m11988e(c.m11982k(), c.m11984i(), f));
                if (a <= 1.0f) {
                    aVar = c;
                    f4 = abs;
                    f5 = a;
                }
            }
            if (f4 == 0.0f && f5 == 0.0f) {
                break;
            } else if (b < f3) {
                f7 = f8;
            } else {
                f6 = f8;
            }
        }
        return aVar;
    }

    public static C8602a m11990c(int i) {
        return m11989d(i, C8622j.f27913k);
    }

    public static C8602a m11989d(int i, C8622j jVar) {
        float pow;
        float[] f = C8603b.m11971f(i);
        float[][] fArr = C8603b.f27881a;
        float f2 = (f[0] * fArr[0][0]) + (f[1] * fArr[0][1]) + (f[2] * fArr[0][2]);
        float f3 = (f[0] * fArr[1][0]) + (f[1] * fArr[1][1]) + (f[2] * fArr[1][2]);
        float f4 = (f[0] * fArr[2][0]) + (f[1] * fArr[2][1]) + (f[2] * fArr[2][2]);
        float f5 = jVar.m11886i()[0] * f2;
        float f6 = jVar.m11886i()[1] * f3;
        float f7 = jVar.m11886i()[2] * f4;
        float pow2 = (float) Math.pow((jVar.m11892c() * Math.abs(f5)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((jVar.m11892c() * Math.abs(f6)) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((jVar.m11892c() * Math.abs(f7)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f5) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f6) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f7) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d = signum3;
        float f8 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d)) / 11.0f;
        float f9 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f10 = signum2 * 20.0f;
        float f11 = (((signum * 20.0f) + f10) + (21.0f * signum3)) / 20.0f;
        float f12 = (((signum * 40.0f) + f10) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f9, f8)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f13 = atan2;
        float f14 = (3.1415927f * f13) / 180.0f;
        float pow5 = ((float) Math.pow((f12 * jVar.m11889f()) / jVar.m11894a(), jVar.m11893b() * jVar.m11885j())) * 100.0f;
        float d2 = jVar.m11891d() * (4.0f / jVar.m11893b()) * ((float) Math.sqrt(pow5 / 100.0f)) * (jVar.m11894a() + 4.0f);
        float pow6 = ((float) Math.pow(1.64d - Math.pow(0.29d, jVar.m11890e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f13) < 20.14d ? 360.0f + f13 : f13) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * jVar.m11888g()) * jVar.m11887h()) * ((float) Math.sqrt((f8 * f8) + (f9 * f9)))) / (f11 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow5 / 100.0d));
        float d3 = pow6 * jVar.m11891d();
        float sqrt = ((float) Math.sqrt((pow * jVar.m11893b()) / (jVar.m11894a() + 4.0f))) * 50.0f;
        float f15 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((0.0228f * d3) + 1.0f)) * 43.85965f;
        double d4 = f14;
        return new C8602a(f13, pow6, pow5, d2, d3, sqrt, f15, log * ((float) Math.cos(d4)), log * ((float) Math.sin(d4)));
    }

    public static C8602a m11988e(float f, float f2, float f3) {
        return m11987f(f, f2, f3, C8622j.f27913k);
    }

    public static C8602a m11987f(float f, float f2, float f3, C8622j jVar) {
        double d;
        float b = (4.0f / jVar.m11893b()) * ((float) Math.sqrt(f / 100.0d)) * (jVar.m11894a() + 4.0f) * jVar.m11891d();
        float d2 = f2 * jVar.m11891d();
        float sqrt = ((float) Math.sqrt(((f2 / ((float) Math.sqrt(d))) * jVar.m11893b()) / (jVar.m11894a() + 4.0f))) * 50.0f;
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((d2 * 0.0228d) + 1.0d)) * 43.85965f;
        double d3 = (3.1415927f * f3) / 180.0f;
        return new C8602a(f3, f2, f, b, d2, sqrt, f4, log * ((float) Math.cos(d3)), log * ((float) Math.sin(d3)));
    }

    public static int m11980m(float f, float f2, float f3) {
        return m11979n(f, f2, f3, C8622j.f27913k);
    }

    public static int m11979n(float f, float f2, float f3, C8622j jVar) {
        if (f2 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
            return C8603b.m11976a(f3);
        }
        float min = f < 0.0f ? 0.0f : Math.min(360.0f, f);
        C8602a aVar = null;
        float f4 = f2;
        float f5 = 0.0f;
        boolean z = true;
        while (Math.abs(f5 - f2) >= 0.4f) {
            C8602a b = m11991b(min, f4, f3);
            if (z) {
                if (b != null) {
                    return b.m11978o(jVar);
                }
                z = false;
            } else if (b == null) {
                f2 = f4;
            } else {
                f5 = f4;
                aVar = b;
            }
            f4 = ((f2 - f5) / 2.0f) + f5;
        }
        if (aVar == null) {
            return C8603b.m11976a(f3);
        }
        return aVar.m11978o(jVar);
    }

    public float m11992a(C8602a aVar) {
        float l = m11981l() - aVar.m11981l();
        float g = m11986g() - aVar.m11986g();
        float h = m11985h() - aVar.m11985h();
        return (float) (Math.pow(Math.sqrt((l * l) + (g * g) + (h * h)), 0.63d) * 1.41d);
    }

    public float m11986g() {
        return this.f27879h;
    }

    public float m11985h() {
        return this.f27880i;
    }

    public float m11984i() {
        return this.f27873b;
    }

    public float m11983j() {
        return this.f27872a;
    }

    public float m11982k() {
        return this.f27874c;
    }

    public float m11981l() {
        return this.f27878g;
    }

    public int m11978o(C8622j jVar) {
        float f;
        float pow = (float) Math.pow(((((double) m11984i()) == 0.0d || ((double) m11982k()) == 0.0d) ? 0.0f : m11984i() / ((float) Math.sqrt(m11982k() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, jVar.m11890e()), 0.73d), 1.1111111111111112d);
        double j = (m11983j() * 3.1415927f) / 180.0f;
        float a = jVar.m11894a() * ((float) Math.pow(m11982k() / 100.0d, (1.0d / jVar.m11893b()) / jVar.m11885j()));
        float cos = ((float) (Math.cos(2.0d + j) + 3.8d)) * 0.25f * 3846.1538f * jVar.m11888g() * jVar.m11887h();
        float f2 = a / jVar.m11889f();
        float sin = (float) Math.sin(j);
        float cos2 = (float) Math.cos(j);
        float f3 = (((0.305f + f2) * 23.0f) * pow) / (((cos * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f4 = cos2 * f3;
        float f5 = f3 * sin;
        float f6 = f2 * 460.0f;
        float f7 = (((451.0f * f4) + f6) + (288.0f * f5)) / 1403.0f;
        float f8 = ((f6 - (891.0f * f4)) - (261.0f * f5)) / 1403.0f;
        float signum = Math.signum(f7) * (100.0f / jVar.m11892c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f7) * 27.13d) / (400.0d - Math.abs(f7))), 2.380952380952381d));
        float signum2 = Math.signum(f8) * (100.0f / jVar.m11892c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f8) * 27.13d) / (400.0d - Math.abs(f8))), 2.380952380952381d));
        float signum3 = Math.signum(((f6 - (f4 * 220.0f)) - (f5 * 6300.0f)) / 1403.0f) * (100.0f / jVar.m11892c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f) * 27.13d) / (400.0d - Math.abs(f))), 2.380952380952381d));
        float f9 = signum / jVar.m11886i()[0];
        float f10 = signum2 / jVar.m11886i()[1];
        float f11 = signum3 / jVar.m11886i()[2];
        float[][] fArr = C8603b.f27882b;
        return C8929a.m10946c((fArr[0][0] * f9) + (fArr[0][1] * f10) + (fArr[0][2] * f11), (fArr[1][0] * f9) + (fArr[1][1] * f10) + (fArr[1][2] * f11), (f9 * fArr[2][0]) + (f10 * fArr[2][1]) + (f11 * fArr[2][2]));
    }

    public int m11977p() {
        return m11978o(C8622j.f27913k);
    }
}
