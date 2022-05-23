package x9;

import java.util.Iterator;
import o9.d;
import ra.k;
import x9.l;

public interface j<T> extends l<T> {

    public static final class a {
        public static <T> T a(j<T> jVar) {
            return (T) l.a.a(jVar);
        }

        public static <T> T b(j<T> jVar) {
            return (T) l.a.b(jVar);
        }

        public static <T> boolean c(j<T> jVar) {
            return l.a.c(jVar);
        }

        public static <T> boolean d(j<T> jVar) {
            return l.a.d(jVar);
        }

        public static <T> T e(j<T> jVar, d dVar) {
            k.e(dVar, "type");
            return (T) l.a.e(jVar, dVar);
        }

        public static <T> int f(j<T> jVar) {
            return l.a.f(jVar);
        }

        public static <T> T g(j<T> jVar) {
            return (T) l.a.g(jVar);
        }

        public static <T> Iterator<T> h(j<T> jVar) {
            return l.a.h(jVar);
        }

        public static <T> void i(j<T> jVar, T t10, T t11) {
            jVar.e(d.VIDEO, t10);
            jVar.e(d.AUDIO, t11);
        }

        public static <T> void j(j<T> jVar, T t10) {
            jVar.e(d.AUDIO, t10);
        }

        public static <T> void k(j<T> jVar, T t10) {
            jVar.e(d.VIDEO, t10);
        }

        public static <T> T l(j<T> jVar) {
            return (T) l.a.i(jVar);
        }
    }

    @Override
    T a();

    @Override
    T b();

    void c(T t10, T t11);

    void e(d dVar, T t10);

    void h(T t10);

    void p(T t10);
}
