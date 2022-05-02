package p006a5;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p006a5.AbstractC0154k;
import p006a5.C0169t;
import p020b5.C1186a;
import p020b5.C1216l0;
import p020b5.C1230s;

public final class C0167s implements AbstractC0154k {
    public final Context f610a;
    public final List<AbstractC0150i0> f611b = new ArrayList();
    public final AbstractC0154k f612c;
    public AbstractC0154k f613d;
    public AbstractC0154k f614e;
    public AbstractC0154k f615f;
    public AbstractC0154k f616g;
    public AbstractC0154k f617h;
    public AbstractC0154k f618i;
    public AbstractC0154k f619j;
    public AbstractC0154k f620k;

    public static final class C0168a implements AbstractC0154k.AbstractC0155a {
        public final Context f621a;
        public final AbstractC0154k.AbstractC0155a f622b;
        public AbstractC0150i0 f623c;

        public C0168a(Context context) {
            this(context, new C0169t.C0171b());
        }

        public C0167s mo4407a() {
            C0167s sVar = new C0167s(this.f621a, this.f622b.mo4407a());
            AbstractC0150i0 i0Var = this.f623c;
            if (i0Var != null) {
                sVar.mo17399g(i0Var);
            }
            return sVar;
        }

        public C0168a(Context context, AbstractC0154k.AbstractC0155a aVar) {
            this.f621a = context.getApplicationContext();
            this.f622b = aVar;
        }
    }

    public C0167s(Context context, AbstractC0154k kVar) {
        this.f610a = context.getApplicationContext();
        this.f612c = (AbstractC0154k) C1186a.m38185e(kVar);
    }

    public final void m42166A(AbstractC0154k kVar, AbstractC0150i0 i0Var) {
        if (kVar != null) {
            kVar.mo17399g(i0Var);
        }
    }

    @Override
    public int mo4414b(byte[] bArr, int i, int i2) {
        return ((AbstractC0154k) C1186a.m38185e(this.f620k)).mo4414b(bArr, i, i2);
    }

    @Override
    public long mo4413c(C0159o oVar) {
        C1186a.m38184f(this.f620k == null);
        String scheme = oVar.f553a.getScheme();
        if (C1216l0.m37965k0(oVar.f553a)) {
            String path = oVar.f553a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f620k = m42161w();
            } else {
                this.f620k = m42164t();
            }
        } else if ("asset".equals(scheme)) {
            this.f620k = m42164t();
        } else if ("content".equals(scheme)) {
            this.f620k = m42163u();
        } else if ("rtmp".equals(scheme)) {
            this.f620k = m42159y();
        } else if ("udp".equals(scheme)) {
            this.f620k = m42158z();
        } else if ("data".equals(scheme)) {
            this.f620k = m42162v();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f620k = m42160x();
        } else {
            this.f620k = this.f612c;
        }
        return this.f620k.mo4413c(oVar);
    }

    @Override
    public void close() {
        AbstractC0154k kVar = this.f620k;
        if (kVar != null) {
            try {
                kVar.close();
            } finally {
                this.f620k = null;
            }
        }
    }

    @Override
    public void mo17399g(AbstractC0150i0 i0Var) {
        C1186a.m38185e(i0Var);
        this.f612c.mo17399g(i0Var);
        this.f611b.add(i0Var);
        m42166A(this.f613d, i0Var);
        m42166A(this.f614e, i0Var);
        m42166A(this.f615f, i0Var);
        m42166A(this.f616g, i0Var);
        m42166A(this.f617h, i0Var);
        m42166A(this.f618i, i0Var);
        m42166A(this.f619j, i0Var);
    }

    @Override
    public Map<String, List<String>> mo17398l() {
        AbstractC0154k kVar = this.f620k;
        return kVar == null ? Collections.emptyMap() : kVar.mo17398l();
    }

    @Override
    public Uri mo4412p() {
        AbstractC0154k kVar = this.f620k;
        if (kVar == null) {
            return null;
        }
        return kVar.mo4412p();
    }

    public final void m42165s(AbstractC0154k kVar) {
        for (int i = 0; i < this.f611b.size(); i++) {
            kVar.mo17399g(this.f611b.get(i));
        }
    }

    public final AbstractC0154k m42164t() {
        if (this.f614e == null) {
            C0120c cVar = new C0120c(this.f610a);
            this.f614e = cVar;
            m42165s(cVar);
        }
        return this.f614e;
    }

    public final AbstractC0154k m42163u() {
        if (this.f615f == null) {
            C0141g gVar = new C0141g(this.f610a);
            this.f615f = gVar;
            m42165s(gVar);
        }
        return this.f615f;
    }

    public final AbstractC0154k m42162v() {
        if (this.f618i == null) {
            C0149i iVar = new C0149i();
            this.f618i = iVar;
            m42165s(iVar);
        }
        return this.f618i;
    }

    public final AbstractC0154k m42161w() {
        if (this.f613d == null) {
            C0176x xVar = new C0176x();
            this.f613d = xVar;
            m42165s(xVar);
        }
        return this.f613d;
    }

    public final AbstractC0154k m42160x() {
        if (this.f619j == null) {
            C0132d0 d0Var = new C0132d0(this.f610a);
            this.f619j = d0Var;
            m42165s(d0Var);
        }
        return this.f619j;
    }

    public final AbstractC0154k m42159y() {
        if (this.f616g == null) {
            try {
                AbstractC0154k kVar = (AbstractC0154k) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f616g = kVar;
                m42165s(kVar);
            } catch (ClassNotFoundException unused) {
                C1230s.m37881i("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating RTMP extension", e);
            }
            if (this.f616g == null) {
                this.f616g = this.f612c;
            }
        }
        return this.f616g;
    }

    public final AbstractC0154k m42158z() {
        if (this.f617h == null) {
            C0152j0 j0Var = new C0152j0();
            this.f617h = j0Var;
            m42165s(j0Var);
        }
        return this.f617h;
    }
}
