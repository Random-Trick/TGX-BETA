package ia;

import java.io.Serializable;
import ra.g;
import ra.k;

public final class i<T> implements Serializable {
    public static final a f14152a = new a(null);

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }
    }

    public static final class b implements Serializable {
        public final Throwable f14153a;

        public b(Throwable th) {
            k.e(th, "exception");
            this.f14153a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && k.b(this.f14153a, ((b) obj).f14153a);
        }

        public int hashCode() {
            return this.f14153a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f14153a + ')';
        }
    }

    public static <T> Object a(Object obj) {
        return obj;
    }

    public static final Throwable b(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f14153a;
        }
        return null;
    }
}
