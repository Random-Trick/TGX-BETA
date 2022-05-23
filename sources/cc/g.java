package cc;

import ac.d;
import ac.e;
import ac.i;
import ac.k;
import hc.y;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import ra.k;
import ub.a0;
import ub.b0;
import ub.d0;
import ub.v;
import ub.z;
import vb.b;
import zb.f;

public final class g implements d {
    public volatile i f5164a;
    public final a0 f5165b;
    public volatile boolean f5166c;
    public final f f5167d;
    public final ac.g f5168e;
    public final f f5169f;
    public static final a f5163i = new a(null);
    public static final List<String> f5161g = b.t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List<String> f5162h = b.t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    public static final class a {
        public a() {
        }

        public a(ra.g gVar) {
            this();
        }

        public final List<c> a(b0 b0Var) {
            k.e(b0Var, "request");
            v e10 = b0Var.e();
            ArrayList arrayList = new ArrayList(e10.size() + 4);
            arrayList.add(new c(c.f5033f, b0Var.g()));
            arrayList.add(new c(c.f5034g, i.f736a.c(b0Var.i())));
            String d10 = b0Var.d("Host");
            if (d10 != null) {
                arrayList.add(new c(c.f5036i, d10));
            }
            arrayList.add(new c(c.f5035h, b0Var.i().p()));
            int size = e10.size();
            for (int i10 = 0; i10 < size; i10++) {
                String g10 = e10.g(i10);
                Locale locale = Locale.US;
                k.d(locale, "Locale.US");
                Objects.requireNonNull(g10, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = g10.toLowerCase(locale);
                k.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (!g.f5161g.contains(lowerCase) || (k.b(lowerCase, "te") && k.b(e10.r(i10), "trailers"))) {
                    arrayList.add(new c(lowerCase, e10.r(i10)));
                }
            }
            return arrayList;
        }

        public final d0.a b(v vVar, a0 a0Var) {
            k.e(vVar, "headerBlock");
            k.e(a0Var, "protocol");
            v.a aVar = new v.a();
            int size = vVar.size();
            ac.k kVar = null;
            for (int i10 = 0; i10 < size; i10++) {
                String g10 = vVar.g(i10);
                String r10 = vVar.r(i10);
                if (k.b(g10, ":status")) {
                    k.a aVar2 = ac.k.f739d;
                    kVar = aVar2.a("HTTP/1.1 " + r10);
                } else if (!g.f5162h.contains(g10)) {
                    aVar.c(g10, r10);
                }
            }
            if (kVar != null) {
                return new d0.a().p(a0Var).g(kVar.f741b).m(kVar.f742c).k(aVar.d());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
    }

    public g(z zVar, f fVar, ac.g gVar, f fVar2) {
        ra.k.e(zVar, "client");
        ra.k.e(fVar, "connection");
        ra.k.e(gVar, "chain");
        ra.k.e(fVar2, "http2Connection");
        this.f5167d = fVar;
        this.f5168e = gVar;
        this.f5169f = fVar2;
        List<a0> x10 = zVar.x();
        a0 a0Var = a0.H2_PRIOR_KNOWLEDGE;
        this.f5165b = !x10.contains(a0Var) ? a0.HTTP_2 : a0Var;
    }

    @Override
    public void a() {
        i iVar = this.f5164a;
        ra.k.c(iVar);
        iVar.n().close();
    }

    @Override
    public long b(d0 d0Var) {
        ra.k.e(d0Var, "response");
        if (!e.b(d0Var)) {
            return 0L;
        }
        return b.s(d0Var);
    }

    @Override
    public hc.a0 c(d0 d0Var) {
        ra.k.e(d0Var, "response");
        i iVar = this.f5164a;
        ra.k.c(iVar);
        return iVar.p();
    }

    @Override
    public void cancel() {
        this.f5166c = true;
        i iVar = this.f5164a;
        if (iVar != null) {
            iVar.f(b.CANCEL);
        }
    }

    @Override
    public d0.a d(boolean z10) {
        i iVar = this.f5164a;
        ra.k.c(iVar);
        d0.a b10 = f5163i.b(iVar.C(), this.f5165b);
        if (!z10 || b10.h() != 100) {
            return b10;
        }
        return null;
    }

    @Override
    public f e() {
        return this.f5167d;
    }

    @Override
    public void f() {
        this.f5169f.flush();
    }

    @Override
    public y g(b0 b0Var, long j10) {
        ra.k.e(b0Var, "request");
        i iVar = this.f5164a;
        ra.k.c(iVar);
        return iVar.n();
    }

    @Override
    public void h(b0 b0Var) {
        ra.k.e(b0Var, "request");
        if (this.f5164a == null) {
            this.f5164a = this.f5169f.d1(f5163i.a(b0Var), b0Var.a() != null);
            if (!this.f5166c) {
                i iVar = this.f5164a;
                ra.k.c(iVar);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                iVar.v().g(this.f5168e.h(), timeUnit);
                i iVar2 = this.f5164a;
                ra.k.c(iVar2);
                iVar2.E().g(this.f5168e.j(), timeUnit);
                return;
            }
            i iVar3 = this.f5164a;
            ra.k.c(iVar3);
            iVar3.f(b.CANCEL);
            throw new IOException("Canceled");
        }
    }
}
