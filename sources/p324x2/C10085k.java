package p324x2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class C10085k extends AbstractC10079e {
    public C10085k(C10083i iVar, AbstractC10078d dVar, long j) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(dVar.f32744a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = dVar.f32746c + (j * dVar.f32748e);
        this.f32753a = iVar.m6062E0(allocate, j2);
        this.f32754b = iVar.m6064C0(allocate, 8 + j2);
        this.f32755c = iVar.m6064C0(allocate, 16 + j2);
        this.f32756d = iVar.m6064C0(allocate, j2 + 40);
    }
}
