package p081fc;

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
import p095gc.C4543c0;
import p123ia.C5304n;
import p123ia.C5312v;
import p290ub.C9488a;
import p290ub.C9489b;
import qa.C8298k;
import za.C11451n;
import za.C11452o;

public final class C4351d implements HostnameVerifier {
    public static final C4351d f14427a = new C4351d();

    public final List<String> m28220a(X509Certificate x509Certificate) {
        C8298k.m12934e(x509Certificate, "certificate");
        return C5312v.m23338J(m28218c(x509Certificate, 7), m28218c(x509Certificate, 2));
    }

    public final String m28219b(String str) {
        if (!m28217d(str)) {
            return str;
        }
        Locale locale = Locale.US;
        C8298k.m12935d(locale, "Locale.US");
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = str.toLowerCase(locale);
        C8298k.m12935d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    public final List<String> m28218c(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return C5304n.m23366f();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && !(!C8298k.m12937b(list.get(0), Integer.valueOf(i))) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return C5304n.m23366f();
        }
    }

    public final boolean m28217d(String str) {
        return str.length() == ((int) C4543c0.m27469b(str, 0, 0, 3, null));
    }

    public final boolean m28216e(String str, X509Certificate x509Certificate) {
        C8298k.m12934e(str, "host");
        C8298k.m12934e(x509Certificate, "certificate");
        return C9489b.m8518f(str) ? m28213h(str, x509Certificate) : m28214g(str, x509Certificate);
    }

    public final boolean m28215f(String str, String str2) {
        if (!(str == null || str.length() == 0) && !C11451n.m621x(str, ".", false, 2, null) && !C11451n.m634k(str, "..", false, 2, null)) {
            if (!(str2 == null || str2.length() == 0) && !C11451n.m621x(str2, ".", false, 2, null) && !C11451n.m634k(str2, "..", false, 2, null)) {
                if (!C11451n.m634k(str, ".", false, 2, null)) {
                    str = str + ".";
                }
                String str3 = str;
                if (!C11451n.m634k(str2, ".", false, 2, null)) {
                    str2 = str2 + ".";
                }
                String b = m28219b(str2);
                if (!C11452o.m618C(b, "*", false, 2, null)) {
                    return C8298k.m12937b(str3, b);
                }
                if (!C11451n.m621x(b, "*.", false, 2, null) || C11452o.m608M(b, '*', 1, false, 4, null) != -1 || str3.length() < b.length() || C8298k.m12937b("*.", b)) {
                    return false;
                }
                String substring = b.substring(1);
                C8298k.m12935d(substring, "(this as java.lang.String).substring(startIndex)");
                if (!C11451n.m634k(str3, substring, false, 2, null)) {
                    return false;
                }
                int length = str3.length() - substring.length();
                return length <= 0 || C11452o.m603R(str3, '.', length + (-1), false, 4, null) == -1;
            }
        }
        return false;
    }

    public final boolean m28214g(String str, X509Certificate x509Certificate) {
        String b = m28219b(str);
        List<String> c = m28218c(x509Certificate, 2);
        if ((c instanceof Collection) && c.isEmpty()) {
            return false;
        }
        for (String str2 : c) {
            if (f14427a.m28215f(b, str2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean m28213h(String str, X509Certificate x509Certificate) {
        String e = C9488a.m8545e(str);
        List<String> c = m28218c(x509Certificate, 7);
        if ((c instanceof Collection) && c.isEmpty()) {
            return false;
        }
        for (String str2 : c) {
            if (C8298k.m12937b(e, C9488a.m8545e(str2))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean verify(String str, SSLSession sSLSession) {
        Certificate certificate;
        C8298k.m12934e(str, "host");
        C8298k.m12934e(sSLSession, "session");
        if (m28217d(str)) {
            try {
                certificate = sSLSession.getPeerCertificates()[0];
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
            } catch (SSLException unused) {
                return false;
            }
        }
        return m28216e(str, (X509Certificate) certificate);
    }
}
