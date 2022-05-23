package gc;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import ra.k;

public final class b implements e {
    public final Map<X500Principal, Set<X509Certificate>> f12194a;

    public b(X509Certificate... x509CertificateArr) {
        k.e(x509CertificateArr, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            k.d(subjectX500Principal, "caCert.subjectX500Principal");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.f12194a = linkedHashMap;
    }

    @Override
    public X509Certificate a(X509Certificate x509Certificate) {
        boolean z10;
        k.e(x509Certificate, "cert");
        Set<X509Certificate> set = this.f12194a.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        Iterator<T> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                x509Certificate.verify(((X509Certificate) next).getPublicKey());
                z10 = true;
                continue;
            } catch (Exception unused) {
                z10 = false;
                continue;
            }
            if (z10) {
                obj = next;
                break;
            }
        }
        return (X509Certificate) obj;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof b) && k.b(((b) obj).f12194a, this.f12194a));
    }

    public int hashCode() {
        return this.f12194a.hashCode();
    }
}
