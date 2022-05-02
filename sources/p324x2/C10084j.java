package p324x2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class C10084j extends AbstractC10079e {
    public C10084j(C10083i iVar, AbstractC10078d dVar, long j) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(dVar.f32744a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = dVar.f32746c + (j * dVar.f32748e);
        this.f32753a = iVar.m6062E0(allocate, j2);
        this.f32754b = iVar.m6062E0(allocate, 4 + j2);
        this.f32755c = iVar.m6062E0(allocate, 8 + j2);
        this.f32756d = iVar.m6062E0(allocate, j2 + 20);
    }
}
