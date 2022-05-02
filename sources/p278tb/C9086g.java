package p278tb;

import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import p081fc.AbstractC4349c;
import p095gc.C4552h;
import p123ia.C5304n;
import p123ia.C5305o;
import p123ia.C5312v;
import pa.AbstractC8077a;
import qa.AbstractC8299l;
import qa.C8294g;
import qa.C8298k;
import qa.C8310w;
import za.C11451n;
import za.C11452o;

public final class C9086g {
    public final Set<C9089c> f29142a;
    public final AbstractC4349c f29143b;
    public static final C9088b f29141d = new C9088b(null);
    public static final C9086g f29140c = new C9087a().m10475a();

    public static final class C9087a {
        public final List<C9089c> f29144a = new ArrayList();

        public final C9086g m10475a() {
            return new C9086g(C5312v.m23325X(this.f29144a), null, 2, null);
        }
    }

    public static final class C9088b {
        public C9088b() {
        }

        public final String m10474a(Certificate certificate) {
            C8298k.m12933e(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return "sha256/" + m10472c((X509Certificate) certificate).mo27317a();
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        public final C4552h m10473b(X509Certificate x509Certificate) {
            C8298k.m12933e(x509Certificate, "$this$sha1Hash");
            C4552h.C4553a aVar = C4552h.f14973N;
            PublicKey publicKey = x509Certificate.getPublicKey();
            C8298k.m12934d(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            C8298k.m12934d(encoded, "publicKey.encoded");
            return C4552h.C4553a.m27399e(aVar, encoded, 0, 0, 3, null).m27408p();
        }

        public final C4552h m10472c(X509Certificate x509Certificate) {
            C8298k.m12933e(x509Certificate, "$this$sha256Hash");
            C4552h.C4553a aVar = C4552h.f14973N;
            PublicKey publicKey = x509Certificate.getPublicKey();
            C8298k.m12934d(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            C8298k.m12934d(encoded, "publicKey.encoded");
            return C4552h.C4553a.m27399e(aVar, encoded, 0, 0, 3, null).m27407q();
        }

        public C9088b(C8294g gVar) {
            this();
        }
    }

    public static final class C9089c {
        public final String f29145a;
        public final String f29146b;
        public final C4552h f29147c;

        public final C4552h m10471a() {
            return this.f29147c;
        }

        public final String m10470b() {
            return this.f29146b;
        }

        public final boolean m10469c(String str) {
            boolean n;
            boolean n2;
            C8298k.m12933e(str, "hostname");
            if (C11451n.m621x(this.f29145a, "**.", false, 2, null)) {
                int length = this.f29145a.length() - 3;
                int length2 = str.length() - length;
                n2 = C11451n.m631n(str, str.length() - length, this.f29145a, 3, length, (r12 & 16) != 0 ? false : false);
                if (!n2) {
                    return false;
                }
                if (length2 != 0 && str.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else if (!C11451n.m621x(this.f29145a, "*.", false, 2, null)) {
                return C8298k.m12936b(str, this.f29145a);
            } else {
                int length3 = this.f29145a.length() - 1;
                int length4 = str.length() - length3;
                n = C11451n.m631n(str, str.length() - length3, this.f29145a, 1, length3, (r12 & 16) != 0 ? false : false);
                if (!n || C11452o.m603R(str, '.', length4 - 1, false, 4, null) != -1) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9089c)) {
                return false;
            }
            C9089c cVar = (C9089c) obj;
            return !(C8298k.m12936b(this.f29145a, cVar.f29145a) ^ true) && !(C8298k.m12936b(this.f29146b, cVar.f29146b) ^ true) && !(C8298k.m12936b(this.f29147c, cVar.f29147c) ^ true);
        }

        public int hashCode() {
            return (((this.f29145a.hashCode() * 31) + this.f29146b.hashCode()) * 31) + this.f29147c.hashCode();
        }

        public String toString() {
            return this.f29146b + '/' + this.f29147c.mo27317a();
        }
    }

    public static final class C9090d extends AbstractC8299l implements AbstractC8077a<List<? extends X509Certificate>> {
        public final String f29148M;
        public final List f29150c;

        public C9090d(List list, String str) {
            super(0);
            this.f29150c = list;
            this.f29148M = str;
        }

        public final List<X509Certificate> mo4925b() {
            List<Certificate> list;
            AbstractC4349c d = C9086g.this.m10477d();
            if (d == null || (list = d.mo28224a(this.f29150c, this.f29148M)) == null) {
                list = this.f29150c;
            }
            ArrayList arrayList = new ArrayList(C5305o.m23358o(list, 10));
            for (Certificate certificate : list) {
                Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public C9086g(Set<C9089c> set, AbstractC4349c cVar) {
        C8298k.m12933e(set, "pins");
        this.f29142a = set;
        this.f29143b = cVar;
    }

    public final void m10480a(String str, List<? extends Certificate> list) {
        C8298k.m12933e(str, "hostname");
        C8298k.m12933e(list, "peerCertificates");
        m10479b(str, new C9090d(list, str));
    }

    public final void m10479b(String str, AbstractC8077a<? extends List<? extends X509Certificate>> aVar) {
        C8298k.m12933e(str, "hostname");
        C8298k.m12933e(aVar, "cleanedPeerCertificatesFn");
        List<C9089c> c = m10478c(str);
        if (!c.isEmpty()) {
            List<? extends X509Certificate> b = aVar.mo4925b();
            for (X509Certificate x509Certificate : b) {
                C4552h hVar = null;
                C4552h hVar2 = null;
                for (C9089c cVar : c) {
                    String b2 = cVar.m10470b();
                    int hashCode = b2.hashCode();
                    if (hashCode != -903629273) {
                        if (hashCode == 3528965 && b2.equals("sha1")) {
                            if (hVar2 == null) {
                                hVar2 = f29141d.m10473b(x509Certificate);
                            }
                            if (C8298k.m12936b(cVar.m10471a(), hVar2)) {
                                return;
                            }
                        }
                        throw new AssertionError("unsupported hashAlgorithm: " + cVar.m10470b());
                    } else if (b2.equals("sha256")) {
                        if (hVar == null) {
                            hVar = f29141d.m10472c(x509Certificate);
                        }
                        if (C8298k.m12936b(cVar.m10471a(), hVar)) {
                            return;
                        }
                    } else {
                        throw new AssertionError("unsupported hashAlgorithm: " + cVar.m10470b());
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Certificate pinning failure!");
            sb2.append("\n  Peer certificate chain:");
            for (X509Certificate x509Certificate2 : b) {
                sb2.append("\n    ");
                sb2.append(f29141d.m10474a(x509Certificate2));
                sb2.append(": ");
                Principal subjectDN = x509Certificate2.getSubjectDN();
                C8298k.m12934d(subjectDN, "element.subjectDN");
                sb2.append(subjectDN.getName());
            }
            sb2.append("\n  Pinned certificates for ");
            sb2.append(str);
            sb2.append(":");
            for (C9089c cVar2 : c) {
                sb2.append("\n    ");
                sb2.append(cVar2);
            }
            String sb3 = sb2.toString();
            C8298k.m12934d(sb3, "StringBuilder().apply(builderAction).toString()");
            throw new SSLPeerUnverifiedException(sb3);
        }
    }

    public final List<C9089c> m10478c(String str) {
        C8298k.m12933e(str, "hostname");
        Set<C9089c> set = this.f29142a;
        List<C9089c> f = C5304n.m23367f();
        for (Object obj : set) {
            if (((C9089c) obj).m10469c(str)) {
                if (f.isEmpty()) {
                    f = new ArrayList<>();
                }
                C8310w.m12909a(f).add(obj);
            }
        }
        return f;
    }

    public final AbstractC4349c m10477d() {
        return this.f29143b;
    }

    public final C9086g m10476e(AbstractC4349c cVar) {
        C8298k.m12933e(cVar, "certificateChainCleaner");
        return C8298k.m12936b(this.f29143b, cVar) ? this : new C9086g(this.f29142a, cVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9086g) {
            C9086g gVar = (C9086g) obj;
            if (C8298k.m12936b(gVar.f29142a, this.f29142a) && C8298k.m12936b(gVar.f29143b, this.f29143b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (1517 + this.f29142a.hashCode()) * 41;
        AbstractC4349c cVar = this.f29143b;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public C9086g(Set set, AbstractC4349c cVar, int i, C8294g gVar) {
        this(set, (i & 2) != 0 ? null : cVar);
    }
}
