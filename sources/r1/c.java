package r1;

public final class c {
    public static final c f21637e;
    public static final c f21638f;
    public static final c f21639g;
    public static final c f21640h;
    public static final c f21641i;
    public static final c f21642j;
    public final float[] f21643a;
    public final float[] f21644b;
    public final float[] f21645c = new float[3];
    public boolean f21646d = true;

    static {
        c cVar = new c();
        f21637e = cVar;
        m(cVar);
        p(cVar);
        c cVar2 = new c();
        f21638f = cVar2;
        o(cVar2);
        p(cVar2);
        c cVar3 = new c();
        f21639g = cVar3;
        l(cVar3);
        p(cVar3);
        c cVar4 = new c();
        f21640h = cVar4;
        m(cVar4);
        n(cVar4);
        c cVar5 = new c();
        f21641i = cVar5;
        o(cVar5);
        n(cVar5);
        c cVar6 = new c();
        f21642j = cVar6;
        l(cVar6);
        n(cVar6);
    }

    public c() {
        float[] fArr = new float[3];
        this.f21643a = fArr;
        float[] fArr2 = new float[3];
        this.f21644b = fArr2;
        r(fArr);
        r(fArr2);
        q();
    }

    public static void l(c cVar) {
        float[] fArr = cVar.f21644b;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    public static void m(c cVar) {
        float[] fArr = cVar.f21644b;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    public static void n(c cVar) {
        float[] fArr = cVar.f21643a;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    public static void o(c cVar) {
        float[] fArr = cVar.f21644b;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    public static void p(c cVar) {
        float[] fArr = cVar.f21643a;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    public static void r(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    public float a() {
        return this.f21645c[1];
    }

    public float b() {
        return this.f21644b[2];
    }

    public float c() {
        return this.f21643a[2];
    }

    public float d() {
        return this.f21644b[0];
    }

    public float e() {
        return this.f21643a[0];
    }

    public float f() {
        return this.f21645c[2];
    }

    public float g() {
        return this.f21645c[0];
    }

    public float h() {
        return this.f21644b[1];
    }

    public float i() {
        return this.f21643a[1];
    }

    public boolean j() {
        return this.f21646d;
    }

    public void k() {
        int length = this.f21645c.length;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < length; i10++) {
            float f11 = this.f21645c[i10];
            if (f11 > 0.0f) {
                f10 += f11;
            }
        }
        if (f10 != 0.0f) {
            int length2 = this.f21645c.length;
            for (int i11 = 0; i11 < length2; i11++) {
                float[] fArr = this.f21645c;
                if (fArr[i11] > 0.0f) {
                    fArr[i11] = fArr[i11] / f10;
                }
            }
        }
    }

    public final void q() {
        float[] fArr = this.f21645c;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }
}
