package p166l8;

import java.util.Map;
import p093g8.C4521d;
import p093g8.C4523f;
import p093g8.EnumC4522e;
import p105h8.C5022a;
import p105h8.C5025d;
import p136j8.C5897a;
import p136j8.C5899c;
import p136j8.C5900d;

public final class C6421e {
    public final C5899c f20083a = new C5899c(C5897a.f18787l);

    public final void m20436a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f20083a.m21872a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (C5900d unused) {
            throw C4521d.m27500a();
        }
    }

    public C5025d m20435b(C5022a aVar, Map<EnumC4522e, ?> map) {
        C4521d e;
        C6408a aVar2 = new C6408a(aVar);
        C4523f e2 = null;
        try {
            return m20434c(aVar2, map);
        } catch (C4521d e3) {
            e = e3;
            try {
                aVar2.m20451f();
                aVar2.m20450g(true);
                aVar2.m20452e();
                aVar2.m20453d();
                aVar2.m20455b();
                C5025d c = m20434c(aVar2, map);
                c.m24262i(new C6425i(true));
                return c;
            } catch (C4521d | C4523f unused) {
                if (e2 != null) {
                    throw e2;
                }
                throw e;
            }
        } catch (C4523f e4) {
            e2 = e4;
            e = null;
            aVar2.m20451f();
            aVar2.m20450g(true);
            aVar2.m20452e();
            aVar2.m20453d();
            aVar2.m20455b();
            C5025d c2 = m20434c(aVar2, map);
            c2.m24262i(new C6425i(true));
            return c2;
        }
    }

    public final C5025d m20434c(C6408a aVar, Map<EnumC4522e, ?> map) {
        C6426j e = aVar.m20452e();
        EnumC6422f d = aVar.m20453d().m20429d();
        C6409b[] b = C6409b.m20448b(aVar.m20454c(), e, d);
        int i = 0;
        for (C6409b bVar : b) {
            i += bVar.m20447c();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (C6409b bVar2 : b) {
            byte[] a = bVar2.m20449a();
            int c = bVar2.m20447c();
            m20436a(a, c);
            for (int i3 = 0; i3 < c; i3++) {
                i2++;
                bArr[i2] = a[i3];
            }
        }
        return C6419d.m20444a(bArr, e, d, map);
    }
}
