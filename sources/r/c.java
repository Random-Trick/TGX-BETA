package r;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import y.j0;
import y.n1;

public final class c extends n1<b> {

    public static final class a {
        public final List<b> f21574a = new ArrayList();

        public a(List<b> list) {
            for (b bVar : list) {
                this.f21574a.add(bVar);
            }
        }

        public List<j0> a() {
            ArrayList arrayList = new ArrayList();
            for (b bVar : this.f21574a) {
                j0 a10 = bVar.a();
                if (a10 != null) {
                    arrayList.add(a10);
                }
            }
            return arrayList;
        }

        public List<j0> b() {
            ArrayList arrayList = new ArrayList();
            for (b bVar : this.f21574a) {
                j0 b10 = bVar.b();
                if (b10 != null) {
                    arrayList.add(b10);
                }
            }
            return arrayList;
        }

        public List<j0> c() {
            ArrayList arrayList = new ArrayList();
            for (b bVar : this.f21574a) {
                j0 c10 = bVar.c();
                if (c10 != null) {
                    arrayList.add(c10);
                }
            }
            return arrayList;
        }

        public List<j0> d() {
            ArrayList arrayList = new ArrayList();
            for (b bVar : this.f21574a) {
                j0 d10 = bVar.d();
                if (d10 != null) {
                    arrayList.add(d10);
                }
            }
            return arrayList;
        }
    }

    public c(b... bVarArr) {
        a(Arrays.asList(bVarArr));
    }

    public static c e() {
        return new c(new b[0]);
    }

    @Override
    public n1<b> clone() {
        c e10 = e();
        e10.a(c());
        return e10;
    }

    public a d() {
        return new a(c());
    }
}
