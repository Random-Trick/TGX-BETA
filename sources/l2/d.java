package l2;

import android.content.Context;
import android.os.Build;
import f2.k;
import k2.b;
import m2.g;
import o2.p;
import r2.a;

public class d extends c<b> {
    public d(Context context, a aVar) {
        super(g.c(context, aVar).d());
    }

    @Override
    public boolean b(p pVar) {
        return pVar.f18599j.b() == k.CONNECTED;
    }

    public boolean c(b bVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            return !bVar.a() || !bVar.d();
        }
        return !bVar.a();
    }
}
