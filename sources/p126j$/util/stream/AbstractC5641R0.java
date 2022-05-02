package p126j$.util.stream;

abstract class AbstractC5641R0 implements AbstractC5632P0 {
    protected final AbstractC5632P0 f18221a;
    protected final AbstractC5632P0 f18222b;
    private final long f18223c;

    public AbstractC5641R0(AbstractC5632P0 p0, AbstractC5632P0 p02) {
        this.f18221a = p0;
        this.f18222b = p02;
        this.f18223c = p0.count() + p02.count();
    }

    @Override
    public long count() {
        return this.f18223c;
    }

    @Override
    public AbstractC5632P0 mo22158f(int i) {
        if (i == 0) {
            return this.f18221a;
        }
        if (i == 1) {
            return this.f18222b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public int mo22153o() {
        return 2;
    }
}
