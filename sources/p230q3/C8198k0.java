package p230q3;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p006a5.AbstractC0180y;
import p006a5.C0148h0;
import p006a5.C0157m;
import p006a5.C0159o;
import p020b5.C1186a;
import p020b5.C1216l0;
import p174m3.C6615i;
import p230q3.AbstractC8169f0;
import p358z6.AbstractC11401r;

public final class C8198k0 implements AbstractC8205m0 {
    public final AbstractC0180y.AbstractC0182b f26548a;
    public final String f26549b;
    public final boolean f26550c;
    public final Map<String, String> f26551d;

    public C8198k0(String str, boolean z, AbstractC0180y.AbstractC0182b bVar) {
        C1186a.m38189a(!z || !TextUtils.isEmpty(str));
        this.f26548a = bVar;
        this.f26549b = str;
        this.f26550c = z;
        this.f26551d = new HashMap();
    }

    public static byte[] m13224c(AbstractC0180y.AbstractC0182b bVar, String str, byte[] bArr, Map<String, String> map) {
        C0148h0 h0Var = new C0148h0(bVar.mo4407a());
        C0159o a = new C0159o.C0161b().m42192i(str).m42196e(map).m42197d(2).m42198c(bArr).m42199b(1).m42200a();
        int i = 0;
        C0159o oVar = a;
        while (true) {
            try {
                C0157m mVar = new C0157m(h0Var, oVar);
                try {
                    byte[] D0 = C1216l0.m38014D0(mVar);
                    C1216l0.m37962m(mVar);
                    return D0;
                } catch (AbstractC0180y.C0185e e) {
                    String d = m13223d(e, i);
                    if (d != null) {
                        i++;
                        oVar = oVar.m42204a().m42192i(d).m42200a();
                        C1216l0.m37962m(mVar);
                    } else {
                        throw e;
                    }
                }
            } catch (Exception e2) {
                throw new C8207n0(a, (Uri) C1186a.m38185e(h0Var.m42210t()), h0Var.mo17398l(), h0Var.m42211s(), e2);
            }
        }
    }

    public static String m13223d(AbstractC0180y.C0185e eVar, int i) {
        Map<String, List<String>> map;
        List<String> list;
        int i2 = eVar.f659M;
        if (((i2 == 307 || i2 == 308) && i < 5) && (map = eVar.f661O) != null && (list = map.get("Location")) != null && !list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public byte[] mo13210a(UUID uuid, AbstractC8169f0.C8170a aVar) {
        String str;
        String b = aVar.m13331b();
        if (this.f26550c || TextUtils.isEmpty(b)) {
            b = this.f26549b;
        }
        if (!TextUtils.isEmpty(b)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = C6615i.f20679e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else {
                str = C6615i.f20677c.equals(uuid) ? "application/json" : "application/octet-stream";
            }
            hashMap.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.f26551d) {
                hashMap.putAll(this.f26551d);
            }
            return m13224c(this.f26548a, b, aVar.m13332a(), hashMap);
        }
        throw new C8207n0(new C0159o.C0161b().m42193h(Uri.EMPTY).m42200a(), Uri.EMPTY, AbstractC11401r.m740j(), 0L, new IllegalStateException("No license URL"));
    }

    @Override
    public byte[] mo13209b(UUID uuid, AbstractC8169f0.C8173d dVar) {
        String b = dVar.m13329b();
        String A = C1216l0.m38021A(dVar.m13330a());
        StringBuilder sb2 = new StringBuilder(String.valueOf(b).length() + 15 + String.valueOf(A).length());
        sb2.append(b);
        sb2.append("&signedRequest=");
        sb2.append(A);
        return m13224c(this.f26548a, sb2.toString(), null, Collections.emptyMap());
    }

    public void m13222e(String str, String str2) {
        C1186a.m38185e(str);
        C1186a.m38185e(str2);
        synchronized (this.f26551d) {
            this.f26551d.put(str, str2);
        }
    }
}
