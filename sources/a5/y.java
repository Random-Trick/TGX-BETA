package a5;

import a7.q;
import a7.r;
import android.os.Bundle;
import b7.d;
import c5.c;
import c5.w;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import m3.h;
import o4.p0;

public final class y implements h {
    public static final y f545b = new y(r.j());
    public static final h.a<y> f546c = w.f543a;
    public final r<p0, a> f547a;

    public y(Map<p0, a> map) {
        this.f547a = r.c(map);
    }

    public static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    public static y d(Bundle bundle) {
        List c10 = c.c(a.f548c, bundle.getParcelableArrayList(c(0)), q.D());
        r.a aVar = new r.a();
        for (int i10 = 0; i10 < c10.size(); i10++) {
            a aVar2 = (a) c10.get(i10);
            aVar.d(aVar2.f549a, aVar2);
        }
        return new y(aVar.b());
    }

    public a b(p0 p0Var) {
        return this.f547a.get(p0Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        return this.f547a.equals(((y) obj).f547a);
    }

    public int hashCode() {
        return this.f547a.hashCode();
    }

    public static final class a implements h {
        public static final h.a<a> f548c = x.f544a;
        public final p0 f549a;
        public final q<Integer> f550b;

        public a(p0 p0Var) {
            this.f549a = p0Var;
            q.a aVar = new q.a();
            for (int i10 = 0; i10 < p0Var.f19166a; i10++) {
                aVar.a(Integer.valueOf(i10));
            }
            this.f550b = aVar.h();
        }

        public static String c(int i10) {
            return Integer.toString(i10, 36);
        }

        public static a d(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(c(0));
            c5.a.e(bundle2);
            p0 a10 = p0.N.a(bundle2);
            int[] intArray = bundle.getIntArray(c(1));
            if (intArray == null) {
                return new a(a10);
            }
            return new a(a10, d.c(intArray));
        }

        public int b() {
            return w.f(this.f549a.b(0).U);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f549a.equals(aVar.f549a) && this.f550b.equals(aVar.f550b);
        }

        public int hashCode() {
            return this.f549a.hashCode() + (this.f550b.hashCode() * 31);
        }

        public a(p0 p0Var, List<Integer> list) {
            if (list.isEmpty() || (((Integer) Collections.min(list)).intValue() >= 0 && ((Integer) Collections.max(list)).intValue() < p0Var.f19166a)) {
                this.f549a = p0Var;
                this.f550b = q.z(list);
                return;
            }
            throw new IndexOutOfBoundsException();
        }
    }
}
