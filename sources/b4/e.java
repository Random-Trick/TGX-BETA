package b4;

import c5.a;
import c5.b0;
import java.util.Arrays;
import t3.g;
import t3.i;

public final class e {
    public final f f3778a = new f();
    public final b0 f3779b = new b0(new byte[65025], 0);
    public int f3780c = -1;
    public int f3781d;
    public boolean f3782e;

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        this.f3781d = 0;
        do {
            int i13 = this.f3781d;
            int i14 = i10 + i13;
            f fVar = this.f3778a;
            if (i14 >= fVar.f3789g) {
                break;
            }
            int[] iArr = fVar.f3792j;
            this.f3781d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public f b() {
        return this.f3778a;
    }

    public b0 c() {
        return this.f3779b;
    }

    public boolean d(g gVar) {
        int i10;
        a.f(gVar != null);
        if (this.f3782e) {
            this.f3782e = false;
            this.f3779b.L(0);
        }
        while (!this.f3782e) {
            if (this.f3780c < 0) {
                if (!this.f3778a.c(gVar) || !this.f3778a.a(gVar, true)) {
                    return false;
                }
                f fVar = this.f3778a;
                int i11 = fVar.f3790h;
                if ((fVar.f3784b & 1) == 1 && this.f3779b.f() == 0) {
                    i11 += a(0);
                    i10 = this.f3781d + 0;
                } else {
                    i10 = 0;
                }
                if (!i.e(gVar, i11)) {
                    return false;
                }
                this.f3780c = i10;
            }
            int a10 = a(this.f3780c);
            int i12 = this.f3780c + this.f3781d;
            if (a10 > 0) {
                b0 b0Var = this.f3779b;
                b0Var.c(b0Var.f() + a10);
                if (!i.d(gVar, this.f3779b.d(), this.f3779b.f(), a10)) {
                    return false;
                }
                b0 b0Var2 = this.f3779b;
                b0Var2.O(b0Var2.f() + a10);
                this.f3782e = this.f3778a.f3792j[i12 + (-1)] != 255;
            }
            if (i12 == this.f3778a.f3789g) {
                i12 = -1;
            }
            this.f3780c = i12;
        }
        return true;
    }

    public void e() {
        this.f3778a.b();
        this.f3779b.L(0);
        this.f3780c = -1;
        this.f3782e = false;
    }

    public void f() {
        if (this.f3779b.d().length != 65025) {
            b0 b0Var = this.f3779b;
            b0Var.N(Arrays.copyOf(b0Var.d(), Math.max(65025, this.f3779b.f())), this.f3779b.f());
        }
    }
}
