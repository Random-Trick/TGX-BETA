package ab;

import ia.h;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import qa.p;
import ra.k;
import xa.g;
import xa.l;

public final class d implements za.d<g> {
    public final CharSequence f701a;
    public final int f702b;
    public final int f703c;
    public final p<CharSequence, Integer, h<Integer, Integer>> f704d;

    public static final class a implements Iterator<g>, sa.a, j$.util.Iterator {
        public g M;
        public int N;
        public int f705a = -1;
        public int f706b;
        public int f707c;

        public a() {
            int f10 = l.f(d.this.f702b, 0, d.this.f701a.length());
            this.f706b = f10;
            this.f707c = f10;
        }

        public final void d() {
            throw new UnsupportedOperationException("Method not decompiled: ab.d.a.d():void");
        }

        public g next() {
            if (this.f705a == -1) {
                d();
            }
            if (this.f705a != 0) {
                g gVar = this.M;
                Objects.requireNonNull(gVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.M = null;
                this.f705a = -1;
                return gVar;
            }
            throw new NoSuchElementException();
        }

        @Override
        public void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override
        public void forEachRemaining(java.util.function.Consumer<? super g> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override
        public boolean hasNext() {
            if (this.f705a == -1) {
                d();
            }
            return this.f705a == 1;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public d(CharSequence charSequence, int i10, int i11, p<? super CharSequence, ? super Integer, h<Integer, Integer>> pVar) {
        k.e(charSequence, "input");
        k.e(pVar, "getNextMatch");
        this.f701a = charSequence;
        this.f702b = i10;
        this.f703c = i11;
        this.f704d = pVar;
    }

    @Override
    public java.util.Iterator<g> iterator() {
        return new a();
    }
}
