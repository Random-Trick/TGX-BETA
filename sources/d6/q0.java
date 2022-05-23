package d6;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class q0<T> implements Iterator<T>, j$.util.Iterator {
    public final u0 M;
    public int f6886a;
    public int f6887b;
    public int f6888c = -1;

    public q0(u0 u0Var, p0 p0Var) {
        int i10;
        this.M = u0Var;
        i10 = u0Var.N;
        this.f6886a = i10;
        this.f6887b = u0Var.e();
    }

    public abstract T a(int i10);

    public final void b() {
        int i10;
        i10 = this.M.N;
        if (i10 != this.f6886a) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override
    public void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public final boolean hasNext() {
        return this.f6887b >= 0;
    }

    @Override
    public final T next() {
        b();
        if (hasNext()) {
            int i10 = this.f6887b;
            this.f6888c = i10;
            T a10 = a(i10);
            this.f6887b = this.M.f(this.f6887b);
            return a10;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        b();
        r.d(this.f6888c >= 0, "no calls to next() since the last call to remove()");
        this.f6886a += 32;
        u0 u0Var = this.M;
        u0Var.remove(u0Var.f7018c[this.f6888c]);
        this.f6887b--;
        this.f6888c = -1;
    }
}
