package p242r1;

public final class C8353c {
    public static final C8353c f27065e;
    public static final C8353c f27066f;
    public static final C8353c f27067g;
    public static final C8353c f27068h;
    public static final C8353c f27069i;
    public static final C8353c f27070j;
    public final float[] f27071a;
    public final float[] f27072b;
    public final float[] f27073c = new float[3];
    public boolean f27074d = true;

    static {
        C8353c cVar = new C8353c();
        f27065e = cVar;
        m12688m(cVar);
        m12685p(cVar);
        C8353c cVar2 = new C8353c();
        f27066f = cVar2;
        m12686o(cVar2);
        m12685p(cVar2);
        C8353c cVar3 = new C8353c();
        f27067g = cVar3;
        m12689l(cVar3);
        m12685p(cVar3);
        C8353c cVar4 = new C8353c();
        f27068h = cVar4;
        m12688m(cVar4);
        m12687n(cVar4);
        C8353c cVar5 = new C8353c();
        f27069i = cVar5;
        m12686o(cVar5);
        m12687n(cVar5);
        C8353c cVar6 = new C8353c();
        f27070j = cVar6;
        m12689l(cVar6);
        m12687n(cVar6);
    }

    public C8353c() {
        float[] fArr = new float[3];
        this.f27071a = fArr;
        float[] fArr2 = new float[3];
        this.f27072b = fArr2;
        m12683r(fArr);
        m12683r(fArr2);
        m12684q();
    }

    public static void m12689l(C8353c cVar) {
        float[] fArr = cVar.f27072b;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    public static void m12688m(C8353c cVar) {
        float[] fArr = cVar.f27072b;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    public static void m12687n(C8353c cVar) {
        float[] fArr = cVar.f27071a;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    public static void m12686o(C8353c cVar) {
        float[] fArr = cVar.f27072b;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    public static void m12685p(C8353c cVar) {
        float[] fArr = cVar.f27071a;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    public static void m12683r(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    public float m12700a() {
        return this.f27073c[1];
    }

    public float m12699b() {
        return this.f27072b[2];
    }

    public float m12698c() {
        return this.f27071a[2];
    }

    public float m12697d() {
        return this.f27072b[0];
    }

    public float m12696e() {
        return this.f27071a[0];
    }

    public float m12695f() {
        return this.f27073c[2];
    }

    public float m12694g() {
        return this.f27073c[0];
    }

    public float m12693h() {
        return this.f27072b[1];
    }

    public float m12692i() {
        return this.f27071a[1];
    }

    public boolean m12691j() {
        return this.f27074d;
    }

    public void m12690k() {
        int length = this.f27073c.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            float f2 = this.f27073c[i];
            if (f2 > 0.0f) {
                f += f2;
            }
        }
        if (f != 0.0f) {
            int length2 = this.f27073c.length;
            for (int i2 = 0; i2 < length2; i2++) {
                float[] fArr = this.f27073c;
                if (fArr[i2] > 0.0f) {
                    fArr[i2] = fArr[i2] / f;
                }
            }
        }
    }

    public final void m12684q() {
        float[] fArr = this.f27073c;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }
}
