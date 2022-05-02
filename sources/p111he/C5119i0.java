package p111he;

public class C5119i0 {
    public int[] f17165a;
    public int f17166b;

    public C5119i0() {
        this.f17165a = new int[9];
    }

    public void m23933a(int i) {
        int[] iArr = this.f17165a;
        int i2 = this.f17166b;
        iArr[i2] = i;
        this.f17166b = i2 + 1;
    }

    public void m23932b() {
        this.f17166b = 0;
    }

    public boolean m23931c(C5119i0 i0Var) {
        if (i0Var == null || i0Var.f17166b != this.f17166b) {
            return false;
        }
        for (int i = 0; i < this.f17166b; i++) {
            if (i0Var.f17165a[i] != this.f17165a[i]) {
                return false;
            }
        }
        return true;
    }

    public int m23930d() {
        return this.f17165a[this.f17166b - 1];
    }

    public int m23929e() {
        return this.f17166b;
    }

    public void m23928f() {
        int i = this.f17166b;
        if (i > 0) {
            this.f17166b = i - 1;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(this.f17166b);
        for (int i = 0; i < this.f17166b; i++) {
            sb2.append(this.f17165a[i]);
        }
        return sb2.toString();
    }

    public C5119i0(C5119i0 i0Var) {
        int[] iArr = new int[9];
        this.f17165a = iArr;
        int i = i0Var.f17166b;
        this.f17166b = i;
        System.arraycopy(i0Var.f17165a, 0, iArr, 0, i);
    }
}
