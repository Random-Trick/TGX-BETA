package zd;

import he.i;
import ob.b;

public class x6 {
    public int f28670a;
    public boolean f28671b;

    public void a(x6 x6Var) {
        this.f28670a += x6Var.f28670a;
        if (!x6Var.f28671b) {
            this.f28671b = false;
        }
    }

    public int b() {
        return this.f28670a;
    }

    public boolean c() {
        return this.f28671b;
    }

    public boolean d(o6 o6Var) {
        return f(o6Var.A5(b.f19338a), o6Var.A5(b.f19339b));
    }

    public boolean e(w6 w6Var) {
        return f(w6Var.o(b.f19338a), w6Var.o(b.f19339b));
    }

    public boolean f(z8 z8Var, z8 z8Var2) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        int m02 = i.c2().m0();
        boolean z11 = true;
        boolean z12 = ((m02 & 4) == 0 || z8Var2 == null) ? false : true;
        if ((m02 & 1) != 0) {
            i11 = z8Var.f28798f;
            i10 = z8Var.f28799g;
            if (z12) {
                i11 += z8Var2.f28798f;
                i12 = z8Var2.f28799g;
                i10 += i12;
            }
        } else {
            i11 = z8Var.f28794b;
            i10 = z8Var.f28795c;
            if (z12) {
                i11 += z8Var2.f28794b;
                i12 = z8Var2.f28795c;
                i10 += i12;
            }
        }
        int max = Math.max(0, i11);
        int max2 = Math.max(0, i10);
        if ((m02 & 2) == 0) {
            max = max2;
        } else if (max2 == 0) {
            z10 = true;
            if (this.f28670a == max && this.f28671b == z10) {
                z11 = false;
            }
            this.f28670a = max;
            this.f28671b = z10;
            return z11;
        }
        z10 = false;
        if (this.f28670a == max) {
            z11 = false;
        }
        this.f28670a = max;
        this.f28671b = z10;
        return z11;
    }
}
