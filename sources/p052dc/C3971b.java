package p052dc;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import p081fc.AbstractC4349c;
import qa.C8294g;
import qa.C8298k;

public final class C3971b extends AbstractC4349c {
    public static final C3972a f13341d = new C3972a(null);
    public final X509TrustManager f13342b;
    public final X509TrustManagerExtensions f13343c;

    public static final class C3972a {
        public C3972a() {
        }

        public final C3971b m29441a(X509TrustManager x509TrustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            C8298k.m12934e(x509TrustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new C3971b(x509TrustManager, x509TrustManagerExtensions);
            }
            return null;
        }

        public C3972a(C8294g gVar) {
            this();
        }
    }

    public C3971b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        C8298k.m12934e(x509TrustManager, "trustManager");
        C8298k.m12934e(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f13342b = x509TrustManager;
        this.f13343c = x509TrustManagerExtensions;
    }

    @Override
    public List<Certificate> mo28222a(List<? extends Certificate> list, String str) {
        C8298k.m12934e(list, "chain");
        C8298k.m12934e(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        try {
            List<X509Certificate> checkServerTrusted = this.f13343c.checkServerTrusted((X509Certificate[]) array, "RSA", str);
            C8298k.m12935d(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C3971b) && ((C3971b) obj).f13342b == this.f13342b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f13342b);
    }
}
