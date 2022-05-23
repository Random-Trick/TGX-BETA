package gc;

import dc.h;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import ra.g;
import ra.k;

public abstract class c {
    public static final a f12195a = new a(null);

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }

        public final c a(X509TrustManager x509TrustManager) {
            k.e(x509TrustManager, "trustManager");
            return h.f7333c.g().c(x509TrustManager);
        }
    }

    public abstract List<Certificate> a(List<? extends Certificate> list, String str);
}
