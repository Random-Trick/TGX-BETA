package p356z4;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p008a7.C0199c;
import p020b5.C1186a;
import p020b5.C1190c;
import p020b5.C1234w;
import p174m3.AbstractC6609h;
import p187n4.C7227r0;
import p358z6.AbstractC11396q;
import p358z6.AbstractC11401r;

public final class C11275q implements AbstractC6609h {
    public static final C11275q f36132b = new C11275q(AbstractC11401r.m740j());
    public static final AbstractC6609h.AbstractC6610a<C11275q> f36133c = C11273o.f36130a;
    public final AbstractC11401r<C7227r0, C11276a> f36134a;

    public C11275q(Map<C7227r0, C11276a> map) {
        this.f36134a = AbstractC11401r.m747c(map);
    }

    public static String m1004c(int i) {
        return Integer.toString(i, 36);
    }

    public static C11275q m1003d(Bundle bundle) {
        List c = C1190c.m38114c(C11276a.f36135c, bundle.getParcelableArrayList(m1004c(0)), AbstractC11396q.m768D());
        AbstractC11401r.C11402a aVar = new AbstractC11401r.C11402a();
        for (int i = 0; i < c.size(); i++) {
            C11276a aVar2 = (C11276a) c.get(i);
            aVar.m736c(aVar2.f36136a, aVar2);
        }
        return new C11275q(aVar.m738a());
    }

    public C11276a m1005b(C7227r0 r0Var) {
        return this.f36134a.get(r0Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11275q.class != obj.getClass()) {
            return false;
        }
        return this.f36134a.equals(((C11275q) obj).f36134a);
    }

    public int hashCode() {
        return this.f36134a.hashCode();
    }

    public static final class C11276a implements AbstractC6609h {
        public static final AbstractC6609h.AbstractC6610a<C11276a> f36135c = C11274p.f36131a;
        public final C7227r0 f36136a;
        public final AbstractC11396q<Integer> f36137b;

        public C11276a(C7227r0 r0Var) {
            this.f36136a = r0Var;
            AbstractC11396q.C11397a aVar = new AbstractC11396q.C11397a();
            for (int i = 0; i < r0Var.f23023a; i++) {
                aVar.m757d(Integer.valueOf(i));
            }
            this.f36137b = aVar.m756e();
        }

        public static String m1000c(int i) {
            return Integer.toString(i, 36);
        }

        public static C11276a m999d(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(m1000c(0));
            C1186a.m38185e(bundle2);
            C7227r0 a = C7227r0.f23022M.mo998a(bundle2);
            int[] intArray = bundle.getIntArray(m1000c(1));
            if (intArray == null) {
                return new C11276a(a);
            }
            return new C11276a(a, C0199c.m42103c(intArray));
        }

        public int m1001b() {
            return C1234w.m37863h(this.f36136a.m17272b(0).f20575U);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C11276a.class != obj.getClass()) {
                return false;
            }
            C11276a aVar = (C11276a) obj;
            return this.f36136a.equals(aVar.f36136a) && this.f36137b.equals(aVar.f36137b);
        }

        public int hashCode() {
            return this.f36136a.hashCode() + (this.f36137b.hashCode() * 31);
        }

        public C11276a(C7227r0 r0Var, List<Integer> list) {
            if (list.isEmpty() || (((Integer) Collections.min(list)).intValue() >= 0 && ((Integer) Collections.max(list)).intValue() < r0Var.f23023a)) {
                this.f36136a = r0Var;
                this.f36137b = AbstractC11396q.m758z(list);
                return;
            }
            throw new IndexOutOfBoundsException();
        }
    }
}
