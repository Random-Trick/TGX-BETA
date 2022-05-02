package p187n4;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.extractor.AbstractC3470g;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p006a5.AbstractC0117b;
import p006a5.AbstractC0118b0;
import p006a5.AbstractC0147h;
import p006a5.AbstractC0154k;
import p006a5.C0122c0;
import p006a5.C0148h0;
import p006a5.C0158n;
import p006a5.C0159o;
import p020b5.C1186a;
import p020b5.C1189b0;
import p020b5.C1198g;
import p020b5.C1216l0;
import p020b5.C1234w;
import p073f4.C4260a;
import p132j4.C5846b;
import p174m3.C6556a2;
import p174m3.C6600g1;
import p174m3.C6612h1;
import p174m3.C6717x2;
import p187n4.AbstractC7223q;
import p187n4.AbstractC7240z;
import p187n4.C7198k;
import p187n4.C7200k0;
import p216p3.C8026g;
import p230q3.AbstractC8219w;
import p230q3.AbstractC8223y;
import p270t3.AbstractC8960h;
import p270t3.AbstractC8974t;
import p270t3.C8971q;
import p356z4.AbstractC11265j;

public final class C7178f0 implements AbstractC7223q, AbstractC8960h, C0122c0.AbstractC0124b<C7179a>, C0122c0.AbstractC0128f, C7200k0.AbstractC7204d {
    public static final Map<String, String> f22789v0 = m17479K();
    public static final C6600g1 f22790w0 = new C6600g1.C6602b().m19876S("icy").m19859e0("application/x-icy").m19890E();
    public final AbstractC0118b0 f22791M;
    public final AbstractC7240z.C7241a f22792N;
    public final AbstractC8219w.C8220a f22793O;
    public final AbstractC7180b f22794P;
    public final AbstractC0117b f22795Q;
    public final String f22796R;
    public final long f22797S;
    public final AbstractC7166b0 f22799U;
    public AbstractC7223q.AbstractC7224a f22804Z;
    public final Uri f22805a;
    public C5846b f22806a0;
    public final AbstractC0154k f22807b;
    public final AbstractC8223y f22809c;
    public boolean f22811d0;
    public boolean f22812e0;
    public boolean f22813f0;
    public C7183e f22814g0;
    public AbstractC3470g f22815h0;
    public boolean f22817j0;
    public boolean f22819l0;
    public boolean f22820m0;
    public int f22821n0;
    public long f22823p0;
    public boolean f22825r0;
    public int f22826s0;
    public boolean f22827t0;
    public boolean f22828u0;
    public final C0122c0 f22798T = new C0122c0("ProgressiveMediaPeriod");
    public final C1198g f22800V = new C1198g();
    public final Runnable f22801W = new Runnable() {
        @Override
        public final void run() {
            C7178f0.this.m17471S();
        }
    };
    public final Runnable f22802X = new Runnable() {
        @Override
        public final void run() {
            C7178f0.this.m17473Q();
        }
    };
    public final Handler f22803Y = C1216l0.m37949u();
    public C7182d[] f22810c0 = new C7182d[0];
    public C7200k0[] f22808b0 = new C7200k0[0];
    public long f22824q0 = -9223372036854775807L;
    public long f22822o0 = -1;
    public long f22816i0 = -9223372036854775807L;
    public int f22818k0 = 1;

    public final class C7179a implements C0122c0.AbstractC0127e, C7198k.AbstractC7199a {
        public final Uri f22830b;
        public final C0148h0 f22831c;
        public final AbstractC7166b0 f22832d;
        public final AbstractC8960h f22833e;
        public final C1198g f22834f;
        public volatile boolean f22836h;
        public long f22838j;
        public AbstractC8974t f22841m;
        public boolean f22842n;
        public final C8971q f22835g = new C8971q();
        public boolean f22837i = true;
        public long f22840l = -1;
        public final long f22829a = C7205l.m17353a();
        public C0159o f22839k = m17438j(0);

        public C7179a(Uri uri, AbstractC0154k kVar, AbstractC7166b0 b0Var, AbstractC8960h hVar, C1198g gVar) {
            this.f22830b = uri;
            this.f22831c = new C0148h0(kVar);
            this.f22832d = b0Var;
            this.f22833e = hVar;
            this.f22834f = gVar;
        }

        @Override
        public void mo17396a(C1189b0 b0Var) {
            long max = !this.f22842n ? this.f22838j : Math.max(C7178f0.this.m17477M(), this.f22838j);
            int a = b0Var.m38145a();
            AbstractC8974t tVar = (AbstractC8974t) C1186a.m38188e(this.f22841m);
            tVar.mo10795c(b0Var, a);
            tVar.mo10793e(max, 1, a, 0, null);
            this.f22842n = true;
        }

        @Override
        public void mo17446b() {
            int i = 0;
            while (i == 0 && !this.f22836h) {
                try {
                    long j = this.f22835g.f28860a;
                    C0159o j2 = m17438j(j);
                    this.f22839k = j2;
                    long c = this.f22831c.mo4413c(j2);
                    this.f22840l = c;
                    if (c != -1) {
                        this.f22840l = c + j;
                    }
                    C7178f0.this.f22806a0 = C5846b.m21943a(this.f22831c.mo17398l());
                    AbstractC0147h hVar = this.f22831c;
                    if (!(C7178f0.this.f22806a0 == null || C7178f0.this.f22806a0.f18714O == -1)) {
                        hVar = new C7198k(this.f22831c, C7178f0.this.f22806a0.f18714O, this);
                        AbstractC8974t N = C7178f0.this.m17476N();
                        this.f22841m = N;
                        N.mo10797a(C7178f0.f22790w0);
                    }
                    long j3 = j;
                    this.f22832d.mo17502d(hVar, this.f22830b, this.f22831c.mo17398l(), j, this.f22840l, this.f22833e);
                    if (C7178f0.this.f22806a0 != null) {
                        this.f22832d.mo17500f();
                    }
                    if (this.f22837i) {
                        this.f22832d.mo17504b(j3, this.f22838j);
                        this.f22837i = false;
                    }
                    while (true) {
                        long j4 = j3;
                        while (i == 0 && !this.f22836h) {
                            try {
                                this.f22834f.m38083a();
                                i = this.f22832d.mo17503c(this.f22835g);
                                j3 = this.f22832d.mo17501e();
                                if (j3 > C7178f0.this.f22797S + j4) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f22834f.m38081c();
                        C7178f0.this.f22803Y.post(C7178f0.this.f22802X);
                    }
                    if (i == 1) {
                        i = 0;
                    } else if (this.f22832d.mo17501e() != -1) {
                        this.f22835g.f28860a = this.f22832d.mo17501e();
                    }
                    C0158n.m42208a(this.f22831c);
                } catch (Throwable th) {
                    if (!(i == 1 || this.f22832d.mo17501e() == -1)) {
                        this.f22835g.f28860a = this.f22832d.mo17501e();
                    }
                    C0158n.m42208a(this.f22831c);
                    throw th;
                }
            }
        }

        @Override
        public void mo17445c() {
            this.f22836h = true;
        }

        public final C0159o m17438j(long j) {
            return new C0159o.C0161b().m42196h(this.f22830b).m42197g(j).m42198f(C7178f0.this.f22796R).m42202b(6).m42199e(C7178f0.f22789v0).m42203a();
        }

        public final void m17437k(long j, long j2) {
            this.f22835g.f28860a = j;
            this.f22838j = j2;
            this.f22837i = true;
            this.f22842n = false;
        }
    }

    public interface AbstractC7180b {
        void mo17426f(long j, boolean z, boolean z2);
    }

    public final class C7181c implements AbstractC7206l0 {
        public final int f22844a;

        public C7181c(int i) {
            this.f22844a = i;
        }

        @Override
        public int mo17352a(C6612h1 h1Var, C8026g gVar, int i) {
            return C7178f0.this.m17461b0(this.f22844a, h1Var, gVar, i);
        }

        @Override
        public void mo17351b() {
            C7178f0.this.m17467W(this.f22844a);
        }

        @Override
        public int mo17350c(long j) {
            return C7178f0.this.m17457f0(this.f22844a, j);
        }

        @Override
        public boolean mo17349f() {
            return C7178f0.this.m17474P(this.f22844a);
        }
    }

    public static final class C7182d {
        public final int f22846a;
        public final boolean f22847b;

        public C7182d(int i, boolean z) {
            this.f22846a = i;
            this.f22847b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C7182d.class != obj.getClass()) {
                return false;
            }
            C7182d dVar = (C7182d) obj;
            return this.f22846a == dVar.f22846a && this.f22847b == dVar.f22847b;
        }

        public int hashCode() {
            return (this.f22846a * 31) + (this.f22847b ? 1 : 0);
        }
    }

    public static final class C7183e {
        public final C7233t0 f22848a;
        public final boolean[] f22849b;
        public final boolean[] f22850c;
        public final boolean[] f22851d;

        public C7183e(C7233t0 t0Var, boolean[] zArr) {
            this.f22848a = t0Var;
            this.f22849b = zArr;
            int i = t0Var.f23032a;
            this.f22850c = new boolean[i];
            this.f22851d = new boolean[i];
        }
    }

    public C7178f0(Uri uri, AbstractC0154k kVar, AbstractC7166b0 b0Var, AbstractC8223y yVar, AbstractC8219w.C8220a aVar, AbstractC0118b0 b0Var2, AbstractC7240z.C7241a aVar2, AbstractC7180b bVar, AbstractC0117b bVar2, String str, int i) {
        this.f22805a = uri;
        this.f22807b = kVar;
        this.f22809c = yVar;
        this.f22793O = aVar;
        this.f22791M = b0Var2;
        this.f22792N = aVar2;
        this.f22794P = bVar;
        this.f22795Q = bVar2;
        this.f22796R = str;
        this.f22797S = i;
        this.f22799U = b0Var;
    }

    public static Map<String, String> m17479K() {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(hashMap);
    }

    public void m17473Q() {
        if (!this.f22828u0) {
            ((AbstractC7223q.AbstractC7224a) C1186a.m38188e(this.f22804Z)).mo17336i(this);
        }
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    public final void m17482H() {
        C1186a.m38187f(this.f22812e0);
        C1186a.m38188e(this.f22814g0);
        C1186a.m38188e(this.f22815h0);
    }

    public final boolean m17481I(C7179a aVar, int i) {
        AbstractC3470g gVar;
        if (this.f22822o0 == -1 && ((gVar = this.f22815h0) == null || gVar.mo1126d() == -9223372036854775807L)) {
            if (!this.f22812e0 || m17455h0()) {
                this.f22820m0 = this.f22812e0;
                this.f22823p0 = 0L;
                this.f22826s0 = 0;
                for (C7200k0 k0Var : this.f22808b0) {
                    k0Var.m17382N();
                }
                aVar.m17437k(0L, 0L);
                return true;
            }
            this.f22825r0 = true;
            return false;
        }
        this.f22826s0 = i;
        return true;
    }

    public final void m17480J(C7179a aVar) {
        if (this.f22822o0 == -1) {
            this.f22822o0 = aVar.f22840l;
        }
    }

    public final int m17478L() {
        int i = 0;
        for (C7200k0 k0Var : this.f22808b0) {
            i += k0Var.m17395A();
        }
        return i;
    }

    public final long m17477M() {
        long j = Long.MIN_VALUE;
        for (C7200k0 k0Var : this.f22808b0) {
            j = Math.max(j, k0Var.m17361t());
        }
        return j;
    }

    public AbstractC8974t m17476N() {
        return m17463a0(new C7182d(0, true));
    }

    public final boolean m17475O() {
        return this.f22824q0 != -9223372036854775807L;
    }

    public boolean m17474P(int i) {
        return !m17455h0() && this.f22808b0[i].m17392D(this.f22827t0);
    }

    public final void m17471S() {
        C4260a aVar;
        if (!(this.f22828u0 || this.f22812e0 || !this.f22811d0 || this.f22815h0 == null)) {
            for (C7200k0 k0Var : this.f22808b0) {
                if (k0Var.m17355z() == null) {
                    return;
                }
            }
            this.f22800V.m38081c();
            int length = this.f22808b0.length;
            C7227r0[] r0VarArr = new C7227r0[length];
            boolean[] zArr = new boolean[length];
            for (int i = 0; i < length; i++) {
                C6600g1 g1Var = (C6600g1) C1186a.m38188e(this.f22808b0[i].m17355z());
                String str = g1Var.f20575U;
                boolean j = C1234w.m37864j(str);
                boolean z = j || C1234w.m37861m(str);
                zArr[i] = z;
                this.f22813f0 = z | this.f22813f0;
                C5846b bVar = this.f22806a0;
                if (bVar != null) {
                    if (j || this.f22810c0[i].f22847b) {
                        C4260a aVar2 = g1Var.f20573S;
                        if (aVar2 == null) {
                            aVar = new C4260a(bVar);
                        } else {
                            aVar = aVar2.m28332a(bVar);
                        }
                        g1Var = g1Var.m19902b().m19871X(aVar).m19890E();
                    }
                    if (j && g1Var.f20569O == -1 && g1Var.f20570P == -1 && bVar.f18715a != -1) {
                        g1Var = g1Var.m19902b().m19888G(bVar.f18715a).m19890E();
                    }
                }
                r0VarArr[i] = new C7227r0(g1Var.m19901c(this.f22809c.mo13161c(g1Var)));
            }
            this.f22814g0 = new C7183e(new C7233t0(r0VarArr), zArr);
            this.f22812e0 = true;
            ((AbstractC7223q.AbstractC7224a) C1186a.m38188e(this.f22804Z)).mo17276a(this);
        }
    }

    public final void m17470T(int i) {
        m17482H();
        C7183e eVar = this.f22814g0;
        boolean[] zArr = eVar.f22851d;
        if (!zArr[i]) {
            C6600g1 b = eVar.f22848a.m17245b(i).m17272b(0);
            this.f22792N.m17229h(C1234w.m37866h(b.f20575U), b, 0, null, this.f22823p0);
            zArr[i] = true;
        }
    }

    public final void m17469U(int i) {
        m17482H();
        boolean[] zArr = this.f22814g0.f22849b;
        if (this.f22825r0 && zArr[i]) {
            if (!this.f22808b0[i].m17392D(false)) {
                this.f22824q0 = 0L;
                this.f22825r0 = false;
                this.f22820m0 = true;
                this.f22823p0 = 0L;
                this.f22826s0 = 0;
                for (C7200k0 k0Var : this.f22808b0) {
                    k0Var.m17382N();
                }
                ((AbstractC7223q.AbstractC7224a) C1186a.m38188e(this.f22804Z)).mo17336i(this);
            }
        }
    }

    public void m17468V() {
        this.f22798T.m42249j(this.f22791M.mo42141c(this.f22818k0));
    }

    public void m17467W(int i) {
        this.f22808b0[i].m17389G();
        m17468V();
    }

    public void mo17454i(C7179a aVar, long j, long j2, boolean z) {
        C0148h0 h0Var = aVar.f22831c;
        C7205l lVar = new C7205l(aVar.f22829a, aVar.f22839k, h0Var.m42213t(), h0Var.m42212u(), j, j2, h0Var.m42214s());
        this.f22791M.mo42143a(aVar.f22829a);
        this.f22792N.m17222o(lVar, 1, -1, null, 0, null, aVar.f22838j, this.f22816i0);
        if (!z) {
            m17480J(aVar);
            for (C7200k0 k0Var : this.f22808b0) {
                k0Var.m17382N();
            }
            if (this.f22821n0 > 0) {
                ((AbstractC7223q.AbstractC7224a) C1186a.m38188e(this.f22804Z)).mo17336i(this);
            }
        }
    }

    public void mo17452l(C7179a aVar, long j, long j2) {
        AbstractC3470g gVar;
        if (this.f22816i0 == -9223372036854775807L && (gVar = this.f22815h0) != null) {
            boolean g = gVar.mo1125g();
            long M = m17477M();
            long j3 = M == Long.MIN_VALUE ? 0L : M + 10000;
            this.f22816i0 = j3;
            this.f22794P.mo17426f(j3, g, this.f22817j0);
        }
        C0148h0 h0Var = aVar.f22831c;
        C7205l lVar = new C7205l(aVar.f22829a, aVar.f22839k, h0Var.m42213t(), h0Var.m42212u(), j, j2, h0Var.m42214s());
        this.f22791M.mo42143a(aVar.f22829a);
        this.f22792N.m17220q(lVar, 1, -1, null, 0, null, aVar.f22838j, this.f22816i0);
        m17480J(aVar);
        this.f22827t0 = true;
        ((AbstractC7223q.AbstractC7224a) C1186a.m38188e(this.f22804Z)).mo17336i(this);
    }

    public C0122c0.C0125c mo17453j(C7179a aVar, long j, long j2, IOException iOException, int i) {
        C0122c0.C0125c cVar;
        C7179a aVar2;
        boolean z;
        m17480J(aVar);
        C0148h0 h0Var = aVar.f22831c;
        C7205l lVar = new C7205l(aVar.f22829a, aVar.f22839k, h0Var.m42213t(), h0Var.m42212u(), j, j2, h0Var.m42214s());
        long b = this.f22791M.mo42142b(new AbstractC0118b0.C0119a(lVar, new C7221p(1, -1, null, 0, null, C1216l0.m38009H0(aVar.f22838j), C1216l0.m38009H0(this.f22816i0)), iOException, i));
        if (b == -9223372036854775807L) {
            cVar = C0122c0.f473g;
        } else {
            int L = m17478L();
            if (L > this.f22826s0) {
                aVar2 = aVar;
                z = true;
            } else {
                z = false;
                aVar2 = aVar;
            }
            if (m17481I(aVar2, L)) {
                cVar = C0122c0.m42252g(z, b);
            } else {
                cVar = C0122c0.f472f;
            }
        }
        boolean z2 = !cVar.m42244c();
        this.f22792N.m17218s(lVar, 1, -1, null, 0, null, aVar.f22838j, this.f22816i0, iOException, z2);
        if (z2) {
            this.f22791M.mo42143a(aVar.f22829a);
        }
        return cVar;
    }

    @Override
    public void mo6042a(final AbstractC3470g gVar) {
        this.f22803Y.post(new Runnable() {
            @Override
            public final void run() {
                C7178f0.this.m17472R(gVar);
            }
        });
    }

    public final AbstractC8974t m17463a0(C7182d dVar) {
        int length = this.f22808b0.length;
        for (int i = 0; i < length; i++) {
            if (dVar.equals(this.f22810c0[i])) {
                return this.f22808b0[i];
            }
        }
        C7200k0 k = C7200k0.m17370k(this.f22795Q, this.f22803Y.getLooper(), this.f22809c, this.f22793O);
        k.m17376T(this);
        int i2 = length + 1;
        C7182d[] dVarArr = (C7182d[]) Arrays.copyOf(this.f22810c0, i2);
        dVarArr[length] = dVar;
        this.f22810c0 = (C7182d[]) C1216l0.m37969k(dVarArr);
        C7200k0[] k0VarArr = (C7200k0[]) Arrays.copyOf(this.f22808b0, i2);
        k0VarArr[length] = k;
        this.f22808b0 = (C7200k0[]) C1216l0.m37969k(k0VarArr);
        return k;
    }

    @Override
    public void mo17462b() {
        for (C7200k0 k0Var : this.f22808b0) {
            k0Var.m17384L();
        }
        this.f22799U.mo17505a();
    }

    public int m17461b0(int i, C6612h1 h1Var, C8026g gVar, int i2) {
        if (m17455h0()) {
            return -3;
        }
        m17470T(i);
        int K = this.f22808b0[i].m17385K(h1Var, gVar, i2, this.f22827t0);
        if (K == -3) {
            m17469U(i);
        }
        return K;
    }

    @Override
    public long mo17289c() {
        if (this.f22821n0 == 0) {
            return Long.MIN_VALUE;
        }
        return mo17279s();
    }

    public void m17460c0() {
        if (this.f22812e0) {
            for (C7200k0 k0Var : this.f22808b0) {
                k0Var.m17386J();
            }
        }
        this.f22798T.m42248k(this);
        this.f22803Y.removeCallbacksAndMessages(null);
        this.f22804Z = null;
        this.f22828u0 = true;
    }

    @Override
    public long mo17288d(long j, C6717x2 x2Var) {
        m17482H();
        if (!this.f22815h0.mo1125g()) {
            return 0L;
        }
        AbstractC3470g.C3471a i = this.f22815h0.mo1123i(j);
        return x2Var.m19395a(j, i.f11469a.f28862a, i.f11470b.f28862a);
    }

    public final boolean m17459d0(boolean[] zArr, long j) {
        int length = this.f22808b0.length;
        for (int i = 0; i < length; i++) {
            if (!this.f22808b0[i].m17379Q(j, false) && (zArr[i] || !this.f22813f0)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void mo17287e(AbstractC7223q.AbstractC7224a aVar, long j) {
        this.f22804Z = aVar;
        this.f22800V.m38079e();
        m17456g0();
    }

    public final void m17472R(AbstractC3470g gVar) {
        this.f22815h0 = this.f22806a0 == null ? gVar : new AbstractC3470g.C3472b(-9223372036854775807L);
        this.f22816i0 = gVar.mo1126d();
        int i = 1;
        boolean z = this.f22822o0 == -1 && gVar.mo1126d() == -9223372036854775807L;
        this.f22817j0 = z;
        if (z) {
            i = 7;
        }
        this.f22818k0 = i;
        this.f22794P.mo17426f(this.f22816i0, gVar.mo1125g(), this.f22817j0);
        if (!this.f22812e0) {
            m17471S();
        }
    }

    @Override
    public void mo17286f() {
        m17468V();
        if (this.f22827t0 && !this.f22812e0) {
            throw C6556a2.m20113a("Loading finished before preparation is complete.", null);
        }
    }

    public int m17457f0(int i, long j) {
        if (m17455h0()) {
            return 0;
        }
        m17470T(i);
        C7200k0 k0Var = this.f22808b0[i];
        int y = k0Var.m17356y(j, this.f22827t0);
        k0Var.m17375U(y);
        if (y == 0) {
            m17469U(i);
        }
        return y;
    }

    @Override
    public long mo17285g(long j) {
        m17482H();
        boolean[] zArr = this.f22814g0.f22849b;
        if (!this.f22815h0.mo1125g()) {
            j = 0;
        }
        int i = 0;
        this.f22820m0 = false;
        this.f22823p0 = j;
        if (m17475O()) {
            this.f22824q0 = j;
            return j;
        } else if (this.f22818k0 != 7 && m17459d0(zArr, j)) {
            return j;
        } else {
            this.f22825r0 = false;
            this.f22824q0 = j;
            this.f22827t0 = false;
            if (this.f22798T.m42250i()) {
                C7200k0[] k0VarArr = this.f22808b0;
                int length = k0VarArr.length;
                while (i < length) {
                    k0VarArr[i].m17365p();
                    i++;
                }
                this.f22798T.m42254e();
            } else {
                this.f22798T.m42253f();
                C7200k0[] k0VarArr2 = this.f22808b0;
                int length2 = k0VarArr2.length;
                while (i < length2) {
                    k0VarArr2[i].m17382N();
                    i++;
                }
            }
            return j;
        }
    }

    public final void m17456g0() {
        C7179a aVar = new C7179a(this.f22805a, this.f22807b, this.f22799U, this, this.f22800V);
        if (this.f22812e0) {
            C1186a.m38187f(m17475O());
            long j = this.f22816i0;
            if (j == -9223372036854775807L || this.f22824q0 <= j) {
                aVar.m17437k(((AbstractC3470g) C1186a.m38188e(this.f22815h0)).mo1123i(this.f22824q0).f11469a.f28863b, this.f22824q0);
                for (C7200k0 k0Var : this.f22808b0) {
                    k0Var.m17378R(this.f22824q0);
                }
                this.f22824q0 = -9223372036854775807L;
            } else {
                this.f22827t0 = true;
                this.f22824q0 = -9223372036854775807L;
                return;
            }
        }
        this.f22826s0 = m17478L();
        this.f22792N.m17216u(new C7205l(aVar.f22829a, aVar.f22839k, this.f22798T.m42247l(aVar, this, this.f22791M.mo42141c(this.f22818k0))), 1, -1, null, 0, null, aVar.f22838j, this.f22816i0);
    }

    @Override
    public boolean mo17284h(long j) {
        if (this.f22827t0 || this.f22798T.m42251h() || this.f22825r0) {
            return false;
        }
        if (this.f22812e0 && this.f22821n0 == 0) {
            return false;
        }
        boolean e = this.f22800V.m38079e();
        if (this.f22798T.m42250i()) {
            return e;
        }
        m17456g0();
        return true;
    }

    public final boolean m17455h0() {
        return this.f22820m0 || m17475O();
    }

    @Override
    public boolean mo17283k() {
        return this.f22798T.m42250i() && this.f22800V.m38080d();
    }

    @Override
    public void mo6040m() {
        this.f22811d0 = true;
        this.f22803Y.post(this.f22801W);
    }

    @Override
    public void mo17354n(C6600g1 g1Var) {
        this.f22803Y.post(this.f22801W);
    }

    @Override
    public long mo17282o(AbstractC11265j[] jVarArr, boolean[] zArr, AbstractC7206l0[] l0VarArr, boolean[] zArr2, long j) {
        m17482H();
        C7183e eVar = this.f22814g0;
        C7233t0 t0Var = eVar.f22848a;
        boolean[] zArr3 = eVar.f22850c;
        int i = this.f22821n0;
        int i2 = 0;
        for (int i3 = 0; i3 < jVarArr.length; i3++) {
            if (l0VarArr[i3] != null && (jVarArr[i3] == null || !zArr[i3])) {
                int i4 = ((C7181c) l0VarArr[i3]).f22844a;
                C1186a.m38187f(zArr3[i4]);
                this.f22821n0--;
                zArr3[i4] = false;
                l0VarArr[i3] = null;
            }
        }
        boolean z = !this.f22819l0 ? j != 0 : i == 0;
        for (int i5 = 0; i5 < jVarArr.length; i5++) {
            if (l0VarArr[i5] == null && jVarArr[i5] != null) {
                AbstractC11265j jVar = jVarArr[i5];
                C1186a.m38187f(jVar.length() == 1);
                C1186a.m38187f(jVar.mo1008f(0) == 0);
                int c = t0Var.m17244c(jVar.mo1010a());
                C1186a.m38187f(!zArr3[c]);
                this.f22821n0++;
                zArr3[c] = true;
                l0VarArr[i5] = new C7181c(c);
                zArr2[i5] = true;
                if (!z) {
                    C7200k0 k0Var = this.f22808b0[c];
                    z = !k0Var.m17379Q(j, true) && k0Var.m17358w() != 0;
                }
            }
        }
        if (this.f22821n0 == 0) {
            this.f22825r0 = false;
            this.f22820m0 = false;
            if (this.f22798T.m42250i()) {
                C7200k0[] k0VarArr = this.f22808b0;
                int length = k0VarArr.length;
                while (i2 < length) {
                    k0VarArr[i2].m17365p();
                    i2++;
                }
                this.f22798T.m42254e();
            } else {
                C7200k0[] k0VarArr2 = this.f22808b0;
                int length2 = k0VarArr2.length;
                while (i2 < length2) {
                    k0VarArr2[i2].m17382N();
                    i2++;
                }
            }
        } else if (z) {
            j = mo17285g(j);
            while (i2 < l0VarArr.length) {
                if (l0VarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.f22819l0 = true;
        return j;
    }

    @Override
    public long mo17281p() {
        if (!this.f22820m0) {
            return -9223372036854775807L;
        }
        if (!this.f22827t0 && m17478L() <= this.f22826s0) {
            return -9223372036854775807L;
        }
        this.f22820m0 = false;
        return this.f22823p0;
    }

    @Override
    public C7233t0 mo17280q() {
        m17482H();
        return this.f22814g0.f22848a;
    }

    @Override
    public AbstractC8974t mo6039r(int i, int i2) {
        return m17463a0(new C7182d(i, false));
    }

    @Override
    public long mo17279s() {
        long j;
        m17482H();
        boolean[] zArr = this.f22814g0.f22849b;
        if (this.f22827t0) {
            return Long.MIN_VALUE;
        }
        if (m17475O()) {
            return this.f22824q0;
        }
        if (this.f22813f0) {
            int length = this.f22808b0.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i] && !this.f22808b0[i].m17393C()) {
                    j = Math.min(j, this.f22808b0[i].m17361t());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = m17477M();
        }
        return j == Long.MIN_VALUE ? this.f22823p0 : j;
    }

    @Override
    public void mo17278t(long j, boolean z) {
        m17482H();
        if (!m17475O()) {
            boolean[] zArr = this.f22814g0.f22850c;
            int length = this.f22808b0.length;
            for (int i = 0; i < length; i++) {
                this.f22808b0[i].m17366o(j, z, zArr[i]);
            }
        }
    }

    @Override
    public void mo17277u(long j) {
    }
}
