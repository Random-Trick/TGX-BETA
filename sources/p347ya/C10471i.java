package p347ya;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p123ia.C5304n;
import p251ra.AbstractC8415a;
import pa.AbstractC8088l;
import qa.AbstractC8299l;
import qa.C8298k;
import za.C11441f;

public class C10471i extends C10470h {

    public static final class C10472a implements Iterable<T>, AbstractC8415a {
        public final AbstractC10466d f33552a;

        public C10472a(AbstractC10466d dVar) {
            this.f33552a = dVar;
        }

        @Override
        public Iterator<T> iterator() {
            return this.f33552a.iterator();
        }
    }

    public static final class C10473b extends AbstractC8299l implements AbstractC8088l<T, Boolean> {
        public static final C10473b f33553b = new C10473b();

        public C10473b() {
            super(1);
        }

        public final Boolean mo568a(T t) {
            return Boolean.valueOf(t == 0);
        }
    }

    public static final <T> Iterable<T> m5069a(AbstractC10466d<? extends T> dVar) {
        C8298k.m12934e(dVar, "<this>");
        return new C10472a(dVar);
    }

    public static final <T> AbstractC10466d<T> m5068b(AbstractC10466d<? extends T> dVar, int i) {
        C8298k.m12934e(dVar, "<this>");
        if (i >= 0) {
            return i == 0 ? dVar : dVar instanceof AbstractC10463b ? ((AbstractC10463b) dVar).mo5074a(i) : new C10461a(dVar, i);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    public static final <T> AbstractC10466d<T> m5067c(AbstractC10466d<? extends T> dVar, AbstractC8088l<? super T, Boolean> lVar) {
        C8298k.m12934e(dVar, "<this>");
        C8298k.m12934e(lVar, "predicate");
        return new C10464c(dVar, false, lVar);
    }

    public static final <T> AbstractC10466d<T> m5066d(AbstractC10466d<? extends T> dVar) {
        C8298k.m12934e(dVar, "<this>");
        return m5067c(dVar, C10473b.f33553b);
    }

    public static final <T> T m5065e(AbstractC10466d<? extends T> dVar) {
        C8298k.m12934e(dVar, "<this>");
        Iterator<? extends T> it = dVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static final <T, A extends Appendable> A m5064f(AbstractC10466d<? extends T> dVar, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, AbstractC8088l<? super T, ? extends CharSequence> lVar) {
        C8298k.m12934e(dVar, "<this>");
        C8298k.m12934e(a, "buffer");
        C8298k.m12934e(charSequence, "separator");
        C8298k.m12934e(charSequence2, "prefix");
        C8298k.m12934e(charSequence3, "postfix");
        C8298k.m12934e(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : dVar) {
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

    public static final <T> String m5063g(AbstractC10466d<? extends T> dVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, AbstractC8088l<? super T, ? extends CharSequence> lVar) {
        C8298k.m12934e(dVar, "<this>");
        C8298k.m12934e(charSequence, "separator");
        C8298k.m12934e(charSequence2, "prefix");
        C8298k.m12934e(charSequence3, "postfix");
        C8298k.m12934e(charSequence4, "truncated");
        String sb2 = ((StringBuilder) m5064f(dVar, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, lVar)).toString();
        C8298k.m12935d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static String m5062h(AbstractC10466d dVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, AbstractC8088l lVar, int i2, Object obj) {
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
        return m5063g(dVar, charSequence, charSequence6, charSequence5, i3, charSequence7, lVar);
    }

    public static final <T, R> AbstractC10466d<R> m5061i(AbstractC10466d<? extends T> dVar, AbstractC8088l<? super T, ? extends R> lVar) {
        C8298k.m12934e(dVar, "<this>");
        C8298k.m12934e(lVar, "transform");
        return new C10474j(dVar, lVar);
    }

    public static final <T, R> AbstractC10466d<R> m5060j(AbstractC10466d<? extends T> dVar, AbstractC8088l<? super T, ? extends R> lVar) {
        C8298k.m12934e(dVar, "<this>");
        C8298k.m12934e(lVar, "transform");
        return m5066d(new C10474j(dVar, lVar));
    }

    public static final <T, C extends Collection<? super T>> C m5059k(AbstractC10466d<? extends T> dVar, C c) {
        C8298k.m12934e(dVar, "<this>");
        C8298k.m12934e(c, "destination");
        for (T t : dVar) {
            c.add(t);
        }
        return c;
    }

    public static final <T> List<T> m5058l(AbstractC10466d<? extends T> dVar) {
        C8298k.m12934e(dVar, "<this>");
        return C5304n.m23361k(m5057m(dVar));
    }

    public static final <T> List<T> m5057m(AbstractC10466d<? extends T> dVar) {
        C8298k.m12934e(dVar, "<this>");
        return (List) m5059k(dVar, new ArrayList());
    }
}
