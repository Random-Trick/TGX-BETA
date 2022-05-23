package j$.util.stream;

public abstract class F extends G {
    public F(AbstractC0301c cVar, int i10) {
        super(cVar, i10);
    }

    @Override
    final boolean H0() {
        return false;
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
