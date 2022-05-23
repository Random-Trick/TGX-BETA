package zd;

import android.util.SparseIntArray;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;
import k0.h;
import lb.i;

public class r1 {
    public static r1 f28312e;
    public final SparseIntArray f28313a = new SparseIntArray();
    public final List<Reference<a>> f28314b = new ArrayList();
    public final h<List<Reference<a>>> f28315c = new h<>();
    public final h<List<Reference<a>>> f28316d = new h<>();

    public interface a {
        boolean D0(int i10);

        void e1(int i10, boolean z10, boolean z11);
    }

    public static r1 a() {
        if (f28312e == null) {
            synchronized (r1.class) {
                if (f28312e == null) {
                    f28312e = new r1();
                }
            }
        }
        return f28312e;
    }

    public void b(int i10, a aVar) {
        synchronized (this) {
            i.b(this.f28315c, aVar, i10);
            if (aVar.D0(i10)) {
                i.b(this.f28316d, aVar, i10);
            }
            if (this.f28313a.get(i10) == 1) {
                aVar.e1(i10, true, false);
            }
        }
    }

    public void c(int i10, a aVar) {
        synchronized (this) {
            i.f(this.f28315c, aVar, i10);
            i.f(this.f28316d, aVar, i10);
        }
    }
}
