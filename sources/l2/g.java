package l2;

import android.content.Context;
import android.os.Build;
import f2.k;
import k2.b;
import o2.p;
import r2.a;

public class g extends c<b> {
    public g(Context context, a aVar) {
        super(m2.g.c(context, aVar).d());
    }

    @Override
    public boolean b(p pVar) {
        return pVar.f18599j.b() == k.UNMETERED || (Build.VERSION.SDK_INT >= 30 && pVar.f18599j.b() == k.TEMPORARILY_UNMETERED);
    }

    public boolean c(b bVar) {
        return !bVar.a() || bVar.b();
    }
}
