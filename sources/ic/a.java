package ic;

import hc.b;
import hc.e;
import ra.k;

public final class a {
    public static final byte[] f14178a = b.a("0123456789abcdef");

    public static final byte[] a() {
        return f14178a;
    }

    public static final String b(e eVar, long j10) {
        k.e(eVar, "$this$readUtf8Line");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (eVar.D0(j11) == ((byte) 13)) {
                String P0 = eVar.P0(j11);
                eVar.b0(2L);
                return P0;
            }
        }
        String P02 = eVar.P0(j10);
        eVar.b0(1L);
        return P02;
    }
}
