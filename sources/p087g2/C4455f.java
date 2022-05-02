package p087g2;

import android.content.Context;
import android.os.Build;
import androidx.work.C1066a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.List;
import p071f2.AbstractC4234j;
import p115i2.C5168b;
import p130j2.C5841b;
import p198o2.AbstractC7558q;
import p198o2.C7554p;
import p215p2.C8000e;

public class C4455f {
    public static final String f14733a = AbstractC4234j.m28360f("Schedulers");

    public static AbstractC4454e m27625a(Context context, C4458i iVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            C5841b bVar = new C5841b(context, iVar);
            C8000e.m13804a(context, SystemJobService.class, true);
            AbstractC4234j.m28362c().mo28359a(f14733a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return bVar;
        }
        AbstractC4454e c = m27623c(context);
        if (c != null) {
            return c;
        }
        C5168b bVar2 = new C5168b(context);
        C8000e.m13804a(context, SystemAlarmService.class, true);
        AbstractC4234j.m28362c().mo28359a(f14733a, "Created SystemAlarmScheduler", new Throwable[0]);
        return bVar2;
    }

    public static void m27624b(C1066a aVar, WorkDatabase workDatabase, List<AbstractC4454e> list) {
        if (list != null && list.size() != 0) {
            AbstractC7558q D = workDatabase.mo38454D();
            workDatabase.m8731c();
            try {
                List<C7554p> e = D.mo15690e(aVar.m38488h());
                List<C7554p> u = D.mo15674u(200);
                if (e != null && e.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (C7554p pVar : e) {
                        D.mo15693b(pVar.f24140a, currentTimeMillis);
                    }
                }
                workDatabase.m8714t();
                if (e != null && e.size() > 0) {
                    C7554p[] pVarArr = (C7554p[]) e.toArray(new C7554p[e.size()]);
                    for (AbstractC4454e eVar : list) {
                        if (eVar.mo21953c()) {
                            eVar.mo21955a(pVarArr);
                        }
                    }
                }
                if (u != null && u.size() > 0) {
                    C7554p[] pVarArr2 = (C7554p[]) u.toArray(new C7554p[u.size()]);
                    for (AbstractC4454e eVar2 : list) {
                        if (!eVar2.mo21953c()) {
                            eVar2.mo21955a(pVarArr2);
                        }
                    }
                }
            } finally {
                workDatabase.m8727g();
            }
        }
    }

    public static AbstractC4454e m27623c(Context context) {
        try {
            AbstractC4454e eVar = (AbstractC4454e) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(context);
            AbstractC4234j.m28362c().mo28359a(f14733a, String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler"), new Throwable[0]);
            return eVar;
        } catch (Throwable th) {
            AbstractC4234j.m28362c().mo28359a(f14733a, "Unable to create GCM Scheduler", th);
            return null;
        }
    }
}
