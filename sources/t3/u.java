package t3;

import c5.a;
import o3.b;
import t3.t;

public final class u {
    public final byte[] f22907a = new byte[10];
    public boolean f22908b;
    public int f22909c;
    public long f22910d;
    public int f22911e;
    public int f22912f;
    public int f22913g;

    public void a(t tVar, t.a aVar) {
        if (this.f22909c > 0) {
            tVar.f(this.f22910d, this.f22911e, this.f22912f, this.f22913g, aVar);
            this.f22909c = 0;
        }
    }

    public void b() {
        this.f22908b = false;
        this.f22909c = 0;
    }

    public void c(t tVar, long j10, int i10, int i11, int i12, t.a aVar) {
        a.g(this.f22913g <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f22908b) {
            int i13 = this.f22909c;
            int i14 = i13 + 1;
            this.f22909c = i14;
            if (i13 == 0) {
                this.f22910d = j10;
                this.f22911e = i10;
                this.f22912f = 0;
            }
            this.f22912f += i11;
            this.f22913g = i12;
            if (i14 >= 16) {
                a(tVar, aVar);
            }
        }
    }

    public void d(g gVar) {
        if (!this.f22908b) {
            gVar.q(this.f22907a, 0, 10);
            gVar.m();
            if (b.i(this.f22907a) != 0) {
                this.f22908b = true;
            }
        }
    }
}
