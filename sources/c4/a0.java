package c4;

import android.util.SparseArray;
import c4.i0;
import c5.b0;
import c5.i0;
import com.google.android.exoplayer2.extractor.g;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.thunderdog.challegram.Log;
import t3.f;
import t3.g;
import t3.h;
import t3.l;
import t3.q;

public final class a0 implements f {
    public static final l f4426l = z.f4791b;
    public final i0 f4427a;
    public final SparseArray<a> f4428b;
    public final b0 f4429c;
    public final y f4430d;
    public boolean f4431e;
    public boolean f4432f;
    public boolean f4433g;
    public long f4434h;
    public x f4435i;
    public h f4436j;
    public boolean f4437k;

    public static final class a {
        public final m f4438a;
        public final i0 f4439b;
        public final c5.a0 f4440c = new c5.a0(new byte[64]);
        public boolean f4441d;
        public boolean f4442e;
        public boolean f4443f;
        public int f4444g;
        public long f4445h;

        public a(m mVar, i0 i0Var) {
            this.f4438a = mVar;
            this.f4439b = i0Var;
        }

        public void a(b0 b0Var) {
            b0Var.j(this.f4440c.f4792a, 0, 3);
            this.f4440c.p(0);
            b();
            b0Var.j(this.f4440c.f4792a, 0, this.f4444g);
            this.f4440c.p(0);
            c();
            this.f4438a.f(this.f4445h, 4);
            this.f4438a.a(b0Var);
            this.f4438a.d();
        }

        public final void b() {
            this.f4440c.r(8);
            this.f4441d = this.f4440c.g();
            this.f4442e = this.f4440c.g();
            this.f4440c.r(6);
            this.f4444g = this.f4440c.h(8);
        }

        public final void c() {
            this.f4445h = 0L;
            if (this.f4441d) {
                this.f4440c.r(4);
                this.f4440c.r(1);
                this.f4440c.r(1);
                long h10 = (this.f4440c.h(3) << 30) | (this.f4440c.h(15) << 15) | this.f4440c.h(15);
                this.f4440c.r(1);
                if (!this.f4443f && this.f4442e) {
                    this.f4440c.r(4);
                    this.f4440c.r(1);
                    this.f4440c.r(1);
                    this.f4440c.r(1);
                    this.f4439b.b((this.f4440c.h(3) << 30) | (this.f4440c.h(15) << 15) | this.f4440c.h(15));
                    this.f4443f = true;
                }
                this.f4445h = this.f4439b.b(h10);
            }
        }

        public void d() {
            this.f4443f = false;
            this.f4438a.c();
        }
    }

    public a0() {
        this(new i0(0L));
    }

    public static f[] d() {
        return new f[]{new a0()};
    }

    @Override
    public void a() {
    }

    @Override
    public void b(long j10, long j11) {
        boolean z10 = true;
        boolean z11 = this.f4427a.e() == -9223372036854775807L;
        if (!z11) {
            long c10 = this.f4427a.c();
            if (c10 == -9223372036854775807L || c10 == 0 || c10 == j11) {
                z10 = false;
            }
            z11 = z10;
        }
        if (z11) {
            this.f4427a.g(j11);
        }
        x xVar = this.f4435i;
        if (xVar != null) {
            xVar.h(j11);
        }
        for (int i10 = 0; i10 < this.f4428b.size(); i10++) {
            this.f4428b.valueAt(i10).d();
        }
    }

    @Override
    public int e(g gVar, q qVar) {
        c5.a.h(this.f4436j);
        long a10 = gVar.a();
        int i10 = (a10 > (-1L) ? 1 : (a10 == (-1L) ? 0 : -1));
        if ((i10 != 0) && !this.f4430d.e()) {
            return this.f4430d.g(gVar, qVar);
        }
        g(a10);
        x xVar = this.f4435i;
        if (xVar != null && xVar.d()) {
            return this.f4435i.c(gVar, qVar);
        }
        gVar.m();
        long f10 = i10 != 0 ? a10 - gVar.f() : -1L;
        if ((f10 != -1 && f10 < 4) || !gVar.e(this.f4429c.d(), 0, 4, true)) {
            return -1;
        }
        this.f4429c.P(0);
        int n10 = this.f4429c.n();
        if (n10 == 441) {
            return -1;
        }
        if (n10 == 442) {
            gVar.q(this.f4429c.d(), 0, 10);
            this.f4429c.P(9);
            gVar.n((this.f4429c.D() & 7) + 14);
            return 0;
        } else if (n10 == 443) {
            gVar.q(this.f4429c.d(), 0, 2);
            this.f4429c.P(0);
            gVar.n(this.f4429c.J() + 6);
            return 0;
        } else if (((n10 & (-256)) >> 8) != 1) {
            gVar.n(1);
            return 0;
        } else {
            int i11 = n10 & 255;
            a aVar = this.f4428b.get(i11);
            if (!this.f4431e) {
                if (aVar == null) {
                    m mVar = null;
                    if (i11 == 189) {
                        mVar = new c();
                        this.f4432f = true;
                        this.f4434h = gVar.r();
                    } else if ((i11 & 224) == 192) {
                        mVar = new t();
                        this.f4432f = true;
                        this.f4434h = gVar.r();
                    } else if ((i11 & 240) == 224) {
                        mVar = new n();
                        this.f4433g = true;
                        this.f4434h = gVar.r();
                    }
                    if (mVar != null) {
                        mVar.e(this.f4436j, new i0.d(i11, Log.TAG_CRASH));
                        aVar = new a(mVar, this.f4427a);
                        this.f4428b.put(i11, aVar);
                    }
                }
                if (gVar.r() > ((!this.f4432f || !this.f4433g) ? 1048576L : this.f4434h + 8192)) {
                    this.f4431e = true;
                    this.f4436j.k();
                }
            }
            gVar.q(this.f4429c.d(), 0, 2);
            this.f4429c.P(0);
            int J = this.f4429c.J() + 6;
            if (aVar == null) {
                gVar.n(J);
            } else {
                this.f4429c.L(J);
                gVar.readFully(this.f4429c.d(), 0, J);
                this.f4429c.P(6);
                aVar.a(this.f4429c);
                b0 b0Var = this.f4429c;
                b0Var.O(b0Var.b());
            }
            return 0;
        }
    }

    @Override
    public void f(h hVar) {
        this.f4436j = hVar;
    }

    @RequiresNonNull({"output"})
    public final void g(long j10) {
        if (!this.f4437k) {
            this.f4437k = true;
            if (this.f4430d.c() != -9223372036854775807L) {
                x xVar = new x(this.f4430d.d(), this.f4430d.c(), j10);
                this.f4435i = xVar;
                this.f4436j.a(xVar.b());
                return;
            }
            this.f4436j.a(new g.b(this.f4430d.c()));
        }
    }

    @Override
    public boolean j(t3.g gVar) {
        byte[] bArr = new byte[14];
        gVar.q(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        gVar.g(bArr[13] & 7);
        gVar.q(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    public a0(c5.i0 i0Var) {
        this.f4427a = i0Var;
        this.f4429c = new b0((int) Log.TAG_EMOJI);
        this.f4428b = new SparseArray<>();
        this.f4430d = new y();
    }
}
