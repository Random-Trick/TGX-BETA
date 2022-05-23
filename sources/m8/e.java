package m8;

import h8.f;
import java.util.Map;
import k8.a;
import k8.c;
import k8.d;

public final class e {
    public final c f17312a = new c(a.f15723l);

    public final void a(byte[] bArr, int i10) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        try {
            this.f17312a.a(iArr, bArr.length - i10);
            for (int i12 = 0; i12 < i10; i12++) {
                bArr[i12] = (byte) iArr[i12];
            }
        } catch (d unused) {
            throw h8.d.a();
        }
    }

    public i8.d b(i8.a aVar, Map<h8.e, ?> map) {
        h8.d e10;
        a aVar2 = new a(aVar);
        f e11 = null;
        try {
            return c(aVar2, map);
        } catch (h8.d e12) {
            e10 = e12;
            try {
                aVar2.f();
                aVar2.g(true);
                aVar2.e();
                aVar2.d();
                aVar2.b();
                i8.d c10 = c(aVar2, map);
                c10.i(new i(true));
                return c10;
            } catch (h8.d | f unused) {
                if (e11 != null) {
                    throw e11;
                }
                throw e10;
            }
        } catch (f e13) {
            e11 = e13;
            e10 = null;
            aVar2.f();
            aVar2.g(true);
            aVar2.e();
            aVar2.d();
            aVar2.b();
            i8.d c102 = c(aVar2, map);
            c102.i(new i(true));
            return c102;
        }
    }

    public final i8.d c(a aVar, Map<h8.e, ?> map) {
        j e10 = aVar.e();
        f d10 = aVar.d().d();
        b[] b10 = b.b(aVar.c(), e10, d10);
        int i10 = 0;
        for (b bVar : b10) {
            i10 += bVar.c();
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (b bVar2 : b10) {
            byte[] a10 = bVar2.a();
            int c10 = bVar2.c();
            a(a10, c10);
            for (int i12 = 0; i12 < c10; i12++) {
                i11++;
                bArr[i11] = a10[i12];
            }
        }
        return d.a(bArr, e10, d10, map);
    }
}
