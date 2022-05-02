package p105h8;

public final class C5031j {
    public final float f16989a;
    public final float f16990b;
    public final float f16991c;
    public final float f16992d;
    public final float f16993e;
    public final float f16994f;
    public final float f16995g;
    public final float f16996h;
    public final float f16997i;

    public C5031j(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f16989a = f;
        this.f16990b = f4;
        this.f16991c = f7;
        this.f16992d = f2;
        this.f16993e = f5;
        this.f16994f = f8;
        this.f16995g = f3;
        this.f16996h = f6;
        this.f16997i = f9;
    }

    public static C5031j m24249b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        return m24247d(f9, f10, f11, f12, f13, f14, f15, f16).m24246e(m24248c(f, f2, f3, f4, f5, f6, f7, f8));
    }

    public static C5031j m24248c(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return m24247d(f, f2, f3, f4, f5, f6, f7, f8).m24250a();
    }

    public static C5031j m24247d(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = ((f - f3) + f5) - f7;
        float f10 = ((f2 - f4) + f6) - f8;
        if (f9 == 0.0f && f10 == 0.0f) {
            return new C5031j(f3 - f, f5 - f3, f, f4 - f2, f6 - f4, f2, 0.0f, 0.0f, 1.0f);
        }
        float f11 = f3 - f5;
        float f12 = f7 - f5;
        float f13 = f4 - f6;
        float f14 = f8 - f6;
        float f15 = (f11 * f14) - (f12 * f13);
        float f16 = ((f14 * f9) - (f12 * f10)) / f15;
        float f17 = ((f11 * f10) - (f9 * f13)) / f15;
        return new C5031j((f16 * f3) + (f3 - f), (f17 * f7) + (f7 - f), f, (f4 - f2) + (f16 * f4), (f8 - f2) + (f17 * f8), f2, f16, f17, 1.0f);
    }

    public C5031j m24250a() {
        float f = this.f16993e;
        float f2 = this.f16997i;
        float f3 = this.f16994f;
        float f4 = this.f16996h;
        float f5 = (f * f2) - (f3 * f4);
        float f6 = this.f16995g;
        float f7 = this.f16992d;
        float f8 = (f3 * f6) - (f7 * f2);
        float f9 = (f7 * f4) - (f * f6);
        float f10 = this.f16991c;
        float f11 = this.f16990b;
        float f12 = (f10 * f4) - (f11 * f2);
        float f13 = this.f16989a;
        return new C5031j(f5, f8, f9, f12, (f2 * f13) - (f10 * f6), (f6 * f11) - (f4 * f13), (f11 * f3) - (f10 * f), (f10 * f7) - (f3 * f13), (f13 * f) - (f11 * f7));
    }

    public C5031j m24246e(C5031j jVar) {
        float f = this.f16989a;
        float f2 = jVar.f16989a;
        float f3 = this.f16992d;
        float f4 = jVar.f16990b;
        float f5 = this.f16995g;
        float f6 = jVar.f16991c;
        float f7 = (f * f2) + (f3 * f4) + (f5 * f6);
        float f8 = jVar.f16992d;
        float f9 = jVar.f16993e;
        float f10 = jVar.f16994f;
        float f11 = (f * f8) + (f3 * f9) + (f5 * f10);
        float f12 = jVar.f16995g;
        float f13 = jVar.f16996h;
        float f14 = jVar.f16997i;
        float f15 = (f * f12) + (f3 * f13) + (f5 * f14);
        float f16 = this.f16990b;
        float f17 = this.f16993e;
        float f18 = this.f16996h;
        float f19 = (f18 * f14) + (f16 * f12) + (f17 * f13);
        float f20 = this.f16991c;
        float f21 = this.f16994f;
        float f22 = (f2 * f20) + (f4 * f21);
        float f23 = this.f16997i;
        return new C5031j(f7, f11, f15, (f16 * f2) + (f17 * f4) + (f18 * f6), (f16 * f8) + (f17 * f9) + (f18 * f10), f19, (f6 * f23) + f22, (f8 * f20) + (f9 * f21) + (f10 * f23), (f20 * f12) + (f21 * f13) + (f23 * f14));
    }

    public void m24245f(float[] fArr) {
        float f = this.f16989a;
        float f2 = this.f16990b;
        float f3 = this.f16991c;
        float f4 = this.f16992d;
        float f5 = this.f16993e;
        float f6 = this.f16994f;
        float f7 = this.f16995g;
        float f8 = this.f16996h;
        float f9 = this.f16997i;
        int length = fArr.length - 1;
        for (int i = 0; i < length; i += 2) {
            float f10 = fArr[i];
            int i2 = i + 1;
            float f11 = fArr[i2];
            float f12 = (f3 * f10) + (f6 * f11) + f9;
            fArr[i] = (((f * f10) + (f4 * f11)) + f7) / f12;
            fArr[i2] = (((f10 * f2) + (f11 * f5)) + f8) / f12;
        }
    }
}
