package p324x2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class C10081g extends AbstractC10078d {
    public final C10083i f32761j;

    public C10081g(boolean z, C10083i iVar) {
        this.f32747a = z;
        this.f32761j = iVar;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f32748b = iVar.m6065B0(allocate, 16L);
        this.f32749c = iVar.m6062E0(allocate, 28L);
        this.f32750d = iVar.m6062E0(allocate, 32L);
        this.f32751e = iVar.m6065B0(allocate, 42L);
        this.f32752f = iVar.m6065B0(allocate, 44L);
        this.f32753g = iVar.m6065B0(allocate, 46L);
        this.f32754h = iVar.m6065B0(allocate, 48L);
        this.f32755i = iVar.m6065B0(allocate, 50L);
    }

    @Override
    public AbstractC10077c mo6069a(long j, int i) {
        return new C10075a(this.f32761j, this, j, i);
    }

    @Override
    public AbstractC10079e mo6068b(long j) {
        return new C10084j(this.f32761j, this, j);
    }

    @Override
    public AbstractC10080f mo6067c(int i) {
        return new C10086l(this.f32761j, this, i);
    }
}
