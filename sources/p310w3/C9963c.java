package p310w3;

import com.google.android.exoplayer2.extractor.AbstractC3470g;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p020b5.C1186a;
import p020b5.C1189b0;
import p270t3.AbstractC8958f;
import p270t3.AbstractC8959g;
import p270t3.AbstractC8960h;
import p270t3.AbstractC8965l;
import p270t3.C8971q;

public final class C9963c implements AbstractC8958f {
    public static final AbstractC8965l f32366q = C9962b.f32365b;
    public AbstractC8960h f32372f;
    public boolean f32374h;
    public long f32375i;
    public int f32376j;
    public int f32377k;
    public int f32378l;
    public long f32379m;
    public boolean f32380n;
    public C9961a f32381o;
    public C9967f f32382p;
    public final C1189b0 f32367a = new C1189b0(4);
    public final C1189b0 f32368b = new C1189b0(9);
    public final C1189b0 f32369c = new C1189b0(11);
    public final C1189b0 f32370d = new C1189b0();
    public final C9964d f32371e = new C9964d();
    public int f32373g = 1;

    public static AbstractC8958f[] m6409h() {
        return new AbstractC8958f[]{new C9963c()};
    }

    @Override
    public void mo1153a() {
    }

    @Override
    public void mo1152b(long j, long j2) {
        if (j == 0) {
            this.f32373g = 1;
            this.f32374h = false;
        } else {
            this.f32373g = 3;
        }
        this.f32376j = 0;
    }

    @RequiresNonNull({"extractorOutput"})
    public final void m6411d() {
        if (!this.f32380n) {
            this.f32372f.mo6042a(new AbstractC3470g.C3472b(-9223372036854775807L));
            this.f32380n = true;
        }
    }

    @Override
    public int mo1149e(AbstractC8959g gVar, C8971q qVar) {
        C1186a.m38185h(this.f32372f);
        while (true) {
            int i = this.f32373g;
            if (i != 1) {
                if (i == 2) {
                    m6404n(gVar);
                } else if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException();
                    } else if (m6406l(gVar)) {
                        return 0;
                    }
                } else if (!m6405m(gVar)) {
                    return -1;
                }
            } else if (!m6407k(gVar)) {
                return -1;
            }
        }
    }

    @Override
    public void mo1148f(AbstractC8960h hVar) {
        this.f32372f = hVar;
    }

    public final long m6410g() {
        if (this.f32374h) {
            return this.f32375i + this.f32379m;
        }
        if (this.f32371e.m6403d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f32379m;
    }

    public final C1189b0 m6408i(AbstractC8959g gVar) {
        if (this.f32378l > this.f32370d.m38144b()) {
            C1189b0 b0Var = this.f32370d;
            b0Var.m38149N(new byte[Math.max(b0Var.m38144b() * 2, this.f32378l)], 0);
        } else {
            this.f32370d.m38147P(0);
        }
        this.f32370d.m38148O(this.f32378l);
        gVar.readFully(this.f32370d.m38142d(), 0, this.f32378l);
        return this.f32370d;
    }

    @Override
    public boolean mo1144j(AbstractC8959g gVar) {
        gVar.mo10805q(this.f32367a.m38142d(), 0, 3);
        this.f32367a.m38147P(0);
        if (this.f32367a.m38156G() != 4607062) {
            return false;
        }
        gVar.mo10805q(this.f32367a.m38142d(), 0, 2);
        this.f32367a.m38147P(0);
        if ((this.f32367a.m38153J() & 250) != 0) {
            return false;
        }
        gVar.mo10805q(this.f32367a.m38142d(), 0, 4);
        this.f32367a.m38147P(0);
        int n = this.f32367a.m38132n();
        gVar.mo10808m();
        gVar.mo10811h(n);
        gVar.mo10805q(this.f32367a.m38142d(), 0, 4);
        this.f32367a.m38147P(0);
        return this.f32367a.m38132n() == 0;
    }

    @RequiresNonNull({"extractorOutput"})
    public final boolean m6407k(AbstractC8959g gVar) {
        boolean z = false;
        if (!gVar.mo10813d(this.f32368b.m38142d(), 0, 9, true)) {
            return false;
        }
        this.f32368b.m38147P(0);
        this.f32368b.m38146Q(4);
        int D = this.f32368b.m38159D();
        boolean z2 = (D & 4) != 0;
        if ((D & 1) != 0) {
            z = true;
        }
        if (z2 && this.f32381o == null) {
            this.f32381o = new C9961a(this.f32372f.mo6039r(8, 1));
        }
        if (z && this.f32382p == null) {
            this.f32382p = new C9967f(this.f32372f.mo6039r(9, 2));
        }
        this.f32372f.mo6040m();
        this.f32376j = (this.f32368b.m38132n() - 9) + 4;
        this.f32373g = 2;
        return true;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput"})
    public final boolean m6406l(p270t3.AbstractC8959g r10) {
        throw new UnsupportedOperationException("Method not decompiled: p310w3.C9963c.m6406l(t3.g):boolean");
    }

    public final boolean m6405m(AbstractC8959g gVar) {
        if (!gVar.mo10813d(this.f32369c.m38142d(), 0, 11, true)) {
            return false;
        }
        this.f32369c.m38147P(0);
        this.f32377k = this.f32369c.m38159D();
        this.f32378l = this.f32369c.m38156G();
        this.f32379m = this.f32369c.m38156G();
        this.f32379m = ((this.f32369c.m38159D() << 24) | this.f32379m) * 1000;
        this.f32369c.m38146Q(3);
        this.f32373g = 4;
        return true;
    }

    public final void m6404n(AbstractC8959g gVar) {
        gVar.mo10807n(this.f32376j);
        this.f32376j = 0;
        this.f32373g = 3;
    }
}
