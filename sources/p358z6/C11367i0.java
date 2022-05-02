package p358z6;

import p343y6.C10433i;

public class C11367i0<E> extends AbstractC11396q<E> {
    public static final AbstractC11396q<Object> f36308N = new C11367i0(new Object[0], 0);
    public final transient int f36309M;
    public final transient Object[] f36310c;

    public C11367i0(Object[] objArr, int i) {
        this.f36310c = objArr;
        this.f36309M = i;
    }

    @Override
    public E get(int i) {
        C10433i.m5131g(i, this.f36309M);
        return (E) this.f36310c[i];
    }

    @Override
    public int mo763i(Object[] objArr, int i) {
        System.arraycopy(this.f36310c, 0, objArr, i, this.f36309M);
        return i + this.f36309M;
    }

    @Override
    public Object[] mo753m() {
        return this.f36310c;
    }

    @Override
    public int mo752r() {
        return this.f36309M;
    }

    @Override
    public int mo751s() {
        return 0;
    }

    @Override
    public int size() {
        return this.f36309M;
    }

    @Override
    public boolean mo750t() {
        return false;
    }
}
