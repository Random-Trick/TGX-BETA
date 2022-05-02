package p019b4;

import com.google.android.exoplayer2.extractor.AbstractC3470g;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p020b5.C1186a;
import p020b5.C1189b0;
import p020b5.C1216l0;
import p174m3.C6600g1;
import p270t3.AbstractC8959g;
import p270t3.AbstractC8960h;
import p270t3.AbstractC8974t;
import p270t3.C8971q;

public abstract class AbstractC1180i {
    public AbstractC8974t f4445b;
    public AbstractC8960h f4446c;
    public AbstractC1178g f4447d;
    public long f4448e;
    public long f4449f;
    public long f4450g;
    public int f4451h;
    public int f4452i;
    public long f4454k;
    public boolean f4455l;
    public boolean f4456m;
    public final C1176e f4444a = new C1176e();
    public C1182b f4453j = new C1182b();

    public static class C1182b {
        public C6600g1 f4457a;
        public AbstractC1178g f4458b;
    }

    public static final class C1183c implements AbstractC1178g {
        public C1183c() {
        }

        @Override
        public long mo38204a(AbstractC8959g gVar) {
            return -1L;
        }

        @Override
        public AbstractC3470g mo38203b() {
            return new AbstractC3470g.C3472b(-9223372036854775807L);
        }

        @Override
        public void mo38202c(long j) {
        }
    }

    @EnsuresNonNull({"trackOutput", "extractorOutput"})
    public final void m38213a() {
        C1186a.m38185h(this.f4445b);
        C1216l0.m37971j(this.f4446c);
    }

    public long m38212b(long j) {
        return (j * 1000000) / this.f4452i;
    }

    public long m38211c(long j) {
        return (this.f4452i * j) / 1000000;
    }

    public void m38210d(AbstractC8960h hVar, AbstractC8974t tVar) {
        this.f4446c = hVar;
        this.f4445b = tVar;
        mo38198l(true);
    }

    public void mo38201e(long j) {
        this.f4450g = j;
    }

    public abstract long mo38200f(C1189b0 b0Var);

    public final int m38209g(AbstractC8959g gVar, C8971q qVar) {
        m38213a();
        int i = this.f4451h;
        if (i == 0) {
            return m38207j(gVar);
        }
        if (i == 1) {
            gVar.mo10807n((int) this.f4449f);
            this.f4451h = 2;
            return 0;
        } else if (i == 2) {
            C1216l0.m37971j(this.f4447d);
            return m38206k(gVar, qVar);
        } else if (i == 3) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean mo38199h(C1189b0 b0Var, long j, C1182b bVar);

    @EnsuresNonNullIf(expression = {"setupData.format"}, result = true)
    public final boolean m38208i(AbstractC8959g gVar) {
        while (this.f4444a.m38222d(gVar)) {
            this.f4454k = gVar.mo6043r() - this.f4449f;
            if (!mo38199h(this.f4444a.m38223c(), this.f4449f, this.f4453j)) {
                return true;
            }
            this.f4449f = gVar.mo6043r();
        }
        this.f4451h = 3;
        return false;
    }

    @RequiresNonNull({"trackOutput"})
    public final int m38207j(AbstractC8959g gVar) {
        if (!m38208i(gVar)) {
            return -1;
        }
        C6600g1 g1Var = this.f4453j.f4457a;
        this.f4452i = g1Var.f20592i0;
        if (!this.f4456m) {
            this.f4445b.mo10797a(g1Var);
            this.f4456m = true;
        }
        AbstractC1178g gVar2 = this.f4453j.f4458b;
        if (gVar2 != null) {
            this.f4447d = gVar2;
        } else if (gVar.mo6046a() == -1) {
            this.f4447d = new C1183c();
        } else {
            C1177f b = this.f4444a.m38224b();
            this.f4447d = new C1169a(this, this.f4449f, gVar.mo6046a(), b.f4438h + b.f4439i, b.f4433c, (b.f4432b & 4) != 0);
        }
        this.f4451h = 2;
        this.f4444a.m38220f();
        return 0;
    }

    @RequiresNonNull({"trackOutput", "oggSeeker", "extractorOutput"})
    public final int m38206k(AbstractC8959g gVar, C8971q qVar) {
        long a = this.f4447d.mo38204a(gVar);
        if (a >= 0) {
            qVar.f28860a = a;
            return 1;
        }
        if (a < -1) {
            mo38201e(-(a + 2));
        }
        if (!this.f4455l) {
            this.f4446c.mo6042a((AbstractC3470g) C1186a.m38185h(this.f4447d.mo38203b()));
            this.f4455l = true;
        }
        if (this.f4454k > 0 || this.f4444a.m38222d(gVar)) {
            this.f4454k = 0L;
            C1189b0 c = this.f4444a.m38223c();
            long f = mo38200f(c);
            if (f >= 0) {
                long j = this.f4450g;
                if (j + f >= this.f4448e) {
                    long b = m38212b(j);
                    this.f4445b.mo10795c(c, c.m38140f());
                    this.f4445b.mo10793e(b, 1, c.m38140f(), 0, null);
                    this.f4448e = -1L;
                }
            }
            this.f4450g += f;
            return 0;
        }
        this.f4451h = 3;
        return -1;
    }

    public void mo38198l(boolean z) {
        if (z) {
            this.f4453j = new C1182b();
            this.f4449f = 0L;
            this.f4451h = 0;
        } else {
            this.f4451h = 1;
        }
        this.f4448e = -1L;
        this.f4450g = 0L;
    }

    public final void m38205m(long j, long j2) {
        this.f4444a.m38221e();
        if (j == 0) {
            mo38198l(!this.f4455l);
        } else if (this.f4451h != 0) {
            this.f4448e = m38211c(j2);
            ((AbstractC1178g) C1216l0.m37971j(this.f4447d)).mo38202c(this.f4448e);
            this.f4451h = 2;
        }
    }
}
