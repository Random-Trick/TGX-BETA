package p123ia;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p317wa.C10030l;
import qa.C8294g;
import qa.C8298k;

public final class C5287e<E> extends AbstractC5283c<E> {
    public static final C5288a f17481M = new C5288a(null);
    public static final Object[] f17482N = new Object[0];
    public int f17483a;
    public Object[] f17484b = f17482N;
    public int f17485c;

    public static final class C5288a {
        public C5288a() {
        }

        public C5288a(C8294g gVar) {
            this();
        }

        public final int m23439a(int i, int i2) {
            int i3 = i + (i >> 1);
            if (i3 - i2 < 0) {
                i3 = i2;
            }
            return i3 - 2147483639 > 0 ? i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i3;
        }
    }

    public final void m23457A(int i) {
        if (i >= 0) {
            Object[] objArr = this.f17484b;
            if (i > objArr.length) {
                if (objArr == f17482N) {
                    this.f17484b = new Object[C10030l.m6193d(i, 10)];
                } else {
                    m23441y(f17481M.m23439a(objArr.length, i));
                }
            }
        } else {
            throw new IllegalStateException("Deque is too big.");
        }
    }

    public final int m23456B(int i) {
        if (i == C5296i.m23388s(this.f17484b)) {
            return 0;
        }
        return i + 1;
    }

    public final int m23455C(int i) {
        return i < 0 ? i + this.f17484b.length : i;
    }

    public final int m23454D(int i) {
        Object[] objArr = this.f17484b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final E m23453E() {
        if (!isEmpty()) {
            E e = (E) this.f17484b[this.f17483a];
            Object[] objArr = this.f17484b;
            int i = this.f17483a;
            objArr[i] = null;
            this.f17483a = m23456B(i);
            this.f17485c = size() - 1;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E m23452F() {
        if (!isEmpty()) {
            int D = m23454D(this.f17483a + C5304n.m23365g(this));
            E e = (E) this.f17484b[D];
            this.f17484b[D] = null;
            this.f17485c = size() - 1;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override
    public boolean add(E e) {
        m23443w(e);
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        C8298k.m12934e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        m23457A(size() + collection.size());
        m23442x(m23454D(this.f17483a + size()), collection);
        return true;
    }

    @Override
    public void clear() {
        int D = m23454D(this.f17483a + size());
        int i = this.f17483a;
        if (i < D) {
            C5294h.m23427i(this.f17484b, null, i, D);
        } else if (!isEmpty()) {
            Object[] objArr = this.f17484b;
            C5294h.m23427i(objArr, null, this.f17483a, objArr.length);
            C5294h.m23427i(this.f17484b, null, 0, D);
        }
        this.f17483a = 0;
        this.f17485c = 0;
    }

    @Override
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override
    public E get(int i) {
        AbstractC5277b.f17469a.m23465a(i, size());
        return (E) this.f17484b[m23454D(this.f17483a + i)];
    }

    @Override
    public int getSize() {
        return this.f17485c;
    }

    @Override
    public E mo23451h(int i) {
        AbstractC5277b.f17469a.m23465a(i, size());
        if (i == C5304n.m23365g(this)) {
            return m23452F();
        }
        if (i == 0) {
            return m23453E();
        }
        int D = m23454D(this.f17483a + i);
        E e = (E) this.f17484b[D];
        if (i < (size() >> 1)) {
            int i2 = this.f17483a;
            if (D >= i2) {
                Object[] objArr = this.f17484b;
                C5294h.m23431e(objArr, objArr, i2 + 1, i2, D);
            } else {
                Object[] objArr2 = this.f17484b;
                C5294h.m23431e(objArr2, objArr2, 1, 0, D);
                Object[] objArr3 = this.f17484b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i3 = this.f17483a;
                C5294h.m23431e(objArr3, objArr3, i3 + 1, i3, objArr3.length - 1);
            }
            Object[] objArr4 = this.f17484b;
            int i4 = this.f17483a;
            objArr4[i4] = null;
            this.f17483a = m23456B(i4);
        } else {
            int D2 = m23454D(this.f17483a + C5304n.m23365g(this));
            if (D <= D2) {
                Object[] objArr5 = this.f17484b;
                C5294h.m23431e(objArr5, objArr5, D, D + 1, D2 + 1);
            } else {
                Object[] objArr6 = this.f17484b;
                C5294h.m23431e(objArr6, objArr6, D, D + 1, objArr6.length);
                Object[] objArr7 = this.f17484b;
                objArr7[objArr7.length - 1] = objArr7[0];
                C5294h.m23431e(objArr7, objArr7, 0, 1, D2 + 1);
            }
            this.f17484b[D2] = null;
        }
        this.f17485c = size() - 1;
        return e;
    }

    @Override
    public int indexOf(Object obj) {
        int i;
        int D = m23454D(this.f17483a + size());
        int i2 = this.f17483a;
        if (i2 < D) {
            while (i2 < D) {
                i2++;
                if (C8298k.m12937b(obj, this.f17484b[i2])) {
                    i = this.f17483a;
                }
            }
            return -1;
        } else if (i2 < D) {
            return -1;
        } else {
            int length = this.f17484b.length;
            while (true) {
                if (i2 < length) {
                    i2++;
                    if (C8298k.m12937b(obj, this.f17484b[i2])) {
                        i = this.f17483a;
                        break;
                    }
                } else {
                    int i3 = 0;
                    while (i3 < D) {
                        i3++;
                        if (C8298k.m12937b(obj, this.f17484b[i3])) {
                            i2 = i3 + this.f17484b.length;
                            i = this.f17483a;
                        }
                    }
                    return -1;
                }
            }
        }
        return i2 - i;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int lastIndexOf(Object obj) {
        int s;
        int i;
        int D = m23454D(this.f17483a + size());
        int i2 = this.f17483a;
        if (i2 < D) {
            s = D - 1;
            if (i2 > s) {
                return -1;
            }
            while (true) {
                s--;
                if (C8298k.m12937b(obj, this.f17484b[s])) {
                    i = this.f17483a;
                    break;
                } else if (s == i2) {
                    return -1;
                }
            }
        } else if (i2 <= D) {
            return -1;
        } else {
            int i3 = D - 1;
            if (i3 >= 0) {
                while (true) {
                    int i4 = i3 - 1;
                    if (C8298k.m12937b(obj, this.f17484b[i3])) {
                        s = i3 + this.f17484b.length;
                        i = this.f17483a;
                        break;
                    } else if (i4 < 0) {
                        break;
                    } else {
                        i3 = i4;
                    }
                }
            }
            s = C5296i.m23388s(this.f17484b);
            int i5 = this.f17483a;
            if (i5 > s) {
                return -1;
            }
            while (true) {
                s--;
                if (C8298k.m12937b(obj, this.f17484b[s])) {
                    i = this.f17483a;
                    break;
                } else if (s == i5) {
                    return -1;
                }
            }
        }
        return s - i;
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
        C8298k.m12934e(collection, "elements");
        boolean z = false;
        z = false;
        int i = 0;
        z = false;
        if (!isEmpty()) {
            if (!(this.f17484b.length == 0)) {
                int D = m23454D(this.f17483a + size());
                int i2 = this.f17483a;
                if (this.f17483a < D) {
                    int i3 = this.f17483a;
                    while (i3 < D) {
                        int i4 = i3 + 1;
                        Object obj = this.f17484b[i3];
                        if (!collection.contains(obj)) {
                            i2++;
                            this.f17484b[i2] = obj;
                            i3 = i4;
                        } else {
                            i3 = i4;
                            z = true;
                        }
                    }
                    C5294h.m23427i(this.f17484b, null, i2, D);
                } else {
                    int i5 = this.f17483a;
                    int length = this.f17484b.length;
                    boolean z2 = false;
                    while (i5 < length) {
                        int i6 = i5 + 1;
                        Object obj2 = this.f17484b[i5];
                        this.f17484b[i5] = null;
                        if (!collection.contains(obj2)) {
                            i2++;
                            this.f17484b[i2] = obj2;
                            i5 = i6;
                        } else {
                            i5 = i6;
                            z2 = true;
                        }
                    }
                    i2 = m23454D(i2);
                    while (i < D) {
                        int i7 = i + 1;
                        Object obj3 = this.f17484b[i];
                        this.f17484b[i] = null;
                        if (!collection.contains(obj3)) {
                            this.f17484b[i2] = obj3;
                            i2 = m23456B(i2);
                            i = i7;
                        } else {
                            i = i7;
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    this.f17485c = m23455C(i2 - this.f17483a);
                }
            }
        }
        return z;
    }

    @Override
    public boolean retainAll(Collection<? extends Object> collection) {
        C8298k.m12934e(collection, "elements");
        boolean z = false;
        z = false;
        int i = 0;
        z = false;
        if (!isEmpty()) {
            if (!(this.f17484b.length == 0)) {
                int D = m23454D(this.f17483a + size());
                int i2 = this.f17483a;
                if (this.f17483a < D) {
                    int i3 = this.f17483a;
                    while (i3 < D) {
                        int i4 = i3 + 1;
                        Object obj = this.f17484b[i3];
                        if (collection.contains(obj)) {
                            i2++;
                            this.f17484b[i2] = obj;
                            i3 = i4;
                        } else {
                            i3 = i4;
                            z = true;
                        }
                    }
                    C5294h.m23427i(this.f17484b, null, i2, D);
                } else {
                    int i5 = this.f17483a;
                    int length = this.f17484b.length;
                    boolean z2 = false;
                    while (i5 < length) {
                        int i6 = i5 + 1;
                        Object obj2 = this.f17484b[i5];
                        this.f17484b[i5] = null;
                        if (collection.contains(obj2)) {
                            i2++;
                            this.f17484b[i2] = obj2;
                            i5 = i6;
                        } else {
                            i5 = i6;
                            z2 = true;
                        }
                    }
                    i2 = m23454D(i2);
                    while (i < D) {
                        int i7 = i + 1;
                        Object obj3 = this.f17484b[i];
                        this.f17484b[i] = null;
                        if (collection.contains(obj3)) {
                            this.f17484b[i2] = obj3;
                            i2 = m23456B(i2);
                            i = i7;
                        } else {
                            i = i7;
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    this.f17485c = m23455C(i2 - this.f17483a);
                }
            }
        }
        return z;
    }

    @Override
    public E set(int i, E e) {
        AbstractC5277b.f17469a.m23465a(i, size());
        int D = m23454D(this.f17483a + i);
        E e2 = (E) this.f17484b[D];
        this.f17484b[D] = e;
        return e2;
    }

    @Override
    public <T> T[] toArray(T[] tArr) {
        C8298k.m12934e(tArr, "array");
        if (tArr.length < size()) {
            tArr = (T[]) C5290f.m23438a(tArr, size());
        }
        int D = m23454D(this.f17483a + size());
        int i = this.f17483a;
        if (i < D) {
            C5294h.m23429g(this.f17484b, tArr, 0, i, D, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f17484b;
            C5294h.m23431e(objArr, tArr, 0, this.f17483a, objArr.length);
            Object[] objArr2 = this.f17484b;
            C5294h.m23431e(objArr2, tArr, objArr2.length - this.f17483a, 0, D);
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        return tArr;
    }

    public final void m23444v(E e) {
        m23457A(size() + 1);
        int z = m23440z(this.f17483a);
        this.f17483a = z;
        this.f17484b[z] = e;
        this.f17485c = size() + 1;
    }

    public final void m23443w(E e) {
        m23457A(size() + 1);
        this.f17484b[m23454D(this.f17483a + size())] = e;
        this.f17485c = size() + 1;
    }

    public final void m23442x(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f17484b.length;
        while (i < length) {
            i++;
            if (!it.hasNext()) {
                break;
            }
            this.f17484b[i] = it.next();
        }
        int i2 = 0;
        int i3 = this.f17483a;
        while (i2 < i3) {
            i2++;
            if (!it.hasNext()) {
                break;
            }
            this.f17484b[i2] = it.next();
        }
        this.f17485c = size() + collection.size();
    }

    public final void m23441y(int i) {
        Object[] objArr = new Object[i];
        Object[] objArr2 = this.f17484b;
        C5294h.m23431e(objArr2, objArr, 0, this.f17483a, objArr2.length);
        Object[] objArr3 = this.f17484b;
        int length = objArr3.length;
        int i2 = this.f17483a;
        C5294h.m23431e(objArr3, objArr, length - i2, 0, i2);
        this.f17483a = 0;
        this.f17484b = objArr;
    }

    public final int m23440z(int i) {
        return i == 0 ? C5296i.m23388s(this.f17484b) : i - 1;
    }

    @Override
    public void add(int i, E e) {
        AbstractC5277b.f17469a.m23464b(i, size());
        if (i == size()) {
            m23443w(e);
        } else if (i == 0) {
            m23444v(e);
        } else {
            m23457A(size() + 1);
            int D = m23454D(this.f17483a + i);
            if (i < ((size() + 1) >> 1)) {
                int z = m23440z(D);
                int z2 = m23440z(this.f17483a);
                int i2 = this.f17483a;
                if (z >= i2) {
                    Object[] objArr = this.f17484b;
                    objArr[z2] = objArr[i2];
                    C5294h.m23431e(objArr, objArr, i2, i2 + 1, z + 1);
                } else {
                    Object[] objArr2 = this.f17484b;
                    C5294h.m23431e(objArr2, objArr2, i2 - 1, i2, objArr2.length);
                    Object[] objArr3 = this.f17484b;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    C5294h.m23431e(objArr3, objArr3, 0, 1, z + 1);
                }
                this.f17484b[z] = e;
                this.f17483a = z2;
            } else {
                int D2 = m23454D(this.f17483a + size());
                if (D < D2) {
                    Object[] objArr4 = this.f17484b;
                    C5294h.m23431e(objArr4, objArr4, D + 1, D, D2);
                } else {
                    Object[] objArr5 = this.f17484b;
                    C5294h.m23431e(objArr5, objArr5, 1, 0, D2);
                    Object[] objArr6 = this.f17484b;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    C5294h.m23431e(objArr6, objArr6, D + 1, D, objArr6.length - 1);
                }
                this.f17484b[D] = e;
            }
            this.f17485c = size() + 1;
        }
    }

    @Override
    public boolean addAll(int i, Collection<? extends E> collection) {
        C8298k.m12934e(collection, "elements");
        AbstractC5277b.f17469a.m23464b(i, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        m23457A(size() + collection.size());
        int D = m23454D(this.f17483a + size());
        int D2 = m23454D(this.f17483a + i);
        int size = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.f17483a;
            int i3 = i2 - size;
            if (D2 < i2) {
                Object[] objArr = this.f17484b;
                C5294h.m23431e(objArr, objArr, i3, i2, objArr.length);
                if (size >= D2) {
                    Object[] objArr2 = this.f17484b;
                    C5294h.m23431e(objArr2, objArr2, objArr2.length - size, 0, D2);
                } else {
                    Object[] objArr3 = this.f17484b;
                    C5294h.m23431e(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f17484b;
                    C5294h.m23431e(objArr4, objArr4, 0, size, D2);
                }
            } else if (i3 >= 0) {
                Object[] objArr5 = this.f17484b;
                C5294h.m23431e(objArr5, objArr5, i3, i2, D2);
            } else {
                Object[] objArr6 = this.f17484b;
                i3 += objArr6.length;
                int i4 = D2 - i2;
                int length = objArr6.length - i3;
                if (length >= i4) {
                    C5294h.m23431e(objArr6, objArr6, i3, i2, D2);
                } else {
                    C5294h.m23431e(objArr6, objArr6, i3, i2, i2 + length);
                    Object[] objArr7 = this.f17484b;
                    C5294h.m23431e(objArr7, objArr7, 0, this.f17483a + length, D2);
                }
            }
            this.f17483a = i3;
            m23442x(m23455C(D2 - size), collection);
        } else {
            int i5 = D2 + size;
            if (D2 < D) {
                int i6 = size + D;
                Object[] objArr8 = this.f17484b;
                if (i6 <= objArr8.length) {
                    C5294h.m23431e(objArr8, objArr8, i5, D2, D);
                } else if (i5 >= objArr8.length) {
                    C5294h.m23431e(objArr8, objArr8, i5 - objArr8.length, D2, D);
                } else {
                    int length2 = D - (i6 - objArr8.length);
                    C5294h.m23431e(objArr8, objArr8, 0, length2, D);
                    Object[] objArr9 = this.f17484b;
                    C5294h.m23431e(objArr9, objArr9, i5, D2, length2);
                }
            } else {
                Object[] objArr10 = this.f17484b;
                C5294h.m23431e(objArr10, objArr10, size, 0, D);
                Object[] objArr11 = this.f17484b;
                if (i5 >= objArr11.length) {
                    C5294h.m23431e(objArr11, objArr11, i5 - objArr11.length, D2, objArr11.length);
                } else {
                    C5294h.m23431e(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f17484b;
                    C5294h.m23431e(objArr12, objArr12, i5, D2, objArr12.length - size);
                }
            }
            m23442x(D2, collection);
        }
        return true;
    }

    @Override
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
