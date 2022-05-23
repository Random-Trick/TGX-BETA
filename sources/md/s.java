package md;

import android.view.View;
import java.lang.ref.WeakReference;

public class s {
    public WeakReference<r> f17470a;

    public s(r rVar) {
        this.f17470a = new WeakReference<>(rVar);
    }

    public View a(j jVar) {
        r rVar = this.f17470a.get();
        if (rVar != null) {
            return rVar.a(jVar);
        }
        return null;
    }

    public void b(j jVar) {
        r rVar = this.f17470a.get();
        if (rVar != null) {
            rVar.d(jVar);
        }
    }

    public void c(j jVar, o oVar) {
        r rVar = this.f17470a.get();
        if (rVar != null) {
            rVar.c(jVar, oVar);
        }
    }

    public void d(j jVar, float f10) {
        r rVar = this.f17470a.get();
        if (rVar != null) {
            rVar.f(jVar, f10);
        }
    }
}
