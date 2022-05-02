package p316w9;

import java.util.Iterator;
import p123ia.C5304n;
import p192n9.EnumC7313d;
import p251ra.AbstractC8415a;
import qa.C8298k;

public interface AbstractC10012l<T> extends Iterable<T>, AbstractC8415a {

    public static final class C10013a {
        public static <T> T m6232a(AbstractC10012l<T> lVar) {
            return lVar.mo6238f(EnumC7313d.AUDIO);
        }

        public static <T> T m6231b(AbstractC10012l<T> lVar) {
            return lVar.mo6239d(EnumC7313d.AUDIO);
        }

        public static <T> boolean m6230c(AbstractC10012l<T> lVar) {
            return lVar.mo6237g(EnumC7313d.AUDIO);
        }

        public static <T> boolean m6229d(AbstractC10012l<T> lVar) {
            return lVar.mo6237g(EnumC7313d.VIDEO);
        }

        public static <T> T m6228e(AbstractC10012l<T> lVar, EnumC7313d dVar) {
            C8298k.m12934e(dVar, "type");
            if (lVar.mo6237g(dVar)) {
                return lVar.mo6239d(dVar);
            }
            return null;
        }

        public static <T> int m6227f(AbstractC10012l<T> lVar) {
            return C5304n.m23363i(lVar.mo6235l(), lVar.mo6234n()).size();
        }

        public static <T> T m6226g(AbstractC10012l<T> lVar) {
            return lVar.mo6239d(EnumC7313d.VIDEO);
        }

        public static <T> Iterator<T> m6225h(AbstractC10012l<T> lVar) {
            return C5304n.m23363i(lVar.mo6235l(), lVar.mo6234n()).iterator();
        }

        public static <T> T m6224i(AbstractC10012l<T> lVar) {
            return lVar.mo6238f(EnumC7313d.VIDEO);
        }
    }

    T mo6241a();

    T mo6240b();

    T mo6239d(EnumC7313d dVar);

    T mo6238f(EnumC7313d dVar);

    boolean mo6237g(EnumC7313d dVar);

    int getSize();

    boolean mo6236k();

    T mo6235l();

    T mo6234n();

    boolean mo6233o();
}
