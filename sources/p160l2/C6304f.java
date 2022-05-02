package p160l2;

import android.content.Context;
import android.os.Build;
import p071f2.AbstractC4234j;
import p071f2.EnumC4236k;
import p145k2.C6042b;
import p173m2.C6552g;
import p198o2.C7554p;
import p243r2.AbstractC8354a;

public class C6304f extends AbstractC6300c<C6042b> {
    public static final String f19841e = AbstractC4234j.m28360f("NetworkNotRoamingCtrlr");

    public C6304f(Context context, AbstractC8354a aVar) {
        super(C6552g.m20120c(context, aVar).m20119d());
    }

    @Override
    public boolean mo20691b(C7554p pVar) {
        return pVar.f24149j.m28394b() == EnumC4236k.NOT_ROAMING;
    }

    public boolean mo20690c(C6042b bVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            return !bVar.m21461a() || !bVar.m21459c();
        }
        AbstractC4234j.m28362c().mo28359a(f19841e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
        return !bVar.m21461a();
    }
}
