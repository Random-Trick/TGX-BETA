package p302v8;

public class C9883a {
    public char[] f32164a;
    public int f32165b;

    public C9883a(int i) {
        this.f32164a = new char[i];
    }

    public void m6694a(char c) {
        int i = this.f32165b;
        char[] cArr = this.f32164a;
        if (i < cArr.length - 1) {
            cArr[i] = c;
            this.f32165b = i + 1;
        }
    }

    public void m6693b() {
        this.f32165b = 0;
    }

    public int m6692c() {
        return this.f32165b;
    }

    public String toString() {
        return new String(this.f32164a, 0, this.f32165b);
    }
}
