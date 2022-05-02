package cc;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p052dc.AbstractC3989k;
import p052dc.C3969a;
import p052dc.C3971b;
import p052dc.C3976f;
import p052dc.C3979g;
import p052dc.C3984i;
import p052dc.C3987j;
import p081fc.AbstractC4349c;
import p123ia.C5304n;
import p278tb.EnumC9064a0;
import qa.C8294g;
import qa.C8298k;

public final class C2066a extends C2083h {
    public static final boolean f7294e;
    public static final C2067a f7295f = new C2067a(null);
    public final List<AbstractC3989k> f7296d;

    public static final class C2067a {
        public C2067a() {
        }

        public final C2083h m35716a() {
            if (m35715b()) {
                return new C2066a();
            }
            return null;
        }

        public final boolean m35715b() {
            return C2066a.f7294e;
        }

        public C2067a(C8294g gVar) {
            this();
        }
    }

    static {
        f7294e = C2083h.f7326c.m35673h() && Build.VERSION.SDK_INT >= 29;
    }

    public C2066a() {
        List i = C5304n.m23363i(C3969a.f13340a.m29443a(), new C3987j(C3976f.f13349g.m29430d()), new C3987j(C3984i.f13363b.m29423a()), new C3987j(C3979g.f13357b.m29428a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : i) {
            if (((AbstractC3989k) obj).mo29418b()) {
                arrayList.add(obj);
            }
        }
        this.f7296d = arrayList;
    }

    @Override
    public AbstractC4349c mo35693c(X509TrustManager x509TrustManager) {
        C8298k.m12934e(x509TrustManager, "trustManager");
        C3971b a = C3971b.f13341d.m29441a(x509TrustManager);
        return a != null ? a : super.mo35693c(x509TrustManager);
    }

    @Override
    public void mo35691e(SSLSocket sSLSocket, String str, List<? extends EnumC9064a0> list) {
        Object obj;
        C8298k.m12934e(sSLSocket, "sslSocket");
        C8298k.m12934e(list, "protocols");
        Iterator<T> it = this.f7296d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AbstractC3989k) obj).mo29419a(sSLSocket)) {
                break;
            }
        }
        AbstractC3989k kVar = (AbstractC3989k) obj;
        if (kVar != null) {
            kVar.mo29416d(sSLSocket, str, list);
        }
    }

    @Override
    public String mo35689g(SSLSocket sSLSocket) {
        Object obj;
        C8298k.m12934e(sSLSocket, "sslSocket");
        Iterator<T> it = this.f7296d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AbstractC3989k) obj).mo29419a(sSLSocket)) {
                break;
            }
        }
        AbstractC3989k kVar = (AbstractC3989k) obj;
        if (kVar != null) {
            return kVar.mo29417c(sSLSocket);
        }
        return null;
    }

    @Override
    @SuppressLint({"NewApi"})
    public boolean mo35687i(String str) {
        C8298k.m12934e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
