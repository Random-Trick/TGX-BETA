package w7;

import android.content.Context;
import e7.d;
import e7.e;
import e7.q;

public class h {

    public interface a<T> {
        String a(T t10);
    }

    public static d<?> b(String str, String str2) {
        return d.i(f.a(str, str2), f.class);
    }

    public static d<?> c(final String str, final a<Context> aVar) {
        return d.j(f.class).b(q.i(Context.class)).e(new e7.h() {
            @Override
            public final Object a(e eVar) {
                f d10;
                d10 = h.d(str, aVar, eVar);
                return d10;
            }
        }).d();
    }

    public static f d(String str, a aVar, e eVar) {
        return f.a(str, aVar.a((Context) eVar.a(Context.class)));
    }
}
