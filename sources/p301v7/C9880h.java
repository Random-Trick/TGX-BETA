package p301v7;

import android.content.Context;
import p047d7.AbstractC3870e;
import p047d7.AbstractC3876h;
import p047d7.C3865d;
import p047d7.C3890q;

public class C9880h {

    public interface AbstractC9881a<T> {
        String mo6696a(T t);
    }

    public static C3865d<?> m6699b(String str, String str2) {
        return C3865d.m29701i(AbstractC9878f.m6703a(str, str2), AbstractC9878f.class);
    }

    public static C3865d<?> m6698c(final String str, final AbstractC9881a<Context> aVar) {
        return C3865d.m29700j(AbstractC9878f.class).m29692b(C3890q.m29633i(Context.class)).m29689e(new AbstractC3876h() {
            @Override
            public final Object mo5891a(AbstractC3870e eVar) {
                AbstractC9878f d;
                d = C9880h.m6697d(str, aVar, eVar);
                return d;
            }
        }).m29690d();
    }

    public static AbstractC9878f m6697d(String str, AbstractC9881a aVar, AbstractC3870e eVar) {
        return AbstractC9878f.m6703a(str, aVar.mo6696a((Context) eVar.mo29677a(Context.class)));
    }
}
