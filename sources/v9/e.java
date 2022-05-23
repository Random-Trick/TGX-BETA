package v9;

import ia.q;
import ja.m;
import ra.k;
import v9.d;

public final class e {
    public static final <CurrData, CurrChannel extends b, NewData, NewChannel extends b> d.a<NewData, NewChannel> a(j<q, b, CurrData, CurrChannel> jVar, j<CurrData, CurrChannel, NewData, NewChannel> jVar2) {
        k.e(jVar, "$this$plus");
        k.e(jVar2, "other");
        return new d.a(m.b(jVar)).b(jVar2);
    }
}
