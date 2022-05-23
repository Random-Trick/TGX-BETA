package gc;

import ab.o;
import hc.c0;
import ja.n;
import ja.v;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import ra.k;
import vb.a;
import vb.b;

public final class d implements HostnameVerifier {
    public static final d f12196a = new d();

    public final List<String> a(X509Certificate x509Certificate) {
        k.e(x509Certificate, "certificate");
        return v.J(c(x509Certificate, 7), c(x509Certificate, 2));
    }

    public final String b(String str) {
        if (!d(str)) {
            return str;
        }
        Locale locale = Locale.US;
        k.d(locale, "Locale.US");
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = str.toLowerCase(locale);
        k.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    public final List<String> c(X509Certificate x509Certificate, int i10) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return n.f();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && !(!k.b(list.get(0), Integer.valueOf(i10))) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return n.f();
        }
    }

    public final boolean d(String str) {
        return str.length() == ((int) c0.b(str, 0, 0, 3, null));
    }

    public final boolean e(String str, X509Certificate x509Certificate) {
        k.e(str, "host");
        k.e(x509Certificate, "certificate");
        return b.f(str) ? h(str, x509Certificate) : g(str, x509Certificate);
    }

    public final boolean f(String str, String str2) {
        if (!(str == null || str.length() == 0) && !ab.n.x(str, ".", false, 2, null) && !ab.n.k(str, "..", false, 2, null)) {
            if (!(str2 == null || str2.length() == 0) && !ab.n.x(str2, ".", false, 2, null) && !ab.n.k(str2, "..", false, 2, null)) {
                if (!ab.n.k(str, ".", false, 2, null)) {
                    str = str + ".";
                }
                String str3 = str;
                if (!ab.n.k(str2, ".", false, 2, null)) {
                    str2 = str2 + ".";
                }
                String b10 = b(str2);
                if (!o.C(b10, "*", false, 2, null)) {
                    return k.b(str3, b10);
                }
                if (!ab.n.x(b10, "*.", false, 2, null) || o.M(b10, '*', 1, false, 4, null) != -1 || str3.length() < b10.length() || k.b("*.", b10)) {
                    return false;
                }
                String substring = b10.substring(1);
                k.d(substring, "(this as java.lang.String).substring(startIndex)");
                if (!ab.n.k(str3, substring, false, 2, null)) {
                    return false;
                }
                int length = str3.length() - substring.length();
                return length <= 0 || o.R(str3, '.', length + (-1), false, 4, null) == -1;
            }
        }
        return false;
    }

    public final boolean g(String str, X509Certificate x509Certificate) {
        String b10 = b(str);
        List<String> c10 = c(x509Certificate, 2);
        if ((c10 instanceof Collection) && c10.isEmpty()) {
            return false;
        }
        for (String str2 : c10) {
            if (f12196a.f(b10, str2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean h(String str, X509Certificate x509Certificate) {
        String e10 = a.e(str);
        List<String> c10 = c(x509Certificate, 7);
        if ((c10 instanceof Collection) && c10.isEmpty()) {
            return false;
        }
        for (String str2 : c10) {
            if (k.b(e10, a.e(str2))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean verify(String str, SSLSession sSLSession) {
        Certificate certificate;
        k.e(str, "host");
        k.e(sSLSession, "session");
        if (d(str)) {
            try {
                certificate = sSLSession.getPeerCertificates()[0];
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
            } catch (SSLException unused) {
                return false;
            }
        }
        return e(str, (X509Certificate) certificate);
    }
}
