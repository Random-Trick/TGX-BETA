package p270t3;

import java.io.EOFException;
import p020b5.C1189b0;
import p073f4.C4260a;
import p147k4.C6066h;

public final class C8970p {
    public final C1189b0 f28856a = new C1189b0(10);

    public C4260a m10801a(AbstractC8959g gVar, C6066h.AbstractC6067a aVar) {
        C4260a aVar2 = null;
        int i = 0;
        while (true) {
            try {
                gVar.mo10806q(this.f28856a.m38139d(), 0, 10);
                this.f28856a.m38144P(0);
                if (this.f28856a.m38153G() != 4801587) {
                    break;
                }
                this.f28856a.m38143Q(3);
                int C = this.f28856a.m38157C();
                int i2 = C + 10;
                if (aVar2 == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f28856a.m38139d(), 0, bArr, 0, 10);
                    gVar.mo10806q(bArr, 10, C);
                    aVar2 = new C6066h(aVar).m21425e(bArr, i2);
                } else {
                    gVar.mo10812h(C);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        gVar.mo10809m();
        gVar.mo10812h(i);
        return aVar2;
    }
}
