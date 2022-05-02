package p126j$.util.concurrent;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;
import p126j$.util.AbstractC5468G;
import p126j$.util.AbstractC5485a;
import p126j$.util.AbstractC5486b;
import p126j$.util.function.AbstractC5541w;
import p126j$.util.function.C5520b;
import p126j$.util.function.Consumer;
import p126j$.util.stream.C5685b3;

final class C5509t extends AbstractC5492c implements AbstractC5486b {
    public C5509t(ConcurrentHashMap concurrentHashMap) {
        super(concurrentHashMap);
    }

    @Override
    public void mo22509a(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C5502m[] mVarArr = this.f18010a.f17995a;
        if (mVarArr != null) {
            C5506q qVar = new C5506q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                C5502m b = qVar.m22521b();
                if (b != null) {
                    consumer.mo22128k(b.f18022c);
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
    public boolean mo22508b(AbstractC5541w wVar) {
        return AbstractC5485a.m22566o(this, wVar);
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f18010a.containsValue(obj);
    }

    @Override
    public void forEach(java.util.function.Consumer consumer) {
        mo22509a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.f18010a;
        C5502m[] mVarArr = concurrentHashMap.f17995a;
        int length = mVarArr == null ? 0 : mVarArr.length;
        return new C5498i(mVarArr, length, 0, length, concurrentHashMap, 1);
    }

    @Override
    public Stream parallelStream() {
        return C5685b3.m22312i(AbstractC5485a.m22567k(this));
    }

    @Override
    public final boolean remove(Object obj) {
        AbstractC5491b bVar;
        if (obj == null) {
            return false;
        }
        Iterator it = iterator();
        do {
            bVar = (AbstractC5491b) it;
            if (!bVar.hasNext()) {
                return false;
            }
        } while (!obj.equals(((C5498i) it).next()));
        bVar.remove();
        return true;
    }

    @Override
    public boolean removeIf(Predicate predicate) {
        return AbstractC5485a.m22566o(this, C5520b.m22486v(predicate));
    }

    @Override
    public AbstractC5468G spliterator() {
        ConcurrentHashMap concurrentHashMap = this.f18010a;
        long m = concurrentHashMap.m22540m();
        C5502m[] mVarArr = concurrentHashMap.f17995a;
        int length = mVarArr == null ? 0 : mVarArr.length;
        long j = 0;
        if (m >= 0) {
            j = m;
        }
        return new C5500k(mVarArr, length, 0, length, j, 1);
    }
}
