package p350yd;

import ge.C4868i;
import p193nb.C7317b;

public class C11164z6 {
    public int f35796a;
    public boolean f35797b;

    public void m1329a(C11164z6 z6Var) {
        this.f35796a += z6Var.f35796a;
        if (!z6Var.f35797b) {
            this.f35797b = false;
        }
    }

    public int m1328b() {
        return this.f35796a;
    }

    public boolean m1327c() {
        return this.f35797b;
    }

    public boolean m1326d(C10930q6 q6Var) {
        return m1324f(q6Var.m2189w5(C7317b.f23224a), q6Var.m2189w5(C7317b.f23225b));
    }

    public boolean m1325e(C11131y6 y6Var) {
        return m1324f(y6Var.m1461o(C7317b.f23224a), y6Var.m1461o(C7317b.f23225b));
    }

    public boolean m1324f(C10562b9 b9Var, C10562b9 b9Var2) {
        int i;
        int i2;
        boolean z;
        int i3;
        int m0 = C4868i.m24726c2().m24648m0();
        boolean z2 = true;
        boolean z3 = ((m0 & 4) == 0 || b9Var2 == null) ? false : true;
        if ((m0 & 1) != 0) {
            i2 = b9Var.f33878f;
            i = b9Var.f33879g;
            if (z3) {
                i2 += b9Var2.f33878f;
                i3 = b9Var2.f33879g;
                i += i3;
            }
        } else {
            i2 = b9Var.f33874b;
            i = b9Var.f33875c;
            if (z3) {
                i2 += b9Var2.f33874b;
                i3 = b9Var2.f33875c;
                i += i3;
            }
        }
        int max = Math.max(0, i2);
        int max2 = Math.max(0, i);
        if ((m0 & 2) == 0) {
            max = max2;
        } else if (max2 == 0) {
            z = true;
            if (this.f35796a == max && this.f35797b == z) {
                z2 = false;
            }
            this.f35796a = max;
            this.f35797b = z;
            return z2;
        }
        z = false;
        if (this.f35796a == max) {
            z2 = false;
        }
        this.f35796a = max;
        this.f35797b = z;
        return z2;
    }
}
