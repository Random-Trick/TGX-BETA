package c6;

import android.content.Context;
import b8.c;
import b8.g;
import b8.n;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import m5.o;
import n6.l;

public final class z {
    public final String f4973a;
    public final String f4974b;
    public final y f4975c;
    public final n f4976d;
    public final l<String> f4977e;
    public final l<String> f4978f;
    public final String f4979g;
    public final Map<Object, Long> f4980h = new HashMap();
    public final Map<Object, Object> f4981i = new HashMap();

    public z(Context context, final n nVar, y yVar, final String str) {
        this.f4973a = context.getPackageName();
        this.f4974b = c.a(context);
        this.f4976d = nVar;
        this.f4975c = yVar;
        this.f4979g = str;
        this.f4977e = g.a().b(new Callable() {
            @Override
            public final Object call() {
                return o.a().b(str);
            }
        });
        g a10 = g.a();
        nVar.getClass();
        this.f4978f = a10.b(new Callable() {
            @Override
            public final Object call() {
                return n.this.a();
            }
        });
    }
}
