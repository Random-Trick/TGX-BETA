package p160l2;

import android.content.Context;
import android.os.Build;
import p071f2.EnumC4236k;
import p145k2.C6042b;
import p173m2.C6552g;
import p198o2.C7554p;
import p243r2.AbstractC8354a;

public class C6305g extends AbstractC6300c<C6042b> {
    public C6305g(Context context, AbstractC8354a aVar) {
        super(C6552g.m20121c(context, aVar).m20120d());
    }

    @Override
    public boolean mo20692b(C7554p pVar) {
        return pVar.f24152j.m28396b() == EnumC4236k.UNMETERED || (Build.VERSION.SDK_INT >= 30 && pVar.f24152j.m28396b() == EnumC4236k.TEMPORARILY_UNMETERED);
    }

    public boolean mo20691c(C6042b bVar) {
        return !bVar.m21462a() || bVar.m21461b();
    }
}
