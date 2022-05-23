package pc;

import ce.j0;
import hd.t2;
import ib.c;
import java.util.Iterator;
import lb.d;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.json.JSONException;
import org.thunderdog.challegram.Log;
import pc.f;
import zd.o6;

public class i implements f.g {
    public final int f21086a;
    public final o6 f21087b;
    public final long f21088c;
    public final int f21089d;
    public int f21090e;
    public int f21091f;
    public final TdApi.StatisticalGraph f21092g;
    public qc.a f21093h;
    public String f21094i;
    public boolean f21097l;
    public long f21095j = -1;
    public long f21096k = -1;
    public final d<b> f21098m = new d<>();
    public final d<a> f21099n = new d<>();

    public interface a {
        void a(long j10, long j11);
    }

    public interface b {
        void a(i iVar, qc.a aVar);
    }

    public i(int i10, o6 o6Var, long j10, int i11, int i12, TdApi.StatisticalGraph statisticalGraph, int i13) {
        this.f21086a = i10;
        this.f21087b = o6Var;
        this.f21088c = j10;
        this.f21089d = i13;
        this.f21090e = i12;
        this.f21091f = i11;
        this.f21092g = statisticalGraph;
        v(statisticalGraph);
    }

    public void s(TdApi.Object object, kb.i iVar) {
        boolean z10 = false;
        if (object.getConstructor() != -1679978726) {
            v((TdApi.StatisticalGraph) object);
            if (iVar != null) {
                if (object.getConstructor() != -1006788526) {
                    z10 = true;
                }
                iVar.a(z10);
                return;
            }
            return;
        }
        v(new TdApi.StatisticalGraphError(t2.z5(object)));
        if (iVar != null) {
            iVar.a(false);
        }
    }

    public void t(final kb.i iVar, final TdApi.Object object) {
        j0.d0(new Runnable() {
            @Override
            public final void run() {
                i.this.s(object, iVar);
            }
        });
    }

    @Override
    public void a(f<?, ?> fVar, long j10, long j11) {
        this.f21095j = j10;
        this.f21096k = j11;
        Iterator<a> it = this.f21099n.iterator();
        while (it.hasNext()) {
            it.next().a(j10, j11);
        }
    }

    public void d(a aVar) {
        if (!r()) {
            this.f21099n.add(aVar);
        }
    }

    public void e(b bVar) {
        this.f21098m.add(bVar);
        if (p()) {
            u(null);
        }
    }

    public void f(a aVar) {
        if (!r()) {
            this.f21099n.remove(aVar);
        }
    }

    public void g(b bVar) {
        this.f21098m.remove(bVar);
    }

    public qc.a h() {
        return this.f21093h;
    }

    public long i() {
        return this.f21096k;
    }

    public int j() {
        return this.f21086a;
    }

    public long k() {
        return this.f21095j;
    }

    public int l() {
        return this.f21091f;
    }

    public int m() {
        int i10 = this.f21090e;
        if (i10 == 0) {
            return 102;
        }
        if (i10 == 1) {
            return 103;
        }
        if (i10 == 2) {
            return 104;
        }
        if (i10 == 4) {
            return 105;
        }
        throw new IllegalStateException("type == " + this.f21090e);
    }

    public boolean n() {
        return (this.f21094i == null && this.f21093h == null) ? false : true;
    }

    public boolean o() {
        return this.f21095j > 0 && this.f21096k > 0;
    }

    public boolean p() {
        return this.f21092g.getConstructor() == 435891103;
    }

    public boolean q() {
        return this.f21092g.getConstructor() == -1006788526;
    }

    public boolean r() {
        return c.b(this.f21089d, 1);
    }

    public void u(final kb.i iVar) {
        if (!this.f21097l) {
            this.f21097l = true;
            this.f21087b.v4().o(new TdApi.GetStatisticalGraph(this.f21088c, ((TdApi.StatisticalGraphAsync) this.f21092g).token, 0L), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    i.this.t(iVar, object);
                }
            });
        }
    }

    public final void v(TdApi.StatisticalGraph statisticalGraph) {
        int constructor = statisticalGraph.getConstructor();
        if (constructor == -1988940244) {
            boolean z10 = true;
            try {
                this.f21093h = qc.b.a((TdApi.StatisticalGraphData) statisticalGraph, this.f21090e);
                this.f21094i = null;
            } catch (JSONException e10) {
                Log.e("Unable to parse statistics: %s", e10, statisticalGraph);
                z10 = false;
            }
            if (!z10) {
                return;
            }
        } else if (constructor == -1006788526) {
            this.f21094i = ((TdApi.StatisticalGraphError) statisticalGraph).errorMessage;
            this.f21093h = null;
        } else if (constructor == 435891103) {
            return;
        }
        Iterator<b> it = this.f21098m.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.f21093h);
        }
    }
}
