package p101h4;

import java.nio.ByteBuffer;
import java.util.Arrays;
import p020b5.C1186a;
import p020b5.C1189b0;
import p073f4.AbstractC4270h;
import p073f4.C4260a;
import p073f4.C4267e;

public final class C4953b extends AbstractC4270h {
    @Override
    public C4260a mo19175b(C4267e eVar, ByteBuffer byteBuffer) {
        return new C4260a(m24388c(new C1189b0(byteBuffer.array(), byteBuffer.limit())));
    }

    public C4951a m24388c(C1189b0 b0Var) {
        return new C4951a((String) C1186a.m38185e(b0Var.m38119x()), (String) C1186a.m38185e(b0Var.m38119x()), b0Var.m38120w(), b0Var.m38120w(), Arrays.copyOfRange(b0Var.m38139d(), b0Var.m38138e(), b0Var.m38137f()));
    }
}
