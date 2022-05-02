package p009a8;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.concurrent.atomic.AtomicReference;
import p047d7.C3865d;
import p047d7.C3872g;
import p047d7.C3882n;
import p163l5.C6378r;
import p177m6.C6779n;

public class C0218i {
    public static final AtomicReference<C0218i> f692b = new AtomicReference<>();
    public C3882n f693a;

    @RecentlyNonNull
    public static C0218i m42077c() {
        C0218i iVar = f692b.get();
        C6378r.m20503n(iVar != null, "MlKitContext has not been initialized");
        return iVar;
    }

    @RecentlyNonNull
    public static C0218i m42076d(@RecentlyNonNull Context context) {
        C0218i iVar = new C0218i();
        Context e = m42075e(context);
        boolean z = false;
        C3882n e2 = C3882n.m29670h(C6779n.f21256a).m29655d(C3872g.m29683c(e, MlKitComponentDiscoveryService.class).m29684b()).m29657b(C3865d.m29694p(e, Context.class, new Class[0])).m29657b(C3865d.m29694p(iVar, C0218i.class, new Class[0])).m29654e();
        iVar.f693a = e2;
        e2.m29667k(true);
        if (f692b.getAndSet(iVar) == null) {
            z = true;
        }
        C6378r.m20503n(z, "MlKitContext is already initialized");
        return iVar;
    }

    public static Context m42075e(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    @RecentlyNonNull
    public <T> T m42079a(@RecentlyNonNull Class<T> cls) {
        C6378r.m20503n(f692b.get() == this, "MlKitContext has been deleted");
        C6378r.m20506k(this.f693a);
        return (T) this.f693a.mo29677a(cls);
    }

    @RecentlyNonNull
    public Context m42078b() {
        return (Context) m42079a(Context.class);
    }
}
