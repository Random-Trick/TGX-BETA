package p240r;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p336y.AbstractC10272n1;
import p336y.C10245j0;

public final class C8336c extends AbstractC10272n1<AbstractC8335b> {

    public static final class C8337a {
        public final List<AbstractC8335b> f26999a = new ArrayList();

        public C8337a(List<AbstractC8335b> list) {
            for (AbstractC8335b bVar : list) {
                this.f26999a.add(bVar);
            }
        }

        public List<C10245j0> m12783a() {
            ArrayList arrayList = new ArrayList();
            for (AbstractC8335b bVar : this.f26999a) {
                C10245j0 a = bVar.m12789a();
                if (a != null) {
                    arrayList.add(a);
                }
            }
            return arrayList;
        }

        public List<C10245j0> m12782b() {
            ArrayList arrayList = new ArrayList();
            for (AbstractC8335b bVar : this.f26999a) {
                C10245j0 b = bVar.m12788b();
                if (b != null) {
                    arrayList.add(b);
                }
            }
            return arrayList;
        }

        public List<C10245j0> m12781c() {
            ArrayList arrayList = new ArrayList();
            for (AbstractC8335b bVar : this.f26999a) {
                C10245j0 c = bVar.m12787c();
                if (c != null) {
                    arrayList.add(c);
                }
            }
            return arrayList;
        }

        public List<C10245j0> m12780d() {
            ArrayList arrayList = new ArrayList();
            for (AbstractC8335b bVar : this.f26999a) {
                C10245j0 d = bVar.m12786d();
                if (d != null) {
                    arrayList.add(d);
                }
            }
            return arrayList;
        }
    }

    public C8336c(AbstractC8335b... bVarArr) {
        m5576a(Arrays.asList(bVarArr));
    }

    public static C8336c m12784e() {
        return new C8336c(new AbstractC8335b[0]);
    }

    @Override
    public AbstractC10272n1<AbstractC8335b> clone() {
        C8336c e = m12784e();
        e.m5576a(m5574c());
        return e;
    }

    public C8337a m12785d() {
        return new C8337a(m5574c());
    }
}
