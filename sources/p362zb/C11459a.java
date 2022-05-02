package p362zb;

import java.util.List;
import p095gc.C4557l;
import p095gc.C4560o;
import p123ia.C5304n;
import p278tb.AbstractC9072c0;
import p278tb.AbstractC9081e0;
import p278tb.AbstractC9106p;
import p278tb.AbstractC9129x;
import p278tb.C9069b0;
import p278tb.C9078d0;
import p278tb.C9104o;
import p278tb.C9131y;
import p290ub.C9489b;
import qa.C8298k;
import za.C11451n;

public final class C11459a implements AbstractC9129x {
    public final AbstractC9106p f36421a;

    public C11459a(AbstractC9106p pVar) {
        C8298k.m12934e(pVar, "cookieJar");
        this.f36421a = pVar;
    }

    @Override
    public C9078d0 mo523a(AbstractC9129x.AbstractC9130a aVar) {
        AbstractC9081e0 m;
        C8298k.m12934e(aVar, "chain");
        C9069b0 b = aVar.mo538b();
        C9069b0.C9070a h = b.m10560h();
        AbstractC9072c0 a = b.m10567a();
        if (a != null) {
            C9131y b2 = a.mo10546b();
            if (b2 != null) {
                h.m10557b("Content-Type", b2.toString());
            }
            long a2 = a.mo10547a();
            if (a2 != -1) {
                h.m10557b("Content-Length", String.valueOf(a2));
                h.m10554e("Transfer-Encoding");
            } else {
                h.m10557b("Transfer-Encoding", "chunked");
                h.m10554e("Content-Length");
            }
        }
        boolean z = false;
        if (b.m10564d("Host") == null) {
            h.m10557b("Host", C9489b.m8532M(b.m10559i(), false, 1, null));
        }
        if (b.m10564d("Connection") == null) {
            h.m10557b("Connection", "Keep-Alive");
        }
        if (b.m10564d("Accept-Encoding") == null && b.m10564d("Range") == null) {
            h.m10557b("Accept-Encoding", "gzip");
            z = true;
        }
        List<C9104o> a3 = this.f36421a.mo10421a(b.m10559i());
        if (!a3.isEmpty()) {
            h.m10557b("Cookie", m563b(a3));
        }
        if (b.m10564d("User-Agent") == null) {
            h.m10557b("User-Agent", "okhttp/4.9.3");
        }
        C9078d0 a4 = aVar.mo539a(h.m10558a());
        C11464e.m546f(this.f36421a, b.m10559i(), a4.m10523F0());
        C9078d0.C9079a r = a4.m10519J0().m10492r(b);
        if (z && C11451n.m633l("gzip", C9078d0.m10524E0(a4, "Content-Encoding", null, 2, null), true) && C11464e.m550b(a4) && (m = a4.m10513m()) != null) {
            C4557l lVar = new C4557l(m.mo527t());
            r.m10499k(a4.m10523F0().m10371m().m10363f("Content-Encoding").m10363f("Content-Length").m10365d());
            r.m10508b(new C11467h(C9078d0.m10524E0(a4, "Content-Type", null, 2, null), -1L, C4560o.m27378b(lVar)));
        }
        return r.m10507c();
    }

    public final String m563b(List<C9104o> list) {
        StringBuilder sb2 = new StringBuilder();
        int i = 0;
        for (Object obj : list) {
            i++;
            if (i < 0) {
                C5304n.m23358n();
            }
            C9104o oVar = (C9104o) obj;
            if (i > 0) {
                sb2.append("; ");
            }
            sb2.append(oVar.m10432e());
            sb2.append('=');
            sb2.append(oVar.m10430g());
        }
        String sb3 = sb2.toString();
        C8298k.m12935d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
