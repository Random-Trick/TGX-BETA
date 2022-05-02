package p350yd;

import android.util.SparseIntArray;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;
import p143k0.C6038h;
import p154kb.C6235i;

public class C11009t1 {
    public static C11009t1 f35348e;
    public final SparseIntArray f35349a = new SparseIntArray();
    public final List<Reference<AbstractC11010a>> f35350b = new ArrayList();
    public final C6038h<List<Reference<AbstractC11010a>>> f35351c = new C6038h<>();
    public final C6038h<List<Reference<AbstractC11010a>>> f35352d = new C6038h<>();

    public interface AbstractC11010a {
        boolean mo1990C0(int i);

        void mo1989g1(int i, boolean z, boolean z2);
    }

    public static C11009t1 m1993a() {
        if (f35348e == null) {
            synchronized (C11009t1.class) {
                if (f35348e == null) {
                    f35348e = new C11009t1();
                }
            }
        }
        return f35348e;
    }

    public void m1992b(int i, AbstractC11010a aVar) {
        synchronized (this) {
            C6235i.m21015b(this.f35351c, aVar, i);
            if (aVar.mo1990C0(i)) {
                C6235i.m21015b(this.f35352d, aVar, i);
            }
            if (this.f35349a.get(i) == 1) {
                aVar.mo1989g1(i, true, false);
            }
        }
    }

    public void m1991c(int i, AbstractC11010a aVar) {
        synchronized (this) {
            C6235i.m21011f(this.f35351c, aVar, i);
            C6235i.m21011f(this.f35352d, aVar, i);
        }
    }
}
