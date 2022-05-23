package e7;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class g<T> {
    public final T f11312a;
    public final c<T> f11313b;

    public static class b implements c<Context> {
        public final Class<? extends Service> f11314a;

        public final Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f11314a), org.thunderdog.challegram.Log.TAG_YOUTUBE);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f11314a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        public List<String> a(Context context) {
            Bundle b10 = b(context);
            if (b10 == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b10.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b10.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        public b(Class<? extends Service> cls) {
            this.f11314a = cls;
        }
    }

    public interface c<T> {
        List<String> a(T t10);
    }

    public g(T t10, c<T> cVar) {
        this.f11312a = t10;
        this.f11313b = cVar;
    }

    public static g<Context> c(Context context, Class<? extends Service> cls) {
        return new g<>(context, new b(cls));
    }

    public static i d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (i.class.isAssignableFrom(cls)) {
                return (i) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new v(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e10) {
            throw new v(String.format("Could not instantiate %s.", str), e10);
        } catch (InstantiationException e11) {
            throw new v(String.format("Could not instantiate %s.", str), e11);
        } catch (NoSuchMethodException e12) {
            throw new v(String.format("Could not instantiate %s", str), e12);
        } catch (InvocationTargetException e13) {
            throw new v(String.format("Could not instantiate %s", str), e13);
        }
    }

    public List<n7.b<i>> b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f11313b.a(this.f11312a)) {
            arrayList.add(new n7.b() {
                @Override
                public final Object get() {
                    i d10;
                    d10 = g.d(str);
                    return d10;
                }
            });
        }
        return arrayList;
    }
}
