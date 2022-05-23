package m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class b<K, V> implements Iterable<Map.Entry<K, V>> {
    public c<K, V> f16430a;
    public c<K, V> f16431b;
    public WeakHashMap<f<K, V>, Boolean> f16432c = new WeakHashMap<>();
    public int M = 0;

    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override
        public c<K, V> b(c<K, V> cVar) {
            return cVar.M;
        }

        @Override
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f16435c;
        }
    }

    public static class C0151b<K, V> extends e<K, V> {
        public C0151b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f16435c;
        }

        @Override
        public c<K, V> c(c<K, V> cVar) {
            return cVar.M;
        }
    }

    public static class c<K, V> implements Map.Entry<K, V> {
        public c<K, V> M;
        public final K f16433a;
        public final V f16434b;
        public c<K, V> f16435c;

        public c(K k10, V v10) {
            this.f16433a = k10;
            this.f16434b = v10;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f16433a.equals(cVar.f16433a) && this.f16434b.equals(cVar.f16434b);
        }

        @Override
        public K getKey() {
            return this.f16433a;
        }

        @Override
        public V getValue() {
            return this.f16434b;
        }

        @Override
        public int hashCode() {
            return this.f16433a.hashCode() ^ this.f16434b.hashCode();
        }

        @Override
        public V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f16433a + "=" + this.f16434b;
        }
    }

    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {
        public c<K, V> f16436a;
        public boolean f16437b = true;

        public d() {
        }

        @Override
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f16436a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.M;
                this.f16436a = cVar3;
                this.f16437b = cVar3 == null;
            }
        }

        public Map.Entry<K, V> next() {
            if (this.f16437b) {
                this.f16437b = false;
                this.f16436a = b.this.f16430a;
            } else {
                c<K, V> cVar = this.f16436a;
                this.f16436a = cVar != null ? cVar.f16435c : null;
            }
            return this.f16436a;
        }

        @Override
        public boolean hasNext() {
            if (this.f16437b) {
                return b.this.f16430a != null;
            }
            c<K, V> cVar = this.f16436a;
            return (cVar == null || cVar.f16435c == null) ? false : true;
        }
    }

    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {
        public c<K, V> f16439a;
        public c<K, V> f16440b;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f16439a = cVar2;
            this.f16440b = cVar;
        }

        @Override
        public void a(c<K, V> cVar) {
            if (this.f16439a == cVar && cVar == this.f16440b) {
                this.f16440b = null;
                this.f16439a = null;
            }
            c<K, V> cVar2 = this.f16439a;
            if (cVar2 == cVar) {
                this.f16439a = b(cVar2);
            }
            if (this.f16440b == cVar) {
                this.f16440b = e();
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f16440b;
            this.f16440b = e();
            return cVar;
        }

        public final c<K, V> e() {
            c<K, V> cVar = this.f16440b;
            c<K, V> cVar2 = this.f16439a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override
        public boolean hasNext() {
            return this.f16440b != null;
        }
    }

    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0151b bVar = new C0151b(this.f16431b, this.f16430a);
        this.f16432c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
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

    public Map.Entry<K, V> f() {
        return this.f16430a;
    }

    public c<K, V> g(K k10) {
        c<K, V> cVar = this.f16430a;
        while (cVar != null && !cVar.f16433a.equals(k10)) {
            cVar = cVar.f16435c;
        }
        return cVar;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().hashCode();
        }
        return i10;
    }

    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f16430a, this.f16431b);
        this.f16432c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public b<K, V>.d m() {
        b<K, V>.d dVar = new d();
        this.f16432c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> r() {
        return this.f16431b;
    }

    public c<K, V> s(K k10, V v10) {
        c<K, V> cVar = new c<>(k10, v10);
        this.M++;
        c<K, V> cVar2 = this.f16431b;
        if (cVar2 == null) {
            this.f16430a = cVar;
            this.f16431b = cVar;
            return cVar;
        }
        cVar2.f16435c = cVar;
        cVar.M = cVar2;
        this.f16431b = cVar;
        return cVar;
    }

    public int size() {
        return this.M;
    }

    public V t(K k10, V v10) {
        c<K, V> g10 = g(k10);
        if (g10 != null) {
            return g10.f16434b;
        }
        s(k10, v10);
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

    public V u(K k10) {
        c<K, V> g10 = g(k10);
        if (g10 == null) {
            return null;
        }
        this.M--;
        if (!this.f16432c.isEmpty()) {
            for (f<K, V> fVar : this.f16432c.keySet()) {
                fVar.a(g10);
            }
        }
        c<K, V> cVar = g10.M;
        if (cVar != null) {
            cVar.f16435c = g10.f16435c;
        } else {
            this.f16430a = g10.f16435c;
        }
        c<K, V> cVar2 = g10.f16435c;
        if (cVar2 != null) {
            cVar2.M = cVar;
        } else {
            this.f16431b = cVar;
        }
        g10.f16435c = null;
        g10.M = null;
        return g10.f16434b;
    }
}
