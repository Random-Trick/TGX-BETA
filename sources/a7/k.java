package a7;

import b7.d;
import b7.f;
import java.util.Comparator;

public abstract class k {
    public static final k f632a = new a();
    public static final k f633b = new b(-1);
    public static final k f634c = new b(1);

    public class a extends k {
        public a() {
            super(null);
        }

        @Override
        public k d(int i10, int i11) {
            return k(d.e(i10, i11));
        }

        @Override
        public k e(long j10, long j11) {
            return k(f.a(j10, j11));
        }

        @Override
        public <T> k f(T t10, T t11, Comparator<T> comparator) {
            return k(comparator.compare(t10, t11));
        }

        @Override
        public k g(boolean z10, boolean z11) {
            return k(b7.a.a(z10, z11));
        }

        @Override
        public k h(boolean z10, boolean z11) {
            return k(b7.a.a(z11, z10));
        }

        @Override
        public int i() {
            return 0;
        }

        public k k(int i10) {
            return i10 < 0 ? k.f633b : i10 > 0 ? k.f634c : k.f632a;
        }
    }

    public static final class b extends k {
        public final int f635d;

        public b(int i10) {
            super(null);
            this.f635d = i10;
        }

        @Override
        public k d(int i10, int i11) {
            return this;
        }

        @Override
        public k e(long j10, long j11) {
            return this;
        }

        @Override
        public <T> k f(T t10, T t11, Comparator<T> comparator) {
            return this;
        }

        @Override
        public k g(boolean z10, boolean z11) {
            return this;
        }

        @Override
        public k h(boolean z10, boolean z11) {
            return this;
        }

        @Override
        public int i() {
            return this.f635d;
        }
    }

    public k() {
    }

    public k(a aVar) {
        this();
    }

    public static k j() {
        return f632a;
    }

    public abstract k d(int i10, int i11);

    public abstract k e(long j10, long j11);

    public abstract <T> k f(T t10, T t11, Comparator<T> comparator);

    public abstract k g(boolean z10, boolean z11);

    public abstract k h(boolean z10, boolean z11);

    public abstract int i();
}
