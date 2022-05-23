package a7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import z6.j;
import z6.o;

public abstract class b0<K0, V0> {

    public class a extends d<K0> {
        public final Comparator f598a;

        public a(Comparator comparator) {
            this.f598a = comparator;
        }

        @Override
        public <K extends K0, V> Map<K, Collection<V>> c() {
            return new TreeMap(this.f598a);
        }
    }

    public static final class b<V> implements o<List<V>>, Serializable {
        public final int f599a;

        public b(int i10) {
            this.f599a = h.b(i10, "expectedValuesPerKey");
        }

        public List<V> get() {
            return new ArrayList(this.f599a);
        }
    }

    public static abstract class c<K0, V0> extends b0<K0, V0> {
        public c() {
            super(null);
        }

        public abstract <K extends K0, V extends V0> v<K, V> c();
    }

    public static abstract class d<K0> {

        public class a extends c<K0, Object> {
            public final int f600a;

            public a(int i10) {
                this.f600a = i10;
            }

            @Override
            public <K extends K0, V> v<K, V> c() {
                return c0.b(d.this.c(), new b(this.f600a));
            }
        }

        public c<K0, Object> a() {
            return b(2);
        }

        public c<K0, Object> b(int i10) {
            h.b(i10, "expectedValuesPerKey");
            return new a(i10);
        }

        public abstract <K extends K0, V> Map<K, Collection<V>> c();
    }

    public b0() {
    }

    public b0(a0 a0Var) {
        this();
    }

    public static d<Comparable> a() {
        return b(h0.b());
    }

    public static <K0> d<K0> b(Comparator<K0> comparator) {
        j.i(comparator);
        return new a(comparator);
    }
}
