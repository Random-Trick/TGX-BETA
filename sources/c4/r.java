package c4;

import c4.i0;
import c5.a;
import c5.b0;
import c5.s;
import m3.q1;
import t3.h;
import t3.t;

public final class r implements m {
    public t f4723b;
    public boolean f4724c;
    public int f4726e;
    public int f4727f;
    public final b0 f4722a = new b0(10);
    public long f4725d = -9223372036854775807L;

    @Override
    public void a(b0 b0Var) {
        a.h(this.f4723b);
        if (this.f4724c) {
            int a10 = b0Var.a();
            int i10 = this.f4727f;
            if (i10 < 10) {
                int min = Math.min(a10, 10 - i10);
                System.arraycopy(b0Var.d(), b0Var.e(), this.f4722a.d(), this.f4727f, min);
                if (this.f4727f + min == 10) {
                    this.f4722a.P(0);
                    if (73 == this.f4722a.D() && 68 == this.f4722a.D() && 51 == this.f4722a.D()) {
                        this.f4722a.Q(3);
                        this.f4726e = this.f4722a.C() + 10;
                    } else {
                        s.i("Id3Reader", "Discarding invalid ID3 tag");
                        this.f4724c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a10, this.f4726e - this.f4727f);
            this.f4723b.d(b0Var, min2);
            this.f4727f += min2;
        }
    }

    @Override
    public void c() {
        this.f4724c = false;
        this.f4725d = -9223372036854775807L;
    }

    @Override
    public void d() {
        int i10;
        a.h(this.f4723b);
        if (this.f4724c && (i10 = this.f4726e) != 0 && this.f4727f == i10) {
            long j10 = this.f4725d;
            if (j10 != -9223372036854775807L) {
                this.f4723b.f(j10, 1, i10, 0, null);
            }
            this.f4724c = false;
        }
    }

    @Override
    public void e(h hVar, i0.d dVar) {
        dVar.a();
        t q10 = hVar.q(dVar.c(), 5);
        this.f4723b = q10;
        q10.a(new q1.b().S(dVar.b()).e0("application/id3").E());
    }

    @Override
    public void f(long j10, int i10) {
        if ((i10 & 4) != 0) {
            this.f4724c = true;
            if (j10 != -9223372036854775807L) {
                this.f4725d = j10;
            }
            this.f4726e = 0;
            this.f4727f = 0;
        }
    }
}
