package p358z6;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p343y6.AbstractC10444n;
import p343y6.C10433i;

public final class C11336c0 {

    public static class C11337a<K, V> extends AbstractC11335c<K, V> {
        public transient AbstractC10444n<? extends List<V>> f36264O;

        public C11337a(Map<K, Collection<V>> map, AbstractC10444n<? extends List<V>> nVar) {
            super(map);
            this.f36264O = (AbstractC10444n) C10433i.m5129i(nVar);
        }

        @Override
        public Map<K, Collection<V>> mo832c() {
            return m872q();
        }

        @Override
        public Set<K> mo831d() {
            return m871r();
        }

        public List<V> mo874o() {
            return this.f36264O.get();
        }
    }

    public static boolean m884a(AbstractC11423z<?, ?> zVar, @NullableDecl Object obj) {
        if (obj == zVar) {
            return true;
        }
        if (obj instanceof AbstractC11423z) {
            return zVar.mo669a().equals(((AbstractC11423z) obj).mo669a());
        }
        return false;
    }

    public static <K, V> AbstractC11411v<K, V> m883b(Map<K, Collection<V>> map, AbstractC10444n<? extends List<V>> nVar) {
        return new C11337a(map, nVar);
    }
}
