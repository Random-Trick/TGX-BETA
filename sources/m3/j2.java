package m3;

import android.os.Handler;
import b5.i0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n3.p1;
import o4.k;
import o4.l0;
import o4.m;
import o4.n;
import o4.o;
import o4.p;
import o4.s;
import o4.y;
import q3.w;

public final class j2 {
    public final p1 f16716a;
    public final d f16720e;
    public final y.a f16721f;
    public final w.a f16722g;
    public boolean f16726k;
    public i0 f16727l;
    public l0 f16725j = new l0.a(0);
    public final IdentityHashMap<p, c> f16718c = new IdentityHashMap<>();
    public final Map<Object, c> f16719d = new HashMap();
    public final List<c> f16717b = new ArrayList();
    public final HashMap<c, b> f16723h = new HashMap<>();
    public final Set<c> f16724i = new HashSet();

    public final class a implements y, w {
        public final c f16728a;
        public y.a f16729b;
        public w.a f16730c;

        public a(c cVar) {
            this.f16729b = j2.this.f16721f;
            this.f16730c = j2.this.f16722g;
            this.f16728a = cVar;
        }

        @Override
        public void A(int i10, s.b bVar, k kVar, o oVar) {
            if (b(i10, bVar)) {
                this.f16729b.r(kVar, oVar);
            }
        }

        @Override
        public void C(int i10, s.b bVar) {
            if (b(i10, bVar)) {
                this.f16730c.i();
            }
        }

        @Override
        public void E(int i10, s.b bVar) {
            if (b(i10, bVar)) {
                this.f16730c.h();
            }
        }

        @Override
        public void F(int i10, s.b bVar, int i11) {
            if (b(i10, bVar)) {
                this.f16730c.k(i11);
            }
        }

        @Override
        public void G(int i10, s.b bVar, k kVar, o oVar) {
            if (b(i10, bVar)) {
                this.f16729b.p(kVar, oVar);
            }
        }

        @Override
        public void J(int i10, s.b bVar, Exception exc) {
            if (b(i10, bVar)) {
                this.f16730c.l(exc);
            }
        }

        @Override
        public void Z(int i10, s.b bVar, o oVar) {
            if (b(i10, bVar)) {
                this.f16729b.i(oVar);
            }
        }

        @Override
        public void a0(int i10, s.b bVar, k kVar, o oVar, IOException iOException, boolean z10) {
            if (b(i10, bVar)) {
                this.f16729b.t(kVar, oVar, iOException, z10);
            }
        }

        public final boolean b(int i10, s.b bVar) {
            s.b bVar2;
            if (bVar != null) {
                bVar2 = j2.n(this.f16728a, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int r10 = j2.r(this.f16728a, i10);
            y.a aVar = this.f16729b;
            if (aVar.f19194a != r10 || !c5.l0.c(aVar.f19195b, bVar2)) {
                this.f16729b = j2.this.f16721f.x(r10, bVar2, 0L);
            }
            w.a aVar2 = this.f16730c;
            if (aVar2.f21367a == r10 && c5.l0.c(aVar2.f21368b, bVar2)) {
                return true;
            }
            this.f16730c = j2.this.f16722g.u(r10, bVar2);
            return true;
        }

        @Override
        public void b0(int i10, s.b bVar, k kVar, o oVar) {
            if (b(i10, bVar)) {
                this.f16729b.v(kVar, oVar);
            }
        }

        @Override
        public void g0(int i10, s.b bVar) {
            if (b(i10, bVar)) {
                this.f16730c.j();
            }
        }

        @Override
        public void k0(int i10, s.b bVar) {
            if (b(i10, bVar)) {
                this.f16730c.m();
            }
        }

        @Override
        public void l0(int i10, s.b bVar) {
            q3.p.a(this, i10, bVar);
        }
    }

    public static final class b {
        public final s f16731a;
        public final s.c f16732b;
        public final a f16733c;

        public b(s sVar, s.c cVar, a aVar) {
            this.f16731a = sVar;
            this.f16732b = cVar;
            this.f16733c = aVar;
        }
    }

    public static final class c implements h2 {
        public final n f16734a;
        public int f16737d;
        public boolean f16738e;
        public final List<s.b> f16736c = new ArrayList();
        public final Object f16735b = new Object();

        public c(s sVar, boolean z10) {
            this.f16734a = new n(sVar, z10);
        }

        @Override
        public Object a() {
            return this.f16735b;
        }

        @Override
        public o3 b() {
            return this.f16734a.L();
        }

        public void c(int i10) {
            this.f16737d = i10;
            this.f16738e = false;
            this.f16736c.clear();
        }
    }

    public interface d {
        void a();
    }

    public j2(d dVar, n3.a aVar, Handler handler, p1 p1Var) {
        this.f16716a = p1Var;
        this.f16720e = dVar;
        y.a aVar2 = new y.a();
        this.f16721f = aVar2;
        w.a aVar3 = new w.a();
        this.f16722g = aVar3;
        aVar2.f(handler, aVar);
        aVar3.g(handler, aVar);
    }

    public static Object m(Object obj) {
        return m3.a.A(obj);
    }

    public static s.b n(c cVar, s.b bVar) {
        for (int i10 = 0; i10 < cVar.f16736c.size(); i10++) {
            if (cVar.f16736c.get(i10).f19172d == bVar.f19172d) {
                return bVar.c(p(cVar, bVar.f19169a));
            }
        }
        return null;
    }

    public static Object o(Object obj) {
        return m3.a.B(obj);
    }

    public static Object p(c cVar, Object obj) {
        return m3.a.D(cVar.f16735b, obj);
    }

    public static int r(c cVar, int i10) {
        return i10 + cVar.f16737d;
    }

    public void t(s sVar, o3 o3Var) {
        this.f16720e.a();
    }

    public o3 A(int i10, int i11, l0 l0Var) {
        c5.a.a(i10 >= 0 && i10 <= i11 && i11 <= q());
        this.f16725j = l0Var;
        B(i10, i11);
        return i();
    }

    public final void B(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c remove = this.f16717b.remove(i12);
            this.f16719d.remove(remove.f16735b);
            g(i12, -remove.f16734a.L().t());
            remove.f16738e = true;
            if (this.f16726k) {
                u(remove);
            }
        }
    }

    public o3 C(List<c> list, l0 l0Var) {
        B(0, this.f16717b.size());
        return f(this.f16717b.size(), list, l0Var);
    }

    public o3 D(l0 l0Var) {
        int q10 = q();
        if (l0Var.a() != q10) {
            l0Var = l0Var.h().f(0, q10);
        }
        this.f16725j = l0Var;
        return i();
    }

    public o3 f(int i10, List<c> list, l0 l0Var) {
        if (!list.isEmpty()) {
            this.f16725j = l0Var;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = list.get(i11 - i10);
                if (i11 > 0) {
                    c cVar2 = this.f16717b.get(i11 - 1);
                    cVar.c(cVar2.f16737d + cVar2.f16734a.L().t());
                } else {
                    cVar.c(0);
                }
                g(i11, cVar.f16734a.L().t());
                this.f16717b.add(i11, cVar);
                this.f16719d.put(cVar.f16735b, cVar);
                if (this.f16726k) {
                    x(cVar);
                    if (this.f16718c.isEmpty()) {
                        this.f16724i.add(cVar);
                    } else {
                        j(cVar);
                    }
                }
            }
        }
        return i();
    }

    public final void g(int i10, int i11) {
        while (i10 < this.f16717b.size()) {
            this.f16717b.get(i10).f16737d += i11;
            i10++;
        }
    }

    public p h(s.b bVar, b5.b bVar2, long j10) {
        Object o10 = o(bVar.f19169a);
        s.b c10 = bVar.c(m(bVar.f19169a));
        c cVar = (c) c5.a.e(this.f16719d.get(o10));
        l(cVar);
        cVar.f16736c.add(c10);
        m H = cVar.f16734a.a(c10, bVar2, j10);
        this.f16718c.put(H, cVar);
        k();
        return H;
    }

    public o3 i() {
        if (this.f16717b.isEmpty()) {
            return o3.f16858a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f16717b.size(); i11++) {
            c cVar = this.f16717b.get(i11);
            cVar.f16737d = i10;
            i10 += cVar.f16734a.L().t();
        }
        return new x2(this.f16717b, this.f16725j);
    }

    public final void j(c cVar) {
        b bVar = this.f16723h.get(cVar);
        if (bVar != null) {
            bVar.f16731a.b(bVar.f16732b);
        }
    }

    public final void k() {
        Iterator<c> it = this.f16724i.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f16736c.isEmpty()) {
                j(next);
                it.remove();
            }
        }
    }

    public final void l(c cVar) {
        this.f16724i.add(cVar);
        b bVar = this.f16723h.get(cVar);
        if (bVar != null) {
            bVar.f16731a.k(bVar.f16732b);
        }
    }

    public int q() {
        return this.f16717b.size();
    }

    public boolean s() {
        return this.f16726k;
    }

    public final void u(c cVar) {
        if (cVar.f16738e && cVar.f16736c.isEmpty()) {
            b bVar = (b) c5.a.e(this.f16723h.remove(cVar));
            bVar.f16731a.m(bVar.f16732b);
            bVar.f16731a.e(bVar.f16733c);
            bVar.f16731a.i(bVar.f16733c);
            this.f16724i.remove(cVar);
        }
    }

    public o3 v(int i10, int i11, int i12, l0 l0Var) {
        c5.a.a(i10 >= 0 && i10 <= i11 && i11 <= q() && i12 >= 0);
        this.f16725j = l0Var;
        if (i10 == i11 || i10 == i12) {
            return i();
        }
        int min = Math.min(i10, i12);
        int max = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
        int i13 = this.f16717b.get(min).f16737d;
        c5.l0.q0(this.f16717b, i10, i11, i12);
        while (min <= max) {
            c cVar = this.f16717b.get(min);
            cVar.f16737d = i13;
            i13 += cVar.f16734a.L().t();
            min++;
        }
        return i();
    }

    public void w(i0 i0Var) {
        c5.a.f(!this.f16726k);
        this.f16727l = i0Var;
        for (int i10 = 0; i10 < this.f16717b.size(); i10++) {
            c cVar = this.f16717b.get(i10);
            x(cVar);
            this.f16724i.add(cVar);
        }
        this.f16726k = true;
    }

    public final void x(c cVar) {
        n nVar = cVar.f16734a;
        s.c i2Var = new s.c() {
            @Override
            public final void a(s sVar, o3 o3Var) {
                j2.this.t(sVar, o3Var);
            }
        };
        a aVar = new a(cVar);
        this.f16723h.put(cVar, new b(nVar, i2Var, aVar));
        nVar.o(c5.l0.w(), aVar);
        nVar.f(c5.l0.w(), aVar);
        nVar.c(i2Var, this.f16727l, this.f16716a);
    }

    public void y() {
        for (b bVar : this.f16723h.values()) {
            try {
                bVar.f16731a.m(bVar.f16732b);
            } catch (RuntimeException e10) {
                c5.s.d("MediaSourceList", "Failed to release child source.", e10);
            }
            bVar.f16731a.e(bVar.f16733c);
            bVar.f16731a.i(bVar.f16733c);
        }
        this.f16723h.clear();
        this.f16724i.clear();
        this.f16726k = false;
    }

    public void z(p pVar) {
        c cVar = (c) c5.a.e(this.f16718c.remove(pVar));
        cVar.f16734a.d(pVar);
        cVar.f16736c.remove(((m) pVar).f19141a);
        if (!this.f16718c.isEmpty()) {
            k();
        }
        u(cVar);
    }
}
