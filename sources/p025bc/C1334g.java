package p025bc;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p095gc.AbstractC4537a0;
import p095gc.AbstractC4572y;
import p278tb.C9069b0;
import p278tb.C9078d0;
import p278tb.C9122v;
import p278tb.C9132z;
import p278tb.EnumC9064a0;
import p290ub.C9489b;
import p348yb.C10486f;
import p362zb.AbstractC11463d;
import p362zb.C11464e;
import p362zb.C11466g;
import p362zb.C11468i;
import p362zb.C11471k;
import qa.C8294g;
import qa.C8298k;

public final class C1334g implements AbstractC11463d {
    public volatile C1340i f4869a;
    public final EnumC9064a0 f4870b;
    public volatile boolean f4871c;
    public final C10486f f4872d;
    public final C11466g f4873e;
    public final C1315f f4874f;
    public static final C1335a f4868i = new C1335a(null);
    public static final List<String> f4866g = C9489b.m8504t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List<String> f4867h = C9489b.m8504t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    public static final class C1335a {
        public C1335a() {
        }

        public final List<C1309c> m37673a(C9069b0 b0Var) {
            C8298k.m12934e(b0Var, "request");
            C9122v e = b0Var.m10563e();
            ArrayList arrayList = new ArrayList(e.size() + 4);
            arrayList.add(new C1309c(C1309c.f4724f, b0Var.m10561g()));
            arrayList.add(new C1309c(C1309c.f4725g, C11468i.f36441a.m524c(b0Var.m10559i())));
            String d = b0Var.m10564d("Host");
            if (d != null) {
                arrayList.add(new C1309c(C1309c.f4727i, d));
            }
            arrayList.add(new C1309c(C1309c.f4726h, b0Var.m10559i().m10339p()));
            int size = e.size();
            for (int i = 0; i < size; i++) {
                String i2 = e.m10372i(i);
                Locale locale = Locale.US;
                C8298k.m12935d(locale, "Locale.US");
                Objects.requireNonNull(i2, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = i2.toLowerCase(locale);
                C8298k.m12935d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (!C1334g.f4866g.contains(lowerCase) || (C8298k.m12937b(lowerCase, "te") && C8298k.m12937b(e.m10370r(i), "trailers"))) {
                    arrayList.add(new C1309c(lowerCase, e.m10370r(i)));
                }
            }
            return arrayList;
        }

        public final C9078d0.C9079a m37672b(C9122v vVar, EnumC9064a0 a0Var) {
            C8298k.m12934e(vVar, "headerBlock");
            C8298k.m12934e(a0Var, "protocol");
            C9122v.C9123a aVar = new C9122v.C9123a();
            int size = vVar.size();
            C11471k kVar = null;
            for (int i = 0; i < size; i++) {
                String i2 = vVar.m10372i(i);
                String r = vVar.m10370r(i);
                if (C8298k.m12937b(i2, ":status")) {
                    C11471k.C11472a aVar2 = C11471k.f36444d;
                    kVar = aVar2.m516a("HTTP/1.1 " + r);
                } else if (!C1334g.f4867h.contains(i2)) {
                    aVar.m10366c(i2, r);
                }
            }
            if (kVar != null) {
                return new C9078d0.C9079a().m10494p(a0Var).m10503g(kVar.f36446b).m10497m(kVar.f36447c).m10499k(aVar.m10365d());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        public C1335a(C8294g gVar) {
            this();
        }
    }

    public C1334g(C9132z zVar, C10486f fVar, C11466g gVar, C1315f fVar2) {
        C8298k.m12934e(zVar, "client");
        C8298k.m12934e(fVar, "connection");
        C8298k.m12934e(gVar, "chain");
        C8298k.m12934e(fVar2, "http2Connection");
        this.f4872d = fVar;
        this.f4873e = gVar;
        this.f4874f = fVar2;
        List<EnumC9064a0> x = zVar.m10266x();
        EnumC9064a0 a0Var = EnumC9064a0.H2_PRIOR_KNOWLEDGE;
        this.f4870b = !x.contains(a0Var) ? EnumC9064a0.HTTP_2 : a0Var;
    }

    @Override
    public long mo559a(C9078d0 d0Var) {
        C8298k.m12934e(d0Var, "response");
        if (!C11464e.m550b(d0Var)) {
            return 0L;
        }
        return C9489b.m8505s(d0Var);
    }

    @Override
    public AbstractC4572y mo558b(C9069b0 b0Var, long j) {
        C8298k.m12934e(b0Var, "request");
        C1340i iVar = this.f4869a;
        C8298k.m12936c(iVar);
        return iVar.m37620n();
    }

    @Override
    public AbstractC4537a0 mo557c(C9078d0 d0Var) {
        C8298k.m12934e(d0Var, "response");
        C1340i iVar = this.f4869a;
        C8298k.m12936c(iVar);
        return iVar.m37618p();
    }

    @Override
    public void cancel() {
        this.f4871c = true;
        C1340i iVar = this.f4869a;
        if (iVar != null) {
            iVar.m37628f(EnumC1307b.CANCEL);
        }
    }

    @Override
    public void mo556d() {
        C1340i iVar = this.f4869a;
        C8298k.m12936c(iVar);
        iVar.m37620n().close();
    }

    @Override
    public void mo555e(C9069b0 b0Var) {
        C8298k.m12934e(b0Var, "request");
        if (this.f4869a == null) {
            this.f4869a = this.f4874f.m37715d1(f4868i.m37673a(b0Var), b0Var.m10567a() != null);
            if (!this.f4871c) {
                C1340i iVar = this.f4869a;
                C8298k.m12936c(iVar);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                iVar.m37612v().mo27389g(this.f4873e.m532h(), timeUnit);
                C1340i iVar2 = this.f4869a;
                C8298k.m12936c(iVar2);
                iVar2.m37634E().mo27389g(this.f4873e.m530j(), timeUnit);
                return;
            }
            C1340i iVar3 = this.f4869a;
            C8298k.m12936c(iVar3);
            iVar3.m37628f(EnumC1307b.CANCEL);
            throw new IOException("Canceled");
        }
    }

    @Override
    public C9078d0.C9079a mo554f(boolean z) {
        C1340i iVar = this.f4869a;
        C8298k.m12936c(iVar);
        C9078d0.C9079a b = f4868i.m37672b(iVar.m37636C(), this.f4870b);
        if (!z || b.m10502h() != 100) {
            return b;
        }
        return null;
    }

    @Override
    public C10486f mo553g() {
        return this.f4872d;
    }

    @Override
    public void mo552h() {
        this.f4874f.flush();
    }
}
