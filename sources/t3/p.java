package t3;

import c5.b0;
import f4.a;
import java.io.EOFException;
import k4.h;

public final class p {
    public final b0 f22898a = new b0(10);

    public a a(g gVar, h.a aVar) {
        a aVar2 = null;
        int i10 = 0;
        while (true) {
            try {
                gVar.q(this.f22898a.d(), 0, 10);
                this.f22898a.P(0);
                if (this.f22898a.G() != 4801587) {
                    break;
                }
                this.f22898a.Q(3);
                int C = this.f22898a.C();
                int i11 = C + 10;
                if (aVar2 == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f22898a.d(), 0, bArr, 0, 10);
                    gVar.q(bArr, 10, C);
                    aVar2 = new h(aVar).e(bArr, i11);
                } else {
                    gVar.g(C);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        gVar.m();
        gVar.g(i10);
        return aVar2;
    }
}
