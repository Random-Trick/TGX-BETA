package g3;

import android.content.Context;
import d3.b;
import d3.d;
import h3.f;
import h3.r;
import ha.a;
import i3.c;

public final class i implements b<r> {
    public final a<Context> f12096a;
    public final a<c> f12097b;
    public final a<f> f12098c;
    public final a<k3.a> f12099d;

    public i(a<Context> aVar, a<c> aVar2, a<f> aVar3, a<k3.a> aVar4) {
        this.f12096a = aVar;
        this.f12097b = aVar2;
        this.f12098c = aVar3;
        this.f12099d = aVar4;
    }

    public static i a(a<Context> aVar, a<c> aVar2, a<f> aVar3, a<k3.a> aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static r c(Context context, c cVar, f fVar, k3.a aVar) {
        return (r) d.c(h.a(context, cVar, fVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public r get() {
        return c(this.f12096a.get(), this.f12097b.get(), this.f12098c.get(), this.f12099d.get());
    }
}
