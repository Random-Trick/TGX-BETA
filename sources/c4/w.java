package c4;

import c4.i0;
import c5.a;
import c5.a0;
import c5.b0;
import c5.i0;
import c5.s;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import t3.h;

public final class w implements i0 {
    public final m f4769a;
    public final a0 f4770b = new a0(new byte[10]);
    public int f4771c = 0;
    public int f4772d;
    public i0 f4773e;
    public boolean f4774f;
    public boolean f4775g;
    public boolean f4776h;
    public int f4777i;
    public int f4778j;
    public boolean f4779k;
    public long f4780l;

    public w(m mVar) {
        this.f4769a = mVar;
    }

    @Override
    public final void a(b0 b0Var, int i10) {
        a.h(this.f4773e);
        if ((i10 & 1) != 0) {
            int i11 = this.f4771c;
            if (!(i11 == 0 || i11 == 1)) {
                if (i11 == 2) {
                    s.i("PesReader", "Unexpected start indicator reading extended header");
                } else if (i11 == 3) {
                    int i12 = this.f4778j;
                    if (i12 != -1) {
                        StringBuilder sb2 = new StringBuilder(59);
                        sb2.append("Unexpected start indicator: expected ");
                        sb2.append(i12);
                        sb2.append(" more bytes");
                        s.i("PesReader", sb2.toString());
                    }
                    this.f4769a.d();
                } else {
                    throw new IllegalStateException();
                }
            }
            g(1);
        }
        while (b0Var.a() > 0) {
            int i13 = this.f4771c;
            if (i13 != 0) {
                int i14 = 0;
                if (i13 != 1) {
                    if (i13 == 2) {
                        if (d(b0Var, this.f4770b.f4792a, Math.min(10, this.f4777i)) && d(b0Var, null, this.f4777i)) {
                            f();
                            if (this.f4779k) {
                                i14 = 4;
                            }
                            i10 |= i14;
                            this.f4769a.f(this.f4780l, i10);
                            g(3);
                        }
                    } else if (i13 == 3) {
                        int a10 = b0Var.a();
                        int i15 = this.f4778j;
                        if (i15 != -1) {
                            i14 = a10 - i15;
                        }
                        if (i14 > 0) {
                            a10 -= i14;
                            b0Var.O(b0Var.e() + a10);
                        }
                        this.f4769a.a(b0Var);
                        int i16 = this.f4778j;
                        if (i16 != -1) {
                            int i17 = i16 - a10;
                            this.f4778j = i17;
                            if (i17 == 0) {
                                this.f4769a.d();
                                g(1);
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (d(b0Var, this.f4770b.f4792a, 9)) {
                    if (e()) {
                        i14 = 2;
                    }
                    g(i14);
                }
            } else {
                b0Var.Q(b0Var.a());
            }
        }
    }

    @Override
    public void b(i0 i0Var, h hVar, i0.d dVar) {
        this.f4773e = i0Var;
        this.f4769a.e(hVar, dVar);
    }

    @Override
    public final void c() {
        this.f4771c = 0;
        this.f4772d = 0;
        this.f4776h = false;
        this.f4769a.c();
    }

    public final boolean d(b0 b0Var, byte[] bArr, int i10) {
        int min = Math.min(b0Var.a(), i10 - this.f4772d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            b0Var.Q(min);
        } else {
            b0Var.j(bArr, this.f4772d, min);
        }
        int i11 = this.f4772d + min;
        this.f4772d = i11;
        return i11 == i10;
    }

    public final boolean e() {
        this.f4770b.p(0);
        int h10 = this.f4770b.h(24);
        if (h10 != 1) {
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("Unexpected start code prefix: ");
            sb2.append(h10);
            s.i("PesReader", sb2.toString());
            this.f4778j = -1;
            return false;
        }
        this.f4770b.r(8);
        int h11 = this.f4770b.h(16);
        this.f4770b.r(5);
        this.f4779k = this.f4770b.g();
        this.f4770b.r(2);
        this.f4774f = this.f4770b.g();
        this.f4775g = this.f4770b.g();
        this.f4770b.r(6);
        int h12 = this.f4770b.h(8);
        this.f4777i = h12;
        if (h11 == 0) {
            this.f4778j = -1;
        } else {
            int i10 = ((h11 + 6) - 9) - h12;
            this.f4778j = i10;
            if (i10 < 0) {
                StringBuilder sb3 = new StringBuilder(47);
                sb3.append("Found negative packet payload size: ");
                sb3.append(i10);
                s.i("PesReader", sb3.toString());
                this.f4778j = -1;
            }
        }
        return true;
    }

    @RequiresNonNull({"timestampAdjuster"})
    public final void f() {
        this.f4770b.p(0);
        this.f4780l = -9223372036854775807L;
        if (this.f4774f) {
            this.f4770b.r(4);
            this.f4770b.r(1);
            this.f4770b.r(1);
            long h10 = (this.f4770b.h(3) << 30) | (this.f4770b.h(15) << 15) | this.f4770b.h(15);
            this.f4770b.r(1);
            if (!this.f4776h && this.f4775g) {
                this.f4770b.r(4);
                this.f4770b.r(1);
                this.f4770b.r(1);
                this.f4770b.r(1);
                this.f4773e.b((this.f4770b.h(3) << 30) | (this.f4770b.h(15) << 15) | this.f4770b.h(15));
                this.f4776h = true;
            }
            this.f4780l = this.f4773e.b(h10);
        }
    }

    public final void g(int i10) {
        this.f4771c = i10;
        this.f4772d = 0;
    }
}
