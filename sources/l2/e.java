package l2;

import android.content.Context;
import android.os.Build;
import f2.j;
import f2.k;
import k2.b;
import m2.g;
import o2.p;
import r2.a;

public class e extends c<b> {
    public static final String f16001e = j.f("NetworkMeteredCtrlr");

    public e(Context context, a aVar) {
        super(g.c(context, aVar).d());
    }

    @Override
    public boolean b(p pVar) {
        return pVar.f18599j.b() == k.METERED;
    }

    public boolean c(b bVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            return !bVar.a() || !bVar.b();
        }
        j.c().a(f16001e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !bVar.a();
    }
}
