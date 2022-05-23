package j$.util.stream;

abstract class E extends G {
    public E(AbstractC0301c cVar, int i10) {
        super(cVar, i10);
    }

    @Override
    final boolean H0() {
        return true;
    }

    @Override
    public final I parallel() {
        J0();
        return this;
    }

    @Override
    public final I sequential() {
        K0();
        return this;
    }
}
