package gc;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLPeerUnverifiedException;
import ra.g;
import ra.k;

public final class a extends c {
    public static final C0111a f12192c = new C0111a(null);
    public final e f12193b;

    public static final class C0111a {
        public C0111a() {
        }

        public C0111a(g gVar) {
            this();
        }
    }

    public a(e eVar) {
        k.e(eVar, "trustRootIndex");
        this.f12193b = eVar;
    }

    @Override
    public List<Certificate> a(List<? extends Certificate> list, String str) {
        k.e(list, "chain");
        k.e(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        k.d(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        boolean z10 = false;
        for (int i10 = 0; i10 < 9; i10++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate a10 = this.f12193b.a(x509Certificate);
            if (a10 != null) {
                if (arrayList.size() > 1 || (!k.b(x509Certificate, a10))) {
                    arrayList.add(a10);
                }
                if (b(a10, a10)) {
                    return arrayList;
                }
                z10 = true;
            } else {
                Iterator it = arrayDeque.iterator();
                k.d(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    Objects.requireNonNull(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (b(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z10) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final boolean b(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!k.b(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
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
        return (obj instanceof a) && k.b(((a) obj).f12193b, this.f12193b);
    }

    public int hashCode() {
        return this.f12193b.hashCode();
    }
}
