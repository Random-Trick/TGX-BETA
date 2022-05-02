package p045d5;

import p020b5.C1186a;

public final class C3604d {
    public final C3605a f12287a;
    public final C3605a f12288b;
    public final int f12289c;
    public final boolean f12290d;

    public static final class C3605a {
        public final C3606b[] f12291a;

        public C3605a(C3606b... bVarArr) {
            this.f12291a = bVarArr;
        }

        public C3606b m29881a(int i) {
            return this.f12291a[i];
        }

        public int m29880b() {
            return this.f12291a.length;
        }
    }

    public static final class C3606b {
        public final int f12292a;
        public final int f12293b;
        public final float[] f12294c;
        public final float[] f12295d;

        public C3606b(int i, float[] fArr, float[] fArr2, int i2) {
            this.f12292a = i;
            C1186a.m38189a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f12294c = fArr;
            this.f12295d = fArr2;
            this.f12293b = i2;
        }

        public int m29879a() {
            return this.f12294c.length / 3;
        }
    }

    public C3604d(C3605a aVar, int i) {
        this(aVar, aVar, i);
    }

    public static C3604d m29883a(float f, int i, int i2, float f2, float f3, int i3) {
        int i4;
        float f4;
        float[] fArr;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        int i9 = i2;
        C1186a.m38189a(f > 0.0f);
        C1186a.m38189a(i8 >= 1);
        C1186a.m38189a(i9 >= 1);
        C1186a.m38189a(f2 > 0.0f && f2 <= 180.0f);
        C1186a.m38189a(f3 > 0.0f && f3 <= 360.0f);
        float radians = (float) Math.toRadians(f2);
        float radians2 = (float) Math.toRadians(f3);
        float f5 = radians / i8;
        float f6 = radians2 / i9;
        int i10 = i9 + 1;
        int i11 = ((i10 * 2) + 2) * i8;
        float[] fArr2 = new float[i11 * 3];
        float[] fArr3 = new float[i11 * 2];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < i8) {
            float f7 = radians / 2.0f;
            float f8 = (i12 * f5) - f7;
            int i15 = i12 + 1;
            float f9 = (i15 * f5) - f7;
            int i16 = 0;
            while (i16 < i10) {
                float f10 = f8;
                i15 = i15;
                int i17 = 0;
                while (i17 < 2) {
                    if (i17 == 0) {
                        f4 = f10;
                        i4 = i10;
                    } else {
                        i4 = i10;
                        f4 = f9;
                    }
                    float f11 = i16 * f6;
                    f6 = f6;
                    int i18 = i13 + 1;
                    int i19 = i16;
                    double d = f;
                    float f12 = f5;
                    int i20 = i17;
                    double d2 = (f11 + 3.1415927f) - (radians2 / 2.0f);
                    double d3 = f4;
                    float[] fArr4 = fArr3;
                    f9 = f9;
                    fArr2[i13] = -((float) (Math.sin(d2) * d * Math.cos(d3)));
                    int i21 = i18 + 1;
                    int i22 = i12;
                    fArr2[i18] = (float) (d * Math.sin(d3));
                    int i23 = i21 + 1;
                    fArr2[i21] = (float) (d * Math.cos(d2) * Math.cos(d3));
                    int i24 = i14 + 1;
                    fArr4[i14] = f11 / radians2;
                    int i25 = i24 + 1;
                    fArr4[i24] = ((i22 + i20) * f12) / radians;
                    if (i19 == 0 && i20 == 0) {
                        i7 = i2;
                        i6 = i19;
                        i5 = i20;
                    } else {
                        i7 = i2;
                        i6 = i19;
                        i5 = i20;
                        if (!(i6 == i7 && i5 == 1)) {
                            fArr = fArr4;
                            i14 = i25;
                            i13 = i23;
                            i17 = i5 + 1;
                            i9 = i7;
                            i16 = i6;
                            fArr3 = fArr;
                            i12 = i22;
                            i10 = i4;
                            f5 = f12;
                        }
                    }
                    System.arraycopy(fArr2, i23 - 3, fArr2, i23, 3);
                    i23 += 3;
                    fArr = fArr4;
                    System.arraycopy(fArr, i25 - 2, fArr, i25, 2);
                    i25 += 2;
                    i14 = i25;
                    i13 = i23;
                    i17 = i5 + 1;
                    i9 = i7;
                    i16 = i6;
                    fArr3 = fArr;
                    i12 = i22;
                    i10 = i4;
                    f5 = f12;
                }
                f5 = f5;
                f6 = f6;
                i10 = i10;
                f9 = f9;
                i9 = i9;
                i16++;
                f8 = f10;
            }
            i12 = i15;
            i8 = i;
        }
        return new C3604d(new C3605a(new C3606b(0, fArr2, fArr3, 1)), i3);
    }

    public static C3604d m29882b(int i) {
        return m29883a(50.0f, 36, 72, 180.0f, 360.0f, i);
    }

    public C3604d(C3605a aVar, C3605a aVar2, int i) {
        this.f12287a = aVar;
        this.f12288b = aVar2;
        this.f12289c = i;
        this.f12290d = aVar == aVar2;
    }
}
