package p189n6;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.install.AbstractC3506b;
import p233q6.AbstractC8257a;
import p300v6.AbstractC9854e;

public final class C7262j implements AbstractC7250b {
    public final C7273u f23097a;
    public final C7259g f23098b;
    public final Context f23099c;
    public final Handler f23100d = new Handler(Looper.getMainLooper());

    public C7262j(C7273u uVar, C7259g gVar, Context context) {
        this.f23097a = uVar;
        this.f23098b = gVar;
        this.f23099c = context;
    }

    @Override
    public final AbstractC9854e<Void> mo17186a() {
        return this.f23097a.m17173f(this.f23099c.getPackageName());
    }

    @Override
    public final boolean mo17185b(C7248a aVar, int i, Activity activity, int i2) {
        AbstractC7254d c = AbstractC7254d.m17190c(i);
        if (activity == null) {
            return false;
        }
        return m17181f(aVar, new C7261i(this, activity), c, i2);
    }

    @Override
    public final AbstractC9854e<C7248a> mo17184c() {
        return this.f23097a.m17172g(this.f23099c.getPackageName());
    }

    @Override
    public final synchronized void mo17183d(AbstractC3506b bVar) {
        this.f23098b.m10753c(bVar);
    }

    @Override
    public final synchronized void mo17182e(AbstractC3506b bVar) {
        this.f23098b.m10751e(bVar);
    }

    public final boolean m17181f(C7248a aVar, AbstractC8257a aVar2, AbstractC7254d dVar, int i) {
        if (aVar == null || aVar2 == null || dVar == null || !aVar.m17203e(dVar) || aVar.m17197k()) {
            return false;
        }
        aVar.m17198j();
        aVar2.mo13020a(aVar.m17200h(dVar).getIntentSender(), i, null, 0, 0, 0, null);
        return true;
    }
}
