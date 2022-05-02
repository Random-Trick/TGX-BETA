package p358z6;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p126j$.util.Iterator;
import p126j$.util.function.Consumer;
import p343y6.AbstractC10434j;
import p343y6.C10433i;

public final class C11407u {

    public static class C11408a extends AbstractC11326b<T> {
        public final AbstractC10434j f36368M;
        public final Iterator f36369c;

        public C11408a(Iterator it, AbstractC10434j jVar) {
            this.f36369c = it;
            this.f36368M = jVar;
        }

        @Override
        public T mo697a() {
            while (this.f36369c.hasNext()) {
                ?? next = this.f36369c.next();
                if (this.f36368M.apply(next)) {
                    return next;
                }
            }
            return m893b();
        }
    }

    public static class C11409b extends AbstractC11403r0<T> {
        public boolean f36370a;
        public final Object f36371b;

        public C11409b(Object obj) {
            this.f36371b = obj;
        }

        @Override
        public boolean hasNext() {
            return !this.f36370a;
        }

        @Override
        public T next() {
            if (!this.f36370a) {
                this.f36370a = true;
                return this.f36371b;
            }
            throw new NoSuchElementException();
        }
    }

    public enum EnumC11410c implements Iterator<Object>, p126j$.util.Iterator {
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
            C11363h.m818c(false);
        }
    }

    @CanIgnoreReturnValue
    public static <T> boolean m712a(Collection<T> collection, java.util.Iterator<? extends T> it) {
        C10433i.m5129i(collection);
        C10433i.m5129i(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    public static <T> boolean m711b(java.util.Iterator<T> it, AbstractC10434j<? super T> jVar) {
        return m702k(it, jVar) != -1;
    }

    public static void m710c(java.util.Iterator<?> it) {
        C10433i.m5129i(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean m709d(java.util.Iterator<?> it, @NullableDecl Object obj) {
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

    public static boolean m708e(java.util.Iterator<?> r3, java.util.Iterator<?> r4) {
        throw new UnsupportedOperationException("Method not decompiled: p358z6.C11407u.m708e(java.util.Iterator, java.util.Iterator):boolean");
    }

    public static <T> java.util.Iterator<T> m707f() {
        return EnumC11410c.INSTANCE;
    }

    public static <T> AbstractC11403r0<T> m706g(java.util.Iterator<T> it, AbstractC10434j<? super T> jVar) {
        C10433i.m5129i(it);
        C10433i.m5129i(jVar);
        return new C11408a(it, jVar);
    }

    public static <T> T m705h(java.util.Iterator<T> it, AbstractC10434j<? super T> jVar) {
        C10433i.m5129i(it);
        C10433i.m5129i(jVar);
        while (it.hasNext()) {
            T next = it.next();
            if (jVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static <T> T m704i(java.util.Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    @NullableDecl
    public static <T> T m703j(java.util.Iterator<? extends T> it, @NullableDecl T t) {
        return it.hasNext() ? it.next() : t;
    }

    public static <T> int m702k(java.util.Iterator<T> it, AbstractC10434j<? super T> jVar) {
        C10433i.m5128j(jVar, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (jVar.apply(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @NullableDecl
    public static <T> T m701l(java.util.Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    @CanIgnoreReturnValue
    public static boolean m700m(java.util.Iterator<?> it, Collection<?> collection) {
        C10433i.m5129i(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @CanIgnoreReturnValue
    public static <T> boolean m699n(java.util.Iterator<T> it, AbstractC10434j<? super T> jVar) {
        C10433i.m5129i(jVar);
        boolean z = false;
        while (it.hasNext()) {
            if (jVar.apply(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static <T> AbstractC11403r0<T> m698o(@NullableDecl T t) {
        return new C11409b(t);
    }
}
