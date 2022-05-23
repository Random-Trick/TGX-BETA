package w8;

public class a {
    public char[] f25812a;
    public int f25813b;

    public a(int i10) {
        this.f25812a = new char[i10];
    }

    public void a(char c10) {
        int i10 = this.f25813b;
        char[] cArr = this.f25812a;
        if (i10 < cArr.length - 1) {
            cArr[i10] = c10;
            this.f25813b = i10 + 1;
        }
    }

    public void b() {
        this.f25813b = 0;
    }

    public int c() {
        return this.f25813b;
    }

    public String toString() {
        return new String(this.f25812a, 0, this.f25813b);
    }
}
