package v9;

import ra.g;

public abstract class i<T> {

    public static final class a<T> extends b<T> {
        public a(T t10) {
            super(t10);
        }

        @Override
        public String toString() {
            return "State.Eos(" + a() + ')';
        }
    }

    public static class b<T> extends i<T> {
        public final T f24803a;

        public b(T t10) {
            super(null);
            this.f24803a = t10;
        }

        public final T a() {
            return this.f24803a;
        }

        public String toString() {
            return "State.Ok(" + this.f24803a + ')';
        }
    }

    public static final class c extends i {
        public static final c f24804a = new c();

        public c() {
            super(null);
        }

        public String toString() {
            return "State.Retry";
        }
    }

    public static final class d extends i {
        public static final d f24805a = new d();

        public d() {
            super(null);
        }

        public String toString() {
            return "State.Wait";
        }
    }

    public i() {
    }

    public i(g gVar) {
        this();
    }
}
