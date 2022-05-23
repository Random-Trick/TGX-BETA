package ec;

import android.net.http.X509TrustManagerExtensions;
import gc.c;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import ra.g;
import ra.k;

public final class b extends c {
    public static final a f11498d = new a(null);
    public final X509TrustManager f11499b;
    public final X509TrustManagerExtensions f11500c;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }

        public final b a(X509TrustManager x509TrustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            k.e(x509TrustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new b(x509TrustManager, x509TrustManagerExtensions);
            }
            return null;
        }
    }

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        k.e(x509TrustManager, "trustManager");
        k.e(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f11499b = x509TrustManager;
        this.f11500c = x509TrustManagerExtensions;
    }

    @Override
    public List<Certificate> a(List<? extends Certificate> list, String str) {
        k.e(list, "chain");
        k.e(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        try {
            List<X509Certificate> checkServerTrusted = this.f11500c.checkServerTrusted((X509Certificate[]) array, "RSA", str);
            k.d(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e10) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
            sSLPeerUnverifiedException.initCause(e10);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f11499b == this.f11499b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f11499b);
    }
}
