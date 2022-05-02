package za;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import p107ha.C5048h;
import p126j$.util.Iterator;
import p126j$.util.function.Consumer;
import p251ra.AbstractC8415a;
import p317wa.C10022g;
import p317wa.C10030l;
import p347ya.AbstractC10466d;
import pa.AbstractC8092p;
import qa.C8298k;

public final class C11437d implements AbstractC10466d<C10022g> {
    public final CharSequence f36402a;
    public final int f36403b;
    public final int f36404c;
    public final AbstractC8092p<CharSequence, Integer, C5048h<Integer, Integer>> f36405d;

    public static final class C11438a implements Iterator<C10022g>, AbstractC8415a, p126j$.util.Iterator {
        public C10022g f36406M;
        public int f36407N;
        public int f36409a = -1;
        public int f36410b;
        public int f36411c;

        public C11438a() {
            int f = C10030l.m6191f(C11437d.this.f36403b, 0, C11437d.this.f36402a.length());
            this.f36410b = f;
            this.f36411c = f;
        }

        public final void m650e() {
            throw new UnsupportedOperationException("Method not decompiled: za.C11437d.C11438a.m650e():void");
        }

        @Override
        public void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override
        public void forEachRemaining(java.util.function.Consumer<? super C10022g> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        public C10022g next() {
            if (this.f36409a == -1) {
                m650e();
            }
            if (this.f36409a != 0) {
                C10022g gVar = this.f36406M;
                Objects.requireNonNull(gVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f36406M = null;
                this.f36409a = -1;
                return gVar;
            }
            throw new NoSuchElementException();
        }

        @Override
        public boolean hasNext() {
            if (this.f36409a == -1) {
                m650e();
            }
            return this.f36409a == 1;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C11437d(CharSequence charSequence, int i, int i2, AbstractC8092p<? super CharSequence, ? super Integer, C5048h<Integer, Integer>> pVar) {
        C8298k.m12934e(charSequence, "input");
        C8298k.m12934e(pVar, "getNextMatch");
        this.f36402a = charSequence;
        this.f36403b = i;
        this.f36404c = i2;
        this.f36405d = pVar;
    }

    @Override
    public java.util.Iterator<C10022g> iterator() {
        return new C11438a();
    }
}
