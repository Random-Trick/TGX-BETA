package c4;

import c4.i0;
import c5.b0;
import c5.i0;
import c5.l0;
import org.thunderdog.challegram.Log;
import t3.h;

public final class c0 implements i0 {
    public final b0 f4462a;
    public final b0 f4463b = new b0(32);
    public int f4464c;
    public int f4465d;
    public boolean f4466e;
    public boolean f4467f;

    public c0(b0 b0Var) {
        this.f4462a = b0Var;
    }

    @Override
    public void a(b0 b0Var, int i10) {
        boolean z10 = (i10 & 1) != 0;
        int e10 = z10 ? b0Var.e() + b0Var.D() : -1;
        if (this.f4467f) {
            if (z10) {
                this.f4467f = false;
                b0Var.P(e10);
                this.f4465d = 0;
            } else {
                return;
            }
        }
        while (b0Var.a() > 0) {
            int i11 = this.f4465d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int D = b0Var.D();
                    b0Var.P(b0Var.e() - 1);
                    if (D == 255) {
                        this.f4467f = true;
                        return;
                    }
                }
                int min = Math.min(b0Var.a(), 3 - this.f4465d);
                b0Var.j(this.f4463b.d(), this.f4465d, min);
                int i12 = this.f4465d + min;
                this.f4465d = i12;
                if (i12 == 3) {
                    this.f4463b.P(0);
                    this.f4463b.O(3);
                    this.f4463b.Q(1);
                    int D2 = this.f4463b.D();
                    int D3 = this.f4463b.D();
                    this.f4466e = (D2 & Log.TAG_YOUTUBE) != 0;
                    this.f4464c = (((D2 & 15) << 8) | D3) + 3;
                    int b10 = this.f4463b.b();
                    int i13 = this.f4464c;
                    if (b10 < i13) {
                        this.f4463b.c(Math.min(4098, Math.max(i13, this.f4463b.b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(b0Var.a(), this.f4464c - this.f4465d);
                b0Var.j(this.f4463b.d(), this.f4465d, min2);
                int i14 = this.f4465d + min2;
                this.f4465d = i14;
                int i15 = this.f4464c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f4466e) {
                        this.f4463b.O(i15);
                    } else if (l0.r(this.f4463b.d(), 0, this.f4464c, -1) != 0) {
                        this.f4467f = true;
                        return;
                    } else {
                        this.f4463b.O(this.f4464c - 4);
                    }
                    this.f4463b.P(0);
                    this.f4462a.a(this.f4463b);
                    this.f4465d = 0;
                }
            }
        }
    }

    @Override
    public void b(i0 i0Var, h hVar, i0.d dVar) {
        this.f4462a.b(i0Var, hVar, dVar);
        this.f4467f = true;
    }

    @Override
    public void c() {
        this.f4467f = true;
    }
}
