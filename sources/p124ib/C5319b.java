package p124ib;

public class C5319b {
    public float[] f17494a;
    public int f17495b;

    public C5319b(int i) {
        this.f17494a = new float[i];
    }

    public void m23294a(float f) {
        int i = this.f17495b + 1;
        float[] fArr = this.f17494a;
        m23292c(i, fArr.length == 0 ? 10 : fArr.length << 1);
        float[] fArr2 = this.f17494a;
        int i2 = this.f17495b;
        this.f17495b = i2 + 1;
        fArr2[i2] = f;
    }

    public void m23293b() {
        this.f17495b = 0;
    }

    public void m23292c(int i, int i2) {
        float[] fArr = this.f17494a;
        if (fArr.length < i) {
            float[] fArr2 = new float[Math.max(i, fArr.length + i2)];
            float[] fArr3 = this.f17494a;
            System.arraycopy(fArr3, 0, fArr2, 0, fArr3.length);
            this.f17494a = fArr2;
        }
    }

    public float m23291d(int i) {
        return this.f17494a[i];
    }

    public float[] m23290e() {
        m23286i();
        return this.f17494a;
    }

    public boolean m23289f() {
        return this.f17495b == 0;
    }

    public int m23288g() {
        return this.f17495b;
    }

    public float m23287h() {
        float f = 0.0f;
        for (int i = 0; i < this.f17495b; i++) {
            f += this.f17494a[i];
        }
        return f;
    }

    public void m23286i() {
        int i = this.f17495b;
        float[] fArr = this.f17494a;
        if (i < fArr.length) {
            float[] fArr2 = new float[i];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f17494a = fArr2;
        }
    }

    public C5319b(float[] fArr) {
        this.f17494a = fArr;
        this.f17495b = fArr.length;
    }
}
