package p126j$.util.concurrent;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public abstract class AbstractC5492c implements Collection, Serializable {
    final ConcurrentHashMap f18010a;

    public AbstractC5492c(ConcurrentHashMap concurrentHashMap) {
        this.f18010a = concurrentHashMap;
    }

    @Override
    public final void clear() {
        this.f18010a.clear();
    }

    @Override
    public abstract boolean contains(Object obj);

    @Override
    public final boolean containsAll(java.util.Collection r2) {
        throw new UnsupportedOperationException("Method not decompiled: p126j$.util.concurrent.AbstractC5492c.containsAll(java.util.Collection):boolean");
    }

    @Override
    public final boolean isEmpty() {
        return this.f18010a.isEmpty();
    }

    @Override
    public abstract Iterator iterator();

    @Override
    public final boolean removeAll(Collection collection) {
        Objects.requireNonNull(collection);
        boolean z = false;
        Iterator it = iterator();
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        Objects.requireNonNull(collection);
        boolean z = false;
        Iterator it = iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override
    public final int size() {
        return this.f18010a.size();
    }

    @Override
    public final Object[] toArray() {
        long m = this.f18010a.m22540m();
        if (m < 0) {
            m = 0;
        }
        if (m <= 2147483639) {
            int i = (int) m;
            Object[] objArr = new Object[i];
            int i2 = 0;
            Iterator it = iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (i2 == i) {
                    int i3 = 2147483639;
                    if (i < 2147483639) {
                        if (i < 1073741819) {
                            i3 = (i >>> 1) + 1 + i;
                        }
                        objArr = Arrays.copyOf(objArr, i3);
                        i = i3;
                    } else {
                        throw new OutOfMemoryError("Required array size too large");
                    }
                }
                i2++;
                objArr[i2] = next;
            }
            return i2 == i ? objArr : Arrays.copyOf(objArr, i2);
        }
        throw new OutOfMemoryError("Required array size too large");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        Iterator it = iterator();
        if (it.hasNext()) {
            while (true) {
                Object next = it.next();
                if (next == this) {
                    next = "(this Collection)";
                }
                sb2.append(next);
                if (!it.hasNext()) {
                    break;
                }
                sb2.append(',');
                sb2.append(' ');
            }
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        long m = this.f18010a.m22540m();
        if (m < 0) {
            m = 0;
        }
        if (m <= 2147483639) {
            int i = (int) m;
            Object[] objArr2 = objArr.length >= i ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
            int length = objArr2.length;
            int i2 = 0;
            Iterator it = iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (i2 == length) {
                    int i3 = 2147483639;
                    if (length < 2147483639) {
                        if (length < 1073741819) {
                            i3 = (length >>> 1) + 1 + length;
                        }
                        objArr2 = Arrays.copyOf(objArr2, i3);
                        length = i3;
                    } else {
                        throw new OutOfMemoryError("Required array size too large");
                    }
                }
                i2++;
                objArr2[i2] = next;
            }
            if (objArr != objArr2 || i2 >= length) {
                return i2 == length ? objArr2 : Arrays.copyOf(objArr2, i2);
            }
            objArr2[i2] = null;
            return objArr2;
        }
        throw new OutOfMemoryError("Required array size too large");
    }
}
