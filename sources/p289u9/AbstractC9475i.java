package p289u9;

import qa.C8294g;

public abstract class AbstractC9475i<T> {

    public static final class C9476a<T> extends C9477b<T> {
        public C9476a(T t) {
            super(t);
        }

        @Override
        public String toString() {
            return "State.Eos(" + m8558a() + ')';
        }
    }

    public static class C9477b<T> extends AbstractC9475i<T> {
        public final T f30713a;

        public C9477b(T t) {
            super(null);
            this.f30713a = t;
        }

        public final T m8558a() {
            return this.f30713a;
        }

        public String toString() {
            return "State.Ok(" + this.f30713a + ')';
        }
    }

    public static final class C9478c extends AbstractC9475i {
        public static final C9478c f30714a = new C9478c();

        public C9478c() {
            super(null);
        }

        public String toString() {
            return "State.Retry";
        }
    }

    public static final class C9479d extends AbstractC9475i {
        public static final C9479d f30715a = new C9479d();

        public C9479d() {
            super(null);
        }

        public String toString() {
            return "State.Wait";
        }
    }

    public AbstractC9475i() {
    }

    public AbstractC9475i(C8294g gVar) {
        this();
    }
}
