package p350yd;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;
import p154kb.C6235i;

public class C11052v1 {
    public static C11052v1 f35477b;
    public final List<Reference<AbstractC11053a>> f35478a = new ArrayList();

    public interface AbstractC11053a {
        void mo452g2();

        void mo443o4();
    }

    public static C11052v1 m1768b() {
        if (f35477b == null) {
            f35477b = new C11052v1();
        }
        return f35477b;
    }

    public void m1769a(AbstractC11053a aVar) {
        synchronized (this) {
            C6235i.m21016a(this.f35478a, aVar);
        }
    }

    public void m1767c(boolean z) {
        synchronized (this) {
            for (int size = this.f35478a.size() - 1; size >= 0; size--) {
                AbstractC11053a aVar = this.f35478a.get(size).get();
                if (aVar == null) {
                    this.f35478a.remove(size);
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
            C6235i.m21012e(this.f35478a, aVar);
        }
    }
}
