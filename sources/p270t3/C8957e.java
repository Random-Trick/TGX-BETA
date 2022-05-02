package p270t3;

import java.io.EOFException;
import org.thunderdog.challegram.Log;
import p006a5.AbstractC0147h;
import p020b5.C1189b0;
import p174m3.C6600g1;
import p270t3.AbstractC8974t;

public final class C8957e implements AbstractC8974t {
    public final byte[] f28847a = new byte[Log.TAG_EMOJI];

    @Override
    public void mo10798a(C6600g1 g1Var) {
    }

    @Override
    public void mo10797b(C1189b0 b0Var, int i, int i2) {
        b0Var.m38143Q(i);
    }

    @Override
    public void mo10796c(C1189b0 b0Var, int i) {
        C8973s.m10799b(this, b0Var, i);
    }

    @Override
    public int mo10795d(AbstractC0147h hVar, int i, boolean z) {
        return C8973s.m10800a(this, hVar, i, z);
    }

    @Override
    public void mo10794e(long j, int i, int i2, int i3, AbstractC8974t.C8975a aVar) {
    }

    @Override
    public int mo10793f(AbstractC0147h hVar, int i, boolean z, int i2) {
        int b = hVar.mo4414b(this.f28847a, 0, Math.min(this.f28847a.length, i));
        if (b != -1) {
            return b;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }
}
