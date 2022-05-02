package p242r1;

public final class C8353c {
    public static final C8353c f27062e;
    public static final C8353c f27063f;
    public static final C8353c f27064g;
    public static final C8353c f27065h;
    public static final C8353c f27066i;
    public static final C8353c f27067j;
    public final float[] f27068a;
    public final float[] f27069b;
    public final float[] f27070c = new float[3];
    public boolean f27071d = true;

    static {
        C8353c cVar = new C8353c();
        f27062e = cVar;
        m12689m(cVar);
        m12686p(cVar);
        C8353c cVar2 = new C8353c();
        f27063f = cVar2;
        m12687o(cVar2);
        m12686p(cVar2);
        C8353c cVar3 = new C8353c();
        f27064g = cVar3;
        m12690l(cVar3);
        m12686p(cVar3);
        C8353c cVar4 = new C8353c();
        f27065h = cVar4;
        m12689m(cVar4);
        m12688n(cVar4);
        C8353c cVar5 = new C8353c();
        f27066i = cVar5;
        m12687o(cVar5);
        m12688n(cVar5);
        C8353c cVar6 = new C8353c();
        f27067j = cVar6;
        m12690l(cVar6);
        m12688n(cVar6);
    }

    public C8353c() {
        float[] fArr = new float[3];
        this.f27068a = fArr;
        float[] fArr2 = new float[3];
        this.f27069b = fArr2;
        m12684r(fArr);
        m12684r(fArr2);
        m12685q();
    }

    public static void m12690l(C8353c cVar) {
        float[] fArr = cVar.f27069b;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    public static void m12689m(C8353c cVar) {
        float[] fArr = cVar.f27069b;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    public static void m12688n(C8353c cVar) {
        float[] fArr = cVar.f27068a;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    public static void m12687o(C8353c cVar) {
        float[] fArr = cVar.f27069b;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    public static void m12686p(C8353c cVar) {
        float[] fArr = cVar.f27068a;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    public static void m12684r(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    public float m12701a() {
        return this.f27070c[1];
    }

    public float m12700b() {
        return this.f27069b[2];
    }

    public float m12699c() {
        return this.f27068a[2];
    }

    public float m12698d() {
        return this.f27069b[0];
    }

    public float m12697e() {
        return this.f27068a[0];
    }

    public float m12696f() {
        return this.f27070c[2];
    }

    public float m12695g() {
        return this.f27070c[0];
    }

    public float m12694h() {
        return this.f27069b[1];
    }

    public float m12693i() {
        return this.f27068a[1];
    }

    public boolean m12692j() {
        return this.f27071d;
    }

    public void m12691k() {
        int length = this.f27070c.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            float f2 = this.f27070c[i];
            if (f2 > 0.0f) {
                f += f2;
            }
        }
        if (f != 0.0f) {
            int length2 = this.f27070c.length;
            for (int i2 = 0; i2 < length2; i2++) {
                float[] fArr = this.f27070c;
                if (fArr[i2] > 0.0f) {
                    fArr[i2] = fArr[i2] / f;
                }
            }
        }
    }

    public final void m12685q() {
        float[] fArr = this.f27070c;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }
}
