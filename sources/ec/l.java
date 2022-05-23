package ec;

import dc.h;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import ra.g;
import ra.k;

public final class l extends f {
    public static final a f11523j = new a(null);
    public final Class<? super SSLSocketFactory> f11524h;
    public final Class<?> f11525i;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }

        public static k b(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.a(str);
        }

        public final k a(String str) {
            k.e(str, "packageName");
            try {
                Class<?> cls = Class.forName(str + ".OpenSSLSocketImpl");
                Class<?> cls2 = Class.forName(str + ".OpenSSLSocketFactoryImpl");
                Class<?> cls3 = Class.forName(str + ".SSLParametersImpl");
                k.d(cls3, "paramsClass");
                return new l(cls, cls2, cls3);
            } catch (Exception e10) {
                h.f7333c.g().j("unable to load android socket classes", 5, e10);
                return null;
            }
        }
    }

    public l(Class<? super SSLSocket> cls, Class<? super SSLSocketFactory> cls2, Class<?> cls3) {
        super(cls);
        k.e(cls, "sslSocketClass");
        k.e(cls2, "sslSocketFactoryClass");
        k.e(cls3, "paramClass");
        this.f11524h = cls2;
        this.f11525i = cls3;
    }
}
