package p168ld;

import android.view.View;
import java.lang.ref.WeakReference;

public class C6516s {
    public WeakReference<AbstractC6515r> f20310a;

    public C6516s(AbstractC6515r rVar) {
        this.f20310a = new WeakReference<>(rVar);
    }

    public View m20180a(C6503j jVar) {
        AbstractC6515r rVar = this.f20310a.get();
        if (rVar != null) {
            return rVar.mo20184a(jVar);
        }
        return null;
    }

    public void m20179b(C6503j jVar) {
        AbstractC6515r rVar = this.f20310a.get();
        if (rVar != null) {
            rVar.mo20183c(jVar);
        }
    }

    public void m20178c(C6503j jVar, C6509o oVar) {
        AbstractC6515r rVar = this.f20310a.get();
        if (rVar != null) {
            rVar.mo20182d(jVar, oVar);
        }
    }

    public void m20177d(C6503j jVar, float f) {
        AbstractC6515r rVar = this.f20310a.get();
        if (rVar != null) {
            rVar.mo20181e(jVar, f);
        }
    }
}
