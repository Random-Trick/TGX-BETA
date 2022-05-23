package j$.util.stream;

abstract class S0 implements Q0 {
    protected final Q0 f14616a;
    protected final Q0 f14617b;
    private final long f14618c;

    public S0(Q0 q02, Q0 q03) {
        this.f14616a = q02;
        this.f14617b = q03;
        this.f14618c = q02.count() + q03.count();
    }

    @Override
    public final long count() {
        return this.f14618c;
    }

    @Override
    public final Q0 f(int i10) {
        if (i10 == 0) {
            return this.f14616a;
        }
        if (i10 == 1) {
            return this.f14617b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public final int s() {
        return 2;
    }
}
