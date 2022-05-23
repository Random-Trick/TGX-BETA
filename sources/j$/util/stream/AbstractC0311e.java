package j$.util.stream;

abstract class AbstractC0311e {
    protected final int f14732a;
    protected int f14733b;
    protected int f14734c;
    protected long[] f14735d;

    public AbstractC0311e() {
        this.f14732a = 4;
    }

    public AbstractC0311e(int i10) {
        if (i10 >= 0) {
            this.f14732a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i10 - 1));
            return;
        }
        throw new IllegalArgumentException("Illegal Capacity: " + i10);
    }

    public abstract void clear();

    public final long count() {
        int i10 = this.f14734c;
        return i10 == 0 ? this.f14733b : this.f14735d[i10] + this.f14733b;
    }

    public final int z(int i10) {
        return 1 << ((i10 == 0 || i10 == 1) ? this.f14732a : Math.min((this.f14732a + i10) - 1, 30));
    }
}
