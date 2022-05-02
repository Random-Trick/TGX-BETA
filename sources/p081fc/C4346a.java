package p081fc;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLPeerUnverifiedException;
import qa.C8294g;
import qa.C8298k;

public final class C4346a extends AbstractC4349c {
    public static final C4347a f14423c = new C4347a(null);
    public final AbstractC4352e f14424b;

    public static final class C4347a {
        public C4347a() {
        }

        public C4347a(C8294g gVar) {
            this();
        }
    }

    public C4346a(AbstractC4352e eVar) {
        C8298k.m12933e(eVar, "trustRootIndex");
        this.f14424b = eVar;
    }

    @Override
    public List<Certificate> mo28224a(List<? extends Certificate> list, String str) {
        C8298k.m12933e(list, "chain");
        C8298k.m12933e(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        C8298k.m12934d(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate a = this.f14424b.mo28214a(x509Certificate);
            if (a != null) {
                if (arrayList.size() > 1 || (!C8298k.m12936b(x509Certificate, a))) {
                    arrayList.add(a);
                }
                if (m28225b(a, a)) {
                    return arrayList;
                }
                z = true;
            } else {
                Iterator it = arrayDeque.iterator();
                C8298k.m12934d(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    Objects.requireNonNull(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (m28225b(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final boolean m28225b(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!C8298k.m12936b(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C4346a) && C8298k.m12936b(((C4346a) obj).f14424b, this.f14424b);
    }

    public int hashCode() {
        return this.f14424b.hashCode();
    }
}
