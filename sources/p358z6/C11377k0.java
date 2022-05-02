package p358z6;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class C11377k0<E> extends AbstractC11404s<E> {
    public static final C11377k0<Object> f36330Q = new C11377k0<>(new Object[0], 0, null, 0, 0);
    public final transient Object[] f36331M;
    public final transient int f36332N;
    public final transient int f36333O;
    public final transient int f36334P;
    public final transient Object[] f36335c;

    public C11377k0(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f36335c = objArr;
        this.f36331M = objArr2;
        this.f36332N = i2;
        this.f36333O = i;
        this.f36334P = i3;
    }

    @Override
    public boolean mo732A() {
        return true;
    }

    @Override
    public boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.f36331M;
        if (obj == null || objArr == null) {
            return false;
        }
        int b = C11382n.m786b(obj);
        while (true) {
            int i = b & this.f36332N;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            b = i + 1;
        }
    }

    @Override
    public int hashCode() {
        return this.f36333O;
    }

    @Override
    public int mo763i(Object[] objArr, int i) {
        System.arraycopy(this.f36335c, 0, objArr, i, this.f36334P);
        return i + this.f36334P;
    }

    @Override
    public Object[] mo753m() {
        return this.f36335c;
    }

    @Override
    public int mo752r() {
        return this.f36334P;
    }

    @Override
    public int mo751s() {
        return 0;
    }

    @Override
    public int size() {
        return this.f36334P;
    }

    @Override
    public boolean mo750t() {
        return false;
    }

    @Override
    public AbstractC11403r0<E> iterator() {
        return mo726h().iterator();
    }

    @Override
    public AbstractC11396q<E> mo720z() {
        return AbstractC11396q.m761w(this.f36335c, this.f36334P);
    }
}
