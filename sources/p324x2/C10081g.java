package p324x2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class C10081g extends AbstractC10078d {
    public final C10083i f32758j;

    public C10081g(boolean z, C10083i iVar) {
        this.f32744a = z;
        this.f32758j = iVar;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f32745b = iVar.m6065B0(allocate, 16L);
        this.f32746c = iVar.m6062E0(allocate, 28L);
        this.f32747d = iVar.m6062E0(allocate, 32L);
        this.f32748e = iVar.m6065B0(allocate, 42L);
        this.f32749f = iVar.m6065B0(allocate, 44L);
        this.f32750g = iVar.m6065B0(allocate, 46L);
        this.f32751h = iVar.m6065B0(allocate, 48L);
        this.f32752i = iVar.m6065B0(allocate, 50L);
    }

    @Override
    public AbstractC10077c mo6069a(long j, int i) {
        return new C10075a(this.f32758j, this, j, i);
    }

    @Override
    public AbstractC10079e mo6068b(long j) {
        return new C10084j(this.f32758j, this, j);
    }

    @Override
    public AbstractC10080f mo6067c(int i) {
        return new C10086l(this.f32758j, this, i);
    }
}
