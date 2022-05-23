package c4;

import android.util.SparseArray;
import c4.i0;
import c5.b0;
import c5.c0;
import c5.e;
import c5.l0;
import c5.x;
import java.util.ArrayList;
import java.util.Arrays;
import m3.q1;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.thunderdog.challegram.Log;
import t3.h;
import t3.t;

public final class p implements m {
    public final d0 f4646a;
    public final boolean f4647b;
    public final boolean f4648c;
    public long f4652g;
    public String f4654i;
    public t f4655j;
    public b f4656k;
    public boolean f4657l;
    public boolean f4659n;
    public final boolean[] f4653h = new boolean[3];
    public final u f4649d = new u(7, Log.TAG_YOUTUBE);
    public final u f4650e = new u(8, Log.TAG_YOUTUBE);
    public final u f4651f = new u(6, Log.TAG_YOUTUBE);
    public long f4658m = -9223372036854775807L;
    public final b0 f4660o = new b0();

    public static final class b {
        public final t f4661a;
        public final boolean f4662b;
        public final boolean f4663c;
        public final c0 f4666f;
        public byte[] f4667g;
        public int f4668h;
        public int f4669i;
        public long f4670j;
        public boolean f4671k;
        public long f4672l;
        public boolean f4675o;
        public long f4676p;
        public long f4677q;
        public boolean f4678r;
        public final SparseArray<x.c> f4664d = new SparseArray<>();
        public final SparseArray<x.b> f4665e = new SparseArray<>();
        public a f4673m = new a();
        public a f4674n = new a();

        public static final class a {
            public boolean f4679a;
            public boolean f4680b;
            public x.c f4681c;
            public int f4682d;
            public int f4683e;
            public int f4684f;
            public int f4685g;
            public boolean f4686h;
            public boolean f4687i;
            public boolean f4688j;
            public boolean f4689k;
            public int f4690l;
            public int f4691m;
            public int f4692n;
            public int f4693o;
            public int f4694p;

            public a() {
            }

            public void b() {
                this.f4680b = false;
                this.f4679a = false;
            }

            public final boolean c(a aVar) {
                int i10;
                int i11;
                int i12;
                boolean z10;
                if (!this.f4679a) {
                    return false;
                }
                if (!aVar.f4679a) {
                    return true;
                }
                x.c cVar = (x.c) c5.a.h(this.f4681c);
                x.c cVar2 = (x.c) c5.a.h(aVar.f4681c);
                return (this.f4684f == aVar.f4684f && this.f4685g == aVar.f4685g && this.f4686h == aVar.f4686h && (!this.f4687i || !aVar.f4687i || this.f4688j == aVar.f4688j) && (((i10 = this.f4682d) == (i11 = aVar.f4682d) || (i10 != 0 && i11 != 0)) && (((i12 = cVar.f4928k) != 0 || cVar2.f4928k != 0 || (this.f4691m == aVar.f4691m && this.f4692n == aVar.f4692n)) && ((i12 != 1 || cVar2.f4928k != 1 || (this.f4693o == aVar.f4693o && this.f4694p == aVar.f4694p)) && (z10 = this.f4689k) == aVar.f4689k && (!z10 || this.f4690l == aVar.f4690l))))) ? false : true;
            }

            public boolean d() {
                int i10;
                return this.f4680b && ((i10 = this.f4683e) == 7 || i10 == 2);
            }

            public void e(x.c cVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.f4681c = cVar;
                this.f4682d = i10;
                this.f4683e = i11;
                this.f4684f = i12;
                this.f4685g = i13;
                this.f4686h = z10;
                this.f4687i = z11;
                this.f4688j = z12;
                this.f4689k = z13;
                this.f4690l = i14;
                this.f4691m = i15;
                this.f4692n = i16;
                this.f4693o = i17;
                this.f4694p = i18;
                this.f4679a = true;
                this.f4680b = true;
            }

            public void f(int i10) {
                this.f4683e = i10;
                this.f4680b = true;
            }
        }

        public b(t tVar, boolean z10, boolean z11) {
            this.f4661a = tVar;
            this.f4662b = z10;
            this.f4663c = z11;
            byte[] bArr = new byte[Log.TAG_YOUTUBE];
            this.f4667g = bArr;
            this.f4666f = new c0(bArr, 0, 0);
            g();
        }

        public void a(byte[] r24, int r25, int r26) {
            throw new UnsupportedOperationException("Method not decompiled: c4.p.b.a(byte[], int, int):void");
        }

        public boolean b(long j10, int i10, boolean z10, boolean z11) {
            boolean z12 = false;
            if (this.f4669i == 9 || (this.f4663c && this.f4674n.c(this.f4673m))) {
                if (z10 && this.f4675o) {
                    d(i10 + ((int) (j10 - this.f4670j)));
                }
                this.f4676p = this.f4670j;
                this.f4677q = this.f4672l;
                this.f4678r = false;
                this.f4675o = true;
            }
            if (this.f4662b) {
                z11 = this.f4674n.d();
            }
            boolean z13 = this.f4678r;
            int i11 = this.f4669i;
            if (i11 == 5 || (z11 && i11 == 1)) {
                z12 = true;
            }
            boolean z14 = z13 | z12;
            this.f4678r = z14;
            return z14;
        }

        public boolean c() {
            return this.f4663c;
        }

        public final void d(int i10) {
            long j10 = this.f4677q;
            if (j10 != -9223372036854775807L) {
                boolean z10 = this.f4678r;
                this.f4661a.f(j10, z10 ? 1 : 0, (int) (this.f4670j - this.f4676p), i10, null);
            }
        }

        public void e(x.b bVar) {
            this.f4665e.append(bVar.f4915a, bVar);
        }

        public void f(x.c cVar) {
            this.f4664d.append(cVar.f4921d, cVar);
        }

        public void g() {
            this.f4671k = false;
            this.f4675o = false;
            this.f4674n.b();
        }

        public void h(long j10, int i10, long j11) {
            this.f4669i = i10;
            this.f4672l = j11;
            this.f4670j = j10;
            if (!this.f4662b || i10 != 1) {
                if (!this.f4663c) {
                    return;
                }
                if (!(i10 == 5 || i10 == 1 || i10 == 2)) {
                    return;
                }
            }
            a aVar = this.f4673m;
            this.f4673m = this.f4674n;
            this.f4674n = aVar;
            aVar.b();
            this.f4668h = 0;
            this.f4671k = true;
        }
    }

    public p(d0 d0Var, boolean z10, boolean z11) {
        this.f4646a = d0Var;
        this.f4647b = z10;
        this.f4648c = z11;
    }

    @Override
    public void a(b0 b0Var) {
        b();
        int e10 = b0Var.e();
        int f10 = b0Var.f();
        byte[] d10 = b0Var.d();
        this.f4652g += b0Var.a();
        this.f4655j.d(b0Var, b0Var.a());
        while (true) {
            int c10 = x.c(d10, e10, f10, this.f4653h);
            if (c10 == f10) {
                h(d10, e10, f10);
                return;
            }
            int f11 = x.f(d10, c10);
            int i10 = c10 - e10;
            if (i10 > 0) {
                h(d10, e10, c10);
            }
            int i11 = f10 - c10;
            long j10 = this.f4652g - i11;
            g(j10, i11, i10 < 0 ? -i10 : 0, this.f4658m);
            i(j10, f11, this.f4658m);
            e10 = c10 + 3;
        }
    }

    @EnsuresNonNull({"output", "sampleReader"})
    public final void b() {
        c5.a.h(this.f4655j);
        l0.j(this.f4656k);
    }

    @Override
    public void c() {
        this.f4652g = 0L;
        this.f4659n = false;
        this.f4658m = -9223372036854775807L;
        x.a(this.f4653h);
        this.f4649d.d();
        this.f4650e.d();
        this.f4651f.d();
        b bVar = this.f4656k;
        if (bVar != null) {
            bVar.g();
        }
    }

    @Override
    public void d() {
    }

    @Override
    public void e(h hVar, i0.d dVar) {
        dVar.a();
        this.f4654i = dVar.b();
        t q10 = hVar.q(dVar.c(), 2);
        this.f4655j = q10;
        this.f4656k = new b(q10, this.f4647b, this.f4648c);
        this.f4646a.b(hVar, dVar);
    }

    @Override
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f4658m = j10;
        }
        this.f4659n |= (i10 & 2) != 0;
    }

    @RequiresNonNull({"output", "sampleReader"})
    public final void g(long j10, int i10, int i11, long j11) {
        if (!this.f4657l || this.f4656k.c()) {
            this.f4649d.b(i11);
            this.f4650e.b(i11);
            if (!this.f4657l) {
                if (this.f4649d.c() && this.f4650e.c()) {
                    ArrayList arrayList = new ArrayList();
                    u uVar = this.f4649d;
                    arrayList.add(Arrays.copyOf(uVar.f4764d, uVar.f4765e));
                    u uVar2 = this.f4650e;
                    arrayList.add(Arrays.copyOf(uVar2.f4764d, uVar2.f4765e));
                    u uVar3 = this.f4649d;
                    x.c l10 = x.l(uVar3.f4764d, 3, uVar3.f4765e);
                    u uVar4 = this.f4650e;
                    x.b j12 = x.j(uVar4.f4764d, 3, uVar4.f4765e);
                    this.f4655j.a(new q1.b().S(this.f4654i).e0("video/avc").I(e.a(l10.f4918a, l10.f4919b, l10.f4920c)).j0(l10.f4922e).Q(l10.f4923f).a0(l10.f4924g).T(arrayList).E());
                    this.f4657l = true;
                    this.f4656k.f(l10);
                    this.f4656k.e(j12);
                    this.f4649d.d();
                    this.f4650e.d();
                }
            } else if (this.f4649d.c()) {
                u uVar5 = this.f4649d;
                this.f4656k.f(x.l(uVar5.f4764d, 3, uVar5.f4765e));
                this.f4649d.d();
            } else if (this.f4650e.c()) {
                u uVar6 = this.f4650e;
                this.f4656k.e(x.j(uVar6.f4764d, 3, uVar6.f4765e));
                this.f4650e.d();
            }
        }
        if (this.f4651f.b(i11)) {
            u uVar7 = this.f4651f;
            this.f4660o.N(this.f4651f.f4764d, x.q(uVar7.f4764d, uVar7.f4765e));
            this.f4660o.P(4);
            this.f4646a.a(j11, this.f4660o);
        }
        if (this.f4656k.b(j10, i10, this.f4657l, this.f4659n)) {
            this.f4659n = false;
        }
    }

    @RequiresNonNull({"sampleReader"})
    public final void h(byte[] bArr, int i10, int i11) {
        if (!this.f4657l || this.f4656k.c()) {
            this.f4649d.a(bArr, i10, i11);
            this.f4650e.a(bArr, i10, i11);
        }
        this.f4651f.a(bArr, i10, i11);
        this.f4656k.a(bArr, i10, i11);
    }

    @RequiresNonNull({"sampleReader"})
    public final void i(long j10, int i10, long j11) {
        if (!this.f4657l || this.f4656k.c()) {
            this.f4649d.e(i10);
            this.f4650e.e(i10);
        }
        this.f4651f.e(i10);
        this.f4656k.h(j10, i10, j11);
    }
}
