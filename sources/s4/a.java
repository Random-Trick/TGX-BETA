package s4;

import c5.b0;
import java.util.List;
import q4.e;
import q4.f;

public final class a extends e {
    public final b f22470o;

    public a(List<byte[]> list) {
        super("DvbDecoder");
        b0 b0Var = new b0(list.get(0));
        this.f22470o = new b(b0Var.J(), b0Var.J());
    }

    @Override
    public f B(byte[] bArr, int i10, boolean z10) {
        if (z10) {
            this.f22470o.r();
        }
        return new c(this.f22470o.b(bArr, i10));
    }
}
