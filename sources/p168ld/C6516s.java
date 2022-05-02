package p168ld;

import android.view.View;
import java.lang.ref.WeakReference;

public class C6516s {
    public WeakReference<AbstractC6515r> f20310a;

    public C6516s(AbstractC6515r rVar) {
        this.f20310a = new WeakReference<>(rVar);
    }

    public View m20181a(C6503j jVar) {
        AbstractC6515r rVar = this.f20310a.get();
        if (rVar != null) {
            return rVar.mo20185a(jVar);
        }
        return null;
    }

    public void m20180b(C6503j jVar) {
        AbstractC6515r rVar = this.f20310a.get();
        if (rVar != null) {
            rVar.mo20184c(jVar);
        }
    }

    public void m20179c(C6503j jVar, C6509o oVar) {
        AbstractC6515r rVar = this.f20310a.get();
        if (rVar != null) {
            rVar.mo20183d(jVar, oVar);
        }
    }

    public void m20178d(C6503j jVar, float f) {
        AbstractC6515r rVar = this.f20310a.get();
        if (rVar != null) {
            rVar.mo20182e(jVar, f);
        }
    }
}
