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

    public final List<String> m28222a(X509Certificate x509Certificate) {
        C8298k.m12933e(x509Certificate, "certificate");
        return C5312v.m23339J(m28220c(x509Certificate, 7), m28220c(x509Certificate, 2));
    }

    public final String m28221b(String str) {
        if (!m28219d(str)) {
            return str;
        }
        Locale locale = Locale.US;
        C8298k.m12934d(locale, "Locale.US");
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = str.toLowerCase(locale);
        C8298k.m12934d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    public final List<String> m28220c(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return C5304n.m23367f();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && !(!C8298k.m12936b(list.get(0), Integer.valueOf(i))) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return C5304n.m23367f();
        }
    }

    public final boolean m28219d(String str) {
        return str.length() == ((int) C4543c0.m27471b(str, 0, 0, 3, null));
    }

    public final boolean m28218e(String str, X509Certificate x509Certificate) {
        C8298k.m12933e(str, "host");
        C8298k.m12933e(x509Certificate, "certificate");
        return C9489b.m8518f(str) ? m28215h(str, x509Certificate) : m28216g(str, x509Certificate);
    }

    public final boolean m28217f(String str, String str2) {
        if (!(str == null || str.length() == 0) && !C11451n.m621x(str, ".", false, 2, null) && !C11451n.m634k(str, "..", false, 2, null)) {
            if (!(str2 == null || str2.length() == 0) && !C11451n.m621x(str2, ".", false, 2, null) && !C11451n.m634k(str2, "..", false, 2, null)) {
                if (!C11451n.m634k(str, ".", false, 2, null)) {
                    str = str + ".";
                }
                String str3 = str;
                if (!C11451n.m634k(str2, ".", false, 2, null)) {
                    str2 = str2 + ".";
                }
                String b = m28221b(str2);
                if (!C11452o.m618C(b, "*", false, 2, null)) {
                    return C8298k.m12936b(str3, b);
                }
                if (!C11451n.m621x(b, "*.", false, 2, null) || C11452o.m608M(b, '*', 1, false, 4, null) != -1 || str3.length() < b.length() || C8298k.m12936b("*.", b)) {
                    return false;
                }
                String substring = b.substring(1);
                C8298k.m12934d(substring, "(this as java.lang.String).substring(startIndex)");
                if (!C11451n.m634k(str3, substring, false, 2, null)) {
                    return false;
                }
                int length = str3.length() - substring.length();
                return length <= 0 || C11452o.m603R(str3, '.', length + (-1), false, 4, null) == -1;
            }
        }
        return false;
    }

    public final boolean m28216g(String str, X509Certificate x509Certificate) {
        String b = m28221b(str);
        List<String> c = m28220c(x509Certificate, 2);
        if ((c instanceof Collection) && c.isEmpty()) {
            return false;
        }
        for (String str2 : c) {
            if (f14427a.m28217f(b, str2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean m28215h(String str, X509Certificate x509Certificate) {
        String e = C9488a.m8545e(str);
        List<String> c = m28220c(x509Certificate, 7);
        if ((c instanceof Collection) && c.isEmpty()) {
            return false;
        }
        for (String str2 : c) {
            if (C8298k.m12936b(e, C9488a.m8545e(str2))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean verify(String str, SSLSession sSLSession) {
        Certificate certificate;
        C8298k.m12933e(str, "host");
        C8298k.m12933e(sSLSession, "session");
        if (m28219d(str)) {
            try {
                certificate = sSLSession.getPeerCertificates()[0];
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
            } catch (SSLException unused) {
                return false;
            }
        }
        return m28218e(str, (X509Certificate) certificate);
    }
}
