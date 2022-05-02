package p170m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class C6531b<K, V> implements Iterable<Map.Entry<K, V>> {
    public C6534c<K, V> f20344a;
    public C6534c<K, V> f20345b;
    public WeakHashMap<AbstractC6537f<K, V>, Boolean> f20346c = new WeakHashMap<>();
    public int f20343M = 0;

    public static class C6532a<K, V> extends AbstractC6536e<K, V> {
        public C6532a(C6534c<K, V> cVar, C6534c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override
        public C6534c<K, V> mo20144b(C6534c<K, V> cVar) {
            return cVar.f20347M;
        }

        @Override
        public C6534c<K, V> mo20143c(C6534c<K, V> cVar) {
            return cVar.f20350c;
        }
    }

    public static class C6533b<K, V> extends AbstractC6536e<K, V> {
        public C6533b(C6534c<K, V> cVar, C6534c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override
        public C6534c<K, V> mo20144b(C6534c<K, V> cVar) {
            return cVar.f20350c;
        }

        @Override
        public C6534c<K, V> mo20143c(C6534c<K, V> cVar) {
            return cVar.f20347M;
        }
    }

    public static class C6534c<K, V> implements Map.Entry<K, V> {
        public C6534c<K, V> f20347M;
        public final K f20348a;
        public final V f20349b;
        public C6534c<K, V> f20350c;

        public C6534c(K k, V v) {
            this.f20348a = k;
            this.f20349b = v;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6534c)) {
                return false;
            }
            C6534c cVar = (C6534c) obj;
            return this.f20348a.equals(cVar.f20348a) && this.f20349b.equals(cVar.f20349b);
        }

        @Override
        public K getKey() {
            return this.f20348a;
        }

        @Override
        public V getValue() {
            return this.f20349b;
        }

        @Override
        public int hashCode() {
            return this.f20348a.hashCode() ^ this.f20349b.hashCode();
        }

        @Override
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f20348a + "=" + this.f20349b;
        }
    }

    public class C6535d implements Iterator<Map.Entry<K, V>>, AbstractC6537f<K, V> {
        public C6534c<K, V> f20351a;
        public boolean f20352b = true;

        public C6535d() {
        }

        @Override
        public void mo20140a(C6534c<K, V> cVar) {
            C6534c<K, V> cVar2 = this.f20351a;
            if (cVar == cVar2) {
                C6534c<K, V> cVar3 = cVar2.f20347M;
                this.f20351a = cVar3;
                this.f20352b = cVar3 == null;
            }
        }

        public Map.Entry<K, V> next() {
            if (this.f20352b) {
                this.f20352b = false;
                this.f20351a = C6531b.this.f20344a;
            } else {
                C6534c<K, V> cVar = this.f20351a;
                this.f20351a = cVar != null ? cVar.f20350c : null;
            }
            return this.f20351a;
        }

        @Override
        public boolean hasNext() {
            if (this.f20352b) {
                return C6531b.this.f20344a != null;
            }
            C6534c<K, V> cVar = this.f20351a;
            return (cVar == null || cVar.f20350c == null) ? false : true;
        }
    }

    public static abstract class AbstractC6536e<K, V> implements Iterator<Map.Entry<K, V>>, AbstractC6537f<K, V> {
        public C6534c<K, V> f20354a;
        public C6534c<K, V> f20355b;

        public AbstractC6536e(C6534c<K, V> cVar, C6534c<K, V> cVar2) {
            this.f20354a = cVar2;
            this.f20355b = cVar;
        }

        @Override
        public void mo20140a(C6534c<K, V> cVar) {
            if (this.f20354a == cVar && cVar == this.f20355b) {
                this.f20355b = null;
                this.f20354a = null;
            }
            C6534c<K, V> cVar2 = this.f20354a;
            if (cVar2 == cVar) {
                this.f20354a = mo20144b(cVar2);
            }
            if (this.f20355b == cVar) {
                this.f20355b = m20141e();
            }
        }

        public abstract C6534c<K, V> mo20144b(C6534c<K, V> cVar);

        public abstract C6534c<K, V> mo20143c(C6534c<K, V> cVar);

        public Map.Entry<K, V> next() {
            C6534c<K, V> cVar = this.f20355b;
            this.f20355b = m20141e();
            return cVar;
        }

        public final C6534c<K, V> m20141e() {
            C6534c<K, V> cVar = this.f20355b;
            C6534c<K, V> cVar2 = this.f20354a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo20143c(cVar);
        }

        @Override
        public boolean hasNext() {
            return this.f20355b != null;
        }
    }

    public interface AbstractC6537f<K, V> {
        void mo20140a(C6534c<K, V> cVar);
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C6533b bVar = new C6533b(this.f20345b, this.f20344a);
        this.f20346c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6531b)) {
            return false;
        }
        C6531b bVar = (C6531b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    public Map.Entry<K, V> m20152h() {
        return this.f20344a;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    public C6534c<K, V> mo20151i(K k) {
        C6534c<K, V> cVar = this.f20344a;
        while (cVar != null && !cVar.f20348a.equals(k)) {
            cVar = cVar.f20350c;
        }
        return cVar;
    }

    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        C6532a aVar = new C6532a(this.f20344a, this.f20345b);
        this.f20346c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public C6531b<K, V>.C6535d m20150m() {
        C6531b<K, V>.C6535d dVar = new C6535d();
        this.f20346c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> m20149r() {
        return this.f20345b;
    }

    public C6534c<K, V> m20148s(K k, V v) {
        C6534c<K, V> cVar = new C6534c<>(k, v);
        this.f20343M++;
        C6534c<K, V> cVar2 = this.f20345b;
        if (cVar2 == null) {
            this.f20344a = cVar;
            this.f20345b = cVar;
            return cVar;
        }
        cVar2.f20350c = cVar;
        cVar.f20347M = cVar2;
        this.f20345b = cVar;
        return cVar;
    }

    public int size() {
        return this.f20343M;
    }

    public V mo20147t(K k, V v) {
        C6534c<K, V> i = mo20151i(k);
        if (i != null) {
            return i.f20349b;
        }
        m20148s(k, v);
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public V mo20146u(K k) {
        C6534c<K, V> i = mo20151i(k);
        if (i == null) {
            return null;
        }
        this.f20343M--;
        if (!this.f20346c.isEmpty()) {
            for (AbstractC6537f<K, V> fVar : this.f20346c.keySet()) {
                fVar.mo20140a(i);
            }
        }
        C6534c<K, V> cVar = i.f20347M;
        if (cVar != null) {
            cVar.f20350c = i.f20350c;
        } else {
            this.f20344a = i.f20350c;
        }
        C6534c<K, V> cVar2 = i.f20350c;
        if (cVar2 != null) {
            cVar2.f20347M = cVar;
        } else {
            this.f20345b = cVar;
        }
        i.f20350c = null;
        i.f20347M = null;
        return i.f20349b;
    }
}
