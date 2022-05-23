package a7;

import a7.p0;
import com.google.j2objc.annotations.Weak;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
import z6.i;
import z6.j;

public final class y {

    public class a extends r0<Map.Entry<K, V>, V> {
        public a(Iterator it) {
            super(it);
        }

        public V a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    public static abstract class b extends Enum<b> implements z6.f<Map.Entry<?, ?>, Object> {
        public static final b f670a = new a("KEY", 0);
        public static final b f671b = new C0019b("VALUE", 1);
        public static final b[] f672c = a();

        public final class a extends b {
            public a(String str, int i10) {
                super(str, i10, null);
            }

            @CheckForNull
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        public final class C0019b extends b {
            public C0019b(String str, int i10) {
                super(str, i10, null);
            }

            @CheckForNull
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        public b(String str, int i10) {
        }

        public static b[] a() {
            return new b[]{f670a, f671b};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f672c.clone();
        }

        public b(String str, int i10, x xVar) {
            this(str, i10);
        }
    }

    public static abstract class c<K, V> extends p0.d<Map.Entry<K, V>> {
        @Override
        public void clear() {
            f().clear();
        }

        @Override
        public abstract boolean contains(@CheckForNull Object obj);

        public abstract Map<K, V> f();

        @Override
        public boolean isEmpty() {
            return f().isEmpty();
        }

        @Override
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) j.i(collection));
            } catch (UnsupportedOperationException unused) {
                return p0.j(this, collection.iterator());
            }
        }

        @Override
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) j.i(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet g10 = p0.g(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        g10.add(((Map.Entry) obj).getKey());
                    }
                }
                return f().keySet().retainAll(g10);
            }
        }

        @Override
        public int size() {
            return f().size();
        }
    }

    public static class d<K, V> extends p0.d<K> {
        @Weak
        public final Map<K, V> f673a;

        public d(Map<K, V> map) {
            this.f673a = (Map) j.i(map);
        }

        @Override
        public boolean contains(@CheckForNull Object obj) {
            return f().containsKey(obj);
        }

        public Map<K, V> f() {
            return this.f673a;
        }

        @Override
        public boolean isEmpty() {
            return f().isEmpty();
        }

        @Override
        public int size() {
            return f().size();
        }
    }

    public static class e<K, V> extends AbstractCollection<V> {
        @Weak
        public final Map<K, V> f674a;

        public e(Map<K, V> map) {
            this.f674a = (Map) j.i(map);
        }

        @Override
        public void clear() {
            f().clear();
        }

        @Override
        public boolean contains(@CheckForNull Object obj) {
            return f().containsValue(obj);
        }

        public final Map<K, V> f() {
            return this.f674a;
        }

        @Override
        public boolean isEmpty() {
            return f().isEmpty();
        }

        @Override
        public Iterator<V> iterator() {
            return y.k(f().entrySet().iterator());
        }

        @Override
        public boolean remove(@CheckForNull Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : f().entrySet()) {
                    if (i.a(obj, entry.getValue())) {
                        f().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) j.i(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet f10 = p0.f();
                for (Map.Entry<K, V> entry : f().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        f10.add(entry.getKey());
                    }
                }
                return f().keySet().removeAll(f10);
            }
        }

        @Override
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) j.i(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet f10 = p0.f();
                for (Map.Entry<K, V> entry : f().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        f10.add(entry.getKey());
                    }
                }
                return f().keySet().retainAll(f10);
            }
        }

        @Override
        public int size() {
            return f().size();
        }
    }

    public static abstract class f<K, V> extends AbstractMap<K, V> {
        @CheckForNull
        public transient Set<Map.Entry<K, V>> f675a;
        @CheckForNull
        public transient Collection<V> f676b;

        public abstract Set<Map.Entry<K, V>> a();

        public Collection<V> b() {
            return new e(this);
        }

        @Override
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f675a;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> a10 = a();
            this.f675a = a10;
            return a10;
        }

        @Override
        public Collection<V> values() {
            Collection<V> collection = this.f676b;
            if (collection != null) {
                return collection;
            }
            Collection<V> b10 = b();
            this.f676b = b10;
            return b10;
        }
    }

    public static int a(int i10) {
        if (i10 < 3) {
            h.b(i10, "expectedSize");
            return i10 + 1;
        } else if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public static boolean b(Map<?, ?> map, @CheckForNull Object obj) {
        return u.d(k(map.entrySet().iterator()), obj);
    }

    public static boolean c(Map<?, ?> map, @CheckForNull Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static <K, V> Map.Entry<K, V> d(K k10, V v10) {
        return new p(k10, v10);
    }

    public static <K, V> IdentityHashMap<K, V> e() {
        return new IdentityHashMap<>();
    }

    public static boolean f(Map<?, ?> map, @CheckForNull Object obj) {
        j.i(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @CheckForNull
    public static <V> V g(Map<?, V> map, @CheckForNull Object obj) {
        j.i(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    @CheckForNull
    public static <V> V h(Map<?, V> map, @CheckForNull Object obj) {
        j.i(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static String i(Map<?, ?> map) {
        StringBuilder b10 = i.b(map.size());
        b10.append('{');
        boolean z10 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z10) {
                b10.append(", ");
            }
            z10 = false;
            b10.append(entry.getKey());
            b10.append('=');
            b10.append(entry.getValue());
        }
        b10.append('}');
        return b10.toString();
    }

    public static <V> z6.f<Map.Entry<?, V>, V> j() {
        return b.f671b;
    }

    public static <K, V> Iterator<V> k(Iterator<Map.Entry<K, V>> it) {
        return new a(it);
    }
}
