package p174m3;

import p020b5.C1186a;
import p020b5.C1216l0;
import p187n4.AbstractC7230t;

public final class C6704u1 {
    public final AbstractC7230t.C7231a f21035a;
    public final long f21036b;
    public final long f21037c;
    public final long f21038d;
    public final long f21039e;
    public final boolean f21040f;
    public final boolean f21041g;
    public final boolean f21042h;
    public final boolean f21043i;

    public C6704u1(AbstractC7230t.C7231a aVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        C1186a.m38192a(!z4 || z2);
        C1186a.m38192a(!z3 || z2);
        if (!z || (!z2 && !z3 && !z4)) {
            z5 = true;
        }
        C1186a.m38192a(z5);
        this.f21035a = aVar;
        this.f21036b = j;
        this.f21037c = j2;
        this.f21038d = j3;
        this.f21039e = j4;
        this.f21040f = z;
        this.f21041g = z2;
        this.f21042h = z3;
        this.f21043i = z4;
    }

    public C6704u1 m19434a(long j) {
        if (j == this.f21037c) {
            return this;
        }
        return new C6704u1(this.f21035a, this.f21036b, j, this.f21038d, this.f21039e, this.f21040f, this.f21041g, this.f21042h, this.f21043i);
    }

    public C6704u1 m19433b(long j) {
        if (j == this.f21036b) {
            return this;
        }
        return new C6704u1(this.f21035a, j, this.f21037c, this.f21038d, this.f21039e, this.f21040f, this.f21041g, this.f21042h, this.f21043i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6704u1.class != obj.getClass()) {
            return false;
        }
        C6704u1 u1Var = (C6704u1) obj;
        return this.f21036b == u1Var.f21036b && this.f21037c == u1Var.f21037c && this.f21038d == u1Var.f21038d && this.f21039e == u1Var.f21039e && this.f21040f == u1Var.f21040f && this.f21041g == u1Var.f21041g && this.f21042h == u1Var.f21042h && this.f21043i == u1Var.f21043i && C1216l0.m37985c(this.f21035a, u1Var.f21035a);
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f21035a.hashCode()) * 31) + ((int) this.f21036b)) * 31) + ((int) this.f21037c)) * 31) + ((int) this.f21038d)) * 31) + ((int) this.f21039e)) * 31) + (this.f21040f ? 1 : 0)) * 31) + (this.f21041g ? 1 : 0)) * 31) + (this.f21042h ? 1 : 0)) * 31) + (this.f21043i ? 1 : 0);
    }
}
