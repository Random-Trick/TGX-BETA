package e5;

public final class d {
    public final a f10590a;
    public final a f10591b;
    public final int f10592c;
    public final boolean f10593d;

    public static final class a {
        public final b[] f10594a;

        public a(b... bVarArr) {
            this.f10594a = bVarArr;
        }

        public b a(int i10) {
            return this.f10594a[i10];
        }

        public int b() {
            return this.f10594a.length;
        }
    }

    public static final class b {
        public final int f10595a;
        public final int f10596b;
        public final float[] f10597c;
        public final float[] f10598d;

        public b(int i10, float[] fArr, float[] fArr2, int i11) {
            this.f10595a = i10;
            c5.a.a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f10597c = fArr;
            this.f10598d = fArr2;
            this.f10596b = i11;
        }

        public int a() {
            return this.f10597c.length / 3;
        }
    }

    public d(a aVar, int i10) {
        this(aVar, aVar, i10);
    }

    public static d a(float f10, int i10, int i11, float f11, float f12, int i12) {
        int i13;
        float f13;
        float[] fArr;
        int i14;
        int i15;
        int i16;
        int i17 = i10;
        int i18 = i11;
        c5.a.a(f10 > 0.0f);
        c5.a.a(i17 >= 1);
        c5.a.a(i18 >= 1);
        c5.a.a(f11 > 0.0f && f11 <= 180.0f);
        c5.a.a(f12 > 0.0f && f12 <= 360.0f);
        float radians = (float) Math.toRadians(f11);
        float radians2 = (float) Math.toRadians(f12);
        float f14 = radians / i17;
        float f15 = radians2 / i18;
        int i19 = i18 + 1;
        int i20 = ((i19 * 2) + 2) * i17;
        float[] fArr2 = new float[i20 * 3];
        float[] fArr3 = new float[i20 * 2];
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        while (i21 < i17) {
            float f16 = radians / 2.0f;
            float f17 = (i21 * f14) - f16;
            int i24 = i21 + 1;
            float f18 = (i24 * f14) - f16;
            int i25 = 0;
            while (i25 < i19) {
                float f19 = f17;
                i24 = i24;
                int i26 = 0;
                while (i26 < 2) {
                    if (i26 == 0) {
                        f13 = f19;
                        i13 = i19;
                    } else {
                        i13 = i19;
                        f13 = f18;
                    }
                    float f20 = i25 * f15;
                    f15 = f15;
                    int i27 = i22 + 1;
                    int i28 = i25;
                    double d10 = f10;
                    float f21 = f14;
                    int i29 = i26;
                    double d11 = (f20 + 3.1415927f) - (radians2 / 2.0f);
                    double d12 = f13;
                    float[] fArr4 = fArr3;
                    f18 = f18;
                    fArr2[i22] = -((float) (Math.sin(d11) * d10 * Math.cos(d12)));
                    int i30 = i27 + 1;
                    int i31 = i21;
                    fArr2[i27] = (float) (d10 * Math.sin(d12));
                    int i32 = i30 + 1;
                    fArr2[i30] = (float) (d10 * Math.cos(d11) * Math.cos(d12));
                    int i33 = i23 + 1;
                    fArr4[i23] = f20 / radians2;
                    int i34 = i33 + 1;
                    fArr4[i33] = ((i31 + i29) * f21) / radians;
                    if (i28 == 0 && i29 == 0) {
                        i16 = i11;
                        i15 = i28;
                        i14 = i29;
                    } else {
                        i16 = i11;
                        i15 = i28;
                        i14 = i29;
                        if (!(i15 == i16 && i14 == 1)) {
                            fArr = fArr4;
                            i23 = i34;
                            i22 = i32;
                            i26 = i14 + 1;
                            i18 = i16;
                            i25 = i15;
                            fArr3 = fArr;
                            i21 = i31;
                            i19 = i13;
                            f14 = f21;
                        }
                    }
                    System.arraycopy(fArr2, i32 - 3, fArr2, i32, 3);
                    i32 += 3;
                    fArr = fArr4;
                    System.arraycopy(fArr, i34 - 2, fArr, i34, 2);
                    i34 += 2;
                    i23 = i34;
                    i22 = i32;
                    i26 = i14 + 1;
                    i18 = i16;
                    i25 = i15;
                    fArr3 = fArr;
                    i21 = i31;
                    i19 = i13;
                    f14 = f21;
                }
                f14 = f14;
                f15 = f15;
                i19 = i19;
                f18 = f18;
                i18 = i18;
                i25++;
                f17 = f19;
            }
            i21 = i24;
            i17 = i10;
        }
        return new d(new a(new b(0, fArr2, fArr3, 1)), i12);
    }

    public static d b(int i10) {
        return a(50.0f, 36, 72, 180.0f, 360.0f, i10);
    }

    public d(a aVar, a aVar2, int i10) {
        this.f10590a = aVar;
        this.f10591b = aVar2;
        this.f10592c = i10;
        this.f10593d = aVar == aVar2;
    }
}
