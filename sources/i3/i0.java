package i3;

import android.content.Context;
import d3.b;
import ha.a;

public final class i0 implements b<h0> {
    public final a<Context> f13961a;
    public final a<String> f13962b;
    public final a<Integer> f13963c;

    public i0(a<Context> aVar, a<String> aVar2, a<Integer> aVar3) {
        this.f13961a = aVar;
        this.f13962b = aVar2;
        this.f13963c = aVar3;
    }

    public static i0 a(a<Context> aVar, a<String> aVar2, a<Integer> aVar3) {
        return new i0(aVar, aVar2, aVar3);
    }

    public static h0 c(Context context, String str, int i10) {
        return new h0(context, str, i10);
    }

    public h0 get() {
        return c(this.f13961a.get(), this.f13962b.get(), this.f13963c.get().intValue());
    }
}
