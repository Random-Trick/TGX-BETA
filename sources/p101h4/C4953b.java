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
    public C4260a mo19176b(C4267e eVar, ByteBuffer byteBuffer) {
        return new C4260a(m24389c(new C1189b0(byteBuffer.array(), byteBuffer.limit())));
    }

    public C4951a m24389c(C1189b0 b0Var) {
        return new C4951a((String) C1186a.m38188e(b0Var.m38122x()), (String) C1186a.m38188e(b0Var.m38122x()), b0Var.m38123w(), b0Var.m38123w(), Arrays.copyOfRange(b0Var.m38142d(), b0Var.m38141e(), b0Var.m38140f()));
    }
}
