package p115i2;

import android.content.Context;
import androidx.work.impl.background.systemalarm.C1086a;
import p071f2.AbstractC4234j;
import p087g2.AbstractC4454e;
import p198o2.C7554p;

public class C5168b implements AbstractC4454e {
    public static final String f17281b = AbstractC4234j.m28360f("SystemAlarmScheduler");
    public final Context f17282a;

    public C5168b(Context context) {
        this.f17282a = context.getApplicationContext();
    }

    @Override
    public void mo21955a(C7554p... pVarArr) {
        for (C7554p pVar : pVarArr) {
            m23726b(pVar);
        }
    }

    public final void m23726b(C7554p pVar) {
        AbstractC4234j.m28362c().mo28359a(f17281b, String.format("Scheduling work with workSpecId %s", pVar.f24140a), new Throwable[0]);
        this.f17282a.startService(C1086a.m38432f(this.f17282a, pVar.f24140a));
    }

    @Override
    public boolean mo21953c() {
        return true;
    }

    @Override
    public void mo21951e(String str) {
        this.f17282a.startService(C1086a.m38431g(this.f17282a, str));
    }
}
