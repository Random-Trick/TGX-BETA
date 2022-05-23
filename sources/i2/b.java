package i2;

import android.content.Context;
import androidx.work.impl.background.systemalarm.a;
import f2.j;
import g2.e;
import o2.p;

public class b implements e {
    public static final String f13925b = j.f("SystemAlarmScheduler");
    public final Context f13926a;

    public b(Context context) {
        this.f13926a = context.getApplicationContext();
    }

    @Override
    public void a(p... pVarArr) {
        for (p pVar : pVarArr) {
            b(pVar);
        }
    }

    public final void b(p pVar) {
        j.c().a(f13925b, String.format("Scheduling work with workSpecId %s", pVar.f18590a), new Throwable[0]);
        this.f13926a.startService(a.f(this.f13926a, pVar.f18590a));
    }

    @Override
    public boolean c() {
        return true;
    }

    @Override
    public void e(String str) {
        this.f13926a.startService(a.g(this.f13926a, str));
    }
}
