package p081fc;

import cc.C2083h;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import qa.C8294g;
import qa.C8298k;

public abstract class AbstractC4349c {
    public static final C4350a f14426a = new C4350a(null);

    public static final class C4350a {
        public C4350a() {
        }

        public final AbstractC4349c m28223a(X509TrustManager x509TrustManager) {
            C8298k.m12933e(x509TrustManager, "trustManager");
            return C2083h.f7326c.m35677g().mo35696c(x509TrustManager);
        }

        public C4350a(C8294g gVar) {
            this();
        }
    }

    public abstract List<Certificate> mo28224a(List<? extends Certificate> list, String str);
}
