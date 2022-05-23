package jb;

public class b {
    public float[] f15181a;
    public int f15182b;

    public b(int i10) {
        this.f15181a = new float[i10];
    }

    public void a(float f10) {
        int i10 = this.f15182b + 1;
        float[] fArr = this.f15181a;
        c(i10, fArr.length == 0 ? 10 : fArr.length << 1);
        float[] fArr2 = this.f15181a;
        int i11 = this.f15182b;
        this.f15182b = i11 + 1;
        fArr2[i11] = f10;
    }

    public void b() {
        this.f15182b = 0;
    }

    public void c(int i10, int i11) {
        float[] fArr = this.f15181a;
        if (fArr.length < i10) {
            float[] fArr2 = new float[Math.max(i10, fArr.length + i11)];
            float[] fArr3 = this.f15181a;
            System.arraycopy(fArr3, 0, fArr2, 0, fArr3.length);
            this.f15181a = fArr2;
        }
    }

    public float d(int i10) {
        return this.f15181a[i10];
    }

    public float[] e() {
        i();
        return this.f15181a;
    }

    public boolean f() {
        return this.f15182b == 0;
    }

    public int g() {
        return this.f15182b;
    }

    public float h() {
        float f10 = 0.0f;
        for (int i10 = 0; i10 < this.f15182b; i10++) {
            f10 += this.f15181a[i10];
        }
        return f10;
    }

    public void i() {
        int i10 = this.f15182b;
        float[] fArr = this.f15181a;
        if (i10 < fArr.length) {
            float[] fArr2 = new float[i10];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f15181a = fArr2;
        }
    }

    public b(float[] fArr) {
        this.f15181a = fArr;
        this.f15182b = fArr.length;
    }
}
