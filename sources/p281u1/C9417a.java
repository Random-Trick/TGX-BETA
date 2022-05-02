package p281u1;

import android.content.Context;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import p281u1.AbstractC9421e;
import p323x1.AbstractC10067c;

public class C9417a {
    public final AbstractC10067c.AbstractC10071c f30479a;
    public final Context f30480b;
    public final String f30481c;
    public final AbstractC9421e.C9425d f30482d;
    public final List<AbstractC9421e.AbstractC9423b> f30483e;
    public final boolean f30484f;
    public final AbstractC9421e.EnumC9424c f30485g;
    public final Executor f30486h;
    public final Executor f30487i;
    public final boolean f30488j;
    public final boolean f30489k;
    public final boolean f30490l;
    public final Set<Integer> f30491m;
    public final String f30492n;
    public final File f30493o;

    public C9417a(Context context, String str, AbstractC10067c.AbstractC10071c cVar, AbstractC9421e.C9425d dVar, List<AbstractC9421e.AbstractC9423b> list, boolean z, AbstractC9421e.EnumC9424c cVar2, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file) {
        this.f30479a = cVar;
        this.f30480b = context;
        this.f30481c = str;
        this.f30482d = dVar;
        this.f30483e = list;
        this.f30484f = z;
        this.f30485g = cVar2;
        this.f30486h = executor;
        this.f30487i = executor2;
        this.f30488j = z2;
        this.f30489k = z3;
        this.f30490l = z4;
        this.f30491m = set;
        this.f30492n = str2;
        this.f30493o = file;
    }

    public boolean m8742a(int i, int i2) {
        Set<Integer> set;
        return (!(i > i2) || !this.f30490l) && this.f30489k && ((set = this.f30491m) == null || !set.contains(Integer.valueOf(i)));
    }
}
