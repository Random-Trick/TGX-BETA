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
    public static String f25977d;
    public static ServiceConnectionC7980d f25980g;
    public final Context f25981a;
    public final NotificationManager f25982b;
    public static final Object f25976c = new Object();
    public static Set<String> f25978e = new HashSet();
    public static final Object f25979f = new Object();

    public static class C7977a implements AbstractC7982e {
        public final String f25983a;
        public final int f25984b;
        public final String f25985c;
        public final boolean f25986d = false;

        public C7977a(String str, int i, String str2) {
            this.f25983a = str;
            this.f25984b = i;
            this.f25985c = str2;
        }

        @Override
        public void mo13862a(AbstractC0000a aVar) {
            if (this.f25986d) {
                aVar.mo42613b0(this.f25983a);
            } else {
                aVar.mo42614G0(this.f25983a, this.f25984b, this.f25985c);
            }
        }

        public String toString() {
            return "CancelTask[packageName:" + this.f25983a + ", id:" + this.f25984b + ", tag:" + this.f25985c + ", all:" + this.f25986d + "]";
        }
    }

    public static class C7978b implements AbstractC7982e {
        public final String f25987a;
        public final int f25988b;
        public final String f25989c;
        public final Notification f25990d;

        public C7978b(String str, int i, String str2, Notification notification) {
            this.f25987a = str;
            this.f25988b = i;
            this.f25989c = str2;
            this.f25990d = notification;
        }

        @Override
        public void mo13862a(AbstractC0000a aVar) {
            aVar.mo42612s1(this.f25987a, this.f25988b, this.f25989c, this.f25990d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f25987a + ", id:" + this.f25988b + ", tag:" + this.f25989c + "]";
        }
    }

    public static class C7979c {
        public final ComponentName f25991a;
        public final IBinder f25992b;

        public C7979c(ComponentName componentName, IBinder iBinder) {
            this.f25991a = componentName;
            this.f25992b = iBinder;
        }
    }

    public static class ServiceConnectionC7980d implements Handler.Callback, ServiceConnection {
        public final Map<ComponentName, C7981a> f25993M = new HashMap();
        public Set<String> f25994N = new HashSet();
        public final Context f25995a;
        public final HandlerThread f25996b;
        public final Handler f25997c;

        public static class C7981a {
            public final ComponentName f25998a;
            public AbstractC0000a f26000c;
            public boolean f25999b = false;
            public ArrayDeque<AbstractC7982e> f26001d = new ArrayDeque<>();
            public int f26002e = 0;

            public C7981a(ComponentName componentName) {
                this.f25998a = componentName;
            }
        }

        public ServiceConnectionC7980d(Context context) {
            this.f25995a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f25996b = handlerThread;
            handlerThread.start();
            this.f25997c = new Handler(handlerThread.getLooper(), this);
        }

        public final boolean m13872a(C7981a aVar) {
            if (aVar.f25999b) {
                return true;
            }
            boolean bindService = this.f25995a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f25998a), this, 33);
            aVar.f25999b = bindService;
            if (bindService) {
                aVar.f26002e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f25998a);
                this.f25995a.unbindService(this);
            }
            return aVar.f25999b;
        }

        public final void m13871b(C7981a aVar) {
            if (aVar.f25999b) {
                this.f25995a.unbindService(this);
                aVar.f25999b = false;
            }
            aVar.f26000c = null;
        }

        public final void m13870c(AbstractC7982e eVar) {
            m13863j();
            for (C7981a aVar : this.f25993M.values()) {
                aVar.f26001d.add(eVar);
                m13866g(aVar);
            }
        }

        public final void m13869d(ComponentName componentName) {
            C7981a aVar = this.f25993M.get(componentName);
            if (aVar != null) {
                m13866g(aVar);
            }
        }

        public final void m13868e(ComponentName componentName, IBinder iBinder) {
            C7981a aVar = this.f25993M.get(componentName);
            if (aVar != null) {
                aVar.f26000c = AbstractC0000a.AbstractBinderC0001a.m42616q(iBinder);
                aVar.f26002e = 0;
                m13866g(aVar);
            }
        }

        public final void m13867f(ComponentName componentName) {
            C7981a aVar = this.f25993M.get(componentName);
            if (aVar != null) {
                m13871b(aVar);
            }
        }

        public final void m13866g(C7981a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f25998a + ", " + aVar.f26001d.size() + " queued tasks");
            }
            if (!aVar.f26001d.isEmpty()) {
                if (!m13872a(aVar) || aVar.f26000c == null) {
                    m13864i(aVar);
                    return;
                }
                while (true) {
                    AbstractC7982e peek = aVar.f26001d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + peek);
                        }
                        peek.mo13862a(aVar.f26000c);
                        aVar.f26001d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + aVar.f25998a);
                        }
                    } catch (RemoteException e) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f25998a, e);
                    }
                }
                if (!aVar.f26001d.isEmpty()) {
                    m13864i(aVar);
                }
            }
        }

        public void m13865h(AbstractC7982e eVar) {
            this.f25997c.obtainMessage(0, eVar).sendToTarget();
        }

        @Override
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                m13870c((AbstractC7982e) message.obj);
                return true;
            } else if (i == 1) {
                C7979c cVar = (C7979c) message.obj;
                m13868e(cVar.f25991a, cVar.f25992b);
                return true;
            } else if (i == 2) {
                m13867f((ComponentName) message.obj);
                return true;
            } else if (i != 3) {
                return false;
            } else {
                m13869d((ComponentName) message.obj);
                return true;
            }
        }

        public final void m13864i(C7981a aVar) {
            if (!this.f25997c.hasMessages(3, aVar.f25998a)) {
                int i = aVar.f26002e + 1;
                aVar.f26002e = i;
                if (i > 6) {
                    Log.w("NotifManCompat", "Giving up on delivering " + aVar.f26001d.size() + " tasks to " + aVar.f25998a + " after " + aVar.f26002e + " retries");
                    aVar.f26001d.clear();
                    return;
                }
                int i2 = (1 << (i - 1)) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i2 + " ms");
                }
                this.f25997c.sendMessageDelayed(this.f25997c.obtainMessage(3, aVar.f25998a), i2);
            }
        }

        public final void m13863j() {
            Set<String> e = C7976k.m13877e(this.f25995a);
            if (!e.equals(this.f25994N)) {
                this.f25994N = e;
                List<ResolveInfo> queryIntentServices = this.f25995a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
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
                    if (!this.f25993M.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f25993M.put(componentName2, new C7981a(componentName2));
                    }
                }
                Iterator<Map.Entry<ComponentName, C7981a>> it = this.f25993M.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<ComponentName, C7981a> next = it.next();
                    if (!hashSet.contains(next.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + next.getKey());
                        }
                        m13871b(next.getValue());
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
            this.f25997c.obtainMessage(1, new C7979c(componentName, iBinder)).sendToTarget();
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f25997c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    public interface AbstractC7982e {
        void mo13862a(AbstractC0000a aVar);
    }

    public C7976k(Context context) {
        this.f25981a = context;
        this.f25982b = (NotificationManager) context.getSystemService("notification");
    }

    public static C7976k m13878d(Context context) {
        return new C7976k(context);
    }

    public static Set<String> m13877e(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f25976c) {
            if (string != null) {
                if (!string.equals(f25977d)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    f25978e = hashSet;
                    f25977d = string;
                }
            }
            set = f25978e;
        }
        return set;
    }

    public static boolean m13873i(Notification notification) {
        Bundle a = C7956h.m14000a(notification);
        return a != null && a.getBoolean("android.support.useSideChannel");
    }

    public boolean m13881a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return this.f25982b.areNotificationsEnabled();
        }
        if (i < 19) {
            return true;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f25981a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f25981a.getApplicationInfo();
        String packageName = this.f25981a.getApplicationContext().getPackageName();
        int i2 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i2), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public void m13880b(int i) {
        m13879c(null, i);
    }

    public void m13879c(String str, int i) {
        this.f25982b.cancel(str, i);
        if (Build.VERSION.SDK_INT <= 19) {
            m13874h(new C7977a(this.f25981a.getPackageName(), i, str));
        }
    }

    public void m13876f(int i, Notification notification) {
        m13875g(null, i, notification);
    }

    public void m13875g(String str, int i, Notification notification) {
        if (m13873i(notification)) {
            m13874h(new C7978b(this.f25981a.getPackageName(), i, str, notification));
            this.f25982b.cancel(str, i);
            return;
        }
        this.f25982b.notify(str, i, notification);
    }

    public final void m13874h(AbstractC7982e eVar) {
        synchronized (f25979f) {
            if (f25980g == null) {
                f25980g = new ServiceConnectionC7980d(this.f25981a.getApplicationContext());
            }
            f25980g.m13865h(eVar);
        }
    }
}
