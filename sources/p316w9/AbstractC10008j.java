package p316w9;

import java.util.Iterator;
import p192n9.EnumC7313d;
import p316w9.AbstractC10012l;
import qa.C8298k;

public interface AbstractC10008j<T> extends AbstractC10012l<T> {

    public static final class C10009a {
        public static <T> T m6254a(AbstractC10008j<T> jVar) {
            return (T) AbstractC10012l.C10013a.m6232a(jVar);
        }

        public static <T> T m6253b(AbstractC10008j<T> jVar) {
            return (T) AbstractC10012l.C10013a.m6231b(jVar);
        }

        public static <T> boolean m6252c(AbstractC10008j<T> jVar) {
            return AbstractC10012l.C10013a.m6230c(jVar);
        }

        public static <T> boolean m6251d(AbstractC10008j<T> jVar) {
            return AbstractC10012l.C10013a.m6229d(jVar);
        }

        public static <T> T m6250e(AbstractC10008j<T> jVar, EnumC7313d dVar) {
            C8298k.m12933e(dVar, "type");
            return (T) AbstractC10012l.C10013a.m6228e(jVar, dVar);
        }

        public static <T> int m6249f(AbstractC10008j<T> jVar) {
            return AbstractC10012l.C10013a.m6227f(jVar);
        }

        public static <T> T m6248g(AbstractC10008j<T> jVar) {
            return (T) AbstractC10012l.C10013a.m6226g(jVar);
        }

        public static <T> Iterator<T> m6247h(AbstractC10008j<T> jVar) {
            return AbstractC10012l.C10013a.m6225h(jVar);
        }

        public static <T> void m6246i(AbstractC10008j<T> jVar, T t, T t2) {
            jVar.mo6256p(EnumC7313d.VIDEO, t);
            jVar.mo6256p(EnumC7313d.AUDIO, t2);
        }

        public static <T> void m6245j(AbstractC10008j<T> jVar, T t) {
            jVar.mo6256p(EnumC7313d.AUDIO, t);
        }

        public static <T> void m6244k(AbstractC10008j<T> jVar, T t) {
            jVar.mo6256p(EnumC7313d.VIDEO, t);
        }

        public static <T> T m6243l(AbstractC10008j<T> jVar) {
            return (T) AbstractC10012l.C10013a.m6224i(jVar);
        }
    }

    @Override
    T mo6241a();

    @Override
    T mo6240b();

    void mo6258c(T t, T t2);

    void mo6257j(T t);

    void mo6256p(EnumC7313d dVar, T t);

    void mo6255q(T t);
}
