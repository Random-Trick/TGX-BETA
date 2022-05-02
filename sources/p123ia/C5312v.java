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

    public static final <T> List<T> m23347A(List<? extends T> list, int i) {
        C8298k.m12934e(list, "<this>");
        if (i >= 0) {
            return m23332P(list, C10030l.m6193d(list.size() - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    public static final <T> T m23346B(Iterable<? extends T> iterable) {
        C8298k.m12934e(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) m23345C((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T m23345C(List<? extends T> list) {
        C8298k.m12934e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T m23344D(List<? extends T> list, int i) {
        C8298k.m12934e(list, "<this>");
        if (i < 0 || i > C5304n.m23365g(list)) {
            return null;
        }
        return list.get(i);
    }

    public static final <T, A extends Appendable> A m23343E(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, AbstractC8088l<? super T, ? extends CharSequence> lVar) {
        C8298k.m12934e(iterable, "<this>");
        C8298k.m12934e(a, "buffer");
        C8298k.m12934e(charSequence, "separator");
        C8298k.m12934e(charSequence2, "prefix");
        C8298k.m12934e(charSequence3, "postfix");
        C8298k.m12934e(charSequence4, "truncated");
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

    public static Appendable m23342F(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, AbstractC8088l lVar, int i2, Object obj) {
        String str = (i2 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i2 & 4) != 0 ? charSequence5 : charSequence2;
        if ((i2 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        return m23343E(iterable, appendable, str, charSequence6, charSequence5, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? "..." : charSequence4, (i2 & 64) != 0 ? null : lVar);
    }

    public static final <T> String m23341G(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, AbstractC8088l<? super T, ? extends CharSequence> lVar) {
        C8298k.m12934e(iterable, "<this>");
        C8298k.m12934e(charSequence, "separator");
        C8298k.m12934e(charSequence2, "prefix");
        C8298k.m12934e(charSequence3, "postfix");
        C8298k.m12934e(charSequence4, "truncated");
        String sb2 = ((StringBuilder) m23343E(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, lVar)).toString();
        C8298k.m12935d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static String m23340H(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, AbstractC8088l lVar, int i2, Object obj) {
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
        return m23341G(iterable, charSequence, charSequence6, charSequence5, i3, charSequence7, lVar);
    }

    public static final <T> T m23339I(List<? extends T> list) {
        C8298k.m12934e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(C5304n.m23365g(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> List<T> m23338J(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        C8298k.m12934e(collection, "<this>");
        C8298k.m12934e(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        C5309s.m23354r(arrayList2, iterable);
        return arrayList2;
    }

    public static final <T> List<T> m23337K(Collection<? extends T> collection, T t) {
        C8298k.m12934e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    public static final <T> List<T> m23336L(Iterable<? extends T> iterable) {
        C8298k.m12934e(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return m23329S(iterable);
        }
        List<T> U = m23327U(iterable);
        C5311u.m23348x(U);
        return U;
    }

    public static final <T> T m23335M(Iterable<? extends T> iterable) {
        C8298k.m12934e(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) m23334N((List) iterable);
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

    public static final <T> T m23334N(List<? extends T> list) {
        C8298k.m12934e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    public static final <T> List<T> m23333O(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        C8298k.m12934e(iterable, "<this>");
        C8298k.m12934e(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return m23329S(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            C5294h.m23424l(array, comparator);
            return C5294h.m23433c(array);
        }
        List<T> U = m23327U(iterable);
        C5308r.m23355q(U, comparator);
        return U;
    }

    public static final <T> List<T> m23332P(Iterable<? extends T> iterable, int i) {
        C8298k.m12934e(iterable, "<this>");
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return C5304n.m23366f();
        } else {
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return m23329S(iterable);
                }
                if (i == 1) {
                    return C5303m.m23370b(m23346B(iterable));
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
            return C5304n.m23361k(arrayList);
        }
    }

    public static final <T, C extends Collection<? super T>> C m23331Q(Iterable<? extends T> iterable, C c) {
        C8298k.m12934e(iterable, "<this>");
        C8298k.m12934e(c, "destination");
        for (T t : iterable) {
            c.add(t);
        }
        return c;
    }

    public static final <T> HashSet<T> m23330R(Iterable<? extends T> iterable) {
        C8298k.m12934e(iterable, "<this>");
        return (HashSet) m23331Q(iterable, new HashSet(C5293g0.m23436a(C5305o.m23357o(iterable, 12))));
    }

    public static final <T> List<T> m23329S(Iterable<? extends T> iterable) {
        C8298k.m12934e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C5304n.m23361k(m23327U(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C5304n.m23366f();
        }
        if (size != 1) {
            return m23326V(collection);
        }
        return C5303m.m23370b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final long[] m23328T(Collection<Long> collection) {
        C8298k.m12934e(collection, "<this>");
        long[] jArr = new long[collection.size()];
        int i = 0;
        for (Long l : collection) {
            i++;
            jArr[i] = l.longValue();
        }
        return jArr;
    }

    public static final <T> List<T> m23327U(Iterable<? extends T> iterable) {
        C8298k.m12934e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return m23326V((Collection) iterable);
        }
        return (List) m23331Q(iterable, new ArrayList());
    }

    public static final <T> List<T> m23326V(Collection<? extends T> collection) {
        C8298k.m12934e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final <T> Set<T> m23325W(Iterable<? extends T> iterable) {
        C8298k.m12934e(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) m23331Q(iterable, new LinkedHashSet());
    }

    public static final <T> Set<T> m23324X(Iterable<? extends T> iterable) {
        C8298k.m12934e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C5300j0.m23375d((Set) m23331Q(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C5300j0.m23377b();
        }
        if (size != 1) {
            return (Set) m23331Q(iterable, new LinkedHashSet(C5293g0.m23436a(collection.size())));
        }
        return C5298i0.m23379a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final <T> List<C5048h<T, T>> m23323Y(Iterable<? extends T> iterable) {
        C8298k.m12934e(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return C5304n.m23366f();
        }
        ArrayList arrayList = new ArrayList();
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            arrayList.add(C5054l.m24188a(next, next2));
            next = next2;
        }
        return arrayList;
    }

    public static final <T> AbstractC10466d<T> m23322y(Iterable<? extends T> iterable) {
        C8298k.m12934e(iterable, "<this>");
        return new C5313a(iterable);
    }

    public static final <T> List<T> m23321z(Iterable<? extends T> iterable) {
        C8298k.m12934e(iterable, "<this>");
        return m23329S(m23325W(iterable));
    }
}
