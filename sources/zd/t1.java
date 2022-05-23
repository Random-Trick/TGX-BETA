package zd;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;
import lb.i;

public class t1 {
    public static t1 f28429b;
    public final List<Reference<a>> f28430a = new ArrayList();

    public interface a {
        void b4();

        void e2();
    }

    public static t1 b() {
        if (f28429b == null) {
            f28429b = new t1();
        }
        return f28429b;
    }

    public void a(a aVar) {
        synchronized (this) {
            i.a(this.f28430a, aVar);
        }
    }

    public void c(boolean z10) {
        synchronized (this) {
            for (int size = this.f28430a.size() - 1; size >= 0; size--) {
                a aVar = this.f28430a.get(size).get();
                if (aVar == null) {
                    this.f28430a.remove(size);
                } else if (z10) {
                    aVar.b4();
                } else {
                    aVar.e2();
                }
            }
        }
    }

    public void d(a aVar) {
        synchronized (this) {
            i.e(this.f28430a, aVar);
        }
    }
}
