package jb;

public class c {
    public int[] f15183a;
    public int f15184b;

    public c(int i10) {
        this.f15183a = new int[i10];
    }

    public void a(int i10) {
        c(this.f15184b + 1, 10);
        int[] iArr = this.f15183a;
        int i11 = this.f15184b;
        this.f15184b = i11 + 1;
        iArr[i11] = i10;
    }

    public void b() {
        this.f15184b = 0;
    }

    public void c(int i10, int i11) {
        int[] iArr = this.f15183a;
        if (iArr.length < i10) {
            int[] iArr2 = new int[Math.max(i10, iArr.length + i11)];
            int[] iArr3 = this.f15183a;
            System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
            this.f15183a = iArr2;
        }
    }

    public int d(int i10) {
        return this.f15183a[i10];
    }

    public int[] e() {
        h();
        return this.f15183a;
    }

    public boolean f() {
        return this.f15184b == 0;
    }

    public int g() {
        return this.f15184b;
    }

    public final void h() {
        int i10 = this.f15184b;
        int[] iArr = this.f15183a;
        if (i10 < iArr.length) {
            int[] iArr2 = new int[i10];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.f15183a = iArr2;
        }
    }
}
