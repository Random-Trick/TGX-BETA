package p302v8;

public class C9883a {
    public char[] f32167a;
    public int f32168b;

    public C9883a(int i) {
        this.f32167a = new char[i];
    }

    public void m6694a(char c) {
        int i = this.f32168b;
        char[] cArr = this.f32167a;
        if (i < cArr.length - 1) {
            cArr[i] = c;
            this.f32168b = i + 1;
        }
    }

    public void m6693b() {
        this.f32168b = 0;
    }

    public int m6692c() {
        return this.f32168b;
    }

    public String toString() {
        return new String(this.f32167a, 0, this.f32168b);
    }
}
