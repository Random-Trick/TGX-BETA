package p324x2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class C10084j extends AbstractC10079e {
    public C10084j(C10083i iVar, AbstractC10078d dVar, long j) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(dVar.f32747a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = dVar.f32749c + (j * dVar.f32751e);
        this.f32756a = iVar.m6062E0(allocate, j2);
        this.f32757b = iVar.m6062E0(allocate, 4 + j2);
        this.f32758c = iVar.m6062E0(allocate, 8 + j2);
        this.f32759d = iVar.m6062E0(allocate, j2 + 20);
    }
}
