package k2;

import android.content.Context;
import f2.j;
import java.util.ArrayList;
import java.util.List;
import l2.b;
import l2.c;
import l2.e;
import l2.f;
import l2.g;
import l2.h;
import o2.p;
import r2.a;

public class d implements c.a {
    public static final String f15624d = j.f("WorkConstraintsTracker");
    public final c f15625a;
    public final c<?>[] f15626b;
    public final Object f15627c = new Object();

    public d(Context context, a aVar, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f15625a = cVar;
        this.f15626b = new c[]{new l2.a(applicationContext, aVar), new b(applicationContext, aVar), new h(applicationContext, aVar), new l2.d(applicationContext, aVar), new g(applicationContext, aVar), new f(applicationContext, aVar), new e(applicationContext, aVar)};
    }

    @Override
    public void a(List<String> list) {
        synchronized (this.f15627c) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (c(str)) {
                    j.c().a(f15624d, String.format("Constraints met for %s", str), new Throwable[0]);
                    arrayList.add(str);
                }
            }
            c cVar = this.f15625a;
            if (cVar != null) {
                cVar.f(arrayList);
            }
        }
    }

    @Override
    public void b(List<String> list) {
        synchronized (this.f15627c) {
            c cVar = this.f15625a;
            if (cVar != null) {
                cVar.b(list);
            }
        }
    }

    public boolean c(String str) {
        c<?>[] cVarArr;
        synchronized (this.f15627c) {
            for (c<?> cVar : this.f15626b) {
                if (cVar.d(str)) {
                    j.c().a(f15624d, String.format("Work %s constrained by %s", str, cVar.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public void d(Iterable<p> iterable) {
        synchronized (this.f15627c) {
            for (c<?> cVar : this.f15626b) {
                cVar.g(null);
            }
            for (c<?> cVar2 : this.f15626b) {
                cVar2.e(iterable);
            }
            for (c<?> cVar3 : this.f15626b) {
                cVar3.g(this);
            }
        }
    }

    public void e() {
        synchronized (this.f15627c) {
            for (c<?> cVar : this.f15626b) {
                cVar.f();
            }
        }
    }
}
