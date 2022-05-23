package z1;

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

public final class a {
    public static volatile a f26812d;
    public static final Object f26813e = new Object();
    public final Context f26816c;
    public final Set<Class<? extends b<?>>> f26815b = new HashSet();
    public final Map<Class<?>, Object> f26814a = new HashMap();

    public a(Context context) {
        this.f26816c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f26812d == null) {
            synchronized (f26813e) {
                if (f26812d == null) {
                    f26812d = new a(context);
                }
            }
        }
        return f26812d;
    }

    public void a() {
        try {
            try {
                b2.a.a("Startup");
                Bundle bundle = this.f26816c.getPackageManager().getProviderInfo(new ComponentName(this.f26816c.getPackageName(), InitializationProvider.class.getName()), Log.TAG_YOUTUBE).metaData;
                String string = this.f26816c.getString(c.a_res_0x7f0e11e4);
                if (bundle != null) {
                    HashSet hashSet = new HashSet();
                    for (String str : bundle.keySet()) {
                        if (string.equals(bundle.getString(str, null))) {
                            Class<?> cls = Class.forName(str);
                            if (b.class.isAssignableFrom(cls)) {
                                this.f26815b.add(cls);
                                b(cls, hashSet);
                            }
                        }
                    }
                }
            } finally {
                b2.a.b();
            }
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException e10) {
            throw new d(e10);
        }
    }

    public <T> T b(Class<? extends b<?>> cls, Set<Class<?>> set) {
        T t10;
        synchronized (f26813e) {
            if (b2.a.d()) {
                b2.a.a(cls.getSimpleName());
            }
            if (!set.contains(cls)) {
                if (!this.f26814a.containsKey(cls)) {
                    set.add(cls);
                    try {
                        b<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        List<Class<? extends b<?>>> a10 = newInstance.a();
                        if (!a10.isEmpty()) {
                            for (Class<? extends b<?>> cls2 : a10) {
                                if (!this.f26814a.containsKey(cls2)) {
                                    b(cls2, set);
                                }
                            }
                        }
                        t10 = (T) newInstance.b(this.f26816c);
                        set.remove(cls);
                        this.f26814a.put(cls, t10);
                    } catch (Throwable th) {
                        throw new d(th);
                    }
                } else {
                    t10 = (T) this.f26814a.get(cls);
                }
                b2.a.b();
            } else {
                throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
            }
        }
        return t10;
    }
}
