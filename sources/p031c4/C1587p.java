package p031c4;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.thunderdog.challegram.Log;
import p020b5.C1186a;
import p020b5.C1189b0;
import p020b5.C1191c0;
import p020b5.C1194e;
import p020b5.C1216l0;
import p020b5.C1237x;
import p031c4.AbstractC1571i0;
import p174m3.C6600g1;
import p270t3.AbstractC8960h;
import p270t3.AbstractC8974t;

public final class C1587p implements AbstractC1581m {
    public final C1558d0 f5729a;
    public final boolean f5730b;
    public final boolean f5731c;
    public long f5735g;
    public String f5737i;
    public AbstractC8974t f5738j;
    public C1589b f5739k;
    public boolean f5740l;
    public boolean f5742n;
    public final boolean[] f5736h = new boolean[3];
    public final C1596u f5732d = new C1596u(7, Log.TAG_YOUTUBE);
    public final C1596u f5733e = new C1596u(8, Log.TAG_YOUTUBE);
    public final C1596u f5734f = new C1596u(6, Log.TAG_YOUTUBE);
    public long f5741m = -9223372036854775807L;
    public final C1189b0 f5743o = new C1189b0();

    public static final class C1589b {
        public final AbstractC8974t f5744a;
        public final boolean f5745b;
        public final boolean f5746c;
        public final C1191c0 f5749f;
        public byte[] f5750g;
        public int f5751h;
        public int f5752i;
        public long f5753j;
        public boolean f5754k;
        public long f5755l;
        public boolean f5758o;
        public long f5759p;
        public long f5760q;
        public boolean f5761r;
        public final SparseArray<C1237x.C1240c> f5747d = new SparseArray<>();
        public final SparseArray<C1237x.C1239b> f5748e = new SparseArray<>();
        public C1590a f5756m = new C1590a();
        public C1590a f5757n = new C1590a();

        public static final class C1590a {
            public boolean f5762a;
            public boolean f5763b;
            public C1237x.C1240c f5764c;
            public int f5765d;
            public int f5766e;
            public int f5767f;
            public int f5768g;
            public boolean f5769h;
            public boolean f5770i;
            public boolean f5771j;
            public boolean f5772k;
            public int f5773l;
            public int f5774m;
            public int f5775n;
            public int f5776o;
            public int f5777p;

            public C1590a() {
            }

            public void m36364b() {
                this.f5763b = false;
                this.f5762a = false;
            }

            public final boolean m36363c(C1590a aVar) {
                int i;
                int i2;
                int i3;
                boolean z;
                if (!this.f5762a) {
                    return false;
                }
                if (!aVar.f5762a) {
                    return true;
                }
                C1237x.C1240c cVar = (C1237x.C1240c) C1186a.m38185h(this.f5764c);
                C1237x.C1240c cVar2 = (C1237x.C1240c) C1186a.m38185h(aVar.f5764c);
                return (this.f5767f == aVar.f5767f && this.f5768g == aVar.f5768g && this.f5769h == aVar.f5769h && (!this.f5770i || !aVar.f5770i || this.f5771j == aVar.f5771j) && (((i = this.f5765d) == (i2 = aVar.f5765d) || (i != 0 && i2 != 0)) && (((i3 = cVar.f4599k) != 0 || cVar2.f4599k != 0 || (this.f5774m == aVar.f5774m && this.f5775n == aVar.f5775n)) && ((i3 != 1 || cVar2.f4599k != 1 || (this.f5776o == aVar.f5776o && this.f5777p == aVar.f5777p)) && (z = this.f5772k) == aVar.f5772k && (!z || this.f5773l == aVar.f5773l))))) ? false : true;
            }

            public boolean m36362d() {
                int i;
                return this.f5763b && ((i = this.f5766e) == 7 || i == 2);
            }

            public void m36361e(C1237x.C1240c cVar, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
                this.f5764c = cVar;
                this.f5765d = i;
                this.f5766e = i2;
                this.f5767f = i3;
                this.f5768g = i4;
                this.f5769h = z;
                this.f5770i = z2;
                this.f5771j = z3;
                this.f5772k = z4;
                this.f5773l = i5;
                this.f5774m = i6;
                this.f5775n = i7;
                this.f5776o = i8;
                this.f5777p = i9;
                this.f5762a = true;
                this.f5763b = true;
            }

            public void m36360f(int i) {
                this.f5766e = i;
                this.f5763b = true;
            }
        }

        public C1589b(AbstractC8974t tVar, boolean z, boolean z2) {
            this.f5744a = tVar;
            this.f5745b = z;
            this.f5746c = z2;
            byte[] bArr = new byte[Log.TAG_YOUTUBE];
            this.f5750g = bArr;
            this.f5749f = new C1191c0(bArr, 0, 0);
            m36367g();
        }

        public void m36373a(byte[] r24, int r25, int r26) {
            throw new UnsupportedOperationException("Method not decompiled: p031c4.C1587p.C1589b.m36373a(byte[], int, int):void");
        }

        public boolean m36372b(long j, int i, boolean z, boolean z2) {
            boolean z3 = false;
            if (this.f5752i == 9 || (this.f5746c && this.f5757n.m36363c(this.f5756m))) {
                if (z && this.f5758o) {
                    m36370d(i + ((int) (j - this.f5753j)));
                }
                this.f5759p = this.f5753j;
                this.f5760q = this.f5755l;
                this.f5761r = false;
                this.f5758o = true;
            }
            if (this.f5745b) {
                z2 = this.f5757n.m36362d();
            }
            boolean z4 = this.f5761r;
            int i2 = this.f5752i;
            if (i2 == 5 || (z2 && i2 == 1)) {
                z3 = true;
            }
            boolean z5 = z4 | z3;
            this.f5761r = z5;
            return z5;
        }

        public boolean m36371c() {
            return this.f5746c;
        }

        public final void m36370d(int i) {
            long j = this.f5760q;
            if (j != -9223372036854775807L) {
                boolean z = this.f5761r;
                this.f5744a.mo10793e(j, z ? 1 : 0, (int) (this.f5753j - this.f5759p), i, null);
            }
        }

        public void m36369e(C1237x.C1239b bVar) {
            this.f5748e.append(bVar.f4586a, bVar);
        }

        public void m36368f(C1237x.C1240c cVar) {
            this.f5747d.append(cVar.f4592d, cVar);
        }

        public void m36367g() {
            this.f5754k = false;
            this.f5758o = false;
            this.f5757n.m36364b();
        }

        public void m36366h(long j, int i, long j2) {
            this.f5752i = i;
            this.f5755l = j2;
            this.f5753j = j;
            if (!this.f5745b || i != 1) {
                if (!this.f5746c) {
                    return;
                }
                if (!(i == 5 || i == 1 || i == 2)) {
                    return;
                }
            }
            C1590a aVar = this.f5756m;
            this.f5756m = this.f5757n;
            this.f5757n = aVar;
            aVar.m36364b();
            this.f5751h = 0;
            this.f5754k = true;
        }
    }

    public C1587p(C1558d0 d0Var, boolean z, boolean z2) {
        this.f5729a = d0Var;
        this.f5730b = z;
        this.f5731c = z2;
    }

    @EnsuresNonNull({"output", "sampleReader"})
    public final void m36377a() {
        C1186a.m38185h(this.f5738j);
        C1216l0.m37971j(this.f5739k);
    }

    @Override
    public void mo36336b(C1189b0 b0Var) {
        m36377a();
        int e = b0Var.m38141e();
        int f = b0Var.m38140f();
        byte[] d = b0Var.m38142d();
        this.f5735g += b0Var.m38145a();
        this.f5738j.mo10795c(b0Var, b0Var.m38145a());
        while (true) {
            int c = C1237x.m37856c(d, e, f, this.f5736h);
            if (c == f) {
                m36375h(d, e, f);
                return;
            }
            int f2 = C1237x.m37853f(d, c);
            int i = c - e;
            if (i > 0) {
                m36375h(d, e, c);
            }
            int i2 = f - c;
            long j = this.f5735g - i2;
            m36376g(j, i2, i < 0 ? -i : 0, this.f5741m);
            m36374i(j, f2, this.f5741m);
            e = c + 3;
        }
    }

    @Override
    public void mo36335c() {
        this.f5735g = 0L;
        this.f5742n = false;
        this.f5741m = -9223372036854775807L;
        C1237x.m37858a(this.f5736h);
        this.f5732d.m36326d();
        this.f5733e.m36326d();
        this.f5734f.m36326d();
        C1589b bVar = this.f5739k;
        if (bVar != null) {
            bVar.m36367g();
        }
    }

    @Override
    public void mo36334d() {
    }

    @Override
    public void mo36333e(AbstractC8960h hVar, AbstractC1571i0.C1575d dVar) {
        dVar.m36409a();
        this.f5737i = dVar.m36408b();
        AbstractC8974t r = hVar.mo6039r(dVar.m36407c(), 2);
        this.f5738j = r;
        this.f5739k = new C1589b(r, this.f5730b, this.f5731c);
        this.f5729a.m36473b(hVar, dVar);
    }

    @Override
    public void mo36332f(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f5741m = j;
        }
        this.f5742n |= (i & 2) != 0;
    }

    @RequiresNonNull({"output", "sampleReader"})
    public final void m36376g(long j, int i, int i2, long j2) {
        if (!this.f5740l || this.f5739k.m36371c()) {
            this.f5732d.m36328b(i2);
            this.f5733e.m36328b(i2);
            if (!this.f5740l) {
                if (this.f5732d.m36327c() && this.f5733e.m36327c()) {
                    ArrayList arrayList = new ArrayList();
                    C1596u uVar = this.f5732d;
                    arrayList.add(Arrays.copyOf(uVar.f5847d, uVar.f5848e));
                    C1596u uVar2 = this.f5733e;
                    arrayList.add(Arrays.copyOf(uVar2.f5847d, uVar2.f5848e));
                    C1596u uVar3 = this.f5732d;
                    C1237x.C1240c l = C1237x.m37847l(uVar3.f5847d, 3, uVar3.f5848e);
                    C1596u uVar4 = this.f5733e;
                    C1237x.C1239b j3 = C1237x.m37849j(uVar4.f5847d, 3, uVar4.f5848e);
                    this.f5738j.mo10797a(new C6600g1.C6602b().m19876S(this.f5737i).m19859e0("video/avc").m19886I(C1194e.m38099a(l.f4589a, l.f4590b, l.f4591c)).m19849j0(l.f4593e).m19878Q(l.f4594f).m19867a0(l.f4595g).m19875T(arrayList).m19890E());
                    this.f5740l = true;
                    this.f5739k.m36368f(l);
                    this.f5739k.m36369e(j3);
                    this.f5732d.m36326d();
                    this.f5733e.m36326d();
                }
            } else if (this.f5732d.m36327c()) {
                C1596u uVar5 = this.f5732d;
                this.f5739k.m36368f(C1237x.m37847l(uVar5.f5847d, 3, uVar5.f5848e));
                this.f5732d.m36326d();
            } else if (this.f5733e.m36327c()) {
                C1596u uVar6 = this.f5733e;
                this.f5739k.m36369e(C1237x.m37849j(uVar6.f5847d, 3, uVar6.f5848e));
                this.f5733e.m36326d();
            }
        }
        if (this.f5734f.m36328b(i2)) {
            C1596u uVar7 = this.f5734f;
            this.f5743o.m38149N(this.f5734f.f5847d, C1237x.m37842q(uVar7.f5847d, uVar7.f5848e));
            this.f5743o.m38147P(4);
            this.f5729a.m36474a(j2, this.f5743o);
        }
        if (this.f5739k.m36372b(j, i, this.f5740l, this.f5742n)) {
            this.f5742n = false;
        }
    }

    @RequiresNonNull({"sampleReader"})
    public final void m36375h(byte[] bArr, int i, int i2) {
        if (!this.f5740l || this.f5739k.m36371c()) {
            this.f5732d.m36329a(bArr, i, i2);
            this.f5733e.m36329a(bArr, i, i2);
        }
        this.f5734f.m36329a(bArr, i, i2);
        this.f5739k.m36373a(bArr, i, i2);
    }

    @RequiresNonNull({"sampleReader"})
    public final void m36374i(long j, int i, long j2) {
        if (!this.f5740l || this.f5739k.m36371c()) {
            this.f5732d.m36325e(i);
            this.f5733e.m36325e(i);
        }
        this.f5734f.m36325e(i);
        this.f5739k.m36366h(j, i, j2);
    }
}
