package p274t7;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.firebase.messaging.C3527c;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p177m6.C6781o;
import p213p0.C7956h;
import p232q5.C8251k;
import p274t7.C9000a;

public class C9003b {
    public final Executor f28914a;
    public final Context f28915b;
    public final C3527c f28916c;

    public C9003b(Context context, C3527c cVar, Executor executor) {
        this.f28914a = executor;
        this.f28915b = context;
        this.f28916c = cVar;
    }

    public boolean m10720a() {
        if (this.f28916c.m30171a("gcm.n.noui")) {
            return true;
        }
        if (m10719b()) {
            return false;
        }
        C9006c0 d = m10717d();
        C9000a.C9001a d2 = C9000a.m10745d(this.f28915b, this.f28916c);
        m10716e(d2.f28905a, d);
        m10718c(d2);
        return true;
    }

    public final boolean m10719b() {
        if (((KeyguardManager) this.f28915b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!C8251k.m13033e()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f28915b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == myPid) {
                    if (next.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void m10718c(C9000a.C9001a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f28915b.getSystemService("notification")).notify(aVar.f28906b, aVar.f28907c, aVar.f28905a.m13958d());
    }

    public final C9006c0 m10717d() {
        C9006c0 y0 = C9006c0.m10712y0(this.f28916c.m30156p("gcm.n.image"));
        if (y0 != null) {
            y0.m10715A0(this.f28914a);
        }
        return y0;
    }

    public final void m10716e(C7956h.C7965e eVar, C9006c0 c0Var) {
        if (c0Var != null) {
            try {
                Bitmap bitmap = (Bitmap) C6781o.m19054b(c0Var.m10711z0(), 5L, TimeUnit.SECONDS);
                eVar.m13938x(bitmap);
                eVar.m13967I(new C7956h.C7959b().m13982i(bitmap).m13983h(null));
            } catch (InterruptedException unused) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                c0Var.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                String valueOf = String.valueOf(e.getCause());
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 26);
                sb2.append("Failed to download image: ");
                sb2.append(valueOf);
                Log.w("FirebaseMessaging", sb2.toString());
            } catch (TimeoutException unused2) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                c0Var.close();
            }
        }
    }
}
