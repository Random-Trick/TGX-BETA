package p317wa;

import p317wa.C10019e;
import qa.C8298k;

public class C10030l extends C10029k {
    public static final int m6193d(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static final int m6192e(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static final int m6191f(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static final <T extends Comparable<? super T>> T m6190g(T t, AbstractC10017c<T> cVar) {
        C8298k.m12933e(t, "<this>");
        C8298k.m12933e(cVar, "range");
        if (!cVar.isEmpty()) {
            return (!cVar.mo6214h(t, cVar.mo6213i()) || cVar.mo6214h(cVar.mo6213i(), t)) ? (!cVar.mo6214h(cVar.mo6212m(), t) || cVar.mo6214h(t, cVar.mo6212m())) ? t : cVar.mo6212m() : cVar.mo6213i();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + cVar + '.');
    }

    public static final C10019e m6189h(int i, int i2) {
        return C10019e.f32626M.m6207a(i, i2, -1);
    }

    public static final C10019e m6188i(C10019e eVar, int i) {
        C8298k.m12933e(eVar, "<this>");
        C10029k.m6196a(i > 0, Integer.valueOf(i));
        C10019e.C10020a aVar = C10019e.f32626M;
        int r = eVar.m6211r();
        int s = eVar.m6210s();
        if (eVar.m6209t() <= 0) {
            i = -i;
        }
        return aVar.m6207a(r, s, i);
    }

    public static final C10022g m6187j(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return C10022g.f32634N.m6202a();
        }
        return new C10022g(i, i2 - 1);
    }
}
