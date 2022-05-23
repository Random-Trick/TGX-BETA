package dc;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import ec.f;
import ec.h;
import ec.i;
import ec.j;
import ec.k;
import ec.l;
import gc.c;
import gc.e;
import ja.n;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import ra.g;
import ub.a0;

public final class b extends h {
    public static final boolean f7304f;
    public static final a f7305g = new a(null);
    public final List<k> f7306d;
    public final h f7307e;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }

        public final h a() {
            if (b()) {
                return new b();
            }
            return null;
        }

        public final boolean b() {
            return b.f7304f;
        }
    }

    public static final class C0085b implements e {
        public final X509TrustManager f7308a;
        public final Method f7309b;

        public C0085b(X509TrustManager x509TrustManager, Method method) {
            ra.k.e(x509TrustManager, "trustManager");
            ra.k.e(method, "findByIssuerAndSignatureMethod");
            this.f7308a = x509TrustManager;
            this.f7309b = method;
        }

        @Override
        public X509Certificate a(X509Certificate x509Certificate) {
            ra.k.e(x509Certificate, "cert");
            try {
                Object invoke = this.f7309b.invoke(this.f7308a, x509Certificate);
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0085b)) {
                return false;
            }
            C0085b bVar = (C0085b) obj;
            return ra.k.b(this.f7308a, bVar.f7308a) && ra.k.b(this.f7309b, bVar.f7309b);
        }

        public int hashCode() {
            X509TrustManager x509TrustManager = this.f7308a;
            int i10 = 0;
            int hashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.f7309b;
            if (method != null) {
                i10 = method.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f7308a + ", findByIssuerAndSignatureMethod=" + this.f7309b + ")";
        }
    }

    static {
        boolean z10 = false;
        if (h.f7333c.h() && Build.VERSION.SDK_INT < 30) {
            z10 = true;
        }
        f7304f = z10;
    }

    public b() {
        List i10 = n.i(l.a.b(l.f11523j, null, 1, null), new j(f.f11506g.d()), new j(i.f11520b.a()), new j(ec.g.f11514b.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : i10) {
            if (((k) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.f7306d = arrayList;
        this.f7307e = h.f11515d.a();
    }

    @Override
    public c c(X509TrustManager x509TrustManager) {
        ra.k.e(x509TrustManager, "trustManager");
        ec.b a10 = ec.b.f11498d.a(x509TrustManager);
        return a10 != null ? a10 : super.c(x509TrustManager);
    }

    @Override
    public e d(X509TrustManager x509TrustManager) {
        ra.k.e(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            ra.k.d(declaredMethod, "method");
            declaredMethod.setAccessible(true);
            return new C0085b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(x509TrustManager);
        }
    }

    @Override
    public void e(SSLSocket sSLSocket, String str, List<a0> list) {
        Object obj;
        ra.k.e(sSLSocket, "sslSocket");
        ra.k.e(list, "protocols");
        Iterator<T> it = this.f7306d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((k) obj).a(sSLSocket)) {
                break;
            }
        }
        k kVar = (k) obj;
        if (kVar != null) {
            kVar.d(sSLSocket, str, list);
        }
    }

    @Override
    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i10) {
        ra.k.e(socket, "socket");
        ra.k.e(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e10);
            }
            throw e10;
        }
    }

    @Override
    public String g(SSLSocket sSLSocket) {
        Object obj;
        ra.k.e(sSLSocket, "sslSocket");
        Iterator<T> it = this.f7306d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((k) obj).a(sSLSocket)) {
                break;
            }
        }
        k kVar = (k) obj;
        if (kVar != null) {
            return kVar.c(sSLSocket);
        }
        return null;
    }

    @Override
    public Object h(String str) {
        ra.k.e(str, "closer");
        return this.f7307e.a(str);
    }

    @Override
    public boolean i(String str) {
        ra.k.e(str, "hostname");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
        if (i10 < 23) {
            return true;
        }
        NetworkSecurityPolicy networkSecurityPolicy = NetworkSecurityPolicy.getInstance();
        ra.k.d(networkSecurityPolicy, "NetworkSecurityPolicy.getInstance()");
        return networkSecurityPolicy.isCleartextTrafficPermitted();
    }

    @Override
    public void l(String str, Object obj) {
        ra.k.e(str, "message");
        if (!this.f7307e.b(obj)) {
            h.k(this, str, 5, null, 4, null);
        }
    }
}
