package p208oc;

import be.C1379j0;
import gd.C4779t2;
import java.util.Iterator;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.json.JSONException;
import org.thunderdog.challegram.Log;
import p108hb.C5063c;
import p139jb.AbstractC5917i;
import p154kb.C6227d;
import p208oc.AbstractC7821f;
import p224pc.C8105a;
import p224pc.C8107b;
import p350yd.C10930q6;

public class C7833i implements AbstractC7821f.AbstractC7828g {
    public final int f25186a;
    public final C10930q6 f25187b;
    public final long f25188c;
    public final int f25189d;
    public int f25190e;
    public int f25191f;
    public final TdApi.StatisticalGraph f25192g;
    public C8105a f25193h;
    public String f25194i;
    public boolean f25197l;
    public long f25195j = -1;
    public long f25196k = -1;
    public final C6227d<AbstractC7835b> f25198m = new C6227d<>();
    public final C6227d<AbstractC7834a> f25199n = new C6227d<>();

    public interface AbstractC7834a {
        void mo12900a(long j, long j2);
    }

    public interface AbstractC7835b {
        void mo14906a(C7833i iVar, C8105a aVar);
    }

    public C7833i(int i, C10930q6 q6Var, long j, int i2, int i3, TdApi.StatisticalGraph statisticalGraph, int i4) {
        this.f25186a = i;
        this.f25187b = q6Var;
        this.f25188c = j;
        this.f25189d = i4;
        this.f25190e = i3;
        this.f25191f = i2;
        this.f25192g = statisticalGraph;
        m14907v(statisticalGraph);
    }

    public void m14910s(TdApi.Object object, AbstractC5917i iVar) {
        boolean z = false;
        if (object.getConstructor() != -1679978726) {
            m14907v((TdApi.StatisticalGraph) object);
            if (iVar != null) {
                if (object.getConstructor() != -1006788526) {
                    z = true;
                }
                iVar.mo1322a(z);
                return;
            }
            return;
        }
        m14907v(new TdApi.StatisticalGraphError(C4779t2.m25379z5(object)));
        if (iVar != null) {
            iVar.mo1322a(false);
        }
    }

    public void m14909t(final AbstractC5917i iVar, final TdApi.Object object) {
        C1379j0.m37337d0(new Runnable() {
            @Override
            public final void run() {
                C7833i.this.m14910s(object, iVar);
            }
        });
    }

    @Override
    public void mo14928a(AbstractC7821f<?, ?> fVar, long j, long j2) {
        this.f25195j = j;
        this.f25196k = j2;
        Iterator<AbstractC7834a> it = this.f25199n.iterator();
        while (it.hasNext()) {
            it.next().mo12900a(j, j2);
        }
    }

    public void m14925d(AbstractC7834a aVar) {
        if (!m14911r()) {
            this.f25199n.add(aVar);
        }
    }

    public void m14924e(AbstractC7835b bVar) {
        this.f25198m.add(bVar);
        if (m14913p()) {
            m14908u(null);
        }
    }

    public void m14923f(AbstractC7834a aVar) {
        if (!m14911r()) {
            this.f25199n.remove(aVar);
        }
    }

    public void m14922g(AbstractC7835b bVar) {
        this.f25198m.remove(bVar);
    }

    public C8105a m14921h() {
        return this.f25193h;
    }

    public long m14920i() {
        return this.f25196k;
    }

    public int m14919j() {
        return this.f25186a;
    }

    public long m14918k() {
        return this.f25195j;
    }

    public int m14917l() {
        return this.f25191f;
    }

    public int m14916m() {
        int i = this.f25190e;
        if (i == 0) {
            return 102;
        }
        if (i == 1) {
            return 103;
        }
        if (i == 2) {
            return 104;
        }
        if (i == 4) {
            return 105;
        }
        throw new IllegalStateException("type == " + this.f25190e);
    }

    public boolean m14915n() {
        return (this.f25194i == null && this.f25193h == null) ? false : true;
    }

    public boolean m14914o() {
        return this.f25195j > 0 && this.f25196k > 0;
    }

    public boolean m14913p() {
        return this.f25192g.getConstructor() == 435891103;
    }

    public boolean m14912q() {
        return this.f25192g.getConstructor() == -1006788526;
    }

    public boolean m14911r() {
        return C5063c.m24145b(this.f25189d, 1);
    }

    public void m14908u(final AbstractC5917i iVar) {
        if (!this.f25197l) {
            this.f25197l = true;
            this.f25187b.m2270r4().m14783o(new TdApi.GetStatisticalGraph(this.f25188c, ((TdApi.StatisticalGraphAsync) this.f25192g).token, 0L), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C7833i.this.m14909t(iVar, object);
                }
            });
        }
    }

    public final void m14907v(TdApi.StatisticalGraph statisticalGraph) {
        int constructor = statisticalGraph.getConstructor();
        if (constructor == -1988940244) {
            boolean z = true;
            try {
                this.f25193h = C8107b.m13588a((TdApi.StatisticalGraphData) statisticalGraph, this.f25190e);
                this.f25194i = null;
            } catch (JSONException e) {
                Log.m14725e("Unable to parse statistics: %s", e, statisticalGraph);
                z = false;
            }
            if (!z) {
                return;
            }
        } else if (constructor == -1006788526) {
            this.f25194i = ((TdApi.StatisticalGraphError) statisticalGraph).errorMessage;
            this.f25193h = null;
        } else if (constructor == 435891103) {
            return;
        }
        Iterator<AbstractC7835b> it = this.f25198m.iterator();
        while (it.hasNext()) {
            it.next().mo14906a(this, this.f25193h);
        }
    }
}
