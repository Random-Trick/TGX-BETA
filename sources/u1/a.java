package u1;

import android.content.Context;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import u1.e;
import x1.c;

public class a {
    public final c.AbstractC0241c f23464a;
    public final Context f23465b;
    public final String f23466c;
    public final e.d f23467d;
    public final List<e.b> f23468e;
    public final boolean f23469f;
    public final e.c f23470g;
    public final Executor f23471h;
    public final Executor f23472i;
    public final boolean f23473j;
    public final boolean f23474k;
    public final boolean f23475l;
    public final Set<Integer> f23476m;
    public final String f23477n;
    public final File f23478o;

    public a(Context context, String str, c.AbstractC0241c cVar, e.d dVar, List<e.b> list, boolean z10, e.c cVar2, Executor executor, Executor executor2, boolean z11, boolean z12, boolean z13, Set<Integer> set, String str2, File file) {
        this.f23464a = cVar;
        this.f23465b = context;
        this.f23466c = str;
        this.f23467d = dVar;
        this.f23468e = list;
        this.f23469f = z10;
        this.f23470g = cVar2;
        this.f23471h = executor;
        this.f23472i = executor2;
        this.f23473j = z11;
        this.f23474k = z12;
        this.f23475l = z13;
        this.f23476m = set;
        this.f23477n = str2;
        this.f23478o = file;
    }

    public boolean a(int i10, int i11) {
        Set<Integer> set;
        return (!(i10 > i11) || !this.f23475l) && this.f23474k && ((set = this.f23476m) == null || !set.contains(Integer.valueOf(i10)));
    }
}
