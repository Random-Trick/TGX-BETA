package m6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.ThreadSafe;
import m5.r;
import r5.m;
import r5.n;

@ThreadSafe
public class a {
    public static ScheduledExecutorService f17285n;
    public static volatile AbstractC0155a f17286o = new b();
    public final Object f17287a;
    public final PowerManager.WakeLock f17288b;
    public WorkSource f17289c;
    public final int f17290d;
    public final String f17291e;
    public final String f17292f;
    public final String f17293g;
    public final Context f17294h;
    public boolean f17295i;
    public final Map<String, Integer[]> f17296j;
    public final Set<Future<?>> f17297k;
    public int f17298l;
    public AtomicInteger f17299m;

    public interface AbstractC0155a {
    }

    public a(Context context, int i10, String str) {
        this(context, i10, str, null, context == null ? null : context.getPackageName());
    }

    public void a(long r14) {
        throw new UnsupportedOperationException("Method not decompiled: m6.a.a(long):void");
    }

    public void b() {
        throw new UnsupportedOperationException("Method not decompiled: m6.a.b():void");
    }

    public void c(boolean z10) {
        this.f17288b.setReferenceCounted(z10);
        this.f17295i = z10;
    }

    public final String d(String str) {
        return (!this.f17295i || TextUtils.isEmpty(str)) ? this.f17292f : str;
    }

    public final List<String> e() {
        return n.b(this.f17289c);
    }

    public final void f(int i10) {
        if (this.f17288b.isHeld()) {
            try {
                this.f17288b.release();
            } catch (RuntimeException e10) {
                if (e10.getClass().equals(RuntimeException.class)) {
                    Log.e("WakeLock", String.valueOf(this.f17291e).concat(" was already released!"), e10);
                } else {
                    throw e10;
                }
            }
            this.f17288b.isHeld();
        }
    }

    public a(Context context, int i10, String str, String str2, String str3) {
        this(context, i10, str, null, str3, null);
    }

    @SuppressLint({"UnwrappedWakeLock"})
    public a(Context context, int i10, String str, String str2, String str3, String str4) {
        this.f17287a = this;
        this.f17295i = true;
        this.f17296j = new HashMap();
        this.f17297k = Collections.synchronizedSet(new HashSet());
        this.f17299m = new AtomicInteger(0);
        r.l(context, "WakeLock: context must not be null");
        r.h(str, "WakeLock: wakeLockName must not be empty");
        this.f17290d = i10;
        this.f17292f = null;
        this.f17293g = null;
        Context applicationContext = context.getApplicationContext();
        this.f17294h = applicationContext;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            this.f17291e = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        } else {
            this.f17291e = str;
        }
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(i10, str);
        this.f17288b = newWakeLock;
        if (n.c(context)) {
            WorkSource a10 = n.a(context, m.a(str3) ? context.getPackageName() : str3);
            this.f17289c = a10;
            if (a10 != null && n.c(applicationContext)) {
                WorkSource workSource = this.f17289c;
                if (workSource != null) {
                    workSource.add(a10);
                } else {
                    this.f17289c = a10;
                }
                try {
                    newWakeLock.setWorkSource(this.f17289c);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
                    Log.wtf("WakeLock", e10.toString());
                }
            }
        }
        if (f17285n == null) {
            f17285n = p5.a.a().a();
        }
    }
}
