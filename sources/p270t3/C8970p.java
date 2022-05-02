package p270t3;

import java.io.EOFException;
import p020b5.C1189b0;
import p073f4.C4260a;
import p147k4.C6066h;

public final class C8970p {
    public final C1189b0 f28859a = new C1189b0(10);

    public C4260a m10800a(AbstractC8959g gVar, C6066h.AbstractC6067a aVar) {
        C4260a aVar2 = null;
        int i = 0;
        while (true) {
            try {
                gVar.mo10805q(this.f28859a.m38142d(), 0, 10);
                this.f28859a.m38147P(0);
                if (this.f28859a.m38156G() != 4801587) {
                    break;
                }
                this.f28859a.m38146Q(3);
                int C = this.f28859a.m38160C();
                int i2 = C + 10;
                if (aVar2 == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f28859a.m38142d(), 0, bArr, 0, 10);
                    gVar.mo10805q(bArr, 10, C);
                    aVar2 = new C6066h(aVar).m21426e(bArr, i2);
                } else {
                    gVar.mo10811h(C);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        gVar.mo10808m();
        gVar.mo10811h(i);
        return aVar2;
    }
}
