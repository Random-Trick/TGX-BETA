package l7;

import android.content.Context;
import e7.e;
import e7.q;
import e7.w;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l7.f;
import n7.b;

public class d implements f {
    public static final ThreadFactory f16300d = b.f16298a;
    public b<g> f16301a;
    public final Set<e> f16302b;
    public final Executor f16303c;

    public d(final Context context, Set<e> set) {
        this(new w(new b() {
            @Override
            public final Object get() {
                g a10;
                a10 = g.a(context);
                return a10;
            }
        }), set, new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f16300d));
    }

    public static e7.d<f> e() {
        return e7.d.c(f.class).b(q.i(Context.class)).b(q.k(e.class)).e(a.f16297a).d();
    }

    public static f f(e eVar) {
        return new d((Context) eVar.a(Context.class), eVar.d(e.class));
    }

    public static Thread h(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    @Override
    public f.a a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean d10 = this.f16301a.get().d(str, currentTimeMillis);
        boolean c10 = this.f16301a.get().c(currentTimeMillis);
        if (d10 && c10) {
            return f.a.COMBINED;
        }
        if (c10) {
            return f.a.GLOBAL;
        }
        if (d10) {
            return f.a.SDK;
        }
        return f.a.NONE;
    }

    public d(b<g> bVar, Set<e> set, Executor executor) {
        this.f16301a = bVar;
        this.f16302b = set;
        this.f16303c = executor;
    }
}
