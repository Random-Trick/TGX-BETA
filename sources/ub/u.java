package ub;

import ia.d;
import ia.e;
import ja.n;
import ja.o;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import ra.g;
import ra.k;
import ra.l;

public final class u {
    public static final a f23929e = new a(null);
    public final d f23930a;
    public final g0 f23931b;
    public final i f23932c;
    public final List<Certificate> f23933d;

    public static final class a {

        public static final class C0227a extends l implements qa.a<List<? extends Certificate>> {
            public final List f23934b;

            public C0227a(List list) {
                super(0);
                this.f23934b = list;
            }

            public final List<Certificate> b() {
                return this.f23934b;
            }
        }

        public a() {
        }

        public a(g gVar) {
            this();
        }

        public final u a(SSLSession sSLSession) {
            List<Certificate> list;
            k.e(sSLSession, "$this$handshake");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                int hashCode = cipherSuite.hashCode();
                if (hashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : hashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                    throw new IOException("cipherSuite == " + cipherSuite);
                }
                i b10 = i.f23869s1.b(cipherSuite);
                String protocol = sSLSession.getProtocol();
                if (protocol == null) {
                    throw new IllegalStateException("tlsVersion == null".toString());
                } else if (!k.b("NONE", protocol)) {
                    g0 a10 = g0.Q.a(protocol);
                    try {
                        list = b(sSLSession.getPeerCertificates());
                    } catch (SSLPeerUnverifiedException unused) {
                        list = n.f();
                    }
                    return new u(a10, b10, b(sSLSession.getLocalCertificates()), new C0227a(list));
                } else {
                    throw new IOException("tlsVersion == NONE");
                }
            } else {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
        }

        public final List<Certificate> b(Certificate[] certificateArr) {
            if (certificateArr != null) {
                return vb.b.t((Certificate[]) Arrays.copyOf(certificateArr, certificateArr.length));
            }
            return n.f();
        }
    }

    public static final class b extends l implements qa.a<List<? extends Certificate>> {
        public final qa.a f23935b;

        public b(qa.a aVar) {
            super(0);
            this.f23935b = aVar;
        }

        public final List<Certificate> b() {
            try {
                return (List) this.f23935b.b();
            } catch (SSLPeerUnverifiedException unused) {
                return n.f();
            }
        }
    }

    public u(g0 g0Var, i iVar, List<? extends Certificate> list, qa.a<? extends List<? extends Certificate>> aVar) {
        k.e(g0Var, "tlsVersion");
        k.e(iVar, "cipherSuite");
        k.e(list, "localCertificates");
        k.e(aVar, "peerCertificatesFn");
        this.f23931b = g0Var;
        this.f23932c = iVar;
        this.f23933d = list;
        this.f23930a = e.a(new b(aVar));
    }

    public final i a() {
        return this.f23932c;
    }

    public final String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        k.d(type, "type");
        return type;
    }

    public final List<Certificate> c() {
        return this.f23933d;
    }

    public final List<Certificate> d() {
        return (List) this.f23930a.getValue();
    }

    public final g0 e() {
        return this.f23931b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (uVar.f23931b == this.f23931b && k.b(uVar.f23932c, this.f23932c) && k.b(uVar.d(), d()) && k.b(uVar.f23933d, this.f23933d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f23931b.hashCode()) * 31) + this.f23932c.hashCode()) * 31) + d().hashCode()) * 31) + this.f23933d.hashCode();
    }

    public String toString() {
        List<Certificate> d10 = d();
        ArrayList arrayList = new ArrayList(o.o(d10, 10));
        for (Certificate certificate : d10) {
            arrayList.add(b(certificate));
        }
        String obj = arrayList.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Handshake{");
        sb2.append("tlsVersion=");
        sb2.append(this.f23931b);
        sb2.append(' ');
        sb2.append("cipherSuite=");
        sb2.append(this.f23932c);
        sb2.append(' ');
        sb2.append("peerCertificates=");
        sb2.append(obj);
        sb2.append(' ');
        sb2.append("localCertificates=");
        List<Certificate> list = this.f23933d;
        ArrayList arrayList2 = new ArrayList(o.o(list, 10));
        for (Certificate certificate2 : list) {
            arrayList2.add(b(certificate2));
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
