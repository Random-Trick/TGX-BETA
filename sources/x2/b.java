package x2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class b extends c {
    public b(i iVar, d dVar, long j10, int i10) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(dVar.f25943a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = j10 + (i10 * 16);
        this.f25941a = iVar.C0(allocate, j11);
        this.f25942b = iVar.C0(allocate, j11 + 8);
    }
}
