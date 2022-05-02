package p324x2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class C10087m extends AbstractC10080f {
    public C10087m(C10083i iVar, AbstractC10078d dVar, int i) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(dVar.f32747a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f32760a = iVar.m6062E0(allocate, dVar.f32750d + (i * dVar.f32753g) + 44);
    }
}
