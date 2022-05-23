package x2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class a extends c {
    public a(i iVar, d dVar, long j10, int i10) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(dVar.f25943a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = j10 + (i10 * 8);
        this.f25941a = iVar.E0(allocate, j11);
        this.f25942b = iVar.E0(allocate, j11 + 4);
    }
}
