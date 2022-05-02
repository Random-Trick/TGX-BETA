package p358z6;

import com.google.j2objc.annotations.Weak;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p343y6.AbstractC10430f;
import p343y6.C10432h;
import p343y6.C10433i;
import p358z6.C11387o0;

public final class C11414y {

    public static class C11415a extends AbstractC11400q0<Map.Entry<K, V>, V> {
        public C11415a(Iterator it) {
            super(it);
        }

        public V mo678a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    public static abstract class EnumC11416b extends Enum<EnumC11416b> implements AbstractC10430f<Map.Entry<?, ?>, Object> {
        public static final EnumC11416b f36374a;
        public static final EnumC11416b f36375b;
        public static final EnumC11416b[] f36376c;

        public static class C11417a extends EnumC11416b {
            public C11417a(String str, int i) {
                super(str, i, null);
            }

            @NullableDecl
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        public static class C11418b extends EnumC11416b {
            public C11418b(String str, int i) {
                super(str, i, null);
            }

            @NullableDecl
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        static {
            C11417a aVar = new C11417a("KEY", 0);
            f36374a = aVar;
            C11418b bVar = new C11418b("VALUE", 1);
            f36375b = bVar;
            f36376c = new EnumC11416b[]{aVar, bVar};
        }

        public EnumC11416b(String str, int i) {
        }

        public static EnumC11416b valueOf(String str) {
            return (EnumC11416b) Enum.valueOf(EnumC11416b.class, str);
        }

        public static EnumC11416b[] values() {
            return (EnumC11416b[]) f36376c.clone();
        }

        public EnumC11416b(String str, int i, C11413x xVar) {
            this(str, i);
        }
    }

    public static abstract class AbstractC11419c<K, V> extends C11387o0.AbstractC11392d<Map.Entry<K, V>> {
        @Override
        public void clear() {
            mo674h().clear();
        }

        @Override
        public abstract boolean contains(Object obj);

        public abstract Map<K, V> mo674h();

        @Override
        public boolean isEmpty() {
            return mo674h().isEmpty();
        }

        @Override
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) C10433i.m5129i(collection));
            } catch (UnsupportedOperationException unused) {
                return C11387o0.m773j(this, collection.iterator());
            }
        }

        @Override
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) C10433i.m5129i(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet g = C11387o0.m776g(collection.size());
                for (Object obj : collection) {
                    if (contains(obj)) {
                        g.add(((Map.Entry) obj).getKey());
                    }
                }
                return mo674h().keySet().retainAll(g);
            }
        }

        @Override
        public int size() {
            return mo674h().size();
        }
    }

    public static class C11420d<K, V> extends C11387o0.AbstractC11392d<K> {
        @Weak
        public final Map<K, V> f36377a;

        public C11420d(Map<K, V> map) {
            this.f36377a = (Map) C10433i.m5129i(map);
        }

        @Override
        public boolean contains(Object obj) {
            return m673h().containsKey(obj);
        }

        public Map<K, V> m673h() {
            return this.f36377a;
        }

        @Override
        public boolean isEmpty() {
            return m673h().isEmpty();
        }

        @Override
        public int size() {
            return m673h().size();
        }
    }

    public static class C11421e<K, V> extends AbstractCollection<V> {
        @Weak
        public final Map<K, V> f36378a;

        public C11421e(Map<K, V> map) {
            this.f36378a = (Map) C10433i.m5129i(map);
        }

        @Override
        public void clear() {
            m672h().clear();
        }

        @Override
        public boolean contains(@NullableDecl Object obj) {
            return m672h().containsValue(obj);
        }

        public final Map<K, V> m672h() {
            return this.f36378a;
        }

        @Override
        public boolean isEmpty() {
            return m672h().isEmpty();
        }

        @Override
        public Iterator<V> iterator() {
            return C11414y.m679k(m672h().entrySet().iterator());
        }

        @Override
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : m672h().entrySet()) {
                    if (C10432h.m5139a(obj, entry.getValue())) {
                        m672h().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) C10433i.m5129i(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet f = C11387o0.m777f();
                for (Map.Entry<K, V> entry : m672h().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        f.add(entry.getKey());
                    }
                }
                return m672h().keySet().removeAll(f);
            }
        }

        @Override
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) C10433i.m5129i(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet f = C11387o0.m777f();
                for (Map.Entry<K, V> entry : m672h().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        f.add(entry.getKey());
                    }
                }
                return m672h().keySet().retainAll(f);
            }
        }

        @Override
        public int size() {
            return m672h().size();
        }
    }

    public static abstract class AbstractC11422f<K, V> extends AbstractMap<K, V> {
        @MonotonicNonNullDecl
        public transient Set<Map.Entry<K, V>> f36379a;
        @MonotonicNonNullDecl
        public transient Collection<V> f36380b;

        public abstract Set<Map.Entry<K, V>> mo671a();

        public Collection<V> m670b() {
            return new C11421e(this);
        }

        @Override
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f36379a;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> a = mo671a();
            this.f36379a = a;
            return a;
        }

        @Override
        public Collection<V> values() {
            Collection<V> collection = this.f36380b;
            if (collection != null) {
                return collection;
            }
            Collection<V> b = m670b();
            this.f36380b = b;
            return b;
        }
    }

    public static int m689a(int i) {
        if (i < 3) {
            C11363h.m819b(i, "expectedSize");
            return i + 1;
        } else if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public static boolean m688b(Map<?, ?> map, @NullableDecl Object obj) {
        return C11407u.m709d(m679k(map.entrySet().iterator()), obj);
    }

    public static boolean m687c(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static <K, V> Map.Entry<K, V> m686d(@NullableDecl K k, @NullableDecl V v) {
        return new C11394p(k, v);
    }

    public static <K, V> IdentityHashMap<K, V> m685e() {
        return new IdentityHashMap<>();
    }

    public static boolean m684f(Map<?, ?> map, Object obj) {
        C10433i.m5129i(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static <V> V m683g(Map<?, V> map, @NullableDecl Object obj) {
        C10433i.m5129i(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static <V> V m682h(Map<?, V> map, Object obj) {
        C10433i.m5129i(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static String m681i(Map<?, ?> map) {
        StringBuilder b = C11365i.m814b(map.size());
        b.append('{');
        boolean z = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z) {
                b.append(", ");
            }
            z = false;
            b.append(entry.getKey());
            b.append('=');
            b.append(entry.getValue());
        }
        b.append('}');
        return b.toString();
    }

    public static <V> AbstractC10430f<Map.Entry<?, V>, V> m680j() {
        return EnumC11416b.f36375b;
    }

    public static <K, V> Iterator<V> m679k(Iterator<Map.Entry<K, V>> it) {
        return new C11415a(it);
    }
}
