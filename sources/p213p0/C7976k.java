package p213p0;

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
import p000a.AbstractC0000a;

public final class C7976k {
    public static String f25980d;
    public static ServiceConnectionC7980d f25983g;
    public final Context f25984a;
    public final NotificationManager f25985b;
    public static final Object f25979c = new Object();
    public static Set<String> f25981e = new HashSet();
    public static final Object f25982f = new Object();

    public static class C7977a implements AbstractC7982e {
        public final String f25986a;
        public final int f25987b;
        public final String f25988c;
        public final boolean f25989d = false;

        public C7977a(String str, int i, String str2) {
            this.f25986a = str;
            this.f25987b = i;
            this.f25988c = str2;
        }

        @Override
        public void mo13861a(AbstractC0000a aVar) {
            if (this.f25989d) {
                aVar.mo42616b0(this.f25986a);
            } else {
                aVar.mo42617G0(this.f25986a, this.f25987b, this.f25988c);
            }
        }

        public String toString() {
            return "CancelTask[packageName:" + this.f25986a + ", id:" + this.f25987b + ", tag:" + this.f25988c + ", all:" + this.f25989d + "]";
        }
    }

    public static class C7978b implements AbstractC7982e {
        public final String f25990a;
        public final int f25991b;
        public final String f25992c;
        public final Notification f25993d;

        public C7978b(String str, int i, String str2, Notification notification) {
            this.f25990a = str;
            this.f25991b = i;
            this.f25992c = str2;
            this.f25993d = notification;
        }

        @Override
        public void mo13861a(AbstractC0000a aVar) {
            aVar.mo42615s1(this.f25990a, this.f25991b, this.f25992c, this.f25993d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f25990a + ", id:" + this.f25991b + ", tag:" + this.f25992c + "]";
        }
    }

    public static class C7979c {
        public final ComponentName f25994a;
        public final IBinder f25995b;

        public C7979c(ComponentName componentName, IBinder iBinder) {
            this.f25994a = componentName;
            this.f25995b = iBinder;
        }
    }

    public static class ServiceConnectionC7980d implements Handler.Callback, ServiceConnection {
        public final Map<ComponentName, C7981a> f25996M = new HashMap();
        public Set<String> f25997N = new HashSet();
        public final Context f25998a;
        public final HandlerThread f25999b;
        public final Handler f26000c;

        public static class C7981a {
            public final ComponentName f26001a;
            public AbstractC0000a f26003c;
            public boolean f26002b = false;
            public ArrayDeque<AbstractC7982e> f26004d = new ArrayDeque<>();
            public int f26005e = 0;

            public C7981a(ComponentName componentName) {
                this.f26001a = componentName;
            }
        }

        public ServiceConnectionC7980d(Context context) {
            this.f25998a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f25999b = handlerThread;
            handlerThread.start();
            this.f26000c = new Handler(handlerThread.getLooper(), this);
        }

        public final boolean m13871a(C7981a aVar) {
            if (aVar.f26002b) {
                return true;
            }
            boolean bindService = this.f25998a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f26001a), this, 33);
            aVar.f26002b = bindService;
            if (bindService) {
                aVar.f26005e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f26001a);
                this.f25998a.unbindService(this);
            }
            return aVar.f26002b;
        }

        public final void m13870b(C7981a aVar) {
            if (aVar.f26002b) {
                this.f25998a.unbindService(this);
                aVar.f26002b = false;
            }
            aVar.f26003c = null;
        }

        public final void m13869c(AbstractC7982e eVar) {
            m13862j();
            for (C7981a aVar : this.f25996M.values()) {
                aVar.f26004d.add(eVar);
                m13865g(aVar);
            }
        }

        public final void m13868d(ComponentName componentName) {
            C7981a aVar = this.f25996M.get(componentName);
            if (aVar != null) {
                m13865g(aVar);
            }
        }

        public final void m13867e(ComponentName componentName, IBinder iBinder) {
            C7981a aVar = this.f25996M.get(componentName);
            if (aVar != null) {
                aVar.f26003c = AbstractC0000a.AbstractBinderC0001a.m42619q(iBinder);
                aVar.f26005e = 0;
                m13865g(aVar);
            }
        }

        public final void m13866f(ComponentName componentName) {
            C7981a aVar = this.f25996M.get(componentName);
            if (aVar != null) {
                m13870b(aVar);
            }
        }

        public final void m13865g(C7981a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f26001a + ", " + aVar.f26004d.size() + " queued tasks");
            }
            if (!aVar.f26004d.isEmpty()) {
                if (!m13871a(aVar) || aVar.f26003c == null) {
                    m13863i(aVar);
                    return;
                }
                while (true) {
                    AbstractC7982e peek = aVar.f26004d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + peek);
                        }
                        peek.mo13861a(aVar.f26003c);
                        aVar.f26004d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + aVar.f26001a);
                        }
                    } catch (RemoteException e) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f26001a, e);
                    }
                }
                if (!aVar.f26004d.isEmpty()) {
                    m13863i(aVar);
                }
            }
        }

        public void m13864h(AbstractC7982e eVar) {
            this.f26000c.obtainMessage(0, eVar).sendToTarget();
        }

        @Override
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                m13869c((AbstractC7982e) message.obj);
                return true;
            } else if (i == 1) {
                C7979c cVar = (C7979c) message.obj;
                m13867e(cVar.f25994a, cVar.f25995b);
                return true;
            } else if (i == 2) {
                m13866f((ComponentName) message.obj);
                return true;
            } else if (i != 3) {
                return false;
            } else {
                m13868d((ComponentName) message.obj);
                return true;
            }
        }

        public final void m13863i(C7981a aVar) {
            if (!this.f26000c.hasMessages(3, aVar.f26001a)) {
                int i = aVar.f26005e + 1;
                aVar.f26005e = i;
                if (i > 6) {
                    Log.w("NotifManCompat", "Giving up on delivering " + aVar.f26004d.size() + " tasks to " + aVar.f26001a + " after " + aVar.f26005e + " retries");
                    aVar.f26004d.clear();
                    return;
                }
                int i2 = (1 << (i - 1)) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i2 + " ms");
                }
                this.f26000c.sendMessageDelayed(this.f26000c.obtainMessage(3, aVar.f26001a), i2);
            }
        }

        public final void m13862j() {
            Set<String> e = C7976k.m13876e(this.f25998a);
            if (!e.equals(this.f25997N)) {
                this.f25997N = e;
                List<ResolveInfo> queryIntentServices = this.f25998a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (e.contains(resolveInfo.serviceInfo.packageName)) {
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
                    if (!this.f25996M.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f25996M.put(componentName2, new C7981a(componentName2));
                    }
                }
                Iterator<Map.Entry<ComponentName, C7981a>> it = this.f25996M.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<ComponentName, C7981a> next = it.next();
                    if (!hashSet.contains(next.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + next.getKey());
                        }
                        m13870b(next.getValue());
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
            this.f26000c.obtainMessage(1, new C7979c(componentName, iBinder)).sendToTarget();
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f26000c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    public interface AbstractC7982e {
        void mo13861a(AbstractC0000a aVar);
    }

    public C7976k(Context context) {
        this.f25984a = context;
        this.f25985b = (NotificationManager) context.getSystemService("notification");
    }

    public static C7976k m13877d(Context context) {
        return new C7976k(context);
    }

    public static Set<String> m13876e(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f25979c) {
            if (string != null) {
                if (!string.equals(f25980d)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    f25981e = hashSet;
                    f25980d = string;
                }
            }
            set = f25981e;
        }
        return set;
    }

    public static boolean m13872i(Notification notification) {
        Bundle a = C7956h.m13999a(notification);
        return a != null && a.getBoolean("android.support.useSideChannel");
    }

    public boolean m13880a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return this.f25985b.areNotificationsEnabled();
        }
        if (i < 19) {
            return true;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f25984a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f25984a.getApplicationInfo();
        String packageName = this.f25984a.getApplicationContext().getPackageName();
        int i2 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i2), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public void m13879b(int i) {
        m13878c(null, i);
    }

    public void m13878c(String str, int i) {
        this.f25985b.cancel(str, i);
        if (Build.VERSION.SDK_INT <= 19) {
            m13873h(new C7977a(this.f25984a.getPackageName(), i, str));
        }
    }

    public void m13875f(int i, Notification notification) {
        m13874g(null, i, notification);
    }

    public void m13874g(String str, int i, Notification notification) {
        if (m13872i(notification)) {
            m13873h(new C7978b(this.f25984a.getPackageName(), i, str, notification));
            this.f25985b.cancel(str, i);
            return;
        }
        this.f25985b.notify(str, i, notification);
    }

    public final void m13873h(AbstractC7982e eVar) {
        synchronized (f25982f) {
            if (f25983g == null) {
                f25983g = new ServiceConnectionC7980d(this.f25984a.getApplicationContext());
            }
            f25983g.m13864h(eVar);
        }
    }
}
