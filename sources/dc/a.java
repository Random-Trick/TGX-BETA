package dc;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import ec.b;
import ec.f;
import ec.i;
import ec.j;
import ec.k;
import gc.c;
import ja.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import ra.g;
import ub.a0;

public final class a extends h {
    public static final boolean f7301e;
    public static final C0084a f7302f = new C0084a(null);
    public final List<k> f7303d;

    public static final class C0084a {
        public C0084a() {
        }

        public C0084a(g gVar) {
            this();
        }

        public final h a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return a.f7301e;
        }
    }

    static {
        f7301e = h.f7333c.h() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        List i10 = n.i(ec.a.f11497a.a(), new j(f.f11506g.d()), new j(i.f11520b.a()), new j(ec.g.f11514b.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : i10) {
            if (((k) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.f7303d = arrayList;
    }

    @Override
    public c c(X509TrustManager x509TrustManager) {
        ra.k.e(x509TrustManager, "trustManager");
        b a10 = b.f11498d.a(x509TrustManager);
        return a10 != null ? a10 : super.c(x509TrustManager);
    }

    @Override
    public void e(SSLSocket sSLSocket, String str, List<? extends a0> list) {
        Object obj;
        ra.k.e(sSLSocket, "sslSocket");
        ra.k.e(list, "protocols");
        Iterator<T> it = this.f7303d.iterator();
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
    public String g(SSLSocket sSLSocket) {
        Object obj;
        ra.k.e(sSLSocket, "sslSocket");
        Iterator<T> it = this.f7303d.iterator();
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
    @SuppressLint({"NewApi"})
    public boolean i(String str) {
        ra.k.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
