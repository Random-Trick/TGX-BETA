package c3;

import android.content.Context;
import d3.b;
import ha.a;

public final class l implements b<k> {
    public final a<Context> f4423a;
    public final a<i> f4424b;

    public l(a<Context> aVar, a<i> aVar2) {
        this.f4423a = aVar;
        this.f4424b = aVar2;
    }

    public static l a(a<Context> aVar, a<i> aVar2) {
        return new l(aVar, aVar2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    public k get() {
        return c(this.f4423a.get(), this.f4424b.get());
    }
}
