package j$.util.concurrent;

import j$.util.AbstractC0264a;
import j$.util.AbstractC0265b;
import j$.util.H;
import j$.util.function.C0274b;
import j$.util.function.Consumer;
import j$.util.function.E;
import j$.util.stream.C0305c3;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public final class j extends AbstractC0269c implements Set, AbstractC0265b {
    public j(ConcurrentHashMap concurrentHashMap) {
        super(concurrentHashMap);
    }

    @Override
    public final void a(Consumer consumer) {
        Objects.requireNonNull(consumer);
        m[] mVarArr = this.f14402a.f14387a;
        if (mVarArr != null) {
            q qVar = new q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                m b10 = qVar.b();
                if (b10 != null) {
                    consumer.l(b10.f14413b);
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean b(E e10) {
        return AbstractC0264a.o(this, e10);
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f14402a.containsKey(obj);
    }

    @Override
    public final boolean equals(Object obj) {
        Set set;
        return (obj instanceof Set) && ((set = (Set) obj) == this || (containsAll(set) && set.containsAll(this)));
    }

    @Override
    public final void forEach(java.util.function.Consumer consumer) {
        a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public final int hashCode() {
        Iterator it = iterator();
        int i10 = 0;
        while (((AbstractC0268b) it).hasNext()) {
            i10 += ((i) it).next().hashCode();
        }
        return i10;
    }

    @Override
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.f14402a;
        m[] mVarArr = concurrentHashMap.f14387a;
        int length = mVarArr == null ? 0 : mVarArr.length;
        return new i(mVarArr, length, length, concurrentHashMap, 0);
    }

    @Override
    public final Stream parallelStream() {
        return C0305c3.i(AbstractC0264a.l(this));
    }

    @Override
    public final boolean remove(Object obj) {
        return this.f14402a.remove(obj) != null;
    }

    @Override
    public final boolean removeIf(Predicate predicate) {
        return AbstractC0264a.o(this, C0274b.u(predicate));
    }

    @Override
    public final H spliterator() {
        ConcurrentHashMap concurrentHashMap = this.f14402a;
        long m10 = concurrentHashMap.m();
        m[] mVarArr = concurrentHashMap.f14387a;
        int length = mVarArr == null ? 0 : mVarArr.length;
        long j10 = 0;
        if (m10 >= 0) {
            j10 = m10;
        }
        return new k(mVarArr, length, 0, length, j10, 0);
    }
}
