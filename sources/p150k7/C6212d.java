package p150k7;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p047d7.AbstractC3870e;
import p047d7.C3865d;
import p047d7.C3890q;
import p047d7.C3896w;
import p150k7.AbstractC6214f;
import p178m7.AbstractC6794b;

public class C6212d implements AbstractC6214f {
    public static final ThreadFactory f19616d = ThreadFactoryC6210b.f19614a;
    public AbstractC6794b<C6216g> f19617a;
    public final Set<AbstractC6213e> f19618b;
    public final Executor f19619c;

    public C6212d(final Context context, Set<AbstractC6213e> set) {
        this(new C3896w(new AbstractC6794b() {
            @Override
            public final Object get() {
                C6216g a;
                a = C6216g.m21058a(context);
                return a;
            }
        }), set, new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f19616d));
    }

    public static C3865d<AbstractC6214f> m21064e() {
        return C3865d.m29707c(AbstractC6214f.class).m29692b(C3890q.m29633i(Context.class)).m29692b(C3890q.m29631k(AbstractC6213e.class)).m29689e(C6209a.f19613a).m29690d();
    }

    public static AbstractC6214f m21063f(AbstractC3870e eVar) {
        return new C6212d((Context) eVar.mo29677a(Context.class), eVar.mo29674d(AbstractC6213e.class));
    }

    public static Thread m21061h(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    @Override
    public AbstractC6214f.EnumC6215a mo21060a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean d = this.f19617a.get().m21055d(str, currentTimeMillis);
        boolean c = this.f19617a.get().m21056c(currentTimeMillis);
        if (d && c) {
            return AbstractC6214f.EnumC6215a.COMBINED;
        }
        if (c) {
            return AbstractC6214f.EnumC6215a.GLOBAL;
        }
        if (d) {
            return AbstractC6214f.EnumC6215a.SDK;
        }
        return AbstractC6214f.EnumC6215a.NONE;
    }

    public C6212d(AbstractC6794b<C6216g> bVar, Set<AbstractC6213e> set, Executor executor) {
        this.f19617a = bVar;
        this.f19618b = set;
        this.f19619c = executor;
    }
}
