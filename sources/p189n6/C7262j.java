package p189n6;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.install.AbstractC3506b;
import p233q6.AbstractC8257a;
import p300v6.AbstractC9854e;

public final class C7262j implements AbstractC7250b {
    public final C7273u f23094a;
    public final C7259g f23095b;
    public final Context f23096c;
    public final Handler f23097d = new Handler(Looper.getMainLooper());

    public C7262j(C7273u uVar, C7259g gVar, Context context) {
        this.f23094a = uVar;
        this.f23095b = gVar;
        this.f23096c = context;
    }

    @Override
    public final AbstractC9854e<Void> mo17186a() {
        return this.f23094a.m17173f(this.f23096c.getPackageName());
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
        return this.f23094a.m17172g(this.f23096c.getPackageName());
    }

    @Override
    public final synchronized void mo17183d(AbstractC3506b bVar) {
        this.f23095b.m10754c(bVar);
    }

    @Override
    public final synchronized void mo17182e(AbstractC3506b bVar) {
        this.f23095b.m10752e(bVar);
    }

    public final boolean m17181f(C7248a aVar, AbstractC8257a aVar2, AbstractC7254d dVar, int i) {
        if (aVar == null || aVar2 == null || dVar == null || !aVar.m17203e(dVar) || aVar.m17197k()) {
            return false;
        }
        aVar.m17198j();
        aVar2.mo13021a(aVar.m17200h(dVar).getIntentSender(), i, null, 0, 0, 0, null);
        return true;
    }
}
