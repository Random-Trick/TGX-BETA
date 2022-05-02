package p324x2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class C10086l extends AbstractC10080f {
    public C10086l(C10083i iVar, AbstractC10078d dVar, int i) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(dVar.f32744a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f32757a = iVar.m6062E0(allocate, dVar.f32747d + (i * dVar.f32750g) + 28);
    }
}
