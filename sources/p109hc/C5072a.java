package p109hc;

import p095gc.C4538b;
import p095gc.C4549e;
import qa.C8298k;

public final class C5072a {
    public static final byte[] f17085a = C4538b.m27479a("0123456789abcdef");

    public static final byte[] m24042a() {
        return f17085a;
    }

    public static final String m24041b(C4549e eVar, long j) {
        C8298k.m12934e(eVar, "$this$readUtf8Line");
        if (j > 0) {
            long j2 = j - 1;
            if (eVar.m27444D0(j2) == ((byte) 13)) {
                String P0 = eVar.m27432P0(j2);
                eVar.mo27335a0(2L);
                return P0;
            }
        }
        String P02 = eVar.m27432P0(j);
        eVar.mo27335a0(1L);
        return P02;
    }
}
