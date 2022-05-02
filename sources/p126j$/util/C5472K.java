package p126j$.util;

import java.util.NoSuchElementException;
import java.util.Objects;
import p126j$.util.Iterator;
import p126j$.util.function.AbstractC5525g;
import p126j$.util.function.Consumer;

public class C5472K implements AbstractC5552p, AbstractC5525g, Iterator {
    boolean f17943a = false;
    double f17944b;
    final AbstractC5811y f17945c;

    public C5472K(AbstractC5811y yVar) {
        this.f17945c = yVar;
    }

    public void m22600a(AbstractC5525g gVar) {
        Objects.requireNonNull(gVar);
        while (hasNext()) {
            gVar.mo22150c(nextDouble());
        }
    }

    @Override
    public void mo22150c(double d) {
        this.f17943a = true;
        this.f17944b = d;
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        AbstractC5485a.m22573b(this, consumer);
    }

    @Override
    public boolean hasNext() {
        if (!this.f17943a) {
            this.f17945c.mo22123l(this);
        }
        return this.f17943a;
    }

    @Override
    public Double next() {
        if (!AbstractC5484X.f17972a) {
            return Double.valueOf(nextDouble());
        }
        AbstractC5484X.m22586a(C5472K.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
        throw null;
    }

    public double nextDouble() {
        if (this.f17943a || hasNext()) {
            this.f17943a = false;
            return this.f17944b;
        }
        throw new NoSuchElementException();
    }

    @Override
    public void remove() {
        Iterator.CC.m22602a();
        throw null;
    }
}
