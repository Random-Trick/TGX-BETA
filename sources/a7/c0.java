package a7;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
import z6.j;
import z6.o;

public final class c0 {

    public static class a<K, V> extends c<K, V> {
        public transient o<? extends List<V>> O;

        public a(Map<K, Collection<V>> map, o<? extends List<V>> oVar) {
            super(map);
            this.O = (o) j.i(oVar);
        }

        @Override
        public Map<K, Collection<V>> c() {
            return q();
        }

        @Override
        public Set<K> d() {
            return r();
        }

        public List<V> o() {
            return this.O.get();
        }
    }

    public static boolean a(z<?, ?> zVar, @CheckForNull Object obj) {
        if (obj == zVar) {
            return true;
        }
        if (obj instanceof z) {
            return zVar.a().equals(((z) obj).a());
        }
        return false;
    }

    public static <K, V> v<K, V> b(Map<K, Collection<V>> map, o<? extends List<V>> oVar) {
        return new a(map, oVar);
    }
}
