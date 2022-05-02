package p324x2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class C10076b extends AbstractC10077c {
    public C10076b(C10083i iVar, AbstractC10078d dVar, long j, int i) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(dVar.f32747a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = j + (i * 16);
        this.f32745a = iVar.m6064C0(allocate, j2);
        this.f32746b = iVar.m6064C0(allocate, j2 + 8);
    }
}
