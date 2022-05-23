package e6;

import android.content.Context;
import b3.r;
import e7.w;
import n7.b;
import y2.c;
import y2.f;
import y2.g;
import z2.a;

public final class m7 implements e7 {
    public b<f<byte[]>> f10940a;
    public final b<f<byte[]>> f10941b;
    public final z6 f10942c;

    public m7(Context context, z6 z6Var) {
        this.f10942c = z6Var;
        a aVar = a.f26821g;
        r.f(context);
        final g g10 = r.c().g(aVar);
        if (aVar.a().contains(y2.b.b("json"))) {
            this.f10940a = new w(new b() {
                @Override
                public final Object get() {
                    return g.this.a("FIREBASE_ML_SDK", byte[].class, y2.b.b("json"), h7.f10827a);
                }
            });
        }
        this.f10941b = new w(new b() {
            @Override
            public final Object get() {
                return g.this.a("FIREBASE_ML_SDK", byte[].class, y2.b.b("proto"), j7.f10868a);
            }
        });
    }

    public static c<byte[]> b(z6 z6Var, g7 g7Var) {
        return c.e(g7Var.b(z6Var.a(), false));
    }

    @Override
    public final void a(g7 g7Var) {
        if (this.f10942c.a() == 0) {
            b<f<byte[]>> bVar = this.f10940a;
            if (bVar != null) {
                bVar.get().a(b(this.f10942c, g7Var));
                return;
            }
            return;
        }
        this.f10941b.get().a(b(this.f10942c, g7Var));
    }
}
