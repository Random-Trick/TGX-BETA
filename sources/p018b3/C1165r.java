package p018b3;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import p088g3.AbstractC4467e;
import p100h3.C4944m;
import p100h3.C4948q;
import p146k3.AbstractC6045a;
import p339y2.AbstractC10357g;
import p339y2.AbstractC10358h;
import p339y2.C10352b;

public class C1165r implements AbstractC1164q {
    public static volatile AbstractC1166s f4392e;
    public final AbstractC6045a f4393a;
    public final AbstractC6045a f4394b;
    public final AbstractC4467e f4395c;
    public final C4944m f4396d;

    public C1165r(AbstractC6045a aVar, AbstractC6045a aVar2, AbstractC4467e eVar, C4944m mVar, C4948q qVar) {
        this.f4393a = aVar;
        this.f4394b = aVar2;
        this.f4395c = eVar;
        this.f4396d = mVar;
        qVar.m24398c();
    }

    public static C1165r m38250c() {
        AbstractC1166s sVar = f4392e;
        if (sVar != null) {
            return sVar.mo38244t();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static Set<C10352b> m38249d(AbstractC1147e eVar) {
        if (eVar instanceof AbstractC1148f) {
            return Collections.unmodifiableSet(((AbstractC1148f) eVar).mo1185a());
        }
        return Collections.singleton(C10352b.m5368b("proto"));
    }

    public static void m38247f(Context context) {
        if (f4392e == null) {
            synchronized (C1165r.class) {
                if (f4392e == null) {
                    f4392e = C1144d.m38310y0().mo38242b(context).mo38243a();
                }
            }
        }
    }

    @Override
    public void mo38252a(AbstractC1157l lVar, AbstractC10358h hVar) {
        this.f4395c.mo27554a(lVar.mo38272f().m38260e(lVar.mo38275c().mo5365c()), m38251b(lVar), hVar);
    }

    public final AbstractC1150h m38251b(AbstractC1157l lVar) {
        return AbstractC1150h.m38305a().mo38285i(this.f4393a.mo21442a()).mo38283k(this.f4394b.mo21442a()).mo38284j(lVar.mo38271g()).mo38286h(new C1149g(lVar.mo38276b(), lVar.m38274d())).mo38287g(lVar.mo38275c().mo5367a()).mo38290d();
    }

    public C4944m m38248e() {
        return this.f4396d;
    }

    public AbstractC10357g m38246g(AbstractC1147e eVar) {
        return new C1161n(m38249d(eVar), AbstractC1159m.m38264a().mo38258b(eVar.mo1184b()).mo38257c(eVar.mo1183c()).mo38259a(), this);
    }
}
