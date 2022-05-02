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
    public final AbstractC9106p f36424a;

    public C11459a(AbstractC9106p pVar) {
        C8298k.m12933e(pVar, "cookieJar");
        this.f36424a = pVar;
    }

    @Override
    public C9078d0 mo523a(AbstractC9129x.AbstractC9130a aVar) {
        AbstractC9081e0 m;
        C8298k.m12933e(aVar, "chain");
        C9069b0 b = aVar.mo538b();
        C9069b0.C9070a h = b.m10559h();
        AbstractC9072c0 a = b.m10566a();
        if (a != null) {
            C9131y b2 = a.mo10545b();
            if (b2 != null) {
                h.m10556b("Content-Type", b2.toString());
            }
            long a2 = a.mo10546a();
            if (a2 != -1) {
                h.m10556b("Content-Length", String.valueOf(a2));
                h.m10553e("Transfer-Encoding");
            } else {
                h.m10556b("Transfer-Encoding", "chunked");
                h.m10553e("Content-Length");
            }
        }
        boolean z = false;
        if (b.m10563d("Host") == null) {
            h.m10556b("Host", C9489b.m8532M(b.m10558i(), false, 1, null));
        }
        if (b.m10563d("Connection") == null) {
            h.m10556b("Connection", "Keep-Alive");
        }
        if (b.m10563d("Accept-Encoding") == null && b.m10563d("Range") == null) {
            h.m10556b("Accept-Encoding", "gzip");
            z = true;
        }
        List<C9104o> a3 = this.f36424a.mo10420a(b.m10558i());
        if (!a3.isEmpty()) {
            h.m10556b("Cookie", m563b(a3));
        }
        if (b.m10563d("User-Agent") == null) {
            h.m10556b("User-Agent", "okhttp/4.9.3");
        }
        C9078d0 a4 = aVar.mo539a(h.m10557a());
        C11464e.m546f(this.f36424a, b.m10558i(), a4.m10522F0());
        C9078d0.C9079a r = a4.m10518J0().m10491r(b);
        if (z && C11451n.m633l("gzip", C9078d0.m10523E0(a4, "Content-Encoding", null, 2, null), true) && C11464e.m550b(a4) && (m = a4.m10512m()) != null) {
            C4557l lVar = new C4557l(m.mo527t());
            r.m10498k(a4.m10522F0().m10370m().m10362f("Content-Encoding").m10362f("Content-Length").m10364d());
            r.m10507b(new C11467h(C9078d0.m10523E0(a4, "Content-Type", null, 2, null), -1L, C4560o.m27380b(lVar)));
        }
        return r.m10506c();
    }

    public final String m563b(List<C9104o> list) {
        StringBuilder sb2 = new StringBuilder();
        int i = 0;
        for (Object obj : list) {
            i++;
            if (i < 0) {
                C5304n.m23359n();
            }
            C9104o oVar = (C9104o) obj;
            if (i > 0) {
                sb2.append("; ");
            }
            sb2.append(oVar.m10431e());
            sb2.append('=');
            sb2.append(oVar.m10429g());
        }
        String sb3 = sb2.toString();
        C8298k.m12934d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
