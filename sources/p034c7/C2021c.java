package p034c7;

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
import p039d.C3563j;
import p047d7.C3865d;
import p047d7.C3872g;
import p047d7.C3882n;
import p047d7.C3896w;
import p135j7.AbstractC5895c;
import p143k0.C6024a;
import p148k5.ComponentCallbacks2C6090c;
import p163l5.C6374q;
import p163l5.C6378r;
import p178m7.AbstractC6794b;
import p232q5.C8243c;
import p232q5.C8251k;
import p232q5.C8252l;
import p263s7.C8691a;
import p337y0.C10341m;

public class C2021c {
    public static final Object f7195j = new Object();
    public static final Executor f7196k = new ExecutorC2025d();
    @GuardedBy("LOCK")
    public static final Map<String, C2021c> f7197l = new C6024a();
    public final Context f7198a;
    public final String f7199b;
    public final C2032i f7200c;
    public final C3882n f7201d;
    public final C3896w<C8691a> f7204g;
    public final AtomicBoolean f7202e = new AtomicBoolean(false);
    public final AtomicBoolean f7203f = new AtomicBoolean();
    public final List<AbstractC2023b> f7205h = new CopyOnWriteArrayList();
    public final List<Object> f7206i = new CopyOnWriteArrayList();

    public interface AbstractC2023b {
        void m35804a(boolean z);
    }

    @TargetApi(14)
    public static class C2024c implements ComponentCallbacks2C6090c.AbstractC6091a {
        public static AtomicReference<C2024c> f7207a = new AtomicReference<>();

        public static void m35802c(Context context) {
            if (C8251k.m13037a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f7207a.get() == null) {
                    C2024c cVar = new C2024c();
                    if (f7207a.compareAndSet(null, cVar)) {
                        ComponentCallbacks2C6090c.m21380c(application);
                        ComponentCallbacks2C6090c.m21381b().m21382a(cVar);
                    }
                }
            }
        }

        @Override
        public void mo21086a(boolean z) {
            synchronized (C2021c.f7195j) {
                Iterator it = new ArrayList(C2021c.f7197l.values()).iterator();
                while (it.hasNext()) {
                    C2021c cVar = (C2021c) it.next();
                    if (cVar.f7202e.get()) {
                        cVar.m35805u(z);
                    }
                }
            }
        }
    }

    public static class ExecutorC2025d implements Executor {
        public static final Handler f7208a = new Handler(Looper.getMainLooper());

        public ExecutorC2025d() {
        }

        @Override
        public void execute(Runnable runnable) {
            f7208a.post(runnable);
        }
    }

    @TargetApi(C3563j.f11955K3)
    public static class C2026e extends BroadcastReceiver {
        public static AtomicReference<C2026e> f7209b = new AtomicReference<>();
        public final Context f7210a;

        public C2026e(Context context) {
            this.f7210a = context;
        }

        public static void m35800b(Context context) {
            if (f7209b.get() == null) {
                C2026e eVar = new C2026e(context);
                if (f7209b.compareAndSet(null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void m35799c() {
            this.f7210a.unregisterReceiver(this);
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            synchronized (C2021c.f7195j) {
                for (C2021c cVar : C2021c.f7197l.values()) {
                    cVar.m35813m();
                }
            }
            m35799c();
        }
    }

    public C2021c(final Context context, String str, C2032i iVar) {
        this.f7198a = (Context) C6378r.m20507k(context);
        this.f7199b = C6378r.m20511g(str);
        this.f7200c = (C2032i) C6378r.m20507k(iVar);
        this.f7201d = C3882n.m29672h(f7196k).m29657d(C3872g.m29685c(context, ComponentDiscoveryService.class).m29686b()).m29658c(new FirebaseCommonRegistrar()).m29659b(C3865d.m29696p(context, Context.class, new Class[0])).m29659b(C3865d.m29696p(this, C2021c.class, new Class[0])).m29659b(C3865d.m29696p(iVar, C2032i.class, new Class[0])).m29656e();
        this.f7204g = new C3896w<>(new AbstractC6794b() {
            @Override
            public final Object get() {
                C8691a s;
                s = C2021c.this.m35807s(context);
                return s;
            }
        });
    }

    public static C2021c m35817i() {
        C2021c cVar;
        synchronized (f7195j) {
            cVar = f7197l.get("[DEFAULT]");
            if (cVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + C8252l.m13028a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return cVar;
    }

    public static C2021c m35812n(Context context) {
        synchronized (f7195j) {
            if (f7197l.containsKey("[DEFAULT]")) {
                return m35817i();
            }
            C2032i a = C2032i.m35798a(context);
            if (a == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return m35811o(context, a);
        }
    }

    public static C2021c m35811o(Context context, C2032i iVar) {
        return m35810p(context, iVar, "[DEFAULT]");
    }

    public static C2021c m35810p(Context context, C2032i iVar, String str) {
        C2021c cVar;
        C2024c.m35802c(context);
        String t = m35806t(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f7195j) {
            Map<String, C2021c> map = f7197l;
            boolean z = !map.containsKey(t);
            C6378r.m20504n(z, "FirebaseApp name " + t + " already exists!");
            C6378r.m20506l(context, "Application context cannot be null.");
            cVar = new C2021c(context, t, iVar);
            map.put(t, cVar);
        }
        cVar.m35813m();
        return cVar;
    }

    public C8691a m35807s(Context context) {
        return new C8691a(context, m35814l(), (AbstractC5895c) this.f7201d.mo29679a(AbstractC5895c.class));
    }

    public static String m35806t(String str) {
        return str.trim();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2021c)) {
            return false;
        }
        return this.f7199b.equals(((C2021c) obj).m35816j());
    }

    public final void m35820f() {
        C6378r.m20504n(!this.f7203f.get(), "FirebaseApp was deleted");
    }

    public <T> T m35819g(Class<T> cls) {
        m35820f();
        return (T) this.f7201d.mo29679a(cls);
    }

    public Context m35818h() {
        m35820f();
        return this.f7198a;
    }

    public int hashCode() {
        return this.f7199b.hashCode();
    }

    public String m35816j() {
        m35820f();
        return this.f7199b;
    }

    public C2032i m35815k() {
        m35820f();
        return this.f7200c;
    }

    public String m35814l() {
        return C8243c.m13053a(m35816j().getBytes(Charset.defaultCharset())) + "+" + C8243c.m13053a(m35815k().m35796c().getBytes(Charset.defaultCharset()));
    }

    public final void m35813m() {
        if (!C10341m.m5396a(this.f7198a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + m35816j());
            C2026e.m35800b(this.f7198a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + m35816j());
        this.f7201d.m29669k(m35808r());
    }

    public boolean m35809q() {
        m35820f();
        return this.f7204g.get().m11728b();
    }

    public boolean m35808r() {
        return "[DEFAULT]".equals(m35816j());
    }

    public String toString() {
        return C6374q.m20523c(this).m20522a("name", this.f7199b).m20522a("options", this.f7200c).toString();
    }

    public final void m35805u(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (AbstractC2023b bVar : this.f7205h) {
            bVar.m35804a(z);
        }
    }
}
