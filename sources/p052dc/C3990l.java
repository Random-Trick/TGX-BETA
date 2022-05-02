package p052dc;

import cc.C2083h;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import qa.C8294g;
import qa.C8298k;

public final class C3990l extends C3976f {
    public static final C3991a f13366j = new C3991a(null);
    public final Class<? super SSLSocketFactory> f13367h;
    public final Class<?> f13368i;

    public static final class C3991a {
        public C3991a() {
        }

        public static AbstractC3989k m29414b(C3991a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.m29415a(str);
        }

        public final AbstractC3989k m29415a(String str) {
            C8298k.m12934e(str, "packageName");
            try {
                Class<?> cls = Class.forName(str + ".OpenSSLSocketImpl");
                Class<?> cls2 = Class.forName(str + ".OpenSSLSocketFactoryImpl");
                Class<?> cls3 = Class.forName(str + ".SSLParametersImpl");
                C8298k.m12935d(cls3, "paramsClass");
                return new C3990l(cls, cls2, cls3);
            } catch (Exception e) {
                C2083h.f7326c.m35674g().m35686j("unable to load android socket classes", 5, e);
                return null;
            }
        }

        public C3991a(C8294g gVar) {
            this();
        }
    }

    public C3990l(Class<? super SSLSocket> cls, Class<? super SSLSocketFactory> cls2, Class<?> cls3) {
        super(cls);
        C8298k.m12934e(cls, "sslSocketClass");
        C8298k.m12934e(cls2, "sslSocketFactoryClass");
        C8298k.m12934e(cls3, "paramClass");
        this.f13367h = cls2;
        this.f13368i = cls3;
    }
}
