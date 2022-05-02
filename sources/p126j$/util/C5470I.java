package p126j$.util;

import java.util.NoSuchElementException;
import java.util.Objects;
import p126j$.util.Iterator;
import p126j$.util.function.AbstractC5530l;
import p126j$.util.function.Consumer;

class C5470I implements AbstractC5555s, AbstractC5530l, Iterator {
    boolean f17937a = false;
    int f17938b;
    final AbstractC5462A f17939c;

    public C5470I(AbstractC5462A a) {
        this.f17939c = a;
    }

    public void m22603a(AbstractC5530l lVar) {
        Objects.requireNonNull(lVar);
        while (hasNext()) {
            lVar.mo22144d(nextInt());
        }
    }

    @Override
    public void mo22144d(int i) {
        this.f17937a = true;
        this.f17938b = i;
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        if (consumer instanceof AbstractC5530l) {
            m22603a((AbstractC5530l) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (!AbstractC5484X.f17972a) {
            while (hasNext()) {
                consumer.mo22128k(Integer.valueOf(nextInt()));
            }
            return;
        }
        AbstractC5484X.m22586a(C5470I.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
        throw null;
    }

    @Override
    public boolean hasNext() {
        if (!this.f17937a) {
            this.f17939c.mo22181i(this);
        }
        return this.f17937a;
    }

    @Override
    public Integer next() {
        if (!AbstractC5484X.f17972a) {
            return Integer.valueOf(nextInt());
        }
        AbstractC5484X.m22586a(C5470I.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
        throw null;
    }

    public int nextInt() {
        if (this.f17937a || hasNext()) {
            this.f17937a = false;
            return this.f17938b;
        }
        throw new NoSuchElementException();
    }

    @Override
    public void remove() {
        Iterator.CC.m22602a();
        throw null;
    }
}
