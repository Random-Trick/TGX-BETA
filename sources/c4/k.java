package c4;

import c4.i0;
import c5.a;
import c5.b0;
import m3.q1;
import o3.e0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import t3.h;
import t3.t;

public final class k implements m {
    public final String f4580b;
    public String f4581c;
    public t f4582d;
    public int f4584f;
    public int f4585g;
    public long f4586h;
    public q1 f4587i;
    public int f4588j;
    public final b0 f4579a = new b0(new byte[18]);
    public int f4583e = 0;
    public long f4589k = -9223372036854775807L;

    public k(String str) {
        this.f4580b = str;
    }

    @Override
    public void a(b0 b0Var) {
        a.h(this.f4582d);
        while (b0Var.a() > 0) {
            int i10 = this.f4583e;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(b0Var.a(), this.f4588j - this.f4584f);
                        this.f4582d.d(b0Var, min);
                        int i11 = this.f4584f + min;
                        this.f4584f = i11;
                        int i12 = this.f4588j;
                        if (i11 == i12) {
                            long j10 = this.f4589k;
                            if (j10 != -9223372036854775807L) {
                                this.f4582d.f(j10, 1, i12, 0, null);
                                this.f4589k += this.f4586h;
                            }
                            this.f4583e = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (b(b0Var, this.f4579a.d(), 18)) {
                    g();
                    this.f4579a.P(0);
                    this.f4582d.d(this.f4579a, 18);
                    this.f4583e = 2;
                }
            } else if (h(b0Var)) {
                this.f4583e = 1;
            }
        }
    }

    public final boolean b(b0 b0Var, byte[] bArr, int i10) {
        int min = Math.min(b0Var.a(), i10 - this.f4584f);
        b0Var.j(bArr, this.f4584f, min);
        int i11 = this.f4584f + min;
        this.f4584f = i11;
        return i11 == i10;
    }

    @Override
    public void c() {
        this.f4583e = 0;
        this.f4584f = 0;
        this.f4585g = 0;
        this.f4589k = -9223372036854775807L;
    }

    @Override
    public void d() {
    }

    @Override
    public void e(h hVar, i0.d dVar) {
        dVar.a();
        this.f4581c = dVar.b();
        this.f4582d = hVar.q(dVar.c(), 1);
    }

    @Override
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f4589k = j10;
        }
    }

    @RequiresNonNull({"output"})
    public final void g() {
        byte[] d10 = this.f4579a.d();
        if (this.f4587i == null) {
            q1 g10 = e0.g(d10, this.f4581c, this.f4580b, null);
            this.f4587i = g10;
            this.f4582d.a(g10);
        }
        this.f4588j = e0.a(d10);
        this.f4586h = (int) ((e0.f(d10) * 1000000) / this.f4587i.f16909i0);
    }

    public final boolean h(b0 b0Var) {
        while (b0Var.a() > 0) {
            int i10 = this.f4585g << 8;
            this.f4585g = i10;
            int D = i10 | b0Var.D();
            this.f4585g = D;
            if (e0.d(D)) {
                byte[] d10 = this.f4579a.d();
                int i11 = this.f4585g;
                d10[0] = (byte) ((i11 >> 24) & 255);
                d10[1] = (byte) ((i11 >> 16) & 255);
                d10[2] = (byte) ((i11 >> 8) & 255);
                d10[3] = (byte) (i11 & 255);
                this.f4584f = 4;
                this.f4585g = 0;
                return true;
            }
        }
        return false;
    }
}
