package p281u1;

import android.content.Context;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import p281u1.AbstractC9421e;
import p323x1.AbstractC10067c;

public class C9417a {
    public final AbstractC10067c.AbstractC10071c f30476a;
    public final Context f30477b;
    public final String f30478c;
    public final AbstractC9421e.C9425d f30479d;
    public final List<AbstractC9421e.AbstractC9423b> f30480e;
    public final boolean f30481f;
    public final AbstractC9421e.EnumC9424c f30482g;
    public final Executor f30483h;
    public final Executor f30484i;
    public final boolean f30485j;
    public final boolean f30486k;
    public final boolean f30487l;
    public final Set<Integer> f30488m;
    public final String f30489n;
    public final File f30490o;

    public C9417a(Context context, String str, AbstractC10067c.AbstractC10071c cVar, AbstractC9421e.C9425d dVar, List<AbstractC9421e.AbstractC9423b> list, boolean z, AbstractC9421e.EnumC9424c cVar2, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file) {
        this.f30476a = cVar;
        this.f30477b = context;
        this.f30478c = str;
        this.f30479d = dVar;
        this.f30480e = list;
        this.f30481f = z;
        this.f30482g = cVar2;
        this.f30483h = executor;
        this.f30484i = executor2;
        this.f30485j = z2;
        this.f30486k = z3;
        this.f30487l = z4;
        this.f30488m = set;
        this.f30489n = str2;
        this.f30490o = file;
    }

    public boolean m8742a(int i, int i2) {
        Set<Integer> set;
        return (!(i > i2) || !this.f30487l) && this.f30486k && ((set = this.f30488m) == null || !set.contains(Integer.valueOf(i)));
    }
}
