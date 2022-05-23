package x2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class l extends f {
    public l(i iVar, d dVar, int i10) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(dVar.f25943a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f25956a = iVar.E0(allocate, dVar.f25946d + (i10 * dVar.f25949g) + 28);
    }
}
