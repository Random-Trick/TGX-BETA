package p350yd;

import ge.C4868i;
import p193nb.C7317b;

public class C11164z6 {
    public int f35799a;
    public boolean f35800b;

    public void m1329a(C11164z6 z6Var) {
        this.f35799a += z6Var.f35799a;
        if (!z6Var.f35800b) {
            this.f35800b = false;
        }
    }

    public int m1328b() {
        return this.f35799a;
    }

    public boolean m1327c() {
        return this.f35800b;
    }

    public boolean m1326d(C10930q6 q6Var) {
        return m1324f(q6Var.m2189w5(C7317b.f23227a), q6Var.m2189w5(C7317b.f23228b));
    }

    public boolean m1325e(C11131y6 y6Var) {
        return m1324f(y6Var.m1461o(C7317b.f23227a), y6Var.m1461o(C7317b.f23228b));
    }

    public boolean m1324f(C10562b9 b9Var, C10562b9 b9Var2) {
        int i;
        int i2;
        boolean z;
        int i3;
        int m0 = C4868i.m24727c2().m24649m0();
        boolean z2 = true;
        boolean z3 = ((m0 & 4) == 0 || b9Var2 == null) ? false : true;
        if ((m0 & 1) != 0) {
            i2 = b9Var.f33881f;
            i = b9Var.f33882g;
            if (z3) {
                i2 += b9Var2.f33881f;
                i3 = b9Var2.f33882g;
                i += i3;
            }
        } else {
            i2 = b9Var.f33877b;
            i = b9Var.f33878c;
            if (z3) {
                i2 += b9Var2.f33877b;
                i3 = b9Var2.f33878c;
                i += i3;
            }
        }
        int max = Math.max(0, i2);
        int max2 = Math.max(0, i);
        if ((m0 & 2) == 0) {
            max = max2;
        } else if (max2 == 0) {
            z = true;
            if (this.f35799a == max && this.f35800b == z) {
                z2 = false;
            }
            this.f35799a = max;
            this.f35800b = z;
            return z2;
        }
        z = false;
        if (this.f35799a == max) {
            z2 = false;
        }
        this.f35799a = max;
        this.f35800b = z;
        return z2;
    }
}
