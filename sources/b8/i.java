package b8;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import e7.d;
import e7.g;
import e7.n;
import java.util.concurrent.atomic.AtomicReference;
import m5.r;

public class i {
    public static final AtomicReference<i> f4036b = new AtomicReference<>();
    public n f4037a;

    @RecentlyNonNull
    public static i c() {
        i iVar = f4036b.get();
        r.n(iVar != null, "MlKitContext has not been initialized");
        return iVar;
    }

    @RecentlyNonNull
    public static i d(@RecentlyNonNull Context context) {
        i iVar = new i();
        Context e10 = e(context);
        boolean z10 = false;
        n e11 = n.h(n6.n.f17731a).d(g.c(e10, MlKitComponentDiscoveryService.class).b()).b(d.p(e10, Context.class, new Class[0])).b(d.p(iVar, i.class, new Class[0])).e();
        iVar.f4037a = e11;
        e11.k(true);
        if (f4036b.getAndSet(iVar) == null) {
            z10 = true;
        }
        r.n(z10, "MlKitContext is already initialized");
        return iVar;
    }

    public static Context e(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    @RecentlyNonNull
    public <T> T a(@RecentlyNonNull Class<T> cls) {
        r.n(f4036b.get() == this, "MlKitContext has been deleted");
        r.k(this.f4037a);
        return (T) this.f4037a.a(cls);
    }

    @RecentlyNonNull
    public Context b() {
        return (Context) a(Context.class);
    }
}
