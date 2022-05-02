package p047d7;

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
import p178m7.AbstractC6794b;

public final class C3872g<T> {
    public final T f13139a;
    public final AbstractC3875c<T> f13140b;

    public static class C3874b implements AbstractC3875c<Context> {
        public final Class<? extends Service> f13141a;

        public final Bundle m29680b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f13141a), org.thunderdog.challegram.Log.TAG_YOUTUBE);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f13141a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        public List<String> mo29678a(Context context) {
            Bundle b = m29680b(context);
            if (b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        public C3874b(Class<? extends Service> cls) {
            this.f13141a = cls;
        }
    }

    public interface AbstractC3875c<T> {
        List<String> mo29678a(T t);
    }

    public C3872g(T t, AbstractC3875c<T> cVar) {
        this.f13139a = t;
        this.f13140b = cVar;
    }

    public static C3872g<Context> m29683c(Context context, Class<? extends Service> cls) {
        return new C3872g<>(context, new C3874b(cls));
    }

    public static AbstractC3877i m29682d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (AbstractC3877i.class.isAssignableFrom(cls)) {
                return (AbstractC3877i) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new C3895v(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e) {
            throw new C3895v(String.format("Could not instantiate %s.", str), e);
        } catch (InstantiationException e2) {
            throw new C3895v(String.format("Could not instantiate %s.", str), e2);
        } catch (NoSuchMethodException e3) {
            throw new C3895v(String.format("Could not instantiate %s", str), e3);
        } catch (InvocationTargetException e4) {
            throw new C3895v(String.format("Could not instantiate %s", str), e4);
        }
    }

    public List<AbstractC6794b<AbstractC3877i>> m29684b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f13140b.mo29678a(this.f13139a)) {
            arrayList.add(new AbstractC6794b() {
                @Override
                public final Object get() {
                    AbstractC3877i d;
                    d = C3872g.m29682d(str);
                    return d;
                }
            });
        }
        return arrayList;
    }
}
