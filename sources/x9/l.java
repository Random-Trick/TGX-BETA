package x9;

import ja.n;
import java.util.Iterator;
import o9.d;
import ra.k;

public interface l<T> extends Iterable<T>, sa.a {

    public static final class a {
        public static <T> T a(l<T> lVar) {
            return lVar.o(d.AUDIO);
        }

        public static <T> T b(l<T> lVar) {
            return lVar.n(d.AUDIO);
        }

        public static <T> boolean c(l<T> lVar) {
            return lVar.q(d.AUDIO);
        }

        public static <T> boolean d(l<T> lVar) {
            return lVar.q(d.VIDEO);
        }

        public static <T> T e(l<T> lVar, d dVar) {
            k.e(dVar, "type");
            if (lVar.q(dVar)) {
                return lVar.n(dVar);
            }
            return null;
        }

        public static <T> int f(l<T> lVar) {
            return n.i(lVar.j(), lVar.k()).size();
        }

        public static <T> T g(l<T> lVar) {
            return lVar.n(d.VIDEO);
        }

        public static <T> Iterator<T> h(l<T> lVar) {
            return n.i(lVar.j(), lVar.k()).iterator();
        }

        public static <T> T i(l<T> lVar) {
            return lVar.o(d.VIDEO);
        }
    }

    T a();

    T b();

    int getSize();

    boolean i();

    T j();

    T k();

    boolean l();

    T n(d dVar);

    T o(d dVar);

    boolean q(d dVar);
}
