package p358z6;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p343y6.AbstractC10434j;
import p343y6.C10433i;
import p343y6.C10435k;
import p358z6.C11365i;

public final class C11387o0 {

    public static class C11388a extends AbstractC11393e<E> {
        public final Set f36342a;
        public final Set f36343b;

        public class C11389a extends AbstractC11326b<E> {
            public final Iterator<E> f36345c;

            public C11389a() {
                this.f36345c = C11388a.this.f36342a.iterator();
            }

            @Override
            public E mo697a() {
                while (this.f36345c.hasNext()) {
                    ?? next = this.f36345c.next();
                    if (C11388a.this.f36343b.contains(next)) {
                        return next;
                    }
                }
                return m893b();
            }
        }

        public C11388a(Set set, Set set2) {
            super(null);
            this.f36342a = set;
            this.f36343b = set2;
        }

        @Override
        public boolean contains(Object obj) {
            return this.f36342a.contains(obj) && this.f36343b.contains(obj);
        }

        @Override
        public boolean containsAll(Collection<?> collection) {
            return this.f36342a.containsAll(collection) && this.f36343b.containsAll(collection);
        }

        public AbstractC11403r0<E> iterator() {
            return new C11389a();
        }

        @Override
        public boolean isEmpty() {
            return Collections.disjoint(this.f36343b, this.f36342a);
        }

        @Override
        public int size() {
            int i = 0;
            for (Object obj : this.f36342a) {
                if (this.f36343b.contains(obj)) {
                    i++;
                }
            }
            return i;
        }
    }

    public static class C11390b<E> extends C11365i.C11366a<E> implements Set<E> {
        public C11390b(Set<E> set, AbstractC10434j<? super E> jVar) {
            super(set, jVar);
        }

        @Override
        public boolean equals(@NullableDecl Object obj) {
            return C11387o0.m782a(this, obj);
        }

        @Override
        public int hashCode() {
            return C11387o0.m779d(this);
        }
    }

    public static class C11391c<E> extends C11390b<E> implements SortedSet<E> {
        public C11391c(SortedSet<E> sortedSet, AbstractC10434j<? super E> jVar) {
            super(sortedSet, jVar);
        }

        @Override
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f36306a).comparator();
        }

        @Override
        public E first() {
            return (E) C11407u.m705h(this.f36306a.iterator(), this.f36307b);
        }

        @Override
        public SortedSet<E> headSet(E e) {
            return new C11391c(((SortedSet) this.f36306a).headSet(e), this.f36307b);
        }

        @Override
        public E last() {
            SortedSet sortedSet = (SortedSet) this.f36306a;
            while (true) {
                ?? r1 = (Object) sortedSet.last();
                if (this.f36307b.apply(r1)) {
                    return r1;
                }
                sortedSet = sortedSet.headSet(r1);
            }
        }

        @Override
        public SortedSet<E> subSet(E e, E e2) {
            return new C11391c(((SortedSet) this.f36306a).subSet(e, e2), this.f36307b);
        }

        @Override
        public SortedSet<E> tailSet(E e) {
            return new C11391c(((SortedSet) this.f36306a).tailSet(e), this.f36307b);
        }
    }

    public static abstract class AbstractC11392d<E> extends AbstractSet<E> {
        @Override
        public boolean removeAll(Collection<?> collection) {
            return C11387o0.m774i(this, collection);
        }

        @Override
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) C10433i.m5129i(collection));
        }
    }

    public static abstract class AbstractC11393e<E> extends AbstractSet<E> {
        public AbstractC11393e(C11383n0 n0Var) {
            this();
        }

        @Override
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        @Override
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public AbstractC11393e() {
        }
    }

    public static boolean m782a(Set<?> set, @NullableDecl Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <E> Set<E> m781b(Set<E> set, AbstractC10434j<? super E> jVar) {
        if (set instanceof SortedSet) {
            return m780c((SortedSet) set, jVar);
        }
        if (!(set instanceof C11390b)) {
            return new C11390b((Set) C10433i.m5129i(set), (AbstractC10434j) C10433i.m5129i(jVar));
        }
        C11390b bVar = (C11390b) set;
        return new C11390b((Set) bVar.f36306a, C10435k.m5121b(bVar.f36307b, jVar));
    }

    public static <E> SortedSet<E> m780c(SortedSet<E> sortedSet, AbstractC10434j<? super E> jVar) {
        if (!(sortedSet instanceof C11390b)) {
            return new C11391c((SortedSet) C10433i.m5129i(sortedSet), (AbstractC10434j) C10433i.m5129i(jVar));
        }
        C11390b bVar = (C11390b) sortedSet;
        return new C11391c((SortedSet) bVar.f36306a, C10435k.m5121b(bVar.f36307b, jVar));
    }

    public static int m779d(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static <E> AbstractC11393e<E> m778e(Set<E> set, Set<?> set2) {
        C10433i.m5128j(set, "set1");
        C10433i.m5128j(set2, "set2");
        return new C11388a(set, set2);
    }

    public static <E> HashSet<E> m777f() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> m776g(int i) {
        return new HashSet<>(C11414y.m689a(i));
    }

    public static <E> Set<E> m775h() {
        return Collections.newSetFromMap(C11414y.m685e());
    }

    public static boolean m774i(Set<?> set, Collection<?> collection) {
        C10433i.m5129i(collection);
        if (collection instanceof AbstractC11355d0) {
            collection = ((AbstractC11355d0) collection).m835e();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return m773j(set, collection.iterator());
        }
        return C11407u.m700m(set.iterator(), collection);
    }

    public static boolean m773j(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
