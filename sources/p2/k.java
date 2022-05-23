package p2;

import android.content.Context;
import android.os.PowerManager;
import f2.j;
import java.util.HashMap;
import java.util.WeakHashMap;

public class k {
    public static final String f20432a = j.f("WakeLocks");
    public static final WeakHashMap<PowerManager.WakeLock, String> f20433b = new WeakHashMap<>();

    public static void a() {
        HashMap hashMap = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f20433b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                j.c().h(f20432a, String.format("WakeLock held for %s", hashMap.get(wakeLock)), new Throwable[0]);
            }
        }
    }

    public static PowerManager.WakeLock b(Context context, String str) {
        String str2 = "WorkManager: " + str;
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, str2);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f20433b;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, str2);
        }
        return newWakeLock;
    }
}
