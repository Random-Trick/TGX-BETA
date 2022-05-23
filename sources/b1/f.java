package b1;

public class f<T> implements e<T> {
    public final Object[] f3693a;
    public int f3694b;

    public f(int i10) {
        if (i10 > 0) {
            this.f3693a = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override
    public boolean a(T t10) {
        if (!c(t10)) {
            int i10 = this.f3694b;
            Object[] objArr = this.f3693a;
            if (i10 >= objArr.length) {
                return false;
            }
            objArr[i10] = t10;
            this.f3694b = i10 + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    @Override
    public T b() {
        int i10 = this.f3694b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f3693a;
        T t10 = (T) objArr[i11];
        objArr[i11] = null;
        this.f3694b = i10 - 1;
        return t10;
    }

    public final boolean c(T t10) {
        for (int i10 = 0; i10 < this.f3694b; i10++) {
            if (this.f3693a[i10] == t10) {
                return true;
            }
        }
        return false;
    }
}
