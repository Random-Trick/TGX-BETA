package p358z6;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p343y6.AbstractC10444n;
import p343y6.C10433i;

public abstract class AbstractC11329b0<K0, V0> {

    public static class C11330a extends AbstractC11333d<K0> {
        public final Comparator f36263a;

        public C11330a(Comparator comparator) {
            this.f36263a = comparator;
        }

        @Override
        public <K extends K0, V> Map<K, Collection<V>> mo886c() {
            return new TreeMap(this.f36263a);
        }
    }

    public static final class C11331b<V> implements AbstractC10444n<List<V>>, Serializable {
        public final int f36264a;

        public C11331b(int i) {
            this.f36264a = C11363h.m819b(i, "expectedValuesPerKey");
        }

        public List<V> get() {
            return new ArrayList(this.f36264a);
        }
    }

    public static abstract class AbstractC11332c<K0, V0> extends AbstractC11329b0<K0, V0> {
        public AbstractC11332c() {
            super(null);
        }

        public abstract <K extends K0, V extends V0> AbstractC11411v<K, V> mo885c();
    }

    public static abstract class AbstractC11333d<K0> {

        public class C11334a extends AbstractC11332c<K0, Object> {
            public final int f36265a;

            public C11334a(int i) {
                this.f36265a = i;
            }

            @Override
            public <K extends K0, V> AbstractC11411v<K, V> mo885c() {
                return C11336c0.m883b(AbstractC11333d.this.mo886c(), new C11331b(this.f36265a));
            }
        }

        public AbstractC11332c<K0, Object> m888a() {
            return m887b(2);
        }

        public AbstractC11332c<K0, Object> m887b(int i) {
            C11363h.m819b(i, "expectedValuesPerKey");
            return new C11334a(i);
        }

        public abstract <K extends K0, V> Map<K, Collection<V>> mo886c();
    }

    public AbstractC11329b0(C11325a0 a0Var) {
        this();
    }

    public static AbstractC11333d<Comparable> m891a() {
        return m890b(AbstractC11362g0.m822b());
    }

    public static <K0> AbstractC11333d<K0> m890b(Comparator<K0> comparator) {
        C10433i.m5129i(comparator);
        return new C11330a(comparator);
    }

    public AbstractC11329b0() {
    }
}
