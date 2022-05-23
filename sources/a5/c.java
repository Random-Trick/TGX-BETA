package a5;

import c5.a;
import java.util.Arrays;
import m3.q1;
import o4.p0;

public abstract class c implements r {
    public final p0 f466a;
    public final int f467b;
    public final int[] f468c;
    public final int f469d;
    public final q1[] f470e;
    public final long[] f471f;
    public int f472g;

    public c(p0 p0Var, int[] iArr, int i10) {
        int i11 = 0;
        a.f(iArr.length > 0);
        this.f469d = i10;
        this.f466a = (p0) a.e(p0Var);
        int length = iArr.length;
        this.f467b = length;
        this.f470e = new q1[length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            this.f470e[i12] = p0Var.b(iArr[i12]);
        }
        Arrays.sort(this.f470e, b.f463a);
        this.f468c = new int[this.f467b];
        while (true) {
            int i13 = this.f467b;
            if (i11 < i13) {
                this.f468c[i11] = p0Var.c(this.f470e[i11]);
                i11++;
            } else {
                this.f471f = new long[i13];
                return;
            }
        }
    }

    public static int f(q1 q1Var, q1 q1Var2) {
        return q1Var2.Q - q1Var.Q;
    }

    @Override
    public final p0 a() {
        return this.f466a;
    }

    @Override
    public final q1 b(int i10) {
        return this.f470e[i10];
    }

    @Override
    public final int c(int i10) {
        return this.f468c[i10];
    }

    @Override
    public final int d(int i10) {
        for (int i11 = 0; i11 < this.f467b; i11++) {
            if (this.f468c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f466a == cVar.f466a && Arrays.equals(this.f468c, cVar.f468c);
    }

    @Override
    public void h() {
    }

    public int hashCode() {
        if (this.f472g == 0) {
            this.f472g = (System.identityHashCode(this.f466a) * 31) + Arrays.hashCode(this.f468c);
        }
        return this.f472g;
    }

    @Override
    public void j(boolean z10) {
        q.b(this, z10);
    }

    @Override
    public void k() {
    }

    @Override
    public final q1 l() {
        return this.f470e[i()];
    }

    @Override
    public final int length() {
        return this.f468c.length;
    }

    @Override
    public void m(float f10) {
    }

    @Override
    public void n() {
        q.a(this);
    }

    @Override
    public void o() {
        q.c(this);
    }
}
