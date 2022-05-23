package x2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class g extends d {
    public final i f25957j;

    public g(boolean z10, i iVar) {
        this.f25943a = z10;
        this.f25957j = iVar;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(z10 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f25944b = iVar.B0(allocate, 16L);
        this.f25945c = iVar.E0(allocate, 28L);
        this.f25946d = iVar.E0(allocate, 32L);
        this.f25947e = iVar.B0(allocate, 42L);
        this.f25948f = iVar.B0(allocate, 44L);
        this.f25949g = iVar.B0(allocate, 46L);
        this.f25950h = iVar.B0(allocate, 48L);
        this.f25951i = iVar.B0(allocate, 50L);
    }

    @Override
    public c a(long j10, int i10) {
        return new a(this.f25957j, this, j10, i10);
    }

    @Override
    public e b(long j10) {
        return new j(this.f25957j, this, j10);
    }

    @Override
    public f c(int i10) {
        return new l(this.f25957j, this, i10);
    }
}
