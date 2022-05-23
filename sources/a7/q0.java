package a7;

import javax.annotation.CheckForNull;
import z6.j;

public final class q0<E> extends s<E> {
    public final transient E f655c;

    public q0(E e10) {
        this.f655c = (E) j.i(e10);
    }

    @Override
    public boolean contains(@CheckForNull Object obj) {
        return this.f655c.equals(obj);
    }

    @Override
    public q<E> f() {
        return q.E(this.f655c);
    }

    @Override
    public int g(Object[] objArr, int i10) {
        objArr[i10] = this.f655c;
        return i10 + 1;
    }

    @Override
    public final int hashCode() {
        return this.f655c.hashCode();
    }

    @Override
    public int size() {
        return 1;
    }

    @Override
    public boolean t() {
        return false;
    }

    @Override
    public String toString() {
        String obj = this.f655c.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 2);
        sb2.append('[');
        sb2.append(obj);
        sb2.append(']');
        return sb2.toString();
    }

    @Override
    public s0<E> iterator() {
        return u.o(this.f655c);
    }
}
