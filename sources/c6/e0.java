package c6;

import android.content.Context;
import b3.r;
import e7.w;
import n7.b;
import y2.f;
import y2.g;
import z2.a;

public final class e0 implements y {
    public b<f<byte[]>> f4947a;
    public final b<f<byte[]>> f4948b;
    public final u f4949c;

    public e0(Context context, u uVar) {
        this.f4949c = uVar;
        a aVar = a.f26821g;
        r.f(context);
        final g g10 = r.c().g(aVar);
        if (aVar.a().contains(y2.b.b("json"))) {
            this.f4947a = new w(new b() {
                @Override
                public final Object get() {
                    return g.this.a("FIREBASE_ML_SDK", byte[].class, y2.b.b("json"), a0.f4941a);
                }
            });
        }
        this.f4948b = new w(new b() {
            @Override
            public final Object get() {
                return g.this.a("FIREBASE_ML_SDK", byte[].class, y2.b.b("proto"), b0.f4942a);
            }
        });
    }
}
