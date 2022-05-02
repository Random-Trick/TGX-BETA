package p358z6;

import p343y6.C10433i;

public class C11367i0<E> extends AbstractC11396q<E> {
    public static final AbstractC11396q<Object> f36311N = new C11367i0(new Object[0], 0);
    public final transient int f36312M;
    public final transient Object[] f36313c;

    public C11367i0(Object[] objArr, int i) {
        this.f36313c = objArr;
        this.f36312M = i;
    }

    @Override
    public E get(int i) {
        C10433i.m5131g(i, this.f36312M);
        return (E) this.f36313c[i];
    }

    @Override
    public int mo763i(Object[] objArr, int i) {
        System.arraycopy(this.f36313c, 0, objArr, i, this.f36312M);
        return i + this.f36312M;
    }

    @Override
    public Object[] mo753m() {
        return this.f36313c;
    }

    @Override
    public int mo752r() {
        return this.f36312M;
    }

    @Override
    public int mo751s() {
        return 0;
    }

    @Override
    public int size() {
        return this.f36312M;
    }

    @Override
    public boolean mo750t() {
        return false;
    }
}
