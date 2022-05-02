package p160l2;

import android.content.Context;
import android.os.Build;
import p071f2.AbstractC4234j;
import p071f2.EnumC4236k;
import p145k2.C6042b;
import p173m2.C6552g;
import p198o2.C7554p;
import p243r2.AbstractC8354a;

public class C6303e extends AbstractC6300c<C6042b> {
    public static final String f19840e = AbstractC4234j.m28360f("NetworkMeteredCtrlr");

    public C6303e(Context context, AbstractC8354a aVar) {
        super(C6552g.m20120c(context, aVar).m20119d());
    }

    @Override
    public boolean mo20691b(C7554p pVar) {
        return pVar.f24149j.m28394b() == EnumC4236k.METERED;
    }

    public boolean mo20690c(C6042b bVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            return !bVar.m21461a() || !bVar.m21460b();
        }
        AbstractC4234j.m28362c().mo28359a(f19840e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !bVar.m21461a();
    }
}
