package p081fc;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import qa.C8298k;

public final class C4348b implements AbstractC4352e {
    public final Map<X500Principal, Set<X509Certificate>> f14425a;

    public C4348b(X509Certificate... x509CertificateArr) {
        C8298k.m12934e(x509CertificateArr, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            C8298k.m12935d(subjectX500Principal, "caCert.subjectX500Principal");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.f14425a = linkedHashMap;
    }

    @Override
    public X509Certificate mo28212a(X509Certificate x509Certificate) {
        boolean z;
        C8298k.m12934e(x509Certificate, "cert");
        Set<X509Certificate> set = this.f14425a.get(x509Certificate.getIssuerX500Principal());
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
                z = true;
                continue;
            } catch (Exception unused) {
                z = false;
                continue;
            }
            if (z) {
                obj = next;
                break;
            }
        }
        return (X509Certificate) obj;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C4348b) && C8298k.m12937b(((C4348b) obj).f14425a, this.f14425a));
    }

    public int hashCode() {
        return this.f14425a.hashCode();
    }
}
