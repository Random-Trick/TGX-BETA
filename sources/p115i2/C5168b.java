package p115i2;

import android.content.Context;
import androidx.work.impl.background.systemalarm.C1086a;
import p071f2.AbstractC4234j;
import p087g2.AbstractC4454e;
import p198o2.C7554p;

public class C5168b implements AbstractC4454e {
    public static final String f17281b = AbstractC4234j.m28362f("SystemAlarmScheduler");
    public final Context f17282a;

    public C5168b(Context context) {
        this.f17282a = context.getApplicationContext();
    }

    @Override
    public void mo21956a(C7554p... pVarArr) {
        for (C7554p pVar : pVarArr) {
            m23727b(pVar);
        }
    }

    public final void m23727b(C7554p pVar) {
        AbstractC4234j.m28364c().mo28361a(f17281b, String.format("Scheduling work with workSpecId %s", pVar.f24143a), new Throwable[0]);
        this.f17282a.startService(C1086a.m38435f(this.f17282a, pVar.f24143a));
    }

    @Override
    public boolean mo21954c() {
        return true;
    }

    @Override
    public void mo21952e(String str) {
        this.f17282a.startService(C1086a.m38434g(this.f17282a, str));
    }
}
