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
    public final AbstractC0180y.AbstractC0182b f26551a;
    public final String f26552b;
    public final boolean f26553c;
    public final Map<String, String> f26554d;

    public C8198k0(String str, boolean z, AbstractC0180y.AbstractC0182b bVar) {
        C1186a.m38192a(!z || !TextUtils.isEmpty(str));
        this.f26551a = bVar;
        this.f26552b = str;
        this.f26553c = z;
        this.f26554d = new HashMap();
    }

    public static byte[] m13223c(AbstractC0180y.AbstractC0182b bVar, String str, byte[] bArr, Map<String, String> map) {
        C0148h0 h0Var = new C0148h0(bVar.mo4407a());
        C0159o a = new C0159o.C0161b().m42195i(str).m42199e(map).m42200d(2).m42201c(bArr).m42202b(1).m42203a();
        int i = 0;
        C0159o oVar = a;
        while (true) {
            try {
                C0157m mVar = new C0157m(h0Var, oVar);
                try {
                    byte[] D0 = C1216l0.m38017D0(mVar);
                    C1216l0.m37965m(mVar);
                    return D0;
                } catch (AbstractC0180y.C0185e e) {
                    String d = m13222d(e, i);
                    if (d != null) {
                        i++;
                        oVar = oVar.m42207a().m42195i(d).m42203a();
                        C1216l0.m37965m(mVar);
                    } else {
                        throw e;
                    }
                }
            } catch (Exception e2) {
                throw new C8207n0(a, (Uri) C1186a.m38188e(h0Var.m42213t()), h0Var.mo17398l(), h0Var.m42214s(), e2);
            }
        }
    }

    public static String m13222d(AbstractC0180y.C0185e eVar, int i) {
        Map<String, List<String>> map;
        List<String> list;
        int i2 = eVar.f659M;
        if (((i2 == 307 || i2 == 308) && i < 5) && (map = eVar.f661O) != null && (list = map.get("Location")) != null && !list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public byte[] mo13209a(UUID uuid, AbstractC8169f0.C8170a aVar) {
        String str;
        String b = aVar.m13330b();
        if (this.f26553c || TextUtils.isEmpty(b)) {
            b = this.f26552b;
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
            synchronized (this.f26554d) {
                hashMap.putAll(this.f26554d);
            }
            return m13223c(this.f26551a, b, aVar.m13331a(), hashMap);
        }
        throw new C8207n0(new C0159o.C0161b().m42196h(Uri.EMPTY).m42203a(), Uri.EMPTY, AbstractC11401r.m740j(), 0L, new IllegalStateException("No license URL"));
    }

    @Override
    public byte[] mo13208b(UUID uuid, AbstractC8169f0.C8173d dVar) {
        String b = dVar.m13328b();
        String A = C1216l0.m38024A(dVar.m13329a());
        StringBuilder sb2 = new StringBuilder(String.valueOf(b).length() + 15 + String.valueOf(A).length());
        sb2.append(b);
        sb2.append("&signedRequest=");
        sb2.append(A);
        return m13223c(this.f26551a, sb2.toString(), null, Collections.emptyMap());
    }

    public void m13221e(String str, String str2) {
        C1186a.m38188e(str);
        C1186a.m38188e(str2);
        synchronized (this.f26554d) {
            this.f26554d.put(str, str2);
        }
    }
}
