package p126j$.util.concurrent;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import p126j$.util.AbstractC5468G;
import p126j$.util.AbstractC5485a;
import p126j$.util.AbstractC5486b;
import p126j$.util.function.AbstractC5541w;
import p126j$.util.function.C5520b;
import p126j$.util.function.Consumer;
import p126j$.util.stream.C5685b3;

final class C5495f extends AbstractC5492c implements Set, AbstractC5486b {
    public C5495f(ConcurrentHashMap concurrentHashMap) {
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
                    consumer.mo22128k(new C5501l(b.f18021b, b.f18022c, this.f18010a));
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (add((Map.Entry) it.next())) {
                z = true;
            }
        }
        return z;
    }

    @Override
    public boolean mo22508b(AbstractC5541w wVar) {
        return AbstractC5485a.m22566o(this, wVar);
    }

    public boolean add(Map.Entry entry) {
        return this.f18010a.m22545h(entry.getKey(), entry.getValue(), false) == null;
    }

    @Override
    public boolean contains(Object obj) {
        Map.Entry entry;
        Object key;
        Object obj2;
        Object value;
        return (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (obj2 = this.f18010a.get(key)) == null || (value = entry.getValue()) == null || (value != obj2 && !value.equals(obj2))) ? false : true;
    }

    @Override
    public final boolean equals(Object obj) {
        Set set;
        return (obj instanceof Set) && ((set = (Set) obj) == this || (containsAll(set) && set.containsAll(this)));
    }

    @Override
    public void forEach(java.util.function.Consumer consumer) {
        mo22509a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public final int hashCode() {
        C5502m[] mVarArr = this.f18010a.f17995a;
        int i = 0;
        if (mVarArr != null) {
            C5506q qVar = new C5506q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                C5502m b = qVar.m22521b();
                if (b == null) {
                    break;
                }
                i += b.hashCode();
            }
        }
        return i;
    }

    @Override
    public Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.f18010a;
        C5502m[] mVarArr = concurrentHashMap.f17995a;
        int length = mVarArr == null ? 0 : mVarArr.length;
        return new C5494e(mVarArr, length, 0, length, concurrentHashMap);
    }

    @Override
    public Stream parallelStream() {
        return C5685b3.m22312i(AbstractC5485a.m22567k(this));
    }

    @Override
    public boolean remove(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && this.f18010a.remove(key, value);
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
        return new C5496g(mVarArr, length, 0, length, j, concurrentHashMap);
    }
}
