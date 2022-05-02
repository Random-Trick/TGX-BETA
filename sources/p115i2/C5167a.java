package p115i2;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.C1086a;
import org.thunderdog.challegram.Log;
import p071f2.AbstractC4234j;
import p087g2.C4458i;
import p198o2.AbstractC7540h;
import p198o2.C7539g;
import p215p2.C7996c;

public class C5167a {
    public static final String f17280a = AbstractC4234j.m28362f("Alarms");

    public static void m23731a(Context context, C4458i iVar, String str) {
        AbstractC7540h A = iVar.m27589s().mo38460A();
        C7539g c = A.mo15711c(str);
        if (c != null) {
            m23730b(context, str, c.f24121b);
            AbstractC4234j.m28364c().mo28361a(f17280a, String.format("Removing SystemIdInfo for workSpecId (%s)", str), new Throwable[0]);
            A.mo15710d(str);
        }
    }

    public static void m23730b(Context context, String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, C1086a.m38438b(context, str), Build.VERSION.SDK_INT >= 23 ? 603979776 : Log.TAG_TDLIB_FILES);
        if (service != null && alarmManager != null) {
            AbstractC4234j.m28364c().mo28361a(f17280a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i)), new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    public static void m23729c(Context context, C4458i iVar, String str, long j) {
        WorkDatabase s = iVar.m27589s();
        AbstractC7540h A = s.mo38460A();
        C7539g c = A.mo15711c(str);
        if (c != null) {
            m23730b(context, str, c.f24121b);
            m23728d(context, str, c.f24121b, j);
            return;
        }
        int b = new C7996c(s).m13808b();
        A.mo15712b(new C7539g(str, b));
        m23728d(context, str, b, j);
    }

    public static void m23728d(Context context, String str, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i2 = Build.VERSION.SDK_INT;
        PendingIntent service = PendingIntent.getService(context, i, C1086a.m38438b(context, str), i2 >= 23 ? 201326592 : 134217728);
        if (alarmManager == null) {
            return;
        }
        if (i2 >= 19) {
            alarmManager.setExact(0, j, service);
        } else {
            alarmManager.set(0, j, service);
        }
    }
}
