package p317wa;

import qa.C8294g;

public final class C10022g extends C10019e implements AbstractC10018d<Integer> {
    public static final C10023a f32634N = new C10023a(null);
    public static final C10022g f32635O = new C10022g(1, 0);

    public static final class C10023a {
        public C10023a() {
        }

        public C10023a(C8294g gVar) {
            this();
        }

        public final C10022g m6202a() {
            return C10022g.f32635O;
        }
    }

    public C10022g(int i, int i2) {
        super(i, i2, 1);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof C10022g) {
            if (!isEmpty() || !((C10022g) obj).isEmpty()) {
                C10022g gVar = (C10022g) obj;
                if (!(m6211r() == gVar.m6211r() && m6210s() == gVar.m6210s())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m6211r() * 31) + m6210s();
    }

    @Override
    public boolean isEmpty() {
        return m6211r() > m6210s();
    }

    @Override
    public String toString() {
        return m6211r() + ".." + m6210s();
    }

    public Integer m6204w() {
        return Integer.valueOf(m6210s());
    }

    public Integer m6203x() {
        return Integer.valueOf(m6211r());
    }
}
