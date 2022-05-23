package u7;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.firebase.messaging.c;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n6.o;
import p0.h;
import r5.k;
import u7.a;

public class b {
    public final Executor f23602a;
    public final Context f23603b;
    public final c f23604c;

    public b(Context context, c cVar, Executor executor) {
        this.f23602a = executor;
        this.f23603b = context;
        this.f23604c = cVar;
    }

    public boolean a() {
        if (this.f23604c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        c0 d10 = d();
        a.C0221a d11 = a.d(this.f23603b, this.f23604c);
        e(d11.f23593a, d10);
        c(d11);
        return true;
    }

    public final boolean b() {
        if (((KeyguardManager) this.f23603b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!k.e()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f23603b.getSystemService("activity")).getRunningAppProcesses();
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

    public final void c(a.C0221a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f23603b.getSystemService("notification")).notify(aVar.f23594b, aVar.f23595c, aVar.f23593a.d());
    }

    public final c0 d() {
        c0 y02 = c0.y0(this.f23604c.p("gcm.n.image"));
        if (y02 != null) {
            y02.A0(this.f23602a);
        }
        return y02;
    }

    public final void e(h.e eVar, c0 c0Var) {
        if (c0Var != null) {
            try {
                Bitmap bitmap = (Bitmap) o.b(c0Var.z0(), 5L, TimeUnit.SECONDS);
                eVar.x(bitmap);
                eVar.I(new h.b().i(bitmap).h(null));
            } catch (InterruptedException unused) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                c0Var.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e10) {
                String valueOf = String.valueOf(e10.getCause());
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
