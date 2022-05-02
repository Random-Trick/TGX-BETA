package p353z1;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.startup.InitializationProvider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.thunderdog.challegram.Log;
import p017b2.C1133a;

public final class C11225a {
    public static volatile C11225a f35938d;
    public static final Object f35939e = new Object();
    public final Context f35942c;
    public final Set<Class<? extends AbstractC11226b<?>>> f35941b = new HashSet();
    public final Map<Class<?>, Object> f35940a = new HashMap();

    public C11225a(Context context) {
        this.f35942c = context.getApplicationContext();
    }

    public static C11225a m1188c(Context context) {
        if (f35938d == null) {
            synchronized (f35939e) {
                if (f35938d == null) {
                    f35938d = new C11225a(context);
                }
            }
        }
        return f35938d;
    }

    public void m1190a() {
        try {
            try {
                C1133a.m38317a("Startup");
                Bundle bundle = this.f35942c.getPackageManager().getProviderInfo(new ComponentName(this.f35942c.getPackageName(), InitializationProvider.class.getName()), Log.TAG_YOUTUBE).metaData;
                String string = this.f35942c.getString(C11227c.a_res_0x7f0e11d8);
                if (bundle != null) {
                    HashSet hashSet = new HashSet();
                    for (String str : bundle.keySet()) {
                        if (string.equals(bundle.getString(str, null))) {
                            Class<?> cls = Class.forName(str);
                            if (AbstractC11226b.class.isAssignableFrom(cls)) {
                                this.f35941b.add(cls);
                                m1189b(cls, hashSet);
                            }
                        }
                    }
                }
            } finally {
                C1133a.m38316b();
            }
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException e) {
            throw new C11228d(e);
        }
    }

    public <T> T m1189b(Class<? extends AbstractC11226b<?>> cls, Set<Class<?>> set) {
        T t;
        synchronized (f35939e) {
            if (C1133a.m38314d()) {
                C1133a.m38317a(cls.getSimpleName());
            }
            if (!set.contains(cls)) {
                if (!this.f35940a.containsKey(cls)) {
                    set.add(cls);
                    try {
                        AbstractC11226b<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        List<Class<? extends AbstractC11226b<?>>> a = newInstance.mo1187a();
                        if (!a.isEmpty()) {
                            for (Class<? extends AbstractC11226b<?>> cls2 : a) {
                                if (!this.f35940a.containsKey(cls2)) {
                                    m1189b(cls2, set);
                                }
                            }
                        }
                        t = (T) newInstance.mo1186b(this.f35942c);
                        set.remove(cls);
                        this.f35940a.put(cls, t);
                    } catch (Throwable th) {
                        throw new C11228d(th);
                    }
                } else {
                    t = (T) this.f35940a.get(cls);
                }
                C1133a.m38316b();
            } else {
                throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
            }
        }
        return t;
    }
}