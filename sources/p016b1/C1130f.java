package p016b1;

public class C1130f<T> implements AbstractC1129e<T> {
    public final Object[] f4332a;
    public int f4333b;

    public C1130f(int i) {
        if (i > 0) {
            this.f4332a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override
    public boolean mo38328a(T t) {
        if (!m38329c(t)) {
            int i = this.f4333b;
            Object[] objArr = this.f4332a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f4333b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    @Override
    public T mo38327b() {
        int i = this.f4333b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f4332a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f4333b = i - 1;
        return t;
    }

    public final boolean m38329c(T t) {
        for (int i = 0; i < this.f4333b; i++) {
            if (this.f4332a[i] == t) {
                return true;
            }
        }
        return false;
    }
}
