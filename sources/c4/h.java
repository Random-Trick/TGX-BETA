package c4;

import c4.i0;
import c5.a;
import c5.a0;
import c5.b0;
import com.google.android.exoplayer2.extractor.c;
import com.google.android.exoplayer2.extractor.g;
import java.io.EOFException;
import m3.k2;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.thunderdog.challegram.Log;
import t3.f;
import t3.g;
import t3.l;
import t3.q;

public final class h implements f {
    public static final l f4503m = g.f4501b;
    public final int f4504a;
    public final i f4505b;
    public final b0 f4506c;
    public final b0 f4507d;
    public final a0 f4508e;
    public t3.h f4509f;
    public long f4510g;
    public long f4511h;
    public int f4512i;
    public boolean f4513j;
    public boolean f4514k;
    public boolean f4515l;

    public h() {
        this(0);
    }

    public static int g(int i10, long j10) {
        return (int) (((i10 * 8) * 1000000) / j10);
    }

    public static f[] i() {
        return new f[]{new h()};
    }

    @Override
    public void a() {
    }

    @Override
    public void b(long j10, long j11) {
        this.f4514k = false;
        this.f4505b.c();
        this.f4510g = j11;
    }

    public final void d(g gVar) {
        int h10;
        if (!this.f4513j) {
            this.f4512i = -1;
            gVar.m();
            long j10 = 0;
            if (gVar.r() == 0) {
                l(gVar);
            }
            int i10 = 0;
            int i11 = 0;
            do {
                try {
                    if (!gVar.e(this.f4507d.d(), 0, 2, true)) {
                        break;
                    }
                    this.f4507d.P(0);
                    if (!i.m(this.f4507d.J())) {
                        break;
                    } else if (!gVar.e(this.f4507d.d(), 0, 4, true)) {
                        break;
                    } else {
                        this.f4508e.p(14);
                        h10 = this.f4508e.h(13);
                        if (h10 > 6) {
                            j10 += h10;
                            i11++;
                            if (i11 == 1000) {
                                break;
                            }
                        } else {
                            this.f4513j = true;
                            throw k2.a("Malformed ADTS stream", null);
                        }
                    }
                } catch (EOFException unused) {
                }
            } while (gVar.o(h10 - 6, true));
            i10 = i11;
            gVar.m();
            if (i10 > 0) {
                this.f4512i = (int) (j10 / i10);
            } else {
                this.f4512i = -1;
            }
            this.f4513j = true;
        }
    }

    @Override
    public int e(g gVar, q qVar) {
        a.h(this.f4509f);
        long a10 = gVar.a();
        int i10 = this.f4504a;
        if (((i10 & 2) == 0 && ((i10 & 1) == 0 || a10 == -1)) ? false : true) {
            d(gVar);
        }
        int b10 = gVar.b(this.f4506c.d(), 0, Log.TAG_VOICE);
        boolean z10 = b10 == -1;
        k(a10, z10);
        if (z10) {
            return -1;
        }
        this.f4506c.P(0);
        this.f4506c.O(b10);
        if (!this.f4514k) {
            this.f4505b.f(this.f4510g, 4);
            this.f4514k = true;
        }
        this.f4505b.a(this.f4506c);
        return 0;
    }

    @Override
    public void f(t3.h hVar) {
        this.f4509f = hVar;
        this.f4505b.e(hVar, new i0.d(0, 1));
        hVar.k();
    }

    public final com.google.android.exoplayer2.extractor.g h(long j10, boolean z10) {
        return new c(j10, this.f4511h, g(this.f4512i, this.f4505b.k()), this.f4512i, z10);
    }

    @Override
    public boolean j(g gVar) {
        int l10 = l(gVar);
        int i10 = l10;
        int i11 = 0;
        int i12 = 0;
        do {
            gVar.q(this.f4507d.d(), 0, 2);
            this.f4507d.P(0);
            if (!i.m(this.f4507d.J())) {
                i10++;
                gVar.m();
                gVar.g(i10);
            } else {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                gVar.q(this.f4507d.d(), 0, 4);
                this.f4508e.p(14);
                int h10 = this.f4508e.h(13);
                if (h10 <= 6) {
                    i10++;
                    gVar.m();
                    gVar.g(i10);
                } else {
                    gVar.g(h10 - 6);
                    i12 += h10;
                }
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - l10 < 8192);
        return false;
    }

    @RequiresNonNull({"extractorOutput"})
    public final void k(long j10, boolean z10) {
        if (!this.f4515l) {
            boolean z11 = false;
            boolean z12 = (this.f4504a & 1) != 0 && this.f4512i > 0;
            if (!z12 || this.f4505b.k() != -9223372036854775807L || z10) {
                if (!z12 || this.f4505b.k() == -9223372036854775807L) {
                    this.f4509f.a(new g.b(-9223372036854775807L));
                } else {
                    t3.h hVar = this.f4509f;
                    if ((this.f4504a & 2) != 0) {
                        z11 = true;
                    }
                    hVar.a(h(j10, z11));
                }
                this.f4515l = true;
            }
        }
    }

    public final int l(t3.g gVar) {
        int i10 = 0;
        while (true) {
            gVar.q(this.f4507d.d(), 0, 10);
            this.f4507d.P(0);
            if (this.f4507d.G() != 4801587) {
                break;
            }
            this.f4507d.Q(3);
            int C = this.f4507d.C();
            i10 += C + 10;
            gVar.g(C);
        }
        gVar.m();
        gVar.g(i10);
        if (this.f4511h == -1) {
            this.f4511h = i10;
        }
        return i10;
    }

    public h(int i10) {
        this.f4504a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f4505b = new i(true);
        this.f4506c = new b0((int) Log.TAG_VOICE);
        this.f4512i = -1;
        this.f4511h = -1L;
        b0 b0Var = new b0(10);
        this.f4507d = b0Var;
        this.f4508e = new a0(b0Var.d());
    }
}
