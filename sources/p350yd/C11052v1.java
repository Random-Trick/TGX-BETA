package p350yd;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;
import p154kb.C6235i;

public class C11052v1 {
    public static C11052v1 f35474b;
    public final List<Reference<AbstractC11053a>> f35475a = new ArrayList();

    public interface AbstractC11053a {
        void mo452g2();

        void mo443o4();
    }

    public static C11052v1 m1768b() {
        if (f35474b == null) {
            f35474b = new C11052v1();
        }
        return f35474b;
    }

    public void m1769a(AbstractC11053a aVar) {
        synchronized (this) {
            C6235i.m21015a(this.f35475a, aVar);
        }
    }

    public void m1767c(boolean z) {
        synchronized (this) {
            for (int size = this.f35475a.size() - 1; size >= 0; size--) {
                AbstractC11053a aVar = this.f35475a.get(size).get();
                if (aVar == null) {
                    this.f35475a.remove(size);
                } else if (z) {
                    aVar.mo443o4();
                } else {
                    aVar.mo452g2();
                }
            }
        }
    }

    public void m1766d(AbstractC11053a aVar) {
        synchronized (this) {
            C6235i.m21011e(this.f35475a, aVar);
        }
    }
}
