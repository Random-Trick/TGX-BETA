package p124ib;

public class C5320c {
    public int[] f17496a;
    public int f17497b;

    public C5320c(int i) {
        this.f17496a = new int[i];
    }

    public void m23284a(int i) {
        m23282c(this.f17497b + 1, 10);
        int[] iArr = this.f17496a;
        int i2 = this.f17497b;
        this.f17497b = i2 + 1;
        iArr[i2] = i;
    }

    public void m23283b() {
        this.f17497b = 0;
    }

    public void m23282c(int i, int i2) {
        int[] iArr = this.f17496a;
        if (iArr.length < i) {
            int[] iArr2 = new int[Math.max(i, iArr.length + i2)];
            int[] iArr3 = this.f17496a;
            System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
            this.f17496a = iArr2;
        }
    }

    public int m23281d(int i) {
        return this.f17496a[i];
    }

    public int[] m23280e() {
        m23277h();
        return this.f17496a;
    }

    public boolean m23279f() {
        return this.f17497b == 0;
    }

    public int m23278g() {
        return this.f17497b;
    }

    public final void m23277h() {
        int i = this.f17497b;
        int[] iArr = this.f17496a;
        if (i < iArr.length) {
            int[] iArr2 = new int[i];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            this.f17496a = iArr2;
        }
    }
}
