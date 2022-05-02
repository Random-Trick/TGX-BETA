package p126j$.util.stream;

abstract class AbstractC5696e {
    protected final int f18340a;
    protected int f18341b;
    protected int f18342c;
    protected long[] f18343d;

    public AbstractC5696e() {
        this.f18340a = 4;
    }

    public AbstractC5696e(int i) {
        if (i >= 0) {
            this.f18340a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i - 1));
            return;
        }
        throw new IllegalArgumentException("Illegal Capacity: " + i);
    }

    public abstract void clear();

    public long count() {
        int i = this.f18342c;
        return i == 0 ? this.f18341b : this.f18343d[i] + this.f18341b;
    }

    public int m22281r(int i) {
        return 1 << ((i == 0 || i == 1) ? this.f18340a : Math.min((this.f18340a + i) - 1, 30));
    }
}
