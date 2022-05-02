package p033c6;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p126j$.util.Iterator;
import p126j$.util.function.Consumer;

public abstract class AbstractC1880q0<T> implements Iterator<T>, p126j$.util.Iterator {
    public final C1936u0 f6814M;
    public int f6815a;
    public int f6816b;
    public int f6817c = -1;

    public AbstractC1880q0(C1936u0 u0Var, C1866p0 p0Var) {
        int i;
        this.f6814M = u0Var;
        i = u0Var.f6958N;
        this.f6815a = i;
        this.f6816b = u0Var.m35880e();
    }

    public abstract T mo35945a(int i);

    public final void m35944b() {
        int i;
        i = this.f6814M.f6958N;
        if (i != this.f6815a) {
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
        return this.f6816b >= 0;
    }

    @Override
    public final T next() {
        m35944b();
        if (hasNext()) {
            int i = this.f6816b;
            this.f6817c = i;
            T a = mo35945a(i);
            this.f6816b = this.f6814M.m35879f(this.f6816b);
            return a;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        m35944b();
        C1893r.m35932d(this.f6817c >= 0, "no calls to next() since the last call to remove()");
        this.f6815a += 32;
        C1936u0 u0Var = this.f6814M;
        u0Var.remove(u0Var.f6965c[this.f6817c]);
        this.f6816b--;
        this.f6817c = -1;
    }
}
