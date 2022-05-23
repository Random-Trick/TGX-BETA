package l2;

import android.content.Context;
import android.os.Build;
import f2.j;
import f2.k;
import k2.b;
import m2.g;
import o2.p;
import r2.a;

public class f extends c<b> {
    public static final String f16002e = j.f("NetworkNotRoamingCtrlr");

    public f(Context context, a aVar) {
        super(g.c(context, aVar).d());
    }

    @Override
    public boolean b(p pVar) {
        return pVar.f18599j.b() == k.NOT_ROAMING;
    }

    public boolean c(b bVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            return !bVar.a() || !bVar.c();
        }
        j.c().a(f16002e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
        return !bVar.a();
    }
}
