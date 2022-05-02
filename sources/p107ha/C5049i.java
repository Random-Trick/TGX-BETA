package p107ha;

import java.io.Serializable;
import qa.C8294g;
import qa.C8298k;

public final class C5049i<T> implements Serializable {
    public static final C5050a f17059a = new C5050a(null);

    public static final class C5050a {
        public C5050a() {
        }

        public C5050a(C8294g gVar) {
            this();
        }
    }

    public static final class C5051b implements Serializable {
        public final Throwable f17060a;

        public C5051b(Throwable th) {
            C8298k.m12933e(th, "exception");
            this.f17060a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C5051b) && C8298k.m12936b(this.f17060a, ((C5051b) obj).f17060a);
        }

        public int hashCode() {
            return this.f17060a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f17060a + ')';
        }
    }

    public static <T> Object m24193a(Object obj) {
        return obj;
    }

    public static final Throwable m24192b(Object obj) {
        if (obj instanceof C5051b) {
            return ((C5051b) obj).f17060a;
        }
        return null;
    }
}
