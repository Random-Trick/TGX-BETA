package i2;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import f2.j;
import g2.i;
import o2.g;
import o2.h;
import org.thunderdog.challegram.Log;
import p2.c;

public class a {
    public static final String f13924a = j.f("Alarms");

    public static void a(Context context, i iVar, String str) {
        h A = iVar.s().A();
        g c10 = A.c(str);
        if (c10 != null) {
            b(context, str, c10.f18568b);
            j.c().a(f13924a, String.format("Removing SystemIdInfo for workSpecId (%s)", str), new Throwable[0]);
            A.d(str);
        }
    }

    public static void b(Context context, String str, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, androidx.work.impl.background.systemalarm.a.b(context, str), Build.VERSION.SDK_INT >= 23 ? 603979776 : Log.TAG_TDLIB_FILES);
        if (service != null && alarmManager != null) {
            j.c().a(f13924a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i10)), new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    public static void c(Context context, i iVar, String str, long j10) {
        WorkDatabase s10 = iVar.s();
        h A = s10.A();
        g c10 = A.c(str);
        if (c10 != null) {
            b(context, str, c10.f18568b);
            d(context, str, c10.f18568b, j10);
            return;
        }
        int b10 = new c(s10).b();
        A.b(new g(str, b10));
        d(context, str, b10, j10);
    }

    public static void d(Context context, String str, int i10, long j10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, androidx.work.impl.background.systemalarm.a.b(context, str), Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
        if (alarmManager != null) {
            alarmManager.setExact(0, j10, service);
        }
    }
}
