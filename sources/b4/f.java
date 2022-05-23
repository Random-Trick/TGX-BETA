package b4;

import c5.a;
import c5.b0;
import m3.k2;
import t3.g;
import t3.i;

public final class f {
    public int f3783a;
    public int f3784b;
    public long f3785c;
    public long f3786d;
    public long f3787e;
    public long f3788f;
    public int f3789g;
    public int f3790h;
    public int f3791i;
    public final int[] f3792j = new int[255];
    public final b0 f3793k = new b0(255);

    public boolean a(g gVar, boolean z10) {
        b();
        this.f3793k.L(27);
        if (!i.b(gVar, this.f3793k.d(), 0, 27, z10) || this.f3793k.F() != 1332176723) {
            return false;
        }
        int D = this.f3793k.D();
        this.f3783a = D;
        if (D == 0) {
            this.f3784b = this.f3793k.D();
            this.f3785c = this.f3793k.r();
            this.f3786d = this.f3793k.t();
            this.f3787e = this.f3793k.t();
            this.f3788f = this.f3793k.t();
            int D2 = this.f3793k.D();
            this.f3789g = D2;
            this.f3790h = D2 + 27;
            this.f3793k.L(D2);
            if (!i.b(gVar, this.f3793k.d(), 0, this.f3789g, z10)) {
                return false;
            }
            for (int i10 = 0; i10 < this.f3789g; i10++) {
                this.f3792j[i10] = this.f3793k.D();
                this.f3791i += this.f3792j[i10];
            }
            return true;
        } else if (z10) {
            return false;
        } else {
            throw k2.c("unsupported bit stream revision");
        }
    }

    public void b() {
        this.f3783a = 0;
        this.f3784b = 0;
        this.f3785c = 0L;
        this.f3786d = 0L;
        this.f3787e = 0L;
        this.f3788f = 0L;
        this.f3789g = 0;
        this.f3790h = 0;
        this.f3791i = 0;
    }

    public boolean c(g gVar) {
        return d(gVar, -1L);
    }

    public boolean d(g gVar, long j10) {
        int i10;
        a.a(gVar.r() == gVar.f());
        this.f3793k.L(4);
        while (true) {
            i10 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
            if ((i10 == 0 || gVar.r() + 4 < j10) && i.b(gVar, this.f3793k.d(), 0, 4, true)) {
                this.f3793k.P(0);
                if (this.f3793k.F() == 1332176723) {
                    gVar.m();
                    return true;
                }
                gVar.n(1);
            }
        }
        do {
            if (i10 != 0 && gVar.r() >= j10) {
                break;
            }
        } while (gVar.h(1) != -1);
        return false;
    }
}
