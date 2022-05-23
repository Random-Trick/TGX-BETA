package o6;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.install.b;
import r6.a;
import w6.e;

public final class j implements b {
    public final u f19234a;
    public final g f19235b;
    public final Context f19236c;
    public final Handler f19237d = new Handler(Looper.getMainLooper());

    public j(u uVar, g gVar, Context context) {
        this.f19234a = uVar;
        this.f19235b = gVar;
        this.f19236c = context;
    }

    @Override
    public final e<Void> a() {
        return this.f19234a.f(this.f19236c.getPackageName());
    }

    @Override
    public final boolean b(a aVar, int i10, Activity activity, int i11) {
        d c10 = d.c(i10);
        if (activity == null) {
            return false;
        }
        return f(aVar, new i(this, activity), c10, i11);
    }

    @Override
    public final e<a> c() {
        return this.f19234a.g(this.f19236c.getPackageName());
    }

    @Override
    public final synchronized void d(b bVar) {
        this.f19235b.c(bVar);
    }

    @Override
    public final synchronized void e(b bVar) {
        this.f19235b.e(bVar);
    }

    public final boolean f(a aVar, a aVar2, d dVar, int i10) {
        if (aVar == null || aVar2 == null || dVar == null || !aVar.e(dVar) || aVar.k()) {
            return false;
        }
        aVar.j();
        aVar2.a(aVar.h(dVar).getIntentSender(), i10, null, 0, 0, 0, null);
        return true;
    }
}
