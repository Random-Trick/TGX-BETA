package p324x2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class C10082h extends AbstractC10078d {
    public final C10083i f32759j;

    public C10082h(boolean z, C10083i iVar) {
        this.f32744a = z;
        this.f32759j = iVar;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f32745b = iVar.m6065B0(allocate, 16L);
        this.f32746c = iVar.m6064C0(allocate, 32L);
        this.f32747d = iVar.m6064C0(allocate, 40L);
        this.f32748e = iVar.m6065B0(allocate, 54L);
        this.f32749f = iVar.m6065B0(allocate, 56L);
        this.f32750g = iVar.m6065B0(allocate, 58L);
        this.f32751h = iVar.m6065B0(allocate, 60L);
        this.f32752i = iVar.m6065B0(allocate, 62L);
    }

    @Override
    public AbstractC10077c mo6069a(long j, int i) {
        return new C10076b(this.f32759j, this, j, i);
    }

    @Override
    public AbstractC10079e mo6068b(long j) {
        return new C10085k(this.f32759j, this, j);
    }

    @Override
    public AbstractC10080f mo6067c(int i) {
        return new C10087m(this.f32759j, this, i);
    }
}
