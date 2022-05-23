package o4;

import b5.i0;
import c5.l0;
import java.io.IOException;
import java.util.ArrayList;
import m3.o3;
import m3.y1;
import o4.s;

public final class d extends f<Void> {
    public final s f18971k;
    public final long f18972l;
    public final long f18973m;
    public final boolean f18974n;
    public final boolean f18975o;
    public final boolean f18976p;
    public final ArrayList<c> f18977q;
    public final o3.d f18978r;
    public a f18979s;
    public b f18980t;
    public long f18981u;
    public long f18982v;

    public static final class a extends i {
        public final long M;
        public final long N;
        public final long O;
        public final boolean P;

        public a(o3 o3Var, long j10, long j11) {
            super(o3Var);
            boolean z10 = false;
            if (o3Var.m() == 1) {
                o3.d r10 = o3Var.r(0, new o3.d());
                long max = Math.max(0L, j10);
                if (r10.U || max == 0 || r10.Q) {
                    long max2 = j11 == Long.MIN_VALUE ? r10.W : Math.max(0L, j11);
                    long j12 = r10.W;
                    if (j12 != -9223372036854775807L) {
                        max2 = max2 > j12 ? j12 : max2;
                        if (max > max2) {
                            throw new b(2);
                        }
                    }
                    this.M = max;
                    this.N = max2;
                    int i10 = (max2 > (-9223372036854775807L) ? 1 : (max2 == (-9223372036854775807L) ? 0 : -1));
                    this.O = i10 == 0 ? -9223372036854775807L : max2 - max;
                    if (r10.R && (i10 == 0 || (j12 != -9223372036854775807L && max2 == j12))) {
                        z10 = true;
                    }
                    this.P = z10;
                    return;
                }
                throw new b(1);
            }
            throw new b(0);
        }

        @Override
        public o3.b k(int i10, o3.b bVar, boolean z10) {
            this.f19088c.k(0, bVar, z10);
            long q10 = bVar.q() - this.M;
            long j10 = this.O;
            return bVar.v(bVar.f16860a, bVar.f16861b, 0, j10 == -9223372036854775807L ? -9223372036854775807L : j10 - q10, q10);
        }

        @Override
        public o3.d s(int i10, o3.d dVar, long j10) {
            this.f19088c.s(0, dVar, 0L);
            long j11 = dVar.Z;
            long j12 = this.M;
            dVar.Z = j11 + j12;
            dVar.W = this.O;
            dVar.R = this.P;
            long j13 = dVar.V;
            if (j13 != -9223372036854775807L) {
                long max = Math.max(j13, j12);
                dVar.V = max;
                long j14 = this.N;
                if (j14 != -9223372036854775807L) {
                    max = Math.min(max, j14);
                }
                dVar.V = max - this.M;
            }
            long I0 = l0.I0(this.M);
            long j15 = dVar.N;
            if (j15 != -9223372036854775807L) {
                dVar.N = j15 + I0;
            }
            long j16 = dVar.O;
            if (j16 != -9223372036854775807L) {
                dVar.O = j16 + I0;
            }
            return dVar;
        }
    }

    public static final class b extends IOException {
        public final int f18983a;

        public b(int r4) {
            throw new UnsupportedOperationException("Method not decompiled: o4.d.b.<init>(int):void");
        }

        public static String a(int i10) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
        }
    }

    public d(s sVar, long j10, long j11) {
        this(sVar, j10, j11, true, false, false);
    }

    public void F(Void r12, s sVar, o3 o3Var) {
        if (this.f18980t == null) {
            I(o3Var);
        }
    }

    public final void I(o3 o3Var) {
        long j10;
        o3Var.r(0, this.f18978r);
        long g10 = this.f18978r.g();
        long j11 = Long.MIN_VALUE;
        if (this.f18979s == null || this.f18977q.isEmpty() || this.f18975o) {
            long j12 = this.f18972l;
            long j13 = this.f18973m;
            if (this.f18976p) {
                long e10 = this.f18978r.e();
                j12 += e10;
                j13 += e10;
            }
            this.f18981u = g10 + j12;
            if (this.f18973m != Long.MIN_VALUE) {
                j11 = g10 + j13;
            }
            this.f18982v = j11;
            int size = this.f18977q.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f18977q.get(i10).t(this.f18981u, this.f18982v);
            }
            j10 = j12;
            j11 = j13;
        } else {
            j10 = this.f18981u - g10;
            if (this.f18973m != Long.MIN_VALUE) {
                j11 = this.f18982v - g10;
            }
        }
        try {
            a aVar = new a(o3Var, j10, j11);
            this.f18979s = aVar;
            y(aVar);
        } catch (b e11) {
            this.f18980t = e11;
            for (int i11 = 0; i11 < this.f18977q.size(); i11++) {
                this.f18977q.get(i11).m(this.f18980t);
            }
        }
    }

    @Override
    public p a(s.b bVar, b5.b bVar2, long j10) {
        c cVar = new c(this.f18971k.a(bVar, bVar2, j10), this.f18974n, this.f18981u, this.f18982v);
        this.f18977q.add(cVar);
        return cVar;
    }

    @Override
    public void d(p pVar) {
        c5.a.f(this.f18977q.remove(pVar));
        this.f18971k.d(((c) pVar).f18963a);
        if (this.f18977q.isEmpty() && !this.f18975o) {
            I(((a) c5.a.e(this.f18979s)).f19088c);
        }
    }

    @Override
    public y1 h() {
        return this.f18971k.h();
    }

    @Override
    public void j() {
        b bVar = this.f18980t;
        if (bVar == null) {
            super.j();
            return;
        }
        throw bVar;
    }

    @Override
    public void x(i0 i0Var) {
        super.x(i0Var);
        G(null, this.f18971k);
    }

    @Override
    public void z() {
        super.z();
        this.f18980t = null;
        this.f18979s = null;
    }

    public d(s sVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        c5.a.a(j10 >= 0);
        this.f18971k = (s) c5.a.e(sVar);
        this.f18972l = j10;
        this.f18973m = j11;
        this.f18974n = z10;
        this.f18975o = z11;
        this.f18976p = z12;
        this.f18977q = new ArrayList<>();
        this.f18978r = new o3.d();
    }
}
