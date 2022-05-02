package p164l6;

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
import p163l5.C6378r;
import p201o5.C7654a;
import p232q5.C8253m;
import p232q5.C8254n;

@ThreadSafe
public class C6402a {
    public static ScheduledExecutorService f20050n;
    public static volatile AbstractC6403a f20051o = new C6404b();
    public final Object f20052a;
    public final PowerManager.WakeLock f20053b;
    public WorkSource f20054c;
    public final int f20055d;
    public final String f20056e;
    public final String f20057f;
    public final String f20058g;
    public final Context f20059h;
    public boolean f20060i;
    public final Map<String, Integer[]> f20061j;
    public final Set<Future<?>> f20062k;
    public int f20063l;
    public AtomicInteger f20064m;

    public interface AbstractC6403a {
    }

    public C6402a(Context context, int i, String str) {
        this(context, i, str, null, context == null ? null : context.getPackageName());
    }

    public void m20467a(long r14) {
        throw new UnsupportedOperationException("Method not decompiled: p164l6.C6402a.m20467a(long):void");
    }

    public void m20466b() {
        throw new UnsupportedOperationException("Method not decompiled: p164l6.C6402a.m20466b():void");
    }

    public void m20465c(boolean z) {
        this.f20053b.setReferenceCounted(z);
        this.f20060i = z;
    }

    public final String m20464d(String str) {
        return (!this.f20060i || TextUtils.isEmpty(str)) ? this.f20057f : str;
    }

    public final List<String> m20463e() {
        return C8254n.m13025b(this.f20054c);
    }

    public final void m20462f(int i) {
        if (this.f20053b.isHeld()) {
            try {
                this.f20053b.release();
            } catch (RuntimeException e) {
                if (e.getClass().equals(RuntimeException.class)) {
                    Log.e("WakeLock", String.valueOf(this.f20056e).concat(" was already released!"), e);
                } else {
                    throw e;
                }
            }
            this.f20053b.isHeld();
        }
    }

    public C6402a(Context context, int i, String str, String str2, String str3) {
        this(context, i, str, null, str3, null);
    }

    @SuppressLint({"UnwrappedWakeLock"})
    public C6402a(Context context, int i, String str, String str2, String str3, String str4) {
        this.f20052a = this;
        this.f20060i = true;
        this.f20061j = new HashMap();
        this.f20062k = Collections.synchronizedSet(new HashSet());
        this.f20064m = new AtomicInteger(0);
        C6378r.m20506l(context, "WakeLock: context must not be null");
        C6378r.m20510h(str, "WakeLock: wakeLockName must not be empty");
        this.f20055d = i;
        this.f20057f = null;
        this.f20058g = null;
        Context applicationContext = context.getApplicationContext();
        this.f20059h = applicationContext;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            this.f20056e = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        } else {
            this.f20056e = str;
        }
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(i, str);
        this.f20053b = newWakeLock;
        if (C8254n.m13024c(context)) {
            WorkSource a = C8254n.m13026a(context, C8253m.m13027a(str3) ? context.getPackageName() : str3);
            this.f20054c = a;
            if (a != null && C8254n.m13024c(applicationContext)) {
                WorkSource workSource = this.f20054c;
                if (workSource != null) {
                    workSource.add(a);
                } else {
                    this.f20054c = a;
                }
                try {
                    newWakeLock.setWorkSource(this.f20054c);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                    Log.wtf("WakeLock", e.toString());
                }
            }
        }
        if (f20050n == null) {
            f20050n = C7654a.m15283a().mo15282a();
        }
    }
}
