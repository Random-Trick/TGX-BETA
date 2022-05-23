package i8;

public final class j {
    public final float f14085a;
    public final float f14086b;
    public final float f14087c;
    public final float f14088d;
    public final float f14089e;
    public final float f14090f;
    public final float f14091g;
    public final float f14092h;
    public final float f14093i;

    public j(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f14085a = f10;
        this.f14086b = f13;
        this.f14087c = f16;
        this.f14088d = f11;
        this.f14089e = f14;
        this.f14090f = f17;
        this.f14091g = f12;
        this.f14092h = f15;
        this.f14093i = f18;
    }

    public static j b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25) {
        return d(f18, f19, f20, f21, f22, f23, f24, f25).e(c(f10, f11, f12, f13, f14, f15, f16, f17));
    }

    public static j c(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return d(f10, f11, f12, f13, f14, f15, f16, f17).a();
    }

    public static j d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        float f18 = ((f10 - f12) + f14) - f16;
        float f19 = ((f11 - f13) + f15) - f17;
        if (f18 == 0.0f && f19 == 0.0f) {
            return new j(f12 - f10, f14 - f12, f10, f13 - f11, f15 - f13, f11, 0.0f, 0.0f, 1.0f);
        }
        float f20 = f12 - f14;
        float f21 = f16 - f14;
        float f22 = f13 - f15;
        float f23 = f17 - f15;
        float f24 = (f20 * f23) - (f21 * f22);
        float f25 = ((f23 * f18) - (f21 * f19)) / f24;
        float f26 = ((f20 * f19) - (f18 * f22)) / f24;
        return new j((f25 * f12) + (f12 - f10), (f26 * f16) + (f16 - f10), f10, (f13 - f11) + (f25 * f13), (f17 - f11) + (f26 * f17), f11, f25, f26, 1.0f);
    }

    public j a() {
        float f10 = this.f14089e;
        float f11 = this.f14093i;
        float f12 = this.f14090f;
        float f13 = this.f14092h;
        float f14 = (f10 * f11) - (f12 * f13);
        float f15 = this.f14091g;
        float f16 = this.f14088d;
        float f17 = (f12 * f15) - (f16 * f11);
        float f18 = (f16 * f13) - (f10 * f15);
        float f19 = this.f14087c;
        float f20 = this.f14086b;
        float f21 = (f19 * f13) - (f20 * f11);
        float f22 = this.f14085a;
        return new j(f14, f17, f18, f21, (f11 * f22) - (f19 * f15), (f15 * f20) - (f13 * f22), (f20 * f12) - (f19 * f10), (f19 * f16) - (f12 * f22), (f22 * f10) - (f20 * f16));
    }

    public j e(j jVar) {
        float f10 = this.f14085a;
        float f11 = jVar.f14085a;
        float f12 = this.f14088d;
        float f13 = jVar.f14086b;
        float f14 = this.f14091g;
        float f15 = jVar.f14087c;
        float f16 = (f10 * f11) + (f12 * f13) + (f14 * f15);
        float f17 = jVar.f14088d;
        float f18 = jVar.f14089e;
        float f19 = jVar.f14090f;
        float f20 = (f10 * f17) + (f12 * f18) + (f14 * f19);
        float f21 = jVar.f14091g;
        float f22 = jVar.f14092h;
        float f23 = jVar.f14093i;
        float f24 = (f10 * f21) + (f12 * f22) + (f14 * f23);
        float f25 = this.f14086b;
        float f26 = this.f14089e;
        float f27 = this.f14092h;
        float f28 = (f27 * f23) + (f25 * f21) + (f26 * f22);
        float f29 = this.f14087c;
        float f30 = this.f14090f;
        float f31 = (f11 * f29) + (f13 * f30);
        float f32 = this.f14093i;
        return new j(f16, f20, f24, (f25 * f11) + (f26 * f13) + (f27 * f15), (f25 * f17) + (f26 * f18) + (f27 * f19), f28, (f15 * f32) + f31, (f17 * f29) + (f18 * f30) + (f19 * f32), (f29 * f21) + (f30 * f22) + (f32 * f23));
    }

    public void f(float[] fArr) {
        float f10 = this.f14085a;
        float f11 = this.f14086b;
        float f12 = this.f14087c;
        float f13 = this.f14088d;
        float f14 = this.f14089e;
        float f15 = this.f14090f;
        float f16 = this.f14091g;
        float f17 = this.f14092h;
        float f18 = this.f14093i;
        int length = fArr.length - 1;
        for (int i10 = 0; i10 < length; i10 += 2) {
            float f19 = fArr[i10];
            int i11 = i10 + 1;
            float f20 = fArr[i11];
            float f21 = (f12 * f19) + (f15 * f20) + f18;
            fArr[i10] = (((f10 * f19) + (f13 * f20)) + f16) / f21;
            fArr[i11] = (((f19 * f11) + (f20 * f14)) + f17) / f21;
        }
    }
}
