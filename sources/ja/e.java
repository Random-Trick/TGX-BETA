package ja;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import ra.g;
import ra.k;
import xa.l;

public final class e<E> extends c<E> {
    public static final a M = new a(null);
    public static final Object[] N = new Object[0];
    public int f15170a;
    public Object[] f15171b = N;
    public int f15172c;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }

        public final int a(int i10, int i11) {
            int i12 = i10 + (i10 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            return i12 - 2147483639 > 0 ? i11 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i12;
        }
    }

    @Override
    public boolean add(E e10) {
        m(e10);
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        k.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        u(size() + collection.size());
        r(x(this.f15170a + size()), collection);
        return true;
    }

    @Override
    public void clear() {
        int x10 = x(this.f15170a + size());
        int i10 = this.f15170a;
        if (i10 < x10) {
            h.i(this.f15171b, null, i10, x10);
        } else if (!isEmpty()) {
            Object[] objArr = this.f15171b;
            h.i(objArr, null, this.f15170a, objArr.length);
            h.i(this.f15171b, null, 0, x10);
        }
        this.f15170a = 0;
        this.f15172c = 0;
    }

    @Override
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override
    public E f(int i10) {
        b.f15159a.a(i10, size());
        if (i10 == n.g(this)) {
            return z();
        }
        if (i10 == 0) {
            return y();
        }
        int x10 = x(this.f15170a + i10);
        E e10 = (E) this.f15171b[x10];
        if (i10 < (size() >> 1)) {
            int i11 = this.f15170a;
            if (x10 >= i11) {
                Object[] objArr = this.f15171b;
                h.e(objArr, objArr, i11 + 1, i11, x10);
            } else {
                Object[] objArr2 = this.f15171b;
                h.e(objArr2, objArr2, 1, 0, x10);
                Object[] objArr3 = this.f15171b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f15170a;
                h.e(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f15171b;
            int i13 = this.f15170a;
            objArr4[i13] = null;
            this.f15170a = v(i13);
        } else {
            int x11 = x(this.f15170a + n.g(this));
            if (x10 <= x11) {
                Object[] objArr5 = this.f15171b;
                h.e(objArr5, objArr5, x10, x10 + 1, x11 + 1);
            } else {
                Object[] objArr6 = this.f15171b;
                h.e(objArr6, objArr6, x10, x10 + 1, objArr6.length);
                Object[] objArr7 = this.f15171b;
                objArr7[objArr7.length - 1] = objArr7[0];
                h.e(objArr7, objArr7, 0, 1, x11 + 1);
            }
            this.f15171b[x11] = null;
        }
        this.f15172c = size() - 1;
        return e10;
    }

    public final void g(E e10) {
        u(size() + 1);
        int t10 = t(this.f15170a);
        this.f15170a = t10;
        this.f15171b[t10] = e10;
        this.f15172c = size() + 1;
    }

    @Override
    public E get(int i10) {
        b.f15159a.a(i10, size());
        return (E) this.f15171b[x(this.f15170a + i10)];
    }

    @Override
    public int getSize() {
        return this.f15172c;
    }

    @Override
    public int indexOf(Object obj) {
        int i10;
        int x10 = x(this.f15170a + size());
        int i11 = this.f15170a;
        if (i11 < x10) {
            while (i11 < x10) {
                if (k.b(obj, this.f15171b[i11])) {
                    i10 = this.f15170a;
                } else {
                    i11++;
                }
            }
            return -1;
        } else if (i11 < x10) {
            return -1;
        } else {
            int length = this.f15171b.length;
            while (true) {
                if (i11 >= length) {
                    for (int i12 = 0; i12 < x10; i12++) {
                        if (k.b(obj, this.f15171b[i12])) {
                            i11 = i12 + this.f15171b.length;
                            i10 = this.f15170a;
                        }
                    }
                    return -1;
                } else if (k.b(obj, this.f15171b[i11])) {
                    i10 = this.f15170a;
                    break;
                } else {
                    i11++;
                }
            }
        }
        return i11 - i10;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int lastIndexOf(Object obj) {
        int s10;
        int i10;
        int x10 = x(this.f15170a + size());
        int i11 = this.f15170a;
        if (i11 < x10) {
            s10 = x10 - 1;
            if (i11 <= s10) {
                while (!k.b(obj, this.f15171b[s10])) {
                    if (s10 != i11) {
                        s10--;
                    }
                }
                i10 = this.f15170a;
                return s10 - i10;
            }
            return -1;
        }
        if (i11 > x10) {
            int i12 = x10 - 1;
            while (true) {
                if (-1 >= i12) {
                    s10 = i.s(this.f15171b);
                    int i13 = this.f15170a;
                    if (i13 <= s10) {
                        while (!k.b(obj, this.f15171b[s10])) {
                            if (s10 != i13) {
                                s10--;
                            }
                        }
                        i10 = this.f15170a;
                    }
                } else if (k.b(obj, this.f15171b[i12])) {
                    s10 = i12 + this.f15171b.length;
                    i10 = this.f15170a;
                    break;
                } else {
                    i12--;
                }
            }
        }
        return -1;
    }

    public final void m(E e10) {
        u(size() + 1);
        this.f15171b[x(this.f15170a + size())] = e10;
        this.f15172c = size() + 1;
    }

    public final void r(int i10, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f15171b.length;
        while (i10 < length && it.hasNext()) {
            this.f15171b[i10] = it.next();
            i10++;
        }
        int i11 = this.f15170a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f15171b[i12] = it.next();
        }
        this.f15172c = size() + collection.size();
    }

    @Override
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override
    public boolean removeAll(Collection<? extends Object> collection) {
        int i10;
        k.e(collection, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if (!(this.f15171b.length == 0)) {
                int x10 = x(this.f15170a + size());
                int i11 = this.f15170a;
                if (i11 < x10) {
                    i10 = i11;
                    while (i11 < x10) {
                        Object obj = this.f15171b[i11];
                        if (!collection.contains(obj)) {
                            i10++;
                            this.f15171b[i10] = obj;
                        } else {
                            z10 = true;
                        }
                        i11++;
                    }
                    h.i(this.f15171b, null, i10, x10);
                } else {
                    int length = this.f15171b.length;
                    int i12 = i11;
                    boolean z11 = false;
                    while (i11 < length) {
                        Object[] objArr = this.f15171b;
                        Object obj2 = objArr[i11];
                        objArr[i11] = null;
                        if (!collection.contains(obj2)) {
                            i12++;
                            this.f15171b[i12] = obj2;
                        } else {
                            z11 = true;
                        }
                        i11++;
                    }
                    i10 = x(i12);
                    for (int i13 = 0; i13 < x10; i13++) {
                        Object[] objArr2 = this.f15171b;
                        Object obj3 = objArr2[i13];
                        objArr2[i13] = null;
                        if (!collection.contains(obj3)) {
                            this.f15171b[i10] = obj3;
                            i10 = v(i10);
                        } else {
                            z11 = true;
                        }
                    }
                    z10 = z11;
                }
                if (z10) {
                    this.f15172c = w(i10 - this.f15170a);
                }
            }
        }
        return z10;
    }

    @Override
    public boolean retainAll(Collection<? extends Object> collection) {
        int i10;
        k.e(collection, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if (!(this.f15171b.length == 0)) {
                int x10 = x(this.f15170a + size());
                int i11 = this.f15170a;
                if (i11 < x10) {
                    i10 = i11;
                    while (i11 < x10) {
                        Object obj = this.f15171b[i11];
                        if (collection.contains(obj)) {
                            i10++;
                            this.f15171b[i10] = obj;
                        } else {
                            z10 = true;
                        }
                        i11++;
                    }
                    h.i(this.f15171b, null, i10, x10);
                } else {
                    int length = this.f15171b.length;
                    int i12 = i11;
                    boolean z11 = false;
                    while (i11 < length) {
                        Object[] objArr = this.f15171b;
                        Object obj2 = objArr[i11];
                        objArr[i11] = null;
                        if (collection.contains(obj2)) {
                            i12++;
                            this.f15171b[i12] = obj2;
                        } else {
                            z11 = true;
                        }
                        i11++;
                    }
                    i10 = x(i12);
                    for (int i13 = 0; i13 < x10; i13++) {
                        Object[] objArr2 = this.f15171b;
                        Object obj3 = objArr2[i13];
                        objArr2[i13] = null;
                        if (collection.contains(obj3)) {
                            this.f15171b[i10] = obj3;
                            i10 = v(i10);
                        } else {
                            z11 = true;
                        }
                    }
                    z10 = z11;
                }
                if (z10) {
                    this.f15172c = w(i10 - this.f15170a);
                }
            }
        }
        return z10;
    }

    public final void s(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f15171b;
        h.e(objArr2, objArr, 0, this.f15170a, objArr2.length);
        Object[] objArr3 = this.f15171b;
        int length = objArr3.length;
        int i11 = this.f15170a;
        h.e(objArr3, objArr, length - i11, 0, i11);
        this.f15170a = 0;
        this.f15171b = objArr;
    }

    @Override
    public E set(int i10, E e10) {
        b.f15159a.a(i10, size());
        int x10 = x(this.f15170a + i10);
        Object[] objArr = this.f15171b;
        E e11 = (E) objArr[x10];
        objArr[x10] = e10;
        return e11;
    }

    public final int t(int i10) {
        return i10 == 0 ? i.s(this.f15171b) : i10 - 1;
    }

    @Override
    public <T> T[] toArray(T[] tArr) {
        k.e(tArr, "array");
        if (tArr.length < size()) {
            tArr = (T[]) f.a(tArr, size());
        }
        int x10 = x(this.f15170a + size());
        int i10 = this.f15170a;
        if (i10 < x10) {
            h.g(this.f15171b, tArr, 0, i10, x10, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f15171b;
            h.e(objArr, tArr, 0, this.f15170a, objArr.length);
            Object[] objArr2 = this.f15171b;
            h.e(objArr2, tArr, objArr2.length - this.f15170a, 0, x10);
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        return tArr;
    }

    public final void u(int i10) {
        if (i10 >= 0) {
            Object[] objArr = this.f15171b;
            if (i10 > objArr.length) {
                if (objArr == N) {
                    this.f15171b = new Object[l.d(i10, 10)];
                } else {
                    s(M.a(objArr.length, i10));
                }
            }
        } else {
            throw new IllegalStateException("Deque is too big.");
        }
    }

    public final int v(int i10) {
        if (i10 == i.s(this.f15171b)) {
            return 0;
        }
        return i10 + 1;
    }

    public final int w(int i10) {
        return i10 < 0 ? i10 + this.f15171b.length : i10;
    }

    public final int x(int i10) {
        Object[] objArr = this.f15171b;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    public final E y() {
        if (!isEmpty()) {
            Object[] objArr = this.f15171b;
            int i10 = this.f15170a;
            E e10 = (E) objArr[i10];
            objArr[i10] = null;
            this.f15170a = v(i10);
            this.f15172c = size() - 1;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E z() {
        if (!isEmpty()) {
            int x10 = x(this.f15170a + n.g(this));
            Object[] objArr = this.f15171b;
            E e10 = (E) objArr[x10];
            objArr[x10] = null;
            this.f15172c = size() - 1;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override
    public void add(int i10, E e10) {
        b.f15159a.b(i10, size());
        if (i10 == size()) {
            m(e10);
        } else if (i10 == 0) {
            g(e10);
        } else {
            u(size() + 1);
            int x10 = x(this.f15170a + i10);
            if (i10 < ((size() + 1) >> 1)) {
                int t10 = t(x10);
                int t11 = t(this.f15170a);
                int i11 = this.f15170a;
                if (t10 >= i11) {
                    Object[] objArr = this.f15171b;
                    objArr[t11] = objArr[i11];
                    h.e(objArr, objArr, i11, i11 + 1, t10 + 1);
                } else {
                    Object[] objArr2 = this.f15171b;
                    h.e(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                    Object[] objArr3 = this.f15171b;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    h.e(objArr3, objArr3, 0, 1, t10 + 1);
                }
                this.f15171b[t10] = e10;
                this.f15170a = t11;
            } else {
                int x11 = x(this.f15170a + size());
                if (x10 < x11) {
                    Object[] objArr4 = this.f15171b;
                    h.e(objArr4, objArr4, x10 + 1, x10, x11);
                } else {
                    Object[] objArr5 = this.f15171b;
                    h.e(objArr5, objArr5, 1, 0, x11);
                    Object[] objArr6 = this.f15171b;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    h.e(objArr6, objArr6, x10 + 1, x10, objArr6.length - 1);
                }
                this.f15171b[x10] = e10;
            }
            this.f15172c = size() + 1;
        }
    }

    @Override
    public boolean addAll(int i10, Collection<? extends E> collection) {
        k.e(collection, "elements");
        b.f15159a.b(i10, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(collection);
        }
        u(size() + collection.size());
        int x10 = x(this.f15170a + size());
        int x11 = x(this.f15170a + i10);
        int size = collection.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f15170a;
            int i12 = i11 - size;
            if (x11 < i11) {
                Object[] objArr = this.f15171b;
                h.e(objArr, objArr, i12, i11, objArr.length);
                if (size >= x11) {
                    Object[] objArr2 = this.f15171b;
                    h.e(objArr2, objArr2, objArr2.length - size, 0, x11);
                } else {
                    Object[] objArr3 = this.f15171b;
                    h.e(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f15171b;
                    h.e(objArr4, objArr4, 0, size, x11);
                }
            } else if (i12 >= 0) {
                Object[] objArr5 = this.f15171b;
                h.e(objArr5, objArr5, i12, i11, x11);
            } else {
                Object[] objArr6 = this.f15171b;
                i12 += objArr6.length;
                int i13 = x11 - i11;
                int length = objArr6.length - i12;
                if (length >= i13) {
                    h.e(objArr6, objArr6, i12, i11, x11);
                } else {
                    h.e(objArr6, objArr6, i12, i11, i11 + length);
                    Object[] objArr7 = this.f15171b;
                    h.e(objArr7, objArr7, 0, this.f15170a + length, x11);
                }
            }
            this.f15170a = i12;
            r(w(x11 - size), collection);
        } else {
            int i14 = x11 + size;
            if (x11 < x10) {
                int i15 = size + x10;
                Object[] objArr8 = this.f15171b;
                if (i15 <= objArr8.length) {
                    h.e(objArr8, objArr8, i14, x11, x10);
                } else if (i14 >= objArr8.length) {
                    h.e(objArr8, objArr8, i14 - objArr8.length, x11, x10);
                } else {
                    int length2 = x10 - (i15 - objArr8.length);
                    h.e(objArr8, objArr8, 0, length2, x10);
                    Object[] objArr9 = this.f15171b;
                    h.e(objArr9, objArr9, i14, x11, length2);
                }
            } else {
                Object[] objArr10 = this.f15171b;
                h.e(objArr10, objArr10, size, 0, x10);
                Object[] objArr11 = this.f15171b;
                if (i14 >= objArr11.length) {
                    h.e(objArr11, objArr11, i14 - objArr11.length, x11, objArr11.length);
                } else {
                    h.e(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f15171b;
                    h.e(objArr12, objArr12, i14, x11, objArr12.length - size);
                }
            }
            r(x11, collection);
        }
        return true;
    }

    @Override
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
