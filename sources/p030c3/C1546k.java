package p030c3;

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

public class C1546k implements AbstractC1538e {
    public final C1547a f5501a;
    public final C1544i f5502b;
    public final Map<String, AbstractC1549m> f5503c;

    public static class C1547a {
        public final Context f5504a;
        public Map<String, String> f5505b = null;

        public C1547a(Context context) {
            this.f5504a = context;
        }

        public static Bundle m36490d(Context context) {
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

        public final Map<String, String> m36493a(Context context) {
            Bundle d = m36490d(context);
            if (d == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : d.keySet()) {
                Object obj = d.get(str);
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

        public AbstractC1537d m36492b(String str) {
            String str2 = m36491c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (AbstractC1537d) Class.forName(str2).asSubclass(AbstractC1537d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e);
                return null;
            } catch (IllegalAccessException e2) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e2);
                return null;
            } catch (InstantiationException e3) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e4);
                return null;
            } catch (InvocationTargetException e5) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e5);
                return null;
            }
        }

        public final Map<String, String> m36491c() {
            if (this.f5505b == null) {
                this.f5505b = m36493a(this.f5504a);
            }
            return this.f5505b;
        }
    }

    public C1546k(Context context, C1544i iVar) {
        this(new C1547a(context), iVar);
    }

    @Override
    public synchronized AbstractC1549m mo36494a(String str) {
        if (this.f5503c.containsKey(str)) {
            return this.f5503c.get(str);
        }
        AbstractC1537d b = this.f5501a.m36492b(str);
        if (b == null) {
            return null;
        }
        AbstractC1549m create = b.create(this.f5502b.m36498a(str));
        this.f5503c.put(str, create);
        return create;
    }

    public C1546k(C1547a aVar, C1544i iVar) {
        this.f5503c = new HashMap();
        this.f5501a = aVar;
        this.f5502b = iVar;
    }
}
