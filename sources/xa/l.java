package xa;

import ra.k;
import xa.e;

public class l extends k {
    public static final int d(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static final int e(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    public static final int f(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static final <T extends Comparable<? super T>> T g(T t10, c<T> cVar) {
        k.e(t10, "<this>");
        k.e(cVar, "range");
        if (!cVar.isEmpty()) {
            return (!cVar.f(t10, cVar.g()) || cVar.f(cVar.g(), t10)) ? (!cVar.f(cVar.m(), t10) || cVar.f(t10, cVar.m())) ? t10 : cVar.m() : cVar.g();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + cVar + '.');
    }

    public static final e h(int i10, int i11) {
        return e.M.a(i10, i11, -1);
    }

    public static final e i(e eVar, int i10) {
        k.e(eVar, "<this>");
        k.a(i10 > 0, Integer.valueOf(i10));
        e.a aVar = e.M;
        int r10 = eVar.r();
        int s10 = eVar.s();
        if (eVar.t() <= 0) {
            i10 = -i10;
        }
        return aVar.a(r10, s10, i10);
    }

    public static final g j(int i10, int i11) {
        if (i11 <= Integer.MIN_VALUE) {
            return g.N.a();
        }
        return new g(i10, i11 - 1);
    }
}
