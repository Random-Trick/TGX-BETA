package p325x3;

import com.google.android.exoplayer2.extractor.AbstractC3470g;
import org.thunderdog.challegram.Log;
import p005a4.C0104k;
import p020b5.C1186a;
import p020b5.C1189b0;
import p073f4.C4260a;
import p162l4.C6310b;
import p174m3.C6600g1;
import p270t3.AbstractC8958f;
import p270t3.AbstractC8959g;
import p270t3.AbstractC8960h;
import p270t3.C8971q;

public final class C10088a implements AbstractC8958f {
    public AbstractC8960h f32766b;
    public int f32767c;
    public int f32768d;
    public int f32769e;
    public C6310b f32771g;
    public AbstractC8959g f32772h;
    public C10091c f32773i;
    public C0104k f32774j;
    public final C1189b0 f32765a = new C1189b0(6);
    public long f32770f = -1;

    public static C6310b m6055g(String str, long j) {
        C10089b a;
        if (j == -1 || (a = C10094e.m6038a(str)) == null) {
            return null;
        }
        return a.m6047a(j);
    }

    @Override
    public void mo1153a() {
        C0104k kVar = this.f32774j;
        if (kVar != null) {
            kVar.mo1153a();
        }
    }

    @Override
    public void mo1152b(long j, long j2) {
        if (j == 0) {
            this.f32767c = 0;
            this.f32774j = null;
        } else if (this.f32767c == 5) {
            ((C0104k) C1186a.m38188e(this.f32774j)).mo1152b(j, j2);
        }
    }

    public final void m6057c(AbstractC8959g gVar) {
        this.f32765a.m38151L(2);
        gVar.mo10805q(this.f32765a.m38142d(), 0, 2);
        gVar.mo10811h(this.f32765a.m38153J() - 2);
    }

    public final void m6056d() {
        m6054h(new C4260a.AbstractC4262b[0]);
        ((AbstractC8960h) C1186a.m38188e(this.f32766b)).mo6040m();
        this.f32766b.mo6042a(new AbstractC3470g.C3472b(-9223372036854775807L));
        this.f32767c = 6;
    }

    @Override
    public int mo1149e(AbstractC8959g gVar, C8971q qVar) {
        int i = this.f32767c;
        if (i == 0) {
            m6052k(gVar);
            return 0;
        } else if (i == 1) {
            m6050m(gVar);
            return 0;
        } else if (i == 2) {
            m6051l(gVar);
            return 0;
        } else if (i == 4) {
            long r = gVar.mo6043r();
            long j = this.f32770f;
            if (r != j) {
                qVar.f28860a = j;
                return 1;
            }
            m6049n(gVar);
            return 0;
        } else if (i == 5) {
            if (this.f32773i == null || gVar != this.f32772h) {
                this.f32772h = gVar;
                this.f32773i = new C10091c(gVar, this.f32770f);
            }
            int e = ((C0104k) C1186a.m38188e(this.f32774j)).mo1149e(this.f32773i, qVar);
            if (e == 1) {
                qVar.f28860a += this.f32770f;
            }
            return e;
        } else if (i == 6) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override
    public void mo1148f(AbstractC8960h hVar) {
        this.f32766b = hVar;
    }

    public final void m6054h(C4260a.AbstractC4262b... bVarArr) {
        ((AbstractC8960h) C1186a.m38188e(this.f32766b)).mo6039r(Log.TAG_CAMERA, 4).mo10797a(new C6600g1.C6602b().m19884K("image/jpeg").m19871X(new C4260a(bVarArr)).m19890E());
    }

    public final int m6053i(AbstractC8959g gVar) {
        this.f32765a.m38151L(2);
        gVar.mo10805q(this.f32765a.m38142d(), 0, 2);
        return this.f32765a.m38153J();
    }

    @Override
    public boolean mo1144j(AbstractC8959g gVar) {
        if (m6053i(gVar) != 65496) {
            return false;
        }
        int i = m6053i(gVar);
        this.f32768d = i;
        if (i == 65504) {
            m6057c(gVar);
            this.f32768d = m6053i(gVar);
        }
        if (this.f32768d != 65505) {
            return false;
        }
        gVar.mo10811h(2);
        this.f32765a.m38151L(6);
        gVar.mo10805q(this.f32765a.m38142d(), 0, 6);
        return this.f32765a.m38157F() == 1165519206 && this.f32765a.m38153J() == 0;
    }

    public final void m6052k(AbstractC8959g gVar) {
        this.f32765a.m38151L(2);
        gVar.readFully(this.f32765a.m38142d(), 0, 2);
        int J = this.f32765a.m38153J();
        this.f32768d = J;
        if (J == 65498) {
            if (this.f32770f != -1) {
                this.f32767c = 4;
            } else {
                m6056d();
            }
        } else if ((J < 65488 || J > 65497) && J != 65281) {
            this.f32767c = 1;
        }
    }

    public final void m6051l(AbstractC8959g gVar) {
        String x;
        if (this.f32768d == 65505) {
            C1189b0 b0Var = new C1189b0(this.f32769e);
            gVar.readFully(b0Var.m38142d(), 0, this.f32769e);
            if (this.f32771g == null && "http://ns.adobe.com/xap/1.0/".equals(b0Var.m38122x()) && (x = b0Var.m38122x()) != null) {
                C6310b g = m6055g(x, gVar.mo6046a());
                this.f32771g = g;
                if (g != null) {
                    this.f32770f = g.f19848M;
                }
            }
        } else {
            gVar.mo10807n(this.f32769e);
        }
        this.f32767c = 0;
    }

    public final void m6050m(AbstractC8959g gVar) {
        this.f32765a.m38151L(2);
        gVar.readFully(this.f32765a.m38142d(), 0, 2);
        this.f32769e = this.f32765a.m38153J() - 2;
        this.f32767c = 2;
    }

    public final void m6049n(AbstractC8959g gVar) {
        if (!gVar.mo10812e(this.f32765a.m38142d(), 0, 1, true)) {
            m6056d();
            return;
        }
        gVar.mo10808m();
        if (this.f32774j == null) {
            this.f32774j = new C0104k();
        }
        C10091c cVar = new C10091c(gVar, this.f32770f);
        this.f32773i = cVar;
        if (this.f32774j.mo1144j(cVar)) {
            this.f32774j.mo1148f(new C10092d(this.f32770f, (AbstractC8960h) C1186a.m38188e(this.f32766b)));
            m6048o();
            return;
        }
        m6056d();
    }

    public final void m6048o() {
        m6054h((C4260a.AbstractC4262b) C1186a.m38188e(this.f32771g));
        this.f32767c = 5;
    }
}
