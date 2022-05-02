package p031c4;

import android.util.SparseArray;
import com.google.android.exoplayer2.extractor.AbstractC3470g;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.thunderdog.challegram.Log;
import p020b5.C1186a;
import p020b5.C1187a0;
import p020b5.C1189b0;
import p020b5.C1205i0;
import p031c4.AbstractC1571i0;
import p270t3.AbstractC8958f;
import p270t3.AbstractC8959g;
import p270t3.AbstractC8960h;
import p270t3.AbstractC8965l;
import p270t3.C8971q;

public final class C1551a0 implements AbstractC8958f {
    public static final AbstractC8965l f5509l = C1603z.f5874b;
    public final C1205i0 f5510a;
    public final SparseArray<C1552a> f5511b;
    public final C1189b0 f5512c;
    public final C1602y f5513d;
    public boolean f5514e;
    public boolean f5515f;
    public boolean f5516g;
    public long f5517h;
    public C1599x f5518i;
    public AbstractC8960h f5519j;
    public boolean f5520k;

    public static final class C1552a {
        public final AbstractC1581m f5521a;
        public final C1205i0 f5522b;
        public final C1187a0 f5523c = new C1187a0(new byte[64]);
        public boolean f5524d;
        public boolean f5525e;
        public boolean f5526f;
        public int f5527g;
        public long f5528h;

        public C1552a(AbstractC1581m mVar, C1205i0 i0Var) {
            this.f5521a = mVar;
            this.f5522b = i0Var;
        }

        public void m36483a(C1189b0 b0Var) {
            b0Var.m38136j(this.f5523c.f4469a, 0, 3);
            this.f5523c.m38168p(0);
            m36482b();
            b0Var.m38136j(this.f5523c.f4469a, 0, this.f5527g);
            this.f5523c.m38168p(0);
            m36481c();
            this.f5521a.mo36332f(this.f5528h, 4);
            this.f5521a.mo36336b(b0Var);
            this.f5521a.mo36334d();
        }

        public final void m36482b() {
            this.f5523c.m38166r(8);
            this.f5524d = this.f5523c.m38177g();
            this.f5525e = this.f5523c.m38177g();
            this.f5523c.m38166r(6);
            this.f5527g = this.f5523c.m38176h(8);
        }

        public final void m36481c() {
            this.f5528h = 0L;
            if (this.f5524d) {
                this.f5523c.m38166r(4);
                this.f5523c.m38166r(1);
                this.f5523c.m38166r(1);
                long h = (this.f5523c.m38176h(3) << 30) | (this.f5523c.m38176h(15) << 15) | this.f5523c.m38176h(15);
                this.f5523c.m38166r(1);
                if (!this.f5526f && this.f5525e) {
                    this.f5523c.m38166r(4);
                    this.f5523c.m38166r(1);
                    this.f5523c.m38166r(1);
                    this.f5523c.m38166r(1);
                    this.f5522b.m38055b((this.f5523c.m38176h(3) << 30) | (this.f5523c.m38176h(15) << 15) | this.f5523c.m38176h(15));
                    this.f5526f = true;
                }
                this.f5528h = this.f5522b.m38055b(h);
            }
        }

        public void m36480d() {
            this.f5526f = false;
            this.f5521a.mo36335c();
        }
    }

    public C1551a0() {
        this(new C1205i0(0L));
    }

    public static AbstractC8958f[] m36485d() {
        return new AbstractC8958f[]{new C1551a0()};
    }

    @Override
    public void mo1153a() {
    }

    @Override
    public void mo1152b(long j, long j2) {
        boolean z = true;
        boolean z2 = this.f5510a.m38052e() == -9223372036854775807L;
        if (!z2) {
            long c = this.f5510a.m38054c();
            if (c == -9223372036854775807L || c == 0 || c == j2) {
                z = false;
            }
            z2 = z;
        }
        if (z2) {
            this.f5510a.m38050g(j2);
        }
        C1599x xVar = this.f5518i;
        if (xVar != null) {
            xVar.m30498h(j2);
        }
        for (int i = 0; i < this.f5511b.size(); i++) {
            this.f5511b.valueAt(i).m36480d();
        }
    }

    @Override
    public int mo1149e(AbstractC8959g gVar, C8971q qVar) {
        C1186a.m38185h(this.f5519j);
        long a = gVar.mo6046a();
        int i = (a > (-1L) ? 1 : (a == (-1L) ? 0 : -1));
        if ((i != 0) && !this.f5513d.m36306e()) {
            return this.f5513d.m36304g(gVar, qVar);
        }
        m36484g(a);
        C1599x xVar = this.f5518i;
        if (xVar != null && xVar.m30502d()) {
            return this.f5518i.m30503c(gVar, qVar);
        }
        gVar.mo10808m();
        long f = i != 0 ? a - gVar.mo6045f() : -1L;
        if ((f != -1 && f < 4) || !gVar.mo10812e(this.f5512c.m38142d(), 0, 4, true)) {
            return -1;
        }
        this.f5512c.m38147P(0);
        int n = this.f5512c.m38132n();
        if (n == 441) {
            return -1;
        }
        if (n == 442) {
            gVar.mo10805q(this.f5512c.m38142d(), 0, 10);
            this.f5512c.m38147P(9);
            gVar.mo10807n((this.f5512c.m38159D() & 7) + 14);
            return 0;
        } else if (n == 443) {
            gVar.mo10805q(this.f5512c.m38142d(), 0, 2);
            this.f5512c.m38147P(0);
            gVar.mo10807n(this.f5512c.m38153J() + 6);
            return 0;
        } else if (((n & (-256)) >> 8) != 1) {
            gVar.mo10807n(1);
            return 0;
        } else {
            int i2 = n & 255;
            C1552a aVar = this.f5511b.get(i2);
            if (!this.f5514e) {
                if (aVar == null) {
                    AbstractC1581m mVar = null;
                    if (i2 == 189) {
                        mVar = new C1555c();
                        this.f5515f = true;
                        this.f5517h = gVar.mo6043r();
                    } else if ((i2 & 224) == 192) {
                        mVar = new C1595t();
                        this.f5515f = true;
                        this.f5517h = gVar.mo6043r();
                    } else if ((i2 & 240) == 224) {
                        mVar = new C1582n();
                        this.f5516g = true;
                        this.f5517h = gVar.mo6043r();
                    }
                    if (mVar != null) {
                        mVar.mo36333e(this.f5519j, new AbstractC1571i0.C1575d(i2, Log.TAG_CRASH));
                        aVar = new C1552a(mVar, this.f5510a);
                        this.f5511b.put(i2, aVar);
                    }
                }
                if (gVar.mo6043r() > ((!this.f5515f || !this.f5516g) ? 1048576L : this.f5517h + 8192)) {
                    this.f5514e = true;
                    this.f5519j.mo6040m();
                }
            }
            gVar.mo10805q(this.f5512c.m38142d(), 0, 2);
            this.f5512c.m38147P(0);
            int J = this.f5512c.m38153J() + 6;
            if (aVar == null) {
                gVar.mo10807n(J);
            } else {
                this.f5512c.m38151L(J);
                gVar.readFully(this.f5512c.m38142d(), 0, J);
                this.f5512c.m38147P(6);
                aVar.m36483a(this.f5512c);
                C1189b0 b0Var = this.f5512c;
                b0Var.m38148O(b0Var.m38144b());
            }
            return 0;
        }
    }

    @Override
    public void mo1148f(AbstractC8960h hVar) {
        this.f5519j = hVar;
    }

    @RequiresNonNull({"output"})
    public final void m36484g(long j) {
        if (!this.f5520k) {
            this.f5520k = true;
            if (this.f5513d.m36308c() != -9223372036854775807L) {
                C1599x xVar = new C1599x(this.f5513d.m36307d(), this.f5513d.m36308c(), j);
                this.f5518i = xVar;
                this.f5519j.mo6042a(xVar.m30504b());
                return;
            }
            this.f5519j.mo6042a(new AbstractC3470g.C3472b(this.f5513d.m36308c()));
        }
    }

    @Override
    public boolean mo1144j(AbstractC8959g gVar) {
        byte[] bArr = new byte[14];
        gVar.mo10805q(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        gVar.mo10811h(bArr[13] & 7);
        gVar.mo10805q(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    public C1551a0(C1205i0 i0Var) {
        this.f5510a = i0Var;
        this.f5512c = new C1189b0((int) Log.TAG_EMOJI);
        this.f5511b = new SparseArray<>();
        this.f5513d = new C1602y();
    }
}
