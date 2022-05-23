package nb;

import android.graphics.Color;

public class c {
    public int f17807a;
    public int f17808b;
    public int f17809c;
    public int f17810d;
    public int f17811e;
    public int f17812f;
    public int f17813g;
    public int f17814h;
    public int f17815i;
    public int f17816j;
    public boolean f17817k;

    public c(int i10, int i11) {
        this.f17807a = i10;
        this.f17808b = i11;
        this.f17809c = Color.alpha(i10);
        this.f17810d = Color.red(i10);
        this.f17811e = Color.green(i10);
        this.f17812f = Color.blue(i10);
        this.f17813g = Color.alpha(i11) - this.f17809c;
        this.f17814h = Color.red(i11) - this.f17810d;
        this.f17815i = Color.green(i11) - this.f17811e;
        this.f17816j = Color.blue(i11) - this.f17812f;
    }

    public int a(float f10) {
        return f10 <= 0.0f ? this.f17807a : (f10 < 1.0f || this.f17817k) ? Color.argb(this.f17809c + ((int) (this.f17813g * f10)), this.f17810d + ((int) (this.f17814h * f10)), this.f17811e + ((int) (this.f17815i * f10)), this.f17812f + ((int) (this.f17816j * f10))) : this.f17808b;
    }

    public void b(int i10, int i11) {
        this.f17807a = i10;
        this.f17808b = i11;
        this.f17809c = Color.alpha(i10);
        this.f17810d = Color.red(i10);
        this.f17811e = Color.green(i10);
        this.f17812f = Color.blue(i10);
        this.f17813g = Color.alpha(i11) - this.f17809c;
        this.f17814h = Color.red(i11) - this.f17810d;
        this.f17815i = Color.green(i11) - this.f17811e;
        this.f17816j = Color.blue(i11) - this.f17812f;
    }
}
