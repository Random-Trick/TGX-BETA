package p123ia;

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
import p107ha.C5048h;
import p107ha.C5054l;
import p317wa.C10030l;
import p347ya.AbstractC10466d;
import pa.AbstractC8088l;
import qa.C8298k;
import za.C11441f;

public class C5312v extends C5311u {

    public static final class C5313a implements AbstractC10466d<T> {
        public final Iterable f17489a;

        public C5313a(Iterable iterable) {
            this.f17489a = iterable;
        }

        @Override
        public Iterator<T> iterator() {
            return this.f17489a.iterator();
        }
    }

    public static final <T> List<T> m23348A(List<? extends T> list, int i) {
        C8298k.m12933e(list, "<this>");
        if (i >= 0) {
            return m23333P(list, C10030l.m6193d(list.size() - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    public static final <T> T m23347B(Iterable<? extends T> iterable) {
        C8298k.m12933e(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) m23346C((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T m23346C(List<? extends T> list) {
        C8298k.m12933e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T m23345D(List<? extends T> list, int i) {
        C8298k.m12933e(list, "<this>");
        if (i < 0 || i > C5304n.m23366g(list)) {
            return null;
        }
        return list.get(i);
    }

    public static final <T, A extends Appendable> A m23344E(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, AbstractC8088l<? super T, ? extends CharSequence> lVar) {
        C8298k.m12933e(iterable, "<this>");
        C8298k.m12933e(a, "buffer");
        C8298k.m12933e(charSequence, "separator");
        C8298k.m12933e(charSequence2, "prefix");
        C8298k.m12933e(charSequence3, "postfix");
        C8298k.m12933e(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : iterable) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C11441f.m646a(a, t, lVar);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static Appendable m23343F(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, AbstractC8088l lVar, int i2, Object obj) {
        String str = (i2 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i2 & 4) != 0 ? charSequence5 : charSequence2;
        if ((i2 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        return m23344E(iterable, appendable, str, charSequence6, charSequence5, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? "..." : charSequence4, (i2 & 64) != 0 ? null : lVar);
    }

    public static final <T> String m23342G(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, AbstractC8088l<? super T, ? extends CharSequence> lVar) {
        C8298k.m12933e(iterable, "<this>");
        C8298k.m12933e(charSequence, "separator");
        C8298k.m12933e(charSequence2, "prefix");
        C8298k.m12933e(charSequence3, "postfix");
        C8298k.m12933e(charSequence4, "truncated");
        String sb2 = ((StringBuilder) m23344E(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, lVar)).toString();
        C8298k.m12934d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static String m23341H(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, AbstractC8088l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i2 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i2 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i3 = (i2 & 8) != 0 ? -1 : i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        return m23342G(iterable, charSequence, charSequence6, charSequence5, i3, charSequence7, lVar);
    }

    public static final <T> T m23340I(List<? extends T> list) {
        C8298k.m12933e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(C5304n.m23366g(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> List<T> m23339J(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        C8298k.m12933e(collection, "<this>");
        C8298k.m12933e(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        C5309s.m23355r(arrayList2, iterable);
        return arrayList2;
    }

    public static final <T> List<T> m23338K(Collection<? extends T> collection, T t) {
        C8298k.m12933e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    public static final <T> List<T> m23337L(Iterable<? extends T> iterable) {
        C8298k.m12933e(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return m23330S(iterable);
        }
        List<T> U = m23328U(iterable);
        C5311u.m23349x(U);
        return U;
    }

    public static final <T> T m23336M(Iterable<? extends T> iterable) {
        C8298k.m12933e(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) m23335N((List) iterable);
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

    public static final <T> T m23335N(List<? extends T> list) {
        C8298k.m12933e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    public static final <T> List<T> m23334O(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        C8298k.m12933e(iterable, "<this>");
        C8298k.m12933e(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return m23330S(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            C5294h.m23425l(array, comparator);
            return C5294h.m23434c(array);
        }
        List<T> U = m23328U(iterable);
        C5308r.m23356q(U, comparator);
        return U;
    }

    public static final <T> List<T> m23333P(Iterable<? extends T> iterable, int i) {
        C8298k.m12933e(iterable, "<this>");
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return C5304n.m23367f();
        } else {
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return m23330S(iterable);
                }
                if (i == 1) {
                    return C5303m.m23371b(m23347B(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i);
            for (T t : iterable) {
                arrayList.add(t);
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return C5304n.m23362k(arrayList);
        }
    }

    public static final <T, C extends Collection<? super T>> C m23332Q(Iterable<? extends T> iterable, C c) {
        C8298k.m12933e(iterable, "<this>");
        C8298k.m12933e(c, "destination");
        for (T t : iterable) {
            c.add(t);
        }
        return c;
    }

    public static final <T> HashSet<T> m23331R(Iterable<? extends T> iterable) {
        C8298k.m12933e(iterable, "<this>");
        return (HashSet) m23332Q(iterable, new HashSet(C5293g0.m23437a(C5305o.m23358o(iterable, 12))));
    }

    public static final <T> List<T> m23330S(Iterable<? extends T> iterable) {
        C8298k.m12933e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C5304n.m23362k(m23328U(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C5304n.m23367f();
        }
        if (size != 1) {
            return m23327V(collection);
        }
        return C5303m.m23371b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final long[] m23329T(Collection<Long> collection) {
        C8298k.m12933e(collection, "<this>");
        long[] jArr = new long[collection.size()];
        int i = 0;
        for (Long l : collection) {
            i++;
            jArr[i] = l.longValue();
        }
        return jArr;
    }

    public static final <T> List<T> m23328U(Iterable<? extends T> iterable) {
        C8298k.m12933e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return m23327V((Collection) iterable);
        }
        return (List) m23332Q(iterable, new ArrayList());
    }

    public static final <T> List<T> m23327V(Collection<? extends T> collection) {
        C8298k.m12933e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final <T> Set<T> m23326W(Iterable<? extends T> iterable) {
        C8298k.m12933e(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) m23332Q(iterable, new LinkedHashSet());
    }

    public static final <T> Set<T> m23325X(Iterable<? extends T> iterable) {
        C8298k.m12933e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C5300j0.m23376d((Set) m23332Q(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C5300j0.m23378b();
        }
        if (size != 1) {
            return (Set) m23332Q(iterable, new LinkedHashSet(C5293g0.m23437a(collection.size())));
        }
        return C5298i0.m23380a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final <T> List<C5048h<T, T>> m23324Y(Iterable<? extends T> iterable) {
        C8298k.m12933e(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return C5304n.m23367f();
        }
        ArrayList arrayList = new ArrayList();
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            arrayList.add(C5054l.m24189a(next, next2));
            next = next2;
        }
        return arrayList;
    }

    public static final <T> AbstractC10466d<T> m23323y(Iterable<? extends T> iterable) {
        C8298k.m12933e(iterable, "<this>");
        return new C5313a(iterable);
    }

    public static final <T> List<T> m23322z(Iterable<? extends T> iterable) {
        C8298k.m12933e(iterable, "<this>");
        return m23330S(m23326W(iterable));
    }
}
