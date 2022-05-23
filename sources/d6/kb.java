package d6;

import android.content.Context;
import b3.r;
import e7.w;
import n7.b;
import y2.c;
import y2.f;
import y2.g;
import z2.a;

public final class kb implements bb {
    public b<f<byte[]>> f6645a;
    public final b<f<byte[]>> f6646b;
    public final va f6647c;

    public kb(Context context, va vaVar) {
        this.f6647c = vaVar;
        a aVar = a.f26821g;
        r.f(context);
        final g g10 = r.c().g(aVar);
        if (aVar.a().contains(y2.b.b("json"))) {
            this.f6645a = new w(new b() {
                @Override
                public final Object get() {
                    return g.this.a("FIREBASE_ML_SDK", byte[].class, y2.b.b("json"), gb.f6530a);
                }
            });
        }
        this.f6646b = new w(new b() {
            @Override
            public final Object get() {
                return g.this.a("FIREBASE_ML_SDK", byte[].class, y2.b.b("proto"), hb.f6557a);
            }
        });
    }

    public static c<byte[]> b(va vaVar, fb fbVar) {
        int a10 = vaVar.a();
        if (fbVar.a() != 0) {
            return c.d(fbVar.c(a10, false));
        }
        return c.e(fbVar.c(a10, false));
    }

    @Override
    public final void a(fb fbVar) {
        if (this.f6647c.a() == 0) {
            b<f<byte[]>> bVar = this.f6645a;
            if (bVar != null) {
                bVar.get().a(b(this.f6647c, fbVar));
                return;
            }
            return;
        }
        this.f6646b.get().a(b(this.f6647c, fbVar));
    }
}
