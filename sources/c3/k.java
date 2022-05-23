package c3;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class k implements e {
    public final a f4418a;
    public final i f4419b;
    public final Map<String, m> f4420c;

    public static class a {
        public final Context f4421a;
        public Map<String, String> f4422b = null;

        public a(Context context) {
            this.f4421a = context;
        }

        public static Bundle d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), org.thunderdog.challegram.Log.TAG_YOUTUBE);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        public final Map<String, String> a(Context context) {
            Bundle d10 = d(context);
            if (d10 == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : d10.keySet()) {
                Object obj = d10.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        public d b(String str) {
            String str2 = c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (d) Class.forName(str2).asSubclass(d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e10) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e10);
                return null;
            } catch (IllegalAccessException e11) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e11);
                return null;
            } catch (InstantiationException e12) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e12);
                return null;
            } catch (NoSuchMethodException e13) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e13);
                return null;
            } catch (InvocationTargetException e14) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e14);
                return null;
            }
        }

        public final Map<String, String> c() {
            if (this.f4422b == null) {
                this.f4422b = a(this.f4421a);
            }
            return this.f4422b;
        }
    }

    public k(Context context, i iVar) {
        this(new a(context), iVar);
    }

    @Override
    public synchronized m a(String str) {
        if (this.f4420c.containsKey(str)) {
            return this.f4420c.get(str);
        }
        d b10 = this.f4418a.b(str);
        if (b10 == null) {
            return null;
        }
        m create = b10.create(this.f4419b.a(str));
        this.f4420c.put(str, create);
        return create;
    }

    public k(a aVar, i iVar) {
        this.f4420c = new HashMap();
        this.f4418a = aVar;
        this.f4419b = iVar;
    }
}
