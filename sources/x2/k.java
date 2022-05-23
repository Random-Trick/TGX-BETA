package x2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class k extends e {
    public k(i iVar, d dVar, long j10) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(dVar.f25943a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = dVar.f25945c + (j10 * dVar.f25947e);
        this.f25952a = iVar.E0(allocate, j11);
        this.f25953b = iVar.C0(allocate, 8 + j11);
        this.f25954c = iVar.C0(allocate, 16 + j11);
        this.f25955d = iVar.C0(allocate, j11 + 40);
    }
}
