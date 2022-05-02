package p089g4;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import p020b5.C1187a0;
import p073f4.AbstractC4270h;
import p073f4.C4260a;
import p073f4.C4267e;
import p343y6.C10428d;

public final class C4474b extends AbstractC4270h {
    public static C4260a m27545c(C1187a0 a0Var) {
        a0Var.m38166r(12);
        int d = (a0Var.m38180d() + a0Var.m38176h(12)) - 4;
        a0Var.m38166r(44);
        a0Var.m38165s(a0Var.m38176h(12));
        a0Var.m38166r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (a0Var.m38180d() >= d) {
                break;
            }
            a0Var.m38166r(48);
            int h = a0Var.m38176h(8);
            a0Var.m38166r(4);
            int d2 = a0Var.m38180d() + a0Var.m38176h(12);
            String str2 = null;
            while (a0Var.m38180d() < d2) {
                int h2 = a0Var.m38176h(8);
                int h3 = a0Var.m38176h(8);
                int d3 = a0Var.m38180d() + h3;
                if (h2 == 2) {
                    int h4 = a0Var.m38176h(16);
                    a0Var.m38166r(8);
                    if (h4 != 3) {
                    }
                    while (a0Var.m38180d() < d3) {
                        str = a0Var.m38172l(a0Var.m38176h(8), C10428d.f33499a);
                        int h5 = a0Var.m38176h(8);
                        for (int i = 0; i < h5; i++) {
                            a0Var.m38165s(a0Var.m38176h(8));
                        }
                    }
                } else if (h2 == 21) {
                    str2 = a0Var.m38172l(h3, C10428d.f33499a);
                }
                a0Var.m38168p(d3 * 8);
            }
            a0Var.m38168p(d2 * 8);
            if (!(str == null || str2 == null)) {
                arrayList.add(new C4472a(h, str2.length() != 0 ? str.concat(str2) : new String(str)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C4260a(arrayList);
    }

    @Override
    public C4260a mo19176b(C4267e eVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return m27545c(new C1187a0(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
