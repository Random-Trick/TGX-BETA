package p181mb;

import android.graphics.Color;

public class C6812c {
    public int f21330a;
    public int f21331b;
    public int f21332c;
    public int f21333d;
    public int f21334e;
    public int f21335f;
    public int f21336g;
    public int f21337h;
    public int f21338i;
    public int f21339j;
    public boolean f21340k;

    public C6812c(int i, int i2) {
        this.f21330a = i;
        this.f21331b = i2;
        this.f21332c = Color.alpha(i);
        this.f21333d = Color.red(i);
        this.f21334e = Color.green(i);
        this.f21335f = Color.blue(i);
        this.f21336g = Color.alpha(i2) - this.f21332c;
        this.f21337h = Color.red(i2) - this.f21333d;
        this.f21338i = Color.green(i2) - this.f21334e;
        this.f21339j = Color.blue(i2) - this.f21335f;
    }

    public int m18909a(float f) {
        if (f <= 0.0f) {
            return this.f21330a;
        }
        return (f < 1.0f || this.f21340k) ? Color.argb(this.f21332c + ((int) (this.f21336g * f)), this.f21333d + ((int) (this.f21337h * f)), this.f21334e + ((int) (this.f21338i * f)), this.f21335f + ((int) (this.f21339j * f))) : this.f21331b;
    }

    public void m18908b(int i, int i2) {
        this.f21330a = i;
        this.f21331b = i2;
        this.f21332c = Color.alpha(i);
        this.f21333d = Color.red(i);
        this.f21334e = Color.green(i);
        this.f21335f = Color.blue(i);
        this.f21336g = Color.alpha(i2) - this.f21332c;
        this.f21337h = Color.red(i2) - this.f21333d;
        this.f21338i = Color.green(i2) - this.f21334e;
        this.f21339j = Color.blue(i2) - this.f21335f;
    }
}
