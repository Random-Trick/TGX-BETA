package p358z6;

import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p008a7.C0197a;
import p008a7.C0199c;
import p008a7.C0201d;

public abstract class AbstractC11374k {
    public static final AbstractC11374k f36326a = new C11375a();
    public static final AbstractC11374k f36327b = new C11376b(-1);
    public static final AbstractC11374k f36328c = new C11376b(1);

    public static class C11375a extends AbstractC11374k {
        public C11375a() {
            super(null);
        }

        @Override
        public AbstractC11374k mo800d(int i, int i2) {
            return m801k(C0199c.m42101e(i, i2));
        }

        @Override
        public AbstractC11374k mo799e(long j, long j2) {
            return m801k(C0201d.m42093a(j, j2));
        }

        @Override
        public <T> AbstractC11374k mo798f(@NullableDecl T t, @NullableDecl T t2, Comparator<T> comparator) {
            return m801k(comparator.compare(t, t2));
        }

        @Override
        public AbstractC11374k mo797g(boolean z, boolean z2) {
            return m801k(C0197a.m42107a(z, z2));
        }

        @Override
        public AbstractC11374k mo796h(boolean z, boolean z2) {
            return m801k(C0197a.m42107a(z2, z));
        }

        @Override
        public int mo795i() {
            return 0;
        }

        public AbstractC11374k m801k(int i) {
            if (i < 0) {
                return AbstractC11374k.f36327b;
            }
            return i > 0 ? AbstractC11374k.f36328c : AbstractC11374k.f36326a;
        }
    }

    public static final class C11376b extends AbstractC11374k {
        public final int f36329d;

        public C11376b(int i) {
            super(null);
            this.f36329d = i;
        }

        @Override
        public AbstractC11374k mo800d(int i, int i2) {
            return this;
        }

        @Override
        public AbstractC11374k mo799e(long j, long j2) {
            return this;
        }

        @Override
        public <T> AbstractC11374k mo798f(@NullableDecl T t, @NullableDecl T t2, @NullableDecl Comparator<T> comparator) {
            return this;
        }

        @Override
        public AbstractC11374k mo797g(boolean z, boolean z2) {
            return this;
        }

        @Override
        public AbstractC11374k mo796h(boolean z, boolean z2) {
            return this;
        }

        @Override
        public int mo795i() {
            return this.f36329d;
        }
    }

    public AbstractC11374k(C11375a aVar) {
        this();
    }

    public static AbstractC11374k m802j() {
        return f36326a;
    }

    public abstract AbstractC11374k mo800d(int i, int i2);

    public abstract AbstractC11374k mo799e(long j, long j2);

    public abstract <T> AbstractC11374k mo798f(@NullableDecl T t, @NullableDecl T t2, Comparator<T> comparator);

    public abstract AbstractC11374k mo797g(boolean z, boolean z2);

    public abstract AbstractC11374k mo796h(boolean z, boolean z2);

    public abstract int mo795i();

    public AbstractC11374k() {
    }
}
