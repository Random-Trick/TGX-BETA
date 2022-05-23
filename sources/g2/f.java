package g2;

import android.content.Context;
import android.os.Build;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import f2.j;
import j2.b;
import java.util.List;
import o2.p;
import o2.q;
import p2.e;

public class f {
    public static final String f12031a = j.f("Schedulers");

    public static e a(Context context, i iVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            b bVar = new b(context, iVar);
            e.a(context, SystemJobService.class, true);
            j.c().a(f12031a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return bVar;
        }
        e c10 = c(context);
        if (c10 != null) {
            return c10;
        }
        i2.b bVar2 = new i2.b(context);
        e.a(context, SystemAlarmService.class, true);
        j.c().a(f12031a, "Created SystemAlarmScheduler", new Throwable[0]);
        return bVar2;
    }

    public static void b(a aVar, WorkDatabase workDatabase, List<e> list) {
        if (list != null && list.size() != 0) {
            q D = workDatabase.D();
            workDatabase.c();
            try {
                List<p> e10 = D.e(aVar.h());
                List<p> u10 = D.u(200);
                if (e10 != null && e10.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (p pVar : e10) {
                        D.b(pVar.f18590a, currentTimeMillis);
                    }
                }
                workDatabase.t();
                if (e10 != null && e10.size() > 0) {
                    p[] pVarArr = (p[]) e10.toArray(new p[e10.size()]);
                    for (e eVar : list) {
                        if (eVar.c()) {
                            eVar.a(pVarArr);
                        }
                    }
                }
                if (u10 != null && u10.size() > 0) {
                    p[] pVarArr2 = (p[]) u10.toArray(new p[u10.size()]);
                    for (e eVar2 : list) {
                        if (!eVar2.c()) {
                            eVar2.a(pVarArr2);
                        }
                    }
                }
            } finally {
                workDatabase.g();
            }
        }
    }

    public static e c(Context context) {
        try {
            e eVar = (e) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(context);
            j.c().a(f12031a, String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler"), new Throwable[0]);
            return eVar;
        } catch (Throwable th) {
            j.c().a(f12031a, "Unable to create GCM Scheduler", th);
            return null;
        }
    }
}
