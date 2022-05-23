package d7;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import d.j;
import e7.g;
import e7.n;
import e7.w;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;
import l5.c;
import m5.q;
import m5.r;
import r5.k;
import r5.l;
import t7.a;
import y0.m;

public class c {
    public static final Object f7202j = new Object();
    public static final Executor f7203k = new d();
    @GuardedBy("LOCK")
    public static final Map<String, c> f7204l = new k0.a();
    public final Context f7205a;
    public final String f7206b;
    public final i f7207c;
    public final n f7208d;
    public final w<t7.a> f7211g;
    public final AtomicBoolean f7209e = new AtomicBoolean(false);
    public final AtomicBoolean f7210f = new AtomicBoolean();
    public final List<b> f7212h = new CopyOnWriteArrayList();
    public final List<Object> f7213i = new CopyOnWriteArrayList();

    public interface b {
        void a(boolean z10);
    }

    @TargetApi(14)
    public static class C0081c implements c.a {
        public static AtomicReference<C0081c> f7214a = new AtomicReference<>();

        public static void c(Context context) {
            if (k.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f7214a.get() == null) {
                    C0081c cVar = new C0081c();
                    if (f7214a.compareAndSet(null, cVar)) {
                        l5.c.c(application);
                        l5.c.b().a(cVar);
                    }
                }
            }
        }

        @Override
        public void a(boolean z10) {
            synchronized (c.f7202j) {
                Iterator it = new ArrayList(c.f7204l.values()).iterator();
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    if (cVar.f7209e.get()) {
                        cVar.u(z10);
                    }
                }
            }
        }
    }

    public static class d implements Executor {
        public static final Handler f7215a = new Handler(Looper.getMainLooper());

        public d() {
        }

        @Override
        public void execute(Runnable runnable) {
            f7215a.post(runnable);
        }
    }

    @TargetApi(j.K3)
    public static class e extends BroadcastReceiver {
        public static AtomicReference<e> f7216b = new AtomicReference<>();
        public final Context f7217a;

        public e(Context context) {
            this.f7217a = context;
        }

        public static void b(Context context) {
            if (f7216b.get() == null) {
                e eVar = new e(context);
                if (f7216b.compareAndSet(null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f7217a.unregisterReceiver(this);
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            synchronized (c.f7202j) {
                for (c cVar : c.f7204l.values()) {
                    cVar.m();
                }
            }
            c();
        }
    }

    public c(final Context context, String str, i iVar) {
        this.f7205a = (Context) r.k(context);
        this.f7206b = r.g(str);
        this.f7207c = (i) r.k(iVar);
        this.f7208d = n.h(f7203k).d(g.c(context, ComponentDiscoveryService.class).b()).c(new FirebaseCommonRegistrar()).b(e7.d.p(context, Context.class, new Class[0])).b(e7.d.p(this, c.class, new Class[0])).b(e7.d.p(iVar, i.class, new Class[0])).e();
        this.f7211g = new w<>(new n7.b() {
            @Override
            public final Object get() {
                a s10;
                s10 = c.this.s(context);
                return s10;
            }
        });
    }

    public static c i() {
        c cVar;
        synchronized (f7202j) {
            cVar = f7204l.get("[DEFAULT]");
            if (cVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + l.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return cVar;
    }

    public static c n(Context context) {
        synchronized (f7202j) {
            if (f7204l.containsKey("[DEFAULT]")) {
                return i();
            }
            i a10 = i.a(context);
            if (a10 == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return o(context, a10);
        }
    }

    public static c o(Context context, i iVar) {
        return p(context, iVar, "[DEFAULT]");
    }

    public static c p(Context context, i iVar, String str) {
        c cVar;
        C0081c.c(context);
        String t10 = t(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f7202j) {
            Map<String, c> map = f7204l;
            boolean z10 = !map.containsKey(t10);
            r.n(z10, "FirebaseApp name " + t10 + " already exists!");
            r.l(context, "Application context cannot be null.");
            cVar = new c(context, t10, iVar);
            map.put(t10, cVar);
        }
        cVar.m();
        return cVar;
    }

    public t7.a s(Context context) {
        return new t7.a(context, l(), (k7.c) this.f7208d.a(k7.c.class));
    }

    public static String t(String str) {
        return str.trim();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f7206b.equals(((c) obj).j());
    }

    public final void f() {
        r.n(!this.f7210f.get(), "FirebaseApp was deleted");
    }

    public <T> T g(Class<T> cls) {
        f();
        return (T) this.f7208d.a(cls);
    }

    public Context h() {
        f();
        return this.f7205a;
    }

    public int hashCode() {
        return this.f7206b.hashCode();
    }

    public String j() {
        f();
        return this.f7206b;
    }

    public i k() {
        f();
        return this.f7207c;
    }

    public String l() {
        return r5.c.a(j().getBytes(Charset.defaultCharset())) + "+" + r5.c.a(k().c().getBytes(Charset.defaultCharset()));
    }

    public final void m() {
        if (!m.a(this.f7205a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + j());
            e.b(this.f7205a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + j());
        this.f7208d.k(r());
    }

    public boolean q() {
        f();
        return this.f7211g.get().b();
    }

    public boolean r() {
        return "[DEFAULT]".equals(j());
    }

    public String toString() {
        return q.c(this).a("name", this.f7206b).a("options", this.f7207c).toString();
    }

    public final void u(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (b bVar : this.f7212h) {
            bVar.a(z10);
        }
    }
}
