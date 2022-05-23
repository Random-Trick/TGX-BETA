package c4;

import c4.i0;
import c5.a;
import c5.a0;
import c5.b0;
import c5.l0;
import c5.s;
import java.util.Arrays;
import java.util.Collections;
import m3.q1;
import o3.a;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.thunderdog.challegram.Log;
import t3.e;
import t3.h;
import t3.t;

public final class i implements m {
    public static final byte[] f4543v = {73, 68, 51};
    public final boolean f4544a;
    public final a0 f4545b;
    public final b0 f4546c;
    public final String f4547d;
    public String f4548e;
    public t f4549f;
    public t f4550g;
    public int f4551h;
    public int f4552i;
    public int f4553j;
    public boolean f4554k;
    public boolean f4555l;
    public int f4556m;
    public int f4557n;
    public int f4558o;
    public boolean f4559p;
    public long f4560q;
    public int f4561r;
    public long f4562s;
    public t f4563t;
    public long f4564u;

    public i(boolean z10) {
        this(z10, null);
    }

    public static boolean m(int i10) {
        return (i10 & 65526) == 65520;
    }

    @Override
    public void a(b0 b0Var) {
        b();
        while (b0Var.a() > 0) {
            int i10 = this.f4551h;
            if (i10 == 0) {
                j(b0Var);
            } else if (i10 == 1) {
                g(b0Var);
            } else if (i10 != 2) {
                if (i10 == 3) {
                    if (i(b0Var, this.f4545b.f4792a, this.f4554k ? 7 : 5)) {
                        n();
                    }
                } else if (i10 == 4) {
                    p(b0Var);
                } else {
                    throw new IllegalStateException();
                }
            } else if (i(b0Var, this.f4546c.d(), 10)) {
                o();
            }
        }
    }

    @EnsuresNonNull({"output", "currentOutput", "id3Output"})
    public final void b() {
        a.e(this.f4549f);
        l0.j(this.f4563t);
        l0.j(this.f4550g);
    }

    @Override
    public void c() {
        this.f4562s = -9223372036854775807L;
        q();
    }

    @Override
    public void d() {
    }

    @Override
    public void e(h hVar, i0.d dVar) {
        dVar.a();
        this.f4548e = dVar.b();
        t q10 = hVar.q(dVar.c(), 1);
        this.f4549f = q10;
        this.f4563t = q10;
        if (this.f4544a) {
            dVar.a();
            t q11 = hVar.q(dVar.c(), 5);
            this.f4550g = q11;
            q11.a(new q1.b().S(dVar.b()).e0("application/id3").E());
            return;
        }
        this.f4550g = new e();
    }

    @Override
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f4562s = j10;
        }
    }

    public final void g(b0 b0Var) {
        if (b0Var.a() != 0) {
            this.f4545b.f4792a[0] = b0Var.d()[b0Var.e()];
            this.f4545b.p(2);
            int h10 = this.f4545b.h(4);
            int i10 = this.f4557n;
            if (i10 == -1 || h10 == i10) {
                if (!this.f4555l) {
                    this.f4555l = true;
                    this.f4556m = this.f4558o;
                    this.f4557n = h10;
                }
                t();
                return;
            }
            q();
        }
    }

    public final boolean h(b0 b0Var, int i10) {
        b0Var.P(i10 + 1);
        if (!w(b0Var, this.f4545b.f4792a, 1)) {
            return false;
        }
        this.f4545b.p(4);
        int h10 = this.f4545b.h(1);
        int i11 = this.f4556m;
        if (i11 != -1 && h10 != i11) {
            return false;
        }
        if (this.f4557n != -1) {
            if (!w(b0Var, this.f4545b.f4792a, 1)) {
                return true;
            }
            this.f4545b.p(2);
            if (this.f4545b.h(4) != this.f4557n) {
                return false;
            }
            b0Var.P(i10 + 2);
        }
        if (!w(b0Var, this.f4545b.f4792a, 4)) {
            return true;
        }
        this.f4545b.p(14);
        int h11 = this.f4545b.h(13);
        if (h11 < 7) {
            return false;
        }
        byte[] d10 = b0Var.d();
        int f10 = b0Var.f();
        int i12 = i10 + h11;
        if (i12 >= f10) {
            return true;
        }
        if (d10[i12] == -1) {
            int i13 = i12 + 1;
            if (i13 == f10) {
                return true;
            }
            return l((byte) -1, d10[i13]) && ((d10[i13] & 8) >> 3) == h10;
        } else if (d10[i12] != 73) {
            return false;
        } else {
            int i14 = i12 + 1;
            if (i14 == f10) {
                return true;
            }
            if (d10[i14] != 68) {
                return false;
            }
            int i15 = i12 + 2;
            return i15 == f10 || d10[i15] == 51;
        }
    }

    public final boolean i(b0 b0Var, byte[] bArr, int i10) {
        int min = Math.min(b0Var.a(), i10 - this.f4552i);
        b0Var.j(bArr, this.f4552i, min);
        int i11 = this.f4552i + min;
        this.f4552i = i11;
        return i11 == i10;
    }

    public final void j(b0 b0Var) {
        byte[] d10 = b0Var.d();
        int e10 = b0Var.e();
        int f10 = b0Var.f();
        while (e10 < f10) {
            int i10 = e10 + 1;
            int i11 = d10[e10] & 255;
            if (this.f4553j != 512 || !l((byte) -1, (byte) i11) || (!this.f4555l && !h(b0Var, i10 - 2))) {
                int i12 = this.f4553j;
                int i13 = i11 | i12;
                if (i13 == 329) {
                    this.f4553j = 768;
                } else if (i13 == 511) {
                    this.f4553j = Log.TAG_GIF_LOADER;
                } else if (i13 == 836) {
                    this.f4553j = Log.TAG_CAMERA;
                } else if (i13 == 1075) {
                    u();
                    b0Var.P(i10);
                    return;
                } else if (i12 != 256) {
                    this.f4553j = Log.TAG_CRASH;
                    i10--;
                }
                e10 = i10;
            } else {
                this.f4558o = (i11 & 8) >> 3;
                boolean z10 = true;
                if ((i11 & 1) != 0) {
                    z10 = false;
                }
                this.f4554k = z10;
                if (!this.f4555l) {
                    r();
                } else {
                    t();
                }
                b0Var.P(i10);
                return;
            }
        }
        b0Var.P(e10);
    }

    public long k() {
        return this.f4560q;
    }

    public final boolean l(byte b10, byte b11) {
        return m(((b10 & 255) << 8) | (b11 & 255));
    }

    @RequiresNonNull({"output"})
    public final void n() {
        this.f4545b.p(0);
        if (!this.f4559p) {
            int h10 = this.f4545b.h(2) + 1;
            if (h10 != 2) {
                StringBuilder sb2 = new StringBuilder(61);
                sb2.append("Detected audio object type: ");
                sb2.append(h10);
                sb2.append(", but assuming AAC LC.");
                s.i("AdtsReader", sb2.toString());
                h10 = 2;
            }
            this.f4545b.r(5);
            byte[] a10 = o3.a.a(h10, this.f4557n, this.f4545b.h(3));
            a.b e10 = o3.a.e(a10);
            q1 E = new q1.b().S(this.f4548e).e0("audio/mp4a-latm").I(e10.f18650c).H(e10.f18649b).f0(e10.f18648a).T(Collections.singletonList(a10)).V(this.f4547d).E();
            this.f4560q = 1024000000 / E.f16909i0;
            this.f4549f.a(E);
            this.f4559p = true;
        } else {
            this.f4545b.r(10);
        }
        this.f4545b.r(4);
        int h11 = (this.f4545b.h(13) - 2) - 5;
        if (this.f4554k) {
            h11 -= 2;
        }
        v(this.f4549f, this.f4560q, 0, h11);
    }

    @RequiresNonNull({"id3Output"})
    public final void o() {
        this.f4550g.d(this.f4546c, 10);
        this.f4546c.P(6);
        v(this.f4550g, 0L, 10, this.f4546c.C() + 10);
    }

    @RequiresNonNull({"currentOutput"})
    public final void p(b0 b0Var) {
        int min = Math.min(b0Var.a(), this.f4561r - this.f4552i);
        this.f4563t.d(b0Var, min);
        int i10 = this.f4552i + min;
        this.f4552i = i10;
        int i11 = this.f4561r;
        if (i10 == i11) {
            long j10 = this.f4562s;
            if (j10 != -9223372036854775807L) {
                this.f4563t.f(j10, 1, i11, 0, null);
                this.f4562s += this.f4564u;
            }
            s();
        }
    }

    public final void q() {
        this.f4555l = false;
        s();
    }

    public final void r() {
        this.f4551h = 1;
        this.f4552i = 0;
    }

    public final void s() {
        this.f4551h = 0;
        this.f4552i = 0;
        this.f4553j = Log.TAG_CRASH;
    }

    public final void t() {
        this.f4551h = 3;
        this.f4552i = 0;
    }

    public final void u() {
        this.f4551h = 2;
        this.f4552i = f4543v.length;
        this.f4561r = 0;
        this.f4546c.P(0);
    }

    public final void v(t tVar, long j10, int i10, int i11) {
        this.f4551h = 4;
        this.f4552i = i10;
        this.f4563t = tVar;
        this.f4564u = j10;
        this.f4561r = i11;
    }

    public final boolean w(b0 b0Var, byte[] bArr, int i10) {
        if (b0Var.a() < i10) {
            return false;
        }
        b0Var.j(bArr, 0, i10);
        return true;
    }

    public i(boolean z10, String str) {
        this.f4545b = new a0(new byte[7]);
        this.f4546c = new b0(Arrays.copyOf(f4543v, 10));
        s();
        this.f4556m = -1;
        this.f4557n = -1;
        this.f4560q = -9223372036854775807L;
        this.f4562s = -9223372036854775807L;
        this.f4544a = z10;
        this.f4547d = str;
    }
}
