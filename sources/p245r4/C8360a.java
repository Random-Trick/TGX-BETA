package p245r4;

import java.util.List;
import p020b5.C1189b0;
import p217p4.AbstractC8039e;
import p217p4.AbstractC8041f;

public final class C8360a extends AbstractC8039e {
    public final C8361b f27077o;

    public C8360a(List<byte[]> list) {
        super("DvbDecoder");
        C1189b0 b0Var = new C1189b0(list.get(0));
        this.f27077o = new C8361b(b0Var.m38150J(), b0Var.m38150J());
    }

    @Override
    public AbstractC8041f mo5207B(byte[] bArr, int i, boolean z) {
        if (z) {
            this.f27077o.m12657r();
        }
        return new C8370c(this.f27077o.m12673b(bArr, i));
    }
}
