package c3;

import android.content.Context;
import d3.b;
import ha.a;

public final class j implements b<i> {
    public final a<Context> f4415a;
    public final a<k3.a> f4416b;
    public final a<k3.a> f4417c;

    public j(a<Context> aVar, a<k3.a> aVar2, a<k3.a> aVar3) {
        this.f4415a = aVar;
        this.f4416b = aVar2;
        this.f4417c = aVar3;
    }

    public static j a(a<Context> aVar, a<k3.a> aVar2, a<k3.a> aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(Context context, k3.a aVar, k3.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    public i get() {
        return c(this.f4415a.get(), this.f4416b.get(), this.f4417c.get());
    }
}
