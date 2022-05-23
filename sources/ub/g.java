package ub;

import ab.n;
import ab.o;
import hc.h;
import ja.v;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import ra.k;
import ra.l;
import ra.w;

public final class g {
    public final Set<c> f23801a;
    public final gc.c f23802b;
    public static final b f23800d = new b(null);
    public static final g f23799c = new a().a();

    public static final class a {
        public final List<c> f23803a = new ArrayList();

        public final g a() {
            return new g(v.X(this.f23803a), null, 2, null);
        }
    }

    public static final class b {
        public b() {
        }

        public b(ra.g gVar) {
            this();
        }

        public final String a(Certificate certificate) {
            k.e(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return "sha256/" + c((X509Certificate) certificate).a();
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        public final h b(X509Certificate x509Certificate) {
            k.e(x509Certificate, "$this$sha1Hash");
            h.a aVar = h.N;
            PublicKey publicKey = x509Certificate.getPublicKey();
            k.d(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            k.d(encoded, "publicKey.encoded");
            return h.a.e(aVar, encoded, 0, 0, 3, null).p();
        }

        public final h c(X509Certificate x509Certificate) {
            k.e(x509Certificate, "$this$sha256Hash");
            h.a aVar = h.N;
            PublicKey publicKey = x509Certificate.getPublicKey();
            k.d(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            k.d(encoded, "publicKey.encoded");
            return h.a.e(aVar, encoded, 0, 0, 3, null).q();
        }
    }

    public static final class c {
        public final String f23804a;
        public final String f23805b;
        public final h f23806c;

        public final h a() {
            return this.f23806c;
        }

        public final String b() {
            return this.f23805b;
        }

        public final boolean c(String str) {
            boolean n10;
            boolean n11;
            k.e(str, "hostname");
            if (n.x(this.f23804a, "**.", false, 2, null)) {
                int length = this.f23804a.length() - 3;
                int length2 = str.length() - length;
                n11 = n.n(str, str.length() - length, this.f23804a, 3, length, (r12 & 16) != 0 ? false : false);
                if (!n11) {
                    return false;
                }
                if (length2 != 0 && str.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else if (!n.x(this.f23804a, "*.", false, 2, null)) {
                return k.b(str, this.f23804a);
            } else {
                int length3 = this.f23804a.length() - 1;
                int length4 = str.length() - length3;
                n10 = n.n(str, str.length() - length3, this.f23804a, 1, length3, (r12 & 16) != 0 ? false : false);
                if (!n10 || o.R(str, '.', length4 - 1, false, 4, null) != -1) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return !(k.b(this.f23804a, cVar.f23804a) ^ true) && !(k.b(this.f23805b, cVar.f23805b) ^ true) && !(k.b(this.f23806c, cVar.f23806c) ^ true);
        }

        public int hashCode() {
            return (((this.f23804a.hashCode() * 31) + this.f23805b.hashCode()) * 31) + this.f23806c.hashCode();
        }

        public String toString() {
            return this.f23805b + '/' + this.f23806c.a();
        }
    }

    public static final class d extends l implements qa.a<List<? extends X509Certificate>> {
        public final String M;
        public final List f23808c;

        public d(List list, String str) {
            super(0);
            this.f23808c = list;
            this.M = str;
        }

        public final List<X509Certificate> b() {
            List<Certificate> list;
            gc.c d10 = g.this.d();
            if (d10 == null || (list = d10.a(this.f23808c, this.M)) == null) {
                list = this.f23808c;
            }
            ArrayList arrayList = new ArrayList(ja.o.o(list, 10));
            for (Certificate certificate : list) {
                Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public g(Set<c> set, gc.c cVar) {
        k.e(set, "pins");
        this.f23801a = set;
        this.f23802b = cVar;
    }

    public final void a(String str, List<? extends Certificate> list) {
        k.e(str, "hostname");
        k.e(list, "peerCertificates");
        b(str, new d(list, str));
    }

    public final void b(String str, qa.a<? extends List<? extends X509Certificate>> aVar) {
        k.e(str, "hostname");
        k.e(aVar, "cleanedPeerCertificatesFn");
        List<c> c10 = c(str);
        if (!c10.isEmpty()) {
            List<? extends X509Certificate> b10 = aVar.b();
            for (X509Certificate x509Certificate : b10) {
                h hVar = null;
                h hVar2 = null;
                for (c cVar : c10) {
                    String b11 = cVar.b();
                    int hashCode = b11.hashCode();
                    if (hashCode != -903629273) {
                        if (hashCode == 3528965 && b11.equals("sha1")) {
                            if (hVar2 == null) {
                                hVar2 = f23800d.b(x509Certificate);
                            }
                            if (k.b(cVar.a(), hVar2)) {
                                return;
                            }
                        }
                        throw new AssertionError("unsupported hashAlgorithm: " + cVar.b());
                    } else if (b11.equals("sha256")) {
                        if (hVar == null) {
                            hVar = f23800d.c(x509Certificate);
                        }
                        if (k.b(cVar.a(), hVar)) {
                            return;
                        }
                    } else {
                        throw new AssertionError("unsupported hashAlgorithm: " + cVar.b());
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Certificate pinning failure!");
            sb2.append("\n  Peer certificate chain:");
            for (X509Certificate x509Certificate2 : b10) {
                sb2.append("\n    ");
                sb2.append(f23800d.a(x509Certificate2));
                sb2.append(": ");
                Principal subjectDN = x509Certificate2.getSubjectDN();
                k.d(subjectDN, "element.subjectDN");
                sb2.append(subjectDN.getName());
            }
            sb2.append("\n  Pinned certificates for ");
            sb2.append(str);
            sb2.append(":");
            for (c cVar2 : c10) {
                sb2.append("\n    ");
                sb2.append(cVar2);
            }
            String sb3 = sb2.toString();
            k.d(sb3, "StringBuilder().apply(builderAction).toString()");
            throw new SSLPeerUnverifiedException(sb3);
        }
    }

    public final List<c> c(String str) {
        k.e(str, "hostname");
        Set<c> set = this.f23801a;
        List<c> f10 = ja.n.f();
        for (Object obj : set) {
            if (((c) obj).c(str)) {
                if (f10.isEmpty()) {
                    f10 = new ArrayList<>();
                }
                w.c(f10).add(obj);
            }
        }
        return f10;
    }

    public final gc.c d() {
        return this.f23802b;
    }

    public final g e(gc.c cVar) {
        k.e(cVar, "certificateChainCleaner");
        return k.b(this.f23802b, cVar) ? this : new g(this.f23801a, cVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (k.b(gVar.f23801a, this.f23801a) && k.b(gVar.f23802b, this.f23802b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (1517 + this.f23801a.hashCode()) * 41;
        gc.c cVar = this.f23802b;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public g(Set set, gc.c cVar, int i10, ra.g gVar) {
        this(set, (i10 & 2) != 0 ? null : cVar);
    }
}
