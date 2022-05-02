package p324x2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class C10075a extends AbstractC10077c {
    public C10075a(C10083i iVar, AbstractC10078d dVar, long j, int i) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(dVar.f32744a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = j + (i * 8);
        this.f32742a = iVar.m6062E0(allocate, j2);
        this.f32743b = iVar.m6062E0(allocate, j2 + 4);
    }
}
