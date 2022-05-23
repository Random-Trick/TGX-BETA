package a5;

import c5.l0;
import m3.e3;
import m3.t3;

public final class c0 {
    public final int f473a;
    public final e3[] f474b;
    public final r[] f475c;
    public final t3 f476d;
    public final Object f477e;

    public c0(e3[] e3VarArr, r[] rVarArr, t3 t3Var, Object obj) {
        this.f474b = e3VarArr;
        this.f475c = (r[]) rVarArr.clone();
        this.f476d = t3Var;
        this.f477e = obj;
        this.f473a = e3VarArr.length;
    }

    public boolean a(c0 c0Var) {
        if (c0Var == null || c0Var.f475c.length != this.f475c.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.f475c.length; i10++) {
            if (!b(c0Var, i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(c0 c0Var, int i10) {
        return c0Var != null && l0.c(this.f474b[i10], c0Var.f474b[i10]) && l0.c(this.f475c[i10], c0Var.f475c[i10]);
    }

    public boolean c(int i10) {
        return this.f474b[i10] != null;
    }
}
