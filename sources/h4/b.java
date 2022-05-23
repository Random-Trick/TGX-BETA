package h4;

import c5.b0;
import f4.a;
import f4.e;
import f4.h;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class b extends h {
    @Override
    public a b(e eVar, ByteBuffer byteBuffer) {
        return new a(c(new b0(byteBuffer.array(), byteBuffer.limit())));
    }

    public a c(b0 b0Var) {
        return new a((String) c5.a.e(b0Var.x()), (String) c5.a.e(b0Var.x()), b0Var.w(), b0Var.w(), Arrays.copyOfRange(b0Var.d(), b0Var.e(), b0Var.f()));
    }
}
