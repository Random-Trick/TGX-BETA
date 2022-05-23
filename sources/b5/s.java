package b5;

import android.content.Context;
import android.net.Uri;
import b5.k;
import b5.t;
import c5.l0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class s implements k {
    public final Context f3960a;
    public final List<i0> f3961b = new ArrayList();
    public final k f3962c;
    public k f3963d;
    public k f3964e;
    public k f3965f;
    public k f3966g;
    public k f3967h;
    public k f3968i;
    public k f3969j;
    public k f3970k;

    public static final class a implements k.a {
        public final Context f3971a;
        public final k.a f3972b;
        public i0 f3973c;

        public a(Context context) {
            this(context, new t.b());
        }

        public s a() {
            s sVar = new s(this.f3971a, this.f3972b.a());
            i0 i0Var = this.f3973c;
            if (i0Var != null) {
                sVar.i(i0Var);
            }
            return sVar;
        }

        public a(Context context, k.a aVar) {
            this.f3971a = context.getApplicationContext();
            this.f3972b = aVar;
        }
    }

    public s(Context context, k kVar) {
        this.f3960a = context.getApplicationContext();
        this.f3962c = (k) c5.a.e(kVar);
    }

    public final void A(k kVar, i0 i0Var) {
        if (kVar != null) {
            kVar.i(i0Var);
        }
    }

    @Override
    public int b(byte[] bArr, int i10, int i11) {
        return ((k) c5.a.e(this.f3970k)).b(bArr, i10, i11);
    }

    @Override
    public void close() {
        k kVar = this.f3970k;
        if (kVar != null) {
            try {
                kVar.close();
            } finally {
                this.f3970k = null;
            }
        }
    }

    @Override
    public long d(o oVar) {
        c5.a.f(this.f3970k == null);
        String scheme = oVar.f3904a.getScheme();
        if (l0.l0(oVar.f3904a)) {
            String path = oVar.f3904a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f3970k = w();
            } else {
                this.f3970k = t();
            }
        } else if ("asset".equals(scheme)) {
            this.f3970k = t();
        } else if ("content".equals(scheme)) {
            this.f3970k = u();
        } else if ("rtmp".equals(scheme)) {
            this.f3970k = y();
        } else if ("udp".equals(scheme)) {
            this.f3970k = z();
        } else if ("data".equals(scheme)) {
            this.f3970k = v();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f3970k = x();
        } else {
            this.f3970k = this.f3962c;
        }
        return this.f3970k.d(oVar);
    }

    @Override
    public void i(i0 i0Var) {
        c5.a.e(i0Var);
        this.f3962c.i(i0Var);
        this.f3961b.add(i0Var);
        A(this.f3963d, i0Var);
        A(this.f3964e, i0Var);
        A(this.f3965f, i0Var);
        A(this.f3966g, i0Var);
        A(this.f3967h, i0Var);
        A(this.f3968i, i0Var);
        A(this.f3969j, i0Var);
    }

    @Override
    public Map<String, List<String>> l() {
        k kVar = this.f3970k;
        return kVar == null ? Collections.emptyMap() : kVar.l();
    }

    @Override
    public Uri p() {
        k kVar = this.f3970k;
        if (kVar == null) {
            return null;
        }
        return kVar.p();
    }

    public final void s(k kVar) {
        for (int i10 = 0; i10 < this.f3961b.size(); i10++) {
            kVar.i(this.f3961b.get(i10));
        }
    }

    public final k t() {
        if (this.f3964e == null) {
            c cVar = new c(this.f3960a);
            this.f3964e = cVar;
            s(cVar);
        }
        return this.f3964e;
    }

    public final k u() {
        if (this.f3965f == null) {
            g gVar = new g(this.f3960a);
            this.f3965f = gVar;
            s(gVar);
        }
        return this.f3965f;
    }

    public final k v() {
        if (this.f3968i == null) {
            i iVar = new i();
            this.f3968i = iVar;
            s(iVar);
        }
        return this.f3968i;
    }

    public final k w() {
        if (this.f3963d == null) {
            x xVar = new x();
            this.f3963d = xVar;
            s(xVar);
        }
        return this.f3963d;
    }

    public final k x() {
        if (this.f3969j == null) {
            d0 d0Var = new d0(this.f3960a);
            this.f3969j = d0Var;
            s(d0Var);
        }
        return this.f3969j;
    }

    public final k y() {
        if (this.f3966g == null) {
            try {
                k kVar = (k) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f3966g = kVar;
                s(kVar);
            } catch (ClassNotFoundException unused) {
                c5.s.i("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.f3966g == null) {
                this.f3966g = this.f3962c;
            }
        }
        return this.f3966g;
    }

    public final k z() {
        if (this.f3967h == null) {
            j0 j0Var = new j0();
            this.f3967h = j0Var;
            s(j0Var);
        }
        return this.f3967h;
    }
}
