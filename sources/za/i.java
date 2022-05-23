package za;

import ab.f;
import ja.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ra.k;
import ra.l;

public class i extends h {

    public static final class a implements Iterable<T>, sa.a {
        public final d f27061a;

        public a(d dVar) {
            this.f27061a = dVar;
        }

        @Override
        public Iterator<T> iterator() {
            return this.f27061a.iterator();
        }
    }

    public static final class b extends l implements qa.l<T, Boolean> {
        public static final b f27062b = new b();

        public b() {
            super(1);
        }

        public final Boolean a(T t10) {
            return Boolean.valueOf(t10 == 0);
        }
    }

    public static final <T> Iterable<T> a(d<? extends T> dVar) {
        k.e(dVar, "<this>");
        return new a(dVar);
    }

    public static final <T> d<T> b(d<? extends T> dVar, int i10) {
        k.e(dVar, "<this>");
        if (i10 >= 0) {
            return i10 == 0 ? dVar : dVar instanceof za.b ? ((za.b) dVar).a(i10) : new za.a(dVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static final <T> d<T> c(d<? extends T> dVar, qa.l<? super T, Boolean> lVar) {
        k.e(dVar, "<this>");
        k.e(lVar, "predicate");
        return new c(dVar, false, lVar);
    }

    public static final <T> d<T> d(d<? extends T> dVar) {
        k.e(dVar, "<this>");
        return c(dVar, b.f27062b);
    }

    public static final <T> T e(d<? extends T> dVar) {
        k.e(dVar, "<this>");
        Iterator<? extends T> it = dVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static final <T, A extends Appendable> A f(d<? extends T> dVar, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, qa.l<? super T, ? extends CharSequence> lVar) {
        k.e(dVar, "<this>");
        k.e(a10, "buffer");
        k.e(charSequence, "separator");
        k.e(charSequence2, "prefix");
        k.e(charSequence3, "postfix");
        k.e(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (T t10 : dVar) {
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

    public static final <T> String g(d<? extends T> dVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, qa.l<? super T, ? extends CharSequence> lVar) {
        k.e(dVar, "<this>");
        k.e(charSequence, "separator");
        k.e(charSequence2, "prefix");
        k.e(charSequence3, "postfix");
        k.e(charSequence4, "truncated");
        String sb2 = ((StringBuilder) f(dVar, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        k.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static String h(d dVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, qa.l lVar, int i11, Object obj) {
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
        return g(dVar, charSequence, charSequence6, charSequence5, i12, charSequence7, lVar);
    }

    public static final <T, R> d<R> i(d<? extends T> dVar, qa.l<? super T, ? extends R> lVar) {
        k.e(dVar, "<this>");
        k.e(lVar, "transform");
        return new j(dVar, lVar);
    }

    public static final <T, R> d<R> j(d<? extends T> dVar, qa.l<? super T, ? extends R> lVar) {
        k.e(dVar, "<this>");
        k.e(lVar, "transform");
        return d(new j(dVar, lVar));
    }

    public static final <T, C extends Collection<? super T>> C k(d<? extends T> dVar, C c10) {
        k.e(dVar, "<this>");
        k.e(c10, "destination");
        for (T t10 : dVar) {
            c10.add(t10);
        }
        return c10;
    }

    public static final <T> List<T> l(d<? extends T> dVar) {
        k.e(dVar, "<this>");
        return n.k(m(dVar));
    }

    public static final <T> List<T> m(d<? extends T> dVar) {
        k.e(dVar, "<this>");
        return (List) k(dVar, new ArrayList());
    }
}
