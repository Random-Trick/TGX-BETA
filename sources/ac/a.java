package ac;

import ab.n;
import hc.l;
import java.util.List;
import ra.k;
import ub.b0;
import ub.c0;
import ub.d0;
import ub.e0;
import ub.o;
import ub.p;
import ub.x;
import ub.y;
import vb.b;

public final class a implements x {
    public final p f717a;

    public a(p pVar) {
        k.e(pVar, "cookieJar");
        this.f717a = pVar;
    }

    @Override
    public d0 a(x.a aVar) {
        e0 m10;
        k.e(aVar, "chain");
        b0 b10 = aVar.b();
        b0.a h10 = b10.h();
        c0 a10 = b10.a();
        if (a10 != null) {
            y b11 = a10.b();
            if (b11 != null) {
                h10.b("Content-Type", b11.toString());
            }
            long a11 = a10.a();
            if (a11 != -1) {
                h10.b("Content-Length", String.valueOf(a11));
                h10.e("Transfer-Encoding");
            } else {
                h10.b("Transfer-Encoding", "chunked");
                h10.e("Content-Length");
            }
        }
        boolean z10 = false;
        if (b10.d("Host") == null) {
            h10.b("Host", b.M(b10.i(), false, 1, null));
        }
        if (b10.d("Connection") == null) {
            h10.b("Connection", "Keep-Alive");
        }
        if (b10.d("Accept-Encoding") == null && b10.d("Range") == null) {
            h10.b("Accept-Encoding", "gzip");
            z10 = true;
        }
        List<o> a12 = this.f717a.a(b10.i());
        if (!a12.isEmpty()) {
            h10.b("Cookie", b(a12));
        }
        if (b10.d("User-Agent") == null) {
            h10.b("User-Agent", "okhttp/4.9.3");
        }
        d0 a13 = aVar.a(h10.a());
        e.f(this.f717a, b10.i(), a13.F0());
        d0.a r10 = a13.J0().r(b10);
        if (z10 && n.l("gzip", d0.E0(a13, "Content-Encoding", null, 2, null), true) && e.b(a13) && (m10 = a13.m()) != null) {
            l lVar = new l(m10.s());
            r10.k(a13.F0().m().f("Content-Encoding").f("Content-Length").d());
            r10.b(new h(d0.E0(a13, "Content-Type", null, 2, null), -1L, hc.o.b(lVar)));
        }
        return r10.c();
    }

    public final String b(List<o> list) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (Object obj : list) {
            i10++;
            if (i10 < 0) {
                ja.n.n();
            }
            o oVar = (o) obj;
            if (i10 > 0) {
                sb2.append("; ");
            }
            sb2.append(oVar.e());
            sb2.append('=');
            sb2.append(oVar.g());
        }
        String sb3 = sb2.toString();
        k.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
