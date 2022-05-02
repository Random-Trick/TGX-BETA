package p021b6;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import p009a8.C0207c;
import p009a8.C0215g;
import p009a8.C0223n;
import p163l5.C6368o;
import p177m6.AbstractC6775l;

public final class C1290z {
    public final String f4648a;
    public final String f4649b;
    public final AbstractC1289y f4650c;
    public final C0223n f4651d;
    public final AbstractC6775l<String> f4652e;
    public final AbstractC6775l<String> f4653f;
    public final String f4654g;
    public final Map<Object, Long> f4655h = new HashMap();
    public final Map<Object, Object> f4656i = new HashMap();

    public C1290z(Context context, final C0223n nVar, AbstractC1289y yVar, final String str) {
        this.f4648a = context.getPackageName();
        this.f4649b = C0207c.m42088a(context);
        this.f4651d = nVar;
        this.f4650c = yVar;
        this.f4654g = str;
        this.f4652e = C0215g.m42084a().m42083b(new Callable() {
            @Override
            public final Object call() {
                return C6368o.m20533a().m20532b(str);
            }
        });
        C0215g a = C0215g.m42084a();
        nVar.getClass();
        this.f4653f = a.m42083b(new Callable() {
            @Override
            public final Object call() {
                return C0223n.this.m42064a();
            }
        });
    }
}
