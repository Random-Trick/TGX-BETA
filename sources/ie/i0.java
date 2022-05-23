package ie;

public class i0 {
    public int[] f14246a;
    public int f14247b;

    public i0() {
        this.f14246a = new int[9];
    }

    public void a(int i10) {
        int[] iArr = this.f14246a;
        int i11 = this.f14247b;
        iArr[i11] = i10;
        this.f14247b = i11 + 1;
    }

    public void b() {
        this.f14247b = 0;
    }

    public boolean c(i0 i0Var) {
        if (i0Var == null || i0Var.f14247b != this.f14247b) {
            return false;
        }
        for (int i10 = 0; i10 < this.f14247b; i10++) {
            if (i0Var.f14246a[i10] != this.f14246a[i10]) {
                return false;
            }
        }
        return true;
    }

    public int d() {
        return this.f14246a[this.f14247b - 1];
    }

    public int e() {
        return this.f14247b;
    }

    public void f() {
        int i10 = this.f14247b;
        if (i10 > 0) {
            this.f14247b = i10 - 1;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(this.f14247b);
        for (int i10 = 0; i10 < this.f14247b; i10++) {
            sb2.append(this.f14246a[i10]);
        }
        return sb2.toString();
    }

    public i0(i0 i0Var) {
        int[] iArr = new int[9];
        this.f14246a = iArr;
        int i10 = i0Var.f14247b;
        this.f14247b = i10;
        System.arraycopy(i0Var.f14246a, 0, iArr, 0, i10);
    }
}
