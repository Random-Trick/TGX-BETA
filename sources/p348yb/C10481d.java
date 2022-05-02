package p348yb;

import java.io.IOException;
import p025bc.C1306a;
import p025bc.C1354n;
import p025bc.EnumC1307b;
import p278tb.AbstractC9114t;
import p278tb.C9063a;
import p278tb.C9085f0;
import p278tb.C9125w;
import p278tb.C9132z;
import p290ub.C9489b;
import p348yb.C10496k;
import p351z.C11183e;
import p362zb.AbstractC11463d;
import p362zb.C11466g;
import qa.C8298k;

public final class C10481d {
    public C10496k.C10498b f33580a;
    public C10496k f33581b;
    public int f33582c;
    public int f33583d;
    public int f33584e;
    public C9085f0 f33585f;
    public final C10491h f33586g;
    public final C9063a f33587h;
    public final C10482e f33588i;
    public final AbstractC9114t f33589j;

    public C10481d(C10491h hVar, C9063a aVar, C10482e eVar, AbstractC9114t tVar) {
        C8298k.m12934e(hVar, "connectionPool");
        C8298k.m12934e(aVar, "address");
        C8298k.m12934e(eVar, "call");
        C8298k.m12934e(tVar, "eventListener");
        this.f33586g = hVar;
        this.f33587h = aVar;
        this.f33588i = eVar;
        this.f33589j = tVar;
    }

    public final AbstractC11463d m5026a(C9132z zVar, C11466g gVar) {
        C8298k.m12934e(zVar, "client");
        C8298k.m12934e(gVar, "chain");
        try {
            return m5024c(gVar.m534f(), gVar.m532h(), gVar.m530j(), zVar.m10267w(), zVar.m10292C(), !C8298k.m12937b(gVar.m531i().m10561g(), "GET")).m4954w(zVar, gVar);
        } catch (IOException e) {
            m5019h(e);
            throw new C10495j(e);
        } catch (C10495j e2) {
            m5019h(e2.m4937c());
            throw e2;
        }
    }

    public final p348yb.C10486f m5025b(int r15, int r16, int r17, int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: p348yb.C10481d.m5025b(int, int, int, int, boolean):yb.f");
    }

    public final C10486f m5024c(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        while (true) {
            C10486f b = m5025b(i, i2, i3, i4, z);
            if (b.m4956u(z2)) {
                return b;
            }
            b.m4952y();
            if (this.f33585f == null) {
                C10496k.C10498b bVar = this.f33580a;
                boolean z3 = true;
                if (!(bVar != null ? bVar.m4927b() : true)) {
                    C10496k kVar = this.f33581b;
                    if (kVar != null) {
                        z3 = kVar.m4935b();
                    }
                    if (!z3) {
                        throw new IOException("exhausted all routes");
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public final C9063a m5023d() {
        return this.f33587h;
    }

    public final boolean m5022e() {
        C10496k kVar;
        if (this.f33582c == 0 && this.f33583d == 0 && this.f33584e == 0) {
            return false;
        }
        if (this.f33585f != null) {
            return true;
        }
        C9085f0 f = m5021f();
        if (f != null) {
            this.f33585f = f;
            return true;
        }
        C10496k.C10498b bVar = this.f33580a;
        if ((bVar == null || !bVar.m4927b()) && (kVar = this.f33581b) != null) {
            return kVar.m4935b();
        }
        return true;
    }

    public final C9085f0 m5021f() {
        C10486f k;
        if (this.f33582c > 1 || this.f33583d > 1 || this.f33584e > 0 || (k = this.f33588i.m5006k()) == null) {
            return null;
        }
        synchronized (k) {
            if (k.m4960q() != 0) {
                return null;
            }
            if (!C9489b.m8517g(k.m4951z().m10485a().m10570l(), this.f33587h.m10570l())) {
                return null;
            }
            return k.m4951z();
        }
    }

    public final boolean m5020g(C9125w wVar) {
        C8298k.m12934e(wVar, "url");
        C9125w l = this.f33587h.m10570l();
        return wVar.m10343l() == l.m10343l() && C8298k.m12937b(wVar.m10347h(), l.m10347h());
    }

    public final void m5019h(IOException iOException) {
        C8298k.m12934e(iOException, C11183e.f35834c);
        this.f33585f = null;
        if ((iOException instanceof C1354n) && ((C1354n) iOException).f4935a == EnumC1307b.REFUSED_STREAM) {
            this.f33582c++;
        } else if (iOException instanceof C1306a) {
            this.f33583d++;
        } else {
            this.f33584e++;
        }
    }
}
