package p031c4;

import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.thunderdog.challegram.Log;
import p020b5.C1186a;
import p020b5.C1189b0;
import p020b5.C1191c0;
import p020b5.C1194e;
import p020b5.C1216l0;
import p020b5.C1230s;
import p020b5.C1237x;
import p031c4.AbstractC1571i0;
import p174m3.C6600g1;
import p270t3.AbstractC8960h;
import p270t3.AbstractC8974t;

public final class C1591q implements AbstractC1581m {
    public final C1558d0 f5778a;
    public String f5779b;
    public AbstractC8974t f5780c;
    public C1592a f5781d;
    public boolean f5782e;
    public long f5789l;
    public final boolean[] f5783f = new boolean[3];
    public final C1596u f5784g = new C1596u(32, Log.TAG_YOUTUBE);
    public final C1596u f5785h = new C1596u(33, Log.TAG_YOUTUBE);
    public final C1596u f5786i = new C1596u(34, Log.TAG_YOUTUBE);
    public final C1596u f5787j = new C1596u(39, Log.TAG_YOUTUBE);
    public final C1596u f5788k = new C1596u(40, Log.TAG_YOUTUBE);
    public long f5790m = -9223372036854775807L;
    public final C1189b0 f5791n = new C1189b0();

    public static final class C1592a {
        public final AbstractC8974t f5792a;
        public long f5793b;
        public boolean f5794c;
        public int f5795d;
        public long f5796e;
        public boolean f5797f;
        public boolean f5798g;
        public boolean f5799h;
        public boolean f5800i;
        public boolean f5801j;
        public long f5802k;
        public long f5803l;
        public boolean f5804m;

        public C1592a(AbstractC8974t tVar) {
            this.f5792a = tVar;
        }

        public static boolean m36351b(int i) {
            return (32 <= i && i <= 35) || i == 39;
        }

        public static boolean m36350c(int i) {
            return i < 32 || i == 40;
        }

        public void m36352a(long j, int i, boolean z) {
            if (this.f5801j && this.f5798g) {
                this.f5804m = this.f5794c;
                this.f5801j = false;
            } else if (this.f5799h || this.f5798g) {
                if (z && this.f5800i) {
                    m36349d(i + ((int) (j - this.f5793b)));
                }
                this.f5802k = this.f5793b;
                this.f5803l = this.f5796e;
                this.f5804m = this.f5794c;
                this.f5800i = true;
            }
        }

        public final void m36349d(int i) {
            long j = this.f5803l;
            if (j != -9223372036854775807L) {
                boolean z = this.f5804m;
                this.f5792a.mo10793e(j, z ? 1 : 0, (int) (this.f5793b - this.f5802k), i, null);
            }
        }

        public void m36348e(byte[] bArr, int i, int i2) {
            if (this.f5797f) {
                int i3 = this.f5795d;
                int i4 = (i + 2) - i3;
                if (i4 < i2) {
                    this.f5798g = (bArr[i4] & 128) != 0;
                    this.f5797f = false;
                    return;
                }
                this.f5795d = i3 + (i2 - i);
            }
        }

        public void m36347f() {
            this.f5797f = false;
            this.f5798g = false;
            this.f5799h = false;
            this.f5800i = false;
            this.f5801j = false;
        }

        public void m36346g(long j, int i, int i2, long j2, boolean z) {
            boolean z2 = false;
            this.f5798g = false;
            this.f5799h = false;
            this.f5796e = j2;
            this.f5795d = 0;
            this.f5793b = j;
            if (!m36350c(i2)) {
                if (this.f5800i && !this.f5801j) {
                    if (z) {
                        m36349d(i);
                    }
                    this.f5800i = false;
                }
                if (m36351b(i2)) {
                    this.f5799h = !this.f5801j;
                    this.f5801j = true;
                }
            }
            boolean z3 = i2 >= 16 && i2 <= 21;
            this.f5794c = z3;
            if (z3 || i2 <= 9) {
                z2 = true;
            }
            this.f5797f = z2;
        }
    }

    public C1591q(C1558d0 d0Var) {
        this.f5778a = d0Var;
    }

    public static C6600g1 m36356i(String str, C1596u uVar, C1596u uVar2, C1596u uVar3) {
        int i = uVar.f5848e;
        byte[] bArr = new byte[uVar2.f5848e + i + uVar3.f5848e];
        System.arraycopy(uVar.f5847d, 0, bArr, 0, i);
        System.arraycopy(uVar2.f5847d, 0, bArr, uVar.f5848e, uVar2.f5848e);
        System.arraycopy(uVar3.f5847d, 0, bArr, uVar.f5848e + uVar2.f5848e, uVar3.f5848e);
        C1191c0 c0Var = new C1191c0(uVar2.f5847d, 0, uVar2.f5848e);
        c0Var.m38102l(44);
        int e = c0Var.m38109e(3);
        c0Var.m38103k();
        int e2 = c0Var.m38109e(2);
        boolean d = c0Var.m38110d();
        int e3 = c0Var.m38109e(5);
        int i2 = 0;
        for (int i3 = 0; i3 < 32; i3++) {
            if (c0Var.m38110d()) {
                i2 |= 1 << i3;
            }
        }
        int[] iArr = new int[6];
        for (int i4 = 0; i4 < 6; i4++) {
            iArr[i4] = c0Var.m38109e(8);
        }
        int e4 = c0Var.m38109e(8);
        int i5 = 0;
        for (int i6 = 0; i6 < e; i6++) {
            if (c0Var.m38110d()) {
                i5 += 89;
            }
            if (c0Var.m38110d()) {
                i5 += 8;
            }
        }
        c0Var.m38102l(i5);
        if (e > 0) {
            c0Var.m38102l((8 - e) * 2);
        }
        c0Var.m38106h();
        int h = c0Var.m38106h();
        if (h == 3) {
            c0Var.m38103k();
        }
        int h2 = c0Var.m38106h();
        int h3 = c0Var.m38106h();
        if (c0Var.m38110d()) {
            int h4 = c0Var.m38106h();
            int h5 = c0Var.m38106h();
            int h6 = c0Var.m38106h();
            int h7 = c0Var.m38106h();
            h2 -= ((h == 1 || h == 2) ? 2 : 1) * (h4 + h5);
            h3 -= (h == 1 ? 2 : 1) * (h6 + h7);
        }
        c0Var.m38106h();
        c0Var.m38106h();
        int h8 = c0Var.m38106h();
        for (int i7 = c0Var.m38110d() ? 0 : e; i7 <= e; i7++) {
            c0Var.m38106h();
            c0Var.m38106h();
            c0Var.m38106h();
        }
        c0Var.m38106h();
        c0Var.m38106h();
        c0Var.m38106h();
        c0Var.m38106h();
        c0Var.m38106h();
        c0Var.m38106h();
        if (c0Var.m38110d() && c0Var.m38110d()) {
            m36355j(c0Var);
        }
        c0Var.m38102l(2);
        if (c0Var.m38110d()) {
            c0Var.m38102l(8);
            c0Var.m38106h();
            c0Var.m38106h();
            c0Var.m38103k();
        }
        m36354k(c0Var);
        if (c0Var.m38110d()) {
            for (int i8 = 0; i8 < c0Var.m38106h(); i8++) {
                c0Var.m38102l(h8 + 4 + 1);
            }
        }
        c0Var.m38102l(2);
        float f = 1.0f;
        if (c0Var.m38110d()) {
            if (c0Var.m38110d()) {
                int e5 = c0Var.m38109e(8);
                if (e5 == 255) {
                    int e6 = c0Var.m38109e(16);
                    int e7 = c0Var.m38109e(16);
                    if (!(e6 == 0 || e7 == 0)) {
                        f = e6 / e7;
                    }
                } else {
                    float[] fArr = C1237x.f4573b;
                    if (e5 < fArr.length) {
                        f = fArr[e5];
                    } else {
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append("Unexpected aspect_ratio_idc value: ");
                        sb2.append(e5);
                        C1230s.m37884i("H265Reader", sb2.toString());
                    }
                }
            }
            if (c0Var.m38110d()) {
                c0Var.m38103k();
            }
            if (c0Var.m38110d()) {
                c0Var.m38102l(4);
                if (c0Var.m38110d()) {
                    c0Var.m38102l(24);
                }
            }
            if (c0Var.m38110d()) {
                c0Var.m38106h();
                c0Var.m38106h();
            }
            c0Var.m38103k();
            if (c0Var.m38110d()) {
                h3 *= 2;
            }
        }
        return new C6600g1.C6602b().m19876S(str).m19859e0("video/hevc").m19886I(C1194e.m38097c(e2, d, e3, i2, iArr, e4)).m19849j0(h2).m19878Q(h3).m19867a0(f).m19875T(Collections.singletonList(bArr)).m19890E();
    }

    public static void m36355j(C1191c0 c0Var) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int i3 = 1;
                if (!c0Var.m38110d()) {
                    c0Var.m38106h();
                } else {
                    int min = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        c0Var.m38107g();
                    }
                    for (int i4 = 0; i4 < min; i4++) {
                        c0Var.m38107g();
                    }
                }
                if (i == 3) {
                    i3 = 3;
                }
                i2 += i3;
            }
        }
    }

    public static void m36354k(C1191c0 c0Var) {
        int h = c0Var.m38106h();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < h; i2++) {
            if (i2 != 0) {
                z = c0Var.m38110d();
            }
            if (z) {
                c0Var.m38103k();
                c0Var.m38106h();
                for (int i3 = 0; i3 <= i; i3++) {
                    if (c0Var.m38110d()) {
                        c0Var.m38103k();
                    }
                }
            } else {
                int h2 = c0Var.m38106h();
                int h3 = c0Var.m38106h();
                i = h2 + h3;
                for (int i4 = 0; i4 < h2; i4++) {
                    c0Var.m38106h();
                    c0Var.m38103k();
                }
                for (int i5 = 0; i5 < h3; i5++) {
                    c0Var.m38106h();
                    c0Var.m38103k();
                }
            }
        }
    }

    @EnsuresNonNull({"output", "sampleReader"})
    public final void m36359a() {
        C1186a.m38185h(this.f5780c);
        C1216l0.m37971j(this.f5781d);
    }

    @Override
    public void mo36336b(C1189b0 b0Var) {
        m36359a();
        while (b0Var.m38145a() > 0) {
            int e = b0Var.m38141e();
            int f = b0Var.m38140f();
            byte[] d = b0Var.m38142d();
            this.f5789l += b0Var.m38145a();
            this.f5780c.mo10795c(b0Var, b0Var.m38145a());
            while (e < f) {
                int c = C1237x.m37856c(d, e, f, this.f5783f);
                if (c == f) {
                    m36357h(d, e, f);
                    return;
                }
                int e2 = C1237x.m37854e(d, c);
                int i = c - e;
                if (i > 0) {
                    m36357h(d, e, c);
                }
                int i2 = f - c;
                long j = this.f5789l - i2;
                m36358g(j, i2, i < 0 ? -i : 0, this.f5790m);
                m36353l(j, i2, e2, this.f5790m);
                e = c + 3;
            }
        }
    }

    @Override
    public void mo36335c() {
        this.f5789l = 0L;
        this.f5790m = -9223372036854775807L;
        C1237x.m37858a(this.f5783f);
        this.f5784g.m36326d();
        this.f5785h.m36326d();
        this.f5786i.m36326d();
        this.f5787j.m36326d();
        this.f5788k.m36326d();
        C1592a aVar = this.f5781d;
        if (aVar != null) {
            aVar.m36347f();
        }
    }

    @Override
    public void mo36334d() {
    }

    @Override
    public void mo36333e(AbstractC8960h hVar, AbstractC1571i0.C1575d dVar) {
        dVar.m36409a();
        this.f5779b = dVar.m36408b();
        AbstractC8974t r = hVar.mo6039r(dVar.m36407c(), 2);
        this.f5780c = r;
        this.f5781d = new C1592a(r);
        this.f5778a.m36473b(hVar, dVar);
    }

    @Override
    public void mo36332f(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f5790m = j;
        }
    }

    @RequiresNonNull({"output", "sampleReader"})
    public final void m36358g(long j, int i, int i2, long j2) {
        this.f5781d.m36352a(j, i, this.f5782e);
        if (!this.f5782e) {
            this.f5784g.m36328b(i2);
            this.f5785h.m36328b(i2);
            this.f5786i.m36328b(i2);
            if (this.f5784g.m36327c() && this.f5785h.m36327c() && this.f5786i.m36327c()) {
                this.f5780c.mo10797a(m36356i(this.f5779b, this.f5784g, this.f5785h, this.f5786i));
                this.f5782e = true;
            }
        }
        if (this.f5787j.m36328b(i2)) {
            C1596u uVar = this.f5787j;
            this.f5791n.m38149N(this.f5787j.f5847d, C1237x.m37842q(uVar.f5847d, uVar.f5848e));
            this.f5791n.m38146Q(5);
            this.f5778a.m36474a(j2, this.f5791n);
        }
        if (this.f5788k.m36328b(i2)) {
            C1596u uVar2 = this.f5788k;
            this.f5791n.m38149N(this.f5788k.f5847d, C1237x.m37842q(uVar2.f5847d, uVar2.f5848e));
            this.f5791n.m38146Q(5);
            this.f5778a.m36474a(j2, this.f5791n);
        }
    }

    @RequiresNonNull({"sampleReader"})
    public final void m36357h(byte[] bArr, int i, int i2) {
        this.f5781d.m36348e(bArr, i, i2);
        if (!this.f5782e) {
            this.f5784g.m36329a(bArr, i, i2);
            this.f5785h.m36329a(bArr, i, i2);
            this.f5786i.m36329a(bArr, i, i2);
        }
        this.f5787j.m36329a(bArr, i, i2);
        this.f5788k.m36329a(bArr, i, i2);
    }

    @RequiresNonNull({"sampleReader"})
    public final void m36353l(long j, int i, int i2, long j2) {
        this.f5781d.m36346g(j, i, i2, j2, this.f5782e);
        if (!this.f5782e) {
            this.f5784g.m36325e(i2);
            this.f5785h.m36325e(i2);
            this.f5786i.m36325e(i2);
        }
        this.f5787j.m36325e(i2);
        this.f5788k.m36325e(i2);
    }
}
