package v3;

import c5.b0;
import c5.l0;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.extractor.d;
import com.google.android.exoplayer2.extractor.e;
import com.google.android.exoplayer2.extractor.g;
import f4.a;
import org.thunderdog.challegram.Log;
import t3.f;
import t3.g;
import t3.h;
import t3.l;
import t3.m;
import t3.q;
import t3.t;

public final class c implements f {
    public static final l f24684o = b.f24683b;
    public final byte[] f24685a;
    public final b0 f24686b;
    public final boolean f24687c;
    public final m.a f24688d;
    public h f24689e;
    public t f24690f;
    public int f24691g;
    public a f24692h;
    public FlacStreamMetadata f24693i;
    public int f24694j;
    public int f24695k;
    public a f24696l;
    public int f24697m;
    public long f24698n;

    public c() {
        this(0);
    }

    public static f[] k() {
        return new f[]{new c()};
    }

    @Override
    public void a() {
    }

    @Override
    public void b(long j10, long j11) {
        long j12 = 0;
        if (j10 == 0) {
            this.f24691g = 0;
        } else {
            a aVar = this.f24696l;
            if (aVar != null) {
                aVar.h(j11);
            }
        }
        if (j11 != 0) {
            j12 = -1;
        }
        this.f24698n = j12;
        this.f24697m = 0;
        this.f24686b.L(0);
    }

    public final long d(b0 b0Var, boolean z10) {
        boolean z11;
        c5.a.e(this.f24693i);
        int e10 = b0Var.e();
        while (e10 <= b0Var.f() - 16) {
            b0Var.P(e10);
            if (m.d(b0Var, this.f24693i, this.f24695k, this.f24688d)) {
                b0Var.P(e10);
                return this.f24688d.f22893a;
            }
            e10++;
        }
        if (z10) {
            while (e10 <= b0Var.f() - this.f24694j) {
                b0Var.P(e10);
                boolean z12 = false;
                try {
                    z11 = m.d(b0Var, this.f24693i, this.f24695k, this.f24688d);
                } catch (IndexOutOfBoundsException unused) {
                    z11 = false;
                }
                if (b0Var.e() <= b0Var.f()) {
                    z12 = z11;
                }
                if (z12) {
                    b0Var.P(e10);
                    return this.f24688d.f22893a;
                }
                e10++;
            }
            b0Var.P(b0Var.f());
            return -1L;
        }
        b0Var.P(e10);
        return -1L;
    }

    @Override
    public int e(g gVar, q qVar) {
        int i10 = this.f24691g;
        if (i10 == 0) {
            n(gVar);
            return 0;
        } else if (i10 == 1) {
            i(gVar);
            return 0;
        } else if (i10 == 2) {
            p(gVar);
            return 0;
        } else if (i10 == 3) {
            o(gVar);
            return 0;
        } else if (i10 == 4) {
            g(gVar);
            return 0;
        } else if (i10 == 5) {
            return m(gVar, qVar);
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public void f(h hVar) {
        this.f24689e = hVar;
        this.f24690f = hVar.q(0, 1);
        hVar.k();
    }

    public final void g(g gVar) {
        this.f24695k = d.b(gVar);
        ((h) l0.j(this.f24689e)).a(h(gVar.r(), gVar.a()));
        this.f24691g = 5;
    }

    public final com.google.android.exoplayer2.extractor.g h(long j10, long j11) {
        c5.a.e(this.f24693i);
        FlacStreamMetadata flacStreamMetadata = this.f24693i;
        if (flacStreamMetadata.seekTable != null) {
            return new e(flacStreamMetadata, j10);
        }
        if (j11 == -1 || flacStreamMetadata.totalSamples <= 0) {
            return new g.b(flacStreamMetadata.getDurationUs());
        }
        a aVar = new a(flacStreamMetadata, this.f24695k, j10, j11);
        this.f24696l = aVar;
        return aVar.b();
    }

    public final void i(t3.g gVar) {
        byte[] bArr = this.f24685a;
        gVar.q(bArr, 0, bArr.length);
        gVar.m();
        this.f24691g = 2;
    }

    @Override
    public boolean j(t3.g gVar) {
        d.c(gVar, false);
        return d.a(gVar);
    }

    public final void l() {
        ((t) l0.j(this.f24690f)).f((this.f24698n * 1000000) / ((FlacStreamMetadata) l0.j(this.f24693i)).sampleRate, 1, this.f24697m, 0, null);
    }

    public final int m(t3.g gVar, q qVar) {
        boolean z10;
        c5.a.e(this.f24690f);
        c5.a.e(this.f24693i);
        a aVar = this.f24696l;
        if (aVar != null && aVar.d()) {
            return this.f24696l.c(gVar, qVar);
        }
        if (this.f24698n == -1) {
            this.f24698n = m.i(gVar, this.f24693i);
            return 0;
        }
        int f10 = this.f24686b.f();
        if (f10 < 32768) {
            int b10 = gVar.b(this.f24686b.d(), f10, Log.TAG_ROUND - f10);
            z10 = b10 == -1;
            if (!z10) {
                this.f24686b.O(f10 + b10);
            } else if (this.f24686b.a() == 0) {
                l();
                return -1;
            }
        } else {
            z10 = false;
        }
        int e10 = this.f24686b.e();
        int i10 = this.f24697m;
        int i11 = this.f24694j;
        if (i10 < i11) {
            b0 b0Var = this.f24686b;
            b0Var.Q(Math.min(i11 - i10, b0Var.a()));
        }
        long d10 = d(this.f24686b, z10);
        int e11 = this.f24686b.e() - e10;
        this.f24686b.P(e10);
        this.f24690f.d(this.f24686b, e11);
        this.f24697m += e11;
        if (d10 != -1) {
            l();
            this.f24697m = 0;
            this.f24698n = d10;
        }
        if (this.f24686b.a() < 16) {
            int a10 = this.f24686b.a();
            System.arraycopy(this.f24686b.d(), this.f24686b.e(), this.f24686b.d(), 0, a10);
            this.f24686b.P(0);
            this.f24686b.O(a10);
        }
        return 0;
    }

    public final void n(t3.g gVar) {
        this.f24692h = d.d(gVar, !this.f24687c);
        this.f24691g = 1;
    }

    public final void o(t3.g gVar) {
        d.a aVar = new d.a(this.f24693i);
        boolean z10 = false;
        while (!z10) {
            z10 = d.e(gVar, aVar);
            this.f24693i = (FlacStreamMetadata) l0.j(aVar.f5573a);
        }
        c5.a.e(this.f24693i);
        this.f24694j = Math.max(this.f24693i.minFrameSize, 6);
        ((t) l0.j(this.f24690f)).a(this.f24693i.getFormat(this.f24685a, this.f24692h));
        this.f24691g = 4;
    }

    public final void p(t3.g gVar) {
        d.i(gVar);
        this.f24691g = 3;
    }

    public c(int i10) {
        this.f24685a = new byte[42];
        this.f24686b = new b0(new byte[Log.TAG_ROUND], 0);
        this.f24687c = (i10 & 1) == 0 ? false : true;
        this.f24688d = new m.a();
        this.f24691g = 0;
    }
}
