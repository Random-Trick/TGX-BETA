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
        public long mo38201a(AbstractC8959g gVar) {
            return -1L;
        }

        @Override
        public AbstractC3470g mo38200b() {
            return new AbstractC3470g.C3472b(-9223372036854775807L);
        }

        @Override
        public void mo38199c(long j) {
        }
    }

    @EnsuresNonNull({"trackOutput", "extractorOutput"})
    public final void m38210a() {
        C1186a.m38182h(this.f4445b);
        C1216l0.m37968j(this.f4446c);
    }

    public long m38209b(long j) {
        return (j * 1000000) / this.f4452i;
    }

    public long m38208c(long j) {
        return (this.f4452i * j) / 1000000;
    }

    public void m38207d(AbstractC8960h hVar, AbstractC8974t tVar) {
        this.f4446c = hVar;
        this.f4445b = tVar;
        mo38195l(true);
    }

    public void mo38198e(long j) {
        this.f4450g = j;
    }

    public abstract long mo38197f(C1189b0 b0Var);

    public final int m38206g(AbstractC8959g gVar, C8971q qVar) {
        m38210a();
        int i = this.f4451h;
        if (i == 0) {
            return m38204j(gVar);
        }
        if (i == 1) {
            gVar.mo10808n((int) this.f4449f);
            this.f4451h = 2;
            return 0;
        } else if (i == 2) {
            C1216l0.m37968j(this.f4447d);
            return m38203k(gVar, qVar);
        } else if (i == 3) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean mo38196h(C1189b0 b0Var, long j, C1182b bVar);

    @EnsuresNonNullIf(expression = {"setupData.format"}, result = true)
    public final boolean m38205i(AbstractC8959g gVar) {
        while (this.f4444a.m38219d(gVar)) {
            this.f4454k = gVar.mo6043r() - this.f4449f;
            if (!mo38196h(this.f4444a.m38220c(), this.f4449f, this.f4453j)) {
                return true;
            }
            this.f4449f = gVar.mo6043r();
        }
        this.f4451h = 3;
        return false;
    }

    @RequiresNonNull({"trackOutput"})
    public final int m38204j(AbstractC8959g gVar) {
        if (!m38205i(gVar)) {
            return -1;
        }
        C6600g1 g1Var = this.f4453j.f4457a;
        this.f4452i = g1Var.f20592i0;
        if (!this.f4456m) {
            this.f4445b.mo10798a(g1Var);
            this.f4456m = true;
        }
        AbstractC1178g gVar2 = this.f4453j.f4458b;
        if (gVar2 != null) {
            this.f4447d = gVar2;
        } else if (gVar.mo6046a() == -1) {
            this.f4447d = new C1183c();
        } else {
            C1177f b = this.f4444a.m38221b();
            this.f4447d = new C1169a(this, this.f4449f, gVar.mo6046a(), b.f4438h + b.f4439i, b.f4433c, (b.f4432b & 4) != 0);
        }
        this.f4451h = 2;
        this.f4444a.m38217f();
        return 0;
    }

    @RequiresNonNull({"trackOutput", "oggSeeker", "extractorOutput"})
    public final int m38203k(AbstractC8959g gVar, C8971q qVar) {
        long a = this.f4447d.mo38201a(gVar);
        if (a >= 0) {
            qVar.f28857a = a;
            return 1;
        }
        if (a < -1) {
            mo38198e(-(a + 2));
        }
        if (!this.f4455l) {
            this.f4446c.mo6042a((AbstractC3470g) C1186a.m38182h(this.f4447d.mo38200b()));
            this.f4455l = true;
        }
        if (this.f4454k > 0 || this.f4444a.m38219d(gVar)) {
            this.f4454k = 0L;
            C1189b0 c = this.f4444a.m38220c();
            long f = mo38197f(c);
            if (f >= 0) {
                long j = this.f4450g;
                if (j + f >= this.f4448e) {
                    long b = m38209b(j);
                    this.f4445b.mo10796c(c, c.m38137f());
                    this.f4445b.mo10794e(b, 1, c.m38137f(), 0, null);
                    this.f4448e = -1L;
                }
            }
            this.f4450g += f;
            return 0;
        }
        this.f4451h = 3;
        return -1;
    }

    public void mo38195l(boolean z) {
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

    public final void m38202m(long j, long j2) {
        this.f4444a.m38218e();
        if (j == 0) {
            mo38195l(!this.f4455l);
        } else if (this.f4451h != 0) {
            this.f4448e = m38208c(j2);
            ((AbstractC1178g) C1216l0.m37968j(this.f4447d)).mo38199c(this.f4448e);
            this.f4451h = 2;
        }
    }
}
