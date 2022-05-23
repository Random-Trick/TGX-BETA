package p0;

import a.a;
import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class k {
    public static String f20352d;
    public static c f20355g;
    public final Context f20356a;
    public final NotificationManager f20357b;
    public static final Object f20351c = new Object();
    public static Set<String> f20353e = new HashSet();
    public static final Object f20354f = new Object();

    public static class a implements d {
        public final String f20358a;
        public final int f20359b;
        public final String f20360c;
        public final Notification f20361d;

        public a(String str, int i10, String str2, Notification notification) {
            this.f20358a = str;
            this.f20359b = i10;
            this.f20360c = str2;
            this.f20361d = notification;
        }

        @Override
        public void a(a.a aVar) {
            aVar.r1(this.f20358a, this.f20359b, this.f20360c, this.f20361d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f20358a + ", id:" + this.f20359b + ", tag:" + this.f20360c + "]";
        }
    }

    public static class b {
        public final ComponentName f20362a;
        public final IBinder f20363b;

        public b(ComponentName componentName, IBinder iBinder) {
            this.f20362a = componentName;
            this.f20363b = iBinder;
        }
    }

    public static class c implements Handler.Callback, ServiceConnection {
        public final Map<ComponentName, a> M = new HashMap();
        public Set<String> N = new HashSet();
        public final Context f20364a;
        public final HandlerThread f20365b;
        public final Handler f20366c;

        public static class a {
            public final ComponentName f20367a;
            public a.a f20369c;
            public boolean f20368b = false;
            public ArrayDeque<d> f20370d = new ArrayDeque<>();
            public int f20371e = 0;

            public a(ComponentName componentName) {
                this.f20367a = componentName;
            }
        }

        public c(Context context) {
            this.f20364a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f20365b = handlerThread;
            handlerThread.start();
            this.f20366c = new Handler(handlerThread.getLooper(), this);
        }

        public final boolean a(a aVar) {
            if (aVar.f20368b) {
                return true;
            }
            boolean bindService = this.f20364a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f20367a), this, 33);
            aVar.f20368b = bindService;
            if (bindService) {
                aVar.f20371e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f20367a);
                this.f20364a.unbindService(this);
            }
            return aVar.f20368b;
        }

        public final void b(a aVar) {
            if (aVar.f20368b) {
                this.f20364a.unbindService(this);
                aVar.f20368b = false;
            }
            aVar.f20369c = null;
        }

        public final void c(d dVar) {
            j();
            for (a aVar : this.M.values()) {
                aVar.f20370d.add(dVar);
                g(aVar);
            }
        }

        public final void d(ComponentName componentName) {
            a aVar = this.M.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        public final void e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.M.get(componentName);
            if (aVar != null) {
                aVar.f20369c = a.AbstractBinderC0000a.q(iBinder);
                aVar.f20371e = 0;
                g(aVar);
            }
        }

        public final void f(ComponentName componentName) {
            a aVar = this.M.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        public final void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f20367a + ", " + aVar.f20370d.size() + " queued tasks");
            }
            if (!aVar.f20370d.isEmpty()) {
                if (!a(aVar) || aVar.f20369c == null) {
                    i(aVar);
                    return;
                }
                while (true) {
                    d peek = aVar.f20370d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + peek);
                        }
                        peek.a(aVar.f20369c);
                        aVar.f20370d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + aVar.f20367a);
                        }
                    } catch (RemoteException e10) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f20367a, e10);
                    }
                }
                if (!aVar.f20370d.isEmpty()) {
                    i(aVar);
                }
            }
        }

        public void h(d dVar) {
            this.f20366c.obtainMessage(0, dVar).sendToTarget();
        }

        @Override
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c((d) message.obj);
                return true;
            } else if (i10 == 1) {
                b bVar = (b) message.obj;
                e(bVar.f20362a, bVar.f20363b);
                return true;
            } else if (i10 == 2) {
                f((ComponentName) message.obj);
                return true;
            } else if (i10 != 3) {
                return false;
            } else {
                d((ComponentName) message.obj);
                return true;
            }
        }

        public final void i(a aVar) {
            if (!this.f20366c.hasMessages(3, aVar.f20367a)) {
                int i10 = aVar.f20371e + 1;
                aVar.f20371e = i10;
                if (i10 > 6) {
                    Log.w("NotifManCompat", "Giving up on delivering " + aVar.f20370d.size() + " tasks to " + aVar.f20367a + " after " + aVar.f20371e + " retries");
                    aVar.f20370d.clear();
                    return;
                }
                int i11 = (1 << (i10 - 1)) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i11 + " ms");
                }
                this.f20366c.sendMessageDelayed(this.f20366c.obtainMessage(3, aVar.f20367a), i11);
            }
        }

        public final void j() {
            Set<String> e10 = k.e(this.f20364a);
            if (!e10.equals(this.N)) {
                this.N = e10;
                List<ResolveInfo> queryIntentServices = this.f20364a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (e10.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.M.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.M.put(componentName2, new a(componentName2));
                    }
                }
                Iterator<Map.Entry<ComponentName, a>> it = this.M.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<ComponentName, a> next = it.next();
                    if (!hashSet.contains(next.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + next.getKey());
                        }
                        b(next.getValue());
                        it.remove();
                    }
                }
            }
        }

        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f20366c.obtainMessage(1, new b(componentName, iBinder)).sendToTarget();
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f20366c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    public interface d {
        void a(a.a aVar);
    }

    public k(Context context) {
        this.f20356a = context;
        this.f20357b = (NotificationManager) context.getSystemService("notification");
    }

    public static k d(Context context) {
        return new k(context);
    }

    public static Set<String> e(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f20351c) {
            if (string != null) {
                if (!string.equals(f20352d)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    f20353e = hashSet;
                    f20352d = string;
                }
            }
            set = f20353e;
        }
        return set;
    }

    public static boolean i(Notification notification) {
        Bundle a10 = h.a(notification);
        return a10 != null && a10.getBoolean("android.support.useSideChannel");
    }

    public boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f20357b.areNotificationsEnabled();
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f20356a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f20356a.getApplicationInfo();
        String packageName = this.f20356a.getApplicationContext().getPackageName();
        int i10 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i10), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public void b(int i10) {
        c(null, i10);
    }

    public void c(String str, int i10) {
        this.f20357b.cancel(str, i10);
    }

    public void f(int i10, Notification notification) {
        g(null, i10, notification);
    }

    public void g(String str, int i10, Notification notification) {
        if (i(notification)) {
            h(new a(this.f20356a.getPackageName(), i10, str, notification));
            this.f20357b.cancel(str, i10);
            return;
        }
        this.f20357b.notify(str, i10, notification);
    }

    public final void h(d dVar) {
        synchronized (f20354f) {
            if (f20355g == null) {
                f20355g = new c(this.f20356a.getApplicationContext());
            }
            f20355g.h(dVar);
        }
    }
}
