package ja;

import ab.f;
import ia.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import ra.k;
import xa.l;
import za.d;

public class v extends u {

    public static final class a implements d<T> {
        public final Iterable f15176a;

        public a(Iterable iterable) {
            this.f15176a = iterable;
        }

        @Override
        public Iterator<T> iterator() {
            return this.f15176a.iterator();
        }
    }

    public static final <T> List<T> A(List<? extends T> list, int i10) {
        k.e(list, "<this>");
        if (i10 >= 0) {
            return P(list, l.d(list.size() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static final <T> T B(Iterable<? extends T> iterable) {
        k.e(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) C((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T C(List<? extends T> list) {
        k.e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T D(List<? extends T> list, int i10) {
        k.e(list, "<this>");
        if (i10 < 0 || i10 > n.g(list)) {
            return null;
        }
        return list.get(i10);
    }

    public static final <T, A extends Appendable> A E(Iterable<? extends T> iterable, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, qa.l<? super T, ? extends CharSequence> lVar) {
        k.e(iterable, "<this>");
        k.e(a10, "buffer");
        k.e(charSequence, "separator");
        k.e(charSequence2, "prefix");
        k.e(charSequence3, "postfix");
        k.e(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (T t10 : iterable) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            f.a(a10, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static Appendable F(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, qa.l lVar, int i11, Object obj) {
        String str = (i11 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 4) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        return E(iterable, appendable, str, charSequence6, charSequence5, (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : lVar);
    }

    public static final <T> String G(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, qa.l<? super T, ? extends CharSequence> lVar) {
        k.e(iterable, "<this>");
        k.e(charSequence, "separator");
        k.e(charSequence2, "prefix");
        k.e(charSequence3, "postfix");
        k.e(charSequence4, "truncated");
        String sb2 = ((StringBuilder) E(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        k.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static String H(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, qa.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i12 = (i11 & 8) != 0 ? -1 : i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return G(iterable, charSequence, charSequence6, charSequence5, i12, charSequence7, lVar);
    }

    public static final <T> T I(List<? extends T> list) {
        k.e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(n.g(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> List<T> J(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        k.e(collection, "<this>");
        k.e(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        s.r(arrayList2, iterable);
        return arrayList2;
    }

    public static final <T> List<T> K(Collection<? extends T> collection, T t10) {
        k.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t10);
        return arrayList;
    }

    public static final <T> List<T> L(Iterable<? extends T> iterable) {
        k.e(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return S(iterable);
        }
        List<T> U = U(iterable);
        u.x(U);
        return U;
    }

    public static final <T> T M(Iterable<? extends T> iterable) {
        k.e(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) N((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T N(List<? extends T> list) {
        k.e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    public static final <T> List<T> O(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        k.e(iterable, "<this>");
        k.e(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return S(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            h.l(array, comparator);
            return h.c(array);
        }
        List<T> U = U(iterable);
        r.q(U, comparator);
        return U;
    }

    public static final <T> List<T> P(Iterable<? extends T> iterable, int i10) {
        k.e(iterable, "<this>");
        int i11 = 0;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return n.f();
        } else {
            if (iterable instanceof Collection) {
                if (i10 >= ((Collection) iterable).size()) {
                    return S(iterable);
                }
                if (i10 == 1) {
                    return m.b(B(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i10);
            for (T t10 : iterable) {
                arrayList.add(t10);
                i11++;
                if (i11 == i10) {
                    break;
                }
            }
            return n.k(arrayList);
        }
    }

    public static final <T, C extends Collection<? super T>> C Q(Iterable<? extends T> iterable, C c10) {
        k.e(iterable, "<this>");
        k.e(c10, "destination");
        for (T t10 : iterable) {
            c10.add(t10);
        }
        return c10;
    }

    public static final <T> HashSet<T> R(Iterable<? extends T> iterable) {
        k.e(iterable, "<this>");
        return (HashSet) Q(iterable, new HashSet(g0.a(o.o(iterable, 12))));
    }

    public static final <T> List<T> S(Iterable<? extends T> iterable) {
        k.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return n.k(U(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return n.f();
        }
        if (size != 1) {
            return V(collection);
        }
        return m.b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final long[] T(Collection<Long> collection) {
        k.e(collection, "<this>");
        long[] jArr = new long[collection.size()];
        int i10 = 0;
        for (Long l10 : collection) {
            i10++;
            jArr[i10] = l10.longValue();
        }
        return jArr;
    }

    public static final <T> List<T> U(Iterable<? extends T> iterable) {
        k.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return V((Collection) iterable);
        }
        return (List) Q(iterable, new ArrayList());
    }

    public static final <T> List<T> V(Collection<? extends T> collection) {
        k.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final <T> Set<T> W(Iterable<? extends T> iterable) {
        k.e(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) Q(iterable, new LinkedHashSet());
    }

    public static final <T> Set<T> X(Iterable<? extends T> iterable) {
        k.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return j0.d((Set) Q(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return j0.b();
        }
        if (size != 1) {
            return (Set) Q(iterable, new LinkedHashSet(g0.a(collection.size())));
        }
        return i0.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final <T> List<h<T, T>> Y(Iterable<? extends T> iterable) {
        k.e(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return n.f();
        }
        ArrayList arrayList = new ArrayList();
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            arrayList.add(ia.l.a(next, next2));
            next = next2;
        }
        return arrayList;
    }

    public static final <T> d<T> y(Iterable<? extends T> iterable) {
        k.e(iterable, "<this>");
        return new a(iterable);
    }

    public static final <T> List<T> z(Iterable<? extends T> iterable) {
        k.e(iterable, "<this>");
        return S(W(iterable));
    }
}
