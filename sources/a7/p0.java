package a7;

import a7.i;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;
import z6.j;
import z6.k;
import z6.l;

public final class p0 {

    public class a extends e<E> {
        public final Set f649a;
        public final Set f650b;

        public class C0018a extends a7.b<E> {
            public final Iterator<E> f651c;

            public C0018a() {
                this.f651c = a.this.f649a.iterator();
            }

            @Override
            @CheckForNull
            public E a() {
                while (this.f651c.hasNext()) {
                    ?? next = this.f651c.next();
                    if (a.this.f650b.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        public a(Set set, Set set2) {
            super(null);
            this.f649a = set;
            this.f650b = set2;
        }

        @Override
        public boolean contains(@CheckForNull Object obj) {
            return this.f649a.contains(obj) && this.f650b.contains(obj);
        }

        @Override
        public boolean containsAll(Collection<?> collection) {
            return this.f649a.containsAll(collection) && this.f650b.containsAll(collection);
        }

        public s0<E> iterator() {
            return new C0018a();
        }

        @Override
        public boolean isEmpty() {
            return Collections.disjoint(this.f650b, this.f649a);
        }

        @Override
        public int size() {
            int i10 = 0;
            for (Object obj : this.f649a) {
                if (this.f650b.contains(obj)) {
                    i10++;
                }
            }
            return i10;
        }
    }

    public static class b<E> extends i.a<E> implements Set<E> {
        public b(Set<E> set, k<? super E> kVar) {
            super(set, kVar);
        }

        @Override
        public boolean equals(@CheckForNull Object obj) {
            return p0.a(this, obj);
        }

        @Override
        public int hashCode() {
            return p0.d(this);
        }
    }

    public static class c<E> extends b<E> implements SortedSet<E> {
        public c(SortedSet<E> sortedSet, k<? super E> kVar) {
            super(sortedSet, kVar);
        }

        @Override
        @CheckForNull
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f628a).comparator();
        }

        @Override
        public E first() {
            return (E) u.h(this.f628a.iterator(), this.f629b);
        }

        @Override
        public SortedSet<E> headSet(E e10) {
            return new c(((SortedSet) this.f628a).headSet(e10), this.f629b);
        }

        @Override
        public E last() {
            SortedSet sortedSet = (SortedSet) this.f628a;
            while (true) {
                ?? r12 = (Object) sortedSet.last();
                if (this.f629b.apply(r12)) {
                    return r12;
                }
                sortedSet = sortedSet.headSet(r12);
            }
        }

        @Override
        public SortedSet<E> subSet(E e10, E e11) {
            return new c(((SortedSet) this.f628a).subSet(e10, e11), this.f629b);
        }

        @Override
        public SortedSet<E> tailSet(E e10) {
            return new c(((SortedSet) this.f628a).tailSet(e10), this.f629b);
        }
    }

    public static abstract class d<E> extends AbstractSet<E> {
        @Override
        public boolean removeAll(Collection<?> collection) {
            return p0.i(this, collection);
        }

        @Override
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) j.i(collection));
        }
    }

    public static abstract class e<E> extends AbstractSet<E> {
        public e(o0 o0Var) {
            this();
        }

        @Override
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean add(E e10) {
            throw new UnsupportedOperationException();
        }

        @Override
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean remove(@CheckForNull Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public e() {
        }
    }

    public static boolean a(Set<?> set, @CheckForNull Object obj) {
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

    public static <E> Set<E> b(Set<E> set, k<? super E> kVar) {
        if (set instanceof SortedSet) {
            return c((SortedSet) set, kVar);
        }
        if (!(set instanceof b)) {
            return new b((Set) j.i(set), (k) j.i(kVar));
        }
        b bVar = (b) set;
        return new b((Set) bVar.f628a, l.b(bVar.f629b, kVar));
    }

    public static <E> SortedSet<E> c(SortedSet<E> sortedSet, k<? super E> kVar) {
        if (!(sortedSet instanceof b)) {
            return new c((SortedSet) j.i(sortedSet), (k) j.i(kVar));
        }
        b bVar = (b) sortedSet;
        return new c((SortedSet) bVar.f628a, l.b(bVar.f629b, kVar));
    }

    public static int d(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static <E> e<E> e(Set<E> set, Set<?> set2) {
        j.j(set, "set1");
        j.j(set2, "set2");
        return new a(set, set2);
    }

    public static <E> HashSet<E> f() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> g(int i10) {
        return new HashSet<>(y.a(i10));
    }

    public static <E> Set<E> h() {
        return Collections.newSetFromMap(y.e());
    }

    public static boolean i(Set<?> set, Collection<?> collection) {
        j.i(collection);
        if (collection instanceof d0) {
            collection = ((d0) collection).d();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return j(set, collection.iterator());
        }
        return u.m(set.iterator(), collection);
    }

    public static boolean j(Set<?> set, Iterator<?> it) {
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= set.remove(it.next());
        }
        return z10;
    }
}
