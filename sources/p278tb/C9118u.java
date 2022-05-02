package p278tb;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p107ha.AbstractC5044d;
import p107ha.C5045e;
import p123ia.C5304n;
import p123ia.C5305o;
import p290ub.C9489b;
import pa.AbstractC8077a;
import qa.AbstractC8299l;
import qa.C8294g;
import qa.C8298k;

public final class C9118u {
    public static final C9119a f29325e = new C9119a(null);
    public final AbstractC5044d f29326a;
    public final EnumC9091g0 f29327b;
    public final C9094i f29328c;
    public final List<Certificate> f29329d;

    public static final class C9119a {

        public static final class C9120a extends AbstractC8299l implements AbstractC8077a<List<? extends Certificate>> {
            public final List f29330b;

            public C9120a(List list) {
                super(0);
                this.f29330b = list;
            }

            public final List<Certificate> mo4925b() {
                return this.f29330b;
            }
        }

        public C9119a() {
        }

        public final C9118u m10377a(SSLSession sSLSession) {
            List<Certificate> list;
            C8298k.m12934e(sSLSession, "$this$handshake");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                int hashCode = cipherSuite.hashCode();
                if (hashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : hashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                    throw new IOException("cipherSuite == " + cipherSuite);
                }
                C9094i b = C9094i.f29265s1.m10458b(cipherSuite);
                String protocol = sSLSession.getProtocol();
                if (protocol == null) {
                    throw new IllegalStateException("tlsVersion == null".toString());
                } else if (!C8298k.m12937b("NONE", protocol)) {
                    EnumC9091g0 a = EnumC9091g0.f29152Q.m10467a(protocol);
                    try {
                        list = m10376b(sSLSession.getPeerCertificates());
                    } catch (SSLPeerUnverifiedException unused) {
                        list = C5304n.m23366f();
                    }
                    return new C9118u(a, b, m10376b(sSLSession.getLocalCertificates()), new C9120a(list));
                } else {
                    throw new IOException("tlsVersion == NONE");
                }
            } else {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
        }

        public final List<Certificate> m10376b(Certificate[] certificateArr) {
            if (certificateArr != null) {
                return C9489b.m8504t((Certificate[]) Arrays.copyOf(certificateArr, certificateArr.length));
            }
            return C5304n.m23366f();
        }

        public C9119a(C8294g gVar) {
            this();
        }
    }

    public static final class C9121b extends AbstractC8299l implements AbstractC8077a<List<? extends Certificate>> {
        public final AbstractC8077a f29331b;

        public C9121b(AbstractC8077a aVar) {
            super(0);
            this.f29331b = aVar;
        }

        public final List<Certificate> mo4925b() {
            try {
                return (List) this.f29331b.mo4925b();
            } catch (SSLPeerUnverifiedException unused) {
                return C5304n.m23366f();
            }
        }
    }

    public C9118u(EnumC9091g0 g0Var, C9094i iVar, List<? extends Certificate> list, AbstractC8077a<? extends List<? extends Certificate>> aVar) {
        C8298k.m12934e(g0Var, "tlsVersion");
        C8298k.m12934e(iVar, "cipherSuite");
        C8298k.m12934e(list, "localCertificates");
        C8298k.m12934e(aVar, "peerCertificatesFn");
        this.f29327b = g0Var;
        this.f29328c = iVar;
        this.f29329d = list;
        this.f29326a = C5045e.m24197a(new C9121b(aVar));
    }

    public final C9094i m10382a() {
        return this.f29328c;
    }

    public final String m10381b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        C8298k.m12935d(type, "type");
        return type;
    }

    public final List<Certificate> m10380c() {
        return this.f29329d;
    }

    public final List<Certificate> m10379d() {
        return (List) this.f29326a.getValue();
    }

    public final EnumC9091g0 m10378e() {
        return this.f29327b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9118u) {
            C9118u uVar = (C9118u) obj;
            if (uVar.f29327b == this.f29327b && C8298k.m12937b(uVar.f29328c, this.f29328c) && C8298k.m12937b(uVar.m10379d(), m10379d()) && C8298k.m12937b(uVar.f29329d, this.f29329d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f29327b.hashCode()) * 31) + this.f29328c.hashCode()) * 31) + m10379d().hashCode()) * 31) + this.f29329d.hashCode();
    }

    public String toString() {
        List<Certificate> d = m10379d();
        ArrayList arrayList = new ArrayList(C5305o.m23357o(d, 10));
        for (Certificate certificate : d) {
            arrayList.add(m10381b(certificate));
        }
        String obj = arrayList.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Handshake{");
        sb2.append("tlsVersion=");
        sb2.append(this.f29327b);
        sb2.append(' ');
        sb2.append("cipherSuite=");
        sb2.append(this.f29328c);
        sb2.append(' ');
        sb2.append("peerCertificates=");
        sb2.append(obj);
        sb2.append(' ');
        sb2.append("localCertificates=");
        List<Certificate> list = this.f29329d;
        ArrayList arrayList2 = new ArrayList(C5305o.m23357o(list, 10));
        for (Certificate certificate2 : list) {
            arrayList2.add(m10381b(certificate2));
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
