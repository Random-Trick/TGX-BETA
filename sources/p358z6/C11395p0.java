package p358z6;

import com.google.errorprone.annotations.concurrent.LazyInit;
import p343y6.C10433i;

public final class C11395p0<E> extends AbstractC11404s<E> {
    @LazyInit
    public transient int f36351M;
    public final transient E f36352c;

    public C11395p0(E e) {
        this.f36352c = (E) C10433i.m5129i(e);
    }

    @Override
    public boolean mo732A() {
        return this.f36351M != 0;
    }

    @Override
    public boolean contains(Object obj) {
        return this.f36352c.equals(obj);
    }

    @Override
    public final int hashCode() {
        int i = this.f36351M;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f36352c.hashCode();
        this.f36351M = hashCode;
        return hashCode;
    }

    @Override
    public int mo763i(Object[] objArr, int i) {
        objArr[i] = this.f36352c;
        return i + 1;
    }

    @Override
    public int size() {
        return 1;
    }

    @Override
    public boolean mo750t() {
        return false;
    }

    @Override
    public String toString() {
        return '[' + this.f36352c.toString() + ']';
    }

    @Override
    public AbstractC11403r0<E> iterator() {
        return C11407u.m698o(this.f36352c);
    }

    @Override
    public AbstractC11396q<E> mo720z() {
        return AbstractC11396q.m767E(this.f36352c);
    }

    public C11395p0(E e, int i) {
        this.f36352c = e;
        this.f36351M = i;
    }
}
