package a7;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;
import z6.j;
import z6.k;

public final class u {

    public class a extends a7.b<T> {
        public final k M;
        public final Iterator f665c;

        public a(Iterator it, k kVar) {
            this.f665c = it;
            this.M = kVar;
        }

        @Override
        @CheckForNull
        public T a() {
            while (this.f665c.hasNext()) {
                ?? next = this.f665c.next();
                if (this.M.apply(next)) {
                    return next;
                }
            }
            return b();
        }
    }

    public class b extends s0<T> {
        public boolean f666a;
        public final Object f667b;

        public b(Object obj) {
            this.f667b = obj;
        }

        @Override
        public boolean hasNext() {
            return !this.f666a;
        }

        @Override
        public T next() {
            if (!this.f666a) {
                this.f666a = true;
                return this.f667b;
            }
            throw new NoSuchElementException();
        }
    }

    public enum c implements Iterator<Object>, j$.util.Iterator {
        INSTANCE;

        @Override
        public void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override
        public void forEachRemaining(java.util.function.Consumer<? super Object> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override
        public void remove() {
            h.c(false);
        }
    }

    @CanIgnoreReturnValue
    public static <T> boolean a(Collection<T> collection, java.util.Iterator<? extends T> it) {
        j.i(collection);
        j.i(it);
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= collection.add(it.next());
        }
        return z10;
    }

    public static <T> boolean b(java.util.Iterator<T> it, k<? super T> kVar) {
        return k(it, kVar) != -1;
    }

    public static void c(java.util.Iterator<?> it) {
        j.i(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean d(java.util.Iterator<?> it, @CheckForNull Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(java.util.Iterator<?> r3, java.util.Iterator<?> r4) {
        throw new UnsupportedOperationException("Method not decompiled: a7.u.e(java.util.Iterator, java.util.Iterator):boolean");
    }

    public static <T> java.util.Iterator<T> f() {
        return c.INSTANCE;
    }

    public static <T> s0<T> g(java.util.Iterator<T> it, k<? super T> kVar) {
        j.i(it);
        j.i(kVar);
        return new a(it, kVar);
    }

    public static <T> T h(java.util.Iterator<T> it, k<? super T> kVar) {
        j.i(it);
        j.i(kVar);
        while (it.hasNext()) {
            T next = it.next();
            if (kVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static <T> T i(java.util.Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> T j(java.util.Iterator<? extends T> it, T t10) {
        return it.hasNext() ? it.next() : t10;
    }

    public static <T> int k(java.util.Iterator<T> it, k<? super T> kVar) {
        j.j(kVar, "predicate");
        int i10 = 0;
        while (it.hasNext()) {
            if (kVar.apply(it.next())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @CheckForNull
    public static <T> T l(java.util.Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    @CanIgnoreReturnValue
    public static boolean m(java.util.Iterator<?> it, Collection<?> collection) {
        j.i(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @CanIgnoreReturnValue
    public static <T> boolean n(java.util.Iterator<T> it, k<? super T> kVar) {
        j.i(kVar);
        boolean z10 = false;
        while (it.hasNext()) {
            if (kVar.apply(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> s0<T> o(T t10) {
        return new b(t10);
    }
}
