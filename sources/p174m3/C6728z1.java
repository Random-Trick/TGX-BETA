package p174m3;

import android.os.Handler;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p006a5.AbstractC0117b;
import p006a5.AbstractC0150i0;
import p020b5.C1186a;
import p020b5.C1216l0;
import p020b5.C1230s;
import p186n3.C7122h1;
import p187n4.AbstractC7214n0;
import p187n4.AbstractC7223q;
import p187n4.AbstractC7230t;
import p187n4.AbstractC7240z;
import p187n4.C7205l;
import p187n4.C7212n;
import p187n4.C7217o;
import p187n4.C7221p;
import p230q3.AbstractC8219w;
import p230q3.C8211p;

public final class C6728z1 {
    public final AbstractC6732d f21166d;
    public final AbstractC7240z.C7241a f21167e;
    public final AbstractC8219w.C8220a f21168f;
    public boolean f21172j;
    public AbstractC0150i0 f21173k;
    public AbstractC7214n0 f21171i = new AbstractC7214n0.C7215a(0);
    public final IdentityHashMap<AbstractC7223q, C6731c> f21164b = new IdentityHashMap<>();
    public final Map<Object, C6731c> f21165c = new HashMap();
    public final List<C6731c> f21163a = new ArrayList();
    public final HashMap<C6731c, C6730b> f21169g = new HashMap<>();
    public final Set<C6731c> f21170h = new HashSet();

    public final class C6729a implements AbstractC7240z, AbstractC8219w {
        public final C6731c f21175a;
        public AbstractC7240z.C7241a f21176b;
        public AbstractC8219w.C8220a f21177c;

        public C6729a(C6731c cVar) {
            this.f21176b = C6728z1.this.f21167e;
            this.f21177c = C6728z1.this.f21168f;
            this.f21175a = cVar;
        }

        @Override
        public void mo13194D(int i, AbstractC7230t.C7231a aVar) {
            if (m19184a(i, aVar)) {
                this.f21177c.m13175m();
            }
        }

        @Override
        public void mo13193F(int i, AbstractC7230t.C7231a aVar) {
            if (m19184a(i, aVar)) {
                this.f21177c.m13178j();
            }
        }

        @Override
        public void mo17241G(int i, AbstractC7230t.C7231a aVar, C7205l lVar, C7221p pVar) {
            if (m19184a(i, aVar)) {
                this.f21176b.m17221p(lVar, pVar);
            }
        }

        @Override
        public void mo13192O(int i, AbstractC7230t.C7231a aVar, Exception exc) {
            if (m19184a(i, aVar)) {
                this.f21177c.m13176l(exc);
            }
        }

        @Override
        public void mo13191P(int i, AbstractC7230t.C7231a aVar, int i2) {
            if (m19184a(i, aVar)) {
                this.f21177c.m13177k(i2);
            }
        }

        @Override
        public void mo13190T(int i, AbstractC7230t.C7231a aVar) {
            if (m19184a(i, aVar)) {
                this.f21177c.m13179i();
            }
        }

        @Override
        public void mo17240U(int i, AbstractC7230t.C7231a aVar, C7205l lVar, C7221p pVar) {
            if (m19184a(i, aVar)) {
                this.f21176b.m17215v(lVar, pVar);
            }
        }

        @Override
        public void mo13189X(int i, AbstractC7230t.C7231a aVar) {
            if (m19184a(i, aVar)) {
                this.f21177c.m13180h();
            }
        }

        public final boolean m19184a(int i, AbstractC7230t.C7231a aVar) {
            AbstractC7230t.C7231a aVar2;
            if (aVar != null) {
                aVar2 = C6728z1.m19197n(this.f21175a, aVar);
                if (aVar2 == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            int r = C6728z1.m19193r(this.f21175a, i);
            AbstractC7240z.C7241a aVar3 = this.f21176b;
            if (aVar3.f23057a != r || !C1216l0.m37985c(aVar3.f23058b, aVar2)) {
                this.f21176b = C6728z1.this.f21167e.m17213x(r, aVar2, 0L);
            }
            AbstractC8219w.C8220a aVar4 = this.f21177c;
            if (aVar4.f26589a == r && C1216l0.m37985c(aVar4.f26590b, aVar2)) {
                return true;
            }
            this.f21177c = C6728z1.this.f21168f.m13167u(r, aVar2);
            return true;
        }

        @Override
        public void mo17239d0(int i, AbstractC7230t.C7231a aVar, C7205l lVar, C7221p pVar) {
            if (m19184a(i, aVar)) {
                this.f21176b.m17219r(lVar, pVar);
            }
        }

        @Override
        public void mo17238i(int i, AbstractC7230t.C7231a aVar, C7221p pVar) {
            if (m19184a(i, aVar)) {
                this.f21176b.m17228i(pVar);
            }
        }

        @Override
        public void mo13188v(int i, AbstractC7230t.C7231a aVar) {
            C8211p.m13197a(this, i, aVar);
        }

        @Override
        public void mo17237y(int i, AbstractC7230t.C7231a aVar, C7205l lVar, C7221p pVar, IOException iOException, boolean z) {
            if (m19184a(i, aVar)) {
                this.f21176b.m17217t(lVar, pVar, iOException, z);
            }
        }
    }

    public static final class C6730b {
        public final AbstractC7230t f21178a;
        public final AbstractC7230t.AbstractC7232b f21179b;
        public final C6729a f21180c;

        public C6730b(AbstractC7230t tVar, AbstractC7230t.AbstractC7232b bVar, C6729a aVar) {
            this.f21178a = tVar;
            this.f21179b = bVar;
            this.f21180c = aVar;
        }
    }

    public static final class C6731c implements AbstractC6716x1 {
        public final C7217o f21181a;
        public int f21184d;
        public boolean f21185e;
        public final List<AbstractC7230t.C7231a> f21183c = new ArrayList();
        public final Object f21182b = new Object();

        public C6731c(AbstractC7230t tVar, boolean z) {
            this.f21181a = new C7217o(tVar, z);
        }

        @Override
        public Object mo19183a() {
            return this.f21182b;
        }

        @Override
        public AbstractC6604g3 mo19182b() {
            return this.f21181a.m17311K();
        }

        public void m19181c(int i) {
            this.f21184d = i;
            this.f21185e = false;
            this.f21183c.clear();
        }
    }

    public interface AbstractC6732d {
        void mo19180b();
    }

    public C6728z1(AbstractC6732d dVar, C7122h1 h1Var, Handler handler) {
        this.f21166d = dVar;
        AbstractC7240z.C7241a aVar = new AbstractC7240z.C7241a();
        this.f21167e = aVar;
        AbstractC8219w.C8220a aVar2 = new AbstractC8219w.C8220a();
        this.f21168f = aVar2;
        if (h1Var != null) {
            aVar.m17231f(handler, h1Var);
            aVar2.m13181g(handler, h1Var);
        }
    }

    public static Object m19198m(Object obj) {
        return AbstractC6553a.m20118C(obj);
    }

    public static AbstractC7230t.C7231a m19197n(C6731c cVar, AbstractC7230t.C7231a aVar) {
        for (int i = 0; i < cVar.f21183c.size(); i++) {
            if (cVar.f21183c.get(i).f23023d == aVar.f23023d) {
                return aVar.m17248c(m19195p(cVar, aVar.f23020a));
            }
        }
        return null;
    }

    public static Object m19196o(Object obj) {
        return AbstractC6553a.m20117D(obj);
    }

    public static Object m19195p(C6731c cVar, Object obj) {
        return AbstractC6553a.m20116F(cVar.f21182b, obj);
    }

    public static int m19193r(C6731c cVar, int i) {
        return i + cVar.f21184d;
    }

    public void m19191t(AbstractC7230t tVar, AbstractC6604g3 g3Var) {
        this.f21166d.mo19180b();
    }

    public AbstractC6604g3 m19214A(int i, int i2, AbstractC7214n0 n0Var) {
        C1186a.m38192a(i >= 0 && i <= i2 && i2 <= m19194q());
        this.f21171i = n0Var;
        m19213B(i, i2);
        return m19202i();
    }

    public final void m19213B(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            C6731c remove = this.f21163a.remove(i3);
            this.f21165c.remove(remove.f21182b);
            m19204g(i3, -remove.f21181a.m17311K().mo17297v());
            remove.f21185e = true;
            if (this.f21172j) {
                m19190u(remove);
            }
        }
    }

    public AbstractC6604g3 m19212C(List<C6731c> list, AbstractC7214n0 n0Var) {
        m19213B(0, this.f21163a.size());
        return m19205f(this.f21163a.size(), list, n0Var);
    }

    public AbstractC6604g3 m19211D(AbstractC7214n0 n0Var) {
        int q = m19194q();
        if (n0Var.mo17325a() != q) {
            n0Var = n0Var.mo17318h().mo17320f(0, q);
        }
        this.f21171i = n0Var;
        return m19202i();
    }

    public AbstractC6604g3 m19205f(int i, List<C6731c> list, AbstractC7214n0 n0Var) {
        if (!list.isEmpty()) {
            this.f21171i = n0Var;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                C6731c cVar = list.get(i2 - i);
                if (i2 > 0) {
                    C6731c cVar2 = this.f21163a.get(i2 - 1);
                    cVar.m19181c(cVar2.f21184d + cVar2.f21181a.m17311K().mo17297v());
                } else {
                    cVar.m19181c(0);
                }
                m19204g(i2, cVar.f21181a.m17311K().mo17297v());
                this.f21163a.add(i2, cVar);
                this.f21165c.put(cVar.f21182b, cVar);
                if (this.f21172j) {
                    m19187x(cVar);
                    if (this.f21164b.isEmpty()) {
                        this.f21170h.add(cVar);
                    } else {
                        m19201j(cVar);
                    }
                }
            }
        }
        return m19202i();
    }

    public final void m19204g(int i, int i2) {
        while (i < this.f21163a.size()) {
            this.f21163a.get(i).f21184d += i2;
            i++;
        }
    }

    public AbstractC7223q m19203h(AbstractC7230t.C7231a aVar, AbstractC0117b bVar, long j) {
        Object o = m19196o(aVar.f23020a);
        AbstractC7230t.C7231a c = aVar.m17248c(m19198m(aVar.f23020a));
        C6731c cVar = (C6731c) C1186a.m38188e(this.f21165c.get(o));
        m19199l(cVar);
        cVar.f21183c.add(c);
        C7212n G = cVar.f21181a.mo17260c(c, bVar, j);
        this.f21164b.put(G, cVar);
        m19200k();
        return G;
    }

    public AbstractC6604g3 m19202i() {
        if (this.f21163a.isEmpty()) {
            return AbstractC6604g3.f20630a;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f21163a.size(); i2++) {
            C6731c cVar = this.f21163a.get(i2);
            cVar.f21184d = i;
            i += cVar.f21181a.m17311K().mo17297v();
        }
        return new C6676o2(this.f21163a, this.f21171i);
    }

    public final void m19201j(C6731c cVar) {
        C6730b bVar = this.f21169g.get(cVar);
        if (bVar != null) {
            bVar.f21178a.mo17250n(bVar.f21179b);
        }
    }

    public final void m19200k() {
        Iterator<C6731c> it = this.f21170h.iterator();
        while (it.hasNext()) {
            C6731c next = it.next();
            if (next.f21183c.isEmpty()) {
                m19201j(next);
                it.remove();
            }
        }
    }

    public final void m19199l(C6731c cVar) {
        this.f21170h.add(cVar);
        C6730b bVar = this.f21169g.get(cVar);
        if (bVar != null) {
            bVar.f21178a.mo17254j(bVar.f21179b);
        }
    }

    public int m19194q() {
        return this.f21163a.size();
    }

    public boolean m19192s() {
        return this.f21172j;
    }

    public final void m19190u(C6731c cVar) {
        if (cVar.f21185e && cVar.f21183c.isEmpty()) {
            C6730b bVar = (C6730b) C1186a.m38188e(this.f21169g.remove(cVar));
            bVar.f21178a.mo17255i(bVar.f21179b);
            bVar.f21178a.mo17261b(bVar.f21180c);
            bVar.f21178a.mo17256h(bVar.f21180c);
            this.f21170h.remove(cVar);
        }
    }

    public AbstractC6604g3 m19189v(int i, int i2, int i3, AbstractC7214n0 n0Var) {
        C1186a.m38192a(i >= 0 && i <= i2 && i2 <= m19194q() && i3 >= 0);
        this.f21171i = n0Var;
        if (i == i2 || i == i3) {
            return m19202i();
        }
        int min = Math.min(i, i3);
        int max = Math.max(((i2 - i) + i3) - 1, i2 - 1);
        int i4 = this.f21163a.get(min).f21184d;
        C1216l0.m37958p0(this.f21163a, i, i2, i3);
        while (min <= max) {
            C6731c cVar = this.f21163a.get(min);
            cVar.f21184d = i4;
            i4 += cVar.f21181a.m17311K().mo17297v();
            min++;
        }
        return m19202i();
    }

    public void m19188w(AbstractC0150i0 i0Var) {
        C1186a.m38187f(!this.f21172j);
        this.f21173k = i0Var;
        for (int i = 0; i < this.f21163a.size(); i++) {
            C6731c cVar = this.f21163a.get(i);
            m19187x(cVar);
            this.f21170h.add(cVar);
        }
        this.f21172j = true;
    }

    public final void m19187x(C6731c cVar) {
        C7217o oVar = cVar.f21181a;
        AbstractC7230t.AbstractC7232b y1Var = new AbstractC7230t.AbstractC7232b() {
            @Override
            public final void mo17247a(AbstractC7230t tVar, AbstractC6604g3 g3Var) {
                C6728z1.this.m19191t(tVar, g3Var);
            }
        };
        C6729a aVar = new C6729a(cVar);
        this.f21169g.put(cVar, new C6730b(oVar, y1Var, aVar));
        oVar.mo17252l(C1216l0.m37945w(), aVar);
        oVar.mo17258e(C1216l0.m37945w(), aVar);
        oVar.mo17262a(y1Var, this.f21173k);
    }

    public void m19186y() {
        for (C6730b bVar : this.f21169g.values()) {
            try {
                bVar.f21178a.mo17255i(bVar.f21179b);
            } catch (RuntimeException e) {
                C1230s.m37889d("MediaSourceList", "Failed to release child source.", e);
            }
            bVar.f21178a.mo17261b(bVar.f21180c);
            bVar.f21178a.mo17256h(bVar.f21180c);
        }
        this.f21169g.clear();
        this.f21170h.clear();
        this.f21172j = false;
    }

    public void m19185z(AbstractC7223q qVar) {
        C6731c cVar = (C6731c) C1186a.m38188e(this.f21164b.remove(qVar));
        cVar.f21181a.mo17259d(qVar);
        cVar.f21183c.remove(((C7212n) qVar).f22974a);
        if (!this.f21164b.isEmpty()) {
            m19200k();
        }
        m19190u(cVar);
    }
}
