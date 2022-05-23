package q3;

import a7.r;
import android.net.Uri;
import android.text.TextUtils;
import b5.h0;
import b5.m;
import b5.o;
import b5.y;
import c5.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import m3.i;
import q3.g0;

public final class l0 implements n0 {
    public final y.b f21338a;
    public final String f21339b;
    public final boolean f21340c;
    public final Map<String, String> f21341d;

    public l0(String str, boolean z10, y.b bVar) {
        a.a(!z10 || !TextUtils.isEmpty(str));
        this.f21338a = bVar;
        this.f21339b = str;
        this.f21340c = z10;
        this.f21341d = new HashMap();
    }

    public static byte[] c(y.b bVar, String str, byte[] bArr, Map<String, String> map) {
        h0 h0Var = new h0(bVar.a());
        o a10 = new o.b().i(str).e(map).d(2).c(bArr).b(1).a();
        int i10 = 0;
        o oVar = a10;
        while (true) {
            try {
                m mVar = new m(h0Var, oVar);
                try {
                    byte[] E0 = c5.l0.E0(mVar);
                    c5.l0.m(mVar);
                    return E0;
                } catch (y.e e10) {
                    String d10 = d(e10, i10);
                    if (d10 != null) {
                        i10++;
                        oVar = oVar.a().i(d10).a();
                        c5.l0.m(mVar);
                    } else {
                        throw e10;
                    }
                }
            } catch (Exception e11) {
                throw new o0(a10, (Uri) a.e(h0Var.t()), h0Var.l(), h0Var.s(), e11);
            }
        }
    }

    public static String d(y.e eVar, int i10) {
        Map<String, List<String>> map;
        List<String> list;
        int i11 = eVar.M;
        if (((i11 == 307 || i11 == 308) && i10 < 5) && (map = eVar.O) != null && (list = map.get("Location")) != null && !list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public byte[] a(UUID uuid, g0.a aVar) {
        String str;
        String b10 = aVar.b();
        if (this.f21340c || TextUtils.isEmpty(b10)) {
            b10 = this.f21339b;
        }
        if (!TextUtils.isEmpty(b10)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = i.f16680e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else {
                str = i.f16678c.equals(uuid) ? "application/json" : "application/octet-stream";
            }
            hashMap.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.f21341d) {
                hashMap.putAll(this.f21341d);
            }
            return c(this.f21338a, b10, aVar.a(), hashMap);
        }
        throw new o0(new o.b().h(Uri.EMPTY).a(), Uri.EMPTY, r.j(), 0L, new IllegalStateException("No license URL"));
    }

    @Override
    public byte[] b(UUID uuid, g0.d dVar) {
        String b10 = dVar.b();
        String A = c5.l0.A(dVar.a());
        StringBuilder sb2 = new StringBuilder(String.valueOf(b10).length() + 15 + String.valueOf(A).length());
        sb2.append(b10);
        sb2.append("&signedRequest=");
        sb2.append(A);
        return c(this.f21338a, sb2.toString(), null, Collections.emptyMap());
    }

    public void e(String str, String str2) {
        a.e(str);
        a.e(str2);
        synchronized (this.f21341d) {
            this.f21341d.put(str, str2);
        }
    }
}
