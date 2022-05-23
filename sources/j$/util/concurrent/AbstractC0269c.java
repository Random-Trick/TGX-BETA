package j$.util.concurrent;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public abstract class AbstractC0269c implements Collection, Serializable {
    final ConcurrentHashMap f14402a;

    public AbstractC0269c(ConcurrentHashMap concurrentHashMap) {
        this.f14402a = concurrentHashMap;
    }

    @Override
    public final void clear() {
        this.f14402a.clear();
    }

    @Override
    public abstract boolean contains(Object obj);

    @Override
    public final boolean containsAll(java.util.Collection r2) {
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.AbstractC0269c.containsAll(java.util.Collection):boolean");
    }

    @Override
    public final boolean isEmpty() {
        return this.f14402a.isEmpty();
    }

    @Override
    public abstract Iterator iterator();

    @Override
    public final boolean removeAll(Collection collection) {
        Objects.requireNonNull(collection);
        boolean z10 = false;
        Iterator it = iterator();
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        Objects.requireNonNull(collection);
        boolean z10 = false;
        Iterator it = iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override
    public final int size() {
        return this.f14402a.size();
    }

    @Override
    public final Object[] toArray() {
        long m10 = this.f14402a.m();
        if (m10 < 0) {
            m10 = 0;
        }
        if (m10 <= 2147483639) {
            int i10 = (int) m10;
            Object[] objArr = new Object[i10];
            int i11 = 0;
            Iterator it = iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (i11 == i10) {
                    int i12 = 2147483639;
                    if (i10 < 2147483639) {
                        if (i10 < 1073741819) {
                            i12 = (i10 >>> 1) + 1 + i10;
                        }
                        objArr = Arrays.copyOf(objArr, i12);
                        i10 = i12;
                    } else {
                        throw new OutOfMemoryError("Required array size too large");
                    }
                }
                i11++;
                objArr[i11] = next;
            }
            return i11 == i10 ? objArr : Arrays.copyOf(objArr, i11);
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
        long m10 = this.f14402a.m();
        if (m10 < 0) {
            m10 = 0;
        }
        if (m10 <= 2147483639) {
            int i10 = (int) m10;
            Object[] objArr2 = objArr.length >= i10 ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
            int length = objArr2.length;
            int i11 = 0;
            Iterator it = iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (i11 == length) {
                    int i12 = 2147483639;
                    if (length < 2147483639) {
                        if (length < 1073741819) {
                            i12 = (length >>> 1) + 1 + length;
                        }
                        objArr2 = Arrays.copyOf(objArr2, i12);
                        length = i12;
                    } else {
                        throw new OutOfMemoryError("Required array size too large");
                    }
                }
                i11++;
                objArr2[i11] = next;
            }
            if (objArr != objArr2 || i11 >= length) {
                return i11 == length ? objArr2 : Arrays.copyOf(objArr2, i11);
            }
            objArr2[i11] = null;
            return objArr2;
        }
        throw new OutOfMemoryError("Required array size too large");
    }
}
