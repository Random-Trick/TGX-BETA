package w7;

import e7.d;
import e7.e;
import e7.q;
import java.util.Iterator;
import java.util.Set;

public class c implements i {
    public final String f25806a;
    public final d f25807b;

    public c(Set<f> set, d dVar) {
        this.f25806a = e(set);
        this.f25807b = dVar;
    }

    public static d<i> c() {
        return d.c(i.class).b(q.k(f.class)).e(b.f25805a).d();
    }

    public static i d(e eVar) {
        return new c(eVar.d(f.class), d.a());
    }

    public static String e(Set<f> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb2.append(next.b());
            sb2.append('/');
            sb2.append(next.c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override
    public String a() {
        if (this.f25807b.b().isEmpty()) {
            return this.f25806a;
        }
        return this.f25806a + ' ' + e(this.f25807b.b());
    }
}
