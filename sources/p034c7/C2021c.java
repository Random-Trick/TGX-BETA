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
        void m35801a(boolean z);
    }

    @TargetApi(14)
    public static class C2024c implements ComponentCallbacks2C6090c.AbstractC6091a {
        public static AtomicReference<C2024c> f7207a = new AtomicReference<>();

        public static void m35799c(Context context) {
            if (C8251k.m13038a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f7207a.get() == null) {
                    C2024c cVar = new C2024c();
                    if (f7207a.compareAndSet(null, cVar)) {
                        ComponentCallbacks2C6090c.m21379c(application);
                        ComponentCallbacks2C6090c.m21380b().m21381a(cVar);
                    }
                }
            }
        }

        @Override
        public void mo21085a(boolean z) {
            synchronized (C2021c.f7195j) {
                Iterator it = new ArrayList(C2021c.f7197l.values()).iterator();
                while (it.hasNext()) {
                    C2021c cVar = (C2021c) it.next();
                    if (cVar.f7202e.get()) {
                        cVar.m35802u(z);
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

        public static void m35797b(Context context) {
            if (f7209b.get() == null) {
                C2026e eVar = new C2026e(context);
                if (f7209b.compareAndSet(null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void m35796c() {
            this.f7210a.unregisterReceiver(this);
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            synchronized (C2021c.f7195j) {
                for (C2021c cVar : C2021c.f7197l.values()) {
                    cVar.m35810m();
                }
            }
            m35796c();
        }
    }

    public C2021c(final Context context, String str, C2032i iVar) {
        this.f7198a = (Context) C6378r.m20506k(context);
        this.f7199b = C6378r.m20510g(str);
        this.f7200c = (C2032i) C6378r.m20506k(iVar);
        this.f7201d = C3882n.m29670h(f7196k).m29655d(C3872g.m29683c(context, ComponentDiscoveryService.class).m29684b()).m29656c(new FirebaseCommonRegistrar()).m29657b(C3865d.m29694p(context, Context.class, new Class[0])).m29657b(C3865d.m29694p(this, C2021c.class, new Class[0])).m29657b(C3865d.m29694p(iVar, C2032i.class, new Class[0])).m29654e();
        this.f7204g = new C3896w<>(new AbstractC6794b() {
            @Override
            public final Object get() {
                C8691a s;
                s = C2021c.this.m35804s(context);
                return s;
            }
        });
    }

    public static C2021c m35814i() {
        C2021c cVar;
        synchronized (f7195j) {
            cVar = f7197l.get("[DEFAULT]");
            if (cVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + C8252l.m13029a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return cVar;
    }

    public static C2021c m35809n(Context context) {
        synchronized (f7195j) {
            if (f7197l.containsKey("[DEFAULT]")) {
                return m35814i();
            }
            C2032i a = C2032i.m35795a(context);
            if (a == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return m35808o(context, a);
        }
    }

    public static C2021c m35808o(Context context, C2032i iVar) {
        return m35807p(context, iVar, "[DEFAULT]");
    }

    public static C2021c m35807p(Context context, C2032i iVar, String str) {
        C2021c cVar;
        C2024c.m35799c(context);
        String t = m35803t(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f7195j) {
            Map<String, C2021c> map = f7197l;
            boolean z = !map.containsKey(t);
            C6378r.m20503n(z, "FirebaseApp name " + t + " already exists!");
            C6378r.m20505l(context, "Application context cannot be null.");
            cVar = new C2021c(context, t, iVar);
            map.put(t, cVar);
        }
        cVar.m35810m();
        return cVar;
    }

    public C8691a m35804s(Context context) {
        return new C8691a(context, m35811l(), (AbstractC5895c) this.f7201d.mo29677a(AbstractC5895c.class));
    }

    public static String m35803t(String str) {
        return str.trim();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2021c)) {
            return false;
        }
        return this.f7199b.equals(((C2021c) obj).m35813j());
    }

    public final void m35817f() {
        C6378r.m20503n(!this.f7203f.get(), "FirebaseApp was deleted");
    }

    public <T> T m35816g(Class<T> cls) {
        m35817f();
        return (T) this.f7201d.mo29677a(cls);
    }

    public Context m35815h() {
        m35817f();
        return this.f7198a;
    }

    public int hashCode() {
        return this.f7199b.hashCode();
    }

    public String m35813j() {
        m35817f();
        return this.f7199b;
    }

    public C2032i m35812k() {
        m35817f();
        return this.f7200c;
    }

    public String m35811l() {
        return C8243c.m13054a(m35813j().getBytes(Charset.defaultCharset())) + "+" + C8243c.m13054a(m35812k().m35793c().getBytes(Charset.defaultCharset()));
    }

    public final void m35810m() {
        if (!C10341m.m5396a(this.f7198a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + m35813j());
            C2026e.m35797b(this.f7198a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + m35813j());
        this.f7201d.m29667k(m35805r());
    }

    public boolean m35806q() {
        m35817f();
        return this.f7204g.get().m11729b();
    }

    public boolean m35805r() {
        return "[DEFAULT]".equals(m35813j());
    }

    public String toString() {
        return C6374q.m20522c(this).m20521a("name", this.f7199b).m20521a("options", this.f7200c).toString();
    }

    public final void m35802u(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (AbstractC2023b bVar : this.f7205h) {
            bVar.m35801a(z);
        }
    }
}