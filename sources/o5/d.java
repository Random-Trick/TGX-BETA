package o5;

import android.content.Context;
import k5.a;
import k5.e;
import l5.o;
import l5.r;
import m5.v;
import m5.x;
import m5.y;
import n6.l;
import n6.m;

public final class d extends e<y> implements x {
    public static final a.g<e> f19201k;
    public static final a.AbstractC0141a<e, y> f19202l;
    public static final a<y> f19203m;
    public static final int f19204n = 0;

    static {
        a.g<e> gVar = new a.g<>();
        f19201k = gVar;
        c cVar = new c();
        f19202l = cVar;
        f19203m = new a<>("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, y yVar) {
        super(context, f19203m, yVar, e.a.f15674c);
    }

    @Override
    public final l<Void> a(final v vVar) {
        r.a a10 = r.a();
        a10.d(w5.d.f25771a);
        a10.c(false);
        a10.b(new o(vVar) {
            public final v f19200a;

            {
                this.f19200a = vVar;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                v vVar2 = this.f19200a;
                int i10 = d.f19204n;
                ((a) ((e) obj).G()).E1(vVar2);
                ((m) obj2).c(null);
            }
        });
        return c(a10.a());
    }
}
