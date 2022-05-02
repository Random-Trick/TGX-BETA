package p126j$.util;

import java.util.NoSuchElementException;
import java.util.Objects;
import p126j$.util.Iterator;
import p126j$.util.function.AbstractC5535q;
import p126j$.util.function.Consumer;

class C5471J implements AbstractC5808v, AbstractC5535q, Iterator {
    boolean f17940a = false;
    long f17941b;
    final AbstractC5464C f17942c;

    public C5471J(AbstractC5464C c) {
        this.f17942c = c;
    }

    public void m22602a(AbstractC5535q qVar) {
        Objects.requireNonNull(qVar);
        while (hasNext()) {
            qVar.mo22128e(nextLong());
        }
    }

    @Override
    public void mo22128e(long j) {
        this.f17940a = true;
        this.f17941b = j;
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        if (consumer instanceof AbstractC5535q) {
            m22602a((AbstractC5535q) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (!AbstractC5484X.f17972a) {
            while (hasNext()) {
                consumer.mo22129k(Long.valueOf(nextLong()));
            }
            return;
        }
        AbstractC5484X.m22587a(C5471J.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
        throw null;
    }

    @Override
    public boolean hasNext() {
        if (!this.f17940a) {
            this.f17942c.mo22166g(this);
        }
        return this.f17940a;
    }

    @Override
    public Long next() {
        if (!AbstractC5484X.f17972a) {
            return Long.valueOf(nextLong());
        }
        AbstractC5484X.m22587a(C5471J.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
        throw null;
    }

    public long nextLong() {
        if (this.f17940a || hasNext()) {
            this.f17940a = false;
            return this.f17941b;
        }
        throw new NoSuchElementException();
    }

    @Override
    public void remove() {
        Iterator.CC.m22603a();
        throw null;
    }
}
