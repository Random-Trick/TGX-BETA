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
    public final Executor f28911a;
    public final Context f28912b;
    public final C3527c f28913c;

    public C9003b(Context context, C3527c cVar, Executor executor) {
        this.f28911a = executor;
        this.f28912b = context;
        this.f28913c = cVar;
    }

    public boolean m10721a() {
        if (this.f28913c.m30169a("gcm.n.noui")) {
            return true;
        }
        if (m10720b()) {
            return false;
        }
        C9006c0 d = m10718d();
        C9000a.C9001a d2 = C9000a.m10746d(this.f28912b, this.f28913c);
        m10717e(d2.f28902a, d);
        m10719c(d2);
        return true;
    }

    public final boolean m10720b() {
        if (((KeyguardManager) this.f28912b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!C8251k.m13034e()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f28912b.getSystemService("activity")).getRunningAppProcesses();
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

    public final void m10719c(C9000a.C9001a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f28912b.getSystemService("notification")).notify(aVar.f28903b, aVar.f28904c, aVar.f28902a.m13959d());
    }

    public final C9006c0 m10718d() {
        C9006c0 y0 = C9006c0.m10713y0(this.f28913c.m30154p("gcm.n.image"));
        if (y0 != null) {
            y0.m10716A0(this.f28911a);
        }
        return y0;
    }

    public final void m10717e(C7956h.C7965e eVar, C9006c0 c0Var) {
        if (c0Var != null) {
            try {
                Bitmap bitmap = (Bitmap) C6781o.m19053b(c0Var.m10712z0(), 5L, TimeUnit.SECONDS);
                eVar.m13939x(bitmap);
                eVar.m13968I(new C7956h.C7959b().m13983i(bitmap).m13984h(null));
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
