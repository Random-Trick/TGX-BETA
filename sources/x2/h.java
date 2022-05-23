package x2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class h extends d {
    public final i f25958j;

    public h(boolean z10, i iVar) {
        this.f25943a = z10;
        this.f25958j = iVar;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(z10 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f25944b = iVar.B0(allocate, 16L);
        this.f25945c = iVar.C0(allocate, 32L);
        this.f25946d = iVar.C0(allocate, 40L);
        this.f25947e = iVar.B0(allocate, 54L);
        this.f25948f = iVar.B0(allocate, 56L);
        this.f25949g = iVar.B0(allocate, 58L);
        this.f25950h = iVar.B0(allocate, 60L);
        this.f25951i = iVar.B0(allocate, 62L);
    }

    @Override
    public c a(long j10, int i10) {
        return new b(this.f25958j, this, j10, i10);
    }

    @Override
    public e b(long j10) {
        return new k(this.f25958j, this, j10);
    }

    @Override
    public f c(int i10) {
        return new m(this.f25958j, this, i10);
    }
}
