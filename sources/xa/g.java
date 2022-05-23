package xa;

public final class g extends e implements d<Integer> {
    public static final a N = new a(null);
    public static final g O = new g(1, 0);

    public static final class a {
        public a() {
        }

        public a(ra.g gVar) {
            this();
        }

        public final g a() {
            return g.O;
        }
    }

    public g(int i10, int i11) {
        super(i10, i11, 1);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof g) {
            if (!isEmpty() || !((g) obj).isEmpty()) {
                g gVar = (g) obj;
                if (!(r() == gVar.r() && s() == gVar.s())) {
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
        return (r() * 31) + s();
    }

    @Override
    public boolean isEmpty() {
        return r() > s();
    }

    @Override
    public String toString() {
        return r() + ".." + s();
    }

    public Integer w() {
        return Integer.valueOf(s());
    }

    public Integer x() {
        return Integer.valueOf(r());
    }
}
