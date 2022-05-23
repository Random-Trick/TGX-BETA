package g4;

import c5.a0;
import f4.a;
import f4.e;
import f4.h;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import z6.d;

public final class b extends h {
    public static a c(a0 a0Var) {
        a0Var.r(12);
        int d10 = (a0Var.d() + a0Var.h(12)) - 4;
        a0Var.r(44);
        a0Var.s(a0Var.h(12));
        a0Var.r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (a0Var.d() >= d10) {
                break;
            }
            a0Var.r(48);
            int h10 = a0Var.h(8);
            a0Var.r(4);
            int d11 = a0Var.d() + a0Var.h(12);
            String str2 = null;
            while (a0Var.d() < d11) {
                int h11 = a0Var.h(8);
                int h12 = a0Var.h(8);
                int d12 = a0Var.d() + h12;
                if (h11 == 2) {
                    int h13 = a0Var.h(16);
                    a0Var.r(8);
                    if (h13 != 3) {
                    }
                    while (a0Var.d() < d12) {
                        str = a0Var.l(a0Var.h(8), d.f27012a);
                        int h14 = a0Var.h(8);
                        for (int i10 = 0; i10 < h14; i10++) {
                            a0Var.s(a0Var.h(8));
                        }
                    }
                } else if (h11 == 21) {
                    str2 = a0Var.l(h12, d.f27012a);
                }
                a0Var.p(d12 * 8);
            }
            a0Var.p(d11 * 8);
            if (!(str == null || str2 == null)) {
                arrayList.add(new a(h10, str2.length() != 0 ? str.concat(str2) : new String(str)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new a(arrayList);
    }

    @Override
    public a b(e eVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return c(new a0(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
